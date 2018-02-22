import java.util.LinkedList;
import java.util.List;
import org.lwjgl.opengl.Pbuffer;

public class WrUpdateThread extends Thread {

   private Pbuffer pbuffer;
   private Object lock;
   private List updateList;
   private List updatedList;
   private int updateCount;
   private bmh mainTessellator;
   private bmh threadTessellator;
   private boolean working;
   private WorldRendererThreaded currentRenderer;
   private boolean canWork;
   private boolean canWorkToEndOfUpdate;
   private boolean terminated;
   private static final int MAX_UPDATE_CAPACITY = 10;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6845;


   // $FF: renamed from: <init> (org.lwjgl.opengl.Pbuffer) void
   public void method_7008(Pbuffer var1) {
      String[] var10001 = field_6845;
      super("WrUpdateThread");
      this.pbuffer = null;
      this.lock = new Object();
      this.updateList = new LinkedList();
      this.updatedList = new LinkedList();
      this.updateCount = 0;
      this.mainTessellator = bmh.instance;
      bmh var2 = new bmh;
      var2.getVisible7(2097152);
      this.threadTessellator = var2;
      this.working = false;
      this.currentRenderer = null;
      this.canWork = false;
      this.canWorkToEndOfUpdate = false;
      this.terminated = false;
      this.pbuffer = var1;
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }

   public void addRendererToUpdate(blo var1, boolean var2) {
      String[] var10000 = class_752.method_4253();
      Object var4 = this.lock;
      String[] var3 = var10000;
      Object var5 = this.lock;
      synchronized(this.lock) {
         boolean var8 = var1.isUpdating;
         if(var3 != null) {
            if(var1.isUpdating) {
               IllegalArgumentException var9 = new IllegalArgumentException("Renderer already updating");
               String[] var10002 = field_6845;
               throw var9;
            }

            var8 = var2;
         }

         if(var3 != null) {
            label27: {
               if(var8) {
                  this.updateList.add(0, var1);
                  if(var3 != null) {
                     break label27;
                  }
               }

               this.updateList.add(var1);
            }
         }

         var1.isUpdating = true;
         this.lock.notifyAll();
      }
   }

   private WorldRendererThreaded getRendererToUpdate() {
      String[] var10000 = class_752.method_4253();
      Object var2 = this.lock;
      String[] var1 = var10000;
      Object var3 = this.lock;
      synchronized(this.lock) {
         WorldRendererThreaded var4;
         WrUpdateThread var8;
         while(true) {
            if(this.updateList.size() <= 0) {
               try {
                  this.lock.wait(2000L);
                  var8 = this;
                  if(var1 != null) {
                     if(!this.terminated) {
                        continue;
                     }

                     var4 = null;
                     WorldRendererThreaded var9 = (WorldRendererThreaded)var4;
                     return var9;
                  }
                  break;
               } catch (InterruptedException var6) {
                  if(var1 != null) {
                     continue;
                  }
               }
            }

            var8 = this;
            break;
         }

         var4 = (WorldRendererThreaded)var8.updateList.remove(0);
         this.lock.notifyAll();
         return var4;
      }
   }

   public boolean hasWorkToDo() {
      String[] var10000 = class_752.method_4253();
      Object var2 = this.lock;
      String[] var1 = var10000;
      Object var3 = this.lock;
      synchronized(this.lock) {
         WrUpdateThread var6 = this;
         boolean var7;
         if(var1 != null) {
            if(this.updateList.size() > 0) {
               var7 = true;
               return var7;
            }

            var6 = this;
         }

         if(var1 != null) {
            if(var6.currentRenderer != null) {
               var7 = true;
               return var7;
            }

            var6 = this;
         }

         var7 = var6.working;
         return var7;
      }
   }

   public int getUpdateCapacity() {
      Object var2 = this.lock;
      String[] var10000 = class_752.method_4253();
      Object var3 = this.lock;
      synchronized(this.lock){}
      String[] var1 = var10000;

      try {
         int var7 = this.updateList.size();
         int var10001 = 10;
         if(var1 != null) {
            if(var7 > 10) {
               var7 = 0;
               return var7;
            }

            var7 = 10;
            var10001 = this.updateList.size();
         }

         var7 -= var10001;
         return var7;
      } finally {
         ;
      }
   }

   private void rendererUpdated(blo var1) {
      Object var2 = this.lock;
      Object var3 = this.lock;
      synchronized(this.lock) {
         this.updatedList.add(var1);
         ++this.updateCount;
         this.currentRenderer = null;
         this.working = false;
         this.lock.notifyAll();
      }
   }

   private void finishUpdatedRenderers() {
      String[] var10000 = class_752.method_4253();
      Object var2 = this.lock;
      String[] var1 = var10000;
      Object var3 = this.lock;
      synchronized(this.lock) {
         int var4 = 0;

         while(true) {
            if(var4 < this.updatedList.size()) {
               WorldRendererThreaded var5 = (WorldRendererThreaded)this.updatedList.get(var4);
               var5.finishUpdate();
               var5.isUpdating = false;
               ++var4;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            }

            this.updatedList.clear();
            break;
         }

      }
   }

   public void pause() {
      Object var2 = this.lock;
      String[] var1 = class_752.method_4253();
      Object var3 = this.lock;
      synchronized(this.lock) {
         this.canWork = false;
         this.canWorkToEndOfUpdate = false;
         this.lock.notifyAll();

         while(true) {
            if(this.working) {
               label25: {
                  try {
                     this.lock.wait();
                  } catch (InterruptedException var6) {
                     if(var1 != null) {
                        continue;
                     }
                     break label25;
                  }

                  if(var1 != null) {
                     continue;
                  }
                  break;
               }
            }

            this.finishUpdatedRenderers();
            break;
         }

      }
   }

   public void unpause() {
      String[] var10000 = class_752.method_4253();
      Object var2 = this.lock;
      String[] var1 = var10000;
      Object var3 = this.lock;
      synchronized(this.lock) {
         WrUpdateThread var6 = this;
         if(var1 != null) {
            if(this.working) {
               var10000 = field_6845;
               Config.warn("UpdateThread still working in unpause()!!!");
            }

            this.canWork = true;
            this.canWorkToEndOfUpdate = false;
            var6 = this;
         }

         var6.lock.notifyAll();
      }
   }

   public void unpauseToEndOfUpdate() {
      String[] var10000 = class_752.method_4253();
      Object var2 = this.lock;
      String[] var1 = var10000;
      Object var3 = this.lock;
      synchronized(this.lock) {
         WrUpdateThread var8 = this;
         if(var1 != null) {
            if(this.working) {
               var10000 = field_6845;
               Config.warn("UpdateThread still working in unpause()!!!");
            }

            var8 = this;
         }

         WorldRendererThreaded var9 = var8.currentRenderer;
         if(var1 != null) {
            if(var9 == null) {
               return;
            }

            var9 = this.currentRenderer;
         }

         for(; var9 != null; var9 = this.currentRenderer) {
            this.canWork = false;
            this.canWorkToEndOfUpdate = true;
            this.lock.notifyAll();

            try {
               this.lock.wait();
            } catch (InterruptedException var6) {
               if(var1 == null) {
                  break;
               }
               continue;
            }

            if(var1 == null) {
               return;
            }
         }

         this.pause();
      }
   }

   private void checkCanWork(IWrUpdateControl var1) {
      Thread.yield();
      String[] var10000 = class_752.method_4253();
      Object var3 = this.lock;
      String[] var2 = var10000;
      Object var4 = this.lock;
      synchronized(this.lock) {
         WrUpdateThread var9;
         while(true) {
            if(!this.canWork) {
               label67: {
                  var9 = this;
                  if(var2 == null) {
                     break;
                  }

                  label68: {
                     if(var2 != null) {
                        if(!this.canWorkToEndOfUpdate) {
                           break label68;
                        }

                        var9 = this;
                     }

                     if(var2 == null) {
                        break;
                     }

                     if(var9.currentRenderer != null) {
                        break label67;
                     }
                  }

                  label45: {
                     IWrUpdateControl var10 = var1;
                     if(var2 != null) {
                        if(var1 == null) {
                           break label45;
                        }

                        var10 = var1;
                     }

                     var10.pause();
                  }

                  this.working = false;
                  this.lock.notifyAll();

                  try {
                     this.lock.wait();
                     continue;
                  } catch (InterruptedException var7) {
                     if(var2 != null) {
                        continue;
                     }
                  }
               }
            }

            var9 = this;
            break;
         }

         var9.working = true;
         if(var2 != null) {
            if(var1 != null) {
               var1.resume();
            }

            this.lock.notifyAll();
         }

      }
   }

   public void clearAllUpdates() {
      String[] var10000 = class_752.method_4253();
      Object var2 = this.lock;
      String[] var1 = var10000;
      Object var3 = this.lock;
      synchronized(this.lock) {
         this.unpauseToEndOfUpdate();
         int var4 = 0;

         while(true) {
            if(var4 < this.updateList.size()) {
               blo var5 = (blo)this.updateList.get(var4);
               var5.field_1902 = true;
               var5.isUpdating = false;
               ++var4;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            }

            this.updateList.clear();
            this.lock.notifyAll();
            break;
         }

      }
   }

   public int getPendingUpdatesCount() {
      Object var1 = this.lock;
      Object var2 = this.lock;
      synchronized(this.lock) {
         int var3 = this.updateList.size();
         if(this.currentRenderer != null) {
            ++var3;
         }

         return var3;
      }
   }

   public int resetUpdateCount() {
      Object var1 = this.lock;
      Object var2 = this.lock;
      synchronized(this.lock) {
         int var3 = this.updateCount;
         this.updateCount = 0;
         return var3;
      }
   }

   public void terminate() {
      this.terminated = true;
   }

   static bmh access$000(WrUpdateThread var0) {
      return var0.mainTessellator;
   }

   static bmh access$100(WrUpdateThread var0) {
      return var0.threadTessellator;
   }

   static void access$200(WrUpdateThread var0, IWrUpdateControl var1) {
      var0.checkCanWork(var1);
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_7009(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7010() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "%ñP#Ëª`þX4Ï¼9¿A5Ï¬)ñS*0ûU4ú°2úUqÝ¬)óXË&Áª+öZqÇ¶`êZ0Û«%·Êp2ÊD0Ú½÷F0Ê";
      int var4 = "%ñP#Ëª`þX4Ï¼9¿A5Ï¬)ñS*0ûU4ú°2úUqÝ¬)óXË&Áª+öZqÇ¶`êZ0Û«%·Êp2ÊD0Ú½÷F0Ê".length();
      char var1 = 25;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_6845 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 157;
               break;
            case 1:
               var10009 = 5;
               break;
            case 2:
               var10009 = 218;
               break;
            case 3:
               var10009 = 113;
               break;
            case 4:
               var10009 = 174;
               break;
            case 5:
               var10009 = 20;
               break;
            default:
               var10009 = 235;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: jS
public class class_1294 extends class_1293 {

   // $FF: renamed from: c ahb
   private ahb field_6640;
   // $FF: renamed from: d java.util.List
   private final List field_6641;
   // $FF: renamed from: e java.util.List
   private final List field_6642;
   // $FF: renamed from: f java.util.List
   private final List field_6643;
   // $FF: renamed from: g int
   private int field_6644;
   // $FF: renamed from: h java.lang.String
   private static final String field_6645;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_6646;


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_6768(String var1) {
      super.method_6768(var1);
      this.field_6641 = new ArrayList();
      this.field_6642 = new ArrayList();
      this.field_6643 = new ArrayList();
   }

   // $FF: renamed from: <init> (ahb) void
   public void method_6774(ahb var1) {
      String[] var10001 = field_6646;
      super.method_6768("villages");
      this.field_6641 = new ArrayList();
      this.field_6642 = new ArrayList();
      this.field_6643 = new ArrayList();
      this.field_6640 = var1;
      this.method_6771();
   }

   // $FF: renamed from: b (ahb) void
   public void method_6775(ahb var1) {
      this.field_6640 = var1;
      String[] var2 = class_752.method_4253();
      Iterator var3 = this.field_6643.iterator();

      while(var3.hasNext()) {
         class_1849 var4 = (class_1849)var3.next();
         var4.method_9997(var1);
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int, int, int) void
   public void method_6776(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_6641.size();
      if(var4 != null) {
         if(var10000 > 64) {
            return;
         }

         var10000 = this.method_6786(var1, var2, var3);
      }

      if(var4 != null && var10000 == 0) {
         List var5 = this.field_6641;
         class_1661 var10001 = new class_1661;
         var10001.method_9151(var1, var2, var3);
         var5.add(var10001);
      }

   }

   // $FF: renamed from: c () void
   public void method_6777() {
      String[] var10000 = class_752.method_4253();
      ++this.field_6644;
      String[] var1 = var10000;
      Iterator var2 = this.field_6643.iterator();

      while(true) {
         if(var2.hasNext()) {
            class_1849 var3 = (class_1849)var2.next();
            var3.method_9998(this.field_6644);
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.method_6778();
         this.method_6781();
         this.method_6782();
         break;
      }

      class_1294 var4 = this;
      if(var1 != null) {
         if(this.field_6644 % 400 != 0) {
            return;
         }

         var4 = this;
      }

      var4.method_6771();
   }

   // $FF: renamed from: d () void
   private void method_6778() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_6643.iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         label19: {
            class_1849 var3 = (class_1849)var2.next();
            if(var1 != null) {
               if(!var3.method_10014()) {
                  break label19;
               }

               var2.remove();
            }

            this.method_6771();
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e () java.util.List
   public List method_6779() {
      return this.field_6643;
   }

   // $FF: renamed from: b (int, int, int, int) za
   public class_1849 method_6780(int var1, int var2, int var3, int var4) {
      class_1849 var6 = null;
      float var7 = Float.MAX_VALUE;
      String[] var5 = class_752.method_4253();
      Iterator var8 = this.field_6643.iterator();

      class_1849 var10000;
      while(true) {
         if(var8.hasNext()) {
            class_1849 var9 = (class_1849)var8.next();
            var10000 = var9;
            if(var5 == null) {
               break;
            }

            label39: {
               float var10 = var9.method_10003().method_9155(var1, var2, var3);
               float var14;
               int var12 = (var14 = var10 - var7) == 0.0F?0:(var14 < 0.0F?-1:1);
               if(var5 != null) {
                  if(var12 >= 0) {
                     break label39;
                  }

                  var12 = var4 + var9.method_10004();
               }

               float var11 = (float)var12;
               float var13 = var10;
               if(var5 != null) {
                  if(var10 > var11 * var11) {
                     break label39;
                  }

                  var6 = var9;
                  var13 = var10;
               }

               var7 = var13;
            }

            if(var5 != null) {
               continue;
            }
         }

         var10000 = var6;
         break;
      }

      return var10000;
   }

   // $FF: renamed from: g () void
   private void method_6781() {
      String[] var1 = class_752.method_4253();
      class_1294 var10000 = this;
      if(var1 != null) {
         if(this.field_6641.isEmpty()) {
            return;
         }

         var10000 = this;
      }

      var10000.method_6783((class_1661)this.field_6641.remove(0));
   }

   // $FF: renamed from: h () void
   private void method_6782() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      List var10;
      label47:
      while(true) {
         int var9 = var2;
         int var10001 = this.field_6642.size();

         label44:
         while(var9 < var10001) {
            class_1841 var3 = (class_1841)this.field_6642.get(var2);
            int var4 = 0;
            var10 = this.field_6643;
            if(var1 == null) {
               break label47;
            }

            Iterator var5 = this.field_6643.iterator();

            class_1849 var6;
            while(var5.hasNext()) {
               var6 = (class_1849)var5.next();
               int var7 = (int)var6.method_10003().method_9155(var3.field_9397, var3.field_9398, var3.field_9399);
               int var8 = 32 + var6.method_10004();
               var9 = var7;
               if(var1 != null) {
                  var10001 = var8 * var8;
                  if(var1 == null) {
                     continue label44;
                  }

                  if(var7 > var10001 && var1 != null) {
                     continue;
                  }

                  var6.method_10013(var3);
                  var9 = 1;
               }

               var4 = var9;
               break;
            }

            if(var4 == 0) {
               class_1849 var11 = new class_1849;
               var11.method_9996(this.field_6640);
               var6 = var11;
               var6.method_10013(var3);
               this.field_6643.add(var6);
               this.method_6771();
            }

            ++var2;
            if(var1 != null) {
               continue label47;
            }
            break;
         }

         var10 = this.field_6642;
         break;
      }

      var10.clear();
   }

   // $FF: renamed from: b (vF) void
   private void method_6783(class_1661 var1) {
      byte var3 = 16;
      String[] var10000 = class_752.method_4253();
      byte var4 = 4;
      String[] var2 = var10000;
      byte var5 = 16;
      int var6 = var1.field_8646 - var3;

      do {
         int var10 = var6;

         label62:
         while(true) {
            if(var10 >= var1.field_8646 + var3) {
               return;
            }

            int var7 = var1.field_8647 - var4;

            while(true) {
               var10 = var7;

               label58:
               while(true) {
                  if(var10 >= var1.field_8647 + var4) {
                     break label62;
                  }

                  var10 = var1.field_8648 - var5;
                  if(var2 == null) {
                     continue label62;
                  }

                  int var8 = var10;

                  while(var8 < var1.field_8648 + var5) {
                     label73: {
                        class_1294 var11 = this;
                        int var10001 = var6;
                        int var10002 = var7;
                        int var10003 = var8;
                        if(var2 != null) {
                           var10 = this.method_6787(var6, var7, var8);
                           if(var2 == null) {
                              continue label58;
                           }

                           if(var10 == 0) {
                              break label73;
                           }

                           var11 = this;
                           var10001 = var6;
                           var10002 = var7;
                           var10003 = var8;
                        }

                        class_1841 var9 = var11.method_6784(var10001, var10002, var10003);
                        class_1841 var12 = var9;
                        if(var2 != null) {
                           if(var9 == null) {
                              this.method_6785(var6, var7, var8);
                              if(var2 != null) {
                                 break label73;
                              }
                           }

                           var12 = var9;
                        }

                        var12.field_9402 = this.field_6644;
                     }

                     ++var8;
                     if(var2 == null) {
                        break;
                     }
                  }

                  ++var7;
                  if(var2 == null) {
                     break label62;
                  }
                  break;
               }
            }
         }

         ++var6;
      } while(var2 != null);

   }

   // $FF: renamed from: c (int, int, int) y_
   private class_1841 method_6784(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      Iterator var5 = this.field_6642.iterator();
      String[] var4 = var10000;

      while(true) {
         Object var9;
         if(!var5.hasNext()) {
            var5 = this.field_6643.iterator();
            if(!var5.hasNext()) {
               return null;
            }

            var9 = var5.next();
         } else {
            class_1841 var6 = (class_1841)var5.next();
            int var10 = var6.field_9397;
            int var10001 = var1;
            if(var4 != null) {
               if(var6.field_9397 != var1) {
                  continue;
               }

               var10 = var6.field_9399;
               var10001 = var3;
            }

            if(var4 != null) {
               if(var10 != var10001) {
                  continue;
               }

               var10 = Math.abs(var6.field_9398 - var2);
               var10001 = 1;
            }

            if(var10 > var10001) {
               continue;
            }

            var9 = var6;
            if(var4 != null) {
               return var6;
            }
         }

         while(true) {
            class_1849 var8 = (class_1849)var9;
            class_1841 var7 = var8.method_10012(var1, var2, var3);
            if(var7 != null) {
               return var7;
            }

            if(!var5.hasNext()) {
               return null;
            }

            var9 = var5.next();
         }
      }
   }

   // $FF: renamed from: d (int, int, int) void
   private void method_6785(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = ((class_417)class_1192.field_6090).method_2670(this.field_6640, var1, var2, var3);
      String[] var4 = var10000;
      int var8 = var5;
      int var6;
      int var7;
      byte var9;
      List var10;
      class_1841 var10001;
      if(var4 != null) {
         label106: {
            if(var5 != 0) {
               var8 = var5;
               if(var4 == null) {
                  break label106;
               }

               if(var5 != 2) {
                  var6 = 0;
                  var7 = -5;

                  while(true) {
                     if(var7 < 0) {
                        var9 = this.field_6640.method_2067(var1, var2, var3 + var7);
                        if(var4 == null) {
                           break;
                        }

                        if(var9 != 0) {
                           --var6;
                        }

                        ++var7;
                        if(var4 != null) {
                           continue;
                        }
                     }

                     var9 = 1;
                     break;
                  }

                  var7 = var9;

                  while(true) {
                     if(var7 <= 5) {
                        var8 = this.field_6640.method_2067(var1, var2, var3 + var7);
                        if(var4 == null) {
                           break;
                        }

                        if(var8 != 0) {
                           ++var6;
                        }

                        ++var7;
                        if(var4 != null) {
                           continue;
                        }
                     }

                     var8 = var6;
                     break;
                  }

                  if(var8 == 0) {
                     return;
                  }

                  var10 = this.field_6642;
                  var10001 = new class_1841;
                  var10001.method_9958(var1, var2, var3, 0, var6 > 0?-2:2, this.field_6644);
                  var10.add(var10001);
                  if(var4 != null) {
                     return;
                  }
               }
            }

            var8 = 0;
         }
      }

      var6 = var8;
      var7 = -5;

      while(true) {
         if(var7 < 0) {
            var9 = this.field_6640.method_2067(var1 + var7, var2, var3);
            if(var4 == null) {
               break;
            }

            if(var9 != 0) {
               --var6;
            }

            ++var7;
            if(var4 != null) {
               continue;
            }
         }

         var9 = 1;
         break;
      }

      var7 = var9;

      while(true) {
         if(var7 <= 5) {
            var8 = this.field_6640.method_2067(var1 + var7, var2, var3);
            if(var4 == null) {
               break;
            }

            if(var8 != 0) {
               ++var6;
            }

            ++var7;
            if(var4 != null) {
               continue;
            }
         }

         var8 = var6;
         break;
      }

      if(var8 != 0) {
         var10 = this.field_6642;
         var10001 = new class_1841;
         var10001.method_9958(var1, var2, var3, var6 > 0?-2:2, 0, this.field_6644);
         var10.add(var10001);
      }

   }

   // $FF: renamed from: e (int, int, int) boolean
   private boolean method_6786(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      Iterator var5 = this.field_6641.iterator();
      String[] var4 = var10000;

      boolean var8;
      while(true) {
         if(!var5.hasNext()) {
            var8 = false;
            break;
         }

         class_1661 var6 = (class_1661)var5.next();
         int var7 = var6.field_8646;
         int var10001 = var1;
         if(var4 != null) {
            if(var6.field_8646 != var1) {
               continue;
            }

            var7 = var6.field_8647;
            var10001 = var2;
         }

         if(var4 != null) {
            if(var7 != var10001) {
               continue;
            }

            var7 = var6.field_8648;
            var10001 = var3;
         }

         if(var7 == var10001) {
            var8 = true;
            if(var4 != null) {
               return true;
            }
            break;
         }
      }

      return var8;
   }

   // $FF: renamed from: f (int, int, int) boolean
   private boolean method_6787(int var1, int var2, int var3) {
      return this.field_6640.getBlock(var1, var2, var3) == class_1192.field_6090;
   }

   // $FF: renamed from: b (ro) void
   public void method_6769(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var7 = field_6646;
      this.field_6644 = var1.method_8681("Tick");
      String[] var2 = var10000;
      class_1580 var3 = var1.method_8689("Villages", 10);
      int var4 = 0;

      while(var4 < var3.method_8658()) {
         class_1583 var5 = var3.method_8653(var4);
         class_1849 var8 = new class_1849;
         var8.method_9995();
         class_1849 var6 = var8;
         var6.method_10025(var5);
         this.field_6643.add(var6);
         ++var4;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (ro) void
   public void method_6770(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var7 = field_6646;
      var1.method_8667("Tick", this.field_6644);
      String[] var2 = var10000;
      class_1580 var8 = new class_1580;
      var8.method_8628();
      class_1580 var3 = var8;
      Iterator var4 = this.field_6643.iterator();

      while(true) {
         if(var4.hasNext()) {
            class_1849 var5 = (class_1849)var4.next();
            class_1583 var9 = new class_1583;
            var9.method_8628();
            class_1583 var6 = var9;
            var5.method_10026(var6);
            var3.method_8650(var6);
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         String[] var10001 = field_6646;
         var1.method_8664("Villages", var3);
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6788() {
      // $FF: Couldn't be decompiled
   }
}

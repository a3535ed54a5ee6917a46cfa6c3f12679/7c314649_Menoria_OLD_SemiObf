import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: qi
public class class_1535 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_8059;
   // $FF: renamed from: c java.util.List
   private final List field_8060;
   // $FF: renamed from: d java.util.List
   private final List field_8061;
   // $FF: renamed from: a boolean
   public boolean field_8062;
   // $FF: renamed from: e java.lang.String
   private String field_8063;
   // $FF: renamed from: f java.util.Map
   private final Map field_8064;
   private static final String __OBFID;
   public boolean profilerGlobalEnabled;
   private boolean profilerLocalEnabled;
   private long startTickNano;
   public long timeTickNano;
   private long startUpdateChunksNano;
   public long timeUpdateChunksNano;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8065;


   // $FF: renamed from: <init> () void
   public void method_8330() {
      super();
      this.field_8060 = new ArrayList();
      this.field_8061 = new ArrayList();
      this.field_8063 = "";
      this.field_8064 = new HashMap();
      this.profilerGlobalEnabled = true;
      this.profilerLocalEnabled = this.profilerGlobalEnabled;
      this.startTickNano = 0L;
      this.timeTickNano = 0L;
      this.startUpdateChunksNano = 0L;
      this.timeUpdateChunksNano = 0L;
   }

   // $FF: renamed from: a () void
   public void method_8331() {
      this.field_8064.clear();
      this.field_8063 = "";
      this.field_8060.clear();
      this.profilerLocalEnabled = this.profilerGlobalEnabled;
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_8332(String var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = Config.getGameSettings().field_4562;
      if(var2 != null) {
         label93: {
            if(var10000 != 0) {
               long var4;
               var10000 = (var4 = this.startTickNano - 0L) == 0L?0:(var4 < 0L?-1:1);
               String[] var3;
               if(var2 != null) {
                  label101: {
                     if(var10000 == 0) {
                        var3 = field_8065;
                        var10000 = var1.equals("tick");
                        if(var2 == null) {
                           break label101;
                        }

                        if(var10000 != 0) {
                           this.startTickNano = System.nanoTime();
                        }
                     }

                     long var5;
                     var10000 = (var5 = this.startTickNano - 0L) == 0L?0:(var5 < 0L?-1:1);
                  }
               }

               if(var2 != null) {
                  label102: {
                     if(var10000 != 0) {
                        var3 = field_8065;
                        var10000 = var1.equals("preRenderErrors");
                        if(var2 == null) {
                           break label102;
                        }

                        if(var10000 != 0) {
                           this.timeTickNano = System.nanoTime() - this.startTickNano;
                           this.startTickNano = 0L;
                        }
                     }

                     long var6;
                     var10000 = (var6 = this.startUpdateChunksNano - 0L) == 0L?0:(var6 < 0L?-1:1);
                  }
               }

               if(var2 != null) {
                  label65: {
                     if(var10000 == 0) {
                        var3 = field_8065;
                        var10000 = var1.equals("updatechunks");
                        if(var2 == null) {
                           break label65;
                        }

                        if(var10000 != 0) {
                           this.startUpdateChunksNano = System.nanoTime();
                        }
                     }

                     long var7;
                     var10000 = (var7 = this.startUpdateChunksNano - 0L) == 0L?0:(var7 < 0L?-1:1);
                  }
               }

               if(var2 == null) {
                  break label93;
               }

               if(var10000 != 0) {
                  String[] var10001 = field_8065;
                  var10000 = var1.equals("terrain");
                  if(var2 == null) {
                     break label93;
                  }

                  if(var10000 != 0) {
                     this.timeUpdateChunksNano = System.nanoTime() - this.startUpdateChunksNano;
                     this.startUpdateChunksNano = 0L;
                  }
               }
            }

            var10000 = this.profilerLocalEnabled;
         }
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.field_8062;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.field_8063.length();
      }

      if(var2 != null) {
         if(var10000 > 0) {
            this.field_8063 = this.field_8063 + ".";
         }

         this.field_8063 = this.field_8063 + var1;
         this.field_8060.add(this.field_8063);
         this.field_8061.add(Long.valueOf(System.nanoTime()));
      }

   }

   // $FF: renamed from: b () void
   public void method_8333() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.profilerLocalEnabled;
      if(var1 != null) {
         if(!this.profilerLocalEnabled) {
            return;
         }

         var10000 = this.field_8062;
      }

      if(var10000) {
         String var10001;
         long var6;
         label39: {
            long var2 = System.nanoTime();
            long var4 = ((Long)this.field_8061.remove(this.field_8061.size() - 1)).longValue();
            this.field_8060.remove(this.field_8060.size() - 1);
            var6 = var2 - var4;
            Map var9 = this.field_8064;
            var10001 = this.field_8063;
            if(var1 != null) {
               if(this.field_8064.containsKey(this.field_8063)) {
                  this.field_8064.put(this.field_8063, Long.valueOf(((Long)this.field_8064.get(this.field_8063)).longValue() + var6));
                  if(var1 != null) {
                     break label39;
                  }
               }

               var9 = this.field_8064;
               var10001 = this.field_8063;
            }

            var9.put(var10001, Long.valueOf(var6));
         }

         if(var6 > 100000000L) {
            Logger var10 = field_8059;
            StringBuilder var11 = new StringBuilder();
            String[] var8 = field_8065;
            var10.warn(var11.append("Something\'s taking too long! \'").append(this.field_8063).append("\' took aprox ").append((double)var6 / 1000000.0D).append(" ms").toString());
         }

         label31: {
            Object var12 = this.field_8060;
            if(var1 != null) {
               if(this.field_8060.isEmpty()) {
                  var10001 = "";
                  break label31;
               }

               var12 = this.field_8060.get(this.field_8060.size() - 1);
            }

            var10001 = (String)var12;
         }

         this.field_8063 = var10001;
      }

   }

   // $FF: renamed from: b (java.lang.String) java.util.List
   public List method_8334(String var1) {
      this.profilerLocalEnabled = this.profilerGlobalEnabled;
      String[] var2 = class_752.method_4253();
      boolean var10000 = this.profilerLocalEnabled;
      String[] var21;
      if(var2 != null) {
         if(!this.profilerLocalEnabled) {
            ArrayList var30 = new ArrayList;
            class_1717[] var24 = new class_1717[1];
            class_1717 var10005 = new class_1717;
            var21 = field_8065;
            var10005.method_9601("root", 0.0D, 0.0D);
            var24[0] = var10005;
            var30.<init>(Arrays.asList(var24));
            return var30;
         }

         var10000 = this.field_8062;
      }

      String var10001;
      Map var23;
      long var25;
      label168: {
         label172: {
            if(var2 != null) {
               if(!var10000) {
                  return null;
               }

               var23 = this.field_8064;
               var21 = field_8065;
               var10001 = "root";
               if(var2 == null) {
                  break label172;
               }

               var10000 = this.field_8064.containsKey("root");
            }

            if(!var10000) {
               var25 = 0L;
               break label168;
            }

            var23 = this.field_8064;
            var21 = field_8065;
            var10001 = "root";
         }

         var25 = ((Long)var23.get(var10001)).longValue();
      }

      long var3;
      label157: {
         var3 = var25;
         var23 = this.field_8064;
         var10001 = var1;
         if(var2 != null) {
            if(!this.field_8064.containsKey(var1)) {
               var25 = -1L;
               break label157;
            }

            var23 = this.field_8064;
            var10001 = var1;
         }

         var25 = ((Long)var23.get(var10001)).longValue();
      }

      long var5;
      ArrayList var7;
      label151: {
         var5 = var25;
         var7 = new ArrayList();
         String var27 = var1;
         if(var2 != null) {
            if(var1.length() <= 0) {
               break label151;
            }

            var27 = var1 + ".";
         }

         var1 = var27;
      }

      long var8 = 0L;
      Iterator var10 = this.field_8064.keySet().iterator();

      int var28;
      while(var10.hasNext()) {
         label175: {
            String var11 = (String)var10.next();
            var28 = var11.length();
            if(var2 != null) {
               if(var28 <= var1.length()) {
                  break label175;
               }

               var28 = var11.startsWith(var1);
            }

            if(var2 != null) {
               if(var28 == 0) {
                  break label175;
               }

               var28 = var11.indexOf(".", var1.length() + 1);
            }

            if(var28 < 0) {
               var8 += ((Long)this.field_8064.get(var11)).longValue();
            }
         }

         if(var2 == null) {
            break;
         }
      }

      float var22;
      label127: {
         label176: {
            var22 = (float)var8;
            long var31;
            var28 = (var31 = var8 - var5) == 0L?0:(var31 < 0L?-1:1);
            if(var2 != null) {
               if(var28 < 0) {
                  var8 = var5;
               }

               var25 = var3;
               if(var2 == null) {
                  break label176;
               }

               long var32;
               var28 = (var32 = var3 - var8) == 0L?0:(var32 < 0L?-1:1);
            }

            if(var28 >= 0) {
               break label127;
            }

            var25 = var8;
         }

         var3 = var25;
      }

      Iterator var12 = this.field_8064.keySet().iterator();

      String var13;
      class_1717 var26;
      while(true) {
         if(var12.hasNext()) {
            var13 = (String)var12.next();
            var28 = var13.length();
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               if(var28 <= var1.length()) {
                  continue;
               }

               var28 = var13.startsWith(var1);
            }

            Object var29;
            label181: {
               if(var2 != null) {
                  if(var28 == 0) {
                     continue;
                  }

                  var29 = var13;
                  if(var2 == null) {
                     break label181;
                  }

                  var28 = var13.indexOf(".", var1.length() + 1);
               }

               if(var28 >= 0) {
                  continue;
               }

               var29 = this.field_8064.get(var13);
            }

            long var14 = ((Long)var29).longValue();
            double var16 = (double)var14 * 100.0D / (double)var8;
            double var18 = (double)var14 * 100.0D / (double)var3;
            String var20 = var13.substring(var1.length());
            var26 = new class_1717;
            var26.method_9601(var20, var16, var18);
            var7.add(var26);
            if(var2 != null) {
               continue;
            }
         }

         var12 = this.field_8064.keySet().iterator();
         var28 = var12.hasNext();
         break;
      }

      while(var28 != 0) {
         var13 = (String)var12.next();
         this.field_8064.put(var13, Long.valueOf(((Long)this.field_8064.get(var13)).longValue() * 999L / 1000L));
         if(var2 == null) {
            return var7;
         }

         if(var2 == null) {
            break;
         }

         var28 = var12.hasNext();
      }

      if(var2 != null && (float)var8 > var22) {
         var26 = new class_1717;
         String[] var10003 = field_8065;
         var26.method_9601("unspecified", (double)((float)var8 - var22) * 100.0D / (double)var8, (double)((float)var8 - var22) * 100.0D / (double)var3);
         var7.add(var26);
      }

      Collections.sort(var7);
      class_1717 var10002 = new class_1717;
      var10002.method_9601(var1, 100.0D, (double)var8 * 100.0D / (double)var3);
      var7.add(0, var10002);
      return var7;
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_8335(String var1) {
      String[] var2 = class_752.method_4253();
      class_1535 var10000 = this;
      if(var2 != null) {
         if(!this.profilerLocalEnabled) {
            return;
         }

         this.method_8333();
         var10000 = this;
      }

      var10000.method_8332(var1);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_8336() {
      String[] var1 = class_752.method_4253();
      Object var10000 = this.field_8060;
      String var2;
      if(var1 != null) {
         if(this.field_8060.size() == 0) {
            String[] var3 = field_8065;
            var2 = "[UNKNOWN]";
            return var2;
         }

         var10000 = this.field_8060.get(this.field_8060.size() - 1);
      }

      var2 = (String)var10000;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8337() {
      // $FF: Couldn't be decompiled
   }
}

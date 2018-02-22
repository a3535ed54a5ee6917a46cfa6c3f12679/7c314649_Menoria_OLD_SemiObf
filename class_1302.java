import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: jX
public class class_1302 extends class_1301 {

   // $FF: renamed from: d org.apache.logging.log4j.Logger
   private static final Logger field_6679;
   // $FF: renamed from: e java.lang.String
   private static final String field_6680;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_6681;


   // $FF: renamed from: <init> (java.io.File) void
   public void method_6819(File var1) {
      super.method_6819(var1);
   }

   // $FF: renamed from: b () java.lang.String
   public String method_135() {
      String[] var10000 = field_6681;
      return "Anvil";
   }

   // $FF: renamed from: c () java.util.List
   public List method_137() {
      label89: {
         String[] var1 = class_752.method_4253();
         File var10000 = this.field_6676;
         if(var1 != null) {
            if(this.field_6676 == null) {
               break label89;
            }

            var10000 = this.field_6676;
         }

         boolean var15 = var10000.exists();
         if(var1 != null) {
            if(!var15) {
               break label89;
            }

            var15 = this.field_6676.isDirectory();
         }

         if(var15) {
            ArrayList var2 = new ArrayList();
            File[] var3 = this.field_6676.listFiles();
            File[] var4 = var3;
            int var5 = var3.length;
            int var6 = 0;

            while(var6 < var5) {
               File var7 = var4[var6];
               if(var1 != null) {
                  label70: {
                     if(var7.isDirectory()) {
                        String var8 = var7.getName();
                        class_1303 var9 = this.method_139(var8);
                        if(var1 == null) {
                           break label70;
                        }

                        if(var9 != null) {
                           label92: {
                              int var16;
                              label63: {
                                 var16 = var9.method_6853();
                                 int var10001 = 19132;
                                 if(var1 != null) {
                                    label93: {
                                       if(var16 != 19132) {
                                          var16 = var9.method_6853();
                                          var10001 = 19133;
                                          if(var1 == null) {
                                             break label93;
                                          }

                                          if(var16 != 19133) {
                                             break label92;
                                          }
                                       }

                                       var16 = var9.method_6853();
                                       if(var1 == null) {
                                          break label63;
                                       }

                                       var10001 = this.method_6823();
                                    }
                                 }

                                 var16 = var16 != var10001?1:0;
                              }

                              int var10;
                              String var11;
                              label50: {
                                 var10 = var16;
                                 var11 = var9.method_6851();
                                 String var18 = var11;
                                 if(var1 != null) {
                                    label48: {
                                       if(var11 != null) {
                                          var18 = var11;
                                          if(var1 == null) {
                                             break label48;
                                          }

                                          if(!class_1715.method_9574(var11)) {
                                             break label50;
                                          }
                                       }

                                       var18 = var8;
                                    }
                                 }

                                 var11 = var18;
                              }

                              long var12 = 0L;
                              class_1339 var17 = new class_1339;
                              var17.method_7066(var8, var11, var9.method_6855(), var12, var9.method_6864(), (boolean)var10, var9.method_6867(), var9.method_6871());
                              var2.add(var17);
                           }
                        }
                     }

                     ++var6;
                  }
               }

               if(var1 == null) {
                  break;
               }
            }

            return var2;
         }
      }

      class_886 var14 = new class_886;
      String[] var10002 = field_6681;
      var14.method_5168("Unable to read or access folder where game worlds are saved!");
      throw var14;
   }

   // $FF: renamed from: a () int
   protected int method_6823() {
      return 19133;
   }

   // $FF: renamed from: e () void
   public void method_138() {
      class_1083.method_6138();
   }

   // $FF: renamed from: b (java.lang.String, boolean) j9
   public class_29 method_136(String var1, boolean var2) {
      class_1300 var10000 = new class_1300;
      var10000.method_6814(this.field_6676, var1, var2);
      return var10000;
   }

   // $FF: renamed from: d (java.lang.String) boolean
   public boolean method_143(String var1) {
      int var5;
      label24: {
         String[] var10000 = class_752.method_4253();
         class_1303 var3 = this.method_139(var1);
         String[] var2 = var10000;
         class_1303 var4 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label24;
            }

            var4 = var3;
         }

         var5 = var4.method_6853();
         if(var2 == null) {
            return (boolean)var5;
         }

         if(var5 == 19132) {
            var5 = 1;
            return (boolean)var5;
         }
      }

      var5 = 0;
      return (boolean)var5;
   }

   // $FF: renamed from: e (java.lang.String) boolean
   public boolean method_144(String var1) {
      int var5;
      label24: {
         String[] var10000 = class_752.method_4253();
         class_1303 var3 = this.method_139(var1);
         String[] var2 = var10000;
         class_1303 var4 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label24;
            }

            var4 = var3;
         }

         var5 = var4.method_6853();
         if(var2 == null) {
            return (boolean)var5;
         }

         if(var5 != this.method_6823()) {
            var5 = 1;
            return (boolean)var5;
         }
      }

      var5 = 0;
      return (boolean)var5;
   }

   // $FF: renamed from: b (java.lang.String, vu) boolean
   public boolean method_145(String var1, class_81 var2) {
      var2.method_400(0);
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      String[] var10000 = class_752.method_4253();
      ArrayList var6 = new ArrayList();
      File var7 = new File(this.field_6676, var1);
      File var10001 = new File(var7, "DIM-1");
      String[] var14 = field_6681;
      File var8 = var10001;
      File var9 = new File(var7, "DIM1");
      field_6679.info("Scanning folders...");
      this.method_6827(var7, var4);
      String[] var3 = var10000;
      int var15 = var8.exists();
      if(var3 != null) {
         if(var15 != 0) {
            this.method_6827(var8, var5);
         }

         var15 = var9.exists();
      }

      if(var3 != null) {
         if(var15 != 0) {
            this.method_6827(var9, var6);
         }

         var15 = var4.size() + var5.size() + var6.size();
      }

      int var10 = var15;
      Logger var17 = field_6679;
      StringBuilder var16 = new StringBuilder();
      var14 = field_6681;
      var17.info(var16.append("Total conversion count is ").append(var10).toString());
      class_1303 var11 = this.method_139(var1);
      Object var12 = null;
      if(var11.method_6868() == class_1046.field_5528) {
         class_959 var18 = new class_959;
         var18.method_5548(class_985.field_4989, 0.5F);
         var12 = var18;
      } else {
         class_958 var19 = new class_958;
         var19.method_5534(var11.method_6836(), var11.method_6868());
         var12 = var19;
      }

      var10001 = new File(var7, "region");
      var14 = field_6681;
      this.method_6825(var10001, var4, (class_958)var12, 0, var10, var2);
      var10001 = new File(var8, "region");
      class_959 var10003 = new class_959;
      var10003.method_5548(class_985.field_4996, 0.0F);
      this.method_6825(var10001, var5, var10003, var4.size(), var10, var2);
      var10001 = new File(var9, "region");
      var10003 = new class_959;
      var10003.method_5548(class_985.field_4997, 0.0F);
      this.method_6825(var10001, var6, var10003, var4.size() + var5.size(), var10, var2);
      var11.method_6854(19133);
      if(var3 != null) {
         if(var11.method_6868() == class_1046.field_5531) {
            var11.method_6869(class_1046.field_5527);
         }

         this.method_6824(var1);
      }

      class_29 var13 = this.method_136(var1, false);
      var13.method_129(var11);
      return true;
   }

   // $FF: renamed from: f (java.lang.String) void
   private void method_6824(String var1) {
      String[] var10000 = class_752.method_4253();
      File var3 = new File(this.field_6676, var1);
      String[] var2 = var10000;
      File var7 = var3;
      String[] var6;
      if(var2 != null) {
         if(!var3.exists()) {
            var6 = field_6681;
            field_6679.warn("Unable to create level.dat_mcr backup");
            if(var2 != null) {
               return;
            }
         }

         var7 = new File(var3, "level.dat");
         var6 = field_6681;
      }

      File var4 = var7;
      var7 = var4;
      if(var2 != null) {
         if(!var4.exists()) {
            var6 = field_6681;
            field_6679.warn("Unable to create level.dat_mcr backup");
            if(var2 != null) {
               return;
            }
         }

         var7 = new File(var3, "level.dat_mcr");
         var6 = field_6681;
      }

      File var5 = var7;
      if(!var4.renameTo(var5)) {
         String[] var10001 = field_6681;
         field_6679.warn("Unable to create level.dat_mcr backup");
      }

   }

   // $FF: renamed from: b (java.io.File, java.lang.Iterable, d0, int, int, vu) void
   private void method_6825(File var1, Iterable var2, class_958 var3, int var4, int var5, class_81 var6) {
      String[] var10000 = class_752.method_4253();
      Iterator var8 = var2.iterator();
      String[] var7 = var10000;

      while(var8.hasNext()) {
         File var9 = (File)var8.next();
         this.method_6826(var1, var9, var3, var4, var5, var6);
         ++var4;
         int var10 = (int)Math.round(100.0D * (double)var4 / (double)var5);
         var6.method_400(var10);
         if(var7 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.io.File, java.io.File, d0, int, int, vu) void
   private void method_6826(File param1, File param2, class_958 param3, int param4, int param5, class_81 param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.File, java.util.Collection) void
   private void method_6827(File var1, Collection var2) {
      File var10000 = new File(var1, "region");
      String[] var10003 = field_6681;
      File var3 = var10000;
      class_1298 var10001 = new class_1298;
      var10001.method_6812(this);
      File[] var4 = var3.listFiles(var10001);
      if(var4 != null) {
         Collections.addAll(var2, var4);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6821() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_6828(IOException var0) {
      return var0;
   }
}

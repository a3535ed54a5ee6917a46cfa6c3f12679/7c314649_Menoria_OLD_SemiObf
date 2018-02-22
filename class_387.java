import ca.diiza.e.class_804;
import ca.diiza.e.class_805;
import ca.diiza.e.class_806;
import java.util.Random;

// $FF: renamed from: fT
public class class_387 extends aji {

   // $FF: renamed from: M vL
   private class_73 field_2070;
   // $FF: renamed from: N vL
   private class_73 field_2071;
   // $FF: renamed from: O java.lang.String
   private static final String field_2072;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_2073;


   // $FF: renamed from: <init> () void
   public void method_2602() {
      super.method_2427(awt.field_4190);
      this.method_2521(class_872.field_4246);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      class_73 var4;
      if(var3 != null) {
         if(var1 == 0) {
            var4 = this.field_2071;
            return var4;
         }

         var10000 = var1;
      }

      var4 = var10000 == 1?this.field_2070:this.field_2010;
      return var4;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      super.method_2461(var1, var2, var3, var4);
      String[] var5 = var10000;
      if(var5 != null && var1.method_2172(var2, var3, var4)) {
         this.method_2458(var1, var2, var3, var4, 1);
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      if(var6 != null && var1.method_2172(var2, var3, var4)) {
         this.method_2458(var1, var2, var3, var4, 1);
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 1;
   }

   // $FF: renamed from: a (ahb, int, int, int, df) void
   public void method_2476(ahb var1, int var2, int var3, int var4, class_1036 var5) {
      if(!var1.field_1832) {
         class_714 var10000 = new class_714;
         var10000.method_4083(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var5.method_5866());
         class_714 var6 = var10000;
         var6.field_3201 = var1.field_1819.nextInt(var6.field_3201 / 4) + var6.field_3201 / 8;
         var1.method_2089(var6);
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, int) void
   public void method_2458(ahb var1, int var2, int var3, int var4, int var5) {
      this.method_2603(var1, var2, var3, var4, var5, (class_752)null);
   }

   // $FF: renamed from: b (ahb, int, int, int, int, sv) void
   public void method_2603(ahb var1, int var2, int var3, int var4, int var5, class_752 var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var7 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var5 & 1;
      }

      if(var10000 == 1) {
         class_714 var9 = new class_714;
         var9.method_4083(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var6);
         class_714 var8 = var9;
         var1.method_2089(var8);
         String[] var10002 = field_2073;
         var1.method_2082(var8, "game.tnt.primed", 1.0F, 1.0F);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      add var10000 = var5.method_4593();
      if(var10 != null) {
         if(var10000 == null) {
            return super.method_2481(var1, var2, var3, var4, var5, var6, var7, var8, var9);
         }

         var10000 = var5.method_4593();
      }

      if(var10 != null) {
         if(var10000.method_3730() != class_1010.field_5117) {
            return super.method_2481(var1, var2, var3, var4, var5, var6, var7, var8, var9);
         }

         this.method_2603(var1, var2, var3, var4, 1, var5);
         var1.method_2056(var2, var3, var4);
         var10000 = var5.method_4593();
      }

      var10000.method_3749(1, var5);
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, sa) void
   public void method_2498(ahb var1, int var2, int var3, int var4, class_689 var5) {
      String[] var6 = class_752.method_4253();
      boolean var10000 = var5 instanceof class_713;
      class_752 var8;
      class_689 var10006;
      if(var6 != null) {
         label119: {
            if(var10000) {
               var10000 = var1.field_1832;
               if(var6 == null) {
                  break label119;
               }

               if(!var1.field_1832) {
                  class_713 var7 = (class_713)var5;
                  if(var7.method_3936()) {
                     label108: {
                        var10006 = var7.field_3194;
                        if(var6 != null) {
                           if(!(var7.field_3194 instanceof class_752)) {
                              var8 = null;
                              break label108;
                           }

                           var10006 = var7.field_3194;
                        }

                        var8 = (class_752)var10006;
                     }

                     this.method_2603(var1, var2, var3, var4, 1, var8);
                     var1.method_2056(var2, var3, var4);
                  }

                  if(var6 != null) {
                     return;
                  }
               }
            }

            var10000 = var5 instanceof class_806;
         }
      }

      if(var6 != null) {
         label101: {
            if(var10000) {
               var10000 = var1.field_1832;
               if(var6 == null) {
                  break label101;
               }

               if(!var1.field_1832) {
                  class_806 var9 = (class_806)var5;
                  if(var9.method_3936()) {
                     label90: {
                        var10006 = var9.field_3779;
                        if(var6 != null) {
                           if(!(var9.field_3779 instanceof class_752)) {
                              var8 = null;
                              break label90;
                           }

                           var10006 = var9.field_3779;
                        }

                        var8 = (class_752)var10006;
                     }

                     this.method_2603(var1, var2, var3, var4, 1, var8);
                     var1.method_2056(var2, var3, var4);
                  }

                  if(var6 != null) {
                     return;
                  }
               }
            }

            var10000 = var5 instanceof class_804;
         }
      }

      if(var6 != null) {
         label83: {
            if(var10000) {
               var10000 = var1.field_1832;
               if(var6 == null) {
                  break label83;
               }

               if(!var1.field_1832) {
                  class_804 var10 = (class_804)var5;
                  if(var10.method_3936()) {
                     label72: {
                        var10006 = var10.field_3748;
                        if(var6 != null) {
                           if(!(var10.field_3748 instanceof class_752)) {
                              var8 = null;
                              break label72;
                           }

                           var10006 = var10.field_3748;
                        }

                        var8 = (class_752)var10006;
                     }

                     this.method_2603(var1, var2, var3, var4, 1, var8);
                     var1.method_2056(var2, var3, var4);
                  }

                  if(var6 != null) {
                     return;
                  }
               }
            }

            var10000 = var5 instanceof class_805;
         }
      }

      if(var6 != null) {
         if(!var10000) {
            return;
         }

         var10000 = var1.field_1832;
      }

      if(!var10000) {
         class_805 var11 = (class_805)var5;
         if(var11.method_3936()) {
            label59: {
               var10006 = var11.field_3763;
               if(var6 != null) {
                  if(!(var11.field_3763 instanceof class_752)) {
                     var8 = null;
                     break label59;
                  }

                  var10006 = var11.field_3763;
               }

               var8 = (class_752)var10006;
            }

            this.method_2603(var1, var2, var3, var4, 1, var8);
            var1.method_2056(var2, var3, var4);
         }
      }

   }

   // $FF: renamed from: a (df) boolean
   public boolean method_2527(class_1036 var1) {
      return false;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2073;
      this.field_2010 = var1.method_375(var10002.append("_side").toString());
      this.field_2070 = var1.method_375(this.method_2533() + "_top");
      this.field_2071 = var1.method_375(this.method_2533() + "_bottom");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

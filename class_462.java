import java.util.List;

// $FF: renamed from: e6
public class class_462 extends aji {

   // $FF: renamed from: M java.lang.String
   private final String field_2225;


   // $FF: renamed from: <init> (java.lang.String, awt) void
   public void method_2806(String var1, awt var2) {
      super.method_2427(var2);
      this.field_2225 = var1;
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      String[] var10000 = class_752.method_4253();
      boolean var9 = this.method_2807(var1, var2, var3, var4 - 1);
      boolean var10 = this.method_2807(var1, var2, var3, var4 + 1);
      String[] var8 = var10000;
      boolean var11 = this.method_2807(var1, var2 - 1, var3, var4);
      boolean var12 = this.method_2807(var1, var2 + 1, var3, var4);
      float var13 = 0.375F;
      float var14 = 0.625F;
      float var15 = 0.375F;
      float var16 = 0.625F;
      boolean var17 = var9;
      if(var8 != null) {
         if(var9) {
            var15 = 0.0F;
         }

         var17 = var10;
      }

      if(var8 != null) {
         if(var17) {
            var16 = 1.0F;
         }

         var17 = var9;
      }

      label98: {
         label97: {
            label104: {
               if(var8 != null) {
                  if(var17) {
                     break label104;
                  }

                  var17 = var10;
               }

               if(var8 == null) {
                  break label98;
               }

               if(!var17) {
                  break label97;
               }
            }

            this.method_2443(var13, 0.0F, var15, var14, 1.5F, var16);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
         }

         var15 = 0.375F;
         var16 = 0.625F;
         var17 = var11;
      }

      if(var8 != null) {
         if(var17) {
            var13 = 0.0F;
         }

         var17 = var12;
      }

      if(var8 != null) {
         if(var17) {
            var14 = 1.0F;
         }

         var17 = var11;
      }

      label82: {
         label81: {
            label105: {
               if(var8 != null) {
                  if(var17) {
                     break label105;
                  }

                  var17 = var12;
               }

               if(var8 != null) {
                  if(var17) {
                     break label105;
                  }

                  var17 = var9;
               }

               if(var8 == null) {
                  break label82;
               }

               if(var17) {
                  break label81;
               }

               var17 = var10;
               if(var8 == null) {
                  break label82;
               }

               if(var10) {
                  break label81;
               }
            }

            this.method_2443(var13, 0.0F, var15, var14, 1.5F, var16);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
         }

         var17 = var9;
      }

      if(var8 != null) {
         if(var17) {
            var15 = 0.0F;
         }

         var17 = var10;
      }

      if(var17) {
         var16 = 1.0F;
      }

      this.method_2443(var13, 0.0F, var15, var14, 1.0F, var16);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      boolean var6 = this.method_2807(var1, var2, var3, var4 - 1);
      boolean var7 = this.method_2807(var1, var2, var3, var4 + 1);
      boolean var8 = this.method_2807(var1, var2 - 1, var3, var4);
      boolean var9 = this.method_2807(var1, var2 + 1, var3, var4);
      float var10 = 0.375F;
      float var11 = 0.625F;
      float var12 = 0.375F;
      String[] var5 = var10000;
      float var13 = 0.625F;
      boolean var14 = var6;
      if(var5 != null) {
         if(var6) {
            var12 = 0.0F;
         }

         var14 = var7;
      }

      if(var5 != null) {
         if(var14) {
            var13 = 1.0F;
         }

         var14 = var8;
      }

      if(var5 != null) {
         if(var14) {
            var10 = 0.0F;
         }

         var14 = var9;
      }

      if(var14) {
         var11 = 1.0F;
      }

      this.method_2443(var10, 0.0F, var12, var11, 1.0F, var13);
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b (ahl, int, int, int) boolean
   public boolean method_2435(ahl var1, int var2, int var3, int var4) {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 11;
   }

   // $FF: renamed from: f (ahl, int, int, int) boolean
   public boolean method_2807(ahl var1, int var2, int var3, int var4) {
      String[] var5;
      aji var6;
      aji var7;
      label44: {
         String[] var10000 = class_752.method_4253();
         var6 = var1.getBlock(var2, var3, var4);
         var5 = var10000;
         var7 = var6;
         Object var10001 = this;
         if(var5 != null) {
            if(var6 == this) {
               return true;
            }

            var7 = var6;
            if(var5 == null) {
               break label44;
            }

            var10001 = class_1192.field_6132;
         }

         if(var7 == var10001) {
            return true;
         }

         var7 = var6;
      }

      boolean var8 = var7.field_2007.method_5072();
      if(var5 != null) {
         if(var8) {
            var8 = var6.method_2434();
            if(var5 == null) {
               return var8;
            }

            if(var8) {
               return var6.field_2007 != awt.field_4198;
            }
         }

         var8 = false;
      }

      return var8;
   }

   // $FF: renamed from: d (aji) boolean
   public static boolean method_2808(aji var0) {
      boolean var2;
      label17: {
         String[] var1 = class_752.method_4253();
         aji var10000 = var0;
         aji var10001 = class_1192.field_6111;
         if(var1 != null) {
            if(var0 == class_1192.field_6111) {
               break label17;
            }

            var10000 = var0;
            var10001 = class_1192.field_6138;
         }

         if(var10000 != var10001) {
            var2 = false;
            return var2;
         }
      }

      var2 = true;
      return var2;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2010 = var1.method_375(this.field_2225);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var10 != null) {
         if(var1.field_1832) {
            return true;
         }

         var10000 = class_554.getBlock35(var5, var1, var2, var3, var4);
      }

      if(var10 != null) {
         if(var10000) {
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }
}

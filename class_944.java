
// $FF: renamed from: cU
public class class_944 extends class_940 {

   // $FF: renamed from: C java.lang.String[]
   private static final String[] field_4816;
   // $FF: renamed from: G int[]
   private static final int[] field_4817;
   // $FF: renamed from: H int[]
   private static final int[] field_4818;
   // $FF: renamed from: I int[]
   private static final int[] field_4819;
   // $FF: renamed from: J int
   public final int field_4820;
   // $FF: renamed from: F java.lang.String[]
   private static final String[] field_4821;


   // $FF: renamed from: <init> (int, int, int) void
   public void method_5501(int var1, int var2, int var3) {
      super.method_5479(var1, var2, class_93.field_32);
      this.field_4820 = var3;
      if(var3 == 2) {
         this.field_4810 = class_93.field_33;
      }

   }

   // $FF: renamed from: b (int) int
   public int method_5483(int var1) {
      return field_4817[this.field_4820] + (var1 - 1) * field_4818[this.field_4820];
   }

   // $FF: renamed from: c (int) int
   public int method_5484(int var1) {
      return this.method_5483(var1) + field_4819[this.field_4820];
   }

   // $FF: renamed from: c () int
   public int method_5482() {
      return 4;
   }

   // $FF: renamed from: b (int, vX) int
   public int method_5485(int var1, class_1691 var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2.method_9341();
      if(var3 != null) {
         if(var10000 != 0) {
            return 0;
         }

         var10000 = 6 + var1 * var1;
      }

      float var4 = (float)var10000 / 3.0F;
      var10000 = this.field_4820;
      if(var3 != null) {
         if(this.field_4820 == 0) {
            return class_1715.method_9559(var4 * 0.75F);
         }

         var10000 = this.field_4820;
      }

      byte var10001 = 1;
      if(var3 != null) {
         label72: {
            if(var10000 == 1) {
               var10000 = var2.method_9351();
               if(var3 == null) {
                  break label72;
               }

               if(var10000 != 0) {
                  return class_1715.method_9559(var4 * 1.25F);
               }
            }

            var10000 = this.field_4820;
         }

         var10001 = 2;
      }

      if(var3 != null) {
         if(var10000 == var10001 && var2 == class_1691.field_8837) {
            return class_1715.method_9559(var4 * 2.5F);
         }

         var10000 = this.field_4820;
         var10001 = 3;
      }

      if(var3 != null) {
         label59: {
            if(var10000 == var10001) {
               var10000 = var2.method_9337();
               if(var3 == null) {
                  break label59;
               }

               if(var10000 != 0) {
                  return class_1715.method_9559(var4 * 1.5F);
               }
            }

            var10000 = this.field_4820;
         }

         if(var3 == null) {
            return var10000;
         }

         var10001 = 4;
      }

      if(var10000 == var10001) {
         var10000 = var2.method_9335();
         if(var3 == null) {
            return var10000;
         }

         if(var10000 != 0) {
            return class_1715.method_9559(var4 * 1.5F);
         }
      }

      var10000 = 0;
      return var10000;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_5489() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_4821;
      return var10000.append("enchantment.protect.").append(field_4816[this.field_4820]).toString();
   }

   // $FF: renamed from: b (cH) boolean
   public boolean method_5487(class_940 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1 instanceof class_944;
      if(var2 != null) {
         if(var10000) {
            class_944 var3 = (class_944)var1;
            int var4 = var3.field_4820;
            int var10001 = this.field_4820;
            if(var2 != null) {
               if(var3.field_4820 == this.field_4820) {
                  return false;
               }

               var4 = this.field_4820;
               if(var2 == null) {
                  return (boolean)var4;
               }

               var10001 = 2;
            }

            if(var4 != var10001) {
               label26: {
                  var4 = var3.field_4820;
                  if(var2 != null) {
                     if(var3.field_4820 == 2) {
                        break label26;
                     }

                     var4 = 0;
                  }

                  return (boolean)var4;
               }
            }

            var4 = 1;
            return (boolean)var4;
         }

         var10000 = super.method_5487(var1);
      }

      return var10000;
   }

   // $FF: renamed from: b (sa, int) int
   public static int method_5502(class_689 var0, int var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = class_980.method_5643(class_940.field_4785.field_4808, var0.method_3934());
      String[] var2 = var10000;
      int var4 = var3;
      if(var2 != null) {
         if(var3 > 0) {
            var1 -= class_1715.method_9559((float)var1 * (float)var3 * 0.15F);
         }

         var4 = var1;
      }

      return var4;
   }

   // $FF: renamed from: b (sa, double) double
   public static double method_5503(class_689 var0, double var1) {
      int var3 = class_980.method_5643(class_940.field_4787.field_4808, var0.method_3934());
      if(var3 > 0) {
         var1 -= (double)class_1715.method_9561(var1 * (double)((float)var3 * 0.15F));
      }

      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5494() {
      // $FF: Couldn't be decompiled
   }
}

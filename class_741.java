
// $FF: renamed from: wb
public class class_741 extends class_716 {

   // $FF: renamed from: aJ awt
   private awt field_3284;
   // $FF: renamed from: aK int
   private int field_3285;
   // $FF: renamed from: eb java.lang.String
   private static final String field_3286 = "splash";


   // $FF: renamed from: <init> (ahb, double, double, double, awt) void
   public void method_4132(ahb var1, double var2, double var4, double var6, awt var8) {
      label15: {
         super.method_4093(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
         String[] var9 = class_752.method_4253();
         this.field_2997 = this.field_2998 = this.field_2999 = 0.0D;
         if(var9 != null) {
            if(var8 == awt.field_4177) {
               this.field_3221 = 0.0F;
               this.field_3222 = 0.0F;
               this.field_3223 = 1.0F;
               if(var9 != null) {
                  break label15;
               }
            }

            this.field_3221 = 1.0F;
            this.field_3222 = 0.0F;
         }

         this.field_3223 = 0.0F;
      }

      this.method_4104(113);
      this.method_3852(0.01F, 0.01F);
      this.field_3220 = 0.06F;
      this.field_3284 = var8;
      this.field_3285 = 40;
      this.field_3218 = (int)(64.0D / (Math.random() * 0.8D + 0.2D));
      this.field_2997 = this.field_2998 = this.field_2999 = 0.0D;
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      String[] var2 = class_752.method_4253();
      class_741 var10000 = this;
      if(var2 != null) {
         if(this.field_3284 != awt.field_4177) {
            return 257;
         }

         var10000 = this;
      }

      return var10000.method_3883(var1);
   }

   // $FF: renamed from: d (float) float
   public float method_3884(float var1) {
      String[] var2 = class_752.method_4253();
      class_741 var10000 = this;
      if(var2 != null) {
         if(this.field_3284 != awt.field_4177) {
            return 1.0F;
         }

         var10000 = this;
      }

      return var10000.method_3884(var1);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1;
      class_741 var5;
      label81: {
         String[] var10000 = class_752.method_4253();
         this.field_2991 = this.field_2994;
         this.field_2992 = this.field_2995;
         var1 = var10000;
         this.field_2993 = this.field_2996;
         var5 = this;
         if(var1 != null) {
            if(this.field_3284 == awt.field_4177) {
               this.field_3221 = 0.2F;
               this.field_3222 = 0.3F;
               this.field_3223 = 1.0F;
               if(var1 != null) {
                  break label81;
               }
            }

            this.field_3221 = 1.0F;
            this.field_3222 = 16.0F / (float)(40 - this.field_3285 + 16);
            var5 = this;
         }

         var5.field_3223 = 4.0F / (float)(40 - this.field_3285 + 8);
      }

      label74: {
         this.field_2998 -= (double)this.field_3220;
         var5 = this;
         int var10001 = this.field_3285;
         if(var1 != null) {
            if(this.field_3285-- > 0) {
               this.field_2997 *= 0.02D;
               this.field_2998 *= 0.02D;
               this.field_2999 *= 0.02D;
               this.method_4104(113);
               if(var1 != null) {
                  break label74;
               }
            }

            var5 = this;
            var10001 = 112;
         }

         var5.method_4104(var10001);
      }

      int var6;
      label84: {
         this.method_3864(this.field_2997, this.field_2998, this.field_2999);
         this.field_2997 *= 0.9800000190734863D;
         this.field_2998 *= 0.9800000190734863D;
         this.field_2999 *= 0.9800000190734863D;
         var6 = this.field_3218--;
         if(var1 != null) {
            if(var6 <= 0) {
               this.method_3851();
            }

            var5 = this;
            if(var1 == null) {
               break label84;
            }

            var6 = this.field_3005;
         }

         if(var6 != 0) {
            label58: {
               var5 = this;
               if(var1 != null) {
                  if(this.field_3284 == awt.field_4177) {
                     this.method_3851();
                     this.field_2990.method_2087("splash", this.field_2994, this.field_2995, this.field_2996, 0.0D, 0.0D, 0.0D);
                     if(var1 != null) {
                        break label58;
                     }
                  }

                  var5 = this;
               }

               var5.method_4104(114);
            }

            this.field_2997 *= 0.699999988079071D;
            this.field_2999 *= 0.699999988079071D;
         }

         var5 = this;
      }

      awt var2 = var5.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996)).method_2424();
      var6 = var2.method_5062();
      if(var1 != null) {
         label49: {
            if(var6 == 0) {
               var6 = var2.method_5063();
               if(var1 == null) {
                  break label49;
               }

               if(var6 == 0) {
                  return;
               }
            }

            var6 = class_1715.method_9561(this.field_2995) + 1;
         }
      }

      double var3 = (double)((float)var6 - class_366.method_2552(this.field_2990.method_33(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996))));
      var5 = this;
      if(var1 != null) {
         if(this.field_2995 >= var3) {
            return;
         }

         var5 = this;
      }

      var5.method_3851();
   }

   // $FF: renamed from: <clinit> () void
   static void method_4107() {
      boolean var10000 = true;
      char[] var10003 = "ÌR¤".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_3286 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 223;
            break;
         case 1:
            var10009 = 196;
            break;
         case 2:
            var10009 = 143;
            break;
         case 3:
            var10009 = 192;
            break;
         case 4:
            var10009 = 14;
            break;
         case 5:
            var10009 = 227;
            break;
         default:
            var10009 = 15;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

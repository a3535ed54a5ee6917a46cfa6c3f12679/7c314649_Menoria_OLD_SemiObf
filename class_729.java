
// $FF: renamed from: wn
public class class_729 extends class_716 {

   // $FF: renamed from: aJ float
   float field_3245;
   // $FF: renamed from: aK java.lang.String
   private static final String field_3246 = "CL_00000913";


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.method_4117(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double, float) void
   public void method_4117(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super.method_4093(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_2997 *= 0.009999999776482582D;
      this.field_2998 *= 0.009999999776482582D;
      this.field_2999 *= 0.009999999776482582D;
      this.field_2998 += 0.2D;
      this.field_3221 = class_1715.method_9555(((float)var8 + 0.0F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.field_3222 = class_1715.method_9555(((float)var8 + 0.33333334F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.field_3223 = class_1715.method_9555(((float)var8 + 0.6666667F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.field_3219 *= 0.75F;
      this.field_3219 *= var14;
      this.field_3245 = this.field_3219;
      this.field_3218 = 6;
      this.field_3026 = false;
      this.method_4104(64);
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var9;
      label23: {
         float var10;
         label25: {
            var9 = ((float)this.field_3217 + var2) / (float)this.field_3218 * 32.0F;
            String[] var8 = class_752.method_4253();
            float var11;
            int var10000 = (var11 = var9 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
            if(var8 != null) {
               if(var10000 < 0) {
                  var9 = 0.0F;
               }

               var10 = var9;
               if(var8 == null) {
                  break label25;
               }

               float var12;
               var10000 = (var12 = var9 - 1.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
            }

            if(var10000 <= 0) {
               break label23;
            }

            var10 = 1.0F;
         }

         var9 = var10;
      }

      this.field_3219 = this.field_3245 * var9;
      super.method_4101(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      this.field_2991 = this.field_2994;
      String[] var10000 = class_752.method_4253();
      this.field_2992 = this.field_2995;
      String[] var1 = var10000;
      this.field_2993 = this.field_2996;
      int var2 = this.field_3217++;
      if(var1 != null) {
         if(var2 >= this.field_3218) {
            this.method_3851();
         }

         this.method_3864(this.field_2997, this.field_2998, this.field_2999);
         double var4;
         var2 = (var4 = this.field_2995 - this.field_2992) == 0.0D?0:(var4 < 0.0D?-1:1);
      }

      class_729 var3;
      label34: {
         if(var1 != null) {
            if(var2 == 0) {
               this.field_2997 *= 1.1D;
               this.field_2999 *= 1.1D;
            }

            this.field_2997 *= 0.6600000262260437D;
            this.field_2998 *= 0.6600000262260437D;
            this.field_2999 *= 0.6600000262260437D;
            var3 = this;
            if(var1 == null) {
               break label34;
            }

            var2 = this.field_3005;
         }

         if(var2 == 0) {
            return;
         }

         this.field_2997 *= 0.699999988079071D;
         var3 = this;
      }

      var3.field_2999 *= 0.699999988079071D;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4107() {
      boolean var10000 = true;
      char[] var10003 = "/;X¥2½\\N6¦".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_3246 = (new String((char[])var4)).intern();
            String var2 = field_3246;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 132;
            break;
         case 1:
            var10009 = 159;
            break;
         case 2:
            var10009 = 239;
            break;
         case 3:
            var10009 = 125;
            break;
         case 4:
            var10009 = 201;
            break;
         case 5:
            var10009 = 234;
            break;
         default:
            var10009 = 101;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}


// $FF: renamed from: wm
public class class_730 extends class_716 {

   // $FF: renamed from: aJ float
   private float field_3247;
   // $FF: renamed from: eb java.lang.String
   private static final String field_3248 = "smoke";


   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4092(ahb var1, double var2, double var4, double var6) {
      super.method_4093(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_2997 *= 0.800000011920929D;
      this.field_2998 *= 0.800000011920929D;
      this.field_2999 *= 0.800000011920929D;
      this.field_2998 = (double)(this.field_3028.nextFloat() * 0.4F + 0.05F);
      this.field_3221 = this.field_3222 = this.field_3223 = 1.0F;
      this.field_3219 *= this.field_3028.nextFloat() * 2.0F + 0.2F;
      this.field_3247 = this.field_3219;
      this.field_3218 = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
      this.field_3026 = false;
      this.method_4104(49);
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      String[] var10000 = class_752.method_4253();
      float var3 = ((float)this.field_3217 + var1) / (float)this.field_3218;
      String[] var2 = var10000;
      float var8;
      int var7 = (var8 = var3 - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
      if(var2 != null) {
         if(var7 < 0) {
            var3 = 0.0F;
         }

         float var9;
         var7 = (var9 = var3 - 1.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
      }

      if(var2 != null) {
         if(var7 > 0) {
            var3 = 1.0F;
         }

         var7 = super.method_3883(var1);
      }

      int var4 = var7;
      short var5 = 240;
      int var6 = var4 >> 16 & 255;
      return var5 | var6 << 16;
   }

   // $FF: renamed from: d (float) float
   public float method_3884(float var1) {
      return 1.0F;
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.field_3217 + var2) / (float)this.field_3218;
      this.field_3219 = this.field_3247 * (1.0F - var8 * var8);
      super.method_4101(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      this.field_2991 = this.field_2994;
      this.field_2992 = this.field_2995;
      this.field_2993 = this.field_2996;
      String[] var1 = var10000;
      int var3 = this.field_3217++;
      if(var1 != null) {
         if(var3 >= this.field_3218) {
            this.method_3851();
         }

         var3 = this.field_3217;
      }

      class_730 var4;
      label34: {
         float var2 = (float)var3 / (float)this.field_3218;
         float var5;
         var3 = (var5 = this.field_3028.nextFloat() - var2) == 0.0F?0:(var5 < 0.0F?-1:1);
         if(var1 != null) {
            if(var3 > 0) {
               this.field_2990.method_2087("smoke", this.field_2994, this.field_2995, this.field_2996, this.field_2997, this.field_2998, this.field_2999);
            }

            this.field_2998 -= 0.03D;
            this.method_3864(this.field_2997, this.field_2998, this.field_2999);
            this.field_2997 *= 0.9990000128746033D;
            this.field_2998 *= 0.9990000128746033D;
            this.field_2999 *= 0.9990000128746033D;
            var4 = this;
            if(var1 == null) {
               break label34;
            }

            var3 = this.field_3005;
         }

         if(var3 == 0) {
            return;
         }

         this.field_2997 *= 0.699999988079071D;
         var4 = this;
      }

      var4.field_2999 *= 0.699999988079071D;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4107() {
      boolean var10000 = true;
      char[] var10003 = "Ù\bTá".toCharArray();
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
            field_3248 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 108;
            break;
         case 1:
            var10009 = 163;
            break;
         case 2:
            var10009 = 253;
            break;
         case 3:
            var10009 = 61;
            break;
         case 4:
            var10009 = 66;
            break;
         case 5:
            var10009 = 162;
            break;
         default:
            var10009 = 234;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

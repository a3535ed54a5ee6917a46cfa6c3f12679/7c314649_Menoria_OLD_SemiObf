
// $FF: renamed from: v7
public class class_716 extends class_689 {

   // $FF: renamed from: at int
   protected int field_3213;
   // $FF: renamed from: au int
   protected int field_3214;
   // $FF: renamed from: av float
   protected float field_3215;
   // $FF: renamed from: aw float
   protected float field_3216;
   // $FF: renamed from: ax int
   protected int field_3217;
   // $FF: renamed from: ay int
   protected int field_3218;
   // $FF: renamed from: az float
   protected float field_3219;
   // $FF: renamed from: aA float
   protected float field_3220;
   // $FF: renamed from: aB float
   protected float field_3221;
   // $FF: renamed from: aC float
   protected float field_3222;
   // $FF: renamed from: aD float
   protected float field_3223;
   // $FF: renamed from: aE float
   protected float field_3224;
   // $FF: renamed from: aF vL
   protected IIcon field_3225;
   // $FF: renamed from: aG double
   public static double field_3226;
   // $FF: renamed from: aH double
   public static double field_3227;
   // $FF: renamed from: aI double
   public static double field_3228;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3229;


   // $FF: renamed from: <init> (ahb, double, double, double) void
   protected void method_4092(ahb var1, double var2, double var4, double var6) {
      super.method_3847(var1);
      this.field_3224 = 1.0F;
      this.method_3852(0.2F, 0.2F);
      this.field_3013 = this.field_3015 / 2.0F;
      this.method_3854(var2, var4, var6);
      this.field_3021 = var2;
      this.field_3022 = var4;
      this.field_3023 = var6;
      this.field_3221 = this.field_3222 = this.field_3223 = 1.0F;
      this.field_3215 = this.field_3028.nextFloat() * 3.0F;
      this.field_3216 = this.field_3028.nextFloat() * 3.0F;
      this.field_3219 = (this.field_3028.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.field_3218 = (int)(4.0F / (this.field_3028.nextFloat() * 0.9F + 0.1F));
      this.field_3217 = 0;
   }

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.method_4092(var1, var2, var4, var6);
      this.field_2997 = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.field_2998 = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.field_2999 = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      float var14 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
      float var15 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2998 * this.field_2998 + this.field_2999 * this.field_2999);
      this.field_2997 = this.field_2997 / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.field_2998 = this.field_2998 / (double)var15 * (double)var14 * 0.4000000059604645D + 0.10000000149011612D;
      this.field_2999 = this.field_2999 / (double)var15 * (double)var14 * 0.4000000059604645D;
   }

   // $FF: renamed from: f (float) v7
   public class_716 method_4094(float var1) {
      this.field_2997 *= (double)var1;
      this.field_2998 = (this.field_2998 - 0.10000000149011612D) * (double)var1 + 0.10000000149011612D;
      this.field_2999 *= (double)var1;
      return this;
   }

   // $FF: renamed from: g (float) v7
   public class_716 method_4095(float var1) {
      this.method_3852(0.2F * var1, 0.2F * var1);
      this.field_3219 *= var1;
      return this;
   }

   // $FF: renamed from: c (float, float, float) void
   public void method_4096(float var1, float var2, float var3) {
      this.field_3221 = var1;
      this.field_3222 = var2;
      this.field_3223 = var3;
   }

   // $FF: renamed from: h (float) void
   public void method_4097(float var1) {
      this.field_3224 = var1;
   }

   // $FF: renamed from: a () float
   public float method_4098() {
      return this.field_3221;
   }

   // $FF: renamed from: b () float
   public float method_4099() {
      return this.field_3222;
   }

   // $FF: renamed from: d () float
   public float method_4100() {
      return this.field_3223;
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {}

   // $FF: renamed from: h () void
   public void method_3856() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var9 = (float)this.field_3213 / 16.0F;
      String[] var10000 = class_752.method_4253();
      float var10 = var9 + 0.0624375F;
      float var11 = (float)this.field_3214 / 16.0F;
      float var12 = var11 + 0.0624375F;
      String[] var8 = var10000;
      float var13 = 0.1F * this.field_3219;

      class_716 var18;
      label21: {
         label20: {
            try {
               var18 = this;
               if(var8 == null) {
                  break label21;
               }

               if(this.field_3225 == null) {
                  break label20;
               }
            } catch (RuntimeException var17) {
               throw method_4106(var17);
            }

            var9 = this.field_3225.method_368();
            var10 = this.field_3225.method_369();
            var11 = this.field_3225.method_371();
            var12 = this.field_3225.method_372();
         }

         var18 = this;
      }

      float var14 = (float)(var18.field_2991 + (this.field_2994 - this.field_2991) * (double)var2 - field_3226);
      float var15 = (float)(this.field_2992 + (this.field_2995 - this.field_2992) * (double)var2 - field_3227);
      float var16 = (float)(this.field_2993 + (this.field_2996 - this.field_2993) * (double)var2 - field_3228);
      var1.setVisible7(this.field_3221, this.field_3222, this.field_3223, this.field_3224);
      var1.addVertexWithUV((double)(var14 - var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 - var5 * var13 - var7 * var13), (double)var10, (double)var12);
      var1.addVertexWithUV((double)(var14 - var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 - var5 * var13 + var7 * var13), (double)var10, (double)var11);
      var1.addVertexWithUV((double)(var14 + var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 + var5 * var13 + var7 * var13), (double)var9, (double)var11);
      var1.addVertexWithUV((double)(var14 + var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 + var5 * var13 - var7 * var13), (double)var9, (double)var12);
   }

   // $FF: renamed from: e () int
   public int method_4102() {
      return 0;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {}

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {}

   // $FF: renamed from: b (vL) void
   public void method_4103(IIcon param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int) void
   public void method_4104(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () void
   public void method_4105() {
      ++this.field_3213;
   }

   // $FF: renamed from: av () boolean
   public boolean method_3959() {
      return false;
   }

   public String toString() {
      StringBuilder var10000 = (new StringBuilder()).append(this.getClass().getSimpleName());
      String[] var1 = field_3229;
      return var10000.append(", Pos (").append(this.field_2994).append(",").append(this.field_2995).append(",").append(this.field_2996).append("), RGBA (").append(this.field_3221).append(",").append(this.field_3222).append(",").append(this.field_3223).append(",").append(this.field_3224).append("), Age ").append(this.field_3217).toString();
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_4106(RuntimeException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4107() {
      // $FF: Couldn't be decompiled
   }
}

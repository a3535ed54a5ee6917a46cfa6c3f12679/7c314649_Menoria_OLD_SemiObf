import java.util.Random;

// $FF: renamed from: on
public class class_811 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3802;
   // $FF: renamed from: h blm
   private blm field_3803;
   // $FF: renamed from: i java.util.Random
   private Random field_3804;
   // $FF: renamed from: j boolean
   public boolean field_3805;
   // $FF: renamed from: k float
   public float field_3806;
   // $FF: renamed from: l boolean
   public static boolean field_3807;
   // $FF: renamed from: m java.lang.String
   private static final String field_3808;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_3809;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      blm var10001 = new blm;
      var10001.method_7203();
      this.field_3803 = var10001;
      this.field_3804 = new Random();
      this.field_3805 = true;
      this.field_3790 = 0.15F;
      this.field_3791 = 0.75F;
   }

   // $FF: renamed from: b (xq, double, double, double, float, float) void
   public void method_4752(class_699 param1, double param2, double param4, double param6, float param8, float param9) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (xq) bqx
   protected bqx method_4753(class_699 var1) {
      return this.field_3788.field_7423.method_8117(var1.method_4030().method_3732());
   }

   // $FF: renamed from: b (xq, vL, int, float, float, float, float) void
   private void method_4754(class_699 param1, class_73 param2, int param3, float param4, float param5, float param6, float param7) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (kU, bqf, add, int, int) void
   public void method_4755(FontRenderer param1, bqf param2, add param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (kU, bqf, add, int, int) void
   public void method_4756(FontRenderer param1, bqf param2, add param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, int, int) void
   private void method_4757(int var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;

      while(var7 < 2) {
         buu.method_9081(772, 1, 0, 0);
         float var8 = 0.00390625F;
         float var9 = 0.00390625F;
         float var10 = (float)(bao.method_5283() % (long)(3000 + var7 * 1873)) / (3000.0F + (float)(var7 * 1873)) * 256.0F;
         float var11 = 0.0F;
         bmh var12 = bmh.instance;
         float var13 = 4.0F;

         label28: {
            label27: {
               try {
                  if(var6 == null) {
                     break label28;
                  }

                  if(var7 != 1) {
                     break label27;
                  }
               } catch (class_643 var14) {
                  throw method_4762(var14);
               }

               var13 = -1.0F;
            }

            var12.setVisible2();
            var12.addVertexWithUV((double)(var2 + 0), (double)(var3 + var5), (double)this.field_3806, (double)((var10 + (float)var5 * var13) * var8), (double)((var11 + (float)var5) * var9));
            var12.addVertexWithUV((double)(var2 + var4), (double)(var3 + var5), (double)this.field_3806, (double)((var10 + (float)var4 + (float)var5 * var13) * var8), (double)((var11 + (float)var5) * var9));
            var12.addVertexWithUV((double)(var2 + var4), (double)(var3 + 0), (double)this.field_3806, (double)((var10 + (float)var4) * var8), (double)((var11 + 0.0F) * var9));
            var12.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), (double)this.field_3806, (double)((var10 + 0.0F) * var8), (double)((var11 + 0.0F) * var9));
            var12.getVisible8();
         }

         ++var7;
         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (kU, bqf, add, int, int) void
   public void method_4758(FontRenderer var1, bqf var2, add var3, int var4, int var5) {
      this.method_4759(var1, var2, var3, var4, var5, (String)null);
   }

   // $FF: renamed from: b (kU, bqf, add, int, int, java.lang.String) void
   public void method_4759(FontRenderer param1, bqf param2, add param3, int param4, int param5, String param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bmh, int, int, int, int, int) void
   private void method_4760(bmh var1, int var2, int var3, int var4, int var5, int var6) {
      var1.setVisible2();
      var1.method_7463(var6);
      var1.method_7462((double)(var2 + 0), (double)(var3 + 0), 0.0D);
      var1.method_7462((double)(var2 + 0), (double)(var3 + var5), 0.0D);
      var1.method_7462((double)(var2 + var4), (double)(var3 + var5), 0.0D);
      var1.method_7462((double)(var2 + var4), (double)(var3 + 0), 0.0D);
      var1.getVisible8();
   }

   // $FF: renamed from: b (int, int, vL, int, int) void
   public void method_4761(int var1, int var2, class_73 var3, int var4, int var5) {
      bmh var6 = bmh.instance;
      var6.setVisible2();
      var6.addVertexWithUV((double)(var1 + 0), (double)(var2 + var5), (double)this.field_3806, (double)var3.method_368(), (double)var3.method_372());
      var6.addVertexWithUV((double)(var1 + var4), (double)(var2 + var5), (double)this.field_3806, (double)var3.method_369(), (double)var3.method_372());
      var6.addVertexWithUV((double)(var1 + var4), (double)(var2 + 0), (double)this.field_3806, (double)var3.method_369(), (double)var3.method_371());
      var6.addVertexWithUV((double)(var1 + 0), (double)(var2 + 0), (double)this.field_3806, (double)var3.method_368(), (double)var3.method_371());
      var6.getVisible8();
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4753((class_699)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4752((class_699)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_4762(Throwable var0) {
      return var0;
   }
}

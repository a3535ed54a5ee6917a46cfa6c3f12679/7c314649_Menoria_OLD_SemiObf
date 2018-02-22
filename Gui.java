import org.lwjgl.opengl.GL11;

// $FF: renamed from: kX
public class Gui {

   // $FF: renamed from: c bqx
   public static final bqx field_369;
   // $FF: renamed from: d bqx
   public static final bqx field_370;
   // $FF: renamed from: e bqx
   public static final bqx field_371;
   // $FF: renamed from: f float
   protected float field_372;
   // $FF: renamed from: g java.lang.String
   private static final String field_373;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super();
   }

   // $FF: renamed from: b (int, int, int, int) void
   protected void method_652(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var2;
      int var10001 = var1;
      if(var5 != null) {
         if(var2 < var1) {
            int var6 = var1;
            var1 = var2;
            var2 = var6;
         }

         var10000 = var1;
         var10001 = var3;
      }

      drawRect(var10000, var10001, var2 + 1, var3 + 1, var4);
   }

   // $FF: renamed from: c (int, int, int, int) void
   protected void method_653(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var3;
      int var10001 = var2;
      if(var5 != null) {
         if(var3 < var2) {
            int var6 = var2;
            var2 = var3;
            var3 = var6;
         }

         var10000 = var1;
         var10001 = var2 + 1;
      }

      drawRect(var10000, var10001, var1 + 1, var3, var4);
   }

   // $FF: renamed from: b (int, int, int, int, int) void
   public static void drawRect(int var0, int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var0;
      int var10001 = var2;
      int var6;
      if(var5 != null) {
         if(var0 < var2) {
            var6 = var0;
            var0 = var2;
            var2 = var6;
         }

         var10000 = var1;
         var10001 = var3;
      }

      if(var5 != null) {
         if(var10000 < var10001) {
            var6 = var1;
            var1 = var3;
            var3 = var6;
         }

         var10000 = var4 >> 24;
         var10001 = 255;
      }

      float var7 = (float)(var10000 & var10001) / 255.0F;
      float var8 = (float)(var4 >> 16 & 255) / 255.0F;
      float var9 = (float)(var4 >> 8 & 255) / 255.0F;
      float var10 = (float)(var4 & 255) / 255.0F;
      bmh var11 = bmh.instance;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      buu.method_9081(770, 771, 1, 0);
      GL11.glColor4f(var8, var9, var10, var7);
      var11.setVisible2();
      var11.method_7462((double)var0, (double)var3, 0.0D);
      var11.method_7462((double)var2, (double)var3, 0.0D);
      var11.method_7462((double)var2, (double)var1, 0.0D);
      var11.method_7462((double)var0, (double)var1, 0.0D);
      var11.getVisible8();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   // $FF: renamed from: b (int, int, int, int, int, int) void
   protected void drawGradientRect(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 255) / 255.0F;
      float var8 = (float)(var5 >> 16 & 255) / 255.0F;
      float var9 = (float)(var5 >> 8 & 255) / 255.0F;
      float var10 = (float)(var5 & 255) / 255.0F;
      float var11 = (float)(var6 >> 24 & 255) / 255.0F;
      float var12 = (float)(var6 >> 16 & 255) / 255.0F;
      float var13 = (float)(var6 >> 8 & 255) / 255.0F;
      float var14 = (float)(var6 & 255) / 255.0F;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      buu.method_9081(770, 771, 1, 0);
      GL11.glShadeModel(7425);
      bmh var15 = bmh.instance;
      var15.setVisible2();
      var15.setVisible7(var8, var9, var10, var7);
      var15.method_7462((double)var3, (double)var2, (double)this.field_372);
      var15.method_7462((double)var1, (double)var2, (double)this.field_372);
      var15.setVisible7(var12, var13, var14, var11);
      var15.method_7462((double)var1, (double)var4, (double)this.field_372);
      var15.method_7462((double)var3, (double)var4, (double)this.field_372);
      var15.getVisible8();
      GL11.glShadeModel(7424);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glEnable(3553);
   }

   // $FF: renamed from: b (kU, java.lang.String, int, int, int) void
   public void drawCenteredString(FontRenderer var1, String var2, int var3, int var4, int var5) {
      var1.drawStringWithShadow(var2, var3 - var1.getCharWidth(var2) / 2, var4, var5);
   }

   // $FF: renamed from: c (kU, java.lang.String, int, int, int) void
   public void method_657(FontRenderer var1, String var2, int var3, int var4, int var5) {
      var1.drawStringWithShadow(var2, var3, var4, var5);
   }

   // $FF: renamed from: c (int, int, int, int, int, int) void
   public void method_658(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      bmh var9 = bmh.instance;
      var9.setVisible2();
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + var6), (double)this.field_372, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.addVertexWithUV((double)(var1 + var5), (double)(var2 + var6), (double)this.field_372, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.addVertexWithUV((double)(var1 + var5), (double)(var2 + 0), (double)this.field_372, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + 0), (double)this.field_372, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.getVisible8();
   }

   // $FF: renamed from: b (int, int, vL, int, int) void
   public void method_659(int var1, int var2, IIcon var3, int var4, int var5) {
      bmh var6 = bmh.instance;
      var6.setVisible2();
      var6.addVertexWithUV((double)(var1 + 0), (double)(var2 + var5), (double)this.field_372, (double)var3.method_368(), (double)var3.method_372());
      var6.addVertexWithUV((double)(var1 + var4), (double)(var2 + var5), (double)this.field_372, (double)var3.method_369(), (double)var3.method_372());
      var6.addVertexWithUV((double)(var1 + var4), (double)(var2 + 0), (double)this.field_372, (double)var3.method_369(), (double)var3.method_371());
      var6.addVertexWithUV((double)(var1 + 0), (double)(var2 + 0), (double)this.field_372, (double)var3.method_368(), (double)var3.method_371());
      var6.getVisible8();
   }

   // $FF: renamed from: b (int, int, float, float, int, int, float, float) void
   public static void method_660(int var0, int var1, float var2, float var3, int var4, int var5, float var6, float var7) {
      float var8 = 1.0F / var6;
      float var9 = 1.0F / var7;
      bmh var10 = bmh.instance;
      var10.setVisible2();
      var10.addVertexWithUV((double)var0, (double)(var1 + var5), 0.0D, (double)(var2 * var8), (double)((var3 + (float)var5) * var9));
      var10.addVertexWithUV((double)(var0 + var4), (double)(var1 + var5), 0.0D, (double)((var2 + (float)var4) * var8), (double)((var3 + (float)var5) * var9));
      var10.addVertexWithUV((double)(var0 + var4), (double)var1, 0.0D, (double)((var2 + (float)var4) * var8), (double)(var3 * var9));
      var10.addVertexWithUV((double)var0, (double)var1, 0.0D, (double)(var2 * var8), (double)(var3 * var9));
      var10.getVisible8();
   }

   // $FF: renamed from: b (int, int, float, float, int, int, int, int, float, float) void
   public static void method_661(int var0, int var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9) {
      float var10 = 1.0F / var8;
      float var11 = 1.0F / var9;
      bmh var12 = bmh.instance;
      var12.setVisible2();
      var12.addVertexWithUV((double)var0, (double)(var1 + var7), 0.0D, (double)(var2 * var10), (double)((var3 + (float)var5) * var11));
      var12.addVertexWithUV((double)(var0 + var6), (double)(var1 + var7), 0.0D, (double)((var2 + (float)var4) * var10), (double)((var3 + (float)var5) * var11));
      var12.addVertexWithUV((double)(var0 + var6), (double)var1, 0.0D, (double)((var2 + (float)var4) * var10), (double)(var3 * var11));
      var12.addVertexWithUV((double)var0, (double)var1, 0.0D, (double)(var2 * var10), (double)(var3 * var11));
      var12.getVisible8();
   }

   // $FF: renamed from: <clinit> () void
   static void method_164() {
      // $FF: Couldn't be decompiled
   }
}

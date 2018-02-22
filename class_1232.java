import org.lwjgl.opengl.GL11;

// $FF: renamed from: m7
public class class_1232 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6392;
   // $FF: renamed from: c bix
   public bix field_6393;
   // $FF: renamed from: d bix
   public bix field_6394;
   // $FF: renamed from: e bix
   public bix field_6395;
   // $FF: renamed from: f bix
   public bix field_6396;
   // $FF: renamed from: g bix
   public bix field_6397;
   // $FF: renamed from: h float
   protected float field_6398;
   // $FF: renamed from: i float
   protected float field_6399;
   // $FF: renamed from: j java.lang.String
   private static final String field_6400 = "CL_00000851";


   // $FF: renamed from: <init> (int, float) void
   public void drawGradientRect0(int var1, float var2) {
      super.method_6510();
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6392 = var10001;
      this.field_6398 = 8.0F;
      this.field_6399 = 4.0F;
      this.field_6392.method_6644(-4.0F, -4.0F, -8.0F, 8, 8, 8, var2);
      this.field_6392.method_6645(0.0F, (float)(18 - var1), -6.0F);
      var10001 = new bix;
      var10001.method_6639(this, 28, 8);
      this.field_6393 = var10001;
      this.field_6393.method_6644(-5.0F, -10.0F, -7.0F, 10, 16, 8, var2);
      this.field_6393.method_6645(0.0F, (float)(17 - var1), 2.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6394 = var10001;
      this.field_6394.method_6644(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_6394.method_6645(-3.0F, (float)(24 - var1), 7.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6395 = var10001;
      this.field_6395.method_6644(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_6395.method_6645(3.0F, (float)(24 - var1), 7.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6396 = var10001;
      this.field_6396.method_6644(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_6396.method_6645(-3.0F, (float)(24 - var1), -5.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6397 = var10001;
      this.field_6397.method_6644(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_6397.method_6645(3.0F, (float)(24 - var1), -5.0F);
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      String[] var8 = class_752.method_4253();
      class_1232 var10000 = this;
      if(var8 != null) {
         if(this.field_6262) {
            float var9 = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, this.field_6398 * var7, this.field_6399 * var7);
            this.field_6392.method_6646(var7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var9, 1.0F / var9, 1.0F / var9);
            GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
            this.field_6393.method_6646(var7);
            this.field_6394.method_6646(var7);
            this.field_6395.method_6646(var7);
            this.field_6396.method_6646(var7);
            this.field_6397.method_6646(var7);
            GL11.glPopMatrix();
            if(var8 != null) {
               return;
            }
         }

         this.field_6392.method_6646(var7);
         this.field_6393.method_6646(var7);
         this.field_6394.method_6646(var7);
         this.field_6395.method_6646(var7);
         this.field_6396.method_6646(var7);
         var10000 = this;
      }

      var10000.field_6397.method_6646(var7);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      float var8 = 57.295776F;
      this.field_6392.field_6548 = var5 / 57.295776F;
      this.field_6392.field_6549 = var4 / 57.295776F;
      this.field_6393.field_6548 = 1.5707964F;
      this.field_6394.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 1.4F * var2;
      this.field_6395.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_6396.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_6397.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 1.4F * var2;
   }

   // $FF: renamed from: <clinit> () void
   static void drawGradientRect1() {
      boolean var10000 = true;
      char[] var10003 = "Ûæ²¨öbe±ç".toCharArray();
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
            field_6400 = (new String((char[])var4)).intern();
            String var2 = field_6400;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 191;
            break;
         case 1:
            var10009 = 176;
            break;
         case 2:
            var10009 = 105;
            break;
         case 3:
            var10009 = 59;
            break;
         case 4:
            var10009 = 111;
            break;
         case 5:
            var10009 = 117;
            break;
         default:
            var10009 = 43;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

import org.lwjgl.opengl.GL11;

// $FF: renamed from: mU
public class class_1225 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6360;
   // $FF: renamed from: c bix
   public bix field_6361;
   // $FF: renamed from: d bix
   public bix field_6362;
   // $FF: renamed from: e bix
   public bix field_6363;
   // $FF: renamed from: f bix
   public bix field_6364;
   // $FF: renamed from: g bix
   public bix field_6365;
   // $FF: renamed from: h bix
   public bix field_6366;
   // $FF: renamed from: i bix
   public bix field_6367;
   // $FF: renamed from: j java.lang.String
   private static final String field_6368 = "CL_00000835";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      byte var1 = 16;
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6360 = var10001;
      this.field_6360.method_6644(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.field_6360.method_6645(0.0F, (float)(-1 + var1), -4.0F);
      var10001 = new bix;
      var10001.method_6639(this, 14, 0);
      this.field_6366 = var10001;
      this.field_6366.method_6644(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.field_6366.method_6645(0.0F, (float)(-1 + var1), -4.0F);
      var10001 = new bix;
      var10001.method_6639(this, 14, 4);
      this.field_6367 = var10001;
      this.field_6367.method_6644(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this.field_6367.method_6645(0.0F, (float)(-1 + var1), -4.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 9);
      this.field_6361 = var10001;
      this.field_6361.method_6644(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.field_6361.method_6645(0.0F, (float)var1, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 26, 0);
      this.field_6362 = var10001;
      this.field_6362.method_6643(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.field_6362.method_6645(-2.0F, (float)(3 + var1), 1.0F);
      var10001 = new bix;
      var10001.method_6639(this, 26, 0);
      this.field_6363 = var10001;
      this.field_6363.method_6643(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.field_6363.method_6645(1.0F, (float)(3 + var1), 1.0F);
      var10001 = new bix;
      var10001.method_6639(this, 24, 13);
      this.field_6364 = var10001;
      this.field_6364.method_6643(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.field_6364.method_6645(-4.0F, (float)(-3 + var1), 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 24, 13);
      this.field_6365 = var10001;
      this.field_6365.method_6643(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.field_6365.method_6645(4.0F, (float)(-3 + var1), 0.0F);
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String[] var10000 = class_752.method_4253();
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      String[] var8 = var10000;
      class_1225 var10 = this;
      if(var8 != null) {
         if(this.field_6262) {
            float var9 = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 5.0F * var7, 2.0F * var7);
            this.field_6360.method_6646(var7);
            this.field_6366.method_6646(var7);
            this.field_6367.method_6646(var7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var9, 1.0F / var9, 1.0F / var9);
            GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
            this.field_6361.method_6646(var7);
            this.field_6362.method_6646(var7);
            this.field_6363.method_6646(var7);
            this.field_6364.method_6646(var7);
            this.field_6365.method_6646(var7);
            GL11.glPopMatrix();
            if(var8 != null) {
               return;
            }
         }

         this.field_6360.method_6646(var7);
         this.field_6366.method_6646(var7);
         this.field_6367.method_6646(var7);
         this.field_6361.method_6646(var7);
         this.field_6362.method_6646(var7);
         this.field_6363.method_6646(var7);
         this.field_6364.method_6646(var7);
         var10 = this;
      }

      var10.field_6365.method_6646(var7);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      this.field_6360.field_6548 = var5 / 57.295776F;
      this.field_6360.field_6549 = var4 / 57.295776F;
      this.field_6366.field_6548 = this.field_6360.field_6548;
      this.field_6366.field_6549 = this.field_6360.field_6549;
      this.field_6367.field_6548 = this.field_6360.field_6548;
      this.field_6367.field_6549 = this.field_6360.field_6549;
      this.field_6361.field_6548 = 1.5707964F;
      this.field_6362.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 1.4F * var2;
      this.field_6363.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_6364.field_6550 = var3;
      this.field_6365.field_6550 = -var3;
   }

   // $FF: renamed from: <clinit> () void
   static void drawRect2() {
      boolean var10000 = true;
      char[] var10003 = ":¡Ü?IÕâÙ".toCharArray();
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
            field_6368 = (new String((char[])var4)).intern();
            String var2 = field_6368;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 201;
            break;
         case 1:
            var10009 = 93;
            break;
         case 2:
            var10009 = 97;
            break;
         case 3:
            var10009 = 92;
            break;
         case 4:
            var10009 = 151;
            break;
         case 5:
            var10009 = 30;
            break;
         default:
            var10009 = 191;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

import org.lwjgl.opengl.GL11;

// $FF: renamed from: nm
public class class_1211 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6285;
   // $FF: renamed from: c bix
   public bix field_6286;
   // $FF: renamed from: d bix
   public bix field_6287;
   // $FF: renamed from: e bix
   public bix field_6288;
   // $FF: renamed from: f bix
   public bix field_6289;
   // $FF: renamed from: g bix
   public bix field_6290;
   // $FF: renamed from: h bix
   bix field_6291;
   // $FF: renamed from: i bix
   bix field_6292;
   // $FF: renamed from: j java.lang.String
   private static final String field_6293 = "CL_00000868";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      float var1 = 0.0F;
      float var2 = 13.5F;
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6285 = var10001;
      this.field_6285.method_6644(-3.0F, -3.0F, -2.0F, 6, 6, 4, var1);
      this.field_6285.method_6645(-1.0F, var2, -7.0F);
      var10001 = new bix;
      var10001.method_6639(this, 18, 14);
      this.field_6286 = var10001;
      this.field_6286.method_6644(-4.0F, -2.0F, -3.0F, 6, 9, 6, var1);
      this.field_6286.method_6645(0.0F, 14.0F, 2.0F);
      var10001 = new bix;
      var10001.method_6639(this, 21, 0);
      this.field_6292 = var10001;
      this.field_6292.method_6644(-4.0F, -3.0F, -3.0F, 8, 6, 7, var1);
      this.field_6292.method_6645(-1.0F, 14.0F, 2.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 18);
      this.field_6287 = var10001;
      this.field_6287.method_6644(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.field_6287.method_6645(-2.5F, 16.0F, 7.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 18);
      this.field_6288 = var10001;
      this.field_6288.method_6644(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.field_6288.method_6645(0.5F, 16.0F, 7.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 18);
      this.field_6289 = var10001;
      this.field_6289.method_6644(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.field_6289.method_6645(-2.5F, 16.0F, -4.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 18);
      this.field_6290 = var10001;
      this.field_6290.method_6644(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.field_6290.method_6645(0.5F, 16.0F, -4.0F);
      var10001 = new bix;
      var10001.method_6639(this, 9, 18);
      this.field_6291 = var10001;
      this.field_6291.method_6644(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.field_6291.method_6645(-1.0F, 12.0F, 8.0F);
      this.field_6285.method_6641(16, 14).method_6644(-3.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.field_6285.method_6641(16, 14).method_6644(1.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.field_6285.method_6641(0, 10).method_6644(-1.5F, 0.0F, -5.0F, 3, 3, 4, var1);
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.method_6511(var1, var2, var3, var4, var5, var6, var7);
      String[] var8 = class_752.method_4253();
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      class_1211 var10000 = this;
      if(var8 != null) {
         if(this.field_6262) {
            float var9 = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 5.0F * var7, 2.0F * var7);
            this.field_6285.method_6647(var7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var9, 1.0F / var9, 1.0F / var9);
            GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
            this.field_6286.method_6646(var7);
            this.field_6287.method_6646(var7);
            this.field_6288.method_6646(var7);
            this.field_6289.method_6646(var7);
            this.field_6290.method_6646(var7);
            this.field_6291.method_6647(var7);
            this.field_6292.method_6646(var7);
            GL11.glPopMatrix();
            if(var8 != null) {
               return;
            }
         }

         this.field_6285.method_6647(var7);
         this.field_6286.method_6646(var7);
         this.field_6287.method_6646(var7);
         this.field_6288.method_6646(var7);
         this.field_6289.method_6646(var7);
         this.field_6290.method_6646(var7);
         this.field_6291.method_6647(var7);
         var10000 = this;
      }

      var10000.field_6292.method_6646(var7);
   }

   // $FF: renamed from: a (sv, float, float, float) void
   public void method_6513(class_752 var1, float var2, float var3, float var4) {
      String[] var5;
      class_777 var6;
      label25: {
         label24: {
            String[] var10000 = class_752.method_4253();
            var6 = (class_777)var1;
            var5 = var10000;
            if(var5 != null) {
               if(!var6.method_4491()) {
                  break label24;
               }

               this.field_6291.field_6549 = 0.0F;
            }

            if(var5 != null) {
               break label25;
            }
         }

         this.field_6291.field_6549 = class_1715.method_9556(var2 * 0.6662F) * 1.4F * var3;
      }

      label16: {
         if(var6.method_4478()) {
            this.field_6292.method_6645(-1.0F, 16.0F, -3.0F);
            this.field_6292.field_6548 = 1.2566371F;
            this.field_6292.field_6549 = 0.0F;
            this.field_6286.method_6645(0.0F, 18.0F, 0.0F);
            this.field_6286.field_6548 = 0.7853982F;
            this.field_6291.method_6645(-1.0F, 21.0F, 6.0F);
            this.field_6287.method_6645(-2.5F, 22.0F, 2.0F);
            this.field_6287.field_6548 = 4.712389F;
            this.field_6288.method_6645(0.5F, 22.0F, 2.0F);
            this.field_6288.field_6548 = 4.712389F;
            this.field_6289.field_6548 = 5.811947F;
            this.field_6289.method_6645(-2.49F, 17.0F, -4.0F);
            this.field_6290.field_6548 = 5.811947F;
            this.field_6290.method_6645(0.51F, 17.0F, -4.0F);
            if(var5 != null) {
               break label16;
            }
         }

         this.field_6286.method_6645(0.0F, 14.0F, 2.0F);
         this.field_6286.field_6548 = 1.5707964F;
         this.field_6292.method_6645(-1.0F, 14.0F, -3.0F);
         this.field_6292.field_6548 = this.field_6286.field_6548;
         this.field_6291.method_6645(-1.0F, 12.0F, 8.0F);
         this.field_6287.method_6645(-2.5F, 16.0F, 7.0F);
         this.field_6288.method_6645(0.5F, 16.0F, 7.0F);
         this.field_6289.method_6645(-2.5F, 16.0F, -4.0F);
         this.field_6290.method_6645(0.5F, 16.0F, -4.0F);
         this.field_6287.field_6548 = class_1715.method_9556(var2 * 0.6662F) * 1.4F * var3;
         this.field_6288.field_6548 = class_1715.method_9556(var2 * 0.6662F + 3.1415927F) * 1.4F * var3;
         this.field_6289.field_6548 = class_1715.method_9556(var2 * 0.6662F + 3.1415927F) * 1.4F * var3;
         this.field_6290.field_6548 = class_1715.method_9556(var2 * 0.6662F) * 1.4F * var3;
      }

      this.field_6285.field_6550 = var6.method_4489(var4) + var6.method_4488(var4, 0.0F);
      this.field_6292.field_6550 = var6.method_4488(var4, -0.08F);
      this.field_6286.field_6550 = var6.method_4488(var4, -0.16F);
      this.field_6291.field_6550 = var6.method_4488(var4, -0.2F);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      super.method_6512(var1, var2, var3, var4, var5, var6, var7);
      this.field_6285.field_6548 = var5 / 57.295776F;
      this.field_6285.field_6549 = var4 / 57.295776F;
      this.field_6291.field_6548 = var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6522() {
      boolean var10000 = true;
      char[] var10003 = "¯oÎ4Ô÷Ü§<".toCharArray();
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
            field_6293 = (new String((char[])var4)).intern();
            String var2 = field_6293;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 120;
            break;
         case 1:
            var10009 = 183;
            break;
         case 2:
            var10009 = 5;
            break;
         case 3:
            var10009 = 144;
            break;
         case 4:
            var10009 = 112;
            break;
         case 5:
            var10009 = 188;
            break;
         default:
            var10009 = 83;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

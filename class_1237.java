import org.lwjgl.opengl.GL11;

// $FF: renamed from: m6
public class class_1237 extends bhr {

   // $FF: renamed from: b bix
   bix field_6403;
   // $FF: renamed from: c bix
   bix field_6404;
   // $FF: renamed from: d bix
   bix field_6405;
   // $FF: renamed from: e bix
   bix field_6406;
   // $FF: renamed from: f bix
   bix field_6407;
   // $FF: renamed from: g bix
   bix field_6408;
   // $FF: renamed from: h bix
   bix field_6409;
   // $FF: renamed from: i bix
   bix field_6410;
   // $FF: renamed from: j int
   int field_6411;
   // $FF: renamed from: k java.lang.String
   private static final String field_6412;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] field_6413;


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      this.field_6411 = 1;
      String[] var1 = field_6413;
      this.method_6515("head.main", 0, 0);
      this.method_6515("head.nose", 0, 24);
      this.method_6515("head.ear1", 0, 10);
      this.method_6515("head.ear2", 6, 10);
      bix var10001 = new bix;
      var10001.method_6637(this, "head");
      this.field_6409 = var10001;
      this.field_6409.method_6642("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
      this.field_6409.method_6642("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
      this.field_6409.method_6642("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
      this.field_6409.method_6642("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
      this.field_6409.method_6645(0.0F, 15.0F, -9.0F);
      var10001 = new bix;
      var10001.method_6639(this, 20, 0);
      this.field_6410 = var10001;
      this.field_6410.method_6644(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
      this.field_6410.method_6645(0.0F, 12.0F, -10.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 15);
      this.field_6407 = var10001;
      this.field_6407.method_6643(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.field_6407.field_6548 = 0.9F;
      this.field_6407.method_6645(0.0F, 15.0F, 8.0F);
      var10001 = new bix;
      var10001.method_6639(this, 4, 15);
      this.field_6408 = var10001;
      this.field_6408.method_6643(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.field_6408.method_6645(0.0F, 20.0F, 14.0F);
      var10001 = new bix;
      var10001.method_6639(this, 8, 13);
      this.field_6403 = var10001;
      this.field_6403.method_6643(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.field_6403.method_6645(1.1F, 18.0F, 5.0F);
      var10001 = new bix;
      var10001.method_6639(this, 8, 13);
      this.field_6404 = var10001;
      this.field_6404.method_6643(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.field_6404.method_6645(-1.1F, 18.0F, 5.0F);
      var10001 = new bix;
      var10001.method_6639(this, 40, 0);
      this.field_6405 = var10001;
      this.field_6405.method_6643(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.field_6405.method_6645(1.2F, 13.8F, -5.0F);
      var10001 = new bix;
      var10001.method_6639(this, 40, 0);
      this.field_6406 = var10001;
      this.field_6406.method_6643(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.field_6406.method_6645(-1.2F, 13.8F, -5.0F);
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      String[] var8 = class_752.method_4253();
      class_1237 var10000 = this;
      if(var8 != null) {
         if(this.field_6262) {
            float var9 = 2.0F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / var9, 1.5F / var9, 1.5F / var9);
            GL11.glTranslatef(0.0F, 10.0F * var7, 4.0F * var7);
            this.field_6409.method_6646(var7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var9, 1.0F / var9, 1.0F / var9);
            GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
            this.field_6410.method_6646(var7);
            this.field_6403.method_6646(var7);
            this.field_6404.method_6646(var7);
            this.field_6405.method_6646(var7);
            this.field_6406.method_6646(var7);
            this.field_6407.method_6646(var7);
            this.field_6408.method_6646(var7);
            GL11.glPopMatrix();
            if(var8 != null) {
               return;
            }
         }

         this.field_6409.method_6646(var7);
         this.field_6410.method_6646(var7);
         this.field_6407.method_6646(var7);
         this.field_6408.method_6646(var7);
         this.field_6403.method_6646(var7);
         this.field_6404.method_6646(var7);
         this.field_6405.method_6646(var7);
         var10000 = this;
      }

      var10000.field_6406.method_6646(var7);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      this.field_6409.field_6548 = var5 / 57.295776F;
      String[] var8 = class_752.method_4253();
      this.field_6409.field_6549 = var4 / 57.295776F;
      int var10000 = this.field_6411;
      byte var10001 = 3;
      if(var8 != null) {
         if(this.field_6411 == 3) {
            return;
         }

         this.field_6410.field_6548 = 1.5707964F;
         var10000 = this.field_6411;
         var10001 = 2;
      }

      class_1237 var9;
      label37: {
         if(var8 != null) {
            if(var10000 == var10001) {
               this.field_6403.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 1.0F * var2;
               this.field_6404.field_6548 = class_1715.method_9556(var1 * 0.6662F + 0.3F) * 1.0F * var2;
               this.field_6405.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F + 0.3F) * 1.0F * var2;
               this.field_6406.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
               this.field_6408.field_6548 = 1.7278761F + 0.31415927F * class_1715.method_9556(var1) * var2;
               if(var8 != null) {
                  return;
               }
            }

            this.field_6403.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 1.0F * var2;
            this.field_6404.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.field_6405.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.field_6406.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 1.0F * var2;
            var9 = this;
            if(var8 == null) {
               break label37;
            }

            var10000 = this.field_6411;
            var10001 = 1;
         }

         if(var10000 == var10001) {
            this.field_6408.field_6548 = 1.7278761F + 0.7853982F * class_1715.method_9556(var1) * var2;
            if(var8 != null) {
               return;
            }
         }

         var9 = this;
      }

      var9.field_6408.field_6548 = 1.7278761F + 0.47123894F * class_1715.method_9556(var1) * var2;
   }

   // $FF: renamed from: a (sv, float, float, float) void
   public void method_6513(class_752 var1, float var2, float var3, float var4) {
      class_778 var6 = (class_778)var1;
      this.field_6410.field_6546 = 12.0F;
      String[] var10000 = class_752.method_4253();
      this.field_6410.field_6547 = -10.0F;
      this.field_6409.field_6546 = 15.0F;
      this.field_6409.field_6547 = -9.0F;
      this.field_6407.field_6546 = 15.0F;
      String[] var5 = var10000;
      this.field_6407.field_6547 = 8.0F;
      this.field_6408.field_6546 = 20.0F;
      this.field_6408.field_6547 = 14.0F;
      this.field_6405.field_6546 = this.field_6406.field_6546 = 13.8F;
      this.field_6405.field_6547 = this.field_6406.field_6547 = -5.0F;
      this.field_6403.field_6546 = this.field_6404.field_6546 = 18.0F;
      this.field_6403.field_6547 = this.field_6404.field_6547 = 5.0F;
      this.field_6407.field_6548 = 0.9F;
      boolean var7 = var6.method_3938();
      if(var5 != null) {
         if(var7) {
            ++this.field_6410.field_6546;
            this.field_6409.field_6546 += 2.0F;
            ++this.field_6407.field_6546;
            this.field_6408.field_6546 += -4.0F;
            this.field_6408.field_6547 += 2.0F;
            this.field_6407.field_6548 = 1.5707964F;
            this.field_6408.field_6548 = 1.5707964F;
            this.field_6411 = 0;
            if(var5 != null) {
               return;
            }
         }

         var7 = var6.method_3940();
      }

      if(var5 != null) {
         if(var7) {
            this.field_6408.field_6546 = this.field_6407.field_6546;
            this.field_6408.field_6547 += 2.0F;
            this.field_6407.field_6548 = 1.5707964F;
            this.field_6408.field_6548 = 1.5707964F;
            this.field_6411 = 2;
            if(var5 != null) {
               return;
            }
         }

         var7 = var6.method_4478();
      }

      if(var7) {
         this.field_6410.field_6548 = 0.7853982F;
         this.field_6410.field_6546 += -4.0F;
         this.field_6410.field_6547 += 5.0F;
         this.field_6409.field_6546 += -3.3F;
         ++this.field_6409.field_6547;
         this.field_6407.field_6546 += 8.0F;
         this.field_6407.field_6547 += -2.0F;
         this.field_6408.field_6546 += 2.0F;
         this.field_6408.field_6547 += -0.8F;
         this.field_6407.field_6548 = 1.7278761F;
         this.field_6408.field_6548 = 2.670354F;
         this.field_6405.field_6548 = this.field_6406.field_6548 = -0.15707964F;
         this.field_6405.field_6546 = this.field_6406.field_6546 = 15.8F;
         this.field_6405.field_6547 = this.field_6406.field_6547 = -7.0F;
         this.field_6403.field_6548 = this.field_6404.field_6548 = -1.5707964F;
         this.field_6403.field_6546 = this.field_6404.field_6546 = 21.0F;
         this.field_6403.field_6547 = this.field_6404.field_6547 = 1.0F;
         this.field_6411 = 3;
         if(var5 != null) {
            return;
         }
      }

      this.field_6411 = 1;
   }

   // $FF: renamed from: <clinit> () void
   static void drawGradientRect3() {
      // $FF: Couldn't be decompiled
   }
}

import org.lwjgl.opengl.GL11;

// $FF: renamed from: nn
public class class_1210 extends bhr {

   // $FF: renamed from: b bix
   private bix field_6270;
   // $FF: renamed from: c bix
   private bix field_6271;
   // $FF: renamed from: d bix
   private bix field_6272;
   // $FF: renamed from: e bix
   private bix field_6273;
   // $FF: renamed from: f bix
   private bix field_6274;
   // $FF: renamed from: g bix
   private bix field_6275;
   // $FF: renamed from: h bix
   private bix field_6276;
   // $FF: renamed from: i bix
   private bix field_6277;
   // $FF: renamed from: j bix
   private bix field_6278;
   // $FF: renamed from: k bix
   private bix field_6279;
   // $FF: renamed from: l bix
   private bix field_6280;
   // $FF: renamed from: m bix
   private bix field_6281;
   // $FF: renamed from: n float
   private float field_6282;
   // $FF: renamed from: o java.lang.String
   private static final String field_6283;
   // $FF: renamed from: v java.lang.String[]
   private static final String[] field_6284;


   // $FF: renamed from: <init> (float) void
   public void method_6519(float var1) {
      super.method_6510();
      this.field_6264 = 256;
      this.field_6265 = 256;
      String[] var3 = field_6284;
      this.method_6515("body.body", 0, 0);
      this.method_6515("wing.skin", -56, 88);
      this.method_6515("wingtip.skin", -56, 144);
      this.method_6515("rearleg.main", 0, 0);
      this.method_6515("rearfoot.main", 112, 0);
      this.method_6515("rearlegtip.main", 196, 0);
      this.method_6515("head.upperhead", 112, 30);
      this.method_6515("wing.bone", 112, 88);
      this.method_6515("head.upperlip", 176, 44);
      this.method_6515("jaw.jaw", 176, 65);
      this.method_6515("frontleg.main", 112, 104);
      this.method_6515("wingtip.bone", 112, 136);
      this.method_6515("frontfoot.main", 144, 104);
      this.method_6515("neck.box", 192, 104);
      this.method_6515("frontlegtip.main", 226, 138);
      this.method_6515("body.scale", 220, 53);
      this.method_6515("head.scale", 0, 0);
      this.method_6515("neck.scale", 48, 0);
      this.method_6515("head.nostril", 112, 0);
      float var2 = -16.0F;
      bix var10001 = new bix;
      var10001.method_6637(this, "head");
      this.field_6270 = var10001;
      this.field_6270.method_6642("upperlip", -6.0F, -1.0F, -8.0F + var2, 12, 5, 16);
      this.field_6270.method_6642("upperhead", -8.0F, -8.0F, 6.0F + var2, 16, 16, 16);
      this.field_6270.field_6553 = true;
      this.field_6270.method_6642("scale", -5.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.field_6270.method_6642("nostril", -5.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.field_6270.field_6553 = false;
      this.field_6270.method_6642("scale", 3.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.field_6270.method_6642("nostril", 3.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      var10001 = new bix;
      var10001.method_6637(this, "jaw");
      this.field_6272 = var10001;
      this.field_6272.method_6645(0.0F, 4.0F, 8.0F + var2);
      this.field_6272.method_6642("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
      this.field_6270.method_6640(this.field_6272);
      var10001 = new bix;
      var10001.method_6637(this, "neck");
      this.field_6271 = var10001;
      this.field_6271.method_6642("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
      this.field_6271.method_6642("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
      var10001 = new bix;
      var10001.method_6637(this, "body");
      this.field_6273 = var10001;
      this.field_6273.method_6645(0.0F, 4.0F, 8.0F);
      this.field_6273.method_6642("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
      this.field_6273.method_6642("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
      this.field_6273.method_6642("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
      this.field_6273.method_6642("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
      var10001 = new bix;
      var10001.method_6637(this, "wing");
      this.field_6280 = var10001;
      this.field_6280.method_6645(-12.0F, 5.0F, 2.0F);
      this.field_6280.method_6642("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
      this.field_6280.method_6642("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      var10001 = new bix;
      var10001.method_6637(this, "wingtip");
      this.field_6281 = var10001;
      this.field_6281.method_6645(-56.0F, 0.0F, 0.0F);
      this.field_6281.method_6642("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
      this.field_6281.method_6642("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.field_6280.method_6640(this.field_6281);
      var10001 = new bix;
      var10001.method_6637(this, "frontleg");
      this.field_6275 = var10001;
      this.field_6275.method_6645(-12.0F, 20.0F, 2.0F);
      this.field_6275.method_6642("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
      var10001 = new bix;
      var10001.method_6637(this, "frontlegtip");
      this.field_6277 = var10001;
      this.field_6277.method_6645(0.0F, 20.0F, -1.0F);
      this.field_6277.method_6642("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
      this.field_6275.method_6640(this.field_6277);
      var10001 = new bix;
      var10001.method_6637(this, "frontfoot");
      this.field_6279 = var10001;
      this.field_6279.method_6645(0.0F, 23.0F, 0.0F);
      this.field_6279.method_6642("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
      this.field_6277.method_6640(this.field_6279);
      var10001 = new bix;
      var10001.method_6637(this, "rearleg");
      this.field_6274 = var10001;
      this.field_6274.method_6645(-16.0F, 16.0F, 42.0F);
      this.field_6274.method_6642("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
      var10001 = new bix;
      var10001.method_6637(this, "rearlegtip");
      this.field_6276 = var10001;
      this.field_6276.method_6645(0.0F, 32.0F, -4.0F);
      this.field_6276.method_6642("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
      this.field_6274.method_6640(this.field_6276);
      var10001 = new bix;
      var10001.method_6637(this, "rearfoot");
      this.field_6278 = var10001;
      this.field_6278.method_6645(0.0F, 31.0F, 4.0F);
      this.field_6278.method_6642("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
      this.field_6276.method_6640(this.field_6278);
   }

   // $FF: renamed from: a (sv, float, float, float) void
   public void method_6513(class_752 var1, float var2, float var3, float var4) {
      this.field_6282 = var4;
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      GL11.glPushMatrix();
      class_758 var9 = (class_758)var1;
      float var10 = var9.field_3411 + (var9.field_3412 - var9.field_3411) * this.field_6282;
      String[] var10000 = class_752.method_4253();
      this.field_6272.field_6548 = (float)(Math.sin((double)(var10 * 3.1415927F * 2.0F)) + 1.0D) * 0.2F;
      float var11 = (float)(Math.sin((double)(var10 * 3.1415927F * 2.0F - 1.0F)) + 1.0D);
      var11 = (var11 * var11 * 1.0F + var11 * 2.0F) * 0.05F;
      GL11.glTranslatef(0.0F, var11 - 2.0F, -3.0F);
      GL11.glRotatef(var11 * 2.0F, 1.0F, 0.0F, 0.0F);
      float var12 = -30.0F;
      float var13 = 0.0F;
      float var14 = 1.5F;
      double[] var15 = var9.method_4317(6, this.field_6282);
      float var16 = this.method_6520(var9.method_4317(5, this.field_6282)[0] - var9.method_4317(10, this.field_6282)[0]);
      float var17 = this.method_6520(var9.method_4317(5, this.field_6282)[0] + (double)(var16 / 2.0F));
      var12 += 2.0F;
      String[] var8 = var10000;
      float var18 = var10 * 3.1415927F * 2.0F;
      var12 = 20.0F;
      float var19 = -12.0F;
      int var21 = 0;

      float var20;
      while(true) {
         if(var21 < 5) {
            double[] var22 = var9.method_4317(5 - var21, this.field_6282);
            var20 = (float)Math.cos((double)((float)var21 * 0.45F + var18)) * 0.15F;
            this.field_6271.field_6549 = this.method_6520(var22[0] - var15[0]) * 3.1415927F / 180.0F * var14;
            this.field_6271.field_6548 = var20 + (float)(var22[1] - var15[1]) * 3.1415927F / 180.0F * var14 * 5.0F;
            this.field_6271.field_6550 = -this.method_6520(var22[0] - (double)var17) * 3.1415927F / 180.0F * var14;
            this.field_6271.field_6546 = var12;
            this.field_6271.field_6547 = var19;
            this.field_6271.field_6545 = var13;
            var12 = (float)((double)var12 + Math.sin((double)this.field_6271.field_6548) * 10.0D);
            var19 = (float)((double)var19 - Math.cos((double)this.field_6271.field_6549) * Math.cos((double)this.field_6271.field_6548) * 10.0D);
            var13 = (float)((double)var13 - Math.sin((double)this.field_6271.field_6549) * Math.cos((double)this.field_6271.field_6548) * 10.0D);
            this.field_6271.method_6646(var7);
            ++var21;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         this.field_6270.field_6546 = var12;
         this.field_6270.field_6547 = var19;
         this.field_6270.field_6545 = var13;
         break;
      }

      double[] var25 = var9.method_4317(0, this.field_6282);
      this.field_6270.field_6549 = this.method_6520(var25[0] - var15[0]) * 3.1415927F / 180.0F * 1.0F;
      this.field_6270.field_6550 = -this.method_6520(var25[0] - (double)var17) * 3.1415927F / 180.0F * 1.0F;
      this.field_6270.method_6646(var7);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var16 * var14 * 1.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(0.0F, -1.0F, 0.0F);
      this.field_6273.field_6550 = 0.0F;
      this.field_6273.method_6646(var7);
      int var26 = 0;

      int var24;
      while(true) {
         if(var26 < 2) {
            GL11.glEnable(2884);
            var20 = var10 * 3.1415927F * 2.0F;
            this.field_6280.field_6548 = 0.125F - (float)Math.cos((double)var20) * 0.2F;
            this.field_6280.field_6549 = 0.25F;
            this.field_6280.field_6550 = (float)(Math.sin((double)var20) + 0.125D) * 0.8F;
            this.field_6281.field_6550 = -((float)(Math.sin((double)(var20 + 2.0F)) + 0.5D)) * 0.75F;
            this.field_6274.field_6548 = 1.0F + var11 * 0.1F;
            this.field_6276.field_6548 = 0.5F + var11 * 0.1F;
            this.field_6278.field_6548 = 0.75F + var11 * 0.1F;
            this.field_6275.field_6548 = 1.3F + var11 * 0.1F;
            this.field_6277.field_6548 = -0.5F - var11 * 0.1F;
            this.field_6279.field_6548 = 0.75F + var11 * 0.1F;
            this.field_6280.method_6646(var7);
            this.field_6275.method_6646(var7);
            this.field_6274.method_6646(var7);
            GL11.glScalef(-1.0F, 1.0F, 1.0F);
            if(var8 != null) {
               var24 = var26;
               if(var8 == null) {
                  break;
               }

               if(var26 == 0) {
                  GL11.glCullFace(1028);
               }

               ++var26;
            }

            if(var8 != null) {
               continue;
            }
         }

         GL11.glPopMatrix();
         GL11.glCullFace(1029);
         var24 = 2884;
         break;
      }

      GL11.glDisable(var24);
      float var27 = -((float)Math.sin((double)(var10 * 3.1415927F * 2.0F))) * 0.0F;
      var18 = var10 * 3.1415927F * 2.0F;
      var12 = 10.0F;
      var19 = 60.0F;
      var13 = 0.0F;
      var15 = var9.method_4317(11, this.field_6282);
      int var23 = 0;

      while(true) {
         if(var23 < 12) {
            var25 = var9.method_4317(12 + var23, this.field_6282);
            var27 = (float)((double)var27 + Math.sin((double)((float)var23 * 0.45F + var18)) * 0.05000000074505806D);
            this.field_6271.field_6549 = (this.method_6520(var25[0] - var15[0]) * var14 + 180.0F) * 3.1415927F / 180.0F;
            this.field_6271.field_6548 = var27 + (float)(var25[1] - var15[1]) * 3.1415927F / 180.0F * var14 * 5.0F;
            this.field_6271.field_6550 = this.method_6520(var25[0] - (double)var17) * 3.1415927F / 180.0F * var14;
            this.field_6271.field_6546 = var12;
            this.field_6271.field_6547 = var19;
            this.field_6271.field_6545 = var13;
            var12 = (float)((double)var12 + Math.sin((double)this.field_6271.field_6548) * 10.0D);
            var19 = (float)((double)var19 - Math.cos((double)this.field_6271.field_6549) * Math.cos((double)this.field_6271.field_6548) * 10.0D);
            var13 = (float)((double)var13 - Math.sin((double)this.field_6271.field_6549) * Math.cos((double)this.field_6271.field_6548) * 10.0D);
            this.field_6271.method_6646(var7);
            ++var23;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         GL11.glPopMatrix();
         break;
      }

   }

   // $FF: renamed from: b (double) float
   private float method_6520(double var1) {
      String[] var3 = class_752.method_4253();

      double var10000;
      label27:
      while(true) {
         if(var1 >= 180.0D) {
            var1 -= 360.0D;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         while(true) {
            if(var1 >= -180.0D) {
               break label27;
            }

            var10000 = var1 + 360.0D;
            if(var3 == null) {
               return (float)var10000;
            }

            var1 = var10000;
            if(var3 == null) {
               break label27;
            }
         }
      }

      var10000 = var1;
      return (float)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6521() {
      // $FF: Couldn't be decompiled
   }
}

import java.util.Random;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public abstract class boh extends bno {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_3842;
   // $FF: renamed from: f bqx
   private static final bqx field_3843;
   // $FF: renamed from: i bhr
   protected bhr field_3844;
   // $FF: renamed from: j bhr
   protected bhr field_3845;
   private static final String __OBFID;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_3846;


   // $FF: renamed from: <init> (bhr, float) void
   public void method_4798(bhr var1, float var2) {
      super.method_4727();
      this.field_3844 = var1;
      this.field_3790 = var2;
   }

   // $FF: renamed from: a (bhr) void
   public void method_4799(bhr var1) {
      this.field_3845 = var1;
   }

   // $FF: renamed from: a (float, float, float) float
   private float method_4800(float var1, float var2, float var3) {
      String[] var10000 = class_752.method_4253();
      float var5 = var2 - var1;
      String[] var4 = var10000;

      float var6;
      label27:
      while(true) {
         if(var5 < -180.0F) {
            var5 += 360.0F;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         while(true) {
            if(var5 < 180.0F) {
               break label27;
            }

            var6 = var5 - 360.0F;
            if(var4 == null) {
               return var6;
            }

            var5 = var6;
            if(var4 == null) {
               break label27;
            }
         }
      }

      var6 = var1 + var3 * var5;
      return var6;
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 param1, double param2, double param4, double param6, float param8, float param9) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sv, float, float, float, float, float, float) void
   protected void method_4802(class_752 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_4731(var1);
      String[] var8 = class_752.method_4253();
      boolean var10000 = var1.method_3942();
      if(var8 != null) {
         if(!var10000) {
            this.field_3844.method_6511(var1, var2, var3, var4, var5, var6, var7);
            if(var8 != null) {
               return;
            }
         }

         var10000 = var1.method_3943(bao.method_5273().cursorCounter8);
      }

      label20: {
         if(var8 != null) {
            if(var10000) {
               break label20;
            }

            GL11.glPushMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.15F);
            GL11.glDepthMask(false);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glAlphaFunc(516, 0.003921569F);
            this.field_3844.method_6511(var1, var2, var3, var4, var5, var6, var7);
            GL11.glDisable(3042);
            GL11.glAlphaFunc(516, 0.1F);
            GL11.glPopMatrix();
            var10000 = true;
         }

         GL11.glDepthMask(var10000);
         if(var8 != null) {
            return;
         }
      }

      this.field_3844.method_6512(var2, var3, var4, var5, var6, var7, var1);
   }

   // $FF: renamed from: a (sv, double, double, double) void
   protected void method_4803(class_752 var1, double var2, double var4, double var6) {
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
   }

   // $FF: renamed from: a (sv, float, float, float) void
   protected void method_4804(class_752 var1, float var2, float var3, float var4) {
      String[] var10000 = class_752.method_4253();
      GL11.glRotatef(180.0F - var3, 0.0F, 1.0F, 0.0F);
      String[] var5 = var10000;
      class_752 var8 = var1;
      if(var5 != null) {
         if(var1.field_3318 > 0) {
            float var6 = ((float)var1.field_3318 + var4 - 1.0F) / 20.0F * 1.6F;
            var6 = class_1715.method_9557(var6);
            float var9 = var6;
            float var10001 = 1.0F;
            if(var5 != null) {
               if(var6 > 1.0F) {
                  var6 = 1.0F;
               }

               var9 = var6 * this.method_4812(var1);
               var10001 = 0.0F;
            }

            GL11.glRotatef(var9, var10001, 0.0F, 1.0F);
            if(var5 != null) {
               return;
            }
         }

         var8 = var1;
      }

      String var10 = class_130.method_602(var8.method_64());
      String[] var7 = field_3846;
      boolean var11 = var10.equals("Dinnerbone");
      if(var5 != null) {
         label40: {
            if(!var11) {
               var11 = var10.equals("Grumm");
               if(var5 == null) {
                  break label40;
               }

               if(!var11) {
                  return;
               }
            }

            var11 = var1 instanceof class_792;
         }
      }

      label32: {
         if(var5 != null) {
            if(!var11) {
               break label32;
            }

            var11 = ((class_792)var1).method_4633();
         }

         if(var11) {
            return;
         }
      }

      GL11.glTranslatef(0.0F, var1.field_3015 + 0.1F, 0.0F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
   }

   // $FF: renamed from: d (sv, float) float
   protected float method_4805(class_752 var1, float var2) {
      return var1.method_4241(var2);
   }

   // $FF: renamed from: b (sv, float) float
   protected float method_4806(class_752 var1, float var2) {
      return (float)var1.field_3029 + var2;
   }

   // $FF: renamed from: c (sv, float) void
   protected void method_4807(class_752 var1, float var2) {}

   // $FF: renamed from: e (sv, float) void
   protected void method_4808(class_752 var1, float var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = var1.method_4206();
      String[] var3 = var10000;
      if(var4 > 0) {
         class_713 var24 = new class_713;
         var24.method_4074(var1.field_2990, var1.field_2994, var1.field_2995, var1.field_2996);
         class_713 var5 = var24;
         Random var6 = new Random((long)var1.method_3845());
         bam.method_5212();
         int var7 = 0;

         while(true) {
            if(var7 < var4) {
               GL11.glPushMatrix();
               bix var8 = this.field_3844.method_6514(var6);
               class_1430 var9 = (class_1430)var8.field_6556.get(var6.nextInt(var8.field_6556.size()));
               var8.method_6648(0.0625F);
               float var10 = var6.nextFloat();
               float var11 = var6.nextFloat();
               float var12 = var6.nextFloat();
               float var13 = (var9.field_7589 + (var9.field_7592 - var9.field_7589) * var10) / 16.0F;
               float var14 = (var9.field_7590 + (var9.field_7593 - var9.field_7590) * var11) / 16.0F;
               float var15 = (var9.field_7591 + (var9.field_7594 - var9.field_7591) * var12) / 16.0F;
               GL11.glTranslatef(var13, var14, var15);
               var10 = var10 * 2.0F - 1.0F;
               var11 = var11 * 2.0F - 1.0F;
               var12 = var12 * 2.0F - 1.0F;
               var10 *= -1.0F;
               var11 *= -1.0F;
               var12 *= -1.0F;
               float var16 = class_1715.method_9557(var10 * var10 + var12 * var12);
               var5.field_3002 = var5.field_3000 = (float)(Math.atan2((double)var10, (double)var12) * 180.0D / 3.141592653589793D);
               var5.field_3003 = var5.field_3001 = (float)(Math.atan2((double)var11, (double)var16) * 180.0D / 3.141592653589793D);
               double var17 = 0.0D;
               double var19 = 0.0D;
               double var21 = 0.0D;
               float var23 = 0.0F;
               this.field_3788.method_7622(var5, var17, var19, var21, var23, var2);
               GL11.glPopMatrix();
               ++var7;
               if(var3 == null) {
                  break;
               }

               if(var3 != null) {
                  continue;
               }
            }

            bam.method_5213();
            break;
         }
      }

   }

   // $FF: renamed from: b (sv, int, float) int
   protected int method_4809(class_752 var1, int var2, float var3) {
      return this.method_4810(var1, var2, var3);
   }

   // $FF: renamed from: a (sv, int, float) int
   protected int method_4810(class_752 var1, int var2, float var3) {
      return -1;
   }

   // $FF: renamed from: c (sv, int, float) void
   protected void method_4811(class_752 var1, int var2, float var3) {}

   // $FF: renamed from: a (sv) float
   protected float method_4812(class_752 var1) {
      return 90.0F;
   }

   // $FF: renamed from: a (sv, float, float) int
   protected int method_4813(class_752 var1, float var2, float var3) {
      return 0;
   }

   // $FF: renamed from: a (sv, float) void
   protected void method_4814(class_752 var1, float var2) {}

   // $FF: renamed from: b (sv, double, double, double) void
   protected void method_4815(class_752 var1, double var2, double var4, double var6) {
      String[] var10000 = class_752.method_4253();
      GL11.glAlphaFunc(516, 0.1F);
      String[] var8 = var10000;
      if(this.method_4816(var1)) {
         float var9 = 1.6F;
         float var10 = 0.016666668F * var9;
         double var11 = var1.method_3891(this.field_3788.field_7426);
         float var13 = var1.method_3938()?32.0F:64.0F;
         if(var11 < (double)(var13 * var13)) {
            String var14 = var1.method_407().method_343();
            if(var1.method_3938()) {
               FontRenderer var15 = this.method_4741();
               GL11.glPushMatrix();
               GL11.glTranslatef((float)var2 + 0.0F, (float)var4 + var1.field_3015 + 0.5F, (float)var6);
               GL11.glNormal3f(0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-this.field_3788.field_7428, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(this.field_3788.field_7429, 1.0F, 0.0F, 0.0F);
               GL11.glScalef(-var10, -var10, var10);
               GL11.glDisable(2896);
               GL11.glTranslatef(0.0F, 0.25F / var10, 0.0F);
               GL11.glDepthMask(false);
               GL11.glEnable(3042);
               buu.method_9081(770, 771, 1, 0);
               bmh var16 = bmh.instance;
               GL11.glDisable(3553);
               var16.setVisible2();
               int var17 = var15.getCharWidth(var14) / 2;
               var16.setVisible7(0.0F, 0.0F, 0.0F, 0.25F);
               var16.method_7462((double)(-var17 - 1), -1.0D, 0.0D);
               var16.method_7462((double)(-var17 - 1), 8.0D, 0.0D);
               var16.method_7462((double)(var17 + 1), 8.0D, 0.0D);
               var16.method_7462((double)(var17 + 1), -1.0D, 0.0D);
               var16.getVisible8();
               GL11.glEnable(3553);
               GL11.glDepthMask(true);
               var15.method_7020(var14, -var15.getCharWidth(var14) / 2, 0, 553648127);
               GL11.glEnable(2896);
               GL11.glDisable(3042);
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glPopMatrix();
               if(var8 != null) {
                  return;
               }
            }

            this.method_4817(var1, var2, var4, var6, var14, var10, var11);
         }
      }

   }

   // $FF: renamed from: b (sv) boolean
   protected boolean method_4816(class_752 var1) {
      String[] var2 = class_752.method_4253();
      boolean var3;
      if(bao.method_5268()) {
         label30: {
            Object var10000 = var1;
            if(var2 != null) {
               if(var1 == this.field_3788.field_7426) {
                  break label30;
               }

               var10000 = var1;
            }

            if(var2 != null) {
               if(((class_752)var10000).method_3943(bao.method_5273().cursorCounter8)) {
                  break label30;
               }

               var10000 = var1.field_2987;
            }

            if(var10000 == null) {
               var3 = true;
               return var3;
            }
         }
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: a (sv, double, double, double, java.lang.String, float, double) void
   protected void method_4817(class_752 var1, double var2, double var4, double var6, String var8, float var9, double var10) {
      label16: {
         String[] var12 = class_752.method_4253();
         if(var12 != null) {
            if(!var1.method_4229()) {
               break label16;
            }

            this.method_4743(var1, var8, var2, var4 - 1.5D, var6, 64);
         }

         if(var12 != null) {
            return;
         }
      }

      this.method_4743(var1, var8, var2, var4, var6, 64);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4801((class_752)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_4818(Exception var0) {
      return var0;
   }
}

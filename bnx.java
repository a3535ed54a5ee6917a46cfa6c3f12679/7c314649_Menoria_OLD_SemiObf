import org.lwjgl.opengl.GL11;

public class bnx extends bno {

   // $FF: renamed from: a bqx
   private static final bqx field_3837;
   // $FF: renamed from: f blm
   private final blm field_3838;
   // $FF: renamed from: g bao
   private final bao field_3839;
   // $FF: renamed from: h vL
   private class_73 field_3840;
   private static final String __OBFID;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_3841;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      blm var10001 = new blm;
      var10001.method_7203();
      this.field_3838 = var10001;
      this.field_3839 = bao.method_5273();
   }

   // $FF: renamed from: a (vM) void
   public void method_4742(class_74 var1) {
      String[] var10002 = field_3841;
      this.field_3840 = var1.method_375("itemframe_background");
   }

   // $FF: renamed from: a (st, double, double, double, float, float) void
   public void method_4792(class_751 var1, double var2, double var4, double var6, float var8, float var9) {
      label19: {
         label18: {
            GL11.glPushMatrix();
            double var11 = var1.field_2994 - var2 - 0.5D;
            double var13 = var1.field_2995 - var4 - 0.5D;
            String[] var10 = class_752.method_4253();
            double var15 = var1.field_2996 - var6 - 0.5D;
            int var17 = var1.field_3295 + class_1649.field_8587[var1.field_3294];
            int var18 = var1.field_3296;
            int var19 = var1.field_3297 + class_1649.field_8588[var1.field_3294];
            GL11.glTranslated((double)var17 - var11, (double)var18 - var13, (double)var19 - var15);
            add var10000 = var1.method_4153();
            if(var10 != null) {
               if(var10000 == null) {
                  break label18;
               }

               var10000 = var1.method_4153();
            }

            if(var10000.method_3730() == class_1010.field_5215) {
               this.method_4794(var1);
               if(var10 != null) {
                  break label19;
               }
            }
         }

         this.method_4795(var1);
      }

      this.method_4796(var1);
      GL11.glPopMatrix();
      this.method_4797(var1, var2 + (double)((float)class_1649.field_8587[var1.field_3294] * 0.3F), var4 - 0.25D, var6 + (double)((float)class_1649.field_8588[var1.field_3294] * 0.3F));
   }

   // $FF: renamed from: a (st) bqx
   protected bqx method_4793(class_751 var1) {
      return null;
   }

   // $FF: renamed from: b (st) void
   private void method_4794(class_751 var1) {
      GL11.glPushMatrix();
      GL11.glRotatef(var1.field_3000, 0.0F, 1.0F, 0.0F);
      this.field_3788.field_7423.bindTexture(bpz.field_7757);
      aji var2 = class_1192.field_6030;
      float var3 = 0.0625F;
      float var4 = 1.0F;
      float var5 = var4 / 2.0F;
      GL11.glPushMatrix();
      this.field_3838.method_7211(0.0D, (double)(0.5F - var5 + 0.0625F), (double)(0.5F - var5 + 0.0625F), (double)var3, (double)(0.5F + var5 - 0.0625F), (double)(0.5F + var5 - 0.0625F));
      this.field_3838.method_7204(this.field_3840);
      this.field_3838.drawTextBox6(var2, 0, 1.0F);
      this.field_3838.method_7205();
      this.field_3838.method_7212();
      GL11.glPopMatrix();
      this.field_3838.method_7204(class_1192.field_6030.method_2448(1, 2));
      GL11.glPushMatrix();
      this.field_3838.method_7211(0.0D, (double)(0.5F - var5), (double)(0.5F - var5), (double)(var3 + 1.0E-4F), (double)(var3 + 0.5F - var5), (double)(0.5F + var5));
      this.field_3838.drawTextBox6(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.field_3838.method_7211(0.0D, (double)(0.5F + var5 - var3), (double)(0.5F - var5), (double)(var3 + 1.0E-4F), (double)(0.5F + var5), (double)(0.5F + var5));
      this.field_3838.drawTextBox6(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.field_3838.method_7211(0.0D, (double)(0.5F - var5), (double)(0.5F - var5), (double)var3, (double)(0.5F + var5), (double)(var3 + 0.5F - var5));
      this.field_3838.drawTextBox6(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.field_3838.method_7211(0.0D, (double)(0.5F - var5), (double)(0.5F + var5 - var3), (double)var3, (double)(0.5F + var5), (double)(0.5F + var5));
      this.field_3838.drawTextBox6(var2, 0, 1.0F);
      GL11.glPopMatrix();
      this.field_3838.method_7212();
      this.field_3838.method_7205();
      GL11.glPopMatrix();
   }

   // $FF: renamed from: c (st) void
   private void method_4795(class_751 var1) {
      GL11.glPushMatrix();
      GL11.glRotatef(var1.field_3000, 0.0F, 1.0F, 0.0F);
      this.field_3788.field_7423.bindTexture(bpz.field_7757);
      aji var2 = class_1192.field_6030;
      float var3 = 0.0625F;
      float var4 = 0.75F;
      float var5 = var4 / 2.0F;
      GL11.glPushMatrix();
      this.field_3838.method_7211(0.0D, (double)(0.5F - var5 + 0.0625F), (double)(0.5F - var5 + 0.0625F), (double)(var3 * 0.5F), (double)(0.5F + var5 - 0.0625F), (double)(0.5F + var5 - 0.0625F));
      this.field_3838.method_7204(this.field_3840);
      this.field_3838.drawTextBox6(var2, 0, 1.0F);
      this.field_3838.method_7205();
      this.field_3838.method_7212();
      GL11.glPopMatrix();
      this.field_3838.method_7204(class_1192.field_6030.method_2448(1, 2));
      GL11.glPushMatrix();
      this.field_3838.method_7211(0.0D, (double)(0.5F - var5), (double)(0.5F - var5), (double)(var3 + 1.0E-4F), (double)(var3 + 0.5F - var5), (double)(0.5F + var5));
      this.field_3838.drawTextBox6(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.field_3838.method_7211(0.0D, (double)(0.5F + var5 - var3), (double)(0.5F - var5), (double)(var3 + 1.0E-4F), (double)(0.5F + var5), (double)(0.5F + var5));
      this.field_3838.drawTextBox6(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.field_3838.method_7211(0.0D, (double)(0.5F - var5), (double)(0.5F - var5), (double)var3, (double)(0.5F + var5), (double)(var3 + 0.5F - var5));
      this.field_3838.drawTextBox6(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.field_3838.method_7211(0.0D, (double)(0.5F - var5), (double)(0.5F + var5 - var3), (double)var3, (double)(0.5F + var5), (double)(0.5F + var5));
      this.field_3838.drawTextBox6(var2, 0, 1.0F);
      GL11.glPopMatrix();
      this.field_3838.method_7212();
      this.field_3838.method_7205();
      GL11.glPopMatrix();
   }

   // $FF: renamed from: d (st) void
   private void method_4796(class_751 var1) {
      add var3 = var1.method_4153();
      String[] var2 = class_752.method_4253();
      if(var3 != null) {
         class_699 var4;
         adb var5;
         label89: {
            label88: {
               label87: {
                  class_699 var10000 = new class_699;
                  var10000.method_4025(var1.field_2990, 0.0D, 0.0D, 0.0D, var3);
                  var4 = var10000;
                  var5 = var4.method_4030().method_3730();
                  var4.method_4030().field_2958 = 1;
                  var4.field_3097 = 0.0F;
                  GL11.glPushMatrix();
                  GL11.glTranslatef(-0.453125F * (float)class_1649.field_8587[var1.field_3294], -0.18F, -0.453125F * (float)class_1649.field_8588[var1.field_3294]);
                  GL11.glRotatef(180.0F + var1.field_3000, 0.0F, 1.0F, 0.0F);
                  GL11.glRotatef((float)(-90 * var1.method_4155()), 0.0F, 0.0F, 1.0F);
                  if(var2 != null) {
                     switch(var1.method_4155()) {
                     case 1:
                        GL11.glTranslatef(-0.16F, -0.16F, 0.0F);
                        break;
                     case 2:
                        break label87;
                     case 3:
                        break label88;
                     default:
                        break label89;
                     }
                  }

                  if(var2 != null) {
                     break label89;
                  }
               }

               GL11.glTranslatef(0.0F, -0.32F, 0.0F);
               if(var2 != null) {
                  break label89;
               }
            }

            GL11.glTranslatef(0.16F, -0.16F, 0.0F);
         }

         label94: {
            adb var17 = var5;
            Object var10001 = class_1010.field_5215;
            if(var2 != null) {
               if(var5 == class_1010.field_5215) {
                  this.field_3788.field_7423.bindTexture(field_3837);
                  bmh var6 = bmh.instance;
                  GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                  GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
                  float var7 = 0.0078125F;
                  GL11.glScalef(var7, var7, var7);
                  if(var2 != null) {
                     switch(var1.method_4155()) {
                     case 0:
                        GL11.glTranslatef(-64.0F, -87.0F, -1.5F);
                        if(var2 != null) {
                           break;
                        }
                     case 1:
                        GL11.glTranslatef(-66.5F, -84.5F, -1.5F);
                        if(var2 != null) {
                           break;
                        }
                     case 2:
                        GL11.glTranslatef(-64.0F, -82.0F, -1.5F);
                        if(var2 != null) {
                           break;
                        }
                     case 3:
                        GL11.glTranslatef(-61.5F, -84.5F, -1.5F);
                     }

                     GL11.glNormal3f(0.0F, 0.0F, -1.0F);
                  }

                  class_1296 var8 = class_1010.field_5215.getBlock20(var4.method_4030(), var1.field_2990);
                  GL11.glTranslatef(0.0F, 0.0F, -1.0F);
                  if(var8 != null) {
                     this.field_3839.enableBackgroundDrawing8.setFocused2().method_7002(var8, true);
                  }

                  if(var2 != null) {
                     break label94;
                  }
               }

               var17 = var5;
               var10001 = class_1010.field_5202;
            }

            if(var2 != null) {
               boolean var18;
               label50: {
                  if(var17 == var10001) {
                     bqf var13 = bao.method_5273().method_5288();
                     var13.bindTexture(bpz.field_7758);
                     bqd var15 = ((bpz)var13.method_8121(bpz.field_7758)).method_7957(class_1010.field_5202.method_2925(var4.method_4030()).method_374());
                     var18 = var15 instanceof bqm;
                     if(var2 == null) {
                        break label50;
                     }

                     if(var18) {
                        bqm var16 = (bqm)var15;
                        double var9 = var16.field_7882;
                        double var11 = var16.field_7883;
                        var16.field_7882 = 0.0D;
                        var16.field_7883 = 0.0D;
                        var16.method_8098(var1.field_2990, var1.field_2994, var1.field_2996, (double)class_1715.method_9579((float)(180 + var1.field_3294 * 90)), false, true);
                        var16.field_7882 = var9;
                        var16.field_7883 = var11;
                     }
                  }

                  class_811.field_3807 = true;
                  bnn.field_7418.method_7622(var4, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
                  var18 = false;
               }

               class_811.field_3807 = var18;
               var17 = var5;
               var10001 = class_1010.field_5202;
            }

            if(var17 == var10001) {
               label44: {
                  bqd var14 = ((bpz)bao.method_5273().method_5288().method_8121(bpz.field_7758)).method_7957(class_1010.field_5202.method_2925(var4.method_4030()).method_374());
                  bqd var19 = var14;
                  if(var2 != null) {
                     if(var14.method_8083() <= 0) {
                        break label44;
                     }

                     var19 = var14;
                  }

                  var19.method_8081();
               }
            }
         }

         GL11.glPopMatrix();
      }

   }

   // $FF: renamed from: a (st, double, double, double) void
   protected void method_4797(class_751 var1, double var2, double var4, double var6) {
      String[] var8 = class_752.method_4253();
      if(bao.method_5268()) {
         Object var18;
         label41: {
            add var10000 = var1.method_4153();
            if(var8 != null) {
               if(var10000 == null) {
                  return;
               }

               var18 = var1;
               if(var8 == null) {
                  break label41;
               }

               var10000 = var1.method_4153();
            }

            if(!var10000.method_3773()) {
               return;
            }

            var18 = this.field_3788.field_7427;
         }

         if(var18 == var1) {
            float var9 = 1.6F;
            float var10 = 0.016666668F * var9;
            double var11 = var1.method_3891(this.field_3788.field_7426);
            float var13 = var1.method_3938()?32.0F:64.0F;
            if(var11 < (double)(var13 * var13)) {
               String var14 = var1.method_4153().method_3770();
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
                  GL11.glBlendFunc(770, 771);
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

               this.method_4743(var1, var14, var2, var4, var6, 64);
            }
         }
      }

   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4793((class_751)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4792((class_751)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Ò` Ý u¥(Ç®v´Ì.Åa»ËkÙÃy³Ý$Ò®v´Ì.Åa»Ë³û®$åuÁÁ&";
      int var4 = "Ò` Ý u¥(Ç®v´Ì.Åa»ËkÙÃy³Ý$Ò®v´Ì.Åa»Ë³û®$åuÁÁ&".length();
      char var1 = 31;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         String[] var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var12 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_3841 = var5;
                  String[] var11 = field_3841;
                  __OBFID = "CL_00001002";
                  bqx var8 = new bqx;
                  var10 = field_3841;
                  var8.method_8227("textures/map/map_background.png");
                  field_3837 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)var10[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 238;
               break;
            case 1:
               var10009 = 169;
               break;
            case 2:
               var10009 = 239;
               break;
            case 3:
               var10009 = 10;
               break;
            case 4:
               var10009 = 203;
               break;
            case 5:
               var10009 = 177;
               break;
            default:
               var10009 = 91;
            }

            var10[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }
}

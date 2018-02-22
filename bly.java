import org.lwjgl.opengl.GL11;

public class bly {

   // $FF: renamed from: a bqx
   private static final bqx field_2589;
   // $FF: renamed from: b bqx
   private static final bqx field_2590;
   // $FF: renamed from: c bqx
   private static final bqx field_2591;
   // $FF: renamed from: d bao
   private bao field_2592;
   // $FF: renamed from: e add
   private add field_2593;
   // $FF: renamed from: f float
   private float field_2594;
   // $FF: renamed from: g float
   private float field_2595;
   // $FF: renamed from: h blm
   private blm field_2596;
   // $FF: renamed from: i int
   private int field_2597;
   private static final String __OBFID;


   // $FF: renamed from: <init> (bao) void
   public void method_3230(bao var1) {
      super();
      blm var10001 = new blm;
      var10001.method_7203();
      this.field_2596 = var10001;
      this.field_2597 = -1;
      this.field_2592 = var1;
   }

   // $FF: renamed from: a (sv, add, int) void
   public void method_3231(class_752 var1, add var2, int var3) {
      String[] var4;
      bqf var5;
      adb var6;
      aji var7;
      aji var21;
      int var22;
      label118: {
         String[] var10000 = class_752.method_4253();
         GL11.glPushMatrix();
         var5 = this.field_2592.method_5288();
         var4 = var10000;
         var6 = var2.method_3730();
         var7 = aji.method_2417(var6);
         add var20 = var2;
         if(var4 != null) {
            if(var2 != null) {
               label121: {
                  var21 = var7;
                  if(var4 != null) {
                     if(var7 == null) {
                        break label121;
                     }

                     var21 = var7;
                  }

                  var22 = var21.method_2477();
                  if(var4 == null) {
                     break label118;
                  }

                  if(var22 != 0) {
                     GL11.glEnable(3042);
                     GL11.glEnable(2884);
                     buu.method_9081(770, 771, 1, 0);
                  }
               }
            }

            var20 = var2;
         }

         var22 = var20.method_3732();
      }

      label122: {
         label123: {
            if(var4 != null) {
               if(var22 != 0) {
                  break label123;
               }

               var22 = var6 instanceof abh;
            }

            if(var4 != null) {
               if(var22 == 0) {
                  break label123;
               }

               var22 = blm.drawTextBox7(var7.method_2436());
            }

            if(var22 != 0) {
               var5.bindTexture(var5.method_8117(0));
               if(var4 != null) {
                  if(var2 != null) {
                     label124: {
                        var21 = var7;
                        if(var4 != null) {
                           if(var7 == null) {
                              break label124;
                           }

                           var21 = var7;
                        }

                        var22 = var21.method_2477();
                        if(var4 != null) {
                           if(var22 == 0) {
                              break label124;
                           }

                           GL11.glDepthMask(false);
                           this.field_2596.drawTextBox6(var7, var2.method_3745(), 1.0F);
                           var22 = 1;
                        }

                        GL11.glDepthMask((boolean)var22);
                        if(var4 != null) {
                           break label122;
                        }
                     }
                  }

                  this.field_2596.drawTextBox6(var7, var2.method_3745(), 1.0F);
               }

               if(var4 != null) {
                  break label122;
               }
            }
         }

         class_73 var8 = var1.method_4222(var2, var3);
         if(var4 != null) {
            if(var8 == null) {
               GL11.glPopMatrix();
               return;
            }

            var5.bindTexture(var5.method_8117(var2.method_3732()));
            bqi.method_8159(false, false, 1.0F);
         }

         bmh var9 = bmh.instance;
         float var10 = var8.method_368();
         float var11 = var8.method_369();
         float var12 = var8.method_371();
         float var13 = var8.method_372();
         float var14 = 0.0F;
         float var15 = 0.3F;
         GL11.glEnable('\u803a');
         GL11.glTranslatef(-var14, -var15, 0.0F);
         float var16 = 1.5F;
         GL11.glScalef(var16, var16, var16);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         method_3232(var9, var11, var12, var10, var13, var8.method_366(), var8.method_367(), 0.0625F);
         var22 = var2.method_3775();
         if(var4 != null) {
            label73: {
               if(var22 != 0) {
                  var22 = var3;
                  if(var4 == null) {
                     break label73;
                  }

                  if(var3 == 0) {
                     GL11.glDepthFunc(514);
                     GL11.glDisable(2896);
                     var5.bindTexture(field_2589);
                     GL11.glEnable(3042);
                     buu.method_9081(768, 1, 1, 0);
                     float var17 = 0.76F;
                     GL11.glColor4f(0.5F * var17, 0.25F * var17, 0.8F * var17, 1.0F);
                     GL11.glMatrixMode(5890);
                     GL11.glPushMatrix();
                     float var18 = 0.125F;
                     GL11.glScalef(var18, var18, var18);
                     float var19 = (float)(bao.method_5283() % 3000L) / 3000.0F * 8.0F;
                     GL11.glTranslatef(var19, 0.0F, 0.0F);
                     GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
                     method_3232(var9, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
                     GL11.glPopMatrix();
                     GL11.glPushMatrix();
                     GL11.glScalef(var18, var18, var18);
                     var19 = (float)(bao.method_5283() % 4873L) / 4873.0F * 8.0F;
                     GL11.glTranslatef(-var19, 0.0F, 0.0F);
                     GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
                     method_3232(var9, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
                     GL11.glPopMatrix();
                     GL11.glMatrixMode(5888);
                     GL11.glDisable(3042);
                     GL11.glEnable(2896);
                     GL11.glDepthFunc(515);
                  }
               }

               var22 = '\u803a';
            }
         }

         GL11.glDisable(var22);
         var5.bindTexture(var5.method_8117(var2.method_3732()));
         bqi.method_8160();
      }

      if(var2 != null) {
         label125: {
            var21 = var7;
            if(var4 != null) {
               if(var7 == null) {
                  break label125;
               }

               var21 = var7;
            }

            var22 = var21.method_2477();
            if(var4 != null) {
               if(var22 == 0) {
                  break label125;
               }

               var22 = 3042;
            }

            GL11.glDisable(var22);
         }
      }

      GL11.glPopMatrix();
   }

   // $FF: renamed from: a (bmh, float, float, float, float, int, int, float) void
   public static void method_3232(bmh var0, float var1, float var2, float var3, float var4, int var5, int var6, float var7) {
      var0.setVisible2();
      var0.method_7466(0.0F, 0.0F, 1.0F);
      var0.addVertexWithUV(0.0D, 0.0D, 0.0D, (double)var1, (double)var4);
      String[] var10000 = class_752.method_4253();
      var0.addVertexWithUV(1.0D, 0.0D, 0.0D, (double)var3, (double)var4);
      var0.addVertexWithUV(1.0D, 1.0D, 0.0D, (double)var3, (double)var2);
      var0.addVertexWithUV(0.0D, 1.0D, 0.0D, (double)var1, (double)var2);
      var0.getVisible8();
      var0.setVisible2();
      var0.method_7466(0.0F, 0.0F, -1.0F);
      var0.addVertexWithUV(0.0D, 1.0D, (double)(0.0F - var7), (double)var1, (double)var2);
      var0.addVertexWithUV(1.0D, 1.0D, (double)(0.0F - var7), (double)var3, (double)var2);
      var0.addVertexWithUV(1.0D, 0.0D, (double)(0.0F - var7), (double)var3, (double)var4);
      var0.addVertexWithUV(0.0D, 0.0D, (double)(0.0F - var7), (double)var1, (double)var4);
      var0.getVisible8();
      float var9 = 0.5F * (var1 - var3) / (float)var5;
      String[] var8 = var10000;
      float var10 = 0.5F * (var4 - var2) / (float)var6;
      var0.setVisible2();
      var0.method_7466(-1.0F, 0.0F, 0.0F);
      int var11 = 0;

      float var12;
      float var13;
      while(true) {
         if(var11 < var5) {
            var12 = (float)var11 / (float)var5;
            var13 = var1 + (var3 - var1) * var12 - var9;
            var0.addVertexWithUV((double)var12, 0.0D, (double)(0.0F - var7), (double)var13, (double)var4);
            var0.addVertexWithUV((double)var12, 0.0D, 0.0D, (double)var13, (double)var4);
            var0.addVertexWithUV((double)var12, 1.0D, 0.0D, (double)var13, (double)var2);
            var0.addVertexWithUV((double)var12, 1.0D, (double)(0.0F - var7), (double)var13, (double)var2);
            ++var11;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         var0.getVisible8();
         var0.setVisible2();
         var0.method_7466(1.0F, 0.0F, 0.0F);
         break;
      }

      var11 = 0;

      float var14;
      while(true) {
         if(var11 < var5) {
            var12 = (float)var11 / (float)var5;
            var13 = var1 + (var3 - var1) * var12 - var9;
            var14 = var12 + 1.0F / (float)var5;
            var0.addVertexWithUV((double)var14, 1.0D, (double)(0.0F - var7), (double)var13, (double)var2);
            var0.addVertexWithUV((double)var14, 1.0D, 0.0D, (double)var13, (double)var2);
            var0.addVertexWithUV((double)var14, 0.0D, 0.0D, (double)var13, (double)var4);
            var0.addVertexWithUV((double)var14, 0.0D, (double)(0.0F - var7), (double)var13, (double)var4);
            ++var11;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         var0.getVisible8();
         var0.setVisible2();
         var0.method_7466(0.0F, 1.0F, 0.0F);
         break;
      }

      var11 = 0;

      while(true) {
         if(var11 < var6) {
            var12 = (float)var11 / (float)var6;
            var13 = var4 + (var2 - var4) * var12 - var10;
            var14 = var12 + 1.0F / (float)var6;
            var0.addVertexWithUV(0.0D, (double)var14, 0.0D, (double)var1, (double)var13);
            var0.addVertexWithUV(1.0D, (double)var14, 0.0D, (double)var3, (double)var13);
            var0.addVertexWithUV(1.0D, (double)var14, (double)(0.0F - var7), (double)var3, (double)var13);
            var0.addVertexWithUV(0.0D, (double)var14, (double)(0.0F - var7), (double)var1, (double)var13);
            ++var11;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         var0.getVisible8();
         var0.setVisible2();
         var0.method_7466(0.0F, -1.0F, 0.0F);
         break;
      }

      var11 = 0;

      while(true) {
         if(var11 < var6) {
            var12 = (float)var11 / (float)var6;
            var13 = var4 + (var2 - var4) * var12 - var10;
            var0.addVertexWithUV(1.0D, (double)var12, 0.0D, (double)var3, (double)var13);
            var0.addVertexWithUV(0.0D, (double)var12, 0.0D, (double)var1, (double)var13);
            var0.addVertexWithUV(0.0D, (double)var12, (double)(0.0F - var7), (double)var1, (double)var13);
            var0.addVertexWithUV(1.0D, (double)var12, (double)(0.0F - var7), (double)var3, (double)var13);
            ++var11;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         var0.getVisible8();
         break;
      }

   }

   // $FF: renamed from: a (float) void
   public void method_3233(float var1) {
      String[] var2;
      float var3;
      bjk var4;
      float var5;
      add var9;
      add var25;
      int var27;
      label211: {
         label214: {
            var3 = this.field_2595 + (this.field_2594 - this.field_2595) * var1;
            var4 = this.field_2592.cursorCounter8;
            var5 = var4.field_3003 + (var4.field_3001 - var4.field_3003) * var1;
            GL11.glPushMatrix();
            GL11.glRotatef(var5, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var4.field_3002 + (var4.field_3000 - var4.field_3002) * var1, 0.0F, 1.0F, 0.0F);
            bam.method_5213();
            GL11.glPopMatrix();
            float var7 = var4.field_3697 + (var4.field_3695 - var4.field_3697) * var1;
            float var8 = var4.field_3696 + (var4.field_3694 - var4.field_3696) * var1;
            GL11.glRotatef((var4.field_3001 - var7) * 0.1F, 1.0F, 0.0F, 0.0F);
            String[] var10000 = class_752.method_4253();
            GL11.glRotatef((var4.field_3000 - var8) * 0.1F, 0.0F, 1.0F, 0.0F);
            var9 = this.field_2593;
            var2 = var10000;
            var25 = var9;
            if(var2 != null) {
               if(var9 == null) {
                  break label214;
               }

               var25 = var9;
            }

            var27 = var25.method_3730() instanceof class_562;
            if(var2 == null) {
               break label211;
            }

            if(var27 != 0) {
               GL11.glEnable(3042);
               buu.method_9081(770, 771, 1, 0);
            }
         }

         var27 = this.field_2592.cursorCounter6.method_32(class_1715.method_9561(var4.field_2994), class_1715.method_9561(var4.field_2995), class_1715.method_9561(var4.field_2996), 0);
      }

      float var13;
      float var14;
      float var15;
      float var10001;
      float var29;
      label201: {
         int var10 = var27;
         int var11 = var10 % 65536;
         int var12 = var10 / 65536;
         buu.method_9080(buu.field_8557, (float)var11 / 1.0F, (float)var12 / 1.0F);
         var29 = 1.0F;
         var10001 = 1.0F;
         float var10002 = 1.0F;
         float var10003 = 1.0F;
         if(var2 != null) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            if(var9 != null) {
               int var16 = var9.method_3730().method_2953(var9, 0);
               var13 = (float)(var16 >> 16 & 255) / 255.0F;
               var14 = (float)(var16 >> 8 & 255) / 255.0F;
               var15 = (float)(var16 & 255) / 255.0F;
               GL11.glColor4f(var13, var14, var15, 1.0F);
               if(var2 != null) {
                  break label201;
               }
            }

            var29 = 1.0F;
            var10001 = 1.0F;
            var10002 = 1.0F;
            var10003 = 1.0F;
         }

         GL11.glColor4f(var29, var10001, var10002, var10003);
      }

      label215: {
         var25 = var9;
         float var17;
         float var18;
         float var19;
         bno var20;
         class_826 var21;
         float var26;
         if(var2 != null) {
            label192: {
               if(var9 != null) {
                  var25 = var9;
                  if(var2 == null) {
                     break label192;
                  }

                  if(var9.method_3730() == class_1010.field_5215) {
                     GL11.glPushMatrix();
                     var19 = 0.8F;
                     var13 = var4.method_4241(var1);
                     var14 = class_1715.method_9555(var13 * 3.1415927F);
                     var15 = class_1715.method_9555(class_1715.method_9557(var13) * 3.1415927F);
                     GL11.glTranslatef(-var15 * 0.4F, class_1715.method_9555(class_1715.method_9557(var13) * 3.1415927F * 2.0F) * 0.2F, -var14 * 0.2F);
                     var13 = 1.0F - var5 / 45.0F + 0.1F;
                     float var41;
                     var27 = (var41 = var13 - 0.0F) == 0.0F?0:(var41 < 0.0F?-1:1);
                     if(var2 != null) {
                        if(var27 < 0) {
                           var13 = 0.0F;
                        }

                        float var42;
                        var27 = (var42 = var13 - 1.0F) == 0.0F?0:(var42 < 0.0F?-1:1);
                     }

                     if(var2 != null) {
                        if(var27 > 0) {
                           var13 = 1.0F;
                        }

                        var13 = -class_1715.method_9556(var13 * 3.1415927F) * 0.5F + 0.5F;
                        GL11.glTranslatef(0.0F, 0.0F * var19 - (1.0F - var3) * 1.2F - var13 * 0.5F + 0.04F, -0.9F * var19);
                        GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                        GL11.glRotatef(var13 * -85.0F, 0.0F, 0.0F, 1.0F);
                        GL11.glEnable('\u803a');
                        this.field_2592.method_5288().bindTexture(var4.method_4662());
                        var27 = 0;
                     }

                     int var22 = var27;

                     while(true) {
                        if(var22 < 2) {
                           int var23 = var22 * 2 - 1;
                           GL11.glPushMatrix();
                           GL11.glTranslatef(-0.0F, -0.6F, 1.1F * (float)var23);
                           GL11.glRotatef((float)(-45 * var23), 1.0F, 0.0F, 0.0F);
                           GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
                           GL11.glRotatef(59.0F, 0.0F, 0.0F, 1.0F);
                           GL11.glRotatef((float)(-65 * var23), 0.0F, 1.0F, 0.0F);
                           var20 = bnn.field_7418.method_7618(this.field_2592.cursorCounter8);
                           var21 = (class_826)var20;
                           var18 = 1.0F;
                           GL11.glScalef(var18, var18, var18);
                           var21.method_4826(this.field_2592.cursorCounter8);
                           GL11.glPopMatrix();
                           ++var22;
                           if(var2 == null) {
                              break;
                           }

                           if(var2 != null) {
                              continue;
                           }
                        }

                        var14 = var4.method_4241(var1);
                        var15 = class_1715.method_9555(var14 * var14 * 3.1415927F);
                        break;
                     }

                     var26 = class_1715.method_9555(class_1715.method_9557(var14) * 3.1415927F);
                     GL11.glRotatef(-var15 * 20.0F, 0.0F, 1.0F, 0.0F);
                     GL11.glRotatef(-var26 * 20.0F, 0.0F, 0.0F, 1.0F);
                     GL11.glRotatef(-var26 * 80.0F, 1.0F, 0.0F, 0.0F);
                     var17 = 0.38F;
                     GL11.glScalef(var17, var17, var17);
                     GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                     GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
                     GL11.glTranslatef(-1.0F, -1.0F, 0.0F);
                     var18 = 0.015625F;
                     GL11.glScalef(var18, var18, var18);
                     this.field_2592.method_5288().bindTexture(field_2590);
                     bmh var33 = bmh.instance;
                     GL11.glNormal3f(0.0F, 0.0F, -1.0F);
                     var33.setVisible2();
                     byte var36 = 7;
                     var33.addVertexWithUV((double)(0 - var36), (double)(128 + var36), 0.0D, 0.0D, 1.0D);
                     var33.addVertexWithUV((double)(128 + var36), (double)(128 + var36), 0.0D, 1.0D, 1.0D);
                     var33.addVertexWithUV((double)(128 + var36), (double)(0 - var36), 0.0D, 1.0D, 0.0D);
                     var33.addVertexWithUV((double)(0 - var36), (double)(0 - var36), 0.0D, 0.0D, 0.0D);
                     var33.getVisible8();
                     class_1296 var24 = class_1010.field_5215.getBlock20(var9, this.field_2592.cursorCounter6);
                     if(var2 != null) {
                        if(var24 != null) {
                           this.field_2592.enableBackgroundDrawing8.setFocused2().method_7002(var24, false);
                        }

                        GL11.glPopMatrix();
                     }

                     if(var2 != null) {
                        break label215;
                     }
                  }
               }

               var25 = var9;
            }
         }

         if(var25 != null) {
            class_92 var28;
            class_92 var32;
            label168: {
               GL11.glPushMatrix();
               var19 = 0.8F;
               bjk var31 = var4;
               if(var2 != null) {
                  if(var4.method_4556() > 0) {
                     label218: {
                        label160: {
                           class_92 var34 = var9.method_3764();
                           var32 = var34;
                           var28 = class_92.field_24;
                           if(var2 != null) {
                              if(var34 == class_92.field_24) {
                                 break label160;
                              }

                              var32 = var34;
                              var28 = class_92.field_25;
                           }

                           if(var32 != var28) {
                              break label218;
                           }
                        }

                        var14 = (float)var4.method_4556() - var1 + 1.0F;
                        var15 = 1.0F - var14 / (float)var9.method_3763();
                        var26 = 1.0F - var15;
                        var26 = var26 * var26 * var26;
                        var26 = var26 * var26 * var26;
                        var26 = var26 * var26 * var26;
                        var17 = 1.0F - var26;
                        var10001 = class_1715.method_9564(class_1715.method_9556(var14 / 4.0F * 3.1415927F) * 0.1F);
                        double var43;
                        int var30 = (var43 = (double)var15 - 0.2D) == 0.0D?0:(var43 < 0.0D?-1:1);
                        if(var2 != null) {
                           var30 = var30 > 0?1:0;
                        }

                        GL11.glTranslatef(0.0F, var10001 * (float)var30, 0.0F);
                        GL11.glTranslatef(var17 * 0.6F, -var17 * 0.5F, 0.0F);
                        GL11.glRotatef(var17 * 90.0F, 0.0F, 1.0F, 0.0F);
                        GL11.glRotatef(var17 * 10.0F, 1.0F, 0.0F, 0.0F);
                        GL11.glRotatef(var17 * 30.0F, 0.0F, 0.0F, 1.0F);
                     }

                     if(var2 != null) {
                        break label168;
                     }
                  }

                  var31 = var4;
               }

               var13 = var31.method_4241(var1);
               var14 = class_1715.method_9555(var13 * 3.1415927F);
               var15 = class_1715.method_9555(class_1715.method_9557(var13) * 3.1415927F);
               GL11.glTranslatef(-var15 * 0.4F, class_1715.method_9555(class_1715.method_9557(var13) * 3.1415927F * 2.0F) * 0.2F, -var14 * 0.2F);
            }

            GL11.glTranslatef(0.7F * var19, -0.65F * var19 - (1.0F - var3) * 0.6F, -0.9F * var19);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glEnable('\u803a');
            var13 = var4.method_4241(var1);
            var14 = class_1715.method_9555(var13 * var13 * 3.1415927F);
            var15 = class_1715.method_9555(class_1715.method_9557(var13) * 3.1415927F);
            GL11.glRotatef(-var14 * 20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-var15 * 20.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-var15 * 80.0F, 1.0F, 0.0F, 0.0F);
            var26 = 0.4F;
            GL11.glScalef(var26, var26, var26);
            var27 = var4.method_4556();
            float var35;
            float var37;
            if(var2 != null) {
               if(var27 > 0) {
                  label147: {
                     class_92 var38 = var9.method_3764();
                     var32 = var38;
                     var28 = class_92.field_26;
                     if(var2 != null) {
                        if(var38 == class_92.field_26) {
                           GL11.glTranslatef(-0.5F, 0.2F, 0.0F);
                           GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
                           GL11.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
                           GL11.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
                           if(var2 != null) {
                              break label147;
                           }
                        }

                        var32 = var38;
                        var28 = class_92.field_27;
                     }

                     if(var32 == var28) {
                        label220: {
                           GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
                           GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
                           GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
                           GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
                           var18 = (float)var9.method_3763() - ((float)var4.method_4556() - var1 + 1.0F);
                           var35 = var18 / 20.0F;
                           var35 = (var35 * var35 + var35 * 2.0F) / 3.0F;
                           float var44;
                           var27 = (var44 = var35 - 1.0F) == 0.0F?0:(var44 < 0.0F?-1:1);
                           if(var2 != null) {
                              if(var27 > 0) {
                                 var35 = 1.0F;
                              }

                              var29 = var35;
                              var10001 = 0.1F;
                              if(var2 == null) {
                                 break label220;
                              }

                              float var45;
                              var27 = (var45 = var35 - 0.1F) == 0.0F?0:(var45 < 0.0F?-1:1);
                           }

                           if(var27 > 0) {
                              GL11.glTranslatef(0.0F, class_1715.method_9555((var18 - 0.1F) * 1.3F) * 0.01F * (var35 - 0.1F), 0.0F);
                           }

                           GL11.glTranslatef(0.0F, 0.0F, var35 * 0.1F);
                           GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
                           GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
                           GL11.glTranslatef(0.0F, 0.5F, 0.0F);
                           var29 = 1.0F;
                           var10001 = var35 * 0.2F;
                        }

                        var37 = var29 + var10001;
                        GL11.glScalef(1.0F, 1.0F, var37);
                        GL11.glTranslatef(0.0F, -0.5F, 0.0F);
                        GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
                        GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
                     }
                  }
               }

               var27 = var9.method_3730().method_2943();
            }

            if(var2 != null) {
               if(var27 != 0) {
                  GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
               }

               var27 = var9.method_3730().method_2970();
            }

            label132: {
               label131: {
                  if(var2 != null) {
                     if(var27 == 0) {
                        break label131;
                     }

                     this.method_3231(var4, var9, 0);
                     var27 = var9.method_3730().method_2953(var9, 1);
                  }

                  int var39 = var27;
                  var18 = (float)(var39 >> 16 & 255) / 255.0F;
                  var35 = (float)(var39 >> 8 & 255) / 255.0F;
                  var37 = (float)(var39 & 255) / 255.0F;
                  GL11.glColor4f(1.0F * var18, 1.0F * var35, 1.0F * var37, 1.0F);
                  this.method_3231(var4, var9, 1);
                  if(var2 != null) {
                     break label132;
                  }
               }

               this.method_3231(var4, var9, 0);
            }

            GL11.glPopMatrix();
            if(var2 != null) {
               break label215;
            }
         }

         if(!var4.method_3942()) {
            GL11.glPushMatrix();
            var19 = 0.8F;
            var13 = var4.method_4241(var1);
            var14 = class_1715.method_9555(var13 * 3.1415927F);
            var15 = class_1715.method_9555(class_1715.method_9557(var13) * 3.1415927F);
            GL11.glTranslatef(-var15 * 0.3F, class_1715.method_9555(class_1715.method_9557(var13) * 3.1415927F * 2.0F) * 0.4F, -var14 * 0.4F);
            GL11.glTranslatef(0.8F * var19, -0.75F * var19 - (1.0F - var3) * 0.6F, -0.9F * var19);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glEnable('\u803a');
            var13 = var4.method_4241(var1);
            var14 = class_1715.method_9555(var13 * var13 * 3.1415927F);
            var15 = class_1715.method_9555(class_1715.method_9557(var13) * 3.1415927F);
            GL11.glRotatef(var15 * 70.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-var14 * 20.0F, 0.0F, 0.0F, 1.0F);
            this.field_2592.method_5288().bindTexture(var4.method_4662());
            GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
            GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef(5.6F, 0.0F, 0.0F);
            var20 = bnn.field_7418.method_7618(this.field_2592.cursorCounter8);
            var21 = (class_826)var20;
            var18 = 1.0F;
            GL11.glScalef(var18, var18, var18);
            var21.method_4826(this.field_2592.cursorCounter8);
            GL11.glPopMatrix();
         }
      }

      char var40;
      label123: {
         label222: {
            var25 = var9;
            if(var2 != null) {
               if(var9 == null) {
                  break label222;
               }

               var25 = var9;
            }

            var40 = var25.method_3730() instanceof class_562;
            if(var2 == null) {
               break label123;
            }

            if(var40 != 0) {
               GL11.glDisable(3042);
            }
         }

         var40 = '\u803a';
      }

      GL11.glDisable(var40);
      bam.method_5212();
   }

   // $FF: renamed from: b (float) void
   public void method_3234(float var1) {
      GL11.glDisable(3008);
      String[] var2 = class_752.method_4253();
      short var10000 = this.field_2592.cursorCounter8.method_3936();
      if(var2 != null) {
         if(var10000 != 0) {
            this.method_3237(var1);
         }

         var10000 = this.field_2592.cursorCounter8.method_3918();
      }

      if(var2 != null) {
         label59: {
            if(var10000 != 0) {
               aji var6;
               label64: {
                  int var3 = class_1715.method_9561(this.field_2592.cursorCounter8.field_2994);
                  int var4 = class_1715.method_9561(this.field_2592.cursorCounter8.field_2995);
                  int var5 = class_1715.method_9561(this.field_2592.cursorCounter8.field_2996);
                  var6 = this.field_2592.cursorCounter6.getBlock(var3, var4, var5);
                  byte var14 = this.field_2592.cursorCounter6.getBlock(var3, var4, var5).method_2433();
                  if(var2 != null) {
                     if(var14 != 0) {
                        this.method_3235(var1, var6.getBlockTextureFromSide(2));
                        if(var2 != null) {
                           break label64;
                        }
                     }

                     var14 = 0;
                  }

                  int var7 = var14;

                  while(var7 < 8) {
                     float var8 = ((float)((var7 >> 0) % 2) - 0.5F) * this.field_2592.cursorCounter8.field_3014 * 0.9F;
                     float var9 = ((float)((var7 >> 1) % 2) - 0.5F) * this.field_2592.cursorCounter8.field_3015 * 0.2F;
                     float var10 = ((float)((var7 >> 2) % 2) - 0.5F) * this.field_2592.cursorCounter8.field_3014 * 0.9F;
                     int var11 = class_1715.method_9559((float)var3 + var8);
                     int var12 = class_1715.method_9559((float)var4 + var9);
                     int var13 = class_1715.method_9559((float)var5 + var10);
                     if(var2 != null) {
                        var10000 = this.field_2592.cursorCounter6.getBlock(var11, var12, var13).method_2433();
                        if(var2 == null) {
                           break label59;
                        }

                        if(var10000 != 0) {
                           var6 = this.field_2592.cursorCounter6.getBlock(var11, var12, var13);
                        }

                        ++var7;
                     }

                     if(var2 == null) {
                        break;
                     }
                  }
               }

               if(var6.method_2424() != awt.field_4170) {
                  this.method_3235(var1, var6.getBlockTextureFromSide(2));
               }
            }

            var10000 = this.field_2592.cursorCounter8.method_3879(awt.field_4177);
         }
      }

      if(var2 != null) {
         if(var10000 != 0) {
            this.method_3236(var1);
         }

         var10000 = 3008;
      }

      GL11.glEnable(var10000);
   }

   // $FF: renamed from: a (float, vL) void
   private void method_3235(float var1, class_73 var2) {
      this.field_2592.method_5288().bindTexture(bpz.field_7757);
      bmh var3 = bmh.instance;
      float var4 = 0.1F;
      GL11.glColor4f(var4, var4, var4, 0.5F);
      GL11.glPushMatrix();
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = var2.method_368();
      float var11 = var2.method_369();
      float var12 = var2.method_371();
      float var13 = var2.method_372();
      var3.setVisible2();
      var3.addVertexWithUV((double)var5, (double)var7, (double)var9, (double)var11, (double)var13);
      var3.addVertexWithUV((double)var6, (double)var7, (double)var9, (double)var10, (double)var13);
      var3.addVertexWithUV((double)var6, (double)var8, (double)var9, (double)var10, (double)var12);
      var3.addVertexWithUV((double)var5, (double)var8, (double)var9, (double)var11, (double)var12);
      var3.getVisible8();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: c (float) void
   private void method_3236(float var1) {
      this.field_2592.method_5288().bindTexture(field_2591);
      bmh var2 = bmh.instance;
      float var3 = this.field_2592.cursorCounter8.method_3884(var1);
      GL11.glColor4f(var3, var3, var3, 0.5F);
      GL11.glEnable(3042);
      buu.method_9081(770, 771, 1, 0);
      GL11.glPushMatrix();
      float var4 = 4.0F;
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = -this.field_2592.cursorCounter8.field_3000 / 64.0F;
      float var11 = this.field_2592.cursorCounter8.field_3001 / 64.0F;
      var2.setVisible2();
      var2.addVertexWithUV((double)var5, (double)var7, (double)var9, (double)(var4 + var10), (double)(var4 + var11));
      var2.addVertexWithUV((double)var6, (double)var7, (double)var9, (double)(0.0F + var10), (double)(var4 + var11));
      var2.addVertexWithUV((double)var6, (double)var8, (double)var9, (double)(0.0F + var10), (double)(0.0F + var11));
      var2.addVertexWithUV((double)var5, (double)var8, (double)var9, (double)(var4 + var10), (double)(0.0F + var11));
      var2.getVisible8();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   // $FF: renamed from: d (float) void
   private void method_3237(float var1) {
      String[] var10000 = class_752.method_4253();
      bmh var3 = bmh.instance;
      String[] var2 = var10000;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
      GL11.glEnable(3042);
      buu.method_9081(770, 771, 1, 0);
      float var4 = 1.0F;
      int var5 = 0;

      while(true) {
         if(var5 < 2) {
            GL11.glPushMatrix();
            class_73 var6 = class_1192.field_6078.method_2805(1);
            this.field_2592.method_5288().bindTexture(bpz.field_7757);
            float var7 = var6.method_368();
            float var8 = var6.method_369();
            float var9 = var6.method_371();
            float var10 = var6.method_372();
            float var11 = (0.0F - var4) / 2.0F;
            float var12 = var11 + var4;
            float var13 = 0.0F - var4 / 2.0F;
            float var14 = var13 + var4;
            float var15 = -0.5F;
            GL11.glTranslatef((float)(-(var5 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
            GL11.glRotatef((float)(var5 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
            var3.setVisible2();
            var3.addVertexWithUV((double)var11, (double)var13, (double)var15, (double)var8, (double)var10);
            var3.addVertexWithUV((double)var12, (double)var13, (double)var15, (double)var7, (double)var10);
            var3.addVertexWithUV((double)var12, (double)var14, (double)var15, (double)var7, (double)var9);
            var3.addVertexWithUV((double)var11, (double)var14, (double)var15, (double)var8, (double)var9);
            var3.getVisible8();
            GL11.glPopMatrix();
            ++var5;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         break;
      }

   }

   // $FF: renamed from: a () void
   public void method_3238() {
      this.field_2595 = this.field_2594;
      String[] var10000 = class_752.method_4253();
      bjk var2 = this.field_2592.cursorCounter8;
      add var3 = var2.field_3616.method_3593();
      String[] var1 = var10000;
      int var4 = this.field_2597 == var2.field_3616.field_2846 && var3 == this.field_2593?1:0;
      add var9 = this.field_2593;
      if(var1 != null) {
         label95: {
            if(this.field_2593 == null) {
               var9 = var3;
               if(var1 == null) {
                  break label95;
               }

               if(var3 == null) {
                  var4 = 1;
               }
            }

            var9 = var3;
         }
      }

      int var10;
      label104: {
         if(var1 != null) {
            if(var9 == null) {
               break label104;
            }

            var9 = this.field_2593;
         }

         if(var1 != null) {
            if(var9 == null) {
               break label104;
            }

            var9 = var3;
         }

         if(var1 != null) {
            if(var9 == this.field_2593) {
               break label104;
            }

            var9 = var3;
         }

         if(var1 != null) {
            if(var9.method_3730() != this.field_2593.method_3730()) {
               break label104;
            }

            var9 = var3;
         }

         var10 = var9.method_3745();
         if(var1 != null) {
            if(var10 != this.field_2593.method_3745()) {
               break label104;
            }

            this.field_2593 = var3;
            var10 = 1;
         }

         var4 = var10;
      }

      float var5 = 0.4F;
      float var6 = var4 != 0?1.0F:0.0F;
      float var7 = var6 - this.field_2594;
      float var11;
      var10 = (var11 = var7 - -var5) == 0.0F?0:(var11 < 0.0F?-1:1);
      if(var1 != null) {
         if(var10 < 0) {
            var7 = -var5;
         }

         float var12;
         var10 = (var12 = var7 - var5) == 0.0F?0:(var12 < 0.0F?-1:1);
      }

      bly var8;
      label105: {
         if(var1 != null) {
            if(var10 > 0) {
               var7 = var5;
            }

            this.field_2594 += var7;
            var8 = this;
            if(var1 == null) {
               break label105;
            }

            float var13;
            var10 = (var13 = this.field_2594 - 0.1F) == 0.0F?0:(var13 < 0.0F?-1:1);
         }

         if(var10 >= 0) {
            return;
         }

         this.field_2593 = var3;
         var8 = this;
      }

      var8.field_2597 = var2.field_3616.field_2846;
   }

   // $FF: renamed from: b () void
   public void method_3239() {
      this.field_2594 = 0.0F;
   }

   // $FF: renamed from: c () void
   public void method_3240() {
      this.field_2594 = 0.0F;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3241() {
      // $FF: Couldn't be decompiled
   }
}

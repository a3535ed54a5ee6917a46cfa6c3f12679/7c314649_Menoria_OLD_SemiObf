import java.util.Random;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

// $FF: renamed from: lQ
public class class_220 extends class_215 {

   // $FF: renamed from: S bqx
   private static final bqx field_1154;
   // $FF: renamed from: T bqx
   private static final bqx field_1155;
   // $FF: renamed from: U mR
   private static final class_1228 field_1156;
   // $FF: renamed from: V java.util.Random
   private Random field_1157;
   // $FF: renamed from: W Ao
   private class_683 field_1158;
   // $FF: renamed from: X int
   public int field_1159;
   // $FF: renamed from: Y float
   public float field_1160;
   // $FF: renamed from: Z float
   public float field_1161;
   // $FF: renamed from: aa float
   public float field_1162;
   // $FF: renamed from: ab float
   public float field_1163;
   // $FF: renamed from: ac float
   public float field_1164;
   // $FF: renamed from: ad float
   public float field_1165;
   // $FF: renamed from: ae add
   add field_1166;
   // $FF: renamed from: af java.lang.String
   private String field_1167;
   // $FF: renamed from: ag java.lang.String
   private static final String field_1168;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] field_1169;


   // $FF: renamed from: <init> (Af, ahb, int, int, int, java.lang.String) void
   public void method_1211(class_666 var1, ahb var2, int var3, int var4, int var5, String var6) {
      class_683 var10001 = new class_683;
      var10001.method_3703(var1, var2, var3, var4, var5);
      super.method_1192(var10001);
      this.field_1157 = new Random();
      this.field_1158 = (class_683)this.field_1107;
      this.field_1167 = var6;
   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      String var5;
      label14: {
         String[] var3 = class_752.method_4253();
         class_220 var10001 = this;
         if(var3 != null) {
            if(this.field_1167 == null) {
               String[] var4 = field_1169;
               var5 = class_1450.method_7896("container.enchant", new Object[0]);
               break label14;
            }

            var10001 = this;
         }

         var5 = var10001.field_1167;
      }

      this.fontRendererObj.method_7020(var5, 12, 5, 4210752);
      String[] var6 = field_1169;
      this.fontRendererObj.method_7020(class_1450.method_7896("container.inventory", new Object[0]), 8, this.field_1106 - 96 + 2, 4210752);
   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
      this.method_1212();
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      super.method_862(var1, var2, var3);
      int var5 = (this.width - this.field_1105) / 2;
      int var6 = (this.height - this.field_1106) / 2;
      int var7 = 0;
      String[] var4 = var10000;

      while(var7 < 3) {
         int var8 = var1 - (var5 + 60);
         int var9 = var2 - (var6 + 14 + 19 * var7);
         if(var4 != null) {
            if(var8 >= 0) {
               label59: {
                  int var10 = var9;
                  if(var4 != null) {
                     if(var9 < 0) {
                        break label59;
                     }

                     var10 = var8;
                  }

                  class_220 var11;
                  label60: {
                     label61: {
                        byte var10001 = 108;
                        if(var4 != null) {
                           if(var10 >= 108) {
                              break label59;
                           }

                           var10 = var9;
                           if(var4 == null) {
                              break label61;
                           }

                           var10001 = 19;
                        }

                        if(var10 >= var10001) {
                           break label59;
                        }

                        var11 = this;
                        if(var4 == null) {
                           break label60;
                        }

                        var10 = this.field_1158.method_3651(this.field_557.cursorCounter8, var7);
                     }

                     if(var10 == 0) {
                        break label59;
                     }

                     var11 = this;
                  }

                  var11.field_557.maxStringLength8.method_7856(this.field_1158.field_2870, var7);
               }
            }

            ++var7;
         }

         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_557.method_5288().bindTexture(field_1154);
      int var5 = (this.width - this.field_1105) / 2;
      int var6 = (this.height - this.field_1106) / 2;
      this.method_658(var5, var6, 0, 0, this.field_1105, this.field_1106);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      class_1338 var10000 = new class_1338;
      var10000.method_7060(this.field_557, this.field_557.cursorCounter2, this.field_557.cursorCounter3);
      class_1338 var7 = var10000;
      GL11.glViewport((var7.method_7061() - 320) / 2 * var7.method_7065(), (var7.method_7062() - 240) / 2 * var7.method_7065(), 320 * var7.method_7065(), 240 * var7.method_7065());
      GL11.glTranslatef(-0.34F, 0.23F, 0.0F);
      String[] var21 = class_752.method_4253();
      Project.gluPerspective(90.0F, 1.3333334F, 9.0F, 80.0F);
      float var8 = 1.0F;
      String[] var4 = var21;
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      bam.method_5213();
      GL11.glTranslatef(0.0F, 3.3F, -16.0F);
      GL11.glScalef(var8, var8, var8);
      float var9 = 5.0F;
      GL11.glScalef(var9, var9, var9);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      this.field_557.method_5288().bindTexture(field_1155);
      GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
      float var10 = this.field_1165 + (this.field_1164 - this.field_1165) * var1;
      GL11.glTranslatef((1.0F - var10) * 0.2F, (1.0F - var10) * 0.1F, (1.0F - var10) * 0.25F);
      GL11.glRotatef(-(1.0F - var10) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      float var11 = this.field_1161 + (this.field_1160 - this.field_1161) * var1 + 0.25F;
      float var12 = this.field_1161 + (this.field_1160 - this.field_1161) * var1 + 0.75F;
      var11 = (var11 - (float)class_1715.method_9560((double)var11)) * 1.6F - 0.3F;
      var12 = (var12 - (float)class_1715.method_9560((double)var12)) * 1.6F - 0.3F;
      float var24;
      int var22 = (var24 = var11 - 0.0F) == 0.0F?0:(var24 < 0.0F?-1:1);
      if(var4 != null) {
         if(var22 < 0) {
            var11 = 0.0F;
         }

         float var25;
         var22 = (var25 = var12 - 0.0F) == 0.0F?0:(var25 < 0.0F?-1:1);
      }

      if(var4 != null) {
         if(var22 < 0) {
            var12 = 0.0F;
         }

         float var26;
         var22 = (var26 = var11 - 1.0F) == 0.0F?0:(var26 < 0.0F?-1:1);
      }

      if(var4 != null) {
         if(var22 > 0) {
            var11 = 1.0F;
         }

         float var27;
         var22 = (var27 = var12 - 1.0F) == 0.0F?0:(var27 < 0.0F?-1:1);
      }

      if(var4 != null) {
         if(var22 > 0) {
            var12 = 1.0F;
         }

         GL11.glEnable('\u803a');
         field_1156.method_6511((class_689)null, 0.0F, var11, var12, var10, 0.0F, 0.0625F);
         GL11.glDisable('\u803a');
         bam.method_5212();
         GL11.glMatrixMode(5889);
         GL11.glViewport(0, 0, this.field_557.cursorCounter2, this.field_557.cursorCounter3);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         bam.method_5212();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         Gui6.field_7163.getSelectionEnd2(this.field_1158.field_2930);
         var22 = 0;
      }

      int var13 = var22;

      while(var13 < 3) {
         label120: {
            String var14;
            int var15;
            label111: {
               var14 = Gui6.field_7163.getSelectionEnd1();
               this.field_372 = 0.0F;
               this.field_557.method_5288().bindTexture(field_1154);
               var15 = this.field_1158.field_2931[var13];
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               if(var4 != null) {
                  if(var15 != 0) {
                     break label111;
                  }

                  this.method_658(var5 + 60, var6 + 14 + 19 * var13, 0, 185, 108, 19);
               }

               if(var4 != null) {
                  break label120;
               }
            }

            String var16;
            FontRenderer var17;
            int var18;
            label103: {
               var16 = "" + var15;
               var17 = this.field_557.enableBackgroundDrawing5;
               var18 = 6839882;
               var22 = this.field_557.cursorCounter8.field_3641;
               int var10001 = var15;
               if(var4 != null) {
                  if(this.field_557.cursorCounter8.field_3641 < var15) {
                     var22 = this.field_557.cursorCounter8.field_3640.field_2839;
                     if(var4 == null) {
                        break label103;
                     }

                     if(!this.field_557.cursorCounter8.field_3640.field_2839) {
                        this.method_658(var5 + 60, var6 + 14 + 19 * var13, 0, 185, 108, 19);
                        var17.drawSplitString(var14, var5 + 62, var6 + 16 + 19 * var13, 104, (var18 & 16711422) >> 1);
                        var17 = this.field_557.enableBackgroundDrawing4;
                        var18 = 4226832;
                        var17.drawStringWithShadow(var16, var5 + 62 + 104 - var17.getCharWidth(var16), var6 + 16 + 19 * var13 + 7, var18);
                        if(var4 != null) {
                           break label120;
                        }
                     }
                  }

                  var22 = var2;
                  var10001 = var5 + 60;
               }

               var22 -= var10001;
            }

            label92: {
               label121: {
                  int var19 = var22;
                  int var20 = var3 - (var6 + 14 + 19 * var13);
                  var22 = var19;
                  if(var4 != null) {
                     if(var19 < 0) {
                        break label121;
                     }

                     var22 = var20;
                  }

                  if(var4 != null) {
                     if(var22 < 0) {
                        break label121;
                     }

                     var22 = var19;
                  }

                  label122: {
                     byte var23 = 108;
                     if(var4 != null) {
                        if(var22 >= 108) {
                           break label121;
                        }

                        var22 = var20;
                        if(var4 == null) {
                           break label122;
                        }

                        var23 = 19;
                     }

                     if(var22 >= var23) {
                        break label121;
                     }

                     this.method_658(var5 + 60, var6 + 14 + 19 * var13, 0, 204, 108, 19);
                     var22 = 16777088;
                  }

                  var18 = var22;
                  if(var4 != null) {
                     break label92;
                  }
               }

               this.method_658(var5 + 60, var6 + 14 + 19 * var13, 0, 166, 108, 19);
            }

            var17.drawSplitString(var14, var5 + 62, var6 + 16 + 19 * var13, 104, var18);
            var17 = this.field_557.enableBackgroundDrawing4;
            var18 = 8453920;
            var17.drawStringWithShadow(var16, var5 + 62 + 104 - var17.getCharWidth(var16), var6 + 16 + 19 * var13 + 7, var18);
         }

         ++var13;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: g () void
   public void method_1212() {
      String[] var10000 = class_752.method_4253();
      add var2 = this.field_1107.method_3653(0).method_2875();
      String[] var1 = var10000;
      byte var7 = add.method_3756(var2, this.field_1166);
      int var3;
      int var4;
      float var5;
      float var6;
      int var8;
      float var9;
      float var10001;
      if(var1 != null) {
         if(var7 == 0) {
            this.field_1166 = var2;
            this.field_1162 += (float)(this.field_1157.nextInt(4) - this.field_1157.nextInt(4));
            if(this.field_1160 <= this.field_1162 + 1.0F) {
               float var10;
               var8 = (var10 = this.field_1160 - (this.field_1162 - 1.0F)) == 0.0F?0:(var10 < 0.0F?-1:1);
            } else {
               ++this.field_1159;
               this.field_1161 = this.field_1160;
               this.field_1165 = this.field_1164;
               var3 = 0;
               var8 = 0;
               if(var1 != null) {
                  var4 = 0;

                  while(true) {
                     if(var4 < 3) {
                        var8 = this.field_1158.field_2931[var4];
                        if(var1 == null) {
                           break;
                        }

                        label415: {
                           if(var1 != null) {
                              if(var8 == 0) {
                                 break label415;
                              }

                              var8 = 1;
                           }

                           var3 = var8;
                        }

                        ++var4;
                        if(var1 != null) {
                           continue;
                        }
                     }

                     var8 = var3;
                     break;
                  }

                  label430: {
                     if(var8 != 0) {
                        this.field_1164 += 0.2F;
                        if(var1 != null) {
                           break label430;
                        }
                     }

                     this.field_1164 -= 0.2F;
                  }

                  label500: {
                     float var11;
                     var8 = (var11 = this.field_1164 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
                     if(var1 != null) {
                        if(var8 < 0) {
                           this.field_1164 = 0.0F;
                        }

                        var9 = this.field_1164;
                        var10001 = 1.0F;
                        if(var1 == null) {
                           break label500;
                        }

                        float var12;
                        var8 = (var12 = this.field_1164 - 1.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
                     }

                     if(var8 > 0) {
                        this.field_1164 = 1.0F;
                     }

                     var9 = this.field_1162 - this.field_1160;
                     var10001 = 0.4F;
                  }

                  label465: {
                     label502: {
                        var6 = var9 * var10001;
                        var5 = 0.2F;
                        float var13;
                        var8 = (var13 = var6 - -var5) == 0.0F?0:(var13 < 0.0F?-1:1);
                        if(var1 != null) {
                           if(var8 < 0) {
                              var6 = -var5;
                           }

                           var9 = var6;
                           if(var1 == null) {
                              break label502;
                           }

                           float var14;
                           var8 = (var14 = var6 - var5) == 0.0F?0:(var14 < 0.0F?-1:1);
                        }

                        if(var8 <= 0) {
                           break label465;
                        }

                        var9 = var5;
                     }

                     var6 = var9;
                  }

                  this.field_1163 += (var6 - this.field_1163) * 0.9F;
                  this.field_1160 += this.field_1163;
                  return;
               }
            }
         } else {
            ++this.field_1159;
            this.field_1161 = this.field_1160;
            this.field_1165 = this.field_1164;
            var3 = 0;
            var8 = 0;
            if(var1 != null) {
               var4 = 0;

               while(true) {
                  if(var4 < 3) {
                     var8 = this.field_1158.field_2931[var4];
                     if(var1 == null) {
                        break;
                     }

                     label307: {
                        if(var1 != null) {
                           if(var8 == 0) {
                              break label307;
                           }

                           var8 = 1;
                        }

                        var3 = var8;
                     }

                     ++var4;
                     if(var1 != null) {
                        continue;
                     }
                  }

                  var8 = var3;
                  break;
               }

               label322: {
                  if(var8 != 0) {
                     this.field_1164 += 0.2F;
                     if(var1 != null) {
                        break label322;
                     }
                  }

                  this.field_1164 -= 0.2F;
               }

               label506: {
                  float var15;
                  var8 = (var15 = this.field_1164 - 0.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
                  if(var1 != null) {
                     if(var8 < 0) {
                        this.field_1164 = 0.0F;
                     }

                     var9 = this.field_1164;
                     var10001 = 1.0F;
                     if(var1 == null) {
                        break label506;
                     }

                     float var16;
                     var8 = (var16 = this.field_1164 - 1.0F) == 0.0F?0:(var16 < 0.0F?-1:1);
                  }

                  if(var8 > 0) {
                     this.field_1164 = 1.0F;
                  }

                  var9 = this.field_1162 - this.field_1160;
                  var10001 = 0.4F;
               }

               label357: {
                  label508: {
                     var6 = var9 * var10001;
                     var5 = 0.2F;
                     float var17;
                     var8 = (var17 = var6 - -var5) == 0.0F?0:(var17 < 0.0F?-1:1);
                     if(var1 != null) {
                        if(var8 < 0) {
                           var6 = -var5;
                        }

                        var9 = var6;
                        if(var1 == null) {
                           break label508;
                        }

                        float var18;
                        var8 = (var18 = var6 - var5) == 0.0F?0:(var18 < 0.0F?-1:1);
                     }

                     if(var8 <= 0) {
                        break label357;
                     }

                     var9 = var5;
                  }

                  var6 = var9;
               }

               this.field_1163 += (var6 - this.field_1163) * 0.9F;
               this.field_1160 += this.field_1163;
               return;
            }
         }
      } else {
         var3 = var7;
         var8 = 0;
         if(var1 != null) {
            var4 = 0;

            while(true) {
               if(var4 < 3) {
                  var8 = this.field_1158.field_2931[var4];
                  if(var1 == null) {
                     break;
                  }

                  label108: {
                     if(var1 != null) {
                        if(var8 == 0) {
                           break label108;
                        }

                        var8 = 1;
                     }

                     var3 = var8;
                  }

                  ++var4;
                  if(var1 != null) {
                     continue;
                  }
               }

               var8 = var3;
               break;
            }

            label123: {
               if(var8 != 0) {
                  this.field_1164 += 0.2F;
                  if(var1 != null) {
                     break label123;
                  }
               }

               this.field_1164 -= 0.2F;
            }

            label512: {
               float var19;
               var8 = (var19 = this.field_1164 - 0.0F) == 0.0F?0:(var19 < 0.0F?-1:1);
               if(var1 != null) {
                  if(var8 < 0) {
                     this.field_1164 = 0.0F;
                  }

                  var9 = this.field_1164;
                  var10001 = 1.0F;
                  if(var1 == null) {
                     break label512;
                  }

                  float var20;
                  var8 = (var20 = this.field_1164 - 1.0F) == 0.0F?0:(var20 < 0.0F?-1:1);
               }

               if(var8 > 0) {
                  this.field_1164 = 1.0F;
               }

               var9 = this.field_1162 - this.field_1160;
               var10001 = 0.4F;
            }

            label158: {
               label514: {
                  var6 = var9 * var10001;
                  var5 = 0.2F;
                  float var21;
                  var8 = (var21 = var6 - -var5) == 0.0F?0:(var21 < 0.0F?-1:1);
                  if(var1 != null) {
                     if(var8 < 0) {
                        var6 = -var5;
                     }

                     var9 = var6;
                     if(var1 == null) {
                        break label514;
                     }

                     float var22;
                     var8 = (var22 = var6 - var5) == 0.0F?0:(var22 < 0.0F?-1:1);
                  }

                  if(var8 <= 0) {
                     break label158;
                  }

                  var9 = var5;
               }

               var6 = var9;
            }

            this.field_1163 += (var6 - this.field_1163) * 0.9F;
            this.field_1160 += this.field_1163;
            return;
         }
      }

      while(true) {
         while(var8 < 0) {
            ++this.field_1159;
            this.field_1161 = this.field_1160;
            this.field_1165 = this.field_1164;
            var3 = 0;
            var8 = 0;
            if(var1 != null) {
               var4 = 0;

               while(true) {
                  if(var4 < 3) {
                     var8 = this.field_1158.field_2931[var4];
                     if(var1 == null) {
                        break;
                     }

                     label205: {
                        if(var1 != null) {
                           if(var8 == 0) {
                              break label205;
                           }

                           var8 = 1;
                        }

                        var3 = var8;
                     }

                     ++var4;
                     if(var1 != null) {
                        continue;
                     }
                  }

                  var8 = var3;
                  break;
               }

               label220: {
                  if(var8 != 0) {
                     this.field_1164 += 0.2F;
                     if(var1 != null) {
                        break label220;
                     }
                  }

                  this.field_1164 -= 0.2F;
               }

               label519: {
                  float var23;
                  var8 = (var23 = this.field_1164 - 0.0F) == 0.0F?0:(var23 < 0.0F?-1:1);
                  if(var1 != null) {
                     if(var8 < 0) {
                        this.field_1164 = 0.0F;
                     }

                     var9 = this.field_1164;
                     var10001 = 1.0F;
                     if(var1 == null) {
                        break label519;
                     }

                     float var24;
                     var8 = (var24 = this.field_1164 - 1.0F) == 0.0F?0:(var24 < 0.0F?-1:1);
                  }

                  if(var8 > 0) {
                     this.field_1164 = 1.0F;
                  }

                  var9 = this.field_1162 - this.field_1160;
                  var10001 = 0.4F;
               }

               label255: {
                  label521: {
                     var6 = var9 * var10001;
                     var5 = 0.2F;
                     float var25;
                     var8 = (var25 = var6 - -var5) == 0.0F?0:(var25 < 0.0F?-1:1);
                     if(var1 != null) {
                        if(var8 < 0) {
                           var6 = -var5;
                        }

                        var9 = var6;
                        if(var1 == null) {
                           break label521;
                        }

                        float var26;
                        var8 = (var26 = var6 - var5) == 0.0F?0:(var26 < 0.0F?-1:1);
                     }

                     if(var8 <= 0) {
                        break label255;
                     }

                     var9 = var5;
                  }

                  var6 = var9;
               }

               this.field_1163 += (var6 - this.field_1163) * 0.9F;
               this.field_1160 += this.field_1163;
               return;
            }
         }

         this.field_1162 += (float)(this.field_1157.nextInt(4) - this.field_1157.nextInt(4));
         if(this.field_1160 <= this.field_1162 + 1.0F) {
            float var27;
            var8 = (var27 = this.field_1160 - (this.field_1162 - 1.0F)) == 0.0F?0:(var27 < 0.0F?-1:1);
         } else {
            ++this.field_1159;
            this.field_1161 = this.field_1160;
            this.field_1165 = this.field_1164;
            var3 = 0;
            var8 = 0;
            if(var1 != null) {
               var4 = 0;

               while(true) {
                  if(var4 < 3) {
                     var8 = this.field_1158.field_2931[var4];
                     if(var1 == null) {
                        break;
                     }

                     label75: {
                        if(var1 != null) {
                           if(var8 == 0) {
                              break label75;
                           }

                           var8 = 1;
                        }

                        var3 = var8;
                     }

                     ++var4;
                     if(var1 != null) {
                        continue;
                     }
                  }

                  var8 = var3;
                  break;
               }

               label66: {
                  if(var8 != 0) {
                     this.field_1164 += 0.2F;
                     if(var1 != null) {
                        break label66;
                     }
                  }

                  this.field_1164 -= 0.2F;
               }

               label525: {
                  float var28;
                  var8 = (var28 = this.field_1164 - 0.0F) == 0.0F?0:(var28 < 0.0F?-1:1);
                  if(var1 != null) {
                     if(var8 < 0) {
                        this.field_1164 = 0.0F;
                     }

                     var9 = this.field_1164;
                     var10001 = 1.0F;
                     if(var1 == null) {
                        break label525;
                     }

                     float var29;
                     var8 = (var29 = this.field_1164 - 1.0F) == 0.0F?0:(var29 < 0.0F?-1:1);
                  }

                  if(var8 > 0) {
                     this.field_1164 = 1.0F;
                  }

                  var9 = this.field_1162 - this.field_1160;
                  var10001 = 0.4F;
               }

               label54: {
                  label527: {
                     var6 = var9 * var10001;
                     var5 = 0.2F;
                     float var30;
                     var8 = (var30 = var6 - -var5) == 0.0F?0:(var30 < 0.0F?-1:1);
                     if(var1 != null) {
                        if(var8 < 0) {
                           var6 = -var5;
                        }

                        var9 = var6;
                        if(var1 == null) {
                           break label527;
                        }

                        float var31;
                        var8 = (var31 = var6 - var5) == 0.0F?0:(var31 < 0.0F?-1:1);
                     }

                     if(var8 <= 0) {
                        break label54;
                     }

                     var9 = var5;
                  }

                  var6 = var9;
               }

               this.field_1163 += (var6 - this.field_1163) * 0.9F;
               this.field_1160 += this.field_1163;
               return;
            }
         }
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      // $FF: Couldn't be decompiled
   }
}

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.item.ItemSuperBow;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: oS
public class class_826 extends boh {

   // $FF: renamed from: g bqx
   private static final bqx field_3847;
   // $FF: renamed from: h mX
   private class_1242 field_3848;
   // $FF: renamed from: k mX
   private class_1242 field_3849;
   // $FF: renamed from: l mX
   private class_1242 field_3850;
   // $FF: renamed from: m java.lang.String
   private static final String field_3851;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_3852;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1242 var10001 = new class_1242;
      var10001.drawCenteredString0(0.0F);
      super.method_4798(var10001, 0.5F);
      this.field_3848 = (class_1242)this.field_3844;
      var10001 = new class_1242;
      var10001.drawCenteredString0(1.0F);
      this.field_3849 = var10001;
      var10001 = new class_1242;
      var10001.drawCenteredString0(0.5F);
      this.field_3850 = var10001;
   }

   // $FF: renamed from: b (xf, int, float) int
   protected int method_4819(class_794 var1, int var2, float var3) {
      byte var14;
      label135: {
         String[] var10000 = class_752.method_4253();
         add var5 = var1.field_3616.method_3612(3 - var2);
         String[] var4 = var10000;
         add var13 = var5;
         if(var4 != null) {
            if(var5 == null) {
               break label135;
            }

            var13 = var5;
         }

         adb var6 = var13.method_3730();
         var14 = var6 instanceof class_525;
         if(var4 == null) {
            return var14;
         }

         if(var14 != 0) {
            class_525 var7;
            class_1242 var16;
            label122: {
               var7 = (class_525)var6;
               class_826 var15 = this;
               if(var4 != null) {
                  this.method_4732(class_851.method_4917(var7, var2));
                  if(var2 == 2) {
                     var16 = this.field_3850;
                     break label122;
                  }

                  var15 = this;
               }

               var16 = var15.field_3849;
            }

            class_1242 var8 = var16;
            int var10001 = var2;
            if(var4 != null) {
               var10001 = var2 == 0?1:0;
            }

            var8.field_6460.field_6554 = (boolean)var10001;
            var10001 = var2;
            if(var4 != null) {
               var10001 = var2 == 0?1:0;
            }

            var8.field_6461.field_6554 = (boolean)var10001;
            var10001 = var2;
            if(var4 != null) {
               label112: {
                  if(var2 != 1) {
                     var10001 = var2;
                     if(var4 == null) {
                        break label112;
                     }

                     if(var2 != 2) {
                        var10001 = 0;
                        break label112;
                     }
                  }

                  var10001 = 1;
               }
            }

            var8.field_6462.field_6554 = (boolean)var10001;
            var10001 = var2;
            if(var4 != null) {
               var10001 = var2 == 1?1:0;
            }

            var8.field_6463.field_6554 = (boolean)var10001;
            var10001 = var2;
            if(var4 != null) {
               var10001 = var2 == 1?1:0;
            }

            var8.field_6464.field_6554 = (boolean)var10001;
            var10001 = var2;
            if(var4 != null) {
               label101: {
                  if(var2 != 2) {
                     var10001 = var2;
                     if(var4 == null) {
                        break label101;
                     }

                     if(var2 != 3) {
                        var10001 = 0;
                        break label101;
                     }
                  }

                  var10001 = 1;
               }
            }

            var8.field_6465.field_6554 = (boolean)var10001;
            var10001 = var2;
            if(var4 != null) {
               label93: {
                  if(var2 != 2) {
                     var10001 = var2;
                     if(var4 == null) {
                        break label93;
                     }

                     if(var2 != 3) {
                        var10001 = 0;
                        break label93;
                     }
                  }

                  var10001 = 1;
               }
            }

            var8.field_6466.field_6554 = (boolean)var10001;
            this.method_4799(var8);
            var8.field_6259 = this.field_3844.field_6259;
            var8.field_6260 = this.field_3844.field_6260;
            var8.field_6262 = this.field_3844.field_6262;
            byte var17;
            if(var4 != null) {
               if(var7.method_2991() == class_131.field_306) {
                  int var9 = var7.method_2993(var5);
                  float var10 = (float)(var9 >> 16 & 255) / 255.0F;
                  float var11 = (float)(var9 >> 8 & 255) / 255.0F;
                  float var12 = (float)(var9 & 255) / 255.0F;
                  GL11.glColor3f(var10, var11, var12);
                  var17 = var5.method_3779();
                  if(var4 != null) {
                     if(var17 != 0) {
                        return 31;
                     }

                     var17 = 16;
                  }

                  return var17;
               }

               GL11.glColor3f(1.0F, 1.0F, 1.0F);
            }

            var17 = var5.method_3779();
            if(var4 != null) {
               if(var17 != 0) {
                  return 15;
               }

               var17 = 1;
            }

            return var17;
         }
      }

      var14 = -1;
      return var14;
   }

   // $FF: renamed from: c (xf, int, float) void
   protected void method_4820(class_794 var1, int var2, float var3) {
      add var5 = var1.field_3616.method_3612(3 - var2);
      String[] var4 = class_752.method_4253();
      add var10000 = var5;
      if(var4 != null) {
         if(var5 == null) {
            return;
         }

         var10000 = var5;
      }

      adb var6 = var10000.method_3730();
      if(var4 != null) {
         if(!(var6 instanceof class_525)) {
            return;
         }

         class_525 var10001 = (class_525)var6;
         String[] var10003 = field_3852;
         this.method_4732(class_851.method_4918(var10001, var2, "overlay"));
      }

      GL11.glColor3f(1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: b (xf, double, double, double, float, float) void
   public void method_4821(class_794 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      String[] var10 = var10000;
      add var11 = var1.field_3616.method_3593();
      this.field_3849.field_6470 = this.field_3850.field_6470 = this.field_3848.field_6470 = var11 != null?1:0;
      if(var10 != null) {
         if(var11 != null && var1.method_4556() > 0) {
            label35: {
               class_92 var12 = var11.method_3764();
               class_92 var15 = var12;
               class_92 var10001 = class_92.field_26;
               if(var10 != null) {
                  if(var12 == class_92.field_26) {
                     this.field_3849.field_6470 = this.field_3850.field_6470 = this.field_3848.field_6470 = 3;
                     if(var10 != null) {
                        break label35;
                     }
                  }

                  var15 = var12;
                  var10001 = class_92.field_27;
               }

               if(var15 == var10001) {
                  this.field_3849.field_6472 = this.field_3850.field_6472 = this.field_3848.field_6472 = true;
               }
            }
         }

         this.field_3849.field_6471 = this.field_3850.field_6471 = this.field_3848.field_6471 = var1.method_3938();
      }

      double var14 = var4 - (double)var1.field_3013;
      if(var10 != null) {
         if(var1.method_3938() && !(var1 instanceof class_796)) {
            var14 -= 0.125D;
         }

         super.method_4801(var1, var2, var14, var6, var8, var9);
         this.field_3849.field_6472 = this.field_3850.field_6472 = this.field_3848.field_6472 = false;
         this.field_3849.field_6471 = this.field_3850.field_6471 = this.field_3848.field_6471 = false;
         this.field_3849.field_6470 = this.field_3850.field_6470 = this.field_3848.field_6470 = 0;
      }

   }

   // $FF: renamed from: b (xf) bqx
   protected bqx method_4822(class_794 var1) {
      return var1.method_4662();
   }

   // $FF: renamed from: b (xf, float) void
   protected void method_4823(class_794 var1, float var2) {
      String[] var3;
      float var5;
      add var29;
      boolean var31;
      label223: {
         GL11.glColor3f(1.0F, 1.0F, 1.0F);
         String[] var10000 = class_752.method_4253();
         super.method_4807(var1, var2);
         var3 = var10000;
         super.method_4808(var1, var2);
         add var4 = var1.field_3616.method_3612(3);
         var29 = var4;
         if(var3 != null) {
            if(var4 == null) {
               break label223;
            }

            GL11.glPushMatrix();
            this.field_3848.field_6460.method_6648(0.0625F);
            var29 = var4;
         }

         label214: {
            adb var30 = var29.method_3730();
            if(var3 != null) {
               if(var30 instanceof abh) {
                  if(blm.drawTextBox7(aji.method_2417(var4.method_3730()).method_2436())) {
                     var5 = 0.625F;
                     GL11.glTranslatef(0.0F, -0.25F, 0.0F);
                     GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                     GL11.glScalef(var5, -var5, -var5);
                  }

                  this.field_3788.field_7424.method_3231(var1, var4, 0);
                  if(var3 != null) {
                     break label214;
                  }
               }

               var30 = var4.method_3730();
            }

            if(var30 == class_1010.field_5253) {
               GameProfile var6;
               label224: {
                  var5 = 1.0625F;
                  GL11.glScalef(var5, -var5, -var5);
                  var6 = null;
                  var29 = var4;
                  if(var3 != null) {
                     if(!var4.method_3766()) {
                        break label224;
                     }

                     var29 = var4;
                  }

                  class_1583 var7 = var29.method_3767();
                  String[] var22 = field_3852;
                  var31 = var7.initGui8("SkullOwner", 10);
                  if(var3 != null) {
                     if(var31) {
                        var6 = class_1570.method_8624(var7.method_8688("SkullOwner"));
                        break label224;
                     }

                     var22 = field_3852;
                     var31 = var7.initGui8("SkullOwner", 8);
                  }

                  if(var3 != null) {
                     if(!var31) {
                        break label224;
                     }

                     var22 = field_3852;
                     var31 = class_1723.method_9630(var7.method_8685("SkullOwner"));
                  }

                  if(!var31) {
                     GameProfile var32 = new GameProfile;
                     UUID var10002 = (UUID)null;
                     String[] var10004 = field_3852;
                     var32.method_1305(var10002, var7.method_8685("SkullOwner"));
                     var6 = var32;
                  }
               }

               class_616.field_2669.method_3401(-0.5F, 0.0F, -0.5F, 1, 180.0F, var4.method_3745(), var6);
            }
         }

         GL11.glPopMatrix();
      }

      float var24;
      class_794 var33;
      int var34;
      label189: {
         label188: {
            boolean var23 = var1.method_4660();
            var31 = var23;
            if(var3 != null) {
               if(!var23) {
                  break label188;
               }

               var33 = var1;
               if(var3 == null) {
                  break label189;
               }

               var31 = var1.method_3942();
            }

            if(!var31) {
               var33 = var1;
               if(var3 == null) {
                  break label189;
               }

               if(!var1.method_4633()) {
                  double var8;
                  double var12;
                  double var14;
                  double var16;
                  float var10001;
                  float var18;
                  float var35;
                  label227: {
                     this.method_4732(var1.method_4663());
                     GL11.glPushMatrix();
                     GL11.glTranslatef(0.0F, 0.0F, 0.125F);
                     var8 = var1.field_3625 + (var1.field_3628 - var1.field_3625) * (double)var2 - (var1.field_2991 + (var1.field_2994 - var1.field_2991) * (double)var2);
                     double var10 = var1.field_3626 + (var1.field_3629 - var1.field_3626) * (double)var2 - (var1.field_2992 + (var1.field_2995 - var1.field_2992) * (double)var2);
                     var12 = var1.field_3627 + (var1.field_3630 - var1.field_3627) * (double)var2 - (var1.field_2993 + (var1.field_2996 - var1.field_2993) * (double)var2);
                     var24 = var1.field_3331 + (var1.field_3330 - var1.field_3331) * var2;
                     var14 = (double)class_1715.method_9555(var24 * 3.1415927F / 180.0F);
                     var16 = (double)(-class_1715.method_9556(var24 * 3.1415927F / 180.0F));
                     var18 = (float)var10 * 10.0F;
                     float var36;
                     var34 = (var36 = var18 - -6.0F) == 0.0F?0:(var36 < 0.0F?-1:1);
                     if(var3 != null) {
                        if(var34 < 0) {
                           var18 = -6.0F;
                        }

                        var35 = var18;
                        var10001 = 32.0F;
                        if(var3 == null) {
                           break label227;
                        }

                        float var37;
                        var34 = (var37 = var18 - 32.0F) == 0.0F?0:(var37 < 0.0F?-1:1);
                     }

                     if(var34 > 0) {
                        var18 = 32.0F;
                     }

                     var35 = (float)(var8 * var14 + var12 * var16);
                     var10001 = 100.0F;
                  }

                  float var19 = var35 * var10001;
                  float var20 = (float)(var8 * var16 - var12 * var14) * 100.0F;
                  var35 = var19;
                  var10001 = 0.0F;
                  if(var3 != null) {
                     if(var19 < 0.0F) {
                        var19 = 0.0F;
                     }

                     var35 = var1.field_3622;
                     var10001 = (var1.field_3623 - var1.field_3622) * var2;
                  }

                  float var21 = var35 + var10001;
                  var18 += class_1715.method_9555((var1.field_3016 + (var1.field_3017 - var1.field_3016) * var2) * 6.0F) * 32.0F * var21;
                  if(var3 != null) {
                     if(var1.method_3938()) {
                        var18 += 25.0F;
                     }

                     GL11.glRotatef(6.0F + var19 / 2.0F + var18, 1.0F, 0.0F, 0.0F);
                     GL11.glRotatef(var20 / 2.0F, 0.0F, 0.0F, 1.0F);
                     GL11.glRotatef(-var20 / 2.0F, 0.0F, 1.0F, 0.0F);
                     GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                     this.field_3848.drawCenteredString3(0.0625F);
                  }

                  GL11.glPopMatrix();
               }
            }
         }

         var33 = var1;
      }

      add var25 = var33.field_3616.method_3593();
      if(var3 != null) {
         if(var25 == null) {
            return;
         }

         GL11.glPushMatrix();
         this.field_3848.field_6463.method_6648(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
      }

      if(var1.field_3650 != null) {
         var29 = new add;
         var29.method_3724(class_1010.field_5138);
         var25 = var29;
      }

      class_92 var9 = null;
      if(var1.method_4556() > 0) {
         var9 = var25.method_3764();
      }

      label230: {
         var31 = var25.method_3730() instanceof abh;
         if(var3 != null) {
            label157: {
               if(var31) {
                  var31 = blm.drawTextBox7(aji.method_2417(var25.method_3730()).method_2436());
                  if(var3 == null) {
                     break label157;
                  }

                  if(var31) {
                     var5 = 0.5F;
                     GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
                     var5 *= 0.75F;
                     GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
                     GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
                     GL11.glScalef(-var5, -var5, var5);
                     if(var3 != null) {
                        break label230;
                     }
                  }
               }

               var31 = var25.method_3730() instanceof class_573;
            }
         }

         label148: {
            label147: {
               label231: {
                  if(var3 != null) {
                     if(var31) {
                        break label231;
                     }

                     var31 = var25.method_3730() instanceof ItemSuperBow;
                  }

                  if(var3 == null) {
                     break label148;
                  }

                  if(!var31) {
                     break label147;
                  }
               }

               var5 = 0.625F;
               GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
               GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
               GL11.glScalef(var5, -var5, var5);
               GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
               if(var3 != null) {
                  break label230;
               }
            }

            var31 = var25.method_3730().method_2942();
         }

         if(var31) {
            var5 = 0.625F;
            var34 = var25.method_3730().method_2943();
            if(var3 != null) {
               if(var34 != 0) {
                  GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
                  GL11.glTranslatef(0.0F, -0.125F, 0.0F);
               }

               var34 = var1.method_4556();
            }

            if(var34 > 0 && var9 == class_92.field_26) {
               GL11.glTranslatef(0.05F, 0.0F, -0.1F);
               GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-10.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(-60.0F, 0.0F, 0.0F, 1.0F);
            }

            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            if(var3 != null) {
               break label230;
            }
         }

         var5 = 0.375F;
         GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
         GL11.glScalef(var5, var5, var5);
         GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
      }

      label124: {
         var34 = var25.method_3730().method_2970();
         float var11;
         int var26;
         float var27;
         if(var3 != null) {
            if(var34 != 0) {
               var26 = 0;

               do {
                  if(var26 > 1) {
                     break label124;
                  }

                  int var13 = var25.method_3730().method_2953(var25, var26);
                  var27 = (float)(var13 >> 16 & 255) / 255.0F;
                  var11 = (float)(var13 >> 8 & 255) / 255.0F;
                  var24 = (float)(var13 & 255) / 255.0F;
                  GL11.glColor4f(var27, var11, var24, 1.0F);
                  this.field_3788.field_7424.method_3231(var1, var25, var26);
                  ++var26;
                  if(var3 == null) {
                     return;
                  }
               } while(var3 != null);
            }

            var34 = var25.method_3730().method_2953(var25, 0);
         }

         var26 = var34;
         float var28 = (float)(var26 >> 16 & 255) / 255.0F;
         var27 = (float)(var26 >> 8 & 255) / 255.0F;
         var11 = (float)(var26 & 255) / 255.0F;
         GL11.glColor4f(var28, var27, var11, 1.0F);
         this.field_3788.field_7424.method_3231(var1, var25, 0);
      }

      GL11.glPopMatrix();
   }

   // $FF: renamed from: c (xf, float) void
   protected void method_4824(class_794 var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   // $FF: renamed from: b (xf, double, double, double, java.lang.String, float, double) void
   protected void method_4825(class_794 var1, double var2, double var4, double var6, String var8, float var9, double var10) {
      String[] var12 = class_752.method_4253();
      if(var10 < 100.0D) {
         class_1348 var13 = var1.method_4634();
         class_1344 var14 = var13.method_7172(2);
         if(var14 != null) {
            label20: {
               class_1345 var15;
               label19: {
                  var15 = var13.method_7163(var1.method_64(), var14);
                  if(var12 != null) {
                     if(!var1.method_4229()) {
                        break label19;
                     }

                     this.method_4743(var1, var15.writeText2() + " " + var14.GuiTextField9(), var2, var4 - 1.5D, var6, 64);
                  }

                  if(var12 != null) {
                     break label20;
                  }
               }

               this.method_4743(var1, var15.writeText2() + " " + var14.GuiTextField9(), var2, var4, var6, 64);
            }

            var4 += (double)((float)this.method_4741().FONT_HEIGHT * 1.15F * var9);
         }
      }

      String var17 = "❤";
      StringBuilder var10005 = (new StringBuilder()).append(var8);
      String[] var16 = field_3852;
      super.method_4817(var1, var2, var4, var6, var10005.append("  ").append((int)var1.method_406()).append("§c").append(var17).toString(), var9, var10);
   }

   // $FF: renamed from: b (yz) void
   public void method_4826(class_792 var1) {
      float var2 = 1.0F;
      GL11.glColor3f(var2, var2, var2);
      this.field_3848.field_6259 = 0.0F;
      this.field_3848.method_6512(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, var1);
      this.field_3848.field_6463.method_6646(0.0625F);
   }

   // $FF: renamed from: b (xf, double, double, double) void
   protected void method_4827(class_794 var1, double var2, double var4, double var6) {
      label18: {
         String[] var8 = class_752.method_4253();
         boolean var10000 = var1.method_3917();
         if(var8 != null) {
            if(!var10000) {
               break label18;
            }

            var10000 = var1.method_4229();
         }

         if(var10000) {
            super.method_4803(var1, var2 + (double)var1.field_3634, var4 + (double)var1.field_3635, var6 + (double)var1.field_3636);
            if(var8 != null) {
               return;
            }
         }
      }

      super.method_4803(var1, var2, var4, var6);
   }

   // $FF: renamed from: b (xf, float, float, float) void
   protected void method_4828(class_794 var1, float var2, float var3, float var4) {
      label25: {
         String[] var5;
         class_794 var6;
         label28: {
            var5 = class_752.method_4253();
            boolean var10000 = var1.method_3917();
            if(var5 != null) {
               if(!var10000) {
                  break label25;
               }

               var6 = var1;
               if(var5 == null) {
                  break label28;
               }

               var10000 = var1.method_4229();
            }

            if(!var10000) {
               break label25;
            }

            var6 = var1;
         }

         GL11.glRotatef(var6.method_4605(), 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.method_4812(var1), 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
         if(var5 != null) {
            return;
         }
      }

      super.method_4804(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (sv, double, double, double, java.lang.String, float, double) void
   protected void method_4817(class_752 var1, double var2, double var4, double var6, String var8, float var9, double var10) {
      this.method_4825((class_794)var1, var2, var4, var6, var8, var9, var10);
   }

   // $FF: renamed from: a (sv, float) void
   protected void method_4814(class_752 var1, float var2) {
      this.method_4824((class_794)var1, var2);
   }

   // $FF: renamed from: c (sv, int, float) void
   protected void method_4811(class_752 var1, int var2, float var3) {
      this.method_4820((class_794)var1, var2, var3);
   }

   // $FF: renamed from: a (sv, int, float) int
   protected int method_4810(class_752 var1, int var2, float var3) {
      return this.method_4819((class_794)var1, var2, var3);
   }

   // $FF: renamed from: c (sv, float) void
   protected void method_4807(class_752 var1, float var2) {
      this.method_4823((class_794)var1, var2);
   }

   // $FF: renamed from: a (sv, float, float, float) void
   protected void method_4804(class_752 var1, float var2, float var3, float var4) {
      this.method_4828((class_794)var1, var2, var3, var4);
   }

   // $FF: renamed from: a (sv, double, double, double) void
   protected void method_4803(class_752 var1, double var2, double var4, double var6) {
      this.method_4827((class_794)var1, var2, var4, var6);
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4821((class_794)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4822((class_794)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4821((class_794)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      // $FF: Couldn't be decompiled
   }
}

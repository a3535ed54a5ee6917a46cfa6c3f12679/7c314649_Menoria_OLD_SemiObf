import com.mojang.authlib.GameProfile;
import java.util.Map;
import java.util.UUID;
import net.minecraft.item.ItemSuperBow;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: oA
public class class_851 extends class_827 {

   // $FF: renamed from: h mX
   protected class_1242 field_3917;
   // $FF: renamed from: k float
   protected float field_3918;
   // $FF: renamed from: l mX
   protected class_1242 field_3919;
   // $FF: renamed from: m mX
   protected class_1242 field_3920;
   // $FF: renamed from: n java.util.Map
   private static final Map field_3921;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_3922;
   // $FF: renamed from: p java.lang.String
   private static final String field_3923;
   // $FF: renamed from: q java.lang.String[]
   private static final String[] field_3924;


   // $FF: renamed from: <init> (mX, float) void
   public void method_4914(class_1242 var1, float var2) {
      this.method_4915(var1, var2, 1.0F);
   }

   // $FF: renamed from: <init> (mX, float, float) void
   public void method_4915(class_1242 var1, float var2, float var3) {
      super.method_4798(var1, var2);
      this.field_3917 = var1;
      this.field_3918 = var3;
      this.method_4916();
   }

   // $FF: renamed from: b () void
   protected void method_4916() {
      class_1242 var10001 = new class_1242;
      var10001.drawCenteredString0(1.0F);
      this.field_3919 = var10001;
      var10001 = new class_1242;
      var10001.drawCenteredString0(0.5F);
      this.field_3920 = var10001;
   }

   // $FF: renamed from: b (bj, int) bqx
   public static bqx method_4917(class_525 var0, int var1) {
      return method_4918(var0, var1, (String)null);
   }

   // $FF: renamed from: b (bj, int, java.lang.String) bqx
   public static bqx method_4918(class_525 var0, int var1, String var2) {
      String[] var3 = class_752.method_4253();
      String[] var6 = field_3924;
      Object[] var10001 = new Object[]{field_3922[var0.field_2367], null, null};
      int var10004 = var1;
      if(var3 != null) {
         var10004 = var1 == 2?2:1;
      }

      String var7;
      label29: {
         var10001[1] = Integer.valueOf(var10004);
         var7 = var2;
         if(var3 != null) {
            if(var2 == null) {
               var7 = "";
               break label29;
            }

            String[] var8 = field_3924;
            var7 = "_%s";
         }

         var7 = String.format(var7, new Object[]{var2});
      }

      var10001[2] = var7;
      String var4 = String.format("textures/models/armor/%s_layer_%d%s.png", var10001);
      bqx var5 = (bqx)field_3921.get(var4);
      bqx var10000 = var5;
      if(var3 != null) {
         if(var5 == null) {
            var10000 = new bqx;
            var10000.method_8227(var4);
            var5 = var10000;
            field_3921.put(var4, var5);
         }

         var10000 = var5;
      }

      return var10000;
   }

   // $FF: renamed from: b (sw, int, float) int
   protected int method_4919(class_753 var1, int var2, float var3) {
      byte var14;
      label135: {
         String[] var10000 = class_752.method_4253();
         add var5 = var1.method_4277(3 - var2);
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
               class_851 var15 = this;
               if(var4 != null) {
                  this.method_4732(method_4917(var7, var2));
                  if(var2 == 2) {
                     var16 = this.field_3920;
                     break label122;
                  }

                  var15 = this;
               }

               var16 = var15.field_3919;
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

   // $FF: renamed from: c (sw, int, float) void
   protected void method_4920(class_753 var1, int var2, float var3) {
      String[] var10000 = class_752.method_4253();
      add var5 = var1.method_4277(3 - var2);
      String[] var4 = var10000;
      add var8 = var5;
      if(var4 != null) {
         if(var5 == null) {
            return;
         }

         var8 = var5;
      }

      adb var6 = var8.method_3730();
      if(var4 != null) {
         if(!(var6 instanceof class_525)) {
            return;
         }

         class_525 var10001 = (class_525)var6;
         String[] var10003 = field_3924;
         this.method_4732(method_4918(var10001, var2, "overlay"));
      }

      float var7 = 1.0F;
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (sw, double, double, double, float, float) void
   public void method_4830(class_753 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      String[] var10 = var10000;
      add var11 = var1.method_4214();
      this.method_4922(var1, var11);
      double var12 = var4 - (double)var1.field_3013;
      if(var10 != null) {
         if(var1.method_3938()) {
            var12 -= 0.125D;
         }

         super.method_4830(var1, var2, var12, var6, var8, var9);
         this.field_3919.field_6472 = this.field_3920.field_6472 = this.field_3917.field_6472 = false;
         this.field_3919.field_6471 = this.field_3920.field_6471 = this.field_3917.field_6471 = false;
         this.field_3919.field_6470 = this.field_3920.field_6470 = this.field_3917.field_6470 = 0;
      }

   }

   // $FF: renamed from: b (sw) bqx
   protected bqx method_4921(class_753 var1) {
      return null;
   }

   // $FF: renamed from: b (sw, add) void
   protected void method_4922(class_753 var1, add var2) {
      this.field_3919.field_6470 = this.field_3920.field_6470 = this.field_3917.field_6470 = var2 != null?1:0;
      this.field_3919.field_6471 = this.field_3920.field_6471 = this.field_3917.field_6471 = var1.method_3938();
   }

   // $FF: renamed from: b (sw, float) void
   protected void method_4923(class_753 var1, float var2) {
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      String[] var10000 = class_752.method_4253();
      super.method_4807(var1, var2);
      String[] var3 = var10000;
      add var4 = var1.method_4214();
      add var5 = var1.method_4277(3);
      add var17 = var5;
      adb var6;
      float var7;
      adb var18;
      boolean var19;
      if(var3 != null) {
         if(var5 != null) {
            label157: {
               GL11.glPushMatrix();
               this.field_3917.field_6460.method_6648(0.0625F);
               var6 = var5.method_3730();
               var18 = var6;
               if(var3 != null) {
                  if(var6 instanceof abh) {
                     if(blm.drawTextBox7(aji.method_2417(var6).method_2436())) {
                        var7 = 0.625F;
                        GL11.glTranslatef(0.0F, -0.25F, 0.0F);
                        GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                        GL11.glScalef(var7, -var7, -var7);
                     }

                     this.field_3788.field_7424.method_3231(var1, var5, 0);
                     if(var3 != null) {
                        break label157;
                     }
                  }

                  var18 = var6;
               }

               if(var18 == class_1010.field_5253) {
                  GameProfile var8;
                  label164: {
                     var7 = 1.0625F;
                     GL11.glScalef(var7, -var7, -var7);
                     var8 = null;
                     var17 = var5;
                     if(var3 != null) {
                        if(!var5.method_3766()) {
                           break label164;
                        }

                        var17 = var5;
                     }

                     class_1583 var9 = var17.method_3767();
                     String[] var13 = field_3924;
                     var19 = var9.initGui8("SkullOwner", 10);
                     if(var3 != null) {
                        if(var19) {
                           var8 = class_1570.method_8624(var9.method_8688("SkullOwner"));
                           break label164;
                        }

                        var13 = field_3924;
                        var19 = var9.initGui8("SkullOwner", 8);
                     }

                     if(var3 != null) {
                        if(!var19) {
                           break label164;
                        }

                        var13 = field_3924;
                        var19 = class_1723.method_9630(var9.method_8685("SkullOwner"));
                     }

                     if(!var19) {
                        GameProfile var20 = new GameProfile;
                        UUID var10002 = (UUID)null;
                        String[] var10004 = field_3924;
                        var20.method_1305(var10002, var9.method_8685("SkullOwner"));
                        var8 = var20;
                     }
                  }

                  class_616.field_2669.method_3401(-0.5F, 0.0F, -0.5F, 1, 180.0F, var5.method_3745(), var8);
               }
            }

            GL11.glPopMatrix();
         }

         var17 = var4;
      }

      if(var3 != null) {
         if(var17 == null) {
            return;
         }

         var17 = var4;
      }

      var18 = var17.method_3730();
      if(var3 != null) {
         if(var18 == null) {
            return;
         }

         var18 = var4.method_3730();
      }

      var6 = var18;
      GL11.glPushMatrix();
      var19 = this.field_3844.field_6262;
      if(var3 != null) {
         if(this.field_3844.field_6262) {
            var7 = 0.5F;
            GL11.glTranslatef(0.0F, 0.625F, 0.0F);
            GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
            GL11.glScalef(var7, var7, var7);
         }

         this.field_3917.field_6463.method_6648(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         var19 = var6 instanceof abh;
      }

      label166: {
         if(var3 != null) {
            label118: {
               if(var19) {
                  var19 = blm.drawTextBox7(aji.method_2417(var6).method_2436());
                  if(var3 == null) {
                     break label118;
                  }

                  if(var19) {
                     var7 = 0.5F;
                     GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
                     var7 *= 0.75F;
                     GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
                     GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
                     GL11.glScalef(-var7, -var7, var7);
                     if(var3 != null) {
                        break label166;
                     }
                  }
               }

               var19 = var6 instanceof class_573;
            }
         }

         label109: {
            label108: {
               label167: {
                  if(var3 != null) {
                     if(var19) {
                        break label167;
                     }

                     var19 = var6 instanceof ItemSuperBow;
                  }

                  if(var3 == null) {
                     break label109;
                  }

                  if(!var19) {
                     break label108;
                  }
               }

               var7 = 0.625F;
               GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
               GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
               GL11.glScalef(var7, -var7, var7);
               GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
               if(var3 != null) {
                  break label166;
               }
            }

            var19 = var6.method_2942();
         }

         if(var19) {
            var7 = 0.625F;
            if(var3 != null) {
               if(var6.method_2943()) {
                  GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
                  GL11.glTranslatef(0.0F, -0.125F, 0.0F);
               }

               this.method_4924();
               GL11.glScalef(var7, -var7, var7);
               GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }

            if(var3 != null) {
               break label166;
            }
         }

         var7 = 0.375F;
         GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
         GL11.glScalef(var7, var7, var7);
         GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
      }

      label89: {
         int var21 = var4.method_3730().method_2970();
         int var10;
         float var14;
         float var15;
         if(var3 != null) {
            if(var21 != 0) {
               var10 = 0;

               do {
                  if(var10 > 1) {
                     break label89;
                  }

                  int var11 = var4.method_3730().method_2953(var4, var10);
                  var14 = (float)(var11 >> 16 & 255) / 255.0F;
                  var15 = (float)(var11 >> 8 & 255) / 255.0F;
                  float var12 = (float)(var11 & 255) / 255.0F;
                  GL11.glColor4f(var14, var15, var12, 1.0F);
                  this.field_3788.field_7424.method_3231(var1, var4, var10);
                  ++var10;
                  if(var3 == null) {
                     return;
                  }
               } while(var3 != null);
            }

            var21 = var4.method_3730().method_2953(var4, 0);
         }

         var10 = var21;
         float var16 = (float)(var10 >> 16 & 255) / 255.0F;
         var14 = (float)(var10 >> 8 & 255) / 255.0F;
         var15 = (float)(var10 & 255) / 255.0F;
         GL11.glColor4f(var16, var14, var15, 1.0F);
         this.field_3788.field_7424.method_3231(var1, var4, 0);
      }

      GL11.glPopMatrix();
   }

   // $FF: renamed from: f () void
   protected void method_4924() {
      GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
   }

   // $FF: renamed from: c (sv, int, float) void
   protected void method_4811(class_752 var1, int var2, float var3) {
      this.method_4920((class_753)var1, var2, var3);
   }

   // $FF: renamed from: a (sv, int, float) int
   protected int method_4810(class_752 var1, int var2, float var3) {
      return this.method_4919((class_753)var1, var2, var3);
   }

   // $FF: renamed from: c (sv, float) void
   protected void method_4807(class_752 var1, float var2) {
      this.method_4923((class_753)var1, var2);
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4830((class_753)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4921((class_753)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4830((class_753)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      // $FF: Couldn't be decompiled
   }
}

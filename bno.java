import org.lwjgl.opengl.GL11;

public abstract class bno {

   // $FF: renamed from: a bqx
   private static final bqx field_3787;
   // $FF: renamed from: b bnn
   protected bnn field_3788;
   // $FF: renamed from: c blm
   protected blm field_3789;
   // $FF: renamed from: d float
   protected float field_3790;
   // $FF: renamed from: e float
   protected float field_3791;
   // $FF: renamed from: f boolean
   private boolean field_3792;
   private static final String __OBFID;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_3793;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super();
      blm var10001 = new blm;
      var10001.method_7203();
      this.field_3789 = var10001;
      this.field_3791 = 1.0F;
      this.field_3792 = false;
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public abstract void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9);

   // $FF: renamed from: a (sa) bqx
   protected abstract bqx method_4729(class_689 var1);

   // $FF: renamed from: a () boolean
   public boolean method_4730() {
      return this.field_3792;
   }

   // $FF: renamed from: b (sa) void
   protected void method_4731(class_689 var1) {
      this.method_4732(this.method_4729(var1));
   }

   // $FF: renamed from: a (bqx) void
   protected void method_4732(bqx var1) {
      this.field_3788.field_7423.bindTexture(var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float) void
   private void method_4733(class_689 var1, double var2, double var4, double var6, float var8) {
      GL11.glDisable(2896);
      class_73 var10 = class_1192.field_6078.method_2805(0);
      class_73 var11 = class_1192.field_6078.method_2805(1);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var12 = var1.field_3014 * 1.4F;
      GL11.glScalef(var12, var12, var12);
      String[] var10000 = class_752.method_4253();
      bmh var13 = bmh.instance;
      float var14 = 0.5F;
      float var15 = 0.0F;
      float var16 = var1.field_3015 / var12;
      String[] var9 = var10000;
      float var17 = (float)(var1.field_2995 - var1.field_3004.field_6910);
      GL11.glRotatef(-this.field_3788.field_7428, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, -0.3F + (float)((int)var16) * 0.02F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var18 = 0.0F;
      int var19 = 0;
      var13.setVisible2();

      int var26;
      while(true) {
         if(var16 > 0.0F) {
            var26 = var19 % 2;
            if(var9 == null) {
               break;
            }

            class_73 var20 = var26 == 0?var10:var11;
            this.method_4732(bpz.field_7757);
            float var21 = var20.method_368();
            float var22 = var20.method_371();
            float var23 = var20.method_369();
            float var24 = var20.method_372();
            if(var9 != null) {
               if(var19 / 2 % 2 == 0) {
                  float var25 = var23;
                  var23 = var21;
                  var21 = var25;
               }

               var13.addVertexWithUV((double)(var14 - var15), (double)(0.0F - var17), (double)var18, (double)var23, (double)var24);
               var13.addVertexWithUV((double)(-var14 - var15), (double)(0.0F - var17), (double)var18, (double)var21, (double)var24);
               var13.addVertexWithUV((double)(-var14 - var15), (double)(1.4F - var17), (double)var18, (double)var21, (double)var22);
               var13.addVertexWithUV((double)(var14 - var15), (double)(1.4F - var17), (double)var18, (double)var23, (double)var22);
               var16 -= 0.45F;
               var17 -= 0.45F;
               var14 *= 0.9F;
               var18 += 0.03F;
               ++var19;
            }

            if(var9 != null) {
               continue;
            }
         }

         var13.getVisible8();
         GL11.glPopMatrix();
         var26 = 2896;
         break;
      }

      GL11.glEnable(var26);
   }

   // $FF: renamed from: c (sa, double, double, double, float, float) void
   private void method_4734(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glEnable(3042);
      String[] var10000 = class_752.method_4253();
      GL11.glBlendFunc(770, 771);
      this.field_3788.field_7423.bindTexture(field_3787);
      ahb var11 = this.method_4735();
      GL11.glDepthMask(false);
      String[] var10 = var10000;
      float var12 = this.field_3790;
      Object var37 = var1;
      if(var10 != null) {
         label72: {
            if(var1 instanceof class_753) {
               class_753 var13 = (class_753)var1;
               var12 *= var13.method_4275();
               var37 = var13;
               if(var10 == null) {
                  break label72;
               }

               if(var13.method_4159()) {
                  var12 *= 0.5F;
               }
            }

            var37 = var1;
         }
      }

      double var36 = ((class_689)var37).field_3021 + (var1.field_2994 - var1.field_3021) * (double)var9;
      double var15 = var1.field_3022 + (var1.field_2995 - var1.field_3022) * (double)var9 + (double)var1.method_3913();
      double var17 = var1.field_3023 + (var1.field_2996 - var1.field_3023) * (double)var9;
      int var19 = class_1715.method_9561(var36 - (double)var12);
      int var20 = class_1715.method_9561(var36 + (double)var12);
      int var21 = class_1715.method_9561(var15 - (double)var12);
      int var22 = class_1715.method_9561(var15);
      int var23 = class_1715.method_9561(var17 - (double)var12);
      int var24 = class_1715.method_9561(var17 + (double)var12);
      double var25 = var2 - var36;
      double var27 = var4 - var15;
      double var29 = var6 - var17;
      bmh var31 = bmh.instance;
      var31.setVisible2();
      int var32 = var19;

      int var38;
      label65:
      while(true) {
         var38 = var32;

         label62:
         while(var38 <= var20) {
            var38 = var21;
            if(var10 == null) {
               break label65;
            }

            int var33 = var21;

            while(var33 <= var22) {
               var38 = var23;
               if(var10 == null) {
                  continue label62;
               }

               int var34 = var23;

               while(true) {
                  if(var34 <= var24) {
                     aji var35 = var11.getBlock(var32, var33 - 1, var34);
                     if(var10 == null) {
                        break;
                     }

                     if(var10 != null) {
                        if(var35.method_2424() != awt.field_4170 && var11.method_2069(var32, var33, var34) > 3) {
                           this.method_4736(var35, var2, var4 + (double)var1.method_3913(), var6, var32, var33, var34, var8, var12, var25, var27 + (double)var1.method_3913(), var29);
                        }

                        ++var34;
                     }

                     if(var10 != null) {
                        continue;
                     }
                  }

                  ++var33;
                  break;
               }

               if(var10 == null) {
                  break;
               }
            }

            ++var32;
            if(var10 != null) {
               continue label65;
            }
            break;
         }

         var31.getVisible8();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         var38 = 1;
         break;
      }

      GL11.glDepthMask((boolean)var38);
   }

   // $FF: renamed from: d () ahb
   private ahb method_4735() {
      return this.field_3788.field_7425;
   }

   // $FF: renamed from: a (aji, double, double, double, int, int, int, float, float, double, double, double) void
   private void method_4736(aji var1, double var2, double var4, double var6, int var8, int var9, int var10, float var11, float var12, double var13, double var15, double var17) {
      bmh var20 = bmh.instance;
      String[] var19 = class_752.method_4253();
      if(var1.method_2434()) {
         double var21 = ((double)var11 - (var4 - ((double)var9 + var15)) / 2.0D) * 0.5D * (double)this.method_4735().method_2077(var8, var9, var10);
         double var37;
         int var10000 = (var37 = var21 - 0.0D) == 0.0D?0:(var37 < 0.0D?-1:1);
         if(var19 != null) {
            if(var10000 < 0) {
               return;
            }

            double var38;
            var10000 = (var38 = var21 - 1.0D) == 0.0D?0:(var38 < 0.0D?-1:1);
         }

         if(var19 != null) {
            if(var10000 > 0) {
               var21 = 1.0D;
            }

            var20.setVisible7(1.0F, 1.0F, 1.0F, (float)var21);
            var10000 = var8;
         }

         double var23 = (double)var10000 + var1.method_2487() + var13;
         double var25 = (double)var8 + var1.method_2488() + var13;
         double var27 = (double)var9 + var1.method_2489() + var15 + 0.015625D;
         double var29 = (double)var10 + var1.method_2491() + var17;
         double var31 = (double)var10 + var1.method_2492() + var17;
         float var33 = (float)((var2 - var23) / 2.0D / (double)var12 + 0.5D);
         float var34 = (float)((var2 - var25) / 2.0D / (double)var12 + 0.5D);
         float var35 = (float)((var6 - var29) / 2.0D / (double)var12 + 0.5D);
         float var36 = (float)((var6 - var31) / 2.0D / (double)var12 + 0.5D);
         var20.addVertexWithUV(var23, var27, var29, (double)var33, (double)var35);
         var20.addVertexWithUV(var23, var27, var31, (double)var33, (double)var36);
         var20.addVertexWithUV(var25, var27, var31, (double)var34, (double)var36);
         var20.addVertexWithUV(var25, var27, var29, (double)var34, (double)var35);
      }

   }

   // $FF: renamed from: a (kg, double, double, double) void
   public static void method_4737(class_1343 var0, double var1, double var3, double var5) {
      GL11.glDisable(3553);
      bmh var7 = bmh.instance;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var7.setVisible2();
      var7.method_7467(var1, var3, var5);
      var7.method_7466(0.0F, 0.0F, -1.0F);
      var7.method_7462(var0.field_6909, var0.field_6913, var0.field_6911);
      var7.method_7462(var0.field_6912, var0.field_6913, var0.field_6911);
      var7.method_7462(var0.field_6912, var0.field_6910, var0.field_6911);
      var7.method_7462(var0.field_6909, var0.field_6910, var0.field_6911);
      var7.method_7466(0.0F, 0.0F, 1.0F);
      var7.method_7462(var0.field_6909, var0.field_6910, var0.field_6914);
      var7.method_7462(var0.field_6912, var0.field_6910, var0.field_6914);
      var7.method_7462(var0.field_6912, var0.field_6913, var0.field_6914);
      var7.method_7462(var0.field_6909, var0.field_6913, var0.field_6914);
      var7.method_7466(0.0F, -1.0F, 0.0F);
      var7.method_7462(var0.field_6909, var0.field_6910, var0.field_6911);
      var7.method_7462(var0.field_6912, var0.field_6910, var0.field_6911);
      var7.method_7462(var0.field_6912, var0.field_6910, var0.field_6914);
      var7.method_7462(var0.field_6909, var0.field_6910, var0.field_6914);
      var7.method_7466(0.0F, 1.0F, 0.0F);
      var7.method_7462(var0.field_6909, var0.field_6913, var0.field_6914);
      var7.method_7462(var0.field_6912, var0.field_6913, var0.field_6914);
      var7.method_7462(var0.field_6912, var0.field_6913, var0.field_6911);
      var7.method_7462(var0.field_6909, var0.field_6913, var0.field_6911);
      var7.method_7466(-1.0F, 0.0F, 0.0F);
      var7.method_7462(var0.field_6909, var0.field_6910, var0.field_6914);
      var7.method_7462(var0.field_6909, var0.field_6913, var0.field_6914);
      var7.method_7462(var0.field_6909, var0.field_6913, var0.field_6911);
      var7.method_7462(var0.field_6909, var0.field_6910, var0.field_6911);
      var7.method_7466(1.0F, 0.0F, 0.0F);
      var7.method_7462(var0.field_6912, var0.field_6910, var0.field_6911);
      var7.method_7462(var0.field_6912, var0.field_6913, var0.field_6911);
      var7.method_7462(var0.field_6912, var0.field_6913, var0.field_6914);
      var7.method_7462(var0.field_6912, var0.field_6910, var0.field_6914);
      var7.method_7467(0.0D, 0.0D, 0.0D);
      var7.getVisible8();
      GL11.glEnable(3553);
   }

   // $FF: renamed from: a (kg) void
   public static void method_4738(class_1343 var0) {
      bmh var1 = bmh.instance;
      var1.setVisible2();
      var1.method_7462(var0.field_6909, var0.field_6913, var0.field_6911);
      var1.method_7462(var0.field_6912, var0.field_6913, var0.field_6911);
      var1.method_7462(var0.field_6912, var0.field_6910, var0.field_6911);
      var1.method_7462(var0.field_6909, var0.field_6910, var0.field_6911);
      var1.method_7462(var0.field_6909, var0.field_6910, var0.field_6914);
      var1.method_7462(var0.field_6912, var0.field_6910, var0.field_6914);
      var1.method_7462(var0.field_6912, var0.field_6913, var0.field_6914);
      var1.method_7462(var0.field_6909, var0.field_6913, var0.field_6914);
      var1.method_7462(var0.field_6909, var0.field_6910, var0.field_6911);
      var1.method_7462(var0.field_6912, var0.field_6910, var0.field_6911);
      var1.method_7462(var0.field_6912, var0.field_6910, var0.field_6914);
      var1.method_7462(var0.field_6909, var0.field_6910, var0.field_6914);
      var1.method_7462(var0.field_6909, var0.field_6913, var0.field_6914);
      var1.method_7462(var0.field_6912, var0.field_6913, var0.field_6914);
      var1.method_7462(var0.field_6912, var0.field_6913, var0.field_6911);
      var1.method_7462(var0.field_6909, var0.field_6913, var0.field_6911);
      var1.method_7462(var0.field_6909, var0.field_6910, var0.field_6914);
      var1.method_7462(var0.field_6909, var0.field_6913, var0.field_6914);
      var1.method_7462(var0.field_6909, var0.field_6913, var0.field_6911);
      var1.method_7462(var0.field_6909, var0.field_6910, var0.field_6911);
      var1.method_7462(var0.field_6912, var0.field_6910, var0.field_6911);
      var1.method_7462(var0.field_6912, var0.field_6913, var0.field_6911);
      var1.method_7462(var0.field_6912, var0.field_6913, var0.field_6914);
      var1.method_7462(var0.field_6912, var0.field_6910, var0.field_6914);
      var1.getVisible8();
   }

   // $FF: renamed from: a (bnn) void
   public void method_4739(bnn var1) {
      this.field_3788 = var1;
   }

   // $FF: renamed from: b (sa, double, double, double, float, float) void
   public void method_4740(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      int var10000 = this.field_3788.field_7430.field_4493;
      if(var10 != null) {
         label30: {
            if(this.field_3788.field_7430.field_4493) {
               float var14;
               var10000 = (var14 = this.field_3790 - 0.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
               if(var10 == null) {
                  break label30;
               }

               if(var10000 > 0) {
                  var10000 = var1.method_3942();
                  if(var10 == null) {
                     break label30;
                  }

                  if(var10000 == 0) {
                     double var11 = this.field_3788.method_7626(var1.field_2994, var1.field_2995, var1.field_2996);
                     float var13 = (float)((1.0D - var11 / 256.0D) * (double)this.field_3791);
                     float var15;
                     var10000 = (var15 = var13 - 0.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
                     if(var10 == null) {
                        break label30;
                     }

                     if(var10000 > 0) {
                        this.method_4734(var1, var2, var4, var6, var13, var9);
                     }
                  }
               }
            }

            var10000 = var1.method_3971();
         }
      }

      if(var10000 != 0) {
         this.method_4733(var1, var2, var4, var6, var9);
      }

   }

   // $FF: renamed from: c () kU
   public FontRenderer method_4741() {
      return this.field_3788.method_7627();
   }

   // $FF: renamed from: a (vM) void
   public void method_4742(class_74 var1) {}

   // $FF: renamed from: a (sa, java.lang.String, double, double, double, int) void
   protected void method_4743(class_689 var1, String var2, double var3, double var5, double var7, int var9) {
      String[] var10000 = class_752.method_4253();
      double var11 = var1.method_3891(this.field_3788.field_7426);
      String[] var10 = var10000;
      if(var11 <= (double)(var9 * var9)) {
         FontRenderer var13 = this.method_4741();
         float var14 = 1.6F;
         float var15 = 0.016666668F * var14;
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var3 + 0.0F, (float)var5 + var1.field_3015 + 0.5F, (float)var7);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-this.field_3788.field_7428, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.field_3788.field_7429, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-var15, -var15, var15);
         GL11.glDisable(2896);
         GL11.glDepthMask(false);
         GL11.glDisable(2929);
         GL11.glEnable(3042);
         buu.method_9081(770, 771, 1, 0);
         bmh var16 = bmh.instance;
         byte var17 = 0;
         String[] var10001 = field_3793;
         int var19 = var2.equals("deadmau5");
         if(var10 != null) {
            if(var19 != 0) {
               var17 = -10;
            }

            GL11.glDisable(3553);
            var16.setVisible2();
            var19 = var13.getCharWidth(var2) / 2;
         }

         int var18 = var19;
         var16.setVisible7(0.0F, 0.0F, 0.0F, 0.25F);
         var16.method_7462((double)(-var18 - 1), (double)(-1 + var17), 0.0D);
         var16.method_7462((double)(-var18 - 1), (double)(8 + var17), 0.0D);
         var16.method_7462((double)(var18 + 1), (double)(8 + var17), 0.0D);
         var16.method_7462((double)(var18 + 1), (double)(-1 + var17), 0.0D);
         var16.getVisible8();
         GL11.glEnable(3553);
         var13.method_7020(var2, -var13.getCharWidth(var2) / 2, var17, 553648127);
         GL11.glEnable(2929);
         GL11.glDepthMask(true);
         var13.method_7020(var2, -var13.getCharWidth(var2) / 2, var17, -1);
         GL11.glEnable(2896);
         GL11.glDisable(3042);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPopMatrix();
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\b4¡5ë{ëâ6?·£päw¾8ý¶mâfô8ºº`þrõ;¼¼\b/·º`üd®~";
      int var4 = "\b4¡5ë{ëâ6?·£päw¾8ý¶mâfô8ºº`þrõ;¼¼\b/·º`üd®~".length();
      char var1 = 11;
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
                  field_3793 = var5;
                  String[] var11 = field_3793;
                  __OBFID = "CL_00000992";
                  bqx var8 = new bqx;
                  var10 = field_3793;
                  var8.method_8227("textures/misc/shadow.png");
                  field_3787 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)var10[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 61;
               break;
            case 1:
               var10009 = 164;
               break;
            case 2:
               var10009 = 173;
               break;
            case 3:
               var10009 = 114;
               break;
            case 4:
               var10009 = 231;
               break;
            case 5:
               var10009 = 115;
               break;
            default:
               var10009 = 173;
            }

            var10[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }
}

import org.lwjgl.opengl.GL11;

// $FF: renamed from: oT
public class class_823 extends bno {

   // $FF: renamed from: h bqx
   private static final bqx field_3832;
   // $FF: renamed from: i bhr
   protected bhr field_3833;
   // $FF: renamed from: j blm
   protected final blm field_3834;
   // $FF: renamed from: k java.lang.String
   private static final String field_3835;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      class_1239 var10001 = new class_1239;
      var10001.method_6510();
      this.field_3833 = var10001;
      this.field_3790 = 0.5F;
      blm var1 = new blm;
      var1.method_7203();
      this.field_3834 = var1;
   }

   // $FF: renamed from: b (xr, double, double, double, float, float) void
   public void method_4787(class_690 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10;
      int var36;
      label61: {
         GL11.glPushMatrix();
         this.method_4731(var1);
         long var11 = (long)var1.method_3845() * 493286711L;
         var11 = var11 * var11 * 4392167121L + var11 * 98761L;
         float var13 = (((float)(var11 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
         float var14 = (((float)(var11 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
         float var15 = (((float)(var11 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
         GL11.glTranslatef(var13, var14, var15);
         double var16 = var1.field_3021 + (var1.field_2994 - var1.field_3021) * (double)var9;
         String[] var10000 = class_752.method_4253();
         double var18 = var1.field_3022 + (var1.field_2995 - var1.field_3022) * (double)var9;
         double var20 = var1.field_3023 + (var1.field_2996 - var1.field_3023) * (double)var9;
         var10 = var10000;
         double var22 = 0.30000001192092896D;
         azw var24 = var1.method_3987(var16, var18, var20);
         float var25 = var1.field_3003 + (var1.field_3001 - var1.field_3003) * var9;
         if(var10 != null) {
            if(var24 != null) {
               azw var26 = var1.method_3986(var16, var18, var20, var22);
               azw var27 = var1.method_3986(var16, var18, var20, -var22);
               azw var35 = var26;
               if(var10 != null) {
                  if(var26 == null) {
                     var26 = var24;
                  }

                  var35 = var27;
               }

               if(var10 != null) {
                  if(var35 == null) {
                     var27 = var24;
                  }

                  var2 += var24.field_4220 - var16;
                  var4 += (var26.field_4221 + var27.field_4221) / 2.0D - var18;
                  var6 += var24.field_4222 - var20;
                  var35 = var27.method_5093(-var26.field_4220, -var26.field_4221, -var26.field_4222);
               }

               azw var28 = var35;
               double var37;
               var36 = (var37 = var28.method_5097() - 0.0D) == 0.0D?0:(var37 < 0.0D?-1:1);
               if(var10 == null) {
                  break label61;
               }

               if(var36 != 0) {
                  var28 = var28.method_5090();
                  var8 = (float)(Math.atan2(var28.field_4222, var28.field_4220) * 180.0D / 3.141592653589793D);
                  var25 = (float)(Math.atan(var28.field_4221) * 73.0D);
               }
            }

            GL11.glTranslatef((float)var2, (float)var4, (float)var6);
            GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-var25, 0.0F, 0.0F, 1.0F);
         }

         var36 = var1.method_3991();
      }

      float var32 = (float)var36 - var9;
      float var33 = var1.method_3989() - var9;
      float var38;
      var36 = (var38 = var33 - 0.0F) == 0.0F?0:(var38 < 0.0F?-1:1);
      if(var10 != null) {
         if(var36 < 0) {
            var33 = 0.0F;
         }

         float var39;
         var36 = (var39 = var32 - 0.0F) == 0.0F?0:(var39 < 0.0F?-1:1);
      }

      if(var10 != null) {
         if(var36 > 0) {
            GL11.glRotatef(class_1715.method_9555(var32) * var32 * var33 / 10.0F * (float)var1.method_3993(), 1.0F, 0.0F, 0.0F);
         }

         var36 = var1.method_3999();
      }

      int var34 = var36;
      aji var29 = var1.method_3995();
      int var30 = var1.method_3997();
      if(var10 != null) {
         if(var29.method_2436() != -1) {
            GL11.glPushMatrix();
            this.method_4732(bpz.field_7757);
            float var31 = 0.75F;
            GL11.glScalef(var31, var31, var31);
            GL11.glTranslatef(0.0F, (float)var34 / 16.0F, 0.0F);
            this.method_4789(var1, var9, var29, var30);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.method_4731(var1);
         }

         GL11.glScalef(-1.0F, -1.0F, 1.0F);
         this.field_3833.method_6511(var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
      }

   }

   // $FF: renamed from: b (xr) bqx
   protected bqx method_4788(class_690 var1) {
      return field_3832;
   }

   // $FF: renamed from: b (xr, float, aji, int) void
   protected void method_4789(class_690 var1, float var2, aji var3, int var4) {
      float var5 = var1.method_3884(var2);
      GL11.glPushMatrix();
      this.field_3834.drawTextBox6(var3, var4, var5);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4788((class_690)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4787((class_690)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "©ÿÞõÕÝ°Ø^ÌF·ÊÅ_×W½ÊÍEÛ@¥ÔÀ[ÐD";
      int var5 = "©ÿÞõÕÝ°Ø^ÌF·ÊÅ_×W½ÊÍEÛ@¥ÔÀ[ÐD".length();
      char var2 = 11;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  field_3835 = "CL_00001013";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/minecart.png");
                  field_3832 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 213;
               break;
            case 1:
               var10009 = 244;
               break;
            case 2:
               var10009 = 177;
               break;
            case 3:
               var10009 = 255;
               break;
            case 4:
               var10009 = 58;
               break;
            case 5:
               var10009 = 175;
               break;
            default:
               var10009 = 50;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

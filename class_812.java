import org.lwjgl.opengl.GL11;

// $FF: renamed from: om
public class class_812 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3810;
   // $FF: renamed from: h java.lang.String
   private static final String field_3811;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
   }

   // $FF: renamed from: b (xl, double, double, double, float, float) void
   public void method_4763(class_704 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable('\u803a');
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      this.method_4731(var1);
      String[] var10000 = class_752.method_4253();
      bmh var11 = bmh.instance;
      String[] var10 = var10000;
      byte var12 = 1;
      byte var13 = 2;
      float var14 = (float)(var12 * 8 + 0) / 128.0F;
      float var15 = (float)(var12 * 8 + 8) / 128.0F;
      float var16 = (float)(var13 * 8 + 0) / 128.0F;
      float var17 = (float)(var13 * 8 + 8) / 128.0F;
      float var18 = 1.0F;
      float var19 = 0.5F;
      float var20 = 0.5F;
      GL11.glRotatef(180.0F - this.field_3788.field_7428, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.field_3788.field_7429, 1.0F, 0.0F, 0.0F);
      var11.setVisible2();
      var11.method_7466(0.0F, 1.0F, 0.0F);
      var11.addVertexWithUV((double)(0.0F - var19), (double)(0.0F - var20), 0.0D, (double)var14, (double)var17);
      var11.addVertexWithUV((double)(var18 - var19), (double)(0.0F - var20), 0.0D, (double)var15, (double)var17);
      var11.addVertexWithUV((double)(var18 - var19), (double)(1.0F - var20), 0.0D, (double)var15, (double)var16);
      var11.addVertexWithUV((double)(0.0F - var19), (double)(1.0F - var20), 0.0D, (double)var14, (double)var16);
      var11.getVisible8();
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
      class_792 var47 = var1.field_3136;
      if(var10 != null) {
         if(var1.field_3136 == null) {
            return;
         }

         var47 = var1.field_3136;
      }

      double var24;
      double var26;
      double var28;
      double var48;
      label46: {
         float var21 = var47.method_4241(var9);
         float var22 = class_1715.method_9555(class_1715.method_9557(var21) * 3.1415927F);
         azw var23 = azw.method_5086(-0.5D, 0.03D, 0.8D);
         var23.method_5101(-(var1.field_3136.field_3003 + (var1.field_3136.field_3001 - var1.field_3136.field_3003) * var9) * 3.1415927F / 180.0F);
         var23.method_5102(-(var1.field_3136.field_3002 + (var1.field_3136.field_3000 - var1.field_3136.field_3002) * var9) * 3.1415927F / 180.0F);
         var23.method_5102(var22 * 0.5F);
         var23.method_5101(-var22 * 0.7F);
         var24 = var1.field_3136.field_2991 + (var1.field_3136.field_2994 - var1.field_3136.field_2991) * (double)var9 + var23.field_4220;
         var26 = var1.field_3136.field_2992 + (var1.field_3136.field_2995 - var1.field_3136.field_2992) * (double)var9 + var23.field_4221;
         var28 = var1.field_3136.field_2993 + (var1.field_3136.field_2996 - var1.field_3136.field_2993) * (double)var9 + var23.field_4222;
         var47 = var1.field_3136;
         if(var10 != null) {
            if(var1.field_3136 == bao.method_5273().cursorCounter8) {
               var48 = 0.0D;
               break label46;
            }

            var47 = var1.field_3136;
         }

         var48 = (double)var47.method_3880();
      }

      class_704 var49;
      label40: {
         label39: {
            double var30 = var48;
            if(this.field_3788.field_7430.field_4561 <= 0) {
               var49 = var1;
               if(var10 == null) {
                  break label40;
               }

               if(var1.field_3136 == bao.method_5273().cursorCounter8) {
                  break label39;
               }
            }

            float var32 = (var1.field_3136.field_3331 + (var1.field_3136.field_3330 - var1.field_3136.field_3331) * var9) * 3.1415927F / 180.0F;
            double var33 = (double)class_1715.method_9555(var32);
            double var35 = (double)class_1715.method_9556(var32);
            var24 = var1.field_3136.field_2991 + (var1.field_3136.field_2994 - var1.field_3136.field_2991) * (double)var9 - var35 * 0.35D - var33 * 0.85D;
            var26 = var1.field_3136.field_2992 + var30 + (var1.field_3136.field_2995 - var1.field_3136.field_2992) * (double)var9 - 0.45D;
            var28 = var1.field_3136.field_2993 + (var1.field_3136.field_2996 - var1.field_3136.field_2993) * (double)var9 - var33 * 0.35D + var35 * 0.85D;
         }

         var49 = var1;
      }

      double var50 = var49.field_2991 + (var1.field_2994 - var1.field_2991) * (double)var9;
      double var34 = var1.field_2992 + (var1.field_2995 - var1.field_2992) * (double)var9 + 0.25D;
      double var36 = var1.field_2993 + (var1.field_2996 - var1.field_2993) * (double)var9;
      double var38 = (double)((float)(var24 - var50));
      double var40 = (double)((float)(var26 - var34));
      double var42 = (double)((float)(var28 - var36));
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      var11.setVisible3(3);
      var11.method_7463(0);
      byte var44 = 16;
      int var45 = 0;

      while(true) {
         if(var45 <= var44) {
            float var46 = (float)var45 / (float)var44;
            var11.method_7462(var2 + var38 * (double)var46, var4 + var40 * (double)(var46 * var46 + var46) * 0.5D + 0.25D, var6 + var42 * (double)var46);
            ++var45;
            if(var10 == null) {
               break;
            }

            if(var10 != null) {
               continue;
            }
         }

         var11.getVisible8();
         GL11.glEnable(2896);
         break;
      }

      GL11.glEnable(3553);
   }

   // $FF: renamed from: b (xl) bqx
   protected bqx method_4764(class_704 var1) {
      return field_3810;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4764((class_704)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4763((class_704)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "ü/(ä[Ò÷I.³Õ\bl¡´ y¦¤Ü7¤\n³Ùt±Ì·Þ";
      int var5 = "ü/(ä[Ò÷I.³Õ\bl¡´ y¦¤Ü7¤\n³Ùt±Ì·Þ".length();
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
                  field_3811 = "CL_00000996";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/particle/particles.png");
                  field_3810 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 170;
               break;
            case 1:
               var10009 = 221;
               break;
            case 2:
               var10009 = 29;
               break;
            case 3:
               var10009 = 117;
               break;
            case 4:
               var10009 = 185;
               break;
            case 5:
               var10009 = 6;
               break;
            default:
               var10009 = 143;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

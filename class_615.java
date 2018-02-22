import java.nio.FloatBuffer;
import java.util.Random;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: oc
public class class_615 extends class_614 {

   // $FF: renamed from: a bqx
   private static final bqx field_2660;
   // $FF: renamed from: c bqx
   private static final bqx field_2661;
   // $FF: renamed from: d java.util.Random
   private static final Random field_2662;
   // $FF: renamed from: e java.nio.FloatBuffer
   FloatBuffer field_2663;
   // $FF: renamed from: f java.lang.String
   private static final String field_2664;


   // $FF: renamed from: <init> () void
   public void method_3391() {
      super.method_3391();
      this.field_2663 = ban.method_5200(16);
   }

   // $FF: renamed from: b (gA, double, double, double, float) void
   public void method_3397(class_599 var1, double var2, double var4, double var6, float var8) {
      float var10 = (float)this.field_2659.field_7338;
      float var11 = (float)this.field_2659.field_7339;
      String[] var10000 = class_752.method_4253();
      float var12 = (float)this.field_2659.field_7340;
      GL11.glDisable(2896);
      field_2662.setSeed(31100L);
      float var13 = 0.75F;
      String[] var9 = var10000;
      int var14 = 0;

      int var25;
      while(true) {
         if(var14 < 16) {
            GL11.glPushMatrix();
            float var15 = (float)(16 - var14);
            float var16 = 0.0625F;
            float var17 = 1.0F / (var15 + 1.0F);
            var25 = var14;
            if(var9 == null) {
               break;
            }

            if(var9 != null) {
               if(var14 == 0) {
                  this.method_3393(field_2660);
                  var17 = 0.1F;
                  var15 = 65.0F;
                  var16 = 0.125F;
                  GL11.glEnable(3042);
                  GL11.glBlendFunc(770, 771);
               }

               var25 = var14;
            }

            label37: {
               byte var10001 = 1;
               if(var9 != null) {
                  if(var25 != 1) {
                     break label37;
                  }

                  this.method_3393(field_2661);
                  GL11.glEnable(3042);
                  var25 = 1;
                  var10001 = 1;
               }

               GL11.glBlendFunc(var25, var10001);
               var16 = 0.5F;
            }

            float var18 = (float)(-(var4 + (double)var13));
            float var19 = var18 + class_1355.field_7045;
            float var20 = var18 + var15 + class_1355.field_7045;
            float var21 = var19 / var20;
            var21 += (float)(var4 + (double)var13);
            GL11.glTranslatef(var10, var21, var12);
            GL11.glTexGeni(8192, 9472, 9217);
            GL11.glTexGeni(8193, 9472, 9217);
            GL11.glTexGeni(8194, 9472, 9217);
            GL11.glTexGeni(8195, 9472, 9216);
            GL11.glTexGen(8192, 9473, this.method_3398(1.0F, 0.0F, 0.0F, 0.0F));
            GL11.glTexGen(8193, 9473, this.method_3398(0.0F, 0.0F, 1.0F, 0.0F));
            GL11.glTexGen(8194, 9473, this.method_3398(0.0F, 0.0F, 0.0F, 1.0F));
            GL11.glTexGen(8195, 9474, this.method_3398(0.0F, 1.0F, 0.0F, 0.0F));
            GL11.glEnable(3168);
            GL11.glEnable(3169);
            GL11.glEnable(3170);
            GL11.glEnable(3171);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5890);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, (float)(bao.method_5283() % 700000L) / 700000.0F, 0.0F);
            GL11.glScalef(var16, var16, var16);
            GL11.glTranslatef(0.5F, 0.5F, 0.0F);
            GL11.glRotatef((float)(var14 * var14 * 4321 + var14 * 9) * 2.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-0.5F, -0.5F, 0.0F);
            GL11.glTranslatef(-var10, -var12, -var11);
            var19 = var18 + class_1355.field_7045;
            GL11.glTranslatef(class_1355.field_7044 * var15 / var19, class_1355.field_7046 * var15 / var19, -var11);
            bmh var22 = bmh.instance;
            var22.setVisible2();
            var21 = field_2662.nextFloat() * 0.5F + 0.1F;
            float var23 = field_2662.nextFloat() * 0.5F + 0.4F;
            float var24 = field_2662.nextFloat() * 0.5F + 0.5F;
            var25 = var14;
            if(var9 != null) {
               if(var14 == 0) {
                  var24 = 1.0F;
                  var23 = 1.0F;
                  var21 = 1.0F;
               }

               var22.setVisible7(var21 * var17, var23 * var17, var24 * var17, 1.0F);
               var22.method_7462(var2, var4 + (double)var13, var6);
               var22.method_7462(var2, var4 + (double)var13, var6 + 1.0D);
               var22.method_7462(var2 + 1.0D, var4 + (double)var13, var6 + 1.0D);
               var22.method_7462(var2 + 1.0D, var4 + (double)var13, var6);
               var22.getVisible8();
               GL11.glPopMatrix();
               var25 = 5888;
            }

            GL11.glMatrixMode(var25);
            ++var14;
            if(var9 != null) {
               continue;
            }
         }

         GL11.glDisable(3042);
         GL11.glDisable(3168);
         GL11.glDisable(3169);
         GL11.glDisable(3170);
         GL11.glDisable(3171);
         var25 = 2896;
         break;
      }

      GL11.glEnable(var25);
   }

   // $FF: renamed from: b (float, float, float, float) java.nio.FloatBuffer
   private FloatBuffer method_3398(float var1, float var2, float var3, float var4) {
      this.field_2663.clear();
      this.field_2663.put(var1).put(var2).put(var3).put(var4);
      this.field_2663.flip();
      return this.field_2663;
   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public void method_3392(class_580 var1, double var2, double var4, double var6, float var8) {
      this.method_3397((class_599)var1, var2, var4, var6, var8);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3399() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "a«ÒâvÞâÐ V­Ç #QÈ°Ä»4M¸Ü¦iG±½Á¹?\f»V­Ç #QÈ°Æ»2[È°Ö6M¡Þü6L";
      int var5 = "a«ÒâvÞâÐ V­Ç #QÈ°Ä»4M¸Ü¦iG±½Á¹?\f»V­Ç #QÈ°Æ»2[È°Ö6M¡Þü6L".length();
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
                  field_2664 = "CL_00000972";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/environment/end_sky.png");
                  field_2660 = var9;
                  var9 = new bqx;
                  var9.method_8227("textures/entity/end_portal.png");
                  field_2661 = var9;
                  field_2662 = new Random(31100L);
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 190;
               break;
            case 1:
               var10009 = 123;
               break;
            case 2:
               var10009 = 73;
               break;
            case 3:
               var10009 = 126;
               break;
            case 4:
               var10009 = 46;
               break;
            case 5:
               var10009 = 78;
               break;
            default:
               var10009 = 218;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

import org.lwjgl.opengl.GL11;

// $FF: renamed from: ol
public class class_813 extends bno {

   // $FF: renamed from: g float
   private float field_3812;
   // $FF: renamed from: h java.lang.String
   private static final String field_3813 = "CL_00000995";


   // $FF: renamed from: <init> (float) void
   public void method_4765(float var1) {
      super.method_4727();
      this.field_3812 = var1;
   }

   // $FF: renamed from: b (xD, double, double, double, float, float) void
   public void method_4766(class_708 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      this.method_4731(var1);
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable('\u803a');
      float var10 = this.field_3812;
      GL11.glScalef(var10 / 1.0F, var10 / 1.0F, var10 / 1.0F);
      IIcon var11 = class_1010.field_5241.getIconFromDamage(0);
      bmh var12 = bmh.instance;
      float var13 = var11.method_368();
      float var14 = var11.method_369();
      float var15 = var11.method_371();
      float var16 = var11.method_372();
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.25F;
      GL11.glRotatef(180.0F - this.field_3788.field_7428, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.field_3788.field_7429, 1.0F, 0.0F, 0.0F);
      var12.setVisible2();
      var12.method_7466(0.0F, 1.0F, 0.0F);
      var12.addVertexWithUV((double)(0.0F - var18), (double)(0.0F - var19), 0.0D, (double)var13, (double)var16);
      var12.addVertexWithUV((double)(var17 - var18), (double)(0.0F - var19), 0.0D, (double)var14, (double)var16);
      var12.addVertexWithUV((double)(var17 - var18), (double)(1.0F - var19), 0.0D, (double)var14, (double)var15);
      var12.addVertexWithUV((double)(0.0F - var18), (double)(1.0F - var19), 0.0D, (double)var13, (double)var15);
      var12.getVisible8();
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (xD) bqx
   protected bqx method_4767(class_708 var1) {
      return bpz.field_7758;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4767((class_708)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4766((class_708)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "Qu<]h\" ZX".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_3813 = (new String((char[])var4)).intern();
            String var2 = field_3813;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 24;
            break;
         case 1:
            var10009 = 51;
            break;
         case 2:
            var10009 = 105;
            break;
         case 3:
            var10009 = 103;
            break;
         case 4:
            var10009 = 183;
            break;
         case 5:
            var10009 = 69;
            break;
         default:
            var10009 = 82;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

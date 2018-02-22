import org.lwjgl.opengl.GL11;

// $FF: renamed from: wk
public class class_732 extends class_716 {

   // $FF: renamed from: aJ bqx
   private static final bqx field_3252;
   // $FF: renamed from: aK int
   private int field_3253;
   // $FF: renamed from: aL int
   private int field_3254;
   // $FF: renamed from: aM bqf
   private bqf field_3255;
   // $FF: renamed from: aN float
   private float field_3256;
   // $FF: renamed from: aO java.lang.String
   private static final String field_3257;


   // $FF: renamed from: <init> (bqf, ahb, double, double, double, double, double, double) void
   public void method_4118(bqf var1, ahb var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      super.method_4093(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.field_3255 = var1;
      this.field_3254 = 6 + this.field_3028.nextInt(4);
      this.field_3221 = this.field_3222 = this.field_3223 = this.field_3028.nextFloat() * 0.6F + 0.4F;
      this.field_3256 = 1.0F - (float)var9 * 0.5F;
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String[] var10000 = class_752.method_4253();
      int var9 = (int)(((float)this.field_3253 + var2) * 15.0F / (float)this.field_3254);
      String[] var8 = var10000;
      int var18 = var9;
      byte var10001 = 15;
      if(var8 != null) {
         if(var9 > 15) {
            return;
         }

         this.field_3255.bindTexture(field_3252);
         var18 = var9;
         var10001 = 4;
      }

      float var10 = (float)(var18 % var10001) / 4.0F;
      float var11 = var10 + 0.24975F;
      float var12 = (float)(var9 / 4) / 4.0F;
      float var13 = var12 + 0.24975F;
      float var14 = 2.0F * this.field_3256;
      float var15 = (float)(this.field_2991 + (this.field_2994 - this.field_2991) * (double)var2 - field_3226);
      float var16 = (float)(this.field_2992 + (this.field_2995 - this.field_2992) * (double)var2 - field_3227);
      float var17 = (float)(this.field_2993 + (this.field_2996 - this.field_2993) * (double)var2 - field_3228);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
      bam.method_5212();
      var1.setVisible2();
      var1.setVisible7(this.field_3221, this.field_3222, this.field_3223, 1.0F);
      var1.method_7466(0.0F, 1.0F, 0.0F);
      var1.setVisible5(240);
      var1.addVertexWithUV((double)(var15 - var3 * var14 - var6 * var14), (double)(var16 - var4 * var14), (double)(var17 - var5 * var14 - var7 * var14), (double)var11, (double)var13);
      var1.addVertexWithUV((double)(var15 - var3 * var14 + var6 * var14), (double)(var16 + var4 * var14), (double)(var17 - var5 * var14 + var7 * var14), (double)var11, (double)var12);
      var1.addVertexWithUV((double)(var15 + var3 * var14 + var6 * var14), (double)(var16 + var4 * var14), (double)(var17 + var5 * var14 + var7 * var14), (double)var10, (double)var12);
      var1.addVertexWithUV((double)(var15 + var3 * var14 - var6 * var14), (double)(var16 - var4 * var14), (double)(var17 + var5 * var14 - var7 * var14), (double)var10, (double)var13);
      var1.getVisible8();
      GL11.glPolygonOffset(0.0F, 0.0F);
      GL11.glEnable(2896);
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      return '\uf0f0';
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      this.field_2991 = this.field_2994;
      this.field_2992 = this.field_2995;
      String[] var1 = var10000;
      this.field_2993 = this.field_2996;
      ++this.field_3253;
      class_732 var2 = this;
      if(var1 != null) {
         if(this.field_3253 != this.field_3254) {
            return;
         }

         var2 = this;
      }

      var2.method_3851();
   }

   // $FF: renamed from: e () int
   public int method_4102() {
      return 3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4107() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "üôýè#û¾\büó2ñ¾\bøö)ûø¦ê(ïËÝ2Æ¸ªv¸¨\\Æ";
      int var5 = "üôýè#û¾\büó2ñ¾\bøö)ûø¦ê(ïËÝ2Æ¸ªv¸¨\\Æ".length();
      char var2 = 29;
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
                  field_3257 = "CL_00000910";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/explosion.png");
                  field_3252 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 8;
               break;
            case 1:
               var10009 = 17;
               break;
            case 2:
               var10009 = 237;
               break;
            case 3:
               var10009 = 118;
               break;
            case 4:
               var10009 = 8;
               break;
            case 5:
               var10009 = 26;
               break;
            default:
               var10009 = 198;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

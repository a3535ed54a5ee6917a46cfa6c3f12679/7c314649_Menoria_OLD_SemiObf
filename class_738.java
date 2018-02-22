
// $FF: renamed from: we
public class class_738 extends class_716 {

   // $FF: renamed from: aJ java.lang.String
   private static final String field_3279 = "CL_00000904";


   // $FF: renamed from: <init> (ahb, double, double, double) void
   protected void method_4092(ahb var1, double var2, double var4, double var6) {
      super.method_4092(var1, var2, var4, var6);
      this.field_3218 = 4;
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = 0.25F;
      float var9 = var8 + 0.25F;
      float var10 = 0.125F;
      float var11 = var10 + 0.25F;
      float var12 = 7.1F * class_1715.method_9555(((float)this.field_3217 + var2 - 1.0F) * 0.25F * 3.1415927F);
      this.field_3224 = 0.6F - ((float)this.field_3217 + var2 - 1.0F) * 0.25F * 0.5F;
      float var13 = (float)(this.field_2991 + (this.field_2994 - this.field_2991) * (double)var2 - field_3226);
      float var14 = (float)(this.field_2992 + (this.field_2995 - this.field_2992) * (double)var2 - field_3227);
      float var15 = (float)(this.field_2993 + (this.field_2996 - this.field_2993) * (double)var2 - field_3228);
      var1.setVisible7(this.field_3221, this.field_3222, this.field_3223, this.field_3224);
      var1.addVertexWithUV((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var9, (double)var11);
      var1.addVertexWithUV((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.addVertexWithUV((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.addVertexWithUV((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var8, (double)var11);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4107() {
      boolean var10000 = true;
      char[] var10003 = "7èº(Dò".toCharArray();
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
            field_3279 = (new String((char[])var4)).intern();
            String var2 = field_3279;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 233;
            break;
         case 1:
            var10009 = 57;
            break;
         case 2:
            var10009 = 95;
            break;
         case 3:
            var10009 = 174;
            break;
         case 4:
            var10009 = 63;
            break;
         case 5:
            var10009 = 23;
            break;
         default:
            var10009 = 133;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

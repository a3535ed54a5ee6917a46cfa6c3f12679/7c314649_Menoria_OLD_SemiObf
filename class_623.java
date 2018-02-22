import org.lwjgl.opengl.GL11;

// $FF: renamed from: n5
public class class_623 extends class_614 {

   // $FF: renamed from: a bqx
   private static final bqx field_2694;
   // $FF: renamed from: c java.lang.String
   private static final String field_2695;


   // $FF: renamed from: <init> () void
   public void method_3391() {
      super.method_3391();
   }

   // $FF: renamed from: b (gk, double, double, double, float) void
   public void method_3415(class_596 var1, double var2, double var4, double var6, float var8) {
      float var9 = var1.method_3176();
      GL11.glAlphaFunc(516, 0.1F);
      if(var9 > 0.0F) {
         bmh var10 = bmh.instance;
         this.method_3393(field_2694);
         GL11.glTexParameterf(3553, 10242, 10497.0F);
         GL11.glTexParameterf(3553, 10243, 10497.0F);
         GL11.glDisable(2896);
         GL11.glDisable(2884);
         GL11.glDisable(3042);
         GL11.glDepthMask(true);
         buu.method_9081(770, 1, 1, 0);
         float var11 = (float)var1.method_99().method_2184() + var8;
         float var12 = -var11 * 0.2F - (float)class_1715.method_9559(-var11 * 0.1F);
         byte var13 = 1;
         double var14 = (double)var11 * 0.025D * (1.0D - (double)(var13 & 1) * 2.5D);
         var10.setVisible2();
         var10.setVisible9(255, 255, 255, 32);
         double var16 = (double)var13 * 0.2D;
         double var18 = 0.5D + Math.cos(var14 + 2.356194490192345D) * var16;
         double var20 = 0.5D + Math.sin(var14 + 2.356194490192345D) * var16;
         double var22 = 0.5D + Math.cos(var14 + 0.7853981633974483D) * var16;
         double var24 = 0.5D + Math.sin(var14 + 0.7853981633974483D) * var16;
         double var26 = 0.5D + Math.cos(var14 + 3.9269908169872414D) * var16;
         double var28 = 0.5D + Math.sin(var14 + 3.9269908169872414D) * var16;
         double var30 = 0.5D + Math.cos(var14 + 5.497787143782138D) * var16;
         double var32 = 0.5D + Math.sin(var14 + 5.497787143782138D) * var16;
         double var34 = (double)(256.0F * var9);
         double var36 = 0.0D;
         double var38 = 1.0D;
         double var40 = (double)(-1.0F + var12);
         double var42 = (double)(256.0F * var9) * (0.5D / var16) + var40;
         var10.addVertexWithUV(var2 + var18, var4 + var34, var6 + var20, var38, var42);
         var10.addVertexWithUV(var2 + var18, var4, var6 + var20, var38, var40);
         var10.addVertexWithUV(var2 + var22, var4, var6 + var24, var36, var40);
         var10.addVertexWithUV(var2 + var22, var4 + var34, var6 + var24, var36, var42);
         var10.addVertexWithUV(var2 + var30, var4 + var34, var6 + var32, var38, var42);
         var10.addVertexWithUV(var2 + var30, var4, var6 + var32, var38, var40);
         var10.addVertexWithUV(var2 + var26, var4, var6 + var28, var36, var40);
         var10.addVertexWithUV(var2 + var26, var4 + var34, var6 + var28, var36, var42);
         var10.addVertexWithUV(var2 + var22, var4 + var34, var6 + var24, var38, var42);
         var10.addVertexWithUV(var2 + var22, var4, var6 + var24, var38, var40);
         var10.addVertexWithUV(var2 + var30, var4, var6 + var32, var36, var40);
         var10.addVertexWithUV(var2 + var30, var4 + var34, var6 + var32, var36, var42);
         var10.addVertexWithUV(var2 + var26, var4 + var34, var6 + var28, var38, var42);
         var10.addVertexWithUV(var2 + var26, var4, var6 + var28, var38, var40);
         var10.addVertexWithUV(var2 + var18, var4, var6 + var20, var36, var40);
         var10.addVertexWithUV(var2 + var18, var4 + var34, var6 + var20, var36, var42);
         var10.getVisible8();
         GL11.glEnable(3042);
         buu.method_9081(770, 771, 1, 0);
         GL11.glDepthMask(false);
         var10.setVisible2();
         var10.setVisible9(255, 255, 255, 32);
         double var44 = 0.2D;
         double var46 = 0.2D;
         double var48 = 0.8D;
         double var50 = 0.2D;
         double var52 = 0.2D;
         double var54 = 0.8D;
         double var56 = 0.8D;
         double var58 = 0.8D;
         double var60 = (double)(256.0F * var9);
         double var62 = 0.0D;
         double var64 = 1.0D;
         double var66 = (double)(-1.0F + var12);
         double var68 = (double)(256.0F * var9) + var66;
         var10.addVertexWithUV(var2 + var44, var4 + var60, var6 + var46, var64, var68);
         var10.addVertexWithUV(var2 + var44, var4, var6 + var46, var64, var66);
         var10.addVertexWithUV(var2 + var48, var4, var6 + var50, var62, var66);
         var10.addVertexWithUV(var2 + var48, var4 + var60, var6 + var50, var62, var68);
         var10.addVertexWithUV(var2 + var56, var4 + var60, var6 + var58, var64, var68);
         var10.addVertexWithUV(var2 + var56, var4, var6 + var58, var64, var66);
         var10.addVertexWithUV(var2 + var52, var4, var6 + var54, var62, var66);
         var10.addVertexWithUV(var2 + var52, var4 + var60, var6 + var54, var62, var68);
         var10.addVertexWithUV(var2 + var48, var4 + var60, var6 + var50, var64, var68);
         var10.addVertexWithUV(var2 + var48, var4, var6 + var50, var64, var66);
         var10.addVertexWithUV(var2 + var56, var4, var6 + var58, var62, var66);
         var10.addVertexWithUV(var2 + var56, var4 + var60, var6 + var58, var62, var68);
         var10.addVertexWithUV(var2 + var52, var4 + var60, var6 + var54, var64, var68);
         var10.addVertexWithUV(var2 + var52, var4, var6 + var54, var64, var66);
         var10.addVertexWithUV(var2 + var44, var4, var6 + var46, var62, var66);
         var10.addVertexWithUV(var2 + var44, var4 + var60, var6 + var46, var62, var68);
         var10.getVisible8();
         GL11.glEnable(2896);
         GL11.glEnable(3553);
         GL11.glDepthMask(true);
      }

   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public void method_3392(class_580 var1, double var2, double var4, double var6, float var8) {
      this.method_3415((class_596)var1, var2, var4, var6, var8);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3416() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "µp5GE6²:(]~^\'¸:/VkT<¯J/VkZ}±{*Y:cñ,{";
      int var5 = "µp5GE6²:(]~^\'¸:/VkT<¯J/VkZ}±{*Y:cñ,{".length();
      char var2 = 31;
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
                  field_2695 = "CL_00000962";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/beacon_beam.png");
                  field_2694 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 151;
               break;
            case 1:
               var10009 = 67;
               break;
            case 2:
               var10009 = 27;
               break;
            case 3:
               var10009 = 101;
               break;
            case 4:
               var10009 = 92;
               break;
            case 5:
               var10009 = 97;
               break;
            default:
               var10009 = 5;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

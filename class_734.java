import org.lwjgl.opengl.GL11;

// $FF: renamed from: wi
public class class_734 extends class_716 {

   // $FF: renamed from: aJ bqx
   private static final bqx field_3259;
   // $FF: renamed from: aK int
   private int field_3260;
   // $FF: renamed from: aL int
   private int field_3261;
   // $FF: renamed from: aM bqf
   private bqf field_3262;
   // $FF: renamed from: aN java.lang.String
   private static final String field_3263;


   // $FF: renamed from: <init> (bqf, ahb, double, double, double) void
   public void method_4120(bqf var1, ahb var2, double var3, double var5, double var7) {
      super.method_4093(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.field_3262 = var1;
      this.field_2997 = this.field_2998 = this.field_2999 = 0.0D;
      this.field_3261 = 200;
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String[] var10000 = class_752.method_4253();
      float var9 = ((float)this.field_3260 + var2) / (float)this.field_3261;
      String[] var8 = var10000;
      var9 *= var9;
      float var10 = 2.0F - var9 * 2.0F;
      float var17;
      int var16 = (var17 = var10 - 1.0F) == 0.0F?0:(var17 < 0.0F?-1:1);
      if(var8 != null) {
         if(var16 > 0) {
            var10 = 1.0F;
         }

         var10 *= 0.2F;
         var16 = 2896;
      }

      GL11.glDisable(var16);
      float var11 = 0.125F;
      float var12 = (float)(this.field_2994 - field_3226);
      float var13 = (float)(this.field_2995 - field_3227);
      float var14 = (float)(this.field_2996 - field_3228);
      float var15 = this.field_2990.method_2077(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996));
      this.field_3262.bindTexture(field_3259);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      var1.setVisible2();
      var1.setVisible7(var15, var15, var15, var10);
      var1.addVertexWithUV((double)(var12 - var11), (double)var13, (double)(var14 + var11), 0.0D, 1.0D);
      var1.addVertexWithUV((double)(var12 + var11), (double)var13, (double)(var14 + var11), 1.0D, 1.0D);
      var1.addVertexWithUV((double)(var12 + var11), (double)var13, (double)(var14 - var11), 1.0D, 0.0D);
      var1.addVertexWithUV((double)(var12 - var11), (double)var13, (double)(var14 - var11), 0.0D, 0.0D);
      var1.getVisible8();
      GL11.glDisable(3042);
      GL11.glEnable(2896);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      ++this.field_3260;
      String[] var1 = var10000;
      class_734 var2 = this;
      if(var1 != null) {
         if(this.field_3260 != this.field_3261) {
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
      String var3 = "uJ/W¿ r \'B¸&bC2\f¬=u_%J¤&QqA0Bc\búbO1g";
      int var5 = "uJ/W¿ r \'B¸&bC2\f¬=u_%J¤&QqA0Bc\búbO1g".length();
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
                  field_3263 = "CL_00000908";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/particle/footprint.png");
                  field_3259 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 105;
               break;
            case 1:
               var10009 = 71;
               break;
            case 2:
               var10009 = 63;
               break;
            case 3:
               var10009 = 75;
               break;
            case 4:
               var10009 = 162;
               break;
            case 5:
               var10009 = 58;
               break;
            default:
               var10009 = 23;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

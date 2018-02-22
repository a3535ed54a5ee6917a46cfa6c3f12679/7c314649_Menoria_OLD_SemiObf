import org.lwjgl.opengl.GL11;

// $FF: renamed from: mt
public class class_1407 {

   // $FF: renamed from: b bqx
   private static final bqx field_7494;
   // $FF: renamed from: c bao
   private final bao field_7495;
   // $FF: renamed from: d float
   private float field_7496;
   // $FF: renamed from: e int
   private int field_7497;
   // $FF: renamed from: f java.lang.String
   private static final String field_7498;


   // $FF: renamed from: <init> (bao) void
   public void method_7682(bao var1) {
      super();
      this.field_7496 = 1.0F;
      this.field_7497 = 1;
      this.field_7495 = var1;
   }

   // $FF: renamed from: b (int, int) void
   public void method_7683(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_7495.method_5297().method_196();
      if(var3 != null) {
         if(var10000 == 0) {
            return;
         }

         GL11.glEnable(3042);
         var10000 = this.field_7495.method_5297().method_209();
      }

      int var4 = var10000;
      if(var3 != null) {
         if(var4 > 0) {
            String var5 = "" + var4;
            int var6 = this.field_7495.enableBackgroundDrawing4.getCharWidth(var5);
            boolean var7 = true;
            int var8 = var1 - var6 - 1;
            int var9 = var2 + 20 - 1;
            int var10 = var2 + 20 + this.field_7495.enableBackgroundDrawing4.FONT_HEIGHT - 1;
            GL11.glDisable(3553);
            bmh var11 = bmh.instance;
            GL11.glColor4f(0.0F, 0.0F, 0.0F, (0.65F + 0.35000002F * this.field_7496) / 2.0F);
            var11.setVisible2();
            var11.method_7462((double)var8, (double)var10, 0.0D);
            var11.method_7462((double)var1, (double)var10, 0.0D);
            var11.method_7462((double)var1, (double)var9, 0.0D);
            var11.method_7462((double)var8, (double)var9, 0.0D);
            var11.getVisible8();
            GL11.glEnable(3553);
            this.field_7495.enableBackgroundDrawing4.method_7020(var5, var1 - var6, var2 + 20, 16777215);
         }

         this.method_7684(var1, var2, this.method_7685(), 0);
      }

      this.method_7684(var1, var2, this.method_7686(), 17);
   }

   // $FF: renamed from: b (int, int, int, int) void
   private void method_7684(int var1, int var2, int var3, int var4) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.65F + 0.35000002F * this.field_7496);
      this.field_7495.method_5288().bindTexture(field_7494);
      float var5 = 150.0F;
      float var6 = 0.0F;
      float var7 = (float)var3 * 0.015625F;
      float var8 = 1.0F;
      float var9 = (float)(var3 + 16) * 0.015625F;
      bmh var10 = bmh.instance;
      var10.setVisible2();
      var10.addVertexWithUV((double)(var1 - 16 - var4), (double)(var2 + 16), (double)var5, (double)var6, (double)var9);
      var10.addVertexWithUV((double)(var1 - var4), (double)(var2 + 16), (double)var5, (double)var8, (double)var9);
      var10.addVertexWithUV((double)(var1 - var4), (double)(var2 + 0), (double)var5, (double)var8, (double)var7);
      var10.addVertexWithUV((double)(var1 - 16 - var4), (double)(var2 + 0), (double)var5, (double)var6, (double)var7);
      var10.getVisible8();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a () int
   private int method_7685() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_7495.method_5297().method_198();
      if(var1 != null) {
         var10000 = var10000 != 0?16:0;
      }

      return var10000;
   }

   // $FF: renamed from: b () int
   private int method_7686() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_7495.method_5297().method_218();
      if(var1 != null) {
         var10000 = var10000 != 0?48:32;
      }

      return var10000;
   }

   // $FF: renamed from: c () void
   public void method_7687() {
      String[] var1 = class_752.method_4253();
      class_1407 var10000 = this;
      if(var1 != null) {
         if(this.field_7495.method_5297().method_196()) {
            label35: {
               this.field_7496 += 0.025F * (float)this.field_7497;
               float var3;
               int var2 = (var3 = this.field_7496 - 0.0F) == 0.0F?0:(var3 < 0.0F?-1:1);
               if(var1 != null) {
                  if(var2 < 0) {
                     this.field_7497 *= -1;
                     this.field_7496 = 0.0F;
                     if(var1 != null) {
                        return;
                     }
                  }

                  var10000 = this;
                  if(var1 == null) {
                     break label35;
                  }

                  float var4;
                  var2 = (var4 = this.field_7496 - 1.0F) == 0.0F?0:(var4 < 0.0F?-1:1);
               }

               if(var2 <= 0) {
                  return;
               }

               this.field_7497 *= -1;
               var10000 = this;
            }

            var10000.field_7496 = 1.0F;
            if(var1 != null) {
               return;
            }
         }

         this.field_7496 = 1.0F;
         var10000 = this;
      }

      var10000.field_7497 = 1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7688() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "¢ðä%ñÄkÐ,!ÙÃa´>Ü`¨Û(ÎÞt¬«2ØÒv 4Ë{¦";
      int var5 = "¢ðä%ñÄkÐ,!ÙÃa´>Ü`¨Û(ÎÞt¬«2ØÒv 4Ë{¦".length();
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
                  field_7498 = "CL_00001849";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/gui/stream_indicator.png");
                  field_7494 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 215;
               break;
            case 1:
               var10009 = 138;
               break;
            case 2:
               var10009 = 141;
               break;
            case 3:
               var10009 = 35;
               break;
            case 4:
               var10009 = 247;
               break;
            case 5:
               var10009 = 194;
               break;
            default:
               var10009 = 109;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

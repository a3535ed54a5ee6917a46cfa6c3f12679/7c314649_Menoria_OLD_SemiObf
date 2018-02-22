import org.lwjgl.opengl.GL11;

// $FF: renamed from: oY
public class class_820 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3824;
   // $FF: renamed from: h bqx
   private static final bqx field_3825;
   // $FF: renamed from: i nd
   private final class_1220 field_3826;
   // $FF: renamed from: j java.lang.String
   private static final String field_3827;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      class_1220 var10001 = new class_1220;
      var10001.method_6510();
      this.field_3826 = var10001;
   }

   // $FF: renamed from: b (float, float, float) float
   private float method_4778(float var1, float var2, float var3) {
      String[] var10000 = class_752.method_4253();
      float var5 = var2 - var1;
      String[] var4 = var10000;

      float var6;
      label27:
      while(true) {
         if(var5 < -180.0F) {
            var5 += 360.0F;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         while(true) {
            if(var5 < 180.0F) {
               break label27;
            }

            var6 = var5 - 360.0F;
            if(var4 == null) {
               return var6;
            }

            var5 = var6;
            if(var4 == null) {
               break label27;
            }
         }
      }

      var6 = var1 + var3 * var5;
      return var6;
   }

   // $FF: renamed from: b (xG, double, double, double, float, float) void
   public void method_4779(class_709 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      float var10 = this.method_4778(var1.field_3002, var1.field_3000, var9);
      float var11 = var1.field_3003 + (var1.field_3001 - var1.field_3003) * var9;
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var12 = 0.0625F;
      GL11.glEnable('\u803a');
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      GL11.glEnable(3008);
      this.method_4731(var1);
      this.field_3826.method_6511(var1, 0.0F, 0.0F, 0.0F, var10, var11, var12);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (xG) bqx
   protected bqx method_4780(class_709 var1) {
      return var1.method_4069()?field_3824:field_3825;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4780((class_709)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4779((class_709)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "­¸ÙÈ#ØsÑÔÜ.6a1Îz;Î{0Î{0¾f,l!6a1Îz;Î{0Î{0Ï";
      int var5 = "­¸ÙÈ#ØsÑÔÜ.6a1Îz;Î{0Î{0¾f,l!6a1Îz;Î{0Î{0Ï".length();
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
                  field_3827 = "CL_00001035";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/wither/wither_invulnerable.png");
                  field_3824 = var9;
                  var9 = new bqx;
                  var9.method_8227("textures/entity/wither/wither.png");
                  field_3825 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 68;
               break;
            case 1:
               var10009 = 231;
               break;
            case 2:
               var10009 = 225;
               break;
            case 3:
               var10009 = 239;
               break;
            case 4:
               var10009 = 254;
               break;
            case 5:
               var10009 = 21;
               break;
            default:
               var10009 = 238;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

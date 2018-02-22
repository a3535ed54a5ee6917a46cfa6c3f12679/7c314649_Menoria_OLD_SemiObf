import org.lwjgl.opengl.GL11;

// $FF: renamed from: op
public class class_809 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3795;
   // $FF: renamed from: h m3
   private class_1240 field_3796;
   // $FF: renamed from: i java.lang.String
   private static final String field_3797;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      class_1240 var10001 = new class_1240;
      var10001.method_6510();
      this.field_3796 = var10001;
   }

   // $FF: renamed from: b (wE, double, double, double, float, float) void
   public void method_4747(class_750 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var10 = 0.0625F;
      GL11.glEnable('\u803a');
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      GL11.glEnable(3008);
      this.method_4731(var1);
      this.field_3796.method_6511(var1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, var10);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (wE) bqx
   protected bqx method_4748(class_750 var1) {
      return field_3795;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4748((class_750)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4747((class_750)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "¥Róæ¼ÕqÙ<ó4u·£þ3Æh­¢å9Æa¦·èº+b·øü\'";
      int var5 = "¥Róæ¼ÕqÙ<ó4u·£þ3Æh­¢å9Æa¦·èº+b·øü\'".length();
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
                  field_3797 = "CL_00001010";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/lead_knot.png");
                  field_3795 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 176;
               break;
            case 1:
               var10009 = 25;
               break;
            case 2:
               var10009 = 253;
               break;
            case 3:
               var10009 = 51;
               break;
            case 4:
               var10009 = 38;
               break;
            case 5:
               var10009 = 124;
               break;
            default:
               var10009 = 21;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

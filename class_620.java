import org.lwjgl.opengl.GL11;

// $FF: renamed from: n8
public class class_620 extends class_614 {

   // $FF: renamed from: a bqx
   private static final bqx field_2678;
   // $FF: renamed from: d mS
   private class_1226 field_2679;
   // $FF: renamed from: e java.lang.String
   private static final String field_2680;


   // $FF: renamed from: <init> () void
   public void method_3391() {
      super.method_3391();
      class_1226 var10001 = new class_1226;
      var10001.method_6510();
      this.field_2679 = var10001;
   }

   // $FF: renamed from: b (gt, double, double, double, float) void
   public void method_3409(class_587 var1, double var2, double var4, double var6, float var8) {
      int var10 = 0;
      String[] var9 = class_752.method_4253();
      byte var10000 = var1.getBlock91();
      if(var9 != null) {
         if(var10000 != 0) {
            var10 = var1.getBlock96();
         }

         this.method_3393(field_2678);
         GL11.glPushMatrix();
         GL11.glEnable('\u803a');
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
         GL11.glScalef(1.0F, -1.0F, -1.0F);
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         var10000 = 0;
      }

      short var11 = var10000;
      int var13 = var10;
      byte var10001 = 2;
      if(var9 != null) {
         if(var10 == 2) {
            var11 = 180;
         }

         var13 = var10;
         var10001 = 3;
      }

      if(var9 != null) {
         if(var13 == var10001) {
            var11 = 0;
         }

         var13 = var10;
         var10001 = 4;
      }

      label48: {
         if(var9 != null) {
            if(var13 == var10001) {
               var11 = 90;
            }

            var13 = var10;
            if(var9 == null) {
               break label48;
            }

            var10001 = 5;
         }

         if(var13 == var10001) {
            var11 = -90;
         }

         var13 = var11;
      }

      GL11.glRotatef((float)var13, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
      float var12 = var1.field_2498 + (var1.field_2497 - var1.field_2498) * var8;
      var12 = 1.0F - var12;
      var12 = 1.0F - var12 * var12 * var12;
      this.field_2679.field_6369.field_6548 = -(var12 * 3.1415927F / 2.0F);
      this.field_2679.drawRect3();
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public void method_3392(class_580 var1, double var2, double var4, double var6, float var8) {
      this.method_3409((class_587)var1, var2, var4, var6, var8);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3410() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "\t¬£[Áæ\t ¢@Ðæ³ZÐR¬\n³[\r§>3^æMðZY";
      int var5 = "\t¬£[Áæ\t ¢@Ðæ³ZÐR¬\n³[\r§>3^æMðZY".length();
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
                  field_2680 = "CL_00000967";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/chest/ender.png");
                  field_2678 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 1;
               break;
            case 1:
               var10009 = 181;
               break;
            case 2:
               var10009 = 16;
               break;
            case 3:
               var10009 = 18;
               break;
            case 4:
               var10009 = 170;
               break;
            case 5:
               var10009 = 85;
               break;
            default:
               var10009 = 216;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

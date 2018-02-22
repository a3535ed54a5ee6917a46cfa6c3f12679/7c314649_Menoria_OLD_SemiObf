import org.lwjgl.opengl.GL11;

// $FF: renamed from: oK
public class class_843 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3899;
   // $FF: renamed from: k nf
   private class_1218 field_3900;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1218 var10001 = new class_1218;
      var10001.method_6510();
      super.method_4798(var10001, 0.5F);
      this.field_3900 = (class_1218)super.field_3844;
      this.method_4799(this.field_3900);
   }

   // $FF: renamed from: b (wW, float) void
   protected void method_4890(class_766 var1, float var2) {
      label25: {
         super.method_4807(var1, var2);
         add var10000 = new add;
         var10000.method_3722(class_1192.field_6112, 1);
         add var4 = var10000;
         String[] var3 = class_752.method_4253();
         boolean var6 = var4.method_3730() instanceof abh;
         if(var3 != null) {
            if(!var6) {
               return;
            }

            GL11.glPushMatrix();
            this.field_3900.field_6332.method_6648(0.0625F);
            if(var3 == null) {
               break label25;
            }

            var6 = blm.drawTextBox7(aji.method_2417(var4.method_3730()).method_2436());
         }

         if(var6) {
            float var5 = 0.625F;
            GL11.glTranslatef(0.0F, -0.34375F, 0.0F);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
         }

         this.field_3788.field_7424.method_3231(var1, var4, 0);
      }

      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (wW) bqx
   protected bqx method_4891(class_766 var1) {
      return field_3899;
   }

   // $FF: renamed from: c (sv, float) void
   // $FF: synthetic method
   protected void method_4807(class_752 var1, float var2) {
      this.method_4890((class_766)var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "´îß<iøxþóÅ=rérþåÅ&lðj¿¸Û\'|".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var5)).intern();
            bqx var3 = new bqx;
            var3.method_8227(var0);
            field_3899 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 67;
            break;
         case 1:
            var10009 = 153;
            break;
         case 2:
            var10009 = 222;
            break;
         case 3:
            var10009 = 227;
            break;
         case 4:
            var10009 = 1;
            break;
         case 5:
            var10009 = 83;
            break;
         default:
            var10009 = 213;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}

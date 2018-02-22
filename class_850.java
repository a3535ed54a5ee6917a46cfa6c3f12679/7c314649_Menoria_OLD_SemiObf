import org.lwjgl.opengl.GL11;

// $FF: renamed from: oD
public class class_850 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3916;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1241 var10001 = new class_1241;
      var10001.method_6510();
      super.method_4798(var10001, 0.25F);
   }

   // $FF: renamed from: b (xe) bqx
   protected bqx method_4912(class_755 var1) {
      return field_3916;
   }

   // $FF: renamed from: b (xe, float) void
   protected void method_4913(class_755 var1, float var2) {
      int var3 = var1.method_4304();
      float var4 = (var1.field_3390 + (var1.field_3389 - var1.field_3390) * var2) / ((float)var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      float var6 = (float)var3;
      GL11.glScalef(var5 * var6, 1.0F / var5 * var6, var5 * var6);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "w)È#Øj3É8Ø|1Ô<Ín:Ð0jsÍ?".toCharArray();
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
            field_3916 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 40;
            break;
         case 1:
            var10009 = 61;
            break;
         case 2:
            var10009 = 197;
            break;
         case 3:
            var10009 = 151;
            break;
         case 4:
            var10009 = 119;
            break;
         case 5:
            var10009 = 155;
            break;
         default:
            var10009 = 62;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}

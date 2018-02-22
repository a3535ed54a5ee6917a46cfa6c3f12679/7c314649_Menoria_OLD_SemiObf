import org.lwjgl.opengl.GL11;

// $FF: renamed from: oL
public class class_842 extends bov {

   // $FF: renamed from: h bqx
   private static final bqx field_3898;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      this.field_3790 *= 0.7F;
   }

   // $FF: renamed from: b (w7, float) void
   protected void method_4888(class_785 var1, float var2) {
      GL11.glScalef(0.7F, 0.7F, 0.7F);
   }

   // $FF: renamed from: b (w7) bqx
   protected bqx method_4889(class_785 var1) {
      return field_3898;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "¬äA\na©«Où[z¸¡OïEw©ªOÿT\tv«õQaâ¨û".toCharArray();
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
            field_3898 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 227;
            break;
         case 1:
            var10009 = 91;
            break;
         case 2:
            var10009 = 167;
            break;
         case 3:
            var10009 = 14;
            break;
         case 4:
            var10009 = 68;
            break;
         case 5:
            var10009 = 40;
            break;
         default:
            var10009 = 247;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}

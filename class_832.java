
// $FF: renamed from: ov
public class class_832 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3868;


   // $FF: renamed from: <init> (bhr, float) void
   public void method_4798(bhr var1, float var2) {
      super.method_4798(var1, var2);
   }

   // $FF: renamed from: b (wP) bqx
   protected bqx method_4847(class_773 var1) {
      return field_3868;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "s-;\'(À 90!&3Ñ\n96 %uÆa{?<=".toCharArray();
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
            field_3868 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 113;
            break;
         case 1:
            var10009 = 20;
            break;
         case 2:
            var10009 = 87;
            break;
         case 3:
            var10009 = 77;
            break;
         case 4:
            var10009 = 80;
            break;
         case 5:
            var10009 = 88;
            break;
         default:
            var10009 = 167;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}

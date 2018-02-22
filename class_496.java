
// $FF: renamed from: aW
class class_496 extends class_492 {

   // $FF: renamed from: a java.lang.String
   private static final String field_2300 = "CL_00001752";
   // $FF: renamed from: g Aq
   final class_681 field_2301;


   // $FF: renamed from: <init> (Aq, vI, int, int, int) void
   void method_2891(class_681 var1, class_22 var2, int var3, int var4, int var5) {
      this.field_2301 = var1;
      super.method_2869(var2, var3, var4, var5);
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000;
      if(super.method_2874(var1) && var1.method_3730() == class_1010.field_5187) {
         var10000 = this.method_2876();
         if(var2 == null) {
            return var10000;
         }

         if(!var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2892() {
      boolean var10000 = true;
      char[] var10003 = "Plf æ¤Ý\"\f¢".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2300 = (new String((char[])var4)).intern();
            String var2 = field_2300;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 87;
            break;
         case 1:
            var10009 = 100;
            break;
         case 2:
            var10009 = 125;
            break;
         case 3:
            var10009 = 212;
            break;
         case 4:
            var10009 = 146;
            break;
         case 5:
            var10009 = 208;
            break;
         default:
            var10009 = 169;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

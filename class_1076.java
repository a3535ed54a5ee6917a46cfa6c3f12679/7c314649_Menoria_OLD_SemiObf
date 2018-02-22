
// $FF: renamed from: h2
final class class_1076 extends class_1075 {

   // $FF: renamed from: a java.lang.String
   private static final String field_5671 = "CL_00000485";


   // $FF: renamed from: <init> (java.lang.Class, int, int) void
   void method_6104(Class var1, int var2, int var3) {
      super.method_6104(var1, var2, var3);
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_6105(int var1) {
      int var10000;
      label24: {
         String[] var2 = class_752.method_4253();
         var10000 = super.method_6105(var1);
         if(var2 != null) {
            if(var10000 == 0) {
               break label24;
            }

            var10000 = var1;
         }

         if(var2 == null) {
            return (boolean)var10000;
         }

         if(var10000 > 5) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6107() {
      boolean var10000 = true;
      char[] var10003 = "I`uAÁú1p".toCharArray();
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
            field_5671 = (new String((char[])var4)).intern();
            String var2 = field_5671;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 237;
            break;
         case 1:
            var10009 = 34;
            break;
         case 2:
            var10009 = 24;
            break;
         case 3:
            var10009 = 98;
            break;
         case 4:
            var10009 = 1;
            break;
         case 5:
            var10009 = 86;
            break;
         default:
            var10009 = 214;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

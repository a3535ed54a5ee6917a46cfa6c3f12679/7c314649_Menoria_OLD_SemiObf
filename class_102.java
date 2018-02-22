
// $FF: renamed from: Q
enum class_102 {

   // $FF: renamed from: S java.lang.String
   private static final String field_145 = "CL_00000654";


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, boolean, boolean, float, float, float, java.lang.Object, java.lang.Object, java.lang.Object) void
   void method_483(String var1, int var2, String var3, int var4, String var5, int var6, String var7, int var8, String var9, boolean var10, boolean var11, float var12, float var13, float var14, Object var15, Object var16, Object var17) {
      super.method_481(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, (class_1326)null);
   }

   // $FF: renamed from: g (float) float
   protected float method_476(float var1) {
      return (float)class_1715.method_9585((int)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_482() {
      boolean var10000 = true;
      char[] var10003 = "îÅô:Î¿".toCharArray();
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
            field_145 = (new String((char[])var4)).intern();
            String var2 = field_145;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 113;
            break;
         case 1:
            var10009 = 85;
            break;
         case 2:
            var10009 = 119;
            break;
         case 3:
            var10009 = 253;
            break;
         case 4:
            var10009 = 214;
            break;
         case 5:
            var10009 = 34;
            break;
         default:
            var10009 = 111;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

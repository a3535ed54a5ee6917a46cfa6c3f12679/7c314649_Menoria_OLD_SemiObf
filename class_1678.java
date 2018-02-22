
// $FF: renamed from: vO
class class_1678 extends class_1674 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8751 = "CL_00001746";
   // $FF: renamed from: g Ao
   final class_683 field_8752;


   // $FF: renamed from: <init> (Ao, java.lang.String, boolean, int) void
   void method_9247(class_683 var1, String var2, boolean var3, int var4) {
      this.field_8752 = var1;
      super.method_9235(var2, var3, var4);
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 1;
   }

   // $FF: renamed from: l () void
   public void method_91() {
      super.method_91();
      this.field_8752.method_3659(this);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9248() {
      boolean var10000 = true;
      char[] var10003 = "_3ùg`éY".toCharArray();
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
            field_8751 = (new String((char[])var4)).intern();
            String var2 = field_8751;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 30;
            break;
         case 1:
            var10009 = 31;
            break;
         case 2:
            var10009 = 149;
            break;
         case 3:
            var10009 = 39;
            break;
         case 4:
            var10009 = 233;
            break;
         case 5:
            var10009 = 75;
            break;
         default:
            var10009 = 129;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

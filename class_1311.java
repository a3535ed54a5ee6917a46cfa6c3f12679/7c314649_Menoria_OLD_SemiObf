
// $FF: renamed from: kC
class class_1311 implements class_35 {

   // $FF: renamed from: a java.lang.String
   private static final String field_6728 = "CL_00001852";
   // $FF: renamed from: b bao
   final bao field_6729;


   // $FF: renamed from: <init> (bao) void
   void method_6915(bao var1) {
      this.field_6729 = var1;
      super();
   }

   // $FF: renamed from: a (boolean, int) void
   public void method_160(boolean var1, int var2) {
      String[] var3 = class_752.method_4253();
      if(var3 != null) {
         if(var1) {
            this.field_6729.method_5297().method_203();
         }

         this.field_6729.method_5236((bdw)null);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6916() {
      boolean var10000 = true;
      char[] var10003 = "s³×YCÇ½[".toCharArray();
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
            field_6728 = (new String((char[])var4)).intern();
            String var2 = field_6728;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 142;
            break;
         case 1:
            var10009 = 65;
            break;
         case 2:
            var10009 = 54;
            break;
         case 3:
            var10009 = 215;
            break;
         case 4:
            var10009 = 139;
            break;
         case 5:
            var10009 = 16;
            break;
         default:
            var10009 = 205;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

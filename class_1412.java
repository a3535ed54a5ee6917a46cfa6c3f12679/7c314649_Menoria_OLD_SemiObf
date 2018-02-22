
// $FF: renamed from: mv
class class_1412 {

   // $FF: renamed from: b adb
   public adb field_7523;
   // $FF: renamed from: c java.lang.String
   public String field_7524;
   // $FF: renamed from: d java.lang.String
   public String field_7525;
   // $FF: renamed from: e java.lang.String
   private static final String field_7526 = "CL_00000705";


   // $FF: renamed from: <init> (adb, java.lang.String, java.lang.String) void
   public void method_7710(adb var1, String var2, String var3) {
      super();
      this.field_7523 = var1;
      this.field_7524 = var2;
      this.field_7525 = var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7711() {
      boolean var10000 = true;
      char[] var10003 = "¤ÐÐ¶×«ö".toCharArray();
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
            field_7526 = (new String((char[])var4)).intern();
            String var2 = field_7526;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 59;
            break;
         case 1:
            var10009 = 64;
            break;
         case 2:
            var10009 = 26;
            break;
         case 3:
            var10009 = 238;
            break;
         case 4:
            var10009 = 106;
            break;
         case 5:
            var10009 = 60;
            break;
         default:
            var10009 = 90;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

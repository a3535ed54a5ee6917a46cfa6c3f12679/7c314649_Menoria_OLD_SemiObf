
// $FF: renamed from: tW
public class class_1612 {

   // $FF: renamed from: b java.lang.String
   private final String field_8410;
   // $FF: renamed from: c int
   private final int field_8411;
   // $FF: renamed from: d java.lang.String
   private static final String field_8412 = "CL_00001389";


   // $FF: renamed from: <init> (java.lang.String, int) void
   public void method_8815(String var1, int var2) {
      super();
      this.field_8410 = var1;
      this.field_8411 = var2;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8816() {
      return this.field_8410;
   }

   // $FF: renamed from: c () int
   public int method_8817() {
      return this.field_8411;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8818() {
      boolean var10000 = true;
      char[] var10003 = ";&xðDA".toCharArray();
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
            field_8412 = (new String((char[])var4)).intern();
            String var2 = field_8412;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 188;
            break;
         case 1:
            var10009 = 10;
            break;
         case 2:
            var10009 = 4;
            break;
         case 3:
            var10009 = 193;
            break;
         case 4:
            var10009 = 219;
            break;
         case 5:
            var10009 = 204;
            break;
         default:
            var10009 = 53;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

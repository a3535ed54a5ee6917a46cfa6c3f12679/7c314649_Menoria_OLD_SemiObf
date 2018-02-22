
// $FF: renamed from: qd
public class class_1527 {

   // $FF: renamed from: b java.lang.String
   private String field_8015;
   // $FF: renamed from: c java.lang.String
   private String field_8016;
   // $FF: renamed from: d long
   private long field_8017;
   // $FF: renamed from: e java.lang.String
   private static final String field_8018 = "CL_00001134";


   // $FF: renamed from: <init> (java.lang.String, java.lang.String) void
   public void method_8273(String var1, String var2) {
      super();
      this.field_8015 = var1;
      this.field_8016 = var2;
      this.field_8017 = bao.method_5283();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8274() {
      return this.field_8015;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_8275() {
      return this.field_8016;
   }

   // $FF: renamed from: d () void
   public void method_8276() {
      this.field_8017 = bao.method_5283();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8277() {
      boolean var10000 = true;
      char[] var10003 = "úÞÅF¶j²Á".toCharArray();
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
            field_8018 = (new String((char[])var4)).intern();
            String var2 = field_8018;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 230;
            break;
         case 1:
            var10009 = 11;
            break;
         case 2:
            var10009 = 60;
            break;
         case 3:
            var10009 = 72;
            break;
         case 4:
            var10009 = 203;
            break;
         case 5:
            var10009 = 136;
            break;
         default:
            var10009 = 59;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

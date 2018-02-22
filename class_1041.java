import java.util.concurrent.Callable;

// $FF: renamed from: dn
class class_1041 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_5504 = "CL_00000141";
   // $FF: renamed from: b int
   final int field_5505;
   // $FF: renamed from: c int
   final int field_5506;
   // $FF: renamed from: d ahb
   final ahb field_5507;


   // $FF: renamed from: <init> (ahb, int, int) void
   void method_5893(ahb var1, int var2, int var3) {
      this.field_5507 = var1;
      this.field_5505 = var2;
      this.field_5506 = var3;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_5894() {
      return class_1605.method_8776(this.field_5505, 0, this.field_5506);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5895() {
      boolean var10000 = true;
      char[] var10003 = "JÐC)Cw7»B".toCharArray();
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
            field_5504 = (new String((char[])var4)).intern();
            String var2 = field_5504;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 144;
            break;
         case 1:
            var10009 = 209;
            break;
         case 2:
            var10009 = 88;
            break;
         case 3:
            var10009 = 164;
            break;
         case 4:
            var10009 = 246;
            break;
         case 5:
            var10009 = 206;
            break;
         default:
            var10009 = 164;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

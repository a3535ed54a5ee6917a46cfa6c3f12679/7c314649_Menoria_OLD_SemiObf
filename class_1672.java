import java.util.concurrent.Callable;

// $FF: renamed from: ul
final class class_1672 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8734 = "CL_00001465";
   // $FF: renamed from: b int
   final int field_8735;
   // $FF: renamed from: c int
   final int field_8736;
   // $FF: renamed from: d int
   final int field_8737;


   // $FF: renamed from: <init> (int, int, int) void
   void method_9229(int var1, int var2, int var3) {
      this.field_8735 = var1;
      this.field_8736 = var2;
      this.field_8737 = var3;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_9230() {
      return class_1605.method_8776(this.field_8735, this.field_8736, this.field_8737);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9231() {
      boolean var10000 = true;
      char[] var10003 = "¯W!BÔK)Ý/HG".toCharArray();
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
            field_8734 = (new String((char[])var4)).intern();
            String var2 = field_8734;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 179;
            break;
         case 1:
            var10009 = 68;
            break;
         case 2:
            var10009 = 33;
            break;
         case 3:
            var10009 = 45;
            break;
         case 4:
            var10009 = 187;
            break;
         case 5:
            var10009 = 36;
            break;
         default:
            var10009 = 70;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

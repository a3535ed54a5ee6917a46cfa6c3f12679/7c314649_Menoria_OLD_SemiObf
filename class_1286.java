import java.util.concurrent.Callable;

// $FF: renamed from: jH
final class class_1286 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6593 = "CL_00000561";
   // $FF: renamed from: b int
   final int field_6594;


   // $FF: renamed from: <init> (int) void
   void method_6720(int var1) {
      this.field_6594 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6721() {
      return String.valueOf(class_985.method_5725(this.field_6594));
   }

   // $FF: renamed from: <clinit> () void
   static void method_6722() {
      boolean var10000 = true;
      char[] var10003 = "²N>±~ùÁ7W".toCharArray();
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
            field_6593 = (new String((char[])var4)).intern();
            String var2 = field_6593;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 173;
            break;
         case 1:
            var10009 = 94;
            break;
         case 2:
            var10009 = 61;
            break;
         case 3:
            var10009 = 226;
            break;
         case 4:
            var10009 = 221;
            break;
         case 5:
            var10009 = 18;
            break;
         default:
            var10009 = 149;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

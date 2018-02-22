import io.netty.util.concurrent.GenericFutureListener;

// $FF: renamed from: rI
class class_1534 {

   // $FF: renamed from: b r1
   private final class_250 field_8056;
   // $FF: renamed from: c io.netty.util.concurrent.GenericFutureListener[]
   private final GenericFutureListener[] field_8057;
   // $FF: renamed from: d java.lang.String
   private static final String field_8058 = "CL_00001244";


   // $FF: renamed from: <init> (r1, io.netty.util.concurrent.GenericFutureListener[]) void
   public void method_8326(class_250 var1, GenericFutureListener ... var2) {
      super();
      this.field_8056 = var1;
      this.field_8057 = var2;
   }

   // $FF: renamed from: b (rI) r1
   static class_250 method_8327(class_1534 var0) {
      return var0.field_8056;
   }

   // $FF: renamed from: c (rI) io.netty.util.concurrent.GenericFutureListener[]
   static GenericFutureListener[] method_8328(class_1534 var0) {
      return var0.field_8057;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8329() {
      boolean var10000 = true;
      char[] var10003 = "§Y`w,^Õ\'hd".toCharArray();
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
            field_8058 = (new String((char[])var4)).intern();
            String var2 = field_8058;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 239;
            break;
         case 1:
            var10009 = 30;
            break;
         case 2:
            var10009 = 87;
            break;
         case 3:
            var10009 = 91;
            break;
         case 4:
            var10009 = 76;
            break;
         case 5:
            var10009 = 23;
            break;
         default:
            var10009 = 101;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

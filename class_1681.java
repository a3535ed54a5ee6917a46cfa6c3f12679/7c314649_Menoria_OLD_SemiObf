import java.util.concurrent.Callable;

// $FF: renamed from: uq
class class_1681 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8763 = "CL_00001450";
   // $FF: renamed from: b l
   final class_120 field_8764;
   // $FF: renamed from: c uo
   final class_1680 field_8765;


   // $FF: renamed from: <init> (uo, l) void
   void method_9260(class_1680 var1, class_120 var2) {
      this.field_8765 = var1;
      this.field_8764 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_9261() {
      return this.field_8764.toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9262() {
      boolean var10000 = true;
      char[] var10003 = "r«Pº< ÓðP".toCharArray();
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
            field_8763 = (new String((char[])var4)).intern();
            String var2 = field_8763;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 23;
            break;
         case 1:
            var10009 = 193;
            break;
         case 2:
            var10009 = 227;
            break;
         case 3:
            var10009 = 70;
            break;
         case 4:
            var10009 = 172;
            break;
         case 5:
            var10009 = 134;
            break;
         default:
            var10009 = 42;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

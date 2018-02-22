import java.util.concurrent.Callable;

// $FF: renamed from: rh
class class_1566 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8246 = "CL_00001217";
   // $FF: renamed from: b int
   final int field_8247;
   // $FF: renamed from: c ro
   final class_1583 field_8248;


   // $FF: renamed from: <init> (ro, int) void
   void method_8600(class_1583 var1, int var2) {
      this.field_8248 = var1;
      this.field_8247 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8601() {
      return class_1571.field_8259[this.field_8247];
   }

   // $FF: renamed from: <clinit> () void
   static void method_8602() {
      boolean var10000 = true;
      char[] var10003 = "¬B þñÞíìE".toCharArray();
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
            field_8246 = (new String((char[])var4)).intern();
            String var2 = field_8246;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 100;
            break;
         case 1:
            var10009 = 84;
            break;
         case 2:
            var10009 = 86;
            break;
         case 3:
            var10009 = 249;
            break;
         case 4:
            var10009 = 27;
            break;
         case 5:
            var10009 = 69;
            break;
         default:
            var10009 = 74;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

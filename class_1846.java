
// $FF: renamed from: yf
class class_1846 implements class_82 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9425 = "CL_00001575";
   // $FF: renamed from: e yi
   final class_1743 field_9426;


   // $FF: renamed from: <init> (yi) void
   void method_9987(class_1743 var1) {
      this.field_9426 = var1;
      super();
   }

   // $FF: renamed from: b (sa) boolean
   public boolean method_402(class_689 var1) {
      boolean var10000;
      label24: {
         String[] var2 = class_752.method_4253();
         var10000 = var1.method_3917();
         if(var2 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = class_1743.method_9688(this.field_9426).method_4258().method_9814(var1);
         }

         if(var2 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_403() {
      boolean var10000 = true;
      char[] var10003 = "@ÛY\tÛé2¢1\f".toCharArray();
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
            field_9425 = (new String((char[])var4)).intern();
            String var2 = field_9425;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 70;
            break;
         case 1:
            var10009 = 210;
            break;
         case 2:
            var10009 = 67;
            break;
         case 3:
            var10009 = 124;
            break;
         case 4:
            var10009 = 174;
            break;
         case 5:
            var10009 = 225;
            break;
         default:
            var10009 = 156;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

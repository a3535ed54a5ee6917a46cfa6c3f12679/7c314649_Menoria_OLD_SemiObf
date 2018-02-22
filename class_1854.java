
// $FF: renamed from: zi
final class class_1854 implements class_82 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9464 = "CL_00001662";


   // $FF: renamed from: <init> () void
   void method_10045() {
      super();
   }

   // $FF: renamed from: b (sa) boolean
   public boolean method_402(class_689 var1) {
      boolean var3;
      label17: {
         String[] var2 = class_752.method_4253();
         class_689 var10000 = var1;
         if(var2 != null) {
            if(!(var1 instanceof class_752)) {
               break label17;
            }

            var10000 = var1;
         }

         if(((class_752)var10000).method_4213() != class_923.field_4664) {
            var3 = true;
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_403() {
      boolean var10000 = true;
      char[] var10003 = "ÕqZè,¶N§3ê".toCharArray();
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
            field_9464 = (new String((char[])var4)).intern();
            String var2 = field_9464;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 151;
            break;
         case 1:
            var10009 = 60;
            break;
         case 2:
            var10009 = 4;
            break;
         case 3:
            var10009 = 217;
            break;
         case 4:
            var10009 = 29;
            break;
         case 5:
            var10009 = 135;
            break;
         default:
            var10009 = 127;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

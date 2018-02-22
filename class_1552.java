import com.google.common.base.Function;

// $FF: renamed from: rT
final class class_1552 implements Function {

   // $FF: renamed from: a java.lang.String
   private static final String field_8122 = "CL_00001259";


   // $FF: renamed from: <init> () void
   void method_8422() {
      super();
   }

   // $FF: renamed from: b (rV) rV
   public class_66 method_8423(class_66 var1) {
      class_66 var2 = var1.method_345();
      var2.method_337(var2.method_338().method_8536());
      return var2;
   }

   public Object apply(Object var1) {
      return this.method_8423((class_66)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8424() {
      boolean var10000 = true;
      char[] var10003 = "iL£tÝsì2É}".toCharArray();
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
            field_8122 = (new String((char[])var4)).intern();
            String var2 = field_8122;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 17;
            break;
         case 1:
            var10009 = 59;
            break;
         case 2:
            var10009 = 199;
            break;
         case 3:
            var10009 = 127;
            break;
         case 4:
            var10009 = 214;
            break;
         case 5:
            var10009 = 120;
            break;
         default:
            var10009 = 231;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

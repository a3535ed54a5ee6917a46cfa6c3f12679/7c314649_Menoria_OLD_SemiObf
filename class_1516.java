import com.google.common.base.Function;

// $FF: renamed from: pz
class class_1516 implements Function {

   // $FF: renamed from: a java.lang.String
   private static final String field_7986 = "CL_00001092";
   // $FF: renamed from: b py
   final class_1515 field_7987;


   // $FF: renamed from: <init> (py) void
   void method_8236(class_1515 var1) {
      this.field_7987 = var1;
      super();
   }

   // $FF: renamed from: b (pt) java.lang.String
   public String method_8237(class_56 var1) {
      return var1.method_233();
   }

   public Object apply(Object var1) {
      return this.method_8237((class_56)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8238() {
      boolean var10000 = true;
      char[] var10003 = "SÒ\no±!®l".toCharArray();
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
            field_7986 = (new String((char[])var4)).intern();
            String var2 = field_7986;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 18;
            break;
         case 1:
            var10009 = 156;
            break;
         case 2:
            var10009 = 87;
            break;
         case 3:
            var10009 = 176;
            break;
         case 4:
            var10009 = 187;
            break;
         case 5:
            var10009 = 93;
            break;
         default:
            var10009 = 131;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

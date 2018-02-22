import java.io.File;

// $FF: renamed from: pw
class class_1513 implements class_77 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7965 = "CL_00001089";
   // $FF: renamed from: b pu
   final class_1511 field_7966;


   // $FF: renamed from: <init> (pu) void
   void method_8214(class_1511 var1) {
      this.field_7966 = var1;
      super();
   }

   // $FF: renamed from: b (java.io.File) void
   public void method_381(File var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = class_1511.method_8207(this.field_7966);
      if(var2 != null) {
         if(!var10000) {
            return;
         }

         class_1511.method_8208(this.field_7966, false);
      }

      class_1511 var3 = this.field_7966;
      class_1504 var10001 = new class_1504;
      var10001.method_8132(var1);
      class_1511.method_8209(var3, var10001);
      bao.method_5273().method_5274();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8215() {
      boolean var10000 = true;
      char[] var10003 = "Û¤öÁ§h©hÃÿ".toCharArray();
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
            field_7965 = (new String((char[])var4)).intern();
            String var2 = field_7965;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 216;
            break;
         case 1:
            var10009 = 24;
            break;
         case 2:
            var10009 = 187;
            break;
         case 3:
            var10009 = 134;
            break;
         case 4:
            var10009 = 177;
            break;
         case 5:
            var10009 = 215;
            break;
         default:
            var10009 = 24;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

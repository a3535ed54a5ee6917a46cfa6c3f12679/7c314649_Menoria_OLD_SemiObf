
// $FF: renamed from: t0
final class class_1585 implements class_41 {

   // $FF: renamed from: a qJ
   private final class_1460 field_8283;
   // $FF: renamed from: c java.lang.String
   private static final String field_8284 = "CL_00001407";


   // $FF: renamed from: <init> () void
   void method_8702() {
      super();
      class_1460 var10001 = new class_1460;
      var10001.method_7939();
      this.field_8283 = var10001;
   }

   // $FF: renamed from: b (qH, add) add
   public add method_176(class_48 var1, add var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = var2;
      if(var3 != null) {
         if(class_550.getBlock30(var2.method_3745())) {
            class_1470 var4 = new class_1470;
            var4.method_7948(this, var2);
            var10000 = var4.method_176(var1, var2);
         } else {
            var10000 = this.field_8283.method_176(var1, var2);
         }
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "µåâþïÚâ".toCharArray();
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
            field_8284 = (new String((char[])var4)).intern();
            String var2 = field_8284;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 31;
            break;
         case 1:
            var10009 = 11;
            break;
         case 2:
            var10009 = 58;
            break;
         case 3:
            var10009 = 5;
            break;
         case 4:
            var10009 = 249;
            break;
         case 5:
            var10009 = 2;
            break;
         default:
            var10009 = 97;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

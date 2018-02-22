
// $FF: renamed from: nw
class class_1438 implements class_35 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7635 = "CL_00000879";
   // $FF: renamed from: b java.lang.String
   final String field_7636;
   // $FF: renamed from: c nv
   final class_1436 field_7637;


   // $FF: renamed from: <init> (nv, java.lang.String) void
   void method_7830(class_1436 var1, String var2) {
      this.field_7637 = var1;
      this.field_7636 = var2;
      super();
   }

   // $FF: renamed from: a (boolean, int) void
   public void method_160(boolean var1, int var2) {
      label17: {
         String[] var10000 = class_752.method_4253();
         class_1436.method_7823(this.field_7637, bao.method_5273());
         String[] var3 = var10000;
         class_1386 var4 = class_1436.method_7824(this.field_7637).method_5277();
         if(var3 != null) {
            if(var4 == null) {
               break label17;
            }

            class_1436.method_7824(this.field_7637).method_5277().method_7562(class_105.field_171);
            var4 = class_1436.method_7824(this.field_7637).method_5277();
         }

         class_1387.method_7578(var4);
      }

      if(var1) {
         class_1436.method_7824(this.field_7637).method_5290().method_8203(this.field_7636);
      }

      class_1436.method_7824(this.field_7637).method_5236((bdw)null);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7831() {
      boolean var10000 = true;
      char[] var10003 = "JÀW{7\'9´?r".toCharArray();
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
            field_7635 = (new String((char[])var4)).intern();
            String var2 = field_7635;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 228;
            break;
         case 1:
            var10009 = 97;
            break;
         case 2:
            var10009 = 229;
            break;
         case 3:
            var10009 = 166;
            break;
         case 4:
            var10009 = 234;
            break;
         case 5:
            var10009 = 250;
            break;
         default:
            var10009 = 72;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

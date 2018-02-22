
// $FF: renamed from: qS
final class class_1468 extends class_1460 {

   // $FF: renamed from: a qJ
   private final class_1460 field_7741;
   // $FF: renamed from: c java.lang.String
   private static final String field_7742 = "CL_00001399";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
      class_1460 var10001 = new class_1460;
      var10001.method_7939();
      this.field_7741 = var10001;
   }

   // $FF: renamed from: a (qH, add) add
   public add method_7940(class_48 var1, add var2) {
      String[] var10000 = class_752.method_4253();
      class_548 var4 = (class_548)var2.method_3730();
      String[] var3 = var10000;
      int var5 = var1.method_183();
      int var6 = var1.method_184();
      int var7 = var1.method_185();
      class_905 var8 = class_484.method_2849(var1.method_186());
      if(var3 != null) {
         if(!var4.getBlock24(var1.method_182(), var5 + var8.method_5322(), var6 + var8.method_5323(), var7 + var8.method_5324())) {
            return this.field_7741.method_176(var1, var2);
         }

         var2.method_3788(class_1010.field_5183);
         var2.field_2958 = 1;
      }

      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "hP)èÇ/Oá".toCharArray();
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
            field_7742 = (new String((char[])var4)).intern();
            String var2 = field_7742;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 15;
            break;
         case 1:
            var10009 = 56;
            break;
         case 2:
            var10009 = 82;
            break;
         case 3:
            var10009 = 252;
            break;
         case 4:
            var10009 = 211;
            break;
         case 5:
            var10009 = 6;
            break;
         default:
            var10009 = 27;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

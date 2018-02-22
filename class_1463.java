
// $FF: renamed from: qX
final class class_1463 extends class_1460 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7733 = "CL_00001410";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
   }

   // $FF: renamed from: a (qH, add) add
   public add method_7940(class_48 var1, add var2) {
      class_905 var4 = class_484.method_2849(var1.method_186());
      String[] var10000 = class_752.method_4253();
      double var5 = var1.method_179() + (double)var4.method_5322();
      String[] var3 = var10000;
      double var7 = (double)((float)var1.method_184() + 0.2F);
      double var9 = var1.method_181() + (double)var4.method_5324();
      class_689 var11 = class_512.method_2987(var1.method_182(), var2.method_3745(), var5, var7, var9);
      add var12;
      if(var3 != null) {
         if(var11 instanceof class_752) {
            var12 = var2;
            if(var3 == null) {
               return var12;
            }

            if(var2.method_3773()) {
               ((class_753)var11).method_4286(var2.method_3770());
            }
         }

         var2.method_3729(1);
      }

      var12 = var2;
      return var12;
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "°HË\\4ÂhjH".toCharArray();
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
            field_7733 = (new String((char[])var4)).intern();
            String var2 = field_7733;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 102;
            break;
         case 1:
            var10009 = 201;
            break;
         case 2:
            var10009 = 206;
            break;
         case 3:
            var10009 = 237;
            break;
         case 4:
            var10009 = 110;
            break;
         case 5:
            var10009 = 249;
            break;
         default:
            var10009 = 145;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}


// $FF: renamed from: qY
final class class_1462 extends class_1460 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7732 = "CL_00001411";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
   }

   // $FF: renamed from: a (qH, add) add
   public add method_7940(class_48 var1, add var2) {
      class_905 var3 = class_484.method_2849(var1.method_186());
      double var4 = var1.method_179() + (double)var3.method_5322();
      double var6 = (double)((float)var1.method_184() + 0.2F);
      double var8 = var1.method_181() + (double)var3.method_5324();
      class_707 var10000 = new class_707;
      var10000.method_4062(var1.method_182(), var4, var6, var8, var2);
      class_707 var10 = var10000;
      var1.method_182().method_2089(var10);
      var2.method_3729(1);
      return var2;
   }

   // $FF: renamed from: b (qH) void
   protected void method_7942(class_48 var1) {
      var1.method_182().method_2210(1002, var1.method_183(), var1.method_184(), var1.method_185(), 0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "Q¹:È\\#Áò;".toCharArray();
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
            field_7732 = (new String((char[])var4)).intern();
            String var2 = field_7732;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 208;
            break;
         case 1:
            var10009 = 55;
            break;
         case 2:
            var10009 = 1;
            break;
         case 3:
            var10009 = 200;
            break;
         case 4:
            var10009 = 58;
            break;
         case 5:
            var10009 = 111;
            break;
         default:
            var10009 = 174;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

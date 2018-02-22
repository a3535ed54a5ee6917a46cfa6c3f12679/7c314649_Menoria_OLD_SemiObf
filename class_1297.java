
// $FF: renamed from: jP
public class class_1297 extends class_1293 {

   // $FF: renamed from: c ro
   private class_1583 field_6661;
   // $FF: renamed from: h java.lang.String
   private static final String field_6662 = "Features";


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_6768(String var1) {
      super.method_6768(var1);
      class_1583 var10001 = new class_1583;
      var10001.method_8628();
      this.field_6661 = var10001;
   }

   // $FF: renamed from: b (ro) void
   public void method_6769(class_1583 var1) {
      this.field_6661 = var1.method_8688("Features");
   }

   // $FF: renamed from: c (ro) void
   public void method_6770(class_1583 var1) {
      var1.method_8664("Features", this.field_6661);
   }

   // $FF: renamed from: b (ro, int, int) void
   public void method_6808(class_1583 var1, int var2, int var3) {
      this.field_6661.method_8664(method_6809(var2, var3), var1);
   }

   // $FF: renamed from: a (int, int) java.lang.String
   public static String method_6809(int var0, int var1) {
      return "[" + var0 + "," + var1 + "]";
   }

   // $FF: renamed from: c () ro
   public class_1583 method_6810() {
      return this.field_6661;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6811() {
      boolean var10000 = true;
      char[] var10003 = "ù³ CPëÌ".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6662 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 202;
            break;
         case 1:
            var10009 = 163;
            break;
         case 2:
            var10009 = 180;
            break;
         case 3:
            var10009 = 66;
            break;
         case 4:
            var10009 = 80;
            break;
         case 5:
            var10009 = 120;
            break;
         default:
            var10009 = 251;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

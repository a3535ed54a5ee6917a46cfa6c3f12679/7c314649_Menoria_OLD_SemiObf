
// $FF: renamed from: tS
public class class_1606 {

   // $FF: renamed from: b rV
   private class_66 field_8394;
   // $FF: renamed from: c tT
   private class_1607 field_8395;
   // $FF: renamed from: d tW
   private class_1612 field_8396;
   // $FF: renamed from: e java.lang.String
   private String field_8397;
   // $FF: renamed from: f java.lang.String
   private static final String field_8398 = "CL_00001385";


   // $FF: renamed from: <init> () void
   public void method_8787() {
      super();
   }

   // $FF: renamed from: b () rV
   public class_66 method_8788() {
      return this.field_8394;
   }

   // $FF: renamed from: b (rV) void
   public void method_8789(class_66 var1) {
      this.field_8394 = var1;
   }

   // $FF: renamed from: c () tT
   public class_1607 method_8790() {
      return this.field_8395;
   }

   // $FF: renamed from: b (tT) void
   public void method_8791(class_1607 var1) {
      this.field_8395 = var1;
   }

   // $FF: renamed from: d () tW
   public class_1612 method_8792() {
      return this.field_8396;
   }

   // $FF: renamed from: b (tW) void
   public void method_8793(class_1612 var1) {
      this.field_8396 = var1;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_8794(String var1) {
      this.field_8397 = var1;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_8795() {
      return this.field_8397;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8796() {
      boolean var10000 = true;
      char[] var10003 = "µc\'nP¡Çñ\"".toCharArray();
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
            field_8398 = (new String((char[])var4)).intern();
            String var2 = field_8398;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 200;
            break;
         case 1:
            var10009 = 17;
            break;
         case 2:
            var10009 = 247;
            break;
         case 3:
            var10009 = 41;
            break;
         case 4:
            var10009 = 96;
            break;
         case 5:
            var10009 = 94;
            break;
         default:
            var10009 = 175;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

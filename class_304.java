
// $FF: renamed from: s_
public class class_304 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1570;
   // $FF: renamed from: i java.lang.String
   private static final String field_1571 = "message=\'%s\'";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_1734(String var1) {
      String[] var10000 = class_752.method_4253();
      super.method_1449();
      String[] var2 = var10000;
      if(var2 != null) {
         if(var1.length() > 100) {
            var1 = var1.substring(0, 100);
         }

         this.field_1570 = var1;
      }

   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1570 = var1.method_524(100);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(this.field_1570);
   }

   // $FF: renamed from: b (tL) void
   public void method_1735(class_63 var1) {
      var1.method_251(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("message=\'%s\'", new Object[]{this.field_1570});
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1736() {
      return this.field_1570;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "h¢§[*Öä".toCharArray();
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
            field_1571 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 241;
            break;
         case 1:
            var10009 = 154;
            break;
         case 2:
            var10009 = 100;
            break;
         case 3:
            var10009 = 120;
            break;
         case 4:
            var10009 = 84;
            break;
         case 5:
            var10009 = 242;
            break;
         default:
            var10009 = 85;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

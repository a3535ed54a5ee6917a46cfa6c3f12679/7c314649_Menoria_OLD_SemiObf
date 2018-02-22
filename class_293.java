
// $FF: renamed from: sg
public class class_293 extends class_250 {

   // $FF: renamed from: c rV
   private class_66 field_1536;
   // $FF: renamed from: d boolean
   private boolean field_1537;
   // $FF: renamed from: i java.lang.String
   private static final String field_1538 = "message=\'%s\'";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
      this.field_1537 = true;
   }

   // $FF: renamed from: <init> (rV) void
   public void method_1683(class_66 var1) {
      this.method_1684(var1, true);
   }

   // $FF: renamed from: <init> (rV, boolean) void
   public void method_1684(class_66 var1, boolean var2) {
      super.method_1449();
      this.field_1537 = true;
      this.field_1536 = var1;
      this.field_1537 = var2;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1536 = class_1556.method_8483(var1.method_524(32767));
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(class_1556.method_8482(this.field_1536));
   }

   // $FF: renamed from: b (tF) void
   public void method_1685(class_64 var1) {
      var1.method_285(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("message=\'%s\'", new Object[]{this.field_1536});
   }

   // $FF: renamed from: a () rV
   public class_66 method_1686() {
      return this.field_1536;
   }

   // $FF: renamed from: e () boolean
   public boolean method_1687() {
      return this.field_1537;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "ù®Óß©ìG".toCharArray();
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
            field_1538 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 245;
            break;
         case 1:
            var10009 = 170;
            break;
         case 2:
            var10009 = 193;
            break;
         case 3:
            var10009 = 158;
            break;
         case 4:
            var10009 = 1;
            break;
         case 5:
            var10009 = 217;
            break;
         default:
            var10009 = 148;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

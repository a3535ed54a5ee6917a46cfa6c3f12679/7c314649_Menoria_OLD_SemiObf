
// $FF: renamed from: qn
class class_1545 implements class_65 {

   // $FF: renamed from: b bqx
   final bqx field_8102;
   // $FF: renamed from: c java.lang.String
   private static final String field_8103 = "CL_00001149";
   // $FF: renamed from: d java.lang.String
   final String field_8104;
   // $FF: renamed from: e p7
   final class_1435 field_8105;
   // $FF: renamed from: f ql
   final class_1541 field_8106;


   // $FF: renamed from: <init> (ql, java.lang.String, p7) void
   void method_8399(class_1541 var1, String var2, class_1435 var3) {
      this.field_8106 = var1;
      this.field_8104 = var2;
      this.field_8105 = var3;
      super();
      bqx var10001 = new bqx;
      var10001.method_8226(this.field_8104, this.field_8105.method_7806());
      this.field_8102 = var10001;
   }

   // $FF: renamed from: b () int
   public int method_335() {
      String[] var10000 = class_752.method_4253();
      class_1539 var2 = (class_1539)class_1541.method_8377(this.field_8106).method_188(this.field_8102);
      String[] var1 = var10000;
      class_1539 var3 = var2;
      int var4;
      if(var1 != null) {
         if(var2 == null) {
            var4 = 0;
            return var4;
         }

         var3 = var2;
      }

      var4 = var3.method_335();
      return var4;
   }

   // $FF: renamed from: a () qg
   public class_1531 method_8400() {
      String[] var10000 = class_752.method_4253();
      class_1539 var2 = (class_1539)class_1541.method_8377(this.field_8106).method_188(this.field_8102);
      String[] var1 = var10000;
      class_1539 var3 = var2;
      class_1531 var4;
      if(var1 != null) {
         if(var2 == null) {
            var4 = class_1541.field_8087;
            return var4;
         }

         var3 = var2;
      }

      var4 = var3.method_8357();
      return var4;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8401() {
      boolean var10000 = true;
      char[] var10003 = "»~è]dÆá".toCharArray();
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
            field_8103 = (new String((char[])var4)).intern();
            String var2 = field_8103;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 144;
            break;
         case 1:
            var10009 = 50;
            break;
         case 2:
            var10009 = 228;
            break;
         case 3:
            var10009 = 29;
            break;
         case 4:
            var10009 = 168;
            break;
         case 5:
            var10009 = 236;
            break;
         default:
            var10009 = 117;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

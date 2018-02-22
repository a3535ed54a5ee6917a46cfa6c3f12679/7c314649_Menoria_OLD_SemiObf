import java.util.concurrent.Callable;

// $FF: renamed from: gK
class class_1071 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_5648 = "CL_00000374";
   // $FF: renamed from: b int
   final int field_5649;
   // $FF: renamed from: c int
   final int field_5650;
   // $FF: renamed from: d int
   final int field_5651;
   // $FF: renamed from: e gI
   final class_1069 field_5652;


   // $FF: renamed from: <init> (gI, int, int, int) void
   void method_6069(class_1069 var1, int var2, int var3, int var4) {
      this.field_5652 = var1;
      this.field_5649 = var2;
      this.field_5650 = var3;
      this.field_5651 = var4;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6070() {
      return class_1605.method_8776(this.field_5649, this.field_5650, this.field_5651);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6071() {
      boolean var10000 = true;
      char[] var10003 = "YÎA­ÑN*±)".toCharArray();
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
            field_5648 = (new String((char[])var4)).intern();
            String var2 = field_5648;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 134;
            break;
         case 1:
            var10009 = 30;
            break;
         case 2:
            var10009 = 130;
            break;
         case 3:
            var10009 = 167;
            break;
         case 4:
            var10009 = 1;
            break;
         case 5:
            var10009 = 125;
            break;
         default:
            var10009 = 226;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

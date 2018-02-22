
// $FF: renamed from: dV
public class class_1019 {

   // $FF: renamed from: b float
   public float field_5388;
   // $FF: renamed from: c float
   public float field_5389;
   // $FF: renamed from: d java.lang.String
   private static final String field_5390 = "CL_00000159";


   // $FF: renamed from: <init> (float, float) void
   public void method_5793(float var1, float var2) {
      super();
      this.field_5388 = var1;
      this.field_5389 = var2;
   }

   // $FF: renamed from: b () dV
   public class_1019 method_5794() {
      class_1019 var10000 = new class_1019;
      var10000.method_5793(this.field_5388 * 0.8F, this.field_5389 * 0.6F);
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5795() {
      boolean var10000 = true;
      char[] var10003 = "ööDÊyòM".toCharArray();
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
            field_5390 = (new String((char[])var4)).intern();
            String var2 = field_5390;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 128;
            break;
         case 1:
            var10009 = 246;
            break;
         case 2:
            var10009 = 156;
            break;
         case 3:
            var10009 = 65;
            break;
         case 4:
            var10009 = 207;
            break;
         case 5:
            var10009 = 26;
            break;
         default:
            var10009 = 124;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

import java.util.concurrent.Callable;

// $FF: renamed from: nZ
class class_1420 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7556 = "CL_00000955";
   // $FF: renamed from: b double
   final double field_7557;
   // $FF: renamed from: c double
   final double field_7558;
   // $FF: renamed from: d double
   final double field_7559;
   // $FF: renamed from: e bma
   final bma field_7560;


   // $FF: renamed from: <init> (bma, double, double, double) void
   void method_7755(bma var1, double var2, double var4, double var6) {
      this.field_7560 = var1;
      this.field_7557 = var2;
      this.field_7558 = var4;
      this.field_7559 = var6;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7756() {
      return class_1605.method_8775(this.field_7557, this.field_7558, this.field_7559);
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_7757() {
      return this.method_7756();
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_7758() {
      return this.method_7756();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7759() {
      boolean var10000 = true;
      char[] var10003 = "Vd³ÇØæñ%ÙÂ".toCharArray();
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
            field_7556 = (new String((char[])var4)).intern();
            String var2 = field_7556;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 23;
            break;
         case 1:
            var10009 = 42;
            break;
         case 2:
            var10009 = 238;
            break;
         case 3:
            var10009 = 245;
            break;
         case 4:
            var10009 = 234;
            break;
         case 5:
            var10009 = 212;
            break;
         default:
            var10009 = 195;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

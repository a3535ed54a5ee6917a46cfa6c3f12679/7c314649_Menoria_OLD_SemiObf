
// $FF: renamed from: rt
public abstract class class_1572 extends class_1571 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8261 = "CL_00001230";


   // $FF: renamed from: <init> () void
   public void method_8628() {
      super.method_8628();
   }

   // $FF: renamed from: a () long
   public abstract long method_8636();

   // $FF: renamed from: e () int
   public abstract int method_8637();

   // $FF: renamed from: f () short
   public abstract short method_8638();

   // $FF: renamed from: g () byte
   public abstract byte method_8639();

   // $FF: renamed from: h () double
   public abstract double method_8640();

   // $FF: renamed from: i () float
   public abstract float method_8641();

   // $FF: renamed from: <clinit> () void
   static void method_8635() {
      boolean var10000 = true;
      char[] var10003 = "zF4xS\b8ö".toCharArray();
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
            field_8261 = (new String((char[])var4)).intern();
            String var2 = field_8261;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 31;
            break;
         case 1:
            var10009 = 44;
            break;
         case 2:
            var10009 = 227;
            break;
         case 3:
            var10009 = 139;
            break;
         case 4:
            var10009 = 34;
            break;
         case 5:
            var10009 = 110;
            break;
         default:
            var10009 = 69;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

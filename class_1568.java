
// $FF: renamed from: rj
final class class_1568 extends class_1567 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8254 = "CL_00001902";


   // $FF: renamed from: <init> (long) void
   void method_8603(long var1) {
      super.method_8603(var1);
   }

   // $FF: renamed from: b (long) void
   public void method_8604(long var1) {}

   // $FF: renamed from: <clinit> () void
   static void method_8605() {
      boolean var10000 = true;
      char[] var10003 = "´$\'9ÈÆ÷K%".toCharArray();
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
            field_8254 = (new String((char[])var4)).intern();
            String var2 = field_8254;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 157;
            break;
         case 1:
            var10009 = 164;
            break;
         case 2:
            var10009 = 17;
            break;
         case 3:
            var10009 = 125;
            break;
         case 4:
            var10009 = 99;
            break;
         case 5:
            var10009 = 146;
            break;
         default:
            var10009 = 95;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}


// $FF: renamed from: c0
final class class_914 implements class_17 {

   // $FF: renamed from: b sv
   public class_752 field_4606;
   // $FF: renamed from: c sa
   public class_689 field_4607;
   // $FF: renamed from: d java.lang.String
   private static final String field_4608 = "CL_00000109";


   // $FF: renamed from: <init> () void
   private void method_5379() {
      super();
   }

   // $FF: renamed from: b (cH, int) void
   public void method_53(class_940 var1, int var2) {
      var1.method_5492(this.field_4606, this.field_4607, var2);
   }

   // $FF: renamed from: <init> (java.lang.Object) void
   void method_5380(Object var1) {
      this.method_5379();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5381() {
      boolean var10000 = true;
      char[] var10003 = "ì$\'ØÑrK.".toCharArray();
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
            field_4608 = (new String((char[])var4)).intern();
            String var2 = field_4608;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 86;
            break;
         case 1:
            var10009 = 180;
            break;
         case 2:
            var10009 = 111;
            break;
         case 3:
            var10009 = 3;
            break;
         case 4:
            var10009 = 252;
            break;
         case 5:
            var10009 = 177;
            break;
         default:
            var10009 = 245;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

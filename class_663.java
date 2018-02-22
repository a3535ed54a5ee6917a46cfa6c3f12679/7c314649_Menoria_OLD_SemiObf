
// $FF: renamed from: Ab
class class_663 implements class_83 {

   // $FF: renamed from: b boolean
   public boolean field_2829;
   // $FF: renamed from: c boolean
   public boolean field_2830;
   // $FF: renamed from: d java.lang.String
   private static final String field_2831 = "CL_00001704";
   // $FF: renamed from: e w9
   final class_781 field_2832;


   // $FF: renamed from: <init> (w9, boolean, boolean) void
   private void method_3580(class_781 var1, boolean var2, boolean var3) {
      this.field_2832 = var1;
      super();
      this.field_2829 = false;
      this.field_2830 = false;
      this.field_2829 = var2;
      this.field_2830 = var3;
   }

   // $FF: renamed from: <init> (w9, boolean, boolean, java.lang.Object) void
   void method_3581(class_781 var1, boolean var2, boolean var3, Object var4) {
      this.method_3580(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3582() {
      boolean var10000 = true;
      char[] var10003 = "îæ¡D¸þÎ@".toCharArray();
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
            field_2831 = (new String((char[])var4)).intern();
            String var2 = field_2831;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 29;
            break;
         case 1:
            var10009 = 26;
            break;
         case 2:
            var10009 = 78;
            break;
         case 3:
            var10009 = 196;
            break;
         case 4:
            var10009 = 56;
            break;
         case 5:
            var10009 = 126;
            break;
         default:
            var10009 = 5;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

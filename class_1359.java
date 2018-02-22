import java.util.concurrent.Callable;

// $FF: renamed from: kx
class class_1359 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7140 = "CL_00000634";
   // $FF: renamed from: b bao
   final bao field_7141;


   // $FF: renamed from: <init> (bao) void
   void isFocused0(bao var1) {
      this.field_7141 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String isFocused1() {
      return this.field_7141.canLoseFocus7.field_4496.toString();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object isFocused2() {
      return this.isFocused1();
   }

   // $FF: renamed from: <clinit> () void
   static void isFocused3() {
      boolean var10000 = true;
      char[] var10003 = "©Ë¾\rt|ÅÏ".toCharArray();
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
            field_7140 = (new String((char[])var4)).intern();
            String var2 = field_7140;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 77;
            break;
         case 1:
            var10009 = 67;
            break;
         case 2:
            var10009 = 255;
            break;
         case 3:
            var10009 = 242;
            break;
         case 4:
            var10009 = 135;
            break;
         case 5:
            var10009 = 43;
            break;
         default:
            var10009 = 52;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

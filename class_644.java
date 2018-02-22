
// $FF: renamed from: AH
class class_644 extends Thread {

   // $FF: renamed from: a java.lang.String
   private static final String field_2777 = "CL_00000632";
   // $FF: renamed from: b bao
   final bao field_2778;


   // $FF: renamed from: <init> (bao, java.lang.String) void
   void method_3527(bao var1, String var2) {
      this.field_2778 = var1;
      super(var2);
   }

   public void run() {
      String[] var1 = class_752.method_4253();

      while(this.field_2778.cursorPosition4) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var3) {
            if(var1 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_3528() {
      boolean var10000 = true;
      char[] var10003 = "|ÇGèX½gE".toCharArray();
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
            field_2777 = (new String((char[])var4)).intern();
            String var2 = field_2777;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 36;
            break;
         case 1:
            var10009 = 144;
            break;
         case 2:
            var10009 = 79;
            break;
         case 3:
            var10009 = 108;
            break;
         case 4:
            var10009 = 171;
            break;
         case 5:
            var10009 = 195;
            break;
         default:
            var10009 = 115;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

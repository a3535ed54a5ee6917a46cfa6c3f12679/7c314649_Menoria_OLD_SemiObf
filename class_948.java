
// $FF: renamed from: cQ
public class class_948 extends class_940 {

   // $FF: renamed from: F java.lang.String
   private static final String field_4826 = "fishingSpeed";


   // $FF: renamed from: <init> (int, int, E) void
   protected void method_5479(int var1, int var2, class_93 var3) {
      super.method_5479(var1, var2, var3);
      this.method_5488("fishingSpeed");
   }

   // $FF: renamed from: b (int) int
   public int method_5483(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   // $FF: renamed from: c (int) int
   public int method_5484(int var1) {
      return super.method_5483(var1) + 50;
   }

   // $FF: renamed from: c () int
   public int method_5482() {
      return 3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5494() {
      boolean var10000 = true;
      char[] var10003 = "4à¯X6ù¢".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_4826 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 233;
            break;
         case 1:
            var10009 = 50;
            break;
         case 2:
            var10009 = 223;
            break;
         case 3:
            var10009 = 197;
            break;
         case 4:
            var10009 = 125;
            break;
         case 5:
            var10009 = 141;
            break;
         default:
            var10009 = 234;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

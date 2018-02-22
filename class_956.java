
// $FF: renamed from: cI
public class class_956 extends class_940 {

   // $FF: renamed from: F java.lang.String
   private static final String field_4839 = "arrowDamage";


   // $FF: renamed from: <init> (int, int) void
   public void method_5514(int var1, int var2) {
      super.method_5479(var1, var2, class_93.field_41);
      this.method_5488("arrowDamage");
   }

   // $FF: renamed from: b (int) int
   public int method_5483(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   // $FF: renamed from: c (int) int
   public int method_5484(int var1) {
      return this.method_5483(var1) + 15;
   }

   // $FF: renamed from: c () int
   public int method_5482() {
      return 5;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5494() {
      boolean var10000 = true;
      char[] var10003 = "¯(úÛ¼=ð".toCharArray();
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
            field_4839 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 182;
            break;
         case 1:
            var10009 = 31;
            break;
         case 2:
            var10009 = 152;
            break;
         case 3:
            var10009 = 87;
            break;
         case 4:
            var10009 = 110;
            break;
         case 5:
            var10009 = 2;
            break;
         default:
            var10009 = 165;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

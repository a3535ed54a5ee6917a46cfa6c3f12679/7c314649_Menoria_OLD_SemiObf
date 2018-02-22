import java.util.concurrent.Callable;

// $FF: renamed from: h4
class class_1086 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_5722 = "CL_00000507";
   // $FF: renamed from: b int
   final int field_5723;
   // $FF: renamed from: c int
   final int field_5724;
   // $FF: renamed from: d g4
   final class_1052 field_5725;


   // $FF: renamed from: <init> (g4, int, int) void
   void method_6153(class_1052 var1, int var2, int var3) {
      this.field_5725 = var1;
      this.field_5723 = var2;
      this.field_5724 = var3;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6154() {
      return String.valueOf(class_1035.method_5857(this.field_5723, this.field_5724));
   }

   // $FF: renamed from: <clinit> () void
   static void method_6155() {
      boolean var10000 = true;
      char[] var10003 = "Î`«ÿèp½Äø".toCharArray();
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
            field_5722 = (new String((char[])var4)).intern();
            String var2 = field_5722;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 192;
            break;
         case 1:
            var10009 = 97;
            break;
         case 2:
            var10009 = 185;
            break;
         case 3:
            var10009 = 130;
            break;
         case 4:
            var10009 = 149;
            break;
         case 5:
            var10009 = 13;
            break;
         default:
            var10009 = 253;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

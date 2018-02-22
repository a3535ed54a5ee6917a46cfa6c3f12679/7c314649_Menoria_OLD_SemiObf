import java.util.concurrent.Callable;

// $FF: renamed from: o0
class GuiTextField7 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7411 = "CL_00001005";
   // $FF: renamed from: b add
   final add field_7412;
   // $FF: renamed from: c on
   final class_811 field_7413;


   // $FF: renamed from: <init> (on, add) void
   void method_7610(class_811 var1, add var2) {
      this.field_7413 = var1;
      this.field_7412 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7611() {
      return String.valueOf(this.field_7412.method_3745());
   }

   // $FF: renamed from: <clinit> () void
   static void method_7612() {
      boolean var10000 = true;
      char[] var10003 = "ñ[Éy4".toCharArray();
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
            field_7411 = (new String((char[])var4)).intern();
            String var2 = field_7411;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 22;
            break;
         case 1:
            var10009 = 227;
            break;
         case 2:
            var10009 = 90;
            break;
         case 3:
            var10009 = 243;
            break;
         case 4:
            var10009 = 105;
            break;
         case 5:
            var10009 = 167;
            break;
         default:
            var10009 = 242;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

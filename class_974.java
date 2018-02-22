import java.util.List;

// $FF: renamed from: mg
public class class_974 extends class_973 {

   // $FF: renamed from: z java.lang.String
   private static final String field_4919 = "resourcePack.selected.title";


   // $FF: renamed from: <init> (bao, int, int, java.util.List) void
   public void method_5607(bao var1, int var2, int var3, List var4) {
      super.method_5607(var1, var2, var3, var4);
   }

   // $FF: renamed from: h () java.lang.String
   protected String method_5608() {
      return class_1450.method_7896("resourcePack.selected.title", new Object[0]);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      boolean var10000 = true;
      char[] var10003 = "7Êå6ñ ÿûjá Ãä!ökÛ\fü!".toCharArray();
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
            field_4919 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 9;
            break;
         case 1:
            var10009 = 227;
            break;
         case 2:
            var10009 = 172;
            break;
         case 3:
            var10009 = 52;
            break;
         case 4:
            var10009 = 220;
            break;
         case 5:
            var10009 = 8;
            break;
         default:
            var10009 = 222;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

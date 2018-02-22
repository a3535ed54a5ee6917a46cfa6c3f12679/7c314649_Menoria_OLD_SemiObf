import java.util.Comparator;

// $FF: renamed from: kk
final class class_1347 implements Comparator {

   // $FF: renamed from: a java.lang.String
   private static final String field_6941 = "CL_00000618";


   // $FF: renamed from: <init> () void
   void method_7156() {
      super();
   }

   // $FF: renamed from: b (ki, ki) int
   public int method_7157(class_1345 var1, class_1345 var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1.writeText2();
      int var10001 = var2.writeText2();
      if(var3 != null) {
         if(var10000 > var10001) {
            var10000 = 1;
            return var10000;
         }

         var10000 = var1.writeText2();
         if(var3 == null) {
            return var10000;
         }

         var10001 = var2.writeText2();
      }

      var10000 = var10000 < var10001?-1:0;
      return var10000;
   }

   public int compare(Object var1, Object var2) {
      return this.method_7157((class_1345)var1, (class_1345)var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7158() {
      boolean var10000 = true;
      char[] var10003 = "ñ5PÊËÓOeX".toCharArray();
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
            field_6941 = (new String((char[])var4)).intern();
            String var2 = field_6941;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 255;
            break;
         case 1:
            var10009 = 52;
            break;
         case 2:
            var10009 = 25;
            break;
         case 3:
            var10009 = 45;
            break;
         case 4:
            var10009 = 183;
            break;
         case 5:
            var10009 = 182;
            break;
         default:
            var10009 = 174;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

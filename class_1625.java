import com.google.common.base.Predicate;

// $FF: renamed from: uH
final class class_1625 implements Predicate {

   // $FF: renamed from: a java.lang.String
   private static final String field_8445 = "CL_00001881";


   // $FF: renamed from: <init> () void
   void method_8867() {
      super();
   }

   // $FF: renamed from: b (java.lang.String) boolean
   public boolean method_8868(String var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = class_1723.method_9630(var1);
      if(var2 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   public boolean apply(Object var1) {
      return this.method_8868((String)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8869() {
      boolean var10000 = true;
      char[] var10003 = "¶¿æb¼FÄË".toCharArray();
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
            field_8445 = (new String((char[])var4)).intern();
            String var2 = field_8445;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 18;
            break;
         case 1:
            var10009 = 20;
            break;
         case 2:
            var10009 = 94;
            break;
         case 3:
            var10009 = 66;
            break;
         case 4:
            var10009 = 181;
            break;
         case 5:
            var10009 = 107;
            break;
         default:
            var10009 = 145;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

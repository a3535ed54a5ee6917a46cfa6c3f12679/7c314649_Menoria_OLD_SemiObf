import java.util.concurrent.Callable;

// $FF: renamed from: xO
class class_1726 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_9034;
   // $FF: renamed from: b sa
   final class_689 field_9035;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9036;


   // $FF: renamed from: <init> (sa) void
   void method_9644(class_689 var1) {
      this.field_9035 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_9645() {
      StringBuilder var10000 = (new StringBuilder()).append(class_1775.method_9759(this.field_9035));
      String[] var10001 = field_9036;
      return var10000.append(" (").append(this.field_9035.getClass().getCanonicalName()).append(")").toString();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_9646() {
      return this.method_9645();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9647() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "½}Ù¬Y å\n";
      int var4 = "½}Ù¬Y å\n".length();
      char var1 = 2;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_9036 = var5;
                  String[] var10 = field_9036;
                  field_9034 = "CL_00001534";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 24;
               break;
            case 1:
               var10009 = 179;
               break;
            case 2:
               var10009 = 240;
               break;
            case 3:
               var10009 = 24;
               break;
            case 4:
               var10009 = 9;
               break;
            case 5:
               var10009 = 186;
               break;
            default:
               var10009 = 79;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

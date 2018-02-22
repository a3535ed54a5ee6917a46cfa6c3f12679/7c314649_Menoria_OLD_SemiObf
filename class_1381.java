import java.util.concurrent.Callable;

// $FF: renamed from: nA
class class_1381 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7347;
   // $FF: renamed from: b bjf
   final bjf field_7348;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7349;


   // $FF: renamed from: <init> (bjf) void
   void method_7541(bjf var1) {
      this.field_7348 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7542() {
      StringBuilder var10000 = (new StringBuilder()).append(bjf.method_2237(this.field_7348).size());
      String[] var10001 = field_7349;
      return var10000.append(" total; ").append(bjf.method_2237(this.field_7348).toString()).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7543() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "D¹¼ÝE9ã0Þ¸\bó|ø2ó";
      int var4 = "D¹¼ÝE9ã0Þ¸\bó|ø2ó".length();
      char var1 = 11;
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
                  field_7349 = var5;
                  String[] var10 = field_7349;
                  field_7347 = "CL_00000884";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 80;
               break;
            case 1:
               var10009 = 139;
               break;
            case 2:
               var10009 = 101;
               break;
            case 3:
               var10009 = 15;
               break;
            case 4:
               var10009 = 110;
               break;
            case 5:
               var10009 = 246;
               break;
            default:
               var10009 = 138;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

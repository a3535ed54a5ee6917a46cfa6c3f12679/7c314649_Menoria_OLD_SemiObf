import java.util.concurrent.Callable;

// $FF: renamed from: dq
class class_1043 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_5512;
   // $FF: renamed from: b ahb
   final ahb field_5513;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5514;


   // $FF: renamed from: <init> (ahb) void
   void method_5899(ahb var1) {
      this.field_5513 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_5900() {
      StringBuilder var10000 = (new StringBuilder()).append(this.field_5513.field_1807.size());
      String[] var10001 = field_5514;
      return var10000.append(" total; ").append(this.field_5513.field_1807.toString()).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5901() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "áHÖpÙxA_¤";
      int var4 = "áHÖpÙxA_¤".length();
      char var1 = 8;
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
                  field_5514 = var5;
                  String[] var10 = field_5514;
                  field_5512 = "CL_00000143";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 11;
               break;
            case 1:
               var10009 = 173;
               break;
            case 2:
               var10009 = 31;
               break;
            case 3:
               var10009 = 154;
               break;
            case 4:
               var10009 = 73;
               break;
            case 5:
               var10009 = 87;
               break;
            default:
               var10009 = 16;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

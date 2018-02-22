import java.util.concurrent.Callable;

// $FF: renamed from: t1
final class class_1586 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8285;
   // $FF: renamed from: b int
   final int field_8286;
   // $FF: renamed from: c aji
   final aji field_8287;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8288;


   // $FF: renamed from: <init> (int, aji) void
   void method_8703(int var1, aji var2) {
      this.field_8286 = var1;
      this.field_8287 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8704() {
      try {
         String[] var2 = field_8288;
         return String.format("ID #%d (%s // %s)", new Object[]{Integer.valueOf(this.field_8286), this.field_8287.method_2510(), this.field_8287.getClass().getCanonicalName()});
      } catch (Throwable var3) {
         StringBuilder var10000 = new StringBuilder();
         String[] var10001 = field_8288;
         return var10000.append("ID #").append(this.field_8286).toString();
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_8705() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "MFv²ªü5+pE9e§Üºå$jf­ºèr0E9e";
      int var4 = "MFv²ªü5+pE9e§Üºå$jf­ºèr0E9e".length();
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
                  field_8288 = var5;
                  String[] var10 = field_8288;
                  field_8285 = "CL_00001426";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 211;
               break;
            case 1:
               var10009 = 31;
               break;
            case 2:
               var10009 = 7;
               break;
            case 3:
               var10009 = 88;
               break;
            case 4:
               var10009 = 156;
               break;
            case 5:
               var10009 = 166;
               break;
            default:
               var10009 = 132;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

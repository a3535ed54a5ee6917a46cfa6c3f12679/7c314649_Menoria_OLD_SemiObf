import java.util.concurrent.Callable;

// $FF: renamed from: h3
class class_1084 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_5711;
   // $FF: renamed from: b int
   final int field_5712;
   // $FF: renamed from: c int
   final int field_5713;
   // $FF: renamed from: d g4
   final class_1052 field_5714;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5715;


   // $FF: renamed from: <init> (g4, int, int) void
   void method_6143(class_1052 var1, int var2, int var3) {
      this.field_5714 = var1;
      this.field_5712 = var2;
      this.field_5713 = var3;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6144() {
      String var10000;
      if(this.field_5714.method_5972(this.field_5712, this.field_5713)) {
         String[] var1 = field_5715;
         var10000 = "True";
      } else {
         String[] var2 = field_5715;
         var10000 = "False";
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6145() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "u§,ApJKùópg´5W";
      int var4 = "u§,ApJKùópg´5W".length();
      char var1 = 5;
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
                  field_5715 = var5;
                  String[] var10 = field_5715;
                  field_5711 = "CL_00000506";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 203;
               break;
            case 1:
               var10009 = 62;
               break;
            case 2:
               var10009 = 184;
               break;
            case 3:
               var10009 = 202;
               break;
            case 4:
               var10009 = 130;
               break;
            case 5:
               var10009 = 131;
               break;
            default:
               var10009 = 49;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

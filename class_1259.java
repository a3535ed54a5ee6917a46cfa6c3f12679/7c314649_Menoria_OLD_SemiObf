import java.util.concurrent.Callable;

// $FF: renamed from: j4
class class_1259 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6527;
   // $FF: renamed from: b jY
   final class_1303 field_6528;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6529;


   // $FF: renamed from: <init> (jY) void
   void method_6621(class_1303 var1) {
      this.field_6528 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6622() {
      String[] var10000 = field_6529;
      return String.format("%d game time, %d day time", new Object[]{Long.valueOf(class_1303.method_6882(this.field_6528)), Long.valueOf(class_1303.method_6883(this.field_6528))});
   }

   // $FF: renamed from: <clinit> () void
   static void method_6623() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "´{Â7[\týqÆv´xÂ#Uùyb1Ë,jH­.";
      int var4 = "´{Â7[\týqÆv´xÂ#Uùyb1Ë,jH­.".length();
      char var1 = 25;
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
                  field_6529 = var5;
                  String[] var10 = field_6529;
                  field_6527 = "CL_00000592";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 255;
               break;
            case 1:
               var10009 = 163;
               break;
            case 2:
               var10009 = 74;
               break;
            case 3:
               var10009 = 194;
               break;
            case 4:
               var10009 = 125;
               break;
            case 5:
               var10009 = 132;
               break;
            default:
               var10009 = 224;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

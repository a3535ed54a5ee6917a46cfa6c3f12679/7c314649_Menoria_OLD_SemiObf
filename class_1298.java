import java.io.File;
import java.io.FilenameFilter;

// $FF: renamed from: jT
class class_1298 implements FilenameFilter {

   // $FF: renamed from: a java.lang.String
   private static final String field_6663;
   // $FF: renamed from: b jX
   final class_1302 field_6664;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6665;


   // $FF: renamed from: <init> (jX) void
   void method_6812(class_1302 var1) {
      this.field_6664 = var1;
      super();
   }

   public boolean accept(File var1, String var2) {
      String[] var10001 = field_6665;
      return var2.endsWith(".mcr");
   }

   // $FF: renamed from: <clinit> () void
   static void method_6813() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Õº-¸½o\"J$ËÄál";
      int var4 = "Õº-¸½o\"J$ËÄál".length();
      char var1 = 4;
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
                  field_6665 = var5;
                  String[] var10 = field_6665;
                  field_6663 = "CL_00000583";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 98;
               break;
            case 1:
               var10009 = 104;
               break;
            case 2:
               var10009 = 64;
               break;
            case 3:
               var10009 = 198;
               break;
            case 4:
               var10009 = 139;
               break;
            case 5:
               var10009 = 227;
               break;
            default:
               var10009 = 141;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

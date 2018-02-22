import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

// $FF: renamed from: qj
class class_1537 implements Runnable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8071;
   // $FF: renamed from: b qh
   final class_1533 field_8072;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8073;


   // $FF: renamed from: <init> (qh) void
   void method_8354(class_1533 var1) {
      this.field_8072 = var1;
      super();
   }

   public void run() {
      class_1533 var10000 = this.field_8072;
      class_661 var10001 = new class_661;
      class_1533 var10003 = this.field_8072;
      this.field_8072.getClass();
      var10001.method_3578(var10003, (Object)null);
      class_1533.method_8318(var10000, var10001);
      class_1533.method_8319(this.field_8072, true);
      class_1533.method_8321(this.field_8072).setMasterVolume(class_1533.method_8320(this.field_8072).method_5359(class_930.field_4729));
      Logger var1 = class_1533.method_8323();
      Marker var2 = class_1533.method_8322();
      String[] var10002 = field_8073;
      var1.info(var2, "Sound engine started");
   }

   // $FF: renamed from: <clinit> () void
   static void method_8355() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "¥: o\r×éö8µ··dôX¿«dõN¹°~õ;";
      int var4 = "¥: o\r×éö8µ··dôX¿«dõN¹°~õ;".length();
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
                  field_8073 = var5;
                  String[] var10 = field_8073;
                  field_8071 = "CL_00001142";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 137;
               break;
            case 1:
               var10009 = 183;
               break;
            case 2:
               var10009 = 173;
               break;
            case 3:
               var10009 = 101;
               break;
            case 4:
               var10009 = 255;
               break;
            case 5:
               var10009 = 48;
               break;
            default:
               var10009 = 82;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

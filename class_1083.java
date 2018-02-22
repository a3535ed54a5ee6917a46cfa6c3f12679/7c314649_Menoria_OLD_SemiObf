import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// $FF: renamed from: gR
public class class_1083 {

   // $FF: renamed from: b java.util.Map
   private static final Map field_5709;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5710;


   // $FF: renamed from: b (java.io.File, int, int) gQ
   public static synchronized class_1079 method_6137(File var0, int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      File var10001 = new File(var0, "region");
      String[] var8 = field_5710;
      File var4 = var10001;
      String[] var3 = var10000;
      File var5 = new File(var4, "r." + (var1 >> 5) + "." + (var2 >> 5) + ".mca");
      class_1079 var6 = (class_1079)field_5709.get(var5);
      class_1079 var9 = var6;
      if(var3 != null) {
         if(var6 == null) {
            int var10 = var4.exists();
            if(var3 != null) {
               if(var10 == 0) {
                  var4.mkdirs();
               }

               var10 = field_5709.size();
            }

            if(var10 >= 256) {
               method_6138();
            }

            var9 = new class_1079;
            var9.method_6110(var5);
            class_1079 var7 = var9;
            field_5709.put(var5, var7);
            return var7;
         }

         var9 = var6;
      }

      return var9;
   }

   // $FF: renamed from: b () void
   public static synchronized void method_6138() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (java.io.File, int, int) java.io.DataInputStream
   public static DataInputStream method_6139(File var0, int var1, int var2) {
      class_1079 var3 = method_6137(var0, var1, var2);
      return var3.method_6111(var1 & 31, var2 & 31);
   }

   // $FF: renamed from: e (java.io.File, int, int) java.io.DataOutputStream
   public static DataOutputStream method_6140(File var0, int var1, int var2) {
      class_1079 var3 = method_6137(var0, var1, var2);
      return var3.method_6112(var1 & 31, var2 & 31);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6141() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "VÖ\n\nÞ\rC\\";
      int var4 = "VÖ\n\nÞ\rC\\".length();
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5710 = var5;
                  field_5709 = new HashMap();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 44;
               break;
            case 1:
               var10009 = 239;
               break;
            case 2:
               var10009 = 43;
               break;
            case 3:
               var10009 = 48;
               break;
            case 4:
               var10009 = 120;
               break;
            case 5:
               var10009 = 102;
               break;
            default:
               var10009 = 5;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_6142(IOException var0) {
      return var0;
   }
}

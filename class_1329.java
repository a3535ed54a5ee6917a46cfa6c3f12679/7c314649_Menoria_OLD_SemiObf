import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.util.Date;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: kR
public class class_1329 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_6819;
   // $FF: renamed from: c java.text.DateFormat
   private static final DateFormat field_6820;
   // $FF: renamed from: d java.nio.IntBuffer
   private static IntBuffer field_6821;
   // $FF: renamed from: e int[]
   private static int[] field_6822;
   // $FF: renamed from: f java.lang.String
   private static final String field_6823;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6824;


   // $FF: renamed from: <init> () void
   public void method_6984() {
      super();
   }

   // $FF: renamed from: b (java.io.File, int, int, bmg) rV
   public static class_66 method_6985(File var0, int var1, int var2, bmg var3) {
      return method_6986(var0, (String)null, var1, var2, var3);
   }

   // $FF: renamed from: b (java.io.File, java.lang.String, int, int, bmg) rV
   public static class_66 method_6986(File param0, String param1, int param2, int param3, bmg param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.File) java.io.File
   private static File method_6987(File var0) {
      String[] var10000 = class_752.method_4253();
      String var2 = field_6820.format(new Date()).toString();
      String[] var1 = var10000;
      int var3 = 1;

      while(true) {
         File var5 = new File;
         StringBuilder var10003 = (new StringBuilder()).append(var2).append(var3 == 1?"":"_" + var3);
         String[] var10004 = field_6824;
         var5.<init>(var0, var10003.append(".png").toString());
         File var4 = var5;
         if(var1 != null) {
            if(!var4.exists()) {
               return var4;
            }

            ++var3;
         }
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_6988() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_6989(Exception var0) {
      return var0;
   }
}

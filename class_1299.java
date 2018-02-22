import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: jU
public class class_1299 implements class_29, class_32 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_6666;
   // $FF: renamed from: c java.io.File
   private final File field_6667;
   // $FF: renamed from: d java.io.File
   private final File field_6668;
   // $FF: renamed from: e java.io.File
   private final File field_6669;
   // $FF: renamed from: f long
   private final long field_6670;
   // $FF: renamed from: g java.lang.String
   private final String field_6671;
   // $FF: renamed from: h java.lang.String
   private static final String field_6672;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_6673;


   // $FF: renamed from: <init> (java.io.File, java.lang.String, boolean) void
   public void method_6814(File param1, String param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i () void
   private void method_6815() {
      try {
         File var9 = new File(this.field_6667, "session.lock");
         String[] var4 = field_6673;
         File var1 = var9;
         DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

         try {
            var2.writeLong(this.field_6670);
         } finally {
            var2.close();
         }

      } catch (IOException var8) {
         var8.printStackTrace();
         RuntimeException var10000 = new RuntimeException("Failed to check session lock, aborting");
         String[] var10002 = field_6673;
         throw var10000;
      }
   }

   // $FF: renamed from: e () java.io.File
   public File method_132() {
      return this.field_6667;
   }

   // $FF: renamed from: b () void
   public void method_126() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (gU) gN
   public class_26 method_127(class_1089 var1) {
      RuntimeException var10000 = new RuntimeException("Old Chunk Storage is no longer supported.");
      String[] var10002 = field_6673;
      throw var10000;
   }

   // $FF: renamed from: a () jY
   public class_1303 method_125() {
      File var10000 = new File(this.field_6667, "level.dat");
      String[] var6 = field_6673;
      File var2 = var10000;
      String[] var1 = class_752.method_4253();

      class_1583 var3;
      class_1583 var4;
      boolean var10;
      class_1303 var11;
      label37: {
         label36: {
            try {
               var10 = var2.exists();
               if(var1 == null) {
                  break label37;
               }

               if(!var10) {
                  break label36;
               }
            } catch (Exception var9) {
               throw method_6817(var9);
            }

            try {
               var3 = class_1569.method_8608(new FileInputStream(var2));
               var6 = field_6673;
               var4 = var3.method_8688("Data");
               var11 = new class_1303;
               var11.method_6830(var4);
               return var11;
            } catch (Exception var8) {
               var8.printStackTrace();
            }
         }

         var10000 = new File(this.field_6667, "level.dat_old");
         var6 = field_6673;
         var2 = var10000;
         var10 = var2.exists();
      }

      if(var10) {
         try {
            var3 = class_1569.method_8608(new FileInputStream(var2));
            String[] var10001 = field_6673;
            var4 = var3.method_8688("Data");
            var11 = new class_1303;
            var11.method_6830(var4);
            return var11;
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

      return null;
   }

   // $FF: renamed from: b (jY, ro) void
   public void method_128(class_1303 param1, class_1583 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (jY) void
   public void method_129(class_1303 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (yz) void
   public void method_150(class_792 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (yz) ro
   public class_1583 method_151(class_792 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () kc
   public class_32 method_130() {
      return this;
   }

   // $FF: renamed from: g () java.lang.String[]
   public String[] method_152() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () void
   public void method_131() {}

   // $FF: renamed from: b (java.lang.String) java.io.File
   public File method_133(String var1) {
      File var10000 = new File;
      File var10002 = this.field_6669;
      StringBuilder var10003 = (new StringBuilder()).append(var1);
      String[] var10004 = field_6673;
      var10000.<init>(var10002, var10003.append(".dat").toString());
      return var10000;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_134() {
      return this.field_6671;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6816() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_6817(Exception var0) {
      return var0;
   }
}

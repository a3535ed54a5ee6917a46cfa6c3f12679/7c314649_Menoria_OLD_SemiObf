import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: jW
public class class_1301 implements class_30 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_6675;
   // $FF: renamed from: b java.io.File
   protected final File field_6676;
   // $FF: renamed from: c java.lang.String
   private static final String field_6677;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6678;


   // $FF: renamed from: <init> (java.io.File) void
   public void method_6819(File var1) {
      String[] var10000 = class_752.method_4253();
      super();
      String[] var2 = var10000;
      if(var2 != null) {
         if(!var1.exists()) {
            var1.mkdirs();
         }

         this.field_6676 = var1;
      }

   }

   // $FF: renamed from: b () java.lang.String
   public String method_135() {
      String[] var10000 = field_6678;
      return "Old Format";
   }

   // $FF: renamed from: c () java.util.List
   public List method_137() {
      ArrayList var2 = new ArrayList();
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var1 = var10000;

      while(var3 < 5) {
         StringBuilder var6 = new StringBuilder();
         String[] var10001 = field_6678;
         String var4 = var6.append("World").append(var3 + 1).toString();
         class_1303 var5 = this.method_139(var4);
         if(var1 != null) {
            if(var5 != null) {
               class_1339 var7 = new class_1339;
               var7.method_7066(var4, "", var5.method_6855(), var5.method_6842(), var5.method_6864(), false, var5.method_6867(), var5.method_6871());
               var2.add(var7);
            }

            ++var3;
         }

         if(var1 == null) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: e () void
   public void method_138() {}

   // $FF: renamed from: a (java.lang.String) jY
   public class_1303 method_139(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   public void method_142(String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String) boolean
   public boolean method_140(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.String) boolean
   public boolean method_141(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.File[]) boolean
   protected static boolean method_6820(File[] var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      boolean var6;
      while(true) {
         if(var2 < var0.length) {
            label47: {
               File var3 = var0[var2];
               Logger var5 = field_6675;
               StringBuilder var10001 = new StringBuilder();
               String[] var4 = field_6678;
               var5.debug(var10001.append("Deleting ").append(var3).toString());
               var6 = var3.isDirectory();
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  label27: {
                     if(var6) {
                        var6 = method_6820(var3.listFiles());
                        if(var1 == null) {
                           break label27;
                        }

                        if(!var6) {
                           field_6675.warn("Couldn\'t delete directory " + var3);
                           return false;
                        }
                     }

                     var6 = var3.delete();
                  }
               }

               if(var1 != null) {
                  if(var6) {
                     ++var2;
                     if(var1 != null) {
                        continue;
                     }
                     break label47;
                  }

                  var5 = field_6675;
                  var10001 = new StringBuilder();
                  String[] var10002 = field_6678;
                  var5.warn(var10001.append("Couldn\'t delete file ").append(var3).toString());
                  var6 = false;
               }

               return var6;
            }
         }

         var6 = true;
         break;
      }

      return var6;
   }

   // $FF: renamed from: b (java.lang.String, boolean) j9
   public class_29 method_136(String var1, boolean var2) {
      class_1299 var10000 = new class_1299;
      var10000.method_6814(this.field_6676, var1, var2);
      return var10000;
   }

   // $FF: renamed from: d (java.lang.String) boolean
   public boolean method_143(String var1) {
      return false;
   }

   // $FF: renamed from: e (java.lang.String) boolean
   public boolean method_144(String var1) {
      return false;
   }

   // $FF: renamed from: b (java.lang.String, vu) boolean
   public boolean method_145(String var1, class_81 var2) {
      return false;
   }

   // $FF: renamed from: g (java.lang.String) boolean
   public boolean method_146(String var1) {
      File var2 = new File(this.field_6676, var1);
      return var2.isDirectory();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6821() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_6822(Throwable var0) {
      return var0;
   }
}

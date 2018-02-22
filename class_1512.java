import java.io.File;
import java.io.FileFilter;

// $FF: renamed from: pv
final class class_1512 implements FileFilter {

   // $FF: renamed from: a java.lang.String
   private static final String field_7963;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7964;


   // $FF: renamed from: <init> () void
   void method_8212() {
      super();
   }

   public boolean accept(File var1) {
      boolean var10000;
      String[] var2;
      label56: {
         label59: {
            var2 = class_752.method_4253();
            var10000 = var1.isFile();
            if(var2 != null) {
               if(!var10000) {
                  break label59;
               }

               String var6 = var1.getName();
               String[] var5 = field_7964;
               var10000 = var6.endsWith(".zip");
            }

            if(var2 == null) {
               break label56;
            }

            if(var10000) {
               var10000 = true;
               break label56;
            }
         }

         var10000 = false;
      }

      boolean var3;
      label45: {
         label60: {
            var3 = var10000;
            var10000 = var1.isDirectory();
            if(var2 != null) {
               if(!var10000) {
                  break label60;
               }

               File var7 = new File(var1, "pack.mcmeta");
               String[] var10003 = field_7964;
               var10000 = var7.isFile();
            }

            if(var2 == null) {
               break label45;
            }

            if(var10000) {
               var10000 = true;
               break label45;
            }
         }

         var10000 = false;
      }

      boolean var4 = var10000;
      var10000 = var3;
      if(var2 != null) {
         if(!var3) {
            var10000 = var4;
            if(var2 == null) {
               return var10000;
            }

            if(!var4) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8213() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "æLÚøûH\tÐ¸WÁÕa\"æß@§E";
      int var4 = "æLÚøûH\tÐ¸WÁÕa\"æß@§E".length();
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
                  field_7964 = var5;
                  String[] var10 = field_7964;
                  field_7963 = "CL_00001088";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 73;
               break;
            case 1:
               var10009 = 242;
               break;
            case 2:
               var10009 = 162;
               break;
            case 3:
               var10009 = 110;
               break;
            case 4:
               var10009 = 9;
               break;
            case 5:
               var10009 = 48;
               break;
            default:
               var10009 = 175;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

import com.google.common.collect.Sets;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

// $FF: renamed from: pl
public class class_1503 extends class_1502 {

   // $FF: renamed from: i java.lang.String
   private static final String field_7921 = "assets/";


   // $FF: renamed from: <init> (java.io.File) void
   public void method_8132(File var1) {
      super.method_8132(var1);
   }

   // $FF: renamed from: b (java.lang.String) java.io.InputStream
   protected InputStream method_8135(String var1) {
      return new BufferedInputStream(new FileInputStream(new File(this.field_7919, var1)));
   }

   // $FF: renamed from: c (java.lang.String) boolean
   protected boolean method_8136(String var1) {
      return (new File(this.field_7919, var1)).isFile();
   }

   // $FF: renamed from: a () java.util.Set
   public Set method_230() {
      HashSet var2 = Sets.newHashSet();
      String[] var1 = class_752.method_4253();
      File var3 = new File(this.field_7919, "assets/");
      File var10000 = var3;
      if(var1 != null) {
         if(!var3.isDirectory()) {
            return var2;
         }

         var10000 = var3;
      }

      File[] var4 = var10000.listFiles(DirectoryFileFilter.DIRECTORY);
      int var5 = var4.length;
      int var6 = 0;

      while(var6 < var5) {
         File var7 = var4[var6];
         String var8 = method_8134(var3, var7);
         boolean var9 = var8.equals(var8.toLowerCase());
         if(var1 != null) {
            label22: {
               if(!var9) {
                  this.method_8137(var8);
                  if(var1 != null) {
                     break label22;
                  }
               }

               var2.add(var8.substring(0, var8.length() - 1));
            }
         }

         ++var6;
         if(var1 == null) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8139() {
      boolean var10000 = true;
      char[] var10003 = "/Û_¡Fµ".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7921 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 18;
            break;
         case 1:
            var10009 = 244;
            break;
         case 2:
            var10009 = 52;
            break;
         case 3:
            var10009 = 102;
            break;
         case 4:
            var10009 = 137;
            break;
         case 5:
            var10009 = 105;
            break;
         default:
            var10009 = 198;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bpt extends bpp {

   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_7768;
   // $FF: renamed from: b java.util.List
   public final List field_7769;
   // $FF: renamed from: h java.lang.String
   private static final String field_7770 = "Couldn\'t load layered image";


   // $FF: renamed from: <init> (java.lang.String[]) void
   public void method_7964(String ... var1) {
      super.method_7950();
      this.field_7769 = Lists.newArrayList(var1);
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_7965() {
      boolean var10000 = true;
      char[] var10003 = "R&l\nûsªeiu\tþy­}(`íxé1 tøx".toCharArray();
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
            field_7770 = (new String((char[])var3)).intern();
            field_7768 = LogManager.getLogger();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 208;
            break;
         case 1:
            var10009 = 136;
            break;
         case 2:
            var10009 = 216;
            break;
         case 3:
            var10009 = 167;
            break;
         case 4:
            var10009 = 94;
            break;
         case 5:
            var10009 = 220;
            break;
         default:
            var10009 = 76;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_7966(IOException var0) {
      return var0;
   }
}

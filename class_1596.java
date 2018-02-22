import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// $FF: renamed from: tI
class class_1596 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8312;
   // $FF: renamed from: b kj
   final class_1346 field_8313;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8314;


   // $FF: renamed from: <init> (kj) void
   void method_8730(class_1346 var1) {
      this.field_8313 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8731() {
      RuntimeMXBean var2 = ManagementFactory.getRuntimeMXBean();
      List var3 = var2.getInputArguments();
      int var4 = 0;
      String[] var10000 = class_752.method_4253();
      StringBuilder var5 = new StringBuilder();
      Iterator var6 = var3.iterator();
      String[] var1 = var10000;

      String var9;
      while(true) {
         if(var6.hasNext()) {
            String var7 = (String)var6.next();
            var9 = var7;
            if(var1 == null) {
               break;
            }

            label35: {
               String[] var8 = field_8314;
               int var10 = var7.startsWith("-X");
               if(var1 != null) {
                  if(var10 == 0) {
                     break label35;
                  }

                  var10 = var4++;
               }

               if(var10 > 0) {
                  var5.append(" ");
               }

               var5.append(var7);
            }

            if(var1 != null) {
               continue;
            }
         }

         var10000 = field_8314;
         var9 = String.format("%d total; %s", new Object[]{Integer.valueOf(var4), var5.toString()});
         break;
      }

      return var9;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8732() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "µ>U°ÇAu\fÓgÃ\nTáIgÛ*";
      int var4 = "µ>U°ÇAu\fÓgÃ\nTáIgÛ*".length();
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
                  field_8314 = var5;
                  String[] var10 = field_8314;
                  field_8312 = "CL_00001329";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 20;
               break;
            case 1:
               var10009 = 144;
               break;
            case 2:
               var10009 = 165;
               break;
            case 3:
               var10009 = 85;
               break;
            case 4:
               var10009 = 135;
               break;
            case 5:
               var10009 = 194;
               break;
            default:
               var10009 = 98;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

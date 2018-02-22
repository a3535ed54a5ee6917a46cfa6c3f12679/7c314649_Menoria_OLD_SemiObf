import java.util.concurrent.Callable;

// $FF: renamed from: pf
class class_1498 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7897;
   // $FF: renamed from: b int[][]
   final int[][] field_7898;
   // $FF: renamed from: c bqd
   final bqd field_7899;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7900;


   // $FF: renamed from: <init> (bqd, int[][]) void
   void method_8107(bqd var1, int[][] var2) {
      this.field_7899 = var1;
      this.field_7898 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8108() {
      String[] var10000 = class_752.method_4253();
      StringBuilder var2 = new StringBuilder();
      String[] var1 = var10000;
      int[][] var3 = this.field_7898;
      int var4 = var3.length;
      int var5 = 0;

      StringBuilder var8;
      while(true) {
         if(var5 < var4) {
            int[] var6 = var3[var5];
            var8 = var2;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               if(var2.length() > 0) {
                  String[] var7 = field_7900;
                  var2.append(", ");
               }

               var8 = var2;
            }

            Object var9;
            label30: {
               int[] var10001 = var6;
               if(var1 != null) {
                  if(var6 == null) {
                     String[] var10 = field_7900;
                     var9 = "null";
                     break label30;
                  }

                  var10001 = var6;
               }

               var9 = Integer.valueOf(var10001.length);
            }

            var8.append(var9);
            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var8 = var2;
         break;
      }

      return var8.toString();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_8109() {
      return this.method_8108();
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_8110() {
      return this.method_8108();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8111() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "+éGôqÙ9ó;rÄ~Ç-";
      int var4 = "+éGôqÙ9ó;rÄ~Ç-".length();
      char var1 = 2;
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
                  field_7900 = var5;
                  String[] var10 = field_7900;
                  field_7897 = "CL_00001063";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 85;
               break;
            case 1:
               var10009 = 244;
               break;
            case 2:
               var10009 = 84;
               break;
            case 3:
               var10009 = 190;
               break;
            case 4:
               var10009 = 22;
               break;
            case 5:
               var10009 = 246;
               break;
            default:
               var10009 = 60;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

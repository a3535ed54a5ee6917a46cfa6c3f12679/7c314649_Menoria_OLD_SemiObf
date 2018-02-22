import java.util.concurrent.Callable;

// $FF: renamed from: pd
class class_1494 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7861;
   // $FF: renamed from: b bqd
   final bqd field_7862;
   // $FF: renamed from: c bpz
   final bpz field_7863;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7864;


   // $FF: renamed from: <init> (bpz, bqd) void
   void method_8069(bpz var1, bqd var2) {
      this.field_7863 = var1;
      this.field_7862 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8070() {
      StringBuilder var10000 = (new StringBuilder()).append(this.field_7862.method_366());
      String[] var10001 = field_7864;
      return var10000.append(" x ").append(this.field_7862.method_367()).toString();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_8071() {
      return this.method_8070();
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_8072() {
      return this.method_8070();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8073() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Rús:> as1)";
      int var4 = "Rús:> as1)".length();
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
                  field_7864 = var5;
                  String[] var10 = field_7864;
                  field_7861 = "CL_00001060";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 112;
               break;
            case 1:
               var10009 = 48;
               break;
            case 2:
               var10009 = 196;
               break;
            case 3:
               var10009 = 34;
               break;
            case 4:
               var10009 = 107;
               break;
            case 5:
               var10009 = 77;
               break;
            default:
               var10009 = 111;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

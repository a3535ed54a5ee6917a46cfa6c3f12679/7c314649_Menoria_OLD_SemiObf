import java.util.concurrent.Callable;

// $FF: renamed from: pe
class class_1496 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7886;
   // $FF: renamed from: b bqd
   final bqd field_7887;
   // $FF: renamed from: c bpz
   final bpz field_7888;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7889;


   // $FF: renamed from: <init> (bpz, bqd) void
   void method_8099(bpz var1, bqd var2) {
      this.field_7888 = var1;
      this.field_7887 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8100() {
      StringBuilder var10000 = (new StringBuilder()).append(this.field_7887.method_8083());
      String[] var10001 = field_7889;
      return var10000.append(" frames").toString();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_8101() {
      return this.method_8100();
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_8102() {
      return this.method_8100();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8103() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "!±uªDe.(ÿwõ/";
      int var4 = "!±uªDe.(ÿwõ/".length();
      char var1 = 7;
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
                  field_7889 = var5;
                  String[] var10 = field_7889;
                  field_7886 = "CL_00001061";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 215;
               break;
            case 1:
               var10009 = 182;
               break;
            case 2:
               var10009 = 50;
               break;
            case 3:
               var10009 = 239;
               break;
            case 4:
               var10009 = 233;
               break;
            case 5:
               var10009 = 62;
               break;
            default:
               var10009 = 198;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

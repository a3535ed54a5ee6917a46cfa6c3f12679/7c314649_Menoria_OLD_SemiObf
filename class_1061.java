
// $FF: renamed from: f_
public class class_1061 {

   // $FF: renamed from: b java.lang.String
   public final String height8;
   // $FF: renamed from: c float
   public final float height9;
   // $FF: renamed from: d float
   public final float buttonList0;
   // $FF: renamed from: e java.lang.String
   private static final String buttonList1;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] buttonList2;


   // $FF: renamed from: <init> (java.lang.String, float, float) void
   public void method_5991(String var1, float var2, float var3) {
      super();
      this.height8 = var1;
      this.height9 = var2;
      this.buttonList0 = var3;
   }

   // $FF: renamed from: a () float
   public float method_5992() {
      return this.height9;
   }

   // $FF: renamed from: b () float
   public float method_5993() {
      return this.buttonList0;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_5994() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = buttonList2;
      return var10000.append("dig.").append(this.height8).toString();
   }

   // $FF: renamed from: d () java.lang.String
   public String method_5995() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = buttonList2;
      return var10000.append("step.").append(this.height8).toString();
   }

   // $FF: renamed from: e () java.lang.String
   public String method_5996() {
      return this.method_5994();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5997() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "«ÄD\bá|÷Hÿ¼ÙFV\b";
      int var4 = "«ÄD\bá|÷Hÿ¼ÙFV\b".length();
      char var1 = 4;
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
                  buttonList2 = var5;
                  String[] var10 = buttonList2;
                  buttonList1 = "CL_00000203";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 214;
               break;
            case 1:
               var10009 = 180;
               break;
            case 2:
               var10009 = 58;
               break;
            case 3:
               var10009 = 63;
               break;
            case 4:
               var10009 = 63;
               break;
            case 5:
               var10009 = 222;
               break;
            default:
               var10009 = 97;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

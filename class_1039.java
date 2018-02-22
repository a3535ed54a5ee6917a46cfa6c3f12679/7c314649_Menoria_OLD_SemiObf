
// $FF: renamed from: di
class class_1039 {

   // $FF: renamed from: b java.lang.String
   private String field_5497;
   // $FF: renamed from: c boolean
   private boolean field_5498;
   // $FF: renamed from: d int
   private int field_5499;
   // $FF: renamed from: e double
   private double field_5500;
   // $FF: renamed from: f java.lang.String
   private static final String field_5501;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5502;


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_5884(String var1) {
      super();
      this.method_5885(var1);
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_5885(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () java.lang.String
   public String method_5886() {
      return this.field_5497;
   }

   // $FF: renamed from: c () boolean
   public boolean method_5887() {
      return this.field_5498;
   }

   // $FF: renamed from: b (java.lang.NumberFormatException) java.lang.NumberFormatException
   private static NumberFormatException method_5888(NumberFormatException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5889() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Èâq_DÚñhIíÏB°².";
      int var4 = "Èâq_DÚñhIíÏB°².".length();
      char var1 = 5;
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
                  field_5502 = var5;
                  String[] var10 = field_5502;
                  field_5501 = "CL_00000137";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 120;
               break;
            case 1:
               var10009 = 85;
               break;
            case 2:
               var10009 = 203;
               break;
            case 3:
               var10009 = 250;
               break;
            case 4:
               var10009 = 247;
               break;
            case 5:
               var10009 = 86;
               break;
            default:
               var10009 = 240;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

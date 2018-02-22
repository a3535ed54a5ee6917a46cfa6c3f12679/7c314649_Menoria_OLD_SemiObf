import java.util.concurrent.Callable;

// $FF: renamed from: kB
class class_1310 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6725;
   // $FF: renamed from: b bao
   final bao field_6726;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6727;


   // $FF: renamed from: <init> (bao) void
   void method_6912(bao var1) {
      this.field_6726 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6913() {
      String var10000;
      if(this.field_6726.canLoseFocus7.field_4519 == 1) {
         String[] var1 = field_6727;
         var10000 = "Off (1)";
      } else {
         StringBuilder var2 = new StringBuilder();
         String[] var10001 = field_6727;
         var10000 = var2.append("On (").append(this.field_6726.canLoseFocus7.field_4519).append(")").toString();
      }

      return var10000;
   }

   public Object call() {
      return this.method_6913();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6914() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "¨Ydû¿0`tã¾)àö\nw l";
      int var4 = "¨Ydû¿0`tã¾)àö\nw l".length();
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
                  field_6727 = var5;
                  String[] var10 = field_6727;
                  field_6725 = "CL_00001853";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 52;
               break;
            case 1:
               var10009 = 43;
               break;
            case 2:
               var10009 = 218;
               break;
            case 3:
               var10009 = 161;
               break;
            case 4:
               var10009 = 54;
               break;
            case 5:
               var10009 = 107;
               break;
            default:
               var10009 = 252;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

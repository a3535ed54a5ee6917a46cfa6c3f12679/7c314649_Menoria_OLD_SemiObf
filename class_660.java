import java.util.HashMap;
import java.util.TimerTask;

// $FF: renamed from: AX
class class_660 extends TimerTask {

   // $FF: renamed from: a java.lang.String
   private static final String field_2824;
   // $FF: renamed from: b vS
   final class_1683 field_2825;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2826;


   // $FF: renamed from: <init> (vS) void
   void method_3575(class_1683 var1) {
      this.field_2825 = var1;
      super();
   }

   public void run() {
      String[] var1 = class_752.method_4253();
      class_1683 var10000 = this.field_2825;
      if(var1 != null) {
         if(!class_1683.method_9278(this.field_2825).method_378()) {
            return;
         }

         var10000 = this.field_2825;
      }

      HashMap var2;
      synchronized(class_1683.method_9279(var10000)) {
         var2 = new HashMap(class_1683.method_9280(this.field_2825));
         if(var1 != null) {
            if(class_1683.method_9281(this.field_2825) == 0) {
               var2.putAll(class_1683.method_9282(this.field_2825));
            }

            String[] var5 = field_2826;
            var2.put("snooper_count", Integer.valueOf(class_1683.method_9277(this.field_2825)));
            var2.put("snooper_token", class_1683.method_9283(this.field_2825));
         }
      }

      class_1703.method_9459(class_1683.method_9284(this.field_2825), var2, true);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3576() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "b!ºE,;[XÔC\rRln~ r\rRln~ye";
      int var4 = "b!ºE,;[XÔC\rRln~ r\rRln~ye".length();
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
                  field_2826 = var5;
                  String[] var10 = field_2826;
                  field_2824 = "CL_00001516";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 55;
               break;
            case 1:
               var10009 = 123;
               break;
            case 2:
               var10009 = 243;
               break;
            case 3:
               var10009 = 99;
               break;
            case 4:
               var10009 = 10;
               break;
            case 5:
               var10009 = 29;
               break;
            default:
               var10009 = 125;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

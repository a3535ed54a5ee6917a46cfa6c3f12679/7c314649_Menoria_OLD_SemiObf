import java.util.concurrent.Callable;

// $FF: renamed from: kz
class Gui1 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7144;
   // $FF: renamed from: b bao
   final bao field_7145;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7146;


   // $FF: renamed from: <init> (bao) void
   void isFocused8(bao var1) {
      this.field_7145 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String isFocused9() {
      String[] var1 = class_752.method_4253();
      class_1535 var10000 = this.field_7145.isEnabled6;
      String var2;
      if(var1 != null) {
         if(!this.field_7145.isEnabled6.field_8062) {
            String[] var3 = field_7146;
            var2 = "N/A (disabled)";
            return var2;
         }

         var10000 = this.field_7145.isEnabled6;
      }

      var2 = var10000.method_8336();
      return var2;
   }

   // $FF: renamed from: c () java.lang.Object
   public Object setEnabled0() {
      return this.isFocused9();
   }

   // $FF: renamed from: <clinit> () void
   static void setEnabled1() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "j,%ííæW×i í¦gú25õ¹¿^3";
      int var4 = "j,%ííæW×i í¦gú25õ¹¿^3".length();
      char var1 = 14;
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
                  field_7146 = var5;
                  String[] var10 = field_7146;
                  field_7144 = "CL_00000636";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 75;
               break;
            case 1:
               var10009 = 217;
               break;
            case 2:
               var10009 = 2;
               break;
            case 3:
               var10009 = 106;
               break;
            case 4:
               var10009 = 170;
               break;
            case 5:
               var10009 = 230;
               break;
            default:
               var10009 = 224;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

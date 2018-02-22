
// $FF: renamed from: k7
class class_146 extends class_145 {

   // $FF: renamed from: s int
   private final int field_465;
   // $FF: renamed from: t int
   private final int field_466;
   // $FF: renamed from: u java.lang.String
   private static final String field_467;
   // $FF: renamed from: v lJ
   final class_224 field_468;
   // $FF: renamed from: w java.lang.String[]
   private static final String[] field_469;


   // $FF: renamed from: <init> (lJ, int, int, int, int, int) void
   public void method_768(class_224 var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_468 = var1;
      super.method_765(var2, var3, var4, class_215.field_1104, 0 + class_1635.field_8489[var5].method_8974() % 8 * 18, 198 + class_1635.field_8489[var5].method_8974() / 8 * 18);
      this.field_465 = var5;
      this.field_466 = var6;
   }

   // $FF: renamed from: b (int, int) void
   public void method_755(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      String var4 = class_1450.method_7896(class_1635.field_8489[this.field_465].method_8972(), new Object[0]);
      String[] var3 = var10000;
      class_146 var5 = this;
      if(var3 != null) {
         label16: {
            if(this.field_466 >= 3) {
               var5 = this;
               if(var3 == null) {
                  break label16;
               }

               if(this.field_465 != class_1635.field_8500.field_8526) {
                  StringBuilder var6 = (new StringBuilder()).append(var4);
                  String[] var10001 = field_469;
                  var4 = var6.append(" II").toString();
               }
            }

            var5 = this;
         }
      }

      class_224.method_1220(var5.field_468, var4, var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "GK$N£bªW5õ¡";
      int var4 = "GK$N£bªW5õ¡".length();
      char var1 = 3;
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
                  field_469 = var5;
                  String[] var10 = field_469;
                  field_467 = "CL_00000742";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 206;
               break;
            case 1:
               var10009 = 171;
               break;
            case 2:
               var10009 = 104;
               break;
            case 3:
               var10009 = 58;
               break;
            case 4:
               var10009 = 150;
               break;
            case 5:
               var10009 = 251;
               break;
            default:
               var10009 = 51;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

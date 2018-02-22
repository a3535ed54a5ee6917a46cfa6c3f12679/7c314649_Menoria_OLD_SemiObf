
// $FF: renamed from: mA
public class Gui3 implements class_31 {

   // $FF: renamed from: a java.lang.String
   private final String field_7151;
   // $FF: renamed from: b int
   private final int field_7152;
   // $FF: renamed from: c java.lang.String
   private static final String field_7153 = "CL_00000734";
   // $FF: renamed from: d mc
   final class_977 field_7154;


   // $FF: renamed from: <init> (mc, java.lang.String) void
   public void setEnabled4(class_977 var1, String var2) {
      this.field_7154 = var1;
      super();
      this.field_7151 = class_1450.method_7896(var2, new Object[0]);
      this.field_7152 = class_977.method_5620(var1).enableBackgroundDrawing4.getCharWidth(this.field_7151);
   }

   // $FF: renamed from: b (int, int, int, int, int, bmh, int, int, boolean) void
   public void method_147(int var1, int var2, int var3, int var4, int var5, bmh var6, int var7, int var8, boolean var9) {
      class_977.method_5620(this.field_7154).enableBackgroundDrawing4.method_7020(this.field_7151, class_977.method_5620(this.field_7154).enableBackgroundDrawing6.width / 2 - this.field_7152 / 2, var3 + var5 - class_977.method_5620(this.field_7154).enableBackgroundDrawing4.FONT_HEIGHT - 1, 16777215);
   }

   // $FF: renamed from: b (int, int, int, int, int, int) boolean
   public boolean method_148(int var1, int var2, int var3, int var4, int var5, int var6) {
      return false;
   }

   // $FF: renamed from: c (int, int, int, int, int, int) void
   public void method_149(int var1, int var2, int var3, int var4, int var5, int var6) {}

   // $FF: renamed from: <clinit> () void
   static void setEnabled5() {
      boolean var10000 = true;
      char[] var10003 = "4à)ô;lKGEð".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7153 = (new String((char[])var4)).intern();
            String var2 = field_7153;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 191;
            break;
         case 1:
            var10009 = 100;
            break;
         case 2:
            var10009 = 190;
            break;
         case 3:
            var10009 = 12;
            break;
         case 4:
            var10009 = 195;
            break;
         case 5:
            var10009 = 148;
            break;
         default:
            var10009 = 179;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}


// $FF: renamed from: mm
class class_966 extends bcm {

   // $FF: renamed from: w java.lang.String
   private static final String field_4898 = "CL_00000715";
   // $FF: renamed from: x lz
   final class_164 field_4899;


   // $FF: renamed from: <init> (lz) void
   public void method_5589(class_164 var1) {
      this.field_4899 = var1;
      super.method_5549(var1.field_557, var1.width, var1.height, 80, var1.height - 40, var1.fontRendererObj.FONT_HEIGHT + 1);
   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return class_164.method_881(this.field_4899).size();
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {}

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      return false;
   }

   // $FF: renamed from: a () void
   protected void method_5557() {}

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      this.field_4899.fontRendererObj.method_7020((String)class_164.method_881(this.field_4899).get(var1), 10, var3, 16777215);
      this.field_4899.fontRendererObj.method_7020((String)class_164.method_882(this.field_4899).get(var1), 230, var3, 16777215);
   }

   // $FF: renamed from: d () int
   protected int method_5575() {
      return this.field_4854 - 10;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      boolean var10000 = true;
      char[] var10003 = "{ÚpyÌG\b¡|".toCharArray();
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
            field_4898 = (new String((char[])var4)).intern();
            String var2 = field_4898;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 198;
            break;
         case 1:
            var10009 = 104;
            break;
         case 2:
            var10009 = 209;
            break;
         case 3:
            var10009 = 183;
            break;
         case 4:
            var10009 = 2;
            break;
         case 5:
            var10009 = 77;
            break;
         default:
            var10009 = 137;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

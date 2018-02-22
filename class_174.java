import java.util.List;

// $FF: renamed from: lp
public class class_174 extends bdw {

   // $FF: renamed from: b java.lang.String
   private String field_639;
   // $FF: renamed from: i java.lang.String
   private String field_640;
   // $FF: renamed from: r java.lang.String
   private static final String field_641 = "gui.cancel";


   // $FF: renamed from: <init> (java.lang.String, java.lang.String) void
   public void method_932(String var1, String var2) {
      super.method_651();
      this.field_639 = var1;
      this.field_640 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      super.initGui();
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      var10001.method_747(0, this.width / 2 - 100, 140, class_1450.method_7896("gui.cancel", new Object[0]));
      var10000.add(var10001);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.drawGradientRect(0, 0, this.width, this.height, -12574688, -11530224);
      this.drawCenteredString(this.fontRendererObj, this.field_639, this.width / 2, 90, 16777215);
      this.drawCenteredString(this.fontRendererObj, this.field_640, this.width / 2, 110, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {}

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      this.field_557.method_5236((bdw)null);
   }

   // $FF: renamed from: <clinit> () void
   static void method_933() {
      boolean var10000 = true;
      char[] var10003 = "Ñ&[´Á".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_641 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 86;
            break;
         case 1:
            var10009 = 19;
            break;
         case 2:
            var10009 = 203;
            break;
         case 3:
            var10009 = 191;
            break;
         case 4:
            var10009 = 65;
            break;
         case 5:
            var10009 = 141;
            break;
         default:
            var10009 = 109;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

import ca.diiza.f.class_209;
import java.util.List;

// $FF: renamed from: lr
public class class_172 extends bdw {

   // $FF: renamed from: b java.lang.String
   private static final String field_629;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_630;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      this.buttonList.clear();
      List var10000 = this.buttonList;
      class_141 var10001 = new class_141;
      int var10004 = this.width / 2 - 155;
      int var10005 = this.height / 4 + 120 + 12;
      String[] var1 = field_630;
      var10001.method_747(0, var10004, var10005, class_1450.method_7896("gui.toMenu", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new class_141;
      var10001.method_747(1, this.width / 2 - 155 + 160, this.height / 4 + 120 + 12, class_1450.method_7896("menu.quit", new Object[0]));
      var10000.add(var10001);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_450;
      if(var2 != null) {
         if(var1.field_450 == 0) {
            bao var3 = this.field_557;
            class_209 var10001 = new class_209;
            var10001.method_651();
            var3.method_5236(var10001);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
      }

      if(var10000 == 1) {
         this.field_557.method_5247();
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {}

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      String[] var4 = field_630;
      this.drawCenteredString(this.fontRendererObj, "Out of memory!", this.width / 2, this.height / 4 - 60 + 20, 16777215);
      this.method_657(this.fontRendererObj, "Minecraft has run out of memory.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 0, 10526880);
      this.method_657(this.fontRendererObj, "This could be caused by a bug in the game or by the", this.width / 2 - 140, this.height / 4 - 60 + 60 + 18, 10526880);
      this.method_657(this.fontRendererObj, "Java Virtual Machine not being allocated enough", this.width / 2 - 140, this.height / 4 - 60 + 60 + 27, 10526880);
      this.method_657(this.fontRendererObj, "memory.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 36, 10526880);
      this.method_657(this.fontRendererObj, "To prevent level corruption, the current game has quit.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 54, 10526880);
      this.method_657(this.fontRendererObj, "We\'ve tried to free up enough memory to let you go back to", this.width / 2 - 140, this.height / 4 - 60 + 60 + 63, 10526880);
      this.method_657(this.fontRendererObj, "the main menu and back to playing, but this may not have worked.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 72, 10526880);
      this.method_657(this.fontRendererObj, "Please restart the game if you see this message again.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 81, 10526880);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_925() {
      // $FF: Couldn't be decompiled
   }
}

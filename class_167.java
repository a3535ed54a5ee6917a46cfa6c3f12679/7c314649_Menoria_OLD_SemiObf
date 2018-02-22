import java.util.List;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: lw
public class class_167 extends bdw {

   // $FF: renamed from: b bdw
   private bdw field_602;
   // $FF: renamed from: i k_
   private GuiTextField field_603;
   // $FF: renamed from: r java.lang.String
   private final String field_604;
   // $FF: renamed from: s java.lang.String[]
   private static final String[] field_605;


   // $FF: renamed from: <init> (bdw, java.lang.String) void
   public void method_907(bdw var1, String var2) {
      super.method_651();
      this.field_602 = var1;
      this.field_604 = var2;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      this.field_603.method_712();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      int var10004 = this.width / 2 - 100;
      int var10005 = this.height / 4 + 96 + 12;
      String[] var4 = field_605;
      var10001.method_747(0, var10004, var10005, class_1450.method_7896("selectWorld.renameButton", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_747(1, this.width / 2 - 100, this.height / 4 + 120 + 12, class_1450.method_7896("gui.cancel", new Object[0]));
      var10000.add(var10001);
      class_30 var1 = this.field_557.method_5235();
      class_1303 var2 = var1.method_139(this.field_604);
      String var3 = var2.method_6851();
      GuiTextField var5 = new GuiTextField;
      var5.GuiTextField(this.fontRendererObj, this.width / 2 - 100, 60, 200, 20);
      this.field_603 = var5;
      this.field_603.setFocused(true);
      this.field_603.writeText(var3);
   }

   // $FF: renamed from: m () void
   public void method_872() {
      Keyboard.enableRepeatEvents(false);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_451;
      if(var2 != null) {
         if(!var1.field_451) {
            return;
         }

         var10000 = var1.field_450;
      }

      if(var2 != null) {
         if(var10000 == 1) {
            this.field_557.method_5236(this.field_602);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
      }

      if(var10000 == 0) {
         class_30 var3 = this.field_557.method_5235();
         var3.method_142(this.field_604, this.field_603.method_714().trim());
         this.field_557.method_5236(this.field_602);
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var10000 = class_752.method_4253();
      this.field_603.method_726(var1, var2);
      String[] var3 = var10000;
      bcb var4 = (bcb)this.buttonList.get(0);
      int var10001 = this.field_603.method_714().trim().length();
      if(var3 != null) {
         var10001 = var10001 > 0?1:0;
      }

      label23: {
         var4.field_451 = (boolean)var10001;
         int var5 = var2;
         short var6 = 28;
         if(var3 != null) {
            if(var2 == 28) {
               break label23;
            }

            var5 = var2;
            var6 = 156;
         }

         if(var5 != var6) {
            return;
         }
      }

      this.method_865((bcb)this.buttonList.get(0));
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      this.field_603.method_727(var1, var2, var3);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      String[] var4 = field_605;
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("selectWorld.renameTitle", new Object[0]), this.width / 2, 20, 16777215);
      this.method_657(this.fontRendererObj, class_1450.method_7896("selectWorld.enterName", new Object[0]), this.width / 2 - 100, 47, 10526880);
      this.field_603.drawTextBox();
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_908() {
      // $FF: Couldn't be decompiled
   }
}

import java.util.List;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: lW
public class class_192 extends bdw {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_778;
   // $FF: renamed from: i k_
   private GuiTextField field_779;
   // $FF: renamed from: r k_
   private GuiTextField field_780;
   // $FF: renamed from: s c7
   private final class_926 field_781;
   // $FF: renamed from: t bcb
   private bcb field_782;
   // $FF: renamed from: u bcb
   private bcb field_783;
   // $FF: renamed from: v java.lang.String[]
   private static final String[] field_784;


   // $FF: renamed from: <init> (c7) void
   public void method_1021(class_926 var1) {
      super.method_651();
      this.field_781 = var1;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      this.field_779.method_712();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      Keyboard.enableRepeatEvents(true);
      String[] var10000 = class_752.method_4253();
      this.buttonList.clear();
      List var10001 = this.buttonList;
      bcb var10003 = new bcb;
      int var10006 = this.width / 2 - 4 - 150;
      int var10007 = this.height / 4 + 120 + 12;
      String[] var2 = field_784;
      var10003.method_748(0, var10006, var10007, 150, 20, class_1450.method_7896("gui.done", new Object[0]));
      var10001.add(this.field_782 = var10003);
      var10001 = this.buttonList;
      var10003 = new bcb;
      var10003.method_748(1, this.width / 2 + 4, this.height / 4 + 120 + 12, 150, 20, class_1450.method_7896("gui.cancel", new Object[0]));
      var10001.add(this.field_783 = var10003);
      GuiTextField var10002 = new GuiTextField;
      var10002.GuiTextField(this.fontRendererObj, this.width / 2 - 150, 50, 300, 20);
      this.field_779 = var10002;
      String[] var1 = var10000;
      this.field_779.setMaxStringLength(32767);
      this.field_779.setFocused(true);
      this.field_779.writeText(this.field_781.method_5439());
      GuiTextField var5 = new GuiTextField;
      var5.GuiTextField(this.fontRendererObj, this.width / 2 - 150, 135, 300, 20);
      this.field_780 = var5;
      this.field_780.setMaxStringLength(32767);
      this.field_780.setEnabled(false);
      this.field_780.writeText(this.field_781.method_5439());
      class_192 var3 = this;
      if(var1 != null) {
         if(this.field_781.method_5435() != null) {
            this.field_780.writeText(this.field_781.method_5435().method_342());
         }

         var3 = this;
      }

      bcb var4 = var3.field_782;
      int var6 = this.field_779.method_714().trim().length();
      if(var1 != null) {
         var6 = var6 > 0?1:0;
      }

      var4.field_451 = (boolean)var6;
   }

   // $FF: renamed from: m () void
   public void method_872() {
      Keyboard.enableRepeatEvents(false);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var10000 = class_752.method_4253();
      this.field_779.method_726(var1, var2);
      this.field_780.method_726(var1, var2);
      String[] var3 = var10000;
      bcb var4 = this.field_782;
      int var10001 = this.field_779.method_714().trim().length();
      if(var3 != null) {
         var10001 = var10001 > 0?1:0;
      }

      int var5;
      short var6;
      label33: {
         label32: {
            var4.field_451 = (boolean)var10001;
            if(var3 != null) {
               if(var2 != 28) {
                  var5 = var2;
                  var6 = 156;
                  if(var3 == null) {
                     break label33;
                  }

                  if(var2 != 156) {
                     break label32;
                  }
               }

               this.method_865(this.field_782);
            }

            if(var3 != null) {
               return;
            }
         }

         var5 = var2;
         var6 = 1;
      }

      if(var5 == var6) {
         this.method_865(this.field_783);
      }

   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      this.field_779.method_727(var1, var2, var3);
      this.field_780.method_727(var1, var2, var3);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      String[] var7 = field_784;
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("advMode.setCommand", new Object[0]), this.width / 2, 20, 16777215);
      this.method_657(this.fontRendererObj, class_1450.method_7896("advMode.command", new Object[0]), this.width / 2 - 150, 37, 10526880);
      String[] var10000 = class_752.method_4253();
      this.field_779.drawTextBox();
      byte var5 = 75;
      String[] var4 = var10000;
      byte var6 = 0;
      FontRenderer var10001 = this.fontRendererObj;
      String var10002 = class_1450.method_7896("advMode.nearestPlayer", new Object[0]);
      int var10003 = this.width / 2 - 150;
      int var9 = var6 + 1;
      this.method_657(var10001, var10002, var10003, var5 + var6 * this.fontRendererObj.FONT_HEIGHT, 10526880);
      this.method_657(this.fontRendererObj, class_1450.method_7896("advMode.randomPlayer", new Object[0]), this.width / 2 - 150, var5 + var9++ * this.fontRendererObj.FONT_HEIGHT, 10526880);
      this.method_657(this.fontRendererObj, class_1450.method_7896("advMode.allPlayers", new Object[0]), this.width / 2 - 150, var5 + var9++ * this.fontRendererObj.FONT_HEIGHT, 10526880);
      class_192 var10 = this;
      if(var4 != null) {
         if(this.field_780.method_714().length() > 0) {
            int var8 = var5 + var9 * this.fontRendererObj.FONT_HEIGHT + 20;
            this.method_657(this.fontRendererObj, class_1450.method_7896("advMode.previousOutput", new Object[0]), this.width / 2 - 150, var8, 10526880);
            this.field_780.drawTextBox();
         }

         var10 = this;
      }

      var10.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1022() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_1023(Exception var0) {
      return var0;
   }
}

import java.util.List;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: lm
public class class_177 extends bdw {

   // $FF: renamed from: b bdw
   private final bdw field_653;
   // $FF: renamed from: i nF
   private final class_1386 field_654;
   // $FF: renamed from: r k_
   private GuiTextField field_655;
   // $FF: renamed from: s java.lang.String[]
   private static final String[] field_656;


   // $FF: renamed from: <init> (bdw, nF) void
   public void method_938(bdw var1, class_1386 var2) {
      super.method_651();
      this.field_653 = var1;
      this.field_654 = var2;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      this.field_655.method_712();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      bcb var4;
      int var6;
      label22: {
         label24: {
            Keyboard.enableRepeatEvents(true);
            this.buttonList.clear();
            List var10000 = this.buttonList;
            bcb var10001 = new bcb;
            int var10004 = this.width / 2 - 100;
            int var10005 = this.height / 4 + 96 + 12;
            String[] var2 = field_656;
            var10001.method_747(0, var10004, var10005, class_1450.method_7896("selectServer.select", new Object[0]));
            var10000.add(var10001);
            String[] var3 = class_752.method_4253();
            List var5 = this.buttonList;
            bcb var10002 = new bcb;
            var10002.method_747(1, this.width / 2 - 100, this.height / 4 + 120 + 12, class_1450.method_7896("gui.cancel", new Object[0]));
            var5.add(var10002);
            GuiTextField var7 = new GuiTextField;
            var7.GuiTextField(this.fontRendererObj, this.width / 2 - 100, 116, 200, 20);
            this.field_655 = var7;
            String[] var1 = var3;
            this.field_655.setMaxStringLength(128);
            this.field_655.setFocused(true);
            this.field_655.writeText(this.field_557.canLoseFocus7.field_4564);
            var4 = (bcb)this.buttonList.get(0);
            var6 = this.field_655.method_714().length();
            if(var1 != null) {
               if(var6 <= 0) {
                  break label24;
               }

               var6 = this.field_655.method_714().split(":").length;
            }

            if(var1 == null) {
               break label22;
            }

            if(var6 > 0) {
               var6 = 1;
               break label22;
            }
         }

         var6 = 0;
      }

      var4.field_451 = (boolean)var6;
   }

   // $FF: renamed from: m () void
   public void method_872() {
      Keyboard.enableRepeatEvents(false);
      this.field_557.canLoseFocus7.field_4564 = this.field_655.method_714();
      this.field_557.canLoseFocus7.method_5358();
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
            this.field_653.method_160(false, 0);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
      }

      if(var10000 == 0) {
         this.field_654.field_7362 = this.field_655.method_714();
         this.field_653.method_160(true, 0);
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_655.method_726(var1, var2);
      if(var3 != null) {
         if(var10000 != 0) {
            int var10001;
            bcb var4;
            label39: {
               label49: {
                  var4 = (bcb)this.buttonList.get(0);
                  var10001 = this.field_655.method_714().length();
                  if(var3 != null) {
                     if(var10001 <= 0) {
                        break label49;
                     }

                     var10001 = this.field_655.method_714().split(":").length;
                  }

                  if(var3 == null) {
                     break label39;
                  }

                  if(var10001 > 0) {
                     var10001 = 1;
                     break label39;
                  }
               }

               var10001 = 0;
            }

            var4.field_451 = (boolean)var10001;
            if(var3 != null) {
               return;
            }
         }

         var10000 = var2;
      }

      label28: {
         short var5 = 28;
         if(var3 != null) {
            if(var10000 == 28) {
               break label28;
            }

            var10000 = var2;
            var5 = 156;
         }

         if(var10000 != var5) {
            return;
         }
      }

      this.method_865((bcb)this.buttonList.get(0));
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      this.field_655.method_727(var1, var2, var3);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      String[] var4 = field_656;
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("selectServer.direct", new Object[0]), this.width / 2, 20, 16777215);
      this.method_657(this.fontRendererObj, class_1450.method_7896("addServer.enterIp", new Object[0]), this.width / 2 - 100, 100, 10526880);
      this.field_655.drawTextBox();
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_939() {
      // $FF: Couldn't be decompiled
   }
}

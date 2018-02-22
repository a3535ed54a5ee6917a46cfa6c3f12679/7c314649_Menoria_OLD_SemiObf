import java.util.List;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: lo
public class class_175 extends bdw {

   // $FF: renamed from: b bdw
   private final bdw field_642;
   // $FF: renamed from: i nF
   private final class_1386 field_643;
   // $FF: renamed from: r k_
   private GuiTextField field_644;
   // $FF: renamed from: s k_
   private GuiTextField field_645;
   // $FF: renamed from: t bcb
   private bcb field_646;
   // $FF: renamed from: u java.lang.String[]
   private static final String[] field_647;


   // $FF: renamed from: <init> (bdw, nF) void
   public void method_934(bdw var1, class_1386 var2) {
      super.method_651();
      this.field_642 = var1;
      this.field_643 = var2;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      this.field_645.method_712();
      this.field_644.method_712();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      bcb var4;
      int var6;
      label30: {
         label32: {
            Keyboard.enableRepeatEvents(true);
            this.buttonList.clear();
            List var10000 = this.buttonList;
            bcb var10001 = new bcb;
            int var10004 = this.width / 2 - 100;
            int var10005 = this.height / 4 + 96 + 18;
            String[] var2 = field_647;
            var10001.method_747(0, var10004, var10005, class_1450.method_7896("addServer.add", new Object[0]));
            var10000.add(var10001);
            var10000 = this.buttonList;
            var10001 = new bcb;
            var10001.method_747(1, this.width / 2 - 100, this.height / 4 + 120 + 18, class_1450.method_7896("gui.cancel", new Object[0]));
            var10000.add(var10001);
            String[] var3 = class_752.method_4253();
            List var5 = this.buttonList;
            bcb var10003 = new bcb;
            var10003.method_747(2, this.width / 2 - 100, this.height / 4 + 72, class_1450.method_7896("addServer.resourcePack", new Object[0]) + ": " + this.field_643.method_7561().method_496().method_343());
            var5.add(this.field_646 = var10003);
            GuiTextField var10002 = new GuiTextField;
            var10002.GuiTextField(this.fontRendererObj, this.width / 2 - 100, 66, 200, 20);
            this.field_645 = var10002;
            this.field_645.setFocused(true);
            this.field_645.writeText(this.field_643.field_7361);
            var10002 = new GuiTextField;
            var10002.GuiTextField(this.fontRendererObj, this.width / 2 - 100, 106, 200, 20);
            this.field_644 = var10002;
            this.field_644.setMaxStringLength(128);
            this.field_644.writeText(this.field_643.field_7362);
            String[] var1 = var3;
            var4 = (bcb)this.buttonList.get(0);
            var6 = this.field_644.method_714().length();
            if(var1 != null) {
               if(var6 <= 0) {
                  break label32;
               }

               var6 = this.field_644.method_714().split(":").length;
            }

            if(var1 != null) {
               if(var6 <= 0) {
                  break label32;
               }

               var6 = this.field_645.method_714().length();
            }

            if(var1 == null) {
               break label30;
            }

            if(var6 > 0) {
               var6 = 1;
               break label30;
            }
         }

         var6 = 0;
      }

      var4.field_451 = (boolean)var6;
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

      label39: {
         byte var10001 = 2;
         if(var2 != null) {
            if(var10000 == 2) {
               this.field_643.method_7562(class_105.values()[(this.field_643.method_7561().ordinal() + 1) % class_105.values().length]);
               bcb var4 = this.field_646;
               StringBuilder var5 = new StringBuilder();
               String[] var3 = field_647;
               var4.field_449 = var5.append(class_1450.method_7896("addServer.resourcePack", new Object[0])).append(": ").append(this.field_643.method_7561().method_496().method_343()).toString();
               if(var2 != null) {
                  return;
               }
            }

            var10000 = var1.field_450;
            if(var2 == null) {
               break label39;
            }

            var10001 = 1;
         }

         if(var10000 == var10001) {
            this.field_642.method_160(false, 0);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
      }

      if(var10000 == 0) {
         this.field_643.field_7361 = this.field_645.method_714();
         this.field_643.field_7362 = this.field_644.method_714();
         this.field_642.method_160(true, 0);
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      this.field_645.method_726(var1, var2);
      String[] var10000 = class_752.method_4253();
      this.field_644.method_726(var1, var2);
      String[] var3 = var10000;
      int var4 = var2;
      short var10001 = 15;
      if(var3 != null) {
         if(var2 == 15) {
            GuiTextField var5 = this.field_645;
            boolean var6 = this.field_645.isFocused();
            if(var3 != null) {
               var6 = !var6;
            }

            var5.setFocused(var6);
            var5 = this.field_644;
            var6 = this.field_644.isFocused();
            if(var3 != null) {
               var6 = !var6;
            }

            var5.setFocused(var6);
         }

         var4 = var2;
         var10001 = 28;
      }

      label67: {
         label66: {
            if(var3 != null) {
               if(var4 == var10001) {
                  break label66;
               }

               var4 = var2;
               var10001 = 156;
            }

            if(var4 != var10001) {
               break label67;
            }
         }

         this.method_865((bcb)this.buttonList.get(0));
      }

      bcb var7;
      int var8;
      label58: {
         label72: {
            var7 = (bcb)this.buttonList.get(0);
            var8 = this.field_644.method_714().length();
            if(var3 != null) {
               if(var8 <= 0) {
                  break label72;
               }

               var8 = this.field_644.method_714().split(":").length;
            }

            if(var3 != null) {
               if(var8 <= 0) {
                  break label72;
               }

               var8 = this.field_645.method_714().length();
            }

            if(var3 == null) {
               break label58;
            }

            if(var8 > 0) {
               var8 = 1;
               break label58;
            }
         }

         var8 = 0;
      }

      var7.field_451 = (boolean)var8;
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      this.field_644.method_727(var1, var2, var3);
      this.field_645.method_727(var1, var2, var3);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      String[] var4 = field_647;
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("addServer.title", new Object[0]), this.width / 2, 17, 16777215);
      this.method_657(this.fontRendererObj, class_1450.method_7896("addServer.enterName", new Object[0]), this.width / 2 - 100, 53, 10526880);
      this.method_657(this.fontRendererObj, class_1450.method_7896("addServer.enterIp", new Object[0]), this.width / 2 - 100, 94, 10526880);
      this.field_645.drawTextBox();
      this.field_644.drawTextBox();
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_935() {
      // $FF: Couldn't be decompiled
   }
}

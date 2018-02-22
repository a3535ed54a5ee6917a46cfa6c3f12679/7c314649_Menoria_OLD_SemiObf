import java.util.List;

public class GuiAnimationSettingsOF extends bdw {

   private bdw prevScreen;
   protected String title;
   private bbj settings;
   private static class_101[] enumOptions;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_970;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_1140(bdw var1, bbj var2) {
      super.method_651();
      String[] var10001 = field_970;
      this.title = "Animation Settings";
      this.prevScreen = var1;
      this.settings = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      int var2 = 0;
      String[] var1 = class_752.method_4253();
      class_101[] var3 = enumOptions;
      int var4 = var3.length;
      int var5 = 0;

      while(true) {
         List var10;
         class_141 var10001;
         if(var5 < var4) {
            class_101 var6 = var3[var5];
            int var7 = this.width / 2 - 155 + var2 % 2 * 160;
            int var8 = this.height / 6 + 21 * (var2 / 2) - 10;
            boolean var10000 = var6.method_467();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               label21: {
                  if(!var10000) {
                     var10 = this.buttonList;
                     var10001 = new class_141;
                     var10001.method_760(var6.method_469(), var7, var8, var6, this.settings.method_5355(var6));
                     var10.add(var10001);
                     if(var1 != null) {
                        break label21;
                     }
                  }

                  var10 = this.buttonList;
                  class_152 var11 = new class_152;
                  var11.method_782(var6.method_469(), var7, var8, var6);
                  var10.add(var11);
               }
            }

            ++var2;
            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var10 = this.buttonList;
         bcb var12 = new bcb;
         int var10004 = this.width / 2 - 155;
         int var10005 = this.height / 6 + 168 + 11;
         String[] var9 = field_970;
         var12.method_748(210, var10004, var10005, 70, 20, "All ON");
         var10.add(var12);
         var10 = this.buttonList;
         var12 = new bcb;
         var12.method_748(211, this.width / 2 - 155 + 80, this.height / 6 + 168 + 11, 70, 20, "All OFF");
         var10.add(var12);
         var10 = this.buttonList;
         var10001 = new class_141;
         var10001.method_747(200, this.width / 2 + 5, this.height / 6 + 168 + 11, class_1450.method_7896("gui.done", new Object[0]));
         var10.add(var10001);
         break;
      }

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

      int var10001 = 200;
      if(var2 != null) {
         label52: {
            if(var10000 < 200) {
               var10000 = var1 instanceof class_141;
               if(var2 == null) {
                  break label52;
               }

               if(var10000 != 0) {
                  this.settings.method_5351(((class_141)var1).method_761(), 1);
                  var1.field_449 = this.settings.method_5355(class_101.method_464(var1.field_450));
               }
            }

            var10000 = var1.field_450;
         }

         var10001 = 200;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            this.field_557.method_5236(this.prevScreen);
         }

         var10000 = var1.field_450;
         var10001 = 210;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.setAllAnimations(true);
         }

         var10000 = var1.field_450;
         var10001 = 211;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.setAllAnimations(false);
         }

         var10000 = var1.field_450;
         var10001 = class_101.CLOUD_HEIGHT.ordinal();
      }

      if(var10000 != var10001) {
         class_1338 var6 = new class_1338;
         var6.method_7060(this.field_557, this.field_557.cursorCounter2, this.field_557.cursorCounter3);
         class_1338 var3 = var6;
         int var4 = var3.method_7061();
         int var5 = var3.method_7062();
         this.method_866(this.field_557, var4, var5);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.drawCenteredString(this.fontRendererObj, this.title, this.width / 2, 20, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1141() {
      // $FF: Couldn't be decompiled
   }
}

import java.util.List;

public class GuiOtherSettingsOF extends bdw implements class_35 {

   private bdw prevScreen;
   protected String title;
   private bbj settings;
   private static class_101[] enumOptions;
   private int lastMouseX;
   private int lastMouseY;
   private long mouseStillTime;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_968;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_1136(bdw var1, bbj var2) {
      super.method_651();
      this.lastMouseX = 0;
      this.lastMouseY = 0;
      this.mouseStillTime = 0L;
      String[] var10001 = field_968;
      this.title = "Other Settings";
      this.prevScreen = var1;
      this.settings = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      class_101[] var3 = enumOptions;
      String[] var1 = var10000;
      int var4 = var3.length;
      int var5 = 0;

      while(true) {
         List var11;
         if(var5 < var4) {
            class_101 var6 = var3[var5];
            int var7 = this.width / 2 - 155 + var2 % 2 * 160;
            int var8 = this.height / 6 + 21 * (var2 / 2) - 10;
            boolean var10 = var6.method_467();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               label21: {
                  if(!var10) {
                     var11 = this.buttonList;
                     class_141 var10001 = new class_141;
                     var10001.method_760(var6.method_469(), var7, var8, var6, this.settings.method_5355(var6));
                     var11.add(var10001);
                     if(var1 != null) {
                        break label21;
                     }
                  }

                  var11 = this.buttonList;
                  class_152 var12 = new class_152;
                  var12.method_782(var6.method_469(), var7, var8, var6);
                  var11.add(var12);
               }
            }

            ++var2;
            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var11 = this.buttonList;
         bcb var13 = new bcb;
         int var10004 = this.width / 2 - 100;
         int var10005 = this.height / 6 + 168 + 11 - 44;
         String[] var9 = field_968;
         var13.method_747(210, var10004, var10005, "Reset Video Settings...");
         var11.add(var13);
         var11 = this.buttonList;
         var13 = new bcb;
         var13.method_747(200, this.width / 2 - 100, this.height / 6 + 168 + 11, class_1450.method_7896("gui.done", new Object[0]));
         var11.add(var13);
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
         label44: {
            if(var10000 < 200) {
               var10000 = var1 instanceof class_141;
               if(var2 == null) {
                  break label44;
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
            this.field_557.canLoseFocus7.method_5358();
            class_183 var7 = new class_183;
            String[] var10003 = field_968;
            var7.method_969(this, "Reset all video settings to their default values?", "", 9999);
            class_183 var3 = var7;
            this.field_557.method_5236(var3);
         }

         var10000 = var1.field_450;
         var10001 = class_101.CLOUD_HEIGHT.ordinal();
      }

      if(var10000 != var10001) {
         class_1338 var8 = new class_1338;
         var8.method_7060(this.field_557, this.field_557.cursorCounter2, this.field_557.cursorCounter3);
         class_1338 var6 = var8;
         int var4 = var6.method_7061();
         int var5 = var6.method_7062();
         this.method_866(this.field_557, var4, var5);
      }

   }

   // $FF: renamed from: a (boolean, int) void
   public void method_160(boolean var1, int var2) {
      String[] var3 = class_752.method_4253();
      if(var3 != null) {
         if(var1) {
            this.field_557.canLoseFocus7.resetSettings();
         }

         this.field_557.method_5236(this);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      String[] var10000 = class_752.method_4253();
      this.drawCenteredString(this.fontRendererObj, this.title, this.width / 2, 20, 16777215);
      String[] var4 = var10000;
      super.drawScreen(var1, var2, var3);
      if(var4 != null) {
         if(Math.abs(var1 - this.lastMouseX) <= 5) {
            label57: {
               int var15 = Math.abs(var2 - this.lastMouseY);
               if(var4 != null) {
                  if(var15 > 5) {
                     break label57;
                  }

                  var15 = 700;
               }

               int var5 = var15;
               long var16;
               var15 = (var16 = System.currentTimeMillis() - (this.mouseStillTime + (long)var5)) == 0L?0:(var16 < 0L?-1:1);
               if(var4 != null) {
                  if(var15 < 0) {
                     return;
                  }

                  var15 = this.width / 2 - 150;
               }

               int var6 = var15;
               int var7 = this.height / 6 - 5;
               var15 = var2;
               int var10001 = var7 + 98;
               if(var4 != null) {
                  if(var2 <= var10001) {
                     var7 += 105;
                  }

                  var15 = var6 + 150;
                  var10001 = 150;
               }

               int var8 = var15 + var10001;
               int var9 = var7 + 84 + 10;
               bcb var10 = this.getSelectedButton(var1, var2);
               if(var10 != null) {
                  String var11 = this.getButtonName(var10.field_449);
                  String[] var12 = this.getTooltipLines(var11);
                  if(var4 != null) {
                     if(var12 == null) {
                        return;
                     }

                     this.drawGradientRect(var6, var7, var8, var9, -536870912, -536870912);
                  }

                  int var13 = 0;

                  while(var13 < var12.length) {
                     String var14 = var12[var13];
                     this.fontRendererObj.drawStringWithShadow(var14, var6 + 5, var7 + 5 + var13 * 11, 14540253);
                     ++var13;
                     if(var4 == null) {
                        break;
                     }
                  }
               }

               return;
            }
         }

         this.lastMouseX = var1;
         this.lastMouseY = var2;
         this.mouseStillTime = System.currentTimeMillis();
      }

   }

   private String[] getTooltipLines(String var1) {
      String[] var2 = class_752.method_4253();
      String[] var3 = field_968;
      byte var10000 = var1.equals("Autosave");
      if(var2 != null) {
         if(var10000 != 0) {
            return new String[]{"Autosave interval", "Default autosave interval (2s) is NOT RECOMMENDED.", "Autosave causes the famous Lag Spike of Death."};
         }

         var3 = field_968;
         var10000 = var1.equals("Lagometer");
      }

      String[] var4;
      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[8];
            var3 = field_968;
            var4[0] = "Lagometer";
            var4[1] = " OFF - no lagometer, faster";
            var4[2] = " ON - debug screen with lagometer, slower";
            var4[3] = "Shows the lagometer on the debug screen (F3).";
            var4[4] = "* White - tick";
            var4[5] = "* Red - chunk loading";
            var4[6] = "* Green - frame rendering + internal server";
            var4[7] = "* Blue - internal server (when Smooth World is ON)";
            return var4;
         }

         var3 = field_968;
         var10000 = var1.equals("Debug Profiler");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_968;
            var4[0] = "Debug Profiler";
            var4[1] = "  ON - debug profiler is active, slower";
            var4[2] = "  OFF - debug profiler is not active, faster";
            var4[3] = "The debug profiler collects and shows debug information";
            var4[4] = "when the debug screen is open (F3)";
            return var4;
         }

         var3 = field_968;
         var10000 = var1.equals("Time");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_968;
            var4[0] = "Time";
            var4[1] = " Default - normal day/night cycles";
            var4[2] = " Day Only - day only";
            var4[3] = " Night Only - night only";
            var4[4] = "The time setting is only effective in CREATIVE mode";
            var4[5] = "and for local worlds.";
            return var4;
         }

         var3 = field_968;
         var10000 = var1.equals("Weather");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_968;
            var4[0] = "Weather";
            var4[1] = "  ON - weather is active, slower";
            var4[2] = "  OFF - weather is not active, faster";
            var4[3] = "The weather controls rain, snow and thunderstorms.";
            var4[4] = "Weather control is only possible for local worlds.";
            return var4;
         }

         var3 = field_968;
         var10000 = var1.equals("Fullscreen");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_968;
            var4[0] = "Fullscreen";
            var4[1] = "  ON - use fullscreen mode";
            var4[2] = "  OFF - use window mode";
            var4[3] = "Fullscreen mode may be faster or slower than";
            var4[4] = "window mode, depending on the graphics card.";
            return var4;
         }

         var3 = field_968;
         var10000 = var1.equals("Fullscreen Mode");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_968;
            var4[0] = "Fullscreen mode";
            var4[1] = "  Default - use desktop screen resolution, slower";
            var4[2] = "  WxH - use custom screen resolution, may be faster";
            var4[3] = "The selected resolution is used in fullscreen mode (F11).";
            var4[4] = "Lower resolutions should generally be faster.";
            return var4;
         }

         var3 = field_968;
         var10000 = var1.equals("3D Anaglyph");
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return null;
         }

         var10000 = 1;
      }

      var4 = new String[var10000];
      String[] var10003 = field_968;
      var4[0] = "3D mode used with red-cyan 3D glasses.";
      return var4;
   }

   private String getButtonName(String var1) {
      int var2 = var1.indexOf(58);
      return var2 < 0?var1:var1.substring(0, var2);
   }

   private bcb getSelectedButton(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < this.buttonList.size()) {
         bcb var5;
         int var9;
         label52: {
            label60: {
               var5 = (bcb)this.buttonList.get(var4);
               int var6 = GuiVideoSettings.getButtonWidth(var5);
               int var7 = GuiVideoSettings.getButtonHeight(var5);
               var9 = var1;
               int var10001 = var5.field_447;
               if(var3 != null) {
                  if(var1 < var5.field_447) {
                     break label60;
                  }

                  var9 = var2;
                  var10001 = var5.field_448;
               }

               if(var3 != null) {
                  if(var9 < var10001) {
                     break label60;
                  }

                  var9 = var1;
                  var10001 = var5.field_447 + var6;
               }

               if(var3 != null) {
                  if(var9 >= var10001) {
                     break label60;
                  }

                  var9 = var2;
                  if(var3 == null) {
                     break label52;
                  }

                  var10001 = var5.field_448 + var7;
               }

               if(var9 < var10001) {
                  var9 = 1;
                  break label52;
               }
            }

            var9 = 0;
         }

         int var8 = var9;
         if(var3 != null) {
            if(var8 != 0) {
               return var5;
            }

            ++var4;
         }

         if(var3 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1137() {
      // $FF: Couldn't be decompiled
   }
}

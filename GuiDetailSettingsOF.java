import java.util.List;

public class GuiDetailSettingsOF extends GuiScreen {

   private GuiScreen prevScreen;
   protected String title;
   private GameSettings settings;
   private static class_101[] enumOptions;
   private int lastMouseX;
   private int lastMouseY;
   private long mouseStillTime;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_969;


   // $FF: renamed from: <init> (GuiScreen, bbj) void
   public void GuiDetailSettingsOF(GuiScreen var1, GameSettings var2) {
      super.method_651();
      this.lastMouseX = 0;
      this.lastMouseY = 0;
      this.mouseStillTime = 0L;
      String[] var10001 = field_969;
      this.title = "Detail Settings";
      this.prevScreen = var1;
      this.settings = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      int var2 = 0;
      class_101[] var3 = enumOptions;
      String[] var10000 = class_752.method_4253();
      int var4 = var3.length;
      int var5 = 0;
      String[] var1 = var10000;

      while(true) {
         List var10;
         if(var5 < var4) {
            class_101 var6 = var3[var5];
            int var7 = this.width / 2 - 155 + var2 % 2 * 160;
            int var8 = this.height / 6 + 21 * (var2 / 2) - 10;
            boolean var9 = var6.method_467();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               label21: {
                  if(!var9) {
                     var10 = this.buttonList;
                     class_141 var10001 = new class_141;
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
         int var10004 = this.width / 2 - 100;
         int var10005 = this.height / 6 + 168 + 11;
         String[] var10006 = field_969;
         var12.method_747(200, var10004, var10005, class_1450.method_7896("gui.done", new Object[0]));
         var10.add(var12);
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
         label36: {
            if(var10000 < 200) {
               var10000 = var1 instanceof class_141;
               if(var2 == null) {
                  break label36;
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
      String[] var10000 = class_752.method_4253();
      this.method_873();
      String[] var4 = var10000;
      this.drawCenteredString(this.fontRendererObj, this.title, this.width / 2, 20, 16777215);
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
      String[] var3 = field_969;
      byte var10000 = var1.equals("Clouds");
      if(var2 != null) {
         if(var10000 != 0) {
            return new String[]{"Clouds", "  Default - as set by setting Graphics", "  Fast - lower quality, faster", "  Fancy - higher quality, slower", "  OFF - no clouds, fastest", "Fast clouds are rendered 2D.", "Fancy clouds are rendered 3D."};
         }

         var3 = field_969;
         var10000 = var1.equals("Cloud Height");
      }

      String[] var4;
      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[3];
            var3 = field_969;
            var4[0] = "Cloud Height";
            var4[1] = "  OFF - default height";
            var4[2] = "  100% - above world height limit";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Trees");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_969;
            var4[0] = "Trees";
            var4[1] = "  Default - as set by setting Graphics";
            var4[2] = "  Fast - lower quality, faster";
            var4[3] = "  Fancy - higher quality, slower";
            var4[4] = "Fast trees have opaque leaves.";
            var4[5] = "Fancy trees have transparent leaves.";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Grass");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_969;
            var4[0] = "Grass";
            var4[1] = "  Default - as set by setting Graphics";
            var4[2] = "  Fast - lower quality, faster";
            var4[3] = "  Fancy - higher quality, slower";
            var4[4] = "Fast grass uses default side texture.";
            var4[5] = "Fancy grass uses biome side texture.";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Dropped Items");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[4];
            var3 = field_969;
            var4[0] = "Dropped Items";
            var4[1] = "  Default - as set by setting Graphics";
            var4[2] = "  Fast - 2D dropped items, faster";
            var4[3] = "  Fancy - 3D dropped items, slower";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Water");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_969;
            var4[0] = "Water";
            var4[1] = "  Default - as set by setting Graphics";
            var4[2] = "  Fast  - lower quality, faster";
            var4[3] = "  Fancy - higher quality, slower";
            var4[4] = "Fast water (1 pass) has some visual artifacts";
            var4[5] = "Fancy water (2 pass) has no visual artifacts";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Rain & Snow");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[7];
            var3 = field_969;
            var4[0] = "Rain & Snow";
            var4[1] = "  Default - as set by setting Graphics";
            var4[2] = "  Fast  - light rain/snow, faster";
            var4[3] = "  Fancy - heavy rain/snow, slower";
            var4[4] = "  OFF - no rain/snow, fastest";
            var4[5] = "When rain is OFF the splashes and rain sounds";
            var4[6] = "are still active.";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Sky");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[4];
            var3 = field_969;
            var4[0] = "Sky";
            var4[1] = "  ON - sky is visible, slower";
            var4[2] = "  OFF  - sky is not visible, faster";
            var4[3] = "When sky is OFF the moon and sun are still visible.";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Sun & Moon");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[3];
            var3 = field_969;
            var4[0] = "Sun & Moon";
            var4[1] = "  ON - sun and moon are visible (default)";
            var4[2] = "  OFF  - sun and moon are not visible (faster)";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Stars");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[3];
            var3 = field_969;
            var4[0] = "Stars";
            var4[1] = "  ON - stars are visible, slower";
            var4[2] = "  OFF  - stars are not visible, faster";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Depth Fog");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[3];
            var3 = field_969;
            var4[0] = "Depth Fog";
            var4[1] = "  ON - fog moves closer at bedrock levels (default)";
            var4[2] = "  OFF - same fog at all levels";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Show Capes");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[3];
            var3 = field_969;
            var4[0] = "Show Capes";
            var4[1] = "  ON - show player capes (default)";
            var4[2] = "  OFF - do not show player capes";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Held Item Tooltips");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[3];
            var3 = field_969;
            var4[0] = "Held item tooltips";
            var4[1] = "  ON - show tooltips for held items (default)";
            var4[2] = "  OFF - do not show tooltips for held items";
            return var4;
         }

         var3 = field_969;
         var10000 = var1.equals("Translucent Blocks");
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return null;
         }

         var10000 = 6;
      }

      var4 = new String[var10000];
      var3 = field_969;
      var4[0] = "Translucent Blocks";
      var4[1] = "  Fancy - correct color blending (default)";
      var4[2] = "  Fast - fast color blending (faster)";
      var4[3] = "Controls the color blending of translucent blocks";
      var4[4] = "with different color (stained glass, water, ice)";
      var4[5] = "when placed behind each other with air between them.";
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
   static void method_1139() {
      // $FF: Couldn't be decompiled
   }
}

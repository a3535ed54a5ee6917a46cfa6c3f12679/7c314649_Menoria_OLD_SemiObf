import java.util.List;

public class GuiQualitySettingsOF extends bdw {

   private bdw prevScreen;
   protected String title;
   private bbj settings;
   private static class_101[] enumOptions;
   private int lastMouseX;
   private int lastMouseY;
   private long mouseStillTime;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_990;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_1149(bdw var1, bbj var2) {
      super.method_651();
      this.lastMouseX = 0;
      this.lastMouseY = 0;
      this.mouseStillTime = 0L;
      String[] var10001 = field_990;
      this.title = "Quality Settings";
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
         String[] var10006 = field_990;
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
      this.drawCenteredString(this.fontRendererObj, this.title, this.width / 2, 20, 16777215);
      super.drawScreen(var1, var2, var3);
      String[] var4 = var10000;
      if(var4 != null) {
         if(Math.abs(var1 - this.lastMouseX) <= 5) {
            label65: {
               int var16 = Math.abs(var2 - this.lastMouseY);
               if(var4 != null) {
                  if(var16 > 5) {
                     break label65;
                  }

                  var16 = 700;
               }

               int var5 = var16;
               long var18;
               var16 = (var18 = System.currentTimeMillis() - (this.mouseStillTime + (long)var5)) == 0L?0:(var18 < 0L?-1:1);
               if(var4 != null) {
                  if(var16 < 0) {
                     return;
                  }

                  var16 = this.width / 2 - 150;
               }

               int var6 = var16;
               int var7 = this.height / 6 - 5;
               var16 = var2;
               int var10001 = var7 + 98;
               if(var4 != null) {
                  if(var2 <= var10001) {
                     var7 += 105;
                  }

                  var16 = var6 + 150;
                  var10001 = 150;
               }

               int var8 = var16 + var10001;
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
                     int var15 = 14540253;
                     boolean var17 = var14.endsWith("!");
                     if(var4 != null) {
                        if(var17) {
                           var15 = 16719904;
                        }

                        this.fontRendererObj.drawStringWithShadow(var14, var6 + 5, var7 + 5 + var13 * 11, var15);
                     }

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
      String[] var3 = field_990;
      byte var10000 = var1.equals("Mipmap Levels");
      if(var2 != null) {
         if(var10000 != 0) {
            return new String[]{"Visual effect which makes distant objects look better", "by smoothing the texture details", "  OFF - no smoothing", "  1 - minimum smoothing", "  4 - maximum smoothing", "This option usually does not affect the performance."};
         }

         var3 = field_990;
         var10000 = var1.equals("Mipmap Type");
      }

      String[] var4;
      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_990;
            var4[0] = "Visual effect which makes distant objects look better";
            var4[1] = "by smoothing the texture details";
            var4[2] = "  Nearest - rough smoothing";
            var4[3] = "  Linear - fine smoothing";
            var4[4] = "This option usually does not affect the performance.";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Anisotropic Filtering");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_990;
            var4[0] = "Anisotropic Filtering";
            var4[1] = " OFF - (default) standard texture detail (faster)";
            var4[2] = " 2-16 - finer details in mipmapped textures (slower)";
            var4[3] = "The Anisotropic Filtering restores details in mipmapped";
            var4[4] = "textures. Higher values may decrease the FPS.";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Antialiasing");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[8];
            var3 = field_990;
            var4[0] = "Antialiasing";
            var4[1] = " OFF - (default) no antialiasing (faster)";
            var4[2] = " 2-16 - antialiased lines and edges (slower)";
            var4[3] = "The Antialiasing smooths jagged lines and ";
            var4[4] = "sharp color transitions.";
            var4[5] = "Higher values may substantially decrease the FPS.";
            var4[6] = "Not all levels are supported by all graphics cards.";
            var4[7] = "Effective after a RESTART!";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Clear Water");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[3];
            var3 = field_990;
            var4[0] = "Clear Water";
            var4[1] = "  ON - clear, transparent water";
            var4[2] = "  OFF - default water";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Better Grass");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[4];
            var3 = field_990;
            var4[0] = "Better Grass";
            var4[1] = "  OFF - default side grass texture, fastest";
            var4[2] = "  Fast - full side grass texture, slower";
            var4[3] = "  Fancy - dynamic side grass texture, slowest";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Better Snow");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_990;
            var4[0] = "Better Snow";
            var4[1] = "  OFF - default snow, faster";
            var4[2] = "  ON - better snow, slower";
            var4[3] = "Shows snow under transparent blocks (fence, tall grass)";
            var4[4] = "when bordering with snow blocks";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Random Mobs");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_990;
            var4[0] = "Random Mobs";
            var4[1] = "  OFF - no random mobs, faster";
            var4[2] = "  ON - random mobs, slower";
            var4[3] = "Random mobs uses random textures for the game creatures.";
            var4[4] = "It needs a texture pack which has multiple mob textures.";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Swamp Colors");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[4];
            var3 = field_990;
            var4[0] = "Swamp Colors";
            var4[1] = "  ON - use swamp colors (default), slower";
            var4[2] = "  OFF - do not use swamp colors, faster";
            var4[3] = "The swamp colors affect grass, leaves, vines and water.";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Smooth Biomes");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_990;
            var4[0] = "Smooth Biomes";
            var4[1] = "  ON - smoothing of biome borders (default), slower";
            var4[2] = "  OFF - no smoothing of biome borders, faster";
            var4[3] = "The smoothing of biome borders is done by sampling and";
            var4[4] = "averaging the color of all surrounding blocks.";
            var4[5] = "Affected are grass, leaves, vines and water.";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Custom Fonts");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_990;
            var4[0] = "Custom Fonts";
            var4[1] = "  ON - uses custom fonts (default), slower";
            var4[2] = "  OFF - uses default font, faster";
            var4[3] = "The custom fonts are supplied by the current";
            var4[4] = "texture pack";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Custom Colors");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_990;
            var4[0] = "Custom Colors";
            var4[1] = "  ON - uses custom colors (default), slower";
            var4[2] = "  OFF - uses default colors, faster";
            var4[3] = "The custom colors are supplied by the current";
            var4[4] = "texture pack";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Show Capes");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[3];
            var3 = field_990;
            var4[0] = "Show Capes";
            var4[1] = "  ON - show player capes (default)";
            var4[2] = "  OFF - do not show player capes";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Connected Textures");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[8];
            var3 = field_990;
            var4[0] = "Connected Textures";
            var4[1] = "  OFF - no connected textures (default)";
            var4[2] = "  Fast - fast connected textures";
            var4[3] = "  Fancy - fancy connected textures";
            var4[4] = "Connected textures joins the textures of glass,";
            var4[5] = "sandstone and bookshelves when placed next to";
            var4[6] = "each other. The connected textures are supplied";
            var4[7] = "by the current texture pack.";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Far View");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[7];
            var3 = field_990;
            var4[0] = "Far View";
            var4[1] = " OFF - (default) standard view distance";
            var4[2] = " ON - 3x view distance";
            var4[3] = "Far View is very resource demanding!";
            var4[4] = "3x view distance => 9x chunks to be loaded => FPS / 9";
            var4[5] = "Standard view distances: 32, 64, 128, 256";
            var4[6] = "Far view distances: 96, 192, 384, 512";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Natural Textures");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[8];
            var3 = field_990;
            var4[0] = "Natural Textures";
            var4[1] = "  OFF - no natural textures (default)";
            var4[2] = "  ON - use natural textures";
            var4[3] = "Natural textures remove the gridlike pattern";
            var4[4] = "created by repeating blocks of the same type.";
            var4[5] = "It uses rotated and flipped variants of the base";
            var4[6] = "block texture. The configuration for the natural";
            var4[7] = "textures is supplied by the current texture pack";
            return var4;
         }

         var3 = field_990;
         var10000 = var1.equals("Custom Sky");
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return null;
         }

         var10000 = 5;
      }

      var4 = new String[var10000];
      var3 = field_990;
      var4[0] = "Custom Sky";
      var4[1] = "  ON - custom sky textures (default), slow";
      var4[2] = "  OFF - default sky, faster";
      var4[3] = "The custom sky textures are supplied by the current";
      var4[4] = "texture pack";
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
   static void method_1150() {
      // $FF: Couldn't be decompiled
   }
}

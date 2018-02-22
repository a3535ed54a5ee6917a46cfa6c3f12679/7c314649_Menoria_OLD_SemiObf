import java.util.List;

public class GuiPerformanceSettingsOF extends bdw {

   private bdw prevScreen;
   protected String title;
   private bbj settings;
   private static class_101[] enumOptions;
   private int lastMouseX;
   private int lastMouseY;
   private long mouseStillTime;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_936;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_1116(bdw var1, bbj var2) {
      super.method_651();
      this.lastMouseX = 0;
      this.lastMouseY = 0;
      this.mouseStillTime = 0L;
      String[] var10001 = field_936;
      this.title = "Performance Settings";
      this.prevScreen = var1;
      this.settings = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;
      class_101[] var3 = enumOptions;
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
         String[] var10006 = field_936;
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
      String[] var3 = field_936;
      byte var10000 = var1.equals("Smooth FPS");
      if(var2 != null) {
         if(var10000 != 0) {
            return new String[]{"Stabilizes FPS by flushing the graphic driver buffers", "  OFF - no stabilization, FPS may fluctuate", "  ON - FPS stabilization", "This option is graphics driver dependant and its effect", "is not always visible"};
         }

         var3 = field_936;
         var10000 = var1.equals("Smooth World");
      }

      String[] var4;
      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_936;
            var4[0] = "Removes lag spikes caused by the internal server.";
            var4[1] = "  OFF - no stabilization, FPS may fluctuate";
            var4[2] = "  ON - FPS stabilization";
            var4[3] = "Stabilizes FPS by distributing the internal server load.";
            var4[4] = "Effective only for local worlds and single-core CPU.";
            return var4;
         }

         var3 = field_936;
         var10000 = var1.equals("Load Far");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_936;
            var4[0] = "Loads the world chunks at distance Far.";
            var4[1] = "Switching the render distance does not cause all chunks ";
            var4[2] = "to be loaded again.";
            var4[3] = "  OFF - world chunks loaded up to render distance";
            var4[4] = "  ON - world chunks loaded at distance Far, allows";
            var4[5] = "       fast render distance switching";
            return var4;
         }

         var3 = field_936;
         var10000 = var1.equals("Preloaded Chunks");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_936;
            var4[0] = "Defines an area in which no chunks will be loaded";
            var4[1] = "  OFF - after 5m new chunks will be loaded";
            var4[2] = "  2 - after 32m  new chunks will be loaded";
            var4[3] = "  8 - after 128m new chunks will be loaded";
            var4[4] = "Higher values need more time to load all the chunks";
            var4[5] = "and may decrease the FPS.";
            return var4;
         }

         var3 = field_936;
         var10000 = var1.equals("Chunk Updates");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_936;
            var4[0] = "Chunk updates";
            var4[1] = " 1 - (default) slower world loading, higher FPS";
            var4[2] = " 3 - faster world loading, lower FPS";
            var4[3] = " 5 - fastest world loading, lowest FPS";
            var4[4] = "Number of chunk updates per rendered frame,";
            var4[5] = "higher values may destabilize the framerate.";
            return var4;
         }

         var3 = field_936;
         var10000 = var1.equals("Dynamic Updates");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_936;
            var4[0] = "Dynamic chunk updates";
            var4[1] = " OFF - (default) standard chunk updates per frame";
            var4[2] = " ON - more updates while the player is standing still";
            var4[3] = "Dynamic updates force more chunk updates while";
            var4[4] = "the player is standing still to load the world faster.";
            return var4;
         }

         var3 = field_936;
         var10000 = var1.equals("Lazy Chunk Loading");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[7];
            var3 = field_936;
            var4[0] = "Lazy Chunk Loading";
            var4[1] = " OFF - default server chunk loading";
            var4[2] = " ON - lazy server chunk loading (smoother)";
            var4[3] = "Smooths the integrated server chunk loading by";
            var4[4] = "distributing the chunks over several ticks.";
            var4[5] = "Turn it OFF if parts of the world do not load correctly.";
            var4[6] = "Effective only for local worlds and single-core CPU.";
            return var4;
         }

         var3 = field_936;
         var10000 = var1.equals("Fast Math");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_936;
            var4[0] = "Fast Math";
            var4[1] = " OFF - standard math (default)";
            var4[2] = " ON - faster math";
            var4[3] = "Uses optimized sin() and cos() functions which can";
            var4[4] = "better utilize the CPU cache and increase the FPS.";
            return var4;
         }

         var3 = field_936;
         var10000 = var1.equals("Fast Render");
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return null;
         }

         var10000 = 7;
      }

      var4 = new String[var10000];
      var3 = field_936;
      var4[0] = "Fast Render";
      var4[1] = " OFF - standard rendering (default)";
      var4[2] = " ON - faster rendering";
      var4[3] = "Uses optimized rendering algorithm which decreases";
      var4[4] = "the GPU load and may substantionally increase the FPS.";
      var4[5] = "You can turn if OFF if you notice flickering textures";
      var4[6] = "on some blocks.";
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
   static void method_1117() {
      // $FF: Couldn't be decompiled
   }
}

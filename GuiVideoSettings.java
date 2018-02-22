import java.util.List;

// $FF: renamed from: lC
public class GuiVideoSettings extends bdw {

   // $FF: renamed from: b bdw
   private bdw field_860;
   // $FF: renamed from: i java.lang.String
   protected String field_861;
   // $FF: renamed from: r bbj
   private bbj field_862;
   // $FF: renamed from: s boolean
   private boolean field_863;
   // $FF: renamed from: t P[]
   private static class_101[] field_864;
   // $FF: renamed from: u int
   private int field_865;
   // $FF: renamed from: v int
   private int field_866;
   // $FF: renamed from: w long
   private long field_867;
   // $FF: renamed from: x java.lang.String
   private static final String field_868;
   // $FF: renamed from: y java.lang.String[]
   private static final String[] field_869;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_1073(bdw var1, bbj var2) {
      super.method_651();
      String[] var10001 = field_869;
      this.field_861 = "Video Settings";
      this.field_865 = 0;
      this.field_866 = 0;
      this.field_867 = 0L;
      this.field_860 = var1;
      this.field_862 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var14 = field_869;
      this.field_861 = class_1450.method_7896("options.videoTitle", new Object[0]);
      String[] var1 = class_752.method_4253();
      this.buttonList.clear();
      this.field_863 = false;
      String[] var2 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
      String[] var3 = var2;
      int var4 = var2.length;
      int var5 = 0;

      while(true) {
         if(var5 < var4) {
            label66: {
               String var6 = var3[var5];
               String var7 = System.getProperty(var6);
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  if(var7 != null) {
                     var14 = field_869;
                     if(var7.contains("64")) {
                        this.field_863 = true;
                        if(var1 != null) {
                           break label66;
                        }
                     }
                  }

                  ++var5;
               }

               if(var1 != null) {
                  continue;
               }
            }
         }

         boolean var15 = false;
         break;
      }

      boolean var10000 = this.field_863;
      if(var1 != null) {
         var10000 = !this.field_863;
      }

      class_101[] var16 = field_864;
      int var8 = var16.length;
      boolean var9 = false;
      int var11 = 0;

      int var10;
      int var19;
      List var20;
      class_141 var21;
      while(true) {
         if(var11 < var8) {
            class_101 var12 = var16[var11];
            var10 = this.width / 2 - 155 + var11 % 2 * 160;
            int var13 = this.height / 6 + 21 * (var11 / 2) - 10;
            var19 = var12.method_467();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               label39: {
                  if(var19 != 0) {
                     var20 = this.buttonList;
                     class_152 var10001 = new class_152;
                     var10001.method_782(var12.method_469(), var10, var13, var12);
                     var20.add(var10001);
                     if(var1 != null) {
                        break label39;
                     }
                  }

                  var20 = this.buttonList;
                  var21 = new class_141;
                  var21.method_760(var12.method_469(), var10, var13, var12, this.field_862.method_5355(var12));
                  var20.add(var21);
               }
            }

            ++var11;
            if(var1 != null) {
               continue;
            }
         }

         var19 = this.height / 6 + 21 * (var11 / 2) - 10;
         break;
      }

      int var17 = var19;
      boolean var18 = false;
      var10 = this.width / 2 - 155 + 160;
      var20 = this.buttonList;
      var21 = new class_141;
      var14 = field_869;
      var21.method_747(202, var10, var17, "Quality...");
      var20.add(var21);
      var17 += 21;
      var10 = this.width / 2 - 155 + 0;
      var20 = this.buttonList;
      var21 = new class_141;
      var21.method_747(201, var10, var17, "Details...");
      var20.add(var21);
      var10 = this.width / 2 - 155 + 160;
      var20 = this.buttonList;
      var21 = new class_141;
      var21.method_747(212, var10, var17, "Performance...");
      var20.add(var21);
      var17 += 21;
      var10 = this.width / 2 - 155 + 0;
      var20 = this.buttonList;
      var21 = new class_141;
      var21.method_747(211, var10, var17, "Animations...");
      var20.add(var21);
      var10 = this.width / 2 - 155 + 160;
      var20 = this.buttonList;
      var21 = new class_141;
      var21.method_747(222, var10, var17, "Other...");
      var20.add(var21);
      var20 = this.buttonList;
      bcb var22 = new bcb;
      var22.method_747(200, this.width / 2 - 100, this.height / 6 + 168 + 11, class_1450.method_7896("gui.done", new Object[0]));
      var20.add(var22);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_451;
      if(var2 != null) {
         if(!var1.field_451) {
            return;
         }

         var10000 = this.field_862.field_4573;
      }

      int var3 = var10000;
      var10000 = var1.field_450;
      int var10001 = 200;
      if(var2 != null) {
         label79: {
            if(var1.field_450 < 200) {
               var10000 = var1 instanceof class_141;
               if(var2 == null) {
                  break label79;
               }

               if(var10000 != 0) {
                  this.field_862.method_5351(((class_141)var1).method_761(), 1);
                  var1.field_449 = this.field_862.method_5355(class_101.method_464(var1.field_450));
               }
            }

            var10000 = var1.field_450;
         }

         var10001 = 200;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            this.field_557.method_5236(this.field_860);
         }

         var10000 = this.field_862.field_4573;
         var10001 = var3;
      }

      if(var2 != null) {
         if(var10000 != var10001) {
            class_1338 var16 = new class_1338;
            var16.method_7060(this.field_557, this.field_557.cursorCounter2, this.field_557.cursorCounter3);
            class_1338 var4 = var16;
            int var5 = var4.method_7061();
            int var6 = var4.method_7062();
            this.method_866(this.field_557, var5, var6);
         }

         var10000 = var1.field_450;
         var10001 = 201;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            GuiDetailSettingsOF var17 = new GuiDetailSettingsOF;
            var17.GuiDetailSettingsOF(this, this.field_862);
            GuiDetailSettingsOF var11 = var17;
            this.field_557.method_5236(var11);
         }

         var10000 = var1.field_450;
         var10001 = 202;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            GuiQualitySettingsOF var7 = new GuiQualitySettingsOF;
            var7.method_1149(this, this.field_862);
            GuiQualitySettingsOF var12 = var7;
            this.field_557.method_5236(var12);
         }

         var10000 = var1.field_450;
         var10001 = 211;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            GuiAnimationSettingsOF var8 = new GuiAnimationSettingsOF;
            var8.method_1140(this, this.field_862);
            GuiAnimationSettingsOF var13 = var8;
            this.field_557.method_5236(var13);
         }

         var10000 = var1.field_450;
         var10001 = 212;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            GuiPerformanceSettingsOF var9 = new GuiPerformanceSettingsOF;
            var9.method_1116(this, this.field_862);
            GuiPerformanceSettingsOF var14 = var9;
            this.field_557.method_5236(var14);
         }

         var10000 = var1.field_450;
         var10001 = 222;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            GuiOtherSettingsOF var10 = new GuiOtherSettingsOF;
            var10.method_1136(this, this.field_862);
            GuiOtherSettingsOF var15 = var10;
            this.field_557.method_5236(var15);
         }

         var10000 = var1.field_450;
         var10001 = class_101.AO_LEVEL.ordinal();
      }

      if(var10000 != var10001) {
         ;
      }
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var10000 = class_752.method_4253();
      this.method_873();
      String[] var4 = var10000;
      int var10003 = this.width / 2;
      int var10004 = this.field_863;
      if(var4 != null) {
         var10004 = this.field_863?20:5;
      }

      label84: {
         this.drawCenteredString(this.fontRendererObj, this.field_861, var10003, var10004, 16777215);
         int var15 = this.field_863;
         if(var4 != null) {
            if(!this.field_863 && this.field_862.field_4487 > 8) {
               ;
            }

            super.drawScreen(var1, var2, var3);
            if(var4 == null) {
               break label84;
            }

            var15 = Math.abs(var1 - this.field_865);
         }

         if(var15 <= 5) {
            label86: {
               var15 = Math.abs(var2 - this.field_866);
               if(var4 != null) {
                  if(var15 > 5) {
                     break label86;
                  }

                  var15 = 700;
               }

               label87: {
                  int var5 = var15;
                  long var16;
                  var15 = (var16 = System.currentTimeMillis() - (this.field_867 + (long)var5)) == 0L?0:(var16 < 0L?-1:1);
                  if(var4 != null) {
                     if(var15 < 0) {
                        break label87;
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
                  bcb var10 = this.method_1076(var1, var2);
                  if(var10 != null) {
                     String var11 = this.method_1075(var10.field_449);
                     String[] var12 = this.method_1074(var11);
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
                           return;
                        }

                        if(var4 == null) {
                           break;
                        }
                     }
                  }
               }

               if(var4 != null) {
                  return;
               }
            }
         }

         this.field_865 = var1;
         this.field_866 = var2;
      }

      this.field_867 = System.currentTimeMillis();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String[]
   private String[] method_1074(String var1) {
      String[] var2 = class_752.method_4253();
      String[] var3 = field_869;
      byte var10000 = var1.equals("Graphics");
      String[] var4;
      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[]{"Visual quality", "  Fast  - lower quality, faster", "  Fancy - higher quality, slower", "Changes the appearance of clouds, leaves, water,", "shadows and grass sides."};
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("Render Distance");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[8];
            var3 = field_869;
            var4[0] = "Visible distance";
            var4[1] = "  2 Tiny - 32m (fastest)";
            var4[2] = "  4 Short - 64m (faster)";
            var4[3] = "  8 Normal - 128m";
            var4[4] = "  16 Far - 256m (slower)";
            var4[5] = "  32 Extreme - 512m (slowest!)";
            var4[6] = "The Extreme view distance is very resource demanding!";
            var4[7] = "Values over 16 Far are only effective in local worlds.";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("Smooth Lighting");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[4];
            var3 = field_869;
            var4[0] = "Smooth lighting";
            var4[1] = "  OFF - no smooth lighting (faster)";
            var4[2] = "  Minimum - simple smooth lighting (slower)";
            var4[3] = "  Maximum - complex smooth lighting (slowest)";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("Smooth Lighting Level");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[4];
            var3 = field_869;
            var4[0] = "Smooth lighting level";
            var4[1] = "  OFF - no smooth lighting (faster)";
            var4[2] = "  1% - light smooth lighting (slower)";
            var4[3] = "  100% - dark smooth lighting (slower)";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("Max Framerate");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_869;
            var4[0] = "Max framerate";
            var4[1] = "  VSync - limit to monitor framerate (60, 30, 20)";
            var4[2] = "  5-255 - variable";
            var4[3] = "  Unlimited - no limit (fastest)";
            var4[4] = "The framerate limit decreases the FPS even if";
            var4[5] = "the limit value is not reached.";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("View Bobbing");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[2];
            var3 = field_869;
            var4[0] = "More realistic movement.";
            var4[1] = "When using mipmaps set it to OFF for best results.";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("GUI Scale");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[2];
            var3 = field_869;
            var4[0] = "GUI Scale";
            var4[1] = "Smaller GUI might be faster";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("Server Textures");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[2];
            var3 = field_869;
            var4[0] = "Server textures";
            var4[1] = "Use the resource pack recommended by the server";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("Advanced OpenGL");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_869;
            var4[0] = "Detect and render only visible geometry";
            var4[1] = "  OFF - all geometry is rendered (slower)";
            var4[2] = "  Fast - only visible geometry is rendered (fastest)";
            var4[3] = "  Fancy - conservative, avoids visual artifacts (faster)";
            var4[4] = "The option is available only if it is supported by the ";
            var4[5] = "graphic card.";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("Fog");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[6];
            var3 = field_869;
            var4[0] = "Fog type";
            var4[1] = "  Fast - faster fog";
            var4[2] = "  Fancy - slower fog, looks better";
            var4[3] = "  OFF - no fog, fastest";
            var4[4] = "The fancy fog is available only if it is supported by the ";
            var4[5] = "graphic card.";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("Fog Start");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[4];
            var3 = field_869;
            var4[0] = "Fog start";
            var4[1] = "  0.2 - the fog starts near the player";
            var4[2] = "  0.8 - the fog starts far from the player";
            var4[3] = "This option usually does not affect the performance.";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("Brightness");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var4 = new String[5];
            var3 = field_869;
            var4[0] = "Increases the brightness of darker objects";
            var4[1] = "  OFF - standard brightness";
            var4[2] = "  100% - maximum brightness for darker objects";
            var4[3] = "This options does not change the brightness of ";
            var4[4] = "fully black objects";
            return var4;
         }

         var3 = field_869;
         var10000 = var1.equals("Chunk Loading");
      }

      if(var2 != null) {
         if(var10000 == 0) {
            var4 = null;
            return var4;
         }

         var10000 = 8;
      }

      var4 = new String[var10000];
      var3 = field_869;
      var4[0] = "Chunk Loading";
      var4[1] = "  Default - unstable FPS when loading chunks";
      var4[2] = "  Smooth - stable FPS";
      var4[3] = "  Multi-Core - stable FPS, 3x faster world loading";
      var4[4] = "Smooth and Multi-Core remove the stuttering and ";
      var4[5] = "freezes caused by chunk loading.";
      var4[6] = "Multi-Core can speed up 3x the world loading and";
      var4[7] = "increase FPS by using a second CPU core.";
      return var4;
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   private String method_1075(String var1) {
      int var2 = var1.indexOf(58);
      return var2 < 0?var1:var1.substring(0, var2);
   }

   // $FF: renamed from: a (int, int) bcb
   private bcb method_1076(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < this.buttonList.size()) {
         bcb var5;
         int var7;
         label52: {
            label60: {
               var5 = (bcb)this.buttonList.get(var4);
               var7 = var1;
               int var10001 = var5.field_447;
               if(var3 != null) {
                  if(var1 < var5.field_447) {
                     break label60;
                  }

                  var7 = var2;
                  var10001 = var5.field_448;
               }

               if(var3 != null) {
                  if(var7 < var10001) {
                     break label60;
                  }

                  var7 = var1;
                  var10001 = var5.field_447 + var5.field_445;
               }

               if(var3 != null) {
                  if(var7 >= var10001) {
                     break label60;
                  }

                  var7 = var2;
                  if(var3 == null) {
                     break label52;
                  }

                  var10001 = var5.field_448 + var5.field_446;
               }

               if(var7 < var10001) {
                  var7 = 1;
                  break label52;
               }
            }

            var7 = 0;
         }

         int var6 = var7;
         if(var3 != null) {
            if(var6 != 0) {
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

   // $FF: renamed from: b (bcb) int
   public static int getButtonWidth(bcb var0) {
      return var0.field_445;
   }

   // $FF: renamed from: c (bcb) int
   public static int getButtonHeight(bcb var0) {
      return var0.field_446;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1079() {
      // $FF: Couldn't be decompiled
   }
}

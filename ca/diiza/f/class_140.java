package ca.diiza.f;

import ca.diiza.f.class_209;

// $FF: renamed from: ca.diiza.f.m
public class class_140 extends GuiTextField {

   // $FF: renamed from: <init> (kU, int, int, int, int) void
   public void GuiTextField(FontRenderer var1, int var2, int var3, int var4, int var5) {
      super.GuiTextField(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: g () void
   public void drawTextBox() {
      int var1 = class_209.method_1160();
      boolean var10000 = this.getVisible();
      if(var1 == 0) {
         if(!var10000) {
            return;
         }

         var10000 = this.getEnableBackgroundDrawing();
      }

      class_140 var15;
      int var16;
      label205: {
         label214: {
            if(var1 == 0) {
               if(var10000) {
                  drawRect(this.xPosition - 1, this.yPosition - 1, this.xPosition + this.width + 1, this.yPosition + this.height + 1, -6250336);
                  drawRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, -16777216);
               }

               var15 = this;
               if(var1 != 0) {
                  break label214;
               }

               var10000 = this.isEnabled;
            }

            if(var10000) {
               var16 = this.enabledColor;
               break label205;
            }

            var15 = this;
         }

         var16 = var15.disabledColor;
      }

      int var2;
      int var3;
      int var4;
      String var5;
      label194: {
         label216: {
            var2 = var16;
            var3 = this.cursorPosition - this.lineScrollOffset;
            var4 = this.selectionEnd - this.lineScrollOffset;
            var5 = this.fontRendererInstance.trimStringToWidth(this.text.substring(this.lineScrollOffset), this.getWidth());
            var16 = var3;
            if(var1 == 0) {
               if(var3 < 0) {
                  break label216;
               }

               var16 = var3;
            }

            if(var1 != 0) {
               break label194;
            }

            if(var16 <= var5.length()) {
               var16 = 1;
               break label194;
            }
         }

         var16 = 0;
      }

      int var6;
      label183: {
         label217: {
            var6 = var16;
            var16 = this.isFocused;
            if(var1 == 0) {
               if(!this.isFocused) {
                  break label217;
               }

               var16 = this.cursorCounter / 6 % 2;
            }

            if(var1 == 0) {
               if(var16 != 0) {
                  break label217;
               }

               var16 = var6;
            }

            if(var1 != 0) {
               break label183;
            }

            if(var16 != 0) {
               var16 = 1;
               break label183;
            }
         }

         var16 = 0;
      }

      int var7;
      label167: {
         var7 = var16;
         var15 = this;
         if(var1 == 0) {
            if(this.enableBackgroundDrawing) {
               var16 = this.xPosition + 4;
               break label167;
            }

            var15 = this;
         }

         var16 = var15.xPosition;
      }

      int var8;
      label161: {
         var8 = var16;
         var15 = this;
         if(var1 == 0) {
            if(this.enableBackgroundDrawing) {
               var16 = this.yPosition + (this.height - 8) / 2;
               break label161;
            }

            var15 = this;
         }

         var16 = var15.yPosition;
      }

      int var9 = var16;
      int var10 = var8;
      var5 = var5.replaceAll(".", "*");
      var16 = var4;
      if(var1 == 0) {
         if(var4 > var5.length()) {
            var4 = var5.length();
         }

         var16 = var5.length();
      }

      if(var1 == 0) {
         if(var16 > 0) {
            String var11 = var6 != 0?var5.substring(0, var3):var5;
            var10 = this.fontRendererInstance.drawStringWithShadow(var11, var8, var9, var2);
         }

         var16 = this.cursorPosition;
      }

      if(var1 == 0) {
         label151: {
            if(var16 >= this.text.length()) {
               var16 = this.text.length();
               if(var1 != 0) {
                  break label151;
               }

               if(var16 < this.getMaxStringLength()) {
                  var16 = 0;
                  break label151;
               }
            }

            var16 = 1;
         }
      }

      int var12;
      int var14;
      label144: {
         label218: {
            var14 = var16;
            var12 = var10;
            var16 = var6;
            if(var1 == 0) {
               if(var6 == 0) {
                  var16 = var3;
                  if(var1 == 0) {
                     var16 = var3 > 0?var8 + this.width:var8;
                  }

                  var12 = var16;
                  if(var1 == 0) {
                     break label218;
                  }
               }

               var16 = var14;
            }

            if(var1 != 0) {
               break label144;
            }

            if(var16 != 0) {
               var12 = var10 - 1;
               --var10;
            }
         }

         var16 = var5.length();
      }

      if(var1 == 0) {
         label131: {
            if(var16 > 0) {
               var16 = var6;
               if(var1 != 0) {
                  break label131;
               }

               if(var6 != 0) {
                  var16 = var3;
                  if(var1 != 0) {
                     break label131;
                  }

                  if(var3 < var5.length()) {
                     this.fontRendererInstance.drawStringWithShadow(var5.substring(var3), var10, var9, var2);
                  }
               }
            }

            var16 = var7;
         }
      }

      if(var1 == 0) {
         if(var16 != 0 && var1 == 0) {
            label117: {
               if(var14 != 0) {
                  Gui.drawRect(var12, var9 - 1, var12 + 1, var9 + 1 + this.fontRendererInstance.FONT_HEIGHT, -3092272);
                  if(var1 == 0) {
                     break label117;
                  }
               }

               this.fontRendererInstance.drawStringWithShadow("_", var12, var9, var2);
            }
         }

         var16 = var4;
      }

      int var10001 = var3;
      if(var1 == 0) {
         if(var16 == var3) {
            return;
         }

         var16 = var8;
         var10001 = this.fontRendererInstance.getCharWidth(var5.substring(0, var4));
      }

      int var13 = var16 + var10001;
      this.method_729(var12, var9 - 1, var13 - 1, var9 + 1 + this.fontRendererInstance.FONT_HEIGHT);
   }
}

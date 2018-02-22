import org.lwjgl.opengl.GL11;

// $FF: renamed from: k_
public class GuiTextField extends Gui {

   // $FF: renamed from: b kU
   protected final FontRenderer fontRendererInstance;
   // $FF: renamed from: h int
   protected final int xPosition;
   // $FF: renamed from: i int
   protected final int yPosition;
   // $FF: renamed from: j int
   protected final int width;
   // $FF: renamed from: k int
   protected final int height;
   // $FF: renamed from: l java.lang.String
   protected String text;
   // $FF: renamed from: m int
   protected int maxStringLength;
   // $FF: renamed from: n int
   protected int cursorCounter;
   // $FF: renamed from: o boolean
   protected boolean enableBackgroundDrawing;
   // $FF: renamed from: p boolean
   protected boolean canLoseFocus;
   // $FF: renamed from: q boolean
   protected boolean isFocused;
   // $FF: renamed from: r boolean
   protected boolean isEnabled;
   // $FF: renamed from: s int
   protected int lineScrollOffset;
   // $FF: renamed from: t int
   protected int cursorPosition;
   // $FF: renamed from: u int
   protected int selectionEnd;
   // $FF: renamed from: v int
   protected int enabledColor;
   // $FF: renamed from: w int
   protected int disabledColor;
   // $FF: renamed from: x boolean
   protected boolean visible;
   // $FF: renamed from: y java.lang.String
   private static final String field_443 = "CL_00000670";


   // $FF: renamed from: <init> (kU, int, int, int, int) void
   public void GuiTextField(FontRenderer var1, int var2, int var3, int var4, int var5) {
      super.method_651();
      this.text = "";
      this.maxStringLength = 32;
      this.enableBackgroundDrawing = true;
      this.canLoseFocus = true;
      this.isEnabled = true;
      this.enabledColor = 14737632;
      this.disabledColor = 7368816;
      this.visible = true;
      this.fontRendererInstance = var1;
      this.xPosition = var2;
      this.yPosition = var3;
      this.width = var4;
      this.height = var5;
   }

   // $FF: renamed from: b () void
   public void method_712() {
      ++this.cursorCounter;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void writeText(String var1) {
      label17: {
         label16: {
            String[] var2 = class_752.method_4253();
            if(var2 != null) {
               if(var1.length() <= this.maxStringLength) {
                  break label16;
               }

               this.text = var1.substring(0, this.maxStringLength);
            }

            if(var2 != null) {
               break label17;
            }
         }

         this.text = var1;
      }

      this.method_725();
   }

   // $FF: renamed from: c () java.lang.String
   public String method_714() {
      return this.text;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_715() {
      GuiTextField var10000;
      String[] var1;
      int var4;
      label25: {
         var1 = class_752.method_4253();
         var10000 = this;
         if(var1 != null) {
            if(this.cursorPosition < this.selectionEnd) {
               var4 = this.cursorPosition;
               break label25;
            }

            var10000 = this;
         }

         var4 = var10000.selectionEnd;
      }

      int var2;
      label19: {
         var2 = var4;
         var10000 = this;
         if(var1 != null) {
            if(this.cursorPosition < this.selectionEnd) {
               var4 = this.selectionEnd;
               break label19;
            }

            var10000 = this;
         }

         var4 = var10000.cursorPosition;
      }

      int var3 = var4;
      return this.text.substring(var2, var3);
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_716(String var1) {
      String[] var2;
      String var3;
      String var4;
      GuiTextField var10;
      int var11;
      label55: {
         String[] var10000 = class_752.method_4253();
         var3 = "";
         var2 = var10000;
         var4 = class_1788.method_9824(var1);
         var10 = this;
         if(var2 != null) {
            if(this.cursorPosition < this.selectionEnd) {
               var11 = this.cursorPosition;
               break label55;
            }

            var10 = this;
         }

         var11 = var10.selectionEnd;
      }

      int var5;
      label49: {
         var5 = var11;
         var10 = this;
         if(var2 != null) {
            if(this.cursorPosition < this.selectionEnd) {
               var11 = this.selectionEnd;
               break label49;
            }

            var10 = this;
         }

         var11 = var10.cursorPosition;
      }

      int var6 = var11;
      int var7 = this.maxStringLength - this.text.length() - (var5 - this.selectionEnd);
      boolean var8 = false;
      var11 = this.text.length();
      if(var2 != null) {
         if(var11 > 0) {
            var3 = var3 + this.text.substring(0, var5);
         }

         var11 = var7;
      }

      int var9;
      label42: {
         if(var2 != null) {
            if(var11 < var4.length()) {
               var3 = var3 + var4.substring(0, var7);
               var9 = var7;
               if(var2 != null) {
                  break label42;
               }
            }

            var3 = var3 + var4;
            var11 = var4.length();
         }

         var9 = var11;
      }

      var10 = this;
      if(var2 != null) {
         if(this.text.length() > 0 && var6 < this.text.length()) {
            var3 = var3 + this.text.substring(var6);
         }

         this.text = var3;
         var10 = this;
      }

      var10.method_722(var5 - this.selectionEnd + var9);
   }

   // $FF: renamed from: b (int) void
   public void method_717(int var1) {
      GuiTextField var3;
      label26: {
         String[] var2 = class_752.method_4253();
         int var10000 = this.text.length();
         if(var2 != null) {
            if(var10000 == 0) {
               return;
            }

            var3 = this;
            if(var2 == null) {
               break label26;
            }

            var10000 = this.selectionEnd;
         }

         if(var10000 != this.cursorPosition) {
            this.method_716("");
            if(var2 != null) {
               return;
            }
         }

         var3 = this;
      }

      var3.method_718(this.method_719(var1) - this.cursorPosition);
   }

   // $FF: renamed from: c (int) void
   public void method_718(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.text.length();
      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.selectionEnd;
      }

      if(var2 != null) {
         if(var10000 != this.cursorPosition) {
            this.method_716("");
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1;
      }

      if(var2 != null) {
         var10000 = var10000 < 0?1:0;
      }

      int var3 = var10000;
      var10000 = var3;
      if(var2 != null) {
         var10000 = var3 != 0?this.cursorPosition + var1:this.cursorPosition;
      }

      int var4;
      label61: {
         var4 = var10000;
         var10000 = var3;
         if(var2 != null) {
            if(var3 != 0) {
               var10000 = this.cursorPosition;
               break label61;
            }

            var10000 = this.cursorPosition;
         }

         var10000 += var1;
      }

      int var5 = var10000;
      String var6 = "";
      var10000 = var4;
      if(var2 != null) {
         if(var4 >= 0) {
            var6 = this.text.substring(0, var4);
         }

         var10000 = var5;
      }

      GuiTextField var7;
      label79: {
         if(var2 != null) {
            if(var10000 < this.text.length()) {
               var6 = var6 + this.text.substring(var5);
            }

            var7 = this;
            if(var2 == null) {
               break label79;
            }

            this.text = var6;
            var10000 = var3;
         }

         if(var10000 == 0) {
            return;
         }

         var7 = this;
      }

      var7.method_722(var1);
   }

   // $FF: renamed from: d (int) int
   public int method_719(int var1) {
      return this.method_720(var1, this.getCursorPosition());
   }

   // $FF: renamed from: b (int, int) int
   public int method_720(int var1, int var2) {
      return this.method_721(var1, this.getCursorPosition(), true);
   }

   // $FF: renamed from: b (int, int, boolean) int
   public int method_721(int var1, int var2, boolean var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = var2;
      String[] var4 = var10000;
      int var10 = var1;
      if(var4 != null) {
         var10 = var1 < 0?1:0;
      }

      int var6 = var10;
      int var7 = Math.abs(var1);
      int var8 = 0;

      label108:
      while(true) {
         var10 = var8;
         int var10001 = var7;

         label105:
         while(var10 < var10001) {
            var10 = var6;
            if(var4 == null) {
               return var10;
            }

            label114: {
               if(var4 != null) {
                  if(var6 != 0) {
                     label98:
                     while(true) {
                        if(var3 != 0) {
                           var10 = var5;
                           if(var4 != null && var4 != null) {
                              if(var5 > 0) {
                                 var10 = this.text.charAt(var5 - 1);
                                 if(var4 != null) {
                                    if(var10 == 32) {
                                       --var5;
                                       if(var4 != null) {
                                          continue;
                                       }
                                    }

                                    var10 = var5;
                                 }
                              } else {
                                 var10 = var5;
                              }
                           }
                        } else {
                           var10 = var5;
                        }

                        while(true) {
                           if(var10 <= 0) {
                              break label114;
                           }

                           var10 = this.text.charAt(var5 - 1);
                           var10001 = 32;
                           if(var4 == null) {
                              continue label105;
                           }

                           if(var10 == 32) {
                              break label114;
                           }

                           --var5;
                           if(var4 == null) {
                              break label98;
                           }

                           var10 = var5;
                        }
                     }
                  }

                  var10 = this.text.length();
               }

               int var9 = var10;
               var5 = this.text.indexOf(32, var5);
               var10 = var5;
               if(var4 != null) {
                  if(var5 == -1) {
                     var5 = var9;
                     if(var4 != null) {
                        break label114;
                     }
                  }

                  var10 = var3;
               }

               while(var10 != 0) {
                  var10 = var5;
                  var10001 = var9;
                  if(var4 == null) {
                     continue label105;
                  }

                  if(var4 != null) {
                     if(var5 >= var9) {
                        break;
                     }

                     var10 = this.text.charAt(var5);
                     var10001 = 32;
                  }

                  if(var10 != var10001) {
                     break;
                  }

                  ++var5;
                  if(var4 == null) {
                     break;
                  }

                  var10 = var3;
               }
            }

            ++var8;
            if(var4 != null) {
               continue label108;
            }
            break;
         }

         var10 = var5;
         return var10;
      }
   }

   // $FF: renamed from: e (int) void
   public void method_722(int var1) {
      this.setCursorPosition(this.selectionEnd + var1);
   }

   // $FF: renamed from: f (int) void
   public void setCursorPosition(int var1) {
      GuiTextField var5;
      label23: {
         String[] var10000 = class_752.method_4253();
         this.cursorPosition = var1;
         String[] var2 = var10000;
         int var3 = this.text.length();
         int var4 = this.cursorPosition;
         if(var2 != null) {
            if(this.cursorPosition < 0) {
               this.cursorPosition = 0;
            }

            var5 = this;
            if(var2 == null) {
               break label23;
            }

            var4 = this.cursorPosition;
         }

         if(var4 > var3) {
            this.cursorPosition = var3;
         }

         var5 = this;
      }

      var5.setSelectionPos(this.cursorPosition);
   }

   // $FF: renamed from: e () void
   public void method_724() {
      this.setCursorPosition(0);
   }

   // $FF: renamed from: f () void
   public void method_725() {
      this.setCursorPosition(this.text.length());
   }

   // $FF: renamed from: b (char, int) boolean
   public boolean method_726(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.isFocused;
      if(var3 != null) {
         if(!this.isFocused) {
            return false;
         }

         var10000 = var1;
      }

      boolean var4;
      if(var3 != null) {
         switch(var10000) {
         case 1:
            this.method_725();
            this.setSelectionPos(0);
            return true;
         case 3:
            bdw.method_858(this.method_715());
            return true;
         case 22:
            var4 = this.isEnabled;
            if(var3 != null) {
               if(this.isEnabled) {
                  this.method_716(bdw.method_857());
               }

               var4 = true;
            }

            return var4;
         case 24:
            bdw.method_858(this.method_715());
            var4 = this.isEnabled;
            if(var3 != null) {
               if(this.isEnabled) {
                  this.method_716("");
               }

               var4 = true;
            }

            return var4;
         default:
            var10000 = var2;
         }
      }

      if(var3 != null) {
         switch(var10000) {
         case 14:
            label185: {
               var4 = bdw.method_877();
               if(var3 != null) {
                  if(var4) {
                     var4 = this.isEnabled;
                     if(var3 == null) {
                        return var4;
                     }

                     if(!this.isEnabled) {
                        break label185;
                     }

                     this.method_717(-1);
                     if(var3 != null) {
                        break label185;
                     }
                  }

                  var4 = this.isEnabled;
               }

               if(var3 == null) {
                  return var4;
               }

               if(var4) {
                  this.method_718(-1);
               }
            }

            var4 = true;
            return var4;
         case 199:
            if(bdw.method_878()) {
               this.setSelectionPos(0);
               if(var3 != null) {
                  return true;
               }
            }

            this.method_724();
            return true;
         case 203:
            var4 = bdw.method_878();
            if(var3 != null) {
               if(var4) {
                  if(bdw.method_877()) {
                     this.setSelectionPos(this.method_720(-1, this.getSelectionEnd()));
                     if(var3 != null) {
                        return true;
                     }
                  }

                  this.setSelectionPos(this.getSelectionEnd() - 1);
                  if(var3 != null) {
                     return true;
                  }
               }

               var4 = bdw.method_877();
            }

            if(var4) {
               this.setCursorPosition(this.method_719(-1));
               if(var3 != null) {
                  return true;
               }
            }

            this.method_722(-1);
            return true;
         case 205:
            var4 = bdw.method_878();
            if(var3 != null) {
               if(var4) {
                  if(bdw.method_877()) {
                     this.setSelectionPos(this.method_720(1, this.getSelectionEnd()));
                     if(var3 != null) {
                        return true;
                     }
                  }

                  this.setSelectionPos(this.getSelectionEnd() + 1);
                  if(var3 != null) {
                     return true;
                  }
               }

               var4 = bdw.method_877();
            }

            if(var4) {
               this.setCursorPosition(this.method_719(1));
               if(var3 != null) {
                  return true;
               }
            }

            this.method_722(1);
            return true;
         case 207:
            if(bdw.method_878()) {
               this.setSelectionPos(this.text.length());
               if(var3 != null) {
                  return true;
               }
            }

            this.method_725();
            return true;
         case 211:
            label182: {
               var4 = bdw.method_877();
               if(var3 != null) {
                  if(var4) {
                     var4 = this.isEnabled;
                     if(var3 == null) {
                        return var4;
                     }

                     if(!this.isEnabled) {
                        break label182;
                     }

                     this.method_717(1);
                     if(var3 != null) {
                        break label182;
                     }
                  }

                  var4 = this.isEnabled;
               }

               if(var3 == null) {
                  return var4;
               }

               if(var4) {
                  this.method_718(1);
               }
            }

            var4 = true;
            return var4;
         default:
            var10000 = class_1788.method_9823(var1);
         }
      }

      if(var3 != null) {
         if(var10000 != 0) {
            var4 = this.isEnabled;
            if(var3 != null) {
               if(this.isEnabled) {
                  this.method_716(Character.toString(var1));
               }

               var4 = true;
            }

            return var4;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_727(int var1, int var2, int var3) {
      int var10000;
      String[] var4;
      label72: {
         label75: {
            var4 = class_752.method_4253();
            var10000 = var1;
            int var10001 = this.xPosition;
            if(var4 != null) {
               if(var1 < this.xPosition) {
                  break label75;
               }

               var10000 = var1;
               var10001 = this.xPosition + this.width;
            }

            if(var4 != null) {
               if(var10000 >= var10001) {
                  break label75;
               }

               var10000 = var2;
               var10001 = this.yPosition;
            }

            if(var4 != null) {
               if(var10000 < var10001) {
                  break label75;
               }

               var10000 = var2;
               if(var4 == null) {
                  break label72;
               }

               var10001 = this.yPosition + this.height;
            }

            if(var10000 < var10001) {
               var10000 = 1;
               break label72;
            }
         }

         var10000 = 0;
      }

      int var5 = var10000;
      var10000 = this.canLoseFocus;
      if(var4 != null) {
         if(this.canLoseFocus) {
            this.setFocused((boolean)var5);
         }

         var10000 = this.isFocused;
      }

      if(var4 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var3;
      }

      if(var4 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = var1 - this.xPosition;
      }

      int var6 = var10000;
      GuiTextField var8 = this;
      if(var4 != null) {
         if(this.enableBackgroundDrawing) {
            var6 -= 4;
         }

         var8 = this;
      }

      String var7 = var8.fontRendererInstance.trimStringToWidth(this.text.substring(this.lineScrollOffset), this.getWidth());
      this.setCursorPosition(this.fontRendererInstance.trimStringToWidth(var7, var6).length() + this.lineScrollOffset);
   }

   // $FF: renamed from: g () void
   public void drawTextBox() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.getVisible();
      if(var1 != null) {
         if(!var10000) {
            return;
         }

         var10000 = this.getEnableBackgroundDrawing();
      }

      GuiTextField var15;
      int var16;
      label205: {
         label214: {
            if(var1 != null) {
               if(var10000) {
                  drawRect(this.xPosition - 1, this.yPosition - 1, this.xPosition + this.width + 1, this.yPosition + this.height + 1, -6250336);
                  drawRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, -16777216);
               }

               var15 = this;
               if(var1 == null) {
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
            if(var1 != null) {
               if(var3 < 0) {
                  break label216;
               }

               var16 = var3;
            }

            if(var1 == null) {
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
            if(var1 != null) {
               if(!this.isFocused) {
                  break label217;
               }

               var16 = this.cursorCounter / 6 % 2;
            }

            if(var1 != null) {
               if(var16 != 0) {
                  break label217;
               }

               var16 = var6;
            }

            if(var1 == null) {
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
         if(var1 != null) {
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
         if(var1 != null) {
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
      var16 = var4;
      if(var1 != null) {
         if(var4 > var5.length()) {
            var4 = var5.length();
         }

         var16 = var5.length();
      }

      if(var1 != null) {
         if(var16 > 0) {
            String var11 = var6 != 0?var5.substring(0, var3):var5;
            var10 = this.fontRendererInstance.drawStringWithShadow(var11, var8, var9, var2);
         }

         var16 = this.cursorPosition;
      }

      if(var1 != null) {
         label151: {
            if(var16 >= this.text.length()) {
               var16 = this.text.length();
               if(var1 == null) {
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
            if(var1 != null) {
               if(var6 == 0) {
                  var16 = var3;
                  if(var1 != null) {
                     var16 = var3 > 0?var8 + this.width:var8;
                  }

                  var12 = var16;
                  if(var1 != null) {
                     break label218;
                  }
               }

               var16 = var14;
            }

            if(var1 == null) {
               break label144;
            }

            if(var16 != 0) {
               var12 = var10 - 1;
               --var10;
            }
         }

         var16 = var5.length();
      }

      if(var1 != null) {
         label131: {
            if(var16 > 0) {
               var16 = var6;
               if(var1 == null) {
                  break label131;
               }

               if(var6 != 0) {
                  var16 = var3;
                  if(var1 == null) {
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

      if(var1 != null) {
         if(var16 != 0 && var1 != null) {
            label117: {
               if(var14 != 0) {
                  Gui.drawRect(var12, var9 - 1, var12 + 1, var9 + 1 + this.fontRendererInstance.FONT_HEIGHT, -3092272);
                  if(var1 != null) {
                     break label117;
                  }
               }

               this.fontRendererInstance.drawStringWithShadow("_", var12, var9, var2);
            }
         }

         var16 = var4;
      }

      int var10001 = var3;
      if(var1 != null) {
         if(var16 == var3) {
            return;
         }

         var16 = var8;
         var10001 = this.fontRendererInstance.getCharWidth(var5.substring(0, var4));
      }

      int var13 = var16 + var10001;
      this.method_729(var12, var9 - 1, var13 - 1, var9 + 1 + this.fontRendererInstance.FONT_HEIGHT);
   }

   // $FF: renamed from: a (int, int, int, int) void
   protected void method_729(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var1;
      int var10001 = var3;
      int var6;
      if(var5 != null) {
         if(var1 < var3) {
            var6 = var1;
            var1 = var3;
            var3 = var6;
         }

         var10000 = var2;
         var10001 = var4;
      }

      if(var5 != null) {
         if(var10000 < var10001) {
            var6 = var2;
            var2 = var4;
            var4 = var6;
         }

         var10000 = var3;
         var10001 = this.xPosition + this.width;
      }

      if(var5 != null) {
         if(var10000 > var10001) {
            var3 = this.xPosition + this.width;
         }

         var10000 = var1;
         var10001 = this.xPosition + this.width;
      }

      label33: {
         if(var5 != null) {
            if(var10000 <= var10001) {
               break label33;
            }

            var10000 = this.xPosition;
            var10001 = this.width;
         }

         var1 = var10000 + var10001;
      }

      bmh var7 = bmh.instance;
      GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
      GL11.glDisable(3553);
      GL11.glEnable(3058);
      GL11.glLogicOp(5387);
      var7.setVisible2();
      var7.method_7462((double)var1, (double)var4, 0.0D);
      var7.method_7462((double)var3, (double)var4, 0.0D);
      var7.method_7462((double)var3, (double)var2, 0.0D);
      var7.method_7462((double)var1, (double)var2, 0.0D);
      var7.getVisible8();
      GL11.glDisable(3058);
      GL11.glEnable(3553);
   }

   // $FF: renamed from: g (int) void
   public void setMaxStringLength(int var1) {
      String[] var10000 = class_752.method_4253();
      this.maxStringLength = var1;
      String[] var2 = var10000;
      GuiTextField var3 = this;
      if(var2 != null) {
         if(this.text.length() <= var1) {
            return;
         }

         var3 = this;
      }

      var3.text = this.text.substring(0, var1);
   }

   // $FF: renamed from: h () int
   public int getMaxStringLength() {
      return this.maxStringLength;
   }

   // $FF: renamed from: i () int
   public int getCursorPosition() {
      return this.cursorPosition;
   }

   // $FF: renamed from: j () boolean
   public boolean getEnableBackgroundDrawing() {
      return this.enableBackgroundDrawing;
   }

   // $FF: renamed from: b (boolean) void
   public void setEnableBackgroundDrawing(boolean var1) {
      this.enableBackgroundDrawing = var1;
   }

   // $FF: renamed from: h (int) void
   public void setTextColor(int var1) {
      this.enabledColor = var1;
   }

   // $FF: renamed from: i (int) void
   public void setDisabledTextColour(int var1) {
      this.disabledColor = var1;
   }

   // $FF: renamed from: c (boolean) void
   public void setFocused(boolean p_146195_1_)
   {
       if (p_146195_1_ && !this.isFocused)
       {
           this.cursorCounter = 0;
       }

       this.isFocused = p_146195_1_;
   }

   // $FF: renamed from: k () boolean
   public boolean isFocused() {
      return this.isFocused;
   }

   // $FF: renamed from: d (boolean) void
   public void setEnabled(boolean var1) {
      this.isEnabled = var1;
   }

   // $FF: renamed from: l () int
   public int getSelectionEnd() {
      return this.selectionEnd;
   }

   // $FF: renamed from: m () int
   public int getWidth() {
      String[] var1 = class_752.method_4253();
      GuiTextField var10000 = this;
      int var2;
      if(var1 != null) {
         if(this.getEnableBackgroundDrawing()) {
            var2 = this.width - 8;
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.width;
      return var2;
   }

   // $FF: renamed from: j (int) void
   public void setSelectionPos(int var1) {
      int var3 = this.text.length();
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 > var3) {
            var1 = var3;
         }

         var10000 = var1;
      }

      label84: {
         if(var2 != null) {
            if(var10000 >= 0) {
               break label84;
            }

            var10000 = 0;
         }

         var1 = var10000;
      }

      this.selectionEnd = var1;
      GuiTextField var7 = this;
      if(var2 != null) {
         if(this.fontRendererInstance == null) {
            return;
         }

         var7 = this;
      }

      var10000 = var7.lineScrollOffset;
      if(var2 != null) {
         if(var10000 > var3) {
            this.lineScrollOffset = var3;
         }

         var10000 = this.getWidth();
      }

      int var4 = var10000;
      String var5 = this.fontRendererInstance.trimStringToWidth(this.text.substring(this.lineScrollOffset), var4);
      int var6 = var5.length() + this.lineScrollOffset;
      var10000 = var1;
      int var10001 = this.lineScrollOffset;
      if(var2 != null) {
         if(var1 == this.lineScrollOffset) {
            this.lineScrollOffset -= this.fontRendererInstance.trimStringToWidth(this.text, var4, true).length();
         }

         var10000 = var1;
         var10001 = var6;
      }

      label69: {
         label68: {
            if(var2 != null) {
               if(var10000 > var10001) {
                  this.lineScrollOffset += var1 - var6;
                  if(var2 != null) {
                     break label68;
                  }
               }

               var10000 = var1;
               if(var2 == null) {
                  break label69;
               }

               var10001 = this.lineScrollOffset;
            }

            if(var10000 <= var10001) {
               this.lineScrollOffset -= this.lineScrollOffset - var1;
            }
         }

         var10000 = this.lineScrollOffset;
      }

      label90: {
         if(var2 != null) {
            if(var10000 < 0) {
               this.lineScrollOffset = 0;
            }

            var7 = this;
            if(var2 == null) {
               break label90;
            }

            var10000 = this.lineScrollOffset;
         }

         if(var10000 <= var3) {
            return;
         }

         var7 = this;
      }

      var7.lineScrollOffset = var3;
   }

   // $FF: renamed from: e (boolean) void
   public void setCanLoseFocus(boolean var1) {
      this.canLoseFocus = var1;
   }

   // $FF: renamed from: n () boolean
   public boolean getVisible() {
      return this.visible;
   }

   // $FF: renamed from: f (boolean) void
   public void setVisible(boolean var1) {
      this.visible = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_746() {
      boolean var10000 = true;
      char[] var10003 = "dN~b¹Üê&~".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_443 = (new String((char[])var4)).intern();
            String var2 = field_443;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 110;
            break;
         case 1:
            var10009 = 149;
            break;
         case 2:
            var10009 = 88;
            break;
         case 3:
            var10009 = 7;
            break;
         case 4:
            var10009 = 27;
            break;
         case 5:
            var10009 = 192;
            break;
         default:
            var10009 = 165;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

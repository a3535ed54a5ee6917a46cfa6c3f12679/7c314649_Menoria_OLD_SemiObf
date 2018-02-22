package net.minecraft.realms;

import net.minecraft.realms.RealmsScreen;
import org.lwjgl.opengl.GL11;

public class RealmsEditBox {

   public static final int BACKWARDS = -1;
   public static final int FORWARDS = 1;
   private static final int CURSOR_INSERT_WIDTH = 1;
   private static final int CURSOR_INSERT_COLOR = -3092272;
   private static final String CURSOR_APPEND_CHARACTER = "_";
   private final FontRenderer font;
   // $FF: renamed from: x int
   private final int field_2456;
   // $FF: renamed from: y int
   private final int field_2457;
   private final int width;
   private final int height;
   private String value;
   private int maxLength;
   private int frame;
   private boolean bordered;
   private boolean canLoseFocus;
   private boolean inFocus;
   private boolean isEditable;
   private int displayPos;
   private int cursorPos;
   private int highlightPos;
   private int textColor;
   private int textColorUneditable;
   private boolean visible;
   private static final String __OBFID = "CL_00001858";


   // $FF: renamed from: <init> (int, int, int, int) void
   public void getBlock69(int var1, int var2, int var3, int var4) {
      this.getBlock70(bao.method_5273().enableBackgroundDrawing4, var1, var2, var3, var4);
   }

   // $FF: renamed from: <init> (kU, int, int, int, int) void
   public void getBlock70(FontRenderer var1, int var2, int var3, int var4, int var5) {
      super();
      this.value = "";
      this.maxLength = 32;
      this.bordered = true;
      this.canLoseFocus = true;
      this.isEditable = true;
      this.textColor = 14737632;
      boolean var10000 = RealmsScreen.method_3793();
      this.textColorUneditable = 7368816;
      this.visible = true;
      this.font = var1;
      this.field_2456 = var2;
      boolean var6 = var10000;
      this.field_2457 = var3;
      this.width = var4;
      this.height = var5;
      if(class_689.method_3977() == 0) {
         RealmsScreen.method_3792(!var6);
      }

   }

   public void tick() {
      ++this.frame;
   }

   public void setValue(String var1) {
      label17: {
         label16: {
            boolean var2 = RealmsScreen.method_3793();
            if(var2) {
               if(var1.length() <= this.maxLength) {
                  break label16;
               }

               this.value = var1.substring(0, this.maxLength);
            }

            if(var2) {
               break label17;
            }
         }

         this.value = var1;
      }

      this.moveCursorToEnd();
   }

   public String getValue() {
      return this.value;
   }

   public String getHighlighted() {
      RealmsEditBox var10000;
      boolean var1;
      int var4;
      label25: {
         var1 = RealmsScreen.method_3793();
         var10000 = this;
         if(var1) {
            if(this.cursorPos < this.highlightPos) {
               var4 = this.cursorPos;
               break label25;
            }

            var10000 = this;
         }

         var4 = var10000.highlightPos;
      }

      int var2;
      label19: {
         var2 = var4;
         var10000 = this;
         if(var1) {
            if(this.cursorPos < this.highlightPos) {
               var4 = this.highlightPos;
               break label19;
            }

            var10000 = this;
         }

         var4 = var10000.cursorPos;
      }

      int var3 = var4;
      return this.value.substring(var2, var3);
   }

   public void insertText(String var1) {
      boolean var2;
      String var4;
      String var5;
      RealmsEditBox var11;
      int var12;
      label57: {
         boolean var10000 = RealmsScreen.method_3793();
         var4 = "";
         var2 = var10000;
         var5 = class_1788.method_9824(var1);
         var11 = this;
         if(var2) {
            if(this.cursorPos < this.highlightPos) {
               var12 = this.cursorPos;
               break label57;
            }

            var11 = this;
         }

         var12 = var11.highlightPos;
      }

      int var6;
      label51: {
         var6 = var12;
         var11 = this;
         if(var2) {
            if(this.cursorPos < this.highlightPos) {
               var12 = this.highlightPos;
               break label51;
            }

            var11 = this;
         }

         var12 = var11.cursorPos;
      }

      int var7 = var12;
      int var8 = this.maxLength - this.value.length() - (var6 - this.highlightPos);
      boolean var9 = false;
      var12 = this.value.length();
      if(var2) {
         if(var12 > 0) {
            var4 = var4 + this.value.substring(0, var6);
         }

         var12 = var8;
      }

      int var10;
      label44: {
         if(var2) {
            if(var12 < var5.length()) {
               var4 = var4 + var5.substring(0, var8);
               var10 = var8;
               if(var2) {
                  break label44;
               }

               int var3 = class_689.method_3976();
               ++var3;
               class_689.method_3975(var3);
            }

            var4 = var4 + var5;
            var12 = var5.length();
         }

         var10 = var12;
      }

      var11 = this;
      if(var2) {
         if(this.value.length() > 0 && var7 < this.value.length()) {
            var4 = var4 + this.value.substring(var7);
         }

         this.value = var4;
         var11 = this;
      }

      var11.moveCursor(var6 - this.highlightPos + var10);
   }

   public void deleteWords(int var1) {
      RealmsEditBox var3;
      label26: {
         boolean var2 = RealmsScreen.method_3794();
         int var10000 = this.value.length();
         if(!var2) {
            if(var10000 == 0) {
               return;
            }

            var3 = this;
            if(var2) {
               break label26;
            }

            var10000 = this.highlightPos;
         }

         if(var10000 != this.cursorPos) {
            this.insertText("");
            if(!var2) {
               return;
            }
         }

         var3 = this;
      }

      var3.deleteChars(this.getWordPosition(var1) - this.cursorPos);
   }

   public void deleteChars(int var1) {
      boolean var2 = RealmsScreen.method_3794();
      int var10000 = this.value.length();
      if(!var2) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.highlightPos;
      }

      if(!var2) {
         if(var10000 != this.cursorPos) {
            this.insertText("");
            if(!var2) {
               return;
            }
         }

         var10000 = var1;
      }

      if(!var2) {
         var10000 = var10000 < 0?1:0;
      }

      int var3 = var10000;
      var10000 = var3;
      if(!var2) {
         var10000 = var3 != 0?this.cursorPos + var1:this.cursorPos;
      }

      int var4;
      label61: {
         var4 = var10000;
         var10000 = var3;
         if(!var2) {
            if(var3 != 0) {
               var10000 = this.cursorPos;
               break label61;
            }

            var10000 = this.cursorPos;
         }

         var10000 += var1;
      }

      int var5 = var10000;
      String var6 = "";
      var10000 = var4;
      if(!var2) {
         if(var4 >= 0) {
            var6 = this.value.substring(0, var4);
         }

         var10000 = var5;
      }

      RealmsEditBox var7;
      label79: {
         if(!var2) {
            if(var10000 < this.value.length()) {
               var6 = var6 + this.value.substring(var5);
            }

            var7 = this;
            if(var2) {
               break label79;
            }

            this.value = var6;
            var10000 = var3;
         }

         if(var10000 == 0) {
            return;
         }

         var7 = this;
      }

      var7.moveCursor(var1);
   }

   public int getWordPosition(int var1) {
      return this.getWordPosition(var1, this.getCursorPosition());
   }

   public int getWordPosition(int var1, int var2) {
      return this.getWordPosition(var1, this.getCursorPosition(), true);
   }

   public int getWordPosition(int var1, int var2, boolean var3) {
      int var5 = var2;
      boolean var4 = RealmsScreen.method_3794();
      int var10000 = var1;
      if(!var4) {
         var10000 = var1 < 0?1:0;
      }

      int var6 = var10000;
      int var7 = Math.abs(var1);
      int var8 = 0;

      label108:
      while(true) {
         var10000 = var8;
         int var10001 = var7;

         label105:
         while(var10000 < var10001) {
            var10000 = var6;
            if(var4) {
               return var10000;
            }

            label114: {
               if(!var4) {
                  if(var6 != 0) {
                     label98:
                     while(true) {
                        if(var3 != 0) {
                           var10000 = var5;
                           if(!var4 && !var4) {
                              if(var5 > 0) {
                                 var10000 = this.value.charAt(var5 - 1);
                                 if(!var4) {
                                    if(var10000 == 32) {
                                       --var5;
                                       if(!var4) {
                                          continue;
                                       }
                                    }

                                    var10000 = var5;
                                 }
                              } else {
                                 var10000 = var5;
                              }
                           }
                        } else {
                           var10000 = var5;
                        }

                        while(true) {
                           if(var10000 <= 0) {
                              break label114;
                           }

                           var10000 = this.value.charAt(var5 - 1);
                           var10001 = 32;
                           if(var4) {
                              continue label105;
                           }

                           if(var10000 == 32) {
                              break label114;
                           }

                           --var5;
                           if(var4) {
                              break label98;
                           }

                           var10000 = var5;
                        }
                     }
                  }

                  var10000 = this.value.length();
               }

               int var9 = var10000;
               var5 = this.value.indexOf(32, var5);
               var10000 = var5;
               if(!var4) {
                  if(var5 == -1) {
                     var5 = var9;
                     if(!var4) {
                        break label114;
                     }
                  }

                  var10000 = var3;
               }

               while(var10000 != 0) {
                  var10000 = var5;
                  var10001 = var9;
                  if(var4) {
                     continue label105;
                  }

                  if(!var4) {
                     if(var5 >= var9) {
                        break;
                     }

                     var10000 = this.value.charAt(var5);
                     var10001 = 32;
                  }

                  if(var10000 != var10001) {
                     break;
                  }

                  ++var5;
                  if(var4) {
                     break;
                  }

                  var10000 = var3;
               }
            }

            ++var8;
            if(!var4) {
               continue label108;
            }
            break;
         }

         var10000 = var5;
         return var10000;
      }
   }

   public void moveCursor(int var1) {
      this.moveCursorTo(this.highlightPos + var1);
   }

   public void moveCursorTo(int var1) {
      RealmsEditBox var5;
      label23: {
         boolean var10000 = RealmsScreen.method_3793();
         this.cursorPos = var1;
         boolean var2 = var10000;
         int var3 = this.value.length();
         int var4 = this.cursorPos;
         if(var2) {
            if(this.cursorPos < 0) {
               this.cursorPos = 0;
            }

            var5 = this;
            if(!var2) {
               break label23;
            }

            var4 = this.cursorPos;
         }

         if(var4 > var3) {
            this.cursorPos = var3;
         }

         var5 = this;
      }

      var5.setHighlightPos(this.cursorPos);
   }

   public void moveCursorToStart() {
      this.moveCursorTo(0);
   }

   public void moveCursorToEnd() {
      this.moveCursorTo(this.value.length());
   }

   public boolean keyPressed(char var1, int var2) {
      boolean var3 = RealmsScreen.method_3794();
      int var10000 = this.inFocus;
      if(!var3) {
         if(!this.inFocus) {
            return false;
         }

         var10000 = var1;
      }

      boolean var4;
      if(!var3) {
         switch(var10000) {
         case 1:
            this.moveCursorToEnd();
            this.setHighlightPos(0);
            return true;
         case 3:
            bdw.method_858(this.getHighlighted());
            return true;
         case 22:
            var4 = this.isEditable;
            if(!var3) {
               if(this.isEditable) {
                  this.insertText(bdw.method_857());
               }

               var4 = true;
            }

            return var4;
         case 24:
            bdw.method_858(this.getHighlighted());
            var4 = this.isEditable;
            if(!var3) {
               if(this.isEditable) {
                  this.insertText("");
               }

               var4 = true;
            }

            return var4;
         default:
            var10000 = var2;
         }
      }

      if(!var3) {
         switch(var10000) {
         case 14:
            label182: {
               var4 = bdw.method_877();
               if(!var3) {
                  if(var4) {
                     var4 = this.isEditable;
                     if(var3) {
                        return var4;
                     }

                     if(!this.isEditable) {
                        break label182;
                     }

                     this.deleteWords(-1);
                     if(!var3) {
                        break label182;
                     }
                  }

                  var4 = this.isEditable;
               }

               if(var3) {
                  return var4;
               }

               if(var4) {
                  this.deleteChars(-1);
               }
            }

            var4 = true;
            return var4;
         case 199:
            if(bdw.method_878()) {
               this.setHighlightPos(0);
               if(!var3) {
                  return true;
               }
            }

            this.moveCursorToStart();
            return true;
         case 203:
            var4 = bdw.method_878();
            if(!var3) {
               if(var4) {
                  if(bdw.method_877()) {
                     this.setHighlightPos(this.getWordPosition(-1, this.getHighlightPos()));
                     if(!var3) {
                        return true;
                     }
                  }

                  this.setHighlightPos(this.getHighlightPos() - 1);
                  if(!var3) {
                     return true;
                  }
               }

               var4 = bdw.method_877();
            }

            if(var4) {
               this.moveCursorTo(this.getWordPosition(-1));
               if(!var3) {
                  return true;
               }
            }

            this.moveCursor(-1);
            return true;
         case 205:
            var4 = bdw.method_878();
            if(!var3) {
               if(var4) {
                  if(bdw.method_877()) {
                     this.setHighlightPos(this.getWordPosition(1, this.getHighlightPos()));
                     if(!var3) {
                        return true;
                     }
                  }

                  this.setHighlightPos(this.getHighlightPos() + 1);
                  if(!var3) {
                     return true;
                  }
               }

               var4 = bdw.method_877();
            }

            if(var4) {
               this.moveCursorTo(this.getWordPosition(1));
               if(!var3) {
                  return true;
               }
            }

            this.moveCursor(1);
            return true;
         case 207:
            if(bdw.method_878()) {
               this.setHighlightPos(this.value.length());
               if(!var3) {
                  return true;
               }
            }

            this.moveCursorToEnd();
            return true;
         case 211:
            label184: {
               var4 = bdw.method_877();
               if(!var3) {
                  if(var4) {
                     var4 = this.isEditable;
                     if(var3) {
                        return var4;
                     }

                     if(!this.isEditable) {
                        break label184;
                     }

                     this.deleteWords(1);
                     if(!var3) {
                        break label184;
                     }
                  }

                  var4 = this.isEditable;
               }

               if(var3) {
                  return var4;
               }

               if(var4) {
                  this.deleteChars(1);
               }
            }

            var4 = true;
            return var4;
         default:
            var10000 = class_1788.method_9823(var1);
         }
      }

      if(!var3) {
         if(var10000 != 0) {
            var4 = this.isEditable;
            if(!var3) {
               if(this.isEditable) {
                  this.insertText(Character.toString(var1));
               }

               var4 = true;
            }

            return var4;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   public void mouseClicked(int var1, int var2, int var3) {
      int var10000;
      boolean var4;
      label72: {
         label75: {
            var4 = RealmsScreen.method_3793();
            var10000 = var1;
            int var10001 = this.field_2456;
            if(var4) {
               if(var1 < this.field_2456) {
                  break label75;
               }

               var10000 = var1;
               var10001 = this.field_2456 + this.width;
            }

            if(var4) {
               if(var10000 >= var10001) {
                  break label75;
               }

               var10000 = var2;
               var10001 = this.field_2457;
            }

            if(var4) {
               if(var10000 < var10001) {
                  break label75;
               }

               var10000 = var2;
               if(!var4) {
                  break label72;
               }

               var10001 = this.field_2457 + this.height;
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
      if(var4) {
         if(this.canLoseFocus) {
            this.setFocus((boolean)var5);
         }

         var10000 = this.inFocus;
      }

      if(var4) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var3;
      }

      if(var4) {
         if(var10000 != 0) {
            return;
         }

         var10000 = var1 - this.field_2456;
      }

      int var6 = var10000;
      RealmsEditBox var8 = this;
      if(var4) {
         if(this.bordered) {
            var6 -= 4;
         }

         var8 = this;
      }

      String var7 = var8.font.trimStringToWidth(this.value.substring(this.displayPos), this.getInnerWidth());
      this.moveCursorTo(this.font.trimStringToWidth(var7, var6).length() + this.displayPos);
   }

   public void render() {
      boolean var1 = RealmsScreen.method_3793();
      boolean var10000 = this.isVisible();
      if(var1) {
         if(!var10000) {
            return;
         }

         var10000 = this.isBordered();
      }

      RealmsEditBox var15;
      int var16;
      label205: {
         label214: {
            if(var1) {
               if(var10000) {
                  Gui.drawRect(this.field_2456 - 1, this.field_2457 - 1, this.field_2456 + this.width + 1, this.field_2457 + this.height + 1, -6250336);
                  Gui.drawRect(this.field_2456, this.field_2457, this.field_2456 + this.width, this.field_2457 + this.height, -16777216);
               }

               var15 = this;
               if(!var1) {
                  break label214;
               }

               var10000 = this.isEditable;
            }

            if(var10000) {
               var16 = this.textColor;
               break label205;
            }

            var15 = this;
         }

         var16 = var15.textColorUneditable;
      }

      int var2;
      int var3;
      int var4;
      String var5;
      label194: {
         label216: {
            var2 = var16;
            var3 = this.cursorPos - this.displayPos;
            var4 = this.highlightPos - this.displayPos;
            var5 = this.font.trimStringToWidth(this.value.substring(this.displayPos), this.getInnerWidth());
            var16 = var3;
            if(var1) {
               if(var3 < 0) {
                  break label216;
               }

               var16 = var3;
            }

            if(!var1) {
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
            var16 = this.inFocus;
            if(var1) {
               if(!this.inFocus) {
                  break label217;
               }

               var16 = this.frame / 6 % 2;
            }

            if(var1) {
               if(var16 != 0) {
                  break label217;
               }

               var16 = var6;
            }

            if(!var1) {
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
         if(var1) {
            if(this.bordered) {
               var16 = this.field_2456 + 4;
               break label167;
            }

            var15 = this;
         }

         var16 = var15.field_2456;
      }

      int var8;
      label161: {
         var8 = var16;
         var15 = this;
         if(var1) {
            if(this.bordered) {
               var16 = this.field_2457 + (this.height - 8) / 2;
               break label161;
            }

            var15 = this;
         }

         var16 = var15.field_2457;
      }

      int var9 = var16;
      int var10 = var8;
      var16 = var4;
      if(var1) {
         if(var4 > var5.length()) {
            var4 = var5.length();
         }

         var16 = var5.length();
      }

      if(var1) {
         if(var16 > 0) {
            String var11 = var6 != 0?var5.substring(0, var3):var5;
            var10 = this.font.drawStringWithShadow(var11, var8, var9, var2);
         }

         var16 = this.cursorPos;
      }

      if(var1) {
         label151: {
            if(var16 >= this.value.length()) {
               var16 = this.value.length();
               if(!var1) {
                  break label151;
               }

               if(var16 < this.getMaxLength()) {
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
            if(var1) {
               if(var6 == 0) {
                  var16 = var3;
                  if(var1) {
                     var16 = var3 > 0?var8 + this.width:var8;
                  }

                  var12 = var16;
                  if(var1) {
                     break label218;
                  }
               }

               var16 = var14;
            }

            if(!var1) {
               break label144;
            }

            if(var16 != 0) {
               var12 = var10 - 1;
               --var10;
            }
         }

         var16 = var5.length();
      }

      if(var1) {
         label131: {
            if(var16 > 0) {
               var16 = var6;
               if(!var1) {
                  break label131;
               }

               if(var6 != 0) {
                  var16 = var3;
                  if(!var1) {
                     break label131;
                  }

                  if(var3 < var5.length()) {
                     this.font.drawStringWithShadow(var5.substring(var3), var10, var9, var2);
                  }
               }
            }

            var16 = var7;
         }
      }

      if(var1) {
         if(var16 != 0 && var1) {
            label117: {
               if(var14 != 0) {
                  Gui.drawRect(var12, var9 - 1, var12 + 1, var9 + 1 + this.font.FONT_HEIGHT, -3092272);
                  if(var1) {
                     break label117;
                  }
               }

               this.font.drawStringWithShadow("_", var12, var9, var2);
            }
         }

         var16 = var4;
      }

      int var10001 = var3;
      if(var1) {
         if(var16 == var3) {
            return;
         }

         var16 = var8;
         var10001 = this.font.getCharWidth(var5.substring(0, var4));
      }

      int var13 = var16 + var10001;
      this.renderHighlight(var12, var9 - 1, var13 - 1, var9 + 1 + this.font.FONT_HEIGHT);
   }

   private void renderHighlight(int var1, int var2, int var3, int var4) {
      boolean var5 = RealmsScreen.method_3793();
      int var10000 = var1;
      int var10001 = var3;
      int var6;
      if(var5) {
         if(var1 < var3) {
            var6 = var1;
            var1 = var3;
            var3 = var6;
         }

         var10000 = var2;
         var10001 = var4;
      }

      if(var5) {
         if(var10000 < var10001) {
            var6 = var2;
            var2 = var4;
            var4 = var6;
         }

         var10000 = var3;
         var10001 = this.field_2456 + this.width;
      }

      if(var5) {
         if(var10000 > var10001) {
            var3 = this.field_2456 + this.width;
         }

         var10000 = var1;
         var10001 = this.field_2456 + this.width;
      }

      label33: {
         if(var5) {
            if(var10000 <= var10001) {
               break label33;
            }

            var10000 = this.field_2456;
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

   public void setMaxLength(int var1) {
      boolean var10000 = RealmsScreen.method_3793();
      this.maxLength = var1;
      boolean var2 = var10000;
      RealmsEditBox var3 = this;
      if(var2) {
         if(this.value.length() <= var1) {
            return;
         }

         var3 = this;
      }

      var3.value = this.value.substring(0, var1);
   }

   public int getMaxLength() {
      return this.maxLength;
   }

   public int getCursorPosition() {
      return this.cursorPos;
   }

   public boolean isBordered() {
      return this.bordered;
   }

   public void setBordered(boolean var1) {
      this.bordered = var1;
   }

   public int getTextColor() {
      return this.textColor;
   }

   public void setTextColor(int var1) {
      this.textColor = var1;
   }

   public int getTextColorUneditable() {
      return this.textColorUneditable;
   }

   public void setTextColorUneditable(int var1) {
      this.textColorUneditable = var1;
   }

   public void setFocus(boolean var1) {
      boolean var2 = RealmsScreen.method_3794();
      if(!var2) {
         RealmsEditBox var10000;
         label17: {
            if(var1) {
               var10000 = this;
               if(var2) {
                  break label17;
               }

               if(!this.inFocus) {
                  this.frame = 0;
               }
            }

            var10000 = this;
         }

         var10000.inFocus = var1;
      }

   }

   public boolean isFocused() {
      return this.inFocus;
   }

   public boolean isIsEditable() {
      return this.isEditable;
   }

   public void setIsEditable(boolean var1) {
      this.isEditable = var1;
   }

   public int getHighlightPos() {
      return this.highlightPos;
   }

   public int getInnerWidth() {
      boolean var1 = RealmsScreen.method_3794();
      RealmsEditBox var10000 = this;
      int var2;
      if(!var1) {
         if(this.isBordered()) {
            var2 = this.width - 8;
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.width;
      return var2;
   }

   public void setHighlightPos(int var1) {
      int var3 = this.value.length();
      boolean var2 = RealmsScreen.method_3793();
      int var10000 = var1;
      if(var2) {
         if(var1 > var3) {
            var1 = var3;
         }

         var10000 = var1;
      }

      label84: {
         if(var2) {
            if(var10000 >= 0) {
               break label84;
            }

            var10000 = 0;
         }

         var1 = var10000;
      }

      this.highlightPos = var1;
      RealmsEditBox var7 = this;
      if(var2) {
         if(this.font == null) {
            return;
         }

         var7 = this;
      }

      var10000 = var7.displayPos;
      if(var2) {
         if(var10000 > var3) {
            this.displayPos = var3;
         }

         var10000 = this.getInnerWidth();
      }

      int var4 = var10000;
      String var5 = this.font.trimStringToWidth(this.value.substring(this.displayPos), var4);
      int var6 = var5.length() + this.displayPos;
      var10000 = var1;
      int var10001 = this.displayPos;
      if(var2) {
         if(var1 == this.displayPos) {
            this.displayPos -= this.font.trimStringToWidth(this.value, var4, true).length();
         }

         var10000 = var1;
         var10001 = var6;
      }

      label69: {
         label68: {
            if(var2) {
               if(var10000 > var10001) {
                  this.displayPos += var1 - var6;
                  if(var2) {
                     break label68;
                  }
               }

               var10000 = var1;
               if(!var2) {
                  break label69;
               }

               var10001 = this.displayPos;
            }

            if(var10000 <= var10001) {
               this.displayPos -= this.displayPos - var1;
            }
         }

         var10000 = this.displayPos;
      }

      label90: {
         if(var2) {
            if(var10000 < 0) {
               this.displayPos = 0;
            }

            var7 = this;
            if(!var2) {
               break label90;
            }

            var10000 = this.displayPos;
         }

         if(var10000 <= var3) {
            return;
         }

         var7 = this;
      }

      var7.displayPos = var3;
   }

   public boolean isCanLoseFocus() {
      return this.canLoseFocus;
   }

   public void setCanLoseFocus(boolean var1) {
      this.canLoseFocus = var1;
   }

   public boolean isVisible() {
      return this.visible;
   }

   public void setVisible(boolean var1) {
      this.visible = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void getBlock71() {
      boolean var10000 = true;
      char[] var10003 = "DcÊ©Æa0\tÂ".toCharArray();
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
            __OBFID = (new String((char[])var4)).intern();
            String var2 = __OBFID;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 116;
            break;
         case 1:
            var10009 = 44;
            break;
         case 2:
            var10009 = 24;
            break;
         case 3:
            var10009 = 222;
            break;
         case 4:
            var10009 = 189;
            break;
         case 5:
            var10009 = 210;
            break;
         default:
            var10009 = 2;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

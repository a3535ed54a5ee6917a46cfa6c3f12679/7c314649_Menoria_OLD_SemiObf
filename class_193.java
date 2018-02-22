import java.util.List;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lV
public class class_193 extends bdw {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_785;
   // $FF: renamed from: i bqx
   private static final bqx field_786;
   // $FF: renamed from: r yz
   private final class_792 field_787;
   // $FF: renamed from: s add
   private final add field_788;
   // $FF: renamed from: t boolean
   private final boolean field_789;
   // $FF: renamed from: u boolean
   private boolean field_790;
   // $FF: renamed from: v boolean
   private boolean field_791;
   // $FF: renamed from: w int
   private int field_792;
   // $FF: renamed from: x int
   private int field_793;
   // $FF: renamed from: y int
   private int field_794;
   // $FF: renamed from: z int
   private int field_795;
   // $FF: renamed from: A int
   private int field_796;
   // $FF: renamed from: B rr
   private class_1580 field_797;
   // $FF: renamed from: C java.lang.String
   private String field_798;
   // $FF: renamed from: D k8
   private class_144 field_799;
   // $FF: renamed from: E k8
   private class_144 field_800;
   // $FF: renamed from: F bcb
   private bcb field_801;
   // $FF: renamed from: G bcb
   private bcb field_802;
   // $FF: renamed from: H bcb
   private bcb field_803;
   // $FF: renamed from: I bcb
   private bcb field_804;
   // $FF: renamed from: J java.lang.String
   private static final String field_805;
   // $FF: renamed from: K java.lang.String[]
   private static final String[] field_806;


   // $FF: renamed from: <init> (yz, add, boolean) void
   public void method_1024(class_792 var1, add var2, boolean var3) {
      class_1580 var7;
      label31: {
         super.method_651();
         this.field_793 = 192;
         String[] var10000 = class_752.method_4253();
         this.field_794 = 192;
         this.field_795 = 1;
         String[] var4 = var10000;
         this.field_798 = "";
         this.field_787 = var1;
         this.field_788 = var2;
         class_193 var6 = this;
         if(var4 != null) {
            label29: {
               this.field_789 = var3;
               if(var2.method_3766()) {
                  class_1583 var5 = var2.method_3767();
                  String[] var10002 = field_806;
                  this.field_797 = var5.method_8689("pages", 8);
                  var7 = this.field_797;
                  if(var4 == null) {
                     break label31;
                  }

                  if(this.field_797 != null) {
                     this.field_797 = (class_1580)this.field_797.method_8633();
                     this.field_795 = this.field_797.method_8658();
                     var6 = this;
                     if(var4 == null) {
                        break label29;
                     }

                     if(this.field_795 < 1) {
                        this.field_795 = 1;
                     }
                  }
               }

               var6 = this;
            }
         }

         var7 = var6.field_797;
      }

      if(var7 == null && var3) {
         class_1580 var10001 = new class_1580;
         var10001.method_8628();
         this.field_797 = var10001;
         var7 = this.field_797;
         class_1579 var8 = new class_1579;
         var8.method_8648("");
         var7.method_8650(var8);
         this.field_795 = 1;
      }

   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
      ++this.field_792;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var10000 = class_752.method_4253();
      this.buttonList.clear();
      String[] var1 = var10000;
      Keyboard.enableRepeatEvents(true);
      List var5;
      if(var1 != null) {
         label13: {
            bcb var10002;
            int var10005;
            int var10006;
            if(this.field_789) {
               var5 = this.buttonList;
               var10002 = new bcb;
               var10005 = this.width / 2 - 100;
               var10006 = 4 + this.field_794;
               String[] var4 = field_806;
               var10002.method_748(3, var10005, var10006, 98, 20, class_1450.method_7896("book.signButton", new Object[0]));
               var5.add(this.field_802 = var10002);
               var5 = this.buttonList;
               var10002 = new bcb;
               var10002.method_748(0, this.width / 2 + 2, 4 + this.field_794, 98, 20, class_1450.method_7896("gui.done", new Object[0]));
               var5.add(this.field_801 = var10002);
               var5 = this.buttonList;
               var10002 = new bcb;
               var10002.method_748(5, this.width / 2 - 100, 4 + this.field_794, 98, 20, class_1450.method_7896("book.finalizeButton", new Object[0]));
               var5.add(this.field_803 = var10002);
               var5 = this.buttonList;
               var10002 = new bcb;
               var10002.method_748(4, this.width / 2 + 2, 4 + this.field_794, 98, 20, class_1450.method_7896("gui.cancel", new Object[0]));
               var5.add(this.field_804 = var10002);
               if(var1 != null) {
                  break label13;
               }
            }

            var5 = this.buttonList;
            var10002 = new bcb;
            var10005 = this.width / 2 - 100;
            var10006 = 4 + this.field_794;
            String[] var10009 = field_806;
            var10002.method_748(0, var10005, var10006, 200, 20, class_1450.method_7896("gui.done", new Object[0]));
            var5.add(this.field_801 = var10002);
         }
      }

      int var2 = (this.width - this.field_793) / 2;
      byte var3 = 2;
      var5 = this.buttonList;
      class_144 var6 = new class_144;
      var6.method_764(1, var2 + 120, var3 + 154, true);
      var5.add(this.field_799 = var6);
      var5 = this.buttonList;
      var6 = new class_144;
      var6.method_764(2, var2 + 38, var3 + 154, false);
      var5.add(this.field_800 = var6);
      this.method_1025();
   }

   // $FF: renamed from: m () void
   public void method_872() {
      Keyboard.enableRepeatEvents(false);
   }

   // $FF: renamed from: a () void
   private void method_1025() {
      String[] var1;
      int var10001;
      label89: {
         label92: {
            var1 = class_752.method_4253();
            var10001 = this.field_791;
            if(var1 != null) {
               if(this.field_791) {
                  break label92;
               }

               var10001 = this.field_796;
            }

            if(var1 == null) {
               break label89;
            }

            if(var10001 >= this.field_795 - 1) {
               var10001 = this.field_789;
               if(var1 == null) {
                  break label89;
               }

               if(!this.field_789) {
                  break label92;
               }
            }

            var10001 = 1;
            break label89;
         }

         var10001 = 0;
      }

      label73: {
         label93: {
            this.field_799.field_452 = (boolean)var10001;
            var10001 = this.field_791;
            if(var1 != null) {
               if(this.field_791) {
                  break label93;
               }

               var10001 = this.field_796;
            }

            if(var1 == null) {
               break label73;
            }

            if(var10001 > 0) {
               var10001 = 1;
               break label73;
            }
         }

         var10001 = 0;
      }

      this.field_800.field_452 = (boolean)var10001;
      boolean var2 = this.field_789;
      if(var1 != null) {
         label61: {
            if(this.field_789) {
               var2 = this.field_791;
               if(var1 == null) {
                  break label61;
               }

               if(this.field_791) {
                  var2 = false;
                  break label61;
               }
            }

            var2 = true;
         }
      }

      this.field_801.field_452 = var2;
      class_193 var10000 = this;
      if(var1 != null) {
         if(!this.field_789) {
            return;
         }

         var10000 = this;
      }

      bcb var3 = var10000.field_802;
      var2 = this.field_791;
      if(var1 != null) {
         var2 = !this.field_791;
      }

      var3.field_452 = var2;
      this.field_804.field_452 = this.field_791;
      this.field_803.field_452 = this.field_791;
      var3 = this.field_803;
      var10001 = this.field_798.trim().length();
      if(var1 != null) {
         var10001 = var10001 > 0?1:0;
      }

      var3.field_451 = (boolean)var10001;
   }

   // $FF: renamed from: b (boolean) void
   private void method_1026(boolean param1) {
      // $FF: Couldn't be decompiled
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

      class_193 var3;
      label119: {
         label128: {
            if(var2 != null) {
               if(var10000 == 0) {
                  this.field_557.method_5236((bdw)null);
                  this.method_1026(false);
                  if(var2 != null) {
                     break label128;
                  }
               }

               var10000 = var1.field_450;
            }

            byte var10001 = 3;
            if(var2 != null) {
               label109: {
                  if(var10000 == 3) {
                     var10000 = this.field_789;
                     if(var2 == null) {
                        break label109;
                     }

                     if(this.field_789) {
                        this.field_791 = true;
                        if(var2 != null) {
                           break label128;
                        }
                     }
                  }

                  var10000 = var1.field_450;
               }

               var10001 = 1;
            }

            if(var2 != null) {
               if(var10000 == var10001) {
                  var10000 = this.field_796;
                  if(var2 != null) {
                     if(this.field_796 < this.field_795 - 1) {
                        ++this.field_796;
                        if(var2 != null) {
                           break label128;
                        }
                     }

                     var3 = this;
                     if(var2 == null) {
                        break label119;
                     }

                     var10000 = this.field_789;
                  }

                  if(var10000 == 0) {
                     break label128;
                  }

                  this.method_1027();
                  var3 = this;
                  if(var2 == null) {
                     break label119;
                  }

                  if(this.field_796 >= this.field_795 - 1) {
                     break label128;
                  }

                  ++this.field_796;
                  if(var2 != null) {
                     break label128;
                  }
               }

               var10000 = var1.field_450;
               var10001 = 2;
            }

            if(var2 != null) {
               if(var10000 == var10001) {
                  var3 = this;
                  if(var2 == null) {
                     break label119;
                  }

                  if(this.field_796 <= 0) {
                     break label128;
                  }

                  --this.field_796;
                  if(var2 != null) {
                     break label128;
                  }
               }

               var10000 = var1.field_450;
               var10001 = 5;
            }

            label132: {
               if(var2 != null) {
                  label69: {
                     if(var10000 == var10001) {
                        var10000 = this.field_791;
                        if(var2 == null) {
                           break label69;
                        }

                        if(this.field_791) {
                           this.method_1026(true);
                           this.field_557.method_5236((bdw)null);
                           if(var2 != null) {
                              break label128;
                           }
                        }
                     }

                     var10000 = var1.field_450;
                  }

                  if(var2 == null) {
                     break label132;
                  }

                  var10001 = 4;
               }

               if(var10000 != var10001) {
                  break label128;
               }

               var3 = this;
               if(var2 == null) {
                  break label119;
               }

               var10000 = this.field_791;
            }

            if(var10000 != 0) {
               this.field_791 = false;
            }
         }

         var3 = this;
      }

      var3.method_1025();
   }

   // $FF: renamed from: f () void
   private void method_1027() {
      String[] var1 = class_752.method_4253();
      class_1580 var10000 = this.field_797;
      if(var1 != null) {
         if(this.field_797 == null) {
            return;
         }

         var10000 = this.field_797;
      }

      if(var1 != null) {
         if(var10000.method_8658() >= 50) {
            return;
         }

         var10000 = this.field_797;
      }

      class_1579 var10001 = new class_1579;
      var10001.method_8648("");
      var10000.method_8650(var10001);
      ++this.field_795;
      this.field_790 = true;
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      class_193 var5;
      label26: {
         String[] var10000 = class_752.method_4253();
         super.method_856(var1, var2);
         String[] var3 = var10000;
         boolean var4 = this.field_789;
         if(var3 != null) {
            if(!this.field_789) {
               return;
            }

            var5 = this;
            if(var3 == null) {
               break label26;
            }

            var4 = this.field_791;
         }

         if(var4) {
            this.method_1029(var1, var2);
            if(var3 != null) {
               return;
            }
         }

         var5 = this;
      }

      var5.method_1028(var1, var2);
   }

   // $FF: renamed from: c (char, int) void
   private void method_1028(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         switch(var1) {
         case 22:
            this.method_1032(bdw.method_857());
            return;
         default:
            var10000 = var2;
         }
      }

      if(var3 != null) {
         switch(var10000) {
         case 14:
            String var4 = this.method_1030();
            if(var4.length() > 0) {
               this.method_1031(var4.substring(0, var4.length() - 1));
            }

            return;
         case 28:
         case 156:
            this.method_1032("\n");
            return;
         default:
            var10000 = class_1788.method_9823(var1);
         }
      }

      if(var10000 != 0) {
         this.method_1032(Character.toString(var1));
      }

   }

   // $FF: renamed from: d (char, int) void
   private void method_1029(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      if(var3 != null) {
         class_193 var4;
         switch(var2) {
         case 14:
            var4 = this;
            if(var3 != null) {
               if(this.field_798.isEmpty()) {
                  return;
               }

               this.field_798 = this.field_798.substring(0, this.field_798.length() - 1);
               var4 = this;
            }

            var4.method_1025();
            return;
         case 28:
         case 156:
            var4 = this;
            if(var3 != null) {
               if(this.field_798.isEmpty()) {
                  return;
               }

               this.method_1026(true);
               var4 = this;
            }

            var4.field_557.method_5236((bdw)null);
            return;
         default:
            var10000 = this.field_798.length();
         }
      }

      if(var3 != null) {
         if(var10000 >= 16) {
            return;
         }

         var10000 = class_1788.method_9823(var1);
      }

      if(var10000 != 0) {
         this.field_798 = this.field_798 + Character.toString(var1);
         this.method_1025();
         this.field_790 = true;
      }

   }

   // $FF: renamed from: g () java.lang.String
   private String method_1030() {
      String var3;
      label42: {
         String[] var1 = class_752.method_4253();
         class_193 var10000 = this;
         if(var1 != null) {
            if(this.field_797 == null) {
               break label42;
            }

            var10000 = this;
         }

         label36: {
            int var2 = var10000.field_796;
            if(var1 != null) {
               if(var2 < 0) {
                  break label42;
               }

               var10000 = this;
               if(var1 == null) {
                  break label36;
               }

               var2 = this.field_796;
            }

            if(var2 >= this.field_797.method_8658()) {
               break label42;
            }

            var10000 = this;
         }

         var3 = var10000.field_797.method_8657(this.field_796);
         return var3;
      }

      var3 = "";
      return var3;
   }

   // $FF: renamed from: b (java.lang.String) void
   private void method_1031(String var1) {
      String[] var2 = class_752.method_4253();
      class_193 var10000 = this;
      if(var2 != null) {
         if(this.field_797 == null) {
            return;
         }

         var10000 = this;
      }

      label33: {
         int var3 = var10000.field_796;
         if(var2 != null) {
            if(var3 < 0) {
               return;
            }

            var10000 = this;
            if(var2 == null) {
               break label33;
            }

            var3 = this.field_796;
         }

         if(var3 >= this.field_797.method_8658()) {
            return;
         }

         class_1580 var4 = this.field_797;
         int var10001 = this.field_796;
         class_1579 var10002 = new class_1579;
         var10002.method_8648(var1);
         var4.method_8651(var10001, var10002);
         var10000 = this;
      }

      var10000.field_790 = true;
   }

   // $FF: renamed from: c (java.lang.String) void
   private void method_1032(String var1) {
      String var3 = this.method_1030();
      String[] var10000 = class_752.method_4253();
      String var4 = var3 + var1;
      int var5 = this.fontRendererObj.splitStringWidth(var4 + "" + class_130.field_276 + "_", 118);
      String[] var2 = var10000;
      int var6 = var5;
      short var10001 = 118;
      if(var2 != null) {
         if(var5 > 118) {
            return;
         }

         var6 = var4.length();
         var10001 = 256;
      }

      if(var6 < var10001) {
         this.method_1031(var4);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      label80: {
         String[] var4;
         int var5;
         byte var6;
         String var7;
         String var8;
         int var9;
         int var15;
         class_193 var10000;
         label81: {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.field_557.method_5288().bindTexture(field_786);
            var5 = (this.width - this.field_793) / 2;
            var6 = 2;
            this.method_658(var5, var6, 0, 0, this.field_793, this.field_794);
            var4 = class_752.method_4253();
            var10000 = this;
            if(var4 != null) {
               if(!this.field_791) {
                  break label81;
               }

               var10000 = this;
            }

            label82: {
               var7 = var10000.field_798;
               var15 = this.field_789;
               if(var4 != null) {
                  if(!this.field_789) {
                     break label82;
                  }

                  var15 = this.field_792 / 6 % 2;
               }

               if(var15 == 0) {
                  var7 = var7 + "" + class_130.field_276 + "_";
                  if(var4 != null) {
                     break label82;
                  }
               }

               var7 = var7 + "" + class_130.field_283 + "_";
            }

            String[] var14 = field_806;
            var8 = class_1450.method_7896("book.editTitle", new Object[0]);
            var9 = this.fontRendererObj.getCharWidth(var8);
            this.fontRendererObj.method_7020(var8, var5 + 36 + (116 - var9) / 2, var6 + 16 + 16, 0);
            int var10 = this.fontRendererObj.getCharWidth(var7);
            this.fontRendererObj.method_7020(var7, var5 + 36 + (116 - var10) / 2, var6 + 48, 0);
            String var11 = class_1450.method_7896("book.byAuthor", new Object[]{this.field_787.method_64()});
            int var12 = this.fontRendererObj.getCharWidth(var11);
            this.fontRendererObj.method_7020(class_130.field_284 + var11, var5 + 36 + (116 - var12) / 2, var6 + 48 + 10, 0);
            String var13 = class_1450.method_7896("book.finalizeWarning", new Object[0]);
            this.fontRendererObj.drawSplitString(var13, var5 + 36, var6 + 80, 116, 0);
            if(var4 != null) {
               break label80;
            }
         }

         label59: {
            String[] var16 = field_806;
            var7 = class_1450.method_7896("book.pageIndicator", new Object[]{Integer.valueOf(this.field_796 + 1), Integer.valueOf(this.field_795)});
            var8 = "";
            var10000 = this;
            if(var4 != null) {
               if(this.field_797 != null) {
                  var15 = this.field_796;
                  if(var4 == null) {
                     break label59;
                  }

                  if(this.field_796 >= 0) {
                     var15 = this.field_796;
                     if(var4 == null) {
                        break label59;
                     }

                     if(this.field_796 < this.field_797.method_8658()) {
                        var8 = this.field_797.method_8657(this.field_796);
                     }
                  }
               }

               var10000 = this;
            }

            var15 = var10000.field_789;
         }

         if(var4 != null) {
            if(var15 != 0) {
               label83: {
                  var15 = this.fontRendererObj.getBidiFlag();
                  if(var4 != null) {
                     if(var15 != 0) {
                        var8 = var8 + "_";
                        if(var4 != null) {
                           break label83;
                        }
                     }

                     var15 = this.field_792 / 6 % 2;
                  }

                  if(var15 == 0) {
                     var8 = var8 + "" + class_130.field_276 + "_";
                     if(var4 != null) {
                        break label83;
                     }
                  }

                  var8 = var8 + "" + class_130.field_283 + "_";
               }
            }

            var15 = this.fontRendererObj.getCharWidth(var7);
         }

         var9 = var15;
         this.fontRendererObj.method_7020(var7, var5 - var9 + this.field_793 - 44, var6 + 16, 0);
         this.fontRendererObj.drawSplitString(var8, var5 + 36, var6 + 16 + 16, 116, 0);
      }

      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: h () bqx
   static bqx method_1033() {
      return field_786;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1034() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_1035(Exception var0) {
      return var0;
   }
}

import java.util.List;

// $FF: renamed from: lG
public class class_194 extends bdw {

   // $FF: renamed from: b P[]
   private static final class_101[] field_807;
   // $FF: renamed from: r bdw
   private bdw field_808;
   // $FF: renamed from: s java.lang.String
   protected String field_809;
   // $FF: renamed from: t bbj
   private bbj field_810;
   // $FF: renamed from: u kv
   public class_1357 field_811;
   // $FF: renamed from: v long
   public long field_812;
   // $FF: renamed from: w mc
   public class_977 field_813;
   // $FF: renamed from: x bcb
   private bcb field_814;
   // $FF: renamed from: y java.lang.String
   private static final String field_815;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_816;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_1036(bdw var1, bbj var2) {
      super.method_651();
      String[] var10001 = field_816;
      this.field_809 = "Controls";
      this.field_811 = null;
      this.field_808 = var1;
      this.field_810 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      class_977 var10001 = new class_977;
      var10001.method_5619(this, this.field_557);
      this.field_813 = var10001;
      String[] var10000 = class_752.method_4253();
      List var10 = this.buttonList;
      bcb var10002 = new bcb;
      int var10005 = this.width / 2 - 155;
      int var10006 = this.height - 29;
      String[] var7 = field_816;
      var10002.method_748(200, var10005, var10006, 150, 20, class_1450.method_7896("gui.done", new Object[0]));
      var10.add(var10002);
      String[] var1 = var10000;
      List var8 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(201, this.width / 2 - 155 + 160, this.height - 29, 150, 20, class_1450.method_7896("controls.resetAll", new Object[0]));
      var8.add(this.field_814 = var10002);
      this.field_809 = class_1450.method_7896("controls.title", new Object[0]);
      int var2 = 0;
      class_101[] var3 = field_807;
      int var4 = var3.length;
      int var5 = 0;

      while(var5 < var4) {
         class_101 var6 = var3[var5];
         boolean var9 = var6.method_467();
         if(var1 != null) {
            label19: {
               if(var9) {
                  var8 = this.buttonList;
                  class_152 var11 = new class_152;
                  var11.method_782(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, 18 + 24 * (var2 >> 1), var6);
                  var8.add(var11);
                  if(var1 != null) {
                     break label19;
                  }
               }

               var8 = this.buttonList;
               class_141 var12 = new class_141;
               var12.method_760(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, 18 + 24 * (var2 >> 1), var6, this.field_810.method_5355(var6));
               var8.add(var12);
            }
         }

         ++var2;
         ++var5;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_450;
      short var10001 = 200;
      if(var2 != null) {
         if(var1.field_450 == 200) {
            this.field_557.method_5236(this.field_808);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 201;
      }

      bcb var7;
      label60: {
         label61: {
            if(var2 != null) {
               if(var10000 == var10001) {
                  class_1357[] var3 = this.field_557.canLoseFocus7.field_4556;
                  int var4 = var3.length;
                  int var5 = 0;

                  while(true) {
                     if(var5 < var4) {
                        class_1357 var6 = var3[var5];
                        var6.getEnableBackgroundDrawing9(var6.getEnableBackgroundDrawing7());
                        ++var5;
                        if(var2 == null) {
                           break;
                        }

                        if(var2 != null) {
                           continue;
                        }
                     }

                     class_1357.getCursorPosition9();
                     break;
                  }

                  if(var2 != null) {
                     return;
                  }
               }

               var10000 = var1.field_450;
               if(var2 == null) {
                  break label61;
               }

               var10001 = 100;
            }

            if(var10000 >= var10001) {
               return;
            }

            var7 = var1;
            if(var2 == null) {
               break label60;
            }

            var10000 = var1 instanceof class_141;
         }

         if(var10000 == 0) {
            return;
         }

         this.field_810.method_5351(((class_141)var1).method_761(), 1);
         var7 = var1;
      }

      var7.field_449 = this.field_810.method_5355(class_101.method_464(var1.field_450));
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      class_194 var10000;
      String[] var4;
      label34: {
         var4 = class_752.method_4253();
         var10000 = this;
         if(var4 != null) {
            if(this.field_811 == null) {
               break label34;
            }

            this.field_810.method_5349(this.field_811, -100 + var3);
            var10000 = this;
         }

         var10000.field_811 = null;
         class_1357.getCursorPosition9();
         if(var4 != null) {
            return;
         }
      }

      label26: {
         label25: {
            int var5 = var3;
            if(var4 != null) {
               if(var3 != 0) {
                  break label25;
               }

               var10000 = this;
               if(var4 == null) {
                  break label26;
               }

               var5 = this.field_813.method_5604(var1, var2, var3);
            }

            if(var5 != 0) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.method_862(var1, var2, var3);
   }

   // $FF: renamed from: b (int, int, int) void
   protected void method_863(int var1, int var2, int var3) {
      class_194 var5;
      label22: {
         label21: {
            String[] var4 = class_752.method_4253();
            int var10000 = var3;
            if(var4 != null) {
               if(var3 != 0) {
                  break label21;
               }

               var5 = this;
               if(var4 == null) {
                  break label22;
               }

               var10000 = this.field_813.method_5605(var1, var2, var3);
            }

            if(var10000 != 0) {
               return;
            }
         }

         var5 = this;
      }

      var5.method_863(var1, var2, var3);
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_194 var10000 = this;
      if(var3 != null) {
         if(this.field_811 != null) {
            label16: {
               if(var2 == 1) {
                  this.field_810.method_5349(this.field_811, 0);
                  if(var3 != null) {
                     break label16;
                  }
               }

               this.field_810.method_5349(this.field_811, var2);
            }

            this.field_811 = null;
            this.field_812 = bao.method_5283();
            class_1357.getCursorPosition9();
            if(var3 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.method_856(var1, var2);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.field_813.method_5570(var1, var2, var3);
      this.drawCenteredString(this.fontRendererObj, this.field_809, this.width / 2, 8, 16777215);
      String[] var4 = class_752.method_4253();
      boolean var5 = true;
      class_1357[] var6 = this.field_810.field_4556;
      int var7 = var6.length;
      int var8 = 0;

      while(true) {
         if(var8 < var7) {
            label39: {
               class_1357 var9 = var6[var8];
               if(var4 == null) {
                  break;
               }

               if(var4 != null) {
                  if(var9.getEnableBackgroundDrawing8() != var9.getEnableBackgroundDrawing7()) {
                     var5 = false;
                     if(var4 != null) {
                        break label39;
                     }
                  }

                  ++var8;
               }

               if(var4 != null) {
                  continue;
               }
            }
         }

         boolean var10001 = var5;
         if(var4 != null) {
            var10001 = !var5;
         }

         this.field_814.field_451 = var10001;
         super.drawScreen(var1, var2, var3);
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_1037() {
      // $FF: Couldn't be decompiled
   }
}

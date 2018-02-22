import java.util.List;

// $FF: renamed from: l1
public class class_203 extends bdw {

   // $FF: renamed from: b P[]
   private static final class_101[] field_917;
   // $FF: renamed from: i P[]
   private static final class_101[] field_918;
   // $FF: renamed from: r bdw
   private final bdw field_919;
   // $FF: renamed from: s bbj
   private final bbj field_920;
   // $FF: renamed from: t java.lang.String
   private String field_921;
   // $FF: renamed from: u java.lang.String
   private String field_922;
   // $FF: renamed from: v int
   private int field_923;
   // $FF: renamed from: w boolean
   private boolean field_924;
   // $FF: renamed from: x java.lang.String[]
   private static final String[] field_925;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_1102(bdw var1, bbj var2) {
      super.method_651();
      this.field_924 = false;
      this.field_919 = var1;
      this.field_920 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var7 = field_925;
      this.field_921 = class_1450.method_7896("options.stream.title", new Object[0]);
      String[] var1 = var10000;
      this.field_922 = class_1450.method_7896("options.stream.chat.title", new Object[0]);
      class_101[] var3 = field_917;
      int var4 = var3.length;
      int var5 = 0;

      class_101 var6;
      int var9;
      List var10;
      class_141 var11;
      class_152 var10001;
      while(true) {
         if(var5 < var4) {
            var6 = var3[var5];
            var9 = var6.method_467();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               label79: {
                  if(var9 != 0) {
                     var10 = this.buttonList;
                     var10001 = new class_152;
                     var10001.method_782(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 + 24 * (var2 >> 1), var6);
                     var10.add(var10001);
                     if(var1 != null) {
                        break label79;
                     }
                  }

                  var10 = this.buttonList;
                  var11 = new class_141;
                  var11.method_760(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 + 24 * (var2 >> 1), var6, this.field_920.method_5355(var6));
                  var10.add(var11);
               }
            }

            ++var2;
            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var9 = var2 % 2;
         break;
      }

      if(var1 != null) {
         if(var9 == 1) {
            ++var2;
         }

         this.field_923 = this.height / 6 + 24 * (var2 >> 1) + 6;
         var2 += 2;
         var3 = field_918;
         var4 = var3.length;
         var9 = 0;
      }

      var5 = var9;

      int var10004;
      while(true) {
         if(var5 < var4) {
            var6 = var3[var5];
            boolean var13 = var6.method_467();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               label63: {
                  if(var13) {
                     var10 = this.buttonList;
                     var10001 = new class_152;
                     var10001.method_782(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 + 24 * (var2 >> 1), var6);
                     var10.add(var10001);
                     if(var1 != null) {
                        break label63;
                     }
                  }

                  var10 = this.buttonList;
                  var11 = new class_141;
                  var11.method_760(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 + 24 * (var2 >> 1), var6, this.field_920.method_5355(var6));
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
         var10004 = this.width / 2 - 155;
         int var10005 = this.height / 6 + 168;
         var7 = field_925;
         var12.method_748(200, var10004, var10005, 150, 20, class_1450.method_7896("gui.done", new Object[0]));
         var10.add(var12);
         break;
      }

      bcb var8;
      int var14;
      label55: {
         label92: {
            bcb var15 = new bcb;
            int var10003 = this.width / 2 + 5;
            var10004 = this.height / 6 + 168;
            String[] var10007 = field_925;
            var15.method_748(201, var10003, var10004, 150, 20, class_1450.method_7896("options.stream.ingestSelection", new Object[0]));
            var8 = var15;
            var14 = this.field_557.method_5297().method_195();
            if(var1 != null) {
               if(var14 != 0) {
                  var14 = this.field_557.method_5297().method_205().length;
                  if(var1 == null) {
                     break label55;
                  }

                  if(var14 > 0) {
                     break label92;
                  }
               }

               var14 = this.field_557.method_5297().method_208();
            }

            if(var1 == null) {
               break label55;
            }

            if(var14 == 0) {
               var14 = 0;
               break label55;
            }
         }

         var14 = 1;
      }

      var8.field_451 = (boolean)var14;
      this.buttonList.add(var8);
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

      label90: {
         label94: {
            if(var2 != null) {
               label87: {
                  if(var10000 < 100) {
                     var10000 = var1 instanceof class_141;
                     if(var2 == null) {
                        break label87;
                     }

                     if(var10000 != 0) {
                        class_101 var3 = ((class_141)var1).method_761();
                        this.field_920.method_5351(var3, 1);
                        var1.field_449 = this.field_920.method_5355(class_101.method_464(var1.field_450));
                        if(this.field_557.method_5297().method_196()) {
                           label58: {
                              class_101 var5 = var3;
                              class_101 var10001 = class_101.field_131;
                              if(var2 != null) {
                                 if(var3 == class_101.field_131) {
                                    break label58;
                                 }

                                 var5 = var3;
                                 var10001 = class_101.field_132;
                              }

                              if(var5 != var10001) {
                                 this.field_924 = true;
                              }
                           }
                        }

                        if(var2 != null) {
                           break label94;
                        }
                     }
                  }

                  var10000 = var1 instanceof class_152;
               }
            }

            if(var2 == null) {
               break label90;
            }

            if(var10000 != 0) {
               label95: {
                  label96: {
                     var10000 = var1.field_450;
                     int var6 = class_101.field_125.method_469();
                     if(var2 != null) {
                        if(var10000 == var6) {
                           this.field_557.method_5297().method_202();
                           if(var2 != null) {
                              break label95;
                           }
                        }

                        var10000 = var1.field_450;
                        if(var2 == null) {
                           break label96;
                        }

                        var6 = class_101.field_126.method_469();
                     }

                     if(var10000 == var6) {
                        this.field_557.method_5297().method_202();
                        if(var2 != null) {
                           break label95;
                        }
                     }

                     var10000 = this.field_557.method_5297().method_196();
                  }

                  if(var2 == null) {
                     break label90;
                  }

                  if(var10000 != 0) {
                     this.field_924 = true;
                  }
               }
            }
         }

         var10000 = var1.field_450;
      }

      short var7 = 200;
      if(var2 != null) {
         if(var10000 == 200) {
            this.field_557.canLoseFocus7.method_5358();
            this.field_557.method_5236(this.field_919);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var7 = 201;
      }

      if(var10000 == var7) {
         this.field_557.canLoseFocus7.method_5358();
         bao var4 = this.field_557;
         class_204 var8 = new class_204;
         var8.method_1104(this);
         var4.method_5236(var8);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      String[] var10000 = class_752.method_4253();
      this.drawCenteredString(this.fontRendererObj, this.field_921, this.width / 2, 20, 16777215);
      String[] var4 = var10000;
      this.drawCenteredString(this.fontRendererObj, this.field_922, this.width / 2, this.field_923, 16777215);
      class_203 var5 = this;
      if(var4 != null) {
         if(this.field_924) {
            FontRenderer var10001 = this.fontRendererObj;
            StringBuilder var10002 = (new StringBuilder()).append(class_130.field_288);
            String[] var10003 = field_925;
            this.drawCenteredString(var10001, var10002.append(class_1450.method_7896("options.stream.changes", new Object[0])).toString(), this.width / 2, 20 + this.fontRendererObj.FONT_HEIGHT, 16777215);
         }

         var5 = this;
      }

      var5.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1103() {
      // $FF: Couldn't be decompiled
   }
}

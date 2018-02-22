import ca.diiza.g.a.class_871;
import java.util.List;

public class bdm extends bdw implements class_35 {

   // $FF: renamed from: f P[]
   private static final class_101[] field_931;
   // $FF: renamed from: g bdw
   private final bdw field_932;
   // $FF: renamed from: h bbj
   private final bbj field_933;
   // $FF: renamed from: a java.lang.String
   protected String field_934;
   private static final String __OBFID;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_935;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_1114(bdw var1, bbj var2) {
      super.method_651();
      String[] var10001 = field_935;
      this.field_934 = "Options";
      this.field_932 = var1;
      this.field_933 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      int var2 = 0;
      String[] var10000 = class_752.method_4253();
      String[] var8 = field_935;
      this.field_934 = class_1450.method_7896("options.title", new Object[0]);
      class_101[] var3 = field_931;
      String[] var1 = var10000;
      int var4 = var3.length;
      int var5 = 0;

      List var10;
      bcb var14;
      int var10004;
      int var10005;
      while(true) {
         if(var5 < var4) {
            class_101 var6 = var3[var5];
            boolean var9 = var6.method_467();
            if(var1 == null) {
               break;
            }

            label70: {
               label54: {
                  if(var1 != null) {
                     if(!var9) {
                        break label54;
                     }

                     var10 = this.buttonList;
                     class_152 var10001 = new class_152;
                     var10001.method_782(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 - 12 + 24 * (var2 >> 1), var6);
                     var10.add(var10001);
                  }

                  if(var1 != null) {
                     break label70;
                  }
               }

               class_141 var7;
               bdm var12;
               label45: {
                  class_141 var11 = new class_141;
                  var11.method_760(var6.method_469(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 - 12 + 24 * (var2 >> 1), var6, this.field_933.method_5355(var6));
                  var7 = var11;
                  if(var6 == class_101.field_101) {
                     var12 = this;
                     if(var1 == null) {
                        break label45;
                     }

                     if(this.field_557.cursorCounter6 != null) {
                        var9 = this.field_557.cursorCounter6.method_2195().method_6867();
                        if(var1 == null) {
                           break label70;
                        }

                        if(var9) {
                           var7.field_451 = false;
                           StringBuilder var13 = new StringBuilder();
                           var8 = field_935;
                           var7.field_449 = var13.append(class_1450.method_7896("options.difficulty", new Object[0])).append(": ").append(class_1450.method_7896("options.difficulty.hardcore", new Object[0])).toString();
                        }
                     }
                  }

                  var12 = this;
               }

               var12.buttonList.add(var7);
            }

            ++var2;
            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var10 = this.buttonList;
         var14 = new bcb;
         var10004 = this.width / 2 - 155;
         var10005 = this.height / 6 + 72 - 6;
         var8 = field_935;
         var14.method_748(106, var10004, var10005, 150, 20, class_1450.method_7896("options.sounds", new Object[0]));
         var10.add(var14);
         var10 = this.buttonList;
         var14 = new bcb;
         var14.method_748(107, this.width / 2 + 5, this.height / 6 + 72 - 6, 150, 20, class_1450.method_7896("options.stream", new Object[0]));
         var10.add(var14);
         var10 = this.buttonList;
         var14 = new bcb;
         var14.method_748(101, this.width / 2 - 155, this.height / 6 + 96 - 6, 150, 20, class_1450.method_7896("options.video", new Object[0]));
         var10.add(var14);
         var10 = this.buttonList;
         var14 = new bcb;
         var14.method_748(100, this.width / 2 + 5, this.height / 6 + 96 - 6, 150, 20, class_1450.method_7896("options.controls", new Object[0]));
         var10.add(var14);
         var10 = this.buttonList;
         var14 = new bcb;
         var14.method_748(102, this.width / 2 - 155, this.height / 6 + 120 - 6, 150, 20, class_1450.method_7896("options.language", new Object[0]));
         var10.add(var14);
         var10 = this.buttonList;
         var14 = new bcb;
         var14.method_748(103, this.width / 2 + 5, this.height / 6 + 120 - 6, 150, 20, class_1450.method_7896("options.multiplayer.title", new Object[0]));
         var10.add(var14);
         var10 = this.buttonList;
         var14 = new bcb;
         var14.method_748(105, this.width / 2 - 155, this.height / 6 + 144 - 6, 150, 20, class_1450.method_7896("options.resourcepack", new Object[0]));
         var10.add(var14);
         var10 = this.buttonList;
         var14 = new bcb;
         var14.method_748(104, this.width / 2 + 5, this.height / 6 + 144 - 6, 150, 20, class_1450.method_7896("options.snooper.view", new Object[0]));
         var10.add(var14);
         break;
      }

      var10 = this.buttonList;
      var14 = new bcb;
      var10004 = this.width / 2 + 5;
      var10005 = this.height / 6 + 38 - 6;
      StringBuilder var10008 = (new StringBuilder()).append(class_130.field_282);
      var8 = field_935;
      var10008 = var10008.append("ArmorHUD Pourcentage : ").append(class_871.method_5138("hud.pourcent").equals("Oui")?class_130.field_286:class_130.field_288);
      var8 = field_935;
      var14.method_748(500, var10004, var10005, 150, 20, var10008.append(class_871.method_5138("hud.pourcent")).toString());
      var10.add(var14);
      var10 = this.buttonList;
      var14 = new bcb;
      var10004 = this.width / 2 - 155;
      var10005 = this.height / 6 + 38 - 6;
      var10008 = (new StringBuilder()).append(class_130.field_282).append("Potion/Armor HUD : ").append(class_871.method_5138("hud.activated").equals("Oui")?class_130.field_286:class_130.field_288);
      var8 = field_935;
      var14.method_748(400, var10004, var10005, 150, 20, var10008.append(class_871.method_5138("hud.activated")).toString());
      var10.add(var14);
      var10 = this.buttonList;
      var14 = new bcb;
      var14.method_747(200, this.width / 2 - 100, this.height / 6 + 168, class_1450.method_7896("gui.done", new Object[0]));
      var10.add(var14);
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

      int var10001 = 100;
      if(var2 != null) {
         label149: {
            if(var10000 < 100) {
               var10000 = var1 instanceof class_141;
               if(var2 == null) {
                  break label149;
               }

               if(var10000 != 0) {
                  this.field_933.method_5351(((class_141)var1).method_761(), 1);
                  var1.field_449 = this.field_933.method_5355(class_101.method_464(var1.field_450));
               }
            }

            var10000 = var1.field_450;
         }

         var10001 = 8675309;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.enableBackgroundDrawing8.setEnableBackgroundDrawing5();
         }

         var10000 = var1.field_450;
         var10001 = 101;
      }

      bao var13;
      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            var13 = this.field_557;
            GuiVideoSettings var14 = new GuiVideoSettings;
            var14.method_1073(this, this.field_933);
            var13.method_5236(var14);
         }

         var10000 = var1.field_450;
         var10001 = 100;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            var13 = this.field_557;
            class_194 var15 = new class_194;
            var15.method_1036(this, this.field_933);
            var13.method_5236(var15);
         }

         var10000 = var1.field_450;
         var10001 = 102;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            var13 = this.field_557;
            class_173 var16 = new class_173;
            var16.method_926(this, this.field_933, this.field_557.method_5291());
            var13.method_5236(var16);
         }

         var10000 = var1.field_450;
         var10001 = 103;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            var13 = this.field_557;
            class_187 var5 = new class_187;
            var5.method_986(this, this.field_933);
            var13.method_5236(var5);
         }

         var10000 = var1.field_450;
         var10001 = 104;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            var13 = this.field_557;
            class_164 var6 = new class_164;
            var6.method_880(this, this.field_933);
            var13.method_5236(var6);
         }

         var10000 = var1.field_450;
         var10001 = 200;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            this.field_557.method_5236(this.field_932);
         }

         var10000 = var1.field_450;
         var10001 = 105;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            var13 = this.field_557;
            class_189 var7 = new class_189;
            var7.method_1001(this);
            var13.method_5236(var7);
         }

         var10000 = var1.field_450;
         var10001 = 106;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_557.canLoseFocus7.method_5358();
            var13 = this.field_557;
            class_200 var8 = new class_200;
            var8.method_1088(this, this.field_933);
            var13.method_5236(var8);
         }

         var10000 = var1.field_450;
         var10001 = 107;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            label127: {
               label126: {
                  this.field_557.canLoseFocus7.method_5358();
                  class_51 var3 = this.field_557.method_5297();
                  boolean var9 = var3.method_194();
                  if(var2 != null) {
                     if(!var9) {
                        break label126;
                     }

                     var9 = var3.method_214();
                  }

                  if(var9) {
                     var13 = this.field_557;
                     class_203 var10 = new class_203;
                     var10.method_1102(this, this.field_933);
                     var13.method_5236(var10);
                     if(var2 != null) {
                        break label127;
                     }
                  }
               }

               class_202.method_1100(this);
            }
         }

         var10000 = var1.field_450;
         var10001 = 500;
      }

      String[] var4;
      String var11;
      String var12;
      if(var2 != null) {
         if(var10000 == var10001) {
            label113: {
               var4 = field_935;
               var12 = class_871.method_5138("hud.pourcent");
               var11 = "Non";
               if(var2 != null) {
                  if(var12 == "Non") {
                     class_871.method_5139("hud.pourcent", "Oui");
                     if(var2 != null) {
                        break label113;
                     }
                  }

                  var4 = field_935;
                  var12 = "hud.pourcent";
                  var11 = "Non";
               }

               class_871.method_5139(var12, var11);
            }

            this.field_557.method_5236(this.field_557.enableBackgroundDrawing6);
            class_871.method_5140();
         }

         var10000 = var1.field_450;
         var10001 = 400;
      }

      if(var10000 == var10001) {
         label105: {
            var4 = field_935;
            var12 = class_871.method_5138("hud.activated");
            var11 = "Non";
            if(var2 != null) {
               if(var12 == "Non") {
                  class_871.method_5139("hud.activated", "Oui");
                  if(var2 != null) {
                     break label105;
                  }
               }

               var4 = field_935;
               var12 = "hud.activated";
               var11 = "Non";
            }

            class_871.method_5139(var12, var11);
         }

         this.field_557.method_5236(this.field_557.enableBackgroundDrawing6);
         class_871.method_5140();
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.drawCenteredString(this.fontRendererObj, this.field_934, this.width / 2, 15, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1115() {
      // $FF: Couldn't be decompiled
   }
}

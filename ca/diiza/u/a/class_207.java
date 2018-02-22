package ca.diiza.u.a;

import ca.diiza.u.class_687;
import ca.diiza.u.a.class_157;

// $FF: renamed from: ca.diiza.u.a.b
public class class_207 extends bdw {

   // $FF: renamed from: b bdw
   private bdw field_971;
   // $FF: renamed from: i bcb
   private bcb field_972;
   // $FF: renamed from: r bcb
   private bcb field_973;
   // $FF: renamed from: s bcb
   private bcb field_974;
   // $FF: renamed from: t bcb
   private bcb field_975;
   // $FF: renamed from: u bcb
   private bcb field_976;
   // $FF: renamed from: v bcb
   private bcb field_977;
   // $FF: renamed from: w bcb
   private bcb field_978;
   // $FF: renamed from: x ca.diiza.u.a.a
   private class_157 field_979;
   // $FF: renamed from: y ca.diiza.u.a.a
   private class_157 field_980;
   // $FF: renamed from: z ca.diiza.u.a.a
   private class_157 field_981;
   // $FF: renamed from: A bcb
   private bcb field_982;
   // $FF: renamed from: B boolean
   private boolean field_983;
   // $FF: renamed from: C boolean
   private boolean field_984;
   // $FF: renamed from: D int
   private int field_985;
   // $FF: renamed from: E int
   private int field_986;
   // $FF: renamed from: F byte
   private byte field_987;
   // $FF: renamed from: G boolean
   private static boolean field_988;
   // $FF: renamed from: H java.lang.String[]
   private static final String[] field_989;


   // $FF: renamed from: <init> (bdw) void
   public void method_1142(bdw var1) {
      super.method_651();
      this.field_987 = -16;
      this.field_971 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      boolean var10000 = method_1147();
      this.buttonList.clear();
      this.field_985 = this.height / 4 - 52;
      boolean var1 = var10000;
      this.field_986 = this.height - 29;
      bcb var10001 = new bcb;
      var10001.method_748(1, this.width / 2 - 98, this.method_1143(1), 60, 20, String.valueOf(class_687.field_2947));
      this.field_972 = var10001;
      var10001 = new bcb;
      var10001.method_748(2, this.width / 2 + 102, this.method_1143(1), 60, 20, String.valueOf(class_687.field_2946));
      this.field_973 = var10001;
      var10001 = new bcb;
      var10001.method_748(3, this.width / 2 + 2, this.method_1143(2), 60, 20, String.valueOf(class_687.field_2948));
      this.field_974 = var10001;
      class_157 var4 = new class_157;
      int var10004 = this.width / 2 + 2;
      int var10005 = this.method_1143(3);
      String[] var3 = field_989;
      var4.method_833(50, var10004, var10005, 150, 20, "X Pos: ", 1.0F, (float)(this.width - 25), (float)class_687.field_2949, true);
      this.field_979 = var4;
      var4 = new class_157;
      var4.method_833(60, this.width / 2 + 2, this.method_1143(4), 150, 20, "Y Pos: ", 1.0F, (float)(this.height - 8), (float)class_687.field_2950, true);
      this.field_980 = var4;
      var10001 = new bcb;
      var10001.method_748(4, this.width / 2 + 2, this.method_1143(5), 60, 20, String.valueOf(class_687.field_2951));
      this.field_975 = var10001;
      var10001 = new bcb;
      var10001.method_748(5, this.width / 2 + 2, this.method_1143(6), 60, 20, String.valueOf(class_687.field_2952));
      this.field_976 = var10001;
      var4 = new class_157;
      var4.method_833(70, this.width / 2 + 2, this.method_1143(7), 150, 20, "x", 0.0F, 10.0F, (float)class_687.field_2953, false);
      this.field_981 = var4;
      var10001 = new bcb;
      var10001.method_748(100, this.width / 2 - 155, this.field_986, 150, 20, "Sauvegarder");
      this.field_977 = var10001;
      var10001 = new bcb;
      var10001.method_748(110, this.width / 2 + 5, this.field_986, 150, 20, "Annuler");
      this.field_978 = var10001;
      this.buttonList.add(this.field_972);
      this.buttonList.add(this.field_973);
      this.buttonList.add(this.field_974);
      this.buttonList.add(this.field_979);
      this.buttonList.add(this.field_980);
      this.buttonList.add(this.field_975);
      this.buttonList.add(this.field_976);
      this.buttonList.add(this.field_981);
      this.buttonList.add(this.field_977);
      this.buttonList.add(this.field_978);
      if(!var1) {
         int var2 = class_689.method_3977();
         ++var2;
         class_689.method_3975(var2);
      }

   }

   // $FF: renamed from: a (int) int
   public int method_1143(int var1) {
      return this.height / 4 + 0 + (24 * var1 - 24) + this.field_987;
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      boolean var4 = method_1146();
      int var10000 = var3;
      if(!var4) {
         if(var3 != 0) {
            return;
         }

         var10000 = 0;
      }

      int var5 = var10000;

      while(var5 < this.buttonList.size()) {
         bcb var6 = (bcb)this.buttonList.get(var5);
         if(!var4) {
            if(var6.method_753(this.field_557, var1, var2)) {
               this.field_982 = var6;
               this.method_865(var6);
            }

            ++var5;
         }

         if(var4) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int, int, int) void
   protected void method_863(int var1, int var2, int var3) {
      if(this.field_982 != null && var3 == 0) {
         this.field_982.method_752(var1, var2);
         this.method_1144(this.field_982);
         this.field_982 = null;
      }

   }

   // $FF: renamed from: b (bcb) void
   protected void method_1144(bcb var1) {
      if(var1 instanceof class_157) {
         this.method_865(var1);
      }

   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      label136: {
         boolean var2;
         boolean var3;
         label132: {
            label131: {
               label130: {
                  label137: {
                     label138: {
                        label139: {
                           label140: {
                              label141: {
                                 var2 = method_1147();
                                 int var10000 = var1.field_450;
                                 if(var2) {
                                    switch(var1.field_450) {
                                    case 1:
                                       var10000 = class_687.field_2947;
                                       break;
                                    case 2:
                                       break label141;
                                    case 3:
                                       break label140;
                                    case 4:
                                       break label139;
                                    case 5:
                                       break label138;
                                    case 50:
                                       break label137;
                                    case 60:
                                       break label130;
                                    case 70:
                                       break label131;
                                    case 100:
                                       break label132;
                                    case 110:
                                       break label136;
                                    default:
                                       return;
                                    }
                                 }

                                 if(var2) {
                                    var10000 = var10000 == 0?1:0;
                                 }

                                 class_687.field_2947 = (boolean)var10000;
                                 this.field_972.field_449 = String.valueOf(class_687.field_2947);
                                 if(var2) {
                                    return;
                                 }
                              }

                              var3 = class_687.field_2946;
                              if(var2) {
                                 var3 = !class_687.field_2946;
                              }

                              class_687.field_2946 = var3;
                              this.field_973.field_449 = String.valueOf(class_687.field_2946);
                              this.field_984 = true;
                              if(var2) {
                                 return;
                              }
                           }

                           var3 = class_687.field_2948;
                           if(var2) {
                              var3 = !class_687.field_2948;
                           }

                           class_687.field_2948 = var3;
                           this.field_974.field_449 = String.valueOf(class_687.field_2948);
                           this.field_983 = true;
                           if(var2) {
                              return;
                           }
                        }

                        var3 = class_687.field_2951;
                        if(var2) {
                           var3 = !class_687.field_2951;
                        }

                        class_687.field_2951 = var3;
                        this.field_975.field_449 = String.valueOf(class_687.field_2951);
                        if(var2) {
                           return;
                        }
                     }

                     var3 = class_687.field_2952;
                     if(var2) {
                        var3 = !class_687.field_2952;
                     }

                     class_687.field_2952 = var3;
                     this.field_976.field_449 = String.valueOf(class_687.field_2952);
                     if(var2) {
                        return;
                     }
                  }

                  class_687.field_2949 = this.field_979.method_835();
                  if(var2) {
                     return;
                  }
               }

               class_687.field_2950 = this.field_980.method_835();
               if(var2) {
                  return;
               }
            }

            class_687.field_2953 = (double)this.field_981.method_834();
            if(var2) {
               return;
            }
         }

         bao var6;
         label77: {
            class_207 var5;
            label142: {
               var3 = this.field_983;
               if(var2) {
                  if(this.field_983) {
                     bbv var4 = bao.method_5273().canLoseFocus4;
                     bbv.SetHUDText("");
                  }

                  var5 = this;
                  if(!var2) {
                     break label142;
                  }

                  var3 = this.field_984;
               }

               if(var3) {
                  var6 = this.field_557;
                  if(!var2) {
                     break label77;
                  }

                  if(this.field_557.cursorCounter6 != null) {
                     class_687.field_2954 = true;
                  }
               }

               class_687.method_3712();
               this.field_983 = false;
               this.field_984 = false;
               var5 = this;
            }

            var6 = var5.field_557;
         }

         var6.method_5236(this.field_971);
         if(var2) {
            return;
         }
      }

      class_687.method_3711();
      this.field_557.method_5236(this.field_971);
      this.field_983 = false;
      this.field_984 = false;
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var13 = field_989;
      String var5 = "Activer ToggleSneak";
      String var6 = "Activer ToggleSprint";
      String var7 = "Afficher le HUD";
      String var8 = "Position horizontal du HUD";
      String var9 = "Position vertical du HUD";
      String var10 = "Activer le double-tapping";
      String var11 = "Activer le fly boost";
      String var12 = "Fly boost X";
      this.method_873();
      boolean var10000 = method_1147();
      this.drawCenteredString(this.fontRendererObj, "ToggleMod - Options", this.width / 2, this.field_985, 16777215);
      this.method_657(this.fontRendererObj, var5, this.width / 2 - 100 - this.fontRendererObj.getCharWidth(var5), this.method_1143(1) + 6, 16777215);
      this.method_657(this.fontRendererObj, var6, this.width / 2 + 100 - this.fontRendererObj.getCharWidth(var6), this.method_1143(1) + 6, 16777215);
      this.method_657(this.fontRendererObj, var7, this.width / 2 - 3 - this.fontRendererObj.getCharWidth(var7), this.method_1143(2) + 6, 16777215);
      boolean var4 = var10000;
      this.method_657(this.fontRendererObj, var8, this.width / 2 - 3 - this.fontRendererObj.getCharWidth(var8), this.method_1143(3) + 6, 16777215);
      this.method_657(this.fontRendererObj, var9, this.width / 2 - 3 - this.fontRendererObj.getCharWidth(var9), this.method_1143(4) + 6, 16777215);
      this.method_657(this.fontRendererObj, var10, this.width / 2 - 3 - this.fontRendererObj.getCharWidth(var10), this.method_1143(5) + 6, 16777215);
      this.method_657(this.fontRendererObj, var11, this.width / 2 - 3 - this.fontRendererObj.getCharWidth(var11), this.method_1143(6) + 6, 16777215);
      this.method_657(this.fontRendererObj, var12, this.width / 2 - 3 - this.fontRendererObj.getCharWidth(var12), this.method_1143(7) + 6, 16777215);
      super.drawScreen(var1, var2, var3);
      if(class_689.method_3976() != 0) {
         method_1145(!var4);
      }

   }

   // $FF: renamed from: a (boolean) void
   public static void method_1145(boolean var0) {
      field_988 = var0;
   }

   // $FF: renamed from: a () boolean
   public static boolean method_1146() {
      return field_988;
   }

   // $FF: renamed from: f () boolean
   public static boolean method_1147() {
      boolean var0 = method_1146();
      return !var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1148() {
      // $FF: Couldn't be decompiled
   }
}

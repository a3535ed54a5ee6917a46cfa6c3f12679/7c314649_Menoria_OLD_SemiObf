package ca.diiza.f;

import ca.diiza.f.class_158;
import ca.diiza.f.class_159;
import ca.diiza.f.class_209;
import ca.diiza.f.class_212;
import ca.diiza.f.class_231;
import ca.diiza.f.class_235;
import ca.diiza.f.class_239;
import ca.diiza.n.class_351;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: ca.diiza.f.q
public class class_213 extends class_212 {

   // $FF: renamed from: i long
   private long field_1014;
   // $FF: renamed from: r int
   private int field_1015;
   // $FF: renamed from: s int
   private int field_1016;
   // $FF: renamed from: t int
   private int field_1017;
   // $FF: renamed from: u int
   private int field_1018;
   // $FF: renamed from: v int
   private int field_1019;
   // $FF: renamed from: w int
   private int field_1020;
   // $FF: renamed from: x int
   private int field_1021;
   // $FF: renamed from: y int
   private int field_1022;
   // $FF: renamed from: z int
   private int field_1023;
   // $FF: renamed from: A int
   private int field_1024;
   // $FF: renamed from: B int
   private int field_1025;
   // $FF: renamed from: C int
   private int field_1026;
   // $FF: renamed from: D k_
   private GuiTextField field_1027;
   // $FF: renamed from: E int
   private int field_1028;
   // $FF: renamed from: F int
   private int field_1029;
   // $FF: renamed from: G int
   private int field_1030;
   // $FF: renamed from: H int
   private int field_1031;
   // $FF: renamed from: I ca.diiza.f.w
   private class_231 field_1032;
   // $FF: renamed from: J ca.diiza.f.w
   private class_231 field_1033;
   // $FF: renamed from: K ca.diiza.f.l
   private class_158 field_1034;
   // $FF: renamed from: L add
   private add field_1035;
   // $FF: renamed from: M int
   private int field_1036;
   // $FF: renamed from: N int
   private int field_1037;
   // $FF: renamed from: O add
   private add field_1038;
   // $FF: renamed from: P int
   private int field_1039;
   // $FF: renamed from: Q int
   private int field_1040;
   // $FF: renamed from: R java.lang.String
   public String field_1041;
   // $FF: renamed from: S long
   private long field_1042;
   // $FF: renamed from: T long
   private long field_1043;
   // $FF: renamed from: U ca.diiza.f.k
   private class_159 field_1044;
   // $FF: renamed from: V ca.diiza.f.k
   private class_159 field_1045;
   // $FF: renamed from: W java.util.ArrayList
   ArrayList<add> field_1046;
   // $FF: renamed from: X java.lang.String[]
   private static final String[] field_1047;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
      this.field_1014 = 0L;
      this.field_1015 = 250;
      this.field_1016 = 175;
      this.field_1017 = 36;
      this.field_1018 = 9;
      this.field_1020 = 20;
      this.field_1031 = 20;
      this.field_1035 = null;
      this.field_1042 = 2000L;
      this.field_1043 = 0L;
      this.field_1046 = new ArrayList();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      int var1;
      int var10001;
      label18: {
         super.initGui();
         int var10000 = class_209.method_1160();
         Keyboard.enableRepeatEvents(true);
         this.field_1021 = this.width / 2;
         this.field_1022 = this.height / 2;
         this.field_1023 = this.field_1021 - this.field_1015 / 2;
         var1 = var10000;
         this.field_1024 = this.field_1022 - this.field_1016 / 2;
         this.field_1025 = this.field_1023 + this.field_1015 / 2 - this.field_1018 * this.field_1020 / 2;
         this.field_1026 = this.field_1024 + 10;
         this.field_1036 = this.field_1025;
         this.field_1037 = this.field_1026 + this.field_1017 / this.field_1018 * this.field_1020 + 10;
         var10001 = this.field_1017 % this.field_1018;
         if(var1 == 0) {
            if(var10001 == 0) {
               var10001 = this.field_1017 / this.field_1018;
               break label18;
            }

            var10001 = this.field_1017 / this.field_1018;
         }

         ++var10001;
      }

      this.field_1019 = var10001;
      List var2 = this.buttonList;
      class_159 var10002 = new class_159;
      var10002.method_842(1, this.field_1036 + 10 + 20, this.field_1037 + this.field_1020 / 2 - 7, false);
      var2.add(this.field_1044 = var10002);
      var2 = this.buttonList;
      var10002 = new class_159;
      var10002.method_842(2, this.field_1036 + 20 + 20 + 5, this.field_1037 + this.field_1020 / 2 - 7, true);
      var2.add(this.field_1045 = var10002);
      GuiTextField var4 = new GuiTextField;
      var4.GuiTextField(this.fontRendererObj, this.field_1028 = this.field_1036, this.field_1029 = this.field_1037 + this.field_1020 + 10, this.field_1030 = (this.field_1018 * this.field_1020 - 20) / 3 + 1 - 10, this.field_1031);
      this.field_1027 = var4;
      this.field_1027.setMaxStringLength(10);
      this.field_1027.setEnableBackgroundDrawing(true);
      this.field_1027.setCanLoseFocus(true);
      this.field_1027.setDisabledTextColour(-256);
      this.field_1027.setVisible(true);
      this.field_1027.writeText("");
      class_231 var5 = new class_231;
      var5.method_1252(this, this.field_1028 + this.field_1030 * 2 + 20, this.field_1029, this.field_1030, this.field_1031, class_235.class);
      this.field_1032 = var5;
      var5 = new class_231;
      var5.method_1252(this, this.field_1028 + this.field_1030 + 10, this.field_1029, this.field_1030, this.field_1031, class_239.class);
      this.field_1033 = var5;
      var2 = this.buttonList;
      class_158 var3 = new class_158;
      var3.method_839(3, this.field_1028 + this.field_1030 + 116, this.field_1029);
      var2.add(this.field_1034 = var3);
      this.field_1044.field_451 = false;
      this.field_1045.field_451 = false;
      if(class_689.method_3977() == 0) {
         ++var1;
         class_209.method_1158(var1);
      }

   }

   // $FF: renamed from: m () void
   public void method_872() {
      super.method_872();
      Keyboard.enableRepeatEvents(false);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      int var10000 = class_209.method_1160();
      this.field_1046 = this.method_1180();
      this.method_1168(bmh.instance, (double)this.field_1023, (double)(this.field_1023 + this.field_1015), (double)this.field_1024, (double)(this.field_1024 + this.field_1016), 0.3F, 0.3F, 0.3F, 0.5F);
      int var5 = this.method_1176(var1, var2);
      add var6 = null;
      int var4 = var10000;
      int var7 = 0;

      class_213 var15;
      label165: {
         label164: {
            int var10001;
            while(true) {
               add var14;
               if(var7 < this.field_1017) {
                  int var8 = var7 % this.field_1018;
                  int var9 = var7 / this.field_1018;
                  int var10 = this.field_1025 + var8 * this.field_1020;
                  int var11 = this.field_1026 + var9 * this.field_1020;
                  add var12 = null;
                  var10000 = var7;
                  var10001 = this.field_1046.size();
                  if(var4 != 0) {
                     break;
                  }

                  if(var7 < var10001) {
                     var12 = (add)this.field_1046.get(var7);
                  }

                  label151: {
                     if(var5 == var7) {
                        this.method_1169(bmh.instance, (double)var10, (double)(var10 + this.field_1020 + 1), (double)var11, (double)(var11 + this.field_1020 + 1), 1.0F, 1.0F, 1.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F);
                        var6 = var12;
                        if(var4 == 0) {
                           break label151;
                        }
                     }

                     this.method_1169(bmh.instance, (double)var10, (double)(var10 + this.field_1020 + 1), (double)var11, (double)(var11 + this.field_1020 + 1), 0.3F, 0.3F, 0.3F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F);
                  }

                  label146: {
                     label171: {
                        var14 = var12;
                        if(var4 == 0) {
                           if(var12 == null) {
                              break label146;
                           }

                           var15 = this;
                           if(var4 != 0) {
                              break label171;
                           }

                           var14 = this.field_1035;
                        }

                        if(var14 != null && var12.equals(this.field_1035)) {
                           break label146;
                        }

                        var15 = this;
                     }

                     var15.method_1170(var12, var10 + this.field_1020 / 2 - 8, var11 + this.field_1020 / 2 - 8);
                  }

                  ++var7;
                  if(var4 == 0) {
                     continue;
                  }
               }

               label119: {
                  var15 = this;
                  if(var4 == 0) {
                     if(!this.method_1178(var1, var2, this.field_1036, this.field_1037, this.field_1020 + 1, this.field_1020 + 1)) {
                        this.method_1169(bmh.instance, (double)this.field_1036, (double)(this.field_1036 + this.field_1020 + 1), (double)this.field_1037, (double)(this.field_1037 + this.field_1020 + 1), 0.3F, 0.3F, 0.3F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F);
                        if(var4 == 0) {
                           break label119;
                        }
                     }

                     var15 = this;
                  }

                  var15.method_1169(bmh.instance, (double)this.field_1036, (double)(this.field_1036 + this.field_1020 + 1), (double)this.field_1037, (double)(this.field_1037 + this.field_1020 + 1), 1.0F, 1.0F, 1.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F);
               }

               var14 = this.field_1038;
               if(var4 == 0) {
                  if(this.field_1038 != null) {
                     label106: {
                        label105: {
                           var14 = this.field_1035;
                           if(var4 == 0) {
                              if(this.field_1035 == null) {
                                 this.method_1172(this.field_1038, this.field_1040, this.field_1036 + this.field_1020 / 2 - 8, this.field_1037 + this.field_1020 / 2 - 8);
                                 if(var4 == 0) {
                                    break label105;
                                 }
                              }

                              var15 = this;
                              if(var4 != 0) {
                                 break label106;
                              }

                              var14 = this.field_1038;
                           }

                           if(!var14.equals(this.field_1035)) {
                              this.method_1170(this.field_1038, this.field_1036 + this.field_1020 / 2 - 8, this.field_1037 + this.field_1020 / 2 - 8);
                           }
                        }

                        var15 = this;
                     }

                     var15.method_657(this.fontRendererObj, this.field_1040 + "/" + this.field_1039, this.field_1045.method_843() + this.field_1045.method_845() + 10, this.field_1037 + this.field_1020 / 2 - this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2, 16777215);
                  }

                  this.field_1027.drawTextBox();
                  this.field_1032.method_1253(var1, var2);
                  this.field_1033.method_1253(var1, var2);
                  var14 = var6;
               }

               label96: {
                  label95: {
                     if(var4 == 0) {
                        label175: {
                           if(var14 != null) {
                              var14 = this.field_1035;
                              if(var4 != 0) {
                                 break label175;
                              }

                              if(this.field_1035 == null) {
                                 this.method_1174(var6, var1, var2);
                                 if(var4 == 0) {
                                    break label95;
                                 }
                              }
                           }

                           var15 = this;
                           if(var4 != 0) {
                              break label96;
                           }

                           var14 = this.field_1035;
                        }
                     }

                     if(var14 != null) {
                        this.method_1173(this.field_1035, var1 - 8, var2 - 8, 400.0F);
                     }
                  }

                  var15 = this;
               }

               label133: {
                  String var18 = var15.field_1041;
                  if(var4 == 0) {
                     if(var15.field_1041 != null) {
                        this.drawCenteredString(this.field_557.enableBackgroundDrawing4, this.field_1041, this.field_1023 + this.field_1015 / 2, (this.field_1024 + this.field_1016 + this.field_1034.method_840() + this.field_1034.method_841()) / 2 - this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2, 16777215);
                        long var20;
                        var10000 = (var20 = System.currentTimeMillis() - this.field_1043 - this.field_1042) == 0L?0:(var20 < 0L?-1:1);
                        if(var4 != 0) {
                           break label133;
                        }

                        if(var10000 >= 0) {
                           this.field_1041 = null;
                        }
                     }

                     var15 = this;
                     if(var4 != 0) {
                        break label165;
                     }

                     var18 = this.field_1027.method_714();
                  }

                  var10000 = var18.isEmpty();
               }

               if(var10000 != 0) {
                  break label164;
               }

               var15 = this;
               if(var4 != 0) {
                  break label165;
               }

               var10000 = Integer.valueOf(this.field_1027.method_714()).intValue();
               var10001 = 10;
               break;
            }

            var7 = var10000 / var10001;
            if(var7 == 0) {
               boolean var13 = true;
            }
         }

         var15 = this;
      }

      boolean var17;
      label81: {
         label80: {
            class_213 var16 = this;
            if(var4 == 0) {
               if(this.field_1027.method_714().isEmpty()) {
                  break label80;
               }

               var16 = this;
            }

            if(var16.field_1038 != null) {
               var17 = true;
               break label81;
            }
         }

         var17 = false;
      }

      var15.field_1034.field_451 = var17;
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
   }

   // $FF: renamed from: b (int, int) int
   public int method_1176(int var1, int var2) {
      int var3 = class_209.method_1159();
      byte var10000 = this.method_1178(var1, var2, this.field_1025, this.field_1026, this.field_1018 * this.field_1020, this.field_1019 * this.field_1020);
      if(var3 != 0) {
         if(var10000 != 0) {
            int var4 = (var1 - this.field_1025) / this.field_1020;
            int var5 = (var2 - this.field_1026) / this.field_1020;
            int var6 = var5 * this.field_1018 + var4;
            return var6;
         }

         var10000 = -1;
      }

      return var10000;
   }

   // $FF: renamed from: b (int) void
   public void method_1177(int var1) {
      int var10001;
      int var2;
      label37: {
         var2 = class_209.method_1159();
         var10001 = var1;
         int var10002 = this.field_1039;
         if(var2 != 0) {
            if(var1 > this.field_1039) {
               var10001 = this.field_1039;
               break label37;
            }

            var10001 = var1;
            if(var2 == 0) {
               break label37;
            }

            var10002 = 1;
         }

         var10001 = var10001 < var10002?1:var1;
      }

      this.field_1040 = var10001;
      var10001 = this.field_1040;
      if(var2 != 0) {
         var10001 = this.field_1040 != 1?1:0;
      }

      this.field_1044.field_451 = (boolean)var10001;
      var10001 = this.field_1040;
      if(var2 != 0) {
         var10001 = this.field_1040 != this.field_1039?1:0;
      }

      this.field_1045.field_451 = (boolean)var10001;
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      int var10000 = class_209.method_1159();
      this.field_1027.method_727(var1, var2, var3);
      int var4 = var10000;
      class_213 var6 = this;
      if(var4 != 0) {
         if(this.field_1035 == null) {
            this.field_1032.method_1254(var1, var2);
            this.field_1033.method_1254(var1, var2);
            var10000 = this.field_1032.method_1257();
            if(var4 != 0) {
               if(var10000 != 0) {
                  this.field_1032.method_1258(false);
                  if(var4 != 0) {
                     return;
                  }
               }

               var10000 = this.field_1033.method_1257();
            }

            if(var4 != 0) {
               if(var10000 != 0) {
                  this.field_1033.method_1258(false);
                  if(var4 != 0) {
                     return;
                  }
               }

               var10000 = this.method_1176(var1, var2);
            }

            label96: {
               label97: {
                  int var5 = var10000;
                  var10000 = var5;
                  if(var4 != 0) {
                     label98: {
                        if(var5 != -1) {
                           var10000 = var5;
                           if(var4 == 0) {
                              break label98;
                           }

                           if(var5 < this.field_1046.size()) {
                              var6 = this;
                              if(var4 != 0) {
                                 label57: {
                                    if(this.field_1033.method_1255().method_1() == 1) {
                                       var6 = this;
                                       if(var4 == 0) {
                                          break label57;
                                       }

                                       if(((add)this.field_1046.get(var5)).method_3730() == class_1010.field_5287) {
                                          this.method_1181(3);
                                          return;
                                       }
                                    }

                                    var6 = this;
                                 }
                              }

                              var6.field_1035 = (add)this.field_1046.get(var5);
                              if(var4 != 0) {
                                 break label96;
                              }
                           }
                        }

                        var6 = this;
                        if(var4 == 0) {
                           break label97;
                        }

                        var10000 = this.method_1178(var1, var2, this.field_1036, this.field_1037, this.field_1020, this.field_1020);
                     }
                  }

                  if(var10000 == 0) {
                     break label96;
                  }

                  var6 = this;
               }

               if(var4 != 0) {
                  if(var6.field_1038 == null) {
                     break label96;
                  }

                  var6 = this;
               }

               var6.field_1035 = this.field_1038;
            }

            if(var4 != 0) {
               return;
            }
         }

         var6 = this;
      }

      if(var4 != 0) {
         if(var6.method_1178(var1, var2, this.field_1036, this.field_1037, this.field_1020, this.field_1020)) {
            this.field_1038 = this.field_1035;
            this.field_1039 = this.method_1179(this.field_1038);
            this.method_1177(this.field_1035.field_2958);
            this.field_1035 = null;
            if(var4 != 0) {
               return;
            }
         }

         this.field_1038 = null;
         this.field_1044.field_451 = false;
         this.field_1045.field_451 = false;
         var6 = this;
      }

      var6.field_1035 = null;
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      int var10000 = class_209.method_1160();
      super.method_856(var1, var2);
      this.field_1027.method_726(var1, var2);
      int var3 = var10000;
      String var5 = this.field_1027.method_714();
      String[] var4 = field_1047;
      var10000 = var5.matches("[0-9]+");
      if(var3 == 0) {
         if(var10000 == 0) {
            this.field_1027.writeText(this.field_1027.method_714().replaceAll("[^0-9]", ""));
         }

         var10000 = this.field_1027.method_714().length();
      }

      if(var3 == 0) {
         if(var10000 <= 0) {
            return;
         }

         var10000 = Integer.valueOf(this.field_1027.method_714()).intValue();
      }

      GuiTextField var6;
      label44: {
         if(var3 == 0) {
            if(var10000 > 100000) {
               String[] var10001 = field_1047;
               this.field_1027.writeText("100000");
               if(var3 == 0) {
                  return;
               }
            }

            var6 = this.field_1027;
            if(var3 != 0) {
               break label44;
            }

            var10000 = Integer.valueOf(this.field_1027.method_714()).intValue();
         }

         if(var10000 != 0) {
            return;
         }

         var6 = this.field_1027;
      }

      var6.writeText("");
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      int var2 = class_209.method_1159();
      int var10000 = method_878();
      if(var2 != 0) {
         var10000 = var10000 != 0?10:1;
      }

      int var3 = var10000;
      var10000 = var1.field_450;
      int var10001 = this.field_1044.field_450;
      if(var2 != 0) {
         if(var1.field_450 == this.field_1044.field_450) {
            this.method_1177(this.field_1040 - var3);
            if(var2 != 0) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = this.field_1045.field_450;
      }

      if(var2 != 0) {
         if(var10000 == var10001) {
            this.method_1177(this.field_1040 + var3);
            if(var2 != 0) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = this.field_1034.field_450;
      }

      if(var10000 == var10001) {
         class_213 var7 = this;
         if(var2 != 0) {
            if(this.field_1038 == null) {
               return;
            }

            var7 = this;
         }

         long var9;
         var10000 = (var9 = var7.field_1014 - 0L) == 0L?0:(var9 < 0L?-1:1);
         if(var2 != 0) {
            label68: {
               if(var10000 != 0) {
                  long var10;
                  var10000 = (var10 = this.field_1014 + 5000L - System.currentTimeMillis()) == 0L?0:(var10 < 0L?-1:1);
                  if(var2 == 0) {
                     break label68;
                  }

                  if(var10000 >= 0) {
                     return;
                  }
               }

               var10000 = Integer.valueOf(this.field_1027.method_714()).intValue();
            }
         }

         label60: {
            label59: {
               int var4;
               label94: {
                  var4 = var10000;
                  var10000 = var4;
                  if(var2 != 0) {
                     if(var4 <= 0) {
                        break label59;
                     }

                     var7 = this;
                     if(var2 == 0) {
                        break label94;
                     }

                     var10000 = this.field_1033.method_1255().method_1();
                  }

                  add var5;
                  label47: {
                     if(var10000 == 1) {
                        var5 = this.field_1038;
                        if(var2 == 0) {
                           break label47;
                        }

                        if(this.field_1038.method_3730() == class_1010.field_5287) {
                           this.method_1181(3);
                           return;
                        }
                     }

                     var5 = this.field_1038;
                  }

                  var5.field_2958 = this.field_1040;
                  var7 = this;
               }

               class_1436 var6 = var7.field_557.method_5267();
               class_351 var8 = new class_351;
               add var10003 = this.field_1038;
               class_1583 var10004 = new class_1583;
               var10004.method_8628();
               var8.method_2023(var10003.method_3737(var10004), this.field_1033.method_1255().method_1(), var4, ((class_235)this.field_1032.method_1255()).method_1284());
               var6.method_7821(var8);
               if(var2 != 0) {
                  break label60;
               }
            }

            this.method_1181(1);
         }

         this.field_1014 = System.currentTimeMillis();
      }

   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return false;
   }

   // $FF: renamed from: a (int, int, int, int, int, int) boolean
   public boolean method_1178(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var10000;
      label40: {
         int var7 = class_209.method_1160();
         var10000 = var1;
         int var10001 = var3;
         if(var7 == 0) {
            if(var1 <= var3) {
               break label40;
            }

            var10000 = var1;
            var10001 = var3 + var5;
         }

         if(var7 == 0) {
            if(var10000 >= var10001) {
               break label40;
            }

            var10000 = var2;
            var10001 = var4;
         }

         if(var7 == 0) {
            if(var10000 <= var10001) {
               break label40;
            }

            var10000 = var2;
            if(var7 != 0) {
               return (boolean)var10000;
            }

            var10001 = var4 + var6;
         }

         if(var10000 < var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (add) int
   public int method_1179(add var1) {
      int var3 = 0;
      int var10000 = class_209.method_1159();
      add[] var4 = this.field_557.cursorCounter8.field_3616.field_2844;
      int var2 = var10000;
      int var5 = var4.length;
      int var6 = 0;

      add var8;
      while(true) {
         if(var6 < var5) {
            add var7 = var4[var6];
            if(var2 != 0) {
               var8 = var7;
               if(var2 == 0) {
                  break;
               }

               if(var7 != null) {
                  label32: {
                     var10000 = var7.method_3758(var1);
                     if(var2 != 0) {
                        if(var10000 == 0) {
                           break label32;
                        }

                        var10000 = var3 + var7.field_2958;
                     }

                     var3 = var10000;
                  }
               }

               ++var6;
            }

            if(var2 != 0) {
               continue;
            }
         }

         var10000 = var3;
         if(var2 == 0) {
            return var10000;
         }

         if(var3 <= var1.method_3739()) {
            var10000 = var3;
            return var10000;
         }

         var8 = var1;
         break;
      }

      var10000 = var8.method_3739();
      return var10000;
   }

   // $FF: renamed from: f () java.util.ArrayList
   public ArrayList<add> method_1180() {
      ArrayList var2 = new ArrayList();
      add[] var3 = this.field_557.cursorCounter8.field_3616.field_2844;
      int var10000 = class_209.method_1159();
      int var4 = var3.length;
      int var1 = var10000;
      int var5 = 0;

      while(var5 < var4) {
         add var6 = var3[var5];
         if(var1 != 0) {
            if(var6 != null) {
               var2.add(var6);
            }

            ++var5;
         }

         if(var1 == 0) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: d (int) void
   public void method_1181(int var1) {
      label36: {
         label35: {
            int var2;
            label34: {
               String[] var3;
               label33: {
                  label32: {
                     var2 = class_209.method_1159();
                     if(var2 != 0) {
                        switch(var1) {
                        case 0:
                           var3 = field_1047;
                           this.field_1041 = "Mise en vente réussite!";
                           this.field_1038 = null;
                           this.field_1044.field_451 = false;
                           this.field_1045.field_451 = false;
                           this.field_1035 = null;
                           this.field_1027.writeText("");
                           break;
                        case 1:
                           break label32;
                        case 2:
                           break label33;
                        case 3:
                           break label34;
                        default:
                           break label35;
                        }
                     }

                     if(var2 != 0) {
                        break label36;
                     }
                  }

                  var3 = field_1047;
                  this.field_1041 = "Le prix de vente doit être supérieur à 0 euro!";
                  if(var2 != 0) {
                     break label36;
                  }
               }

               var3 = field_1047;
               this.field_1041 = "Vous ne pouvez pas avoir plus de 5 ventes!";
               if(var2 != 0) {
                  break label36;
               }
            }

            String[] var10001 = field_1047;
            this.field_1041 = "Vous ne pouvez pas vendre ça contre de l\'ambre!";
            if(var2 != 0) {
               break label36;
            }
         }

         this.field_1041 = null;
      }

      this.field_1043 = System.currentTimeMillis();
   }

   // $FF: renamed from: <clinit> () void
   static void method_1182() {
      // $FF: Couldn't be decompiled
   }
}

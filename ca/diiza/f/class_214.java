package ca.diiza.f;

import ca.diiza.f.class_159;
import ca.diiza.f.class_163;
import ca.diiza.f.class_209;
import ca.diiza.f.class_212;
import ca.diiza.f.class_213;
import ca.diiza.f.class_231;
import ca.diiza.f.class_236;
import ca.diiza.f.class_240;
import ca.diiza.m.a;
import ca.diiza.m.class_1664;
import ca.diiza.n.class_350;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: ca.diiza.f.p
public class class_214 extends class_212 {

   // $FF: renamed from: i long
   private long field_1048;
   // $FF: renamed from: r int
   private int field_1049;
   // $FF: renamed from: s int
   private int field_1050;
   // $FF: renamed from: t int
   private int field_1051;
   // $FF: renamed from: u int
   private int field_1052;
   // $FF: renamed from: v int
   private int field_1053;
   // $FF: renamed from: w java.lang.String
   public String field_1054;
   // $FF: renamed from: x long
   private long field_1055;
   // $FF: renamed from: y long
   private long field_1056;
   // $FF: renamed from: z int
   private int field_1057;
   // $FF: renamed from: A ca.diiza.m.a
   private class_1664 field_1058;
   // $FF: renamed from: B java.util.ArrayList
   private ArrayList<a> field_1059;
   // $FF: renamed from: C ro[]
   private class_1583[] field_1060;
   // $FF: renamed from: D int
   private int field_1061;
   // $FF: renamed from: E int
   private int field_1062;
   // $FF: renamed from: F k_
   private GuiTextField field_1063;
   // $FF: renamed from: G int
   private int field_1064;
   // $FF: renamed from: H int
   private int field_1065;
   // $FF: renamed from: I int
   private int field_1066;
   // $FF: renamed from: J int
   private int field_1067;
   // $FF: renamed from: K ca.diiza.f.k
   private class_159 field_1068;
   // $FF: renamed from: L ca.diiza.f.k
   private class_159 field_1069;
   // $FF: renamed from: M int
   private int field_1070;
   // $FF: renamed from: N int
   private int field_1071;
   // $FF: renamed from: O ca.diiza.f.g
   private class_163 field_1072;
   // $FF: renamed from: P int
   private int field_1073;
   // $FF: renamed from: Q int
   private int field_1074;
   // $FF: renamed from: R ca.diiza.f.g
   private class_163 field_1075;
   // $FF: renamed from: S int
   private int field_1076;
   // $FF: renamed from: T int
   private int field_1077;
   // $FF: renamed from: U boolean
   private boolean field_1078;
   // $FF: renamed from: V ca.diiza.f.g
   private class_163 field_1079;
   // $FF: renamed from: W int
   private int field_1080;
   // $FF: renamed from: X int
   private int field_1081;
   // $FF: renamed from: Y ca.diiza.f.g
   private class_163 field_1082;
   // $FF: renamed from: Z int
   private int field_1083;
   // $FF: renamed from: aa int
   private int field_1084;
   // $FF: renamed from: ab int
   private int field_1085;
   // $FF: renamed from: ac int
   private int field_1086;
   // $FF: renamed from: ad ca.diiza.f.a
   private class_236 field_1087;
   // $FF: renamed from: ae int
   private int field_1088;
   // $FF: renamed from: af int
   private int field_1089;
   // $FF: renamed from: ag ca.diiza.f.w
   private class_231 field_1090;
   // $FF: renamed from: ah int
   private int field_1091;
   // $FF: renamed from: ai int
   private int field_1092;
   // $FF: renamed from: aj ca.diiza.f.e
   private class_240 field_1093;
   // $FF: renamed from: ak int
   private int field_1094;
   // $FF: renamed from: al int
   private int field_1095;
   // $FF: renamed from: am ca.diiza.f.w
   private class_231 field_1096;
   // $FF: renamed from: an int
   private int field_1097;
   // $FF: renamed from: ao int
   private int field_1098;
   // $FF: renamed from: ap int
   private int field_1099;
   // $FF: renamed from: aq int
   private int field_1100;
   // $FF: renamed from: ar int
   private int field_1101;
   // $FF: renamed from: as int
   private int field_1102;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] field_1103;


   // $FF: renamed from: <init> (ro[]) void
   public void method_1183(class_1583[] var1) {
      super.method_651();
      this.field_1048 = 0L;
      this.field_1049 = 6;
      this.field_1050 = 5;
      this.field_1055 = 2000L;
      this.field_1056 = 0L;
      this.field_1057 = -1;
      this.field_1062 = 0;
      this.field_1064 = 50;
      this.field_1065 = 18;
      this.field_1073 = 50;
      this.field_1074 = 20;
      this.field_1076 = 65;
      this.field_1077 = 20;
      this.field_1078 = false;
      this.field_1080 = 50;
      this.field_1081 = 20;
      this.field_1083 = 50;
      this.field_1084 = 20;
      this.field_1087 = class_236.ALL;
      this.field_1091 = 40;
      this.field_1092 = 15;
      this.field_1093 = class_240.NONE;
      this.field_1097 = 40;
      this.field_1098 = 15;
      this.field_1099 = 400;
      this.field_1100 = 200;
      this.field_1060 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      super.initGui();
      Keyboard.enableRepeatEvents(true);
      this.field_1085 = this.width / 2;
      this.field_1086 = this.height / 2;
      this.field_1101 = this.field_1085 - this.field_1099 / 2;
      this.field_1102 = this.field_1086 - this.field_1100 / 2;
      GuiTextField var10001 = new GuiTextField;
      var10001.GuiTextField(this.fontRendererObj, this.field_1066 = this.field_1101 + 10, this.field_1067 = this.field_1086 - this.field_1100 / 2 + 5, this.field_1064, this.field_1065);
      this.field_1063 = var10001;
      this.field_1063.setMaxStringLength(10);
      this.field_1063.setEnableBackgroundDrawing(true);
      this.field_1063.setCanLoseFocus(true);
      this.field_1063.setDisabledTextColour(-256);
      this.field_1063.setVisible(true);
      this.field_1063.writeText("");
      List var10000 = this.buttonList;
      class_163 var10002 = new class_163;
      int var10005 = this.field_1101 + this.field_1099 - this.field_1080 - 10;
      int var10006 = this.field_1102 + 5;
      int var10007 = this.field_1073;
      int var10008 = this.field_1074;
      StringBuilder var10009 = (new StringBuilder()).append(class_130.field_288);
      String[] var3 = field_1103;
      var10002.method_748(1, var10005, var10006, var10007, var10008, var10009.append("Fermer").toString());
      var10000.add(this.field_1072 = var10002);
      var10000 = this.buttonList;
      var10002 = new class_163;
      var10002.method_748(2, this.field_1101 + this.field_1099 - this.field_1083 - 10, this.field_1102 + this.field_1100 - this.field_1084 - 5, this.field_1083, this.field_1084, class_130.field_291 + "Vendre");
      var10000.add(this.field_1082 = var10002);
      var10000 = this.buttonList;
      var10002 = new class_163;
      var10002.method_748(3, this.field_1082.method_851() - this.field_1080 - 5, this.field_1082.method_852(), this.field_1080, this.field_1081, class_130.field_290 + "Acheter");
      var10000.add(this.field_1079 = var10002);
      var10000 = this.buttonList;
      class_159 var6 = new class_159;
      var6.method_842(4, this.field_1079.method_851() - 10 - 20, this.field_1079.method_852(), false);
      var10000.add(this.field_1068 = var6);
      var10000 = this.buttonList;
      var6 = new class_159;
      var6.method_842(5, this.field_1068.method_843() + 15, this.field_1068.method_844(), true);
      var10000.add(this.field_1069 = var6);
      var10000 = this.buttonList;
      var10002 = new class_163;
      var10002.method_748(6, this.field_1072.method_851() - this.field_1076 - 5, this.field_1072.method_852(), this.field_1076, this.field_1077, class_130.field_290 + "Mes ventes");
      var10000.add(this.field_1075 = var10002);
      this.field_1070 = (this.field_1068.method_843() + this.field_1068.method_845() / 2 + this.field_1069.method_843() + this.field_1069.method_845() / 2) / 2;
      this.field_1071 = this.field_1068.method_844() + this.field_1068.method_846() + 2;
      int var5 = class_209.method_1160();
      this.field_1088 = this.field_1066 + this.field_1064 + 15;
      this.field_1089 = this.field_1067 + this.field_1065 / 2 - this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2;
      class_231 var7 = new class_231;
      var7.method_1252(this, this.field_1088 + this.field_557.enableBackgroundDrawing4.getCharWidth("Catégorie : "), this.field_1089 + this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2 - this.field_1092 / 2, this.field_1091, this.field_1092, class_236.class);
      this.field_1090 = var7;
      this.field_1094 = this.field_1090.method_1261() + this.field_1090.method_1259() + 15;
      int var1 = var5;
      this.field_1095 = this.field_1090.method_1262() + this.field_1090.method_1260() / 2 - this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2;
      class_231 var4 = new class_231;
      var4.method_1252(this, this.field_1094 + this.field_557.enableBackgroundDrawing4.getCharWidth("Filtre : "), this.field_1095 + this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2 - this.field_1098 / 2, this.field_1097, this.field_1098, class_240.class);
      this.field_1096 = var4;
      this.method_1188(this.field_1060);
      this.field_1051 = this.field_1067 + this.field_1065 + 5;
      this.field_1052 = this.field_1079.method_852();
      this.field_1053 = (this.field_1052 - this.field_1051 - this.field_1050 * (this.field_1049 - 1)) / this.field_1049;
      this.field_1059 = this.method_1185();
      if(var1 != 0) {
         int var2 = class_689.method_3976();
         ++var2;
         class_689.method_3975(var2);
      }

   }

   // $FF: renamed from: m () void
   public void method_872() {
      super.method_872();
      Keyboard.enableRepeatEvents(false);
   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      int var4;
      int var5;
      int var6;
      int var10000;
      int var10001;
      label133: {
         this.method_873();
         this.method_1168(bmh.instance, (double)this.field_1101, (double)(this.field_1101 + this.field_1099), (double)this.field_1102, (double)(this.field_1102 + this.field_1100), 0.3F, 0.3F, 0.3F, 0.5F);
         var10000 = class_209.method_1159();
         this.drawCenteredString(this.field_557.enableBackgroundDrawing4, this.field_1062 + 1 + "/" + this.field_1061, this.field_1070, this.field_1071, 16777215);
         String[] var9 = field_1103;
         this.method_657(this.field_557.enableBackgroundDrawing4, "Catégorie : ", this.field_1088, this.field_1089, 16777215);
         this.method_657(this.field_557.enableBackgroundDrawing4, "Filtre : ", this.field_1094, this.field_1095, 16777215);
         this.field_1063.drawTextBox();
         var5 = this.field_1062 * this.field_1049;
         var6 = 0;
         var4 = var10000;
         var10000 = var5 + this.field_1049;
         var10001 = this.field_1059.size();
         if(var4 != 0) {
            if(var10000 > var10001) {
               var10000 = this.field_1059.size();
               break label133;
            }

            var10000 = var5;
            var10001 = this.field_1049;
         }

         var10000 += var10001;
      }

      int var7 = var10000;

      class_214 var12;
      label126: {
         label136: {
            while(true) {
               if(var5 < var7) {
                  class_1664 var8 = (class_1664)this.field_1059.get(var5);
                  var10000 = this.field_1078;
                  if(var4 == 0) {
                     break;
                  }

                  label114: {
                     label139: {
                        if(var4 != 0) {
                           label111: {
                              if(!this.field_1078) {
                                 label140: {
                                    class_1664 var11 = var8;
                                    if(var4 != 0) {
                                       if(var8.method_9176() == null) {
                                          break label140;
                                       }

                                       var11 = var8;
                                    }

                                    var10000 = var11.method_9182();
                                    if(var4 == 0) {
                                       break label111;
                                    }

                                    if(var10000 == 0) {
                                       break label139;
                                    }
                                 }
                              }

                              var10000 = this.field_1078;
                           }
                        }

                        if(var10000 == 0 || var8.method_9176() == null) {
                           break label114;
                        }
                     }

                     this.method_1184(var8, var6);
                     ++var6;
                  }

                  ++var5;
                  if(var4 != 0) {
                     continue;
                  }
               }

               var12 = this;
               if(var4 == 0) {
                  break label136;
               }

               var10000 = this.field_1062;
               break;
            }

            if(var10000 == this.field_1061 - 1) {
               var10000 = this.field_1052 - (this.field_1049 - this.field_1059.size() % this.field_1049) * (this.field_1053 + this.field_1050);
               break label126;
            }

            var12 = this;
         }

         var10000 = var12.field_1052;
      }

      label141: {
         var7 = var10000;
         var10000 = var2;
         var10001 = this.field_1051;
         if(var4 != 0) {
            if(var2 < this.field_1051) {
               break label141;
            }

            var10000 = var2;
            var10001 = var7;
         }

         if(var4 != 0) {
            if(var10000 > var10001) {
               break label141;
            }

            var10000 = (var2 - this.field_1051) % (this.field_1053 + this.field_1050);
            var10001 = this.field_1053;
         }

         if(var4 != 0) {
            if(var10000 > var10001) {
               break label141;
            }

            var10000 = var1;
            var10001 = this.field_1101;
         }

         if(var4 != 0) {
            if(var10000 < var10001) {
               break label141;
            }

            var10000 = var1;
            var10001 = this.field_1101 + this.field_1053;
         }

         if(var4 != 0) {
            if(var10000 > var10001) {
               break label141;
            }

            var10000 = this.field_1062 * this.field_1049;
            var10001 = (var2 - this.field_1051) / (this.field_1053 + this.field_1050);
         }

         int var10 = var10000 + var10001;
         this.method_1174(((class_1664)this.field_1059.get(var10)).method_9176(), var1, var2);
      }

      var12 = this;
      if(var4 != 0) {
         label63: {
            if(this.field_1054 != null) {
               var12 = this;
               if(var4 == 0) {
                  break label63;
               }

               this.drawCenteredString(this.field_557.enableBackgroundDrawing4, this.field_1054, (this.field_1101 + this.field_1068.field_447) / 2, (this.field_1102 + this.field_1100 + this.field_1052) / 2 - this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2, 16777215);
               if(System.currentTimeMillis() - this.field_1056 >= this.field_1055) {
                  this.field_1054 = null;
               }
            }

            var12 = this;
         }
      }

      var12.field_1079.field_451 = this.field_1058 != null;
      this.field_1090.method_1253(var1, var2);
      this.field_1096.method_1253(var1, var2);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: b (ca.diiza.m.a, int) void
   public void method_1184(class_1664 var1, int var2) {
      int var3;
      int var4;
      int var10000;
      label52: {
         label51: {
            var10000 = class_209.method_1159();
            var4 = this.field_1051 + var2 * this.field_1053 + var2 * this.field_1050;
            var3 = var10000;
            if(var3 != 0) {
               if(var2 != this.field_1057) {
                  break label51;
               }

               this.method_1168(bmh.instance, (double)this.field_1101, (double)(this.field_1101 + this.field_1099), (double)var4, (double)(var4 + this.field_1053), 1.0F, 1.0F, 1.0F, 0.7F);
               this.field_1058 = var1;
            }

            if(var3 != 0) {
               break label52;
            }
         }

         this.method_1168(bmh.instance, (double)this.field_1101, (double)(this.field_1101 + this.field_1099), (double)var4, (double)(var4 + this.field_1053), 0.0F, 0.0F, 0.0F, 0.5F);
      }

      int var5;
      int var6;
      String var9;
      label43: {
         this.method_1169(bmh.instance, (double)this.field_1101, (double)(this.field_1101 + this.field_1053), (double)var4, (double)(var4 + this.field_1053), 0.3F, 0.3F, 0.3F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F);
         this.method_1170(var1.method_9176(), this.field_1101 + (this.field_1053 - 16) / 2, var4 + this.field_1053 / 2 - 8);
         var5 = this.field_1101 + 170;
         var6 = this.field_1101 + this.field_1099 - 16 - this.field_557.enableBackgroundDrawing4.getCharWidth(String.valueOf(var1.method_9179()));
         add var8 = var1.method_9176();
         if(var3 != 0) {
            if(var8.method_3770().length() > 23) {
               StringBuilder var11 = (new StringBuilder()).append(var1.method_9176().method_3770().substring(0, 20));
               String[] var10001 = field_1103;
               var9 = var11.append("...").toString();
               break label43;
            }

            var8 = var1.method_9176();
         }

         var9 = var8.method_3770();
      }

      String var7 = var9;
      this.method_657(this.fontRendererObj, var7, (this.field_1101 + this.field_1101 + this.field_1053) / 2 + this.field_1053 / 2 + 10, (var4 + var4 + this.field_1053) / 2 - this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2, 16777215);
      this.method_657(this.fontRendererObj, var1.method_9178(), var5, (var4 + var4 + this.field_1053) / 2 - this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2, 16777215);
      this.drawCenteredString(this.fontRendererObj, this.method_1190(var1), (var5 + this.field_557.enableBackgroundDrawing4.getCharWidth(var1.method_9178()) + var6) / 2, (var4 + var4 + this.field_1053) / 2 - this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2, 16777215);
      this.method_657(this.fontRendererObj, String.valueOf(var1.method_9179()), this.field_1101 + this.field_1099 - 16 - this.field_557.enableBackgroundDrawing4.getCharWidth(String.valueOf(var1.method_9179())), (var4 + var4 + this.field_1053) / 2 - this.field_557.enableBackgroundDrawing4.FONT_HEIGHT / 2, 16777215);
      var10000 = var1.method_9181();
      add var10;
      if(var3 != 0) {
         if(var10000 == 0) {
            var10 = new add;
            var10.method_3724(class_1010.field_5342);
            this.method_1171(var10, this.field_1101 + this.field_1099 - 16, var4 + this.field_1053 / 2 - 8);
            if(var3 != 0) {
               return;
            }
         }

         var10000 = var1.method_9181();
      }

      byte var12 = 1;
      if(var3 != 0) {
         if(var10000 == 1) {
            var10 = new add;
            var10.method_3724(class_1010.field_5287);
            this.method_1171(var10, this.field_1101 + this.field_1099 - 16, var4 + this.field_1053 / 2 - 8);
            if(var3 != 0) {
               return;
            }
         }

         var10000 = var1.method_9181();
         var12 = 2;
      }

      if(var10000 == var12) {
         var10 = new add;
         var10.method_3724(class_1010.field_5353);
         this.method_1171(var10, this.field_1101 + this.field_1099 - 16, var4 + this.field_1053 / 2 - 8);
      }

   }

   // $FF: renamed from: f () java.util.ArrayList
   public ArrayList<a> method_1185() {
      ArrayList var2 = new ArrayList();
      int var10000 = class_209.method_1160();
      class_1583[] var3 = this.field_1060;
      int var1 = var10000;
      int var4 = var3.length;
      int var5 = 0;

      while(var5 < var4) {
         label158: {
            class_1583 var6 = var3[var5];
            add var7 = add.method_3727(var6);
            class_236 var13 = this.field_1087;
            class_236 var10001 = class_236.BLOCKS;
            if(var1 == 0) {
               if(this.field_1087 == class_236.BLOCKS && !(var7.method_3730() instanceof abh)) {
                  break label158;
               }

               var13 = this.field_1087;
               var10001 = class_236.SWORDS;
            }

            if(var1 == 0) {
               if(var13 == var10001 && !(var7.method_3730() instanceof class_511)) {
                  break label158;
               }

               var13 = this.field_1087;
               var10001 = class_236.TOOLS;
            }

            boolean var15;
            label137: {
               class_214 var14;
               label159: {
                  if(var1 == 0) {
                     if(var13 == var10001 && !(var7.method_3730() instanceof class_539)) {
                        break label158;
                     }

                     var14 = this;
                     if(var1 != 0) {
                        break label159;
                     }

                     var13 = this.field_1087;
                     var10001 = class_236.POTIONS;
                  }

                  if(var13 == var10001) {
                     var15 = var7.method_3730() instanceof class_550;
                     if(var1 != 0) {
                        break label137;
                     }

                     if(!var15) {
                        break label158;
                     }
                  }

                  var14 = this;
               }

               var15 = var14.field_1063.method_714().isEmpty();
            }

            String[] var11;
            label161: {
               if(var1 == 0) {
                  if(var15) {
                     break label161;
                  }

                  var15 = false;
               }

               boolean var8 = var15;
               Iterator var9 = var7.method_3774(this.field_557.cursorCounter8, this.field_557.canLoseFocus7.field_4506).iterator();

               while(true) {
                  if(var9.hasNext()) {
                     String var10 = (String)var9.next();
                     var15 = var10.toLowerCase().contains(this.field_1063.method_714().toLowerCase());
                     if(var1 != 0) {
                        break;
                     }

                     label104: {
                        if(var1 == 0) {
                           if(!var15) {
                              break label104;
                           }

                           var15 = true;
                        }

                        var8 = var15;
                     }

                     if(var1 == 0) {
                        continue;
                     }
                  }

                  var11 = field_1103;
                  var15 = var6.method_8685("sellerName").toLowerCase().contains(this.field_1063.method_714().toLowerCase());
                  break;
               }

               if(var1 == 0) {
                  if(var15) {
                     var8 = true;
                  }

                  var15 = var8;
               }

               if(!var15 && var1 == 0) {
                  break label158;
               }
            }

            label95: {
               class_1664 var12;
               label166: {
                  class_1664 var16 = new class_1664;
                  var11 = field_1103;
                  var16.method_9174(this, var6.method_8681("sellId"), var7, var6.method_8681("priceType"), var6.method_8682("endTime"), var6.method_8685("sellerName"), var6.method_8681("price"), var6.method_8690("sold"));
                  var12 = var16;
                  var15 = this.field_1078;
                  if(var1 == 0) {
                     if(this.field_1078) {
                        var15 = var12.method_9178().equals(this.field_557.method_5285().method_6995());
                        if(var1 != 0) {
                           break label95;
                        }

                        if(var15) {
                           break label166;
                        }
                     }

                     var15 = this.field_1078;
                  }

                  if(var1 == 0) {
                     if(var15) {
                        break label158;
                     }

                     var15 = var12.method_9178().equals(this.field_557.method_5285().method_6995());
                  }

                  if(var1 == 0) {
                     if(var15) {
                        break label158;
                     }

                     var15 = var12.method_9180();
                  }

                  if(var1 == 0) {
                     if(var15) {
                        break label158;
                     }

                     var15 = var12.method_9182();
                  }

                  if(var1 != 0) {
                     break label95;
                  }

                  if(var15) {
                     break label158;
                  }
               }

               var2.add(var12);
            }

            var2 = this.field_1093.method_1299(var2);
         }

         ++var5;
         if(var1 != 0) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      class_214 var8;
      label124: {
         label126: {
            int var10000 = class_209.method_1160();
            this.field_1090.method_1254(var1, var2);
            int var4 = var10000;
            this.field_1096.method_1254(var1, var2);
            this.field_1063.method_727(var1, var2, var3);
            boolean var7 = this.field_1090.method_1257();
            if(var4 == 0) {
               label121: {
                  if(!var7) {
                     var7 = this.field_1096.method_1257();
                     if(var4 != 0) {
                        break label121;
                     }

                     if(!var7) {
                        var10000 = var1;
                        int var10001 = this.field_1101;
                        if(var4 == 0) {
                           if(var1 < this.field_1101) {
                              break label126;
                           }

                           var10000 = var1;
                           var10001 = this.field_1101 + this.field_1099;
                        }

                        if(var4 == 0) {
                           if(var10000 > var10001) {
                              break label126;
                           }

                           var10000 = this.field_1059.size();
                           var10001 = this.field_1049;
                        }

                        label94: {
                           var10000 %= var10001;
                           if(var4 == 0) {
                              if(var10000 == 0) {
                                 var10000 = this.field_1049;
                                 break label94;
                              }

                              var10000 = this.field_1059.size();
                           }

                           var10000 %= this.field_1049;
                        }

                        label88: {
                           int var5 = var10000;
                           var8 = this;
                           if(var4 == 0) {
                              if(this.field_1062 == this.field_1061 - 1) {
                                 var10000 = this.field_1051 + var5 * (this.field_1053 + this.field_1050);
                                 break label88;
                              }

                              var8 = this;
                           }

                           var10000 = var8.field_1052;
                        }

                        label128: {
                           int var6 = var10000;
                           var10000 = var2;
                           var10001 = this.field_1051;
                           if(var4 == 0) {
                              label81: {
                                 if(var2 >= this.field_1051) {
                                    var10000 = var2;
                                    var10001 = var6;
                                    if(var4 != 0) {
                                       break label81;
                                    }

                                    if(var2 <= var6) {
                                       if((var2 - this.field_1051) % (this.field_1053 + this.field_1050) > this.field_1053) {
                                          break label128;
                                       }

                                       this.field_1057 = (var2 - this.field_1051) / (this.field_1053 + this.field_1050);
                                       if(var4 == 0) {
                                          break label128;
                                       }
                                    }
                                 }

                                 var10000 = var1;
                                 var10001 = this.field_1079.method_851();
                              }
                           }

                           label129: {
                              if(var4 == 0) {
                                 if(var10000 < var10001) {
                                    break label129;
                                 }

                                 var10000 = var1;
                                 var10001 = this.field_1079.method_851() + this.field_1080;
                              }

                              if(var4 == 0) {
                                 if(var10000 > var10001) {
                                    break label129;
                                 }

                                 var10000 = var2;
                                 var10001 = this.field_1079.method_852();
                              }

                              if(var4 == 0) {
                                 if(var10000 < var10001) {
                                    break label129;
                                 }

                                 var10000 = var2;
                                 var10001 = this.field_1079.method_852() + this.field_1081;
                              }

                              if(var10000 <= var10001) {
                                 break label128;
                              }
                           }

                           this.field_1057 = -1;
                        }

                        if(var4 == 0) {
                           break label126;
                        }
                     }
                  }

                  this.field_1090.method_1258(false);
                  this.field_1096.method_1258(false);
                  var7 = this.field_1087.equals(this.field_1090.method_1255());
               }
            }

            if(var4 == 0) {
               if(!var7) {
                  this.field_1087 = (class_236)this.field_1090.method_1255();
                  this.method_1187();
                  if(var4 == 0) {
                     break label126;
                  }
               }

               var8 = this;
               if(var4 != 0) {
                  break label124;
               }

               var7 = this.field_1093.equals(this.field_1096.method_1255());
            }

            if(!var7) {
               this.field_1093 = (class_240)this.field_1096.method_1255();
               this.method_1187();
            }
         }

         var8 = this;
      }

      var8.method_862(var1, var2, var3);
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      super.method_856(var1, var2);
      this.field_1063.method_726(var1, var2);
      this.method_1187();
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      int var2 = class_209.method_1160();
      int var10000 = var1.field_450;
      int var10001 = this.field_1072.field_450;
      if(var2 == 0) {
         if(var1.field_450 == this.field_1072.field_450) {
            this.field_557.method_5236((bdw)null);
            if(var2 == 0) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = this.field_1068.field_450;
      }

      if(var2 == 0) {
         if(var10000 == var10001) {
            this.method_1186(this.field_1062 - 1);
            if(var2 == 0) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = this.field_1069.field_450;
      }

      if(var2 == 0) {
         if(var10000 == var10001) {
            this.method_1186(this.field_1062 + 1);
            if(var2 == 0) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = this.field_1079.field_450;
      }

      if(var2 == 0) {
         if(var10000 == var10001) {
            class_214 var9 = this;
            if(var2 == 0) {
               label71: {
                  if(this.field_1048 != 0L) {
                     var9 = this;
                     if(var2 != 0) {
                        break label71;
                     }

                     if(this.field_1048 + 5000L >= System.currentTimeMillis()) {
                        return;
                     }
                  }

                  var9 = this;
               }
            }

            if(var2 == 0) {
               if(var9.field_1058 == null) {
                  return;
               }

               class_1436 var11 = this.field_557.method_5267();
               class_350 var10 = new class_350;
               var10.method_2017(this.field_1058.method_9175());
               var11.method_7821(var10);
               var9 = this;
            }

            var9.field_1048 = System.currentTimeMillis();
            if(var2 == 0) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = this.field_1082.field_450;
      }

      if(var2 == 0) {
         if(var10000 == var10001) {
            bao var4 = this.field_557;
            class_213 var12 = new class_213;
            var12.method_651();
            var4.method_5236(var12);
            if(var2 == 0) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = this.field_1075.field_450;
      }

      if(var10000 == var10001) {
         boolean var5 = this.field_1078;
         if(var2 == 0) {
            var5 = !this.field_1078;
         }

         this.field_1078 = var5;
         class_163 var6 = this.field_1075;
         String[] var3;
         StringBuilder var7;
         String var8;
         if(this.field_1078) {
            var7 = (new StringBuilder()).append(class_130.field_290);
            var3 = field_1103;
            var8 = var7.append("Magasin").toString();
         } else {
            var7 = (new StringBuilder()).append(class_130.field_290);
            var3 = field_1103;
            var8 = var7.append("Mes ventes").toString();
         }

         var6.field_449 = var8;
         var6 = this.field_1079;
         if(this.field_1078) {
            var7 = (new StringBuilder()).append(class_130.field_290);
            var3 = field_1103;
            var8 = var7.append("Retirer").toString();
         } else {
            var7 = (new StringBuilder()).append(class_130.field_290);
            String[] var10002 = field_1103;
            var8 = var7.append("Acheter").toString();
         }

         var6.field_449 = var8;
         this.method_1187();
      }

   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return false;
   }

   // $FF: renamed from: a (int) void
   private void method_1186(int var1) {
      this.field_1062 = var1;
      int var10000 = class_209.method_1159();
      this.field_1057 = -1;
      int var2 = var10000;
      this.field_1058 = null;
      int var10001 = this.field_1062;
      if(var2 != 0) {
         var10001 = this.field_1062 != 0?1:0;
      }

      this.field_1068.field_451 = (boolean)var10001;
      var10001 = this.field_1062;
      if(var2 != 0) {
         var10001 = this.field_1062 != this.field_1061 - 1?1:0;
      }

      this.field_1069.field_451 = (boolean)var10001;
   }

   // $FF: renamed from: g () void
   public void method_1187() {
      int var1;
      int var10001;
      label22: {
         int var10000 = class_209.method_1160();
         this.field_1059 = this.method_1185();
         var1 = var10000;
         var10001 = this.field_1059.size() % this.field_1049;
         if(var1 == 0) {
            if(var10001 == 0) {
               var10001 = this.field_1059.size() / this.field_1049;
               break label22;
            }

            var10001 = this.field_1059.size() / this.field_1049;
         }

         ++var10001;
      }

      this.field_1061 = var10001;
      class_214 var2 = this;
      if(var1 == 0) {
         if(this.field_1061 == 0) {
            ++this.field_1061;
         }

         var2 = this;
      }

      var2.method_1186(0);
   }

   // $FF: renamed from: a (ro[]) void
   public void method_1188(class_1583[] var1) {
      this.field_1060 = var1;
      this.method_1187();
   }

   // $FF: renamed from: b (int) void
   public void method_1189(int var1) {
      label90: {
         label89: {
            int var2;
            label88: {
               String[] var3;
               label87: {
                  label86: {
                     label85: {
                        label84: {
                           label83: {
                              label82: {
                                 label81: {
                                    label80: {
                                       label79: {
                                          label78: {
                                             label77: {
                                                var2 = class_209.method_1160();
                                                if(var2 == 0) {
                                                   switch(var1) {
                                                   case 0:
                                                      var3 = field_1103;
                                                      this.field_1054 = "Achat effectué avec succès!";
                                                      this.field_1059.remove(this.field_1058);
                                                      break;
                                                   case 1:
                                                      break label77;
                                                   case 2:
                                                      break label78;
                                                   case 3:
                                                      break label79;
                                                   case 4:
                                                      break label80;
                                                   case 5:
                                                      break label81;
                                                   case 6:
                                                      break label82;
                                                   case 7:
                                                      break label83;
                                                   case 8:
                                                      break label84;
                                                   case 9:
                                                      break label85;
                                                   case 10:
                                                      break label86;
                                                   case 11:
                                                      break label87;
                                                   case 12:
                                                      break label88;
                                                   default:
                                                      break label89;
                                                   }
                                                }

                                                this.method_1186(this.field_1062);
                                                if(var2 == 0) {
                                                   break label90;
                                                }
                                             }

                                             var3 = field_1103;
                                             this.field_1054 = "Vous n\'avez pas assez d\'argent!";
                                             if(var2 == 0) {
                                                break label90;
                                             }
                                          }

                                          var3 = field_1103;
                                          this.field_1054 = "Vous n\'avez pas de place dans votre inventaire!";
                                          if(var2 == 0) {
                                             break label90;
                                          }
                                       }

                                       var3 = field_1103;
                                       this.field_1054 = "Vente retirée avec succès!";
                                       this.field_1059.remove(this.field_1058);
                                       this.method_1186(this.field_1062);
                                       if(var2 == 0) {
                                          break label90;
                                       }
                                    }

                                    var3 = field_1103;
                                    this.field_1054 = "Gain de la vente récupérée!";
                                    this.field_1059.remove(this.field_1058);
                                    this.method_1186(this.field_1062);
                                    if(var2 == 0) {
                                       break label90;
                                    }
                                 }

                                 var3 = field_1103;
                                 this.field_1054 = "Vous avez déjà retiré cette vente!";
                                 if(var2 == 0) {
                                    break label90;
                                 }
                              }

                              var3 = field_1103;
                              this.field_1054 = "Les gains de la vente ont été récupérés!";
                              this.field_1059.remove(this.field_1058);
                              this.method_1186(this.field_1062);
                              if(var2 == 0) {
                                 break label90;
                              }
                           }

                           var3 = field_1103;
                           this.field_1054 = "Offre inexistante";
                           if(var2 == 0) {
                              break label90;
                           }
                        }

                        var3 = field_1103;
                        this.field_1054 = "Offre invalide";
                        if(var2 == 0) {
                           break label90;
                        }
                     }

                     var3 = field_1103;
                     this.field_1054 = "Une erreur s\'est produite";
                     if(var2 == 0) {
                        break label90;
                     }
                  }

                  var3 = field_1103;
                  this.field_1054 = "Cette offre a déjà été achetée";
                  if(var2 == 0) {
                     break label90;
                  }
               }

               var3 = field_1103;
               this.field_1054 = "Cette offre a expirée";
               if(var2 == 0) {
                  break label90;
               }
            }

            String[] var10001 = field_1103;
            this.field_1054 = "Tu n\'as pas asser de point boutique";
            if(var2 == 0) {
               break label90;
            }
         }

         this.field_1054 = null;
      }

      this.field_1056 = System.currentTimeMillis();
   }

   // $FF: renamed from: a (ca.diiza.m.a) java.lang.String
   public String method_1190(class_1664 var1) {
      int var10000 = class_209.method_1159();
      long var3 = (var1.method_9177() - System.currentTimeMillis()) / 1000L;
      int var2 = var10000;
      boolean var15 = var1.method_9182();
      if(var2 != 0) {
         label48: {
            if(var15) {
               var15 = var1.method_9180();
               if(var2 == 0) {
                  break label48;
               }

               if(!var15) {
                  String[] var14 = field_1103;
                  return "Terminé - Non vendu";
               }
            }

            var15 = var1.method_9180();
         }
      }

      if(var15) {
         String[] var16 = field_1103;
         return "Terminé - Vendu";
      } else {
         long var5 = var3 / 86400L;
         long var7 = var3 % 86400L / 3600L;
         long var9 = var3 % 86400L % 3600L / 60L;
         long var11 = var3 % 86400L % 3600L % 60L;
         String var13 = "";
         long var17;
         var10000 = (var17 = var5 - 0L) == 0L?0:(var17 < 0L?-1:1);
         if(var2 != 0) {
            if(var10000 > 0) {
               var13 = var13 + var5 + "j";
            }

            long var18;
            var10000 = (var18 = var7 - 0L) == 0L?0:(var18 < 0L?-1:1);
         }

         if(var2 != 0) {
            if(var10000 > 0) {
               var13 = var13 + var7 + "h";
            }

            long var19;
            var10000 = (var19 = var9 - 0L) == 0L?0:(var19 < 0L?-1:1);
         }

         if(var2 != 0) {
            if(var10000 > 0) {
               var13 = var13 + var9 + "m";
            }

            long var20;
            var10000 = (var20 = var11 - 0L) == 0L?0:(var20 < 0L?-1:1);
         }

         if(var10000 > 0) {
            var13 = var13 + var11 + "s";
         }

         return var13;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_1191() {
      // $FF: Couldn't be decompiled
   }
}

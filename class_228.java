import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lO
public class class_228 extends class_226 {

   // $FF: renamed from: U bqx
   private static final bqx field_1199;
   // $FF: renamed from: V vN
   private static class_1674 field_1200;
   // $FF: renamed from: W int
   private static int field_1201;
   // $FF: renamed from: X float
   private float field_1202;
   // $FF: renamed from: Y boolean
   private boolean field_1203;
   // $FF: renamed from: Z boolean
   private boolean field_1204;
   // $FF: renamed from: aa k_
   private GuiTextField field_1205;
   // $FF: renamed from: ab java.util.List
   private List field_1206;
   // $FF: renamed from: ac aR
   private class_492 field_1207;
   // $FF: renamed from: ad boolean
   private boolean field_1208;
   // $FF: renamed from: ae mC
   private Gui5 field_1209;
   // $FF: renamed from: af java.lang.String
   private static final String field_1210;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] field_1211;


   // $FF: renamed from: <init> (yz) void
   public void method_1228(class_792 var1) {
      class_677 var10001 = new class_677;
      var10001.method_3693(var1);
      super.method_1192(var10001);
      var1.field_3619 = this.field_1107;
      this.field_562 = true;
      this.field_1106 = 136;
      this.field_1105 = 195;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      String[] var1 = class_752.method_4253();
      bao var10000 = this.field_557;
      if(var1 != null) {
         if(this.field_557.maxStringLength8.method_7862()) {
            return;
         }

         var10000 = this.field_557;
      }

      class_227 var10001 = new class_227;
      var10001.method_1225(this.field_557.cursorCounter8);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: b (aR, int, int, int) void
   protected void method_1201(class_492 var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      this.field_1208 = true;
      String[] var5 = var10000;
      int var13 = var4;
      if(var5 != null) {
         var13 = var4 == 1?1:0;
      }

      int var6;
      label363: {
         label367: {
            var6 = var13;
            var13 = var2;
            if(var5 != null) {
               if(var2 != -999) {
                  break label367;
               }

               var13 = var4;
            }

            if(var5 == null) {
               break label363;
            }

            if(var13 == 0) {
               var13 = 4;
               break label363;
            }
         }

         var13 = var4;
      }

      var4 = var13;
      class_492 var15 = var1;
      add var7;
      class_666 var8;
      int var10001;
      if(var5 != null) {
         if(var1 == null) {
            label348: {
               var13 = field_1201;
               var10001 = class_872.fontRendererInstance5.method_5147();
               if(var5 != null) {
                  if(var13 == var10001) {
                     break label348;
                  }

                  var13 = var4;
                  var10001 = 5;
               }

               if(var13 != var10001) {
                  var8 = this.field_557.cursorCounter8.field_3616;
                  if(var8.method_3617() == null) {
                     return;
                  }

                  var13 = var3;
                  if(var5 != null) {
                     if(var3 == 0) {
                        this.field_557.cursorCounter8.method_4570(var8.method_3617(), true);
                        this.field_557.maxStringLength8.method_7858(var8.method_3617());
                        var8.method_3616((add)null);
                     }

                     var13 = var3;
                  }

                  if(var13 != 1) {
                     return;
                  }

                  var7 = var8.method_3617().method_3729(1);
                  this.field_557.cursorCounter8.method_4570(var7, true);
                  this.field_557.maxStringLength8.method_7858(var7);
                  class_666 var17 = var8;
                  if(var5 != null) {
                     if(var8.method_3617().field_2958 != 0) {
                        return;
                     }

                     var17 = var8;
                  }

                  var17.method_3616((add)null);
                  if(var5 != null) {
                     return;
                  }
               }
            }
         }

         var15 = var1;
      }

      int var9;
      label330: {
         if(var15 == this.field_1207) {
            var13 = var6;
            if(var5 == null) {
               break label330;
            }

            if(var6 != 0) {
               var9 = 0;

               do {
                  if(var9 >= this.field_557.cursorCounter8.field_3618.method_3649().size()) {
                     return;
                  }

                  this.field_557.maxStringLength8.method_7857((add)null, var9);
                  ++var9;
               } while(var5 != null);
            }
         }

         var13 = field_1201;
      }

      var10001 = class_872.fontRendererInstance5.method_5147();
      add var10;
      byte var14;
      class_492 var16;
      if(var5 != null) {
         if(var13 == var10001) {
            if(var1 == this.field_1207) {
               this.field_557.cursorCounter8.field_3616.method_3616((add)null);
               if(var5 != null) {
                  return;
               }
            }

            var13 = var4;
            var14 = 4;
            if(var5 != null) {
               label309: {
                  if(var4 == 4) {
                     label371: {
                        var15 = var1;
                        if(var5 != null) {
                           if(var1 == null) {
                              break label371;
                           }

                           var15 = var1;
                        }

                        var13 = var15.method_2876();
                        if(var5 == null) {
                           break label309;
                        }

                        if(var13 != 0) {
                           var10001 = var3;
                           if(var5 != null) {
                              var10001 = var3 == 0?1:var1.method_2875().method_3739();
                           }

                           var10 = var1.method_2881(var10001);
                           this.field_557.cursorCounter8.method_4570(var10, true);
                           this.field_557.maxStringLength8.method_7858(var10);
                           if(var5 != null) {
                              return;
                           }
                        }
                     }
                  }

                  var13 = var4;
               }

               var14 = 4;
            }

            bjk var18;
            label298: {
               if(var13 == var14) {
                  var18 = this.field_557.cursorCounter8;
                  if(var5 == null) {
                     break label298;
                  }

                  if(this.field_557.cursorCounter8.field_3616.method_3617() != null) {
                     this.field_557.cursorCounter8.method_4570(this.field_557.cursorCounter8.field_3616.method_3617(), true);
                     this.field_557.maxStringLength8.method_7858(this.field_557.cursorCounter8.field_3616.method_3617());
                     this.field_557.cursorCounter8.field_3616.method_3616((add)null);
                     if(var5 != null) {
                        return;
                     }
                  }
               }

               var18 = this.field_557.cursorCounter8;
            }

            label283: {
               var16 = var1;
               if(var5 != null) {
                  if(var1 == null) {
                     var10001 = var2;
                     break label283;
                  }

                  var16 = class_503.method_2906((class_503)var1);
               }

               var10001 = var16.field_2287;
            }

            var18.field_3618.method_3655(var10001, var3, var4, this.field_557.cursorCounter8);
            this.field_557.cursorCounter8.field_3618.method_3650();
            if(var5 != null) {
               return;
            }
         }

         var13 = var4;
         var10001 = 5;
      }

      if(var13 != var10001 && var1.field_2286 == field_1200) {
         var8 = this.field_557.cursorCounter8.field_3616;
         var7 = var8.method_3617();
         add var11 = var1.method_2875();
         var13 = var4;
         var14 = 2;
         add var12;
         if(var5 != null) {
            if(var4 == 2) {
               if(var11 != null) {
                  var13 = var3;
                  if(var5 != null) {
                     if(var3 < 0) {
                        return;
                     }

                     var13 = var3;
                  }

                  if(var13 < 9) {
                     var12 = var11.method_3754();
                     var12.field_2958 = var12.method_3739();
                     this.field_557.cursorCounter8.field_3616.method_87(var3, var12);
                     this.field_557.cursorCounter8.field_3618.method_3650();
                  }
               }

               return;
            }

            var13 = var4;
            var14 = 3;
         }

         if(var5 != null) {
            if(var13 == var14) {
               if(var8.method_3617() == null) {
                  var15 = var1;
                  if(var5 != null) {
                     if(!var1.method_2876()) {
                        return;
                     }

                     var15 = var1;
                  }

                  var12 = var15.method_2875().method_3754();
                  var12.field_2958 = var12.method_3739();
                  var8.method_3616(var12);
               }

               return;
            }

            var13 = var4;
            var14 = 4;
         }

         add var20;
         if(var13 == var14) {
            var20 = var11;
            if(var5 != null) {
               if(var11 == null) {
                  return;
               }

               var20 = var11.method_3754();
            }

            var12 = var20;
            var10001 = var3;
            if(var5 != null) {
               var10001 = var3 == 0?1:var12.method_3739();
            }

            var12.field_2958 = var10001;
            this.field_557.cursorCounter8.method_4570(var12, true);
            this.field_557.maxStringLength8.method_7858(var12);
            return;
         }

         label374: {
            var20 = var7;
            if(var5 != null) {
               label269: {
                  if(var7 != null) {
                     var20 = var11;
                     if(var5 == null) {
                        break label269;
                     }

                     if(var11 != null) {
                        var20 = var7;
                        if(var5 == null) {
                           break label269;
                        }

                        if(var7.method_3758(var11)) {
                           label375: {
                              var13 = var3;
                              if(var5 != null) {
                                 if(var3 == 0) {
                                    label377: {
                                       var13 = var6;
                                       if(var5 != null) {
                                          if(var6 != 0) {
                                             var7.field_2958 = var7.method_3739();
                                             if(var5 != null) {
                                                break label374;
                                             }
                                          }

                                          var20 = var7;
                                          if(var5 == null) {
                                             break label377;
                                          }

                                          var13 = var7.field_2958;
                                       }

                                       if(var13 >= var7.method_3739()) {
                                          break label374;
                                       }

                                       var20 = var7;
                                    }

                                    ++var20.field_2958;
                                    if(var5 != null) {
                                       break label374;
                                    }
                                 }

                                 var20 = var7;
                                 if(var5 == null) {
                                    break label375;
                                 }

                                 var13 = var7.field_2958;
                              }

                              if(var13 <= 1) {
                                 var8.method_3616((add)null);
                                 if(var5 != null) {
                                    break label374;
                                 }
                              }

                              var20 = var7;
                           }

                           --var20.field_2958;
                           if(var5 != null) {
                              break label374;
                           }
                        }
                     }
                  }

                  var20 = var11;
               }
            }

            label379: {
               if(var5 != null) {
                  if(var20 == null) {
                     break label379;
                  }

                  var20 = var7;
               }

               if(var5 != null) {
                  if(var20 != null) {
                     break label379;
                  }

                  var8.method_3616(add.method_3760(var11));
                  var20 = var8.method_3617();
               }

               var7 = var20;
               if(var5 != null) {
                  if(var6 == 0) {
                     break label374;
                  }

                  var7.field_2958 = var7.method_3739();
               }

               if(var5 != null) {
                  break label374;
               }
            }

            var8.method_3616((add)null);
         }

         if(var5 != null) {
            return;
         }
      }

      label217: {
         var16 = var1;
         if(var5 != null) {
            if(var1 == null) {
               var10001 = var2;
               break label217;
            }

            var16 = var1;
         }

         var10001 = var16.field_2287;
      }

      label380: {
         this.field_1107.method_3655(var10001, var3, var4, this.field_557.cursorCounter8);
         var13 = class_671.method_3669(var3);
         if(var5 != null) {
            if(var13 != 2) {
               break label380;
            }

            var13 = 0;
         }

         var9 = var13;

         do {
            if(var9 >= 9) {
               return;
            }

            this.field_557.maxStringLength8.method_7857(this.field_1107.method_3653(45 + var9).method_2875(), 36 + var9);
            ++var9;
         } while(var5 != null);
      }

      var15 = var1;
      if(var5 != null) {
         if(var1 == null) {
            return;
         }

         var15 = this.field_1107.method_3653(var1.field_2287);
      }

      var10 = var15.method_2875();
      this.field_557.maxStringLength8.method_7857(var10, var1.field_2287 - this.field_1107.field_2869.size() + 9 + 36);
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var1 = class_752.method_4253();
      bao var10000 = this.field_557;
      if(var1 != null) {
         if(this.field_557.maxStringLength8.method_7862()) {
            int var2;
            label20: {
               super.initGui();
               this.buttonList.clear();
               int var6 = this.field_557.cursorCounter8.method_4175().isEmpty();
               if(var1 != null) {
                  if(var6 == 0) {
                     var2 = 160 + (this.width - this.field_1106 - 200) / 2;
                     if(var1 != null) {
                        break label20;
                     }
                  }

                  var6 = (this.width - this.field_1106) / 2;
               }

               var2 = var6;
            }

            int var3 = (this.height - this.field_1105) / 2;
            List var7 = this.buttonList;
            bcb var10001 = new bcb;
            int var10004 = var2 + 175;
            int var10005 = var3 + 10;
            StringBuilder var10008 = (new StringBuilder()).append(class_130.field_288);
            String[] var5 = field_1211;
            var10001.method_748(400, var10004, var10005, 67, 20, class_1563.method_8581(var10008.append("Radio").toString()));
            var7.add(var10001);
            var7 = this.buttonList;
            var10001 = new bcb;
            var10001.method_748(401, var2 + 175, var3 + 33, 67, 20, class_1563.method_8581(class_130.field_290 + "Wiki"));
            var7.add(var10001);
            var7 = this.buttonList;
            var10001 = new bcb;
            var10001.method_748(402, var2 + 175, var3 + 55, 67, 20, class_1563.method_8581(class_130.field_287 + "Waypoints"));
            var7.add(var10001);
            var7 = this.buttonList;
            var10001 = new bcb;
            var10001.method_748(403, var2 + 175, var3 + 77, 67, 20, class_1563.method_8581(class_130.field_286 + "Macros"));
            var7.add(var10001);
            var7 = this.buttonList;
            var10001 = new bcb;
            var10001.method_748(404, var2 + 175, var3 + 99, 67, 20, class_1563.method_8581(class_130.field_282 + "ToggleMod"));
            var7.add(var10001);
            var7 = this.buttonList;
            var10001 = new bcb;
            var10001.method_748(405, var2 + 175, var3 + 121, 67, 20, class_1563.method_8581(class_130.field_289 + "Site"));
            var7.add(var10001);
            var7 = this.buttonList;
            var10001 = new bcb;
            var10001.method_748(406, var2 + 175, var3 + 143, 67, 20, class_1563.method_8581(class_130.field_285 + "Teamspeak"));
            var7.add(var10001);
            Keyboard.enableRepeatEvents(true);
            GuiTextField var8 = new GuiTextField;
            var8.GuiTextField(this.fontRendererObj, this.field_1108 + 82, this.field_1109 + 6, 89, this.fontRendererObj.FONT_HEIGHT);
            this.field_1205 = var8;
            this.field_1205.setMaxStringLength(15);
            this.field_1205.setEnableBackgroundDrawing(false);
            this.field_1205.setVisible(false);
            this.field_1205.setTextColor(16777215);
            int var4 = field_1201;
            field_1201 = -1;
            this.method_1231(class_872.field_4243[var4]);
            Gui5 var9 = new Gui5;
            var9.setEnabled9(this.field_557);
            this.field_1209 = var9;
            this.field_557.cursorCounter8.field_3618.method_3647(this.field_1209);
            if(var1 != null) {
               return;
            }
         }

         var10000 = this.field_557;
      }

      class_227 var10 = new class_227;
      var10.method_1225(this.field_557.cursorCounter8);
      var10000.method_5236(var10);
   }

   // $FF: renamed from: m () void
   public void method_872() {
      String[] var10000 = class_752.method_4253();
      super.method_872();
      String[] var1 = var10000;
      if(var1 != null) {
         if(this.field_557.cursorCounter8 != null) {
            label16: {
               bjk var2 = this.field_557.cursorCounter8;
               if(var1 != null) {
                  if(this.field_557.cursorCounter8.field_3616 == null) {
                     break label16;
                  }

                  var2 = this.field_557.cursorCounter8;
               }

               var2.field_3618.method_3648(this.field_1209);
            }
         }

         Keyboard.enableRepeatEvents(false);
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = field_1201;
      class_228 var4;
      if(var3 != null) {
         if(field_1201 != class_872.field_4249.method_5147()) {
            var4 = this;
            if(var3 != null) {
               if(bbj.method_5348(this.field_557.canLoseFocus7.field_4544)) {
                  this.method_1231(class_872.field_4249);
                  if(var3 != null) {
                     return;
                  }
               }

               var4 = this;
            }

            var4.method_856(var1, var2);
            if(var3 != null) {
               return;
            }
         }

         var10000 = this.field_1208;
      }

      if(var3 != null) {
         if(var10000 != 0) {
            this.field_1208 = false;
            this.field_1205.writeText("");
         }

         var10000 = this.method_1202(var2);
      }

      label54: {
         if(var3 != null) {
            if(var10000 != 0) {
               return;
            }

            var4 = this;
            if(var3 == null) {
               break label54;
            }

            var10000 = this.field_1205.method_726(var1, var2);
         }

         if(var10000 != 0) {
            this.method_1229();
            if(var3 != null) {
               return;
            }
         }

         var4 = this;
      }

      var4.method_856(var1, var2);
   }

   // $FF: renamed from: a () void
   private void method_1229() {
      class_677 var2 = (class_677)this.field_1107;
      String[] var10000 = class_752.method_4253();
      var2.field_2909.clear();
      String[] var1 = var10000;
      Iterator var3 = adb.field_2329.iterator();

      while(var3.hasNext()) {
         label99: {
            adb var4 = (adb)var3.next();
            adb var14 = var4;
            if(var1 != null) {
               if(var4 == null) {
                  break label99;
               }

               var14 = var4;
            }

            if(var1 != null) {
               if(var14.getCreativeTab() == null) {
                  break label99;
               }

               var14 = var4;
            }

            var14.getSubItems(var4, (class_872)null, var2.field_2909);
         }

         if(var1 == null) {
            break;
         }
      }

      class_940[] var11 = class_940.field_4782;
      int var5 = var11.length;
      int var6 = 0;

      while(true) {
         if(var6 < var5) {
            class_940 var7 = var11[var6];
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               if(var7 != null && var7.field_4810 != null) {
                  class_1010.field_5259.getBlock05(var7, var2.field_2909);
               }

               ++var6;
            }

            if(var1 != null) {
               continue;
            }
         }

         var3 = var2.field_2909.iterator();
         break;
      }

      String var12 = this.field_1205.method_714().toLowerCase();

      while(true) {
         if(var3.hasNext()) {
            add var13 = (add)var3.next();
            boolean var8 = false;
            if(var1 == null) {
               break;
            }

            Iterator var9 = var13.method_3774(this.field_557.cursorCounter8, this.field_557.canLoseFocus7.field_4506).iterator();

            boolean var15;
            while(true) {
               if(var9.hasNext()) {
                  String var10 = (String)var9.next();
                  var15 = var10.toLowerCase().contains(var12);
                  if(var1 == null) {
                     break;
                  }

                  if(var1 != null) {
                     if(!var15 && var1 != null) {
                        continue;
                     }

                     var15 = true;
                  }

                  var8 = var15;
               }

               var15 = var8;
               break;
            }

            if(!var15) {
               var3.remove();
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_1202 = 0.0F;
         var2.method_3694(0.0F);
         break;
      }

   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      class_872 var4 = class_872.field_4243[field_1201];
      String[] var3 = var10000;
      if(var3 != null && var4.method_5155()) {
         GL11.glDisable(3042);
         this.fontRendererObj.method_7020(class_1450.method_7896(var4.method_5149(), new Object[0]), 8, 6, 4210752);
      }

   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      if(var4 != null) {
         class_228 var10000;
         label31: {
            if(var3 == 0) {
               int var5 = var1 - this.field_1108;
               int var6 = var2 - this.field_1109;
               class_872[] var7 = class_872.field_4243;
               int var8 = var7.length;
               int var9 = 0;

               while(var9 < var8) {
                  class_872 var10 = var7[var9];
                  if(var4 != null) {
                     var10000 = this;
                     if(var4 == null) {
                        break label31;
                     }

                     if(this.method_1232(var10, var5, var6)) {
                        return;
                     }

                     ++var9;
                  }

                  if(var4 == null) {
                     break;
                  }
               }
            }

            var10000 = this;
         }

         var10000.method_862(var1, var2, var3);
      }

   }

   // $FF: renamed from: b (int, int, int) void
   protected void method_863(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      if(var4 != null) {
         class_228 var10000;
         label31: {
            if(var3 == 0) {
               int var5 = var1 - this.field_1108;
               int var6 = var2 - this.field_1109;
               class_872[] var7 = class_872.field_4243;
               int var8 = var7.length;
               int var9 = 0;

               while(var9 < var8) {
                  class_872 var10 = var7[var9];
                  if(var4 != null) {
                     var10000 = this;
                     if(var4 == null) {
                        break label31;
                     }

                     if(this.method_1232(var10, var5, var6)) {
                        this.method_1231(var10);
                        return;
                     }

                     ++var9;
                  }

                  if(var4 == null) {
                     break;
                  }
               }
            }

            var10000 = this;
         }

         var10000.method_863(var1, var2, var3);
      }

   }

   // $FF: renamed from: i () boolean
   private boolean method_1230() {
      int var10000;
      label32: {
         String[] var1 = class_752.method_4253();
         var10000 = field_1201;
         if(var1 != null) {
            if(field_1201 == class_872.fontRendererInstance5.method_5147()) {
               break label32;
            }

            var10000 = class_872.field_4243[field_1201].method_5157();
         }

         if(var1 != null) {
            if(var10000 == 0) {
               break label32;
            }

            var10000 = ((class_677)this.field_1107).method_3695();
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (a5) void
   private void method_1231(class_872 var1) {
      String[] var2;
      class_677 var4;
      label109: {
         int var3;
         label112: {
            var3 = field_1201;
            String[] var10000 = class_752.method_4253();
            field_1201 = var1.method_5147();
            var4 = (class_677)this.field_1107;
            var2 = var10000;
            this.field_1121.clear();
            Object var11 = var4;
            if(var2 != null) {
               var4.field_2909.clear();
               var1.method_5164(var4.field_2909);
               if(var1 != class_872.fontRendererInstance5) {
                  break label112;
               }

               var11 = this.field_557.cursorCounter8.field_3618;
            }

            Object var5 = var11;
            if(var2 != null) {
               if(this.field_1206 == null) {
                  this.field_1206 = var4.field_2869;
               }

               var4.field_2869 = new ArrayList();
            }

            int var6 = 0;

            while(true) {
               if(var6 < ((class_671)var5).field_2869.size()) {
                  class_503 var12 = new class_503;
                  var12.method_2905(this, (class_492)((class_671)var5).field_2869.get(var6), var6);
                  class_503 var7 = var12;
                  var4.field_2869.add(var7);
                  int var13 = var6;
                  if(var2 == null) {
                     break;
                  }

                  label114: {
                     int var8;
                     int var9;
                     int var10;
                     if(var2 != null) {
                        label92: {
                           if(var6 >= 5) {
                              var13 = var6;
                              if(var2 == null) {
                                 break label92;
                              }

                              if(var6 < 9) {
                                 var8 = var6 - 5;
                                 var9 = var8 / 2;
                                 var10 = var8 % 2;
                                 var7.field_2288 = 9 + var9 * 54;
                                 var7.field_2289 = 6 + var10 * 27;
                                 if(var2 != null) {
                                    break label114;
                                 }
                              }
                           }

                           var13 = var6;
                        }
                     }

                     int var10001;
                     label83: {
                        if(var2 != null) {
                           if(var13 >= 0) {
                              var13 = var6;
                              var10001 = 5;
                              if(var2 == null) {
                                 break label83;
                              }

                              if(var6 < 5) {
                                 var7.field_2289 = -2000;
                                 var7.field_2288 = -2000;
                                 if(var2 != null) {
                                    break label114;
                                 }
                              }
                           }

                           var13 = var6;
                        }

                        var10001 = ((class_671)var5).field_2869.size();
                     }

                     if(var2 != null) {
                        if(var13 >= var10001) {
                           break label114;
                        }

                        var13 = var6;
                        var10001 = 9;
                     }

                     var8 = var13 - var10001;
                     var9 = var8 % 9;
                     var10 = var8 / 9;
                     var12 = var7;
                     var10001 = 9 + var9 * 18;
                     if(var2 != null) {
                        var7.field_2288 = var10001;
                        if(var6 >= 36) {
                           var7.field_2289 = 112;
                           if(var2 != null) {
                              break label114;
                           }
                        }

                        var12 = var7;
                        var10001 = 54 + var10 * 18;
                     }

                     var12.field_2289 = var10001;
                  }

                  ++var6;
                  if(var2 != null) {
                     continue;
                  }
               }

               class_492 var14 = new class_492;
               var14.method_2869(field_1200, 0, 173, 112);
               this.field_1207 = var14;
               var4.field_2869.add(this.field_1207);
               break;
            }

            if(var2 != null) {
               break label109;
            }
         }

         if(var3 == class_872.fontRendererInstance5.method_5147()) {
            var4.field_2869 = this.field_1206;
            this.field_1206 = null;
         }
      }

      class_228 var15 = this;
      if(var2 != null) {
         if(this.field_1205 != null) {
            label55: {
               if(var1 == class_872.field_4249) {
                  this.field_1205.setVisible(true);
                  this.field_1205.setCanLoseFocus(false);
                  this.field_1205.setFocused(true);
                  this.field_1205.writeText("");
                  this.method_1229();
                  if(var2 != null) {
                     break label55;
                  }
               }

               this.field_1205.setVisible(false);
               this.field_1205.setCanLoseFocus(true);
               this.field_1205.setFocused(false);
            }
         }

         var15 = this;
      }

      var15.field_1202 = 0.0F;
      var4.method_3694(0.0F);
   }

   // $FF: renamed from: k () void
   public void method_869() {
      super.method_869();
      int var2 = Mouse.getEventDWheel();
      String[] var1 = class_752.method_4253();
      int var10000 = var2;
      if(var1 != null) {
         if(var2 == 0) {
            return;
         }

         var10000 = this.method_1230();
      }

      if(var1 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = ((class_677)this.field_1107).field_2909.size() / 9 - 5 + 1;
      }

      int var3 = var10000;
      var10000 = var2;
      if(var1 != null) {
         if(var2 > 0) {
            var2 = 1;
         }

         var10000 = var2;
      }

      if(var1 != null) {
         if(var10000 < 0) {
            var2 = -1;
         }

         this.field_1202 = (float)((double)this.field_1202 - (double)var2 / (double)var3);
         float var5;
         var10000 = (var5 = this.field_1202 - 0.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
      }

      class_228 var4;
      label58: {
         if(var1 != null) {
            if(var10000 < 0) {
               this.field_1202 = 0.0F;
            }

            var4 = this;
            if(var1 == null) {
               break label58;
            }

            float var6;
            var10000 = (var6 = this.field_1202 - 1.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
         }

         if(var10000 > 0) {
            this.field_1202 = 1.0F;
         }

         var4 = this;
      }

      ((class_677)var4.field_1107).method_3694(this.field_1202);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      byte var5 = Mouse.isButtonDown(0);
      int var6 = this.field_1108;
      int var7 = this.field_1109;
      String[] var4 = class_752.method_4253();
      int var8 = var6 + 175;
      int var9 = var7 + 18;
      int var10 = var8 + 14;
      int var11 = var9 + 112;
      int var10000 = this.field_1204;
      if(var4 != null) {
         label111: {
            if(!this.field_1204) {
               var10000 = var5;
               if(var4 == null) {
                  break label111;
               }

               if(var5 != 0) {
                  var10000 = var1;
                  if(var4 == null) {
                     break label111;
                  }

                  if(var1 >= var8) {
                     var10000 = var2;
                     if(var4 == null) {
                        break label111;
                     }

                     if(var2 >= var9) {
                        var10000 = var1;
                        if(var4 == null) {
                           break label111;
                        }

                        if(var1 < var10) {
                           var10000 = var2;
                           if(var4 == null) {
                              break label111;
                           }

                           if(var2 < var11) {
                              this.field_1203 = this.method_1230();
                           }
                        }
                     }
                  }
               }
            }

            var10000 = var5;
         }
      }

      class_228 var16;
      label115: {
         if(var4 != null) {
            if(var10000 == 0) {
               this.field_1203 = false;
            }

            this.field_1204 = (boolean)var5;
            var16 = this;
            if(var4 == null) {
               break label115;
            }

            var10000 = this.field_1203;
         }

         if(var10000 != 0) {
            label117: {
               this.field_1202 = ((float)(var2 - var9) - 7.5F) / ((float)(var11 - var9) - 15.0F);
               float var17;
               var10000 = (var17 = this.field_1202 - 0.0F) == 0.0F?0:(var17 < 0.0F?-1:1);
               if(var4 != null) {
                  if(var10000 < 0) {
                     this.field_1202 = 0.0F;
                  }

                  var16 = this;
                  if(var4 == null) {
                     break label117;
                  }

                  float var18;
                  var10000 = (var18 = this.field_1202 - 1.0F) == 0.0F?0:(var18 < 0.0F?-1:1);
               }

               if(var10000 > 0) {
                  this.field_1202 = 1.0F;
               }

               var16 = this;
            }

            ((class_677)var16.field_1107).method_3694(this.field_1202);
         }

         var16 = this;
      }

      var16.drawScreen(var1, var2, var3);
      class_872[] var12 = class_872.field_4243;
      int var13 = var12.length;
      int var14 = 0;

      while(true) {
         if(var14 < var13) {
            label73: {
               class_872 var15 = var12[var14];
               if(var4 != null) {
                  var10000 = this.method_1233(var15, var1, var2);
                  if(var4 == null) {
                     break;
                  }

                  if(var10000 != 0 && var4 != null) {
                     break label73;
                  }

                  ++var14;
               }

               if(var4 != null) {
                  continue;
               }
            }
         }

         if(this.field_1207 != null) {
            var10000 = field_1201;
            if(var4 == null) {
               break;
            }

            if(field_1201 == class_872.fontRendererInstance5.method_5147()) {
               var10000 = this.method_1200(this.field_1207.field_2288, this.field_1207.field_2289, 16, 16, var1, var2);
               if(var4 == null) {
                  break;
               }

               if(var10000 != 0) {
                  String[] var10001 = field_1211;
                  this.method_860(class_1450.method_7896("inventory.binSlot", new Object[0]), var1, var2);
               }
            }
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var10000 = 2896;
         break;
      }

      GL11.glDisable(var10000);
   }

   // $FF: renamed from: a (add, int, int) void
   protected void method_859(add var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      if(field_1201 == class_872.field_4249.method_5147()) {
         List var5;
         byte var15;
         label81: {
            var5 = var1.method_3774(this.field_557.cursorCounter8, this.field_557.canLoseFocus7.field_4506);
            class_872 var6 = var1.method_3730().getCreativeTab();
            class_872 var10000 = var6;
            if(var4 != null) {
               if(var6 == null) {
                  label68: {
                     add var14 = var1;
                     if(var4 != null) {
                        if(var1.method_3730() != class_1010.field_5259) {
                           break label68;
                        }

                        var14 = var1;
                     }

                     Map var7 = class_980.method_5641(var14);
                     if(var7.size() == 1) {
                        class_940 var8 = class_940.field_4782[((Integer)var7.keySet().iterator().next()).intValue()];
                        class_872[] var9 = class_872.field_4243;
                        int var10 = var9.length;
                        int var11 = 0;

                        while(var11 < var10) {
                           class_872 var12 = var9[var11];
                           if(var4 != null) {
                              var15 = var12.method_5163(var8.field_4810);
                              if(var4 == null) {
                                 break label81;
                              }

                              if(var15 != 0) {
                                 var6 = var12;
                                 if(var4 != null) {
                                    break;
                                 }
                              }

                              ++var11;
                           }

                           if(var4 == null) {
                              break;
                           }
                        }
                     }
                  }
               }

               var10000 = var6;
            }

            if(var10000 != null) {
               var5.add(1, "" + class_130.field_293 + class_130.field_285 + class_1450.method_7896(var6.method_5149(), new Object[0]));
            }

            var15 = 0;
         }

         int var13 = var15;

         while(true) {
            if(var13 < var5.size()) {
               if(var4 == null) {
                  break;
               }

               label42: {
                  if(var13 == 0) {
                     var5.set(var13, var1.method_3776().field_354 + (String)var5.get(var13));
                     if(var4 != null) {
                        break label42;
                     }
                  }

                  var5.set(var13, class_130.field_283 + (String)var5.get(var13));
               }

               ++var13;
               if(var4 != null) {
                  continue;
               }
            }

            this.method_861(var5, var2, var3);
            break;
         }

         if(var4 != null) {
            return;
         }
      }

      super.method_859(var1, var2, var3);
   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      bam.method_5216();
      class_872 var5 = class_872.field_4243[field_1201];
      String[] var10000 = class_752.method_4253();
      class_872[] var6 = class_872.field_4243;
      int var7 = var6.length;
      String[] var4 = var10000;
      int var8 = 0;

      int var11;
      int var10001;
      while(true) {
         if(var8 < var7) {
            class_872 var9 = var6[var8];
            this.field_557.method_5288().bindTexture(field_1199);
            if(var4 != null) {
               var11 = var9.method_5147();
               var10001 = field_1201;
               if(var4 == null) {
                  break;
               }

               if(var11 != field_1201) {
                  this.method_1234(var9);
               }

               ++var8;
            }

            if(var4 != null) {
               continue;
            }
         }

         bqf var12 = this.field_557.method_5288();
         bqx var13 = new bqx;
         StringBuilder var10003 = new StringBuilder();
         String[] var10004 = field_1211;
         var13.method_8227(var10003.append("textures/gui/container/creative_inventory/tab_").append(var5.method_5153()).toString());
         var12.bindTexture(var13);
         this.method_658(this.field_1108, this.field_1109, 0, 0, this.field_1105, this.field_1106);
         this.field_1205.drawTextBox();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var11 = this.field_1108;
         var10001 = 175;
         break;
      }

      class_228 var15;
      label57: {
         int var10 = var11 + var10001;
         var7 = this.field_1109 + 18;
         var8 = var7 + 112;
         this.field_557.method_5288().bindTexture(field_1199);
         class_872 var14 = var5;
         if(var4 != null) {
            if(var5.method_5157()) {
               int var10002 = var7 + (int)((float)(var8 - var7 - 17) * this.field_1202);
               int var16 = this.method_1230();
               if(var4 != null) {
                  var16 = var16 != 0?0:12;
               }

               this.method_658(var10, var10002, 232 + var16, 0, 12, 15);
            }

            var15 = this;
            if(var4 == null) {
               break label57;
            }

            this.method_1234(var5);
            var14 = var5;
         }

         if(var14 != class_872.fontRendererInstance5) {
            return;
         }

         var15 = this;
      }

      class_227.method_1226(var15.field_1108 + 43, this.field_1109 + 45, 20, (float)(this.field_1108 + 43 - var2), (float)(this.field_1109 + 45 - 30 - var3), this.field_557.cursorCounter8);
   }

   // $FF: renamed from: b (a5, int, int) boolean
   protected boolean method_1232(class_872 var1, int var2, int var3) {
      String[] var4;
      int var6;
      byte var7;
      int var9;
      label70: {
         label73: {
            String[] var10000 = class_752.method_4253();
            int var5 = var1.method_5159();
            var4 = var10000;
            var6 = 28 * var5;
            var7 = 0;
            var9 = var5;
            if(var4 != null) {
               if(var5 == 5) {
                  var6 = this.field_1105 - 28 + 2;
                  if(var4 != null) {
                     break label73;
                  }
               }

               var9 = var5;
            }

            if(var4 == null) {
               break label70;
            }

            if(var9 > 0) {
               var6 += var5;
            }
         }

         var9 = var1.method_5160();
      }

      int var8;
      label59: {
         if(var4 != null) {
            if(var9 != 0) {
               var8 = var7 - 32;
               if(var4 != null) {
                  break label59;
               }
            }

            var9 = var7 + this.field_1106;
         }

         var8 = var9;
      }

      label74: {
         var9 = var2;
         int var10001 = var6;
         if(var4 != null) {
            if(var2 < var6) {
               break label74;
            }

            var9 = var2;
            var10001 = var6 + 28;
         }

         if(var4 != null) {
            if(var9 > var10001) {
               break label74;
            }

            var9 = var3;
            var10001 = var8;
         }

         if(var4 != null) {
            if(var9 < var10001) {
               break label74;
            }

            var9 = var3;
            if(var4 == null) {
               return (boolean)var9;
            }

            var10001 = var8 + 32;
         }

         if(var9 <= var10001) {
            var9 = 1;
            return (boolean)var9;
         }
      }

      var9 = 0;
      return (boolean)var9;
   }

   // $FF: renamed from: c (a5, int, int) boolean
   protected boolean method_1233(class_872 var1, int var2, int var3) {
      String[] var4;
      int var6;
      byte var7;
      int var9;
      label43: {
         label46: {
            String[] var10000 = class_752.method_4253();
            int var5 = var1.method_5159();
            var4 = var10000;
            var6 = 28 * var5;
            var7 = 0;
            var9 = var5;
            if(var4 != null) {
               if(var5 == 5) {
                  var6 = this.field_1105 - 28 + 2;
                  if(var4 != null) {
                     break label46;
                  }
               }

               var9 = var5;
            }

            if(var4 == null) {
               break label43;
            }

            if(var9 > 0) {
               var6 += var5;
            }
         }

         var9 = var1.method_5160();
      }

      int var8;
      label32: {
         if(var4 != null) {
            if(var9 != 0) {
               var8 = var7 - 32;
               if(var4 != null) {
                  break label32;
               }
            }

            var9 = var7 + this.field_1106;
         }

         var8 = var9;
      }

      boolean var10 = this.method_1200(var6 + 3, var8 + 3, 23, 27, var2, var3);
      if(var4 != null) {
         if(var10) {
            this.method_860(class_1450.method_7896(var1.method_5149(), new Object[0]), var2, var3);
            return true;
         }

         var10 = false;
      }

      return var10;
   }

   // $FF: renamed from: b (a5) void
   protected void method_1234(class_872 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.method_5147();
      if(var2 != null) {
         var10000 = var10000 == field_1201?1:0;
      }

      int var3 = var10000;
      byte var4 = var1.method_5160();
      int var5 = var1.method_5159();
      int var6 = var5 * 28;
      int var7 = 0;
      int var8 = this.field_1108 + 28 * var5;
      int var9 = this.field_1109;
      byte var10 = 32;
      var10000 = var3;
      if(var2 != null) {
         if(var3 != 0) {
            var7 += 32;
         }

         var10000 = var5;
      }

      label56: {
         label62: {
            if(var2 != null) {
               if(var10000 == 5) {
                  var8 = this.field_1108 + this.field_1105 - 28;
                  if(var2 != null) {
                     break label62;
                  }
               }

               var10000 = var5;
            }

            if(var2 == null) {
               break label56;
            }

            if(var10000 > 0) {
               var8 += var5;
            }
         }

         var10000 = var4;
      }

      label45: {
         if(var2 != null) {
            if(var10000 != 0) {
               var9 -= 28;
               if(var2 != null) {
                  break label45;
               }
            }

            var7 += 64;
            var10000 = var9 + (this.field_1106 - 4);
         }

         var9 = var10000;
      }

      GL11.glDisable(2896);
      this.method_658(var8, var9, var6, var7, 28, var10);
      this.field_372 = 100.0F;
      field_556.field_3806 = 100.0F;
      var8 += 6;
      int var10002 = var4;
      if(var2 != null) {
         var10002 = var4 != 0?1:-1;
      }

      var9 += 8 + var10002;
      GL11.glEnable(2896);
      GL11.glEnable('\u803a');
      add var11 = var1.method_5150();
      field_556.method_4756(this.fontRendererObj, this.field_557.method_5288(), var11, var8, var9);
      field_556.method_4758(this.fontRendererObj, this.field_557.method_5288(), var11, var8, var9);
      GL11.glDisable(2896);
      field_556.field_3806 = 0.0F;
      this.field_372 = 0.0F;
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j () int
   public int method_1235() {
      return field_1201;
   }

   // $FF: renamed from: n () vN
   static class_1674 method_1236() {
      return field_1200;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_1237(Exception var0) {
      return var0;
   }
}

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lH
public abstract class class_215 extends bdw {

   // $FF: renamed from: b bqx
   protected static final bqx field_1104;
   // $FF: renamed from: i int
   protected int field_1105;
   // $FF: renamed from: r int
   protected int field_1106;
   // $FF: renamed from: s Al
   public class_671 field_1107;
   // $FF: renamed from: t int
   protected int field_1108;
   // $FF: renamed from: u int
   protected int field_1109;
   // $FF: renamed from: v aR
   private class_492 field_1110;
   // $FF: renamed from: w aR
   private class_492 field_1111;
   // $FF: renamed from: x boolean
   private boolean field_1112;
   // $FF: renamed from: y add
   private add field_1113;
   // $FF: renamed from: z int
   private int field_1114;
   // $FF: renamed from: A int
   private int field_1115;
   // $FF: renamed from: B aR
   private class_492 field_1116;
   // $FF: renamed from: C long
   private long field_1117;
   // $FF: renamed from: D add
   private add field_1118;
   // $FF: renamed from: E aR
   private class_492 field_1119;
   // $FF: renamed from: F long
   private long field_1120;
   // $FF: renamed from: G java.util.Set
   protected final Set field_1121;
   // $FF: renamed from: H boolean
   protected boolean field_1122;
   // $FF: renamed from: I int
   private int field_1123;
   // $FF: renamed from: J int
   private int field_1124;
   // $FF: renamed from: K boolean
   private boolean field_1125;
   // $FF: renamed from: L int
   private int field_1126;
   // $FF: renamed from: M long
   private long field_1127;
   // $FF: renamed from: N aR
   private class_492 field_1128;
   // $FF: renamed from: O int
   private int field_1129;
   // $FF: renamed from: P boolean
   private boolean field_1130;
   // $FF: renamed from: Q add
   private add field_1131;
   // $FF: renamed from: R java.lang.String
   private static final String field_1132;


   // $FF: renamed from: <init> (Al) void
   public void method_1192(class_671 var1) {
      super.method_651();
      this.field_1105 = 176;
      this.field_1106 = 166;
      this.field_1121 = new HashSet();
      this.field_1107 = var1;
      this.field_1125 = true;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      super.initGui();
      this.field_557.cursorCounter8.field_3619 = this.field_1107;
      this.field_1108 = (this.width - this.field_1105) / 2;
      this.field_1109 = (this.height - this.field_1106) / 2;
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var10000 = class_752.method_4253();
      this.method_873();
      String[] var4 = var10000;
      int var5 = this.field_1108;
      int var6 = this.field_1109;
      this.method_1195(var3, var1, var2);
      GL11.glDisable('\u803a');
      bam.method_5212();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      super.drawScreen(var1, var2, var3);
      bam.method_5216();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var5, (float)var6, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable('\u803a');
      this.field_1110 = null;
      short var7 = 240;
      short var8 = 240;
      buu.method_9080(buu.field_8557, (float)var7 / 1.0F, (float)var8 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var10 = 0;

      int var9;
      class_215 var22;
      int var23;
      while(true) {
         if(var10 < this.field_1107.field_2869.size()) {
            class_492 var11 = (class_492)this.field_1107.field_2869.get(var10);
            this.method_1196(var11);
            if(var4 != null) {
               var22 = this;
               if(var4 == null) {
                  break;
               }

               if(this.method_1199(var11, var1, var2)) {
                  label128: {
                     var23 = var11.method_2884();
                     if(var4 != null) {
                        if(var23 == 0) {
                           break label128;
                        }

                        this.field_1110 = var11;
                        GL11.glDisable(2896);
                        GL11.glDisable(2929);
                        var23 = var11.field_2288;
                     }

                     int var12 = var23;
                     var9 = var11.field_2289;
                     GL11.glColorMask(true, true, true, false);
                     this.drawGradientRect(var12, var9, var12 + 16, var9 + 16, -2130706433, -2130706433);
                     GL11.glColorMask(true, true, true, true);
                     GL11.glEnable(2896);
                     GL11.glEnable(2929);
                  }
               }

               ++var10;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_1194(var1, var2);
         var22 = this;
         break;
      }

      class_666 var16;
      add var24;
      label119: {
         var16 = var22.field_557.cursorCounter8.field_3616;
         var22 = this;
         if(var4 != null) {
            if(this.field_1113 == null) {
               var24 = var16.method_3617();
               break label119;
            }

            var22 = this;
         }

         var24 = var22.field_1113;
      }

      add var17 = var24;
      var24 = var17;
      if(var4 != null) {
         if(var17 != null) {
            String var13;
            byte var18;
            label142: {
               label107: {
                  var18 = 8;
                  var9 = this.field_1113 == null?8:16;
                  var13 = null;
                  var22 = this;
                  if(var4 != null) {
                     if(this.field_1113 != null) {
                        var23 = this.field_1112;
                        if(var4 == null) {
                           break label107;
                        }

                        if(this.field_1112) {
                           var17 = var17.method_3754();
                           var17.field_2958 = class_1715.method_9566((float)var17.field_2958 / 2.0F);
                           if(var4 != null) {
                              break label142;
                           }
                        }
                     }

                     var22 = this;
                  }

                  var23 = var22.field_1122;
               }

               if(var4 != null) {
                  if(var23 == 0) {
                     break label142;
                  }

                  var23 = this.field_1121.size();
               }

               if(var4 != null) {
                  if(var23 <= 1) {
                     break label142;
                  }

                  var17 = var17.method_3754();
                  var17.field_2958 = this.field_1126;
                  var23 = var17.field_2958;
               }

               if(var23 == 0) {
                  var13 = "" + class_130.field_290 + "0";
               }
            }

            this.method_1193(var17, var1 - var5 - var18, var2 - var6 - var9, var13);
         }

         var24 = this.field_1118;
      }

      if(var4 != null) {
         if(var24 != null) {
            float var19 = (float)(bao.method_5283() - this.field_1117) / 100.0F;
            float var27;
            var23 = (var27 = var19 - 1.0F) == 0.0F?0:(var27 < 0.0F?-1:1);
            if(var4 != null) {
               if(var23 >= 0) {
                  var19 = 1.0F;
                  this.field_1118 = null;
               }

               var23 = this.field_1116.field_2288 - this.field_1114;
            }

            var9 = var23;
            int var21 = this.field_1116.field_2289 - this.field_1115;
            int var14 = this.field_1114 + (int)((float)var9 * var19);
            int var15 = this.field_1115 + (int)((float)var21 * var19);
            this.method_1193(this.field_1118, var14, var15, (String)null);
         }

         GL11.glPopMatrix();
         if(var4 == null) {
            return;
         }

         var24 = var16.method_3617();
      }

      short var26;
      label79: {
         if(var24 == null) {
            label145: {
               class_492 var25 = this.field_1110;
               if(var4 != null) {
                  if(this.field_1110 == null) {
                     break label145;
                  }

                  var25 = this.field_1110;
               }

               var26 = var25.method_2876();
               if(var4 == null) {
                  break label79;
               }

               if(var26 != 0) {
                  add var20 = this.field_1110.method_2875();
                  this.method_859(var20, var1, var2);
               }
            }
         }

         GL11.glEnable(2896);
         var26 = 2929;
      }

      GL11.glEnable(var26);
      bam.method_5213();
   }

   // $FF: renamed from: b (add, int, int, java.lang.String) void
   private void method_1193(add var1, int var2, int var3, String var4) {
      GL11.glTranslatef(0.0F, 0.0F, 32.0F);
      this.field_372 = 200.0F;
      field_556.field_3806 = 200.0F;
      field_556.method_4756(this.fontRendererObj, this.field_557.method_5288(), var1, var2, var3);
      field_556.method_4759(this.fontRendererObj, this.field_557.method_5288(), var1, var2, var3 - (this.field_1113 == null?0:8), var4);
      this.field_372 = 0.0F;
      field_556.field_3806 = 0.0F;
   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {}

   // $FF: renamed from: b (float, int, int) void
   protected abstract void method_1195(float var1, int var2, int var3);

   // $FF: renamed from: b (aR) void
   private void method_1196(class_492 var1) {
      String[] var2;
      int var3;
      int var4;
      add var5;
      byte var6;
      class_215 var14;
      byte var15;
      label144: {
         var3 = var1.field_2288;
         var4 = var1.field_2289;
         var5 = var1.method_2875();
         String[] var10000 = class_752.method_4253();
         var6 = 0;
         var2 = var10000;
         if(var1 == this.field_1111) {
            label147: {
               var14 = this;
               if(var2 != null) {
                  if(this.field_1113 == null) {
                     break label147;
                  }

                  var14 = this;
               }

               var15 = var14.field_1112;
               if(var2 == null) {
                  break label144;
               }

               if(var15 == 0) {
                  var15 = 1;
                  break label144;
               }
            }
         }

         var15 = 0;
      }

      byte var7;
      String var9;
      add var17;
      label132: {
         label148: {
            add var8;
            boolean var16;
            label130: {
               label129: {
                  var7 = var15;
                  var8 = this.field_557.cursorCounter8.field_3616.method_3617();
                  var9 = null;
                  if(var1 == this.field_1111) {
                     var14 = this;
                     if(var2 == null) {
                        break label129;
                     }

                     if(this.field_1113 != null) {
                        var16 = this.field_1112;
                        if(var2 == null) {
                           break label130;
                        }

                        if(this.field_1112) {
                           label119: {
                              var17 = var5;
                              if(var2 != null) {
                                 if(var5 == null) {
                                    break label119;
                                 }

                                 var5 = var5.method_3754();
                                 var17 = var5;
                              }

                              var17.field_2958 /= 2;
                              if(var2 != null) {
                                 break label148;
                              }
                           }
                        }
                     }
                  }

                  var14 = this;
               }

               var16 = var14.field_1122;
            }

            if(var2 != null) {
               if(!var16) {
                  break label148;
               }

               var16 = this.field_1121.contains(var1);
            }

            if(var16 && var8 != null) {
               label149: {
                  int var11 = this.field_1121.size();
                  if(var2 != null) {
                     if(var11 == 1) {
                        return;
                     }

                     var11 = class_671.method_3673(var1, var8, true);
                  }

                  if(var2 != null) {
                     label102: {
                        if(var11 != 0) {
                           var16 = this.field_1107.method_3675(var1);
                           if(var2 == null) {
                              break label102;
                           }

                           if(var16) {
                              Set var12;
                              int var10001;
                              int var18;
                              label90: {
                                 var5 = var8.method_3754();
                                 var6 = 1;
                                 var12 = this.field_1121;
                                 var10001 = this.field_1123;
                                 add var10003 = var1.method_2875();
                                 if(var2 != null) {
                                    if(var10003 == null) {
                                       var18 = 0;
                                       break label90;
                                    }

                                    var10003 = var1.method_2875();
                                 }

                                 var18 = var10003.field_2958;
                              }

                              class_671.method_3674(var12, var10001, var5, var18);
                              if(var5.field_2958 > var5.method_3739()) {
                                 var9 = class_130.field_290 + "" + var5.method_3739();
                                 var5.field_2958 = var5.method_3739();
                              }

                              var17 = var5;
                              if(var2 == null) {
                                 break label132;
                              }

                              if(var5.field_2958 > var1.method_2879()) {
                                 var9 = class_130.field_290 + "" + var1.method_2879();
                                 var5.field_2958 = var1.method_2879();
                              }
                              break label149;
                           }
                        }

                        this.field_1121.remove(var1);
                     }
                  }

                  this.method_1197();
               }
            }
         }

         this.field_372 = 100.0F;
         field_556.field_3806 = 100.0F;
         var17 = var5;
      }

      if(var17 == null) {
         label83: {
            class_73 var10 = var1.method_2880();
            if(var2 != null) {
               if(var10 == null) {
                  break label83;
               }

               GL11.glDisable(2896);
               this.field_557.method_5288().bindTexture(bpz.field_7758);
               this.method_659(var3, var4, var10, 16, 16);
               GL11.glEnable(2896);
            }

            var7 = 1;
         }
      }

      label151: {
         short var13 = var7;
         if(var2 != null) {
            if(var7 != 0) {
               break label151;
            }

            var13 = var6;
         }

         if(var2 != null) {
            if(var13 != 0) {
               drawRect(var3, var4, var3 + 16, var4 + 16, -2130706433);
            }

            var13 = 2929;
         }

         GL11.glEnable(var13);
         field_556.method_4756(this.fontRendererObj, this.field_557.method_5288(), var5, var3, var4);
         field_556.method_4759(this.fontRendererObj, this.field_557.method_5288(), var5, var3, var4, var9);
      }

      field_556.field_3806 = 0.0F;
      this.field_372 = 0.0F;
   }

   // $FF: renamed from: f () void
   private void method_1197() {
      String[] var10000 = class_752.method_4253();
      add var2 = this.field_557.cursorCounter8.field_3616.method_3617();
      String[] var1 = var10000;
      if(var2 != null) {
         class_215 var7 = this;
         if(var1 != null) {
            if(!this.field_1122) {
               return;
            }

            this.field_1126 = var2.field_2958;
            var7 = this;
         }

         Iterator var5 = var7.field_1121.iterator();

         while(var5.hasNext()) {
            add var3;
            class_492 var6;
            add var8;
            int var9;
            label44: {
               var6 = (class_492)var5.next();
               var3 = var2.method_3754();
               var8 = var6.method_2875();
               if(var1 != null) {
                  if(var8 == null) {
                     var9 = 0;
                     break label44;
                  }

                  var8 = var6.method_2875();
               }

               var9 = var8.field_2958;
            }

            int var4;
            label38: {
               label58: {
                  var4 = var9;
                  class_671.method_3674(this.field_1121, this.field_1123, var3, var4);
                  var9 = var3.field_2958;
                  int var10001 = var3.method_3739();
                  if(var1 != null) {
                     if(var9 > var10001) {
                        var3.field_2958 = var3.method_3739();
                     }

                     var8 = var3;
                     if(var1 == null) {
                        break label58;
                     }

                     var9 = var3.field_2958;
                     var10001 = var6.method_2879();
                  }

                  if(var9 <= var10001) {
                     break label38;
                  }

                  var8 = var3;
               }

               var8.field_2958 = var6.method_2879();
            }

            this.field_1126 -= var3.field_2958 - var4;
            if(var1 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: b (int, int) aR
   private class_492 method_1198(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < this.field_1107.field_2869.size()) {
         class_492 var5 = (class_492)this.field_1107.field_2869.get(var4);
         if(var3 != null) {
            if(this.method_1199(var5, var1, var2)) {
               return var5;
            }

            ++var4;
         }

         if(var3 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      String[] var4 = class_752.method_4253();
      int var10000 = var3;
      if(var4 != null) {
         var10000 = var3 == this.field_557.canLoseFocus7.field_4542.getEnableBackgroundDrawing8() + 100?1:0;
      }

      int var5;
      class_492 var6;
      long var7;
      int var10001;
      label270: {
         var5 = var10000;
         var6 = this.method_1198(var1, var2);
         var7 = bao.method_5283();
         if(this.field_1128 == var6) {
            label274: {
               long var20;
               var10001 = (var20 = var7 - this.field_1127 - 250L) == 0L?0:(var20 < 0L?-1:1);
               if(var4 != null) {
                  if(var10001 >= 0) {
                     break label274;
                  }

                  var10001 = this.field_1129;
               }

               if(var4 == null) {
                  break label270;
               }

               if(var10001 == var3) {
                  var10001 = 1;
                  break label270;
               }
            }
         }

         var10001 = 0;
      }

      class_215 var19;
      label258: {
         label290: {
            this.field_1130 = (boolean)var10001;
            this.field_1125 = false;
            var10000 = var3;
            if(var4 != null) {
               label255: {
                  if(var3 != 0) {
                     var10000 = var3;
                     if(var4 == null) {
                        break label255;
                     }

                     if(var3 != 1) {
                        var10000 = var5;
                        if(var4 == null) {
                           break label255;
                        }

                        if(var5 == 0) {
                           break label290;
                        }
                     }
                  }

                  var10000 = this.field_1108;
               }
            }

            int var9 = var10000;
            int var10 = this.field_1109;
            var10000 = var1;
            if(var4 != null) {
               label287: {
                  if(var1 >= var9) {
                     var10000 = var2;
                     if(var4 == null) {
                        break label287;
                     }

                     if(var2 >= var10) {
                        var10000 = var1;
                        if(var4 == null) {
                           break label287;
                        }

                        if(var1 < var9 + this.field_1105) {
                           var10000 = var2;
                           if(var4 == null) {
                              break label287;
                           }

                           if(var2 < var10 + this.field_1106) {
                              var10000 = 0;
                              break label287;
                           }
                        }
                     }
                  }

                  var10000 = 1;
               }
            }

            int var11;
            int var12;
            class_492 var15;
            label190: {
               var11 = var10000;
               var12 = -1;
               var15 = var6;
               if(var4 != null) {
                  if(var6 == null) {
                     break label190;
                  }

                  var15 = var6;
               }

               var12 = var15.field_2287;
            }

            var10000 = var11;
            if(var4 != null) {
               if(var11 != 0) {
                  var12 = -999;
               }

               var10000 = this.field_557.canLoseFocus7.field_4509;
            }

            if(var4 != null) {
               label219: {
                  if(var10000 != 0) {
                     var10000 = var11;
                     if(var4 == null) {
                        break label219;
                     }

                     if(var11 != 0) {
                        label213: {
                           bao var18 = this.field_557;
                           if(var4 != null) {
                              if(this.field_557.cursorCounter8.field_3616.method_3617() != null) {
                                 break label213;
                              }

                              var18 = this.field_557;
                           }

                           var18.method_5236((bdw)null);
                           return;
                        }
                     }
                  }

                  var10000 = var12;
               }
            }

            if(var4 != null) {
               if(var10000 == -1) {
                  break label290;
               }

               var10000 = this.field_557.canLoseFocus7.field_4509;
            }

            if(var4 != null) {
               if(var10000 != 0) {
                  label234: {
                     var15 = var6;
                     if(var4 != null) {
                        if(var6 == null) {
                           break label234;
                        }

                        var15 = var6;
                     }

                     if(var15.method_2876()) {
                        this.field_1111 = var6;
                        this.field_1113 = null;
                        var10001 = var3;
                        if(var4 != null) {
                           var10001 = var3 == 1?1:0;
                        }

                        this.field_1112 = (boolean)var10001;
                        if(var4 != null) {
                           break label290;
                        }
                     }
                  }

                  this.field_1111 = null;
                  if(var4 != null) {
                     break label290;
                  }
               }

               var19 = this;
               if(var4 == null) {
                  break label258;
               }

               var10000 = this.field_1122;
            }

            if(var10000 == 0) {
               label278: {
                  var19 = this;
                  if(var4 != null) {
                     if(this.field_557.cursorCounter8.field_3616.method_3617() == null) {
                        label279: {
                           label176: {
                              label280: {
                                 label281: {
                                    var10000 = var3;
                                    var10001 = this.field_557.canLoseFocus7.field_4542.getEnableBackgroundDrawing8() + 100;
                                    if(var4 != null) {
                                       if(var3 == var10001) {
                                          this.method_1201(var6, var12, var3, 3);
                                          if(var4 != null) {
                                             break label279;
                                          }
                                       }

                                       var10000 = var12;
                                       if(var4 == null) {
                                          break label281;
                                       }

                                       var10001 = -999;
                                    }

                                    if(var10000 == var10001) {
                                       break label280;
                                    }

                                    var10000 = Keyboard.isKeyDown(42);
                                 }

                                 if(var4 == null) {
                                    break label176;
                                 }

                                 if(var10000 == 0) {
                                    var10000 = Keyboard.isKeyDown(54);
                                    if(var4 == null) {
                                       break label176;
                                    }

                                    if(var10000 == 0) {
                                       break label280;
                                    }
                                 }

                                 var10000 = 1;
                                 break label176;
                              }

                              var10000 = 0;
                           }

                           int var14;
                           label283: {
                              int var13 = var10000;
                              var14 = 0;
                              var10000 = var13;
                              if(var4 != null) {
                                 if(var13 != 0) {
                                    add var17;
                                    label145: {
                                       label284: {
                                          class_492 var16 = var6;
                                          if(var4 != null) {
                                             if(var6 == null) {
                                                break label284;
                                             }

                                             var16 = var6;
                                          }

                                          if(var4 != null) {
                                             if(!var16.method_2876()) {
                                                break label284;
                                             }

                                             var16 = var6;
                                          }

                                          var17 = var16.method_2875();
                                          break label145;
                                       }

                                       var17 = null;
                                    }

                                    this.field_1131 = var17;
                                    var14 = 1;
                                    if(var4 != null) {
                                       break label283;
                                    }
                                 }

                                 var10000 = var12;
                              }

                              if(var4 != null) {
                                 if(var10000 != -999) {
                                    break label283;
                                 }

                                 var10000 = 4;
                              }

                              var14 = var10000;
                           }

                           this.method_1201(var6, var12, var3, var14);
                        }

                        this.field_1125 = true;
                        if(var4 != null) {
                           break label278;
                        }
                     }

                     this.field_1122 = true;
                     this.field_1124 = var3;
                     var19 = this;
                  }

                  var19.field_1121.clear();
                  var10000 = var3;
                  if(var4 != null) {
                     if(var3 == 0) {
                        this.field_1123 = 0;
                        if(var4 != null) {
                           break label278;
                        }
                     }

                     var10000 = var3;
                  }

                  if(var10000 == 1) {
                     this.field_1123 = 1;
                  }
               }
            }
         }

         this.field_1128 = var6;
         this.field_1127 = var7;
         var19 = this;
      }

      var19.field_1129 = var3;
   }

   // $FF: renamed from: a (int, int, int, long) void
   protected void method_864(int var1, int var2, int var3, long var4) {
      String[] var6;
      class_492 var7;
      add var8;
      boolean var12;
      int var13;
      add var14;
      label117: {
         var7 = this.method_1198(var1, var2);
         String[] var10000 = class_752.method_4253();
         var8 = this.field_557.cursorCounter8.field_3616.method_3617();
         var6 = var10000;
         class_215 var11 = this;
         if(var6 != null) {
            if(this.field_1111 != null) {
               var12 = this.field_557.canLoseFocus7.field_4509;
               if(var6 == null) {
                  break label117;
               }

               if(this.field_557.canLoseFocus7.field_4509) {
                  label108: {
                     var13 = var3;
                     if(var6 != null) {
                        if(var3 == 0) {
                           break label108;
                        }

                        var13 = var3;
                     }

                     if(var13 != 1) {
                        return;
                     }
                  }

                  var14 = this.field_1113;
                  if(var6 != null) {
                     if(this.field_1113 == null) {
                        if(var7 == this.field_1111) {
                           return;
                        }

                        this.field_1113 = this.field_1111.method_2875().method_3754();
                        if(var6 != null) {
                           return;
                        }
                     }

                     var14 = this.field_1113;
                  }

                  if(var14.field_2958 <= 1) {
                     return;
                  }

                  class_492 var15 = var7;
                  if(var6 != null) {
                     if(var7 == null) {
                        return;
                     }

                     var15 = var7;
                  }

                  if(!class_671.method_3673(var15, this.field_1113, false)) {
                     return;
                  }

                  label84: {
                     long var9 = bao.method_5283();
                     var11 = this;
                     if(var6 != null) {
                        if(this.field_1119 == var7) {
                           if(var9 - this.field_1120 <= 500L) {
                              break label84;
                           }

                           this.method_1201(this.field_1111, this.field_1111.field_2287, 0, 0);
                           this.method_1201(var7, var7.field_2287, 1, 0);
                           this.method_1201(this.field_1111, this.field_1111.field_2287, 0, 0);
                           this.field_1120 = var9 + 750L;
                           --this.field_1113.field_2958;
                           if(var6 != null) {
                              break label84;
                           }
                        }

                        this.field_1119 = var7;
                        var11 = this;
                     }

                     var11.field_1120 = var9;
                  }

                  if(var6 != null) {
                     return;
                  }
               }
            }

            var11 = this;
         }

         var12 = var11.field_1122;
      }

      if(var12 && var7 != null) {
         var14 = var8;
         if(var6 != null) {
            if(var8 == null) {
               return;
            }

            var14 = var8;
         }

         var13 = var14.field_2958;
         if(var6 != null) {
            if(var14.field_2958 <= this.field_1121.size()) {
               return;
            }

            var13 = class_671.method_3673(var7, var8, true);
         }

         if(var6 != null) {
            if(var13 == 0) {
               return;
            }

            var13 = var7.method_2874(var8);
         }

         if(var6 != null) {
            if(var13 == 0) {
               return;
            }

            var13 = this.field_1107.method_3675(var7);
         }

         if(var6 != null) {
            if(var13 == 0) {
               return;
            }

            this.field_1121.add(var7);
         }

         this.method_1197();
      }

   }

   // $FF: renamed from: b (int, int, int) void
   protected void method_863(int var1, int var2, int var3) {
      class_492 var5 = this.method_1198(var1, var2);
      int var6 = this.field_1108;
      String[] var10000 = class_752.method_4253();
      int var7 = this.field_1109;
      String[] var4 = var10000;
      int var14 = var1;
      if(var4 != null) {
         label374: {
            if(var1 >= var6) {
               var14 = var2;
               if(var4 == null) {
                  break label374;
               }

               if(var2 >= var7) {
                  var14 = var1;
                  if(var4 == null) {
                     break label374;
                  }

                  if(var1 < var6 + this.field_1105) {
                     var14 = var2;
                     if(var4 == null) {
                        break label374;
                     }

                     if(var2 < var7 + this.field_1106) {
                        var14 = 0;
                        break label374;
                     }
                  }
               }
            }

            var14 = 1;
         }
      }

      int var8;
      int var9;
      class_492 var16;
      label361: {
         var8 = var14;
         var9 = -1;
         var16 = var5;
         if(var4 != null) {
            if(var5 == null) {
               break label361;
            }

            var16 = var5;
         }

         var9 = var16.field_2287;
      }

      var14 = var8;
      if(var4 != null) {
         if(var8 != 0) {
            var9 = -999;
         }

         var14 = this.field_1130;
      }

      class_215 var19;
      label378: {
         add var21;
         label379: {
            label380: {
               class_492 var10;
               Iterator var11;
               boolean var20;
               if(var4 != null) {
                  label350: {
                     if(var14 != 0 && var5 != null) {
                        var14 = var3;
                        if(var4 == null) {
                           break label350;
                        }

                        if(var3 == 0) {
                           var14 = this.field_1107.method_3656((add)null, var5);
                           if(var4 == null) {
                              break label350;
                           }

                           if(var14 != 0) {
                              label299: {
                                 label298: {
                                    label297: {
                                       if(method_878()) {
                                          var16 = var5;
                                          if(var4 != null) {
                                             if(var5 == null) {
                                                break label297;
                                             }

                                             var16 = var5;
                                          }

                                          if(var16.field_2286 == null) {
                                             break label297;
                                          }

                                          var19 = this;
                                          if(var4 == null) {
                                             break label298;
                                          }

                                          if(this.field_1131 == null) {
                                             break label297;
                                          }

                                          var11 = this.field_1107.field_2869.iterator();

                                          do {
                                             label290:
                                             do {
                                                while(true) {
                                                   var20 = var11.hasNext();

                                                   while(true) {
                                                      if(!var20) {
                                                         break label297;
                                                      }

                                                      var10 = (class_492)var11.next();
                                                      if(var4 == null) {
                                                         break label299;
                                                      }

                                                      var16 = var10;
                                                      if(var4 != null) {
                                                         if(var10 == null) {
                                                            break;
                                                         }

                                                         var16 = var10;
                                                      }

                                                      label383: {
                                                         var20 = var16.method_2883(this.field_557.cursorCounter8);
                                                         if(var4 != null) {
                                                            if(!var20) {
                                                               break;
                                                            }

                                                            var16 = var10;
                                                            if(var4 == null) {
                                                               break label383;
                                                            }

                                                            var20 = var10.method_2876();
                                                         }

                                                         if(!var20) {
                                                            break;
                                                         }

                                                         var16 = var10;
                                                      }

                                                      if(var4 != null) {
                                                         if(var16.field_2286 != var5.field_2286) {
                                                            break;
                                                         }

                                                         var16 = var10;
                                                      }

                                                      var20 = class_671.method_3673(var16, this.field_1131, true);
                                                      if(var4 != null) {
                                                         continue label290;
                                                      }
                                                   }
                                                }
                                             } while(!var20);

                                             this.method_1201(var10, var10.field_2287, var3, 1);
                                          } while(var4 != null);
                                       }

                                       this.method_1201(var5, var9, var3, 6);
                                    }

                                    this.field_1130 = false;
                                    var19 = this;
                                 }

                                 var19.field_1127 = 0L;
                              }

                              if(var4 != null) {
                                 break label380;
                              }
                           }
                        }
                     }

                     var14 = this.field_1122;
                  }
               }

               label385: {
                  if(var4 != null) {
                     label386: {
                        if(var14 != 0) {
                           var14 = this.field_1124;
                           if(var4 == null) {
                              break label386;
                           }

                           if(this.field_1124 != var3) {
                              this.field_1122 = false;
                              this.field_1121.clear();
                              this.field_1125 = true;
                              return;
                           }
                        }

                        var19 = this;
                        if(var4 == null) {
                           break label385;
                        }

                        var14 = this.field_1125;
                     }
                  }

                  if(var14 != 0) {
                     this.field_1125 = false;
                     return;
                  }

                  var19 = this;
               }

               label387: {
                  label388: {
                     if(var4 != null) {
                        if(var19.field_1111 != null) {
                           var20 = this.field_557.canLoseFocus7.field_4509;
                           if(var4 == null) {
                              break label388;
                           }

                           if(this.field_557.canLoseFocus7.field_4509) {
                              label322: {
                                 var14 = var3;
                                 if(var4 != null) {
                                    if(var3 == 0) {
                                       break label322;
                                    }

                                    var14 = var3;
                                 }

                                 if(var14 != 1) {
                                    break label380;
                                 }
                              }

                              class_215 var10001;
                              label234: {
                                 if(this.field_1113 == null) {
                                    var16 = var5;
                                    var10001 = this;
                                    if(var4 == null) {
                                       break label234;
                                    }

                                    if(var5 != this.field_1111) {
                                       this.field_1113 = this.field_1111.method_2875();
                                    }
                                 }

                                 var16 = var5;
                                 var10001 = this;
                              }

                              label229: {
                                 label228: {
                                    label390: {
                                       boolean var12 = class_671.method_3673(var16, var10001.field_1113, false);
                                       if(var9 != -1) {
                                          var21 = this.field_1113;
                                          if(var4 == null) {
                                             break label390;
                                          }

                                          if(this.field_1113 != null && var12) {
                                             this.method_1201(this.field_1111, this.field_1111.field_2287, var3, 0);
                                             this.method_1201(var5, var9, 0, 0);
                                             var19 = this;
                                             if(var4 != null) {
                                                if(this.field_557.cursorCounter8.field_3616.method_3617() != null) {
                                                   this.method_1201(this.field_1111, this.field_1111.field_2287, var3, 0);
                                                   this.field_1114 = var1 - var6;
                                                   this.field_1115 = var2 - var7;
                                                   this.field_1116 = this.field_1111;
                                                   this.field_1118 = this.field_1113;
                                                   this.field_1117 = bao.method_5283();
                                                   if(var4 != null) {
                                                      break label228;
                                                   }
                                                }

                                                var19 = this;
                                             }

                                             var19.field_1118 = null;
                                             if(var4 != null) {
                                                break label228;
                                             }
                                          }
                                       }

                                       var19 = this;
                                       if(var4 == null) {
                                          break label229;
                                       }

                                       var21 = this.field_1113;
                                    }

                                    if(var21 != null) {
                                       this.field_1114 = var1 - var6;
                                       this.field_1115 = var2 - var7;
                                       this.field_1116 = this.field_1111;
                                       this.field_1118 = this.field_1113;
                                       this.field_1117 = bao.method_5283();
                                    }
                                 }

                                 this.field_1113 = null;
                                 var19 = this;
                              }

                              var19.field_1111 = null;
                              if(var4 != null) {
                                 break label380;
                              }
                           }
                        }

                        var19 = this;
                     }

                     if(var4 == null) {
                        break label387;
                     }

                     var20 = var19.field_1122;
                  }

                  if(var20) {
                     var19 = this;
                     if(var4 == null) {
                        break label387;
                     }

                     if(!this.field_1121.isEmpty()) {
                        this.method_1201((class_492)null, -999, class_671.method_3670(0, this.field_1123), 5);
                        var11 = this.field_1121.iterator();

                        while(true) {
                           if(var11.hasNext()) {
                              var10 = (class_492)var11.next();
                              this.method_1201(var10, var10.field_2287, class_671.method_3670(1, this.field_1123), 5);
                              if(var4 == null) {
                                 break;
                              }

                              if(var4 != null) {
                                 continue;
                              }
                           }

                           this.method_1201((class_492)null, -999, class_671.method_3670(2, this.field_1123), 5);
                           break;
                        }

                        if(var4 != null) {
                           break label380;
                        }
                     }
                  }

                  var19 = this;
               }

               var21 = var19.field_557.cursorCounter8.field_3616.method_3617();
               if(var4 == null) {
                  break label379;
               }

               if(var21 != null) {
                  label392: {
                     label200: {
                        label393: {
                           label394: {
                              var14 = var3;
                              int var15 = this.field_557.canLoseFocus7.field_4542.getEnableBackgroundDrawing8() + 100;
                              if(var4 != null) {
                                 if(var3 == var15) {
                                    this.method_1201(var5, var9, var3, 3);
                                    if(var4 != null) {
                                       break label392;
                                    }
                                 }

                                 var14 = var9;
                                 if(var4 == null) {
                                    break label394;
                                 }

                                 var15 = -999;
                              }

                              if(var14 == var15) {
                                 break label393;
                              }

                              var14 = Keyboard.isKeyDown(42);
                           }

                           if(var4 == null) {
                              break label200;
                           }

                           if(var14 == 0) {
                              var14 = Keyboard.isKeyDown(54);
                              if(var4 == null) {
                                 break label200;
                              }

                              if(var14 == 0) {
                                 break label393;
                              }
                           }

                           var14 = 1;
                           break label200;
                        }

                        var14 = 0;
                     }

                     int var13 = var14;
                     if(var13 != 0) {
                        add var18;
                        label174: {
                           label396: {
                              class_492 var17 = var5;
                              if(var4 != null) {
                                 if(var5 == null) {
                                    break label396;
                                 }

                                 var17 = var5;
                              }

                              if(var4 != null) {
                                 if(!var17.method_2876()) {
                                    break label396;
                                 }

                                 var17 = var5;
                              }

                              var18 = var17.method_2875();
                              break label174;
                           }

                           var18 = null;
                        }

                        this.field_1131 = var18;
                     }

                     int var10004 = var13;
                     if(var4 != null) {
                        var10004 = var13 != 0?1:0;
                     }

                     this.method_1201(var5, var9, var3, var10004);
                  }
               }
            }

            var19 = this;
            if(var4 == null) {
               break label378;
            }

            var21 = this.field_557.cursorCounter8.field_3616.method_3617();
         }

         if(var21 == null) {
            this.field_1127 = 0L;
         }

         var19 = this;
      }

      var19.field_1122 = false;
   }

   // $FF: renamed from: b (aR, int, int) boolean
   private boolean method_1199(class_492 var1, int var2, int var3) {
      return this.method_1200(var1.field_2288, var1.field_2289, 16, 16, var2, var3);
   }

   // $FF: renamed from: a (int, int, int, int, int, int) boolean
   protected boolean method_1200(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var10;
      label40: {
         int var8 = this.field_1108;
         String[] var10000 = class_752.method_4253();
         int var9 = this.field_1109;
         String[] var7 = var10000;
         var5 -= var8;
         var6 -= var9;
         var10 = var5;
         int var10001 = var1 - 1;
         if(var7 != null) {
            if(var5 < var10001) {
               break label40;
            }

            var10 = var5;
            var10001 = var1 + var3 + 1;
         }

         if(var7 != null) {
            if(var10 >= var10001) {
               break label40;
            }

            var10 = var6;
            var10001 = var2 - 1;
         }

         if(var7 != null) {
            if(var10 < var10001) {
               break label40;
            }

            var10 = var6;
            if(var7 == null) {
               return (boolean)var10;
            }

            var10001 = var2 + var4 + 1;
         }

         if(var10 < var10001) {
            var10 = 1;
            return (boolean)var10;
         }
      }

      var10 = 0;
      return (boolean)var10;
   }

   // $FF: renamed from: b (aR, int, int, int) void
   protected void method_1201(class_492 var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      if(var5 != null) {
         if(var1 != null) {
            var2 = var1.field_2287;
         }

         this.field_557.maxStringLength8.method_7855(this.field_1107.field_2870, var2, var3, var4, this.field_557.cursorCounter8);
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      int var10000;
      int var10001;
      String[] var3;
      label61: {
         label60: {
            label59: {
               var3 = class_752.method_4253();
               var10000 = var2;
               var10001 = 1;
               if(var3 != null) {
                  if(var2 == 1) {
                     break label59;
                  }

                  var10000 = var2;
                  if(var3 == null) {
                     break label61;
                  }

                  var10001 = this.field_557.canLoseFocus7.field_4538.getEnableBackgroundDrawing8();
               }

               if(var10000 != var10001) {
                  break label60;
               }
            }

            this.field_557.cursorCounter8.method_4564();
         }

         this.method_1202(var2);
      }

      class_492 var4 = this.field_1110;
      if(var3 != null) {
         if(this.field_1110 == null) {
            return;
         }

         var4 = this.field_1110;
      }

      var10000 = var4.method_2876();
      if(var3 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var2;
      }

      var10001 = this.field_557.canLoseFocus7.field_4542.getEnableBackgroundDrawing8();
      if(var3 != null) {
         if(var10000 == var10001) {
            this.method_1201(this.field_1110, this.field_1110.field_2287, 0, 3);
            if(var3 != null) {
               return;
            }
         }

         var10000 = var2;
         var10001 = this.field_557.canLoseFocus7.field_4540.getEnableBackgroundDrawing8();
      }

      if(var10000 == var10001) {
         class_492 var5 = this.field_1110;
         int var10002 = this.field_1110.field_2287;
         int var10003 = method_877();
         if(var3 != null) {
            var10003 = var10003 != 0?1:0;
         }

         this.method_1201(var5, var10002, var10003, 4);
      }

   }

   // $FF: renamed from: a (int) boolean
   protected boolean method_1202(int var1) {
      int var4;
      label38: {
         String[] var2 = class_752.method_4253();
         class_215 var10000 = this;
         if(var2 != null) {
            if(this.field_557.cursorCounter8.field_3616.method_3617() != null) {
               break label38;
            }

            var10000 = this;
         }

         if(var10000.field_1110 != null) {
            int var3 = 0;

            while(var3 < 9) {
               var4 = var1;
               if(var2 == null) {
                  return (boolean)var4;
               }

               if(var2 != null) {
                  if(var1 != this.field_557.canLoseFocus7.field_4555[var3].getEnableBackgroundDrawing8()) {
                     ++var3;
                     if(var2 == null) {
                        break;
                     }
                     continue;
                  }

                  this.method_1201(this.field_1110, this.field_1110.field_2287, var3, 2);
                  var4 = 1;
               }

               return (boolean)var4;
            }
         }
      }

      var4 = 0;
      return (boolean)var4;
   }

   // $FF: renamed from: m () void
   public void method_872() {
      String[] var1 = class_752.method_4253();
      class_215 var10000 = this;
      if(var1 != null) {
         if(this.field_557.cursorCounter8 == null) {
            return;
         }

         var10000 = this;
      }

      var10000.field_1107.method_3658(this.field_557.cursorCounter8);
   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return false;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      String[] var10000 = class_752.method_4253();
      super.method_871();
      String[] var1 = var10000;
      bjk var2 = this.field_557.cursorCounter8;
      if(var1 != null) {
         label17: {
            if(this.field_557.cursorCounter8.method_3917()) {
               var2 = this.field_557.cursorCounter8;
               if(var1 == null) {
                  break label17;
               }

               if(!this.field_557.cursorCounter8.field_3012) {
                  return;
               }
            }

            var2 = this.field_557.cursorCounter8;
         }
      }

      var2.method_4564();
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "ÓX?\\ #{$äq0Ñz@ã;/ÐfCFÿz<Äf@â;!Ëy\tKä{:Ü!K÷";
      int var5 = "ÓX?\\ #{$äq0Ñz@ã;/ÐfCFÿz<Äf@â;!Ëy\tKä{:Ü!K÷".length();
      char var2 = 11;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  field_1132 = "CL_00000737";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/gui/container/inventory.png");
                  field_1104 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 103;
               break;
            case 1:
               var10009 = 227;
               break;
            case 2:
               var10009 = 191;
               break;
            case 3:
               var10009 = 82;
               break;
            case 4:
               var10009 = 248;
               break;
            case 5:
               var10009 = 155;
               break;
            default:
               var10009 = 210;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

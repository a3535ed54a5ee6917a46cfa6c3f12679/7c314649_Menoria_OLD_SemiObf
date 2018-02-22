import java.util.List;
import java.util.Random;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lE
public class class_196 extends bdw implements class_37 {

   // $FF: renamed from: b int
   private static final int field_829;
   // $FF: renamed from: i int
   private static final int field_830;
   // $FF: renamed from: r int
   private static final int field_831;
   // $FF: renamed from: s int
   private static final int field_832;
   // $FF: renamed from: t bqx
   private static final bqx field_833;
   // $FF: renamed from: u bdw
   protected bdw field_834;
   // $FF: renamed from: v int
   protected int field_835;
   // $FF: renamed from: w int
   protected int field_836;
   // $FF: renamed from: x int
   protected int field_837;
   // $FF: renamed from: y int
   protected int field_838;
   // $FF: renamed from: z float
   protected float field_839;
   // $FF: renamed from: A double
   protected double field_840;
   // $FF: renamed from: B double
   protected double field_841;
   // $FF: renamed from: C double
   protected double field_842;
   // $FF: renamed from: D double
   protected double field_843;
   // $FF: renamed from: E double
   protected double field_844;
   // $FF: renamed from: F double
   protected double field_845;
   // $FF: renamed from: G int
   private int field_846;
   // $FF: renamed from: H vd
   private class_1699 field_847;
   // $FF: renamed from: I boolean
   private boolean field_848;
   // $FF: renamed from: J java.lang.String
   private static final String field_849;
   // $FF: renamed from: K java.lang.String[]
   private static final String[] field_850;


   // $FF: renamed from: <init> (bdw, vd) void
   public void method_1066(bdw var1, class_1699 var2) {
      super.method_651();
      this.field_835 = 256;
      this.field_836 = 202;
      this.field_839 = 1.0F;
      this.field_848 = true;
      this.field_834 = var1;
      this.field_847 = var2;
      short var3 = 141;
      short var4 = 141;
      this.field_840 = this.field_842 = this.field_844 = (double)(class_1600.field_8330.field_8379 * 24 - var3 / 2 - 12);
      this.field_841 = this.field_843 = this.field_845 = (double)(class_1600.field_8330.field_8380 * 24 - var4 / 2);
   }

   // $FF: renamed from: b () void
   public void initGui() {
      class_1436 var10000 = this.field_557.method_5267();
      class_276 var10001 = new class_276;
      var10001.method_1586(class_913.field_4599);
      var10000.method_7821(var10001);
      this.buttonList.clear();
      List var1 = this.buttonList;
      class_141 var2 = new class_141;
      int var10004 = this.width / 2 + 24;
      int var10005 = this.height / 2 + 74;
      String[] var10008 = field_850;
      var2.method_748(1, var10004, var10005, 80, 20, class_1450.method_7896("gui.done", new Object[0]));
      var1.add(var2);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_848;
      if(var2 != null) {
         if(this.field_848) {
            return;
         }

         var10000 = var1.field_450;
      }

      if(var10000 == 1) {
         this.field_557.method_5236(this.field_834);
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      label16: {
         String[] var3 = class_752.method_4253();
         if(var3 != null) {
            if(var2 != this.field_557.canLoseFocus7.field_4538.getEnableBackgroundDrawing8()) {
               break label16;
            }

            this.field_557.method_5236((bdw)null);
            this.field_557.method_5248();
         }

         if(var3 != null) {
            return;
         }
      }

      super.method_856(var1, var2);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_848;
      if(var4 != null) {
         if(this.field_848) {
            this.method_873();
            String[] var10002 = field_850;
            this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("multiplayer.downloadingStats", new Object[0]), this.width / 2, this.height / 2, 16777215);
            this.drawCenteredString(this.fontRendererObj, field_7[(int)(bao.method_5283() / 150L % (long)field_7.length)], this.width / 2, this.height / 2 + this.fontRendererObj.FONT_HEIGHT * 2, 16777215);
            if(var4 != null) {
               return;
            }
         }

         var10000 = Mouse.isButtonDown(0);
      }

      int var5;
      label147: {
         label157: {
            if(var4 != null) {
               if(var10000 == 0) {
                  break label157;
               }

               var10000 = (this.width - this.field_835) / 2;
            }

            label158: {
               int var7;
               int var8;
               int var10001;
               label137: {
                  var5 = var10000;
                  int var6 = (this.height - this.field_836) / 2;
                  var7 = var5 + 8;
                  var8 = var6 + 17;
                  var10000 = this.field_846;
                  if(var4 != null) {
                     if(this.field_846 != 0) {
                        var10000 = this.field_846;
                        var10001 = 1;
                        if(var4 == null) {
                           break label137;
                        }

                        if(this.field_846 != 1) {
                           break label158;
                        }
                     }

                     var10000 = var1;
                  }

                  var10001 = var7;
               }

               if(var4 != null) {
                  if(var10000 < var10001) {
                     break label158;
                  }

                  var10000 = var1;
                  var10001 = var7 + 224;
               }

               if(var4 != null) {
                  if(var10000 >= var10001) {
                     break label158;
                  }

                  var10000 = var2;
                  var10001 = var8;
               }

               label117: {
                  class_196 var14;
                  label159: {
                     label160: {
                        if(var4 != null) {
                           if(var10000 < var10001) {
                              break label158;
                           }

                           var10000 = var2;
                           if(var4 == null) {
                              break label160;
                           }

                           var10001 = var8 + 155;
                        }

                        if(var10000 >= var10001) {
                           break label158;
                        }

                        var14 = this;
                        if(var4 == null) {
                           break label159;
                        }

                        var10000 = this.field_846;
                     }

                     if(var10000 == 0) {
                        this.field_846 = 1;
                        if(var4 != null) {
                           break label117;
                        }
                     }

                     this.field_842 -= (double)((float)(var1 - this.field_837) * this.field_839);
                     this.field_843 -= (double)((float)(var2 - this.field_838) * this.field_839);
                     this.field_844 = this.field_840 = this.field_842;
                     var14 = this;
                  }

                  var14.field_845 = this.field_841 = this.field_843;
               }

               this.field_837 = var1;
               this.field_838 = var2;
            }

            if(var4 != null) {
               break label147;
            }
         }

         this.field_846 = 0;
      }

      float var12;
      label97: {
         label162: {
            var5 = Mouse.getDWheel();
            var12 = this.field_839;
            var10000 = var5;
            if(var4 != null) {
               if(var5 < 0) {
                  this.field_839 += 0.25F;
                  if(var4 != null) {
                     break label162;
                  }
               }

               var10000 = var5;
            }

            if(var4 == null) {
               break label97;
            }

            if(var10000 > 0) {
               this.field_839 -= 0.25F;
            }
         }

         this.field_839 = class_1715.method_9569(this.field_839, 1.0F, 2.0F);
         float var16;
         var10000 = (var16 = this.field_839 - var12) == 0.0F?0:(var16 < 0.0F?-1:1);
      }

      if(var4 != null) {
         if(var10000 != 0) {
            float var15 = var12 - this.field_839;
            float var13 = var12 * (float)this.field_835;
            float var9 = var12 * (float)this.field_836;
            float var10 = this.field_839 * (float)this.field_835;
            float var11 = this.field_839 * (float)this.field_836;
            this.field_842 -= (double)((var10 - var13) * 0.5F);
            this.field_843 -= (double)((var11 - var9) * 0.5F);
            this.field_844 = this.field_840 = this.field_842;
            this.field_845 = this.field_841 = this.field_843;
         }

         double var17;
         var10000 = (var17 = this.field_844 - (double)field_829) == 0.0D?0:(var17 < 0.0D?-1:1);
      }

      if(var4 != null) {
         if(var10000 < 0) {
            this.field_844 = (double)field_829;
         }

         double var18;
         var10000 = (var18 = this.field_845 - (double)field_830) == 0.0D?0:(var18 < 0.0D?-1:1);
      }

      if(var4 != null) {
         if(var10000 < 0) {
            this.field_845 = (double)field_830;
         }

         double var19;
         var10000 = (var19 = this.field_844 - (double)field_831) == 0.0D?0:(var19 < 0.0D?-1:1);
      }

      if(var4 != null) {
         if(var10000 >= 0) {
            this.field_844 = (double)(field_831 - 1);
         }

         double var20;
         var10000 = (var20 = this.field_845 - (double)field_832) == 0.0D?0:(var20 < 0.0D?-1:1);
      }

      if(var4 != null) {
         if(var10000 >= 0) {
            this.field_845 = (double)(field_832 - 1);
         }

         this.method_873();
         this.method_1068(var1, var2, var3);
         GL11.glDisable(2896);
         GL11.glDisable(2929);
         this.method_1067();
         GL11.glEnable(2896);
         var10000 = 2929;
      }

      GL11.glEnable(var10000);
   }

   // $FF: renamed from: f () void
   public void method_163() {
      String[] var1 = class_752.method_4253();
      class_196 var10000 = this;
      if(var1 != null) {
         if(!this.field_848) {
            return;
         }

         var10000 = this;
      }

      var10000.field_848 = false;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      String[] var1 = class_752.method_4253();
      class_196 var10000 = this;
      if(var1 != null) {
         if(this.field_848) {
            return;
         }

         this.field_840 = this.field_842;
         this.field_841 = this.field_843;
         var10000 = this;
      }

      double var2 = var10000.field_844 - this.field_842;
      double var4 = this.field_845 - this.field_843;
      if(var1 != null) {
         if(var2 * var2 + var4 * var4 < 4.0D) {
            this.field_842 += var2;
            this.field_843 += var4;
            if(var1 != null) {
               return;
            }
         }

         this.field_842 += var2 * 0.85D;
      }

      this.field_843 += var4 * 0.85D;
   }

   // $FF: renamed from: a () void
   protected void method_1067() {
      int var1 = (this.width - this.field_835) / 2;
      int var2 = (this.height - this.field_836) / 2;
      String[] var10001 = field_850;
      this.fontRendererObj.method_7020(class_1450.method_7896("gui.achievements", new Object[0]), var1 + 15, var2 + 5, 4210752);
   }

   // $FF: renamed from: c (int, int, float) void
   protected void method_1068(int var1, int var2, float var3) {
      int var5 = class_1715.method_9561(this.field_840 + (this.field_842 - this.field_840) * (double)var3);
      String[] var10000 = class_752.method_4253();
      int var6 = class_1715.method_9561(this.field_841 + (this.field_843 - this.field_841) * (double)var3);
      String[] var4 = var10000;
      int var48 = var5;
      int var10001 = field_829;
      if(var4 != null) {
         if(var5 < field_829) {
            var5 = field_829;
         }

         var48 = var6;
         var10001 = field_830;
      }

      if(var4 != null) {
         if(var48 < var10001) {
            var6 = field_830;
         }

         var48 = var5;
         var10001 = field_831;
      }

      if(var4 != null) {
         if(var48 >= var10001) {
            var5 = field_831 - 1;
         }

         var48 = var6;
         var10001 = field_832;
      }

      if(var4 != null) {
         if(var48 >= var10001) {
            var6 = field_832 - 1;
         }

         var48 = this.width - this.field_835;
         var10001 = 2;
      }

      int var7 = var48 / var10001;
      int var8 = (this.height - this.field_836) / 2;
      int var9 = var7 + 16;
      int var10 = var8 + 17;
      this.field_372 = 0.0F;
      GL11.glDepthFunc(518);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var9, (float)var10, -200.0F);
      GL11.glScalef(1.0F / this.field_839, 1.0F / this.field_839, 0.0F);
      GL11.glEnable(3553);
      GL11.glDisable(2896);
      GL11.glEnable('\u803a');
      GL11.glEnable(2903);
      int var11 = var5 + 288 >> 4;
      int var12 = var6 + 288 >> 4;
      int var13 = (var5 + 288) % 16;
      int var14 = (var6 + 288) % 16;
      boolean var15 = true;
      boolean var16 = true;
      boolean var17 = true;
      boolean var18 = true;
      boolean var19 = true;
      Random var20 = new Random();
      float var21 = 16.0F / this.field_839;
      float var22 = 16.0F / this.field_839;
      int var23 = 0;

      int var24;
      int var25;
      label443: {
         label442:
         while(true) {
            if((float)var23 * var21 - (float)var14 < 155.0F) {
               float var26 = 0.6F - (float)(var12 + var23) / 25.0F * 0.3F;
               GL11.glColor4f(var26, var26, var26, 1.0F);
               if(var4 == null) {
                  var23 = 0;
                  break;
               }

               var24 = 0;

               while(true) {
                  if((float)var24 * var22 - (float)var13 < 224.0F) {
                     var20.setSeed((long)(this.field_557.method_5285().method_6994().hashCode() + var11 + var24 + (var12 + var23) * 16));
                     var25 = var20.nextInt(1 + var12 + var23) + (var12 + var23) / 2;
                     class_73 var27 = class_1192.field_6037.method_2448(0, 0);
                     var48 = var25;
                     var10001 = 37;
                     if(var4 == null) {
                        break label443;
                     }

                     label415: {
                        label451: {
                           if(var4 != null) {
                              if(var25 > 37) {
                                 break label451;
                              }

                              var48 = var12 + var23;
                              var10001 = 35;
                           }

                           if(var4 != null) {
                              if(var48 == var10001) {
                                 break label451;
                              }

                              var48 = var25;
                              var10001 = 22;
                           }

                           if(var4 != null) {
                              if(var48 == var10001) {
                                 if(var20.nextInt(2) == 0) {
                                    var27 = class_1192.field_6083.method_2448(0, 0);
                                    if(var4 != null) {
                                       break label415;
                                    }
                                 }

                                 var27 = class_1192.field_6099.method_2448(0, 0);
                                 if(var4 != null) {
                                    break label415;
                                 }
                              }

                              var48 = var25;
                              var10001 = 10;
                           }

                           if(var4 != null) {
                              if(var48 == var10001) {
                                 var27 = class_1192.field_6040.method_2448(0, 0);
                                 if(var4 != null) {
                                    break label415;
                                 }
                              }

                              var48 = var25;
                              var10001 = 8;
                           }

                           label452: {
                              if(var4 != null) {
                                 if(var48 == var10001) {
                                    var27 = class_1192.field_6041.method_2448(0, 0);
                                    if(var4 != null) {
                                       break label415;
                                    }
                                 }

                                 var48 = var25;
                                 if(var4 == null) {
                                    break label452;
                                 }

                                 var10001 = 4;
                              }

                              if(var48 > var10001) {
                                 var27 = class_1192.field_6026.method_2448(0, 0);
                                 if(var4 != null) {
                                    break label415;
                                 }
                              }

                              var48 = var25;
                           }

                           if(var48 <= 0) {
                              break label415;
                           }

                           var27 = class_1192.field_6028.method_2448(0, 0);
                           if(var4 != null) {
                              break label415;
                           }
                        }

                        var27 = class_1192.field_6032.method_2448(0, 0);
                     }

                     this.field_557.method_5288().bindTexture(bpz.field_7757);
                     this.method_659(var24 * 16 - var13, var23 * 16 - var14, var27, 16, 16);
                     ++var24;
                     if(var4 != null) {
                        continue;
                     }

                     ++var23;
                     if(var4 != null) {
                        continue label442;
                     }
                     break;
                  }

                  ++var23;
                  if(var4 != null) {
                     continue label442;
                  }
                  break;
               }
            }

            GL11.glEnable(2929);
            GL11.glDepthFunc(515);
            this.field_557.method_5288().bindTexture(field_833);
            var23 = 0;
            break;
         }

         var48 = var23;
      }

      int var28;
      class_1604 var29;
      int var40;
      int var41;
      for(var10001 = class_1600.field_8329.size(); var48 < var10001; var10001 = class_1600.field_8329.size()) {
         var29 = (class_1604)class_1600.field_8329.get(var23);
         if(var4 != null) {
            label368: {
               if(var29.field_8381 != null) {
                  var24 = var29.field_8379 * 24 - var5 + 11;
                  var25 = var29.field_8380 * 24 - var6 + 11;
                  var28 = var29.field_8381.field_8379 * 24 - var5 + 11;
                  int var30 = var29.field_8381.field_8380 * 24 - var6 + 11;
                  byte var31 = this.field_847.method_9397(var29);
                  byte var32 = this.field_847.method_9398(var29);
                  var40 = this.field_847.method_9399(var29);
                  if(var4 == null) {
                     break label368;
                  }

                  if(var40 <= 4) {
                     label455: {
                        label361: {
                           label456: {
                              var41 = -16777216;
                              var48 = var31;
                              if(var4 != null) {
                                 if(var31 != 0) {
                                    var41 = -6250336;
                                    if(var4 != null) {
                                       break label456;
                                    }
                                 }

                                 var48 = var32;
                              }

                              if(var4 == null) {
                                 break label361;
                              }

                              if(var48 != 0) {
                                 var41 = -16711936;
                              }
                           }

                           this.method_652(var24, var28, var25, var41);
                           this.method_653(var28, var25, var30, var41);
                           var48 = var24;
                        }

                        var10001 = var28;
                        if(var4 != null) {
                           if(var48 > var28) {
                              this.method_658(var24 - 11 - 7, var25 - 5, 114, 234, 7, 11);
                              if(var4 != null) {
                                 break label455;
                              }
                           }

                           var48 = var24;
                           var10001 = var28;
                        }

                        if(var4 != null) {
                           if(var48 < var10001) {
                              this.method_658(var24 + 11, var25 - 5, 107, 234, 7, 11);
                              if(var4 != null) {
                                 break label455;
                              }
                           }

                           var48 = var25;
                           var10001 = var30;
                        }

                        if(var4 != null) {
                           if(var48 > var10001) {
                              this.method_658(var24 - 5, var25 - 11 - 7, 96, 234, 11, 7);
                              if(var4 != null) {
                                 break label455;
                              }
                           }

                           var48 = var25;
                           var10001 = var30;
                        }

                        if(var48 < var10001) {
                           this.method_658(var24 - 5, var25 + 11, 96, 241, 11, 7);
                        }
                     }
                  }
               }

               ++var23;
            }
         }

         if(var4 == null) {
            break;
         }

         var48 = var23;
      }

      var29 = null;
      class_811 var50 = new class_811;
      var50.method_4727();
      class_811 var42 = var50;
      float var43 = (float)(var1 - var9) * this.field_839;
      float var44 = (float)(var2 - var10) * this.field_839;
      bam.method_5216();
      GL11.glDisable(2896);
      GL11.glEnable('\u803a');
      GL11.glEnable(2903);
      var28 = 0;

      int var33;
      int var34;
      byte var49;
      while(true) {
         if(var28 < class_1600.field_8329.size()) {
            class_1604 var35 = (class_1604)class_1600.field_8329.get(var28);
            var33 = var35.field_8379 * 24 - var5;
            var34 = var35.field_8380 * 24 - var6;
            if(var4 != null) {
               label457: {
                  var48 = var33;
                  if(var4 == null) {
                     break;
                  }

                  if(var33 >= -24) {
                     label458: {
                        var48 = var34;
                        if(var4 != null) {
                           if(var34 < -24) {
                              break label458;
                           }

                           float var56;
                           var48 = (var56 = (float)var33 - 224.0F * this.field_839) == 0.0F?0:(var56 < 0.0F?-1:1);
                        }

                        if(var4 != null) {
                           if(var48 > 0) {
                              break label458;
                           }

                           float var57;
                           var48 = (var57 = (float)var34 - 155.0F * this.field_839) == 0.0F?0:(var57 < 0.0F?-1:1);
                        }

                        if(var4 != null) {
                           if(var48 > 0) {
                              break label458;
                           }

                           var48 = this.field_847.method_9399(var35);
                        }

                        float var36;
                        label459: {
                           var40 = var48;
                           var48 = this.field_847.method_9397(var35);
                           if(var4 != null) {
                              if(var48 != 0) {
                                 var36 = 0.75F;
                                 GL11.glColor4f(var36, var36, var36, 1.0F);
                                 if(var4 != null) {
                                    break label459;
                                 }
                              }

                              var48 = this.field_847.method_9398(var35);
                           }

                           if(var4 != null) {
                              if(var48 != 0) {
                                 var36 = 1.0F;
                                 GL11.glColor4f(var36, var36, var36, 1.0F);
                                 if(var4 != null) {
                                    break label459;
                                 }
                              }

                              var48 = var40;
                           }

                           var49 = 3;
                           if(var4 != null) {
                              if(var48 < 3) {
                                 var36 = 0.3F;
                                 GL11.glColor4f(var36, var36, var36, 1.0F);
                                 if(var4 != null) {
                                    break label459;
                                 }
                              }

                              var48 = var40;
                              var49 = 3;
                           }

                           if(var4 != null) {
                              if(var48 == var49) {
                                 var36 = 0.2F;
                                 GL11.glColor4f(var36, var36, var36, 1.0F);
                                 if(var4 != null) {
                                    break label459;
                                 }
                              }

                              var48 = var40;
                              var49 = 4;
                           }

                           if(var48 != var49 && var4 != null) {
                              break label458;
                           }

                           var36 = 0.1F;
                           GL11.glColor4f(var36, var36, var36, 1.0F);
                        }

                        label271: {
                           class_196 var52 = this;
                           if(var4 != null) {
                              this.field_557.method_5288().bindTexture(field_833);
                              if(var35.method_8773()) {
                                 this.method_658(var33 - 2, var34 - 2, 26, 202, 26, 26);
                                 if(var4 != null) {
                                    break label271;
                                 }
                              }

                              var52 = this;
                           }

                           var52.method_658(var33 - 2, var34 - 2, 0, 202, 26, 26);
                        }

                        var48 = this.field_847.method_9398(var35);
                        if(var4 != null) {
                           if(var48 == 0) {
                              var36 = 0.1F;
                              GL11.glColor4f(var36, var36, var36, 1.0F);
                              var42.field_3805 = false;
                           }

                           GL11.glEnable(2896);
                           GL11.glEnable(2884);
                           var42.method_4756(this.field_557.enableBackgroundDrawing4, this.field_557.method_5288(), var35.field_8384, var33 + 3, var34 + 3);
                           GL11.glBlendFunc(770, 771);
                           GL11.glDisable(2896);
                           var48 = this.field_847.method_9398(var35);
                        }

                        if(var4 != null) {
                           if(var48 == 0) {
                              var42.field_3805 = true;
                           }

                           GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                           if(var4 == null) {
                              break label457;
                           }

                           float var58;
                           var48 = (var58 = var43 - (float)var33) == 0.0F?0:(var58 < 0.0F?-1:1);
                        }

                        if(var48 >= 0) {
                           label461: {
                              float var59;
                              var48 = (var59 = var43 - (float)(var33 + 22)) == 0.0F?0:(var59 < 0.0F?-1:1);
                              if(var4 != null) {
                                 if(var48 > 0) {
                                    break label461;
                                 }

                                 float var60;
                                 var48 = (var60 = var44 - (float)var34) == 0.0F?0:(var60 < 0.0F?-1:1);
                              }

                              if(var4 != null) {
                                 if(var48 < 0) {
                                    break label461;
                                 }

                                 float var61;
                                 var48 = (var61 = var44 - (float)(var34 + 22)) == 0.0F?0:(var61 < 0.0F?-1:1);
                              }

                              if(var48 <= 0) {
                                 var29 = var35;
                              }
                           }
                        }
                     }
                  }

                  ++var28;
               }
            }

            if(var4 != null) {
               continue;
            }
         }

         GL11.glDisable(2929);
         GL11.glEnable(3042);
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_557.method_5288().bindTexture(field_833);
         this.method_658(var7, var8, 0, 0, this.field_835, this.field_836);
         this.field_372 = 0.0F;
         GL11.glDepthFunc(515);
         GL11.glDisable(2929);
         var48 = 3553;
         break;
      }

      GL11.glEnable(var48);
      super.drawScreen(var1, var2, var3);
      if(var4 != null) {
         if(var29 != null) {
            String var45;
            label462: {
               var45 = var29.method_8753().method_342();
               String var46 = var29.method_8771();
               var33 = var1 + 12;
               var34 = var2 - 4;
               var40 = this.field_847.method_9399(var29);
               var48 = this.field_847.method_9398(var29);
               if(var4 != null) {
                  if(var48 == 0) {
                     var48 = var40;
                     var49 = 3;
                     int var38;
                     String[] var39;
                     String var47;
                     class_1081 var54;
                     if(var4 != null) {
                        if(var40 == 3) {
                           var39 = field_850;
                           var45 = class_1450.method_7896("achievement.unknown", new Object[0]);
                           var41 = Math.max(this.fontRendererObj.getCharWidth(var45), 120);
                           var54 = new class_1081;
                           var54.method_6126("achievement.requires", new Object[]{var29.field_8381.method_8753()});
                           var47 = var54.method_342();
                           var38 = this.fontRendererObj.splitStringWidth(var47, var41);
                           this.drawGradientRect(var33 - 3, var34 - 3, var33 + var41 + 3, var34 + var38 + 12 + 3, -1073741824, -1073741824);
                           this.fontRendererObj.drawSplitString(var47, var33, var34 + 12, var41, -9416624);
                           if(var4 != null) {
                              break label462;
                           }
                        }

                        var48 = var40;
                        var49 = 3;
                     }

                     label234: {
                        if(var4 != null) {
                           if(var48 >= var49) {
                              break label234;
                           }

                           var48 = this.fontRendererObj.getCharWidth(var45);
                           var49 = 120;
                        }

                        var41 = Math.max(var48, var49);
                        var54 = new class_1081;
                        var39 = field_850;
                        var54.method_6126("achievement.requires", new Object[]{var29.field_8381.method_8753()});
                        var47 = var54.method_342();
                        var38 = this.fontRendererObj.splitStringWidth(var47, var41);
                        this.drawGradientRect(var33 - 3, var34 - 3, var33 + var41 + 3, var34 + var38 + 12 + 3, -1073741824, -1073741824);
                        this.fontRendererObj.drawSplitString(var47, var33, var34 + 12, var41, -9416624);
                        if(var4 != null) {
                           break label462;
                        }
                     }

                     var45 = null;
                     break label462;
                  }

                  var48 = Math.max(this.fontRendererObj.getCharWidth(var45), 120);
               }

               var41 = var48;
               int var37 = this.fontRendererObj.splitStringWidth(var46, var41);
               boolean var53 = this.field_847.method_9397(var29);
               if(var4 != null) {
                  if(var53) {
                     var37 += 12;
                  }

                  this.drawGradientRect(var33 - 3, var34 - 3, var33 + var41 + 3, var34 + var37 + 3 + 12, -1073741824, -1073741824);
                  this.fontRendererObj.drawSplitString(var46, var33, var34 + 12, var41, -6250336);
                  var53 = this.field_847.method_9397(var29);
               }

               if(var4 != null && var53) {
                  String[] var51 = field_850;
                  this.fontRendererObj.drawStringWithShadow(class_1450.method_7896("achievement.taken", new Object[0]), var33, var34 + var37 + 4, -7302913);
               }
            }

            if(var45 != null) {
               int var10004;
               FontRenderer var55;
               label219: {
                  var55 = this.fontRendererObj;
                  var10004 = this.field_847.method_9398(var29);
                  if(var4 != null) {
                     if(var10004 != 0) {
                        var10004 = var29.method_8773();
                        if(var4 != null) {
                           var10004 = var10004 != 0?-128:-1;
                        }
                        break label219;
                     }

                     var10004 = var29.method_8773();
                  }

                  if(var4 != null) {
                     var10004 = var10004 != 0?-8355776:-8355712;
                  }
               }

               var55.drawStringWithShadow(var45, var33, var34, var10004);
            }
         }

         GL11.glEnable(2929);
         GL11.glEnable(2896);
         bam.method_5212();
      }

   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_848;
      if(var1 != null) {
         var10000 = !this.field_848;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_164() {
      // $FF: Couldn't be decompiled
   }
}

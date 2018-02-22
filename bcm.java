import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class bcm {

   // $FF: renamed from: k bao
   private final bao field_4853;
   // $FF: renamed from: a int
   protected int field_4854;
   // $FF: renamed from: l int
   private int field_4855;
   // $FF: renamed from: b int
   protected int field_4856;
   // $FF: renamed from: c int
   protected int field_4857;
   // $FF: renamed from: d int
   protected int field_4858;
   // $FF: renamed from: e int
   protected int field_4859;
   // $FF: renamed from: f int
   protected final int field_4860;
   // $FF: renamed from: m int
   private int field_4861;
   // $FF: renamed from: n int
   private int field_4862;
   // $FF: renamed from: g int
   protected int field_4863;
   // $FF: renamed from: h int
   protected int field_4864;
   // $FF: renamed from: i boolean
   protected boolean field_4865;
   // $FF: renamed from: o float
   private float field_4866;
   // $FF: renamed from: p float
   private float field_4867;
   // $FF: renamed from: q float
   public float field_4868;
   // $FF: renamed from: r int
   private int field_4869;
   // $FF: renamed from: s long
   private long field_4870;
   // $FF: renamed from: t boolean
   private boolean field_4871;
   // $FF: renamed from: u boolean
   private boolean field_4872;
   // $FF: renamed from: j int
   protected int field_4873;
   // $FF: renamed from: v boolean
   private boolean field_4874;
   private static final String __OBFID = "CL_00000679";


   // $FF: renamed from: <init> (bao, int, int, int, int, int) void
   public void method_5549(bao var1, int var2, int var3, int var4, int var5, int var6) {
      super();
      this.field_4865 = true;
      this.field_4866 = -2.0F;
      this.field_4869 = -1;
      this.field_4871 = true;
      this.field_4874 = true;
      this.field_4853 = var1;
      this.field_4854 = var2;
      this.field_4855 = var3;
      this.field_4856 = var4;
      this.field_4857 = var5;
      this.field_4860 = var6;
      this.field_4859 = 0;
      this.field_4858 = var2;
   }

   // $FF: renamed from: a (int, int, int, int) void
   public void method_5550(int var1, int var2, int var3, int var4) {
      this.field_4854 = var1;
      this.field_4855 = var2;
      this.field_4856 = var3;
      this.field_4857 = var4;
      this.field_4859 = 0;
      this.field_4858 = var1;
   }

   // $FF: renamed from: a (boolean) void
   public void method_5551(boolean var1) {
      this.field_4871 = var1;
   }

   // $FF: renamed from: a (boolean, int) void
   protected void method_5552(boolean var1, int var2) {
      String[] var10000 = class_752.method_4253();
      this.field_4872 = var1;
      String[] var3 = var10000;
      bcm var4 = this;
      int var10001 = var2;
      if(var3 != null) {
         this.field_4873 = var2;
         if(var1) {
            return;
         }

         var4 = this;
         var10001 = 0;
      }

      var4.field_4873 = var10001;
   }

   // $FF: renamed from: b () int
   protected abstract int method_5553();

   // $FF: renamed from: a (int, boolean, int, int) void
   protected abstract void method_5554(int var1, boolean var2, int var3, int var4);

   // $FF: renamed from: a (int) boolean
   protected abstract boolean method_5555(int var1);

   // $FF: renamed from: e () int
   protected int method_5556() {
      return this.method_5553() * this.field_4860 + this.field_4873;
   }

   // $FF: renamed from: a () void
   protected abstract void method_5557();

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected abstract void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7);

   // $FF: renamed from: a (int, int, bmh) void
   protected void method_5559(int var1, int var2, bmh var3) {}

   // $FF: renamed from: a (int, int) void
   protected void method_5560(int var1, int var2) {}

   // $FF: renamed from: b (int, int) void
   protected void method_5561(int var1, int var2) {}

   // $FF: renamed from: c (int, int) int
   public int method_5562(int var1, int var2) {
      int var8;
      label57: {
         String[] var10000 = class_752.method_4253();
         int var4 = this.field_4859 + this.field_4854 / 2 - this.method_5573() / 2;
         int var5 = this.field_4859 + this.field_4854 / 2 + this.method_5573() / 2;
         int var6 = var2 - this.field_4856 - this.field_4873 + (int)this.field_4868 - 4;
         int var7 = var6 / this.field_4860;
         String[] var3 = var10000;
         var8 = var1;
         int var10001 = this.method_5575();
         if(var3 != null) {
            if(var1 >= var10001) {
               break label57;
            }

            var8 = var1;
            var10001 = var4;
         }

         label58: {
            if(var3 != null) {
               if(var8 < var10001) {
                  break label57;
               }

               var8 = var1;
               if(var3 == null) {
                  break label58;
               }

               var10001 = var5;
            }

            if(var8 > var10001) {
               break label57;
            }

            var8 = var7;
         }

         if(var3 != null) {
            if(var8 < 0) {
               break label57;
            }

            var8 = var6;
         }

         if(var3 != null) {
            if(var8 < 0) {
               break label57;
            }

            var8 = var7;
         }

         if(var3 == null) {
            return var8;
         }

         if(var8 < this.method_5553()) {
            var8 = var7;
            return var8;
         }
      }

      var8 = -1;
      return var8;
   }

   // $FF: renamed from: d (int, int) void
   public void method_5563(int var1, int var2) {
      this.field_4861 = var1;
      this.field_4862 = var2;
   }

   // $FF: renamed from: k () void
   private void method_5564() {
      int var2 = this.method_5565();
      String[] var1 = class_752.method_4253();
      int var10000 = var2;
      if(var1 != null) {
         if(var2 < 0) {
            var2 /= 2;
         }

         var10000 = this.field_4865;
      }

      if(var1 != null) {
         label43: {
            if(var10000 == 0) {
               var10000 = var2;
               if(var1 == null) {
                  break label43;
               }

               if(var2 < 0) {
                  var2 = 0;
               }
            }

            float var4;
            var10000 = (var4 = this.field_4868 - 0.0F) == 0.0F?0:(var4 < 0.0F?-1:1);
         }
      }

      bcm var3;
      label48: {
         if(var1 != null) {
            if(var10000 < 0) {
               this.field_4868 = 0.0F;
            }

            var3 = this;
            if(var1 == null) {
               break label48;
            }

            float var5;
            var10000 = (var5 = this.field_4868 - (float)var2) == 0.0F?0:(var5 < 0.0F?-1:1);
         }

         if(var10000 <= 0) {
            return;
         }

         var3 = this;
      }

      var3.field_4868 = (float)var2;
   }

   // $FF: renamed from: f () int
   public int method_5565() {
      return this.method_5556() - (this.field_4857 - this.field_4856 - 4);
   }

   // $FF: renamed from: g () int
   public int method_5566() {
      return (int)this.field_4868;
   }

   // $FF: renamed from: e (int) boolean
   public boolean method_5567(int var1) {
      int var10000;
      label21: {
         String[] var2 = class_752.method_4253();
         var10000 = var1;
         int var10001 = this.field_4856;
         if(var2 != null) {
            if(var1 < this.field_4856) {
               break label21;
            }

            var10000 = var1;
            if(var2 == null) {
               return (boolean)var10000;
            }

            var10001 = this.field_4857;
         }

         if(var10000 <= var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: f (int) void
   public void method_5568(int var1) {
      this.field_4868 += (float)var1;
      this.method_5564();
      this.field_4866 = -2.0F;
   }

   // $FF: renamed from: a (bcb) void
   public void method_5569(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_451;
      if(var2 != null) {
         if(!var1.field_451) {
            return;
         }

         var10000 = var1.field_450;
      }

      int var10001 = this.field_4861;
      if(var2 != null) {
         if(var10000 == this.field_4861) {
            this.field_4868 -= (float)(this.field_4860 * 2 / 3);
            this.field_4866 = -2.0F;
            this.method_5564();
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = this.field_4862;
      }

      if(var10000 == var10001) {
         this.field_4868 += (float)(this.field_4860 * 2 / 3);
         this.field_4866 = -2.0F;
         this.method_5564();
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void method_5570(int var1, int var2, float var3) {
      this.field_4863 = var1;
      String[] var10000 = class_752.method_4253();
      this.field_4864 = var2;
      String[] var4 = var10000;
      this.method_5557();
      int var5 = this.method_5553();
      int var6 = this.method_5575();
      int var7 = var6 + 6;
      int var20 = var1;
      int var8;
      int var9;
      int var10;
      int var11;
      int var15;
      int var10001;
      if(var4 != null) {
         label303: {
            if(var1 > this.field_4859) {
               var20 = var1;
               if(var4 == null) {
                  break label303;
               }

               if(var1 < this.field_4858) {
                  var20 = var2;
                  if(var4 == null) {
                     break label303;
                  }

                  if(var2 > this.field_4856) {
                     var20 = var2;
                     if(var4 == null) {
                        break label303;
                     }

                     if(var2 < this.field_4857) {
                        label307: {
                           boolean var21 = Mouse.isButtonDown(0);
                           if(var4 != null) {
                              if(var21) {
                                 var21 = this.method_5572();
                                 if(var4 != null) {
                                    if(var21) {
                                       float var23;
                                       var20 = (var23 = this.field_4866 - -1.0F) == 0.0F?0:(var23 < 0.0F?-1:1);
                                       if(var4 != null) {
                                          if(var20 == 0) {
                                             label255: {
                                                label309: {
                                                   boolean var12 = true;
                                                   var20 = var2;
                                                   var10001 = this.field_4856;
                                                   if(var4 != null) {
                                                      if(var2 < this.field_4856) {
                                                         break label309;
                                                      }

                                                      var20 = var2;
                                                      var10001 = this.field_4857;
                                                   }

                                                   if(var4 != null) {
                                                      if(var20 > var10001) {
                                                         break label309;
                                                      }

                                                      var20 = this.field_4854 / 2;
                                                      var10001 = this.method_5573() / 2;
                                                   }

                                                   label240: {
                                                      label239: {
                                                         label310: {
                                                            int var13 = var20 - var10001;
                                                            var8 = this.field_4854 / 2 + this.method_5573() / 2;
                                                            var9 = var2 - this.field_4856 - this.field_4873 + (int)this.field_4868 - 4;
                                                            int var14 = var9 / this.field_4860;
                                                            var20 = var1;
                                                            var10001 = var13;
                                                            if(var4 != null) {
                                                               label236: {
                                                                  label235: {
                                                                     if(var1 >= var13) {
                                                                        var20 = var1;
                                                                        var10001 = var8;
                                                                        if(var4 == null) {
                                                                           break label236;
                                                                        }

                                                                        if(var1 <= var8) {
                                                                           var20 = var14;
                                                                           if(var4 == null) {
                                                                              break label235;
                                                                           }

                                                                           if(var14 >= 0) {
                                                                              var20 = var9;
                                                                              if(var4 == null) {
                                                                                 break label235;
                                                                              }

                                                                              if(var9 >= 0) {
                                                                                 var20 = var14;
                                                                                 var10001 = var5;
                                                                                 if(var4 == null) {
                                                                                    break label236;
                                                                                 }

                                                                                 if(var14 < var5) {
                                                                                    label206: {
                                                                                       label311: {
                                                                                          var20 = var14;
                                                                                          if(var4 != null) {
                                                                                             if(var14 != this.field_4869) {
                                                                                                break label311;
                                                                                             }

                                                                                             long var24;
                                                                                             var20 = (var24 = bao.method_5283() - this.field_4870 - 250L) == 0L?0:(var24 < 0L?-1:1);
                                                                                          }

                                                                                          if(var4 == null) {
                                                                                             break label206;
                                                                                          }

                                                                                          if(var20 < 0) {
                                                                                             var20 = 1;
                                                                                             break label206;
                                                                                          }
                                                                                       }

                                                                                       var20 = 0;
                                                                                    }

                                                                                    var15 = var20;
                                                                                    this.method_5554(var14, (boolean)var15, var1, var2);
                                                                                    this.field_4869 = var14;
                                                                                    this.field_4870 = bao.method_5283();
                                                                                    if(var4 != null) {
                                                                                       break label310;
                                                                                    }
                                                                                 }
                                                                              }
                                                                           }
                                                                        }
                                                                     }

                                                                     var20 = var1;
                                                                  }

                                                                  var10001 = var13;
                                                               }
                                                            }

                                                            if(var4 == null) {
                                                               break label240;
                                                            }

                                                            if(var20 >= var10001) {
                                                               var20 = var1;
                                                               var10001 = var8;
                                                               if(var4 == null) {
                                                                  break label240;
                                                               }

                                                               if(var1 <= var8) {
                                                                  var20 = var9;
                                                                  if(var4 == null) {
                                                                     break label239;
                                                                  }

                                                                  if(var9 < 0) {
                                                                     this.method_5560(var1 - var13, var2 - this.field_4856 + (int)this.field_4868 - 4);
                                                                     var12 = false;
                                                                  }
                                                               }
                                                            }
                                                         }

                                                         var20 = var1;
                                                      }

                                                      var10001 = var6;
                                                   }

                                                   label195: {
                                                      label320: {
                                                         label313: {
                                                            if(var4 != null) {
                                                               if(var20 < var10001) {
                                                                  break label320;
                                                               }

                                                               var20 = var1;
                                                               if(var4 == null) {
                                                                  break label313;
                                                               }

                                                               var10001 = var7;
                                                            }

                                                            if(var20 > var10001) {
                                                               break label320;
                                                            }

                                                            this.field_4867 = -1.0F;
                                                            var20 = this.method_5565();
                                                         }

                                                         var11 = var20;
                                                         var20 = var11;
                                                         var10001 = 1;
                                                         if(var4 != null) {
                                                            if(var11 < 1) {
                                                               var11 = 1;
                                                            }

                                                            var20 = this.field_4857 - this.field_4856;
                                                            var10001 = this.field_4857 - this.field_4856;
                                                         }

                                                         var10 = (int)((float)(var20 * var10001) / (float)this.method_5556());
                                                         var20 = var10;
                                                         var10001 = 32;
                                                         if(var4 != null) {
                                                            if(var10 < 32) {
                                                               var10 = 32;
                                                            }

                                                            var20 = var10;
                                                            var10001 = this.field_4857 - this.field_4856 - 8;
                                                         }

                                                         label175: {
                                                            if(var4 != null) {
                                                               if(var20 <= var10001) {
                                                                  break label175;
                                                               }

                                                               var20 = this.field_4857 - this.field_4856;
                                                               var10001 = 8;
                                                            }

                                                            var10 = var20 - var10001;
                                                         }

                                                         this.field_4867 /= (float)(this.field_4857 - this.field_4856 - var10) / (float)var11;
                                                         if(var4 != null) {
                                                            break label195;
                                                         }
                                                      }

                                                      this.field_4867 = 1.0F;
                                                   }

                                                   label170: {
                                                      if(var12) {
                                                         this.field_4866 = (float)var2;
                                                         if(var4 != null) {
                                                            break label170;
                                                         }
                                                      }

                                                      this.field_4866 = -2.0F;
                                                   }

                                                   if(var4 != null) {
                                                      break label255;
                                                   }
                                                }

                                                this.field_4866 = -2.0F;
                                             }

                                             if(var4 != null) {
                                                break label307;
                                             }
                                          }

                                          float var25;
                                          var20 = (var25 = this.field_4866 - 0.0F) == 0.0F?0:(var25 < 0.0F?-1:1);
                                       }

                                       if(var4 == null) {
                                          break label303;
                                       }

                                       if(var20 < 0) {
                                          break label307;
                                       }

                                       this.field_4868 -= ((float)var2 - this.field_4866) * this.field_4867;
                                       this.field_4866 = (float)var2;
                                       if(var4 != null) {
                                          break label307;
                                       }
                                    }

                                    var21 = this.field_4853.canLoseFocus7.field_4509;
                                 }
                              } else {
                                 var21 = this.field_4853.canLoseFocus7.field_4509;
                              }
                           }

                           while(!var21) {
                              var20 = Mouse.next();
                              if(var4 == null) {
                                 break label303;
                              }

                              if(var4 != null) {
                                 if(var20 == 0) {
                                    break;
                                 }

                                 var20 = Mouse.getEventDWheel();
                              }

                              int var16 = var20;
                              if(var4 != null) {
                                 if(var16 != 0) {
                                    label317: {
                                       var20 = var16;
                                       if(var4 != null) {
                                          if(var16 > 0) {
                                             var16 = -1;
                                             if(var4 != null) {
                                                break label317;
                                             }
                                          }

                                          var20 = var16;
                                       }

                                       if(var4 != null) {
                                          if(var20 >= 0) {
                                             break label317;
                                          }

                                          var20 = 1;
                                       }

                                       var16 = var20;
                                    }

                                    this.field_4868 += (float)(var16 * this.field_4860 / 2);
                                 }

                                 this.field_4853.enableBackgroundDrawing6.method_869();
                              }

                              if(var4 == null) {
                                 break;
                              }

                              var21 = this.field_4853.canLoseFocus7.field_4509;
                           }

                           this.field_4866 = -1.0F;
                        }
                     }
                  }
               }
            }

            this.method_5564();
            GL11.glDisable(2896);
            var20 = 2912;
         }
      }

      GL11.glDisable(var20);
      bmh var19 = bmh.instance;
      this.field_4853.method_5288().bindTexture(Gui.field_369);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var17 = 32.0F;
      var19.setVisible2();
      var19.method_7463(2105376);
      var19.addVertexWithUV((double)this.field_4859, (double)this.field_4857, 0.0D, (double)((float)this.field_4859 / var17), (double)((float)(this.field_4857 + (int)this.field_4868) / var17));
      var19.addVertexWithUV((double)this.field_4858, (double)this.field_4857, 0.0D, (double)((float)this.field_4858 / var17), (double)((float)(this.field_4857 + (int)this.field_4868) / var17));
      var19.addVertexWithUV((double)this.field_4858, (double)this.field_4856, 0.0D, (double)((float)this.field_4858 / var17), (double)((float)(this.field_4856 + (int)this.field_4868) / var17));
      var19.addVertexWithUV((double)this.field_4859, (double)this.field_4856, 0.0D, (double)((float)this.field_4859 / var17), (double)((float)(this.field_4856 + (int)this.field_4868) / var17));
      var19.getVisible8();
      var8 = this.field_4859 + this.field_4854 / 2 - this.method_5573() / 2 + 2;
      var9 = this.field_4856 + 4 - (int)this.field_4868;
      byte var22 = this.field_4872;
      if(var4 != null) {
         if(this.field_4872) {
            this.method_5559(var8, var9, var19);
         }

         this.method_5574(var8, var9, var1, var2);
         GL11.glDisable(2929);
         var22 = 4;
      }

      byte var18 = var22;
      this.method_5576(0, this.field_4856, 255, 255);
      this.method_5576(this.field_4857, this.field_4855, 255, 255);
      GL11.glEnable(3042);
      buu.method_9081(770, 771, 0, 1);
      GL11.glDisable(3008);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      var19.setVisible2();
      var19.method_7464(0, 0);
      var19.addVertexWithUV((double)this.field_4859, (double)(this.field_4856 + var18), 0.0D, 0.0D, 1.0D);
      var19.addVertexWithUV((double)this.field_4858, (double)(this.field_4856 + var18), 0.0D, 1.0D, 1.0D);
      var19.method_7464(0, 255);
      var19.addVertexWithUV((double)this.field_4858, (double)this.field_4856, 0.0D, 1.0D, 0.0D);
      var19.addVertexWithUV((double)this.field_4859, (double)this.field_4856, 0.0D, 0.0D, 0.0D);
      var19.getVisible8();
      var19.setVisible2();
      var19.method_7464(0, 255);
      var19.addVertexWithUV((double)this.field_4859, (double)this.field_4857, 0.0D, 0.0D, 1.0D);
      var19.addVertexWithUV((double)this.field_4858, (double)this.field_4857, 0.0D, 1.0D, 1.0D);
      var19.method_7464(0, 0);
      var19.addVertexWithUV((double)this.field_4858, (double)(this.field_4857 - var18), 0.0D, 1.0D, 0.0D);
      var19.addVertexWithUV((double)this.field_4859, (double)(this.field_4857 - var18), 0.0D, 0.0D, 0.0D);
      var19.getVisible8();
      var11 = this.method_5565();
      var20 = var11;
      if(var4 != null) {
         if(var11 > 0) {
            var10 = (this.field_4857 - this.field_4856) * (this.field_4857 - this.field_4856) / this.method_5556();
            var20 = var10;
            var10001 = 32;
            if(var4 != null) {
               if(var10 < 32) {
                  var10 = 32;
               }

               var20 = var10;
               var10001 = this.field_4857 - this.field_4856 - 8;
            }

            if(var4 != null) {
               if(var20 > var10001) {
                  var10 = this.field_4857 - this.field_4856 - 8;
               }

               var20 = (int)this.field_4868 * (this.field_4857 - this.field_4856 - var10) / var11;
               var10001 = this.field_4856;
            }

            var15 = var20 + var10001;
            if(var4 != null) {
               if(var15 < this.field_4856) {
                  var15 = this.field_4856;
               }

               var19.setVisible2();
               var19.method_7464(0, 255);
               var19.addVertexWithUV((double)var6, (double)this.field_4857, 0.0D, 0.0D, 1.0D);
               var19.addVertexWithUV((double)var7, (double)this.field_4857, 0.0D, 1.0D, 1.0D);
               var19.addVertexWithUV((double)var7, (double)this.field_4856, 0.0D, 1.0D, 0.0D);
               var19.addVertexWithUV((double)var6, (double)this.field_4856, 0.0D, 0.0D, 0.0D);
               var19.getVisible8();
               var19.setVisible2();
               var19.method_7464(8421504, 255);
               var19.addVertexWithUV((double)var6, (double)(var15 + var10), 0.0D, 0.0D, 1.0D);
               var19.addVertexWithUV((double)var7, (double)(var15 + var10), 0.0D, 1.0D, 1.0D);
               var19.addVertexWithUV((double)var7, (double)var15, 0.0D, 1.0D, 0.0D);
               var19.addVertexWithUV((double)var6, (double)var15, 0.0D, 0.0D, 0.0D);
               var19.getVisible8();
               var19.setVisible2();
               var19.method_7464(12632256, 255);
               var19.addVertexWithUV((double)var6, (double)(var15 + var10 - 1), 0.0D, 0.0D, 1.0D);
               var19.addVertexWithUV((double)(var7 - 1), (double)(var15 + var10 - 1), 0.0D, 1.0D, 1.0D);
               var19.addVertexWithUV((double)(var7 - 1), (double)var15, 0.0D, 1.0D, 0.0D);
               var19.addVertexWithUV((double)var6, (double)var15, 0.0D, 0.0D, 0.0D);
               var19.getVisible8();
            }
         }

         this.method_5561(var1, var2);
         GL11.glEnable(3553);
         GL11.glShadeModel(7424);
         GL11.glEnable(3008);
         var20 = 3042;
      }

      GL11.glDisable(var20);
   }

   // $FF: renamed from: b (boolean) void
   public void method_5571(boolean var1) {
      this.field_4874 = var1;
   }

   // $FF: renamed from: i () boolean
   public boolean method_5572() {
      return this.field_4874;
   }

   // $FF: renamed from: c () int
   public int method_5573() {
      return 220;
   }

   // $FF: renamed from: b (int, int, int, int) void
   protected void method_5574(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = this.method_5553();
      bmh var7 = bmh.instance;
      String[] var5 = var10000;
      int var8 = 0;

      while(var8 < var6) {
         int var9 = var2 + var8 * this.field_4860 + this.field_4873;
         int var10 = this.field_4860 - 4;
         if(var5 != null) {
            if(var9 <= this.field_4857) {
               label40: {
                  bcm var14;
                  int var10001;
                  label39: {
                     label51: {
                        int var13 = var9 + var10;
                        if(var5 != null) {
                           if(var13 < this.field_4856) {
                              break label40;
                           }

                           var14 = this;
                           if(var5 == null) {
                              break label51;
                           }

                           var13 = this.field_4871;
                        }

                        if(var13 != 0) {
                           var14 = this;
                           var10001 = var8;
                           if(var5 == null) {
                              break label39;
                           }

                           if(this.method_5555(var8)) {
                              int var11 = this.field_4859 + (this.field_4854 / 2 - this.method_5573() / 2);
                              int var12 = this.field_4859 + this.field_4854 / 2 + this.method_5573() / 2;
                              GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                              GL11.glDisable(3553);
                              var7.setVisible2();
                              var7.method_7463(8421504);
                              var7.addVertexWithUV((double)var11, (double)(var9 + var10 + 2), 0.0D, 0.0D, 1.0D);
                              var7.addVertexWithUV((double)var12, (double)(var9 + var10 + 2), 0.0D, 1.0D, 1.0D);
                              var7.addVertexWithUV((double)var12, (double)(var9 - 2), 0.0D, 1.0D, 0.0D);
                              var7.addVertexWithUV((double)var11, (double)(var9 - 2), 0.0D, 0.0D, 0.0D);
                              var7.method_7463(0);
                              var7.addVertexWithUV((double)(var11 + 1), (double)(var9 + var10 + 1), 0.0D, 0.0D, 1.0D);
                              var7.addVertexWithUV((double)(var12 - 1), (double)(var9 + var10 + 1), 0.0D, 1.0D, 1.0D);
                              var7.addVertexWithUV((double)(var12 - 1), (double)(var9 - 1), 0.0D, 1.0D, 0.0D);
                              var7.addVertexWithUV((double)(var11 + 1), (double)(var9 - 1), 0.0D, 0.0D, 0.0D);
                              var7.getVisible8();
                              GL11.glEnable(3553);
                           }
                        }

                        var14 = this;
                     }

                     var10001 = var8;
                  }

                  var14.method_5558(var10001, var1, var9, var10, var7, var3, var4);
               }
            }

            ++var8;
         }

         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d () int
   protected int method_5575() {
      return this.field_4854 / 2 + 124;
   }

   // $FF: renamed from: c (int, int, int, int) void
   private void method_5576(int var1, int var2, int var3, int var4) {
      bmh var5 = bmh.instance;
      this.field_4853.method_5288().bindTexture(Gui.field_369);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var6 = 32.0F;
      var5.setVisible2();
      var5.method_7464(4210752, var4);
      var5.addVertexWithUV((double)this.field_4859, (double)var2, 0.0D, 0.0D, (double)((float)var2 / var6));
      var5.addVertexWithUV((double)(this.field_4859 + this.field_4854), (double)var2, 0.0D, (double)((float)this.field_4854 / var6), (double)((float)var2 / var6));
      var5.method_7464(4210752, var3);
      var5.addVertexWithUV((double)(this.field_4859 + this.field_4854), (double)var1, 0.0D, (double)((float)this.field_4854 / var6), (double)((float)var1 / var6));
      var5.addVertexWithUV((double)this.field_4859, (double)var1, 0.0D, 0.0D, (double)((float)var1 / var6));
      var5.getVisible8();
   }

   // $FF: renamed from: g (int) void
   public void method_5577(int var1) {
      this.field_4859 = var1;
      this.field_4858 = var1 + this.field_4854;
   }

   // $FF: renamed from: j () int
   public int method_5578() {
      return this.field_4860;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      boolean var10000 = true;
      char[] var10003 = "~\"µ°o\"\rXè¼".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            __OBFID = (new String((char[])var4)).intern();
            String var2 = __OBFID;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 51;
            break;
         case 1:
            var10009 = 96;
            break;
         case 2:
            var10009 = 209;
            break;
         case 3:
            var10009 = 139;
            break;
         case 4:
            var10009 = 142;
            break;
         case 5:
            var10009 = 81;
            break;
         default:
            var10009 = 28;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

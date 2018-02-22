import ca.diiza.u.class_687;
import ca.diiza.utils.class_1860;
import net.minecraft.item.ItemSuperBow;

// $FF: renamed from: xg
public class class_796 extends class_794 {

   // $FF: renamed from: a5 nO
   public GuiTextField5 field_3689;
   // $FF: renamed from: a6 bao
   protected bao field_3690;
   // $FF: renamed from: a7 int
   protected int field_3691;
   // $FF: renamed from: a8 ca.diiza.utils.c
   private class_1860 field_3692;
   // $FF: renamed from: a9 int
   public int field_3693;
   // $FF: renamed from: a_ float
   public float field_3694;
   // $FF: renamed from: bL float
   public float field_3695;
   // $FF: renamed from: bM float
   public float field_3696;
   // $FF: renamed from: bN float
   public float field_3697;
   // $FF: renamed from: bO int
   private int field_3698;
   // $FF: renamed from: bP float
   private float field_3699;
   // $FF: renamed from: bQ vv
   private class_1720 field_3700;
   // $FF: renamed from: bR vv
   private class_1720 field_3701;
   // $FF: renamed from: bS vv
   private class_1720 field_3702;
   // $FF: renamed from: bV float
   public float field_3703;
   // $FF: renamed from: bW float
   public float field_3704;
   // $FF: renamed from: bX java.lang.String
   private static final String field_3705;
   // $FF: renamed from: gb java.lang.String[]
   private static final String[] field_3706;


   // $FF: renamed from: <init> (bao, ahb, kT, int) void
   public void method_4666(bao var1, ahb var2, class_1331 var3, int var4) {
      super.method_4554(var2, var3.method_6997());
      class_1860 var10001 = new class_1860;
      var10001.method_10070();
      this.field_3692 = var10001;
      class_1720 var5 = new class_1720;
      var5.method_9612();
      this.field_3700 = var5;
      var5 = new class_1720;
      var5.method_9612();
      this.field_3701 = var5;
      var5 = new class_1720;
      var5.method_9612();
      this.field_3702 = var5;
      this.field_3690 = var1;
      this.field_3051 = var4;
   }

   // $FF: renamed from: bq () void
   public void method_4236() {
      super.method_4236();
      this.field_3347 = this.field_3689.field_7406;
      this.field_3348 = this.field_3689.field_7407;
      this.field_3346 = this.field_3689.field_7408;
      this.field_3696 = this.field_3694;
      this.field_3697 = this.field_3695;
      this.field_3695 = (float)((double)this.field_3695 + (double)(this.field_3001 - this.field_3695) * 0.5D);
      this.field_3694 = (float)((double)this.field_3694 + (double)(this.field_3000 - this.field_3694) * 0.5D);
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3693;
      if(var1 != null) {
         label682: {
            if(this.field_3693 > 0) {
               --this.field_3693;
               var10000 = this.field_3693;
               if(var1 == null) {
                  break label682;
               }

               if(this.field_3693 == 0) {
                  this.method_3941(false);
               }
            }

            var10000 = this.field_3691;
         }
      }

      if(var1 != null) {
         if(var10000 > 0) {
            --this.field_3691;
         }

         this.field_3704 = this.field_3703;
         var10000 = this.field_3049;
      }

      class_796 var11;
      label675: {
         label686: {
            if(var1 != null) {
               if(var10000 != 0) {
                  var11 = this;
                  if(var1 != null) {
                     if(this.field_3690.enableBackgroundDrawing6 != null) {
                        this.field_3690.method_5236((bdw)null);
                     }

                     var11 = this;
                  }

                  label688: {
                     float var17;
                     var10000 = (var17 = var11.field_3703 - 0.0F) == 0.0F?0:(var17 < 0.0F?-1:1);
                     if(var1 != null) {
                        if(var10000 == 0) {
                           class_1541 var13 = this.field_3690.method_5295();
                           bqx var10001 = new bqx;
                           String[] var10003 = field_3706;
                           var10001.method_8227("portal.trigger");
                           var13.method_8366(class_1424.method_7768(var10001, this.field_3028.nextFloat() * 0.4F + 0.8F));
                        }

                        this.field_3703 += 0.0125F;
                        var11 = this;
                        if(var1 == null) {
                           break label688;
                        }

                        float var18;
                        var10000 = (var18 = this.field_3703 - 1.0F) == 0.0F?0:(var18 < 0.0F?-1:1);
                     }

                     if(var10000 >= 0) {
                        this.field_3703 = 1.0F;
                     }

                     var11 = this;
                  }

                  var11.field_3049 = false;
                  if(var1 != null) {
                     break label686;
                  }
               }

               var10000 = this.method_4177(class_1635.field_8499);
            }

            if(var1 != null) {
               label665: {
                  if(var10000 != 0) {
                     var10000 = this.method_4178(class_1635.field_8499).method_9017();
                     if(var1 == null) {
                        break label665;
                     }

                     if(var10000 > 60) {
                        this.field_3703 += 0.006666667F;
                        float var19;
                        var10000 = (var19 = this.field_3703 - 1.0F) == 0.0F?0:(var19 < 0.0F?-1:1);
                        if(var1 == null) {
                           break label675;
                        }

                        if(var10000 <= 0) {
                           break label686;
                        }

                        this.field_3703 = 1.0F;
                        if(var1 != null) {
                           break label686;
                        }
                     }
                  }

                  float var20;
                  var10000 = (var20 = this.field_3703 - 0.0F) == 0.0F?0:(var20 < 0.0F?-1:1);
               }
            }

            if(var1 != null) {
               if(var10000 > 0) {
                  this.field_3703 -= 0.05F;
               }

               float var21;
               var10000 = (var21 = this.field_3703 - 0.0F) == 0.0F?0:(var21 < 0.0F?-1:1);
            }

            if(var1 == null) {
               break label675;
            }

            if(var10000 < 0) {
               this.field_3703 = 0.0F;
            }
         }

         var10000 = this.field_3048;
      }

      if(var1 != null) {
         if(var10000 > 0) {
            --this.field_3048;
         }

         var10000 = this.field_3689.field_7408;
      }

      int var2 = var10000;
      float var3 = 0.8F;
      float var22;
      var10000 = (var22 = this.field_3689.field_7407 - var3) == 0.0F?0:(var22 < 0.0F?-1:1);
      if(var1 != null) {
         var10000 = var10000 >= 0?1:0;
      }

      int var4 = var10000;
      this.field_3692.method_10071(this.field_3690, (GuiTextField6)this.field_3689, this);
      var10000 = this.field_3689.field_7409;
      if(var1 != null) {
         label637: {
            if(this.field_3689.field_7409) {
               float var23;
               var10000 = (var23 = this.field_3024 - 0.2F) == 0.0F?0:(var23 < 0.0F?-1:1);
               if(var1 == null) {
                  break label637;
               }

               if(var10000 < 0) {
                  this.field_3024 = 0.2F;
               }
            }

            var10000 = this.method_4557();
         }
      }

      if(var1 != null) {
         label630: {
            if(var10000 != 0) {
               var10000 = this.method_3937();
               if(var1 == null) {
                  break label630;
               }

               if(var10000 == 0) {
                  label624: {
                     adb var5 = this.method_4555().method_3730();
                     if(var1 != null) {
                        if(var5 instanceof class_557) {
                           label691: {
                              adb var14 = var5;
                              adb var10 = class_1010.field_5180;
                              if(var1 != null) {
                                 if(var5 == class_1010.field_5180) {
                                    break label691;
                                 }

                                 var14 = var5;
                                 var10 = class_1010.field_5341;
                              }

                              if(var1 != null) {
                                 if(var14 == var10) {
                                    break label691;
                                 }

                                 var14 = var5;
                                 var10 = class_1010.field_5289;
                              }

                              if(var14 != var10) {
                                 break label624;
                              }
                           }
                        }

                        this.field_3689.field_7406 *= 0.2F;
                        this.field_3689.field_7407 *= 0.2F;
                     }

                     this.field_3691 = 0;
                  }
               }
            }

            this.method_3953(this.field_2994 - (double)this.field_3014 * 0.35D, this.field_3004.field_6910 + 0.5D, this.field_2996 + (double)this.field_3014 * 0.35D);
            this.method_3953(this.field_2994 - (double)this.field_3014 * 0.35D, this.field_3004.field_6910 + 0.5D, this.field_2996 - (double)this.field_3014 * 0.35D);
            this.method_3953(this.field_2994 + (double)this.field_3014 * 0.35D, this.field_3004.field_6910 + 0.5D, this.field_2996 - (double)this.field_3014 * 0.35D);
            this.method_3953(this.field_2994 + (double)this.field_3014 * 0.35D, this.field_3004.field_6910 + 0.5D, this.field_2996 + (double)this.field_3014 * 0.35D);
            float var24;
            var10000 = (var24 = (float)this.method_4623().method_3637() - 6.0F) == 0.0F?0:(var24 < 0.0F?-1:1);
         }
      }

      if(var1 != null) {
         label606: {
            if(var10000 <= 0) {
               var10000 = this.field_3640.field_2837;
               if(var1 == null) {
                  break label606;
               }

               if(!this.field_3640.field_2837) {
                  var10000 = 0;
                  break label606;
               }
            }

            var10000 = 1;
         }
      }

      int var9 = var10000;
      var10000 = class_687.field_2946;
      if(var1 != null) {
         var10000 = !class_687.field_2946?1:0;
      }

      int var6 = var10000;
      byte var7 = class_687.field_2951;
      var10000 = class_687.field_2954;
      if(var1 != null) {
         if(class_687.field_2954) {
            this.method_3941(false);
            this.field_3692.method_10072(false, false);
            class_687.field_2954 = false;
         }

         var10000 = var6;
      }

      label596: {
         label692: {
            if(var1 != null) {
               if(var10000 != 0) {
                  var10000 = class_687.field_2951;
                  if(var1 != null) {
                     label535: {
                        if(class_687.field_2951) {
                           var10000 = this.field_3005;
                           if(var1 == null) {
                              break label535;
                           }

                           if(this.field_3005) {
                              var10000 = var4;
                              if(var1 == null) {
                                 break label535;
                              }

                              if(var4 == 0) {
                                 float var25;
                                 var10000 = (var25 = this.field_3689.field_7407 - var3) == 0.0F?0:(var25 < 0.0F?-1:1);
                                 if(var1 == null) {
                                    break label535;
                                 }

                                 if(var10000 >= 0) {
                                    var10000 = this.method_3940();
                                    if(var1 == null) {
                                       break label535;
                                    }

                                    if(var10000 == 0) {
                                       var10000 = var9;
                                       if(var1 == null) {
                                          break label535;
                                       }

                                       if(var9 != 0) {
                                          var10000 = this.method_4557();
                                          if(var1 == null) {
                                             break label535;
                                          }

                                          if(var10000 == 0) {
                                             var10000 = this.method_4177(class_1635.field_8505);
                                             if(var1 == null) {
                                                break label535;
                                             }

                                             if(var10000 == 0) {
                                                label511: {
                                                   var11 = this;
                                                   if(var1 != null) {
                                                      label509: {
                                                         if(this.field_3691 <= 0) {
                                                            var11 = this;
                                                            if(var1 == null) {
                                                               break label509;
                                                            }

                                                            if(!this.field_3690.canLoseFocus7.field_4543.getEnableBackgroundDrawing2()) {
                                                               this.field_3691 = 7;
                                                               if(var1 != null) {
                                                                  break label511;
                                                               }
                                                            }
                                                         }

                                                         this.method_3941(true);
                                                         var11 = this;
                                                      }
                                                   }

                                                   var11.field_3692.method_10072(true, false);
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var10000 = this.method_3940();
                     }
                  }

                  if(var1 == null) {
                     break label596;
                  }

                  if(var10000 != 0) {
                     break label692;
                  }

                  float var26;
                  var10000 = (var26 = this.field_3689.field_7407 - var3) == 0.0F?0:(var26 < 0.0F?-1:1);
                  if(var1 == null) {
                     break label596;
                  }

                  if(var10000 < 0) {
                     break label692;
                  }

                  var10000 = var9;
                  if(var1 == null) {
                     break label596;
                  }

                  if(var9 == 0) {
                     break label692;
                  }

                  var10000 = this.method_4557();
                  if(var1 == null) {
                     break label596;
                  }

                  if(var10000 != 0) {
                     break label692;
                  }

                  var10000 = this.method_4177(class_1635.field_8505);
                  if(var1 == null) {
                     break label596;
                  }

                  if(var10000 != 0) {
                     break label692;
                  }

                  var10000 = this.field_3690.canLoseFocus7.field_4543.getEnableBackgroundDrawing2();
                  if(var1 == null) {
                     break label596;
                  }

                  if(var10000 == 0) {
                     break label692;
                  }

                  this.method_3941(true);
                  this.field_3692.method_10072(true, false);
                  if(var1 != null) {
                     break label692;
                  }
               }

               var10000 = this.field_3692.field_9502;
            }

            int var8 = var10000;
            var10000 = var9;
            if(var1 != null) {
               label500: {
                  if(var9 != 0) {
                     var10000 = this.method_4557();
                     if(var1 == null) {
                        break label500;
                     }

                     if(var10000 == 0) {
                        var10000 = this.method_4177(class_1635.field_8505);
                        if(var1 == null) {
                           break label500;
                        }

                        if(var10000 == 0) {
                           var10000 = this.field_3692.field_9503;
                           if(var1 == null) {
                              break label500;
                           }

                           if(!this.field_3692.field_9503) {
                              label492: {
                                 label491: {
                                    label694: {
                                       var10000 = var7;
                                       if(var1 != null) {
                                          if(var7 != 0) {
                                             var11 = this;
                                             if(var1 == null) {
                                                break label491;
                                             }

                                             if(!this.method_3940()) {
                                                break label694;
                                             }
                                          }

                                          var10000 = var7;
                                       }

                                       if(var1 == null) {
                                          break label500;
                                       }

                                       if(var10000 != 0) {
                                          break label492;
                                       }
                                    }

                                    var11 = this;
                                 }

                                 var11.method_3941((boolean)var8);
                              }
                           }
                        }
                     }
                  }

                  var10000 = var7;
               }
            }

            if(var1 == null) {
               break label596;
            }

            if(var10000 != 0) {
               var10000 = var8;
               if(var1 == null) {
                  break label596;
               }

               if(var8 == 0) {
                  var10000 = this.field_3005;
                  if(var1 == null) {
                     break label596;
                  }

                  if(this.field_3005) {
                     var10000 = var4;
                     if(var1 == null) {
                        break label596;
                     }

                     if(var4 == 0) {
                        float var27;
                        var10000 = (var27 = this.field_3689.field_7407 - var3) == 0.0F?0:(var27 < 0.0F?-1:1);
                        if(var1 == null) {
                           break label596;
                        }

                        if(var10000 >= 0) {
                           var10000 = this.method_3940();
                           if(var1 == null) {
                              break label596;
                           }

                           if(var10000 == 0) {
                              var10000 = var9;
                              if(var1 == null) {
                                 break label596;
                              }

                              if(var9 != 0) {
                                 var10000 = this.method_4557();
                                 if(var1 == null) {
                                    break label596;
                                 }

                                 if(var10000 == 0) {
                                    var10000 = this.method_4177(class_1635.field_8505);
                                    if(var1 == null) {
                                       break label596;
                                    }

                                    if(var10000 == 0) {
                                       label472: {
                                          var11 = this;
                                          if(var1 != null) {
                                             if(this.field_3691 == 0) {
                                                this.field_3691 = 7;
                                                if(var1 != null) {
                                                   break label472;
                                                }
                                             }

                                             this.method_3941(true);
                                             this.field_3692.method_10072(true, true);
                                             var11 = this;
                                          }

                                          var11.field_3691 = 0;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var10000 = this.method_3940();
      }

      if(var1 != null) {
         label464: {
            if(var10000 != 0) {
               label462: {
                  class_1860 var15;
                  label695: {
                     float var28;
                     var10000 = (var28 = this.field_3689.field_7407 - var3) == 0.0F?0:(var28 < 0.0F?-1:1);
                     if(var1 != null) {
                        label696: {
                           if(var10000 >= 0) {
                              var10000 = this.field_3006;
                              if(var1 == null) {
                                 break label696;
                              }

                              if(!this.field_3006) {
                                 var10000 = var9;
                                 if(var1 == null) {
                                    break label464;
                                 }

                                 if(var9 != 0) {
                                    break label462;
                                 }
                              }
                           }

                           this.method_3941(false);
                           var15 = this.field_3692;
                           if(var1 == null) {
                              break label695;
                           }

                           var10000 = this.field_3692.field_9503;
                        }
                     }

                     label450: {
                        if(var10000 != 1) {
                           label448: {
                              var10000 = var6;
                              if(var1 != null) {
                                 if(var6 != 0) {
                                    break label448;
                                 }

                                 var15 = this.field_3692;
                                 if(var1 == null) {
                                    break label695;
                                 }

                                 var10000 = this.field_3692.field_9504;
                              }

                              if(var10000 == 0) {
                                 var11 = this;
                                 if(var1 == null) {
                                    break label450;
                                 }

                                 if(!this.field_3640.field_2837) {
                                    var10000 = this.method_3937();
                                    if(var1 == null) {
                                       break label464;
                                    }

                                    if(var10000 == 0) {
                                       break label462;
                                    }
                                 }
                              }
                           }
                        }

                        var11 = this;
                     }

                     var15 = var11.field_3692;
                  }

                  var15.method_10072(false, false);
               }
            }

            var10000 = class_687.field_2952;
         }
      }

      label425: {
         label698: {
            if(var1 != null) {
               label422: {
                  if(var10000 != 0) {
                     var10000 = this.field_3640.field_2837;
                     if(var1 == null) {
                        break label422;
                     }

                     if(this.field_3640.field_2837) {
                        var10000 = this.field_3690.canLoseFocus7.field_4543.getEnableBackgroundDrawing2();
                        if(var1 == null) {
                           break label422;
                        }

                        if(var10000 != 0) {
                           var10000 = this.field_3640.field_2839;
                           if(var1 == null) {
                              break label422;
                           }

                           if(this.field_3640.field_2839) {
                              this.field_3640.method_3588(0.05F * (float)class_687.field_2953);
                              var10000 = this.field_3689.field_7409;
                              if(var1 != null) {
                                 if(this.field_3689.field_7409) {
                                    this.field_2998 -= 0.15D * class_687.field_2953;
                                 }

                                 var10000 = this.field_3689.field_7408;
                              }

                              if(var1 == null) {
                                 break label425;
                              }

                              if(var10000 == 0) {
                                 break label698;
                              }

                              this.field_2998 += 0.15D * class_687.field_2953;
                              if(var1 != null) {
                                 break label698;
                              }
                           }
                        }
                     }
                  }

                  float var29;
                  var10000 = (var29 = this.field_3640.method_3587() - 0.05F) == 0.0F?0:(var29 < 0.0F?-1:1);
               }
            }

            if(var1 == null) {
               break label425;
            }

            if(var10000 != 0) {
               this.field_3640.method_3588(0.05F);
            }
         }

         var10000 = this.field_3640.field_2838;
      }

      if(var1 != null) {
         label398: {
            if(var10000 != 0) {
               var10000 = var2;
               if(var1 == null) {
                  break label398;
               }

               if(var2 == 0) {
                  var10000 = this.field_3689.field_7408;
                  if(var1 == null) {
                     break label398;
                  }

                  if(this.field_3689.field_7408) {
                     label700: {
                        var11 = this;
                        if(var1 != null) {
                           if(this.field_3621 == 0) {
                              this.field_3621 = 7;
                              if(var1 != null) {
                                 break label700;
                              }
                           }

                           var11 = this;
                        }

                        boolean var12 = this.field_3640.field_2837;
                        if(var1 != null) {
                           var12 = !this.field_3640.field_2837;
                        }

                        var11.field_3640.field_2837 = var12;
                        this.method_4630();
                        this.field_3621 = 0;
                     }
                  }
               }
            }

            var10000 = this.field_3640.field_2837;
         }
      }

      label382: {
         label381: {
            label701: {
               if(var1 != null) {
                  label702: {
                     if(var10000 != 0) {
                        var10000 = this.field_3689.field_7409;
                        if(var1 != null) {
                           if(this.field_3689.field_7409) {
                              this.field_2998 -= 0.15D;
                           }

                           var10000 = this.field_3689.field_7408;
                        }

                        if(var1 == null) {
                           break label702;
                        }

                        if(var10000 != 0) {
                           this.field_2998 += 0.15D;
                        }
                     }

                     var11 = this;
                     if(var1 == null) {
                        break label701;
                     }

                     var10000 = this.method_4671();
                  }
               }

               if(var10000 != 0) {
                  var10000 = this.field_3698;
                  if(var1 != null) {
                     label335: {
                        if(this.field_3698 < 0) {
                           ++this.field_3698;
                           var10000 = this.field_3698;
                           if(var1 == null) {
                              break label335;
                           }

                           if(this.field_3698 == 0) {
                              this.field_3699 = 0.0F;
                           }
                        }

                        var10000 = var2;
                     }
                  }

                  if(var1 != null) {
                     label364: {
                        if(var10000 != 0) {
                           var10000 = this.field_3689.field_7408;
                           if(var1 == null) {
                              break label364;
                           }

                           if(!this.field_3689.field_7408) {
                              this.field_3698 -= 10;
                              this.field_3698 = -10;
                              this.method_4673();
                              if(var1 != null) {
                                 break label381;
                              }
                           }
                        }

                        var10000 = var2;
                     }
                  }

                  if(var1 != null) {
                     label357: {
                        if(var10000 == 0) {
                           var10000 = this.field_3689.field_7408;
                           if(var1 == null) {
                              break label357;
                           }

                           if(this.field_3689.field_7408) {
                              this.field_3698 = 0;
                              this.field_3699 = 0.0F;
                              if(var1 != null) {
                                 break label381;
                              }
                           }
                        }

                        var10000 = var2;
                     }
                  }

                  if(var1 == null) {
                     break label382;
                  }

                  if(var10000 == 0) {
                     break label381;
                  }

                  ++this.field_3698;
                  var11 = this;
                  if(var1 != null) {
                     if(this.field_3698 < 10) {
                        this.field_3699 = (float)this.field_3698 * 0.1F;
                        if(var1 != null) {
                           break label381;
                        }
                     }

                     var11 = this;
                  }

                  var11.field_3699 = 0.8F + 2.0F / (this.field_3699 - 9.0F) * 0.1F;
                  if(var1 != null) {
                     break label381;
                  }
               }

               var11 = this;
            }

            var11.field_3699 = 0.0F;
         }

         super.method_4231();
         var10000 = this.field_3005;
      }

      class_665 var16;
      label705: {
         if(var1 != null) {
            if(var10000 == 0) {
               return;
            }

            var16 = this.field_3640;
            if(var1 == null) {
               break label705;
            }

            var10000 = this.field_3640.field_2837;
         }

         if(var10000 == 0) {
            return;
         }

         var16 = this.field_3640;
      }

      var16.field_2837 = false;
      this.method_4630();
   }

   // $FF: renamed from: n () float
   public float method_4667() {
      float var2 = 1.0F;
      String[] var1 = class_752.method_4253();
      class_796 var10000 = this;
      if(var1 != null) {
         if(this.field_3640.field_2837) {
            var2 *= 1.1F;
         }

         var10000 = this;
      }

      float var6;
      int var7;
      label70: {
         label69: {
            class_80 var3 = var10000.method_4211(class_1840.field_9393);
            var2 = (float)((double)var2 * ((var3.method_396() / (double)this.field_3640.method_3589() + 1.0D) / 2.0D));
            var6 = this.field_3640.method_3589();
            if(var1 != null) {
               label67: {
                  if(var6 != 0.0F) {
                     var6 = var2;
                     if(var1 == null) {
                        break label67;
                     }

                     if(!Float.isNaN(var2)) {
                        var7 = Float.isInfinite(var2);
                        if(var1 == null) {
                           break label70;
                        }

                        if(var7 == 0) {
                           break label69;
                        }
                     }
                  }

                  var6 = 1.0F;
               }
            }

            var2 = var6;
         }

         var7 = this.method_4557();
      }

      if(var1 != null) {
         if(var7 == 0) {
            return var2;
         }

         var7 = this.method_4555().method_3730() instanceof class_573;
      }

      if(var1 != null) {
         label48: {
            if(var7 == 0) {
               var7 = this.method_4555().method_3730() instanceof ItemSuperBow;
               if(var1 == null) {
                  break label48;
               }

               if(var7 == 0) {
                  return var2;
               }
            }

            var7 = this.method_4558();
         }
      }

      float var5;
      label40: {
         int var4 = var7;
         var5 = (float)var4 / 20.0F;
         var6 = var5;
         float var10001 = 1.0F;
         if(var1 != null) {
            if(var5 > 1.0F) {
               var5 = 1.0F;
               if(var1 != null) {
                  break label40;
               }
            }

            var6 = var5;
            var10001 = var5;
         }

         var5 = var6 * var10001;
      }

      var2 *= 1.0F - var5 * 0.15F;
      return var2;
   }

   // $FF: renamed from: k () void
   public void method_4564() {
      super.method_4564();
      this.field_3690.method_5236((bdw)null);
   }

   // $FF: renamed from: a (gi) void
   public void method_4586(class_580 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1 instanceof class_582;
      bao var3;
      if(var2 != null) {
         if(var10000) {
            var3 = this.field_3690;
            class_191 var10001 = new class_191;
            var10001.method_1019((class_582)var1);
            var3.method_5236(var10001);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1 instanceof class_593;
      }

      if(var10000) {
         var3 = this.field_3690;
         class_192 var4 = new class_192;
         var4.method_1021(((class_593)var1).method_3160());
         var3.method_5236(var4);
      }

   }

   // $FF: renamed from: a (c7) void
   public void method_4587(class_926 var1) {
      bao var10000 = this.field_3690;
      class_192 var10001 = new class_192;
      var10001.method_1021(var1);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: b (add) void
   public void method_4591(add var1) {
      String[] var10000 = class_752.method_4253();
      adb var3 = var1.method_3730();
      String[] var2 = var10000;
      adb var4 = var3;
      adb var10001 = class_1010.field_5243;
      bao var5;
      class_193 var6;
      if(var2 != null) {
         if(var3 == class_1010.field_5243) {
            var5 = this.field_3690;
            var6 = new class_193;
            var6.method_1024(this, var1, false);
            var5.method_5236(var6);
            if(var2 != null) {
               return;
            }
         }

         var4 = var3;
         var10001 = class_1010.field_5242;
      }

      if(var4 == var10001) {
         var5 = this.field_3690;
         var6 = new class_193;
         var6.method_1024(this, var1, true);
         var5.method_5236(var6);
      }

   }

   // $FF: renamed from: a (vI) void
   public void method_4575(class_22 var1) {
      bao var10000 = this.field_3690;
      class_222 var10001 = new class_222;
      var10001.method_1214(this.field_3616, var1);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: a (gv) void
   public void method_4576(class_585 var1) {
      bao var10000 = this.field_3690;
      class_219 var10001 = new class_219;
      var10001.method_1210(this.field_3616, var1);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: a (xv) void
   public void method_4577(class_696 var1) {
      bao var10000 = this.field_3690;
      class_219 var10001 = new class_219;
      var10001.method_1210(this.field_3616, var1);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: a (wR, vI) void
   public void method_4578(class_772 var1, class_22 var2) {
      bao var10000 = this.field_3690;
      class_218 var10001 = new class_218;
      var10001.method_1209(this.field_3616, var2, var1);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_4581(int var1, int var2, int var3) {
      bao var10000 = this.field_3690;
      class_221 var10001 = new class_221;
      var10001.method_1213(this.field_3616, this.field_2990, var1, var2, var3);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: a (int, int, int, java.lang.String) void
   public void method_4579(int var1, int var2, int var3, String var4) {
      bao var10000 = this.field_3690;
      class_220 var10001 = new class_220;
      var10001.method_1211(this.field_3616, this.field_2990, var1, var2, var3, var4);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: c (int, int, int) void
   public void method_4580(int var1, int var2, int var3) {
      bao var10000 = this.field_3690;
      class_225 var10001 = new class_225;
      var10001.method_1222(this.field_3616, this.field_2990, var1, var2, var3);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: a (gl) void
   public void method_4588(class_595 var1) {
      bao var10000 = this.field_3690;
      class_223 var10001 = new class_223;
      var10001.method_1215(this.field_3616, var1);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: a (gk) void
   public void method_4589(class_596 var1) {
      bao var10000 = this.field_3690;
      class_224 var10001 = new class_224;
      var10001.method_1216(this.field_3616, var1);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: a (gq) void
   public void method_4585(class_589 var1) {
      bao var10000 = this.field_3690;
      class_216 var10001 = new class_216;
      var10001.method_1204(this.field_3616, var1);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: a (c5, java.lang.String) void
   public void method_4590(class_18 var1, String var2) {
      bao var10000 = this.field_3690;
      class_217 var10001 = new class_217;
      var10001.method_1205(this.field_3616, var1, this.field_2990, var2);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: b (sa) void
   public void method_4596(class_689 var1) {
      bkn var10000 = this.field_3690.enableBackgroundDrawing1;
      class_745 var10001 = new class_745;
      var10001.method_4134(this.field_3690.cursorCounter6, var1);
      var10000.method_6968(var10001);
   }

   // $FF: renamed from: c (sa) void
   public void method_4597(class_689 var1) {
      class_745 var10000 = new class_745;
      String[] var10004 = field_3706;
      var10000.method_4135(this.field_3690.cursorCounter6, var1, "magicCrit");
      class_745 var2 = var10000;
      this.field_3690.enableBackgroundDrawing1.method_6968(var2);
   }

   // $FF: renamed from: a (sa, int) void
   public void method_4238(class_689 var1, int var2) {
      bkn var10000 = this.field_3690.enableBackgroundDrawing1;
      class_720 var10001 = new class_720;
      var10001.method_4111(this.field_3690.cursorCounter6, var1, this, -0.5F);
      var10000.method_6968(var10001);
   }

   // $FF: renamed from: an () boolean
   public boolean method_3938() {
      boolean var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_3689.field_7409;
         if(var1 != null) {
            if(!this.field_3689.field_7409) {
               break label24;
            }

            var10000 = this.field_3631;
         }

         if(var1 == null) {
            return var10000;
         }

         if(!var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: n (float) void
   public void method_4668(float var1) {
      String[] var10000 = class_752.method_4253();
      float var3 = this.method_406() - var1;
      String[] var2 = var10000;
      if(var2 != null) {
         if(var3 <= 0.0F) {
            this.method_4188(var1);
            if(var2 != null) {
               if(var3 >= 0.0F) {
                  return;
               }

               this.field_3033 = this.field_3325 / 2;
            }

            if(var2 != null) {
               return;
            }
         }

         this.field_3345 = var3;
         this.method_4188(this.method_406());
         this.field_3033 = this.field_3325;
         this.method_4203(class_1691.field_8839, var3);
      }

      this.field_3315 = this.field_3316 = 10;
   }

   // $FF: renamed from: b (rV) void
   public void method_4610(class_66 var1) {
      this.field_3690.canLoseFocus4.method_707().method_675(var1);
   }

   // $FF: renamed from: f (int, int, int) boolean
   private boolean method_4669(int var1, int var2, int var3) {
      return this.field_2990.getBlock(var1, var2, var3).method_2433();
   }

   // $FF: renamed from: j (double, double, double) boolean
   protected boolean method_3953(double var1, double var3, double var5) {
      int var24;
      label211: {
         int var8 = class_1715.method_9561(var1);
         int var9 = class_1715.method_9561(var3);
         int var10 = class_1715.method_9561(var5);
         double var11 = var1 - (double)var8;
         String[] var10000 = class_752.method_4253();
         double var13 = var5 - (double)var10;
         String[] var7 = var10000;
         byte var23 = this.method_4669(var8, var9, var10);
         if(var7 != null) {
            if(var23 == 0) {
               var24 = this.method_4669(var8, var9 + 1, var10);
               if(var7 == null) {
                  return (boolean)var24;
               }

               if(var24 == 0) {
                  break label211;
               }
            }

            var23 = this.method_4669(var8 - 1, var9, var10);
         }

         label177: {
            label197: {
               if(var7 != null) {
                  if(var23 != 0) {
                     break label197;
                  }

                  var23 = this.method_4669(var8 - 1, var9 + 1, var10);
               }

               if(var7 == null) {
                  break label177;
               }

               if(var23 == 0) {
                  var23 = 1;
                  break label177;
               }
            }

            var23 = 0;
         }

         byte var15;
         label166: {
            label198: {
               var15 = var23;
               var23 = this.method_4669(var8 + 1, var9, var10);
               if(var7 != null) {
                  if(var23 != 0) {
                     break label198;
                  }

                  var23 = this.method_4669(var8 + 1, var9 + 1, var10);
               }

               if(var7 == null) {
                  break label166;
               }

               if(var23 == 0) {
                  var23 = 1;
                  break label166;
               }
            }

            var23 = 0;
         }

         byte var16;
         label155: {
            label199: {
               var16 = var23;
               var23 = this.method_4669(var8, var9, var10 - 1);
               if(var7 != null) {
                  if(var23 != 0) {
                     break label199;
                  }

                  var23 = this.method_4669(var8, var9 + 1, var10 - 1);
               }

               if(var7 == null) {
                  break label155;
               }

               if(var23 == 0) {
                  var23 = 1;
                  break label155;
               }
            }

            var23 = 0;
         }

         byte var17;
         label144: {
            label200: {
               var17 = var23;
               var23 = this.method_4669(var8, var9, var10 + 1);
               if(var7 != null) {
                  if(var23 != 0) {
                     break label200;
                  }

                  var23 = this.method_4669(var8, var9 + 1, var10 + 1);
               }

               if(var7 == null) {
                  break label144;
               }

               if(var23 == 0) {
                  var23 = 1;
                  break label144;
               }
            }

            var23 = 0;
         }

         byte var18 = var23;
         int var19 = -1;
         double var20 = 9999.0D;
         var24 = var15;
         if(var7 != null) {
            label207: {
               if(var15 != 0) {
                  double var25;
                  var24 = (var25 = var11 - var20) == 0.0D?0:(var25 < 0.0D?-1:1);
                  if(var7 == null) {
                     break label207;
                  }

                  if(var24 < 0) {
                     var20 = var11;
                     var19 = 0;
                  }
               }

               var24 = var16;
            }
         }

         if(var7 != null) {
            label208: {
               if(var24 != 0) {
                  double var26;
                  var24 = (var26 = 1.0D - var11 - var20) == 0.0D?0:(var26 < 0.0D?-1:1);
                  if(var7 == null) {
                     break label208;
                  }

                  if(var24 < 0) {
                     var20 = 1.0D - var11;
                     var19 = 1;
                  }
               }

               var24 = var17;
            }
         }

         if(var7 != null) {
            label209: {
               if(var24 != 0) {
                  double var27;
                  var24 = (var27 = var13 - var20) == 0.0D?0:(var27 < 0.0D?-1:1);
                  if(var7 == null) {
                     break label209;
                  }

                  if(var24 < 0) {
                     var20 = var13;
                     var19 = 4;
                  }
               }

               var24 = var18;
            }
         }

         label204: {
            if(var7 != null) {
               if(var24 == 0) {
                  break label204;
               }

               double var28;
               var24 = (var28 = 1.0D - var13 - var20) == 0.0D?0:(var28 < 0.0D?-1:1);
            }

            if(var7 != null) {
               if(var24 >= 0) {
                  break label204;
               }

               var20 = 1.0D - var13;
               var24 = 5;
            }

            var19 = var24;
         }

         float var22 = 0.1F;
         var24 = var19;
         if(var7 != null) {
            if(var19 == 0) {
               this.field_2997 = (double)(-var22);
            }

            var24 = var19;
         }

         byte var10001 = 1;
         if(var7 != null) {
            if(var24 == 1) {
               this.field_2997 = (double)var22;
            }

            var24 = var19;
            var10001 = 4;
         }

         if(var7 != null) {
            if(var24 == var10001) {
               this.field_2999 = (double)(-var22);
            }

            var24 = var19;
            if(var7 == null) {
               return (boolean)var24;
            }

            var10001 = 5;
         }

         if(var24 == var10001) {
            this.field_2999 = (double)var22;
         }
      }

      var24 = 0;
      return (boolean)var24;
   }

   // $FF: renamed from: c (boolean) void
   public void method_3941(boolean var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3941((boolean)var1);
      String[] var2 = var10000;
      int var10001 = var1;
      if(var2 != null) {
         var10001 = var1 != 0?600:0;
      }

      this.field_3693 = var10001;
   }

   // $FF: renamed from: b (float, int, int) void
   public void method_4670(float var1, int var2, int var3) {
      this.field_3643 = var1;
      this.field_3642 = var2;
      this.field_3641 = var3;
   }

   // $FF: renamed from: a (rV) void
   public void method_66(class_66 var1) {
      this.field_3690.canLoseFocus4.method_707().method_675(var1);
   }

   // $FF: renamed from: a (int, java.lang.String) boolean
   public boolean method_67(int var1, String var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         var10000 = var1 <= 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f_ () vF
   public class_1661 method_68() {
      class_1661 var10000 = new class_1661;
      var10000.method_9151(class_1715.method_9561(this.field_2994 + 0.5D), class_1715.method_9561(this.field_2995 + 0.5D), class_1715.method_9561(this.field_2996 + 0.5D));
      return var10000;
   }

   // $FF: renamed from: a (java.lang.String, float, float) void
   public void method_3868(String var1, float var2, float var3) {
      this.field_2990.method_2085(this.field_2994, this.field_2995 - (double)this.field_3013, this.field_2996, var1, var2, var3, false);
   }

   // $FF: renamed from: br () boolean
   public boolean method_4244() {
      return true;
   }

   // $FF: renamed from: v () boolean
   public boolean method_4671() {
      boolean var2;
      label24: {
         String[] var1 = class_752.method_4253();
         class_689 var10000 = this.field_2988;
         if(var1 != null) {
            if(this.field_2988 == null) {
               break label24;
            }

            var10000 = this.field_2988;
         }

         var2 = var10000 instanceof class_772;
         if(var1 == null) {
            return var2;
         }

         if(var2) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: w () float
   public float method_4672() {
      return this.field_3699;
   }

   // $FF: renamed from: i () void
   protected void method_4673() {}

   // $FF: renamed from: <clinit> () void
   static void method_4636() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "¶{4µ·²`\'³ë,VpäH©öY:x\t«n)·;ë¯";
      int var4 = "¶{4µ·²`\'³ë,VpäH©öY:x\t«n)·;ë¯".length();
      char var1 = 14;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_3706 = var5;
                  String[] var10 = field_3706;
                  field_3705 = "CL_00000938";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 46;
               break;
            case 1:
               var10009 = 136;
               break;
            case 2:
               var10009 = 225;
               break;
            case 3:
               var10009 = 168;
               break;
            case 4:
               var10009 = 60;
               break;
            case 5:
               var10009 = 144;
               break;
            default:
               var10009 = 113;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

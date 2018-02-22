package ca.diiza.utils;

import ca.diiza.u.class_687;
import ca.diiza.utils.MP3Player;
import java.text.DecimalFormat;

// $FF: renamed from: ca.diiza.utils.c
public class class_1860 {

   // $FF: renamed from: a boolean
   public boolean field_9500;
   // $FF: renamed from: b boolean
   public boolean field_9501;
   // $FF: renamed from: c boolean
   public boolean field_9502;
   // $FF: renamed from: d boolean
   public boolean field_9503;
   // $FF: renamed from: e boolean
   public boolean field_9504;
   // $FF: renamed from: f long
   private long field_9505;
   // $FF: renamed from: g long
   private long field_9506;
   // $FF: renamed from: h boolean
   private boolean field_9507;
   // $FF: renamed from: i boolean
   private boolean field_9508;
   // $FF: renamed from: j boolean
   private boolean field_9509;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_9510;


   // $FF: renamed from: <init> () void
   public void method_10070() {
      super();
      this.field_9502 = false;
      this.field_9503 = false;
      this.field_9504 = false;
   }

   // $FF: renamed from: a (bao, nP, xg) void
   public void method_10071(bao var1, GuiTextField6 var2, class_796 var3) {
      var2.field_7406 = 0.0F;
      int[] var10000 = MP3Player.method_3212();
      var2.field_7407 = 0.0F;
      int[] var4 = var10000;
      bbj var6 = var1.canLoseFocus7;
      boolean var9 = var6.field_4532.getEnableBackgroundDrawing2();
      if(var4 == null) {
         if(var9) {
            ++var2.field_7407;
         }

         var9 = var6.field_4534.getEnableBackgroundDrawing2();
      }

      if(var4 == null) {
         if(var9) {
            --var2.field_7407;
         }

         var9 = var6.field_4533.getEnableBackgroundDrawing2();
      }

      if(var4 == null) {
         if(var9) {
            ++var2.field_7406;
         }

         var9 = var6.field_4535.getEnableBackgroundDrawing2();
      }

      int var11;
      boolean var10001;
      label270: {
         label269: {
            GuiTextField6 var10;
            label277: {
               if(var4 == null) {
                  if(var9) {
                     --var2.field_7406;
                  }

                  var10 = var2;
                  var10001 = var6.field_4536.getEnableBackgroundDrawing2();
                  if(var4 != null) {
                     break label277;
                  }

                  var2.field_7408 = var10001;
                  var9 = class_687.field_2947;
               }

               if(var9) {
                  var11 = var6.field_4537.getEnableBackgroundDrawing2();
                  if(var4 == null) {
                     label246: {
                        if(var11 != 0) {
                           var11 = this.field_9507;
                           if(var4 != null) {
                              break label246;
                           }

                           if(!this.field_9507) {
                              label280: {
                                 label281: {
                                    label237: {
                                       var9 = var3.method_3937();
                                       if(var4 == null) {
                                          if(var9) {
                                             break label237;
                                          }

                                          var9 = var3.field_3640.field_2837;
                                       }

                                       if(!var9) {
                                          break label281;
                                       }
                                    }

                                    var2.field_7409 = true;
                                    this.field_9509 = var3.method_3937();
                                    if(var4 == null) {
                                       break label280;
                                    }

                                    int var5 = class_689.method_3977();
                                    ++var5;
                                    class_689.method_3975(var5);
                                 }

                                 var10001 = var2.field_7409;
                                 if(var4 == null) {
                                    var10001 = !var2.field_7409;
                                 }

                                 var2.field_7409 = var10001;
                              }

                              this.field_9505 = System.currentTimeMillis();
                              this.field_9507 = true;
                           }
                        }

                        var11 = var6.field_4537.getEnableBackgroundDrawing2();
                     }
                  }

                  if(var4 != null) {
                     break label270;
                  }

                  if(var11 != 0) {
                     break label269;
                  }

                  var11 = this.field_9507;
                  if(var4 != null) {
                     break label270;
                  }

                  if(!this.field_9507) {
                     break label269;
                  }

                  label227: {
                     label226: {
                        label225: {
                           label282: {
                              var11 = var3.field_3640.field_2837;
                              if(var4 == null) {
                                 if(var3.field_3640.field_2837) {
                                    break label282;
                                 }

                                 var11 = this.field_9509;
                              }

                              if(var4 != null) {
                                 break label226;
                              }

                              if(var11 == 0) {
                                 break label225;
                              }
                           }

                           var2.field_7409 = false;
                           this.field_9509 = false;
                           if(var4 == null) {
                              break label227;
                           }
                        }

                        long var13;
                        var11 = (var13 = System.currentTimeMillis() - this.field_9505 - 300L) == 0L?0:(var13 < 0L?-1:1);
                     }

                     if(var11 > 0) {
                        var2.field_7409 = false;
                     }
                  }

                  this.field_9507 = false;
                  if(var4 == null) {
                     break label269;
                  }
               }

               var10 = var2;
               var10001 = var6.field_4537.getEnableBackgroundDrawing2();
            }

            var10.field_7409 = var10001;
         }

         var11 = var2.field_7409;
      }

      if(var4 == null) {
         if(var11 != 0) {
            var2.field_7406 = (float)((double)var2.field_7406 * 0.3D);
            var2.field_7407 = (float)((double)var2.field_7407 * 0.3D);
         }

         float var14;
         var11 = (var14 = (float)var3.method_4623().method_3637() - 6.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
      }

      if(var4 == null) {
         label209: {
            if(var11 <= 0) {
               var11 = var3.field_3640.field_2837;
               if(var4 != null) {
                  break label209;
               }

               if(!var3.field_3640.field_2837) {
                  var11 = 0;
                  break label209;
               }
            }

            var11 = 1;
         }
      }

      label202: {
         label283: {
            int var7 = var11;
            var11 = var2.field_7409;
            if(var4 == null) {
               if(var2.field_7409) {
                  break label283;
               }

               var11 = var3.method_3937();
            }

            if(var4 == null) {
               if(var11 != 0) {
                  break label283;
               }

               var11 = var3.field_3640.field_2837;
            }

            if(var4 == null) {
               if(var11 != 0) {
                  break label283;
               }

               var11 = var7;
            }

            if(var4 != null) {
               break label202;
            }

            if(var11 != 0) {
               var11 = 1;
               break label202;
            }
         }

         var11 = 0;
      }

      int var8 = var11;
      var10001 = class_687.field_2946;
      if(var4 == null) {
         var10001 = !class_687.field_2946;
      }

      label180: {
         label284: {
            this.field_9500 = var10001;
            this.field_9501 = class_687.field_2951;
            var11 = var8;
            if(var4 == null) {
               if(var8 == 0) {
                  var11 = this.field_9500;
                  if(var4 != null) {
                     break label180;
                  }

                  if(!this.field_9500) {
                     break label284;
                  }
               }

               var11 = var6.field_4543.getEnableBackgroundDrawing2();
            }

            if(var4 != null) {
               break label180;
            }

            if(var11 != 0) {
               var11 = this.field_9508;
               if(var4 != null) {
                  break label180;
               }

               if(!this.field_9508) {
                  var11 = this.field_9500;
                  if(var4 != null) {
                     break label180;
                  }

                  if(!this.field_9500) {
                     var10001 = this.field_9502;
                     if(var4 == null) {
                        var10001 = !this.field_9502;
                     }

                     this.field_9502 = var10001;
                     this.field_9506 = System.currentTimeMillis();
                     this.field_9508 = true;
                     this.field_9503 = false;
                  }
               }
            }
         }

         var11 = var8;
      }

      class_1860 var12;
      label161: {
         label285: {
            if(var4 == null) {
               if(var11 == 0) {
                  var12 = this;
                  if(var4 != null) {
                     break label161;
                  }

                  if(!this.field_9500) {
                     break label285;
                  }
               }

               var11 = var6.field_4543.getEnableBackgroundDrawing2();
            }

            if(var4 == null) {
               if(var11 != 0) {
                  break label285;
               }

               var12 = this;
               if(var4 != null) {
                  break label161;
               }

               var11 = this.field_9508;
            }

            if(var11 != 0) {
               if(System.currentTimeMillis() - this.field_9506 > 300L) {
                  this.field_9503 = true;
               }

               this.field_9508 = false;
            }
         }

         var12 = this;
      }

      var12.method_10073(var2, var3, var6);
   }

   // $FF: renamed from: a (boolean, boolean) void
   public void method_10072(boolean var1, boolean var2) {
      this.field_9502 = var1;
      this.field_9504 = var2;
   }

   // $FF: renamed from: a (nP, xg, bbj) void
   private void method_10073(GuiTextField6 var1, class_796 var2, bbj var3) {
      int[] var4 = MP3Player.method_3212();
      if(class_687.field_2948) {
         String var5 = "";
         boolean var6 = var2.field_3640.field_2837;
         boolean var7 = var2.method_3937();
         boolean var8 = var3.field_4537.getEnableBackgroundDrawing2();
         boolean var9 = var3.field_4543.getEnableBackgroundDrawing2();
         boolean var10000 = var6;
         String[] var11;
         StringBuilder var14;
         if(var4 == null) {
            if(var6) {
               label127: {
                  label126: {
                     DecimalFormat var13 = new DecimalFormat("#.00");
                     var11 = field_9510;
                     DecimalFormat var10 = var13;
                     var10000 = class_687.field_2952;
                     if(var4 == null) {
                        if(!class_687.field_2952) {
                           break label126;
                        }

                        var10000 = var9;
                     }

                     if(var10000) {
                        var14 = (new StringBuilder()).append(var5);
                        var11 = field_9510;
                        var5 = var14.append("[Flying (").append(var10.format(class_687.field_2953)).append("x boost)]  ").toString();
                        if(var4 == null) {
                           break label127;
                        }
                     }
                  }

                  var14 = (new StringBuilder()).append(var5);
                  var11 = field_9510;
                  var5 = var14.append("[Flying]  ").toString();
               }
            }

            var10000 = var7;
         }

         if(var4 == null) {
            if(var10000) {
               var14 = (new StringBuilder()).append(var5);
               var11 = field_9510;
               var5 = var14.append("[Riding]  ").toString();
            }

            var10000 = var1.field_7409;
         }

         label135: {
            if(var4 == null) {
               if(var10000) {
                  var10000 = var6;
                  if(var4 == null) {
                     if(var6) {
                        var14 = (new StringBuilder()).append(var5);
                        var11 = field_9510;
                        var5 = var14.append("[Descending]  ").toString();
                        if(var4 == null) {
                           break label135;
                        }
                     }

                     var10000 = var7;
                  }

                  if(var4 == null) {
                     if(var10000) {
                        var14 = (new StringBuilder()).append(var5);
                        var11 = field_9510;
                        var5 = var14.append("[Dismounting]  ").toString();
                        if(var4 == null) {
                           break label135;
                        }
                     }

                     var10000 = var8;
                  }

                  if(var10000) {
                     var14 = (new StringBuilder()).append(var5);
                     var11 = field_9510;
                     var5 = var14.append("[Sneaking (Key Held)]  ").toString();
                     if(var4 == null) {
                        break label135;
                     }
                  }

                  var14 = (new StringBuilder()).append(var5);
                  var11 = field_9510;
                  var5 = var14.append("[Sneaking (Toggled)]  ").toString();
                  if(var4 == null) {
                     break label135;
                  }
               }

               var10000 = this.field_9502;
            }

            if(var4 == null) {
               if(!var10000) {
                  break label135;
               }

               var10000 = var6;
            }

            if(var4 == null) {
               if(var10000) {
                  break label135;
               }

               var10000 = var7;
            }

            if(var4 == null) {
               if(var10000) {
                  break label135;
               }

               var10000 = this.field_9503;
            }

            if(var4 == null) {
               label80: {
                  if(!var10000) {
                     var10000 = this.field_9500;
                     if(var4 != null) {
                        break label80;
                     }

                     if(!this.field_9500) {
                        var10000 = this.field_9504;
                        if(var4 != null) {
                           break label80;
                        }

                        if(!this.field_9504) {
                           var10000 = false;
                           break label80;
                        }
                     }
                  }

                  var10000 = true;
               }
            }

            boolean var12 = var10000;
            var10000 = var9;
            if(var4 == null) {
               if(var9) {
                  var14 = (new StringBuilder()).append(var5);
                  var11 = field_9510;
                  var5 = var14.append("[Sprinting (Key Held)]").toString();
                  if(var4 == null) {
                     break label135;
                  }
               }

               var10000 = var12;
            }

            if(var10000) {
               var14 = (new StringBuilder()).append(var5);
               var11 = field_9510;
               var5 = var14.append("[Sprinting (Vanilla)]").toString();
               if(var4 == null) {
                  break label135;
               }
            }

            var14 = (new StringBuilder()).append(var5);
            String[] var10001 = field_9510;
            var5 = var14.append("[Sprinting (Toggled)]").toString();
         }

         bbv.SetHUDText(var5);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_10074() {
      // $FF: Couldn't be decompiled
   }
}

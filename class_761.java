import java.util.UUID;

// $FF: renamed from: wI
public abstract class class_761 extends class_753 {

   // $FF: renamed from: a1 java.util.UUID
   public static final UUID field_3430;
   // $FF: renamed from: a2 x5
   public static final class_1716 field_3431;
   // $FF: renamed from: a3 jK
   private class_1289 field_3432;
   // $FF: renamed from: a4 sa
   protected class_689 field_3433;
   // $FF: renamed from: a5 boolean
   protected boolean field_3434;
   // $FF: renamed from: a6 int
   protected int field_3435;
   // $FF: renamed from: a7 vF
   private class_1661 field_3436;
   // $FF: renamed from: a8 float
   private float field_3437;
   // $FF: renamed from: a9 yh
   private class_1727 field_3438;
   // $FF: renamed from: by boolean
   private boolean field_3439;
   // $FF: renamed from: bz java.lang.String
   private static final String field_3440;
   // $FF: renamed from: fb java.lang.String[]
   private static final String[] field_3441;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      class_1661 var10001 = new class_1661;
      var10001.method_9151(0, 0, 0);
      this.field_3436 = var10001;
      this.field_3437 = -1.0F;
      class_1761 var2 = new class_1761;
      var2.method_9719(this, 1.0D);
      this.field_3438 = var2;
   }

   // $FF: renamed from: d () boolean
   protected boolean method_4328() {
      return false;
   }

   // $FF: renamed from: bq () void
   protected void method_4236() {
      String[] var1;
      int var10001;
      class_761 var25;
      label288: {
         String[] var10000 = class_752.method_4253();
         String[] var22 = field_3441;
         this.field_2990.field_1829.method_8332("ai");
         var1 = var10000;
         var25 = this;
         if(var1 != null) {
            if(this.field_3435 > 0) {
               var25 = this;
               var10001 = this.field_3435 - 1;
               if(var1 == null) {
                  break label288;
               }

               if((this.field_3435 = var10001) == 0) {
                  class_80 var2 = this.method_4211(class_1840.field_9393);
                  var2.method_394(field_3431);
               }
            }

            var25 = this;
         }

         var10001 = this.method_4328();
      }

      float var23;
      class_689 var26;
      label280: {
         label279: {
            label291: {
               var25.field_3434 = (boolean)var10001;
               var23 = 16.0F;
               var26 = this.field_3433;
               if(var1 != null) {
                  if(this.field_3433 == null) {
                     this.field_3433 = this.method_4332();
                     var26 = this.field_3433;
                     if(var1 == null) {
                        break label280;
                     }

                     if(this.field_3433 == null) {
                        break label279;
                     }

                     this.field_3432 = this.field_2990.method_2167(this, this.field_3433, var23, true, false, false, true);
                     if(var1 != null) {
                        break label279;
                     }
                  }

                  var25 = this;
                  if(var1 == null) {
                     break label291;
                  }

                  var26 = this.field_3433;
               }

               if(var26.method_3917()) {
                  label260: {
                     float var3 = this.field_3433.method_3888(this);
                     var25 = this;
                     class_689 var27 = this.field_3433;
                     if(var1 != null) {
                        if(!this.method_4239(this.field_3433)) {
                           break label260;
                        }

                        var25 = this;
                        var27 = this.field_3433;
                     }

                     var25.method_4330(var27, var3);
                  }

                  if(var1 != null) {
                     break label279;
                  }
               }

               var25 = this;
            }

            var25.field_3433 = null;
         }

         var26 = this.field_3433;
      }

      int var29 = var26 instanceof class_793;
      if(var1 != null) {
         label253: {
            if(var29 != 0) {
               var29 = ((class_793)this.field_3433).field_3656.method_9201();
               if(var1 == null) {
                  break label253;
               }

               if(var29 != 0) {
                  this.field_3433 = null;
               }
            }

            this.field_2990.field_1829.method_8333();
            var29 = this.field_3434;
         }
      }

      label247: {
         label294: {
            if(var1 != null) {
               label244: {
                  label243: {
                     if(var29 == 0) {
                        var25 = this;
                        if(var1 == null) {
                           break label243;
                        }

                        if(this.field_3433 != null) {
                           label237: {
                              var25 = this;
                              if(var1 != null) {
                                 if(this.field_3432 != null) {
                                    var29 = this.field_3028.nextInt(20);
                                    if(var1 == null) {
                                       break label244;
                                    }

                                    if(var29 != 0) {
                                       break label237;
                                    }
                                 }

                                 var25 = this;
                              }

                              var25.field_3432 = this.field_2990.method_2167(this, this.field_3433, var23, true, false, false, true);
                              if(var1 != null) {
                                 break label294;
                              }
                           }
                        }
                     }

                     var25 = this;
                  }

                  var29 = var25.field_3434;
               }
            }

            if(var1 == null) {
               break label247;
            }

            if(var29 == 0) {
               label295: {
                  label223: {
                     label296: {
                        var25 = this;
                        if(var1 != null) {
                           if(this.field_3432 == null) {
                              var29 = this.field_3028.nextInt(180);
                              if(var1 == null) {
                                 break label223;
                              }

                              if(var29 == 0) {
                                 break label296;
                              }
                           }

                           var25 = this;
                        }

                        var29 = var25.field_3028.nextInt(120);
                        if(var1 == null) {
                           break label223;
                        }

                        if(var29 != 0) {
                           var29 = this.field_3435;
                           if(var1 == null) {
                              break label247;
                           }

                           if(this.field_3435 <= 0) {
                              break label295;
                           }
                        }
                     }

                     var29 = this.field_3338;
                  }

                  if(var1 == null) {
                     break label247;
                  }

                  if(var29 < 100) {
                     this.method_4329();
                  }
               }
            }
         }

         var29 = class_1715.method_9561(this.field_3004.field_6910 + 0.5D);
      }

      int var24 = var29;
      boolean var4 = this.method_3876();
      boolean var5 = this.method_3881();
      this.field_3001 = 0.0F;
      var25 = this;
      if(var1 != null) {
         label199: {
            if(this.field_3432 != null) {
               var25 = this;
               if(var1 == null) {
                  break label199;
               }

               if(this.field_3028.nextInt(100) != 0) {
                  String[] var28 = field_3441;
                  this.field_2990.field_1829.method_8332("followpath");
                  azw var6 = this.field_3432.method_6749(this);
                  double var7 = (double)(this.field_3014 * 2.0F);

                  label188: {
                     label298: {
                        Object var32;
                        label299: {
                           azw var30;
                           while(true) {
                              if(var6 != null) {
                                 var30 = var6;
                                 if(var1 == null) {
                                    break;
                                 }

                                 double var34;
                                 var29 = (var34 = var6.method_5096(this.field_2994, var6.field_4221, this.field_2996) - var7 * var7) == 0.0D?0:(var34 < 0.0D?-1:1);
                                 if(var1 == null) {
                                    break label188;
                                 }

                                 if(var29 < 0) {
                                    this.field_3432.method_6740();
                                    class_1289 var31 = this.field_3432;
                                    if(var1 != null) {
                                       if(this.field_3432.method_6741()) {
                                          var6 = null;
                                          this.field_3432 = null;
                                          continue;
                                       }

                                       var31 = this.field_3432;
                                    }

                                    var6 = var31.method_6749(this);
                                    if(var1 != null) {
                                       continue;
                                    }
                                 }
                              }

                              var32 = this;
                              if(var1 == null) {
                                 break label299;
                              }

                              this.field_3346 = false;
                              var30 = var6;
                              break;
                           }

                           if(var30 != null) {
                              double var9 = var6.field_4220 - this.field_2994;
                              double var11 = var6.field_4222 - this.field_2996;
                              double var13 = var6.field_4221 - (double)var24;
                              float var15 = (float)(Math.atan2(var11, var9) * 180.0D / 3.141592653589793D) - 90.0F;
                              float var16 = class_1715.method_9579(var15 - this.field_3000);
                              this.field_3348 = (float)this.method_4211(class_1840.field_9393).method_396();
                              float var35;
                              var29 = (var35 = var16 - 30.0F) == 0.0F?0:(var35 < 0.0F?-1:1);
                              if(var1 != null) {
                                 if(var29 > 0) {
                                    var16 = 30.0F;
                                 }

                                 float var36;
                                 var29 = (var36 = var16 - -30.0F) == 0.0F?0:(var36 < 0.0F?-1:1);
                              }

                              if(var1 != null) {
                                 if(var29 < 0) {
                                    var16 = -30.0F;
                                 }

                                 this.field_3000 += var16;
                                 var29 = this.field_3434;
                              }

                              if(var1 != null) {
                                 if(var29 != 0) {
                                    label155: {
                                       var26 = this.field_3433;
                                       if(var1 != null) {
                                          if(this.field_3433 == null) {
                                             break label155;
                                          }

                                          var26 = this.field_3433;
                                       }

                                       double var17 = var26.field_2994 - this.field_2994;
                                       double var19 = this.field_3433.field_2996 - this.field_2996;
                                       float var21 = this.field_3000;
                                       this.field_3000 = (float)(Math.atan2(var19, var17) * 180.0D / 3.141592653589793D) - 90.0F;
                                       var16 = (var21 - this.field_3000 + 90.0F) * 3.1415927F / 180.0F;
                                       this.field_3347 = -class_1715.method_9555(var16) * this.field_3348 * 1.0F;
                                       this.field_3348 = class_1715.method_9556(var16) * this.field_3348 * 1.0F;
                                    }
                                 }

                                 double var37;
                                 var29 = (var37 = var13 - 0.0D) == 0.0D?0:(var37 < 0.0D?-1:1);
                              }

                              if(var29 > 0) {
                                 this.field_3346 = true;
                              }
                           }

                           var25 = this;
                           if(var1 == null) {
                              break label298;
                           }

                           var32 = this.field_3433;
                        }

                        if(var32 != null) {
                           this.method_4272(this.field_3433, 30.0F, 30.0F);
                        }

                        var25 = this;
                     }

                     var29 = var25.field_3006;
                  }

                  label303: {
                     if(var1 != null) {
                        label304: {
                           if(var29 != 0) {
                              var29 = this.method_4333();
                              if(var1 == null) {
                                 break label304;
                              }

                              if(var29 == 0) {
                                 this.field_3346 = true;
                              }
                           }

                           var25 = this;
                           if(var1 == null) {
                              break label303;
                           }

                           float var38;
                           var29 = (var38 = this.field_3028.nextFloat() - 0.8F) == 0.0F?0:(var38 < 0.0F?-1:1);
                        }
                     }

                     if(var29 < 0) {
                        label138: {
                           label137: {
                              boolean var33 = var4;
                              if(var1 != null) {
                                 if(var4) {
                                    break label137;
                                 }

                                 var33 = var5;
                              }

                              if(!var33) {
                                 break label138;
                              }
                           }

                           this.field_3346 = true;
                        }
                     }

                     var25 = this;
                  }

                  var25.field_2990.field_1829.method_8333();
                  if(var1 != null) {
                     return;
                  }
               }
            }

            super.method_4236();
            var25 = this;
         }
      }

      var25.field_3432 = null;
   }

   // $FF: renamed from: i () void
   protected void method_4329() {
      String[] var10000 = class_752.method_4253();
      String[] var10002 = field_3441;
      this.field_2990.field_1829.method_8332("stroll");
      byte var2 = 0;
      int var3 = -1;
      int var4 = -1;
      int var5 = -1;
      String[] var1 = var10000;
      float var6 = -99999.0F;
      int var7 = 0;

      int var12;
      while(true) {
         if(var7 < 10) {
            int var8 = class_1715.method_9561(this.field_2994 + (double)this.field_3028.nextInt(13) - 6.0D);
            int var9 = class_1715.method_9561(this.field_2995 + (double)this.field_3028.nextInt(7) - 3.0D);
            int var10 = class_1715.method_9561(this.field_2996 + (double)this.field_3028.nextInt(13) - 6.0D);
            float var11 = this.method_4331(var8, var9, var10);
            if(var1 != null) {
               float var13;
               var12 = (var13 = var11 - var6) == 0.0F?0:(var13 < 0.0F?-1:1);
               if(var1 == null) {
                  break;
               }

               if(var12 > 0) {
                  var6 = var11;
                  var3 = var8;
                  var4 = var9;
                  var5 = var10;
                  var2 = 1;
               }

               ++var7;
            }

            if(var1 != null) {
               continue;
            }
         }

         var12 = var2;
         break;
      }

      if(var12 != 0) {
         this.field_3432 = this.field_2990.method_2168(this, var3, var4, var5, 10.0F, true, false, false, true);
      }

      this.field_2990.field_1829.method_8333();
   }

   // $FF: renamed from: a (sa, float) void
   protected void method_4330(class_689 var1, float var2) {}

   // $FF: renamed from: b (int, int, int) float
   public float method_4331(int var1, int var2, int var3) {
      return 0.0F;
   }

   // $FF: renamed from: bR () sa
   protected class_689 method_4332() {
      return null;
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      int var5;
      label24: {
         int var2 = class_1715.method_9561(this.field_2994);
         String[] var10000 = class_752.method_4253();
         int var3 = class_1715.method_9561(this.field_3004.field_6910);
         String[] var1 = var10000;
         int var4 = class_1715.method_9561(this.field_2996);
         var5 = super.method_4274();
         if(var1 != null) {
            if(var5 == 0) {
               break label24;
            }

            float var6;
            var5 = (var6 = this.method_4331(var2, var3, var4) - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
         }

         if(var1 == null) {
            return (boolean)var5;
         }

         if(var5 >= 0) {
            var5 = 1;
            return (boolean)var5;
         }
      }

      var5 = 0;
      return (boolean)var5;
   }

   // $FF: renamed from: a1 () boolean
   public boolean method_4333() {
      return this.field_3432 != null;
   }

   // $FF: renamed from: b (jK) void
   public void method_4334(class_1289 var1) {
      this.field_3432 = var1;
   }

   // $FF: renamed from: a2 () sa
   public class_689 method_4335() {
      return this.field_3433;
   }

   // $FF: renamed from: d (sa) void
   public void method_4336(class_689 var1) {
      this.field_3433 = var1;
   }

   // $FF: renamed from: a3 () boolean
   public boolean method_4337() {
      return this.method_4338(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996));
   }

   // $FF: renamed from: c (int, int, int) boolean
   public boolean method_4338(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      float var5;
      int var10000 = (var5 = this.field_3437 - -1.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
      if(var4 != null) {
         if(var10000 == 0) {
            var10000 = 1;
            return (boolean)var10000;
         }

         float var6;
         var10000 = (var6 = this.field_3436.method_9155(var1, var2, var3) - this.field_3437 * this.field_3437) == 0.0F?0:(var6 < 0.0F?-1:1);
      }

      if(var4 != null) {
         var10000 = var10000 < 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (int, int, int, int) void
   public void method_4339(int var1, int var2, int var3, int var4) {
      this.field_3436.method_9154(var1, var2, var3);
      this.field_3437 = (float)var4;
   }

   // $FF: renamed from: a4 () vF
   public class_1661 method_4340() {
      return this.field_3436;
   }

   // $FF: renamed from: a5 () float
   public float method_4341() {
      return this.field_3437;
   }

   // $FF: renamed from: a6 () void
   public void method_4342() {
      this.field_3437 = -1.0F;
   }

   // $FF: renamed from: a7 () boolean
   public boolean method_4343() {
      String[] var1 = class_752.method_4253();
      float var2;
      int var10000 = (var2 = this.field_3437 - -1.0F) == 0.0F?0:(var2 < 0.0F?-1:1);
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: bL () void
   protected void method_4296() {
      String[] var10000 = class_752.method_4253();
      super.method_4296();
      String[] var1 = var10000;
      boolean var10 = this.method_4299();
      class_761 var11;
      if(var1 != null) {
         label94: {
            if(var10) {
               var11 = this;
               if(var1 == null) {
                  break label94;
               }

               if(this.method_4300() != null) {
                  var11 = this;
                  if(var1 == null) {
                     break label94;
                  }

                  if(this.method_4300().field_2990 == this.field_2990) {
                     class_689 var2 = this.method_4300();
                     this.method_4339((int)var2.field_2994, (int)var2.field_2995, (int)var2.field_2996, 5);
                     float var3 = this.method_3888(var2);
                     int var12 = this instanceof class_776;
                     if(var1 != null) {
                        label106: {
                           if(var12 != 0) {
                              var12 = ((class_776)this).method_4478();
                              if(var1 == null) {
                                 break label106;
                              }

                              if(var12 != 0) {
                                 if(var3 > 10.0F) {
                                    this.method_4297(true, true);
                                 }

                                 return;
                              }
                           }

                           var12 = this.field_3439;
                        }
                     }

                     if(var1 != null) {
                        if(var12 == 0) {
                           this.field_3373.method_9766(2, this.field_3438);
                           this.method_4257().method_9784(false);
                           this.field_3439 = true;
                        }

                        this.method_4344(var3);
                        float var13;
                        var12 = (var13 = var3 - 4.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
                     }

                     if(var1 != null) {
                        if(var12 > 0) {
                           this.method_4257().method_9796(var2, 1.0D);
                        }

                        float var14;
                        var12 = (var14 = var3 - 6.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
                     }

                     if(var1 != null) {
                        if(var12 > 0) {
                           double var4 = (var2.field_2994 - this.field_2994) / (double)var3;
                           double var6 = (var2.field_2995 - this.field_2995) / (double)var3;
                           double var8 = (var2.field_2996 - this.field_2996) / (double)var3;
                           this.field_2997 += var4 * Math.abs(var4) * 0.4D;
                           this.field_2998 += var6 * Math.abs(var6) * 0.4D;
                           this.field_2999 += var8 * Math.abs(var8) * 0.4D;
                        }

                        float var15;
                        var12 = (var15 = var3 - 10.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
                     }

                     if(var12 > 0) {
                        this.method_4297(true, true);
                     }

                     if(var1 != null) {
                        return;
                     }
                  }
               }
            }

            var11 = this;
         }

         var10 = var11.method_4299();
      }

      label104: {
         if(var1 != null) {
            if(var10) {
               return;
            }

            var11 = this;
            if(var1 == null) {
               break label104;
            }

            var10 = this.field_3439;
         }

         if(!var10) {
            return;
         }

         this.field_3439 = false;
         this.field_3373.method_9767(this.field_3438);
         this.method_4257().method_9784(true);
         var11 = this;
      }

      var11.method_4342();
   }

   // $FF: renamed from: a (float) void
   protected void method_4344(float var1) {}

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}

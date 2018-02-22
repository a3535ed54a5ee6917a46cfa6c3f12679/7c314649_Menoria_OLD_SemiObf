import java.util.Random;

// $FF: renamed from: eY
public class class_417 extends aji {

   // $FF: renamed from: M vL[]
   private class_73[] field_2134;
   // $FF: renamed from: N vL[]
   private class_73[] field_2135;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2136;


   // $FF: renamed from: <init> (awt) void
   protected void method_2427(awt var1) {
      super.method_2427(var1);
      float var2 = 0.5F;
      float var3 = 1.0F;
      this.method_2443(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var3, 0.5F + var2);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return this.field_2135[0];
   }

   // $FF: renamed from: e (ahl, int, int, int, int) vL
   public class_73 method_2447(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         if(var5 == 1) {
            return this.field_2135[0];
         }

         var10000 = var5;
      }

      if(var6 != null) {
         if(var10000 == 0) {
            return this.field_2135[0];
         }

         var10000 = this.method_2674(var1, var2, var3, var4);
      }

      int var7 = var10000;
      int var8 = var7 & 3;
      var10000 = var7 & 4;
      if(var6 != null) {
         var10000 = var10000 != 0?1:0;
      }

      int var9 = var10000;
      int var10 = 0;
      var10000 = var7 & 8;
      if(var6 != null) {
         var10000 = var10000 != 0?1:0;
      }

      label259: {
         int var11;
         label276: {
            var11 = var10000;
            var10000 = var9;
            byte var10001;
            if(var6 != null) {
               if(var9 != 0) {
                  label253: {
                     var10000 = var8;
                     if(var6 != null) {
                        if(var8 == 0) {
                           var10000 = var5;
                           var10001 = 2;
                           if(var6 == null) {
                              break label253;
                           }

                           if(var5 == 2) {
                              var10000 = var10;
                              if(var6 != null) {
                                 var10000 = var10 == 0?1:0;
                              }

                              var10 = var10000;
                              if(var6 != null) {
                                 break label276;
                              }
                           }
                        }

                        var10000 = var8;
                     }

                     var10001 = 1;
                  }

                  if(var6 != null) {
                     label244: {
                        if(var10000 == var10001) {
                           var10000 = var5;
                           var10001 = 5;
                           if(var6 == null) {
                              break label244;
                           }

                           if(var5 == 5) {
                              var10000 = var10;
                              if(var6 != null) {
                                 var10000 = var10 == 0?1:0;
                              }

                              var10 = var10000;
                              if(var6 != null) {
                                 break label276;
                              }
                           }
                        }

                        var10000 = var8;
                        var10001 = 2;
                     }
                  }

                  if(var6 != null) {
                     label278: {
                        if(var10000 == var10001) {
                           var10000 = var5;
                           var10001 = 3;
                           if(var6 == null) {
                              break label278;
                           }

                           if(var5 == 3) {
                              var10000 = var10;
                              if(var6 != null) {
                                 var10000 = var10 == 0?1:0;
                              }

                              var10 = var10000;
                              if(var6 != null) {
                                 break label276;
                              }
                           }
                        }

                        var10000 = var8;
                        if(var6 == null) {
                           break label259;
                        }

                        var10001 = 3;
                     }
                  }

                  if(var10000 != var10001) {
                     break label276;
                  }

                  var10000 = var5;
                  if(var6 == null) {
                     break label259;
                  }

                  if(var5 != 4) {
                     break label276;
                  }

                  var10000 = var10;
                  if(var6 != null) {
                     var10000 = var10 == 0?1:0;
                  }

                  var10 = var10000;
                  if(var6 != null) {
                     break label276;
                  }
               }

               var10000 = var8;
            }

            label208: {
               label279: {
                  label206: {
                     if(var6 != null) {
                        if(var10000 == 0) {
                           var10000 = var5;
                           var10001 = 5;
                           if(var6 == null) {
                              break label206;
                           }

                           if(var5 == 5) {
                              var10000 = var10;
                              if(var6 != null) {
                                 var10000 = var10 == 0?1:0;
                              }

                              var10 = var10000;
                              if(var6 != null) {
                                 break label279;
                              }
                           }
                        }

                        var10000 = var8;
                     }

                     var10001 = 1;
                  }

                  if(var6 != null) {
                     label193: {
                        if(var10000 == var10001) {
                           var10000 = var5;
                           var10001 = 3;
                           if(var6 == null) {
                              break label193;
                           }

                           if(var5 == 3) {
                              var10000 = var10;
                              if(var6 != null) {
                                 var10000 = var10 == 0?1:0;
                              }

                              var10 = var10000;
                              if(var6 != null) {
                                 break label279;
                              }
                           }
                        }

                        var10000 = var8;
                        var10001 = 2;
                     }
                  }

                  if(var6 != null) {
                     label182: {
                        if(var10000 == var10001) {
                           var10000 = var5;
                           var10001 = 4;
                           if(var6 == null) {
                              break label182;
                           }

                           if(var5 == 4) {
                              var10000 = var10;
                              if(var6 != null) {
                                 var10000 = var10 == 0?1:0;
                              }

                              var10 = var10000;
                              if(var6 != null) {
                                 break label279;
                              }
                           }
                        }

                        var10000 = var8;
                        var10001 = 3;
                     }
                  }

                  if(var6 == null) {
                     break label208;
                  }

                  if(var10000 == var10001) {
                     var10000 = var5;
                     var10001 = 2;
                     if(var6 == null) {
                        break label208;
                     }

                     if(var5 == 2) {
                        var10000 = var10;
                        if(var6 != null) {
                           var10000 = var10 == 0?1:0;
                        }

                        var10 = var10000;
                     }
                  }
               }

               var10000 = var7;
               var10001 = 16;
            }

            var10000 &= var10001;
            if(var6 == null) {
               break label259;
            }

            if(var10000 != 0) {
               var10000 = var10;
               if(var6 != null) {
                  var10000 = var10 == 0?1:0;
               }

               var10 = var10000;
            }
         }

         var10000 = var11;
      }

      int var12;
      if(var10000 != 0) {
         var12 = var10;
         if(var6 != null) {
            var12 = var10 != 0?1:0;
         }

         return this.field_2134[var12];
      } else {
         var12 = var10;
         if(var6 != null) {
            var12 = var10 != 0?1:0;
         }

         return this.field_2135[var12];
      }
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2134 = new class_73[2];
      this.field_2135 = new class_73[2];
      class_73[] var10000 = this.field_2134;
      StringBuilder var10003 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2136;
      var10000[0] = var1.method_375(var10003.append("_upper").toString());
      this.field_2135[0] = var1.method_375(this.method_2533() + "_lower");
      var10000 = this.field_2134;
      class_1670 var10002 = new class_1670;
      var10002.method_9214(this.field_2134[0], true, false);
      var10000[1] = var10002;
      var10000 = this.field_2135;
      var10002 = new class_1670;
      var10002.method_9214(this.field_2135[0], true, false);
      var10000[1] = var10002;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: b (ahl, int, int, int) boolean
   public boolean method_2435(ahl var1, int var2, int var3, int var4) {
      int var6 = this.method_2674(var1, var2, var3, var4);
      String[] var5 = class_752.method_4253();
      int var10000 = var6 & 4;
      if(var5 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 7;
   }

   // $FF: renamed from: g (ahb, int, int, int) kg
   public class_1343 method_2450(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2450(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2452(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.method_2672(this.method_2674(var1, var2, var3, var4));
   }

   // $FF: renamed from: f (ahl, int, int, int) int
   public int method_2670(ahl var1, int var2, int var3, int var4) {
      return this.method_2674(var1, var2, var3, var4) & 3;
   }

   // $FF: renamed from: g (ahl, int, int, int) boolean
   public boolean method_2671(ahl var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = this.method_2674(var1, var2, var3, var4) & 4;
      if(var5 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (int) void
   private void method_2672(int var1) {
      float var3 = 0.1875F;
      String[] var10000 = class_752.method_4253();
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      int var4 = var1 & 3;
      String[] var2 = var10000;
      int var7 = var1 & 4;
      if(var2 != null) {
         var7 = var7 != 0?1:0;
      }

      int var5 = var7;
      var7 = var1 & 16;
      if(var2 != null) {
         var7 = var7 != 0?1:0;
      }

      int var6 = var7;
      var7 = var4;
      if(var2 != null) {
         if(var4 == 0) {
            label129: {
               var7 = var5;
               if(var2 != null) {
                  if(var5 == 0) {
                     break label129;
                  }

                  var7 = var6;
               }

               if(var7 == 0) {
                  this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var3);
                  if(var2 != null) {
                     return;
                  }
               }

               this.method_2443(0.0F, 0.0F, 1.0F - var3, 1.0F, 1.0F, 1.0F);
               if(var2 != null) {
                  return;
               }
            }

            this.method_2443(0.0F, 0.0F, 0.0F, var3, 1.0F, 1.0F);
            if(var2 != null) {
               return;
            }
         }

         var7 = var4;
      }

      byte var10001 = 1;
      if(var2 != null) {
         if(var7 == 1) {
            label130: {
               var7 = var5;
               if(var2 != null) {
                  if(var5 == 0) {
                     break label130;
                  }

                  var7 = var6;
               }

               if(var7 == 0) {
                  this.method_2443(1.0F - var3, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                  if(var2 != null) {
                     return;
                  }
               }

               this.method_2443(0.0F, 0.0F, 0.0F, var3, 1.0F, 1.0F);
               if(var2 != null) {
                  return;
               }
            }

            this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var3);
            if(var2 != null) {
               return;
            }
         }

         var7 = var4;
         var10001 = 2;
      }

      label131: {
         if(var2 != null) {
            if(var7 == var10001) {
               label133: {
                  var7 = var5;
                  if(var2 != null) {
                     if(var5 == 0) {
                        break label133;
                     }

                     var7 = var6;
                  }

                  if(var7 == 0) {
                     this.method_2443(0.0F, 0.0F, 1.0F - var3, 1.0F, 1.0F, 1.0F);
                     if(var2 != null) {
                        return;
                     }
                  }

                  this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var3);
                  if(var2 != null) {
                     return;
                  }
               }

               this.method_2443(1.0F - var3, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
               if(var2 != null) {
                  return;
               }
            }

            var7 = var4;
            if(var2 == null) {
               break label131;
            }

            var10001 = 3;
         }

         if(var7 != var10001) {
            return;
         }

         var7 = var5;
      }

      label134: {
         if(var2 != null) {
            if(var7 == 0) {
               break label134;
            }

            var7 = var6;
         }

         if(var7 == 0) {
            this.method_2443(0.0F, 0.0F, 0.0F, var3, 1.0F, 1.0F);
            if(var2 != null) {
               return;
            }
         }

         this.method_2443(1.0F - var3, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         if(var2 != null) {
            return;
         }
      }

      this.method_2443(0.0F, 0.0F, 1.0F - var3, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz) void
   public void method_2484(ahb var1, int var2, int var3, int var4, class_792 var5) {}

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      class_417 var10000 = this;
      if(var10 != null) {
         if(this.field_2007 == awt.field_4175) {
            return true;
         }

         var10000 = this;
      }

      label22: {
         int var11 = var10000.method_2674(var1, var2, var3, var4);
         int var12 = var11 & 7;
         var12 ^= 4;
         int var13 = var11 & 8;
         if(var10 != null) {
            if(var13 == 0) {
               var1.method_2055(var2, var3, var4, var12, 2);
               var1.method_2062(var2, var3, var4, var2, var3, var4);
               if(var10 != null) {
                  break label22;
               }
            }

            var1.method_2055(var2, var3 - 1, var4, var12, 2);
         }

         var1.method_2062(var2, var3 - 1, var4, var2, var3, var4);
      }

      var1.method_2211(var5, 1003, var2, var3, var4, 0);
      return true;
   }

   // $FF: renamed from: b (ahb, int, int, int, boolean) void
   public void method_2673(ahb var1, int var2, int var3, int var4, boolean var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = this.method_2674(var1, var2, var3, var4);
      String[] var6 = var10000;
      int var10 = var7 & 4;
      if(var6 != null) {
         var10 = var10 != 0?1:0;
      }

      int var8 = var10;
      var10 = var8;
      byte var10001 = var5;
      if(var6 != null) {
         if(var8 == var5) {
            return;
         }

         var10 = var7;
         var10001 = 7;
      }

      label28: {
         int var9 = var10 & var10001;
         var9 ^= 4;
         var10 = var7 & 8;
         if(var6 != null) {
            if(var10 == 0) {
               var1.method_2055(var2, var3, var4, var9, 2);
               var1.method_2062(var2, var3, var4, var2, var3, var4);
               if(var6 != null) {
                  break label28;
               }
            }

            var1.method_2055(var2, var3 - 1, var4, var9, 2);
         }

         var1.method_2062(var2, var3 - 1, var4, var2, var3, var4);
      }

      var1.method_2211((class_792)null, 1003, var2, var3, var4, 0);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6;
      aji var10;
      label109: {
         int var7 = var1.method_33(var2, var3, var4);
         var6 = class_752.method_4253();
         int var10000 = var7 & 8;
         if(var6 != null) {
            if(var10000 != 0) {
               break label109;
            }

            var10000 = 0;
         }

         int var8 = var10000;
         ahb var11 = var1;
         int var10001 = var2;
         int var10002 = var3 + 1;
         int var10003 = var4;
         if(var6 != null) {
            if(var1.getBlock(var2, var10002, var4) != this) {
               var1.method_2056(var2, var3, var4);
               var8 = 1;
            }

            var11 = var1;
            var10001 = var2;
            var10002 = var3 - 1;
            var10003 = var4;
         }

         var10000 = ahb.method_2135(var11, var10001, var10002, var10003);
         if(var6 != null) {
            label108: {
               if(var10000 == 0) {
                  var1.method_2056(var2, var3, var4);
                  var10000 = 1;
                  if(var6 == null) {
                     break label108;
                  }

                  var8 = 1;
                  if(var1.getBlock(var2, var3 + 1, var4) == this) {
                     var1.method_2056(var2, var3 + 1, var4);
                  }
               }

               var10000 = var8;
            }
         }

         label106: {
            if(var6 != null) {
               if(var10000 != 0) {
                  if(var1.field_1832) {
                     break label106;
                  }

                  this.method_2466(var1, var2, var3, var4, var7, 0);
                  if(var6 != null) {
                     break label106;
                  }
               }

               var10000 = var1.method_2172(var2, var3, var4);
            }

            if(var6 != null) {
               label72: {
                  if(var10000 == 0) {
                     var10000 = var1.method_2172(var2, var3 + 1, var4);
                     if(var6 == null) {
                        break label72;
                     }

                     if(var10000 == 0) {
                        var10000 = 0;
                        break label72;
                     }
                  }

                  var10000 = 1;
               }
            }

            int var9;
            label65: {
               label64: {
                  var9 = var10000;
                  var10000 = var9;
                  if(var6 != null) {
                     if(var9 != 0) {
                        break label64;
                     }

                     var10 = var5;
                     if(var6 == null) {
                        break label65;
                     }

                     var10000 = var5.method_2497();
                  }

                  if(var10000 == 0) {
                     break label106;
                  }
               }

               var10 = var5;
            }

            if(var10 != this) {
               this.method_2673(var1, var2, var3, var4, (boolean)var9);
            }
         }

         if(var6 != null) {
            return;
         }
      }

      var10 = var1.getBlock(var2, var3 - 1, var4);
      class_417 var12 = this;
      if(var6 != null) {
         if(var10 != this) {
            var1.method_2056(var2, var3, var4);
         }

         var10 = var5;
         var12 = this;
      }

      if(var10 != var12) {
         this.method_2459(var1, var2, var3 - 1, var4, var5);
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return (var1 & 8) != 0?null:(this.field_2007 == awt.field_4175?class_1010.field_5188:class_1010.field_5182);
   }

   // $FF: renamed from: a (ahb, int, int, int, azw, azw) azu
   public azu method_2472(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2472(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var3;
      if(var5 != null) {
         if(var3 >= 255) {
            return false;
         }

         var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      }

      label41: {
         if(var5 != null) {
            if(var10000 == 0) {
               break label41;
            }

            var10000 = super.method_2480(var1, var2, var3, var4);
         }

         if(var5 != null) {
            if(var10000 == 0) {
               break label41;
            }

            var10000 = super.method_2480(var1, var2, var3 + 1, var4);
         }

         if(var5 == null) {
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

   // $FF: renamed from: h () int
   public int method_2514() {
      return 1;
   }

   // $FF: renamed from: h (ahl, int, int, int) int
   public int method_2674(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var11 = var6 & 8;
      if(var5 != null) {
         var11 = var11 != 0?1:0;
      }

      int var7;
      int var8;
      int var9;
      label46: {
         var7 = var11;
         var11 = var7;
         if(var5 != null) {
            if(var7 != 0) {
               var8 = var1.method_33(var2, var3 - 1, var4);
               var9 = var6;
               if(var5 != null) {
                  break label46;
               }
            }

            var11 = var6;
         }

         var8 = var11;
         var9 = var1.method_33(var2, var3 + 1, var4);
      }

      var11 = var9 & 1;
      if(var5 != null) {
         var11 = var11 != 0?1:0;
      }

      int var10 = var11;
      var11 = var8 & 7;
      int var10001 = var7;
      if(var5 != null) {
         var10001 = var7 != 0?8:0;
      }

      var11 |= var10001;
      var10001 = var10;
      if(var5 != null) {
         var10001 = var10 != 0?16:0;
      }

      return var11 | var10001;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return this.field_2007 == awt.field_4175?class_1010.field_5188:class_1010.field_5182;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, yz) void
   public void method_2522(ahb var1, int var2, int var3, int var4, int var5, class_792 var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = var6.field_3640.field_2839;
      if(var7 != null) {
         if(!var6.field_3640.field_2839) {
            return;
         }

         var10000 = var5 & 8;
      }

      if(var10000 != 0) {
         ahb var8 = var1;
         int var10001 = var2;
         int var10002 = var3 - 1;
         int var10003 = var4;
         if(var7 != null) {
            if(var1.getBlock(var2, var10002, var4) != this) {
               return;
            }

            var8 = var1;
            var10001 = var2;
            var10002 = var3 - 1;
            var10003 = var4;
         }

         var8.method_2056(var10001, var10002, var10003);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "^¢ÀûÚ^»ßûÚ";
      int var4 = "^¢ÀûÚ^»ßûÚ".length();
      char var1 = 6;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2136 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 43;
               break;
            case 1:
               var10009 = 228;
               break;
            case 2:
               var10009 = 133;
               break;
            case 3:
               var10009 = 64;
               break;
            case 4:
               var10009 = 180;
               break;
            case 5:
               var10009 = 130;
               break;
            default:
               var10009 = 165;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

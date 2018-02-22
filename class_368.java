import java.util.Random;

// $FF: renamed from: fn
public class class_368 extends class_366 {

   // $FF: renamed from: O int
   int field_2032;
   // $FF: renamed from: P boolean[]
   boolean[] field_2033;
   // $FF: renamed from: Q int[]
   int[] field_2034;
   // $FF: renamed from: R java.lang.String
   private static final String field_2035;
   // $FF: renamed from: S java.lang.String[]
   private static final String[] field_2036;


   // $FF: renamed from: <init> (awt) void
   protected void method_2427(awt var1) {
      super.method_2427(var1);
      this.field_2033 = new boolean[4];
      this.field_2034 = new int[4];
   }

   // $FF: renamed from: e (ahb, int, int, int) void
   private void method_2562(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.method_33(var2, var3, var4);
      var1.method_2054(var2, var3, var4, aji.method_2416(aji.method_2415(this) + 1), var5, 2);
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6;
      int var7;
      byte var8;
      boolean var16;
      label270: {
         String[] var10000 = class_752.method_4253();
         var7 = this.method_2553(var1, var2, var3, var4);
         var8 = 1;
         var6 = var10000;
         if(this.field_2007 == awt.field_4178) {
            var16 = var1.field_1820.field_5735;
            if(var6 == null) {
               break label270;
            }

            if(!var1.field_1820.field_5735) {
               var8 = 2;
            }
         }

         var16 = true;
      }

      int var11;
      int var17;
      byte var10001;
      awt var18;
      int var19;
      class_368 var20;
      awt var21;
      label264: {
         label273: {
            boolean var9 = var16;
            int var10 = this.method_2460(var1);
            var17 = var7;
            if(var6 != null) {
               if(var7 <= 0) {
                  break label273;
               }

               var17 = -100;
            }

            label254: {
               label253: {
                  int var12 = var17;
                  this.field_2032 = 0;
                  int var13 = this.method_2567(var1, var2 - 1, var3, var4, var12);
                  var13 = this.method_2567(var1, var2 + 1, var3, var4, var13);
                  var13 = this.method_2567(var1, var2, var3, var4 - 1, var13);
                  var13 = this.method_2567(var1, var2, var3, var4 + 1, var13);
                  var11 = var13 + var8;
                  var17 = var11;
                  if(var6 != null) {
                     if(var11 < 8) {
                        var17 = var13;
                        if(var6 == null) {
                           break label254;
                        }

                        if(var13 >= 0) {
                           break label253;
                        }
                     }

                     var17 = -1;
                  }

                  var11 = var17;
               }

               var17 = this.method_2553(var1, var2, var3 + 1, var4);
            }

            label243: {
               label274: {
                  if(var6 != null) {
                     if(var17 >= 0) {
                        label221: {
                           int var14 = this.method_2553(var1, var2, var3 + 1, var4);
                           var17 = var14;
                           var10001 = 8;
                           if(var6 != null) {
                              if(var14 >= 8) {
                                 var11 = var14;
                                 if(var6 != null) {
                                    break label221;
                                 }
                              }

                              var17 = var14;
                              var10001 = 8;
                           }

                           var11 = var17 + var10001;
                        }
                     }

                     var20 = this;
                     if(var6 == null) {
                        break label274;
                     }

                     var17 = this.field_2032;
                  }

                  if(var17 >= 2) {
                     var21 = this.field_2007;
                     var18 = awt.field_4177;
                     if(var6 == null) {
                        break label243;
                     }

                     if(this.field_2007 == awt.field_4177) {
                        label276: {
                           var21 = var1.getBlock(var2, var3 - 1, var4).method_2424();
                           if(var6 != null) {
                              if(var21.method_5063()) {
                                 var11 = 0;
                                 if(var6 != null) {
                                    break label276;
                                 }
                              }

                              var21 = var1.getBlock(var2, var3 - 1, var4).method_2424();
                           }

                           var18 = this.field_2007;
                           if(var6 == null) {
                              break label243;
                           }

                           if(var21 == this.field_2007) {
                              label214: {
                                 var17 = var1.method_33(var2, var3 - 1, var4);
                                 if(var6 != null) {
                                    if(var17 != 0) {
                                       break label214;
                                    }

                                    var17 = 0;
                                 }

                                 var11 = var17;
                              }
                           }
                        }
                     }
                  }

                  var20 = this;
               }

               var21 = var20.field_2007;
               var18 = awt.field_4178;
            }

            label277: {
               label278: {
                  label279: {
                     label206: {
                        if(var21 == var18) {
                           var17 = var7;
                           var19 = 8;
                           if(var6 == null) {
                              break label279;
                           }

                           if(var7 < 8) {
                              var17 = var11;
                              var19 = 8;
                              if(var6 == null) {
                                 break label279;
                              }

                              if(var11 < 8) {
                                 var17 = var11;
                                 var19 = var7;
                                 if(var6 == null) {
                                    break label279;
                                 }

                                 if(var11 > var7) {
                                    var17 = var5.nextInt(4);
                                    if(var6 == null) {
                                       break label206;
                                    }

                                    if(var17 != 0) {
                                       var10 *= 4;
                                    }
                                 }
                              }
                           }
                        }

                        var17 = var11;
                     }

                     if(var6 == null) {
                        break label278;
                     }

                     var19 = var7;
                  }

                  if(var17 == var19) {
                     if(!var9) {
                        break label277;
                     }

                     this.method_2562(var1, var2, var3, var4);
                     if(var6 != null) {
                        break label277;
                     }
                  }

                  var7 = var11;
                  var17 = var11;
               }

               if(var6 != null) {
                  if(var17 < 0) {
                     var1.method_2056(var2, var3, var4);
                     if(var6 != null) {
                        break label277;
                     }
                  }

                  var1.method_2055(var2, var3, var4, var11, 2);
               }

               var1.method_2110(var2, var3, var4, this, var10);
               var1.method_2063(var2, var3, var4, this);
            }

            if(var6 != null) {
               break label264;
            }
         }

         this.method_2562(var1, var2, var3, var4);
      }

      var17 = this.method_2568(var1, var2, var3 - 1, var4);
      int var10002;
      int var10003;
      if(var6 != null) {
         if(var17 != 0) {
            label165: {
               ahb var23;
               label282: {
                  var21 = this.field_2007;
                  var18 = awt.field_4178;
                  if(var6 != null) {
                     if(this.field_2007 != awt.field_4178) {
                        break label165;
                     }

                     var23 = var1;
                     var19 = var2;
                     var10002 = var3 - 1;
                     var10003 = var4;
                     if(var6 == null) {
                        break label282;
                     }

                     var21 = var1.getBlock(var2, var10002, var4).method_2424();
                     var18 = awt.field_4177;
                  }

                  if(var21 != var18) {
                     break label165;
                  }

                  var23 = var1;
                  var19 = var2;
                  var10002 = var3 - 1;
                  var10003 = var4;
               }

               var23.method_2058(var19, var10002, var10003, class_1192.field_6026);
               this.method_2558(var1, var2, var3 - 1, var4);
               return;
            }

            if(var7 >= 8) {
               this.method_2563(var1, var2, var3 - 1, var4, var7);
               if(var6 != null) {
                  return;
               }
            }

            this.method_2563(var1, var2, var3 - 1, var4, var7 + 8);
            if(var6 != null) {
               return;
            }
         }

         var17 = var7;
      }

      if(var6 != null) {
         if(var17 < 0) {
            return;
         }

         var17 = var7;
      }

      int var10004;
      ahb var22;
      label147: {
         label146: {
            if(var6 != null) {
               if(var17 == 0) {
                  break label146;
               }

               var20 = this;
               var22 = var1;
               var10002 = var2;
               var10003 = var3 - 1;
               var10004 = var4;
               if(var6 == null) {
                  break label147;
               }

               var17 = this.method_2566(var1, var2, var10003, var4);
            }

            if(var17 == 0) {
               return;
            }
         }

         var20 = this;
         var22 = var1;
         var10002 = var2;
         var10003 = var3;
         var10004 = var4;
      }

      boolean[] var15;
      label285: {
         var15 = var20.method_2565(var22, var10002, var10003, var10004);
         var11 = var7 + var8;
         var17 = var7;
         var10001 = 8;
         if(var6 != null) {
            if(var7 >= 8) {
               var11 = 1;
            }

            var17 = var11;
            if(var6 == null) {
               break label285;
            }

            var10001 = 8;
         }

         if(var17 >= var10001) {
            return;
         }

         var17 = var15[0];
      }

      if(var6 != null) {
         if(var17 != 0) {
            this.method_2563(var1, var2 - 1, var3, var4, var11);
         }

         var17 = var15[1];
      }

      if(var6 != null) {
         if(var17 != 0) {
            this.method_2563(var1, var2 + 1, var3, var4, var11);
         }

         var17 = var15[2];
      }

      if(var6 != null) {
         if(var17 != 0) {
            this.method_2563(var1, var2, var3, var4 - 1, var11);
         }

         var17 = var15[3];
      }

      if(var17 != 0) {
         this.method_2563(var1, var2, var3, var4 + 1, var11);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, int) void
   private void method_2563(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      Object var10000 = this;
      if(var6 != null) {
         if(!this.method_2568(var1, var2, var3, var4)) {
            return;
         }

         var10000 = var1.getBlock(var2, var3, var4);
      }

      label19: {
         Object var7 = var10000;
         var10000 = this;
         if(var6 != null) {
            if(this.field_2007 == awt.field_4178) {
               this.method_2558(var1, var2, var3, var4);
               if(var6 != null) {
                  break label19;
               }
            }

            var10000 = var7;
         }

         ((aji)var10000).method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
      }

      var1.method_2054(var2, var3, var4, this, var5, 3);
   }

   // $FF: renamed from: d (ahb, int, int, int, int, int) int
   private int method_2564(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = 1000;
      String[] var7 = var10000;
      int var9 = 0;

      int var13;
      while(true) {
         if(var9 < 4) {
            var13 = var9;
            if(var7 == null) {
               break;
            }

            label163: {
               label183: {
                  byte var10001;
                  label161: {
                     if(var7 != null) {
                        if(var9 == 0) {
                           var13 = var6;
                           var10001 = 1;
                           if(var7 == null) {
                              break label161;
                           }

                           if(var6 == 1) {
                              break label183;
                           }
                        }

                        var13 = var9;
                     }

                     var10001 = 1;
                  }

                  if(var7 != null) {
                     label149: {
                        if(var13 == var10001) {
                           var13 = var6;
                           if(var7 == null) {
                              break label149;
                           }

                           if(var6 == 0) {
                              break label183;
                           }
                        }

                        var13 = var9;
                     }

                     var10001 = 2;
                  }

                  label174: {
                     if(var7 != null) {
                        label175: {
                           if(var13 == var10001) {
                              var13 = var6;
                              var10001 = 3;
                              if(var7 == null) {
                                 break label175;
                              }

                              if(var6 == 3) {
                                 break label183;
                              }
                           }

                           var13 = var9;
                           if(var7 == null) {
                              break label174;
                           }

                           var10001 = 3;
                        }
                     }

                     if(var13 == var10001) {
                        var13 = var6;
                        if(var7 == null) {
                           break label174;
                        }

                        if(var6 == 2) {
                           break label183;
                        }
                     }

                     var13 = var2;
                  }

                  int var10 = var13;
                  int var11 = var4;
                  var13 = var9;
                  if(var7 != null) {
                     if(var9 == 0) {
                        var10 = var2 - 1;
                     }

                     var13 = var9;
                  }

                  var10001 = 1;
                  if(var7 != null) {
                     if(var13 == 1) {
                        ++var10;
                     }

                     var13 = var9;
                     var10001 = 2;
                  }

                  label121: {
                     label177: {
                        int var14;
                        ahb var16;
                        int var10002;
                        int var10003;
                        label178: {
                           Object var15;
                           label179: {
                              label180: {
                                 if(var7 != null) {
                                    if(var13 == var10001) {
                                       var11 = var4 - 1;
                                    }

                                    var13 = var9;
                                    if(var7 == null) {
                                       break label180;
                                    }

                                    var10001 = 3;
                                 }

                                 if(var13 == var10001) {
                                    ++var11;
                                 }

                                 var15 = this;
                                 if(var7 == null) {
                                    break label179;
                                 }

                                 var13 = this.method_2566(var1, var10, var3, var11);
                              }

                              if(var13 != 0) {
                                 break label183;
                              }

                              var16 = var1;
                              var14 = var10;
                              var10002 = var3;
                              var10003 = var11;
                              if(var7 == null) {
                                 break label178;
                              }

                              var15 = var1.getBlock(var10, var3, var11);
                           }

                           if(((aji)var15).method_2424() != this.field_2007) {
                              break label177;
                           }

                           var16 = var1;
                           var14 = var10;
                           var10002 = var3;
                           var10003 = var11;
                        }

                        var13 = var16.method_33(var14, var10002, var10003);
                        if(var7 == null) {
                           break label121;
                        }

                        if(var13 == 0) {
                           break label183;
                        }
                     }

                     var13 = this.method_2566(var1, var10, var3 - 1, var11);
                  }

                  if(var7 != null) {
                     if(var13 == 0) {
                        return var5;
                     }

                     var13 = var5;
                  }

                  if(var7 != null) {
                     if(var13 >= 4) {
                        break label183;
                     }

                     var13 = this.method_2564(var1, var10, var3, var11, var5 + 1, var9);
                  }

                  int var12 = var13;
                  if(var7 == null) {
                     break label163;
                  }

                  if(var12 < var8) {
                     var8 = var12;
                  }
               }

               ++var9;
            }

            if(var7 != null) {
               continue;
            }
         }

         var13 = var8;
         break;
      }

      return var13;
   }

   // $FF: renamed from: m (ahb, int, int, int) boolean[]
   private boolean[] method_2565(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      String[] var5 = var10000;

      int var7;
      int var9;
      int var11;
      int var10002;
      while(true) {
         if(var6 < 4) {
            this.field_2034[var6] = 1000;
            var7 = var2;
            int var8 = var4;
            var9 = var6;
            if(var5 == null) {
               break;
            }

            if(var5 != null) {
               if(var6 == 0) {
                  var7 = var2 - 1;
               }

               var9 = var6;
            }

            byte var10001 = 1;
            if(var5 != null) {
               if(var9 == 1) {
                  ++var7;
               }

               var9 = var6;
               var10001 = 2;
            }

            label137: {
               class_368 var13;
               label150: {
                  label151: {
                     label152: {
                        ahb var12;
                        int var10003;
                        label153: {
                           Object var10;
                           label154: {
                              label155: {
                                 if(var5 != null) {
                                    if(var9 == var10001) {
                                       var8 = var4 - 1;
                                    }

                                    var9 = var6;
                                    if(var5 == null) {
                                       break label155;
                                    }

                                    var10001 = 3;
                                 }

                                 if(var9 == var10001) {
                                    ++var8;
                                 }

                                 var10 = this;
                                 if(var5 == null) {
                                    break label154;
                                 }

                                 var9 = this.method_2566(var1, var7, var3, var8);
                              }

                              if(var9 != 0) {
                                 break label137;
                              }

                              var12 = var1;
                              var11 = var7;
                              var10002 = var3;
                              var10003 = var8;
                              if(var5 == null) {
                                 break label153;
                              }

                              var10 = var1.getBlock(var7, var3, var8);
                           }

                           if(((aji)var10).method_2424() != this.field_2007) {
                              break label152;
                           }

                           var12 = var1;
                           var11 = var7;
                           var10002 = var3;
                           var10003 = var8;
                        }

                        var9 = var12.method_33(var11, var10002, var10003);
                        if(var5 == null) {
                           break label151;
                        }

                        if(var9 == 0) {
                           break label137;
                        }
                     }

                     var13 = this;
                     if(var5 == null) {
                        break label150;
                     }

                     var9 = this.method_2566(var1, var7, var3 - 1, var8);
                  }

                  if(var9 != 0) {
                     this.field_2034[var6] = this.method_2564(var1, var7, var3, var8, 1, var6);
                     if(var5 != null) {
                        break label137;
                     }
                  }

                  var13 = this;
               }

               var13.field_2034[var6] = 0;
            }

            ++var6;
            if(var5 != null) {
               continue;
            }
         }

         var6 = this.field_2034[0];
         var9 = 1;
         break;
      }

      var7 = var9;

      while(true) {
         if(var7 < 4) {
            var9 = this.field_2034[var7];
            if(var5 != null) {
               var11 = var6;
               if(var5 == null) {
                  break;
               }

               if(var9 < var6) {
                  var6 = this.field_2034[var7];
               }
            } else {
               var6 = var9;
            }

            ++var7;
            if(var5 != null) {
               continue;
            }

            var7 = 0;
         } else {
            var7 = 0;
         }

         var9 = var7;
         var11 = 4;
         break;
      }

      boolean[] var14;
      while(var9 < var11) {
         var14 = this.field_2033;
         if(var5 == null) {
            return var14;
         }

         var10002 = this.field_2034[var7];
         if(var5 != null) {
            var10002 = var10002 == var6?1:0;
         }

         this.field_2033[var7] = (boolean)var10002;
         ++var7;
         if(var5 == null) {
            break;
         }

         var9 = var7;
         var11 = 4;
      }

      var14 = this.field_2033;
      return var14;
   }

   // $FF: renamed from: o (ahb, int, int, int) boolean
   private boolean method_2566(ahb var1, int var2, int var3, int var4) {
      aji var6 = var1.getBlock(var2, var3, var4);
      String[] var5 = class_752.method_4253();
      String var10000 = var6.method_2510();
      String[] var7 = field_2036;
      boolean var9 = var10000.contains("pumpkinStem");
      if(var5 != null) {
         if(var9) {
            return true;
         }

         var10000 = var6.method_2510();
         var7 = field_2036;
         var9 = var10000.contains("reeds");
      }

      if(var5 != null) {
         if(!var9) {
            var10000 = var6.method_2510();
            var7 = field_2036;
            var9 = var10000.equals("tile.pumpkin");
            if(var5 == null) {
               return var9;
            }

            if(!var9) {
               label112: {
                  aji var10 = var6;
                  if(var5 != null) {
                     if(var6.method_2510().equals("tile.melon")) {
                        break label112;
                     }

                     var10 = var6;
                  }

                  label113: {
                     aji var10001 = class_1192.field_6090;
                     if(var5 != null) {
                        if(var10 == class_1192.field_6090) {
                           break label113;
                        }

                        var10 = var6;
                        var10001 = class_1192.field_6097;
                     }

                     if(var5 != null) {
                        if(var10 == var10001) {
                           break label113;
                        }

                        var10 = var6;
                        var10001 = class_1192.field_6089;
                     }

                     if(var5 != null) {
                        if(var10 == var10001) {
                           break label113;
                        }

                        var10 = var6;
                        var10001 = class_1192.field_6091;
                     }

                     if(var5 != null) {
                        if(var10 == var10001) {
                           break label113;
                        }

                        var10 = var6;
                        var10001 = class_1192.field_6204;
                     }

                     label102: {
                        if(var5 != null) {
                           if(var10 == var10001) {
                              break label113;
                           }

                           var10 = var6;
                           if(var5 == null) {
                              break label102;
                           }

                           var10001 = class_1192.field_6109;
                        }

                        if(var10 == var10001) {
                           break label113;
                        }

                        var10 = var6;
                     }

                     awt var8 = var10.field_2007;
                     if(var5 != null) {
                        if(var8 == awt.field_4200) {
                           var9 = true;
                           return var9;
                        }

                        var8 = var6.field_2007;
                     }

                     var9 = var8.method_5065();
                     return var9;
                  }

                  var9 = true;
                  return var9;
               }
            }
         }

         var9 = false;
      }

      return var9;
   }

   // $FF: renamed from: h (ahb, int, int, int, int) int
   protected int method_2567(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = this.method_2553(var1, var2, var3, var4);
      String[] var6 = var10000;
      int var8 = var7;
      if(var6 != null) {
         if(var7 < 0) {
            return var5;
         }

         var8 = var7;
      }

      if(var6 != null) {
         if(var8 == 0) {
            ++this.field_2032;
         }

         var8 = var7;
      }

      if(var6 != null) {
         if(var8 >= 8) {
            var7 = 0;
         }

         var8 = var5;
      }

      label49: {
         if(var6 != null) {
            if(var8 < 0) {
               break label49;
            }

            var8 = var7;
         }

         if(var6 == null) {
            return var8;
         }

         if(var8 >= var5) {
            var8 = var5;
            return var8;
         }
      }

      var8 = var7;
      return var8;
   }

   // $FF: renamed from: p (ahb, int, int, int) boolean
   private boolean method_2568(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      awt var6 = var1.getBlock(var2, var3, var4).method_2424();
      String[] var5 = var10000;
      awt var7 = var6;
      awt var10001 = this.field_2007;
      boolean var8;
      if(var5 != null) {
         if(var6 == this.field_2007) {
            var8 = false;
            return var8;
         }

         var7 = var6;
         var10001 = awt.field_4178;
      }

      if(var7 == var10001) {
         var8 = false;
      } else {
         var8 = this.method_2566(var1, var2, var3, var4);
         if(var5 != null) {
            var8 = !var8;
         }
      }

      return var8;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      super.method_2461(var1, var2, var3, var4);
      String[] var5 = var10000;
      ahb var6 = var1;
      int var10001 = var2;
      int var10002 = var3;
      int var10003 = var4;
      if(var5 != null) {
         if(var1.getBlock(var2, var3, var4) != this) {
            return;
         }

         var6 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      var6.method_2110(var10001, var10002, var10003, this, this.method_2460(var1));
   }

   // $FF: renamed from: L () boolean
   public boolean method_2526() {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

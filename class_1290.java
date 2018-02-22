
// $FF: renamed from: jL
public class class_1290 {

   // $FF: renamed from: b ahl
   private ahl field_6614;
   // $FF: renamed from: c jI
   private class_1287 field_6615;
   // $FF: renamed from: d vl
   private class_1706 field_6616;
   // $FF: renamed from: e jJ[]
   private class_1288[] field_6617;
   // $FF: renamed from: f boolean
   private boolean field_6618;
   // $FF: renamed from: g boolean
   private boolean field_6619;
   // $FF: renamed from: h boolean
   private boolean field_6620;
   // $FF: renamed from: i boolean
   private boolean field_6621;


   // $FF: renamed from: <init> (ahl, boolean, boolean, boolean, boolean) void
   public void method_6752(ahl var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      super();
      class_1287 var10001 = new class_1287;
      var10001.method_6723();
      this.field_6615 = var10001;
      class_1706 var6 = new class_1706;
      var6.method_9472();
      this.field_6616 = var6;
      this.field_6617 = new class_1288[32];
      this.field_6614 = var1;
      this.field_6618 = var2;
      this.field_6619 = var3;
      this.field_6620 = var4;
      this.field_6621 = var5;
   }

   // $FF: renamed from: b (sa, sa, float) jK
   public class_1289 method_6753(class_689 var1, class_689 var2, float var3) {
      return this.method_6755(var1, var2.field_2994, var2.field_3004.field_6910, var2.field_2996, var3);
   }

   // $FF: renamed from: b (sa, int, int, int, float) jK
   public class_1289 method_6754(class_689 var1, int var2, int var3, int var4, float var5) {
      return this.method_6755(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var5);
   }

   // $FF: renamed from: b (sa, double, double, double, float) jK
   private class_1289 method_6755(class_689 var1, double var2, double var4, double var6, float var8) {
      boolean var10;
      int var11;
      label42: {
         this.field_6615.method_6725();
         String[] var10000 = class_752.method_4253();
         this.field_6616.method_9483();
         String[] var9 = var10000;
         var10 = this.field_6620;
         var11 = class_1715.method_9561(var1.field_3004.field_6910 + 0.5D);
         int var17 = this.field_6621;
         if(var9 != null) {
            label40: {
               if(this.field_6621) {
                  var17 = var1.method_3876();
                  if(var9 == null) {
                     break label40;
                  }

                  if(var17 != 0) {
                     var11 = (int)var1.field_3004.field_6910;
                     aji var12 = this.field_6614.getBlock(class_1715.method_9561(var1.field_2994), var11, class_1715.method_9561(var1.field_2996));

                     do {
                        aji var18;
                        label28: {
                           if(var12 != class_1192.field_6033) {
                              var18 = var12;
                              if(var9 == null || var9 == null) {
                                 break label28;
                              }

                              if(var12 != class_1192.field_6034) {
                                 break;
                              }
                           }

                           ++var11;
                           var18 = this.field_6614.getBlock(class_1715.method_9561(var1.field_2994), var11, class_1715.method_9561(var1.field_2996));
                        }

                        var12 = var18;
                     } while(var9 != null);

                     var10 = this.field_6620;
                     this.field_6620 = false;
                     if(var9 != null) {
                        break label42;
                     }
                  }
               }

               var17 = class_1715.method_9561(var1.field_3004.field_6910 + 0.5D);
            }
         }

         var11 = var17;
      }

      class_1288 var16 = this.method_6759(class_1715.method_9561(var1.field_3004.field_6909), var11, class_1715.method_9561(var1.field_3004.field_6911));
      class_1288 var13 = this.method_6759(class_1715.method_9561(var2 - (double)(var1.field_3014 / 2.0F)), class_1715.method_9561(var4), class_1715.method_9561(var6 - (double)(var1.field_3014 / 2.0F)));
      class_1288 var19 = new class_1288;
      var19.method_6733(class_1715.method_9559(var1.field_3014 + 1.0F), class_1715.method_9559(var1.field_3015 + 1.0F), class_1715.method_9559(var1.field_3014 + 1.0F));
      class_1288 var14 = var19;
      class_1289 var15 = this.method_6756(var1, var16, var13, var14, var8);
      this.field_6620 = var10;
      return var15;
   }

   // $FF: renamed from: b (sa, jJ, jJ, jJ, float) jK
   private class_1289 method_6756(class_689 var1, class_1288 var2, class_1288 var3, class_1288 var4, float var5) {
      var2.field_6604 = 0.0F;
      String[] var10000 = class_752.method_4253();
      var2.field_6605 = var2.method_6736(var3);
      var2.field_6606 = var2.field_6605;
      String[] var6 = var10000;
      this.field_6615.method_6725();
      this.field_6615.method_6724(var2);
      class_1288 var7 = var2;

      label81:
      while(true) {
         int var13 = this.field_6615.method_6730();

         class_1288 var14;
         class_1288 var10001;
         label78:
         while(var13 == 0) {
            class_1288 var8 = this.field_6615.method_6726();
            var14 = var8;
            var10001 = var3;
            if(var6 == null) {
               return var14 == var10001?null:this.method_6762(var2, var7);
            }

            var13 = var8.equals(var3);
            if(var6 != null) {
               if(var13 != 0) {
                  return this.method_6762(var2, var3);
               }

               float var15;
               var13 = (var15 = var8.method_6736(var3) - var7.method_6736(var3)) == 0.0F?0:(var15 < 0.0F?-1:1);
            }

            if(var6 != null) {
               if(var13 < 0) {
                  var7 = var8;
               }

               var8.field_6608 = true;
               var13 = this.method_6757(var1, var8, var4, var3, var5);
            }

            int var9 = var13;
            int var10 = 0;

            while(var10 < var9) {
               class_1288 var11 = this.field_6617[var10];
               float var12 = var8.field_6604 + var8.method_6736(var11);
               var13 = var11.method_6737();
               if(var6 == null) {
                  continue label78;
               }

               label88: {
                  if(var6 != null) {
                     label89: {
                        if(var13 != 0) {
                           float var16;
                           var13 = (var16 = var12 - var11.field_6604) == 0.0F?0:(var16 < 0.0F?-1:1);
                           if(var6 == null) {
                              break label89;
                           }

                           if(var13 >= 0) {
                              break label88;
                           }
                        }

                        var11.field_6607 = var8;
                        var11.field_6604 = var12;
                        var11.field_6605 = var11.method_6736(var3);
                        if(var6 == null) {
                           break label88;
                        }

                        var13 = var11.method_6737();
                     }
                  }

                  if(var13 != 0) {
                     this.field_6615.method_6727(var11, var11.field_6604 + var11.field_6605);
                     if(var6 != null) {
                        break label88;
                     }
                  }

                  var11.field_6606 = var11.field_6604 + var11.field_6605;
                  this.field_6615.method_6724(var11);
               }

               ++var10;
               if(var6 == null) {
                  break;
               }
            }

            if(var6 != null) {
               continue label81;
            }
            break;
         }

         var14 = var7;
         var10001 = var2;
         return var14 == var10001?null:this.method_6762(var2, var7);
      }
   }

   // $FF: renamed from: c (sa, jJ, jJ, jJ, float) int
   private int method_6757(class_689 var1, class_1288 var2, class_1288 var3, class_1288 var4, float var5) {
      int var7 = 0;
      String[] var10000 = class_752.method_4253();
      byte var8 = 0;
      String[] var6 = var10000;
      class_1290 var14 = this;
      class_689 var10001 = var1;
      int var10002 = var2.field_6599;
      int var10003 = var2.field_6600 + 1;
      int var10004 = var2.field_6601;
      class_1288 var10005 = var3;
      if(var6 != null) {
         if(this.method_6760(var1, var2.field_6599, var10003, var2.field_6601, var3) == 1) {
            var8 = 1;
         }

         var14 = this;
         var10001 = var1;
         var10002 = var2.field_6599;
         var10003 = var2.field_6600;
         var10004 = var2.field_6601 + 1;
         var10005 = var3;
      }

      class_1288 var9 = var14.method_6758(var10001, var10002, var10003, var10004, var10005, var8);
      class_1288 var10 = this.method_6758(var1, var2.field_6599 - 1, var2.field_6600, var2.field_6601, var3, var8);
      class_1288 var11 = this.method_6758(var1, var2.field_6599 + 1, var2.field_6600, var2.field_6601, var3, var8);
      class_1288 var12 = this.method_6758(var1, var2.field_6599, var2.field_6600, var2.field_6601 - 1, var3, var8);
      class_1288 var15 = var9;
      if(var6 != null) {
         label89: {
            if(var9 != null) {
               var15 = var9;
               if(var6 == null) {
                  break label89;
               }

               if(!var9.field_6608) {
                  var15 = var9;
                  if(var6 == null) {
                     break label89;
                  }

                  if(var9.method_6735(var4) < var5) {
                     this.field_6617[var7++] = var9;
                  }
               }
            }

            var15 = var10;
         }
      }

      if(var6 != null) {
         label79: {
            if(var15 != null) {
               var15 = var10;
               if(var6 == null) {
                  break label79;
               }

               if(!var10.field_6608) {
                  var15 = var10;
                  if(var6 == null) {
                     break label79;
                  }

                  if(var10.method_6735(var4) < var5) {
                     this.field_6617[var7++] = var10;
                  }
               }
            }

            var15 = var11;
         }
      }

      if(var6 != null) {
         label69: {
            if(var15 != null) {
               var15 = var11;
               if(var6 == null) {
                  break label69;
               }

               if(!var11.field_6608) {
                  var15 = var11;
                  if(var6 == null) {
                     break label69;
                  }

                  if(var11.method_6735(var4) < var5) {
                     this.field_6617[var7++] = var11;
                  }
               }
            }

            var15 = var12;
         }
      }

      int var13;
      label94: {
         if(var6 != null) {
            if(var15 == null) {
               break label94;
            }

            var15 = var12;
         }

         var13 = var15.field_6608;
         if(var6 == null) {
            return var13;
         }

         if(!var15.field_6608) {
            float var17;
            var13 = (var17 = var12.method_6735(var4) - var5) == 0.0F?0:(var17 < 0.0F?-1:1);
            if(var6 == null) {
               return var13;
            }

            if(var13 < 0) {
               this.field_6617[var7++] = var12;
            }
         }
      }

      var13 = var7;
      return var13;
   }

   // $FF: renamed from: b (sa, int, int, int, jJ, int) jJ
   private class_1288 method_6758(class_689 var1, int var2, int var3, int var4, class_1288 var5, int var6) {
      class_1288 var8 = null;
      String[] var10000 = class_752.method_4253();
      int var9 = this.method_6760(var1, var2, var3, var4, var5);
      String[] var7 = var10000;
      int var12 = var9;
      byte var10001 = 2;
      if(var7 != null) {
         if(var9 == 2) {
            return this.method_6759(var2, var3, var4);
         }

         var12 = var9;
         var10001 = 1;
      }

      if(var12 == var10001) {
         var8 = this.method_6759(var2, var3, var4);
      }

      class_1288 var13 = var8;
      int var14;
      if(var7 != null) {
         if(var8 == null) {
            label126: {
               var12 = var6;
               if(var7 != null) {
                  if(var6 <= 0) {
                     break label126;
                  }

                  var12 = var9;
               }

               var14 = -3;
               if(var7 != null) {
                  if(var12 == -3) {
                     break label126;
                  }

                  var12 = var9;
                  var14 = -4;
               }

               if(var7 != null) {
                  if(var12 == var14) {
                     break label126;
                  }

                  var12 = this.method_6760(var1, var2, var3 + var6, var4, var5);
                  var14 = 1;
               }

               if(var7 != null) {
                  if(var12 != var14) {
                     break label126;
                  }

                  var8 = this.method_6759(var2, var3 + var6, var4);
                  var12 = var3;
                  var14 = var6;
               }

               var3 = var12 + var14;
            }
         }

         var13 = var8;
      }

      if(var7 != null) {
         if(var13 != null) {
            int var10 = 0;
            int var11 = 0;

            while(true) {
               if(var3 > 0) {
                  label128: {
                     var11 = this.method_6760(var1, var2, var3 - 1, var4, var5);
                     var12 = this.field_6620;
                     if(var7 == null) {
                        break;
                     }

                     label86: {
                        if(var7 != null) {
                           if(this.field_6620) {
                              var12 = var11;
                              var14 = -1;
                              if(var7 == null) {
                                 break label86;
                              }

                              if(var11 == -1) {
                                 return null;
                              }
                           }

                           var12 = var11;
                        }

                        var14 = 1;
                     }

                     label129: {
                        label130: {
                           if(var7 != null) {
                              if(var12 != var14) {
                                 break label128;
                              }

                              var12 = var10++;
                              if(var7 == null) {
                                 break label130;
                              }

                              var14 = var1.method_3967();
                           }

                           if(var12 >= var14) {
                              return null;
                           }

                           --var3;
                           if(var7 == null) {
                              break label129;
                           }

                           var12 = var3;
                        }

                        if(var12 <= 0) {
                           continue;
                        }

                        var8 = this.method_6759(var2, var3, var4);
                     }

                     if(var7 != null) {
                        continue;
                     }
                  }
               }

               var12 = var11;
               break;
            }

            if(var12 == -2) {
               return null;
            }
         }

         var13 = var8;
      }

      return var13;
   }

   // $FF: renamed from: b (int, int, int) jJ
   private final class_1288 method_6759(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = class_1288.method_6734(var1, var2, var3);
      class_1288 var6 = (class_1288)this.field_6616.method_9475(var5);
      String[] var4 = var10000;
      class_1288 var7 = var6;
      if(var4 != null) {
         if(var6 == null) {
            var7 = new class_1288;
            var7.method_6733(var1, var2, var3);
            var6 = var7;
            this.field_6616.method_9478(var5, var6);
         }

         var7 = var6;
      }

      return var7;
   }

   // $FF: renamed from: b (sa, int, int, int, jJ) int
   public int method_6760(class_689 var1, int var2, int var3, int var4, class_1288 var5) {
      return method_6761(var1, var2, var3, var4, var5, this.field_6620, this.field_6619, this.field_6618);
   }

   // $FF: renamed from: b (sa, int, int, int, jJ, boolean, boolean, boolean) int
   public static int method_6761(class_689 var0, int var1, int var2, int var3, class_1288 var4, boolean var5, boolean var6, boolean var7) {
      byte var9 = 0;
      String[] var8 = class_752.method_4253();
      int var10 = var1;

      label210:
      while(true) {
         int var10000 = var10;

         label207:
         while(true) {
            if(var10000 < var1 + var4.field_6599) {
               var10000 = var2;
               if(var8 == null) {
                  break;
               }

               int var11 = var2;

               while(var11 < var2 + var4.field_6600) {
                  var10000 = var3;
                  if(var8 == null) {
                     continue label207;
                  }

                  int var12 = var3;

                  while(true) {
                     if(var12 < var3 + var4.field_6601) {
                        aji var13 = var0.field_2990.getBlock(var10, var11, var12);
                        if(var8 == null) {
                           break;
                        }

                        label189: {
                           label225: {
                              aji var19 = var13;
                              if(var8 != null) {
                                 if(var13.method_2424() == awt.field_4170) {
                                    break label225;
                                 }

                                 var19 = var13;
                              }

                              label132: {
                                 label131: {
                                    label217: {
                                       if(var8 != null) {
                                          if(var19 == class_1192.field_6121) {
                                             var9 = 1;
                                             if(var8 != null) {
                                                break label217;
                                             }
                                          }

                                          var19 = var13;
                                       }

                                       label218: {
                                          label122: {
                                             Object var10001 = class_1192.field_6033;
                                             if(var8 != null) {
                                                if(var19 == class_1192.field_6033) {
                                                   break label122;
                                                }

                                                var19 = var13;
                                                var10001 = class_1192.field_6034;
                                             }

                                             if(var19 != var10001) {
                                                break label218;
                                             }
                                          }

                                          byte var20 = var5;
                                          if(var8 != null) {
                                             if(var5 != 0) {
                                                return -1;
                                             }

                                             var20 = 1;
                                          }

                                          var9 = var20;
                                          if(var8 != null) {
                                             break label217;
                                          }
                                       }

                                       var10000 = var7;
                                       if(var8 == null) {
                                          break label132;
                                       }

                                       if(var7 == 0) {
                                          var19 = var13;
                                          if(var8 == null) {
                                             break label131;
                                          }

                                          if(var13 == class_1192.field_6090) {
                                             return 0;
                                          }
                                       }
                                    }

                                    var19 = var13;
                                 }

                                 var10000 = var19.method_2436();
                              }

                              int var14 = var10000;
                              var10000 = var0.field_2990.getBlock(var10, var11, var12).method_2436();
                              if(var8 != null) {
                                 if(var10000 == 9) {
                                    int var18 = class_1715.method_9561(var0.field_2994);
                                    int var16 = class_1715.method_9561(var0.field_2995);
                                    int var17 = class_1715.method_9561(var0.field_2996);
                                    if(var8 == null) {
                                       break label189;
                                    }

                                    if(var0.field_2990.getBlock(var18, var16, var17).method_2436() != 9) {
                                       var10000 = var0.field_2990.getBlock(var18, var16 - 1, var17).method_2436();
                                       if(var8 != null) {
                                          if(var10000 == 9 && var8 != null) {
                                             break label225;
                                          }

                                          var10000 = -3;
                                       }

                                       return var10000;
                                    }
                                    break label225;
                                 }

                                 var10000 = var13.method_2435(var0.field_2990, var10, var11, var12);
                              }

                              if(var8 != null) {
                                 if(var10000 != 0) {
                                    break label225;
                                 }

                                 var10000 = var6;
                              }

                              if(var8 != null) {
                                 if(var10000 != 0 && var13 == class_1192.field_6090) {
                                    break label225;
                                 }

                                 var10000 = var14;
                              }

                              if(var8 != null) {
                                 if(var10000 != 11 && var13 != class_1192.field_6132) {
                                    var10000 = var14;
                                    if(var8 == null) {
                                       return var10000;
                                    }

                                    if(var14 != 32) {
                                       var19 = var13;
                                       if(var8 != null) {
                                          if(var13 == class_1192.field_6121) {
                                             return -4;
                                          }

                                          var19 = var13;
                                       }

                                       awt var15 = var19.method_2424();
                                       if(var15 != awt.field_4178) {
                                          return 0;
                                       }

                                       byte var21 = var0.method_3881();
                                       if(var8 != null) {
                                          if(var21 != 0) {
                                             break label225;
                                          }

                                          var21 = -2;
                                       }

                                       return var21;
                                    }
                                 }

                                 var10000 = -3;
                              }

                              return var10000;
                           }

                           ++var12;
                        }

                        if(var8 != null) {
                           continue;
                        }
                     }

                     ++var11;
                     break;
                  }

                  if(var8 == null) {
                     break;
                  }
               }

               ++var10;
               if(var8 != null) {
                  continue label210;
               }
            }

            var10000 = var9;
            break;
         }

         if(var8 != null) {
            var10000 = var10000 != 0?2:1;
         }

         return var10000;
      }
   }

   // $FF: renamed from: b (jJ, jJ) jK
   private class_1289 method_6762(class_1288 var1, class_1288 var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 1;
      String[] var3 = var10000;
      class_1288 var5 = var2;

      while(var5.field_6607 != null) {
         ++var4;
         var5 = var5.field_6607;
         if(var3 == null) {
            break;
         }
      }

      class_1288[] var6 = new class_1288[var4];
      var5 = var2;
      --var4;
      var6[var4] = var2;

      while(var5.field_6607 != null) {
         var5 = var5.field_6607;
         --var4;
         var6[var4] = var5;
         if(var3 == null) {
            break;
         }
      }

      class_1289 var7 = new class_1289;
      var7.method_6739(var6);
      return var7;
   }
}

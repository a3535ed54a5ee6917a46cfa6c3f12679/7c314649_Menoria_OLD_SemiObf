
// $FF: renamed from: js
public class class_1273 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6693(long var1, class_1265 var3) {
      super.method_6675(var1);
      this.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int[] var6 = this.field_6573.method_6679(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var7 = class_1323.method_6956(var3 * var4);
      int var8 = 0;
      String[] var5 = var10000;

      do {
         int var15 = var8;

         label253:
         while(true) {
            if(var15 >= var4) {
               return var7;
            }

            int var9 = 0;

            while(true) {
               if(var9 >= var3) {
                  break label253;
               }

               this.method_6677((long)(var9 + var1), (long)(var8 + var2));
               int var10 = var6[var9 + 1 + (var8 + 1) * (var3 + 2)];
               var15 = this.method_6694(var6, var7, var9, var8, var3, var10, class_985.field_4991.field_5050, class_985.field_5008.field_5050);
               if(var5 == null) {
                  break;
               }

               label263: {
                  if(var5 != null) {
                     if(var15 != 0) {
                        break label263;
                     }

                     var15 = this.method_6695(var6, var7, var9, var8, var3, var10, class_985.field_5026.field_5050, class_985.field_5025.field_5050);
                  }

                  if(var5 != null) {
                     if(var15 != 0) {
                        break label263;
                     }

                     var15 = this.method_6695(var6, var7, var9, var8, var3, var10, class_985.field_5027.field_5050, class_985.field_5025.field_5050);
                  }

                  if(var5 != null) {
                     if(var15 != 0) {
                        break label263;
                     }

                     var15 = this.method_6695(var6, var7, var9, var8, var3, var10, class_985.field_5020.field_5050, class_985.field_4993.field_5050);
                  }

                  if(var5 != null) {
                     if(var15 != 0) {
                        break label263;
                     }

                     var15 = var10;
                  }

                  label264: {
                     int var11;
                     int var12;
                     int var13;
                     int var14;
                     int var10001;
                     label265: {
                        var10001 = class_985.field_4990.field_5050;
                        if(var5 != null) {
                           if(var15 == class_985.field_4990.field_5050) {
                              label211: {
                                 label210: {
                                    var11 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
                                    var12 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
                                    var13 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
                                    var14 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
                                    if(var5 != null) {
                                       if(var11 != class_985.field_5000.field_5050) {
                                          label267: {
                                             var15 = var12;
                                             var10001 = class_985.field_5000.field_5050;
                                             if(var5 != null) {
                                                if(var12 == class_985.field_5000.field_5050) {
                                                   break label267;
                                                }

                                                var15 = var13;
                                                var10001 = class_985.field_5000.field_5050;
                                             }

                                             if(var5 != null) {
                                                if(var15 == var10001) {
                                                   break label267;
                                                }

                                                var15 = var14;
                                                var10001 = class_985.field_5000.field_5050;
                                             }

                                             if(var15 != var10001) {
                                                break label210;
                                             }
                                          }
                                       }

                                       var7[var9 + var8 * var3] = class_985.field_5022.field_5050;
                                    }

                                    if(var5 != null) {
                                       break label211;
                                    }
                                 }

                                 var7[var9 + var8 * var3] = var10;
                              }

                              if(var5 != null) {
                                 break label263;
                              }
                           }

                           var15 = var10;
                           if(var5 == null) {
                              break label265;
                           }

                           var10001 = class_985.field_4994.field_5050;
                        }

                        if(var15 != var10001) {
                           break label264;
                        }

                        var15 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
                     }

                     label268: {
                        label191: {
                           label190: {
                              var11 = var15;
                              var12 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
                              var13 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
                              var14 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
                              if(var5 != null) {
                                 if(var11 != class_985.field_4990.field_5050) {
                                    label269: {
                                       var15 = var12;
                                       var10001 = class_985.field_4990.field_5050;
                                       if(var5 != null) {
                                          if(var12 == class_985.field_4990.field_5050) {
                                             break label269;
                                          }

                                          var15 = var13;
                                          var10001 = class_985.field_4990.field_5050;
                                       }

                                       if(var5 != null) {
                                          if(var15 == var10001) {
                                             break label269;
                                          }

                                          var15 = var14;
                                          var10001 = class_985.field_4990.field_5050;
                                       }

                                       if(var5 != null) {
                                          if(var15 == var10001) {
                                             break label269;
                                          }

                                          var15 = var11;
                                          var10001 = class_985.field_5018.field_5050;
                                       }

                                       if(var5 != null) {
                                          if(var15 == var10001) {
                                             break label269;
                                          }

                                          var15 = var12;
                                          var10001 = class_985.field_5018.field_5050;
                                       }

                                       if(var5 != null) {
                                          if(var15 == var10001) {
                                             break label269;
                                          }

                                          var15 = var13;
                                          var10001 = class_985.field_5018.field_5050;
                                       }

                                       if(var5 != null) {
                                          if(var15 == var10001) {
                                             break label269;
                                          }

                                          var15 = var14;
                                          var10001 = class_985.field_5018.field_5050;
                                       }

                                       if(var5 != null) {
                                          if(var15 == var10001) {
                                             break label269;
                                          }

                                          var15 = var11;
                                          var10001 = class_985.field_5000.field_5050;
                                       }

                                       if(var5 != null) {
                                          if(var15 == var10001) {
                                             break label269;
                                          }

                                          var15 = var12;
                                          var10001 = class_985.field_5000.field_5050;
                                       }

                                       if(var5 != null) {
                                          if(var15 == var10001) {
                                             break label269;
                                          }

                                          var15 = var13;
                                          var10001 = class_985.field_5000.field_5050;
                                       }

                                       if(var5 != null) {
                                          if(var15 == var10001) {
                                             break label269;
                                          }

                                          var15 = var14;
                                          var10001 = class_985.field_5000.field_5050;
                                       }

                                       if(var5 == null) {
                                          break label191;
                                       }

                                       if(var15 != var10001) {
                                          break label190;
                                       }
                                    }
                                 }

                                 var7[var9 + var8 * var3] = class_985.field_4989.field_5050;
                              }

                              if(var5 != null) {
                                 break label268;
                              }
                           }

                           var15 = var11;
                           var10001 = class_985.field_5009.field_5050;
                        }

                        label128: {
                           label270: {
                              if(var5 != null) {
                                 if(var15 == var10001) {
                                    break label270;
                                 }

                                 var15 = var14;
                                 var10001 = class_985.field_5009.field_5050;
                              }

                              if(var5 != null) {
                                 if(var15 == var10001) {
                                    break label270;
                                 }

                                 var15 = var12;
                                 var10001 = class_985.field_5009.field_5050;
                              }

                              if(var5 != null) {
                                 if(var15 == var10001) {
                                    break label270;
                                 }

                                 var15 = var13;
                                 var10001 = class_985.field_5009.field_5050;
                              }

                              if(var15 != var10001) {
                                 break label128;
                              }
                           }

                           var7[var9 + var8 * var3] = class_985.field_5011.field_5050;
                           if(var5 != null) {
                              break label268;
                           }
                        }

                        var7[var9 + var8 * var3] = var10;
                     }

                     if(var5 != null) {
                        break label263;
                     }
                  }

                  var7[var9 + var8 * var3] = var10;
               }

               ++var9;
               if(var5 == null) {
                  break label253;
               }
            }
         }

         ++var8;
      } while(var5 != null);

      return var7;
   }

   // $FF: renamed from: b (int[], int[], int, int, int, int, int, int) boolean
   private boolean method_6694(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      String[] var9 = class_752.method_4253();
      boolean var10000 = method_6680(var6, var7);
      if(var9 != null) {
         if(var10000) {
            label38: {
               int var10 = var1[var3 + 1 + (var4 + 1 - 1) * (var5 + 2)];
               int var11 = var1[var3 + 1 + 1 + (var4 + 1) * (var5 + 2)];
               int var12 = var1[var3 + 1 - 1 + (var4 + 1) * (var5 + 2)];
               int var13 = var1[var3 + 1 + (var4 + 1 + 1) * (var5 + 2)];
               if(var9 != null) {
                  if(this.method_6696(var10, var7)) {
                     label45: {
                        var10000 = this.method_6696(var11, var7);
                        if(var9 != null) {
                           if(!var10000) {
                              break label45;
                           }

                           var10000 = this.method_6696(var12, var7);
                        }

                        if(var9 != null) {
                           if(!var10000) {
                              break label45;
                           }

                           var10000 = this.method_6696(var13, var7);
                        }

                        if(var10000) {
                           break label38;
                        }
                     }
                  }

                  var2[var3 + var4 * var5] = var8;
               }

               if(var9 != null) {
                  return true;
               }
            }

            var2[var3 + var4 * var5] = var6;
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: c (int[], int[], int, int, int, int, int, int) boolean
   private boolean method_6695(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      String[] var9 = class_752.method_4253();
      int var10000 = var6;
      if(var9 != null) {
         if(var6 == var7) {
            label38: {
               int var10 = var1[var3 + 1 + (var4 + 1 - 1) * (var5 + 2)];
               int var11 = var1[var3 + 1 + 1 + (var4 + 1) * (var5 + 2)];
               int var12 = var1[var3 + 1 - 1 + (var4 + 1) * (var5 + 2)];
               int var13 = var1[var3 + 1 + (var4 + 1 + 1) * (var5 + 2)];
               if(var9 != null) {
                  if(method_6680(var10, var7)) {
                     label45: {
                        boolean var14 = method_6680(var11, var7);
                        if(var9 != null) {
                           if(!var14) {
                              break label45;
                           }

                           var14 = method_6680(var12, var7);
                        }

                        if(var9 != null) {
                           if(!var14) {
                              break label45;
                           }

                           var14 = method_6680(var13, var7);
                        }

                        if(var14) {
                           break label38;
                        }
                     }
                  }

                  var2[var3 + var4 * var5] = var8;
               }

               if(var9 != null) {
                  return true;
               }
            }

            var2[var3 + var4 * var5] = var6;
            return true;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (int, int) boolean
   private boolean method_6696(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = method_6680(var1, var2);
      if(var3 != null) {
         if(var10000 != 0) {
            return true;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(class_985.method_5725(var10000) != null) {
            var10000 = var2;
            if(var3 == null) {
               return (boolean)var10000;
            }

            if(class_985.method_5725(var2) != null) {
               boolean var7;
               label51: {
                  class_96 var4 = class_985.method_5725(var1).method_5723();
                  class_96 var5 = class_985.method_5725(var2).method_5723();
                  class_96 var6 = var4;
                  class_96 var10001 = var5;
                  if(var3 != null) {
                     if(var4 == var5) {
                        break label51;
                     }

                     var6 = var4;
                     var10001 = class_96.field_60;
                  }

                  if(var3 != null) {
                     if(var6 == var10001) {
                        break label51;
                     }

                     var6 = var5;
                     var10001 = class_96.field_60;
                  }

                  if(var6 != var10001) {
                     var7 = false;
                     return var7;
                  }
               }

               var7 = true;
               return var7;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }
}


// $FF: renamed from: jB
public class class_1283 extends class_1265 {

   // $FF: renamed from: f java.lang.String
   private static final String field_6587 = "CL_00000568";


   // $FF: renamed from: <init> (long, jm) void
   public void method_6709(long var1, class_1265 var3) {
      super.method_6675(var1);
      this.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      int[] var6 = this.field_6573.method_6679(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      String[] var10000 = class_752.method_4253();
      int[] var7 = class_1323.method_6956(var3 * var4);
      String[] var5 = var10000;
      int var8 = 0;

      do {
         int var16 = var8;
         int var10001 = var4;

         label324:
         while(true) {
            if(var16 >= var10001) {
               return var7;
            }

            int var9 = 0;

            while(true) {
               if(var9 >= var3) {
                  break label324;
               }

               label334: {
                  int var10;
                  class_985 var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  label335: {
                     this.method_6677((long)(var9 + var1), (long)(var8 + var2));
                     var10 = var6[var9 + 1 + (var8 + 1) * (var3 + 2)];
                     var11 = class_985.method_5725(var10);
                     var16 = var10;
                     if(var5 != null) {
                        var10001 = class_985.field_5002.field_5050;
                        if(var5 == null) {
                           break;
                        }

                        if(var10 != class_985.field_5002.field_5050) {
                           break label335;
                        }

                        var16 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
                     }

                     var12 = var16;
                     var13 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
                     var14 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
                     var15 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
                     if(var5 != null) {
                        if(var12 != class_985.field_4988.field_5050) {
                           label337: {
                              var16 = var13;
                              var10001 = class_985.field_4988.field_5050;
                              if(var5 != null) {
                                 if(var13 == class_985.field_4988.field_5050) {
                                    break label337;
                                 }

                                 var16 = var14;
                                 var10001 = class_985.field_4988.field_5050;
                              }

                              if(var5 != null) {
                                 if(var16 == var10001) {
                                    break label337;
                                 }

                                 var16 = var15;
                                 var10001 = class_985.field_4988.field_5050;
                              }

                              if(var16 != var10001) {
                                 var7[var9 + var8 * var3] = var10;
                                 if(var5 != null) {
                                    break label334;
                                 }
                              }
                           }
                        }

                        var7[var9 + var8 * var3] = class_985.field_5003.field_5050;
                     }

                     if(var5 != null) {
                        break label334;
                     }
                  }

                  class_985 var17;
                  boolean var18;
                  label293: {
                     var17 = var11;
                     if(var5 != null) {
                        if(var11 == null) {
                           break label293;
                        }

                        var17 = var11;
                     }

                     if(var17.method_5721() == class_1000.class) {
                        var12 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
                        var13 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
                        var14 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
                        var15 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
                        if(var5 != null) {
                           if(this.method_6711(var12)) {
                              label338: {
                                 var18 = this.method_6711(var13);
                                 if(var5 != null) {
                                    if(!var18) {
                                       break label338;
                                    }

                                    var18 = this.method_6711(var14);
                                 }

                                 if(var5 != null) {
                                    if(!var18) {
                                       break label338;
                                    }

                                    var18 = this.method_6711(var15);
                                 }

                                 if(var5 != null) {
                                    if(!var18) {
                                       break label338;
                                    }

                                    var18 = method_6681(var12);
                                 }

                                 label339: {
                                    if(var5 != null) {
                                       if(var18) {
                                          break label339;
                                       }

                                       var18 = method_6681(var13);
                                    }

                                    if(var5 != null) {
                                       if(var18) {
                                          break label339;
                                       }

                                       var18 = method_6681(var14);
                                    }

                                    if(var5 != null) {
                                       if(var18) {
                                          break label339;
                                       }

                                       var18 = method_6681(var15);
                                    }

                                    if(!var18) {
                                       var7[var9 + var8 * var3] = var10;
                                       if(var5 != null) {
                                          break label334;
                                       }
                                    }
                                 }

                                 var7[var9 + var8 * var3] = class_985.field_5004.field_5050;
                                 if(var5 != null) {
                                    break label334;
                                 }
                              }
                           }

                           var7[var9 + var8 * var3] = class_985.field_5011.field_5050;
                        }

                        if(var5 != null) {
                           break label334;
                        }
                     }
                  }

                  label340: {
                     var16 = var10;
                     var10001 = class_985.field_4991.field_5050;
                     if(var5 != null) {
                        if(var10 == class_985.field_4991.field_5050) {
                           break label340;
                        }

                        var16 = var10;
                        var10001 = class_985.field_5022.field_5050;
                     }

                     if(var5 != null) {
                        if(var16 == var10001) {
                           break label340;
                        }

                        var16 = var10;
                        var10001 = class_985.field_5008.field_5050;
                     }

                     if(var16 != var10001) {
                        label234: {
                           label342: {
                              var17 = var11;
                              if(var5 != null) {
                                 if(var11 == null) {
                                    break label342;
                                 }

                                 var17 = var11;
                              }

                              var16 = var17.method_5717();
                              if(var5 == null) {
                                 break label234;
                              }

                              if(var16 != 0) {
                                 this.method_6710(var6, var7, var9, var8, var3, var10, class_985.field_5014.field_5050);
                                 if(var5 != null) {
                                    break label334;
                                 }
                              }
                           }

                           var16 = var10;
                        }

                        if(var5 != null) {
                           label223: {
                              if(var16 != class_985.field_5025.field_5050) {
                                 var16 = var10;
                                 if(var5 == null) {
                                    break label223;
                                 }

                                 if(var10 != class_985.field_5026.field_5050) {
                                    label343: {
                                       var16 = var10;
                                       var10001 = class_985.field_4988.field_5050;
                                       if(var5 != null) {
                                          if(var10 == class_985.field_4988.field_5050) {
                                             break label343;
                                          }

                                          var16 = var10;
                                          var10001 = class_985.field_5012.field_5050;
                                       }

                                       if(var5 != null) {
                                          if(var16 == var10001) {
                                             break label343;
                                          }

                                          var16 = var10;
                                          var10001 = class_985.field_4995.field_5050;
                                       }

                                       label344: {
                                          if(var5 != null) {
                                             if(var16 == var10001) {
                                                break label343;
                                             }

                                             var16 = var10;
                                             if(var5 == null) {
                                                break label344;
                                             }

                                             var10001 = class_985.field_4994.field_5050;
                                          }

                                          if(var16 == var10001) {
                                             break label343;
                                          }

                                          var16 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
                                       }

                                       var12 = var16;
                                       var13 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
                                       var14 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
                                       var15 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
                                       if(var5 != null) {
                                          if(!method_6681(var12)) {
                                             label346: {
                                                var18 = method_6681(var13);
                                                if(var5 != null) {
                                                   if(var18) {
                                                      break label346;
                                                   }

                                                   var18 = method_6681(var14);
                                                }

                                                if(var5 != null) {
                                                   if(var18) {
                                                      break label346;
                                                   }

                                                   var18 = method_6681(var15);
                                                }

                                                if(!var18) {
                                                   var7[var9 + var8 * var3] = var10;
                                                   if(var5 != null) {
                                                      break label334;
                                                   }
                                                }
                                             }
                                          }

                                          var7[var9 + var8 * var3] = class_985.field_5004.field_5050;
                                       }

                                       if(var5 != null) {
                                          break label334;
                                       }
                                    }

                                    var7[var9 + var8 * var3] = var10;
                                    if(var5 != null) {
                                       break label334;
                                    }
                                 }
                              }

                              var16 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
                           }
                        }

                        var12 = var16;
                        var13 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
                        var14 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
                        var15 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
                        if(var5 != null) {
                           if(!method_6681(var12)) {
                              label347: {
                                 var18 = method_6681(var13);
                                 if(var5 != null) {
                                    if(var18) {
                                       break label347;
                                    }

                                    var18 = method_6681(var14);
                                 }

                                 if(var5 != null) {
                                    if(var18) {
                                       break label347;
                                    }

                                    var18 = method_6681(var15);
                                 }

                                 if(var5 != null) {
                                    if(var18) {
                                       break label347;
                                    }

                                    var18 = this.method_6712(var12);
                                 }

                                 label348: {
                                    if(var5 != null) {
                                       if(!var18) {
                                          break label348;
                                       }

                                       var18 = this.method_6712(var13);
                                    }

                                    if(var5 != null) {
                                       if(!var18) {
                                          break label348;
                                       }

                                       var18 = this.method_6712(var14);
                                    }

                                    if(var5 != null) {
                                       if(!var18) {
                                          break label348;
                                       }

                                       var18 = this.method_6712(var15);
                                    }

                                    if(var18) {
                                       var7[var9 + var8 * var3] = var10;
                                       if(var5 != null) {
                                          break label334;
                                       }
                                    }
                                 }

                                 var7[var9 + var8 * var3] = class_985.field_4990.field_5050;
                                 if(var5 != null) {
                                    break label334;
                                 }
                              }
                           }

                           var7[var9 + var8 * var3] = var10;
                        }

                        if(var5 != null) {
                           break label334;
                        }
                     }
                  }

                  this.method_6710(var6, var7, var9, var8, var3, var10, class_985.field_5013.field_5050);
               }

               ++var9;
               if(var5 == null) {
                  break label324;
               }
            }
         }

         ++var8;
      } while(var5 != null);

      return var7;
   }

   // $FF: renamed from: b (int[], int[], int, int, int, int, int) void
   private void method_6710(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7) {
      String[] var8 = class_752.method_4253();
      int var10000 = method_6681(var6);
      if(var8 != null) {
         if(var10000 != 0) {
            var2[var3 + var4 * var5] = var6;
            if(var8 != null) {
               return;
            }
         }

         var10000 = var1[var3 + 1 + (var4 + 1 - 1) * (var5 + 2)];
      }

      label48: {
         int var9 = var10000;
         int var10 = var1[var3 + 1 + 1 + (var4 + 1) * (var5 + 2)];
         int var11 = var1[var3 + 1 - 1 + (var4 + 1) * (var5 + 2)];
         int var12 = var1[var3 + 1 + (var4 + 1 + 1) * (var5 + 2)];
         boolean var13 = method_6681(var9);
         if(var8 != null) {
            if(var13) {
               break label48;
            }

            var13 = method_6681(var10);
         }

         if(var8 != null) {
            if(var13) {
               break label48;
            }

            var13 = method_6681(var11);
         }

         if(var8 != null) {
            if(var13) {
               break label48;
            }

            var13 = method_6681(var12);
         }

         if(!var13) {
            var2[var3 + var4 * var5] = var6;
            if(var8 != null) {
               return;
            }
         }
      }

      var2[var3 + var4 * var5] = var7;
   }

   // $FF: renamed from: a (int) boolean
   private boolean method_6711(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         label51: {
            if(class_985.method_5725(var1) != null) {
               var10000 = var1;
               if(var2 == null) {
                  break label51;
               }

               if(class_985.method_5725(var1).method_5721() == class_1000.class) {
                  var10000 = 1;
                  return (boolean)var10000;
               }
            }

            var10000 = var1;
         }
      }

      if(var2 != null) {
         if(var10000 != class_985.field_5011.field_5050) {
            var10000 = var1;
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(var1 != class_985.field_5009.field_5050) {
               var10000 = var1;
               if(var2 == null) {
                  return (boolean)var10000;
               }

               if(var1 != class_985.field_5010.field_5050) {
                  var10000 = var1;
                  if(var2 == null) {
                     return (boolean)var10000;
                  }

                  if(var1 != class_985.field_4992.field_5050) {
                     var10000 = var1;
                     if(var2 == null) {
                        return (boolean)var10000;
                     }

                     if(var1 != class_985.field_4993.field_5050) {
                        var10000 = method_6681(var1);
                        if(var2 == null) {
                           return (boolean)var10000;
                        }

                        if(var10000 == 0) {
                           var10000 = 0;
                           return (boolean)var10000;
                        }
                     }
                  }
               }
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: e (int) boolean
   private boolean method_6712(int var1) {
      boolean var3;
      label24: {
         String[] var2 = class_752.method_4253();
         class_985 var10000 = class_985.method_5725(var1);
         if(var2 != null) {
            if(var10000 == null) {
               break label24;
            }

            var10000 = class_985.method_5725(var1);
         }

         var3 = var10000 instanceof class_999;
         if(var2 == null) {
            return var3;
         }

         if(var3) {
            var3 = true;
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6685() {
      boolean var10000 = true;
      char[] var10003 = "l¬°Çn{Å¸".toCharArray();
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
            field_6587 = (new String((char[])var4)).intern();
            String var2 = field_6587;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 198;
            break;
         case 1:
            var10009 = 167;
            break;
         case 2:
            var10009 = 26;
            break;
         case 3:
            var10009 = 105;
            break;
         case 4:
            var10009 = 87;
            break;
         case 5:
            var10009 = 30;
            break;
         default:
            var10009 = 183;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

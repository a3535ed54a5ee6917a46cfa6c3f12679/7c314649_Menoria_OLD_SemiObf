import java.util.Random;

// $FF: renamed from: hD
public class class_1188 extends class_1151 {

   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6349();
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();

      int var10000;
      byte var10001;
      while(true) {
         if(var1.method_34(var3, var4, var5)) {
            var10000 = var4;
            var10001 = 2;
            if(var6 == null) {
               break;
            }

            if(var4 > 2) {
               --var4;
               if(var6 != null) {
                  continue;
               }
            }
         }

         if(var1.getBlock(var3, var4, var5) != class_1192.field_6106) {
            return false;
         }

         var4 += var2.nextInt(4);
         var10000 = var2.nextInt(4);
         var10001 = 7;
         break;
      }

      int var7 = var10000 + var10001;
      int var8 = var7 / 4 + var2.nextInt(2);
      var10000 = var8;
      if(var6 != null) {
         label328: {
            if(var8 > 1) {
               var10000 = var2.nextInt(60);
               if(var6 == null) {
                  break label328;
               }

               if(var10000 == 0) {
                  var4 += 10 + var2.nextInt(30);
               }
            }

            var10000 = 0;
         }
      }

      int var9 = var10000;

      int var11;
      int var12;
      aji var20;
      aji var22;
      label321:
      while(true) {
         var10000 = var9;

         label318:
         while(var10000 < var7) {
            float var10 = (1.0F - (float)var9 / (float)var7) * (float)var8;
            var11 = class_1715.method_9566(var10);
            var10000 = -var11;
            if(var6 == null) {
               break label321;
            }

            var12 = var10000;

            label315:
            do {
               var10000 = var12;

               label312:
               while(true) {
                  if(var10000 > var11) {
                     break label315;
                  }

                  float var13 = (float)class_1715.method_9565(var12) - 0.25F;
                  var10000 = -var11;
                  if(var6 == null) {
                     continue label318;
                  }

                  int var14 = var10000;

                  while(true) {
                     if(var14 > var11) {
                        break label312;
                     }

                     float var15 = (float)class_1715.method_9565(var14) - 0.25F;
                     var10000 = var12;
                     if(var6 == null) {
                        break;
                     }

                     label348: {
                        label306: {
                           label349: {
                              if(var6 != null) {
                                 if(var12 == 0) {
                                    var10000 = var14;
                                    if(var6 == null) {
                                       break label306;
                                    }

                                    if(var14 == 0) {
                                       break label349;
                                    }
                                 }

                                 float var23;
                                 var10000 = (var23 = var13 * var13 + var15 * var15 - var10 * var10) == 0.0F?0:(var23 < 0.0F?-1:1);
                              }

                              if(var6 == null) {
                                 break label306;
                              }

                              if(var10000 > 0 && var6 != null) {
                                 break label348;
                              }
                           }

                           var10000 = var12;
                        }

                        label290: {
                           if(var6 != null) {
                              label288: {
                                 if(var10000 != -var11) {
                                    var10000 = var12;
                                    if(var6 == null) {
                                       break label288;
                                    }

                                    if(var12 != var11) {
                                       var10000 = var14;
                                       if(var6 == null) {
                                          break label288;
                                       }

                                       if(var14 != -var11) {
                                          var10000 = var14;
                                          if(var6 == null) {
                                             break label288;
                                          }

                                          if(var14 != var11) {
                                             break label290;
                                          }
                                       }
                                    }
                                 }

                                 float var24;
                                 var10000 = (var24 = var2.nextFloat() - 0.75F) == 0.0F?0:(var24 < 0.0F?-1:1);
                              }
                           }

                           if(var10000 > 0 && var6 != null) {
                              break label348;
                           }
                        }

                        aji var16;
                        label271: {
                           label350: {
                              var16 = var1.getBlock(var3 + var12, var4 + var9, var5 + var14);
                              var22 = var16;
                              if(var6 != null) {
                                 if(var16.method_2424() == awt.field_4170) {
                                    break label350;
                                 }

                                 var22 = var16;
                              }

                              var20 = class_1192.field_6028;
                              if(var6 != null) {
                                 if(var22 == class_1192.field_6028) {
                                    break label350;
                                 }

                                 var22 = var16;
                                 var20 = class_1192.field_6106;
                              }

                              if(var6 != null) {
                                 if(var22 == var20) {
                                    break label350;
                                 }

                                 var22 = var16;
                                 var20 = class_1192.field_6105;
                              }

                              if(var22 != var20) {
                                 break label271;
                              }
                           }

                           this.method_6353(var1, var3 + var12, var4 + var9, var5 + var14, class_1192.field_6188);
                        }

                        var10000 = var9;
                        if(var6 != null) {
                           if(var9 == 0) {
                              break label348;
                           }

                           var10000 = var11;
                        }

                        if(var10000 > 1) {
                           label247: {
                              label351: {
                                 var16 = var1.getBlock(var3 + var12, var4 - var9, var5 + var14);
                                 var22 = var16;
                                 if(var6 != null) {
                                    if(var16.method_2424() == awt.field_4170) {
                                       break label351;
                                    }

                                    var22 = var16;
                                 }

                                 var20 = class_1192.field_6028;
                                 if(var6 != null) {
                                    if(var22 == class_1192.field_6028) {
                                       break label351;
                                    }

                                    var22 = var16;
                                    var20 = class_1192.field_6106;
                                 }

                                 if(var6 != null) {
                                    if(var22 == var20) {
                                       break label351;
                                    }

                                    var22 = var16;
                                    var20 = class_1192.field_6105;
                                 }

                                 if(var22 != var20) {
                                    break label247;
                                 }
                              }

                              this.method_6353(var1, var3 + var12, var4 - var9, var5 + var14, class_1192.field_6188);
                           }
                        }
                     }

                     ++var14;
                     if(var6 == null) {
                        break label312;
                     }
                  }
               }

               ++var12;
            } while(var6 != null);

            ++var9;
            if(var6 != null) {
               continue label321;
            }
            break;
         }

         var9 = var8 - 1;
         var10000 = var9;
         break;
      }

      label209: {
         label352: {
            if(var6 != null) {
               if(var10000 < 0) {
                  var9 = 0;
                  if(var6 != null) {
                     break label352;
                  }
               }

               var10000 = var9;
            }

            if(var6 == null) {
               break label209;
            }

            if(var10000 > 1) {
               var9 = 1;
            }
         }

         var10000 = -var9;
      }

      int var17 = var10000;

      label197:
      while(true) {
         var10000 = var17;
         int var21 = var9;

         label194:
         while(var10000 <= var21) {
            var10000 = -var9;
            if(var6 == null) {
               return (boolean)var10000;
            }

            var11 = var10000;

            while(var11 <= var9) {
               var12 = var4 - 1;
               int var18 = 50;
               var10000 = Math.abs(var17);
               var21 = 1;
               if(var6 == null) {
                  continue label194;
               }

               label356: {
                  if(var6 != null) {
                     if(var10000 == 1) {
                        var10000 = Math.abs(var11);
                        var21 = 1;
                        if(var6 != null) {
                           if(var10000 == 1) {
                              var18 = var2.nextInt(5);
                           }

                           var10000 = var12;
                           var21 = 50;
                        }
                     } else {
                        var10000 = var12;
                        var21 = 50;
                     }
                  }

                  while(var10000 > var21) {
                     aji var19 = var1.getBlock(var3 + var17, var12, var5 + var11);
                     if(var6 == null) {
                        break label356;
                     }

                     if(var6 != null) {
                        if(var19.method_2424() != awt.field_4170) {
                           label359: {
                              var22 = var19;
                              var20 = class_1192.field_6028;
                              if(var6 != null) {
                                 if(var19 == class_1192.field_6028) {
                                    break label359;
                                 }

                                 var22 = var19;
                                 var20 = class_1192.field_6106;
                              }

                              if(var6 != null) {
                                 if(var22 == var20) {
                                    break label359;
                                 }

                                 var22 = var19;
                                 var20 = class_1192.field_6105;
                              }

                              if(var6 != null) {
                                 if(var22 == var20) {
                                    break label359;
                                 }

                                 var22 = var19;
                                 var20 = class_1192.field_6188;
                              }

                              if(var22 != var20) {
                                 break;
                              }
                           }
                        }

                        this.method_6353(var1, var3 + var17, var12, var5 + var11, class_1192.field_6188);
                        --var12;
                        --var18;
                     }

                     label146: {
                        var10000 = var18;
                        if(var6 != null) {
                           if(var18 > 0) {
                              break label146;
                           }

                           var12 -= var2.nextInt(5) + 1;
                           var10000 = var2.nextInt(5);
                        }

                        var18 = var10000;
                     }

                     if(var6 == null) {
                        break;
                     }

                     var10000 = var12;
                     var21 = 50;
                  }

                  ++var11;
               }

               if(var6 == null) {
                  break;
               }
            }

            ++var17;
            if(var6 != null) {
               continue label197;
            }
            break;
         }

         var10000 = 1;
         return (boolean)var10000;
      }
   }
}

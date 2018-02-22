import java.util.ArrayList;

// $FF: renamed from: cs
public class class_1016 implements class_19 {

   // $FF: renamed from: b add
   private add field_5381;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5382;


   // $FF: renamed from: <init> () void
   public void method_5778() {
      super();
   }

   // $FF: renamed from: b (aO, ahb) boolean
   public boolean method_60(class_897 var1, ahb var2) {
      this.field_5381 = null;
      int var4 = 0;
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var3 = var10000;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;

      adb var10001;
      add var30;
      adb var31;
      while(true) {
         if(var10 < var1.method_83()) {
            add var11 = var1.method_84(var10);
            if(var3 == null) {
               break;
            }

            label454: {
               var30 = var11;
               if(var3 != null) {
                  if(var11 == null) {
                     break label454;
                  }

                  var30 = var11;
               }

               var31 = var30.method_3730();
               var10001 = class_1010.field_5147;
               if(var3 != null) {
                  if(var31 == class_1010.field_5147) {
                     ++var5;
                     if(var3 != null) {
                        break label454;
                     }
                  }

                  var31 = var11.method_3730();
                  var10001 = class_1010.field_5258;
               }

               if(var3 != null) {
                  if(var31 == var10001) {
                     ++var7;
                     if(var3 != null) {
                        break label454;
                     }
                  }

                  var31 = var11.method_3730();
                  var10001 = class_1010.field_5208;
               }

               if(var3 != null) {
                  if(var31 == var10001) {
                     ++var6;
                     if(var3 != null) {
                        break label454;
                     }
                  }

                  var31 = var11.method_3730();
                  var10001 = class_1010.field_5197;
               }

               if(var3 != null) {
                  if(var31 == var10001) {
                     ++var4;
                     if(var3 != null) {
                        break label454;
                     }
                  }

                  var31 = var11.method_3730();
                  var10001 = class_1010.field_5205;
               }

               if(var3 != null) {
                  if(var31 == var10001) {
                     ++var8;
                     if(var3 != null) {
                        break label454;
                     }
                  }

                  var31 = var11.method_3730();
                  var10001 = class_1010.field_5122;
               }

               if(var3 != null) {
                  if(var31 == var10001) {
                     ++var8;
                     if(var3 != null) {
                        break label454;
                     }
                  }

                  var31 = var11.method_3730();
                  var10001 = class_1010.field_5241;
               }

               if(var3 != null) {
                  if(var31 == var10001) {
                     ++var9;
                     if(var3 != null) {
                        break label454;
                     }
                  }

                  var31 = var11.method_3730();
                  var10001 = class_1010.field_5146;
               }

               if(var3 != null) {
                  if(var31 == var10001) {
                     ++var9;
                     if(var3 != null) {
                        break label454;
                     }
                  }

                  var31 = var11.method_3730();
                  var10001 = class_1010.field_5228;
               }

               if(var3 != null) {
                  if(var31 == var10001) {
                     ++var9;
                     if(var3 != null) {
                        break label454;
                     }
                  }

                  var31 = var11.method_3730();
                  var10001 = class_1010.field_5253;
               }

               if(var31 == var10001) {
                  ++var9;
                  if(var3 != null) {
                     break label454;
                  }
               }

               return false;
            }

            ++var10;
            if(var3 != null) {
               continue;
            }
         }

         var8 += var6 + var9;
         break;
      }

      int var33 = var5;
      if(var3 != null) {
         if(var5 <= 3) {
            label455: {
               var33 = var4;
               byte var32 = 1;
               if(var3 != null) {
                  if(var4 > 1) {
                     break label455;
                  }

                  var33 = var5;
                  var32 = 1;
               }

               String[] var16;
               class_1583 var36;
               boolean var38;
               label456: {
                  class_1583 var17;
                  class_1583 var18;
                  add var34;
                  if(var3 != null) {
                     label457: {
                        label362: {
                           if(var33 >= var32) {
                              var33 = var4;
                              var32 = 1;
                              if(var3 == null) {
                                 break label457;
                              }

                              if(var4 == 1) {
                                 var33 = var8;
                                 if(var3 == null) {
                                    break label362;
                                 }

                                 if(var8 == 0) {
                                    var34 = new add;
                                    var34.method_3724(class_1010.field_5257);
                                    this.field_5381 = var34;
                                    var33 = var7;
                                    if(var3 != null) {
                                       if(var7 > 0) {
                                          var36 = new class_1583;
                                          var36.method_8628();
                                          var17 = var36;
                                          var36 = new class_1583;
                                          var36.method_8628();
                                          var18 = var36;
                                          class_1580 var37 = new class_1580;
                                          var37.method_8628();
                                          class_1580 var12 = var37;
                                          int var13 = 0;

                                          while(true) {
                                             if(var13 < var1.method_83()) {
                                                add var14 = var1.method_84(var13);
                                                if(var3 != null) {
                                                   var30 = var14;
                                                   if(var3 == null) {
                                                      break;
                                                   }

                                                   if(var14 != null) {
                                                      label460: {
                                                         var30 = var14;
                                                         if(var3 != null) {
                                                            if(var14.method_3730() != class_1010.field_5258) {
                                                               break label460;
                                                            }

                                                            var30 = var14;
                                                         }

                                                         var38 = var30.method_3766();
                                                         if(var3 != null) {
                                                            if(!var38) {
                                                               break label460;
                                                            }

                                                            var36 = var14.method_3767();
                                                            var16 = field_5382;
                                                            var38 = var36.initGui8("Explosion", 10);
                                                         }

                                                         if(var38) {
                                                            class_1583 var35 = var14.method_3767();
                                                            var16 = field_5382;
                                                            var12.method_8650(var35.method_8688("Explosion"));
                                                         }
                                                      }
                                                   }

                                                   ++var13;
                                                }

                                                if(var3 != null) {
                                                   continue;
                                                }
                                             }

                                             var16 = field_5382;
                                             var18.method_8664("Explosions", var12);
                                             var18.method_8665("Flight", (byte)var5);
                                             var17.method_8664("Fireworks", var18);
                                             var30 = this.field_5381;
                                             break;
                                          }

                                          var30.method_3769(var17);
                                       }

                                       var33 = 1;
                                    }

                                    return (boolean)var33;
                                 }
                              }
                           }

                           var33 = var5;
                        }

                        if(var3 == null) {
                           break label456;
                        }

                        var32 = 1;
                     }
                  }

                  if(var33 == var32) {
                     var33 = var4;
                     if(var3 == null) {
                        break label456;
                     }

                     if(var4 == 0) {
                        var33 = var7;
                        if(var3 == null) {
                           break label456;
                        }

                        if(var7 == 0) {
                           var33 = var6;
                           if(var3 == null) {
                              break label456;
                           }

                           if(var6 > 0) {
                              var33 = var9;
                              if(var3 == null) {
                                 break label456;
                              }

                              if(var9 <= 1) {
                                 var34 = new add;
                                 var34.method_3724(class_1010.field_5258);
                                 this.field_5381 = var34;
                                 var36 = new class_1583;
                                 var36.method_8628();
                                 var17 = var36;
                                 var36 = new class_1583;
                                 var36.method_8628();
                                 var18 = var36;
                                 byte var21 = 0;
                                 ArrayList var23 = new ArrayList();
                                 int var24 = 0;

                                 while(var24 < var1.method_83()) {
                                    label463: {
                                       add var15 = var1.method_84(var24);
                                       var30 = var15;
                                       if(var3 != null) {
                                          if(var15 == null) {
                                             break label463;
                                          }

                                          var30 = var15;
                                       }

                                       var31 = var30.method_3730();
                                       var10001 = class_1010.field_5208;
                                       if(var3 != null) {
                                          if(var31 == class_1010.field_5208) {
                                             var23.add(Integer.valueOf(class_537.field_2387[var15.method_3745()]));
                                             if(var3 != null) {
                                                break label463;
                                             }
                                          }

                                          var31 = var15.method_3730();
                                          var10001 = class_1010.field_5205;
                                       }

                                       if(var3 != null) {
                                          if(var31 == var10001) {
                                             var16 = field_5382;
                                             var18.initGui4("Flicker", true);
                                             if(var3 != null) {
                                                break label463;
                                             }
                                          }

                                          var31 = var15.method_3730();
                                          var10001 = class_1010.field_5122;
                                       }

                                       if(var3 != null) {
                                          if(var31 == var10001) {
                                             var16 = field_5382;
                                             var18.initGui4("Trail", true);
                                             if(var3 != null) {
                                                break label463;
                                             }
                                          }

                                          var31 = var15.method_3730();
                                          var10001 = class_1010.field_5241;
                                       }

                                       if(var3 != null) {
                                          if(var31 == var10001) {
                                             var21 = 1;
                                             if(var3 != null) {
                                                break label463;
                                             }
                                          }

                                          var31 = var15.method_3730();
                                          var10001 = class_1010.field_5146;
                                       }

                                       if(var3 != null) {
                                          if(var31 == var10001) {
                                             var21 = 4;
                                             if(var3 != null) {
                                                break label463;
                                             }
                                          }

                                          var31 = var15.method_3730();
                                          var10001 = class_1010.field_5228;
                                       }

                                       if(var3 != null) {
                                          if(var31 == var10001) {
                                             var21 = 2;
                                             if(var3 != null) {
                                                break label463;
                                             }
                                          }

                                          var31 = var15.method_3730();
                                          var10001 = class_1010.field_5253;
                                       }

                                       if(var31 == var10001) {
                                          var21 = 3;
                                       }
                                    }

                                    ++var24;
                                    if(var3 == null) {
                                       break;
                                    }
                                 }

                                 int[] var27 = new int[var23.size()];
                                 int var28 = 0;

                                 while(true) {
                                    if(var28 < var27.length) {
                                       var27[var28] = ((Integer)var23.get(var28)).intValue();
                                       ++var28;
                                       if(var3 == null) {
                                          break;
                                       }

                                       if(var3 != null) {
                                          continue;
                                       }
                                    }

                                    var16 = field_5382;
                                    var18.initGui3("Colors", var27);
                                    var18.method_8665("Type", var21);
                                    var17.method_8664("Explosion", var18);
                                    this.field_5381.method_3769(var17);
                                    break;
                                 }

                                 return true;
                              }
                           }
                        }
                     }
                  }

                  var33 = var5;
               }

               if(var3 != null) {
                  if(var33 == 0) {
                     var33 = var4;
                     if(var3 == null) {
                        return (boolean)var33;
                     }

                     if(var4 == 0) {
                        var33 = var7;
                        if(var3 == null) {
                           return (boolean)var33;
                        }

                        if(var7 == 1) {
                           var33 = var6;
                           if(var3 == null) {
                              return (boolean)var33;
                           }

                           if(var6 > 0) {
                              var33 = var6;
                              if(var3 == null) {
                                 return (boolean)var33;
                              }

                              if(var6 == var8) {
                                 ArrayList var19 = new ArrayList();
                                 int var20 = 0;

                                 while(var20 < var1.method_83()) {
                                    label466: {
                                       add var25 = var1.method_84(var20);
                                       var30 = var25;
                                       if(var3 != null) {
                                          if(var25 == null) {
                                             break label466;
                                          }

                                          var30 = var25;
                                       }

                                       label467: {
                                          var31 = var30.method_3730();
                                          var10001 = class_1010.field_5208;
                                          if(var3 != null) {
                                             if(var31 == class_1010.field_5208) {
                                                var19.add(Integer.valueOf(class_537.field_2387[var25.method_3745()]));
                                                if(var3 != null) {
                                                   break label466;
                                                }
                                             }

                                             var30 = var25;
                                             if(var3 == null) {
                                                break label467;
                                             }

                                             var31 = var25.method_3730();
                                             var10001 = class_1010.field_5258;
                                          }

                                          if(var31 != var10001) {
                                             break label466;
                                          }

                                          this.field_5381 = var25.method_3754();
                                          var30 = this.field_5381;
                                       }

                                       var30.field_2958 = 1;
                                    }

                                    ++var20;
                                    if(var3 == null) {
                                       break;
                                    }
                                 }

                                 int[] var22 = new int[var19.size()];
                                 int var26 = 0;

                                 while(true) {
                                    if(var26 < var22.length) {
                                       var22[var26] = ((Integer)var19.get(var26)).intValue();
                                       ++var26;
                                       if(var3 == null) {
                                          break;
                                       }

                                       if(var3 != null) {
                                          continue;
                                       }
                                    }

                                    var30 = this.field_5381;
                                    if(var3 != null) {
                                       if(this.field_5381 == null) {
                                          break;
                                       }

                                       var30 = this.field_5381;
                                    }

                                    var38 = var30.method_3766();
                                    if(var3 == null) {
                                       return var38;
                                    }

                                    if(var38) {
                                       var36 = this.field_5381.method_3767();
                                       var16 = field_5382;
                                       class_1583 var29 = var36.method_8688("Explosion");
                                       var36 = var29;
                                       if(var3 != null) {
                                          if(var29 == null) {
                                             return false;
                                          }

                                          var36 = var29;
                                       }

                                       String[] var39 = field_5382;
                                       var36.initGui3("FadeColors", var22);
                                       return true;
                                    }
                                    break;
                                 }

                                 var38 = false;
                                 return var38;
                              }
                           }
                        }
                     }
                  }

                  var33 = 0;
               }

               return (boolean)var33;
            }
         }

         var33 = 0;
      }

      return (boolean)var33;
   }

   // $FF: renamed from: b (aO) add
   public add method_61(class_897 var1) {
      return this.field_5381.method_3754();
   }

   // $FF: renamed from: b () int
   public int method_62() {
      return 10;
   }

   // $FF: renamed from: c () add
   public add method_63() {
      return this.field_5381;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5779() {
      // $FF: Couldn't be decompiled
   }
}

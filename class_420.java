import java.util.List;

// $FF: renamed from: f8
public class class_420 extends aji {

   // $FF: renamed from: M boolean
   private final boolean field_2143;
   // $FF: renamed from: N vL
   private IIcon field_2144;
   // $FF: renamed from: O vL
   private IIcon field_2145;
   // $FF: renamed from: P vL
   private IIcon field_2146;
   // $FF: renamed from: Q java.lang.String
   private static final String field_2147;
   // $FF: renamed from: R java.lang.String[]
   private static final String[] field_2148;


   // $FF: renamed from: <init> (boolean) void
   public void method_2680(boolean var1) {
      super.method_2427(awt.field_4203);
      this.field_2143 = var1;
      this.method_2428(field_1980);
      this.method_2437(0.5F);
      this.method_2521(class_872.field_4246);
   }

   // $FF: renamed from: i () vL
   public IIcon method_2681() {
      return this.field_2146;
   }

   // $FF: renamed from: c (float, float, float, float, float, float) void
   public void method_2682(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_2443(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      int var4 = method_2686(var2);
      String[] var3 = class_752.method_4253();
      int var10000 = var4;
      int var10001 = 5;
      IIcon var5;
      if(var3 != null) {
         if(var4 > 5) {
            var5 = this.field_2146;
            return var5;
         }

         var10000 = var1;
         var10001 = var4;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            class_420 var6;
            label59: {
               label58: {
                  var10000 = method_2687(var2);
                  if(var3 != null) {
                     if(var10000 != 0) {
                        break label58;
                     }

                     var6 = this;
                     if(var3 == null) {
                        break label59;
                     }

                     double var7;
                     var10000 = (var7 = this.field_1999 - 0.0D) == 0.0D?0:(var7 < 0.0D?-1:1);
                  }

                  if(var10000 <= 0) {
                     var6 = this;
                     if(var3 == null) {
                        break label59;
                     }

                     if(this.field_2000 <= 0.0D) {
                        var6 = this;
                        if(var3 == null) {
                           break label59;
                        }

                        if(this.field_2001 <= 0.0D) {
                           var6 = this;
                           if(var3 == null) {
                              break label59;
                           }

                           if(this.field_2002 >= 1.0D) {
                              var6 = this;
                              if(var3 == null) {
                                 break label59;
                              }

                              if(this.field_2003 >= 1.0D) {
                                 var6 = this;
                                 if(var3 == null) {
                                    break label59;
                                 }

                                 if(this.field_2004 >= 1.0D) {
                                    var5 = this.field_2146;
                                    return var5;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var6 = this;
            }

            var5 = var6.field_2144;
            return var5;
         }

         var10000 = var1;
         var10001 = class_1707.field_8946[var4];
      }

      var5 = var10000 == var10001?this.field_2145:this.field_2010;
      return var5;
   }

   // $FF: renamed from: a (java.lang.String) vL
   public static IIcon method_2683(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      String[] var2 = field_2148;
      String var10001 = "piston_side";
      IIcon var3;
      if(var1 != null) {
         if(var0 == "piston_side") {
            var3 = class_1192.field_6060.field_2010;
            return var3;
         }

         var10000 = var0;
         var2 = field_2148;
         var10001 = "piston_top_normal";
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var3 = class_1192.field_6060.field_2146;
            return var3;
         }

         var10000 = var0;
         var2 = field_2148;
         var10001 = "piston_top_sticky";
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var3 = class_1192.field_6056.field_2146;
            return var3;
         }

         var10000 = var0;
         String[] var4 = field_2148;
         var10001 = "piston_inner";
      }

      var3 = var10000 == var10001?class_1192.field_6060.field_2144:null;
      return var3;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var2 = class_752.method_4253();
      class_420 var10000 = this;
      class_74 var10001 = var1;
      String[] var3 = field_2148;
      String var10002 = "piston_side";
      if(var2 != null) {
         this.field_2010 = var1.method_375("piston_side");
         var10000 = this;
         var10001 = var1;
         if(this.field_2143) {
            var10002 = "piston_top_sticky";
         } else {
            var3 = field_2148;
            var10002 = "piston_top_normal";
         }
      }

      var10000.field_2146 = var10001.method_375(var10002);
      var3 = field_2148;
      this.field_2144 = var1.method_375("piston_inner");
      this.field_2145 = var1.method_375("piston_bottom");
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 16;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      int var7 = method_2688(var1, var2, var3, var4, var5);
      var1.method_2055(var2, var3, var4, var7, 2);
      if(!var1.field_1832) {
         this.method_2684(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.field_1832) {
         this.method_2684(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      ahb var10000 = var1;
      if(var5 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1;
      }

      if(var10000.method_31(var2, var3, var4) == null) {
         this.method_2684(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: h (ahb, int, int, int) void
   private void method_2684(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      int var7 = method_2686(var6);
      String[] var5 = var10000;
      int var9 = var7;
      if(var5 != null) {
         if(var7 == 7) {
            return;
         }

         var9 = this.method_2685(var1, var2, var3, var4, var7);
      }

      int var8 = var9;
      var9 = var8;
      if(var5 != null) {
         label45: {
            if(var8 != 0) {
               var9 = method_2687(var6);
               if(var5 == null) {
                  break label45;
               }

               if(var9 == 0) {
                  ahb var10 = var1;
                  int var10001 = var2;
                  int var10002 = var3;
                  int var10003 = var4;
                  if(var5 != null) {
                     if(!method_2690(var1, var2, var3, var4, var7)) {
                        return;
                     }

                     var10 = var1;
                     var10001 = var2;
                     var10002 = var3;
                     var10003 = var4;
                  }

                  var10.method_2193(var10001, var10002, var10003, this, 0, var7);
                  if(var5 != null) {
                     return;
                  }
               }
            }

            var9 = var8;
         }
      }

      if(var5 != null) {
         if(var9 != 0) {
            return;
         }

         var9 = method_2687(var6);
      }

      if(var5 != null) {
         if(var9 == 0) {
            return;
         }

         var1.method_2055(var2, var3, var4, var7, 2);
      }

      var1.method_2193(var2, var3, var4, this, 1, var7);
   }

   // $FF: renamed from: h (ahb, int, int, int, int) boolean
   private boolean method_2685(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      boolean var7;
      if(var6 != null) {
         label148: {
            if(var5 != 0) {
               var10000 = var1.method_2170(var2, var3 - 1, var4, 0);
               if(var6 == null) {
                  break label148;
               }

               if(var10000 != 0) {
                  var7 = true;
                  return var7;
               }
            }

            var10000 = var5;
         }
      }

      byte var10001 = 1;
      if(var6 != null) {
         label138: {
            if(var10000 != 1) {
               var10000 = var1.method_2170(var2, var3 + 1, var4, 1);
               if(var6 == null) {
                  break label138;
               }

               if(var10000 != 0) {
                  var7 = true;
                  return var7;
               }
            }

            var10000 = var5;
         }

         var10001 = 2;
      }

      if(var6 != null) {
         label128: {
            if(var10000 != var10001) {
               var10000 = var1.method_2170(var2, var3, var4 - 1, 2);
               if(var6 == null) {
                  break label128;
               }

               if(var10000 != 0) {
                  var7 = true;
                  return var7;
               }
            }

            var10000 = var5;
         }

         var10001 = 3;
      }

      if(var6 != null) {
         label118: {
            if(var10000 != var10001) {
               var10000 = var1.method_2170(var2, var3, var4 + 1, 3);
               if(var6 == null) {
                  break label118;
               }

               if(var10000 != 0) {
                  var7 = true;
                  return var7;
               }
            }

            var10000 = var5;
         }

         var10001 = 5;
      }

      label153: {
         if(var6 != null) {
            label104: {
               if(var10000 != var10001) {
                  var10000 = var1.method_2170(var2 + 1, var3, var4, 5);
                  if(var6 == null) {
                     break label104;
                  }

                  if(var10000 != 0) {
                     var7 = true;
                     return var7;
                  }
               }

               var10000 = var5;
            }

            if(var6 == null) {
               break label153;
            }

            var10001 = 4;
         }

         if(var10000 != var10001) {
            var10000 = var1.method_2170(var2 - 1, var3, var4, 4);
            if(var6 == null) {
               break label153;
            }

            if(var10000 != 0) {
               var7 = true;
               return var7;
            }
         }

         var10000 = var1.method_2170(var2, var3, var4, 0);
      }

      if(var6 != null) {
         if(var10000 != 0) {
            var7 = true;
            return var7;
         }

         var10000 = var1.method_2170(var2, var3 + 2, var4, 1);
      }

      if(var6 != null) {
         if(var10000 != 0) {
            var7 = true;
            return var7;
         }

         var10000 = var1.method_2170(var2, var3 + 1, var4 - 1, 2);
      }

      if(var6 != null) {
         if(var10000 != 0) {
            var7 = true;
            return var7;
         }

         var10000 = var1.method_2170(var2, var3 + 1, var4 + 1, 3);
      }

      int var8;
      ahb var9;
      int var10002;
      int var10003;
      byte var10004;
      label155: {
         if(var6 != null) {
            if(var10000 != 0) {
               var7 = true;
               return var7;
            }

            var9 = var1;
            var8 = var2 - 1;
            var10002 = var3 + 1;
            var10003 = var4;
            var10004 = 4;
            if(var6 == null) {
               break label155;
            }

            var10000 = var1.method_2170(var8, var10002, var4, 4);
         }

         if(var10000 != 0) {
            var7 = true;
            return var7;
         }

         var9 = var1;
         var8 = var2 + 1;
         var10002 = var3 + 1;
         var10003 = var4;
         var10004 = 5;
      }

      var7 = var9.method_2170(var8, var10002, var10003, var10004);
      return var7;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, int) boolean
   public boolean method_2511(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var7 != null) {
         label157: {
            if(!var1.field_1832) {
               byte var8 = this.method_2685(var1, var2, var3, var4, var6);
               var10000 = var8;
               if(var7 != null) {
                  label147: {
                     if(var8 != 0) {
                        var10000 = var5;
                        if(var7 == null) {
                           break label147;
                        }

                        if(var5 == 1) {
                           var1.method_2055(var2, var3, var4, var6 | 8, 2);
                           return false;
                        }
                     }

                     var10000 = var8;
                  }
               }

               if(var7 == null) {
                  break label157;
               }

               if(var10000 == 0) {
                  var10000 = var5;
                  if(var7 == null) {
                     break label157;
                  }

                  if(var5 == 0) {
                     return false;
                  }
               }
            }

            var10000 = var5;
         }
      }

      label162: {
         double var10001;
         double var10002;
         double var10003;
         boolean var20;
         if(var7 != null) {
            if(var10000 == 0) {
               var20 = this.method_2691(var1, var2, var3, var4, var6);
               if(var7 != null) {
                  if(!var20) {
                     return false;
                  }

                  var1.method_2055(var2, var3, var4, var6 | 8, 2);
               }

               var10001 = (double)var2 + 0.5D;
               var10002 = (double)var3 + 0.5D;
               var10003 = (double)var4 + 0.5D;
               String[] var17 = field_2148;
               var1.method_2084(var10001, var10002, var10003, "tile.piston.out", 0.5F, var1.field_1819.nextFloat() * 0.25F + 0.6F);
               if(var7 != null) {
                  break label162;
               }
            }

            var10000 = var5;
         }

         if(var7 == null) {
            return (boolean)var10000;
         }

         if(var10000 == 1) {
            class_580 var18 = var1.method_31(var2 + class_1707.field_8947[var6], var3 + class_1707.field_8948[var6], var4 + class_1707.field_8949[var6]);
            var20 = var18 instanceof class_598;
            if(var7 != null) {
               if(var20) {
                  ((class_598)var18).method_3196();
               }

               var1.method_2054(var2, var3, var4, class_1192.field_6063, var6, 3);
               var1.method_2131(var2, var3, var4, class_474.method_2823(this, var6, var6, false, true));
               var20 = this.field_2143;
            }

            if(var7 != null) {
               label125: {
                  if(var20) {
                     int var9;
                     int var10;
                     int var11;
                     aji var12;
                     int var13;
                     byte var14;
                     label119: {
                        var9 = var2 + class_1707.field_8947[var6] * 2;
                        var10 = var3 + class_1707.field_8948[var6] * 2;
                        var11 = var4 + class_1707.field_8949[var6] * 2;
                        var12 = var1.getBlock(var9, var10, var11);
                        var13 = var1.method_33(var9, var10, var11);
                        var14 = 0;
                        if(var12 == class_1192.field_6063) {
                           class_580 var15 = var1.method_31(var9, var10, var11);
                           var10000 = var15 instanceof class_598;
                           if(var7 == null) {
                              break label119;
                           }

                           if(var10000 != 0) {
                              class_598 var16 = (class_598)var15;
                              var10000 = var16.method_3189();
                              if(var7 == null) {
                                 break label119;
                              }

                              if(var10000 == var6) {
                                 var10000 = var16.method_3188();
                                 if(var7 == null) {
                                    break label119;
                                 }

                                 if(var10000 != 0) {
                                    var16.method_3196();
                                    var12 = var16.method_3187();
                                    var13 = var16.getBlock96();
                                    var14 = 1;
                                 }
                              }
                           }
                        }

                        var10000 = var14;
                     }

                     label165: {
                        if(var7 != null) {
                           label106: {
                              if(var10000 == 0) {
                                 label166: {
                                    aji var21 = var12;
                                    if(var7 != null) {
                                       if(var12.method_2424() == awt.field_4170) {
                                          break label166;
                                       }

                                       var21 = var12;
                                    }

                                    var10000 = method_2689(var21, var1, var9, var10, var11, false);
                                    if(var7 == null) {
                                       break label106;
                                    }

                                    if(var10000 != 0) {
                                       label95: {
                                          var10000 = var12.method_2514();
                                          if(var7 != null) {
                                             if(var10000 != 0) {
                                                label91: {
                                                   var21 = var12;
                                                   class_420 var19 = class_1192.field_6060;
                                                   if(var7 != null) {
                                                      if(var12 == class_1192.field_6060) {
                                                         break label91;
                                                      }

                                                      var21 = var12;
                                                      var19 = class_1192.field_6056;
                                                   }

                                                   if(var21 != var19) {
                                                      break label95;
                                                   }
                                                }
                                             }

                                             var2 += class_1707.field_8947[var6];
                                             var3 += class_1707.field_8948[var6];
                                             var4 += class_1707.field_8949[var6];
                                             var1.method_2054(var2, var3, var4, class_1192.field_6063, var13, 3);
                                             var1.method_2131(var2, var3, var4, class_474.method_2823(var12, var13, var6, false, false));
                                             var1.method_2056(var9, var10, var11);
                                          }

                                          if(var7 != null) {
                                             break label165;
                                          }
                                       }
                                    }
                                 }
                              }

                              var10000 = var14;
                           }
                        }

                        if(var7 != null && var10000 == 0) {
                           var1.method_2056(var2 + class_1707.field_8947[var6], var3 + class_1707.field_8948[var6], var4 + class_1707.field_8949[var6]);
                        }
                     }

                     if(var7 != null) {
                        break label125;
                     }
                  }

                  var1.method_2056(var2 + class_1707.field_8947[var6], var3 + class_1707.field_8948[var6], var4 + class_1707.field_8949[var6]);
               }
            }

            var10001 = (double)var2 + 0.5D;
            var10002 = (double)var3 + 0.5D;
            var10003 = (double)var4 + 0.5D;
            String[] var10004 = field_2148;
            var1.method_2084(var10001, var10002, var10003, "tile.piston.in", 0.5F, var1.field_1819.nextFloat() * 0.15F + 0.6F);
         }
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      if(method_2687(var6)) {
         label47: {
            label46: {
               label45: {
                  label44: {
                     label43: {
                        label42: {
                           float var7 = 0.25F;
                           if(var5 != null) {
                              switch(method_2686(var6)) {
                              case 0:
                                 this.method_2443(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
                                 break;
                              case 1:
                                 break label42;
                              case 2:
                                 break label43;
                              case 3:
                                 break label44;
                              case 4:
                                 break label45;
                              case 5:
                                 break label46;
                              default:
                                 break label47;
                              }
                           }

                           if(var5 != null) {
                              break label47;
                           }
                        }

                        this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
                        if(var5 != null) {
                           break label47;
                        }
                     }

                     this.method_2443(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
                     if(var5 != null) {
                        break label47;
                     }
                  }

                  this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
                  if(var5 != null) {
                     break label47;
                  }
               }

               this.method_2443(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
               if(var5 != null) {
                  break label47;
               }
            }

            this.method_2443(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
         }

         if(var5 != null) {
            return;
         }
      }

      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2452(var1, var2, var3, var4);
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c (int) int
   public static int method_2686(int var0) {
      return var0 & 7;
   }

   // $FF: renamed from: d (int) boolean
   public static boolean method_2687(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0 & 8;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (ahb, int, int, int, sv) int
   public static int method_2688(ahb var0, int var1, int var2, int var3, class_752 var4) {
      String[] var5 = class_752.method_4253();
      float var9;
      int var10000 = (var9 = class_1715.method_9564((float)var4.field_2994 - (float)var1) - 2.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
      if(var5 != null) {
         label65: {
            if(var10000 < 0) {
               float var10;
               var10000 = (var10 = class_1715.method_9564((float)var4.field_2996 - (float)var3) - 2.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
               if(var5 == null) {
                  break label65;
               }

               if(var10000 < 0) {
                  double var6 = var4.field_2995 + 1.82D - (double)var4.field_3013;
                  double var11;
                  var10000 = (var11 = var6 - (double)var2 - 2.0D) == 0.0D?0:(var11 < 0.0D?-1:1);
                  if(var5 != null) {
                     if(var10000 > 0) {
                        return 1;
                     }

                     double var12;
                     var10000 = (var12 = (double)var2 - var6 - 0.0D) == 0.0D?0:(var12 < 0.0D?-1:1);
                  }

                  if(var5 == null) {
                     break label65;
                  }

                  if(var10000 > 0) {
                     return 0;
                  }
               }
            }

            var10000 = class_1715.method_9561((double)(var4.field_3000 * 4.0F / 360.0F) + 0.5D) & 3;
         }
      }

      int var8 = var10000;
      var10000 = var8;
      if(var5 != null) {
         if(var8 == 0) {
            var10000 = 2;
            return var10000;
         }

         var10000 = var8;
      }

      byte var10001 = 1;
      if(var5 != null) {
         if(var10000 == 1) {
            var10000 = 5;
            return var10000;
         }

         var10000 = var8;
         var10001 = 2;
      }

      if(var5 != null) {
         if(var10000 == var10001) {
            var10000 = 3;
            return var10000;
         }

         var10000 = var8;
         if(var5 == null) {
            return var10000;
         }

         var10001 = 3;
      }

      var10000 = var10000 == var10001?4:0;
      return var10000;
   }

   // $FF: renamed from: b (aji, ahb, int, int, int, boolean) boolean
   private static boolean method_2689(aji var0, ahb var1, int var2, int var3, int var4, boolean var5) {
      boolean var10;
      label123: {
         String[] var6 = class_752.method_4253();
         aji var10000 = var0;
         aji var10001 = class_1192.field_6076;
         if(var6 != null) {
            if(var0 == class_1192.field_6076) {
               break label123;
            }

            var10000 = var0;
            var10001 = class_1192.field_6088;
         }

         label124: {
            if(var6 != null) {
               if(var10000 == var10001) {
                  break label123;
               }

               var10000 = var0;
               if(var6 == null) {
                  break label124;
               }

               var10001 = class_1192.field_6109;
            }

            if(var10000 == var10001) {
               break label123;
            }

            var10000 = var0;
         }

         String var9 = var10000.method_2510();
         String[] var11 = field_2148;
         var10 = var9.equals("tile.pumpkinStem");
         if(var6 == null) {
            return var10;
         }

         if(!var10) {
            label126: {
               label127: {
                  var10000 = var0;
                  var10001 = class_1192.field_6128;
                  if(var6 != null) {
                     if(var0 == class_1192.field_6128) {
                        break label126;
                     }

                     var10000 = var0;
                     if(var6 == null) {
                        break label127;
                     }

                     var10001 = class_1192.field_6112;
                  }

                  if(var10000 == var10001) {
                     break label126;
                  }

                  var10000 = var0;
               }

               int var8;
               label88: {
                  label129: {
                     label130: {
                        label85: {
                           class_420 var12 = class_1192.field_6060;
                           if(var6 != null) {
                              if(var10000 == class_1192.field_6060) {
                                 break label85;
                              }

                              var10000 = var0;
                              if(var6 == null) {
                                 break label130;
                              }

                              var12 = class_1192.field_6056;
                           }

                           if(var10000 != var12) {
                              var10000 = var0;
                              break label130;
                           }
                        }

                        var8 = method_2687(var1.method_33(var2, var3, var4));
                        if(var6 == null) {
                           break label88;
                        }

                        if(var8 != 0) {
                           return false;
                        }
                        break label129;
                     }

                     float var13;
                     var8 = (var13 = var10000.method_2439(var1, var2, var3, var4) - -1.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
                     if(var6 != null) {
                        if(var8 == 0) {
                           return false;
                        }

                        var8 = var0.method_2514();
                     }

                     byte var7 = 2;
                     if(var6 != null) {
                        if(var8 == 2) {
                           return false;
                        }

                        var8 = var0.method_2514();
                        if(var6 == null) {
                           break label88;
                        }

                        var7 = 1;
                     }

                     if(var8 == var7) {
                        var10 = var5;
                        if(var6 != null) {
                           if(!var5) {
                              return false;
                           }

                           var10 = true;
                        }

                        return var10;
                     }
                  }

                  var8 = var0 instanceof class_28;
               }

               if(var6 != null) {
                  var8 = var8 == 0?1:0;
               }

               return (boolean)var8;
            }
         }
      }

      var10 = false;
      return var10;
   }

   // $FF: renamed from: i (ahb, int, int, int, int) boolean
   private static boolean method_2690(ahb var0, int var1, int var2, int var3, int var4) {
      int var6 = var1 + class_1707.field_8947[var4];
      int var7 = var2 + class_1707.field_8948[var4];
      int var8 = var3 + class_1707.field_8949[var4];
      String[] var5 = class_752.method_4253();
      int var9 = 0;

      int var10000;
      while(true) {
         if(var9 < 13) {
            label68: {
               var10000 = var7;
               if(var5 == null) {
                  break;
               }

               if(var5 != null) {
                  if(var7 > 0) {
                     var10000 = var7;
                     if(var5 == null) {
                        return (boolean)var10000;
                     }

                     if(var7 < 255) {
                        aji var10 = var0.getBlock(var6, var7, var8);
                        aji var11 = var10;
                        if(var5 != null) {
                           if(var10.method_2424() == awt.field_4170) {
                              break label68;
                           }

                           var11 = var10;
                        }

                        var10000 = method_2689(var11, var0, var6, var7, var8, true);
                        if(var5 != null) {
                           if(var10000 == 0) {
                              return false;
                           }

                           var10000 = var10.method_2514();
                        }

                        if(var5 == null) {
                           break;
                        }

                        if(var10000 != 1) {
                           var10000 = var9;
                           int var10001 = 12;
                           if(var5 != null) {
                              if(var9 == 12) {
                                 return false;
                              }

                              var6 += class_1707.field_8947[var4];
                              var7 += class_1707.field_8948[var4];
                              var10000 = var8;
                              var10001 = class_1707.field_8949[var4];
                           }

                           var8 = var10000 + var10001;
                           ++var9;
                           if(var5 != null) {
                              continue;
                           }
                        }
                        break label68;
                     }
                  }

                  var10000 = 0;
               }

               return (boolean)var10000;
            }
         }

         var10000 = 1;
         break;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: j (ahb, int, int, int, int) boolean
   private boolean method_2691(ahb var1, int var2, int var3, int var4, int var5) {
      int var7 = var2 + class_1707.field_8947[var5];
      String[] var10000 = class_752.method_4253();
      int var8 = var3 + class_1707.field_8948[var5];
      int var9 = var4 + class_1707.field_8949[var5];
      String[] var6 = var10000;
      int var10 = 0;

      int var10001;
      int var21;
      label171: {
         while(true) {
            if(var10 < 13) {
               label191: {
                  var21 = var8;
                  if(var6 == null) {
                     break label171;
                  }

                  if(var6 != null) {
                     if(var8 > 0) {
                        var21 = var8;
                        if(var6 == null) {
                           return (boolean)var21;
                        }

                        if(var8 < 255) {
                           aji var11 = var1.getBlock(var7, var8, var9);
                           if(var6 == null) {
                              break;
                           }

                           if(var11.method_2424() != awt.field_4170) {
                              var21 = method_2689(var11, var1, var7, var8, var9, true);
                              if(var6 != null) {
                                 if(var21 == 0) {
                                    return false;
                                 }

                                 var21 = var11.method_2514();
                              }

                              if(var6 != null) {
                                 if(var21 != 1) {
                                    var21 = var10;
                                    var10001 = 12;
                                    if(var6 != null) {
                                       if(var10 == 12) {
                                          return false;
                                       }

                                       var7 += class_1707.field_8947[var5];
                                       var8 += class_1707.field_8948[var5];
                                       var21 = var9;
                                       var10001 = class_1707.field_8949[var5];
                                    }

                                    var9 = var21 + var10001;
                                    ++var10;
                                    if(var6 != null) {
                                       continue;
                                    }
                                 }

                                 var11.method_2466(var1, var7, var8, var9, var1.method_33(var7, var8, var9), 0);
                                 var1.method_2056(var7, var8, var9);
                              }
                           }
                           break label191;
                        }
                     }

                     var21 = 0;
                  }

                  return (boolean)var21;
               }
            }

            var10 = var7;
            break;
         }

         var21 = var8;
      }

      int var20 = var21;
      int var12 = var9;
      int var13 = 0;
      aji[] var14 = new aji[13];

      int var15;
      int var16;
      int var17;
      label140: {
         do {
            label137: {
               if(var7 == var2) {
                  var21 = var8;
                  var10001 = var3;
                  if(var6 == null || var6 == null) {
                     break label137;
                  }

                  if(var8 == var3) {
                     var21 = var9;
                     if(var6 == null) {
                        break label140;
                     }

                     if(var9 == var4) {
                        break;
                     }
                  }
               }

               var21 = var7;
               var10001 = class_1707.field_8947[var5];
            }

            aji var18;
            label125: {
               var15 = var21 - var10001;
               var16 = var8 - class_1707.field_8948[var5];
               var17 = var9 - class_1707.field_8949[var5];
               var18 = var1.getBlock(var15, var16, var17);
               int var19 = var1.method_33(var15, var16, var17);
               if(var6 != null) {
                  label122: {
                     if(var18 == this) {
                        if(var6 == null) {
                           break label122;
                        }

                        if(var15 == var2) {
                           if(var6 == null) {
                              break label122;
                           }

                           if(var16 == var3) {
                              if(var6 == null) {
                                 break label122;
                              }

                              if(var17 == var4) {
                                 int var10006 = this.field_2143;
                                 if(var6 != null) {
                                    var10006 = this.field_2143?8:0;
                                 }

                                 var1.method_2054(var7, var8, var9, class_1192.field_6063, var5 | var10006, 4);
                                 var10006 = this.field_2143;
                                 if(var6 != null) {
                                    var10006 = this.field_2143?8:0;
                                 }

                                 var1.method_2131(var7, var8, var9, class_474.method_2823(class_1192.field_6061, var5 | var10006, var5, true, false));
                                 if(var6 != null) {
                                    break label125;
                                 }
                              }
                           }
                        }
                     }

                     var1.method_2054(var7, var8, var9, class_1192.field_6063, var19, 4);
                  }
               }

               var1.method_2131(var7, var8, var9, class_474.method_2823(var18, var19, var5, true, false));
            }

            var14[var13++] = var18;
            var7 = var15;
            var8 = var16;
            var9 = var17;
         } while(var6 != null);

         var7 = var10;
         var8 = var20;
         var9 = var12;
         var21 = 0;
      }

      var13 = var21;

      do {
         label95: {
            if(var7 == var2) {
               var21 = var8;
               var10001 = var3;
               if(var6 == null || var6 == null) {
                  break label95;
               }

               if(var8 == var3) {
                  var21 = var9;
                  if(var6 == null) {
                     return (boolean)var21;
                  }

                  if(var9 == var4) {
                     break;
                  }
               }
            }

            var21 = var7;
            var10001 = class_1707.field_8947[var5];
         }

         var15 = var21 - var10001;
         var16 = var8 - class_1707.field_8948[var5];
         var17 = var9 - class_1707.field_8949[var5];
         var1.method_2063(var15, var16, var17, var14[var13++]);
         var7 = var15;
         var8 = var16;
         var9 = var17;
      } while(var6 != null);

      var21 = 1;
      return (boolean)var21;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

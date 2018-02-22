import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: Aw
public class class_675 extends class_671 {

   // $FF: renamed from: i org.apache.logging.log4j.Logger
   private static final Logger field_2894;
   // $FF: renamed from: l vI
   private class_22 field_2895;
   // $FF: renamed from: m vI
   private class_22 field_2896;
   // $FF: renamed from: n ahb
   private ahb field_2897;
   // $FF: renamed from: o int
   private int field_2898;
   // $FF: renamed from: p int
   private int field_2899;
   // $FF: renamed from: q int
   private int field_2900;
   // $FF: renamed from: r int
   public int field_2901;
   // $FF: renamed from: s int
   private int field_2902;
   // $FF: renamed from: t java.lang.String
   private String field_2903;
   // $FF: renamed from: u yz
   private final class_792 field_2904;
   // $FF: renamed from: v java.lang.String
   private static final String field_2905;
   // $FF: renamed from: w java.lang.String[]
   private static final String[] field_2906;


   // $FF: renamed from: <init> (Af, ahb, int, int, int, yz) void
   public void method_3687(class_666 var1, ahb var2, int var3, int var4, int var5, class_792 var6) {
      super.method_3645();
      class_899 var10001 = new class_899;
      var10001.method_5218();
      this.field_2895 = var10001;
      class_1675 var11 = new class_1675;
      String[] var10004 = field_2906;
      var11.method_9239(this, "Repair", true, 2);
      this.field_2896 = var11;
      this.field_2897 = var2;
      this.field_2898 = var3;
      String[] var10000 = class_752.method_4253();
      this.field_2899 = var4;
      this.field_2900 = var5;
      this.field_2904 = var6;
      String[] var7 = var10000;
      class_492 var12 = new class_492;
      var12.method_2869(this.field_2896, 0, 27, 47);
      this.method_3646(var12);
      var12 = new class_492;
      var12.method_2869(this.field_2896, 1, 76, 47);
      this.method_3646(var12);
      class_502 var13 = new class_502;
      var13.method_2903(this, this.field_2895, 2, 134, 47, var2, var3, var4, var5);
      this.method_3646(var13);
      int var8 = 0;

      byte var10;
      while(true) {
         if(var8 < 3) {
            var10 = 0;
            if(var7 == null) {
               break;
            }

            int var9 = 0;

            while(true) {
               if(var9 < 9) {
                  var12 = new class_492;
                  var12.method_2869(var1, var9 + var8 * 9 + 9, 8 + var9 * 18, 84 + var8 * 18);
                  this.method_3646(var12);
                  ++var9;
                  if(var7 == null) {
                     break;
                  }

                  if(var7 != null) {
                     continue;
                  }
               }

               ++var8;
               break;
            }

            if(var7 != null) {
               continue;
            }
         }

         var10 = 0;
         break;
      }

      var8 = var10;

      while(var8 < 9) {
         var12 = new class_492;
         var12.method_2869(var1, var8, 8 + var8 * 18, 142);
         this.method_3646(var12);
         ++var8;
         if(var7 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (vI) void
   public void method_3659(class_22 var1) {
      String[] var2 = class_752.method_4253();
      class_675 var10000 = this;
      if(var2 != null) {
         super.method_3659(var1);
         if(var1 != this.field_2896) {
            return;
         }

         var10000 = this;
      }

      var10000.method_3688();
   }

   // $FF: renamed from: a () void
   public void method_3688() {
      String[] var10000 = class_752.method_4253();
      add var2 = this.field_2896.method_84(0);
      this.field_2901 = 0;
      String[] var1 = var10000;
      int var3 = 0;
      byte var4 = 0;
      int var5 = 0;
      add var24 = var2;
      if(var1 != null) {
         if(var2 == null) {
            this.field_2895.method_87(0, (add)null);
            this.field_2901 = 0;
            if(var1 != null) {
               return;
            }
         }

         var24 = var2.method_3754();
      }

      add var6;
      add var7;
      Map var8;
      int var9;
      int var25;
      int var27;
      label356: {
         var6 = var24;
         var7 = this.field_2896.method_84(1);
         var8 = class_980.method_5641(var6);
         var9 = 0;
         var25 = var4 + var2.method_3785();
         add var10001 = var7;
         if(var1 != null) {
            if(var7 == null) {
               var27 = 0;
               break label356;
            }

            var10001 = var7;
         }

         var27 = var10001.method_3785();
      }

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      Iterator var16;
      class_940 var17;
      label457: {
         label468: {
            label455: {
               label489: {
                  label453: {
                     var10 = var25 + var27;
                     class_675 var26 = this;
                     if(var1 != null) {
                        this.field_2902 = 0;
                        if(var7 != null) {
                           label470: {
                              label351: {
                                 if(var7.method_3730() == class_1010.field_5259) {
                                    var25 = class_1010.field_5259.getBlock02(var7).method_8658();
                                    if(var1 == null) {
                                       break label351;
                                    }

                                    if(var25 > 0) {
                                       var25 = 1;
                                       break label351;
                                    }
                                 }

                                 var25 = 0;
                              }

                              var9 = var25;
                              var25 = var6.method_3741();
                              if(var1 != null) {
                                 label446: {
                                    if(var25 != 0) {
                                       var25 = var6.method_3730().method_2976(var2, var7);
                                       if(var1 == null) {
                                          break label446;
                                       }

                                       if(var25 != 0) {
                                          var11 = Math.min(var6.method_3744(), var6.method_3747() / 4);
                                          var25 = var11;
                                          if(var1 != null) {
                                             if(var11 <= 0) {
                                                this.field_2895.method_87(0, (add)null);
                                                this.field_2901 = 0;
                                                return;
                                             }

                                             var25 = 0;
                                          }

                                          var12 = var25;

                                          while(var11 > 0) {
                                             var25 = var12;
                                             var27 = var7.field_2958;
                                             if(var1 == null) {
                                                break label489;
                                             }

                                             if(var1 != null) {
                                                if(var12 >= var7.field_2958) {
                                                   break;
                                                }

                                                var25 = var6.method_3744();
                                                var27 = var11;
                                             }

                                             var13 = var25 - var27;
                                             var6.method_3746(var13);
                                             var3 += Math.max(1, var11 / 100) + var8.size();
                                             var11 = Math.min(var6.method_3744(), var6.method_3747() / 4);
                                             ++var12;
                                             if(var1 == null) {
                                                break;
                                             }
                                          }

                                          this.field_2902 = var12;
                                          if(var1 != null) {
                                             break label470;
                                          }
                                       }
                                    }

                                    var25 = var9;
                                 }
                              }

                              label473: {
                                 if(var1 != null) {
                                    label474: {
                                       if(var25 == 0) {
                                          label370: {
                                             label475: {
                                                var24 = var6;
                                                if(var1 != null) {
                                                   if(var6.method_3730() != var7.method_3730()) {
                                                      break label475;
                                                   }

                                                   var24 = var6;
                                                }

                                                var25 = var24.method_3741();
                                                if(var1 == null) {
                                                   break label474;
                                                }

                                                if(var25 != 0) {
                                                   break label370;
                                                }
                                             }

                                             this.field_2895.method_87(0, (add)null);
                                             this.field_2901 = 0;
                                             return;
                                          }
                                       }

                                       var24 = var6;
                                       if(var1 == null) {
                                          break label473;
                                       }

                                       var25 = var6.method_3741();
                                    }
                                 }

                                 if(var25 != 0) {
                                    label476: {
                                       var25 = var9;
                                       if(var1 != null) {
                                          if(var9 != 0) {
                                             break label476;
                                          }

                                          var25 = var2.method_3747() - var2.method_3744();
                                       }

                                       var11 = var25;
                                       var12 = var7.method_3747() - var7.method_3744();
                                       var13 = var12 + var6.method_3747() * 12 / 100;
                                       int var18 = var11 + var13;
                                       var14 = var6.method_3747() - var18;
                                       var25 = var14;
                                       if(var1 != null) {
                                          if(var14 < 0) {
                                             var14 = 0;
                                          }

                                          var25 = var14;
                                       }

                                       var27 = var6.method_3745();
                                       if(var1 != null) {
                                          if(var25 >= var27) {
                                             break label476;
                                          }

                                          var6.method_3746(var14);
                                          var25 = var3;
                                          var27 = Math.max(1, var13 / 100);
                                       }

                                       var3 = var25 + var27;
                                    }
                                 }

                                 var24 = var7;
                              }

                              Map var28 = class_980.method_5641(var24);
                              var16 = var28.keySet().iterator();

                              while(var16.hasNext()) {
                                 var13 = ((Integer)var16.next()).intValue();
                                 var17 = class_940.field_4782[var13];
                                 var25 = var8.containsKey(Integer.valueOf(var13));
                                 if(var1 == null) {
                                    break label453;
                                 }

                                 if(var1 != null) {
                                    var25 = var25 != 0?((Integer)var8.get(Integer.valueOf(var13))).intValue():0;
                                 }

                                 int var19;
                                 label330: {
                                    var14 = var25;
                                    var15 = ((Integer)var28.get(Integer.valueOf(var13))).intValue();
                                    var25 = var14;
                                    var27 = var15;
                                    if(var1 != null) {
                                       if(var14 == var15) {
                                          ++var15;
                                          var19 = var15;
                                          if(var1 != null) {
                                             break label330;
                                          }
                                       }

                                       var25 = var15;
                                       var27 = var14;
                                    }

                                    var19 = Math.max(var25, var27);
                                 }

                                 int var20;
                                 byte var21;
                                 label323: {
                                    var15 = var19;
                                    var20 = var19 - var14;
                                    var21 = var17.method_5491(var2);
                                    byte var29 = this.field_2904.field_3640.field_2839;
                                    if(var1 != null) {
                                       if(!this.field_2904.field_3640.field_2839 && var2.method_3730() != class_1010.field_5259) {
                                          break label323;
                                       }

                                       var29 = 1;
                                    }

                                    var21 = var29;
                                 }

                                 Iterator var22 = var8.keySet().iterator();

                                 int var23;
                                 while(var22.hasNext()) {
                                    label479: {
                                       var23 = ((Integer)var22.next()).intValue();
                                       var25 = var23;
                                       if(var1 != null) {
                                          var27 = var13;
                                          if(var1 == null) {
                                             break label489;
                                          }

                                          if(var23 == var13) {
                                             break label479;
                                          }

                                          var25 = var17.method_5487(class_940.field_4782[var23]);
                                       }

                                       if(var1 != null) {
                                          if(var25 != 0) {
                                             break label479;
                                          }

                                          var21 = 0;
                                          var25 = var3 + var20;
                                       }

                                       var3 = var25;
                                    }

                                    if(var1 == null) {
                                       break;
                                    }
                                 }

                                 label481: {
                                    var25 = var21;
                                    if(var1 != null) {
                                       if(var21 == 0) {
                                          break label481;
                                       }

                                       var25 = var19;
                                    }

                                    if(var1 != null) {
                                       if(var25 > var17.method_5482()) {
                                          var15 = var17.method_5482();
                                       }

                                       var8.put(Integer.valueOf(var13), Integer.valueOf(var15));
                                       var25 = 0;
                                    }

                                    label305: {
                                       var23 = var25;
                                       var25 = var17.method_5480();
                                       if(var1 != null) {
                                          switch(var25) {
                                          case 1:
                                             var23 = 8;
                                             if(var1 != null) {
                                                break label305;
                                             }
                                          case 2:
                                             var23 = 4;
                                          case 3:
                                          case 4:
                                          case 6:
                                          case 7:
                                          case 8:
                                          case 9:
                                          default:
                                             if(var1 != null) {
                                                break label305;
                                             }
                                          case 5:
                                             var23 = 2;
                                             if(var1 != null) {
                                                break label305;
                                             }
                                          case 10:
                                             var25 = 1;
                                          }
                                       }

                                       var23 = var25;
                                    }

                                    var25 = var9;
                                    if(var1 != null) {
                                       if(var9 != 0) {
                                          var23 = Math.max(1, var23 / 2);
                                       }

                                       var25 = var3 + var23 * var20;
                                    }

                                    var3 = var25;
                                 }

                                 if(var1 == null) {
                                    break;
                                 }
                              }
                           }
                        }

                        var26 = this;
                     }

                     var25 = StringUtils.isBlank(var26.field_2903);
                  }

                  if(var1 != null) {
                     if(var25 != 0) {
                        var25 = var2.method_3773();
                        if(var1 == null) {
                           break label457;
                        }

                        if(var25 == 0) {
                           break label468;
                        }

                        label298: {
                           var25 = var2.method_3741();
                           if(var1 != null) {
                              if(var25 != 0) {
                                 var25 = 7;
                                 break label298;
                              }

                              var25 = var2.field_2958;
                           }

                           var25 *= 5;
                        }

                        var5 = var25;
                        var3 += var5;
                        var6.method_3772();
                        if(var1 != null) {
                           break label468;
                        }
                     }

                     var25 = this.field_2903.equals(var2.method_3770());
                  }

                  if(var1 == null) {
                     break label457;
                  }

                  if(var25 != 0) {
                     break label468;
                  }

                  var25 = var2.method_3741();
                  if(var1 != null) {
                     if(var25 != 0) {
                        var25 = 7;
                        break label455;
                     }

                     var25 = var2.field_2958;
                  }

                  var27 = 5;
               }

               var25 *= var27;
            }

            var5 = var25;
            var3 += var5;
            if(var1 != null) {
               if(var2.method_3773()) {
                  var10 += var5 / 2;
               }

               var6.method_3771(this.field_2903);
            }
         }

         var25 = 0;
      }

      var11 = var25;
      var16 = var8.keySet().iterator();

      while(true) {
         if(var16.hasNext()) {
            var13 = ((Integer)var16.next()).intValue();
            var17 = class_940.field_4782[var13];
            var14 = ((Integer)var8.get(Integer.valueOf(var13))).intValue();
            var15 = 0;
            ++var11;
            var25 = var17.method_5480();
            if(var1 == null) {
               break;
            }

            label286: {
               if(var1 != null) {
                  switch(var25) {
                  case 1:
                     var15 = 8;
                     if(var1 != null) {
                        break label286;
                     }
                  case 2:
                     var15 = 4;
                  case 3:
                  case 4:
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  default:
                     if(var1 != null) {
                        break label286;
                     }
                  case 5:
                     var15 = 2;
                     if(var1 != null) {
                        break label286;
                     }
                  case 10:
                     var25 = 1;
                  }
               }

               var15 = var25;
            }

            var25 = var9;
            if(var1 != null) {
               if(var9 != 0) {
                  var15 = Math.max(1, var15 / 2);
               }

               var25 = var10 + var11 + var14 * var15;
            }

            var10 = var25;
            if(var1 != null) {
               continue;
            }
         }

         var25 = var9;
         break;
      }

      if(var1 != null) {
         if(var25 != 0) {
            var10 = Math.max(1, var10 / 2);
         }

         this.field_2901 = var10 + var3;
         var25 = var3;
      }

      if(var1 != null) {
         if(var25 <= 0) {
            var6 = null;
         }

         var25 = var5;
      }

      label271: {
         label485: {
            var27 = var3;
            if(var1 != null) {
               label486: {
                  label267: {
                     if(var25 == var3) {
                        var25 = var5;
                        if(var1 == null) {
                           break label267;
                        }

                        if(var5 > 0) {
                           var25 = this.field_2901;
                           var27 = 40;
                           if(var1 == null) {
                              break label486;
                           }

                           if(this.field_2901 >= 40) {
                              this.field_2901 = 39;
                           }
                        }
                     }

                     var25 = this.field_2901;
                  }

                  if(var1 == null) {
                     break label485;
                  }

                  var27 = 40;
               }
            }

            if(var25 < var27) {
               break label271;
            }

            var25 = this.field_2904.field_3640.field_2839;
         }

         if(var25 == 0) {
            var6 = null;
         }
      }

      label487: {
         var24 = var6;
         if(var1 != null) {
            if(var6 == null) {
               break label487;
            }

            var24 = var6;
         }

         label245: {
            var12 = var24.method_3785();
            var24 = var7;
            if(var1 != null) {
               if(var7 != null) {
                  var25 = var12;
                  if(var1 == null) {
                     break label245;
                  }

                  if(var12 < var7.method_3785()) {
                     var12 = var7.method_3785();
                  }
               }

               var24 = var6;
            }

            var25 = var24.method_3773();
         }

         if(var1 != null) {
            if(var25 != 0) {
               var12 -= 9;
            }

            var25 = var12;
         }

         label236: {
            if(var1 != null) {
               if(var25 >= 0) {
                  break label236;
               }

               var25 = 0;
            }

            var12 = var25;
         }

         var12 += 2;
         var6.method_3786(var12);
         class_980.method_5642(var8, var6);
      }

      this.field_2895.method_87(0, var6);
      this.method_3650();
   }

   // $FF: renamed from: b (aN) void
   public void method_3647(class_16 var1) {
      super.method_3647(var1);
      var1.method_52(this, 0, this.field_2901);
   }

   // $FF: renamed from: a (int, int) void
   public void method_3662(int var1, int var2) {
      if(var1 == 0) {
         this.field_2901 = var2;
      }

   }

   // $FF: renamed from: a (yz) void
   public void method_3658(class_792 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3658(var1);
      String[] var2 = var10000;
      byte var5 = this.field_2897.field_1832;
      if(var2 != null) {
         if(this.field_2897.field_1832) {
            return;
         }

         var5 = 0;
      }

      int var3 = var5;

      while(var3 < this.field_2896.method_83()) {
         add var4 = this.field_2896.method_86(var3);
         if(var2 != null) {
            if(var4 != null) {
               var1.method_4570(var4, false);
            }

            ++var3;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      String[] var2 = class_752.method_4253();
      int var10000;
      if(this.field_2897.getBlock(this.field_2898, this.field_2899, this.field_2900) != class_1192.field_6169) {
         var10000 = 0;
      } else {
         double var3;
         var10000 = (var3 = var1.method_3889((double)this.field_2898 + 0.5D, (double)this.field_2899 + 0.5D, (double)this.field_2900 + 0.5D) - 64.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 != null) {
            var10000 = var10000 <= 0?1:0;
         }
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      add var4 = null;
      String[] var3 = var10000;
      class_492 var5 = (class_492)this.field_2869.get(var2);
      class_492 var7 = var5;
      if(var3 != null) {
         if(var5 == null) {
            return var4;
         }

         var7 = var5;
      }

      if(var3 != null) {
         if(!var7.method_2876()) {
            return var4;
         }

         var7 = var5;
      }

      add var6;
      int var8;
      label76: {
         label90: {
            var6 = var7.method_2875();
            var4 = var6.method_3754();
            var8 = var2;
            if(var3 != null) {
               if(var2 == 2) {
                  if(!this.method_3667(var6, 3, 39, true)) {
                     return null;
                  }

                  var5.method_2870(var6, var4);
                  if(var3 != null) {
                     break label90;
                  }
               }

               var8 = var2;
            }

            if(var3 != null) {
               label66: {
                  if(var8 != 0) {
                     var8 = var2;
                     if(var3 == null) {
                        break label66;
                     }

                     if(var2 != 1) {
                        var8 = var2;
                        if(var3 == null) {
                           break label76;
                        }

                        if(var2 >= 3) {
                           var8 = var2;
                           if(var3 == null) {
                              break label76;
                           }

                           if(var2 < 39) {
                              var8 = this.method_3667(var6, 0, 2, false);
                              if(var3 == null) {
                                 break label76;
                              }

                              if(var8 == 0) {
                                 return null;
                              }
                           }
                        }
                        break label90;
                     }
                  }

                  var8 = this.method_3667(var6, 3, 39, false);
               }
            }

            if(var3 == null) {
               break label76;
            }

            if(var8 == 0) {
               return null;
            }
         }

         var8 = var6.field_2958;
      }

      label47: {
         if(var8 == 0) {
            var5.method_2877((add)null);
            if(var3 != null) {
               break label47;
            }
         }

         var5.method_2878();
      }

      if(var6.field_2958 == var4.field_2958) {
         return null;
      } else {
         var5.method_2873(var1, var6);
         return var4;
      }
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_3689(String var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2903 = var1;
      String[] var2 = var10000;
      class_675 var4 = this;
      if(var2 != null) {
         if(this.method_3653(2).method_2876()) {
            label20: {
               add var3;
               label19: {
                  var3 = this.method_3653(2).method_2875();
                  if(var2 != null) {
                     if(!StringUtils.isBlank(var1)) {
                        break label19;
                     }

                     var3.method_3772();
                  }

                  if(var2 != null) {
                     break label20;
                  }
               }

               var3.method_3771(this.field_2903);
            }
         }

         var4 = this;
      }

      var4.method_3688();
   }

   // $FF: renamed from: b (Aw) vI
   static class_22 method_3690(class_675 var0) {
      return var0.field_2896;
   }

   // $FF: renamed from: c (Aw) int
   static int method_3691(class_675 var0) {
      return var0.field_2902;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3678() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "P£Ðd`¼1\"Ø¼fAÿ59þ";
      int var4 = "P£Ðd`¼1\"Ø¼fAÿ59þ".length();
      char var1 = 11;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2906 = var5;
                  String[] var10 = field_2906;
                  field_2905 = "CL_00001732";
                  field_2894 = LogManager.getLogger();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 246;
               break;
            case 1:
               var10009 = 10;
               break;
            case 2:
               var10009 = 106;
               break;
            case 3:
               var10009 = 177;
               break;
            case 4:
               var10009 = 181;
               break;
            case 5:
               var10009 = 105;
               break;
            default:
               var10009 = 228;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

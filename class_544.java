import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multisets;
import java.util.List;

// $FF: renamed from: bG
public class class_544 extends class_543 {

   // $FF: renamed from: n java.lang.String
   private static final String field_2399;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2400;


   // $FF: renamed from: <init> () void
   protected void method_2917() {
      super.method_2917();
      this.method_2933(true);
   }

   // $FF: renamed from: b (int, ahb) jQ
   public static class_1296 getBlock19(int var0, ahb var1) {
      String[] var10000 = class_752.method_4253();
      StringBuilder var10001 = new StringBuilder();
      String[] var10002 = field_2400;
      String var3 = var10001.append("map_").append(var0).toString();
      String[] var2 = var10000;
      class_1296 var4 = (class_1296)var1.method_2207(class_1296.class, var3);
      class_1296 var5 = var4;
      if(var2 != null) {
         if(var4 == null) {
            var5 = new class_1296;
            var5.method_6768(var3);
            var4 = var5;
            var1.method_2206(var3, var4);
         }

         var5 = var4;
      }

      return var5;
   }

   // $FF: renamed from: b (add, ahb) jQ
   public class_1296 getBlock20(add var1, ahb var2) {
      StringBuilder var10000 = new StringBuilder();
      String[] var7 = field_2400;
      String var4 = var10000.append("map_").append(var1.method_3745()).toString();
      class_1296 var5 = (class_1296)var2.method_2207(class_1296.class, var4);
      String[] var3 = class_752.method_4253();
      class_1296 var8 = var5;
      if(var3 != null) {
         if(var5 == null) {
            label16: {
               int var9 = var2.field_1832;
               if(var3 != null) {
                  if(var2.field_1832) {
                     break label16;
                  }

                  var1.method_3746(var2.method_2208("map"));
                  var4 = "map_" + var1.method_3745();
                  var8 = new class_1296;
                  var8.method_6768(var4);
                  var5 = var8;
                  var5.field_6654 = 3;
                  var9 = 128 * (1 << var5.field_6654);
               }

               int var6 = var9;
               var5.field_6651 = Math.round((float)var2.method_2195().method_6837() / (float)var6) * var6;
               var5.field_6652 = Math.round((float)(var2.method_2195().method_6839() / var6)) * var6;
               var5.field_6653 = (byte)var2.field_1820.field_5738;
               var5.method_6771();
               var2.method_2206(var4, var5);
            }
         }

         var8 = var5;
      }

      return var8;
   }

   // $FF: renamed from: b (ahb, sa, jQ) void
   public void getBlock21(ahb var1, class_689 var2, class_1296 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var1.field_1820.field_5738;
      if(var4 != null) {
         if(var1.field_1820.field_5738 != var3.field_6653) {
            return;
         }

         var10000 = var2 instanceof class_792;
      }

      if(var4 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = 1 << var3.field_6654;
      }

      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      label296: {
         var5 = var10000;
         var6 = var3.field_6651;
         var7 = var3.field_6652;
         var8 = class_1715.method_9561(var2.field_2994 - (double)var6) / var5 + 64;
         var9 = class_1715.method_9561(var2.field_2996 - (double)var7) / var5 + 64;
         var10 = 128 / var5;
         var10000 = var1.field_1820.field_5736;
         if(var4 != null) {
            if(!var1.field_1820.field_5736) {
               break label296;
            }

            var10000 = var10 / 2;
         }

         var10 = var10000;
      }

      class_1291 var11 = var3.method_6806((class_792)var2);
      ++var11.field_6628;
      int var12 = var8 - var10 + 1;

      while(var12 < var8 + var10) {
         label311: {
            var10000 = var12 & 15;
            if(var4 != null) {
               if(var10000 != (var11.field_6628 & 15)) {
                  break label311;
               }

               var10000 = 255;
            }

            int var13 = var10000;
            int var14 = 0;
            double var15 = 0.0D;
            int var17 = var9 - var10 - 1;

            while(true) {
               if(var17 < var9 + var10) {
                  var10000 = var12;
                  if(var4 == null) {
                     break;
                  }

                  label275: {
                     label313: {
                        if(var4 != null) {
                           if(var12 < 0) {
                              break label313;
                           }

                           var10000 = var17;
                        }

                        int var10001 = -1;
                        if(var4 != null) {
                           if(var10000 < -1) {
                              break label313;
                           }

                           var10000 = var12;
                           var10001 = 128;
                        }

                        if(var4 != null) {
                           if(var10000 >= var10001) {
                              break label313;
                           }

                           var10000 = var17;
                           var10001 = 128;
                        }

                        if(var4 != null) {
                           if(var10000 >= var10001) {
                              break label313;
                           }

                           var10000 = var12;
                           var10001 = var8;
                        }

                        int var18 = var10000 - var10001;
                        int var19 = var17 - var9;
                        var10000 = var18 * var18 + var19 * var19;
                        if(var4 != null) {
                           var10000 = var10000 > (var10 - 2) * (var10 - 2)?1:0;
                        }

                        int var20 = var10000;
                        int var21 = (var6 / var5 + var12 - 64) * var5;
                        int var22 = (var7 / var5 + var17 - 64) * var5;
                        HashMultiset var23 = HashMultiset.create();
                        class_1069 var24 = var1.method_2052(var21, var22);
                        if(var4 == null) {
                           break label275;
                        }

                        if(!var24.method_6050()) {
                           int var27;
                           double var28;
                           int var35;
                           label219: {
                              label315: {
                                 int var25 = var21 & 15;
                                 int var26 = var22 & 15;
                                 var27 = 0;
                                 var28 = 0.0D;
                                 byte var37 = var1.field_1820.field_5736;
                                 int var30;
                                 if(var4 != null) {
                                    if(var1.field_1820.field_5736) {
                                       var30 = var21 + var22 * 231871;
                                       var30 = var30 * var30 * 31287121 + var30 * 11;
                                       var10000 = var30 >> 20 & 1;
                                       if(var4 != null) {
                                          label187: {
                                             if(var10000 == 0) {
                                                var23.add(class_1192.field_6028.method_2425(0), 10);
                                                if(var4 != null) {
                                                   break label187;
                                                }
                                             }

                                             var23.add(class_1192.field_6026.method_2425(0), 100);
                                          }
                                       }

                                       var28 = 100.0D;
                                       if(var4 != null) {
                                          break label315;
                                       }
                                    }

                                    var37 = 0;
                                 }

                                 var30 = var37;

                                 label210:
                                 do {
                                    var10000 = var30;
                                    var10001 = var5;

                                    label207:
                                    while(true) {
                                       if(var10000 >= var10001) {
                                          break label210;
                                       }

                                       var10000 = 0;
                                       if(var4 == null) {
                                          break label219;
                                       }

                                       int var31 = 0;

                                       while(true) {
                                          if(var31 >= var5) {
                                             break label207;
                                          }

                                          int var32 = var24.method_6017(var30 + var25, var31 + var26) + 1;
                                          aji var33 = class_1192.field_6025;
                                          int var34 = 0;
                                          var10000 = var32;
                                          if(var4 != null) {
                                             label319: {
                                                var10001 = 1;
                                                if(var4 == null) {
                                                   break;
                                                }

                                                if(var32 > 1) {
                                                   label174:
                                                   while(true) {
                                                      --var32;
                                                      var33 = var24.method_6028(var30 + var25, var32, var31 + var26);
                                                      var34 = var24.method_6029(var30 + var25, var32, var31 + var26);
                                                      if(var33.method_2425(var34) != class_1319.field_6747 || var32 <= 0) {
                                                         while(var4 == null) {
                                                            if(var32 > 0) {
                                                               continue label174;
                                                            }
                                                         }

                                                         if(var4 == null) {
                                                            break label319;
                                                         }

                                                         if(var32 > 0) {
                                                            boolean var38 = var33.method_2424().method_5062();
                                                            if(var4 == null) {
                                                               break label319;
                                                            }

                                                            if(var38) {
                                                               var35 = var32 - 1;

                                                               aji var36;
                                                               do {
                                                                  var36 = var24.method_6028(var30 + var25, var35--, var31 + var26);
                                                                  ++var27;
                                                               } while(var35 > 0 && var36.method_2424().method_5062());
                                                            }
                                                         }
                                                         break;
                                                      }
                                                   }
                                                }

                                                var28 += (double)var32 / (double)(var5 * var5);
                                                var23.add(var33.method_2425(var34));
                                             }
                                          }

                                          ++var31;
                                          if(var4 == null) {
                                             break label207;
                                          }
                                       }
                                    }

                                    ++var30;
                                 } while(var4 != null);
                              }

                              var10000 = var27 / (var5 * var5);
                           }

                           var27 = var10000;
                           double var39 = (var28 - var15) * 4.0D / (double)(var5 + 4) + ((double)(var12 + var17 & 1) - 0.5D) * 0.4D;
                           int var40 = 1;
                           double var43;
                           var10000 = (var43 = var39 - 0.6D) == 0.0D?0:(var43 < 0.0D?-1:1);
                           if(var4 != null) {
                              if(var10000 > 0) {
                                 var40 = 2;
                              }

                              double var44;
                              var10000 = (var44 = var39 - -0.6D) == 0.0D?0:(var44 < 0.0D?-1:1);
                           }

                           label154: {
                              if(var4 != null) {
                                 if(var10000 >= 0) {
                                    break label154;
                                 }

                                 var10000 = 0;
                              }

                              var40 = var10000;
                           }

                           class_1319 var41;
                           label321: {
                              var41 = (class_1319)Iterables.getFirst(Multisets.copyHighestCountFirst(var23), class_1319.field_6747);
                              if(var4 != null) {
                                 if(var41 == class_1319.field_6759) {
                                    var39 = (double)var27 * 0.1D + (double)(var12 + var17 & 1) * 0.2D;
                                    var40 = 1;
                                    double var45;
                                    var10000 = (var45 = var39 - 0.5D) == 0.0D?0:(var45 < 0.0D?-1:1);
                                    if(var4 != null) {
                                       if(var10000 < 0) {
                                          var40 = 2;
                                       }

                                       double var46;
                                       var10000 = (var46 = var39 - 0.9D) == 0.0D?0:(var46 < 0.0D?-1:1);
                                    }

                                    if(var4 == null) {
                                       break label321;
                                    }

                                    if(var10000 > 0) {
                                       var40 = 0;
                                    }
                                 }

                                 var15 = var28;
                              }

                              if(var4 == null) {
                                 break label275;
                              }

                              var10000 = var17;
                           }

                           if(var10000 >= 0) {
                              label323: {
                                 var10000 = var18 * var18 + var19 * var19;
                                 if(var4 != null) {
                                    if(var10000 >= var10 * var10) {
                                       break label323;
                                    }

                                    var10000 = var20;
                                 }

                                 if(var4 != null) {
                                    label234: {
                                       if(var10000 != 0) {
                                          var10000 = var12 + var17 & 1;
                                          if(var4 == null) {
                                             break label234;
                                          }

                                          if(var10000 == 0) {
                                             break label323;
                                          }
                                       }

                                       var10000 = var3.field_6655[var12 + var17 * 128];
                                    }
                                 }

                                 var35 = var10000;
                                 byte var42 = (byte)(var41.field_6784 * 4 + var40);
                                 if(var4 == null) {
                                    break label275;
                                 }

                                 if(var35 != var42) {
                                    label147: {
                                       label324: {
                                          var10000 = var13;
                                          var10001 = var17;
                                          if(var4 != null) {
                                             if(var13 > var17) {
                                                var13 = var17;
                                             }

                                             var10000 = var14;
                                             if(var4 == null) {
                                                break label324;
                                             }

                                             var10001 = var17;
                                          }

                                          if(var10000 >= var10001) {
                                             break label147;
                                          }

                                          var10000 = var17;
                                       }

                                       var14 = var10000;
                                    }

                                    var3.field_6655[var12 + var17 * 128] = var42;
                                 }
                              }
                           }
                        }
                     }

                     ++var17;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               var10000 = var13;
               break;
            }

            if(var10000 <= var14) {
               var3.method_6804(var12, var13, var14);
            }
         }

         ++var12;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (add, ahb, sa, int, boolean) void
   public void method_2954(add var1, ahb var2, class_689 var3, int var4, boolean var5) {
      String[] var6 = class_752.method_4253();
      if(!var2.field_1832) {
         class_1296 var7 = this.getBlock20(var1, var2);
         boolean var10000 = var3 instanceof class_792;
         if(var6 != null) {
            if(var10000) {
               class_792 var8 = (class_792)var3;
               var7.method_6801(var8, var1);
            }

            var10000 = var5;
         }

         if(var10000) {
            this.getBlock21(var2, var3, var7);
         }
      }

   }

   // $FF: renamed from: e (add, ahb, yz) r1
   public class_250 getBlock18(add var1, ahb var2, class_792 var3) {
      byte[] var4 = this.getBlock20(var1, var2).method_6803(var1, var2, var3);
      class_327 var10000;
      if(var4 == null) {
         var10000 = null;
      } else {
         var10000 = new class_327;
         var10000.method_1850(var1.method_3745(), var4);
      }

      return var10000;
   }

   // $FF: renamed from: d (add, ahb, yz) void
   public void method_2955(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = var1.method_3766();
      String[] var7;
      if(var4 != null) {
         if(!var10000) {
            return;
         }

         class_1583 var8 = var1.method_3767();
         var7 = field_2400;
         var10000 = var8.method_8690("map_is_scaling");
      }

      if(var10000) {
         class_1296 var5 = class_1010.field_5215.getBlock20(var1, var2);
         var7 = field_2400;
         var1.method_3746(var2.method_2208("map"));
         class_1296 var9 = new class_1296;
         var9.method_6768("map_" + var1.method_3745());
         class_1296 var6 = var9;
         var6.field_6654 = (byte)(var5.field_6654 + 1);
         var9 = var6;
         if(var4 != null) {
            if(var6.field_6654 > 4) {
               var6.field_6654 = 4;
            }

            var6.field_6651 = var5.field_6651;
            var6.field_6652 = var5.field_6652;
            var6.field_6653 = var5.field_6653;
            var9 = var6;
         }

         var9.method_6771();
         StringBuilder var10001 = new StringBuilder();
         String[] var10002 = field_2400;
         var2.method_2206(var10001.append("map_").append(var1.method_3745()).toString(), var6);
      }

   }

   // $FF: renamed from: a (add, yz, java.util.List, boolean) void
   public void method_2963(add var1, class_792 var2, List var3, boolean var4) {
      String[] var10000 = class_752.method_4253();
      class_1296 var6 = this.getBlock20(var1, var2.field_2990);
      String[] var5 = var10000;
      if(var4) {
         String[] var7;
         if(var6 == null) {
            var7 = field_2400;
            var3.add("Unknown map");
            if(var5 != null) {
               return;
            }
         }

         StringBuilder var10001 = new StringBuilder();
         var7 = field_2400;
         var3.add(var10001.append("Scaling at 1:").append(1 << var6.field_6654).toString());
         var3.add("(Level " + var6.field_6654 + "/" + 4 + ")");
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      // $FF: Couldn't be decompiled
   }
}

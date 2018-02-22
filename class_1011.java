import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: cn
public class class_1011 {

   // $FF: renamed from: b java.lang.String
   public static final String field_5356;
   // $FF: renamed from: c java.lang.String
   public static final String field_5357;
   // $FF: renamed from: d java.lang.String
   public static final String field_5358;
   // $FF: renamed from: e java.lang.String
   public static final String field_5359;
   // $FF: renamed from: f java.lang.String
   public static final String field_5360;
   // $FF: renamed from: g java.lang.String
   public static final String field_5361;
   // $FF: renamed from: h java.lang.String
   public static final String field_5362;
   // $FF: renamed from: i java.lang.String
   public static final String field_5363;
   // $FF: renamed from: j java.lang.String
   public static final String field_5364;
   // $FF: renamed from: k java.lang.String
   public static final String field_5365;
   // $FF: renamed from: l java.lang.String
   public static final String field_5366;
   // $FF: renamed from: m java.lang.String
   public static final String field_5367;
   // $FF: renamed from: n java.lang.String
   public static final String field_5368;
   // $FF: renamed from: o java.lang.String
   public static final String field_5369;
   // $FF: renamed from: p java.lang.String
   public static final String field_5370;
   // $FF: renamed from: q java.util.HashMap
   private static final HashMap field_5371;
   // $FF: renamed from: r java.util.HashMap
   private static final HashMap field_5372;
   // $FF: renamed from: s java.util.HashMap
   private static final HashMap field_5373;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_5374;
   // $FF: renamed from: u java.lang.String
   private static final String field_5375;


   // $FF: renamed from: <init> () void
   public void method_5753() {
      super();
   }

   // $FF: renamed from: b (int, int) boolean
   public static boolean method_5754(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var0 & 1 << var1;
      if(var2 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d (int, int) int
   private static int method_5755(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = method_5754(var0, var1);
      if(var2 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return var10000;
   }

   // $FF: renamed from: e (int, int) int
   private static int method_5756(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = method_5754(var0, var1);
      if(var2 != null) {
         var10000 = var10000 != 0?0:1;
      }

      return var10000;
   }

   // $FF: renamed from: b (int) int
   public static int method_5757(int var0) {
      return method_5768(var0, 5, 4, 3, 2, 1);
   }

   // $FF: renamed from: b (java.util.Collection) int
   public static int method_5758(Collection var0) {
      int var2;
      int var12;
      label50: {
         String[] var10000 = class_752.method_4253();
         var2 = 3694022;
         String[] var1 = var10000;
         Collection var11 = var0;
         if(var1 != null) {
            if(var0 == null) {
               break label50;
            }

            var11 = var0;
         }

         var12 = var11.isEmpty();
         if(var1 == null) {
            return var12;
         }

         if(var12 == 0) {
            float var3 = 0.0F;
            float var4 = 0.0F;
            float var5 = 0.0F;
            float var6 = 0.0F;
            Iterator var7 = var0.iterator();

            label36:
            while(true) {
               if(var7.hasNext()) {
                  class_1645 var8 = (class_1645)var7.next();
                  int var9 = class_1635.field_8489[var8.method_9016()].method_8980();
                  var12 = 0;
                  if(var1 == null) {
                     break;
                  }

                  int var10 = 0;

                  while(var10 <= var8.method_9018()) {
                     var3 += (float)(var9 >> 16 & 255) / 255.0F;
                     var4 += (float)(var9 >> 8 & 255) / 255.0F;
                     var5 += (float)(var9 >> 0 & 255) / 255.0F;
                     ++var6;
                     ++var10;
                     if(var1 == null) {
                        continue label36;
                     }

                     if(var1 == null) {
                        break;
                     }
                  }

                  if(var1 != null) {
                     continue;
                  }
               }

               var3 = var3 / var6 * 255.0F;
               var4 = var4 / var6 * 255.0F;
               var5 = var5 / var6 * 255.0F;
               var12 = (int)var3 << 16 | (int)var4 << 8 | (int)var5;
               break;
            }

            return var12;
         }
      }

      var12 = var2;
      return var12;
   }

   // $FF: renamed from: c (java.util.Collection) boolean
   public static boolean method_5759(Collection var0) {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = var0.iterator();
      String[] var1 = var10000;

      boolean var4;
      while(true) {
         if(var2.hasNext()) {
            label30: {
               class_1645 var3 = (class_1645)var2.next();
               var4 = var3.method_9020();
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  if(var4) {
                     if(var1 != null) {
                        continue;
                     }
                     break label30;
                  }

                  var4 = false;
               }

               return var4;
            }
         }

         var4 = true;
         break;
      }

      return var4;
   }

   // $FF: renamed from: b (int, boolean) int
   public static int method_5760(int var0, boolean var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 == 0) {
            var10000 = field_5373.containsKey(Integer.valueOf(var0));
            if(var2 != null) {
               if(var10000 != 0) {
                  return ((Integer)field_5373.get(Integer.valueOf(var0))).intValue();
               }

               var10000 = method_5758(method_5765(var0, false));
            }

            int var3 = var10000;
            field_5373.put(Integer.valueOf(var0), Integer.valueOf(var3));
            return var3;
         }

         var10000 = method_5758(method_5765(var0, (boolean)var1));
      }

      return var10000;
   }

   // $FF: renamed from: d (int) java.lang.String
   public static String method_5761(int var0) {
      int var1 = method_5757(var0);
      return field_5374[var1];
   }

   // $FF: renamed from: b (boolean, boolean, boolean, int, int, int, int) int
   private static int method_5762(boolean var0, boolean var1, boolean var2, int var3, int var4, int var5, int var6) {
      int var10000;
      String[] var7;
      int var8;
      label88: {
         label91: {
            var8 = 0;
            var7 = class_752.method_4253();
            var10000 = var0;
            if(var7 != null) {
               if(var0 != 0) {
                  var8 = method_5756(var6, var4);
                  if(var7 != null) {
                     break label91;
                  }
               }

               var10000 = var3;
            }

            int var10001 = -1;
            if(var7 != null) {
               if(var10000 != -1) {
                  label76: {
                     var10000 = var3;
                     if(var7 != null) {
                        if(var3 == 0) {
                           var10000 = method_5763(var6);
                           var10001 = var4;
                           if(var7 == null) {
                              break label76;
                           }

                           if(var10000 == var4) {
                              var8 = 1;
                              if(var7 != null) {
                                 break label91;
                              }
                           }
                        }

                        var10000 = var3;
                     }

                     var10001 = 1;
                  }

                  if(var7 != null) {
                     label93: {
                        if(var10000 == var10001) {
                           var10000 = method_5763(var6);
                           var10001 = var4;
                           if(var7 == null) {
                              break label93;
                           }

                           if(var10000 > var4) {
                              var8 = 1;
                              if(var7 != null) {
                                 break label91;
                              }
                           }
                        }

                        var10000 = var3;
                        if(var7 == null) {
                           break label88;
                        }

                        var10001 = 2;
                     }
                  }

                  if(var10000 != var10001) {
                     break label91;
                  }

                  var10000 = method_5763(var6);
                  if(var7 == null) {
                     break label88;
                  }

                  if(var10000 >= var4) {
                     break label91;
                  }

                  var8 = 1;
                  if(var7 != null) {
                     break label91;
                  }
               }

               var10000 = var6;
               var10001 = var4;
            }

            var8 = method_5755(var10000, var10001);
         }

         var10000 = var1;
      }

      if(var7 != null) {
         if(var10000 != 0) {
            var8 *= var5;
         }

         var10000 = var2;
      }

      if(var7 != null) {
         if(var10000 != 0) {
            var8 *= -1;
         }

         var10000 = var8;
      }

      return var10000;
   }

   // $FF: renamed from: e (int) int
   private static int method_5763(int var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      int var3;
      while(true) {
         if(var0 > 0) {
            var3 = var0 & var0 - 1;
            if(var1 == null) {
               break;
            }

            var0 = var3;
            ++var2;
            if(var1 != null) {
               continue;
            }
         }

         var3 = var2;
         break;
      }

      return var3;
   }

   // $FF: renamed from: b (java.lang.String, int, int, int) int
   private static int method_5764(String var0, int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var1;
      if(var4 != null) {
         if(var1 < var0.length()) {
            var10000 = var2;
            if(var4 == null) {
               return var10000;
            }

            if(var2 >= 0) {
               var10000 = var1;
               if(var4 == null) {
                  return var10000;
               }

               if(var1 < var2) {
                  int var5 = var0.indexOf(124, var1);
                  var10000 = var5;
                  int var6;
                  int var7;
                  if(var4 != null) {
                     label251: {
                        if(var5 >= 0) {
                           var10000 = var5;
                           if(var4 == null) {
                              break label251;
                           }

                           if(var5 < var2) {
                              var6 = method_5764(var0, var1, var5 - 1, var3);
                              var10000 = var6;
                              if(var4 != null) {
                                 if(var6 > 0) {
                                    return var6;
                                 }

                                 var10000 = method_5764(var0, var5 + 1, var2, var3);
                              }

                              var7 = var10000;
                              var10000 = var7;
                              if(var4 != null) {
                                 var10000 = var7 > 0?var7:0;
                              }

                              return var10000;
                           }
                        }

                        var10000 = var0.indexOf(38, var1);
                     }
                  }

                  var6 = var10000;
                  var10000 = var6;
                  int var8;
                  if(var4 != null) {
                     label244: {
                        if(var6 >= 0) {
                           var10000 = var6;
                           if(var4 == null) {
                              break label244;
                           }

                           if(var6 < var2) {
                              var7 = method_5764(var0, var1, var6 - 1, var3);
                              var10000 = var7;
                              if(var4 != null) {
                                 if(var7 <= 0) {
                                    return 0;
                                 }

                                 var10000 = method_5764(var0, var6 + 1, var2, var3);
                              }

                              var8 = var10000;
                              var10000 = var8;
                              if(var4 != null) {
                                 if(var8 <= 0) {
                                    var10000 = 0;
                                    return var10000;
                                 }

                                 var10000 = var7;
                              }

                              if(var4 != null) {
                                 var10000 = var10000 > var8?var7:var8;
                              }

                              return var10000;
                           }
                        }

                        var10000 = 0;
                     }
                  }

                  var8 = var10000;
                  boolean var9 = false;
                  int var10 = 0;
                  int var11 = 0;
                  int var12 = 0;
                  int var13 = -1;
                  int var14 = 0;
                  int var15 = 0;
                  int var16 = 0;
                  int var17 = var1;

                  label236: {
                     int var10001;
                     while(true) {
                        if(var17 < var2) {
                           char var18 = var0.charAt(var17);
                           var10000 = var18;
                           var10001 = 48;
                           if(var4 == null) {
                              break;
                           }

                           label270: {
                              if(var4 != null) {
                                 label222: {
                                    if(var18 >= 48) {
                                       var10000 = var18;
                                       var10001 = 57;
                                       if(var4 == null) {
                                          break label222;
                                       }

                                       if(var18 <= 57) {
                                          var10000 = var8;
                                          if(var4 != null) {
                                             if(var8 != 0) {
                                                var15 = var18 - 48;
                                                var9 = true;
                                                if(var4 != null) {
                                                   break label270;
                                                }
                                             }

                                             var14 *= 10;
                                             var14 += var18 - 48;
                                             var10000 = 1;
                                          }

                                          var10 = var10000;
                                          if(var4 != null) {
                                             break label270;
                                          }
                                       }
                                    }

                                    var10000 = var18;
                                    var10001 = 42;
                                 }
                              }

                              if(var4 != null) {
                                 if(var10000 == var10001) {
                                    var8 = 1;
                                    if(var4 != null) {
                                       break label270;
                                    }
                                 }

                                 var10000 = var18;
                                 var10001 = 33;
                              }

                              if(var4 != null) {
                                 if(var10000 == var10001) {
                                    var10000 = var10;
                                    if(var4 != null) {
                                       if(var10 != 0) {
                                          var16 += method_5762((boolean)var11, var9, (boolean)var12, var13, var14, var15, var3);
                                          boolean var19 = false;
                                          var12 = 0;
                                          var8 = 0;
                                          var9 = false;
                                          var10 = 0;
                                          var15 = 0;
                                          var14 = 0;
                                          var13 = -1;
                                       }

                                       var10000 = 1;
                                    }

                                    var11 = var10000;
                                    if(var4 != null) {
                                       break label270;
                                    }
                                 }

                                 var10000 = var18;
                                 var10001 = 45;
                              }

                              label271: {
                                 if(var4 != null) {
                                    if(var10000 == var10001) {
                                       var10000 = var10;
                                       if(var4 != null) {
                                          if(var10 != 0) {
                                             var16 += method_5762((boolean)var11, var9, (boolean)var12, var13, var14, var15, var3);
                                             var11 = 0;
                                             boolean var20 = false;
                                             var8 = 0;
                                             var9 = false;
                                             var10 = 0;
                                             var15 = 0;
                                             var14 = 0;
                                             var13 = -1;
                                          }

                                          var10000 = 1;
                                       }

                                       var12 = var10000;
                                       if(var4 != null) {
                                          break label270;
                                       }
                                    }

                                    var10000 = var18;
                                    if(var4 == null) {
                                       break label271;
                                    }

                                    var10001 = 61;
                                 }

                                 if(var10000 != var10001) {
                                    var10000 = var18;
                                    if(var4 == null) {
                                       break label271;
                                    }

                                    if(var18 != 60) {
                                       var10000 = var18;
                                       if(var4 == null) {
                                          break label271;
                                       }

                                       if(var18 != 62) {
                                          var10000 = var18;
                                          if(var4 != null) {
                                             if(var18 != 43) {
                                                break label270;
                                             }

                                             var10000 = var10;
                                          }

                                          if(var4 != null) {
                                             if(var10000 == 0) {
                                                break label270;
                                             }

                                             var16 += method_5762((boolean)var11, var9, (boolean)var12, var13, var14, var15, var3);
                                             var11 = 0;
                                             var12 = 0;
                                             var8 = 0;
                                             var9 = false;
                                             var10 = 0;
                                             var15 = 0;
                                             var14 = 0;
                                             var10000 = -1;
                                          }

                                          var13 = var10000;
                                          if(var4 != null) {
                                             break label270;
                                          }
                                       }
                                    }
                                 }

                                 var10000 = var10;
                              }

                              if(var4 != null) {
                                 if(var10000 != 0) {
                                    var16 += method_5762((boolean)var11, var9, (boolean)var12, var13, var14, var15, var3);
                                    var11 = 0;
                                    var12 = 0;
                                    var8 = 0;
                                    var9 = false;
                                    var10 = 0;
                                    var15 = 0;
                                    var14 = 0;
                                    var13 = -1;
                                 }

                                 var10000 = var18;
                              }

                              byte var21 = 61;
                              if(var4 != null) {
                                 if(var10000 == 61) {
                                    var13 = 0;
                                    if(var4 != null) {
                                       break label270;
                                    }
                                 }

                                 var10000 = var18;
                                 var21 = 60;
                              }

                              label274: {
                                 if(var4 != null) {
                                    if(var10000 == var21) {
                                       var13 = 2;
                                       if(var4 != null) {
                                          break label270;
                                       }
                                    }

                                    var10000 = var18;
                                    if(var4 == null) {
                                       break label274;
                                    }

                                    var21 = 62;
                                 }

                                 if(var10000 != var21) {
                                    break label270;
                                 }

                                 var10000 = 1;
                              }

                              var13 = var10000;
                           }

                           ++var17;
                           if(var4 != null) {
                              continue;
                           }
                        }

                        var10000 = var10;
                        if(var4 == null) {
                           return var10000;
                        }

                        if(var10 == 0) {
                           break label236;
                        }

                        var10000 = var16;
                        var10001 = method_5762((boolean)var11, var9, (boolean)var12, var13, var14, var15, var3);
                        break;
                     }

                     var16 = var10000 + var10001;
                  }

                  var10000 = var16;
                  return var10000;
               }
            }
         }

         var10000 = 0;
      }

      return var10000;
   }

   // $FF: renamed from: c (int, boolean) java.util.List
   public static List method_5765(int var0, boolean var1) {
      ArrayList var3 = null;
      String[] var10000 = class_752.method_4253();
      class_1635[] var4 = class_1635.field_8489;
      int var5 = var4.length;
      String[] var2 = var10000;
      int var6 = 0;

      while(var6 < var5) {
         class_1635 var7 = var4[var6];
         if(var2 != null) {
            label93: {
               if(var7 != null) {
                  label102: {
                     Object var14 = var7;
                     if(var2 != null) {
                        if(var7.method_8979() && !var1) {
                           break label102;
                        }

                        var14 = field_5371.get(Integer.valueOf(var7.method_8966()));
                     }

                     String var8 = (String)var14;
                     if(var2 == null) {
                        break label93;
                     }

                     if(var8 != null) {
                        int var9 = method_5764(var8, 0, var8.length(), var0);
                        if(var2 == null) {
                           break label93;
                        }

                        if(var9 > 0) {
                           int var10;
                           int var16;
                           label77: {
                              label104: {
                                 var10 = 0;
                                 String var11 = (String)field_5372.get(Integer.valueOf(var7.method_8966()));
                                 String var15 = var11;
                                 if(var2 != null) {
                                    if(var11 == null) {
                                       break label104;
                                    }

                                    var15 = var11;
                                 }

                                 var10 = method_5764(var15, 0, var11.length(), var0);
                                 var16 = var10;
                                 if(var2 == null) {
                                    break label77;
                                 }

                                 if(var10 < 0) {
                                    var10 = 0;
                                 }
                              }

                              var16 = var7.method_8969();
                           }

                           label105: {
                              if(var2 != null) {
                                 if(var16 != 0) {
                                    var9 = 1;
                                    if(var2 != null) {
                                       break label105;
                                    }
                                 }

                                 var9 = 1200 * (var9 * 3 + (var9 - 1) * 2);
                                 var9 >>= var10;
                                 var9 = (int)Math.round((double)var9 * var7.method_8978());
                                 var16 = var0 & 16384;
                              }

                              if(var2 != null) {
                                 if(var16 == 0) {
                                    break label105;
                                 }

                                 var16 = (int)Math.round((double)var9 * 0.75D + 0.5D);
                              }

                              var9 = var16;
                           }

                           label55: {
                              ArrayList var17 = var3;
                              if(var2 != null) {
                                 if(var3 != null) {
                                    break label55;
                                 }

                                 var17 = new ArrayList();
                              }

                              var3 = var17;
                           }

                           class_1645 var13 = new class_1645;
                           var13.method_9012(var7.method_8966(), var9, var10);
                           class_1645 var12 = var13;
                           var16 = var0 & 16384;
                           if(var2 != null) {
                              if(var16 != 0) {
                                 var12.method_9019(true);
                              }

                              var3.add(var12);
                           }
                        }
                     }
                  }
               }

               ++var6;
            }
         }

         if(var2 == null) {
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: b (int, int, boolean, boolean, boolean) int
   private static int method_5766(int var0, int var1, boolean var2, boolean var3, boolean var4) {
      int var10000;
      label53: {
         String[] var5 = class_752.method_4253();
         var10000 = var4;
         if(var5 != null) {
            if(var4 != 0) {
               var10000 = method_5754(var0, var1);
               if(var5 == null) {
                  return var10000;
               }

               if(var10000 == 0) {
                  return 0;
               }
               break label53;
            }

            var10000 = var2;
         }

         if(var5 != null) {
            if(var10000 != 0) {
               var0 &= ~(1 << var1);
               if(var5 != null) {
                  break label53;
               }
            }

            var10000 = var3;
         }

         if(var5 != null) {
            if(var10000 != 0) {
               var10000 = var0 & 1 << var1;
               if(var5 != null) {
                  if(var10000 == 0) {
                     var0 |= 1 << var1;
                     if(var5 != null) {
                        break label53;
                     }
                  }

                  var10000 = var0 & ~(1 << var1);
               }

               var0 = var10000;
               if(var5 != null) {
                  break label53;
               }
            }

            var10000 = var0 | 1 << var1;
         }

         var0 = var10000;
      }

      var10000 = var0;
      return var10000;
   }

   // $FF: renamed from: b (int, java.lang.String) int
   public static int method_5767(int var0, String var1) {
      byte var3 = 0;
      int var4 = var1.length();
      String[] var10000 = class_752.method_4253();
      byte var5 = 0;
      String[] var2 = var10000;
      byte var6 = 0;
      byte var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = var3;

      int var15;
      short var10001;
      while(true) {
         if(var10 < var4) {
            char var11 = var1.charAt(var10);
            var15 = var11;
            var10001 = 48;
            if(var2 == null) {
               break;
            }

            label120: {
               if(var2 != null) {
                  label104: {
                     if(var11 >= 48) {
                        var15 = var11;
                        var10001 = 57;
                        if(var2 == null) {
                           break label104;
                        }

                        if(var11 <= 57) {
                           var9 *= 10;
                           var9 += var11 - 48;
                           var5 = 1;
                           if(var2 != null) {
                              break label120;
                           }
                        }
                     }

                     var15 = var11;
                     var10001 = 33;
                  }
               }

               byte var16;
               if(var2 != null) {
                  if(var15 == var10001) {
                     var16 = var5;
                     if(var2 != null) {
                        if(var5 != 0) {
                           var0 = method_5766(var0, var9, (boolean)var7, (boolean)var6, (boolean)var8);
                           var8 = 0;
                           boolean var12 = false;
                           var7 = 0;
                           var5 = 0;
                           var9 = 0;
                        }

                        var16 = 1;
                     }

                     var6 = var16;
                     if(var2 != null) {
                        break label120;
                     }
                  }

                  var15 = var11;
                  var10001 = 45;
               }

               if(var2 != null) {
                  if(var15 == var10001) {
                     var16 = var5;
                     if(var2 != null) {
                        if(var5 != 0) {
                           var0 = method_5766(var0, var9, (boolean)var7, (boolean)var6, (boolean)var8);
                           var8 = 0;
                           var6 = 0;
                           boolean var13 = false;
                           var5 = 0;
                           var9 = 0;
                        }

                        var16 = 1;
                     }

                     var7 = var16;
                     if(var2 != null) {
                        break label120;
                     }
                  }

                  var15 = var11;
                  var10001 = 43;
               }

               label121: {
                  if(var2 != null) {
                     if(var15 == var10001) {
                        var16 = var5;
                        if(var2 != null) {
                           if(var5 == 0) {
                              break label120;
                           }

                           var0 = method_5766(var0, var9, (boolean)var7, (boolean)var6, (boolean)var8);
                           var8 = 0;
                           var6 = 0;
                           var7 = 0;
                           var5 = 0;
                           var16 = 0;
                        }

                        var9 = var16;
                        if(var2 != null) {
                           break label120;
                        }
                     }

                     var15 = var11;
                     if(var2 == null) {
                        break label121;
                     }

                     var10001 = 38;
                  }

                  if(var15 != var10001) {
                     break label120;
                  }

                  var15 = var5;
               }

               if(var2 != null) {
                  if(var15 != 0) {
                     var0 = method_5766(var0, var9, (boolean)var7, (boolean)var6, (boolean)var8);
                     boolean var14 = false;
                     var6 = 0;
                     var7 = 0;
                     var5 = 0;
                     var9 = 0;
                  }

                  var15 = 1;
               }

               var8 = var15;
            }

            ++var10;
            if(var2 != null) {
               continue;
            }
         }

         var15 = var5;
         if(var2 == null) {
            return var15;
         }

         if(var5 != 0) {
            var0 = method_5766(var0, var9, (boolean)var7, (boolean)var6, (boolean)var8);
         }

         var15 = var0;
         var10001 = 32767;
         break;
      }

      var15 &= var10001;
      return var15;
   }

   // $FF: renamed from: b (int, int, int, int, int, int) int
   public static int method_5768(int var0, int var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = method_5754(var0, var1);
      if(var6 != null) {
         var10000 = var10000 != 0?16:0;
      }

      int var10001 = method_5754(var0, var2);
      if(var6 != null) {
         var10001 = var10001 != 0?8:0;
      }

      var10000 |= var10001;
      var10001 = method_5754(var0, var3);
      if(var6 != null) {
         var10001 = var10001 != 0?4:0;
      }

      var10000 |= var10001;
      var10001 = method_5754(var0, var4);
      if(var6 != null) {
         var10001 = var10001 != 0?2:0;
      }

      var10000 |= var10001;
      var10001 = method_5754(var0, var5);
      if(var6 != null) {
         var10001 = var10001 != 0?1:0;
      }

      return var10000 | var10001;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5769() {
      // $FF: Couldn't be decompiled
   }
}

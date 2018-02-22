import java.util.List;
import java.util.Random;

// $FF: renamed from: eC
public class class_456 extends class_446 implements class_27 {

   // $FF: renamed from: N java.lang.String[]
   public static final String[] field_2210;
   // $FF: renamed from: O vL[]
   private static final class_73[] field_2211;


   // $FF: renamed from: <init> () void
   protected void method_2770() {
      super.method_2770();
      float var1 = 0.4F;
      this.method_2443(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var1 * 2.0F, 0.5F + var1);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         super.method_2456(var1, var2, var3, var4, var5);
         var10000 = var1.method_2069(var2, var3 + 1, var4);
      }

      if(var6 != null) {
         if(var10000 < 9) {
            return;
         }

         var10000 = var5.nextInt(7);
      }

      if(var10000 == 0) {
         this.method_2791(var1, var2, var3, var4, var5);
      }

   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      var2 &= 7;
      return field_2211[class_1715.method_9568(var2, 0, 5)];
   }

   // $FF: renamed from: d (ahb, int, int, int, java.util.Random) void
   public void method_2791(ahb var1, int var2, int var3, int var4, Random var5) {
      label16: {
         String[] var10000 = class_752.method_4253();
         int var7 = var1.method_33(var2, var3, var4);
         String[] var6 = var10000;
         int var8 = var7 & 8;
         if(var6 != null) {
            if(var8 != 0) {
               break label16;
            }

            var1.method_2055(var2, var3, var4, var7 | 8, 4);
         }

         if(var6 != null) {
            return;
         }
      }

      this.method_2792(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: e (ahb, int, int, int, java.util.Random) void
   public void method_2792(ahb var1, int var2, int var3, int var4, Random var5) {
      int var7 = var1.method_33(var2, var3, var4) & 7;
      String[] var6 = class_752.method_4253();
      Object var10000;
      if(var5.nextInt(10) == 0) {
         var10000 = new class_1174;
         ((class_1174)var10000).method_6350(true);
      } else {
         var10000 = new class_1163;
         ((class_1163)var10000).method_6350(true);
      }

      Object var8;
      int var9;
      int var10;
      byte var11;
      byte var14;
      label277: {
         int var13;
         label272: {
            label278: {
               label270: {
                  label279: {
                     var8 = var10000;
                     var9 = 0;
                     var10 = 0;
                     var11 = 0;
                     var13 = var7;
                     if(var6 != null) {
                        switch(var7) {
                        case 0:
                        default:
                           break label277;
                        case 1:
                           var13 = 0;
                           break;
                        case 2:
                           break label279;
                        case 3:
                           break label270;
                        case 4:
                           break label278;
                        case 5:
                           break label272;
                        }
                     }

                     var9 = var13;

                     label236:
                     while(true) {
                        var13 = var9;

                        label233:
                        while(var13 >= -1) {
                           var14 = 0;
                           if(var6 == null) {
                              break label236;
                           }

                           var10 = 0;

                           while(var10 >= -1) {
                              var13 = this.method_2793(var1, var2 + var9, var3, var4 + var10, 1);
                              if(var6 == null) {
                                 continue label233;
                              }

                              label283: {
                                 if(var6 != null) {
                                    if(var13 == 0) {
                                       break label283;
                                    }

                                    var13 = this.method_2793(var1, var2 + var9 + 1, var3, var4 + var10, 1);
                                 }

                                 if(var6 != null) {
                                    if(var13 == 0) {
                                       break label283;
                                    }

                                    var13 = this.method_2793(var1, var2 + var9, var3, var4 + var10 + 1, 1);
                                 }

                                 if(var6 != null) {
                                    if(var13 == 0) {
                                       break label283;
                                    }

                                    var13 = this.method_2793(var1, var2 + var9 + 1, var3, var4 + var10 + 1, 1);
                                 }

                                 if(var13 != 0) {
                                    class_1171 var15 = new class_1171;
                                    var15.method_6377(false, var5.nextBoolean());
                                    var8 = var15;
                                    var11 = 1;
                                    if(var6 != null) {
                                       break label233;
                                    }
                                 }
                              }

                              --var10;
                              if(var6 == null) {
                                 break;
                              }
                           }

                           --var9;
                           if(var6 != null) {
                              continue label236;
                           }
                           break;
                        }

                        var14 = var11;
                        break;
                     }

                     if(var6 != null) {
                        if(var14 != 0) {
                           break label277;
                        }

                        var14 = var10 = 0;
                     }

                     var9 = var14;
                     class_1166 var16 = new class_1166;
                     var16.method_6350(true);
                     var8 = var16;
                     if(var6 != null) {
                        break label277;
                     }
                  }

                  class_1173 var17 = new class_1173;
                  var17.method_6383(true, false);
                  var8 = var17;
                  if(var6 != null) {
                     break label277;
                  }
               }

               var9 = 0;

               label197:
               while(true) {
                  var13 = var9;

                  label194:
                  while(var13 >= -1) {
                     var14 = 0;
                     if(var6 == null) {
                        break label197;
                     }

                     var10 = 0;

                     while(var10 >= -1) {
                        var13 = this.method_2793(var1, var2 + var9, var3, var4 + var10, 3);
                        if(var6 == null) {
                           continue label194;
                        }

                        label287: {
                           if(var6 != null) {
                              if(var13 == 0) {
                                 break label287;
                              }

                              var13 = this.method_2793(var1, var2 + var9 + 1, var3, var4 + var10, 3);
                           }

                           if(var6 != null) {
                              if(var13 == 0) {
                                 break label287;
                              }

                              var13 = this.method_2793(var1, var2 + var9, var3, var4 + var10 + 1, 3);
                           }

                           if(var6 != null) {
                              if(var13 == 0) {
                                 break label287;
                              }

                              var13 = this.method_2793(var1, var2 + var9 + 1, var3, var4 + var10 + 1, 3);
                           }

                           if(var13 != 0) {
                              class_1172 var18 = new class_1172;
                              var18.method_6370(true, 10, 20, 3, 3);
                              var8 = var18;
                              var11 = 1;
                              if(var6 != null) {
                                 break label194;
                              }
                           }
                        }

                        --var10;
                        if(var6 == null) {
                           break;
                        }
                     }

                     --var9;
                     if(var6 != null) {
                        continue label197;
                     }
                     break;
                  }

                  var14 = var11;
                  break;
               }

               if(var6 != null) {
                  if(var14 != 0) {
                     break label277;
                  }

                  var14 = var10 = 0;
               }

               var9 = var14;
               class_1163 var19 = new class_1163;
               var19.method_6364(true, 4 + var5.nextInt(7), 3, 3, false);
               var8 = var19;
               if(var6 != null) {
                  break label277;
               }
            }

            class_1167 var20 = new class_1167;
            var20.method_6350(true);
            var8 = var20;
            if(var6 != null) {
               break label277;
            }
         }

         var9 = 0;

         label157:
         while(true) {
            var13 = var9;

            label154:
            while(var13 >= -1) {
               var14 = 0;
               if(var6 == null) {
                  break label157;
               }

               var10 = 0;

               while(var10 >= -1) {
                  var13 = this.method_2793(var1, var2 + var9, var3, var4 + var10, 5);
                  if(var6 == null) {
                     continue label154;
                  }

                  label291: {
                     if(var6 != null) {
                        if(var13 == 0) {
                           break label291;
                        }

                        var13 = this.method_2793(var1, var2 + var9 + 1, var3, var4 + var10, 5);
                     }

                     if(var6 != null) {
                        if(var13 == 0) {
                           break label291;
                        }

                        var13 = this.method_2793(var1, var2 + var9, var3, var4 + var10 + 1, 5);
                     }

                     if(var6 != null) {
                        if(var13 == 0) {
                           break label291;
                        }

                        var13 = this.method_2793(var1, var2 + var9 + 1, var3, var4 + var10 + 1, 5);
                     }

                     if(var13 != 0) {
                        class_1168 var21 = new class_1168;
                        var21.method_6350(true);
                        var8 = var21;
                        var11 = 1;
                        if(var6 != null) {
                           break label154;
                        }
                     }
                  }

                  --var10;
                  if(var6 == null) {
                     break;
                  }
               }

               --var9;
               if(var6 != null) {
                  continue label157;
               }
               break;
            }

            var14 = var11;
            break;
         }

         if(var14 == 0) {
            return;
         }
      }

      aji var12 = class_1192.field_6025;
      if(var6 != null) {
         label116: {
            if(var11 != 0) {
               var1.method_2054(var2 + var9, var3, var4 + var10, var12, 0, 4);
               var1.method_2054(var2 + var9 + 1, var3, var4 + var10, var12, 0, 4);
               var1.method_2054(var2 + var9, var3, var4 + var10 + 1, var12, 0, 4);
               var1.method_2054(var2 + var9 + 1, var3, var4 + var10 + 1, var12, 0, 4);
               if(var6 != null) {
                  break label116;
               }
            }

            var1.method_2054(var2, var3, var4, var12, 0, 4);
         }
      }

      var14 = ((class_1151)var8).method_6351(var1, var5, var2 + var9, var3, var4 + var10);
      if(var6 != null) {
         if(var14 != 0) {
            return;
         }

         var14 = var11;
      }

      if(var6 != null) {
         if(var14 != 0) {
            var1.method_2054(var2 + var9, var3, var4 + var10, this, var7, 4);
            var1.method_2054(var2 + var9 + 1, var3, var4 + var10, this, var7, 4);
            var1.method_2054(var2 + var9, var3, var4 + var10 + 1, this, var7, 4);
            var1.method_2054(var2 + var9 + 1, var3, var4 + var10 + 1, this, var7, 4);
            if(var6 != null) {
               return;
            }
         }

         var1.method_2054(var2, var3, var4, this, var7, 4);
      }

   }

   // $FF: renamed from: h (ahb, int, int, int, int) boolean
   public boolean method_2793(ahb var1, int var2, int var3, int var4, int var5) {
      int var7;
      label24: {
         String[] var6 = class_752.method_4253();
         ahb var10000 = var1;
         int var10001 = var2;
         int var10002 = var3;
         int var10003 = var4;
         if(var6 != null) {
            if(var1.getBlock(var2, var3, var4) != this) {
               break label24;
            }

            var10000 = var1;
            var10001 = var2;
            var10002 = var3;
            var10003 = var4;
         }

         var7 = var10000.method_33(var10001, var10002, var10003) & 7;
         if(var6 == null) {
            return (boolean)var7;
         }

         if(var7 == var5) {
            var7 = 1;
            return (boolean)var7;
         }
      }

      var7 = 0;
      return (boolean)var7;
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return class_1715.method_9568(var1 & 7, 0, 5);
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 1);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 2);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 3);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 4);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 5);
      var3.add(var10001);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < field_2211.length) {
         field_2211[var3] = var1.method_375(this.method_2533() + "_" + field_2210[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, boolean) boolean
   public boolean method_121(ahb var1, int var2, int var3, int var4, boolean var5) {
      return true;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_122(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      double var7;
      int var10000 = (var7 = (double)var1.field_1819.nextFloat() - 0.45D) == 0.0D?0:(var7 < 0.0D?-1:1);
      if(var6 != null) {
         var10000 = var10000 < 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (ahb, java.util.Random, int, int, int) void
   public void method_123(ahb var1, Random var2, int var3, int var4, int var5) {
      this.method_2791(var1, var3, var4, var5, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

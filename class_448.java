import java.util.List;
import java.util.Random;

// $FF: renamed from: ey
public class class_448 extends class_446 implements class_27 {

   // $FF: renamed from: N java.lang.String[]
   public static final String[] field_2194;
   // $FF: renamed from: O vL[]
   private class_73[] field_2195;
   // $FF: renamed from: P vL[]
   private class_73[] field_2196;
   // $FF: renamed from: Q vL[]
   public class_73[] field_2197;
   // $FF: renamed from: R java.lang.String[]
   private static final String[] field_2198;


   // $FF: renamed from: <init> () void
   public void method_2770() {
      super.method_2427(awt.field_4180);
      this.method_2437(0.0F);
      this.method_2428(field_1979);
      String[] var10001 = field_2198;
      this.method_2508("doublePlant");
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 40;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: f (ahl, int, int, int) int
   public int method_2776(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var7 = method_2777(var6);
      if(var5 != null) {
         if(var7 == 0) {
            return var6 & 7;
         }

         var7 = var1.method_33(var2, var3 - 1, var4) & 7;
      }

      return var7;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      boolean var10000;
      label24: {
         String[] var5 = class_752.method_4253();
         var10000 = super.method_2480(var1, var2, var3, var4);
         if(var5 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = var1.method_34(var2, var3 + 1, var4);
         }

         if(var5 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   protected void method_2772(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = this.method_2505(var1, var2, var3, var4);
      if(var5 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var6 = var10000;
      boolean var7 = method_2777(var6);
      if(var5 != null) {
         ahb var8;
         int var10001;
         int var10002;
         int var10003;
         label21: {
            if(!var7) {
               this.method_2466(var1, var2, var3, var4, var6, 0);
               var8 = var1;
               var10001 = var2;
               var10002 = var3 + 1;
               var10003 = var4;
               if(var5 == null) {
                  break label21;
               }

               if(var1.getBlock(var2, var10002, var4) == this) {
                  var1.method_2054(var2, var3 + 1, var4, class_1192.field_6025, 0, 2);
               }
            }

            var8 = var1;
            var10001 = var2;
            var10002 = var3;
            var10003 = var4;
         }

         var8.method_2054(var10001, var10002, var10003, class_1192.field_6025, 0, 2);
      }

   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      if(method_2777(var6)) {
         return var1.getBlock(var2, var3 - 1, var4) == this;
      } else {
         boolean var7;
         if(var1.getBlock(var2, var3 + 1, var4) == this) {
            var7 = super.method_2505(var1, var2, var3, var4);
            if(var5 == null) {
               return var7;
            }

            if(var7) {
               var7 = true;
               return var7;
            }
         }

         var7 = false;
         return var7;
      }
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = method_2777(var1);
      if(var4 != null) {
         if(var10000 != 0) {
            return null;
         }

         var10000 = method_2778(var1);
      }

      int var5 = var10000;
      var10000 = var5;
      byte var10001 = 3;
      if(var4 != null) {
         if(var5 == 3) {
            return null;
         }

         var10000 = var5;
         var10001 = 2;
      }

      if(var10000 != var10001) {
         return adb.method_2920(this);
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = method_2777(var1);
      if(var2 != null) {
         if(var10000 != 0) {
            return 0;
         }

         var10000 = var1 & 7;
      }

      return var10000;
   }

   // $FF: renamed from: b (int) boolean
   public static boolean method_2777(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0 & 8;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (int) int
   public static int method_2778(int var0) {
      return var0 & 7;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return method_2777(var2)?this.field_2195[0]:this.field_2195[var2 & 7];
   }

   // $FF: renamed from: b (boolean, int) vL
   public class_73 method_2779(boolean var1, int var2) {
      return var1?this.field_2196[var2]:this.field_2195[var2];
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = this.method_2776(var1, var2, var3, var4);
      String[] var5 = var10000;
      int var7 = var6;
      if(var5 != null) {
         if(var6 != 2) {
            label16: {
               var7 = var6;
               if(var5 != null) {
                  if(var6 == 3) {
                     break label16;
                  }

                  var7 = 16777215;
               }

               return var7;
            }
         }

         var7 = var1.method_35(var2, var4).method_5715(var2, var3, var4);
      }

      return var7;
   }

   // $FF: renamed from: d (ahb, int, int, int, int, int) void
   public void method_2780(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      var1.method_2054(var2, var3, var4, this, var5, var6);
      var1.method_2054(var2, var3 + 1, var4, this, 8, var6);
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      int var7 = ((class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.method_2054(var2, var3 + 1, var4, this, 8 | var7, 2);
   }

   // $FF: renamed from: a (ahb, yz, int, int, int, int) void
   public void method_2501(ahb var1, class_792 var2, int var3, int var4, int var5, int var6) {
      ahb var10001;
      class_448 var9;
      label33: {
         String[] var7 = class_752.method_4253();
         if(!var1.field_1832) {
            label31: {
               add var10000 = var2.method_4593();
               if(var7 != null) {
                  if(var10000 == null) {
                     break label31;
                  }

                  var10000 = var2.method_4593();
               }

               if(var10000.method_3730() == class_1010.field_5216) {
                  label25: {
                     boolean var8 = method_2777(var6);
                     if(var7 != null) {
                        if(var8) {
                           break label25;
                        }

                        var9 = this;
                        var10001 = var1;
                        if(var7 == null) {
                           break label33;
                        }

                        var8 = this.method_2781(var1, var3, var4, var5, var6, var2);
                     }

                     if(var8) {
                        return;
                     }
                  }
               }
            }
         }

         var9 = this;
         var10001 = var1;
      }

      var9.method_2501(var10001, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, yz) void
   public void method_2522(ahb var1, int var2, int var3, int var4, int var5, class_792 var6) {
      label77: {
         String[] var7 = class_752.method_4253();
         boolean var10000 = method_2777(var5);
         if(var7 != null) {
            if(var10000) {
               if(var1.getBlock(var2, var3 - 1, var4) != this) {
                  break label77;
               }

               if(var7 != null) {
                  if(!var6.field_3640.field_2839) {
                     label62: {
                        label80: {
                           int var8 = var1.method_33(var2, var3 - 1, var4);
                           int var9 = method_2778(var8);
                           int var10 = var9;
                           if(var7 != null) {
                              if(var9 != 3) {
                                 if(var7 == null) {
                                    break label62;
                                 }

                                 if(var9 != 2) {
                                    break label80;
                                 }
                              }

                              var10 = var1.field_1832;
                           }

                           if(var7 != null) {
                              if(var10 == 0) {
                                 label46: {
                                    add var11 = var6.method_4593();
                                    if(var7 != null) {
                                       if(var11 == null) {
                                          break label46;
                                       }

                                       var11 = var6.method_4593();
                                    }

                                    if(var11.method_3730() == class_1010.field_5216) {
                                       this.method_2781(var1, var2, var3, var4, var8, var6);
                                    }
                                 }
                              }

                              var1.method_2056(var2, var3 - 1, var4);
                           }

                           if(var7 != null) {
                              break label62;
                           }
                        }

                        var1.method_2057(var2, var3 - 1, var4, true);
                     }

                     if(var7 != null) {
                        break label77;
                     }
                  }

                  var1.method_2056(var2, var3 - 1, var4);
               }

               if(var7 != null) {
                  break label77;
               }
            }

            var10000 = var6.field_3640.field_2839;
         }

         if(var10000) {
            label40: {
               ahb var12 = var1;
               int var10001 = var2;
               int var10002 = var3 + 1;
               int var10003 = var4;
               if(var7 != null) {
                  if(var1.getBlock(var2, var10002, var4) != this) {
                     break label40;
                  }

                  var12 = var1;
                  var10001 = var2;
                  var10002 = var3 + 1;
                  var10003 = var4;
               }

               var12.method_2054(var10001, var10002, var10003, class_1192.field_6025, 0, 2);
            }
         }
      }

      super.method_2522(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: c (ahb, int, int, int, int, yz) boolean
   private boolean method_2781(ahb var1, int var2, int var3, int var4, int var5, class_792 var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = method_2778(var5);
      String[] var7 = var10000;
      int var10 = var8;
      if(var7 != null) {
         if(var8 != 3) {
            label24: {
               var10 = var8;
               if(var7 != null) {
                  if(var8 == 2) {
                     break label24;
                  }

                  var10 = 0;
               }

               return (boolean)var10;
            }
         }

         var6.method_4615(class_1698.field_8908[aji.method_2415(this)], 1);
         var10 = 1;
      }

      int var9 = var10;
      var10 = var8;
      if(var7 != null) {
         if(var8 == 3) {
            var9 = 2;
         }

         add var10005 = new add;
         var10005.method_3723(class_1192.field_6058, 2, var9);
         this.method_2468(var1, var2, var3, var4, var10005);
         var10 = 1;
      }

      return (boolean)var10;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2195 = new class_73[field_2194.length];
      String[] var10000 = class_752.method_4253();
      this.field_2196 = new class_73[field_2194.length];
      int var3 = 0;
      String[] var2 = var10000;

      while(true) {
         String[] var4;
         if(var3 < this.field_2195.length) {
            class_73[] var5 = this.field_2195;
            StringBuilder var10003 = new StringBuilder();
            var4 = field_2198;
            var5[var3] = var1.method_375(var10003.append("double_plant_").append(field_2194[var3]).append("_bottom").toString());
            this.field_2196[var3] = var1.method_375("double_plant_" + field_2194[var3] + "_top");
            ++var3;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.field_2197 = new class_73[2];
         var4 = field_2198;
         this.field_2197[0] = var1.method_375("double_plant_sunflower_front");
         this.field_2197[1] = var1.method_375("double_plant_sunflower_back");
         break;
      }

   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < this.field_2195.length) {
         add var10001 = new add;
         var10001.method_3726(var1, 1, var5);
         var3.add(var10001);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: k (ahb, int, int, int) int
   public int method_2518(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var7 = method_2777(var6);
      if(var5 != null) {
         if(var7 != 0) {
            return method_2778(var1.method_33(var2, var3 - 1, var4));
         }

         var7 = method_2778(var6);
      }

      return var7;
   }

   // $FF: renamed from: b (ahb, int, int, int, boolean) boolean
   public boolean method_121(ahb var1, int var2, int var3, int var4, boolean var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = this.method_2776(var1, var2, var3, var4);
      String[] var6 = var10000;
      int var8 = var7;
      if(var6 != null) {
         if(var7 != 2) {
            label16: {
               var8 = var7;
               if(var6 != null) {
                  if(var7 == 3) {
                     break label16;
                  }

                  var8 = 1;
               }

               return (boolean)var8;
            }
         }

         var8 = 0;
      }

      return (boolean)var8;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_122(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   // $FF: renamed from: c (ahb, java.util.Random, int, int, int) void
   public void method_123(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = this.method_2776(var1, var3, var4, var5);
      add var10005 = new add;
      var10005.method_3723(this, 1, var6);
      this.method_2468(var1, var3, var4, var5, var10005);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

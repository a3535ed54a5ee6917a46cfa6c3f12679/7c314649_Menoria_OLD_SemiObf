import java.util.List;
import java.util.Random;

// $FF: renamed from: fa
public abstract class class_378 extends aji {

   // $FF: renamed from: M boolean
   protected final boolean field_2052;


   // $FF: renamed from: <init> (boolean, awt) void
   public void method_2583(boolean var1, awt var2) {
      label15: {
         String[] var10000 = class_752.method_4253();
         super.method_2427(var2);
         String[] var3 = var10000;
         class_378 var4 = this;
         if(var3 != null) {
            this.field_2052 = var1;
            if(var1) {
               this.field_1988 = true;
               if(var3 != null) {
                  break label15;
               }
            }

            var4 = this;
         }

         var4.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.method_2429(255);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = this.field_2052;
      if(var5 != null) {
         if(this.field_2052) {
            this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            if(var5 != null) {
               return;
            }
         }

         var10000 = var1.method_33(var2, var3, var4) & 8;
      }

      if(var5 != null) {
         var10000 = var10000 != 0?1:0;
      }

      label27: {
         int var6 = var10000;
         if(var5 != null) {
            if(var6 == 0) {
               break label27;
            }

            this.method_2443(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
         }

         if(var5 != null) {
            return;
         }
      }

      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      String[] var1 = class_752.method_4253();
      class_378 var10000 = this;
      if(var1 != null) {
         if(this.field_2052) {
            this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            if(var1 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      this.method_2486(var1, var2, var3, var4);
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return this.field_2052;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      String[] var10 = class_752.method_4253();
      int var10000 = this.field_2052;
      if(var10 != null) {
         if(this.field_2052) {
            return var9;
         }

         var10000 = var5;
      }

      if(var10 != null) {
         if(var10000 != 0) {
            label30: {
               var10000 = var5;
               if(var10 != null) {
                  if(var5 != 1) {
                     double var11;
                     var10000 = (var11 = (double)var7 - 0.5D) == 0.0D?0:(var11 < 0.0D?-1:1);
                     if(var10 == null) {
                        return var10000;
                     }

                     if(var10000 > 0) {
                        break label30;
                     }
                  }

                  var10000 = var9;
               }

               return var10000;
            }
         }

         var10000 = var9 | 8;
      }

      return var10000;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      String[] var2 = class_752.method_4253();
      byte var10000 = this.field_2052;
      if(var2 != null) {
         if(this.field_2052) {
            return 2;
         }

         var10000 = 1;
      }

      return var10000;
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1 & 7;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return this.field_2052;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.field_2052;
      if(var6 != null) {
         if(this.field_2052) {
            return super.method_2445(var1, var2, var3, var4, var5);
         }

         var10000 = var5;
      }

      if(var6 != null) {
         label118: {
            if(var10000 != 1) {
               var10000 = var5;
               if(var6 == null) {
                  break label118;
               }

               if(var5 != 0) {
                  var10000 = super.method_2445(var1, var2, var3, var4, var5);
                  if(var6 == null) {
                     break label118;
                  }

                  if(var10000 == 0) {
                     return false;
                  }
               }
            }

            var10000 = var2;
         }
      }

      int var7 = var10000;
      var7 += class_1707.field_8947[class_1707.field_8946[var5]];
      int var8 = var3 + class_1707.field_8948[class_1707.field_8946[var5]];
      int var9 = var4 + class_1707.field_8949[class_1707.field_8946[var5]];
      var10000 = var1.method_33(var7, var8, var9) & 8;
      if(var6 != null) {
         var10000 = var10000 != 0?1:0;
      }

      int var10 = var10000;
      var10000 = var10;
      if(var6 != null) {
         if(var10 != 0) {
            var10000 = var5;
            if(var6 != null) {
               if(var5 == 0) {
                  return true;
               }

               var10000 = var5;
            }

            if(var6 != null) {
               label86: {
                  if(var10000 == 1) {
                     var10000 = super.method_2445(var1, var2, var3, var4, var5);
                     if(var6 == null) {
                        break label86;
                     }

                     if(var10000 != 0) {
                        return true;
                     }
                  }

                  var10000 = method_2584(var1.getBlock(var2, var3, var4));
               }
            }

            if(var6 != null) {
               if(var10000 != 0) {
                  var10000 = var1.method_33(var2, var3, var4) & 8;
                  if(var6 == null) {
                     return (boolean)var10000;
                  }

                  if(var10000 != 0) {
                     var10000 = 0;
                     return (boolean)var10000;
                  }
               }

               var10000 = 1;
            }

            return (boolean)var10000;
         }

         var10000 = var5;
      }

      if(var6 != null) {
         if(var10000 == 1) {
            return true;
         }

         var10000 = var5;
      }

      if(var6 != null) {
         label104: {
            if(var10000 == 0) {
               var10000 = super.method_2445(var1, var2, var3, var4, var5);
               if(var6 == null) {
                  break label104;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = method_2584(var1.getBlock(var2, var3, var4));
         }
      }

      if(var6 != null) {
         if(var10000 != 0) {
            var10000 = var1.method_33(var2, var3, var4) & 8;
            if(var6 == null) {
               return (boolean)var10000;
            }

            if(var10000 == 0) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d (aji) boolean
   private static boolean method_2584(aji var0) {
      boolean var2;
      label17: {
         String[] var1 = class_752.method_4253();
         aji var10000 = var0;
         class_378 var10001 = class_1192.field_6071;
         if(var1 != null) {
            if(var0 == class_1192.field_6071) {
               break label17;
            }

            var10000 = var0;
            var10001 = class_1192.field_6150;
         }

         if(var10000 != var10001) {
            var2 = false;
            return var2;
         }
      }

      var2 = true;
      return var2;
   }

   // $FF: renamed from: c (int) java.lang.String
   public abstract String method_2585(int var1);

   // $FF: renamed from: k (ahb, int, int, int) int
   public int method_2518(ahb var1, int var2, int var3, int var4) {
      return super.method_2518(var1, var2, var3, var4) & 7;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      class_378 var10000 = this;
      if(var5 != null) {
         if(method_2584(this)) {
            return adb.method_2920(this);
         }

         var10000 = this;
      }

      class_378 var10001 = class_1192.field_6070;
      if(var5 != null) {
         if(var10000 == class_1192.field_6070) {
            return adb.method_2920(class_1192.field_6071);
         }

         var10000 = this;
         if(var5 == null) {
            return adb.method_2920(var10000);
         }

         var10001 = class_1192.field_6149;
      }

      if(var10000 == var10001) {
         return adb.method_2920(class_1192.field_6150);
      } else {
         var10000 = class_1192.field_6071;
         return adb.method_2920(var10000);
      }
   }
}

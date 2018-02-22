import java.util.Random;

// $FF: renamed from: fj
public class class_371 extends aji {

   // $FF: renamed from: M java.lang.String[]
   private static final String[] field_2038;
   // $FF: renamed from: N int
   private final int field_2039;
   // $FF: renamed from: O vL[]
   private IIcon[] field_2040;
   // $FF: renamed from: P vL
   private IIcon field_2041;
   // $FF: renamed from: Q vL
   private IIcon field_2042;
   // $FF: renamed from: R java.lang.String[]
   private static final String[] field_2043;


   // $FF: renamed from: <init> (awt, int) void
   public void method_2574(awt var1, int var2) {
      super.method_2427(var1);
      this.field_2039 = var2;
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      byte var10001 = 10;
      if(var3 != null) {
         label143: {
            if(var2 == 10) {
               var10000 = var1;
               var10001 = 1;
               if(var3 == null) {
                  break label143;
               }

               if(var1 > 1) {
                  return this.field_2041;
               }
            }

            var10000 = var2;
            var10001 = 1;
         }
      }

      if(var3 != null) {
         label136: {
            if(var10000 >= var10001) {
               var10000 = var2;
               var10001 = 9;
               if(var3 == null) {
                  break label136;
               }

               if(var2 <= 9) {
                  var10000 = var1;
                  var10001 = 1;
                  if(var3 == null) {
                     break label136;
                  }

                  if(var1 == 1) {
                     return this.field_2040[this.field_2039];
                  }
               }
            }

            var10000 = var2;
            var10001 = 1;
         }
      }

      if(var3 != null) {
         label126: {
            if(var10000 >= var10001) {
               var10000 = var2;
               var10001 = 3;
               if(var3 == null) {
                  break label126;
               }

               if(var2 <= 3) {
                  var10000 = var1;
                  var10001 = 2;
                  if(var3 == null) {
                     break label126;
                  }

                  if(var1 == 2) {
                     return this.field_2040[this.field_2039];
                  }
               }
            }

            var10000 = var2;
            var10001 = 7;
         }
      }

      if(var3 != null) {
         label116: {
            if(var10000 >= var10001) {
               var10000 = var2;
               var10001 = 9;
               if(var3 == null) {
                  break label116;
               }

               if(var2 <= 9) {
                  var10000 = var1;
                  var10001 = 3;
                  if(var3 == null) {
                     break label116;
                  }

                  if(var1 == 3) {
                     return this.field_2040[this.field_2039];
                  }
               }
            }

            var10000 = var2;
            var10001 = 1;
         }
      }

      label107: {
         label147: {
            if(var3 != null) {
               label104: {
                  if(var10000 != var10001) {
                     var10000 = var2;
                     var10001 = 4;
                     if(var3 == null) {
                        break label104;
                     }

                     if(var2 != 4) {
                        var10000 = var2;
                        var10001 = 7;
                        if(var3 == null) {
                           break label107;
                        }

                        if(var2 != 7) {
                           break label147;
                        }
                     }
                  }

                  var10000 = var1;
                  var10001 = 4;
               }
            }

            if(var3 == null) {
               break label107;
            }

            if(var10000 == var10001) {
               return this.field_2040[this.field_2039];
            }
         }

         var10000 = var2;
         var10001 = 3;
      }

      label90: {
         label148: {
            if(var3 != null) {
               label87: {
                  if(var10000 != var10001) {
                     var10000 = var2;
                     var10001 = 6;
                     if(var3 == null) {
                        break label87;
                     }

                     if(var2 != 6) {
                        var10000 = var2;
                        var10001 = 9;
                        if(var3 == null) {
                           break label90;
                        }

                        if(var2 != 9) {
                           break label148;
                        }
                     }
                  }

                  var10000 = var1;
                  var10001 = 5;
               }
            }

            if(var3 == null) {
               break label90;
            }

            if(var10000 == var10001) {
               return this.field_2040[this.field_2039];
            }
         }

         var10000 = var2;
         var10001 = 14;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return this.field_2040[this.field_2039];
         }

         var10000 = var2;
         var10001 = 15;
      }

      return var10000 == var10001?this.field_2041:this.field_2042;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      int var3 = var1.nextInt(10) - 7;
      String[] var2 = class_752.method_4253();
      int var10000 = var3;
      if(var2 != null) {
         if(var3 < 0) {
            var3 = 0;
         }

         var10000 = var3;
      }

      return var10000;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return adb.method_2919(aji.method_2415(class_1192.field_6066) + this.field_2039);
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return adb.method_2919(aji.method_2415(class_1192.field_6066) + this.field_2039);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2040 = new IIcon[field_2038.length];
      String[] var2 = class_752.method_4253();
      int var3 = 0;

      while(true) {
         if(var3 < this.field_2040.length) {
            this.field_2040[var3] = var1.method_375(this.method_2533() + "_" + field_2038[var3]);
            ++var3;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         StringBuilder var10002 = (new StringBuilder()).append(this.method_2533()).append("_");
         String[] var4 = field_2043;
         this.field_2042 = var1.method_375(var10002.append("inside").toString());
         this.field_2041 = var1.method_375(this.method_2533() + "_" + "skin_stem");
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

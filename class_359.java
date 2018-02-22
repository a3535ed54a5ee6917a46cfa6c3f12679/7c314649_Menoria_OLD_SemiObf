import java.util.List;

// $FF: renamed from: fy
public class class_359 extends aji {

   // $FF: renamed from: M java.lang.String[]
   public static final String[] field_2014;
   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2015;
   // $FF: renamed from: O vL[]
   private class_73[] field_2016;
   // $FF: renamed from: P vL
   private class_73 field_2017;
   // $FF: renamed from: Q vL
   private class_73 field_2018;
   // $FF: renamed from: R vL
   private class_73 field_2019;
   // $FF: renamed from: S vL
   private class_73 field_2020;
   // $FF: renamed from: T java.lang.String[]
   private static final String[] field_2021;


   // $FF: renamed from: <init> () void
   public void method_2542() {
      super.method_2427(awt.field_4174);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      byte var10001 = 2;
      if(var3 != null) {
         label150: {
            if(var2 != 2) {
               var10000 = var2;
               var10001 = 3;
               if(var3 == null) {
                  break label150;
               }

               if(var2 != 3) {
                  label154: {
                     var10000 = var2;
                     var10001 = 4;
                     if(var3 != null) {
                        if(var2 == 4) {
                           break label154;
                        }

                        var10000 = var1;
                        var10001 = 1;
                     }

                     if(var3 != null) {
                        if(var10000 != var10001) {
                           label171: {
                              var10000 = var1;
                              if(var3 != null) {
                                 label85: {
                                    if(var1 == 0) {
                                       var10000 = var2;
                                       if(var3 == null) {
                                          break label85;
                                       }

                                       if(var2 == 1) {
                                          break label171;
                                       }
                                    }

                                    var10000 = var1;
                                 }
                              }

                              if(var3 != null) {
                                 if(var10000 == 0) {
                                    return this.field_2020;
                                 }

                                 var10000 = var2;
                              }

                              if(var3 != null) {
                                 label73: {
                                    if(var10000 >= 0) {
                                       var10000 = var2;
                                       if(var3 == null) {
                                          break label73;
                                       }

                                       if(var2 < this.field_2016.length) {
                                          return this.field_2016[var2];
                                       }
                                    }

                                    var10000 = 0;
                                 }
                              }

                              var2 = var10000;
                              return this.field_2016[var2];
                           }
                        }

                        var10000 = var2;
                        var10001 = 1;
                     }

                     if(var10000 == var10001) {
                        return this.field_2017;
                     }

                     return this.field_2019;
                  }
               }
            }

            var10000 = var2;
            var10001 = 2;
         }
      }

      if(var3 != null) {
         label136: {
            if(var10000 == var10001) {
               var10000 = var1;
               if(var3 != null) {
                  if(var1 == 1) {
                     return this.field_2018;
                  }

                  var10000 = var1;
               }

               if(var3 == null) {
                  break label136;
               }

               if(var10000 == 0) {
                  return this.field_2018;
               }
            }

            var10000 = var2;
         }

         var10001 = 3;
      }

      if(var3 != null) {
         label120: {
            if(var10000 == var10001) {
               var10000 = var1;
               var10001 = 5;
               if(var3 != null) {
                  if(var1 == 5) {
                     return this.field_2018;
                  }

                  var10000 = var1;
                  var10001 = 4;
               }

               if(var3 == null) {
                  break label120;
               }

               if(var10000 == var10001) {
                  return this.field_2018;
               }
            }

            var10000 = var2;
            var10001 = 4;
         }
      }

      if(var3 != null) {
         if(var10000 != var10001) {
            return this.field_2016[var2];
         }

         var10000 = var1;
         var10001 = 2;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return this.field_2018;
         }

         var10000 = var1;
         var10001 = 3;
      }

      if(var10000 != var10001) {
         return this.field_2016[var2];
      } else {
         return this.field_2018;
      }
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      String[] var10 = class_752.method_4253();
      int var10000 = var9;
      if(var10 != null) {
         if(var9 == 2) {
            var10000 = var5;
            if(var10 == null) {
               return var10000;
            }

            switch(var5) {
            case 2:
            case 3:
               var9 = 4;
               if(var10 != null) {
                  break;
               }
            case 4:
            case 5:
               var9 = 3;
               if(var10 != null) {
                  break;
               }
            case 0:
            case 1:
               var9 = 2;
            }
         }

         var10000 = var9;
      }

      return var10000;
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 != 3) {
            label16: {
               var10000 = var1;
               if(var2 != null) {
                  if(var1 == 4) {
                     break label16;
                  }

                  var10000 = var1;
               }

               return var10000;
            }
         }

         var10000 = 2;
      }

      return var10000;
   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      label15: {
         String[] var2 = class_752.method_4253();
         int var10000 = var1;
         byte var10001 = 3;
         if(var2 != null) {
            if(var1 == 3) {
               break label15;
            }

            var10000 = var1;
            var10001 = 4;
         }

         if(var10000 != var10001) {
            return super.method_2503(var1);
         }
      }

      add var3 = new add;
      var3.method_3726(adb.method_2920(this), 1, 2);
      return var3;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 39;
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
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2016 = new class_73[field_2015.length];
      String[] var2 = var10000;
      int var3 = 0;

      while(true) {
         if(var3 < this.field_2016.length) {
            if(var2 == null) {
               break;
            }

            label19: {
               if(field_2015[var3] == null) {
                  this.field_2016[var3] = this.field_2016[var3 - 1];
                  if(var2 != null) {
                     break label19;
                  }
               }

               this.field_2016[var3] = var1.method_375(this.method_2533() + "_" + field_2015[var3]);
            }

            ++var3;
            if(var2 != null) {
               continue;
            }
         }

         StringBuilder var10002 = (new StringBuilder()).append(this.method_2533()).append("_");
         String[] var4 = field_2021;
         this.field_2019 = var1.method_375(var10002.append("top").toString());
         this.field_2017 = var1.method_375(this.method_2533() + "_" + "chiseled_top");
         this.field_2018 = var1.method_375(this.method_2533() + "_" + "lines_top");
         this.field_2020 = var1.method_375(this.method_2533() + "_" + "bottom");
         break;
      }

   }

   // $FF: renamed from: f (int) jj
   public class_1319 method_2425(int var1) {
      return class_1319.field_6761;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

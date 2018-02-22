import java.util.Iterator;
import java.util.List;

// $FF: renamed from: gk
public class class_596 extends class_580 implements class_22 {

   // $FF: renamed from: m v0[][]
   public static final class_1635[][] field_2547;
   // $FF: renamed from: n long
   private long field_2548;
   // $FF: renamed from: o float
   private float field_2549;
   // $FF: renamed from: p boolean
   private boolean field_2550;
   // $FF: renamed from: q int
   private int field_2551;
   // $FF: renamed from: r int
   private int field_2552;
   // $FF: renamed from: s int
   private int field_2553;
   // $FF: renamed from: t add
   private add field_2554;
   // $FF: renamed from: u java.lang.String
   private String field_2555;
   // $FF: renamed from: v java.lang.String
   private static final String field_2556;
   // $FF: renamed from: w java.lang.String[]
   private static final String[] field_2557;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      this.field_2551 = -1;
   }

   // $FF: renamed from: g () void
   public void getBlock94() {
      String[] var1 = class_752.method_4253();
      class_596 var10000 = this;
      if(var1 != null) {
         if(this.field_2464.method_2184() % 80L != 0L) {
            return;
         }

         this.method_3175();
         var10000 = this;
      }

      var10000.method_3174();
   }

   // $FF: renamed from: b () void
   private void method_3174() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2550;
      if(var1 != null) {
         if(!this.field_2550) {
            return;
         }

         var10000 = this.field_2551;
      }

      if(var1 != null) {
         if(var10000 <= 0) {
            return;
         }

         var10000 = this.field_2464.field_1832;
      }

      if(var1 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = this.field_2552;
      }

      if(var1 != null) {
         if(var10000 <= 0) {
            return;
         }

         var10000 = this.field_2551 * 10 + 10;
      }

      double var2 = (double)var10000;
      byte var4 = 0;
      var10000 = this.field_2551;
      if(var1 != null) {
         label68: {
            if(this.field_2551 >= 4) {
               var10000 = this.field_2552;
               if(var1 == null) {
                  break label68;
               }

               if(this.field_2552 == this.field_2553) {
                  var4 = 1;
               }
            }

            var10000 = this.field_2465;
         }
      }

      class_1343 var5 = class_1343.method_7093((double)var10000, (double)this.field_2466, (double)this.field_2467, (double)(this.field_2465 + 1), (double)(this.field_2466 + 1), (double)(this.field_2467 + 1)).method_7097(var2, var2, var2);
      var5.field_6913 = (double)this.field_2464.method_36();
      List var6 = this.field_2464.method_2157(class_792.class, var5);
      Iterator var7 = var6.iterator();

      while(true) {
         class_1645 var10001;
         class_792 var8;
         if(var7.hasNext()) {
            var8 = (class_792)var7.next();
            var10001 = new class_1645;
            var10001.method_9013(this.field_2552, 180, var4, true);
            var8.method_4179(var10001);
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         label94: {
            var10000 = this.field_2551;
            int var9 = 4;
            if(var1 != null) {
               if(this.field_2551 < 4) {
                  break;
               }

               var10000 = this.field_2552;
               if(var1 == null) {
                  break label94;
               }

               var9 = this.field_2553;
            }

            if(var10000 == var9) {
               break;
            }

            var10000 = this.field_2553;
         }

         if(var10000 > 0) {
            var7 = var6.iterator();

            while(var7.hasNext()) {
               var8 = (class_792)var7.next();
               var10001 = new class_1645;
               var10001.method_9013(this.field_2553, 180, 0, true);
               var8.method_4179(var10001);
               if(var1 == null) {
                  return;
               }
            }
         }
         break;
      }

   }

   // $FF: renamed from: d () void
   private void method_3175() {
      String[] var1;
      int var2;
      int var12;
      label142: {
         label145: {
            String[] var10000 = class_752.method_4253();
            var2 = this.field_2551;
            var1 = var10000;
            byte var11 = this.field_2464.method_2067(this.field_2465, this.field_2466 + 1, this.field_2467);
            if(var1 != null) {
               if(var11 == 0) {
                  this.field_2550 = false;
                  this.field_2551 = 0;
                  if(var1 != null) {
                     break label145;
                  }
               }

               this.field_2550 = true;
               this.field_2551 = 0;
               var11 = 1;
            }

            int var3 = var11;

            while(true) {
               if(var3 <= 4) {
                  label146: {
                     int var4 = this.field_2466 - var3;
                     var12 = var4;
                     if(var1 == null) {
                        break;
                     }

                     if(var1 != null) {
                        if(var4 < 0 && var1 != null) {
                           break label146;
                        }

                        var12 = 1;
                     }

                     int var5 = var12;
                     int var6 = this.field_2465 - var3;

                     while(true) {
                        if(var6 <= this.field_2465 + var3) {
                           var12 = var5;
                           if(var1 == null || var1 == null) {
                              break;
                           }

                           if(var5 != 0) {
                              int var7 = this.field_2467 - var3;

                              while(true) {
                                 if(var7 <= this.field_2467 + var3) {
                                    label149: {
                                       aji var8 = this.field_2464.getBlock(var6, var4, var7);
                                       if(var1 == null) {
                                          break;
                                       }

                                       if(var1 != null) {
                                          if(var8 != class_1192.field_6157) {
                                             label150: {
                                                aji var14 = var8;
                                                aji var10001 = class_1192.field_6068;
                                                if(var1 != null) {
                                                   if(var8 == class_1192.field_6068) {
                                                      break label150;
                                                   }

                                                   var14 = var8;
                                                   var10001 = class_1192.field_6084;
                                                }

                                                if(var1 != null) {
                                                   if(var14 == var10001) {
                                                      break label150;
                                                   }

                                                   var14 = var8;
                                                   var10001 = class_1192.field_6069;
                                                }

                                                if(var14 != var10001) {
                                                   var5 = 0;
                                                   if(var1 != null) {
                                                      break label149;
                                                   }
                                                }
                                             }
                                          }

                                          ++var7;
                                       }

                                       if(var1 != null) {
                                          continue;
                                       }
                                    }
                                 }

                                 ++var6;
                                 break;
                              }

                              if(var1 != null) {
                                 continue;
                              }
                           }
                        }

                        var12 = var5;
                        break;
                     }

                     if(var12 != 0 || var1 == null) {
                        this.field_2551 = var3++;
                        if(var1 != null) {
                           continue;
                        }
                     }
                  }
               }

               var12 = this.field_2551;
               break;
            }

            if(var1 == null) {
               break label142;
            }

            if(var12 == 0) {
               this.field_2550 = false;
            }
         }

         var12 = this.field_2464.field_1832;
      }

      if(var1 != null) {
         if(var12 != 0) {
            return;
         }

         var12 = this.field_2551;
      }

      int var13 = 4;
      if(var1 != null) {
         if(var12 != 4) {
            return;
         }

         var12 = var2;
         var13 = this.field_2551;
      }

      if(var12 < var13) {
         Iterator var9 = this.field_2464.method_2157(class_792.class, class_1343.method_7093((double)this.field_2465, (double)this.field_2466, (double)this.field_2467, (double)this.field_2465, (double)(this.field_2466 - 4), (double)this.field_2467).method_7097(10.0D, 5.0D, 10.0D)).iterator();

         while(var9.hasNext()) {
            class_792 var10 = (class_792)var9.next();
            var10.method_4614(class_1600.field_8361);
            if(var1 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: e () float
   public float method_3176() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2550;
      if(var1 != null) {
         if(!this.field_2550) {
            return 0.0F;
         }

         var10000 = (int)(this.field_2464.method_2184() - this.field_2548);
      }

      int var2 = var10000;
      this.field_2548 = this.field_2464.method_2184();
      var10000 = var2;
      float var3;
      if(var1 != null) {
         label39: {
            if(var2 > 1) {
               this.field_2549 -= (float)var2 / 40.0F;
               float var4;
               var10000 = (var4 = this.field_2549 - 0.0F) == 0.0F?0:(var4 < 0.0F?-1:1);
               if(var1 == null) {
                  break label39;
               }

               if(var10000 < 0) {
                  this.field_2549 = 0.0F;
               }
            }

            this.field_2549 += 0.025F;
            var3 = this.field_2549;
            if(var1 == null) {
               return var3;
            }

            float var5;
            var10000 = (var5 = this.field_2549 - 1.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
         }
      }

      if(var10000 > 0) {
         this.field_2549 = 1.0F;
      }

      var3 = this.field_2549;
      return var3;
   }

   // $FF: renamed from: r () int
   public int method_3177() {
      return this.field_2552;
   }

   // $FF: renamed from: x () int
   public int method_3178() {
      return this.field_2553;
   }

   // $FF: renamed from: y () int
   public int method_3179() {
      return this.field_2551;
   }

   // $FF: renamed from: a (int) void
   public void method_3180(int var1) {
      this.field_2551 = var1;
   }

   // $FF: renamed from: b (int) void
   public void method_3181(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2552 = 0;
      String[] var2 = var10000;
      int var3 = 0;

      do {
         int var8 = var3;
         int var10001 = this.field_2551;

         label36:
         while(true) {
            if(var8 >= var10001 || var3 >= 3) {
               return;
            }

            class_1635[] var4 = field_2547[var3];
            int var5 = var4.length;
            int var6 = 0;

            while(true) {
               if(var6 >= var5) {
                  break label36;
               }

               class_1635 var7 = var4[var6];
               if(var2 != null) {
                  var8 = var7.field_8526;
                  var10001 = var1;
                  if(var2 == null) {
                     break;
                  }

                  if(var7.field_8526 == var1) {
                     this.field_2552 = var1;
                     return;
                  }

                  ++var6;
               }

               if(var2 == null) {
                  break label36;
               }
            }
         }

         ++var3;
      } while(var2 != null);

   }

   // $FF: renamed from: d (int) void
   public void method_3182(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2553 = 0;
      String[] var2 = var10000;
      int var8 = this.field_2551;
      if(var2 != null) {
         if(this.field_2551 < 4) {
            return;
         }

         var8 = 0;
      }

      int var3 = var8;

      do {
         var8 = var3;
         int var10001 = 4;

         label36:
         while(true) {
            if(var8 >= var10001) {
               return;
            }

            class_1635[] var4 = field_2547[var3];
            int var5 = var4.length;
            int var6 = 0;

            while(true) {
               if(var6 >= var5) {
                  break label36;
               }

               class_1635 var7 = var4[var6];
               if(var2 != null) {
                  var8 = var7.field_8526;
                  var10001 = var1;
                  if(var2 == null) {
                     break;
                  }

                  if(var7.field_8526 == var1) {
                     this.field_2553 = var1;
                     return;
                  }

                  ++var6;
               }

               if(var2 == null) {
                  break label36;
               }
            }
         }

         ++var3;
      } while(var2 != null);

   }

   // $FF: renamed from: q () r1
   public class_250 method_3100() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var1 = var10000;
      this.getBlock93(var1);
      class_299 var2 = new class_299;
      var2.method_1710(this.field_2465, this.field_2466, this.field_2467, 3, var1);
      return var2;
   }

   // $FF: renamed from: o () double
   public double getBlock98() {
      return 65536.0D;
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      super.getBlock92(var1);
      String[] var2 = field_2557;
      this.field_2552 = var1.method_8681("Primary");
      this.field_2553 = var1.method_8681("Secondary");
      this.field_2551 = var1.method_8681("Levels");
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      String[] var2 = field_2557;
      var1.method_8667("Primary", this.field_2552);
      var1.method_8667("Secondary", this.field_2553);
      var1.method_8667("Levels", this.field_2551);
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return 1;
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return var1 == 0?this.field_2554:null;
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      if(var1 == 0 && this.field_2554 != null) {
         if(var2 >= this.field_2554.field_2958) {
            add var3 = this.field_2554;
            this.field_2554 = null;
            return var3;
         } else {
            this.field_2554.field_2958 -= var2;
            add var10000 = new add;
            var10000.method_3726(this.field_2554.method_3730(), var2, this.field_2554.method_3745());
            return var10000;
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      String[] var2 = class_752.method_4253();
      if(var1 == 0) {
         add var10000 = this.field_2554;
         if(var2 != null) {
            if(this.field_2554 == null) {
               return null;
            }

            var10000 = this.field_2554;
         }

         add var3 = var10000;
         this.field_2554 = null;
         return var3;
      } else {
         return null;
      }
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      if(var1 == 0) {
         this.field_2554 = var2;
      }

   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      String[] var1 = class_752.method_4253();
      class_596 var10000 = this;
      String var2;
      if(var1 != null) {
         if(!this.method_89()) {
            String[] var3 = field_2557;
            var2 = "container.beacon";
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_2555;
      return var2;
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      int var2;
      label24: {
         String[] var1 = class_752.method_4253();
         String var10000 = this.field_2555;
         if(var1 != null) {
            if(this.field_2555 == null) {
               break label24;
            }

            var10000 = this.field_2555;
         }

         var2 = var10000.length();
         if(var1 == null) {
            return (boolean)var2;
         }

         if(var2 > 0) {
            var2 = 1;
            return (boolean)var2;
         }
      }

      var2 = 0;
      return (boolean)var2;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_3183(String var1) {
      this.field_2555 = var1;
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 1;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      String[] var2 = class_752.method_4253();
      int var10000;
      if(this.field_2464.method_31(this.field_2465, this.field_2466, this.field_2467) != this) {
         var10000 = 0;
      } else {
         double var3;
         var10000 = (var3 = var1.method_3889((double)this.field_2465 + 0.5D, (double)this.field_2466 + 0.5D, (double)this.field_2467 + 0.5D) - 64.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 != null) {
            var10000 = var10000 <= 0?1:0;
         }
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: m () void
   public void method_93() {}

   // $FF: renamed from: n () void
   public void method_94() {}

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      boolean var4;
      label36: {
         String[] var3 = class_752.method_4253();
         adb var10000 = var2.method_3730();
         adb var10001 = class_1010.field_5244;
         if(var3 != null) {
            if(var10000 == class_1010.field_5244) {
               break label36;
            }

            var10000 = var2.method_3730();
            var10001 = class_1010.field_5122;
         }

         if(var3 != null) {
            if(var10000 == var10001) {
               break label36;
            }

            var10000 = var2.method_3730();
            var10001 = class_1010.field_5124;
         }

         if(var3 != null) {
            if(var10000 == var10001) {
               break label36;
            }

            var10000 = var2.method_3730();
            var10001 = class_1010.field_5123;
         }

         if(var10000 != var10001) {
            var4 = false;
            return var4;
         }
      }

      var4 = true;
      return var4;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      // $FF: Couldn't be decompiled
   }
}

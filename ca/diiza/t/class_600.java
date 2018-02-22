package ca.diiza.t;

import ca.diiza.a.class_491;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: ca.diiza.t.a
public class class_600 extends class_580 implements class_22 {

   // $FF: renamed from: a add[]
   private add[] field_2569;
   // $FF: renamed from: m boolean
   public boolean field_2570;
   // $FF: renamed from: n ca.diiza.t.a
   public class_600 field_2571;
   // $FF: renamed from: o ca.diiza.t.a
   public class_600 field_2572;
   // $FF: renamed from: p ca.diiza.t.a
   public class_600 field_2573;
   // $FF: renamed from: q ca.diiza.t.a
   public class_600 field_2574;
   // $FF: renamed from: r float
   public float field_2575;
   // $FF: renamed from: s float
   public float field_2576;
   // $FF: renamed from: t int
   public int field_2577;
   // $FF: renamed from: u int
   private int field_2578;
   // $FF: renamed from: v int
   private int field_2579;
   // $FF: renamed from: w java.lang.String
   private String field_2580;
   // $FF: renamed from: x int
   private static int field_2581;
   // $FF: renamed from: y java.lang.String[]
   private static final String[] field_2582;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      this.field_2569 = new add[54];
      this.field_2579 = -1;
   }

   // $FF: renamed from: <init> (int) void
   public void method_3197(int var1) {
      super.getBlock88();
      this.field_2569 = new add[54];
      this.field_2579 = var1;
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return 54;
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return this.field_2569[var1];
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      int var3 = method_3203();
      add var10000 = this.field_2569[var1];
      if(var3 == 0) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_2569[var1];
      }

      add var4;
      if(var3 == 0) {
         if(var10000.field_2958 <= var2) {
            var4 = this.field_2569[var1];
            this.field_2569[var1] = null;
            this.method_91();
            return var4;
         }

         var10000 = this.field_2569[var1].method_3729(var2);
      }

      var4 = var10000;
      var10000 = this.field_2569[var1];
      if(var3 == 0) {
         if(var10000.field_2958 == 0) {
            this.field_2569[var1] = null;
         }

         this.method_91();
         var10000 = var4;
      }

      return var10000;
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      int var2 = method_3203();
      add var10000 = this.field_2569[var1];
      if(var2 == 0) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_2569[var1];
      }

      add var3 = var10000;
      this.field_2569[var1] = null;
      return var3;
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      int var10000 = method_3203();
      this.field_2569[var1] = var2;
      int var3 = var10000;
      if(var3 == 0) {
         if(var2 != null) {
            label16: {
               add var4 = var2;
               if(var3 == 0) {
                  if(var2.field_2958 <= this.method_90()) {
                     break label16;
                  }

                  var4 = var2;
               }

               var4.field_2958 = this.method_90();
            }
         }

         this.method_91();
      }

   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      int var1 = method_3204();
      class_600 var10000 = this;
      String var2;
      if(var1 != 0) {
         if(!this.method_89()) {
            String[] var3 = field_2582;
            var2 = "container.chest";
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_2580;
      return var2;
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      int var2;
      label24: {
         int var1 = method_3204();
         String var10000 = this.field_2580;
         if(var1 != 0) {
            if(this.field_2580 == null) {
               break label24;
            }

            var10000 = this.field_2580;
         }

         var2 = var10000.length();
         if(var1 == 0) {
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

   // $FF: renamed from: a (java.lang.String) void
   public void method_3198(String var1) {
      this.field_2580 = var1;
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      int var10000 = method_3203();
      super.getBlock92(var1);
      int var2 = var10000;
      String[] var7 = field_2582;
      class_1580 var3 = var1.method_8689("Items", 10);
      this.field_2569 = new add[this.method_83()];
      byte var8 = var1.initGui8("CustomName", 8);
      if(var2 == 0) {
         if(var8 != 0) {
            this.field_2580 = var1.method_8685("CustomName");
         }

         var8 = 0;
      }

      int var4 = var8;

      while(var4 < var3.method_8658()) {
         class_1583 var5 = var3.method_8653(var4);
         String[] var10001 = field_2582;
         int var6 = var5.initGui9("Slot") & 255;
         if(var2 == 0) {
            if(var6 >= 0 && var6 < this.field_2569.length) {
               this.field_2569[var6] = add.method_3727(var5);
            }

            ++var4;
         }

         if(var2 != 0) {
            break;
         }
      }

   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      class_1580 var10000 = new class_1580;
      var10000.method_8628();
      class_1580 var3 = var10000;
      int var7 = method_3204();
      int var4 = 0;
      int var2 = var7;

      class_1583 var9;
      String var10001;
      label36: {
         class_600 var8;
         while(true) {
            String[] var6;
            if(var4 < this.field_2569.length) {
               var8 = this;
               if(var2 == 0) {
                  break;
               }

               if(this.field_2569[var4] != null) {
                  var9 = new class_1583;
                  var9.method_8628();
                  class_1583 var5 = var9;
                  var6 = field_2582;
                  var5.method_8665("Slot", (byte)var4);
                  this.field_2569[var4].method_3737(var5);
                  var3.method_8650(var5);
               }

               ++var4;
               if(var2 != 0) {
                  continue;
               }
            }

            var9 = var1;
            var6 = field_2582;
            var10001 = "Items";
            if(var2 == 0) {
               break label36;
            }

            var1.method_8664("Items", var3);
            var8 = this;
            break;
         }

         if(!var8.method_89()) {
            return;
         }

         var9 = var1;
         String[] var10 = field_2582;
         var10001 = "CustomName";
      }

      var9.initGui1(var10001, this.field_2580);
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      int var2 = method_3203();
      int var10000;
      if(this.field_2464.method_31(this.field_2465, this.field_2466, this.field_2467) != this) {
         var10000 = 0;
      } else {
         double var3;
         var10000 = (var3 = var1.method_3889((double)this.field_2465 + 0.5D, (double)this.field_2466 + 0.5D, (double)this.field_2467 + 0.5D) - 64.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 == 0) {
            var10000 = var10000 <= 0?1:0;
         }
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: v () void
   public void method_3105() {
      super.method_3105();
      this.field_2570 = false;
   }

   // $FF: renamed from: a (ca.diiza.t.a, int) void
   private void method_3199(class_600 var1, int var2) {
      int var3 = method_3204();
      int var10000 = var1.method_3101();
      if(var3 != 0) {
         if(var10000 != 0) {
            this.field_2570 = false;
            if(var3 != 0) {
               return;
            }
         }

         var10000 = this.field_2570;
      }

      if(var3 != 0) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var2;
      }

      class_600 var4;
      switch(var10000) {
      case 0:
         var4 = this.field_2574;
         if(var3 != 0) {
            if(this.field_2574 == var1) {
               break;
            }

            var4 = this;
         }

         var4.field_2570 = false;
         if(var3 != 0) {
            break;
         }
      case 1:
         var4 = this.field_2573;
         if(var3 != 0) {
            if(this.field_2573 == var1) {
               break;
            }

            var4 = this;
         }

         var4.field_2570 = false;
         if(var3 != 0) {
            break;
         }
      case 2:
         var4 = this.field_2571;
         if(var3 != 0) {
            if(this.field_2571 == var1) {
               break;
            }

            var4 = this;
         }

         var4.field_2570 = false;
         if(var3 != 0) {
            break;
         }
      case 3:
         var4 = this.field_2572;
         if(var3 != 0) {
            if(this.field_2572 == var1) {
               return;
            }

            var4 = this;
         }

         var4.field_2570 = false;
      }

   }

   // $FF: renamed from: a (int, int, int) boolean
   private boolean method_3200(int var1, int var2, int var3) {
      int var10000;
      label24: {
         var10000 = method_3203();
         aji var5 = this.field_2464.getBlock(var1, var2, var3);
         int var4 = var10000;
         var10000 = var5 instanceof class_491;
         if(var4 == 0) {
            if(var10000 == 0) {
               break label24;
            }

            var10000 = ((class_491)var5).field_2282;
         }

         if(var4 != 0) {
            return (boolean)var10000;
         }

         if(var10000 == this.method_3201()) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: g () void
   public void getBlock94() {
      int var1;
      float var2;
      class_600 var14;
      int var10000;
      label217: {
         var10000 = method_3203();
         super.getBlock94();
         var1 = var10000;
         ++this.field_2578;
         var14 = this;
         if(var1 == 0) {
            label215: {
               if(!this.field_2464.field_1832) {
                  var14 = this;
                  if(var1 != 0) {
                     break label215;
                  }

                  if(this.field_2577 != 0) {
                     var14 = this;
                     if(var1 != 0) {
                        break label215;
                     }

                     if((this.field_2578 + this.field_2465 + this.field_2466 + this.field_2467) % 200 == 0) {
                        this.field_2577 = 0;
                        var2 = 5.0F;
                        List var3 = this.field_2464.method_2157(class_792.class, class_1343.method_7093((double)((float)this.field_2465 - var2), (double)((float)this.field_2466 - var2), (double)((float)this.field_2467 - var2), (double)((float)(this.field_2465 + 1) + var2), (double)((float)(this.field_2466 + 1) + var2), (double)((float)(this.field_2467 + 1) + var2)));
                        Iterator var4 = var3.iterator();

                        while(var4.hasNext()) {
                           label221: {
                              class_792 var5 = (class_792)var4.next();
                              class_671 var15 = var5.field_3619;
                              if(var1 == 0) {
                                 var10000 = var5.field_3619 instanceof class_685;
                                 if(var1 != 0) {
                                    break label217;
                                 }

                                 if(var10000 == 0) {
                                    break label221;
                                 }

                                 var15 = var5.field_3619;
                              }

                              label223: {
                                 class_22 var6 = ((class_685)var15).method_3706();
                                 class_22 var16 = var6;
                                 if(var1 == 0) {
                                    if(var6 == this) {
                                       break label223;
                                    }

                                    var16 = var6;
                                 }

                                 boolean var17 = var16 instanceof class_1666;
                                 if(var1 == 0) {
                                    if(!var17) {
                                       break label221;
                                    }

                                    var17 = ((class_1666)var6).method_9197(this);
                                 }

                                 if(!var17) {
                                    break label221;
                                 }
                              }

                              ++this.field_2577;
                           }

                           if(var1 != 0) {
                              break;
                           }
                        }
                     }
                  }
               }

               var14 = this;
            }
         }

         var14.field_2576 = this.field_2575;
         var2 = 0.1F;
         var10000 = this.field_2577;
      }

      double var10;
      double var10002;
      if(var1 == 0) {
         label177: {
            label176: {
               if(var10000 > 0) {
                  float var20;
                  var10000 = (var20 = this.field_2575 - 0.0F) == 0.0F?0:(var20 < 0.0F?-1:1);
                  if(var1 != 0) {
                     break label177;
                  }

                  if(var10000 == 0) {
                     var14 = this.field_2571;
                     if(var1 != 0) {
                        break label176;
                     }

                     if(this.field_2571 == null) {
                        var14 = this.field_2573;
                        if(var1 != 0) {
                           break label176;
                        }

                        if(this.field_2573 == null) {
                           double var11 = (double)this.field_2465 + 0.5D;
                           var10 = (double)this.field_2467 + 0.5D;
                           var14 = this.field_2574;
                           if(var1 == 0) {
                              if(this.field_2574 != null) {
                                 var10 += 0.5D;
                              }

                              var14 = this.field_2572;
                           }

                           if(var1 == 0) {
                              if(var14 != null) {
                                 var11 += 0.5D;
                              }

                              var14 = this;
                           }

                           var10002 = (double)this.field_2466 + 0.5D;
                           String[] var9 = field_2582;
                           var14.field_2464.method_2084(var11, var10002, var10, "random.chestopen", 0.5F, this.field_2464.field_1819.nextFloat() * 0.1F + 0.9F);
                        }
                     }
                  }
               }

               var14 = this;
            }

            var10000 = var14.field_2577;
         }
      }

      label225: {
         float var19;
         label162: {
            label226: {
               if(var1 == 0) {
                  if(var10000 == 0) {
                     var19 = this.field_2575;
                     if(var1 != 0) {
                        break label162;
                     }

                     if(this.field_2575 > 0.0F) {
                        break label226;
                     }
                  }

                  var10000 = this.field_2577;
               }

               if(var1 == 0) {
                  if(var10000 <= 0) {
                     break label225;
                  }

                  var19 = this.field_2575;
                  if(var1 != 0) {
                     break label162;
                  }

                  float var21;
                  var10000 = (var21 = this.field_2575 - 1.0F) == 0.0F?0:(var21 < 0.0F?-1:1);
               }

               if(var10000 >= 0) {
                  break label225;
               }
            }

            var19 = this.field_2575;
         }

         float var12;
         label143: {
            var12 = var19;
            var14 = this;
            if(var1 == 0) {
               if(this.field_2577 > 0) {
                  this.field_2575 += var2;
                  if(var1 == 0) {
                     break label143;
                  }
               }

               var14 = this;
            }

            var14.field_2575 -= var2;
         }

         var19 = this.field_2575;
         if(var1 == 0) {
            if(this.field_2575 > 1.0F) {
               this.field_2575 = 1.0F;
            }

            var19 = 0.5F;
         }

         label228: {
            float var13 = var19;
            float var22;
            var10000 = (var22 = this.field_2575 - var13) == 0.0F?0:(var22 < 0.0F?-1:1);
            if(var1 == 0) {
               label229: {
                  label132: {
                     if(var10000 < 0) {
                        float var23;
                        var10000 = (var23 = var12 - var13) == 0.0F?0:(var23 < 0.0F?-1:1);
                        if(var1 != 0) {
                           break label229;
                        }

                        if(var10000 >= 0) {
                           var14 = this.field_2571;
                           if(var1 != 0) {
                              break label132;
                           }

                           if(this.field_2571 == null) {
                              var14 = this.field_2573;
                              if(var1 != 0) {
                                 break label132;
                              }

                              if(this.field_2573 == null) {
                                 var10 = (double)this.field_2465 + 0.5D;
                                 double var7 = (double)this.field_2467 + 0.5D;
                                 var14 = this.field_2574;
                                 if(var1 == 0) {
                                    if(this.field_2574 != null) {
                                       var7 += 0.5D;
                                    }

                                    var14 = this.field_2572;
                                 }

                                 if(var1 == 0) {
                                    if(var14 != null) {
                                       var10 += 0.5D;
                                    }

                                    var14 = this;
                                 }

                                 var10002 = (double)this.field_2466 + 0.5D;
                                 String[] var10004 = field_2582;
                                 var14.field_2464.method_2084(var10, var10002, var7, "random.chestclosed", 0.5F, this.field_2464.field_1819.nextFloat() * 0.1F + 0.9F);
                              }
                           }
                        }
                     }

                     var14 = this;
                  }

                  if(var1 != 0) {
                     break label228;
                  }

                  float var24;
                  var10000 = (var24 = var14.field_2575 - 0.0F) == 0.0F?0:(var24 < 0.0F?-1:1);
               }
            }

            if(var10000 >= 0) {
               break label225;
            }

            var14 = this;
         }

         var14.field_2575 = 0.0F;
      }

      if(class_689.method_3976() != 0) {
         ++var1;
         method_3202(var1);
      }

   }

   // $FF: renamed from: a (int, int) boolean
   public boolean method_3104(int var1, int var2) {
      int var3 = method_3204();
      int var10000 = var1;
      if(var3 != 0) {
         if(var1 == 1) {
            this.field_2577 = var2;
            return true;
         }

         var10000 = super.method_3104(var1, var2);
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: m () void
   public void method_93() {
      int var1 = method_3204();
      class_600 var10000 = this;
      if(var1 != 0) {
         if(this.field_2577 < 0) {
            this.field_2577 = 0;
         }

         ++this.field_2577;
         this.field_2464.method_2193(this.field_2465, this.field_2466, this.field_2467, this.getBlock99(), 1, this.field_2577);
         this.field_2464.method_2063(this.field_2465, this.field_2466, this.field_2467, this.getBlock99());
         var10000 = this;
      }

      var10000.field_2464.method_2063(this.field_2465, this.field_2466 - 1, this.field_2467, this.getBlock99());
      if(var1 == 0) {
         int var2 = class_689.method_3976();
         ++var2;
         class_689.method_3975(var2);
      }

   }

   // $FF: renamed from: n () void
   public void method_94() {
      int var1 = method_3203();
      class_600 var10000 = this;
      if(var1 == 0) {
         if(!(this.getBlock99() instanceof class_491)) {
            return;
         }

         --this.field_2577;
         this.field_2464.method_2193(this.field_2465, this.field_2466, this.field_2467, this.getBlock99(), 1, this.field_2577);
         this.field_2464.method_2063(this.field_2465, this.field_2466, this.field_2467, this.getBlock99());
         var10000 = this;
      }

      var10000.field_2464.method_2063(this.field_2465, this.field_2466 - 1, this.field_2467, this.getBlock99());
   }

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      return true;
   }

   // $FF: renamed from: t () void
   public void method_3102() {
      super.method_3102();
      this.method_3105();
   }

   // $FF: renamed from: b () int
   public int method_3201() {
      int var1 = method_3203();
      int var10000 = this.field_2579;
      if(var1 == 0) {
         if(this.field_2579 == -1) {
            class_600 var2 = this;
            if(var1 == 0) {
               if(this.field_2464 == null) {
                  return 0;
               }

               var2 = this;
            }

            if(var1 == 0) {
               if(!(var2.getBlock99() instanceof class_491)) {
                  return 0;
               }

               var2 = this;
            }

            var2.field_2579 = ((class_491)this.getBlock99()).field_2282;
         }

         var10000 = this.field_2579;
      }

      return var10000;
   }

   // $FF: renamed from: a (int) void
   public static void method_3202(int var0) {
      field_2581 = var0;
   }

   // $FF: renamed from: d () int
   public static int method_3203() {
      return field_2581;
   }

   // $FF: renamed from: e () int
   public static int method_3204() {
      int var0 = method_3203();
      return var0 == 0?103:0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      // $FF: Couldn't be decompiled
   }
}

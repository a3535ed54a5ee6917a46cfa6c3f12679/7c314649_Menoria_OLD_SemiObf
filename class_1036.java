import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

// $FF: renamed from: df
public class class_1036 {

   // $FF: renamed from: b boolean
   public boolean field_5480;
   // $FF: renamed from: c boolean
   public boolean field_5481;
   // $FF: renamed from: d int
   private int field_5482;
   // $FF: renamed from: e java.util.Random
   private Random field_5483;
   // $FF: renamed from: f ahb
   private ahb field_5484;
   // $FF: renamed from: g double
   public double field_5485;
   // $FF: renamed from: h double
   public double field_5486;
   // $FF: renamed from: i double
   public double field_5487;
   // $FF: renamed from: j sa
   public class_689 field_5488;
   // $FF: renamed from: k float
   public float field_5489;
   // $FF: renamed from: l java.util.List
   public List field_5490;
   // $FF: renamed from: m java.util.Map
   private Map field_5491;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_5492;


   // $FF: renamed from: <init> (ahb, sa, double, double, double, float) void
   public void method_5862(ahb var1, class_689 var2, double var3, double var5, double var7, float var9) {
      super();
      this.field_5481 = true;
      this.field_5482 = 16;
      this.field_5483 = new Random();
      this.field_5490 = new ArrayList();
      this.field_5491 = new HashMap();
      this.field_5484 = var1;
      this.field_5488 = var2;
      this.field_5489 = var9;
      this.field_5485 = var3;
      this.field_5486 = var5;
      this.field_5487 = var7;
   }

   // $FF: renamed from: b () void
   public void method_5863() {
      String[] var10000 = class_752.method_4253();
      float var2 = this.field_5489;
      String[] var1 = var10000;
      HashSet var3 = new HashSet();
      int var4 = 0;

      int var5;
      int var6;
      double var16;
      double var18;
      double var20;
      int var34;
      label182:
      while(true) {
         var34 = var4;

         label179:
         while(var34 < this.field_5482) {
            var34 = 0;
            if(var1 == null) {
               break label182;
            }

            var5 = 0;

            label176:
            do {
               var34 = var5;

               label173:
               while(true) {
                  if(var34 >= this.field_5482) {
                     break label176;
                  }

                  var34 = 0;
                  if(var1 == null) {
                     continue label179;
                  }

                  var6 = 0;

                  while(true) {
                     if(var6 >= this.field_5482) {
                        break label173;
                     }

                     var34 = var4;
                     if(var1 == null) {
                        break;
                     }

                     label168: {
                        label191: {
                           if(var1 != null) {
                              label165: {
                                 if(var4 != 0) {
                                    var34 = var4;
                                    if(var1 == null) {
                                       break label165;
                                    }

                                    if(var4 != this.field_5482 - 1) {
                                       var34 = var5;
                                       if(var1 == null) {
                                          break label165;
                                       }

                                       if(var5 != 0) {
                                          var34 = var5;
                                          if(var1 == null) {
                                             break label165;
                                          }

                                          if(var5 != this.field_5482 - 1) {
                                             var34 = var6;
                                             if(var1 == null) {
                                                break label165;
                                             }

                                             if(var6 != 0) {
                                                var34 = var6;
                                                if(var1 == null) {
                                                   break label165;
                                                }

                                                if(var6 != this.field_5482 - 1) {
                                                   break label191;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }

                                 var34 = var4;
                              }
                           }

                           double var7 = (double)((float)var34 / ((float)this.field_5482 - 1.0F) * 2.0F - 1.0F);
                           double var9 = (double)((float)var5 / ((float)this.field_5482 - 1.0F) * 2.0F - 1.0F);
                           double var11 = (double)((float)var6 / ((float)this.field_5482 - 1.0F) * 2.0F - 1.0F);
                           double var13 = Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
                           var7 /= var13;
                           var9 /= var13;
                           var11 /= var13;
                           float var15 = this.field_5489 * (0.7F + this.field_5484.field_1819.nextFloat() * 0.6F);
                           var16 = this.field_5485;
                           var18 = this.field_5486;
                           var20 = this.field_5487;
                           float var22 = 0.3F;

                           while(var15 > 0.0F) {
                              int var23 = class_1715.method_9561(var16);
                              int var24 = class_1715.method_9561(var18);
                              int var25 = class_1715.method_9561(var20);
                              aji var26 = this.field_5484.getBlock(var23, var24, var25);
                              if(var1 == null) {
                                 break label168;
                              }

                              class_689 var37;
                              float var38;
                              if(var26.method_2424() != awt.field_4170) {
                                 label131: {
                                    var37 = this.field_5488;
                                    if(var1 != null) {
                                       if(this.field_5488 == null) {
                                          var38 = var26.method_2471(this.field_5488);
                                          break label131;
                                       }

                                       var37 = this.field_5488;
                                    }

                                    var38 = var37.method_3965(this, this.field_5484, var23, var24, var25, var26);
                                 }

                                 float var27 = var38;
                                 var15 -= (var27 + 0.3F) * var22;
                              }

                              var38 = var15;
                              float var10001 = 0.0F;
                              if(var1 != null) {
                                 if(var15 > 0.0F) {
                                    label122: {
                                       label194: {
                                          var37 = this.field_5488;
                                          if(var1 != null) {
                                             if(this.field_5488 == null) {
                                                break label194;
                                             }

                                             var37 = this.field_5488;
                                          }

                                          if(var1 == null || !var37.method_3966(this, this.field_5484, var23, var24, var25, var26, var15)) {
                                             break label122;
                                          }
                                       }

                                       class_1034 var35 = new class_1034;
                                       var35.method_5854(var23, var24, var25);
                                       var3.add(var35);
                                    }
                                 }

                                 var16 += var7 * (double)var22;
                                 var18 += var9 * (double)var22;
                                 var20 += var11 * (double)var22;
                                 var38 = var15;
                                 var10001 = var22 * 0.75F;
                              }

                              var15 = var38 - var10001;
                              if(var1 == null) {
                                 break;
                              }
                           }
                        }

                        ++var6;
                     }

                     if(var1 == null) {
                        break label173;
                     }
                  }
               }

               ++var5;
            } while(var1 != null);

            ++var4;
            if(var1 != null) {
               continue label182;
            }
            break;
         }

         this.field_5490.addAll(var3);
         this.field_5489 *= 2.0F;
         var4 = class_1715.method_9561(this.field_5485 - (double)this.field_5489 - 1.0D);
         var34 = class_1715.method_9561(this.field_5485 + (double)this.field_5489 + 1.0D);
         break;
      }

      var5 = var34;
      var6 = class_1715.method_9561(this.field_5486 - (double)this.field_5489 - 1.0D);
      int var30 = class_1715.method_9561(this.field_5486 + (double)this.field_5489 + 1.0D);
      int var8 = class_1715.method_9561(this.field_5487 - (double)this.field_5489 - 1.0D);
      int var31 = class_1715.method_9561(this.field_5487 + (double)this.field_5489 + 1.0D);
      List var10 = this.field_5484.method_2155(this.field_5488, class_1343.method_7093((double)var4, (double)var6, (double)var8, (double)var5, (double)var30, (double)var31));
      azw var32 = azw.method_5086(this.field_5485, this.field_5486, this.field_5487);
      int var12 = 0;

      while(true) {
         if(var12 < var10.size()) {
            class_689 var33 = (class_689)var10.get(var12);
            double var14 = var33.method_3890(this.field_5485, this.field_5486, this.field_5487) / (double)this.field_5489;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               label84: {
                  if(var14 <= 1.0D) {
                     label196: {
                        var16 = var33.field_2994 - this.field_5485;
                        var18 = var33.field_2995 + (double)var33.method_3880() - this.field_5486;
                        var20 = var33.field_2996 - this.field_5487;
                        double var39 = (double)class_1715.method_9558(var16 * var16 + var18 * var18 + var20 * var20);
                        double var41 = var39;
                        double var36 = 0.0D;
                        if(var1 != null) {
                           if(var39 == 0.0D) {
                              break label196;
                           }

                           var16 /= var39;
                           var18 /= var39;
                           var41 = var20;
                           var36 = var39;
                        }

                        var20 = var41 / var36;
                        double var40 = (double)this.field_5484.method_2127(var32, var33.field_3004);
                        double var42 = (1.0D - var14) * var40;
                        var33.method_3896(class_1691.method_9334(this), (float)((int)((var42 * var42 + var42) / 2.0D * 8.0D * (double)this.field_5489 + 1.0D)));
                        double var28 = class_944.method_5503(var33, var42);
                        var33.field_2997 += var16 * var28;
                        var33.field_2998 += var18 * var28;
                        var33.field_2999 += var20 * var28;
                        if(var1 == null) {
                           break label84;
                        }

                        if(var33 instanceof class_792) {
                           this.field_5491.put((class_792)var33, azw.method_5086(var16 * var42, var18 * var42, var20 * var42));
                        }
                     }
                  }

                  ++var12;
               }
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_5489 = var2;
         break;
      }

   }

   // $FF: renamed from: b (boolean) void
   public void method_5864(boolean var1) {
      String[] var2;
      class_1036 var10000;
      String[] var25;
      label119: {
         ahb var28;
         label118: {
            label117: {
               var25 = field_5492;
               this.field_5484.method_2084(this.field_5485, this.field_5486, this.field_5487, "random.explode", 4.0F, (1.0F + (this.field_5484.field_1819.nextFloat() - this.field_5484.field_1819.nextFloat()) * 0.2F) * 0.7F);
               var2 = class_752.method_4253();
               var10000 = this;
               if(var2 != null) {
                  if(this.field_5489 >= 2.0F) {
                     var10000 = this;
                     if(var2 == null) {
                        break label118;
                     }

                     if(this.field_5481) {
                        break label117;
                     }
                  }

                  var10000 = this;
               }

               var28 = var10000.field_5484;
               var25 = field_5492;
               var28.method_2087("largeexplode", this.field_5485, this.field_5486, this.field_5487, 1.0D, 0.0D, 0.0D);
               if(var2 != null) {
                  break label119;
               }
            }

            var10000 = this;
         }

         var28 = var10000.field_5484;
         var25 = field_5492;
         var28.method_2087("hugeexplosion", this.field_5485, this.field_5486, this.field_5487, 1.0D, 0.0D, 0.0D);
      }

      Iterator var3;
      class_1034 var4;
      int var5;
      int var6;
      int var7;
      aji var8;
      int var29;
      aji var30;
      label123: {
         var29 = this.field_5481;
         if(var2 != null) {
            label124: {
               if(this.field_5481) {
                  var3 = this.field_5490.iterator();

                  while(var3.hasNext()) {
                     var4 = (class_1034)var3.next();
                     var5 = var4.field_5472;
                     var6 = var4.field_5473;
                     var7 = var4.field_5474;
                     var8 = this.field_5484.getBlock(var5, var6, var7);
                     var29 = var1;
                     if(var2 == null) {
                        break label124;
                     }

                     label83: {
                        if(var2 != null) {
                           if(var1 == 0) {
                              break label83;
                           }

                           var29 = var5;
                        }

                        double var9 = (double)((float)var29 + this.field_5484.field_1819.nextFloat());
                        double var11 = (double)((float)var6 + this.field_5484.field_1819.nextFloat());
                        double var13 = (double)((float)var7 + this.field_5484.field_1819.nextFloat());
                        double var15 = var9 - this.field_5485;
                        double var17 = var11 - this.field_5486;
                        double var19 = var13 - this.field_5487;
                        double var21 = (double)class_1715.method_9558(var15 * var15 + var17 * var17 + var19 * var19);
                        var15 /= var21;
                        var17 /= var21;
                        var19 /= var21;
                        double var23 = 0.5D / (var21 / (double)this.field_5489 + 0.1D);
                        var23 *= (double)(this.field_5484.field_1819.nextFloat() * this.field_5484.field_1819.nextFloat() + 0.3F);
                        var15 *= var23;
                        var17 *= var23;
                        var19 *= var23;
                        var25 = field_5492;
                        this.field_5484.method_2087("explode", (var9 + this.field_5485 * 1.0D) / 2.0D, (var11 + this.field_5486 * 1.0D) / 2.0D, (var13 + this.field_5487 * 1.0D) / 2.0D, var15, var17, var19);
                        this.field_5484.method_2087("smoke", var9, var11, var13, var15, var17, var19);
                     }

                     label126: {
                        var30 = var8;
                        if(var2 != null) {
                           if(var8.method_2424() == awt.field_4170) {
                              break label126;
                           }

                           var30 = var8;
                        }

                        boolean var26 = var30.method_2527(this);
                        if(var2 != null) {
                           if(var26) {
                              var8.method_2467(this.field_5484, var5, var6, var7, this.field_5484.method_33(var5, var6, var7), 1.0F / this.field_5489, 0);
                           }

                           this.field_5484.method_2054(var5, var6, var7, class_1192.field_6025, 0, 3);
                        }

                        var8.method_2476(this.field_5484, var5, var6, var7, this);
                     }

                     if(var2 == null) {
                        break;
                     }
                  }
               }

               var10000 = this;
               if(var2 == null) {
                  break label123;
               }

               var29 = this.field_5480;
            }
         }

         if(var29 == 0) {
            return;
         }

         var10000 = this;
      }

      var3 = var10000.field_5490.iterator();

      while(var3.hasNext()) {
         label128: {
            var4 = (class_1034)var3.next();
            var5 = var4.field_5472;
            var6 = var4.field_5473;
            var7 = var4.field_5474;
            var8 = this.field_5484.getBlock(var5, var6, var7);
            aji var27 = this.field_5484.getBlock(var5, var6 - 1, var7);
            var30 = var8;
            if(var2 != null) {
               if(var8.method_2424() != awt.field_4170) {
                  break label128;
               }

               var30 = var27;
            }

            var29 = var30.method_2419();
            if(var2 != null) {
               if(var29 == 0) {
                  break label128;
               }

               var29 = this.field_5483.nextInt(3);
            }

            if(var2 != null && var29 == 0) {
               this.field_5484.method_2058(var5, var6, var7, class_1192.field_6078);
            }
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c () java.util.Map
   public Map method_5865() {
      return this.field_5491;
   }

   // $FF: renamed from: d () sv
   public class_752 method_5866() {
      String[] var1 = class_752.method_4253();
      class_689 var10000 = this.field_5488;
      if(var1 != null) {
         if(this.field_5488 == null) {
            return null;
         }

         var10000 = this.field_5488;
      }

      boolean var2 = var10000 instanceof class_714;
      if(var1 != null) {
         if(var2) {
            return ((class_714)this.field_5488).method_4085();
         }

         var10000 = this.field_5488;
         if(var1 == null) {
            return (class_752)var10000;
         }

         var2 = this.field_5488 instanceof class_752;
      }

      if(!var2) {
         return null;
      } else {
         var10000 = this.field_5488;
         return (class_752)var10000;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_5867() {
      // $FF: Couldn't be decompiled
   }
}

import java.util.Iterator;
import java.util.List;

// $FF: renamed from: gm
public class class_594 extends class_580 implements class_22 {

   // $FF: renamed from: a add[]
   private add[] field_2525;
   // $FF: renamed from: m boolean
   public boolean field_2526;
   // $FF: renamed from: n gm
   public class_594 field_2527;
   // $FF: renamed from: o gm
   public class_594 field_2528;
   // $FF: renamed from: p gm
   public class_594 field_2529;
   // $FF: renamed from: q gm
   public class_594 field_2530;
   // $FF: renamed from: r float
   public float field_2531;
   // $FF: renamed from: s float
   public float field_2532;
   // $FF: renamed from: t int
   public int field_2533;
   // $FF: renamed from: u int
   private int field_2534;
   // $FF: renamed from: v int
   private int field_2535;
   // $FF: renamed from: w java.lang.String
   private String field_2536;
   // $FF: renamed from: x java.lang.String
   private static final String field_2537;
   // $FF: renamed from: y java.lang.String[]
   private static final String[] field_2538;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      this.field_2525 = new add[36];
      this.field_2535 = -1;
   }

   // $FF: renamed from: <init> (int) void
   public void method_3161(int var1) {
      super.getBlock88();
      this.field_2525 = new add[36];
      this.field_2535 = var1;
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return 27;
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return this.field_2525[var1];
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = this.field_2525[var1];
      if(var3 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_2525[var1];
      }

      add var4;
      if(var3 != null) {
         if(var10000.field_2958 <= var2) {
            var4 = this.field_2525[var1];
            this.field_2525[var1] = null;
            this.method_91();
            return var4;
         }

         var10000 = this.field_2525[var1].method_3729(var2);
      }

      var4 = var10000;
      var10000 = this.field_2525[var1];
      if(var3 != null) {
         if(var10000.field_2958 == 0) {
            this.field_2525[var1] = null;
         }

         this.method_91();
         var10000 = var4;
      }

      return var10000;
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this.field_2525[var1];
      if(var2 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_2525[var1];
      }

      add var3 = var10000;
      this.field_2525[var1] = null;
      return var3;
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      String[] var10000 = class_752.method_4253();
      this.field_2525[var1] = var2;
      String[] var3 = var10000;
      if(var3 != null) {
         if(var2 != null) {
            label16: {
               add var4 = var2;
               if(var3 != null) {
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
      String[] var1 = class_752.method_4253();
      class_594 var10000 = this;
      String var2;
      if(var1 != null) {
         if(!this.method_89()) {
            String[] var3 = field_2538;
            var2 = "container.chest";
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_2536;
      return var2;
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      int var2;
      label24: {
         String[] var1 = class_752.method_4253();
         String var10000 = this.field_2536;
         if(var1 != null) {
            if(this.field_2536 == null) {
               break label24;
            }

            var10000 = this.field_2536;
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
   public void method_3162(String var1) {
      this.field_2536 = var1;
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.getBlock92(var1);
      String[] var2 = var10000;
      String[] var7 = field_2538;
      class_1580 var3 = var1.method_8689("Items", 10);
      this.field_2525 = new add[this.method_83()];
      byte var8 = var1.initGui8("CustomName", 8);
      if(var2 != null) {
         if(var8 != 0) {
            this.field_2536 = var1.method_8685("CustomName");
         }

         var8 = 0;
      }

      int var4 = var8;

      while(var4 < var3.method_8658()) {
         class_1583 var5 = var3.method_8653(var4);
         String[] var10001 = field_2538;
         int var6 = var5.initGui9("Slot") & 255;
         if(var2 != null) {
            if(var6 >= 0 && var6 < this.field_2525.length) {
               this.field_2525[var6] = add.method_3727(var5);
            }

            ++var4;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.getBlock93(var1);
      String[] var2 = var10000;
      class_1580 var7 = new class_1580;
      var7.method_8628();
      class_1580 var3 = var7;
      int var4 = 0;

      class_1583 var9;
      String var10001;
      label36: {
         class_594 var8;
         while(true) {
            String[] var6;
            if(var4 < this.field_2525.length) {
               var8 = this;
               if(var2 == null) {
                  break;
               }

               if(this.field_2525[var4] != null) {
                  var9 = new class_1583;
                  var9.method_8628();
                  class_1583 var5 = var9;
                  var6 = field_2538;
                  var5.method_8665("Slot", (byte)var4);
                  this.field_2525[var4].method_3737(var5);
                  var3.method_8650(var5);
               }

               ++var4;
               if(var2 != null) {
                  continue;
               }
            }

            var9 = var1;
            var6 = field_2538;
            var10001 = "Items";
            if(var2 == null) {
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
         String[] var10 = field_2538;
         var10001 = "CustomName";
      }

      var9.initGui1(var10001, this.field_2536);
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
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

   // $FF: renamed from: v () void
   public void method_3105() {
      super.method_3105();
      this.field_2526 = false;
   }

   // $FF: renamed from: b (gm, int) void
   private void method_3163(class_594 var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1.method_3101();
      if(var3 != null) {
         if(var10000 != 0) {
            this.field_2526 = false;
            if(var3 != null) {
               return;
            }
         }

         var10000 = this.field_2526;
      }

      if(var3 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var2;
      }

      class_594 var4;
      switch(var10000) {
      case 0:
         var4 = this.field_2530;
         if(var3 != null) {
            if(this.field_2530 == var1) {
               break;
            }

            var4 = this;
         }

         var4.field_2526 = false;
         if(var3 != null) {
            break;
         }
      case 1:
         var4 = this.field_2529;
         if(var3 != null) {
            if(this.field_2529 == var1) {
               break;
            }

            var4 = this;
         }

         var4.field_2526 = false;
         if(var3 != null) {
            break;
         }
      case 2:
         var4 = this.field_2527;
         if(var3 != null) {
            if(this.field_2527 == var1) {
               break;
            }

            var4 = this;
         }

         var4.field_2526 = false;
         if(var3 != null) {
            break;
         }
      case 3:
         var4 = this.field_2528;
         if(var3 != null) {
            if(this.field_2528 == var1) {
               return;
            }

            var4 = this;
         }

         var4.field_2526 = false;
      }

   }

   // $FF: renamed from: b () void
   public void method_3164() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_2526;
      if(var1 != null) {
         if(this.field_2526) {
            return;
         }

         this.field_2526 = true;
         this.field_2527 = null;
         this.field_2528 = null;
         this.field_2529 = null;
         this.field_2530 = null;
         var10000 = this.method_3165(this.field_2465 - 1, this.field_2466, this.field_2467);
      }

      if(var1 != null) {
         if(var10000) {
            this.field_2529 = (class_594)this.field_2464.method_31(this.field_2465 - 1, this.field_2466, this.field_2467);
         }

         var10000 = this.method_3165(this.field_2465 + 1, this.field_2466, this.field_2467);
      }

      if(var1 != null) {
         if(var10000) {
            this.field_2528 = (class_594)this.field_2464.method_31(this.field_2465 + 1, this.field_2466, this.field_2467);
         }

         var10000 = this.method_3165(this.field_2465, this.field_2466, this.field_2467 - 1);
      }

      class_594 var2;
      label82: {
         if(var1 != null) {
            if(var10000) {
               this.field_2527 = (class_594)this.field_2464.method_31(this.field_2465, this.field_2466, this.field_2467 - 1);
            }

            var2 = this;
            if(var1 == null) {
               break label82;
            }

            var10000 = this.method_3165(this.field_2465, this.field_2466, this.field_2467 + 1);
         }

         if(var10000) {
            this.field_2530 = (class_594)this.field_2464.method_31(this.field_2465, this.field_2466, this.field_2467 + 1);
         }

         var2 = this.field_2527;
      }

      if(var1 != null) {
         if(var2 != null) {
            this.field_2527.method_3163(this, 0);
         }

         var2 = this.field_2530;
      }

      if(var1 != null) {
         if(var2 != null) {
            this.field_2530.method_3163(this, 2);
         }

         var2 = this.field_2528;
      }

      if(var1 != null) {
         if(var2 != null) {
            this.field_2528.method_3163(this, 1);
         }

         var2 = this.field_2529;
      }

      if(var1 != null) {
         if(var2 == null) {
            return;
         }

         var2 = this.field_2529;
      }

      var2.method_3163(this, 3);
   }

   // $FF: renamed from: b (int, int, int) boolean
   private boolean method_3165(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      ahb var10000 = this.field_2464;
      if(var4 != null) {
         if(this.field_2464 == null) {
            return false;
         }

         var10000 = this.field_2464;
      }

      int var6;
      label33: {
         aji var5 = var10000.getBlock(var1, var2, var3);
         var6 = var5 instanceof class_488;
         if(var4 != null) {
            if(var6 == 0) {
               break label33;
            }

            var6 = ((class_488)var5).field_2275;
         }

         if(var4 == null) {
            return (boolean)var6;
         }

         if(var6 == this.method_3166()) {
            var6 = 1;
            return (boolean)var6;
         }
      }

      var6 = 0;
      return (boolean)var6;
   }

   // $FF: renamed from: g () void
   public void getBlock94() {
      String[] var1;
      float var2;
      class_594 var16;
      int var18;
      label213: {
         super.getBlock94();
         String[] var10000 = class_752.method_4253();
         this.method_3164();
         ++this.field_2534;
         var1 = var10000;
         var16 = this;
         if(var1 != null) {
            label211: {
               if(!this.field_2464.field_1832) {
                  var16 = this;
                  if(var1 == null) {
                     break label211;
                  }

                  if(this.field_2533 != 0) {
                     var16 = this;
                     if(var1 == null) {
                        break label211;
                     }

                     if((this.field_2534 + this.field_2465 + this.field_2466 + this.field_2467) % 200 == 0) {
                        this.field_2533 = 0;
                        var2 = 5.0F;
                        List var3 = this.field_2464.method_2157(class_792.class, class_1343.method_7093((double)((float)this.field_2465 - var2), (double)((float)this.field_2466 - var2), (double)((float)this.field_2467 - var2), (double)((float)(this.field_2465 + 1) + var2), (double)((float)(this.field_2466 + 1) + var2), (double)((float)(this.field_2467 + 1) + var2)));
                        Iterator var4 = var3.iterator();

                        while(var4.hasNext()) {
                           label217: {
                              class_792 var5 = (class_792)var4.next();
                              class_671 var17 = var5.field_3619;
                              if(var1 != null) {
                                 var18 = var5.field_3619 instanceof class_685;
                                 if(var1 == null) {
                                    break label213;
                                 }

                                 if(var18 == 0) {
                                    break label217;
                                 }

                                 var17 = var5.field_3619;
                              }

                              label219: {
                                 class_22 var6 = ((class_685)var17).method_3706();
                                 class_22 var19 = var6;
                                 if(var1 != null) {
                                    if(var6 == this) {
                                       break label219;
                                    }

                                    var19 = var6;
                                 }

                                 boolean var20 = var19 instanceof class_1666;
                                 if(var1 != null) {
                                    if(!var20) {
                                       break label217;
                                    }

                                    var20 = ((class_1666)var6).method_9197(this);
                                 }

                                 if(!var20) {
                                    break label217;
                                 }
                              }

                              ++this.field_2533;
                           }

                           if(var1 == null) {
                              break;
                           }
                        }
                     }
                  }
               }

               var16 = this;
            }
         }

         var16.field_2532 = this.field_2531;
         var2 = 0.1F;
         var18 = this.field_2533;
      }

      double var10;
      double var10002;
      if(var1 != null) {
         label173: {
            label172: {
               if(var18 > 0) {
                  float var21;
                  var18 = (var21 = this.field_2531 - 0.0F) == 0.0F?0:(var21 < 0.0F?-1:1);
                  if(var1 == null) {
                     break label173;
                  }

                  if(var18 == 0) {
                     var16 = this.field_2527;
                     if(var1 == null) {
                        break label172;
                     }

                     if(this.field_2527 == null) {
                        var16 = this.field_2529;
                        if(var1 == null) {
                           break label172;
                        }

                        if(this.field_2529 == null) {
                           double var13 = (double)this.field_2465 + 0.5D;
                           var10 = (double)this.field_2467 + 0.5D;
                           var16 = this.field_2530;
                           if(var1 != null) {
                              if(this.field_2530 != null) {
                                 var10 += 0.5D;
                              }

                              var16 = this.field_2528;
                           }

                           if(var1 != null) {
                              if(var16 != null) {
                                 var13 += 0.5D;
                              }

                              var16 = this;
                           }

                           var10002 = (double)this.field_2466 + 0.5D;
                           String[] var9 = field_2538;
                           var16.field_2464.method_2084(var13, var10002, var10, "random.chestopen", 0.5F, this.field_2464.field_1819.nextFloat() * 0.1F + 0.9F);
                        }
                     }
                  }
               }

               var16 = this;
            }

            var18 = var16.field_2533;
         }
      }

      float var12;
      label158: {
         label222: {
            if(var1 != null) {
               if(var18 == 0) {
                  var12 = this.field_2531;
                  if(var1 == null) {
                     break label158;
                  }

                  if(this.field_2531 > 0.0F) {
                     break label222;
                  }
               }

               var18 = this.field_2533;
            }

            if(var1 != null) {
               if(var18 <= 0) {
                  return;
               }

               var12 = this.field_2531;
               if(var1 == null) {
                  break label158;
               }

               float var22;
               var18 = (var22 = this.field_2531 - 1.0F) == 0.0F?0:(var22 < 0.0F?-1:1);
            }

            if(var18 >= 0) {
               return;
            }
         }

         var12 = this.field_2531;
      }

      float var14;
      label139: {
         var14 = var12;
         var16 = this;
         if(var1 != null) {
            if(this.field_2533 > 0) {
               this.field_2531 += var2;
               if(var1 != null) {
                  break label139;
               }
            }

            var16 = this;
         }

         var16.field_2531 -= var2;
      }

      var12 = this.field_2531;
      if(var1 != null) {
         if(this.field_2531 > 1.0F) {
            this.field_2531 = 1.0F;
         }

         var12 = 0.5F;
      }

      label224: {
         float var15 = var12;
         float var23;
         var18 = (var23 = this.field_2531 - var15) == 0.0F?0:(var23 < 0.0F?-1:1);
         if(var1 != null) {
            label225: {
               label128: {
                  if(var18 < 0) {
                     float var24;
                     var18 = (var24 = var14 - var15) == 0.0F?0:(var24 < 0.0F?-1:1);
                     if(var1 == null) {
                        break label225;
                     }

                     if(var18 >= 0) {
                        var16 = this.field_2527;
                        if(var1 == null) {
                           break label128;
                        }

                        if(this.field_2527 == null) {
                           var16 = this.field_2529;
                           if(var1 == null) {
                              break label128;
                           }

                           if(this.field_2529 == null) {
                              var10 = (double)this.field_2465 + 0.5D;
                              double var7 = (double)this.field_2467 + 0.5D;
                              var16 = this.field_2530;
                              if(var1 != null) {
                                 if(this.field_2530 != null) {
                                    var7 += 0.5D;
                                 }

                                 var16 = this.field_2528;
                              }

                              if(var1 != null) {
                                 if(var16 != null) {
                                    var10 += 0.5D;
                                 }

                                 var16 = this;
                              }

                              var10002 = (double)this.field_2466 + 0.5D;
                              String[] var10004 = field_2538;
                              var16.field_2464.method_2084(var10, var10002, var7, "random.chestclosed", 0.5F, this.field_2464.field_1819.nextFloat() * 0.1F + 0.9F);
                           }
                        }
                     }
                  }

                  var16 = this;
               }

               if(var1 == null) {
                  break label224;
               }

               float var25;
               var18 = (var25 = var16.field_2531 - 0.0F) == 0.0F?0:(var25 < 0.0F?-1:1);
            }
         }

         if(var18 >= 0) {
            return;
         }

         var16 = this;
      }

      var16.field_2531 = 0.0F;
   }

   // $FF: renamed from: a (int, int) boolean
   public boolean method_3104(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            this.field_2533 = var2;
            return true;
         }

         var10000 = super.method_3104(var1, var2);
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: m () void
   public void method_93() {
      String[] var1 = class_752.method_4253();
      class_594 var10000 = this;
      if(var1 != null) {
         if(this.field_2533 < 0) {
            this.field_2533 = 0;
         }

         ++this.field_2533;
         this.field_2464.method_2193(this.field_2465, this.field_2466, this.field_2467, this.getBlock99(), 1, this.field_2533);
         this.field_2464.method_2063(this.field_2465, this.field_2466, this.field_2467, this.getBlock99());
         var10000 = this;
      }

      var10000.field_2464.method_2063(this.field_2465, this.field_2466 - 1, this.field_2467, this.getBlock99());
   }

   // $FF: renamed from: n () void
   public void method_94() {
      String[] var1 = class_752.method_4253();
      class_594 var10000 = this;
      if(var1 != null) {
         if(!(this.getBlock99() instanceof class_488)) {
            return;
         }

         --this.field_2533;
         this.field_2464.method_2193(this.field_2465, this.field_2466, this.field_2467, this.getBlock99(), 1, this.field_2533);
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
      this.method_3164();
   }

   // $FF: renamed from: d () int
   public int method_3166() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2535;
      if(var1 != null) {
         if(this.field_2535 == -1) {
            class_594 var2 = this;
            if(var1 != null) {
               if(this.field_2464 == null) {
                  return 0;
               }

               var2 = this;
            }

            if(var1 != null) {
               if(!(var2.getBlock99() instanceof class_488)) {
                  return 0;
               }

               var2 = this;
            }

            var2.field_2535 = ((class_488)this.getBlock99()).field_2275;
         }

         var10000 = this.field_2535;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      // $FF: Couldn't be decompiled
   }
}

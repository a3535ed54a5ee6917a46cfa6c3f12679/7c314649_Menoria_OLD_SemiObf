import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: xp
public class class_700 extends class_689 {

   // $FF: renamed from: at aji
   private aji field_3100;
   // $FF: renamed from: au int
   public int field_3101;
   // $FF: renamed from: av int
   public int field_3102;
   // $FF: renamed from: aw boolean
   public boolean field_3103;
   // $FF: renamed from: ax boolean
   private boolean field_3104;
   // $FF: renamed from: ay boolean
   private boolean field_3105;
   // $FF: renamed from: az int
   private int field_3106;
   // $FF: renamed from: aA float
   private float field_3107;
   // $FF: renamed from: aB ro
   public class_1583 field_3108;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3109;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3103 = true;
      this.field_3106 = 40;
      this.field_3107 = 2.0F;
   }

   // $FF: renamed from: <init> (ahb, double, double, double, aji) void
   public void method_4037(ahb var1, double var2, double var4, double var6, aji var8) {
      this.method_4038(var1, var2, var4, var6, var8, 0);
   }

   // $FF: renamed from: <init> (ahb, double, double, double, aji, int) void
   public void method_4038(ahb var1, double var2, double var4, double var6, aji var8, int var9) {
      super.method_3847(var1);
      this.field_3103 = true;
      this.field_3106 = 40;
      this.field_3107 = 2.0F;
      this.field_3100 = var8;
      this.field_3101 = var9;
      this.field_2986 = true;
      this.method_3852(0.98F, 0.98F);
      this.field_3013 = this.field_3015 / 2.0F;
      this.method_3854(var2, var4, var6);
      this.field_2997 = 0.0D;
      this.field_2998 = 0.0D;
      this.field_2999 = 0.0D;
      this.field_2991 = var2;
      this.field_2992 = var4;
      this.field_2993 = var6;
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {}

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_3012;
      if(var1 != null) {
         var10000 = !this.field_3012;
      }

      return var10000;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1 = class_752.method_4253();
      class_700 var10000 = this;
      if(var1 != null) {
         if(this.field_3100.method_2424() == awt.field_4170) {
            this.method_3851();
            return;
         }

         this.field_2991 = this.field_2994;
         this.field_2992 = this.field_2995;
         this.field_2993 = this.field_2996;
         ++this.field_3102;
         this.field_2998 -= 0.03999999910593033D;
         this.method_3864(this.field_2997, this.field_2998, this.field_2999);
         this.field_2997 *= 0.9800000190734863D;
         this.field_2998 *= 0.9800000190734863D;
         this.field_2999 *= 0.9800000190734863D;
         var10000 = this;
      }

      int var12 = var10000.field_2990.field_1832;
      if(var1 != null) {
         if(var12 != 0) {
            return;
         }

         var12 = class_1715.method_9561(this.field_2994);
      }

      int var2 = var12;
      int var3 = class_1715.method_9561(this.field_2995);
      int var4 = class_1715.method_9561(this.field_2996);
      var12 = this.field_3102;
      if(var1 != null) {
         if(this.field_3102 == 1) {
            label193: {
               var10000 = this;
               if(var1 != null) {
                  if(this.field_2990.getBlock(var2, var3, var4) == this.field_3100) {
                     this.field_2990.method_2056(var2, var3, var4);
                     if(var1 != null) {
                        break label193;
                     }
                  }

                  var10000 = this;
               }

               var10000.method_3851();
               return;
            }
         }

         var12 = this.field_3005;
      }

      add var10001;
      if(var1 != null) {
         if(var12 != 0) {
            this.field_2997 *= 0.699999988079071D;
            this.field_2999 *= 0.699999988079071D;
            this.field_2998 *= -0.5D;
            var10000 = this;
            if(var1 != null) {
               if(this.field_2990.getBlock(var2, var3, var4) == class_1192.field_6063) {
                  return;
               }

               this.method_3851();
               var10000 = this;
            }

            boolean var10 = var10000.field_3104;
            if(var1 != null) {
               label179: {
                  if(!var10) {
                     var10 = this.field_2990.canPlaceEntityOnSide(this.field_3100, var2, var3, var4, true, 1, (class_689)null, (add)null);
                     if(var1 == null) {
                        break label179;
                     }

                     if(var10) {
                        var10 = class_464.method_2815(this.field_2990, var2, var3 - 1, var4);
                        if(var1 == null) {
                           break label179;
                        }

                        if(!var10) {
                           var10 = this.field_2990.method_2054(var2, var3, var4, this.field_3100, this.field_3101, 3);
                           if(var1 == null) {
                              break label179;
                           }

                           if(var10) {
                              var10000 = this;
                              if(var1 != null) {
                                 if(this.field_3100 instanceof class_464) {
                                    ((class_464)this.field_3100).method_2816(this.field_2990, var2, var3, var4, this.field_3101);
                                 }

                                 var10000 = this;
                              }

                              if(var1 != null) {
                                 if(var10000.field_3108 == null) {
                                    return;
                                 }

                                 var10000 = this;
                              }

                              if(var1 != null) {
                                 if(!(var10000.field_3100 instanceof class_28)) {
                                    return;
                                 }

                                 var10000 = this;
                              }

                              class_580 var5 = var10000.field_2990.method_31(var2, var3, var4);
                              if(var5 != null) {
                                 class_1583 var11 = new class_1583;
                                 var11.method_8628();
                                 class_1583 var6 = var11;
                                 var5.getBlock93(var6);
                                 Iterator var7 = this.field_3108.method_8663().iterator();

                                 while(true) {
                                    if(var7.hasNext()) {
                                       String var8 = (String)var7.next();
                                       class_1571 var9 = this.field_3108.initGui5(var8);
                                       if(var1 == null) {
                                          break;
                                       }

                                       var10 = var8.equals("x");
                                       if(var1 != null) {
                                          if(var10) {
                                             continue;
                                          }

                                          var10 = var8.equals("y");
                                       }

                                       if(var1 != null) {
                                          if(var10) {
                                             continue;
                                          }

                                          var10 = var8.equals("z");
                                       }

                                       if(var10) {
                                          continue;
                                       }

                                       var6.method_8664(var8, var9.method_8633());
                                       if(var1 != null) {
                                          continue;
                                       }
                                    }

                                    var5.getBlock92(var6);
                                    break;
                                 }

                                 var5.method_91();
                              }

                              if(var1 != null) {
                                 return;
                              }
                           }
                        }
                     }
                  }

                  var10 = this.field_3103;
               }
            }

            label211: {
               if(var1 != null) {
                  if(!var10) {
                     return;
                  }

                  var10000 = this;
                  if(var1 == null) {
                     break label211;
                  }

                  var10 = this.field_3104;
               }

               if(var10) {
                  return;
               }

               var10000 = this;
            }

            var10001 = new add;
            var10001.method_3723(this.field_3100, 1, this.field_3100.method_2470(this.field_3101));
            var10000.method_3916(var10001, 0.0F);
            if(var1 != null) {
               return;
            }
         }

         var12 = this.field_3102;
      }

      label213: {
         label214: {
            label118: {
               short var13 = 100;
               if(var1 != null) {
                  label115: {
                     if(var12 > 100) {
                        var12 = this.field_2990.field_1832;
                        if(var1 == null) {
                           break label115;
                        }

                        if(!this.field_2990.field_1832) {
                           var12 = var3;
                           if(var1 == null) {
                              break label214;
                           }

                           if(var3 < 1) {
                              break label118;
                           }

                           var12 = var3;
                           if(var1 == null) {
                              break label214;
                           }

                           if(var3 > 256) {
                              break label118;
                           }
                        }
                     }

                     var12 = this.field_3102;
                  }

                  if(var1 == null) {
                     break label214;
                  }

                  var13 = 600;
               }

               if(var12 <= var13) {
                  return;
               }
            }

            var10000 = this;
            if(var1 == null) {
               break label213;
            }

            var12 = this.field_3103;
         }

         if(var12 != 0) {
            var10001 = new add;
            var10001.method_3723(this.field_3100, 1, this.field_3100.method_2470(this.field_3101));
            this.method_3916(var10001, 0.0F);
         }

         var10000 = this;
      }

      var10000.method_3851();
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_3105;
      if(var2 != null) {
         if(!this.field_3105) {
            return;
         }

         var10000 = class_1715.method_9566(var1 - 1.0F);
      }

      int var3 = var10000;
      if(var3 > 0) {
         ArrayList var4 = new ArrayList(this.field_2990.method_2155(this, this.field_3004));
         int var5 = this.field_3100 == class_1192.field_6169?1:0;
         class_1691 var6 = var5 != 0?class_1691.field_8842:class_1691.field_8843;
         Iterator var7 = var4.iterator();

         while(true) {
            if(var7.hasNext()) {
               class_689 var8 = (class_689)var7.next();
               var8.method_3896(var6, (float)Math.min(class_1715.method_9559((float)var3 * this.field_3107), this.field_3106));
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            }

            var10000 = var5;
            if(var2 != null) {
               if(var5 == 0) {
                  break;
               }

               double var11;
               var10000 = (var11 = (double)this.field_3028.nextFloat() - (0.05000000074505806D + (double)var3 * 0.05D)) == 0.0D?0:(var11 < 0.0D?-1:1);
            }

            if(var2 != null) {
               if(var10000 >= 0) {
                  break;
               }

               var10000 = this.field_3101 >> 2;
            }

            int var9;
            int var10;
            label40: {
               var9 = var10000;
               var10 = this.field_3101 & 3;
               ++var9;
               if(var2 != null) {
                  if(var9 <= 2) {
                     break label40;
                  }

                  this.field_3104 = true;
               }

               if(var2 != null) {
                  break;
               }
            }

            this.field_3101 = var10 | var9 << 2;
            break;
         }
      }

   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {
      String[] var3 = field_3109;
      var1.method_8665("Tile", (byte)aji.method_2415(this.field_3100));
      String[] var10000 = class_752.method_4253();
      var1.method_8667("TileID", aji.method_2415(this.field_3100));
      var1.method_8665("Data", (byte)this.field_3101);
      String[] var2 = var10000;
      var1.method_8665("Time", (byte)this.field_3102);
      var1.initGui4("DropItem", this.field_3103);
      var1.initGui4("HurtEntities", this.field_3105);
      var1.method_8669("FallHurtAmount", this.field_3107);
      var1.method_8667("FallHurtMax", this.field_3106);
      class_1583 var4 = this.field_3108;
      if(var2 != null) {
         if(this.field_3108 == null) {
            return;
         }

         var4 = var1;
      }

      String[] var10001 = field_3109;
      var4.method_8664("TileEntityData", this.field_3108);
   }

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {
      String[] var2;
      String[] var3;
      label53: {
         var2 = class_752.method_4253();
         var3 = field_3109;
         if(var1.initGui8("TileID", 99)) {
            this.field_3100 = aji.method_2416(var1.method_8681("TileID"));
            if(var2 != null) {
               break label53;
            }
         }

         var3 = field_3109;
         this.field_3100 = aji.method_2416(var1.initGui9("Tile") & 255);
      }

      class_700 var10000;
      label56: {
         var3 = field_3109;
         this.field_3101 = var1.initGui9("Data") & 255;
         var10000 = this;
         if(var2 != null) {
            this.field_3102 = var1.initGui9("Time") & 255;
            if(var1.initGui8("HurtEntities", 99)) {
               this.field_3105 = var1.method_8690("HurtEntities");
               this.field_3107 = var1.method_8683("FallHurtAmount");
               this.field_3106 = var1.method_8681("FallHurtMax");
               if(var2 != null) {
                  break label56;
               }
            }

            var10000 = this;
         }

         if(var2 != null) {
            if(var10000.field_3100 != class_1192.field_6169) {
               break label56;
            }

            var10000 = this;
         }

         var10000.field_3105 = true;
      }

      var3 = field_3109;
      boolean var4 = var1.initGui8("DropItem", 99);
      if(var2 != null) {
         if(var4) {
            this.field_3103 = var1.method_8690("DropItem");
         }

         var3 = field_3109;
         var4 = var1.initGui8("TileEntityData", 10);
      }

      if(var4) {
         String[] var10002 = field_3109;
         this.field_3108 = var1.method_8688("TileEntityData");
      }

      var10000 = this;
      if(var2 != null) {
         if(this.field_3100.method_2424() != awt.field_4170) {
            return;
         }

         var10000 = this;
      }

      var10000.field_3100 = class_1192.field_6037;
   }

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: a () ahb
   public ahb method_4039() {
      return this.field_2990;
   }

   // $FF: renamed from: f (boolean) void
   public void method_4040(boolean var1) {
      this.field_3105 = var1;
   }

   // $FF: renamed from: aA () boolean
   public boolean method_3971() {
      return false;
   }

   // $FF: renamed from: a (tR) void
   public void method_3970(class_1605 var1) {
      super.method_3970(var1);
      String[] var2 = field_3109;
      var1.method_8778("Immitating block ID", Integer.valueOf(aji.method_2415(this.field_3100)));
      var1.method_8778("Immitating block data", Integer.valueOf(this.field_3101));
   }

   // $FF: renamed from: b () aji
   public aji method_4041() {
      return this.field_3100;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4042() {
      // $FF: Couldn't be decompiled
   }
}

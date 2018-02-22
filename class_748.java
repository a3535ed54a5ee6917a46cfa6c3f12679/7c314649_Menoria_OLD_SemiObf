import java.util.Iterator;
import java.util.List;

// $FF: renamed from: wD
public abstract class class_748 extends class_689 {

   // $FF: renamed from: at int
   private int field_3293;
   // $FF: renamed from: au int
   public int field_3294;
   // $FF: renamed from: av int
   public int field_3295;
   // $FF: renamed from: aw int
   public int field_3296;
   // $FF: renamed from: ax int
   public int field_3297;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3298;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3013 = 0.0F;
      this.method_3852(0.5F, 0.5F);
   }

   // $FF: renamed from: <init> (ahb, int, int, int, int) void
   public void method_4139(ahb var1, int var2, int var3, int var4, int var5) {
      this.method_3847(var1);
      this.field_3295 = var2;
      this.field_3296 = var3;
      this.field_3297 = var4;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {}

   // $FF: renamed from: j (int) void
   public void method_4140(int var1) {
      String[] var2;
      float var3;
      float var4;
      float var5;
      label83: {
         label82: {
            String[] var10000 = class_752.method_4253();
            this.field_3294 = var1;
            this.field_3002 = this.field_3000 = (float)(var1 * 90);
            var3 = (float)this.method_4143();
            var4 = (float)this.method_4144();
            var2 = var10000;
            var5 = (float)this.method_4143();
            if(var2 != null) {
               if(var1 != 2 && var1 != 0) {
                  break label82;
               }

               var5 = 0.5F;
               this.field_3000 = this.field_3002 = (float)(class_1649.field_8592[var1] * 90);
            }

            if(var2 != null) {
               break label83;
            }
         }

         var3 = 0.5F;
      }

      float var6;
      float var7;
      float var8;
      float var9;
      int var11;
      byte var10001;
      label86: {
         var3 /= 32.0F;
         var4 /= 32.0F;
         var5 /= 32.0F;
         var6 = (float)this.field_3295 + 0.5F;
         var7 = (float)this.field_3296 + 0.5F;
         var8 = (float)this.field_3297 + 0.5F;
         var9 = 0.5625F;
         var11 = var1;
         var10001 = 2;
         if(var2 != null) {
            if(var1 == 2) {
               var8 -= var9;
            }

            var11 = var1;
            if(var2 == null) {
               break label86;
            }

            var10001 = 1;
         }

         if(var11 == var10001) {
            var6 -= var9;
         }

         var11 = var1;
      }

      if(var2 != null) {
         if(var11 == 0) {
            var8 += var9;
         }

         var11 = var1;
      }

      var10001 = 3;
      if(var2 != null) {
         if(var11 == 3) {
            var6 += var9;
         }

         var11 = var1;
         var10001 = 2;
      }

      label88: {
         if(var2 != null) {
            if(var11 == var10001) {
               var6 -= this.method_4141(this.method_4143());
            }

            var11 = var1;
            if(var2 == null) {
               break label88;
            }

            var10001 = 1;
         }

         if(var11 == var10001) {
            var8 += this.method_4141(this.method_4143());
         }

         var11 = var1;
      }

      if(var2 != null) {
         if(var11 == 0) {
            var6 += this.method_4141(this.method_4143());
         }

         var11 = var1;
      }

      if(var11 == 3) {
         var8 -= this.method_4141(this.method_4143());
      }

      var7 += this.method_4141(this.method_4144());
      this.method_3854((double)var6, (double)var7, (double)var8);
      float var10 = -0.03125F;
      this.field_3004.method_7095((double)(var6 - var3 - var10), (double)(var7 - var4 - var10), (double)(var8 - var5 - var10), (double)(var6 + var3 + var10), (double)(var7 + var4 + var10), (double)(var8 + var5 + var10));
   }

   // $FF: renamed from: k (int) float
   private float method_4141(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      byte var10001 = 32;
      if(var2 != null) {
         if(var1 == 32) {
            return 0.5F;
         }

         var10000 = var1;
         var10001 = 64;
      }

      return var10000 == var10001?0.5F:0.0F;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      this.field_2991 = this.field_2994;
      this.field_2992 = this.field_2995;
      String[] var1 = var10000;
      this.field_2993 = this.field_2996;
      int var2 = this.field_3293++;
      if(var1 != null) {
         if(var2 != 100) {
            return;
         }

         var2 = this.field_2990.field_1832;
      }

      if(var1 != null) {
         if(var2 != 0) {
            return;
         }

         this.field_3293 = 0;
         var2 = this.field_3012;
      }

      class_748 var3;
      label41: {
         if(var1 != null) {
            if(var2 != 0) {
               return;
            }

            var3 = this;
            if(var1 == null) {
               break label41;
            }

            var2 = this.method_4142();
         }

         if(var2 != 0) {
            return;
         }

         this.method_3851();
         var3 = this;
      }

      var3.method_4145((class_689)null);
   }

   // $FF: renamed from: a () boolean
   public boolean method_4142() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2990.method_2096(this, this.field_3004).isEmpty();
      if(var1 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = Math.max(1, this.method_4143() / 16);
      }

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      label128: {
         var2 = var10000;
         var3 = Math.max(1, this.method_4144() / 16);
         var4 = this.field_3295;
         var5 = this.field_3296;
         var6 = this.field_3297;
         var10000 = this.field_3294;
         byte var10001 = 2;
         if(var1 != null) {
            if(this.field_3294 == 2) {
               var4 = class_1715.method_9561(this.field_2994 - (double)((float)this.method_4143() / 32.0F));
            }

            var10000 = this.field_3294;
            if(var1 == null) {
               break label128;
            }

            var10001 = 1;
         }

         if(var10000 == var10001) {
            var6 = class_1715.method_9561(this.field_2996 - (double)((float)this.method_4143() / 32.0F));
         }

         var10000 = this.field_3294;
      }

      if(var1 != null) {
         if(var10000 == 0) {
            var4 = class_1715.method_9561(this.field_2994 - (double)((float)this.method_4143() / 32.0F));
         }

         var10000 = this.field_3294;
      }

      if(var1 != null) {
         if(var10000 == 3) {
            var6 = class_1715.method_9561(this.field_2996 - (double)((float)this.method_4143() / 32.0F));
         }

         var5 = class_1715.method_9561(this.field_2995 - (double)((float)this.method_4144() / 32.0F));
         var10000 = 0;
      }

      int var7 = var10000;

      label117:
      while(true) {
         var10000 = var7;
         int var14 = var2;

         label115:
         while(true) {
            boolean var10;
            if(var10000 < var14) {
               int var8 = 0;

               while(true) {
                  if(var8 < var3) {
                     label131: {
                        awt var9;
                        label100: {
                           class_748 var15;
                           label99: {
                              label98: {
                                 var15 = this;
                                 if(var1 != null) {
                                    var10000 = this.field_3294;
                                    var14 = 2;
                                    if(var1 == null) {
                                       continue label115;
                                    }

                                    if(this.field_3294 != 2) {
                                       var15 = this;
                                       if(var1 == null) {
                                          break label99;
                                       }

                                       if(this.field_3294 != 0) {
                                          break label98;
                                       }
                                    }

                                    var15 = this;
                                 }

                                 var9 = var15.field_2990.getBlock(var4 + var7, var5 + var8, this.field_3297).method_2424();
                                 if(var1 != null) {
                                    break label100;
                                 }
                              }

                              var15 = this;
                           }

                           var9 = var15.field_2990.getBlock(this.field_3295, var5 + var8, var6 + var7).method_2424();
                        }

                        var10 = var9.method_5063();
                        if(var1 != null) {
                           if(var10) {
                              ++var8;
                              if(var1 != null) {
                                 continue;
                              }
                              break label131;
                           }

                           var10 = false;
                        }

                        return var10;
                     }
                  }

                  ++var7;
                  if(var1 != null) {
                     continue label117;
                  }
                  break;
               }
            }

            List var11 = this.field_2990.method_2155(this, this.field_3004);
            Iterator var12 = var11.iterator();

            while(true) {
               if(var12.hasNext()) {
                  label133: {
                     class_689 var13 = (class_689)var12.next();
                     var10 = var13 instanceof class_748;
                     if(var1 == null) {
                        break;
                     }

                     if(var1 != null) {
                        if(!var10) {
                           if(var1 != null) {
                              continue;
                           }
                           break label133;
                        }

                        var10 = false;
                     }

                     return var10;
                  }
               }

               var10 = true;
               break;
            }

            return var10;
         }
      }
   }

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      return true;
   }

   // $FF: renamed from: j (sa) boolean
   public boolean method_3960(class_689 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1 instanceof class_792;
      if(var2 != null) {
         if(var10000) {
            return this.method_3896(class_1691.method_9325((class_792)var1), 0.0F);
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: i (int) void
   public void method_3974(int var1) {
      this.field_2990.method_2224();
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000) {
            return false;
         }

         var10000 = this.field_3012;
      }

      if(var3 != null) {
         if(!var10000) {
            var10000 = this.field_2990.field_1832;
            if(var3 == null) {
               return var10000;
            }

            if(!this.field_2990.field_1832) {
               this.method_3851();
               this.method_3895();
               this.method_4145(var1.method_9345());
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: d (double, double, double) void
   public void method_3864(double var1, double var3, double var5) {
      String[] var7 = class_752.method_4253();
      int var10000 = this.field_2990.field_1832;
      if(var7 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this.field_3012;
      }

      if(var7 != null) {
         if(var10000 != 0) {
            return;
         }

         double var8;
         var10000 = (var8 = var1 * var1 + var3 * var3 + var5 * var5 - 0.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
      }

      if(var10000 > 0) {
         this.method_3851();
         this.method_4145((class_689)null);
      }

   }

   // $FF: renamed from: g (double, double, double) void
   public void method_3894(double var1, double var3, double var5) {
      String[] var7 = class_752.method_4253();
      int var10000 = this.field_2990.field_1832;
      if(var7 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this.field_3012;
      }

      if(var7 != null) {
         if(var10000 != 0) {
            return;
         }

         double var8;
         var10000 = (var8 = var1 * var1 + var3 * var3 + var5 * var5 - 0.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
      }

      if(var10000 > 0) {
         this.method_3851();
         this.method_4145((class_689)null);
      }

   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      label31: {
         String[] var2;
         String[] var3;
         label30: {
            label29: {
               String[] var10000 = class_752.method_4253();
               var3 = field_3298;
               var1.method_8665("Direction", (byte)this.field_3294);
               var2 = var10000;
               var1.method_8667("TileX", this.field_3295);
               var1.method_8667("TileY", this.field_3296);
               var1.method_8667("TileZ", this.field_3297);
               if(var2 != null) {
                  switch(this.field_3294) {
                  case 0:
                     break label30;
                  case 1:
                     break label29;
                  case 2:
                     var3 = field_3298;
                     var1.method_8665("Dir", (byte)0);
                     break;
                  case 3:
                     break label31;
                  default:
                     return;
                  }
               }

               if(var2 != null) {
                  return;
               }
            }

            var3 = field_3298;
            var1.method_8665("Dir", (byte)1);
            if(var2 != null) {
               return;
            }
         }

         var3 = field_3298;
         var1.method_8665("Dir", (byte)2);
         if(var2 != null) {
            return;
         }
      }

      String[] var10001 = field_3298;
      var1.method_8665("Dir", (byte)3);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var3;
      label26: {
         String[] var2 = class_752.method_4253();
         var3 = field_3298;
         byte var10000 = var1.initGui8("Direction", 99);
         if(var2 != null) {
            if(var10000 != 0) {
               this.field_3294 = var1.initGui9("Direction");
               if(var2 != null) {
                  break label26;
               }
            }

            var3 = field_3298;
            var10000 = var1.initGui9("Dir");
         }

         switch(var10000) {
         case 0:
            this.field_3294 = 2;
            if(var2 != null) {
               break;
            }
         case 1:
            this.field_3294 = 1;
            if(var2 != null) {
               break;
            }
         case 2:
            this.field_3294 = 0;
            if(var2 != null) {
               break;
            }
         case 3:
            this.field_3294 = 3;
         }
      }

      var3 = field_3298;
      this.field_3295 = var1.method_8681("TileX");
      this.field_3296 = var1.method_8681("TileY");
      this.field_3297 = var1.method_8681("TileZ");
      this.method_4140(this.field_3294);
   }

   // $FF: renamed from: f () int
   public abstract int method_4143();

   // $FF: renamed from: i () int
   public abstract int method_4144();

   // $FF: renamed from: b (sa) void
   public abstract void method_4145(class_689 var1);

   // $FF: renamed from: V () boolean
   protected boolean method_3906() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4146() {
      // $FF: Couldn't be decompiled
   }
}

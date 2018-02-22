
// $FF: renamed from: w2
public class class_790 extends class_779 {

   // $FF: renamed from: bB float
   private float field_3601;
   // $FF: renamed from: bC int
   private int field_3602;
   // $FF: renamed from: bD int
   private int field_3603;
   // $FF: renamed from: bE java.lang.String
   private static final String field_3604;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3605;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3601 = 0.5F;
      this.field_3035 = true;
      this.field_3367 = 10;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9394).method_390(6.0D);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, new Byte((byte)0));
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3605;
      return "mob.blaze.breathe";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3605;
      return "mob.blaze.hit";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3605;
      return "mob.blaze.death";
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      return 15728880;
   }

   // $FF: renamed from: d (float) float
   public float method_3884(float var1) {
      return 1.0F;
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2990.field_1832;
      if(var1 != null) {
         label78: {
            class_790 var6;
            label77: {
               if(!this.field_2990.field_1832) {
                  Object var4;
                  label82: {
                     var10000 = this.method_3875();
                     if(var1 != null) {
                        if(var10000 != 0) {
                           this.method_3896(class_1691.field_8834, 1.0F);
                        }

                        --this.field_3602;
                        var4 = this;
                        if(var1 == null) {
                           break label82;
                        }

                        var10000 = this.field_3602;
                     }

                     if(var10000 <= 0) {
                        this.field_3602 = 100;
                        this.field_3601 = 0.5F + (float)this.field_3028.nextGaussian() * 3.0F;
                     }

                     var6 = this;
                     if(var1 == null) {
                        break label77;
                     }

                     var4 = this.method_4335();
                  }

                  if(var4 != null) {
                     double var7;
                     var10000 = (var7 = this.method_4335().field_2995 + (double)this.method_4335().method_3880() - (this.field_2995 + (double)this.method_3880() + (double)this.field_3601)) == 0.0D?0:(var7 < 0.0D?-1:1);
                     if(var1 == null) {
                        break label78;
                     }

                     if(var10000 > 0) {
                        this.field_2998 += (0.30000001192092896D - this.field_2998) * 0.30000001192092896D;
                     }
                  }
               }

               var6 = this;
            }

            var10000 = var6.field_3028.nextInt(24);
         }
      }

      if(var1 != null) {
         if(var10000 == 0) {
            double var10001 = this.field_2994 + 0.5D;
            double var10002 = this.field_2995 + 0.5D;
            double var10003 = this.field_2996 + 0.5D;
            String[] var3 = field_3605;
            this.field_2990.method_2084(var10001, var10002, var10003, "fire.fire", 1.0F + this.field_3028.nextFloat(), this.field_3028.nextFloat() * 0.7F + 0.3F);
         }

         var10000 = this.field_3005;
      }

      if(var1 != null) {
         label57: {
            if(var10000 == 0) {
               double var8;
               var10000 = (var8 = this.field_2998 - 0.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
               if(var1 == null) {
                  break label57;
               }

               if(var10000 < 0) {
                  this.field_2998 *= 0.6D;
               }
            }

            var10000 = 0;
         }
      }

      int var2 = var10000;

      while(true) {
         if(var2 < 2) {
            String[] var5 = field_3605;
            this.field_2990.method_2087("largesmoke", this.field_2994 + (this.field_3028.nextDouble() - 0.5D) * (double)this.field_3014, this.field_2995 + this.field_3028.nextDouble() * (double)this.field_3015, this.field_2996 + (this.field_3028.nextDouble() - 0.5D) * (double)this.field_3014, 0.0D, 0.0D, 0.0D);
            ++var2;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         super.method_4231();
         break;
      }

   }

   // $FF: renamed from: a (sa, float) void
   protected void method_4330(class_689 var1, float var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_3319;
      if(var3 != null) {
         label82: {
            if(this.field_3319 <= 0) {
               float var15;
               var10000 = (var15 = var2 - 2.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
               if(var3 == null) {
                  break label82;
               }

               if(var10000 < 0) {
                  double var16;
                  var10000 = (var16 = var1.field_3004.field_6913 - this.field_3004.field_6910) == 0.0D?0:(var16 < 0.0D?-1:1);
                  if(var3 == null) {
                     break label82;
                  }

                  if(var10000 > 0) {
                     double var17;
                     var10000 = (var17 = var1.field_3004.field_6910 - this.field_3004.field_6913) == 0.0D?0:(var17 < 0.0D?-1:1);
                     if(var3 == null) {
                        break label82;
                     }

                     if(var10000 < 0) {
                        this.field_3319 = 20;
                        this.method_4228(var1);
                        if(var3 != null) {
                           return;
                        }
                     }
                  }
               }
            }

            float var18;
            var10000 = (var18 = var2 - 30.0F) == 0.0F?0:(var18 < 0.0F?-1:1);
         }
      }

      if(var10000 < 0) {
         double var4 = var1.field_2994 - this.field_2994;
         double var6 = var1.field_3004.field_6910 + (double)(var1.field_3015 / 2.0F) - (this.field_2995 + (double)(this.field_3015 / 2.0F));
         double var8 = var1.field_2996 - this.field_2996;
         class_790 var13 = this;
         if(var3 != null) {
            label65: {
               label64: {
                  if(this.field_3319 == 0) {
                     label48: {
                        label87: {
                           ++this.field_3603;
                           var10000 = this.field_3603;
                           byte var10001 = 1;
                           if(var3 != null) {
                              if(this.field_3603 == 1) {
                                 this.field_3319 = 60;
                                 this.method_4539(true);
                                 if(var3 != null) {
                                    break label48;
                                 }
                              }

                              var13 = this;
                              if(var3 == null) {
                                 break label87;
                              }

                              var10000 = this.field_3603;
                              var10001 = 4;
                           }

                           if(var10000 <= var10001) {
                              this.field_3319 = 6;
                              if(var3 != null) {
                                 break label48;
                              }
                           }

                           this.field_3319 = 100;
                           this.field_3603 = 0;
                           var13 = this;
                        }

                        var13.method_4539(false);
                     }

                     var13 = this;
                     if(var3 == null) {
                        break label65;
                     }

                     if(this.field_3603 > 1) {
                        float var10 = class_1715.method_9557(var2) * 0.5F;
                        this.field_2990.method_2211((class_792)null, 1009, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
                        int var11 = 0;

                        while(var11 < 1) {
                           class_710 var14 = new class_710;
                           var14.method_4065(this.field_2990, this, var4 + this.field_3028.nextGaussian() * (double)var10, var6, var8 + this.field_3028.nextGaussian() * (double)var10);
                           class_710 var12 = var14;
                           var12.field_2995 = this.field_2995 + (double)(this.field_3015 / 2.0F) + 0.5D;
                           this.field_2990.method_2089(var12);
                           ++var11;
                           if(var3 == null) {
                              break label64;
                           }

                           if(var3 == null) {
                              break;
                           }
                        }
                     }
                  }

                  this.field_3000 = (float)(Math.atan2(var8, var4) * 180.0D / 3.141592653589793D) - 90.0F;
               }

               var13 = this;
            }
         }

         var13.field_3434 = true;
      }

   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {}

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5226;
   }

   // $FF: renamed from: al () boolean
   public boolean method_3936() {
      return this.method_4538();
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 0) {
            return;
         }

         var10000 = this.field_3028.nextInt(2 + var2);
      }

      int var4 = var10000;
      int var5 = 0;

      while(var5 < var4) {
         this.method_3914(class_1010.field_5226, 1);
         ++var5;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () boolean
   public boolean method_4538() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(16) & 1;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: i (boolean) void
   public void method_4539(boolean var1) {
      byte var3;
      label15: {
         String[] var10000 = class_752.method_4253();
         var3 = this.field_3036.method_9499(16);
         String[] var2 = var10000;
         byte var4 = var1;
         if(var2 != null) {
            if(var1 != 0) {
               var3 = (byte)(var3 | 1);
               if(var2 != null) {
                  break label15;
               }
            }

            var4 = (byte)(var3 & -2);
         }

         var3 = var4;
      }

      this.field_3036.method_9506(16, Byte.valueOf(var3));
   }

   // $FF: renamed from: a () boolean
   protected boolean method_4501() {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}

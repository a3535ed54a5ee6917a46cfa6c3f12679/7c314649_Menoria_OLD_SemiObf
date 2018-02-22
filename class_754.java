
// $FF: renamed from: xd
public class class_754 extends class_753 implements class_10 {

   // $FF: renamed from: a1 float
   public float field_3388;
   // $FF: renamed from: a2 float
   public float field_3389;
   // $FF: renamed from: a3 float
   public float field_3390;
   // $FF: renamed from: a4 int
   private int field_3391;
   // $FF: renamed from: a5 java.lang.String
   private static final String field_3392;
   // $FF: renamed from: fb java.lang.String[]
   private static final String[] field_3393;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      int var2 = 1 << this.field_3028.nextInt(3);
      this.field_3013 = 0.0F;
      this.field_3391 = this.field_3028.nextInt(20) + 10;
      this.method_4303(var2);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, new Byte((byte)1));
   }

   // $FF: renamed from: c (int) void
   protected void method_4303(int var1) {
      this.field_3036.method_9506(16, new Byte((byte)var1));
      this.method_3852(0.6F * (float)var1, 0.6F * (float)var1);
      this.method_3854(this.field_2994, this.field_2995, this.field_2996);
      this.method_4211(class_1840.field_9390).method_390((double)(var1 * var1));
      this.method_4188(this.method_405());
      this.field_3367 = var1;
   }

   // $FF: renamed from: a () int
   public int method_4304() {
      return this.field_3036.method_9499(16);
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3393;
      var1.method_8667("Size", this.method_4304() - 1);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var2 = class_752.method_4253();
      String[] var10001 = field_3393;
      int var3 = var1.method_8681("Size");
      if(var2 != null) {
         if(var3 < 0) {
            var3 = 0;
         }

         this.method_4303(var3 + 1);
      }

   }

   // $FF: renamed from: b () java.lang.String
   protected String method_4305() {
      String[] var10000 = field_3393;
      return "slime";
   }

   // $FF: renamed from: d () java.lang.String
   protected String method_4306() {
      String[] var1 = class_752.method_4253();
      StringBuilder var10000 = new StringBuilder();
      String[] var2 = field_3393;
      String var10001 = "mob.slime.";
      if(var1 != null) {
         var10000 = var10000.append("mob.slime.");
         if(this.method_4304() > 1) {
            var10001 = "big";
         } else {
            String[] var3 = field_3393;
            var10001 = "small";
         }
      }

      return var10000.append(var10001).toString();
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2990.field_1832;
      class_754 var9;
      if(var1 != null) {
         label87: {
            label86: {
               if(!this.field_2990.field_1832) {
                  var9 = this;
                  if(var1 == null) {
                     break label86;
                  }

                  if(this.field_2990.field_1818 == class_918.field_4627) {
                     var10000 = this.method_4304();
                     if(var1 == null) {
                        break label87;
                     }

                     if(var10000 > 0) {
                        this.field_3012 = true;
                     }
                  }
               }

               this.field_3389 += (this.field_3388 - this.field_3389) * 0.5F;
               this.field_3390 = this.field_3389;
               var9 = this;
            }

            var10000 = var9.field_3005;
         }
      }

      int var3;
      label76: {
         label91: {
            int var2 = var10000;
            super.method_3856();
            var10000 = this.field_3005;
            if(var1 != null) {
               label73: {
                  if(this.field_3005) {
                     var10000 = var2;
                     if(var1 == null) {
                        break label73;
                     }

                     if(var2 == 0) {
                        var3 = this.method_4304();
                        int var4 = 0;

                        while(true) {
                           if(var4 < var3 * 8) {
                              float var5 = this.field_3028.nextFloat() * 3.1415927F * 2.0F;
                              float var6 = this.field_3028.nextFloat() * 0.5F + 0.5F;
                              float var7 = class_1715.method_9555(var5) * (float)var3 * 0.5F * var6;
                              float var8 = class_1715.method_9556(var5) * (float)var3 * 0.5F * var6;
                              this.field_2990.method_2087(this.method_4305(), this.field_2994 + (double)var7, this.field_3004.field_6910, this.field_2996 + (double)var8, 0.0D, 0.0D, 0.0D);
                              ++var4;
                              if(var1 == null) {
                                 break;
                              }

                              if(var1 != null) {
                                 continue;
                              }
                           }

                           var9 = this;
                           if(var1 != null) {
                              if(this.method_4313()) {
                                 this.method_3868(this.method_4306(), this.method_4216(), ((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F) / 0.8F);
                              }

                              var9 = this;
                           }

                           var9.field_3388 = -0.5F;
                           break;
                        }

                        if(var1 != null) {
                           break label91;
                        }
                     }
                  }

                  var10000 = this.field_3005;
               }
            }

            if(var1 == null) {
               break label76;
            }

            if(var10000 == 0) {
               var10000 = var2;
               if(var1 == null) {
                  break label76;
               }

               if(var2 != 0) {
                  this.field_3388 = 1.0F;
               }
            }
         }

         this.method_4307();
         var10000 = this.field_2990.field_1832;
      }

      if(var1 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.method_4304();
      }

      var3 = var10000;
      this.method_3852(0.6F * (float)var3, 0.6F * (float)var3);
   }

   // $FF: renamed from: bq () void
   protected void method_4236() {
      this.method_4270();
      String[] var1 = class_752.method_4253();
      class_792 var2 = this.field_2990.method_2176(this, 16.0D);
      if(var2 != null) {
         this.method_4272(var2, 10.0F, 20.0F);
      }

      class_754 var3;
      label55: {
         int var10000 = this.field_3005;
         if(var1 != null) {
            label56: {
               if(this.field_3005) {
                  var10000 = this.field_3391--;
                  if(var1 == null) {
                     break label56;
                  }

                  if(var10000 <= 0) {
                     this.field_3391 = this.method_4308();
                     if(var1 != null) {
                        if(var2 != null) {
                           this.field_3391 /= 3;
                        }

                        this.field_3346 = true;
                     }

                     var3 = this;
                     if(var1 != null) {
                        if(this.method_4312()) {
                           this.method_3868(this.method_4306(), this.method_4216(), ((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F) * 0.8F);
                        }

                        this.field_3347 = 1.0F - this.field_3028.nextFloat() * 2.0F;
                        var3 = this;
                     }

                     var3.field_3348 = (float)(1 * this.method_4304());
                     if(var1 != null) {
                        return;
                     }
                  }
               }

               this.field_3346 = false;
               var3 = this;
               if(var1 == null) {
                  break label55;
               }

               var10000 = this.field_3005;
            }
         }

         if(var10000 == 0) {
            return;
         }

         var3 = this;
      }

      var3.field_3347 = this.field_3348 = 0.0F;
   }

   // $FF: renamed from: i () void
   protected void method_4307() {
      this.field_3388 *= 0.6F;
   }

   // $FF: renamed from: a1 () int
   protected int method_4308() {
      return this.field_3028.nextInt(20) + 10;
   }

   // $FF: renamed from: a2 () xd
   protected class_754 method_4309() {
      class_754 var10000 = new class_754;
      var10000.method_3847(this.field_2990);
      return var10000;
   }

   // $FF: renamed from: B () void
   public void method_3851() {
      String[] var10000 = class_752.method_4253();
      int var2 = this.method_4304();
      String[] var1 = var10000;
      class_754 var8 = this;
      if(var1 != null) {
         label37: {
            if(!this.field_2990.field_1832) {
               label35: {
                  int var9 = var2;
                  if(var1 != null) {
                     if(var2 <= 1) {
                        break label35;
                     }

                     var8 = this;
                     if(var1 == null) {
                        break label37;
                     }

                     float var10;
                     var9 = (var10 = this.method_406() - 0.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
                  }

                  if(var9 <= 0) {
                     int var3 = 2 + this.field_3028.nextInt(3);
                     int var4 = 0;

                     while(var4 < var3) {
                        float var5 = ((float)(var4 % 2) - 0.5F) * (float)var2 / 4.0F;
                        float var6 = ((float)(var4 / 2) - 0.5F) * (float)var2 / 4.0F;
                        class_754 var7 = this.method_4309();
                        var7.method_4303(var2 / 2);
                        var7.method_3887(this.field_2994 + (double)var5, this.field_2995 + 0.5D, this.field_2996 + (double)var6, this.field_3028.nextFloat() * 360.0F, 0.0F);
                        this.field_2990.method_2089(var7);
                        ++var4;
                        if(var1 == null) {
                           return;
                        }

                        if(var1 == null) {
                           break;
                        }
                     }
                  }
               }
            }

            var8 = this;
         }
      }

      var8.method_3851();
   }

   // $FF: renamed from: b_ (yz) void
   public void method_3892(class_792 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.method_4310();
      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.method_4304();
      }

      int var3 = var10000;
      var10000 = this.method_4239(var1);
      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         double var4;
         var10000 = (var4 = this.method_3891(var1) - 0.6D * (double)var3 * 0.6D * (double)var3) == 0.0D?0:(var4 < 0.0D?-1:1);
      }

      if(var2 != null) {
         if(var10000 >= 0) {
            return;
         }

         var10000 = var1.method_3896(class_1691.method_9324(this), (float)this.method_4311());
      }

      if(var10000 != 0) {
         String[] var10001 = field_3393;
         this.method_3868("mob.attack", 1.0F, (this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F);
      }

   }

   // $FF: renamed from: a3 () boolean
   protected boolean method_4310() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4304();
      if(var1 != null) {
         var10000 = var10000 > 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a4 () int
   protected int method_4311() {
      return this.method_4304();
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var1 = class_752.method_4253();
      StringBuilder var10000 = new StringBuilder();
      String[] var2 = field_3393;
      String var10001 = "mob.slime.";
      if(var1 != null) {
         var10000 = var10000.append("mob.slime.");
         if(this.method_4304() > 1) {
            var10001 = "big";
         } else {
            String[] var3 = field_3393;
            var10001 = "small";
         }
      }

      return var10000.append(var10001).toString();
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var1 = class_752.method_4253();
      StringBuilder var10000 = new StringBuilder();
      String[] var2 = field_3393;
      String var10001 = "mob.slime.";
      if(var1 != null) {
         var10000 = var10000.append("mob.slime.");
         if(this.method_4304() > 1) {
            var10001 = "big";
         } else {
            String[] var3 = field_3393;
            var10001 = "small";
         }
      }

      return var10000.append(var10001).toString();
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4304();
      adb var2;
      if(var1 != null) {
         if(var10000 == 1) {
            var2 = class_1010.field_5199;
            return var2;
         }

         var10000 = 0;
      }

      var2 = adb.method_2919(var10000);
      return var2;
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      int var5;
      label91: {
         String[] var1;
         class_1069 var2;
         ahb var6;
         label87: {
            class_754 var4;
            label92: {
               byte var10001;
               label93: {
                  String[] var10000 = class_752.method_4253();
                  var2 = this.field_2990.method_2052(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2996));
                  var1 = var10000;
                  var4 = this;
                  if(var1 != null) {
                     if(this.field_2990.method_2195().method_6868() == class_1046.field_5528) {
                        var5 = this.field_3028.nextInt(4);
                        var10001 = 1;
                        if(var1 == null) {
                           break label93;
                        }

                        if(var5 != 1) {
                           return false;
                        }
                     }

                     var4 = this;
                  }

                  if(var1 == null) {
                     break label92;
                  }

                  var5 = var4.method_4304();
                  var10001 = 1;
               }

               if(var5 != var10001) {
                  var6 = this.field_2990;
                  if(var1 == null) {
                     break label87;
                  }

                  if(this.field_2990.field_1818 == class_918.field_4627) {
                     break label91;
                  }
               }

               var4 = this;
            }

            var6 = var4.field_2990;
         }

         label58: {
            class_985 var3 = var6.method_35(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2996));
            if(var3 == class_985.field_4994) {
               double var7;
               var5 = (var7 = this.field_2995 - 50.0D) == 0.0D?0:(var7 < 0.0D?-1:1);
               if(var1 == null) {
                  break label58;
               }

               if(var5 > 0) {
                  double var8;
                  var5 = (var8 = this.field_2995 - 70.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
                  if(var1 == null) {
                     break label58;
                  }

                  if(var5 < 0) {
                     float var9;
                     var5 = (var9 = this.field_3028.nextFloat() - 0.5F) == 0.0F?0:(var9 < 0.0F?-1:1);
                     if(var1 == null) {
                        break label58;
                     }

                     if(var5 < 0) {
                        float var10;
                        var5 = (var10 = this.field_3028.nextFloat() - this.field_2990.method_2103()) == 0.0F?0:(var10 < 0.0F?-1:1);
                        if(var1 == null) {
                           break label58;
                        }

                        if(var5 < 0) {
                           var5 = this.field_2990.method_2069(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996));
                           if(var1 == null) {
                              break label58;
                           }

                           if(var5 <= this.field_3028.nextInt(8)) {
                              return super.method_4274();
                           }
                        }
                     }
                  }
               }
            }

            var5 = this.field_3028.nextInt(10);
         }

         if(var1 == null) {
            return (boolean)var5;
         }

         if(var5 == 0) {
            var5 = var2.method_6049(987234911L).nextInt(10);
            if(var1 == null) {
               return (boolean)var5;
            }

            if(var5 == 0) {
               double var11;
               var5 = (var11 = this.field_2995 - 40.0D) == 0.0D?0:(var11 < 0.0D?-1:1);
               if(var1 == null) {
                  return (boolean)var5;
               }

               if(var5 < 0) {
                  return super.method_4274();
               }
            }
         }
      }

      var5 = 0;
      return (boolean)var5;
   }

   // $FF: renamed from: bf () float
   protected float method_4216() {
      return 0.4F * (float)this.method_4304();
   }

   // $FF: renamed from: x () int
   public int method_4271() {
      return 0;
   }

   // $FF: renamed from: a5 () boolean
   protected boolean method_4312() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4304();
      if(var1 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a6 () boolean
   protected boolean method_4313() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4304();
      if(var1 != null) {
         var10000 = var10000 > 2?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}

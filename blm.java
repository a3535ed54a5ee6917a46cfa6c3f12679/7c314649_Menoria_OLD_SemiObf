import org.lwjgl.opengl.GL11;

public class blm {

   // $FF: renamed from: a ahl
   public ahl field_6952;
   // $FF: renamed from: d vL
   public class_73 field_6953;
   // $FF: renamed from: e boolean
   public boolean field_6954;
   // $FF: renamed from: f boolean
   public boolean field_6955;
   // $FF: renamed from: g boolean
   public boolean field_6956;
   // $FF: renamed from: b boolean
   public static boolean field_6957;
   public static boolean cfgGrassFix;
   // $FF: renamed from: c boolean
   public boolean field_6958;
   // $FF: renamed from: h boolean
   public boolean field_6959;
   // $FF: renamed from: i double
   public double field_6960;
   // $FF: renamed from: j double
   public double field_6961;
   // $FF: renamed from: k double
   public double field_6962;
   // $FF: renamed from: l double
   public double field_6963;
   // $FF: renamed from: m double
   public double field_6964;
   // $FF: renamed from: n double
   public double field_6965;
   // $FF: renamed from: o boolean
   public boolean field_6966;
   // $FF: renamed from: p boolean
   public boolean field_6967;
   // $FF: renamed from: q bao
   public final bao field_6968;
   // $FF: renamed from: r int
   public int field_6969;
   // $FF: renamed from: s int
   public int field_6970;
   // $FF: renamed from: t int
   public int field_6971;
   // $FF: renamed from: u int
   public int field_6972;
   // $FF: renamed from: v int
   public int field_6973;
   // $FF: renamed from: w int
   public int field_6974;
   // $FF: renamed from: x boolean
   public boolean field_6975;
   // $FF: renamed from: y float
   public float field_6976;
   // $FF: renamed from: z float
   public float field_6977;
   // $FF: renamed from: A float
   public float field_6978;
   // $FF: renamed from: B float
   public float field_6979;
   // $FF: renamed from: C float
   public float field_6980;
   // $FF: renamed from: D float
   public float field_6981;
   // $FF: renamed from: E float
   public float field_6982;
   // $FF: renamed from: F float
   public float field_6983;
   // $FF: renamed from: G float
   public float field_6984;
   // $FF: renamed from: H float
   public float field_6985;
   // $FF: renamed from: I float
   public float field_6986;
   // $FF: renamed from: J float
   public float field_6987;
   // $FF: renamed from: K float
   public float field_6988;
   // $FF: renamed from: L float
   public float field_6989;
   // $FF: renamed from: M float
   public float field_6990;
   // $FF: renamed from: N float
   public float field_6991;
   // $FF: renamed from: O float
   public float field_6992;
   // $FF: renamed from: P float
   public float field_6993;
   // $FF: renamed from: Q float
   public float field_6994;
   // $FF: renamed from: R float
   public float field_6995;
   // $FF: renamed from: S int
   public int field_6996;
   // $FF: renamed from: T int
   public int field_6997;
   // $FF: renamed from: U int
   public int field_6998;
   // $FF: renamed from: V int
   public int field_6999;
   // $FF: renamed from: W int
   public int field_7000;
   // $FF: renamed from: X int
   public int field_7001;
   // $FF: renamed from: Y int
   public int field_7002;
   // $FF: renamed from: Z int
   public int field_7003;
   // $FF: renamed from: aa int
   public int field_7004;
   // $FF: renamed from: ab int
   public int field_7005;
   // $FF: renamed from: ac int
   public int field_7006;
   // $FF: renamed from: ad int
   public int field_7007;
   // $FF: renamed from: ae int
   public int field_7008;
   // $FF: renamed from: af int
   public int field_7009;
   // $FF: renamed from: ag int
   public int field_7010;
   // $FF: renamed from: ah int
   public int field_7011;
   // $FF: renamed from: ai int
   public int field_7012;
   // $FF: renamed from: aj int
   public int field_7013;
   // $FF: renamed from: ak int
   public int field_7014;
   // $FF: renamed from: al int
   public int field_7015;
   // $FF: renamed from: am int
   public int field_7016;
   // $FF: renamed from: an int
   public int field_7017;
   // $FF: renamed from: ao int
   public int field_7018;
   // $FF: renamed from: ap int
   public int field_7019;
   // $FF: renamed from: aq float
   public float field_7020;
   // $FF: renamed from: ar float
   public float field_7021;
   // $FF: renamed from: as float
   public float field_7022;
   // $FF: renamed from: at float
   public float field_7023;
   // $FF: renamed from: au float
   public float field_7024;
   // $FF: renamed from: av float
   public float field_7025;
   // $FF: renamed from: aw float
   public float field_7026;
   // $FF: renamed from: ax float
   public float field_7027;
   // $FF: renamed from: ay float
   public float field_7028;
   // $FF: renamed from: az float
   public float field_7029;
   // $FF: renamed from: aA float
   public float field_7030;
   // $FF: renamed from: aB float
   public float field_7031;
   public boolean aoLightValuesCalculated;
   public float aoLightValueOpaque;
   public boolean betterSnowEnabled;
   private static blm instance;
   private static final String __OBFID;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] field_7032;


   // $FF: renamed from: <init> (ahl) void
   public void method_7202(ahl var1) {
      super();
      this.field_6958 = true;
      this.field_6959 = false;
      this.aoLightValueOpaque = 0.2F;
      this.betterSnowEnabled = true;
      this.field_6952 = var1;
      this.field_6955 = false;
      this.field_6954 = false;
      this.field_6968 = bao.method_5273();
      this.aoLightValueOpaque = 1.0F - Config.getAmbientOcclusionLevel() * 0.8F;
   }

   // $FF: renamed from: <init> () void
   public void method_7203() {
      super();
      this.field_6958 = true;
      this.field_6959 = false;
      this.aoLightValueOpaque = 0.2F;
      this.betterSnowEnabled = true;
      this.field_6968 = bao.method_5273();
   }

   // $FF: renamed from: a (vL) void
   public void method_7204(class_73 var1) {
      this.field_6953 = var1;
   }

   // $FF: renamed from: a () void
   public void method_7205() {
      this.field_6953 = null;
   }

   // $FF: renamed from: b () boolean
   public boolean method_7206() {
      return this.field_6953 != null;
   }

   // $FF: renamed from: a (boolean) void
   public void method_7207(boolean var1) {
      this.field_6959 = var1;
   }

   // $FF: renamed from: b (boolean) void
   public void method_7208(boolean var1) {
      this.field_6956 = var1;
   }

   // $FF: renamed from: a (double, double, double, double, double, double) void
   public void method_7209(double var1, double var3, double var5, double var7, double var9, double var11) {
      String[] var13 = class_752.method_4253();
      blm var10000 = this;
      if(var13 != null) {
         if(this.field_6966) {
            return;
         }

         this.field_6960 = var1;
         this.field_6961 = var7;
         this.field_6962 = var3;
         this.field_6963 = var9;
         this.field_6964 = var5;
         this.field_6965 = var11;
         var10000 = this;
      }

      int var10001;
      label53: {
         label62: {
            var10001 = this.field_6968.canLoseFocus7.field_4494;
            if(var13 != null) {
               if(this.field_6968.canLoseFocus7.field_4494 < 2) {
                  break label62;
               }

               double var14;
               var10001 = (var14 = this.field_6960 - 0.0D) == 0.0D?0:(var14 < 0.0D?-1:1);
            }

            if(var13 == null) {
               break label53;
            }

            if(var10001 <= 0) {
               double var15;
               var10001 = (var15 = this.field_6961 - 1.0D) == 0.0D?0:(var15 < 0.0D?-1:1);
               if(var13 == null) {
                  break label53;
               }

               if(var10001 >= 0) {
                  double var16;
                  var10001 = (var16 = this.field_6962 - 0.0D) == 0.0D?0:(var16 < 0.0D?-1:1);
                  if(var13 == null) {
                     break label53;
                  }

                  if(var10001 <= 0) {
                     double var17;
                     var10001 = (var17 = this.field_6963 - 1.0D) == 0.0D?0:(var17 < 0.0D?-1:1);
                     if(var13 == null) {
                        break label53;
                     }

                     if(var10001 >= 0) {
                        double var18;
                        var10001 = (var18 = this.field_6964 - 0.0D) == 0.0D?0:(var18 < 0.0D?-1:1);
                        if(var13 == null) {
                           break label53;
                        }

                        if(var10001 <= 0) {
                           double var19;
                           var10001 = (var19 = this.field_6965 - 1.0D) == 0.0D?0:(var19 < 0.0D?-1:1);
                           if(var13 == null) {
                              break label53;
                           }

                           if(var10001 >= 0) {
                              break label62;
                           }
                        }
                     }
                  }
               }
            }

            var10001 = 1;
            break label53;
         }

         var10001 = 0;
      }

      var10000.field_6967 = (boolean)var10001;
   }

   // $FF: renamed from: a (aji) void
   public void method_7210(aji var1) {
      String[] var2 = class_752.method_4253();
      blm var10000 = this;
      if(var2 != null) {
         if(this.field_6966) {
            return;
         }

         this.field_6960 = var1.method_2487();
         this.field_6961 = var1.method_2488();
         this.field_6962 = var1.method_2489();
         this.field_6963 = var1.method_2490();
         this.field_6964 = var1.method_2491();
         this.field_6965 = var1.method_2492();
         var10000 = this;
      }

      int var10001;
      label53: {
         label62: {
            var10001 = this.field_6968.canLoseFocus7.field_4494;
            if(var2 != null) {
               if(this.field_6968.canLoseFocus7.field_4494 < 2) {
                  break label62;
               }

               double var3;
               var10001 = (var3 = this.field_6960 - 0.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
            }

            if(var2 == null) {
               break label53;
            }

            if(var10001 <= 0) {
               double var4;
               var10001 = (var4 = this.field_6961 - 1.0D) == 0.0D?0:(var4 < 0.0D?-1:1);
               if(var2 == null) {
                  break label53;
               }

               if(var10001 >= 0) {
                  double var5;
                  var10001 = (var5 = this.field_6962 - 0.0D) == 0.0D?0:(var5 < 0.0D?-1:1);
                  if(var2 == null) {
                     break label53;
                  }

                  if(var10001 <= 0) {
                     double var6;
                     var10001 = (var6 = this.field_6963 - 1.0D) == 0.0D?0:(var6 < 0.0D?-1:1);
                     if(var2 == null) {
                        break label53;
                     }

                     if(var10001 >= 0) {
                        double var7;
                        var10001 = (var7 = this.field_6964 - 0.0D) == 0.0D?0:(var7 < 0.0D?-1:1);
                        if(var2 == null) {
                           break label53;
                        }

                        if(var10001 <= 0) {
                           double var8;
                           var10001 = (var8 = this.field_6965 - 1.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
                           if(var2 == null) {
                              break label53;
                           }

                           if(var10001 >= 0) {
                              break label62;
                           }
                        }
                     }
                  }
               }
            }

            var10001 = 1;
            break label53;
         }

         var10001 = 0;
      }

      var10000.field_6967 = (boolean)var10001;
   }

   // $FF: renamed from: b (double, double, double, double, double, double) void
   public void method_7211(double var1, double var3, double var5, double var7, double var9, double var11) {
      int var10001;
      label49: {
         label51: {
            this.field_6960 = var1;
            this.field_6961 = var7;
            this.field_6962 = var3;
            this.field_6963 = var9;
            this.field_6964 = var5;
            this.field_6965 = var11;
            String[] var10000 = class_752.method_4253();
            this.field_6966 = true;
            String[] var13 = var10000;
            var10001 = this.field_6968.canLoseFocus7.field_4494;
            if(var13 != null) {
               if(this.field_6968.canLoseFocus7.field_4494 < 2) {
                  break label51;
               }

               double var14;
               var10001 = (var14 = this.field_6960 - 0.0D) == 0.0D?0:(var14 < 0.0D?-1:1);
            }

            if(var13 == null) {
               break label49;
            }

            if(var10001 <= 0) {
               double var15;
               var10001 = (var15 = this.field_6961 - 1.0D) == 0.0D?0:(var15 < 0.0D?-1:1);
               if(var13 == null) {
                  break label49;
               }

               if(var10001 >= 0) {
                  double var16;
                  var10001 = (var16 = this.field_6962 - 0.0D) == 0.0D?0:(var16 < 0.0D?-1:1);
                  if(var13 == null) {
                     break label49;
                  }

                  if(var10001 <= 0) {
                     double var17;
                     var10001 = (var17 = this.field_6963 - 1.0D) == 0.0D?0:(var17 < 0.0D?-1:1);
                     if(var13 == null) {
                        break label49;
                     }

                     if(var10001 >= 0) {
                        double var18;
                        var10001 = (var18 = this.field_6964 - 0.0D) == 0.0D?0:(var18 < 0.0D?-1:1);
                        if(var13 == null) {
                           break label49;
                        }

                        if(var10001 <= 0) {
                           double var19;
                           var10001 = (var19 = this.field_6965 - 1.0D) == 0.0D?0:(var19 < 0.0D?-1:1);
                           if(var13 == null) {
                              break label49;
                           }

                           if(var10001 >= 0) {
                              break label51;
                           }
                        }
                     }
                  }
               }
            }

            var10001 = 1;
            break label49;
         }

         var10001 = 0;
      }

      this.field_6967 = (boolean)var10001;
   }

   // $FF: renamed from: c () void
   public void method_7212() {
      this.field_6966 = false;
   }

   // $FF: renamed from: a (aji, int, int, int, vL) void
   public void method_7213(aji var1, int var2, int var3, int var4, class_73 var5) {
      this.method_7204(var5);
      this.method_7215(var1, var2, var3, var4);
      this.method_7205();
   }

   // $FF: renamed from: a (aji, int, int, int) void
   public void method_7214(aji var1, int var2, int var3, int var4) {
      this.field_6956 = true;
      this.method_7215(var1, var2, var3, var4);
      this.field_6956 = false;
   }

   // $FF: renamed from: b (aji, int, int, int) boolean
   public boolean method_7215(aji var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_2436();
      String[] var5 = var10000;
      int var7 = var6;
      if(var5 != null) {
         if(var6 == -1) {
            return false;
         }

         var1.method_2486(this.field_6952, var2, var3, var4);
         var7 = Config.isBetterSnow();
      }

      if(var5 != null) {
         label88: {
            if(var7 != 0 && var1 == class_1192.field_6089) {
               var7 = this.hasSnowNeighbours(var2, var3, var4);
               if(var5 == null) {
                  break label88;
               }

               if(var7 != 0) {
                  this.renderSnow(var2, var3, var4, class_1192.field_6104.method_2490());
               }
            }

            this.method_7210(var1);
            var7 = var6;
         }
      }

      if(var5 != null) {
         switch(var7) {
         case 0:
            return this.method_7260(var1, var2, var3, var4);
         case 1:
            return this.method_7247(var1, var2, var3, var4);
         case 2:
            return this.method_7225(var1, var2, var3, var4);
         case 3:
            return this.method_7240((class_461)var1, var2, var3, var4);
         case 4:
            return this.method_7257(var1, var2, var3, var4);
         case 5:
            return this.method_7241(var1, var2, var3, var4);
         case 6:
            return this.method_7250(var1, var2, var3, var4);
         case 7:
            return this.method_7279(var1, var2, var3, var4);
         case 8:
            return this.method_7243(var1, var2, var3, var4);
         case 9:
            return this.method_7242((class_392)var1, var2, var3, var4);
         case 10:
            return this.method_7278((class_398)var1, var2, var3, var4);
         case 11:
            return this.method_7272((class_462)var1, var2, var3, var4);
         case 12:
            return this.setCursorPosition7(var1, var2, var3, var4);
         case 13:
            return this.method_7270(var1, var2, var3, var4);
         case 14:
            return this.method_7217(var1, var2, var3, var4);
         case 15:
            return this.method_7226((class_432)var1, var2, var3, var4);
         case 16:
            return this.setCursorPosition1(var1, var2, var3, var4, false);
         case 17:
            return this.setCursorPosition6(var1, var2, var3, var4, true);
         case 18:
            return this.method_7246((class_389)var1, var2, var3, var4);
         case 19:
            return this.method_7249(var1, var2, var3, var4);
         case 20:
            return this.method_7244(var1, var2, var3, var4);
         case 21:
            return this.method_7275((class_430)var1, var2, var3, var4);
         case 22:
         default:
            boolean var8 = Reflector.ModLoader.exists();
            if(var5 != null) {
               if(var8) {
                  return Reflector.callBoolean(Reflector.ModLoader_renderWorldBlock, new Object[]{this, this.field_6952, Integer.valueOf(var2), Integer.valueOf(var3), Integer.valueOf(var4), var1, Integer.valueOf(var6)});
               }

               var8 = Reflector.FMLRenderAccessLibrary.exists();
            }

            if(var5 != null) {
               if(var8) {
                  return Reflector.callBoolean(Reflector.FMLRenderAccessLibrary_renderWorldBlock, new Object[]{this, this.field_6952, Integer.valueOf(var2), Integer.valueOf(var3), Integer.valueOf(var4), var1, Integer.valueOf(var6)});
               }

               var8 = false;
            }

            return var8;
         case 23:
            return this.method_7254(var1, var2, var3, var4);
         case 24:
            return this.method_7219((class_440)var1, var2, var3, var4);
         case 25:
            return this.method_7218((class_489)var1, var2, var3, var4);
         case 26:
            return this.method_7216((class_468)var1, var2, var3, var4);
         case 27:
            return this.method_7274((class_416)var1, var2, var3, var4);
         case 28:
            return this.method_7268((class_434)var1, var2, var3, var4);
         case 29:
            return this.setCursorPosition8(var1, var2, var3, var4);
         case 30:
            return this.setCursorPosition9(var1, var2, var3, var4);
         case 31:
            return this.method_7261(var1, var2, var3, var4);
         case 32:
            return this.method_7273((class_424)var1, var2, var3, var4);
         case 33:
            return this.method_7220((ald)var1, var2, var3, var4);
         case 34:
            return this.method_7269((class_490)var1, var2, var3, var4);
         case 35:
            return this.method_7221((class_467)var1, var2, var3, var4);
         case 36:
            return this.method_7228((class_431)var1, var2, var3, var4);
         case 37:
            return this.method_7227((class_433)var1, var2, var3, var4);
         case 38:
            return this.method_7276((class_480)var1, var2, var3, var4);
         case 39:
            return this.method_7262(var1, var2, var3, var4);
         case 40:
            return this.method_7248((class_448)var1, var2, var3, var4);
         case 41:
            var7 = this.method_7245(var1, var2, var3, var4);
         }
      }

      return (boolean)var7;
   }

   // $FF: renamed from: a (e0, int, int, int) boolean
   public boolean method_7216(class_468 var1, int var2, int var3, int var4) {
      String[] var5;
      int var8;
      label41: {
         int var6;
         label44: {
            String[] var10000 = class_752.method_4253();
            var6 = this.field_6952.method_33(var2, var3, var4);
            int var7 = var6 & 3;
            var5 = var10000;
            var8 = var7;
            if(var5 != null) {
               if(var7 == 0) {
                  this.field_6973 = 3;
                  if(var5 != null) {
                     break label44;
                  }
               }

               var8 = var7;
            }

            byte var10001 = 3;
            if(var5 != null) {
               if(var8 == 3) {
                  this.field_6973 = 1;
                  if(var5 != null) {
                     break label44;
                  }
               }

               var8 = var7;
               if(var5 == null) {
                  break label41;
               }

               var10001 = 1;
            }

            if(var8 == var10001) {
               this.field_6973 = 2;
            }
         }

         var8 = class_468.method_2819(var6);
      }

      if(var5 != null) {
         if(var8 == 0) {
            this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
            this.method_7260(var1, var2, var3, var4);
            this.field_6973 = 0;
            return true;
         }

         this.field_6956 = true;
         this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
         this.method_7260(var1, var2, var3, var4);
         this.method_7204(var1.method_2818());
         this.method_7209(0.25D, 0.8125D, 0.25D, 0.75D, 1.0D, 0.75D);
         this.method_7260(var1, var2, var3, var4);
         this.field_6956 = false;
         this.method_7205();
         this.field_6973 = 0;
         var8 = 1;
      }

      return (boolean)var8;
   }

   // $FF: renamed from: v (aji, int, int, int) boolean
   public boolean method_7217(aji var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      bmh var6 = bmh.instance;
      String[] var5 = var10000;
      int var7 = this.field_6952.method_33(var2, var3, var4);
      int var8 = class_435.method_2711(var7);
      byte var9 = class_435.method_2742(var7);
      byte var52 = Reflector.ForgeBlock_getBedDirection.exists();
      if(var5 != null) {
         if(var52 != 0) {
            var8 = Reflector.callInt(var1, Reflector.ForgeBlock_getBedDirection, new Object[]{this.field_6952, Integer.valueOf(var2), Integer.valueOf(var3), Integer.valueOf(var4)});
         }

         var52 = Reflector.ForgeBlock_isBedFoot.exists();
      }

      label256: {
         if(var5 != null) {
            if(var52 == 0) {
               break label256;
            }

            var52 = Reflector.callBoolean(var1, Reflector.ForgeBlock_isBedFoot, new Object[]{this.field_6952, Integer.valueOf(var2), Integer.valueOf(var3), Integer.valueOf(var4)});
         }

         var9 = var52;
      }

      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      int var14 = var1.method_2444(this.field_6952, var2, var3, var4);
      var6.setVisible5(var14);
      var6.setVisible6(var10, var10, var10);
      class_73 var15 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 0);
      class_73 var53 = this.field_6953;
      if(var5 != null) {
         if(this.field_6953 != null) {
            var15 = this.field_6953;
         }

         var53 = var15;
      }

      double var16 = (double)var53.method_368();
      double var18 = (double)var15.method_369();
      double var20 = (double)var15.method_371();
      double var22 = (double)var15.method_372();
      double var24 = (double)var2 + this.field_6960;
      double var26 = (double)var2 + this.field_6961;
      double var28 = (double)var3 + this.field_6962 + 0.1875D;
      double var30 = (double)var4 + this.field_6964;
      double var32 = (double)var4 + this.field_6965;
      var6.addVertexWithUV(var24, var28, var32, var16, var22);
      var6.addVertexWithUV(var24, var28, var30, var16, var20);
      var6.addVertexWithUV(var26, var28, var30, var18, var20);
      var6.addVertexWithUV(var26, var28, var32, var18, var22);
      var6.setVisible5(var1.method_2444(this.field_6952, var2, var3 + 1, var4));
      var6.setVisible6(var11, var11, var11);
      var15 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 1);
      var53 = this.field_6953;
      if(var5 != null) {
         if(this.field_6953 != null) {
            var15 = this.field_6953;
         }

         var16 = (double)var15.method_368();
         var18 = (double)var15.method_369();
         var20 = (double)var15.method_371();
         var53 = var15;
      }

      byte var10001;
      double var34;
      double var36;
      double var38;
      int var55;
      label247: {
         label260: {
            var22 = (double)var53.method_372();
            var24 = var16;
            var26 = var18;
            var28 = var20;
            var30 = var20;
            var32 = var16;
            var34 = var18;
            var36 = var22;
            var38 = var22;
            var55 = var8;
            if(var5 != null) {
               if(var8 == 0) {
                  var26 = var16;
                  var28 = var22;
                  var32 = var18;
                  var38 = var20;
                  if(var5 != null) {
                     break label260;
                  }
               }

               var55 = var8;
            }

            var10001 = 2;
            if(var5 != null) {
               if(var55 == 2) {
                  var24 = var18;
                  var30 = var22;
                  var34 = var16;
                  var36 = var20;
                  if(var5 != null) {
                     break label260;
                  }
               }

               var55 = var8;
               if(var5 == null) {
                  break label247;
               }

               var10001 = 3;
            }

            if(var55 == var10001) {
               var24 = var18;
               var30 = var22;
               var34 = var16;
               var36 = var20;
               var26 = var16;
               var28 = var22;
               var32 = var18;
               var38 = var20;
            }
         }

         var55 = var2;
      }

      double var40 = (double)var55 + this.field_6960;
      double var42 = (double)var2 + this.field_6961;
      double var44 = (double)var3 + this.field_6963;
      double var46 = (double)var4 + this.field_6964;
      double var48 = (double)var4 + this.field_6965;
      var6.addVertexWithUV(var42, var44, var48, var32, var36);
      var6.addVertexWithUV(var42, var44, var46, var24, var28);
      var6.addVertexWithUV(var40, var44, var46, var26, var30);
      var6.addVertexWithUV(var40, var44, var48, var34, var38);
      int var50 = class_1649.field_8590[var8];
      var52 = var9;
      if(var5 != null) {
         if(var9 != 0) {
            var50 = class_1649.field_8590[class_1649.field_8592[var8]];
         }

         var52 = 4;
      }

      int var51;
      label229: {
         var51 = var52;
         var55 = var8;
         if(var5 != null) {
            switch(var8) {
            case 0:
               var51 = 5;
               if(var5 != null) {
                  break label229;
               }
            case 1:
               var51 = 3;
            case 2:
            default:
               if(var5 != null) {
                  break label229;
               }
            case 3:
               var55 = 2;
            }
         }

         var51 = var55;
      }

      var55 = var50;
      var10001 = 2;
      int var54;
      if(var5 != null) {
         label220: {
            if(var50 != 2) {
               label262: {
                  label263: {
                     var55 = this.field_6956;
                     if(var5 != null) {
                        if(this.field_6956) {
                           break label263;
                        }

                        var55 = var1.method_2445(this.field_6952, var2, var3, var4 - 1, 2);
                     }

                     if(var5 == null) {
                        break label220;
                     }

                     if(var55 == 0) {
                        break label262;
                     }
                  }

                  double var56;
                  var54 = (var56 = this.field_6964 - 0.0D) == 0.0D?0:(var56 < 0.0D?-1:1);
                  if(var5 != null) {
                     var54 = var54 > 0?var14:var1.method_2444(this.field_6952, var2, var3, var4 - 1);
                  }

                  var6.setVisible5(var54);
                  var6.setVisible6(var12, var12, var12);
                  var54 = var51;
                  if(var5 != null) {
                     var54 = var51 == 2?1:0;
                  }

                  this.field_6954 = (boolean)var54;
                  this.drawTextBox2(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 2));
               }
            }

            var55 = var50;
         }

         var10001 = 3;
      }

      if(var5 != null) {
         label204: {
            if(var55 != var10001) {
               label264: {
                  label265: {
                     var55 = this.field_6956;
                     if(var5 != null) {
                        if(this.field_6956) {
                           break label265;
                        }

                        var55 = var1.method_2445(this.field_6952, var2, var3, var4 + 1, 3);
                     }

                     if(var5 == null) {
                        break label204;
                     }

                     if(var55 == 0) {
                        break label264;
                     }
                  }

                  double var57;
                  var54 = (var57 = this.field_6965 - 1.0D) == 0.0D?0:(var57 < 0.0D?-1:1);
                  if(var5 != null) {
                     var54 = var54 < 0?var14:var1.method_2444(this.field_6952, var2, var3, var4 + 1);
                  }

                  var6.setVisible5(var54);
                  var6.setVisible6(var12, var12, var12);
                  var54 = var51;
                  if(var5 != null) {
                     var54 = var51 == 3?1:0;
                  }

                  this.field_6954 = (boolean)var54;
                  this.drawTextBox3(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 3));
               }
            }

            var55 = var50;
         }

         var10001 = 4;
      }

      if(var5 != null) {
         label184: {
            if(var55 != var10001) {
               label268: {
                  label269: {
                     var55 = this.field_6956;
                     if(var5 != null) {
                        if(this.field_6956) {
                           break label269;
                        }

                        var55 = var1.method_2445(this.field_6952, var2 - 1, var3, var4, 4);
                     }

                     if(var5 == null) {
                        break label184;
                     }

                     if(var55 == 0) {
                        break label268;
                     }
                  }

                  double var58;
                  var54 = (var58 = this.field_6964 - 0.0D) == 0.0D?0:(var58 < 0.0D?-1:1);
                  if(var5 != null) {
                     var54 = var54 > 0?var14:var1.method_2444(this.field_6952, var2 - 1, var3, var4);
                  }

                  var6.setVisible5(var54);
                  var6.setVisible6(var13, var13, var13);
                  var54 = var51;
                  if(var5 != null) {
                     var54 = var51 == 4?1:0;
                  }

                  this.field_6954 = (boolean)var54;
                  this.drawTextBox4(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 4));
               }
            }

            var55 = var50;
         }

         if(var5 == null) {
            return (boolean)var55;
         }

         var10001 = 5;
      }

      if(var55 != var10001) {
         label270: {
            label271: {
               var55 = this.field_6956;
               if(var5 != null) {
                  if(this.field_6956) {
                     break label271;
                  }

                  var55 = var1.method_2445(this.field_6952, var2 + 1, var3, var4, 5);
               }

               if(var5 == null) {
                  return (boolean)var55;
               }

               if(var55 == 0) {
                  break label270;
               }
            }

            double var59;
            var54 = (var59 = this.field_6965 - 1.0D) == 0.0D?0:(var59 < 0.0D?-1:1);
            if(var5 != null) {
               var54 = var54 < 0?var14:var1.method_2444(this.field_6952, var2 + 1, var3, var4);
            }

            var6.setVisible5(var54);
            var6.setVisible6(var13, var13, var13);
            var54 = var51;
            if(var5 != null) {
               var54 = var51 == 5?1:0;
            }

            this.field_6954 = (boolean)var54;
            this.drawTextBox5(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 5));
         }
      }

      this.field_6954 = false;
      var55 = 1;
      return (boolean)var55;
   }

   // $FF: renamed from: a (d6, int, int, int) boolean
   public boolean method_7218(class_489 var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      this.method_7209(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.875D, 0.5625D);
      this.method_7260(var1, var2, var3, var4);
      this.method_7204(var1.method_2859());
      this.field_6956 = true;
      String[] var5 = var10000;
      this.method_7209(0.5625D, 0.0D, 0.3125D, 0.9375D, 0.125D, 0.6875D);
      this.method_7260(var1, var2, var3, var4);
      this.method_7209(0.125D, 0.0D, 0.0625D, 0.5D, 0.125D, 0.4375D);
      this.method_7260(var1, var2, var3, var4);
      this.method_7209(0.125D, 0.0D, 0.5625D, 0.5D, 0.125D, 0.9375D);
      this.method_7260(var1, var2, var3, var4);
      this.field_6956 = false;
      this.method_7205();
      bmh var6 = bmh.instance;
      var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      int var7 = var1.method_2495(this.field_6952, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if(var5 != null) {
         if(blt.field_7072) {
            float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
            float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
            float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
            var8 = var11;
            var9 = var12;
            var10 = var13;
         }

         var6.setVisible6(var8, var9, var10);
      }

      class_73 var32 = this.drawTextBox9(var1, 0, 0);
      boolean var34 = this.method_7206();
      if(var5 != null) {
         if(var34) {
            var32 = this.field_6953;
         }

         var34 = Config.isConnectedTextures();
      }

      class_73 var35;
      label50: {
         if(var34) {
            var35 = this.field_6953;
            if(var5 == null) {
               break label50;
            }

            if(this.field_6953 == null) {
               var32 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, -1, var32);
            }
         }

         var35 = var32;
      }

      double var33 = (double)var35.method_371();
      double var14 = (double)var32.method_372();
      int var16 = this.field_6952.method_33(var2, var3, var4);
      int var17 = 0;

      int var36;
      while(true) {
         if(var17 < 3) {
            double var18 = (double)var17 * 3.141592653589793D * 2.0D / 3.0D + 1.5707963267948966D;
            double var20 = (double)var32.method_370(8.0D);
            double var22 = (double)var32.method_369();
            var36 = var16 & 1 << var17;
            if(var5 == null) {
               break;
            }

            if(var5 != null) {
               if(var36 != 0) {
                  var22 = (double)var32.method_368();
               }

               var36 = var2;
            }

            double var24 = (double)var36 + 0.5D;
            double var26 = (double)var2 + 0.5D + Math.sin(var18) * 8.0D / 16.0D;
            double var28 = (double)var4 + 0.5D;
            double var30 = (double)var4 + 0.5D + Math.cos(var18) * 8.0D / 16.0D;
            var6.addVertexWithUV(var24, (double)(var3 + 1), var28, var20, var33);
            var6.addVertexWithUV(var24, (double)(var3 + 0), var28, var20, var14);
            var6.addVertexWithUV(var26, (double)(var3 + 0), var30, var22, var14);
            var6.addVertexWithUV(var26, (double)(var3 + 1), var30, var22, var33);
            var6.addVertexWithUV(var26, (double)(var3 + 1), var30, var22, var33);
            var6.addVertexWithUV(var26, (double)(var3 + 0), var30, var22, var14);
            var6.addVertexWithUV(var24, (double)(var3 + 0), var28, var20, var14);
            var6.addVertexWithUV(var24, (double)(var3 + 1), var28, var20, var33);
            ++var17;
            if(var5 != null) {
               continue;
            }
         }

         var1.method_2500();
         var36 = 1;
         break;
      }

      return (boolean)var36;
   }

   // $FF: renamed from: a (eL, int, int, int) boolean
   public boolean method_7219(class_440 var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      this.method_7260(var1, var2, var3, var4);
      bmh var6 = bmh.instance;
      String[] var5 = var10000;
      var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      int var7 = var1.method_2495(this.field_6952, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      float var11;
      if(var5 != null) {
         if(blt.field_7072) {
            float var12 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
            var11 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
            float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
            var8 = var12;
            var9 = var11;
            var10 = var13;
         }

         var6.setVisible6(var8, var9, var10);
      }

      class_73 var21 = var1.getBlockTextureFromSide(2);
      var11 = 0.125F;
      this.drawTextBox5(var1, (double)((float)var2 - 1.0F + var11), (double)var3, (double)var4, var21);
      this.drawTextBox4(var1, (double)((float)var2 + 1.0F - var11), (double)var3, (double)var4, var21);
      this.drawTextBox3(var1, (double)var2, (double)var3, (double)((float)var4 - 1.0F + var11), var21);
      this.drawTextBox2(var1, (double)var2, (double)var3, (double)((float)var4 + 1.0F - var11), var21);
      String[] var20 = field_7032;
      class_73 var22 = class_440.method_2755("inner");
      this.drawTextBox1(var1, (double)var2, (double)((float)var3 - 1.0F + 0.25F), (double)var4, var22);
      this.drawTextBox0(var1, (double)var2, (double)((float)var3 + 1.0F - 0.75F), (double)var4, var22);
      int var14 = this.field_6952.method_33(var2, var3, var4);
      int var23 = var14;
      if(var5 != null) {
         if(var14 > 0) {
            class_73 var15 = class_366.method_2559("water_still");
            int var16 = CustomColorizer.getFluidColor(class_1192.field_6034, this.field_6952, var2, var3, var4);
            float var17 = (float)(var16 >> 16 & 255) / 255.0F;
            float var18 = (float)(var16 >> 8 & 255) / 255.0F;
            float var19 = (float)(var16 & 255) / 255.0F;
            var6.setVisible6(var17, var18, var19);
            this.drawTextBox1(var1, (double)var2, (double)((float)var3 - 1.0F + class_440.method_2758(var14)), (double)var4, var15);
         }

         var23 = 1;
      }

      return (boolean)var23;
   }

   // $FF: renamed from: a (ald, int, int, int) boolean
   public boolean method_7220(ald var1, int var2, int var3, int var4) {
      this.method_7260(var1, var2, var3, var4);
      bmh var6 = bmh.instance;
      var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_2495(this.field_6952, var2, var3, var4);
      String[] var5 = var10000;
      class_73 var8 = this.method_7290(var1, 0);
      float var9 = (float)(var7 >> 16 & 255) / 255.0F;
      float var10 = (float)(var7 >> 8 & 255) / 255.0F;
      float var11 = (float)(var7 & 255) / 255.0F;
      float var12;
      if(var5 != null) {
         if(blt.field_7072) {
            var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
            float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
            float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         var6.setVisible6(var9, var10, var11);
      }

      boolean var25;
      label69: {
         label73: {
            var12 = 0.1865F;
            this.drawTextBox5(var1, (double)((float)var2 - 0.5F + var12), (double)var3, (double)var4, var8);
            this.drawTextBox4(var1, (double)((float)var2 + 0.5F - var12), (double)var3, (double)var4, var8);
            this.drawTextBox3(var1, (double)var2, (double)var3, (double)((float)var4 - 0.5F + var12), var8);
            this.drawTextBox2(var1, (double)var2, (double)var3, (double)((float)var4 + 0.5F - var12), var8);
            this.drawTextBox1(var1, (double)var2, (double)((float)var3 - 0.5F + var12 + 0.1875F), (double)var4, this.method_7291(class_1192.field_6028));
            class_580 var22 = this.field_6952.method_31(var2, var3, var4);
            class_580 var24 = var22;
            if(var5 != null) {
               if(var22 == null) {
                  break label73;
               }

               var24 = var22;
            }

            var25 = var24 instanceof class_586;
            if(var5 == null) {
               break label69;
            }

            if(var25) {
               adb var23 = ((class_586)var22).method_3147();
               int var15 = ((class_586)var22).method_3148();
               var25 = var23 instanceof abh;
               if(var5 == null) {
                  break label69;
               }

               if(var25) {
                  aji var16 = aji.method_2417(var23);
                  int var17 = var16.method_2436();
                  float var18 = 0.0F;
                  float var19 = 4.0F;
                  float var20 = 0.0F;
                  var6.method_7468(var18 / 16.0F, var19 / 16.0F, var20 / 16.0F);
                  var7 = var16.method_2495(this.field_6952, var2, var3, var4);
                  int var26 = var7;
                  int var10001 = 16777215;
                  if(var5 != null) {
                     if(var7 != 16777215) {
                        var9 = (float)(var7 >> 16 & 255) / 255.0F;
                        var10 = (float)(var7 >> 8 & 255) / 255.0F;
                        var11 = (float)(var7 & 255) / 255.0F;
                        var6.setVisible6(var9, var10, var11);
                     }

                     var26 = var17;
                     var10001 = 1;
                  }

                  label54: {
                     if(var5 != null) {
                        if(var26 == var10001) {
                           this.method_7252(this.drawTextBox9(var16, 0, var15), (double)var2, (double)var3, (double)var4, 0.75F);
                           if(var5 != null) {
                              break label54;
                           }
                        }

                        var26 = var17;
                        var10001 = 13;
                     }

                     if(var26 == var10001) {
                        this.field_6956 = true;
                        float var21 = 0.125F;
                        this.method_7209((double)(0.5F - var21), 0.0D, (double)(0.5F - var21), (double)(0.5F + var21), 0.25D, (double)(0.5F + var21));
                        this.method_7260(var16, var2, var3, var4);
                        this.method_7209((double)(0.5F - var21), 0.25D, (double)(0.5F - var21), (double)(0.5F + var21), 0.5D, (double)(0.5F + var21));
                        this.method_7260(var16, var2, var3, var4);
                        this.method_7209((double)(0.5F - var21), 0.5D, (double)(0.5F - var21), (double)(0.5F + var21), 0.75D, (double)(0.5F + var21));
                        this.method_7260(var16, var2, var3, var4);
                        this.field_6956 = false;
                        this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
                     }
                  }

                  var6.method_7468(-var18 / 16.0F, -var19 / 16.0F, -var20 / 16.0F);
               }
            }
         }

         var25 = Config.isBetterSnow();
      }

      if(var5 != null) {
         if(var25) {
            var25 = this.hasSnowNeighbours(var2, var3, var4);
            if(var5 == null) {
               return var25;
            }

            if(var25) {
               this.renderSnow(var2, var3, var4, class_1192.field_6104.method_2490());
            }
         }

         var25 = true;
      }

      return var25;
   }

   // $FF: renamed from: a (e2, int, int, int) boolean
   public boolean method_7221(class_467 var1, int var2, int var3, int var4) {
      return this.method_7222(var1, var2, var3, var4, this.field_6952.method_33(var2, var3, var4));
   }

   // $FF: renamed from: a (e2, int, int, int, int) boolean
   public boolean method_7222(class_467 var1, int var2, int var3, int var4, int var5) {
      bmh var7 = bmh.instance;
      var7.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      String[] var10000 = class_752.method_4253();
      int var8 = var1.method_2495(this.field_6952, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      String[] var6 = var10000;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      boolean var15 = blt.field_7072;
      if(var6 != null) {
         if(blt.field_7072) {
            float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
            float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
            float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         var7.setVisible6(var9, var10, var11);
         var15 = this.method_7223(var1, var2, var3, var4, var5, false);
      }

      return var15;
   }

   // $FF: renamed from: a (e2, int, int, int, int, boolean) boolean
   public boolean method_7223(class_467 var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var10000;
      String[] var7;
      label31: {
         var7 = class_752.method_4253();
         var10000 = var6;
         if(var7 != null) {
            if(var6 != 0) {
               var10000 = 0;
               break label31;
            }

            var10000 = var5;
         }

         var10000 &= 3;
      }

      int var8 = var10000;
      boolean var9 = false;
      float var10 = 0.0F;
      var10000 = var8;
      if(var7 != null) {
         switch(var8) {
         case 0:
            this.field_6971 = 2;
            this.field_6972 = 1;
            this.field_6973 = 3;
            this.field_6974 = 3;
            if(var7 != null) {
               break;
            }
         case 1:
            this.field_6969 = 1;
            this.field_6970 = 2;
            this.field_6973 = 2;
            this.field_6974 = 1;
            var9 = true;
            if(var7 != null) {
               break;
            }
         case 2:
            this.field_6971 = 1;
            this.field_6972 = 2;
            if(var7 != null) {
               break;
            }
         case 3:
            this.field_6969 = 2;
            this.field_6970 = 1;
            this.field_6973 = 1;
            this.field_6974 = 2;
            var9 = true;
         }

         var10 = this.method_7224(var1, var2, var3, var4, 0, var10, 0.75F, 0.25F, 0.75F, var9, (boolean)var6, var5);
         var10 = this.method_7224(var1, var2, var3, var4, 1, var10, 0.5F, 0.0625F, 0.625F, var9, (boolean)var6, var5);
         var10 = this.method_7224(var1, var2, var3, var4, 2, var10, 0.25F, 0.3125F, 0.5F, var9, (boolean)var6, var5);
         this.method_7224(var1, var2, var3, var4, 3, var10, 0.625F, 0.375F, 1.0F, var9, (boolean)var6, var5);
         this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         this.field_6969 = 0;
         this.field_6970 = 0;
         this.field_6971 = 0;
         this.field_6972 = 0;
         this.field_6973 = 0;
         this.field_6974 = 0;
         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (e2, int, int, int, int, float, float, float, float, boolean, boolean, int) float
   public float method_7224(class_467 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9, boolean var10, boolean var11, int var12) {
      String[] var13 = class_752.method_4253();
      boolean var10000 = var10;
      if(var13 != null) {
         if(var10) {
            float var14 = var7;
            var7 = var9;
            var9 = var14;
         }

         var7 /= 2.0F;
         var9 /= 2.0F;
         var1.field_2236 = var5;
         this.method_7209((double)(0.5F - var7), (double)var6, (double)(0.5F - var9), (double)(0.5F + var7), (double)(var6 + var8), (double)(0.5F + var9));
         var10000 = var11;
      }

      if(var13 != null) {
         if(var10000) {
            bmh var15 = bmh.instance;
            var15.setVisible2();
            var15.method_7466(0.0F, -1.0F, 0.0F);
            this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 0, var12));
            var15.getVisible8();
            var15.setVisible2();
            var15.method_7466(0.0F, 1.0F, 0.0F);
            this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 1, var12));
            var15.getVisible8();
            var15.setVisible2();
            var15.method_7466(0.0F, 0.0F, -1.0F);
            this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 2, var12));
            var15.getVisible8();
            var15.setVisible2();
            var15.method_7466(0.0F, 0.0F, 1.0F);
            this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 3, var12));
            var15.getVisible8();
            var15.setVisible2();
            var15.method_7466(-1.0F, 0.0F, 0.0F);
            this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 4, var12));
            var15.getVisible8();
            var15.setVisible2();
            var15.method_7466(1.0F, 0.0F, 0.0F);
            this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 5, var12));
            var15.getVisible8();
            if(var13 != null) {
               return var6 + var8;
            }
         }

         this.method_7260(var1, var2, var3, var4);
      }

      return var6 + var8;
   }

   // $FF: renamed from: c (aji, int, int, int) boolean
   public boolean method_7225(aji var1, int var2, int var3, int var4) {
      boolean var15;
      label58: {
         int var6 = this.field_6952.method_33(var2, var3, var4);
         bmh var7 = bmh.instance;
         var7.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
         var7.setVisible6(1.0F, 1.0F, 1.0F);
         String[] var10000 = class_752.method_4253();
         double var8 = 0.4000000059604645D;
         double var10 = 0.5D - var8;
         String[] var5 = var10000;
         double var12 = 0.20000000298023224D;
         int var14 = var6;
         byte var10001 = 1;
         if(var5 != null) {
            if(var6 == 1) {
               this.method_7251(var1, (double)var2 - var10, (double)var3 + var12, (double)var4, -var8, 0.0D, 0);
               if(var5 != null) {
                  break label58;
               }
            }

            var14 = var6;
            var10001 = 2;
         }

         if(var5 != null) {
            if(var14 == var10001) {
               this.method_7251(var1, (double)var2 + var10, (double)var3 + var12, (double)var4, var8, 0.0D, 0);
               if(var5 != null) {
                  break label58;
               }
            }

            var14 = var6;
            var10001 = 3;
         }

         if(var5 != null) {
            if(var14 == var10001) {
               this.method_7251(var1, (double)var2, (double)var3 + var12, (double)var4 - var10, 0.0D, -var8, 0);
               if(var5 != null) {
                  break label58;
               }
            }

            var14 = var6;
            var10001 = 4;
         }

         if(var14 == var10001) {
            this.method_7251(var1, (double)var2, (double)var3 + var12, (double)var4 + var10, 0.0D, var8, 0);
            if(var5 != null) {
               break label58;
            }
         }

         this.method_7251(var1, (double)var2, (double)var3, (double)var4, 0.0D, 0.0D, 0);
         if(var1 != class_1192.field_6077) {
            var15 = Config.isBetterSnow();
            if(var5 == null) {
               return var15;
            }

            if(var15) {
               var15 = this.hasSnowNeighbours(var2, var3, var4);
               if(var5 == null) {
                  return var15;
               }

               if(var15) {
                  this.renderSnow(var2, var3, var4, class_1192.field_6104.method_2490());
               }
            }
         }
      }

      var15 = true;
      return var15;
   }

   // $FF: renamed from: a (eU, int, int, int) boolean
   public boolean method_7226(class_432 var1, int var2, int var3, int var4) {
      int var6 = this.field_6952.method_33(var2, var3, var4);
      int var7 = var6 & 3;
      String[] var10000 = class_752.method_4253();
      int var8 = (var6 & 12) >> 2;
      bmh var9 = bmh.instance;
      var9.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      var9.setVisible6(1.0F, 1.0F, 1.0F);
      double var10 = -0.1875D;
      byte var12 = var1.method_2718(this.field_6952, var2, var3, var4, var6);
      double var13 = 0.0D;
      double var15 = 0.0D;
      String[] var5 = var10000;
      double var17 = 0.0D;
      double var19 = 0.0D;
      int var34 = var7;
      if(var5 != null) {
         switch(var7) {
         case 0:
            var19 = -0.3125D;
            var15 = class_432.field_2158[var8];
            if(var5 != null) {
               break;
            }
         case 1:
            var17 = 0.3125D;
            var13 = -class_432.field_2158[var8];
            if(var5 != null) {
               break;
            }
         case 2:
            var19 = 0.3125D;
            var15 = -class_432.field_2158[var8];
            if(var5 != null) {
               break;
            }
         case 3:
            var17 = -0.3125D;
            var13 = class_432.field_2158[var8];
         }

         var34 = var12;
      }

      label38: {
         if(var34 == 0) {
            this.method_7251(var1, (double)var2 + var13, (double)var3 + var10, (double)var4 + var15, 0.0D, 0.0D, 0);
            if(var5 != null) {
               break label38;
            }
         }

         class_73 var21 = this.method_7291(class_1192.field_6032);
         this.method_7204(var21);
         float var22 = 2.0F;
         float var23 = 14.0F;
         float var24 = 7.0F;
         float var25 = 9.0F;
         if(var5 != null) {
            switch(var7) {
            case 1:
            case 3:
               var22 = 7.0F;
               var23 = 9.0F;
               var24 = 2.0F;
               var25 = 14.0F;
            case 0:
            case 2:
            default:
               this.method_7209((double)(var22 / 16.0F + (float)var13), 0.125D, (double)(var24 / 16.0F + (float)var15), (double)(var23 / 16.0F + (float)var13), 0.25D, (double)(var25 / 16.0F + (float)var15));
            }
         }

         double var26 = (double)var21.method_370((double)var22);
         double var28 = (double)var21.method_373((double)var24);
         double var30 = (double)var21.method_370((double)var23);
         double var32 = (double)var21.method_373((double)var25);
         var9.addVertexWithUV((double)((float)var2 + var22 / 16.0F) + var13, (double)((float)var3 + 0.25F), (double)((float)var4 + var24 / 16.0F) + var15, var26, var28);
         var9.addVertexWithUV((double)((float)var2 + var22 / 16.0F) + var13, (double)((float)var3 + 0.25F), (double)((float)var4 + var25 / 16.0F) + var15, var26, var32);
         var9.addVertexWithUV((double)((float)var2 + var23 / 16.0F) + var13, (double)((float)var3 + 0.25F), (double)((float)var4 + var25 / 16.0F) + var15, var30, var32);
         var9.addVertexWithUV((double)((float)var2 + var23 / 16.0F) + var13, (double)((float)var3 + 0.25F), (double)((float)var4 + var24 / 16.0F) + var15, var30, var28);
         this.method_7260(var1, var2, var3, var4);
         this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);
         this.method_7205();
      }

      var9.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      var9.setVisible6(1.0F, 1.0F, 1.0F);
      this.method_7251(var1, (double)var2 + var17, (double)var3 + var10, (double)var4 + var19, 0.0D, 0.0D, 0);
      this.method_7228(var1, var2, var3, var4);
      return true;
   }

   // $FF: renamed from: a (eT, int, int, int) boolean
   public boolean method_7227(class_433 var1, int var2, int var3, int var4) {
      String[] var5;
      int var7;
      int var8;
      double var9;
      double var11;
      double var13;
      double var15;
      double var17;
      class_73 var19;
      label32: {
         bmh var6 = bmh.instance;
         var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
         var6.setVisible6(1.0F, 1.0F, 1.0F);
         String[] var10000 = class_752.method_4253();
         var7 = this.field_6952.method_33(var2, var3, var4);
         var8 = var7 & 3;
         var9 = 0.0D;
         var11 = -0.1875D;
         var13 = 0.0D;
         var5 = var10000;
         var15 = 0.0D;
         var17 = 0.0D;
         Object var20 = var1;
         int var10001 = var7;
         if(var5 != null) {
            if(var1.method_2734(var7)) {
               var19 = class_1192.field_6102.getBlockTextureFromSide(0);
               if(var5 != null) {
                  break label32;
               }
            }

            var11 -= 0.1875D;
            var20 = class_1192.field_6101;
            var10001 = 0;
         }

         var19 = ((aji)var20).getBlockTextureFromSide(var10001);
      }

      int var21 = var8;
      if(var5 != null) {
         switch(var8) {
         case 0:
            var13 = -0.3125D;
            var17 = 1.0D;
            if(var5 != null) {
               break;
            }
         case 1:
            var9 = 0.3125D;
            var15 = -1.0D;
            if(var5 != null) {
               break;
            }
         case 2:
            var13 = 0.3125D;
            var17 = -1.0D;
            if(var5 != null) {
               break;
            }
         case 3:
            var9 = -0.3125D;
            var15 = 1.0D;
         }

         this.method_7251(var1, (double)var2 + 0.25D * var15 + 0.1875D * var17, (double)((float)var3 - 0.1875F), (double)var4 + 0.25D * var17 + 0.1875D * var15, 0.0D, 0.0D, var7);
         this.method_7251(var1, (double)var2 + 0.25D * var15 + -0.1875D * var17, (double)((float)var3 - 0.1875F), (double)var4 + 0.25D * var17 + -0.1875D * var15, 0.0D, 0.0D, var7);
         this.method_7204(var19);
         this.method_7251(var1, (double)var2 + var9, (double)var3 + var11, (double)var4 + var13, 0.0D, 0.0D, var7);
         this.method_7205();
         this.method_7229(var1, var2, var3, var4, var8);
         var21 = 1;
      }

      return (boolean)var21;
   }

   // $FF: renamed from: a (eS, int, int, int) boolean
   public boolean method_7228(class_431 var1, int var2, int var3, int var4) {
      bmh var5 = bmh.instance;
      this.method_7229(var1, var2, var3, var4, this.field_6952.method_33(var2, var3, var4) & 3);
      return true;
   }

   // $FF: renamed from: a (eS, int, int, int, int) void
   public void method_7229(class_431 var1, int var2, int var3, int var4, int var5) {
      bmh var7;
      double var10;
      double var12;
      double var14;
      double var16;
      double var20;
      double var22;
      double var24;
      double var26;
      double var28;
      double var30;
      double var32;
      double var34;
      double var36;
      label35: {
         this.method_7260(var1, var2, var3, var4);
         var7 = bmh.instance;
         String[] var10000 = class_752.method_4253();
         var7.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
         String[] var6 = var10000;
         var7.setVisible6(1.0F, 1.0F, 1.0F);
         int var8 = this.field_6952.method_33(var2, var3, var4);
         class_73 var9 = this.drawTextBox9(var1, 1, var8);
         var10 = (double)var9.method_368();
         var12 = (double)var9.method_369();
         var14 = (double)var9.method_371();
         var16 = (double)var9.method_372();
         double var18 = 0.125D;
         var20 = (double)(var2 + 1);
         var22 = (double)(var2 + 1);
         var24 = (double)(var2 + 0);
         var26 = (double)(var2 + 0);
         var28 = (double)(var4 + 0);
         var30 = (double)(var4 + 1);
         var32 = (double)(var4 + 1);
         var34 = (double)(var4 + 0);
         var36 = (double)var3 + var18;
         int var38 = var5;
         byte var10001 = 2;
         if(var6 != null) {
            if(var5 == 2) {
               var20 = var22 = (double)(var2 + 0);
               var24 = var26 = (double)(var2 + 1);
               var28 = var34 = (double)(var4 + 1);
               var30 = var32 = (double)(var4 + 0);
               if(var6 != null) {
                  break label35;
               }
            }

            var38 = var5;
            var10001 = 3;
         }

         if(var6 != null) {
            if(var38 == var10001) {
               var20 = var26 = (double)(var2 + 0);
               var22 = var24 = (double)(var2 + 1);
               var28 = var30 = (double)(var4 + 0);
               var32 = var34 = (double)(var4 + 1);
               if(var6 != null) {
                  break label35;
               }
            }

            var38 = var5;
            var10001 = 1;
         }

         if(var6 != null) {
            if(var38 != var10001) {
               break label35;
            }

            var20 = var26 = (double)(var2 + 1);
            var22 = var24 = (double)(var2 + 0);
            var28 = var30 = (double)(var4 + 1);
            var38 = var4;
            var10001 = 0;
         }

         var32 = var34 = (double)(var38 + var10001);
      }

      var7.addVertexWithUV(var26, var36, var34, var10, var14);
      var7.addVertexWithUV(var24, var36, var32, var10, var16);
      var7.addVertexWithUV(var22, var36, var30, var12, var16);
      var7.addVertexWithUV(var20, var36, var28, var12, var14);
   }

   // $FF: renamed from: d (aji, int, int, int) void
   public void setCursorPosition0(aji var1, int var2, int var3, int var4) {
      this.field_6956 = true;
      this.setCursorPosition1(var1, var2, var3, var4, true);
      this.field_6956 = false;
   }

   // $FF: renamed from: b (aji, int, int, int, boolean) boolean
   public boolean setCursorPosition1(aji var1, int var2, int var3, int var4, boolean var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = this.field_6952.method_33(var2, var3, var4);
      String[] var6 = var10000;
      int var11 = var5;
      if(var6 != null) {
         label64: {
            if(var5 == 0) {
               var11 = var7 & 8;
               if(var6 == null) {
                  break label64;
               }

               if(var11 == 0) {
                  var11 = 0;
                  break label64;
               }
            }

            var11 = 1;
         }
      }

      int var8 = var11;
      int var9 = class_420.method_2686(var7);
      float var10 = 0.25F;
      var11 = var8;
      if(var6 != null) {
         if(var8 != 0) {
            if(var6 != null) {
               switch(var9) {
               case 0:
                  this.field_6969 = 3;
                  this.field_6970 = 3;
                  this.field_6971 = 3;
                  this.field_6972 = 3;
                  this.method_7209(0.0D, 0.25D, 0.0D, 1.0D, 1.0D, 1.0D);
                  if(var6 != null) {
                     break;
                  }
               case 1:
                  this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D);
                  if(var6 != null) {
                     break;
                  }
               case 2:
                  this.field_6971 = 1;
                  this.field_6972 = 2;
                  this.method_7209(0.0D, 0.0D, 0.25D, 1.0D, 1.0D, 1.0D);
                  if(var6 != null) {
                     break;
                  }
               case 3:
                  this.field_6971 = 2;
                  this.field_6972 = 1;
                  this.field_6973 = 3;
                  this.field_6974 = 3;
                  this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.75D);
                  if(var6 != null) {
                     break;
                  }
               case 4:
                  this.field_6969 = 1;
                  this.field_6970 = 2;
                  this.field_6973 = 2;
                  this.field_6974 = 1;
                  this.method_7209(0.25D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
                  if(var6 != null) {
                     break;
                  }
               case 5:
                  this.field_6969 = 2;
                  this.field_6970 = 1;
                  this.field_6973 = 1;
                  this.field_6974 = 2;
                  this.method_7209(0.0D, 0.0D, 0.0D, 0.75D, 1.0D, 1.0D);
               }

               ((class_420)var1).method_2682((float)this.field_6960, (float)this.field_6962, (float)this.field_6964, (float)this.field_6961, (float)this.field_6963, (float)this.field_6965);
               this.method_7260(var1, var2, var3, var4);
            }

            this.field_6969 = 0;
            this.field_6970 = 0;
            this.field_6971 = 0;
            this.field_6972 = 0;
            this.field_6973 = 0;
            this.field_6974 = 0;
            this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
            ((class_420)var1).method_2682((float)this.field_6960, (float)this.field_6962, (float)this.field_6964, (float)this.field_6961, (float)this.field_6963, (float)this.field_6965);
            if(var6 != null) {
               return true;
            }
         }

         var11 = var9;
      }

      switch(var11) {
      case 0:
         this.field_6969 = 3;
         this.field_6970 = 3;
         this.field_6971 = 3;
         this.field_6972 = 3;
      case 1:
      default:
         if(var6 != null) {
            break;
         }
      case 2:
         this.field_6971 = 1;
         this.field_6972 = 2;
         if(var6 != null) {
            break;
         }
      case 3:
         this.field_6971 = 2;
         this.field_6972 = 1;
         this.field_6973 = 3;
         this.field_6974 = 3;
         if(var6 != null) {
            break;
         }
      case 4:
         this.field_6969 = 1;
         this.field_6970 = 2;
         this.field_6973 = 2;
         this.field_6974 = 1;
         if(var6 != null) {
            break;
         }
      case 5:
         this.field_6969 = 2;
         this.field_6970 = 1;
         this.field_6973 = 1;
         this.field_6974 = 2;
      }

      this.method_7260(var1, var2, var3, var4);
      this.field_6969 = 0;
      this.field_6970 = 0;
      this.field_6971 = 0;
      this.field_6972 = 0;
      this.field_6973 = 0;
      this.field_6974 = 0;
      return true;
   }

   // $FF: renamed from: a (double, double, double, double, double, double, float, double) void
   public void setCursorPosition2(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      class_73 var17;
      label13: {
         String[] var10000 = class_752.method_4253();
         String[] var10001 = field_7032;
         var17 = class_420.method_2683("piston_side");
         String[] var16 = var10000;
         blm var27 = this;
         if(var16 != null) {
            if(!this.method_7206()) {
               break label13;
            }

            var27 = this;
         }

         var17 = var27.field_6953;
      }

      bmh var18 = bmh.instance;
      double var19 = (double)var17.method_368();
      double var21 = (double)var17.method_371();
      double var23 = (double)var17.method_370(var14);
      double var25 = (double)var17.method_373(4.0D);
      var18.setVisible6(var13, var13, var13);
      var18.addVertexWithUV(var1, var7, var9, var23, var21);
      var18.addVertexWithUV(var1, var5, var9, var19, var21);
      var18.addVertexWithUV(var3, var5, var11, var19, var25);
      var18.addVertexWithUV(var3, var7, var11, var23, var25);
   }

   // $FF: renamed from: b (double, double, double, double, double, double, float, double) void
   public void setCursorPosition3(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      class_73 var17;
      label13: {
         String[] var10000 = class_752.method_4253();
         String[] var10001 = field_7032;
         var17 = class_420.method_2683("piston_side");
         String[] var16 = var10000;
         blm var27 = this;
         if(var16 != null) {
            if(!this.method_7206()) {
               break label13;
            }

            var27 = this;
         }

         var17 = var27.field_6953;
      }

      bmh var18 = bmh.instance;
      double var19 = (double)var17.method_368();
      double var21 = (double)var17.method_371();
      double var23 = (double)var17.method_370(var14);
      double var25 = (double)var17.method_373(4.0D);
      var18.setVisible6(var13, var13, var13);
      var18.addVertexWithUV(var1, var5, var11, var23, var21);
      var18.addVertexWithUV(var1, var5, var9, var19, var21);
      var18.addVertexWithUV(var3, var7, var9, var19, var25);
      var18.addVertexWithUV(var3, var7, var11, var23, var25);
   }

   // $FF: renamed from: c (double, double, double, double, double, double, float, double) void
   public void setCursorPosition4(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      class_73 var17;
      label13: {
         String[] var10000 = class_752.method_4253();
         String[] var10001 = field_7032;
         var17 = class_420.method_2683("piston_side");
         String[] var16 = var10000;
         blm var27 = this;
         if(var16 != null) {
            if(!this.method_7206()) {
               break label13;
            }

            var27 = this;
         }

         var17 = var27.field_6953;
      }

      bmh var18 = bmh.instance;
      double var19 = (double)var17.method_368();
      double var21 = (double)var17.method_371();
      double var23 = (double)var17.method_370(var14);
      double var25 = (double)var17.method_373(4.0D);
      var18.setVisible6(var13, var13, var13);
      var18.addVertexWithUV(var3, var5, var9, var23, var21);
      var18.addVertexWithUV(var1, var5, var9, var19, var21);
      var18.addVertexWithUV(var1, var7, var11, var19, var25);
      var18.addVertexWithUV(var3, var7, var11, var23, var25);
   }

   // $FF: renamed from: a (aji, int, int, int, boolean) void
   public void setCursorPosition5(aji var1, int var2, int var3, int var4, boolean var5) {
      this.field_6956 = true;
      this.setCursorPosition6(var1, var2, var3, var4, var5);
      this.field_6956 = false;
   }

   // $FF: renamed from: c (aji, int, int, int, boolean) boolean
   public boolean setCursorPosition6(aji var1, int var2, int var3, int var4, boolean var5) {
      int var7 = this.field_6952.method_33(var2, var3, var4);
      int var8 = class_418.method_2678(var7);
      float var9 = 0.25F;
      String[] var10000 = class_752.method_4253();
      float var10 = 0.375F;
      String[] var6 = var10000;
      float var11 = 0.625F;
      float var12 = var5?1.0F:0.5F;
      double var13 = var5?16.0D:8.0D;
      int var15 = var8;
      if(var6 != null) {
         switch(var8) {
         case 0:
            this.field_6969 = 3;
            this.field_6970 = 3;
            this.field_6971 = 3;
            this.field_6972 = 3;
            this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D);
            this.method_7260(var1, var2, var3, var4);
            this.setCursorPosition2((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), 0.8F, var13);
            this.setCursorPosition2((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), 0.8F, var13);
            this.setCursorPosition2((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), 0.6F, var13);
            this.setCursorPosition2((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), 0.6F, var13);
            if(var6 != null) {
               break;
            }
         case 1:
            this.method_7209(0.0D, 0.75D, 0.0D, 1.0D, 1.0D, 1.0D);
            this.method_7260(var1, var2, var3, var4);
            this.setCursorPosition2((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), 0.8F, var13);
            this.setCursorPosition2((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), 0.8F, var13);
            this.setCursorPosition2((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), 0.6F, var13);
            this.setCursorPosition2((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), 0.6F, var13);
            if(var6 != null) {
               break;
            }
         case 2:
            this.field_6971 = 1;
            this.field_6972 = 2;
            this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.25D);
            this.method_7260(var1, var2, var3, var4);
            this.setCursorPosition3((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), 0.6F, var13);
            this.setCursorPosition3((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), 0.6F, var13);
            this.setCursorPosition3((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), 0.5F, var13);
            this.setCursorPosition3((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), 1.0F, var13);
            if(var6 != null) {
               break;
            }
         case 3:
            this.field_6971 = 2;
            this.field_6972 = 1;
            this.field_6973 = 3;
            this.field_6974 = 3;
            this.method_7209(0.0D, 0.0D, 0.75D, 1.0D, 1.0D, 1.0D);
            this.method_7260(var1, var2, var3, var4);
            this.setCursorPosition3((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), 0.6F, var13);
            this.setCursorPosition3((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), 0.6F, var13);
            this.setCursorPosition3((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), 0.5F, var13);
            this.setCursorPosition3((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), 1.0F, var13);
            if(var6 != null) {
               break;
            }
         case 4:
            this.field_6969 = 1;
            this.field_6970 = 2;
            this.field_6973 = 2;
            this.field_6974 = 1;
            this.method_7209(0.0D, 0.0D, 0.0D, 0.25D, 1.0D, 1.0D);
            this.method_7260(var1, var2, var3, var4);
            this.setCursorPosition4((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), 0.5F, var13);
            this.setCursorPosition4((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), 1.0F, var13);
            this.setCursorPosition4((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), 0.6F, var13);
            this.setCursorPosition4((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), 0.6F, var13);
            if(var6 != null) {
               break;
            }
         case 5:
            this.field_6969 = 2;
            this.field_6970 = 1;
            this.field_6973 = 1;
            this.field_6974 = 2;
            this.method_7209(0.75D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
            this.method_7260(var1, var2, var3, var4);
            this.setCursorPosition4((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), 0.5F, var13);
            this.setCursorPosition4((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), 1.0F, var13);
            this.setCursorPosition4((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), 0.6F, var13);
            this.setCursorPosition4((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), 0.6F, var13);
         }

         this.field_6969 = 0;
         this.field_6970 = 0;
         this.field_6971 = 0;
         this.field_6972 = 0;
         this.field_6973 = 0;
         this.field_6974 = 0;
         this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         var15 = 1;
      }

      return (boolean)var15;
   }

   // $FF: renamed from: e (aji, int, int, int) boolean
   public boolean setCursorPosition7(aji var1, int var2, int var3, int var4) {
      int var6 = this.field_6952.method_33(var2, var3, var4);
      String[] var5 = class_752.method_4253();
      int var7 = var6 & 7;
      int var10000 = var6 & 8;
      if(var5 != null) {
         var10000 = var10000 > 0?1:0;
      }

      int var8 = var10000;
      bmh var9 = bmh.instance;
      byte var10 = this.method_7206();
      if(var10 == 0) {
         this.method_7204(this.method_7291(class_1192.field_6029));
      }

      byte var10001;
      label345: {
         label346: {
            label347: {
               float var11 = 0.25F;
               float var12 = 0.1875F;
               float var13 = 0.1875F;
               var10000 = var7;
               var10001 = 5;
               if(var5 != null) {
                  if(var7 == 5) {
                     this.method_7209((double)(0.5F - var12), 0.0D, (double)(0.5F - var11), (double)(0.5F + var12), (double)var13, (double)(0.5F + var11));
                     if(var5 != null) {
                        break label347;
                     }
                  }

                  var10000 = var7;
                  var10001 = 6;
               }

               if(var5 != null) {
                  if(var10000 == var10001) {
                     this.method_7209((double)(0.5F - var11), 0.0D, (double)(0.5F - var12), (double)(0.5F + var11), (double)var13, (double)(0.5F + var12));
                     if(var5 != null) {
                        break label347;
                     }
                  }

                  var10000 = var7;
                  var10001 = 4;
               }

               if(var5 != null) {
                  if(var10000 == var10001) {
                     this.method_7209((double)(0.5F - var12), (double)(0.5F - var11), (double)(1.0F - var13), (double)(0.5F + var12), (double)(0.5F + var11), 1.0D);
                     if(var5 != null) {
                        break label347;
                     }
                  }

                  var10000 = var7;
                  var10001 = 3;
               }

               if(var5 != null) {
                  if(var10000 == var10001) {
                     this.method_7209((double)(0.5F - var12), (double)(0.5F - var11), 0.0D, (double)(0.5F + var12), (double)(0.5F + var11), (double)var13);
                     if(var5 != null) {
                        break label347;
                     }
                  }

                  var10000 = var7;
                  var10001 = 2;
               }

               label348: {
                  if(var5 != null) {
                     if(var10000 == var10001) {
                        this.method_7209((double)(1.0F - var13), (double)(0.5F - var11), (double)(0.5F - var12), 1.0D, (double)(0.5F + var11), (double)(0.5F + var12));
                        if(var5 != null) {
                           break label347;
                        }
                     }

                     var10000 = var7;
                     if(var5 == null) {
                        break label348;
                     }

                     var10001 = 1;
                  }

                  if(var10000 == var10001) {
                     this.method_7209(0.0D, (double)(0.5F - var11), (double)(0.5F - var12), (double)var13, (double)(0.5F + var11), (double)(0.5F + var12));
                     if(var5 != null) {
                        break label347;
                     }
                  }

                  var10000 = var7;
               }

               if(var5 != null) {
                  if(var10000 == 0) {
                     this.method_7209((double)(0.5F - var11), (double)(1.0F - var13), (double)(0.5F - var12), (double)(0.5F + var11), 1.0D, (double)(0.5F + var12));
                     if(var5 != null) {
                        break label347;
                     }
                  }

                  var10000 = var7;
               }

               if(var5 == null) {
                  break label346;
               }

               if(var10000 == 7) {
                  this.method_7209((double)(0.5F - var12), (double)(1.0F - var13), (double)(0.5F - var11), (double)(0.5F + var12), 1.0D, (double)(0.5F + var11));
               }
            }

            this.method_7260(var1, var2, var3, var4);
            if(var5 == null) {
               break label345;
            }

            var10000 = var10;
         }

         if(var10000 == 0) {
            this.method_7205();
         }

         var9.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
         var9.setVisible6(1.0F, 1.0F, 1.0F);
      }

      class_73 var14;
      label287: {
         var14 = this.method_7290(var1, 0);
         blm var32 = this;
         if(var5 != null) {
            if(!this.method_7206()) {
               break label287;
            }

            var32 = this;
         }

         var14 = var32.field_6953;
      }

      double var15 = (double)var14.method_368();
      double var17 = (double)var14.method_371();
      double var19 = (double)var14.method_369();
      double var21 = (double)var14.method_372();
      azw[] var23 = new azw[8];
      float var24 = 0.0625F;
      float var25 = 0.0625F;
      float var26 = 0.625F;
      var23[0] = azw.method_5086((double)(-var24), 0.0D, (double)(-var25));
      var23[1] = azw.method_5086((double)var24, 0.0D, (double)(-var25));
      var23[2] = azw.method_5086((double)var24, 0.0D, (double)var25);
      var23[3] = azw.method_5086((double)(-var24), 0.0D, (double)var25);
      var23[4] = azw.method_5086((double)(-var24), (double)var26, (double)(-var25));
      var23[5] = azw.method_5086((double)var24, (double)var26, (double)(-var25));
      var23[6] = azw.method_5086((double)var24, (double)var26, (double)var25);
      var23[7] = azw.method_5086((double)(-var24), (double)var26, (double)var25);
      int var27 = 0;

      while(var27 < 8) {
         label277: {
            if(var8 != 0) {
               var23[var27].field_4222 -= 0.0625D;
               var23[var27].method_5101(0.69813174F);
               if(var5 != null) {
                  break label277;
               }
            }

            var23[var27].field_4222 += 0.0625D;
            var23[var27].method_5101(-0.69813174F);
         }

         label272: {
            label271: {
               label351: {
                  label352: {
                     label353: {
                        label267: {
                           label354: {
                              var10000 = var7;
                              if(var5 != null) {
                                 if(var7 == 0) {
                                    break label354;
                                 }

                                 var10000 = var7;
                              }

                              var10001 = 7;
                              if(var5 == null) {
                                 break label353;
                              }

                              if(var10000 != 7) {
                                 break label267;
                              }
                           }

                           var23[var27].method_5103(3.1415927F);
                        }

                        var10000 = var7;
                        if(var5 == null) {
                           break label352;
                        }

                        var10001 = 6;
                     }

                     if(var10000 == var10001) {
                        break label351;
                     }

                     var10000 = var7;
                  }

                  if(var5 == null) {
                     break label272;
                  }

                  if(var10000 != 0) {
                     break label271;
                  }
               }

               var23[var27].method_5102(1.5707964F);
            }

            var10000 = var7;
         }

         label355: {
            if(var5 != null) {
               label242: {
                  if(var10000 > 0) {
                     var10000 = var7;
                     if(var5 == null) {
                        break label242;
                     }

                     if(var7 < 5) {
                        var23[var27].field_4221 -= 0.375D;
                        var23[var27].method_5101(1.5707964F);
                        var10000 = var7;
                        var10001 = 4;
                        if(var5 != null) {
                           if(var7 == 4) {
                              var23[var27].method_5102(0.0F);
                           }

                           var10000 = var7;
                           var10001 = 3;
                        }

                        if(var5 != null) {
                           if(var10000 == var10001) {
                              var23[var27].method_5102(3.1415927F);
                           }

                           var10000 = var7;
                           var10001 = 2;
                        }

                        if(var5 != null) {
                           if(var10000 == var10001) {
                              var23[var27].method_5102(1.5707964F);
                           }

                           var10000 = var7;
                           var10001 = 1;
                        }

                        if(var10000 == var10001) {
                           var23[var27].method_5102(-1.5707964F);
                        }

                        var23[var27].field_4220 += (double)var2 + 0.5D;
                        var23[var27].field_4221 += (double)((float)var3 + 0.5F);
                        var23[var27].field_4222 += (double)var4 + 0.5D;
                        if(var5 != null) {
                           break label355;
                        }
                     }
                  }

                  var10000 = var7;
               }
            }

            label223: {
               if(var5 != null) {
                  if(var10000 == 0) {
                     break label223;
                  }

                  var10000 = var7;
               }

               if(var10000 != 7) {
                  var23[var27].field_4220 += (double)var2 + 0.5D;
                  var23[var27].field_4221 += (double)((float)var3 + 0.125F);
                  var23[var27].field_4222 += (double)var4 + 0.5D;
                  if(var5 != null) {
                     break label355;
                  }
               }
            }

            var23[var27].field_4220 += (double)var2 + 0.5D;
            var23[var27].field_4221 += (double)((float)var3 + 0.875F);
            var23[var27].field_4222 += (double)var4 + 0.5D;
         }

         ++var27;
         if(var5 == null) {
            break;
         }
      }

      azw var33 = null;
      azw var28 = null;
      azw var29 = null;
      azw var30 = null;
      int var31 = 0;

      while(true) {
         if(var31 < 6) {
            var10000 = var31;
            if(var5 == null) {
               break;
            }

            label205: {
               label360: {
                  if(var5 != null) {
                     if(var31 == 0) {
                        var15 = (double)var14.method_370(7.0D);
                        var17 = (double)var14.method_373(6.0D);
                        var19 = (double)var14.method_370(9.0D);
                        var21 = (double)var14.method_373(8.0D);
                        if(var5 != null) {
                           break label360;
                        }
                     }

                     var10000 = var31;
                  }

                  if(var5 == null) {
                     break label205;
                  }

                  if(var10000 == 2) {
                     var15 = (double)var14.method_370(7.0D);
                     var17 = (double)var14.method_373(6.0D);
                     var19 = (double)var14.method_370(9.0D);
                     var21 = (double)var14.method_372();
                  }
               }

               var10000 = var31;
            }

            label361: {
               if(var5 != null) {
                  if(var10000 == 0) {
                     var33 = var23[0];
                     var28 = var23[1];
                     var29 = var23[2];
                     var30 = var23[3];
                     if(var5 != null) {
                        break label361;
                     }
                  }

                  var10000 = var31;
               }

               var10001 = 1;
               if(var5 != null) {
                  if(var10000 == 1) {
                     var33 = var23[7];
                     var28 = var23[6];
                     var29 = var23[5];
                     var30 = var23[4];
                     if(var5 != null) {
                        break label361;
                     }
                  }

                  var10000 = var31;
                  var10001 = 2;
               }

               if(var5 != null) {
                  if(var10000 == var10001) {
                     var33 = var23[1];
                     var28 = var23[0];
                     var29 = var23[4];
                     var30 = var23[5];
                     if(var5 != null) {
                        break label361;
                     }
                  }

                  var10000 = var31;
                  var10001 = 3;
               }

               if(var5 != null) {
                  if(var10000 == var10001) {
                     var33 = var23[2];
                     var28 = var23[1];
                     var29 = var23[5];
                     var30 = var23[6];
                     if(var5 != null) {
                        break label361;
                     }
                  }

                  var10000 = var31;
                  var10001 = 4;
               }

               if(var5 != null) {
                  if(var10000 == var10001) {
                     var33 = var23[3];
                     var28 = var23[2];
                     var29 = var23[6];
                     var30 = var23[7];
                     if(var5 != null) {
                        break label361;
                     }
                  }

                  var10000 = var31;
                  var10001 = 5;
               }

               if(var10000 == var10001) {
                  var33 = var23[0];
                  var28 = var23[3];
                  var29 = var23[7];
                  var30 = var23[4];
               }
            }

            var9.addVertexWithUV(var33.field_4220, var33.field_4221, var33.field_4222, var15, var21);
            var9.addVertexWithUV(var28.field_4220, var28.field_4221, var28.field_4222, var19, var21);
            var9.addVertexWithUV(var29.field_4220, var29.field_4221, var29.field_4222, var19, var17);
            var9.addVertexWithUV(var30.field_4220, var30.field_4221, var30.field_4222, var15, var17);
            ++var31;
            if(var5 != null) {
               continue;
            }
         }

         var10000 = Config.isBetterSnow();
         break;
      }

      if(var5 != null) {
         if(var10000 != 0) {
            var10000 = this.hasSnowNeighbours(var2, var3, var4);
            if(var5 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               this.renderSnow(var2, var3, var4, class_1192.field_6104.method_2490());
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f (aji, int, int, int) boolean
   public boolean setCursorPosition8(aji var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      bmh var6 = bmh.instance;
      int var7 = this.field_6952.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var8 = var7 & 3;
      int var64 = var7 & 4;
      if(var5 != null) {
         var64 = var64 == 4?1:0;
      }

      int var9 = var64;
      var64 = var7 & 8;
      if(var5 != null) {
         var64 = var64 == 8?1:0;
      }

      int var10 = var64;
      boolean var65 = ahb.method_2135(this.field_6952, var2, var3 - 1, var4);
      if(var5 != null) {
         var65 = !var65;
      }

      boolean var11 = var65;
      byte var12 = this.method_7206();
      if(var12 == 0) {
         this.method_7204(this.method_7291(class_1192.field_6030));
      }

      byte var10001;
      label391: {
         label392: {
            label393: {
               float var13 = 0.25F;
               float var14 = 0.125F;
               float var15 = 0.125F;
               float var16 = 0.3F - var13;
               float var17 = 0.3F + var13;
               var64 = var8;
               if(var5 != null) {
                  if(var8 == 2) {
                     this.method_7209((double)(0.5F - var14), (double)var16, (double)(1.0F - var15), (double)(0.5F + var14), (double)var17, 1.0D);
                     if(var5 != null) {
                        break label393;
                     }
                  }

                  var64 = var8;
               }

               if(var5 != null) {
                  if(var64 == 0) {
                     this.method_7209((double)(0.5F - var14), (double)var16, 0.0D, (double)(0.5F + var14), (double)var17, (double)var15);
                     if(var5 != null) {
                        break label393;
                     }
                  }

                  var64 = var8;
               }

               var10001 = 1;
               if(var5 != null) {
                  if(var64 == 1) {
                     this.method_7209((double)(1.0F - var15), (double)var16, (double)(0.5F - var14), 1.0D, (double)var17, (double)(0.5F + var14));
                     if(var5 != null) {
                        break label393;
                     }
                  }

                  var64 = var8;
                  if(var5 == null) {
                     break label392;
                  }

                  var10001 = 3;
               }

               if(var64 == var10001) {
                  this.method_7209(0.0D, (double)var16, (double)(0.5F - var14), (double)var15, (double)var17, (double)(0.5F + var14));
               }
            }

            this.method_7260(var1, var2, var3, var4);
            if(var5 == null) {
               break label391;
            }

            var64 = var12;
         }

         if(var64 == 0) {
            this.method_7205();
         }

         var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
         var6.setVisible6(1.0F, 1.0F, 1.0F);
      }

      class_73 var18;
      label355: {
         var18 = this.method_7290(var1, 0);
         blm var66 = this;
         if(var5 != null) {
            if(!this.method_7206()) {
               break label355;
            }

            var66 = this;
         }

         var18 = var66.field_6953;
      }

      double var19 = (double)var18.method_368();
      double var21 = (double)var18.method_371();
      double var23 = (double)var18.method_369();
      double var25 = (double)var18.method_372();
      azw[] var27 = new azw[8];
      float var28 = 0.046875F;
      float var29 = 0.046875F;
      float var30 = 0.3125F;
      var27[0] = azw.method_5086((double)(-var28), 0.0D, (double)(-var29));
      var27[1] = azw.method_5086((double)var28, 0.0D, (double)(-var29));
      var27[2] = azw.method_5086((double)var28, 0.0D, (double)var29);
      var27[3] = azw.method_5086((double)(-var28), 0.0D, (double)var29);
      var27[4] = azw.method_5086((double)(-var28), (double)var30, (double)(-var29));
      var27[5] = azw.method_5086((double)var28, (double)var30, (double)(-var29));
      var27[6] = azw.method_5086((double)var28, (double)var30, (double)var29);
      var27[7] = azw.method_5086((double)(-var28), (double)var30, (double)var29);
      int var31 = 0;

      while(var31 < 8) {
         label396: {
            var27[var31].field_4222 += 0.0625D;
            var64 = var10;
            if(var5 != null) {
               if(var10 != 0) {
                  var27[var31].method_5101(0.5235988F);
                  var27[var31].field_4221 -= 0.4375D;
                  if(var5 != null) {
                     break label396;
                  }
               }

               var64 = var9;
            }

            if(var64 != 0) {
               var27[var31].method_5101(0.08726647F);
               var27[var31].field_4221 -= 0.4375D;
               if(var5 != null) {
                  break label396;
               }
            }

            var27[var31].method_5101(-0.69813174F);
            var27[var31].field_4221 -= 0.375D;
         }

         var27[var31].method_5101(1.5707964F);
         var64 = var8;
         if(var5 != null) {
            if(var8 == 2) {
               var27[var31].method_5102(0.0F);
            }

            var64 = var8;
         }

         if(var5 != null) {
            if(var64 == 0) {
               var27[var31].method_5102(3.1415927F);
            }

            var64 = var8;
         }

         var10001 = 1;
         if(var5 != null) {
            if(var64 == 1) {
               var27[var31].method_5102(1.5707964F);
            }

            var64 = var8;
            var10001 = 3;
         }

         if(var64 == var10001) {
            var27[var31].method_5102(-1.5707964F);
         }

         var27[var31].field_4220 += (double)var2 + 0.5D;
         var27[var31].field_4221 += (double)((float)var3 + 0.3125F);
         var27[var31].field_4222 += (double)var4 + 0.5D;
         ++var31;
         if(var5 == null) {
            break;
         }
      }

      azw var61 = null;
      azw var32 = null;
      azw var33 = null;
      azw var34 = null;
      byte var35 = 7;
      byte var36 = 9;
      byte var37 = 9;
      byte var38 = 16;
      int var39 = 0;

      while(var39 < 6) {
         label398: {
            var64 = var39;
            if(var5 != null) {
               if(var39 == 0) {
                  var61 = var27[0];
                  var32 = var27[1];
                  var33 = var27[2];
                  var34 = var27[3];
                  var19 = (double)var18.method_370((double)var35);
                  var21 = (double)var18.method_373((double)var37);
                  var23 = (double)var18.method_370((double)var36);
                  var25 = (double)var18.method_373((double)(var37 + 2));
                  if(var5 != null) {
                     break label398;
                  }
               }

               var64 = var39;
            }

            var10001 = 1;
            if(var5 != null) {
               if(var64 == 1) {
                  var61 = var27[7];
                  var32 = var27[6];
                  var33 = var27[5];
                  var34 = var27[4];
                  if(var5 != null) {
                     break label398;
                  }
               }

               var64 = var39;
               var10001 = 2;
            }

            if(var5 != null) {
               if(var64 == var10001) {
                  var61 = var27[1];
                  var32 = var27[0];
                  var33 = var27[4];
                  var34 = var27[5];
                  var19 = (double)var18.method_370((double)var35);
                  var21 = (double)var18.method_373((double)var37);
                  var23 = (double)var18.method_370((double)var36);
                  var25 = (double)var18.method_373((double)var38);
                  if(var5 != null) {
                     break label398;
                  }
               }

               var64 = var39;
               var10001 = 3;
            }

            if(var5 != null) {
               if(var64 == var10001) {
                  var61 = var27[2];
                  var32 = var27[1];
                  var33 = var27[5];
                  var34 = var27[6];
                  if(var5 != null) {
                     break label398;
                  }
               }

               var64 = var39;
               var10001 = 4;
            }

            if(var5 != null) {
               if(var64 == var10001) {
                  var61 = var27[3];
                  var32 = var27[2];
                  var33 = var27[6];
                  var34 = var27[7];
                  if(var5 != null) {
                     break label398;
                  }
               }

               var64 = var39;
               var10001 = 5;
            }

            if(var64 == var10001) {
               var61 = var27[0];
               var32 = var27[3];
               var33 = var27[7];
               var34 = var27[4];
            }
         }

         var6.addVertexWithUV(var61.field_4220, var61.field_4221, var61.field_4222, var19, var25);
         var6.addVertexWithUV(var32.field_4220, var32.field_4221, var32.field_4222, var23, var25);
         var6.addVertexWithUV(var33.field_4220, var33.field_4221, var33.field_4222, var23, var21);
         var6.addVertexWithUV(var34.field_4220, var34.field_4221, var34.field_4222, var19, var21);
         ++var39;
         if(var5 == null) {
            break;
         }
      }

      float var62 = 0.09375F;
      float var40 = 0.09375F;
      float var41 = 0.03125F;
      var27[0] = azw.method_5086((double)(-var62), 0.0D, (double)(-var40));
      var27[1] = azw.method_5086((double)var62, 0.0D, (double)(-var40));
      var27[2] = azw.method_5086((double)var62, 0.0D, (double)var40);
      var27[3] = azw.method_5086((double)(-var62), 0.0D, (double)var40);
      var27[4] = azw.method_5086((double)(-var62), (double)var41, (double)(-var40));
      var27[5] = azw.method_5086((double)var62, (double)var41, (double)(-var40));
      var27[6] = azw.method_5086((double)var62, (double)var41, (double)var40);
      var27[7] = azw.method_5086((double)(-var62), (double)var41, (double)var40);
      int var42 = 0;

      while(true) {
         if(var42 < 8) {
            var27[var42].field_4222 += 0.21875D;
            var64 = var10;
            if(var5 == null) {
               break;
            }

            label400: {
               if(var5 != null) {
                  if(var10 != 0) {
                     var27[var42].field_4221 -= 0.09375D;
                     var27[var42].field_4222 -= 0.1625D;
                     var27[var42].method_5101(0.0F);
                     if(var5 != null) {
                        break label400;
                     }
                  }

                  var64 = var9;
               }

               if(var64 != 0) {
                  var27[var42].field_4221 += 0.015625D;
                  var27[var42].field_4222 -= 0.171875D;
                  var27[var42].method_5101(0.17453294F);
                  if(var5 != null) {
                     break label400;
                  }
               }

               var27[var42].method_5101(0.87266463F);
            }

            var64 = var8;
            if(var5 != null) {
               if(var8 == 2) {
                  var27[var42].method_5102(0.0F);
               }

               var64 = var8;
            }

            if(var5 != null) {
               if(var64 == 0) {
                  var27[var42].method_5102(3.1415927F);
               }

               var64 = var8;
            }

            var10001 = 1;
            if(var5 != null) {
               if(var64 == 1) {
                  var27[var42].method_5102(1.5707964F);
               }

               var64 = var8;
               var10001 = 3;
            }

            if(var64 == var10001) {
               var27[var42].method_5102(-1.5707964F);
            }

            var27[var42].field_4220 += (double)var2 + 0.5D;
            var27[var42].field_4221 += (double)((float)var3 + 0.3125F);
            var27[var42].field_4222 += (double)var4 + 0.5D;
            ++var42;
            if(var5 != null) {
               continue;
            }
         }

         var42 = 5;
         var64 = 11;
         break;
      }

      int var43 = var64;
      byte var44 = 3;
      byte var45 = 9;
      int var46 = 0;

      while(true) {
         if(var46 < 6) {
            var64 = var46;
            if(var5 == null) {
               break;
            }

            label402: {
               if(var5 != null) {
                  if(var46 == 0) {
                     var61 = var27[0];
                     var32 = var27[1];
                     var33 = var27[2];
                     var34 = var27[3];
                     var19 = (double)var18.method_370((double)var42);
                     var21 = (double)var18.method_373((double)var44);
                     var23 = (double)var18.method_370((double)var43);
                     var25 = (double)var18.method_373((double)var45);
                     if(var5 != null) {
                        break label402;
                     }
                  }

                  var64 = var46;
               }

               var10001 = 1;
               if(var5 != null) {
                  if(var64 == 1) {
                     var61 = var27[7];
                     var32 = var27[6];
                     var33 = var27[5];
                     var34 = var27[4];
                     if(var5 != null) {
                        break label402;
                     }
                  }

                  var64 = var46;
                  var10001 = 2;
               }

               if(var5 != null) {
                  if(var64 == var10001) {
                     var61 = var27[1];
                     var32 = var27[0];
                     var33 = var27[4];
                     var34 = var27[5];
                     var19 = (double)var18.method_370((double)var42);
                     var21 = (double)var18.method_373((double)var44);
                     var23 = (double)var18.method_370((double)var43);
                     var25 = (double)var18.method_373((double)(var44 + 2));
                     if(var5 != null) {
                        break label402;
                     }
                  }

                  var64 = var46;
                  var10001 = 3;
               }

               if(var5 != null) {
                  if(var64 == var10001) {
                     var61 = var27[2];
                     var32 = var27[1];
                     var33 = var27[5];
                     var34 = var27[6];
                     if(var5 != null) {
                        break label402;
                     }
                  }

                  var64 = var46;
                  var10001 = 4;
               }

               if(var5 != null) {
                  if(var64 == var10001) {
                     var61 = var27[3];
                     var32 = var27[2];
                     var33 = var27[6];
                     var34 = var27[7];
                     if(var5 != null) {
                        break label402;
                     }
                  }

                  var64 = var46;
                  var10001 = 5;
               }

               if(var64 == var10001) {
                  var61 = var27[0];
                  var32 = var27[3];
                  var33 = var27[7];
                  var34 = var27[4];
               }
            }

            var6.addVertexWithUV(var61.field_4220, var61.field_4221, var61.field_4222, var19, var25);
            var6.addVertexWithUV(var32.field_4220, var32.field_4221, var32.field_4222, var23, var25);
            var6.addVertexWithUV(var33.field_4220, var33.field_4221, var33.field_4222, var23, var21);
            var6.addVertexWithUV(var34.field_4220, var34.field_4221, var34.field_4222, var19, var21);
            ++var46;
            if(var5 != null) {
               continue;
            }
         }

         var64 = var9;
         break;
      }

      if(var5 != null) {
         if(var64 != 0) {
            label403: {
               double var63 = var27[0].field_4221;
               float var48 = 0.03125F;
               float var49 = 0.5F - var48 / 2.0F;
               float var50 = var49 + var48;
               double var51 = (double)var18.method_368();
               double var53 = (double)var18.method_373(var9 != 0?2.0D:0.0D);
               double var55 = (double)var18.method_369();
               double var57 = (double)var18.method_373(var9 != 0?4.0D:2.0D);
               double var59 = (double)(var11?3.5F:1.5F) / 16.0D;
               var6.setVisible6(0.75F, 0.75F, 0.75F);
               var64 = var8;
               if(var5 != null) {
                  if(var8 == 2) {
                     var6.addVertexWithUV((double)((float)var2 + var49), (double)var3 + var59, (double)var4 + 0.25D, var51, var53);
                     var6.addVertexWithUV((double)((float)var2 + var50), (double)var3 + var59, (double)var4 + 0.25D, var51, var57);
                     var6.addVertexWithUV((double)((float)var2 + var50), (double)var3 + var59, (double)var4, var55, var57);
                     var6.addVertexWithUV((double)((float)var2 + var49), (double)var3 + var59, (double)var4, var55, var53);
                     var6.addVertexWithUV((double)((float)var2 + var49), var63, (double)var4 + 0.5D, var51, var53);
                     var6.addVertexWithUV((double)((float)var2 + var50), var63, (double)var4 + 0.5D, var51, var57);
                     var6.addVertexWithUV((double)((float)var2 + var50), (double)var3 + var59, (double)var4 + 0.25D, var55, var57);
                     var6.addVertexWithUV((double)((float)var2 + var49), (double)var3 + var59, (double)var4 + 0.25D, var55, var53);
                     if(var5 != null) {
                        break label403;
                     }
                  }

                  var64 = var8;
               }

               if(var5 != null) {
                  if(var64 == 0) {
                     var6.addVertexWithUV((double)((float)var2 + var49), (double)var3 + var59, (double)var4 + 0.75D, var51, var53);
                     var6.addVertexWithUV((double)((float)var2 + var50), (double)var3 + var59, (double)var4 + 0.75D, var51, var57);
                     var6.addVertexWithUV((double)((float)var2 + var50), var63, (double)var4 + 0.5D, var55, var57);
                     var6.addVertexWithUV((double)((float)var2 + var49), var63, (double)var4 + 0.5D, var55, var53);
                     var6.addVertexWithUV((double)((float)var2 + var49), (double)var3 + var59, (double)(var4 + 1), var51, var53);
                     var6.addVertexWithUV((double)((float)var2 + var50), (double)var3 + var59, (double)(var4 + 1), var51, var57);
                     var6.addVertexWithUV((double)((float)var2 + var50), (double)var3 + var59, (double)var4 + 0.75D, var55, var57);
                     var6.addVertexWithUV((double)((float)var2 + var49), (double)var3 + var59, (double)var4 + 0.75D, var55, var53);
                     if(var5 != null) {
                        break label403;
                     }
                  }

                  var64 = var8;
               }

               if(var64 == 1) {
                  var6.addVertexWithUV((double)var2, (double)var3 + var59, (double)((float)var4 + var50), var51, var57);
                  var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var59, (double)((float)var4 + var50), var55, var57);
                  var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var59, (double)((float)var4 + var49), var55, var53);
                  var6.addVertexWithUV((double)var2, (double)var3 + var59, (double)((float)var4 + var49), var51, var53);
                  var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var59, (double)((float)var4 + var50), var51, var57);
                  var6.addVertexWithUV((double)var2 + 0.5D, var63, (double)((float)var4 + var50), var55, var57);
                  var6.addVertexWithUV((double)var2 + 0.5D, var63, (double)((float)var4 + var49), var55, var53);
                  var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var59, (double)((float)var4 + var49), var51, var53);
                  if(var5 != null) {
                     break label403;
                  }
               }

               var6.addVertexWithUV((double)var2 + 0.5D, var63, (double)((float)var4 + var50), var51, var57);
               var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var59, (double)((float)var4 + var50), var55, var57);
               var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var59, (double)((float)var4 + var49), var55, var53);
               var6.addVertexWithUV((double)var2 + 0.5D, var63, (double)((float)var4 + var49), var51, var53);
               var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var59, (double)((float)var4 + var50), var51, var57);
               var6.addVertexWithUV((double)(var2 + 1), (double)var3 + var59, (double)((float)var4 + var50), var55, var57);
               var6.addVertexWithUV((double)(var2 + 1), (double)var3 + var59, (double)((float)var4 + var49), var55, var53);
               var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var59, (double)((float)var4 + var49), var51, var53);
            }
         }

         var64 = 1;
      }

      return (boolean)var64;
   }

   // $FF: renamed from: g (aji, int, int, int) boolean
   public boolean setCursorPosition9(aji var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      bmh var6 = bmh.instance;
      String[] var5 = var10000;
      class_73 var7 = this.method_7290(var1, 0);
      int var8 = this.field_6952.method_33(var2, var3, var4);
      int var28 = var8 & 4;
      if(var5 != null) {
         var28 = var28 == 4?1:0;
      }

      int var9 = var28;
      var28 = var8 & 2;
      if(var5 != null) {
         var28 = var28 == 2?1:0;
      }

      int var10 = var28;
      if(var5 != null) {
         if(this.method_7206()) {
            var7 = this.field_6953;
         }

         var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
         var6.setVisible6(1.0F, 1.0F, 1.0F);
      }

      double var11 = (double)var7.method_368();
      double var13 = (double)var7.method_373(var9 != 0?2.0D:0.0D);
      double var15 = (double)var7.method_369();
      double var17 = (double)var7.method_373(var9 != 0?4.0D:2.0D);
      double var19 = (double)(var10 != 0?3.5F:1.5F) / 16.0D;
      boolean var21 = class_427.method_2710(this.field_6952, var2, var3, var4, var8, 1);
      boolean var22 = class_427.method_2710(this.field_6952, var2, var3, var4, var8, 3);
      boolean var23 = class_427.method_2710(this.field_6952, var2, var3, var4, var8, 2);
      boolean var24 = class_427.method_2710(this.field_6952, var2, var3, var4, var8, 0);
      float var25 = 0.03125F;
      float var26 = 0.5F - var25 / 2.0F;
      float var27 = var26 + var25;
      boolean var29 = var23;
      if(var5 != null) {
         label219: {
            if(!var23) {
               var29 = var22;
               if(var5 == null) {
                  break label219;
               }

               if(!var22) {
                  var29 = var24;
                  if(var5 == null) {
                     break label219;
                  }

                  if(!var24) {
                     var29 = var21;
                     if(var5 == null) {
                        break label219;
                     }

                     if(!var21) {
                        var23 = true;
                        var24 = true;
                     }
                  }
               }
            }

            var29 = var23;
         }
      }

      if(var5 != null) {
         if(var29) {
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.25D, var11, var13);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.25D, var11, var17);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4, var15, var17);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4, var15, var13);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4, var15, var13);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4, var15, var17);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.25D, var11, var17);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.25D, var11, var13);
         }

         var29 = var23;
      }

      label206: {
         label205: {
            label229: {
               if(var5 != null) {
                  if(var29) {
                     break label229;
                  }

                  var29 = var24;
               }

               if(var5 == null) {
                  break label206;
               }

               if(!var29) {
                  break label205;
               }

               var29 = var22;
               if(var5 == null) {
                  break label206;
               }

               if(var22) {
                  break label205;
               }

               var29 = var21;
               if(var5 == null) {
                  break label206;
               }

               if(var21) {
                  break label205;
               }
            }

            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.5D, var11, var13);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.5D, var11, var17);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.25D, var15, var17);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.25D, var15, var13);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.25D, var15, var13);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.25D, var15, var17);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.5D, var11, var17);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.5D, var11, var13);
         }

         var29 = var24;
      }

      label185: {
         label184: {
            label230: {
               if(var5 != null) {
                  if(var29) {
                     break label230;
                  }

                  var29 = var23;
               }

               if(var5 == null) {
                  break label185;
               }

               if(!var29) {
                  break label184;
               }

               var29 = var22;
               if(var5 == null) {
                  break label185;
               }

               if(var22) {
                  break label184;
               }

               var29 = var21;
               if(var5 == null) {
                  break label185;
               }

               if(var21) {
                  break label184;
               }
            }

            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.75D, var11, var13);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.75D, var11, var17);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.5D, var15, var17);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.5D, var15, var13);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.5D, var15, var13);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.5D, var15, var17);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.75D, var11, var17);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.75D, var11, var13);
         }

         var29 = var24;
      }

      if(var5 != null) {
         if(var29) {
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)(var4 + 1), var11, var13);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)(var4 + 1), var11, var17);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.75D, var15, var17);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.75D, var15, var13);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)var4 + 0.75D, var15, var13);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)var4 + 0.75D, var15, var17);
            var6.addVertexWithUV((double)((float)var2 + var27), (double)var3 + var19, (double)(var4 + 1), var11, var17);
            var6.addVertexWithUV((double)((float)var2 + var26), (double)var3 + var19, (double)(var4 + 1), var11, var13);
         }

         var29 = var21;
      }

      if(var5 != null) {
         if(var29) {
            var6.addVertexWithUV((double)var2, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
            var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
            var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
            var6.addVertexWithUV((double)var2, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
            var6.addVertexWithUV((double)var2, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
            var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
            var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
            var6.addVertexWithUV((double)var2, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
         }

         var29 = var21;
      }

      label161: {
         label160: {
            label231: {
               if(var5 != null) {
                  if(var29) {
                     break label231;
                  }

                  var29 = var22;
               }

               if(var5 == null) {
                  break label161;
               }

               if(!var29) {
                  break label160;
               }

               var29 = var23;
               if(var5 == null) {
                  break label161;
               }

               if(var23) {
                  break label160;
               }

               var29 = var24;
               if(var5 == null) {
                  break label161;
               }

               if(var24) {
                  break label160;
               }
            }

            var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
            var6.addVertexWithUV((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
            var6.addVertexWithUV((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
            var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
            var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
            var6.addVertexWithUV((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
            var6.addVertexWithUV((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
            var6.addVertexWithUV((double)var2 + 0.25D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
         }

         var29 = var22;
      }

      label140: {
         label139: {
            label232: {
               if(var5 != null) {
                  if(var29) {
                     break label232;
                  }

                  var29 = var21;
               }

               if(var5 == null) {
                  break label140;
               }

               if(!var29) {
                  break label139;
               }

               var29 = var23;
               if(var5 == null) {
                  break label140;
               }

               if(var23) {
                  break label139;
               }

               var29 = var24;
               if(var5 == null) {
                  break label140;
               }

               if(var24) {
                  break label139;
               }
            }

            var6.addVertexWithUV((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
            var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
            var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
            var6.addVertexWithUV((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
            var6.addVertexWithUV((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
            var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
            var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
            var6.addVertexWithUV((double)var2 + 0.5D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
         }

         var29 = var22;
      }

      if(var5 != null) {
         if(var29) {
            var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
            var6.addVertexWithUV((double)(var2 + 1), (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
            var6.addVertexWithUV((double)(var2 + 1), (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
            var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
            var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var26), var11, var13);
            var6.addVertexWithUV((double)(var2 + 1), (double)var3 + var19, (double)((float)var4 + var26), var15, var13);
            var6.addVertexWithUV((double)(var2 + 1), (double)var3 + var19, (double)((float)var4 + var27), var15, var17);
            var6.addVertexWithUV((double)var2 + 0.75D, (double)var3 + var19, (double)((float)var4 + var27), var11, var17);
         }

         var29 = true;
      }

      return var29;
   }

   // $FF: renamed from: a (e7, int, int, int) boolean
   public boolean method_7240(class_461 var1, int var2, int var3, int var4) {
      bmh var6 = bmh.instance;
      String[] var5 = class_752.method_4253();
      class_73 var7 = var1.method_2805(0);
      class_73 var8 = var1.method_2805(1);
      class_73 var9 = var7;
      if(var5 != null) {
         if(this.method_7206()) {
            var9 = this.field_6953;
         }

         var6.setVisible6(1.0F, 1.0F, 1.0F);
         var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      }

      double var10 = (double)var9.method_368();
      double var12 = (double)var9.method_371();
      double var14 = (double)var9.method_369();
      double var16 = (double)var9.method_372();
      float var18 = 1.4F;
      int var10000 = ahb.method_2135(this.field_6952, var2, var3 - 1, var4);
      double var19;
      double var21;
      double var23;
      double var25;
      double var27;
      double var29;
      double var31;
      if(var5 != null) {
         label100: {
            if(var10000 == 0) {
               var10000 = class_1192.field_6078.method_2803(this.field_6952, var2, var3 - 1, var4);
               if(var5 == null) {
                  break label100;
               }

               if(var10000 == 0) {
                  float var33;
                  float var34;
                  label107: {
                     var33 = 0.2F;
                     var34 = 0.0625F;
                     var10000 = var2 + var3 + var4 & 1;
                     byte var10001 = 1;
                     if(var5 != null) {
                        if(var10000 == 1) {
                           var10 = (double)var8.method_368();
                           var12 = (double)var8.method_371();
                           var14 = (double)var8.method_369();
                           var16 = (double)var8.method_372();
                        }

                        var10000 = var2 / 2 + var3 / 2 + var4 / 2 & 1;
                        if(var5 == null) {
                           break label107;
                        }

                        var10001 = 1;
                     }

                     if(var10000 == var10001) {
                        var19 = var14;
                        var14 = var10;
                        var10 = var19;
                     }

                     var10000 = class_1192.field_6078.method_2803(this.field_6952, var2 - 1, var3, var4);
                  }

                  if(var5 != null) {
                     if(var10000 != 0) {
                        var6.addVertexWithUV((double)((float)var2 + var33), (double)((float)var3 + var18 + var34), (double)(var4 + 1), var14, var12);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 1), var14, var16);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 0), var10, var16);
                        var6.addVertexWithUV((double)((float)var2 + var33), (double)((float)var3 + var18 + var34), (double)(var4 + 0), var10, var12);
                        var6.addVertexWithUV((double)((float)var2 + var33), (double)((float)var3 + var18 + var34), (double)(var4 + 0), var10, var12);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 0), var10, var16);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 1), var14, var16);
                        var6.addVertexWithUV((double)((float)var2 + var33), (double)((float)var3 + var18 + var34), (double)(var4 + 1), var14, var12);
                     }

                     var10000 = class_1192.field_6078.method_2803(this.field_6952, var2 + 1, var3, var4);
                  }

                  if(var5 != null) {
                     if(var10000 != 0) {
                        var6.addVertexWithUV((double)((float)(var2 + 1) - var33), (double)((float)var3 + var18 + var34), (double)(var4 + 0), var10, var12);
                        var6.addVertexWithUV((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 0), var10, var16);
                        var6.addVertexWithUV((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 1), var14, var16);
                        var6.addVertexWithUV((double)((float)(var2 + 1) - var33), (double)((float)var3 + var18 + var34), (double)(var4 + 1), var14, var12);
                        var6.addVertexWithUV((double)((float)(var2 + 1) - var33), (double)((float)var3 + var18 + var34), (double)(var4 + 1), var14, var12);
                        var6.addVertexWithUV((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 1), var14, var16);
                        var6.addVertexWithUV((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 0), var10, var16);
                        var6.addVertexWithUV((double)((float)(var2 + 1) - var33), (double)((float)var3 + var18 + var34), (double)(var4 + 0), var10, var12);
                     }

                     var10000 = class_1192.field_6078.method_2803(this.field_6952, var2, var3, var4 - 1);
                  }

                  if(var5 != null) {
                     if(var10000 != 0) {
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)var3 + var18 + var34), (double)((float)var4 + var33), var14, var12);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 0), var14, var16);
                        var6.addVertexWithUV((double)(var2 + 1), (double)((float)(var3 + 0) + var34), (double)(var4 + 0), var10, var16);
                        var6.addVertexWithUV((double)(var2 + 1), (double)((float)var3 + var18 + var34), (double)((float)var4 + var33), var10, var12);
                        var6.addVertexWithUV((double)(var2 + 1), (double)((float)var3 + var18 + var34), (double)((float)var4 + var33), var10, var12);
                        var6.addVertexWithUV((double)(var2 + 1), (double)((float)(var3 + 0) + var34), (double)(var4 + 0), var10, var16);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 0), var14, var16);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)var3 + var18 + var34), (double)((float)var4 + var33), var14, var12);
                     }

                     var10000 = class_1192.field_6078.method_2803(this.field_6952, var2, var3, var4 + 1);
                  }

                  if(var5 != null) {
                     if(var10000 != 0) {
                        var6.addVertexWithUV((double)(var2 + 1), (double)((float)var3 + var18 + var34), (double)((float)(var4 + 1) - var33), var10, var12);
                        var6.addVertexWithUV((double)(var2 + 1), (double)((float)(var3 + 0) + var34), (double)(var4 + 1 - 0), var10, var16);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 1 - 0), var14, var16);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)var3 + var18 + var34), (double)((float)(var4 + 1) - var33), var14, var12);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)var3 + var18 + var34), (double)((float)(var4 + 1) - var33), var14, var12);
                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 0) + var34), (double)(var4 + 1 - 0), var14, var16);
                        var6.addVertexWithUV((double)(var2 + 1), (double)((float)(var3 + 0) + var34), (double)(var4 + 1 - 0), var10, var16);
                        var6.addVertexWithUV((double)(var2 + 1), (double)((float)var3 + var18 + var34), (double)((float)(var4 + 1) - var33), var10, var12);
                     }

                     var10000 = class_1192.field_6078.method_2803(this.field_6952, var2, var3 + 1, var4);
                  }

                  label111: {
                     if(var5 != null) {
                        if(var10000 == 0) {
                           break label111;
                        }

                        var10000 = var2;
                     }

                     var19 = (double)var10000 + 0.5D + 0.5D;
                     var21 = (double)var2 + 0.5D - 0.5D;
                     var23 = (double)var4 + 0.5D + 0.5D;
                     var25 = (double)var4 + 0.5D - 0.5D;
                     var27 = (double)var2 + 0.5D - 0.5D;
                     var29 = (double)var2 + 0.5D + 0.5D;
                     var31 = (double)var4 + 0.5D - 0.5D;
                     double var35 = (double)var4 + 0.5D + 0.5D;
                     var10 = (double)var7.method_368();
                     var12 = (double)var7.method_371();
                     var14 = (double)var7.method_369();
                     var16 = (double)var7.method_372();
                     ++var3;
                     var18 = -0.2F;
                     if(var5 != null) {
                        if((var2 + var3 + var4 & 1) == 0) {
                           var6.addVertexWithUV(var27, (double)((float)var3 + var18), (double)(var4 + 0), var14, var12);
                           var6.addVertexWithUV(var19, (double)(var3 + 0), (double)(var4 + 0), var14, var16);
                           var6.addVertexWithUV(var19, (double)(var3 + 0), (double)(var4 + 1), var10, var16);
                           var6.addVertexWithUV(var27, (double)((float)var3 + var18), (double)(var4 + 1), var10, var12);
                           var10 = (double)var8.method_368();
                           var12 = (double)var8.method_371();
                           var14 = (double)var8.method_369();
                           var16 = (double)var8.method_372();
                           var6.addVertexWithUV(var29, (double)((float)var3 + var18), (double)(var4 + 1), var14, var12);
                           var6.addVertexWithUV(var21, (double)(var3 + 0), (double)(var4 + 1), var14, var16);
                           var6.addVertexWithUV(var21, (double)(var3 + 0), (double)(var4 + 0), var10, var16);
                           var6.addVertexWithUV(var29, (double)((float)var3 + var18), (double)(var4 + 0), var10, var12);
                           if(var5 != null) {
                              break label111;
                           }
                        }

                        var6.addVertexWithUV((double)(var2 + 0), (double)((float)var3 + var18), var35, var14, var12);
                        var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), var25, var14, var16);
                        var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), var25, var10, var16);
                        var6.addVertexWithUV((double)(var2 + 1), (double)((float)var3 + var18), var35, var10, var12);
                        var10 = (double)var8.method_368();
                        var12 = (double)var8.method_371();
                        var14 = (double)var8.method_369();
                        var16 = (double)var8.method_372();
                        var6.addVertexWithUV((double)(var2 + 1), (double)((float)var3 + var18), var31, var14, var12);
                        var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), var23, var14, var16);
                        var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), var23, var10, var16);
                     }

                     var6.addVertexWithUV((double)(var2 + 0), (double)((float)var3 + var18), var31, var10, var12);
                  }

                  if(var5 != null) {
                     return true;
                  }
               }
            }

            var10000 = var2;
         }
      }

      double var37 = (double)var10000 + 0.5D + 0.2D;
      var19 = (double)var2 + 0.5D - 0.2D;
      var21 = (double)var4 + 0.5D + 0.2D;
      var23 = (double)var4 + 0.5D - 0.2D;
      var25 = (double)var2 + 0.5D - 0.3D;
      var27 = (double)var2 + 0.5D + 0.3D;
      var29 = (double)var4 + 0.5D - 0.3D;
      var31 = (double)var4 + 0.5D + 0.3D;
      var6.addVertexWithUV(var25, (double)((float)var3 + var18), (double)(var4 + 1), var14, var12);
      var6.addVertexWithUV(var37, (double)(var3 + 0), (double)(var4 + 1), var14, var16);
      var6.addVertexWithUV(var37, (double)(var3 + 0), (double)(var4 + 0), var10, var16);
      var6.addVertexWithUV(var25, (double)((float)var3 + var18), (double)(var4 + 0), var10, var12);
      var6.addVertexWithUV(var27, (double)((float)var3 + var18), (double)(var4 + 0), var14, var12);
      var6.addVertexWithUV(var19, (double)(var3 + 0), (double)(var4 + 0), var14, var16);
      var6.addVertexWithUV(var19, (double)(var3 + 0), (double)(var4 + 1), var10, var16);
      var6.addVertexWithUV(var27, (double)((float)var3 + var18), (double)(var4 + 1), var10, var12);
      var10 = (double)var8.method_368();
      var12 = (double)var8.method_371();
      var14 = (double)var8.method_369();
      var16 = (double)var8.method_372();
      var6.addVertexWithUV((double)(var2 + 1), (double)((float)var3 + var18), var31, var14, var12);
      var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), var23, var14, var16);
      var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), var23, var10, var16);
      var6.addVertexWithUV((double)(var2 + 0), (double)((float)var3 + var18), var31, var10, var12);
      var6.addVertexWithUV((double)(var2 + 0), (double)((float)var3 + var18), var29, var14, var12);
      var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), var21, var14, var16);
      var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), var21, var10, var16);
      var6.addVertexWithUV((double)(var2 + 1), (double)((float)var3 + var18), var29, var10, var12);
      var37 = (double)var2 + 0.5D - 0.5D;
      var19 = (double)var2 + 0.5D + 0.5D;
      var21 = (double)var4 + 0.5D - 0.5D;
      var23 = (double)var4 + 0.5D + 0.5D;
      var25 = (double)var2 + 0.5D - 0.4D;
      var27 = (double)var2 + 0.5D + 0.4D;
      var29 = (double)var4 + 0.5D - 0.4D;
      var31 = (double)var4 + 0.5D + 0.4D;
      var6.addVertexWithUV(var25, (double)((float)var3 + var18), (double)(var4 + 0), var10, var12);
      var6.addVertexWithUV(var37, (double)(var3 + 0), (double)(var4 + 0), var10, var16);
      var6.addVertexWithUV(var37, (double)(var3 + 0), (double)(var4 + 1), var14, var16);
      var6.addVertexWithUV(var25, (double)((float)var3 + var18), (double)(var4 + 1), var14, var12);
      var6.addVertexWithUV(var27, (double)((float)var3 + var18), (double)(var4 + 1), var10, var12);
      var6.addVertexWithUV(var19, (double)(var3 + 0), (double)(var4 + 1), var10, var16);
      var6.addVertexWithUV(var19, (double)(var3 + 0), (double)(var4 + 0), var14, var16);
      var6.addVertexWithUV(var27, (double)((float)var3 + var18), (double)(var4 + 0), var14, var12);
      var10 = (double)var7.method_368();
      var12 = (double)var7.method_371();
      var14 = (double)var7.method_369();
      var16 = (double)var7.method_372();
      var6.addVertexWithUV((double)(var2 + 0), (double)((float)var3 + var18), var31, var10, var12);
      var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), var23, var10, var16);
      var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), var23, var14, var16);
      var6.addVertexWithUV((double)(var2 + 1), (double)((float)var3 + var18), var31, var14, var12);
      var6.addVertexWithUV((double)(var2 + 1), (double)((float)var3 + var18), var29, var10, var12);
      var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), var21, var10, var16);
      var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), var21, var14, var16);
      var6.addVertexWithUV((double)(var2 + 0), (double)((float)var3 + var18), var29, var14, var12);
      return true;
   }

   // $FF: renamed from: h (aji, int, int, int) boolean
   public boolean method_7241(aji var1, int var2, int var3, int var4) {
      bmh var6 = bmh.instance;
      String[] var10000 = class_752.method_4253();
      int var7 = this.field_6952.method_33(var2, var3, var4);
      String[] var35 = field_7032;
      class_73 var8 = class_414.method_2664("cross");
      class_73 var9 = class_414.method_2664("line");
      class_73 var10 = class_414.method_2664("cross_overlay");
      String[] var5 = var10000;
      class_73 var11 = class_414.method_2664("line_overlay");
      var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      float var12 = (float)var7 / 15.0F;
      float var13 = var12 * 0.6F + 0.4F;
      if(var7 == 0) {
         var13 = 0.3F;
      }

      float var14 = var12 * var12 * 0.7F - 0.5F;
      float var15 = var12 * var12 * 0.6F - 0.7F;
      float var42;
      int var39 = (var42 = var14 - 0.0F) == 0.0F?0:(var42 < 0.0F?-1:1);
      if(var5 != null) {
         if(var39 < 0) {
            var14 = 0.0F;
         }

         float var43;
         var39 = (var43 = var15 - 0.0F) == 0.0F?0:(var43 < 0.0F?-1:1);
      }

      if(var5 != null) {
         if(var39 < 0) {
            var15 = 0.0F;
         }

         var39 = CustomColorizer.getRedstoneColor(var7);
      }

      int var16 = var39;
      if(var5 != null) {
         if(var16 != -1) {
            int var17 = var16 >> 16 & 255;
            int var18 = var16 >> 8 & 255;
            int var19 = var16 & 255;
            var13 = (float)var17 / 255.0F;
            var14 = (float)var18 / 255.0F;
            var15 = (float)var19 / 255.0F;
         }

         var6.setVisible6(var13, var14, var15);
      }

      double var36 = 0.015625D;
      double var37 = 0.015625D;
      boolean var40 = class_414.method_2662(this.field_6952, var2 - 1, var3, var4, 1);
      if(var5 != null) {
         label413: {
            if(!var40) {
               label411: {
                  label423: {
                     var40 = this.field_6952.getBlock(var2 - 1, var3, var4).method_2432();
                     if(var5 != null) {
                        if(var40) {
                           break label423;
                        }

                        var40 = class_414.method_2662(this.field_6952, var2 - 1, var3 - 1, var4, -1);
                     }

                     if(var5 == null) {
                        break label413;
                     }

                     if(var40) {
                        break label411;
                     }
                  }

                  var40 = false;
                  break label413;
               }
            }

            var40 = true;
         }
      }

      boolean var21 = var40;
      var40 = class_414.method_2662(this.field_6952, var2 + 1, var3, var4, 3);
      if(var5 != null) {
         label398: {
            if(!var40) {
               label396: {
                  label424: {
                     var40 = this.field_6952.getBlock(var2 + 1, var3, var4).method_2432();
                     if(var5 != null) {
                        if(var40) {
                           break label424;
                        }

                        var40 = class_414.method_2662(this.field_6952, var2 + 1, var3 - 1, var4, -1);
                     }

                     if(var5 == null) {
                        break label398;
                     }

                     if(var40) {
                        break label396;
                     }
                  }

                  var40 = false;
                  break label398;
               }
            }

            var40 = true;
         }
      }

      boolean var22 = var40;
      var40 = class_414.method_2662(this.field_6952, var2, var3, var4 - 1, 2);
      if(var5 != null) {
         label383: {
            if(!var40) {
               label381: {
                  label425: {
                     var40 = this.field_6952.getBlock(var2, var3, var4 - 1).method_2432();
                     if(var5 != null) {
                        if(var40) {
                           break label425;
                        }

                        var40 = class_414.method_2662(this.field_6952, var2, var3 - 1, var4 - 1, -1);
                     }

                     if(var5 == null) {
                        break label383;
                     }

                     if(var40) {
                        break label381;
                     }
                  }

                  var40 = false;
                  break label383;
               }
            }

            var40 = true;
         }
      }

      boolean var23 = var40;
      var40 = class_414.method_2662(this.field_6952, var2, var3, var4 + 1, 0);
      if(var5 != null) {
         label368: {
            if(!var40) {
               label366: {
                  label426: {
                     var40 = this.field_6952.getBlock(var2, var3, var4 + 1).method_2432();
                     if(var5 != null) {
                        if(var40) {
                           break label426;
                        }

                        var40 = class_414.method_2662(this.field_6952, var2, var3 - 1, var4 + 1, -1);
                     }

                     if(var5 == null) {
                        break label368;
                     }

                     if(var40) {
                        break label366;
                     }
                  }

                  var40 = false;
                  break label368;
               }
            }

            var40 = true;
         }
      }

      boolean var24 = var40;
      var39 = this.field_6952.getBlock(var2, var3 + 1, var4).method_2432();
      if(var5 != null) {
         label353: {
            if(var39 == 0) {
               var39 = this.field_6952.getBlock(var2 - 1, var3, var4).method_2432();
               if(var5 != null) {
                  label441: {
                     if(var39 != 0) {
                        var39 = class_414.method_2662(this.field_6952, var2 - 1, var3 + 1, var4, -1);
                        if(var5 == null) {
                           break label441;
                        }

                        if(var39 != 0) {
                           var21 = true;
                        }
                     }

                     var39 = this.field_6952.getBlock(var2 + 1, var3, var4).method_2432();
                  }
               }

               if(var5 != null) {
                  label442: {
                     if(var39 != 0) {
                        var39 = class_414.method_2662(this.field_6952, var2 + 1, var3 + 1, var4, -1);
                        if(var5 == null) {
                           break label442;
                        }

                        if(var39 != 0) {
                           var22 = true;
                        }
                     }

                     var39 = this.field_6952.getBlock(var2, var3, var4 - 1).method_2432();
                  }
               }

               if(var5 != null) {
                  label325: {
                     if(var39 != 0) {
                        var39 = class_414.method_2662(this.field_6952, var2, var3 + 1, var4 - 1, -1);
                        if(var5 == null) {
                           break label325;
                        }

                        if(var39 != 0) {
                           var23 = true;
                        }
                     }

                     var39 = this.field_6952.getBlock(var2, var3, var4 + 1).method_2432();
                  }
               }

               if(var5 == null) {
                  break label353;
               }

               if(var39 != 0) {
                  var39 = class_414.method_2662(this.field_6952, var2, var3 + 1, var4 + 1, -1);
                  if(var5 == null) {
                     break label353;
                  }

                  if(var39 != 0) {
                     var24 = true;
                  }
               }
            }

            var39 = var2 + 0;
         }
      }

      float var25;
      float var26;
      float var27;
      float var28;
      boolean var29;
      label319: {
         label430: {
            var25 = (float)var39;
            var26 = (float)(var2 + 1);
            var27 = (float)(var4 + 0);
            var28 = (float)(var4 + 1);
            var29 = false;
            var40 = var21;
            if(var5 != null) {
               if(!var21) {
                  var40 = var22;
                  if(var5 == null) {
                     break label319;
                  }

                  if(!var22) {
                     break label430;
                  }
               }

               var40 = var23;
            }

            if(var5 == null) {
               break label319;
            }

            if(!var40) {
               var40 = var24;
               if(var5 == null) {
                  break label319;
               }

               if(!var24) {
                  var29 = true;
               }
            }
         }

         var40 = var23;
      }

      label303: {
         label431: {
            if(var5 != null) {
               if(!var40) {
                  var40 = var24;
                  if(var5 == null) {
                     break label303;
                  }

                  if(!var24) {
                     break label431;
                  }
               }

               var40 = var22;
            }

            if(var5 == null) {
               break label303;
            }

            if(!var40) {
               var40 = var21;
               if(var5 == null) {
                  break label303;
               }

               if(!var21) {
                  var29 = true;
               }
            }
         }

         var40 = var29;
      }

      label432: {
         if(var5 != null) {
            if(!var40) {
               int var30 = 0;
               int var31 = 0;
               int var32 = 16;
               int var33 = 16;
               boolean var34 = true;
               var40 = var21;
               if(var5 != null) {
                  if(!var21) {
                     var25 += 0.3125F;
                  }

                  var40 = var21;
               }

               if(var5 != null) {
                  if(!var40) {
                     var30 += 5;
                  }

                  var40 = var22;
               }

               if(var5 != null) {
                  if(!var40) {
                     var26 -= 0.3125F;
                  }

                  var40 = var22;
               }

               if(var5 != null) {
                  if(!var40) {
                     var32 -= 5;
                  }

                  var40 = var23;
               }

               if(var5 != null) {
                  if(!var40) {
                     var27 += 0.3125F;
                  }

                  var40 = var23;
               }

               if(var5 != null) {
                  if(!var40) {
                     var31 += 5;
                  }

                  var40 = var24;
               }

               if(var5 != null) {
                  if(!var40) {
                     var28 -= 0.3125F;
                  }

                  var40 = var24;
               }

               if(!var40) {
                  var33 -= 5;
               }

               var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var28, (double)var8.method_370((double)var32), (double)var8.method_373((double)var33));
               var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var27, (double)var8.method_370((double)var32), (double)var8.method_373((double)var31));
               var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var27, (double)var8.method_370((double)var30), (double)var8.method_373((double)var31));
               var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var28, (double)var8.method_370((double)var30), (double)var8.method_373((double)var33));
               var6.setVisible6(1.0F, 1.0F, 1.0F);
               var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var28, (double)var10.method_370((double)var32), (double)var10.method_373((double)var33));
               var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var27, (double)var10.method_370((double)var32), (double)var10.method_373((double)var31));
               var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var27, (double)var10.method_370((double)var30), (double)var10.method_373((double)var31));
               var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var28, (double)var10.method_370((double)var30), (double)var10.method_373((double)var33));
               if(var5 != null) {
                  break label432;
               }
            }

            var40 = var29;
         }

         if(var40) {
            var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var28, (double)var9.method_369(), (double)var9.method_372());
            var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var27, (double)var9.method_369(), (double)var9.method_371());
            var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var27, (double)var9.method_368(), (double)var9.method_371());
            var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var28, (double)var9.method_368(), (double)var9.method_372());
            var6.setVisible6(1.0F, 1.0F, 1.0F);
            var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var28, (double)var11.method_369(), (double)var11.method_372());
            var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var27, (double)var11.method_369(), (double)var11.method_371());
            var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var27, (double)var11.method_368(), (double)var11.method_371());
            var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var28, (double)var11.method_368(), (double)var11.method_372());
            if(var5 != null) {
               break label432;
            }
         }

         var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var28, (double)var9.method_369(), (double)var9.method_372());
         var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var27, (double)var9.method_368(), (double)var9.method_372());
         var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var27, (double)var9.method_368(), (double)var9.method_371());
         var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var28, (double)var9.method_369(), (double)var9.method_371());
         var6.setVisible6(1.0F, 1.0F, 1.0F);
         var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var28, (double)var11.method_369(), (double)var11.method_372());
         var6.addVertexWithUV((double)var26, (double)var3 + 0.015625D, (double)var27, (double)var11.method_368(), (double)var11.method_372());
         var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var27, (double)var11.method_368(), (double)var11.method_371());
         var6.addVertexWithUV((double)var25, (double)var3 + 0.015625D, (double)var28, (double)var11.method_369(), (double)var11.method_371());
      }

      var40 = this.field_6952.getBlock(var2, var3 + 1, var4).method_2432();
      if(var5 != null) {
         label255: {
            if(!var40) {
               float var38 = 0.021875F;
               var40 = this.field_6952.getBlock(var2 - 1, var3, var4).method_2432();
               aji var41;
               if(var5 != null) {
                  label244: {
                     if(var40) {
                        var41 = this.field_6952.getBlock(var2 - 1, var3 + 1, var4);
                        if(var5 == null) {
                           break label244;
                        }

                        if(var41 == class_1192.field_6082) {
                           var6.setVisible6(var13, var14, var15);
                           var6.addVertexWithUV((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), (double)var9.method_369(), (double)var9.method_371());
                           var6.addVertexWithUV((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 1), (double)var9.method_368(), (double)var9.method_371());
                           var6.addVertexWithUV((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 0), (double)var9.method_368(), (double)var9.method_372());
                           var6.addVertexWithUV((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), (double)var9.method_369(), (double)var9.method_372());
                           var6.setVisible6(1.0F, 1.0F, 1.0F);
                           var6.addVertexWithUV((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), (double)var11.method_369(), (double)var11.method_371());
                           var6.addVertexWithUV((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 1), (double)var11.method_368(), (double)var11.method_371());
                           var6.addVertexWithUV((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 0), (double)var11.method_368(), (double)var11.method_372());
                           var6.addVertexWithUV((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), (double)var11.method_369(), (double)var11.method_372());
                        }
                     }

                     var41 = this.field_6952.getBlock(var2 + 1, var3, var4);
                  }

                  var40 = var41.method_2432();
               }

               if(var5 != null) {
                  label234: {
                     if(var40) {
                        var41 = this.field_6952.getBlock(var2 + 1, var3 + 1, var4);
                        if(var5 == null) {
                           break label234;
                        }

                        if(var41 == class_1192.field_6082) {
                           var6.setVisible6(var13, var14, var15);
                           var6.addVertexWithUV((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 1), (double)var9.method_368(), (double)var9.method_372());
                           var6.addVertexWithUV((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), (double)var9.method_369(), (double)var9.method_372());
                           var6.addVertexWithUV((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), (double)var9.method_369(), (double)var9.method_371());
                           var6.addVertexWithUV((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 0), (double)var9.method_368(), (double)var9.method_371());
                           var6.setVisible6(1.0F, 1.0F, 1.0F);
                           var6.addVertexWithUV((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 1), (double)var11.method_368(), (double)var11.method_372());
                           var6.addVertexWithUV((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), (double)var11.method_369(), (double)var11.method_372());
                           var6.addVertexWithUV((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), (double)var11.method_369(), (double)var11.method_371());
                           var6.addVertexWithUV((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 0), (double)var11.method_368(), (double)var11.method_371());
                        }
                     }

                     var41 = this.field_6952.getBlock(var2, var3, var4 - 1);
                  }

                  var40 = var41.method_2432();
               }

               if(var5 != null) {
                  label227: {
                     if(var40) {
                        var41 = this.field_6952.getBlock(var2, var3 + 1, var4 - 1);
                        if(var5 == null) {
                           break label227;
                        }

                        if(var41 == class_1192.field_6082) {
                           var6.setVisible6(var13, var14, var15);
                           var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), (double)var4 + 0.015625D, (double)var9.method_368(), (double)var9.method_372());
                           var6.addVertexWithUV((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, (double)var9.method_369(), (double)var9.method_372());
                           var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, (double)var9.method_369(), (double)var9.method_371());
                           var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), (double)var4 + 0.015625D, (double)var9.method_368(), (double)var9.method_371());
                           var6.setVisible6(1.0F, 1.0F, 1.0F);
                           var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), (double)var4 + 0.015625D, (double)var11.method_368(), (double)var11.method_372());
                           var6.addVertexWithUV((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, (double)var11.method_369(), (double)var11.method_372());
                           var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, (double)var11.method_369(), (double)var11.method_371());
                           var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), (double)var4 + 0.015625D, (double)var11.method_368(), (double)var11.method_371());
                        }
                     }

                     var41 = this.field_6952.getBlock(var2, var3, var4 + 1);
                  }

                  var40 = var41.method_2432();
               }

               if(var5 == null) {
                  break label255;
               }

               if(var40 && this.field_6952.getBlock(var2, var3 + 1, var4 + 1) == class_1192.field_6082) {
                  var6.setVisible6(var13, var14, var15);
                  var6.addVertexWithUV((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, (double)var9.method_369(), (double)var9.method_371());
                  var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, (double)var9.method_368(), (double)var9.method_371());
                  var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, (double)var9.method_368(), (double)var9.method_372());
                  var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, (double)var9.method_369(), (double)var9.method_372());
                  var6.setVisible6(1.0F, 1.0F, 1.0F);
                  var6.addVertexWithUV((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, (double)var11.method_369(), (double)var11.method_371());
                  var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, (double)var11.method_368(), (double)var11.method_371());
                  var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, (double)var11.method_368(), (double)var11.method_372());
                  var6.addVertexWithUV((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, (double)var11.method_369(), (double)var11.method_372());
               }
            }

            var40 = Config.isBetterSnow();
         }
      }

      if(var5 != null) {
         if(var40) {
            var40 = this.hasSnowNeighbours(var2, var3, var4);
            if(var5 == null) {
               return var40;
            }

            if(var40) {
               this.renderSnow(var2, var3, var4, 0.01D);
            }
         }

         var40 = true;
      }

      return var40;
   }

   // $FF: renamed from: a (eo, int, int, int) boolean
   public boolean method_7242(class_392 var1, int var2, int var3, int var4) {
      bmh var6 = bmh.instance;
      int var7 = this.field_6952.method_33(var2, var3, var4);
      String[] var10000 = class_752.method_4253();
      class_73 var8 = this.drawTextBox9(var1, 0, var7);
      String[] var5 = var10000;
      int var43 = this.method_7206();
      if(var5 != null) {
         if(var43 != 0) {
            var8 = this.field_6953;
         }

         var43 = Config.isConnectedTextures();
      }

      if(var5 != null) {
         if(var43 != 0) {
            label132: {
               class_73 var44 = this.field_6953;
               if(var5 != null) {
                  if(this.field_6953 != null) {
                     break label132;
                  }

                  var44 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, 1, var8);
               }

               var8 = var44;
            }
         }

         var43 = var1.method_2615();
      }

      label126: {
         if(var5 != null) {
            if(var43 == 0) {
               break label126;
            }

            var43 = var7 & 7;
         }

         var7 = var43;
      }

      double var9;
      double var11;
      double var13;
      double var15;
      byte var10001;
      double var19;
      double var21;
      double var23;
      double var25;
      double var27;
      double var29;
      double var31;
      double var33;
      double var35;
      double var37;
      double var39;
      double var41;
      label120: {
         label119: {
            var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
            var6.setVisible6(1.0F, 1.0F, 1.0F);
            var9 = (double)var8.method_368();
            var11 = (double)var8.method_371();
            var13 = (double)var8.method_369();
            var15 = (double)var8.method_372();
            double var17 = 0.0625D;
            var19 = (double)(var2 + 1);
            var21 = (double)(var2 + 1);
            var23 = (double)(var2 + 0);
            var25 = (double)(var2 + 0);
            var27 = (double)(var4 + 0);
            var29 = (double)(var4 + 1);
            var31 = (double)(var4 + 1);
            var33 = (double)(var4 + 0);
            var35 = (double)var3 + var17;
            var37 = (double)var3 + var17;
            var39 = (double)var3 + var17;
            var41 = (double)var3 + var17;
            var43 = var7;
            var10001 = 1;
            if(var5 != null) {
               label117: {
                  if(var7 != 1) {
                     var43 = var7;
                     var10001 = 2;
                     if(var5 == null) {
                        break label117;
                     }

                     if(var7 != 2) {
                        var43 = var7;
                        var10001 = 3;
                        if(var5 == null) {
                           break label117;
                        }

                        if(var7 != 3) {
                           var43 = var7;
                           var10001 = 7;
                           if(var5 == null) {
                              break label117;
                           }

                           if(var7 != 7) {
                              var43 = var7;
                              var10001 = 8;
                              if(var5 != null) {
                                 if(var7 == 8) {
                                    var19 = var21 = (double)(var2 + 0);
                                    var23 = var25 = (double)(var2 + 1);
                                    var27 = var33 = (double)(var4 + 1);
                                    var29 = var31 = (double)(var4 + 0);
                                    if(var5 != null) {
                                       break label119;
                                    }
                                 }

                                 var43 = var7;
                                 var10001 = 9;
                              }

                              if(var5 == null) {
                                 break label120;
                              }

                              if(var43 != var10001) {
                                 break label119;
                              }

                              var19 = var25 = (double)(var2 + 0);
                              var21 = var23 = (double)(var2 + 1);
                              var27 = var29 = (double)(var4 + 0);
                              var31 = var33 = (double)(var4 + 1);
                              if(var5 != null) {
                                 break label119;
                              }
                           }
                        }
                     }
                  }

                  var19 = var25 = (double)(var2 + 1);
                  var21 = var23 = (double)(var2 + 0);
                  var27 = var29 = (double)(var4 + 1);
                  var43 = var4;
                  var10001 = 0;
               }
            }

            var31 = var33 = (double)(var43 + var10001);
         }

         var43 = var7;
         var10001 = 2;
      }

      label92: {
         label91: {
            label140: {
               if(var5 != null) {
                  if(var43 == var10001) {
                     break label140;
                  }

                  var43 = var7;
                  var10001 = 4;
               }

               if(var5 != null) {
                  if(var43 == var10001) {
                     break label140;
                  }

                  var43 = var7;
                  var10001 = 3;
               }

               label79: {
                  if(var5 != null) {
                     if(var43 == var10001) {
                        break label79;
                     }

                     var43 = var7;
                     if(var5 == null) {
                        break label92;
                     }

                     var10001 = 5;
                  }

                  if(var43 != var10001) {
                     break label91;
                  }
               }

               ++var37;
               ++var39;
               if(var5 != null) {
                  break label91;
               }
            }

            ++var35;
            ++var41;
         }

         var6.addVertexWithUV(var19, var35, var27, var13, var11);
         var6.addVertexWithUV(var21, var37, var29, var13, var15);
         var6.addVertexWithUV(var23, var39, var31, var9, var15);
         var6.addVertexWithUV(var25, var41, var33, var9, var11);
         var6.addVertexWithUV(var25, var41, var33, var9, var11);
         var6.addVertexWithUV(var23, var39, var31, var9, var15);
         var6.addVertexWithUV(var21, var37, var29, var13, var15);
         var6.addVertexWithUV(var19, var35, var27, var13, var11);
         var43 = Config.isBetterSnow();
      }

      if(var5 != null) {
         if(var43 != 0) {
            var43 = this.hasSnowNeighbours(var2, var3, var4);
            if(var5 == null) {
               return (boolean)var43;
            }

            if(var43 != 0) {
               this.renderSnow(var2, var3, var4, 0.05D);
            }
         }

         var43 = 1;
      }

      return (boolean)var43;
   }

   // $FF: renamed from: i (aji, int, int, int) boolean
   public boolean method_7243(aji var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      bmh var6 = bmh.instance;
      String[] var5 = var10000;
      class_73 var7 = this.method_7290(var1, 0);
      int var21 = this.method_7206();
      if(var5 != null) {
         if(var21 != 0) {
            var7 = this.field_6953;
         }

         var21 = this.field_6952.method_33(var2, var3, var4);
      }

      int var8;
      class_73 var22;
      label60: {
         var8 = var21;
         if(var5 != null) {
            if(Config.isConnectedTextures()) {
               var22 = this.field_6953;
               if(var5 == null) {
                  break label60;
               }

               if(this.field_6953 == null) {
                  var7 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, var8, var7);
               }
            }

            var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
            var6.setVisible6(1.0F, 1.0F, 1.0F);
         }

         var22 = var7;
      }

      double var9 = (double)var22.method_368();
      double var11 = (double)var7.method_371();
      double var13 = (double)var7.method_369();
      double var15 = (double)var7.method_372();
      double var17 = 0.0D;
      double var19 = 0.05000000074505806D;
      var21 = var8;
      byte var10001 = 5;
      if(var5 != null) {
         if(var8 == 5) {
            var6.addVertexWithUV((double)var2 + var19, (double)(var3 + 1) + var17, (double)(var4 + 1) + var17, var9, var11);
            var6.addVertexWithUV((double)var2 + var19, (double)(var3 + 0) - var17, (double)(var4 + 1) + var17, var9, var15);
            var6.addVertexWithUV((double)var2 + var19, (double)(var3 + 0) - var17, (double)(var4 + 0) - var17, var13, var15);
            var6.addVertexWithUV((double)var2 + var19, (double)(var3 + 1) + var17, (double)(var4 + 0) - var17, var13, var11);
         }

         var21 = var8;
         var10001 = 4;
      }

      if(var5 != null) {
         if(var21 == var10001) {
            var6.addVertexWithUV((double)(var2 + 1) - var19, (double)(var3 + 0) - var17, (double)(var4 + 1) + var17, var13, var15);
            var6.addVertexWithUV((double)(var2 + 1) - var19, (double)(var3 + 1) + var17, (double)(var4 + 1) + var17, var13, var11);
            var6.addVertexWithUV((double)(var2 + 1) - var19, (double)(var3 + 1) + var17, (double)(var4 + 0) - var17, var9, var11);
            var6.addVertexWithUV((double)(var2 + 1) - var19, (double)(var3 + 0) - var17, (double)(var4 + 0) - var17, var9, var15);
         }

         var21 = var8;
         var10001 = 3;
      }

      if(var5 != null) {
         if(var21 == var10001) {
            var6.addVertexWithUV((double)(var2 + 1) + var17, (double)(var3 + 0) - var17, (double)var4 + var19, var13, var15);
            var6.addVertexWithUV((double)(var2 + 1) + var17, (double)(var3 + 1) + var17, (double)var4 + var19, var13, var11);
            var6.addVertexWithUV((double)(var2 + 0) - var17, (double)(var3 + 1) + var17, (double)var4 + var19, var9, var11);
            var6.addVertexWithUV((double)(var2 + 0) - var17, (double)(var3 + 0) - var17, (double)var4 + var19, var9, var15);
         }

         var21 = var8;
         if(var5 == null) {
            return (boolean)var21;
         }

         var10001 = 2;
      }

      if(var21 == var10001) {
         var6.addVertexWithUV((double)(var2 + 1) + var17, (double)(var3 + 1) + var17, (double)(var4 + 1) - var19, var9, var11);
         var6.addVertexWithUV((double)(var2 + 1) + var17, (double)(var3 + 0) - var17, (double)(var4 + 1) - var19, var9, var15);
         var6.addVertexWithUV((double)(var2 + 0) - var17, (double)(var3 + 0) - var17, (double)(var4 + 1) - var19, var13, var15);
         var6.addVertexWithUV((double)(var2 + 0) - var17, (double)(var3 + 1) + var17, (double)(var4 + 1) - var19, var13, var11);
      }

      var21 = 1;
      return (boolean)var21;
   }

   // $FF: renamed from: j (aji, int, int, int) boolean
   public boolean method_7244(aji var1, int var2, int var3, int var4) {
      bmh var6 = bmh.instance;
      String[] var5 = class_752.method_4253();
      class_73 var7 = this.method_7290(var1, 0);
      int var10000 = this.method_7206();
      if(var5 != null) {
         if(var10000 != 0) {
            var7 = this.field_6953;
         }

         var10000 = this.field_6952.method_33(var2, var3, var4);
      }

      int var8 = var10000;
      var10000 = Config.isConnectedTextures();
      int var9;
      if(var5 != null) {
         if(var10000 != 0 && this.field_6953 == null) {
            label104: {
               var9 = 0;
               var10000 = var8 & 1;
               if(var5 != null) {
                  if(var10000 != 0) {
                     var9 = 2;
                     if(var5 != null) {
                        break label104;
                     }
                  }

                  var10000 = var8 & 2;
               }

               if(var5 != null) {
                  if(var10000 != 0) {
                     var9 = 5;
                     if(var5 != null) {
                        break label104;
                     }
                  }

                  var10000 = var8 & 4;
               }

               if(var5 != null) {
                  if(var10000 != 0) {
                     var9 = 3;
                     if(var5 != null) {
                        break label104;
                     }
                  }

                  var10000 = var8 & 8;
               }

               if(var5 != null) {
                  if(var10000 == 0) {
                     break label104;
                  }

                  var10000 = 4;
               }

               var9 = var10000;
            }

            var7 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, var9, var7);
         }

         var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
         var10000 = CustomColorizer.getColorMultiplier(var1, this.field_6952, var2, var3, var4);
      }

      var9 = var10000;
      float var10 = (float)(var9 >> 16 & 255) / 255.0F;
      float var11 = (float)(var9 >> 8 & 255) / 255.0F;
      float var12 = (float)(var9 & 255) / 255.0F;
      var6.setVisible6(var10, var11, var12);
      double var13 = (double)var7.method_368();
      double var15 = (double)var7.method_371();
      double var17 = (double)var7.method_369();
      double var19 = (double)var7.method_372();
      double var21 = 0.05000000074505806D;
      var10000 = var8 & 2;
      if(var5 != null) {
         if(var10000 != 0) {
            var6.addVertexWithUV((double)var2 + var21, (double)(var3 + 1), (double)(var4 + 1), var13, var15);
            var6.addVertexWithUV((double)var2 + var21, (double)(var3 + 0), (double)(var4 + 1), var13, var19);
            var6.addVertexWithUV((double)var2 + var21, (double)(var3 + 0), (double)(var4 + 0), var17, var19);
            var6.addVertexWithUV((double)var2 + var21, (double)(var3 + 1), (double)(var4 + 0), var17, var15);
            var6.addVertexWithUV((double)var2 + var21, (double)(var3 + 1), (double)(var4 + 0), var17, var15);
            var6.addVertexWithUV((double)var2 + var21, (double)(var3 + 0), (double)(var4 + 0), var17, var19);
            var6.addVertexWithUV((double)var2 + var21, (double)(var3 + 0), (double)(var4 + 1), var13, var19);
            var6.addVertexWithUV((double)var2 + var21, (double)(var3 + 1), (double)(var4 + 1), var13, var15);
         }

         var10000 = var8 & 8;
      }

      if(var5 != null) {
         if(var10000 != 0) {
            var6.addVertexWithUV((double)(var2 + 1) - var21, (double)(var3 + 0), (double)(var4 + 1), var17, var19);
            var6.addVertexWithUV((double)(var2 + 1) - var21, (double)(var3 + 1), (double)(var4 + 1), var17, var15);
            var6.addVertexWithUV((double)(var2 + 1) - var21, (double)(var3 + 1), (double)(var4 + 0), var13, var15);
            var6.addVertexWithUV((double)(var2 + 1) - var21, (double)(var3 + 0), (double)(var4 + 0), var13, var19);
            var6.addVertexWithUV((double)(var2 + 1) - var21, (double)(var3 + 0), (double)(var4 + 0), var13, var19);
            var6.addVertexWithUV((double)(var2 + 1) - var21, (double)(var3 + 1), (double)(var4 + 0), var13, var15);
            var6.addVertexWithUV((double)(var2 + 1) - var21, (double)(var3 + 1), (double)(var4 + 1), var17, var15);
            var6.addVertexWithUV((double)(var2 + 1) - var21, (double)(var3 + 0), (double)(var4 + 1), var17, var19);
         }

         var10000 = var8 & 4;
      }

      if(var5 != null) {
         if(var10000 != 0) {
            var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), (double)var4 + var21, var17, var19);
            var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 1), (double)var4 + var21, var17, var15);
            var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 1), (double)var4 + var21, var13, var15);
            var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), (double)var4 + var21, var13, var19);
            var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), (double)var4 + var21, var13, var19);
            var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 1), (double)var4 + var21, var13, var15);
            var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 1), (double)var4 + var21, var17, var15);
            var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), (double)var4 + var21, var17, var19);
         }

         var10000 = var8 & 1;
      }

      if(var5 != null) {
         if(var10000 != 0) {
            var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1) - var21, var13, var15);
            var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - var21, var13, var19);
            var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - var21, var17, var19);
            var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 1), (double)(var4 + 1) - var21, var17, var15);
            var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 1), (double)(var4 + 1) - var21, var17, var15);
            var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - var21, var17, var19);
            var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - var21, var13, var19);
            var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1) - var21, var13, var15);
         }

         var10000 = this.field_6952.getBlock(var2, var3 + 1, var4).method_2432();
      }

      if(var5 != null) {
         if(var10000 != 0) {
            var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 1) - var21, (double)(var4 + 0), var13, var15);
            var6.addVertexWithUV((double)(var2 + 1), (double)(var3 + 1) - var21, (double)(var4 + 1), var13, var19);
            var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 1) - var21, (double)(var4 + 1), var17, var19);
            var6.addVertexWithUV((double)(var2 + 0), (double)(var3 + 1) - var21, (double)(var4 + 0), var17, var15);
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: k (aji, int, int, int) boolean
   public boolean method_7245(aji var1, int var2, int var3, int var4) {
      int var6 = this.field_6952.method_36();
      bmh var7 = bmh.instance;
      var7.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      int var8 = var1.method_2495(this.field_6952, var2, var3, var4);
      String[] var10000 = class_752.method_4253();
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      String[] var5 = var10000;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      byte var89 = blt.field_7072;
      if(var5 != null) {
         if(blt.field_7072) {
            float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
            float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
            float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         var7.setVisible6(var9, var10, var11);
         var89 = var1 instanceof class_390;
      }

      class_73 var15;
      byte var86;
      int var87;
      class_73 var88;
      int var90;
      label638: {
         var86 = var89;
         var87 = 0;
         var90 = this.method_7206();
         if(var5 != null) {
            if(var90 != 0) {
               var15 = this.field_6953;
               var88 = this.field_6953;
               if(var5 != null) {
                  break label638;
               }
            }

            var90 = this.field_6952.method_33(var2, var3, var4);
         }

         var87 = var90;
         var15 = this.drawTextBox9(var1, 0, var87);
         var88 = var86 != 0?((class_390)var1).method_2609(var87):((class_389)var1).method_2606();
      }

      class_73 var16;
      int var17;
      int var18;
      class_73 var92;
      label627: {
         var16 = var15;
         var17 = 1;
         var18 = 1;
         if(Config.isConnectedTextures()) {
            var92 = this.field_6953;
            if(var5 == null) {
               break label627;
            }

            if(this.field_6953 == null) {
               label620: {
                  class_73 var19;
                  class_73 var20;
                  label639: {
                     label618: {
                        var19 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, 4, var15);
                        var20 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, 3, var15);
                        var92 = var19;
                        class_73 var10001 = var15;
                        if(var5 != null) {
                           if(var19 != var15) {
                              break label618;
                           }

                           var92 = var20;
                           if(var5 == null) {
                              break label620;
                           }

                           var10001 = var15;
                        }

                        if(var92 == var10001) {
                           break label639;
                        }
                     }

                     int var10002;
                     int var10003;
                     int var91;
                     ahl var94;
                     label607: {
                        label641: {
                           class_389 var21 = (class_389)var1;
                           var94 = this.field_6952;
                           var91 = var2;
                           var10002 = var3 + 1;
                           var10003 = var4;
                           if(var5 != null) {
                              if(this.field_6952.getBlock(var2, var10002, var4) != var1) {
                                 break label641;
                              }

                              var94 = this.field_6952;
                              var91 = var2;
                              var10002 = var3 + 1;
                              var10003 = var4;
                           }

                           var90 = var94.method_33(var91, var10002, var10003);
                           if(var5 == null) {
                              break label607;
                           }

                           if(var90 == var87) {
                              var90 = 0;
                              break label607;
                           }
                        }

                        var90 = 1;
                     }

                     label596: {
                        label642: {
                           var17 = var90;
                           var94 = this.field_6952;
                           var91 = var2;
                           var10002 = var3 - 1;
                           var10003 = var4;
                           if(var5 != null) {
                              if(this.field_6952.getBlock(var2, var10002, var4) != var1) {
                                 break label642;
                              }

                              var94 = this.field_6952;
                              var91 = var2;
                              var10002 = var3 - 1;
                              var10003 = var4;
                           }

                           var90 = var94.method_33(var91, var10002, var10003);
                           if(var5 == null) {
                              break label596;
                           }

                           if(var90 == var87) {
                              var90 = 0;
                              break label596;
                           }
                        }

                        var90 = 1;
                     }

                     var18 = var90;
                  }

                  var15 = var19;
                  var92 = var20;
               }

               var16 = var92;
            }
         }

         var92 = var15;
      }

      double var93 = (double)var92.method_368();
      double var95 = (double)var15.method_370(7.0D);
      double var23 = (double)var15.method_370(9.0D);
      double var25 = (double)var15.method_369();
      double var27 = (double)var15.method_371();
      double var29 = (double)var15.method_372();
      double var31 = (double)var16.method_368();
      double var33 = (double)var16.method_370(7.0D);
      double var35 = (double)var16.method_370(9.0D);
      double var37 = (double)var16.method_369();
      double var39 = (double)var16.method_371();
      double var41 = (double)var16.method_372();
      double var43 = (double)var88.method_370(7.0D);
      double var45 = (double)var88.method_370(9.0D);
      double var47 = (double)var88.method_371();
      double var49 = (double)var88.method_372();
      double var51 = (double)var88.method_373(7.0D);
      double var53 = (double)var88.method_373(9.0D);
      double var55 = (double)var2;
      double var57 = (double)(var2 + 1);
      double var59 = (double)var4;
      double var61 = (double)(var4 + 1);
      double var63 = (double)var2 + 0.5D - 0.0625D;
      double var65 = (double)var2 + 0.5D + 0.0625D;
      double var67 = (double)var4 + 0.5D - 0.0625D;
      double var69 = (double)var4 + 0.5D + 0.0625D;
      var89 = var86;
      if(var5 != null) {
         var89 = var86 != 0?((class_390)var1).method_2607(this.field_6952.getBlock(var2, var3, var4 - 1)):((class_389)var1).method_2607(this.field_6952.getBlock(var2, var3, var4 - 1));
      }

      byte var71 = var89;
      var89 = var86;
      if(var5 != null) {
         var89 = var86 != 0?((class_390)var1).method_2607(this.field_6952.getBlock(var2, var3, var4 + 1)):((class_389)var1).method_2607(this.field_6952.getBlock(var2, var3, var4 + 1));
      }

      byte var72 = var89;
      var89 = var86;
      if(var5 != null) {
         var89 = var86 != 0?((class_390)var1).method_2607(this.field_6952.getBlock(var2 - 1, var3, var4)):((class_389)var1).method_2607(this.field_6952.getBlock(var2 - 1, var3, var4));
      }

      byte var73 = var89;
      var89 = var86;
      if(var5 != null) {
         var89 = var86 != 0?((class_390)var1).method_2607(this.field_6952.getBlock(var2 + 1, var3, var4)):((class_389)var1).method_2607(this.field_6952.getBlock(var2 + 1, var3, var4));
      }

      byte var74;
      label579: {
         label643: {
            var74 = var89;
            double var75 = 0.001D;
            double var77 = 0.999D;
            double var79 = 0.001D;
            var89 = var71;
            if(var5 != null) {
               if(var71 != 0) {
                  break label643;
               }

               var89 = var72;
            }

            if(var5 != null) {
               if(var89 != 0) {
                  break label643;
               }

               var89 = var73;
            }

            if(var5 != null) {
               if(var89 != 0) {
                  break label643;
               }

               var89 = var74;
            }

            if(var5 == null) {
               break label579;
            }

            if(var89 == 0) {
               var89 = 1;
               break label579;
            }
         }

         var89 = 0;
      }

      byte var81 = var89;
      double var82 = (double)var3 + 0.999D;
      double var84 = (double)var3 + 0.001D;
      var90 = var17;
      if(var5 != null) {
         if(var17 == 0) {
            var82 = (double)(var3 + 1);
         }

         var90 = var18;
      }

      if(var5 != null) {
         if(var90 == 0) {
            var84 = (double)var3;
         }

         var90 = var73;
      }

      label555: {
         label644: {
            if(var5 != null) {
               label552: {
                  if(var90 == 0) {
                     var90 = var81;
                     if(var5 == null) {
                        break label552;
                     }

                     if(var81 == 0) {
                        var90 = var71;
                        if(var5 == null) {
                           break label555;
                        }

                        if(var71 != 0) {
                           break label644;
                        }

                        var90 = var72;
                        if(var5 == null) {
                           break label555;
                        }

                        if(var72 != 0) {
                           break label644;
                        }

                        var7.addVertexWithUV(var63, var82, var67, var95, var27);
                        var7.addVertexWithUV(var63, var84, var67, var95, var29);
                        var7.addVertexWithUV(var63, var84, var69, var23, var29);
                        var7.addVertexWithUV(var63, var82, var69, var23, var27);
                        if(var5 != null) {
                           break label644;
                        }
                     }
                  }

                  var90 = var73;
               }
            }

            if(var5 != null) {
               label536: {
                  if(var90 != 0) {
                     var90 = var74;
                     if(var5 == null) {
                        break label536;
                     }

                     if(var74 != 0) {
                        label516: {
                           if(var71 == 0) {
                              var7.addVertexWithUV(var57, var82, var67, var37, var39);
                              var7.addVertexWithUV(var57, var84, var67, var37, var41);
                              var7.addVertexWithUV(var55, var84, var67, var31, var41);
                              var7.addVertexWithUV(var55, var82, var67, var31, var39);
                              if(var5 != null) {
                                 break label516;
                              }
                           }

                           var7.addVertexWithUV(var63, var82, var67, var33, var39);
                           var7.addVertexWithUV(var63, var84, var67, var33, var41);
                           var7.addVertexWithUV(var55, var84, var67, var31, var41);
                           var7.addVertexWithUV(var55, var82, var67, var31, var39);
                           var7.addVertexWithUV(var57, var82, var67, var37, var39);
                           var7.addVertexWithUV(var57, var84, var67, var37, var41);
                           var7.addVertexWithUV(var65, var84, var67, var35, var41);
                           var7.addVertexWithUV(var65, var82, var67, var35, var39);
                        }

                        label511: {
                           if(var72 == 0) {
                              var7.addVertexWithUV(var55, var82, var69, var31, var39);
                              var7.addVertexWithUV(var55, var84, var69, var31, var41);
                              var7.addVertexWithUV(var57, var84, var69, var37, var41);
                              var7.addVertexWithUV(var57, var82, var69, var37, var39);
                              if(var5 != null) {
                                 break label511;
                              }
                           }

                           var7.addVertexWithUV(var55, var82, var69, var31, var39);
                           var7.addVertexWithUV(var55, var84, var69, var31, var41);
                           var7.addVertexWithUV(var63, var84, var69, var33, var41);
                           var7.addVertexWithUV(var63, var82, var69, var33, var39);
                           var7.addVertexWithUV(var65, var82, var69, var35, var39);
                           var7.addVertexWithUV(var65, var84, var69, var35, var41);
                           var7.addVertexWithUV(var57, var84, var69, var37, var41);
                           var7.addVertexWithUV(var57, var82, var69, var37, var39);
                        }

                        var90 = var17;
                        if(var5 != null) {
                           if(var17 != 0) {
                              var7.addVertexWithUV(var55, var82, var69, var45, var47);
                              var7.addVertexWithUV(var57, var82, var69, var45, var49);
                              var7.addVertexWithUV(var57, var82, var67, var43, var49);
                              var7.addVertexWithUV(var55, var82, var67, var43, var47);
                           }

                           var90 = var18;
                        }

                        if(var5 == null) {
                           break label555;
                        }

                        if(var90 == 0) {
                           break label644;
                        }

                        var7.addVertexWithUV(var57, var84, var69, var43, var49);
                        var7.addVertexWithUV(var55, var84, var69, var43, var47);
                        var7.addVertexWithUV(var55, var84, var67, var45, var47);
                        var7.addVertexWithUV(var57, var84, var67, var45, var49);
                        if(var5 != null) {
                           break label644;
                        }
                     }
                  }

                  var90 = var71;
               }
            }

            label506: {
               label505: {
                  if(var5 != null) {
                     if(var90 != 0) {
                        break label505;
                     }

                     var90 = var81;
                  }

                  if(var90 == 0) {
                     var7.addVertexWithUV(var65, var82, var67, var35, var39);
                     var7.addVertexWithUV(var65, var84, var67, var35, var41);
                     var7.addVertexWithUV(var55, var84, var67, var31, var41);
                     var7.addVertexWithUV(var55, var82, var67, var31, var39);
                     if(var5 != null) {
                        break label506;
                     }
                  }
               }

               var7.addVertexWithUV(var63, var82, var67, var33, var39);
               var7.addVertexWithUV(var63, var84, var67, var33, var41);
               var7.addVertexWithUV(var55, var84, var67, var31, var41);
               var7.addVertexWithUV(var55, var82, var67, var31, var39);
            }

            label496: {
               label495: {
                  var89 = var72;
                  if(var5 != null) {
                     if(var72 != 0) {
                        break label495;
                     }

                     var89 = var81;
                  }

                  if(var89 == 0) {
                     var7.addVertexWithUV(var55, var82, var69, var31, var39);
                     var7.addVertexWithUV(var55, var84, var69, var31, var41);
                     var7.addVertexWithUV(var65, var84, var69, var35, var41);
                     var7.addVertexWithUV(var65, var82, var69, var35, var39);
                     if(var5 != null) {
                        break label496;
                     }
                  }
               }

               var7.addVertexWithUV(var55, var82, var69, var31, var39);
               var7.addVertexWithUV(var55, var84, var69, var31, var41);
               var7.addVertexWithUV(var63, var84, var69, var33, var41);
               var7.addVertexWithUV(var63, var82, var69, var33, var39);
            }

            var90 = var17;
            if(var5 != null) {
               if(var17 != 0) {
                  var7.addVertexWithUV(var55, var82, var69, var45, var47);
                  var7.addVertexWithUV(var63, var82, var69, var45, var51);
                  var7.addVertexWithUV(var63, var82, var67, var43, var51);
                  var7.addVertexWithUV(var55, var82, var67, var43, var47);
               }

               var90 = var18;
            }

            if(var5 == null) {
               break label555;
            }

            if(var90 != 0) {
               var7.addVertexWithUV(var63, var84, var69, var43, var51);
               var7.addVertexWithUV(var55, var84, var69, var43, var47);
               var7.addVertexWithUV(var55, var84, var67, var45, var47);
               var7.addVertexWithUV(var63, var84, var67, var45, var51);
            }
         }

         var90 = var74;
      }

      label486: {
         label647: {
            label484: {
               label648: {
                  if(var5 != null) {
                     if(var90 == 0) {
                        var90 = var81;
                        if(var5 == null) {
                           break label484;
                        }

                        if(var81 == 0) {
                           break label648;
                        }
                     }

                     var90 = var73;
                  }

                  if(var5 == null) {
                     break label484;
                  }

                  if(var90 == 0) {
                     label454: {
                        label453: {
                           var89 = var72;
                           if(var5 != null) {
                              if(var72 != 0) {
                                 break label453;
                              }

                              var89 = var81;
                           }

                           if(var89 == 0) {
                              var7.addVertexWithUV(var63, var82, var69, var33, var39);
                              var7.addVertexWithUV(var63, var84, var69, var33, var41);
                              var7.addVertexWithUV(var57, var84, var69, var37, var41);
                              var7.addVertexWithUV(var57, var82, var69, var37, var39);
                              if(var5 != null) {
                                 break label454;
                              }
                           }
                        }

                        var7.addVertexWithUV(var65, var82, var69, var35, var39);
                        var7.addVertexWithUV(var65, var84, var69, var35, var41);
                        var7.addVertexWithUV(var57, var84, var69, var37, var41);
                        var7.addVertexWithUV(var57, var82, var69, var37, var39);
                     }

                     label444: {
                        label443: {
                           var89 = var71;
                           if(var5 != null) {
                              if(var71 != 0) {
                                 break label443;
                              }

                              var89 = var81;
                           }

                           if(var89 == 0) {
                              var7.addVertexWithUV(var57, var82, var67, var37, var39);
                              var7.addVertexWithUV(var57, var84, var67, var37, var41);
                              var7.addVertexWithUV(var63, var84, var67, var33, var41);
                              var7.addVertexWithUV(var63, var82, var67, var33, var39);
                              if(var5 != null) {
                                 break label444;
                              }
                           }
                        }

                        var7.addVertexWithUV(var57, var82, var67, var37, var39);
                        var7.addVertexWithUV(var57, var84, var67, var37, var41);
                        var7.addVertexWithUV(var65, var84, var67, var35, var41);
                        var7.addVertexWithUV(var65, var82, var67, var35, var39);
                     }

                     var90 = var17;
                     if(var5 != null) {
                        if(var17 != 0) {
                           var7.addVertexWithUV(var65, var82, var69, var45, var53);
                           var7.addVertexWithUV(var57, var82, var69, var45, var47);
                           var7.addVertexWithUV(var57, var82, var67, var43, var47);
                           var7.addVertexWithUV(var65, var82, var67, var43, var53);
                        }

                        var90 = var18;
                     }

                     if(var5 == null) {
                        break label486;
                     }

                     if(var90 == 0) {
                        break label647;
                     }

                     var7.addVertexWithUV(var57, var84, var69, var43, var49);
                     var7.addVertexWithUV(var65, var84, var69, var43, var53);
                     var7.addVertexWithUV(var65, var84, var67, var45, var53);
                     var7.addVertexWithUV(var57, var84, var67, var45, var49);
                     if(var5 != null) {
                        break label647;
                     }
                  }
               }

               var90 = var74;
            }

            if(var5 == null) {
               break label486;
            }

            if(var90 == 0) {
               var90 = var71;
               if(var5 == null) {
                  break label486;
               }

               if(var71 == 0) {
                  var90 = var72;
                  if(var5 == null) {
                     break label486;
                  }

                  if(var72 == 0) {
                     var7.addVertexWithUV(var65, var82, var69, var95, var27);
                     var7.addVertexWithUV(var65, var84, var69, var95, var29);
                     var7.addVertexWithUV(var65, var84, var67, var23, var29);
                     var7.addVertexWithUV(var65, var82, var67, var23, var27);
                  }
               }
            }
         }

         var90 = var71;
      }

      label434: {
         label650: {
            if(var5 != null) {
               label431: {
                  if(var90 == 0) {
                     var90 = var81;
                     if(var5 == null) {
                        break label431;
                     }

                     if(var81 == 0) {
                        var90 = var74;
                        if(var5 == null) {
                           break label434;
                        }

                        if(var74 != 0) {
                           break label650;
                        }

                        var90 = var73;
                        if(var5 == null) {
                           break label434;
                        }

                        if(var73 != 0) {
                           break label650;
                        }

                        var7.addVertexWithUV(var65, var82, var67, var35, var39);
                        var7.addVertexWithUV(var65, var84, var67, var35, var41);
                        var7.addVertexWithUV(var63, var84, var67, var33, var41);
                        var7.addVertexWithUV(var63, var82, var67, var33, var39);
                        if(var5 != null) {
                           break label650;
                        }
                     }
                  }

                  var90 = var71;
               }
            }

            if(var5 != null) {
               label415: {
                  if(var90 != 0) {
                     var90 = var72;
                     if(var5 == null) {
                        break label415;
                     }

                     if(var72 != 0) {
                        label395: {
                           if(var73 == 0) {
                              var7.addVertexWithUV(var63, var82, var59, var93, var27);
                              var7.addVertexWithUV(var63, var84, var59, var93, var29);
                              var7.addVertexWithUV(var63, var84, var61, var25, var29);
                              var7.addVertexWithUV(var63, var82, var61, var25, var27);
                              if(var5 != null) {
                                 break label395;
                              }
                           }

                           var7.addVertexWithUV(var63, var82, var59, var93, var27);
                           var7.addVertexWithUV(var63, var84, var59, var93, var29);
                           var7.addVertexWithUV(var63, var84, var67, var95, var29);
                           var7.addVertexWithUV(var63, var82, var67, var95, var27);
                           var7.addVertexWithUV(var63, var82, var69, var23, var27);
                           var7.addVertexWithUV(var63, var84, var69, var23, var29);
                           var7.addVertexWithUV(var63, var84, var61, var25, var29);
                           var7.addVertexWithUV(var63, var82, var61, var25, var27);
                        }

                        label390: {
                           if(var74 == 0) {
                              var7.addVertexWithUV(var65, var82, var61, var25, var27);
                              var7.addVertexWithUV(var65, var84, var61, var25, var29);
                              var7.addVertexWithUV(var65, var84, var59, var93, var29);
                              var7.addVertexWithUV(var65, var82, var59, var93, var27);
                              if(var5 != null) {
                                 break label390;
                              }
                           }

                           var7.addVertexWithUV(var65, var82, var67, var95, var27);
                           var7.addVertexWithUV(var65, var84, var67, var95, var29);
                           var7.addVertexWithUV(var65, var84, var59, var93, var29);
                           var7.addVertexWithUV(var65, var82, var59, var93, var27);
                           var7.addVertexWithUV(var65, var82, var61, var25, var27);
                           var7.addVertexWithUV(var65, var84, var61, var25, var29);
                           var7.addVertexWithUV(var65, var84, var69, var23, var29);
                           var7.addVertexWithUV(var65, var82, var69, var23, var27);
                        }

                        var90 = var17;
                        if(var5 != null) {
                           if(var17 != 0) {
                              var7.addVertexWithUV(var65, var82, var59, var45, var47);
                              var7.addVertexWithUV(var63, var82, var59, var43, var47);
                              var7.addVertexWithUV(var63, var82, var61, var43, var49);
                              var7.addVertexWithUV(var65, var82, var61, var45, var49);
                           }

                           var90 = var18;
                        }

                        if(var5 == null) {
                           break label434;
                        }

                        if(var90 == 0) {
                           break label650;
                        }

                        var7.addVertexWithUV(var63, var84, var59, var43, var47);
                        var7.addVertexWithUV(var65, var84, var59, var45, var47);
                        var7.addVertexWithUV(var65, var84, var61, var45, var49);
                        var7.addVertexWithUV(var63, var84, var61, var43, var49);
                        if(var5 != null) {
                           break label650;
                        }
                     }
                  }

                  var90 = var73;
               }
            }

            label385: {
               label384: {
                  if(var5 != null) {
                     if(var90 != 0) {
                        break label384;
                     }

                     var90 = var81;
                  }

                  if(var90 == 0) {
                     var7.addVertexWithUV(var63, var82, var59, var93, var27);
                     var7.addVertexWithUV(var63, var84, var59, var93, var29);
                     var7.addVertexWithUV(var63, var84, var69, var23, var29);
                     var7.addVertexWithUV(var63, var82, var69, var23, var27);
                     if(var5 != null) {
                        break label385;
                     }
                  }
               }

               var7.addVertexWithUV(var63, var82, var59, var93, var27);
               var7.addVertexWithUV(var63, var84, var59, var93, var29);
               var7.addVertexWithUV(var63, var84, var67, var95, var29);
               var7.addVertexWithUV(var63, var82, var67, var95, var27);
            }

            label375: {
               label374: {
                  var89 = var74;
                  if(var5 != null) {
                     if(var74 != 0) {
                        break label374;
                     }

                     var89 = var81;
                  }

                  if(var89 == 0) {
                     var7.addVertexWithUV(var65, var82, var69, var23, var27);
                     var7.addVertexWithUV(var65, var84, var69, var23, var29);
                     var7.addVertexWithUV(var65, var84, var59, var93, var29);
                     var7.addVertexWithUV(var65, var82, var59, var93, var27);
                     if(var5 != null) {
                        break label375;
                     }
                  }
               }

               var7.addVertexWithUV(var65, var82, var67, var95, var27);
               var7.addVertexWithUV(var65, var84, var67, var95, var29);
               var7.addVertexWithUV(var65, var84, var59, var93, var29);
               var7.addVertexWithUV(var65, var82, var59, var93, var27);
            }

            var90 = var17;
            if(var5 != null) {
               if(var17 != 0) {
                  var7.addVertexWithUV(var65, var82, var59, var45, var47);
                  var7.addVertexWithUV(var63, var82, var59, var43, var47);
                  var7.addVertexWithUV(var63, var82, var67, var43, var51);
                  var7.addVertexWithUV(var65, var82, var67, var45, var51);
               }

               var90 = var18;
            }

            if(var5 == null) {
               break label434;
            }

            if(var90 != 0) {
               var7.addVertexWithUV(var63, var84, var59, var43, var47);
               var7.addVertexWithUV(var65, var84, var59, var45, var47);
               var7.addVertexWithUV(var65, var84, var67, var45, var51);
               var7.addVertexWithUV(var63, var84, var67, var43, var51);
            }
         }

         var90 = var72;
      }

      label365: {
         label653: {
            label363: {
               label654: {
                  if(var5 != null) {
                     if(var90 == 0) {
                        var90 = var81;
                        if(var5 == null) {
                           break label363;
                        }

                        if(var81 == 0) {
                           break label654;
                        }
                     }

                     var90 = var71;
                  }

                  if(var5 == null) {
                     break label363;
                  }

                  if(var90 == 0) {
                     label333: {
                        label332: {
                           var89 = var73;
                           if(var5 != null) {
                              if(var73 != 0) {
                                 break label332;
                              }

                              var89 = var81;
                           }

                           if(var89 == 0) {
                              var7.addVertexWithUV(var63, var82, var67, var95, var27);
                              var7.addVertexWithUV(var63, var84, var67, var95, var29);
                              var7.addVertexWithUV(var63, var84, var61, var25, var29);
                              var7.addVertexWithUV(var63, var82, var61, var25, var27);
                              if(var5 != null) {
                                 break label333;
                              }
                           }
                        }

                        var7.addVertexWithUV(var63, var82, var69, var23, var27);
                        var7.addVertexWithUV(var63, var84, var69, var23, var29);
                        var7.addVertexWithUV(var63, var84, var61, var25, var29);
                        var7.addVertexWithUV(var63, var82, var61, var25, var27);
                     }

                     label323: {
                        label322: {
                           var89 = var74;
                           if(var5 != null) {
                              if(var74 != 0) {
                                 break label322;
                              }

                              var89 = var81;
                           }

                           if(var89 == 0) {
                              var7.addVertexWithUV(var65, var82, var61, var25, var27);
                              var7.addVertexWithUV(var65, var84, var61, var25, var29);
                              var7.addVertexWithUV(var65, var84, var67, var95, var29);
                              var7.addVertexWithUV(var65, var82, var67, var95, var27);
                              if(var5 != null) {
                                 break label323;
                              }
                           }
                        }

                        var7.addVertexWithUV(var65, var82, var61, var25, var27);
                        var7.addVertexWithUV(var65, var84, var61, var25, var29);
                        var7.addVertexWithUV(var65, var84, var69, var23, var29);
                        var7.addVertexWithUV(var65, var82, var69, var23, var27);
                     }

                     var90 = var17;
                     if(var5 != null) {
                        if(var17 != 0) {
                           var7.addVertexWithUV(var65, var82, var69, var45, var53);
                           var7.addVertexWithUV(var63, var82, var69, var43, var53);
                           var7.addVertexWithUV(var63, var82, var61, var43, var49);
                           var7.addVertexWithUV(var65, var82, var61, var45, var49);
                        }

                        var90 = var18;
                     }

                     if(var5 == null) {
                        break label365;
                     }

                     if(var90 == 0) {
                        break label653;
                     }

                     var7.addVertexWithUV(var63, var84, var69, var43, var53);
                     var7.addVertexWithUV(var65, var84, var69, var45, var53);
                     var7.addVertexWithUV(var65, var84, var61, var45, var49);
                     var7.addVertexWithUV(var63, var84, var61, var43, var49);
                     if(var5 != null) {
                        break label653;
                     }
                  }
               }

               var90 = var72;
            }

            if(var5 == null) {
               break label365;
            }

            if(var90 == 0) {
               var90 = var74;
               if(var5 == null) {
                  break label365;
               }

               if(var74 == 0) {
                  var90 = var73;
                  if(var5 == null) {
                     break label365;
                  }

                  if(var73 == 0) {
                     var7.addVertexWithUV(var63, var82, var69, var33, var39);
                     var7.addVertexWithUV(var63, var84, var69, var33, var41);
                     var7.addVertexWithUV(var65, var84, var69, var35, var41);
                     var7.addVertexWithUV(var65, var82, var69, var35, var39);
                  }
               }
            }
         }

         var90 = var17;
      }

      if(var5 != null) {
         if(var90 != 0) {
            var7.addVertexWithUV(var65, var82, var67, var45, var51);
            var7.addVertexWithUV(var63, var82, var67, var43, var51);
            var7.addVertexWithUV(var63, var82, var69, var43, var53);
            var7.addVertexWithUV(var65, var82, var69, var45, var53);
         }

         var90 = var18;
      }

      if(var5 != null) {
         if(var90 != 0) {
            var7.addVertexWithUV(var63, var84, var67, var43, var51);
            var7.addVertexWithUV(var65, var84, var67, var45, var51);
            var7.addVertexWithUV(var65, var84, var69, var45, var53);
            var7.addVertexWithUV(var63, var84, var69, var43, var53);
         }

         var90 = var81;
      }

      if(var5 != null) {
         if(var90 != 0) {
            var7.addVertexWithUV(var55, var82, var67, var95, var27);
            var7.addVertexWithUV(var55, var84, var67, var95, var29);
            var7.addVertexWithUV(var55, var84, var69, var23, var29);
            var7.addVertexWithUV(var55, var82, var69, var23, var27);
            var7.addVertexWithUV(var57, var82, var69, var95, var27);
            var7.addVertexWithUV(var57, var84, var69, var95, var29);
            var7.addVertexWithUV(var57, var84, var67, var23, var29);
            var7.addVertexWithUV(var57, var82, var67, var23, var27);
            var7.addVertexWithUV(var65, var82, var59, var35, var39);
            var7.addVertexWithUV(var65, var84, var59, var35, var41);
            var7.addVertexWithUV(var63, var84, var59, var33, var41);
            var7.addVertexWithUV(var63, var82, var59, var33, var39);
            var7.addVertexWithUV(var63, var82, var61, var33, var39);
            var7.addVertexWithUV(var63, var84, var61, var33, var41);
            var7.addVertexWithUV(var65, var84, var61, var35, var41);
            var7.addVertexWithUV(var65, var82, var61, var35, var39);
         }

         var90 = 1;
      }

      return (boolean)var90;
   }

   // $FF: renamed from: a (fR, int, int, int) boolean
   public boolean method_7246(class_389 var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = this.field_6952.method_36();
      String[] var5 = var10000;
      bmh var7 = bmh.instance;
      var7.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      int var8 = var1.method_2495(this.field_6952, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      int var101 = blt.field_7072;
      if(var5 != null) {
         if(blt.field_7072) {
            float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
            float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
            float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         var7.setVisible6(var9, var10, var11);
         var101 = this.method_7206();
      }

      class_73 var97;
      class_73 var98;
      label602: {
         if(var5 != null) {
            if(var101 != 0) {
               var97 = this.field_6953;
               var98 = this.field_6953;
               if(var5 != null) {
                  break label602;
               }
            }

            var101 = this.field_6952.method_33(var2, var3, var4);
         }

         int var99 = var101;
         var97 = this.drawTextBox9(var1, 0, var99);
         var98 = var1.method_2606();
      }

      class_73 var15;
      class_73 var16;
      class_73 var100;
      class_73 var102;
      label595: {
         var100 = var97;
         var15 = var97;
         var16 = var97;
         if(Config.isConnectedTextures()) {
            var102 = this.field_6953;
            if(var5 == null) {
               break label595;
            }

            if(this.field_6953 == null) {
               var97 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, 2, var97);
               var100 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, 3, var100);
               var15 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, 4, var15);
               var16 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, 5, var16);
            }
         }

         var102 = var97;
      }

      int var10001;
      double var37;
      double var39;
      double var41;
      double var43;
      double var45;
      double var47;
      double var49;
      double var51;
      double var53;
      double var55;
      double var57;
      double var59;
      double var61;
      double var63;
      double var65;
      double var69;
      double var73;
      double var75;
      double var77;
      double var79;
      double var81;
      byte var87;
      byte var88;
      byte var89;
      byte var90;
      byte var91;
      byte var92;
      byte var103;
      label589: {
         label606: {
            double var67;
            double var71;
            double var83;
            double var85;
            label587: {
               double var17;
               double var21;
               double var23;
               double var25;
               double var27;
               double var31;
               double var33;
               double var35;
               label634: {
                  var17 = (double)var102.method_368();
                  double var19 = (double)var97.method_370(8.0D);
                  var21 = (double)var97.method_369();
                  var23 = (double)var97.method_371();
                  var25 = (double)var97.method_372();
                  var27 = (double)var100.method_368();
                  double var29 = (double)var100.method_370(8.0D);
                  var31 = (double)var100.method_369();
                  var33 = (double)var100.method_371();
                  var35 = (double)var100.method_372();
                  var37 = (double)var15.method_368();
                  var39 = (double)var15.method_370(8.0D);
                  var41 = (double)var15.method_369();
                  var43 = (double)var15.method_371();
                  var45 = (double)var15.method_372();
                  var47 = (double)var16.method_368();
                  var49 = (double)var16.method_370(8.0D);
                  var51 = (double)var16.method_369();
                  var53 = (double)var16.method_371();
                  var55 = (double)var16.method_372();
                  var57 = (double)var98.method_370(7.0D);
                  var59 = (double)var98.method_370(9.0D);
                  var61 = (double)var98.method_371();
                  var63 = (double)var98.method_373(8.0D);
                  var65 = (double)var98.method_372();
                  var67 = (double)var2;
                  var69 = (double)var2 + 0.5D;
                  var71 = (double)(var2 + 1);
                  var73 = (double)var4;
                  var75 = (double)var4 + 0.5D;
                  var77 = (double)(var4 + 1);
                  var79 = (double)var2 + 0.5D - 0.0625D;
                  var81 = (double)var2 + 0.5D + 0.0625D;
                  var83 = (double)var4 + 0.5D - 0.0625D;
                  var85 = (double)var4 + 0.5D + 0.0625D;
                  var87 = var1.method_2607(this.field_6952.getBlock(var2, var3, var4 - 1));
                  var88 = var1.method_2607(this.field_6952.getBlock(var2, var3, var4 + 1));
                  var89 = var1.method_2607(this.field_6952.getBlock(var2 - 1, var3, var4));
                  var90 = var1.method_2607(this.field_6952.getBlock(var2 + 1, var3, var4));
                  var91 = var1.method_2445(this.field_6952, var2, var3 + 1, var4, 1);
                  var92 = var1.method_2445(this.field_6952, var2, var3 - 1, var4, 0);
                  double var93 = 0.01D;
                  double var95 = 0.005D;
                  var101 = var89;
                  if(var5 != null) {
                     if(var89 != 0) {
                        var101 = var90;
                        if(var5 == null) {
                           break label587;
                        }

                        if(var90 != 0) {
                           break label634;
                        }
                     }

                     var101 = var89;
                  }

                  if(var5 != null) {
                     label577: {
                        if(var101 == 0) {
                           var101 = var90;
                           if(var5 == null) {
                              break label577;
                           }

                           if(var90 == 0) {
                              var101 = var87;
                              if(var5 == null) {
                                 break label577;
                              }

                              if(var87 == 0) {
                                 var101 = var88;
                                 if(var5 == null) {
                                    break label587;
                                 }

                                 if(var88 == 0) {
                                    break label634;
                                 }
                              }
                           }
                        }

                        var101 = var89;
                     }
                  }

                  if(var5 != null) {
                     label560: {
                        if(var101 != 0) {
                           var101 = var90;
                           if(var5 == null) {
                              break label560;
                           }

                           if(var90 == 0) {
                              var7.addVertexWithUV(var67, (double)(var3 + 1), var75, var17, var23);
                              var7.addVertexWithUV(var67, (double)(var3 + 0), var75, var17, var25);
                              var7.addVertexWithUV(var69, (double)(var3 + 0), var75, var19, var25);
                              var7.addVertexWithUV(var69, (double)(var3 + 1), var75, var19, var23);
                              var7.addVertexWithUV(var69, (double)(var3 + 1), var75, var29, var33);
                              var7.addVertexWithUV(var69, (double)(var3 + 0), var75, var29, var35);
                              var7.addVertexWithUV(var67, (double)(var3 + 0), var75, var31, var35);
                              var7.addVertexWithUV(var67, (double)(var3 + 1), var75, var31, var33);
                              var101 = var88;
                              if(var5 != null) {
                                 label630: {
                                    if(var88 == 0) {
                                       var101 = var87;
                                       if(var5 == null) {
                                          break label630;
                                       }

                                       if(var87 == 0) {
                                          var7.addVertexWithUV(var69, (double)(var3 + 1), var85, var57, var61);
                                          var7.addVertexWithUV(var69, (double)(var3 + 0), var85, var57, var65);
                                          var7.addVertexWithUV(var69, (double)(var3 + 0), var83, var59, var65);
                                          var7.addVertexWithUV(var69, (double)(var3 + 1), var83, var59, var61);
                                          var7.addVertexWithUV(var69, (double)(var3 + 1), var83, var57, var61);
                                          var7.addVertexWithUV(var69, (double)(var3 + 0), var83, var57, var65);
                                          var7.addVertexWithUV(var69, (double)(var3 + 0), var85, var59, var65);
                                          var7.addVertexWithUV(var69, (double)(var3 + 1), var85, var59, var61);
                                       }
                                    }

                                    var101 = var91;
                                 }
                              }

                              label490: {
                                 label489: {
                                    label610: {
                                       if(var5 != null) {
                                          if(var101 != 0) {
                                             break label610;
                                          }

                                          var101 = var3;
                                       }

                                       if(var5 == null) {
                                          break label490;
                                       }

                                       if(var101 >= var6 - 1) {
                                          break label489;
                                       }

                                       var101 = this.field_6952.method_34(var2 - 1, var3 + 1, var4);
                                       if(var5 == null) {
                                          break label490;
                                       }

                                       if(var101 == 0) {
                                          break label489;
                                       }
                                    }

                                    var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var85, var59, var63);
                                    var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var85, var59, var65);
                                    var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var83, var57, var65);
                                    var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var83, var57, var63);
                                    var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var85, var59, var63);
                                    var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var85, var59, var65);
                                    var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var83, var57, var65);
                                    var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var83, var57, var63);
                                 }

                                 var101 = var92;
                              }

                              label611: {
                                 if(var5 != null) {
                                    if(var101 != 0) {
                                       break label611;
                                    }

                                    var101 = var3;
                                 }

                                 if(var5 == null) {
                                    break label589;
                                 }

                                 if(var101 <= 1) {
                                    break label606;
                                 }

                                 var101 = this.field_6952.method_34(var2 - 1, var3 - 1, var4);
                                 if(var5 == null) {
                                    break label589;
                                 }

                                 if(var101 == 0) {
                                    break label606;
                                 }
                              }

                              var7.addVertexWithUV(var67, (double)var3 - 0.01D, var85, var59, var63);
                              var7.addVertexWithUV(var69, (double)var3 - 0.01D, var85, var59, var65);
                              var7.addVertexWithUV(var69, (double)var3 - 0.01D, var83, var57, var65);
                              var7.addVertexWithUV(var67, (double)var3 - 0.01D, var83, var57, var63);
                              var7.addVertexWithUV(var69, (double)var3 - 0.01D, var85, var59, var63);
                              var7.addVertexWithUV(var67, (double)var3 - 0.01D, var85, var59, var65);
                              var7.addVertexWithUV(var67, (double)var3 - 0.01D, var83, var57, var65);
                              var7.addVertexWithUV(var69, (double)var3 - 0.01D, var83, var57, var63);
                              if(var5 != null) {
                                 break label606;
                              }
                           }
                        }

                        var101 = var89;
                     }
                  }

                  if(var5 == null) {
                     break label589;
                  }

                  if(var101 != 0) {
                     break label606;
                  }

                  var101 = var90;
                  if(var5 == null) {
                     break label589;
                  }

                  if(var90 == 0) {
                     break label606;
                  }

                  var7.addVertexWithUV(var69, (double)(var3 + 1), var75, var19, var23);
                  var7.addVertexWithUV(var69, (double)(var3 + 0), var75, var19, var25);
                  var7.addVertexWithUV(var71, (double)(var3 + 0), var75, var21, var25);
                  var7.addVertexWithUV(var71, (double)(var3 + 1), var75, var21, var23);
                  var7.addVertexWithUV(var71, (double)(var3 + 1), var75, var27, var33);
                  var7.addVertexWithUV(var71, (double)(var3 + 0), var75, var27, var35);
                  var7.addVertexWithUV(var69, (double)(var3 + 0), var75, var29, var35);
                  var7.addVertexWithUV(var69, (double)(var3 + 1), var75, var29, var33);
                  var101 = var88;
                  if(var5 != null) {
                     label631: {
                        if(var88 == 0) {
                           var101 = var87;
                           if(var5 == null) {
                              break label631;
                           }

                           if(var87 == 0) {
                              var7.addVertexWithUV(var69, (double)(var3 + 1), var83, var57, var61);
                              var7.addVertexWithUV(var69, (double)(var3 + 0), var83, var57, var65);
                              var7.addVertexWithUV(var69, (double)(var3 + 0), var85, var59, var65);
                              var7.addVertexWithUV(var69, (double)(var3 + 1), var85, var59, var61);
                              var7.addVertexWithUV(var69, (double)(var3 + 1), var85, var57, var61);
                              var7.addVertexWithUV(var69, (double)(var3 + 0), var85, var57, var65);
                              var7.addVertexWithUV(var69, (double)(var3 + 0), var83, var59, var65);
                              var7.addVertexWithUV(var69, (double)(var3 + 1), var83, var59, var61);
                           }
                        }

                        var101 = var91;
                     }
                  }

                  label465: {
                     label464: {
                        label613: {
                           if(var5 != null) {
                              if(var101 != 0) {
                                 break label613;
                              }

                              var101 = var3;
                           }

                           if(var5 == null) {
                              break label465;
                           }

                           if(var101 >= var6 - 1) {
                              break label464;
                           }

                           var101 = this.field_6952.method_34(var2 + 1, var3 + 1, var4);
                           if(var5 == null) {
                              break label465;
                           }

                           if(var101 == 0) {
                              break label464;
                           }
                        }

                        var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var85, var59, var61);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var85, var59, var63);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var83, var57, var63);
                        var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var83, var57, var61);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var85, var59, var61);
                        var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var85, var59, var63);
                        var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var83, var57, var63);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var83, var57, var61);
                     }

                     var101 = var92;
                  }

                  label614: {
                     if(var5 != null) {
                        if(var101 != 0) {
                           break label614;
                        }

                        var101 = var3;
                     }

                     if(var5 == null) {
                        break label589;
                     }

                     if(var101 <= 1) {
                        break label606;
                     }

                     var101 = this.field_6952.method_34(var2 + 1, var3 - 1, var4);
                     if(var5 == null) {
                        break label589;
                     }

                     if(var101 == 0) {
                        break label606;
                     }
                  }

                  var7.addVertexWithUV(var69, (double)var3 - 0.01D, var85, var59, var61);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var85, var59, var63);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var83, var57, var63);
                  var7.addVertexWithUV(var69, (double)var3 - 0.01D, var83, var57, var61);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var85, var59, var61);
                  var7.addVertexWithUV(var69, (double)var3 - 0.01D, var85, var59, var63);
                  var7.addVertexWithUV(var69, (double)var3 - 0.01D, var83, var57, var63);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var83, var57, var61);
                  if(var5 != null) {
                     break label606;
                  }
               }

               var7.addVertexWithUV(var67, (double)(var3 + 1), var75, var17, var23);
               var7.addVertexWithUV(var67, (double)(var3 + 0), var75, var17, var25);
               var7.addVertexWithUV(var71, (double)(var3 + 0), var75, var21, var25);
               var7.addVertexWithUV(var71, (double)(var3 + 1), var75, var21, var23);
               var7.addVertexWithUV(var71, (double)(var3 + 1), var75, var27, var33);
               var7.addVertexWithUV(var71, (double)(var3 + 0), var75, var27, var35);
               var7.addVertexWithUV(var67, (double)(var3 + 0), var75, var31, var35);
               var7.addVertexWithUV(var67, (double)(var3 + 1), var75, var31, var33);
               var101 = var91;
            }

            label449: {
               label615: {
                  if(var5 != null) {
                     if(var101 != 0) {
                        var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var85, var59, var65);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var85, var59, var61);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var83, var57, var61);
                        var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var83, var57, var65);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var85, var59, var65);
                        var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var85, var59, var61);
                        var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var83, var57, var61);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var83, var57, var65);
                        if(var5 != null) {
                           break label615;
                        }
                     }

                     var101 = var3;
                  }

                  var10001 = var6 - 1;
                  if(var5 != null) {
                     label433: {
                        if(var101 < var10001) {
                           var101 = this.field_6952.method_34(var2 - 1, var3 + 1, var4);
                           if(var5 == null) {
                              break label433;
                           }

                           if(var101 != 0) {
                              var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var85, var59, var63);
                              var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var85, var59, var65);
                              var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var83, var57, var65);
                              var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var83, var57, var63);
                              var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var85, var59, var63);
                              var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var85, var59, var65);
                              var7.addVertexWithUV(var67, (double)(var3 + 1) + 0.01D, var83, var57, var65);
                              var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var83, var57, var63);
                           }
                        }

                        var101 = var3;
                     }

                     if(var5 == null) {
                        break label449;
                     }

                     var10001 = var6 - 1;
                  }

                  if(var101 < var10001) {
                     var101 = this.field_6952.method_34(var2 + 1, var3 + 1, var4);
                     if(var5 == null) {
                        break label449;
                     }

                     if(var101 != 0) {
                        var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var85, var59, var61);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var85, var59, var63);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var83, var57, var63);
                        var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var83, var57, var61);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var85, var59, var61);
                        var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var85, var59, var63);
                        var7.addVertexWithUV(var69, (double)(var3 + 1) + 0.01D, var83, var57, var63);
                        var7.addVertexWithUV(var71, (double)(var3 + 1) + 0.01D, var83, var57, var61);
                     }
                  }
               }

               var101 = var92;
            }

            if(var5 != null) {
               if(var101 != 0) {
                  var7.addVertexWithUV(var67, (double)var3 - 0.01D, var85, var59, var65);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var85, var59, var61);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var83, var57, var61);
                  var7.addVertexWithUV(var67, (double)var3 - 0.01D, var83, var57, var65);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var85, var59, var65);
                  var7.addVertexWithUV(var67, (double)var3 - 0.01D, var85, var59, var61);
                  var7.addVertexWithUV(var67, (double)var3 - 0.01D, var83, var57, var61);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var83, var57, var65);
                  if(var5 != null) {
                     break label606;
                  }
               }

               var101 = var3;
            }

            var103 = 1;
            if(var5 != null) {
               label428: {
                  if(var101 > 1) {
                     var101 = this.field_6952.method_34(var2 - 1, var3 - 1, var4);
                     if(var5 == null) {
                        break label428;
                     }

                     if(var101 != 0) {
                        var7.addVertexWithUV(var67, (double)var3 - 0.01D, var85, var59, var63);
                        var7.addVertexWithUV(var69, (double)var3 - 0.01D, var85, var59, var65);
                        var7.addVertexWithUV(var69, (double)var3 - 0.01D, var83, var57, var65);
                        var7.addVertexWithUV(var67, (double)var3 - 0.01D, var83, var57, var63);
                        var7.addVertexWithUV(var69, (double)var3 - 0.01D, var85, var59, var63);
                        var7.addVertexWithUV(var67, (double)var3 - 0.01D, var85, var59, var65);
                        var7.addVertexWithUV(var67, (double)var3 - 0.01D, var83, var57, var65);
                        var7.addVertexWithUV(var69, (double)var3 - 0.01D, var83, var57, var63);
                     }
                  }

                  var101 = var3;
               }

               if(var5 == null) {
                  break label589;
               }

               var103 = 1;
            }

            if(var101 > var103) {
               var101 = this.field_6952.method_34(var2 + 1, var3 - 1, var4);
               if(var5 == null) {
                  break label589;
               }

               if(var101 != 0) {
                  var7.addVertexWithUV(var69, (double)var3 - 0.01D, var85, var59, var61);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var85, var59, var63);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var83, var57, var63);
                  var7.addVertexWithUV(var69, (double)var3 - 0.01D, var83, var57, var61);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var85, var59, var61);
                  var7.addVertexWithUV(var69, (double)var3 - 0.01D, var85, var59, var63);
                  var7.addVertexWithUV(var69, (double)var3 - 0.01D, var83, var57, var63);
                  var7.addVertexWithUV(var71, (double)var3 - 0.01D, var83, var57, var61);
               }
            }
         }

         var101 = var87;
      }

      label422: {
         label618: {
            label420: {
               label636: {
                  if(var5 != null) {
                     if(var101 != 0) {
                        var101 = var88;
                        if(var5 == null) {
                           break label420;
                        }

                        if(var88 != 0) {
                           break label636;
                        }
                     }

                     var101 = var89;
                  }

                  if(var5 != null) {
                     label410: {
                        if(var101 == 0) {
                           var101 = var90;
                           if(var5 == null) {
                              break label410;
                           }

                           if(var90 == 0) {
                              var101 = var87;
                              if(var5 == null) {
                                 break label410;
                              }

                              if(var87 == 0) {
                                 var101 = var88;
                                 if(var5 == null) {
                                    break label420;
                                 }

                                 if(var88 == 0) {
                                    break label636;
                                 }
                              }
                           }
                        }

                        var101 = var87;
                     }
                  }

                  if(var5 != null) {
                     label393: {
                        if(var101 != 0) {
                           var101 = var88;
                           if(var5 == null) {
                              break label393;
                           }

                           if(var88 == 0) {
                              var7.addVertexWithUV(var69, (double)(var3 + 1), var73, var37, var43);
                              var7.addVertexWithUV(var69, (double)(var3 + 0), var73, var37, var45);
                              var7.addVertexWithUV(var69, (double)(var3 + 0), var75, var39, var45);
                              var7.addVertexWithUV(var69, (double)(var3 + 1), var75, var39, var43);
                              var7.addVertexWithUV(var69, (double)(var3 + 1), var75, var49, var53);
                              var7.addVertexWithUV(var69, (double)(var3 + 0), var75, var49, var55);
                              var7.addVertexWithUV(var69, (double)(var3 + 0), var73, var51, var55);
                              var7.addVertexWithUV(var69, (double)(var3 + 1), var73, var51, var53);
                              var101 = var90;
                              if(var5 != null) {
                                 label632: {
                                    if(var90 == 0) {
                                       var101 = var89;
                                       if(var5 == null) {
                                          break label632;
                                       }

                                       if(var89 == 0) {
                                          var7.addVertexWithUV(var79, (double)(var3 + 1), var75, var57, var61);
                                          var7.addVertexWithUV(var79, (double)(var3 + 0), var75, var57, var65);
                                          var7.addVertexWithUV(var81, (double)(var3 + 0), var75, var59, var65);
                                          var7.addVertexWithUV(var81, (double)(var3 + 1), var75, var59, var61);
                                          var7.addVertexWithUV(var81, (double)(var3 + 1), var75, var57, var61);
                                          var7.addVertexWithUV(var81, (double)(var3 + 0), var75, var57, var65);
                                          var7.addVertexWithUV(var79, (double)(var3 + 0), var75, var59, var65);
                                          var7.addVertexWithUV(var79, (double)(var3 + 1), var75, var59, var61);
                                       }
                                    }

                                    var101 = var91;
                                 }
                              }

                              label323: {
                                 label322: {
                                    label622: {
                                       if(var5 != null) {
                                          if(var101 != 0) {
                                             break label622;
                                          }

                                          var101 = var3;
                                       }

                                       if(var5 == null) {
                                          break label323;
                                       }

                                       if(var101 >= var6 - 1) {
                                          break label322;
                                       }

                                       var101 = this.field_6952.method_34(var2, var3 + 1, var4 - 1);
                                       if(var5 == null) {
                                          break label323;
                                       }

                                       if(var101 == 0) {
                                          break label322;
                                       }
                                    }

                                    var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var73, var59, var61);
                                    var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var75, var59, var63);
                                    var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var75, var57, var63);
                                    var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var73, var57, var61);
                                    var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var75, var59, var61);
                                    var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var73, var59, var63);
                                    var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var73, var57, var63);
                                    var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var75, var57, var61);
                                 }

                                 var101 = var92;
                              }

                              label623: {
                                 if(var5 != null) {
                                    if(var101 != 0) {
                                       break label623;
                                    }

                                    var101 = var3;
                                 }

                                 if(var5 == null) {
                                    break label422;
                                 }

                                 if(var101 <= 1) {
                                    break label618;
                                 }

                                 var101 = this.field_6952.method_34(var2, var3 - 1, var4 - 1);
                                 if(var5 == null) {
                                    break label422;
                                 }

                                 if(var101 == 0) {
                                    break label618;
                                 }
                              }

                              var7.addVertexWithUV(var79, (double)var3 - 0.005D, var73, var59, var61);
                              var7.addVertexWithUV(var79, (double)var3 - 0.005D, var75, var59, var63);
                              var7.addVertexWithUV(var81, (double)var3 - 0.005D, var75, var57, var63);
                              var7.addVertexWithUV(var81, (double)var3 - 0.005D, var73, var57, var61);
                              var7.addVertexWithUV(var79, (double)var3 - 0.005D, var75, var59, var61);
                              var7.addVertexWithUV(var79, (double)var3 - 0.005D, var73, var59, var63);
                              var7.addVertexWithUV(var81, (double)var3 - 0.005D, var73, var57, var63);
                              var7.addVertexWithUV(var81, (double)var3 - 0.005D, var75, var57, var61);
                              if(var5 != null) {
                                 break label618;
                              }
                           }
                        }

                        var101 = var87;
                     }
                  }

                  if(var5 == null) {
                     break label422;
                  }

                  if(var101 != 0) {
                     break label618;
                  }

                  var101 = var88;
                  if(var5 == null) {
                     break label422;
                  }

                  if(var88 == 0) {
                     break label618;
                  }

                  var7.addVertexWithUV(var69, (double)(var3 + 1), var75, var39, var43);
                  var7.addVertexWithUV(var69, (double)(var3 + 0), var75, var39, var45);
                  var7.addVertexWithUV(var69, (double)(var3 + 0), var77, var41, var45);
                  var7.addVertexWithUV(var69, (double)(var3 + 1), var77, var41, var43);
                  var7.addVertexWithUV(var69, (double)(var3 + 1), var77, var47, var53);
                  var7.addVertexWithUV(var69, (double)(var3 + 0), var77, var47, var55);
                  var7.addVertexWithUV(var69, (double)(var3 + 0), var75, var49, var55);
                  var7.addVertexWithUV(var69, (double)(var3 + 1), var75, var49, var53);
                  var101 = var90;
                  if(var5 != null) {
                     label633: {
                        if(var90 == 0) {
                           var101 = var89;
                           if(var5 == null) {
                              break label633;
                           }

                           if(var89 == 0) {
                              var7.addVertexWithUV(var81, (double)(var3 + 1), var75, var57, var61);
                              var7.addVertexWithUV(var81, (double)(var3 + 0), var75, var57, var65);
                              var7.addVertexWithUV(var79, (double)(var3 + 0), var75, var59, var65);
                              var7.addVertexWithUV(var79, (double)(var3 + 1), var75, var59, var61);
                              var7.addVertexWithUV(var79, (double)(var3 + 1), var75, var57, var61);
                              var7.addVertexWithUV(var79, (double)(var3 + 0), var75, var57, var65);
                              var7.addVertexWithUV(var81, (double)(var3 + 0), var75, var59, var65);
                              var7.addVertexWithUV(var81, (double)(var3 + 1), var75, var59, var61);
                           }
                        }

                        var101 = var91;
                     }
                  }

                  label298: {
                     label297: {
                        label625: {
                           if(var5 != null) {
                              if(var101 != 0) {
                                 break label625;
                              }

                              var101 = var3;
                           }

                           if(var5 == null) {
                              break label298;
                           }

                           if(var101 >= var6 - 1) {
                              break label297;
                           }

                           var101 = this.field_6952.method_34(var2, var3 + 1, var4 + 1);
                           if(var5 == null) {
                              break label298;
                           }

                           if(var101 == 0) {
                              break label297;
                           }
                        }

                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var75, var57, var63);
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var77, var57, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var77, var59, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var75, var59, var63);
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var77, var57, var63);
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var75, var57, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var75, var59, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var77, var59, var63);
                     }

                     var101 = var92;
                  }

                  label626: {
                     if(var5 != null) {
                        if(var101 != 0) {
                           break label626;
                        }

                        var101 = var3;
                     }

                     if(var5 == null) {
                        break label422;
                     }

                     if(var101 <= 1) {
                        break label618;
                     }

                     var101 = this.field_6952.method_34(var2, var3 - 1, var4 + 1);
                     if(var5 == null) {
                        break label422;
                     }

                     if(var101 == 0) {
                        break label618;
                     }
                  }

                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var75, var57, var63);
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var77, var57, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var77, var59, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var75, var59, var63);
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var77, var57, var63);
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var75, var57, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var75, var59, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var77, var59, var63);
                  if(var5 != null) {
                     break label618;
                  }
               }

               var7.addVertexWithUV(var69, (double)(var3 + 1), var77, var47, var53);
               var7.addVertexWithUV(var69, (double)(var3 + 0), var77, var47, var55);
               var7.addVertexWithUV(var69, (double)(var3 + 0), var73, var51, var55);
               var7.addVertexWithUV(var69, (double)(var3 + 1), var73, var51, var53);
               var7.addVertexWithUV(var69, (double)(var3 + 1), var73, var37, var43);
               var7.addVertexWithUV(var69, (double)(var3 + 0), var73, var37, var45);
               var7.addVertexWithUV(var69, (double)(var3 + 0), var77, var41, var45);
               var7.addVertexWithUV(var69, (double)(var3 + 1), var77, var41, var43);
               var101 = var91;
            }

            label282: {
               label627: {
                  if(var5 != null) {
                     if(var101 != 0) {
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var77, var59, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var73, var59, var61);
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var73, var57, var61);
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var77, var57, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var73, var59, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var77, var59, var61);
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var77, var57, var61);
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var73, var57, var65);
                        if(var5 != null) {
                           break label627;
                        }
                     }

                     var101 = var3;
                  }

                  var10001 = var6 - 1;
                  if(var5 != null) {
                     label266: {
                        if(var101 < var10001) {
                           var101 = this.field_6952.method_34(var2, var3 + 1, var4 - 1);
                           if(var5 == null) {
                              break label266;
                           }

                           if(var101 != 0) {
                              var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var73, var59, var61);
                              var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var75, var59, var63);
                              var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var75, var57, var63);
                              var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var73, var57, var61);
                              var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var75, var59, var61);
                              var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var73, var59, var63);
                              var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var73, var57, var63);
                              var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var75, var57, var61);
                           }
                        }

                        var101 = var3;
                     }

                     if(var5 == null) {
                        break label282;
                     }

                     var10001 = var6 - 1;
                  }

                  if(var101 < var10001) {
                     var101 = this.field_6952.method_34(var2, var3 + 1, var4 + 1);
                     if(var5 == null) {
                        break label282;
                     }

                     if(var101 != 0) {
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var75, var57, var63);
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var77, var57, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var77, var59, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var75, var59, var63);
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var77, var57, var63);
                        var7.addVertexWithUV(var79, (double)(var3 + 1) + 0.005D, var75, var57, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var75, var59, var65);
                        var7.addVertexWithUV(var81, (double)(var3 + 1) + 0.005D, var77, var59, var63);
                     }
                  }
               }

               var101 = var92;
            }

            if(var5 != null) {
               if(var101 != 0) {
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var77, var59, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var73, var59, var61);
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var73, var57, var61);
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var77, var57, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var73, var59, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var77, var59, var61);
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var77, var57, var61);
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var73, var57, var65);
                  if(var5 != null) {
                     break label618;
                  }
               }

               var101 = var3;
            }

            var103 = 1;
            if(var5 != null) {
               label261: {
                  if(var101 > 1) {
                     var101 = this.field_6952.method_34(var2, var3 - 1, var4 - 1);
                     if(var5 == null) {
                        break label261;
                     }

                     if(var101 != 0) {
                        var7.addVertexWithUV(var79, (double)var3 - 0.005D, var73, var59, var61);
                        var7.addVertexWithUV(var79, (double)var3 - 0.005D, var75, var59, var63);
                        var7.addVertexWithUV(var81, (double)var3 - 0.005D, var75, var57, var63);
                        var7.addVertexWithUV(var81, (double)var3 - 0.005D, var73, var57, var61);
                        var7.addVertexWithUV(var79, (double)var3 - 0.005D, var75, var59, var61);
                        var7.addVertexWithUV(var79, (double)var3 - 0.005D, var73, var59, var63);
                        var7.addVertexWithUV(var81, (double)var3 - 0.005D, var73, var57, var63);
                        var7.addVertexWithUV(var81, (double)var3 - 0.005D, var75, var57, var61);
                     }
                  }

                  var101 = var3;
               }

               if(var5 == null) {
                  break label422;
               }

               var103 = 1;
            }

            if(var101 > var103) {
               var101 = this.field_6952.method_34(var2, var3 - 1, var4 + 1);
               if(var5 == null) {
                  break label422;
               }

               if(var101 != 0) {
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var75, var57, var63);
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var77, var57, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var77, var59, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var75, var59, var63);
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var77, var57, var63);
                  var7.addVertexWithUV(var79, (double)var3 - 0.005D, var75, var57, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var75, var59, var65);
                  var7.addVertexWithUV(var81, (double)var3 - 0.005D, var77, var59, var63);
               }
            }
         }

         var101 = Config.isBetterSnow();
      }

      if(var5 != null) {
         if(var101 != 0) {
            var101 = this.hasSnowNeighbours(var2, var3, var4);
            if(var5 == null) {
               return (boolean)var101;
            }

            if(var101 != 0) {
               this.renderSnow(var2, var3, var4, class_1192.field_6104.method_2490());
            }
         }

         var101 = 1;
      }

      return (boolean)var101;
   }

   // $FF: renamed from: l (aji, int, int, int) boolean
   public boolean method_7247(aji var1, int var2, int var3, int var4) {
      bmh var6 = bmh.instance;
      String[] var10000 = class_752.method_4253();
      var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      int var7 = CustomColorizer.getColorMultiplier(var1, this.field_6952, var2, var3, var4);
      String[] var5 = var10000;
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      int var22 = blt.field_7072;
      if(var5 != null) {
         if(blt.field_7072) {
            float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
            float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
            float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
            var8 = var11;
            var9 = var12;
            var10 = var13;
         }

         var6.setVisible6(var8, var9, var10);
         var22 = var2;
      }

      double var15;
      double var20;
      double var21;
      label68: {
         var20 = (double)var22;
         var21 = (double)var3;
         var15 = (double)var4;
         aji var23 = var1;
         long var17;
         if(var5 != null) {
            if(var1 == class_1192.field_6058) {
               var17 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
               var17 = var17 * var17 * 42317861L + var17 * 11L;
               var20 += ((double)((float)(var17 >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D;
               var21 += ((double)((float)(var17 >> 20 & 15L) / 15.0F) - 1.0D) * 0.2D;
               var15 += ((double)((float)(var17 >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D;
               if(var5 != null) {
                  break label68;
               }
            }

            var23 = var1;
         }

         label57: {
            class_447 var10001 = class_1192.field_6065;
            if(var5 != null) {
               if(var23 == class_1192.field_6065) {
                  break label57;
               }

               var23 = var1;
               var10001 = class_1192.field_6064;
            }

            if(var23 != var10001) {
               break label68;
            }
         }

         var17 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
         var17 = var17 * var17 * 42317861L + var17 * 11L;
         var20 += ((double)((float)(var17 >> 16 & 15L) / 15.0F) - 0.5D) * 0.3D;
         var15 += ((double)((float)(var17 >> 24 & 15L) / 15.0F) - 0.5D) * 0.3D;
      }

      class_73 var19 = this.drawTextBox9(var1, 0, this.field_6952.method_33(var2, var3, var4));
      boolean var24 = Config.isConnectedTextures();
      if(var5 != null) {
         blm var25;
         label47: {
            if(var24) {
               var25 = this;
               if(var5 == null) {
                  break label47;
               }

               if(this.field_6953 == null) {
                  var19 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, 2, var19);
               }
            }

            var25 = this;
         }

         var25.method_7252(var19, var20, var21, var15, 1.0F);
         var24 = Config.isBetterSnow();
      }

      if(var5 != null) {
         if(var24) {
            var24 = this.hasSnowNeighbours(var2, var3, var4);
            if(var5 == null) {
               return var24;
            }

            if(var24) {
               this.renderSnow(var2, var3, var4, class_1192.field_6104.method_2490());
            }
         }

         var24 = true;
      }

      return var24;
   }

   // $FF: renamed from: a (ey, int, int, int) boolean
   public boolean method_7248(class_448 var1, int var2, int var3, int var4) {
      bmh var6 = bmh.instance;
      var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      String[] var10000 = class_752.method_4253();
      int var7 = CustomColorizer.getColorMultiplier(var1, this.field_6952, var2, var3, var4);
      String[] var5 = var10000;
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      int var62 = blt.field_7072;
      if(var5 != null) {
         if(blt.field_7072) {
            float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
            float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
            float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
            var8 = var11;
            var9 = var12;
            var10 = var13;
         }

         var6.setVisible6(var8, var9, var10);
         var62 = var2 * 3129871;
      }

      double var15;
      double var17;
      byte var21;
      int var22;
      long var60;
      double var61;
      label58: {
         var60 = (long)var62 ^ (long)var4 * 116129781L;
         var60 = var60 * var60 * 42317861L + var60 * 11L;
         var61 = (double)var2;
         var15 = (double)var3;
         var17 = (double)var4;
         var61 += ((double)((float)(var60 >> 16 & 15L) / 15.0F) - 0.5D) * 0.3D;
         var17 += ((double)((float)(var60 >> 24 & 15L) / 15.0F) - 0.5D) * 0.3D;
         int var19 = this.field_6952.method_33(var2, var3, var4);
         boolean var20 = false;
         var21 = class_448.method_2777(var19);
         var62 = var21;
         if(var5 != null) {
            if(var21 != 0) {
               ahl var63 = this.field_6952;
               int var10001 = var2;
               int var10002 = var3 - 1;
               int var10003 = var4;
               if(var5 != null) {
                  if(this.field_6952.getBlock(var2, var10002, var4) != var1) {
                     return false;
                  }

                  var63 = this.field_6952;
                  var10001 = var2;
                  var10002 = var3 - 1;
                  var10003 = var4;
               }

               var22 = class_448.method_2778(var63.method_33(var10001, var10002, var10003));
               if(var5 != null) {
                  break label58;
               }
            }

            var62 = class_448.method_2778(var19);
         }

         var22 = var62;
      }

      class_73 var23 = var1.method_2779((boolean)var21, var22);
      this.method_7252(var23, var61, var15, var17, 1.0F);
      var62 = var21;
      if(var5 != null) {
         label49: {
            if(var21 != 0) {
               var62 = var22;
               if(var5 == null) {
                  break label49;
               }

               if(var22 == 0) {
                  class_73 var24 = var1.field_2197[0];
                  double var25 = Math.cos((double)var60 * 0.8D) * 3.141592653589793D * 0.1D;
                  double var27 = Math.cos(var25);
                  double var29 = Math.sin(var25);
                  double var31 = (double)var24.method_368();
                  double var33 = (double)var24.method_371();
                  double var35 = (double)var24.method_369();
                  double var37 = (double)var24.method_372();
                  double var39 = 0.3D;
                  double var41 = -0.05D;
                  double var43 = 0.5D + 0.3D * var27 - 0.5D * var29;
                  double var45 = 0.5D + 0.5D * var27 + 0.3D * var29;
                  double var47 = 0.5D + 0.3D * var27 + 0.5D * var29;
                  double var49 = 0.5D + -0.5D * var27 + 0.3D * var29;
                  double var51 = 0.5D + -0.05D * var27 + 0.5D * var29;
                  double var53 = 0.5D + -0.5D * var27 + -0.05D * var29;
                  double var55 = 0.5D + -0.05D * var27 - 0.5D * var29;
                  double var57 = 0.5D + 0.5D * var27 + -0.05D * var29;
                  var6.addVertexWithUV(var61 + var51, var15 + 1.0D, var17 + var53, var31, var37);
                  var6.addVertexWithUV(var61 + var55, var15 + 1.0D, var17 + var57, var35, var37);
                  var6.addVertexWithUV(var61 + var43, var15 + 0.0D, var17 + var45, var35, var33);
                  var6.addVertexWithUV(var61 + var47, var15 + 0.0D, var17 + var49, var31, var33);
                  class_73 var59 = var1.field_2197[1];
                  var31 = (double)var59.method_368();
                  var33 = (double)var59.method_371();
                  var35 = (double)var59.method_369();
                  var37 = (double)var59.method_372();
                  var6.addVertexWithUV(var61 + var55, var15 + 1.0D, var17 + var57, var31, var37);
                  var6.addVertexWithUV(var61 + var51, var15 + 1.0D, var17 + var53, var35, var37);
                  var6.addVertexWithUV(var61 + var47, var15 + 0.0D, var17 + var49, var35, var33);
                  var6.addVertexWithUV(var61 + var43, var15 + 0.0D, var17 + var45, var31, var33);
               }
            }

            var62 = Config.isBetterSnow();
         }
      }

      if(var5 != null) {
         if(var62 != 0) {
            var62 = this.hasSnowNeighbours(var2, var3, var4);
            if(var5 == null) {
               return (boolean)var62;
            }

            if(var62 != 0) {
               this.renderSnow(var2, var3, var4, class_1192.field_6104.method_2490());
            }
         }

         var62 = 1;
      }

      return (boolean)var62;
   }

   // $FF: renamed from: m (aji, int, int, int) boolean
   public boolean method_7249(aji var1, int var2, int var3, int var4) {
      class_455 var6 = (class_455)var1;
      bmh var7 = bmh.instance;
      var7.setVisible5(var6.method_2444(this.field_6952, var2, var3, var4));
      int var8 = CustomColorizer.getStemColorMultiplier(var6, this.field_6952, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      String[] var5 = class_752.method_4253();
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      int var10000 = blt.field_7072;
      if(var5 != null) {
         if(blt.field_7072) {
            float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
            float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
            float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         var7.setVisible6(var9, var10, var11);
         var6.method_2486(this.field_6952, var2, var3, var4);
         var10000 = var6.method_2789(this.field_6952, var2, var3, var4);
      }

      int var15 = var10000;
      if(var5 != null) {
         if(var15 < 0) {
            this.method_7253(var6, this.field_6952.method_33(var2, var3, var4), this.field_6963, (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
            if(var5 != null) {
               return true;
            }
         }

         this.method_7253(var6, this.field_6952.method_33(var2, var3, var4), 0.5D, (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      }

      this.method_7255(var6, this.field_6952.method_33(var2, var3, var4), var15, this.field_6963, (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      return true;
   }

   // $FF: renamed from: n (aji, int, int, int) boolean
   public boolean method_7250(aji var1, int var2, int var3, int var4) {
      bmh var5 = bmh.instance;
      var5.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      var5.setVisible6(1.0F, 1.0F, 1.0F);
      this.method_7256(var1, this.field_6952.method_33(var2, var3, var4), (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      return true;
   }

   // $FF: renamed from: a (aji, double, double, double, double, double, int) void
   public void method_7251(aji var1, double var2, double var4, double var6, double var8, double var10, int var12) {
      bmh var14;
      class_73 var15;
      label13: {
         var14 = bmh.instance;
         String[] var10000 = class_752.method_4253();
         var15 = this.drawTextBox9(var1, 0, var12);
         String[] var13 = var10000;
         blm var52 = this;
         if(var13 != null) {
            if(!this.method_7206()) {
               break label13;
            }

            var52 = this;
         }

         var15 = var52.field_6953;
      }

      double var16 = (double)var15.method_368();
      double var18 = (double)var15.method_371();
      double var20 = (double)var15.method_369();
      double var22 = (double)var15.method_372();
      double var24 = (double)var15.method_370(7.0D);
      double var26 = (double)var15.method_373(6.0D);
      double var28 = (double)var15.method_370(9.0D);
      double var30 = (double)var15.method_373(8.0D);
      double var32 = (double)var15.method_370(7.0D);
      double var34 = (double)var15.method_373(13.0D);
      double var36 = (double)var15.method_370(9.0D);
      double var38 = (double)var15.method_373(15.0D);
      var2 += 0.5D;
      var6 += 0.5D;
      double var40 = var2 - 0.5D;
      double var42 = var2 + 0.5D;
      double var44 = var6 - 0.5D;
      double var46 = var6 + 0.5D;
      double var48 = 0.0625D;
      double var50 = 0.625D;
      var14.addVertexWithUV(var2 + var8 * (1.0D - var50) - var48, var4 + var50, var6 + var10 * (1.0D - var50) - var48, var24, var26);
      var14.addVertexWithUV(var2 + var8 * (1.0D - var50) - var48, var4 + var50, var6 + var10 * (1.0D - var50) + var48, var24, var30);
      var14.addVertexWithUV(var2 + var8 * (1.0D - var50) + var48, var4 + var50, var6 + var10 * (1.0D - var50) + var48, var28, var30);
      var14.addVertexWithUV(var2 + var8 * (1.0D - var50) + var48, var4 + var50, var6 + var10 * (1.0D - var50) - var48, var28, var26);
      var14.addVertexWithUV(var2 + var48 + var8, var4, var6 - var48 + var10, var36, var34);
      var14.addVertexWithUV(var2 + var48 + var8, var4, var6 + var48 + var10, var36, var38);
      var14.addVertexWithUV(var2 - var48 + var8, var4, var6 + var48 + var10, var32, var38);
      var14.addVertexWithUV(var2 - var48 + var8, var4, var6 - var48 + var10, var32, var34);
      var14.addVertexWithUV(var2 - var48, var4 + 1.0D, var44, var16, var18);
      var14.addVertexWithUV(var2 - var48 + var8, var4 + 0.0D, var44 + var10, var16, var22);
      var14.addVertexWithUV(var2 - var48 + var8, var4 + 0.0D, var46 + var10, var20, var22);
      var14.addVertexWithUV(var2 - var48, var4 + 1.0D, var46, var20, var18);
      var14.addVertexWithUV(var2 + var48, var4 + 1.0D, var46, var16, var18);
      var14.addVertexWithUV(var2 + var8 + var48, var4 + 0.0D, var46 + var10, var16, var22);
      var14.addVertexWithUV(var2 + var8 + var48, var4 + 0.0D, var44 + var10, var20, var22);
      var14.addVertexWithUV(var2 + var48, var4 + 1.0D, var44, var20, var18);
      var14.addVertexWithUV(var40, var4 + 1.0D, var6 + var48, var16, var18);
      var14.addVertexWithUV(var40 + var8, var4 + 0.0D, var6 + var48 + var10, var16, var22);
      var14.addVertexWithUV(var42 + var8, var4 + 0.0D, var6 + var48 + var10, var20, var22);
      var14.addVertexWithUV(var42, var4 + 1.0D, var6 + var48, var20, var18);
      var14.addVertexWithUV(var42, var4 + 1.0D, var6 - var48, var16, var18);
      var14.addVertexWithUV(var42 + var8, var4 + 0.0D, var6 - var48 + var10, var16, var22);
      var14.addVertexWithUV(var40 + var8, var4 + 0.0D, var6 - var48 + var10, var20, var22);
      var14.addVertexWithUV(var40, var4 + 1.0D, var6 - var48, var20, var18);
   }

   // $FF: renamed from: a (vL, double, double, double, float) void
   public void method_7252(class_73 var1, double var2, double var4, double var6, float var8) {
      bmh var10;
      label13: {
         String[] var10000 = class_752.method_4253();
         var10 = bmh.instance;
         String[] var9 = var10000;
         blm var29 = this;
         if(var9 != null) {
            if(!this.method_7206()) {
               break label13;
            }

            var29 = this;
         }

         var1 = var29.field_6953;
      }

      double var11 = (double)var1.method_368();
      double var13 = (double)var1.method_371();
      double var15 = (double)var1.method_369();
      double var17 = (double)var1.method_372();
      double var19 = 0.45D * (double)var8;
      double var21 = var2 + 0.5D - var19;
      double var23 = var2 + 0.5D + var19;
      double var25 = var6 + 0.5D - var19;
      double var27 = var6 + 0.5D + var19;
      var10.addVertexWithUV(var21, var4 + (double)var8, var25, var11, var13);
      var10.addVertexWithUV(var21, var4 + 0.0D, var25, var11, var17);
      var10.addVertexWithUV(var23, var4 + 0.0D, var27, var15, var17);
      var10.addVertexWithUV(var23, var4 + (double)var8, var27, var15, var13);
      var10.addVertexWithUV(var23, var4 + (double)var8, var27, var11, var13);
      var10.addVertexWithUV(var23, var4 + 0.0D, var27, var11, var17);
      var10.addVertexWithUV(var21, var4 + 0.0D, var25, var15, var17);
      var10.addVertexWithUV(var21, var4 + (double)var8, var25, var15, var13);
      var10.addVertexWithUV(var21, var4 + (double)var8, var27, var11, var13);
      var10.addVertexWithUV(var21, var4 + 0.0D, var27, var11, var17);
      var10.addVertexWithUV(var23, var4 + 0.0D, var25, var15, var17);
      var10.addVertexWithUV(var23, var4 + (double)var8, var25, var15, var13);
      var10.addVertexWithUV(var23, var4 + (double)var8, var25, var11, var13);
      var10.addVertexWithUV(var23, var4 + 0.0D, var25, var11, var17);
      var10.addVertexWithUV(var21, var4 + 0.0D, var27, var15, var17);
      var10.addVertexWithUV(var21, var4 + (double)var8, var27, var15, var13);
   }

   // $FF: renamed from: a (aji, int, double, double, double, double) void
   public void method_7253(aji var1, int var2, double var3, double var5, double var7, double var9) {
      bmh var12;
      class_73 var13;
      label13: {
         String[] var10000 = class_752.method_4253();
         var12 = bmh.instance;
         String[] var11 = var10000;
         var13 = this.drawTextBox9(var1, 0, var2);
         blm var30 = this;
         if(var11 != null) {
            if(!this.method_7206()) {
               break label13;
            }

            var30 = this;
         }

         var13 = var30.field_6953;
      }

      double var14 = (double)var13.method_368();
      double var16 = (double)var13.method_371();
      double var18 = (double)var13.method_369();
      double var20 = (double)var13.method_373(var3 * 16.0D);
      double var22 = var5 + 0.5D - 0.44999998807907104D;
      double var24 = var5 + 0.5D + 0.44999998807907104D;
      double var26 = var9 + 0.5D - 0.44999998807907104D;
      double var28 = var9 + 0.5D + 0.44999998807907104D;
      var12.addVertexWithUV(var22, var7 + var3, var26, var14, var16);
      var12.addVertexWithUV(var22, var7 + 0.0D, var26, var14, var20);
      var12.addVertexWithUV(var24, var7 + 0.0D, var28, var18, var20);
      var12.addVertexWithUV(var24, var7 + var3, var28, var18, var16);
      var12.addVertexWithUV(var24, var7 + var3, var28, var18, var16);
      var12.addVertexWithUV(var24, var7 + 0.0D, var28, var18, var20);
      var12.addVertexWithUV(var22, var7 + 0.0D, var26, var14, var20);
      var12.addVertexWithUV(var22, var7 + var3, var26, var14, var16);
      var12.addVertexWithUV(var22, var7 + var3, var28, var14, var16);
      var12.addVertexWithUV(var22, var7 + 0.0D, var28, var14, var20);
      var12.addVertexWithUV(var24, var7 + 0.0D, var26, var18, var20);
      var12.addVertexWithUV(var24, var7 + var3, var26, var18, var16);
      var12.addVertexWithUV(var24, var7 + var3, var26, var18, var16);
      var12.addVertexWithUV(var24, var7 + 0.0D, var26, var18, var20);
      var12.addVertexWithUV(var22, var7 + 0.0D, var28, var14, var20);
      var12.addVertexWithUV(var22, var7 + var3, var28, var14, var16);
   }

   // $FF: renamed from: o (aji, int, int, int) boolean
   public boolean method_7254(aji var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      bmh var6 = bmh.instance;
      class_73 var7 = this.method_7290(var1, 1);
      String[] var5 = var10000;
      boolean var25 = this.method_7206();
      if(var5 != null) {
         if(var25) {
            var7 = this.field_6953;
         }

         var25 = Config.isConnectedTextures();
      }

      if(var25) {
         label21: {
            class_73 var26 = this.field_6953;
            if(var5 != null) {
               if(this.field_6953 != null) {
                  break label21;
               }

               var26 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, 1, var7);
            }

            var7 = var26;
         }
      }

      float var8 = 0.015625F;
      double var9 = (double)var7.method_368();
      double var11 = (double)var7.method_371();
      double var13 = (double)var7.method_369();
      double var15 = (double)var7.method_372();
      long var17 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
      var17 = var17 * var17 * 42317861L + var17 * 11L;
      int var19 = (int)(var17 >> 16 & 3L);
      var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      float var20 = (float)var2 + 0.5F;
      float var21 = (float)var4 + 0.5F;
      float var22 = (float)(var19 & 1) * 0.5F * (float)(1 - var19 / 2 % 2 * 2);
      float var23 = (float)(var19 + 1 & 1) * 0.5F * (float)(1 - (var19 + 1) / 2 % 2 * 2);
      int var24 = CustomColorizer.getLilypadColor();
      var6.method_7463(var24);
      var6.addVertexWithUV((double)(var20 + var22 - var23), (double)((float)var3 + var8), (double)(var21 + var22 + var23), var9, var11);
      var6.addVertexWithUV((double)(var20 + var22 + var23), (double)((float)var3 + var8), (double)(var21 - var22 + var23), var13, var11);
      var6.addVertexWithUV((double)(var20 - var22 + var23), (double)((float)var3 + var8), (double)(var21 - var22 - var23), var13, var15);
      var6.addVertexWithUV((double)(var20 - var22 - var23), (double)((float)var3 + var8), (double)(var21 + var22 - var23), var9, var15);
      var6.method_7463((var24 & 16711422) >> 1);
      var6.addVertexWithUV((double)(var20 - var22 - var23), (double)((float)var3 + var8), (double)(var21 + var22 - var23), var9, var15);
      var6.addVertexWithUV((double)(var20 - var22 + var23), (double)((float)var3 + var8), (double)(var21 - var22 - var23), var13, var15);
      var6.addVertexWithUV((double)(var20 + var22 + var23), (double)((float)var3 + var8), (double)(var21 - var22 + var23), var13, var11);
      var6.addVertexWithUV((double)(var20 + var22 - var23), (double)((float)var3 + var8), (double)(var21 + var22 + var23), var9, var11);
      return true;
   }

   // $FF: renamed from: a (eD, int, int, double, double, double, double) void
   public void method_7255(class_455 var1, int var2, int var3, double var4, double var6, double var8, double var10) {
      String[] var12;
      bmh var13;
      class_73 var14;
      label29: {
         var13 = bmh.instance;
         var12 = class_752.method_4253();
         var14 = var1.method_2790();
         blm var10000 = this;
         if(var12 != null) {
            if(!this.method_7206()) {
               break label29;
            }

            var10000 = this;
         }

         var14 = var10000.field_6953;
      }

      double var15 = (double)var14.method_368();
      double var17 = (double)var14.method_371();
      double var19 = (double)var14.method_369();
      double var21 = (double)var14.method_372();
      double var23 = var6 + 0.5D - 0.5D;
      double var25 = var6 + 0.5D + 0.5D;
      double var27 = var10 + 0.5D - 0.5D;
      double var29 = var10 + 0.5D + 0.5D;
      double var31 = var6 + 0.5D;
      double var33 = var10 + 0.5D;
      int var37 = (var3 + 1) / 2 % 2;
      byte var10001 = 1;
      if(var12 != null) {
         if(var37 == 1) {
            double var35 = var19;
            var19 = var15;
            var15 = var35;
         }

         var37 = var3;
         var10001 = 2;
      }

      if(var37 < var10001) {
         var13.addVertexWithUV(var23, var8 + var4, var33, var15, var17);
         var13.addVertexWithUV(var23, var8 + 0.0D, var33, var15, var21);
         var13.addVertexWithUV(var25, var8 + 0.0D, var33, var19, var21);
         var13.addVertexWithUV(var25, var8 + var4, var33, var19, var17);
         var13.addVertexWithUV(var25, var8 + var4, var33, var19, var17);
         var13.addVertexWithUV(var25, var8 + 0.0D, var33, var19, var21);
         var13.addVertexWithUV(var23, var8 + 0.0D, var33, var15, var21);
         var13.addVertexWithUV(var23, var8 + var4, var33, var15, var17);
         if(var12 != null) {
            return;
         }
      }

      var13.addVertexWithUV(var31, var8 + var4, var29, var15, var17);
      var13.addVertexWithUV(var31, var8 + 0.0D, var29, var15, var21);
      var13.addVertexWithUV(var31, var8 + 0.0D, var27, var19, var21);
      var13.addVertexWithUV(var31, var8 + var4, var27, var19, var17);
      var13.addVertexWithUV(var31, var8 + var4, var27, var19, var17);
      var13.addVertexWithUV(var31, var8 + 0.0D, var27, var19, var21);
      var13.addVertexWithUV(var31, var8 + 0.0D, var29, var15, var21);
      var13.addVertexWithUV(var31, var8 + var4, var29, var15, var17);
   }

   // $FF: renamed from: a (aji, int, double, double, double) void
   public void method_7256(aji var1, int var2, double var3, double var5, double var7) {
      bmh var10;
      class_73 var11;
      label13: {
         String[] var10000 = class_752.method_4253();
         var10 = bmh.instance;
         String[] var9 = var10000;
         var11 = this.drawTextBox9(var1, 0, var2);
         blm var28 = this;
         if(var9 != null) {
            if(!this.method_7206()) {
               break label13;
            }

            var28 = this;
         }

         var11 = var28.field_6953;
      }

      double var12 = (double)var11.method_368();
      double var14 = (double)var11.method_371();
      double var16 = (double)var11.method_369();
      double var18 = (double)var11.method_372();
      double var20 = var3 + 0.5D - 0.25D;
      double var22 = var3 + 0.5D + 0.25D;
      double var24 = var7 + 0.5D - 0.5D;
      double var26 = var7 + 0.5D + 0.5D;
      var10.addVertexWithUV(var20, var5 + 1.0D, var24, var12, var14);
      var10.addVertexWithUV(var20, var5 + 0.0D, var24, var12, var18);
      var10.addVertexWithUV(var20, var5 + 0.0D, var26, var16, var18);
      var10.addVertexWithUV(var20, var5 + 1.0D, var26, var16, var14);
      var10.addVertexWithUV(var20, var5 + 1.0D, var26, var12, var14);
      var10.addVertexWithUV(var20, var5 + 0.0D, var26, var12, var18);
      var10.addVertexWithUV(var20, var5 + 0.0D, var24, var16, var18);
      var10.addVertexWithUV(var20, var5 + 1.0D, var24, var16, var14);
      var10.addVertexWithUV(var22, var5 + 1.0D, var26, var12, var14);
      var10.addVertexWithUV(var22, var5 + 0.0D, var26, var12, var18);
      var10.addVertexWithUV(var22, var5 + 0.0D, var24, var16, var18);
      var10.addVertexWithUV(var22, var5 + 1.0D, var24, var16, var14);
      var10.addVertexWithUV(var22, var5 + 1.0D, var24, var12, var14);
      var10.addVertexWithUV(var22, var5 + 0.0D, var24, var12, var18);
      var10.addVertexWithUV(var22, var5 + 0.0D, var26, var16, var18);
      var10.addVertexWithUV(var22, var5 + 1.0D, var26, var16, var14);
      var20 = var3 + 0.5D - 0.5D;
      var22 = var3 + 0.5D + 0.5D;
      var24 = var7 + 0.5D - 0.25D;
      var26 = var7 + 0.5D + 0.25D;
      var10.addVertexWithUV(var20, var5 + 1.0D, var24, var12, var14);
      var10.addVertexWithUV(var20, var5 + 0.0D, var24, var12, var18);
      var10.addVertexWithUV(var22, var5 + 0.0D, var24, var16, var18);
      var10.addVertexWithUV(var22, var5 + 1.0D, var24, var16, var14);
      var10.addVertexWithUV(var22, var5 + 1.0D, var24, var12, var14);
      var10.addVertexWithUV(var22, var5 + 0.0D, var24, var12, var18);
      var10.addVertexWithUV(var20, var5 + 0.0D, var24, var16, var18);
      var10.addVertexWithUV(var20, var5 + 1.0D, var24, var16, var14);
      var10.addVertexWithUV(var22, var5 + 1.0D, var26, var12, var14);
      var10.addVertexWithUV(var22, var5 + 0.0D, var26, var12, var18);
      var10.addVertexWithUV(var20, var5 + 0.0D, var26, var16, var18);
      var10.addVertexWithUV(var20, var5 + 1.0D, var26, var16, var14);
      var10.addVertexWithUV(var20, var5 + 1.0D, var26, var12, var14);
      var10.addVertexWithUV(var20, var5 + 0.0D, var26, var12, var18);
      var10.addVertexWithUV(var22, var5 + 0.0D, var26, var16, var18);
      var10.addVertexWithUV(var22, var5 + 1.0D, var26, var16, var14);
   }

   // $FF: renamed from: p (aji, int, int, int) boolean
   public boolean method_7257(aji var1, int var2, int var3, int var4) {
      bmh var6 = bmh.instance;
      int var7 = CustomColorizer.getFluidColor(var1, this.field_6952, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      String[] var10000 = class_752.method_4253();
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      String[] var5 = var10000;
      byte var11 = var1.method_2445(this.field_6952, var2, var3 + 1, var4, 1);
      byte var12 = var1.method_2445(this.field_6952, var2, var3 - 1, var4, 0);
      boolean[] var13 = new boolean[]{var1.method_2445(this.field_6952, var2, var3, var4 - 1, 2), var1.method_2445(this.field_6952, var2, var3, var4 + 1, 3), var1.method_2445(this.field_6952, var2 - 1, var3, var4, 4), var1.method_2445(this.field_6952, var2 + 1, var3, var4, 5)};
      byte var58 = var11;
      if(var5 != null) {
         label185: {
            if(var11 == 0) {
               var58 = var12;
               if(var5 == null) {
                  break label185;
               }

               if(var12 == 0) {
                  var58 = var13[0];
                  if(var5 == null) {
                     break label185;
                  }

                  if(var58 == 0) {
                     var58 = var13[1];
                     if(var5 == null) {
                        break label185;
                     }

                     if(var58 == 0) {
                        var58 = var13[2];
                        if(var5 == null) {
                           break label185;
                        }

                        if(var58 == 0) {
                           var58 = var13[3];
                           if(var5 == null) {
                              break label185;
                           }

                           if(var58 == 0) {
                              return false;
                           }
                        }
                     }
                  }
               }
            }

            var58 = 0;
         }
      }

      byte var14;
      float var15;
      float var16;
      float var17;
      float var18;
      double var19;
      double var21;
      int var24;
      double var25;
      double var27;
      double var29;
      double var31;
      double var33;
      float var35;
      float var36;
      float var37;
      double var38;
      double var40;
      double var42;
      double var44;
      double var46;
      double var48;
      int var60;
      label167: {
         label189: {
            var14 = var58;
            var15 = 0.5F;
            var16 = 1.0F;
            var17 = 0.8F;
            var18 = 0.6F;
            var19 = 0.0D;
            var21 = 1.0D;
            awt var23 = var1.method_2424();
            var24 = this.field_6952.method_33(var2, var3, var4);
            var25 = (double)this.method_7258(var2, var3, var4, var23);
            var27 = (double)this.method_7258(var2, var3, var4 + 1, var23);
            var29 = (double)this.method_7258(var2 + 1, var3, var4 + 1, var23);
            var31 = (double)this.method_7258(var2 + 1, var3, var4, var23);
            var33 = 0.0010000000474974513D;
            var58 = this.field_6956;
            if(var5 != null) {
               if(!this.field_6956) {
                  var58 = var11;
                  if(var5 == null) {
                     break label167;
                  }

                  if(var11 == 0) {
                     break label189;
                  }
               }

               var58 = 1;
            }

            double var52;
            double var54;
            label156: {
               float var10001;
               class_73 var50;
               float var51;
               float var61;
               label190: {
                  var14 = var58;
                  var50 = this.drawTextBox9(var1, 1, var24);
                  var51 = (float)class_366.method_2556(this.field_6952, var2, var3, var4, var23);
                  float var67;
                  var60 = (var67 = var51 - -999.0F) == 0.0F?0:(var67 < 0.0F?-1:1);
                  if(var5 != null) {
                     if(var60 > 0) {
                        var50 = this.drawTextBox9(var1, 2, var24);
                     }

                     var25 -= var33;
                     var27 -= var33;
                     var29 -= var33;
                     var31 -= var33;
                     var61 = var51;
                     var10001 = -999.0F;
                     if(var5 == null) {
                        break label190;
                     }

                     float var68;
                     var60 = (var68 = var51 - -999.0F) == 0.0F?0:(var68 < 0.0F?-1:1);
                  }

                  if(var60 < 0) {
                     var52 = (double)var50.method_370(0.0D);
                     var44 = (double)var50.method_373(0.0D);
                     var38 = var52;
                     var46 = (double)var50.method_373(16.0D);
                     var40 = (double)var50.method_370(16.0D);
                     var48 = var46;
                     var42 = var40;
                     var54 = var44;
                     if(var5 != null) {
                        break label156;
                     }
                  }

                  var61 = class_1715.method_9555(var51);
                  var10001 = 0.25F;
               }

               var35 = var61 * var10001;
               var36 = class_1715.method_9556(var51) * 0.25F;
               var37 = 8.0F;
               var52 = (double)var50.method_370((double)(8.0F + (-var36 - var35) * 16.0F));
               var44 = (double)var50.method_373((double)(8.0F + (-var36 + var35) * 16.0F));
               var38 = (double)var50.method_370((double)(8.0F + (-var36 + var35) * 16.0F));
               var46 = (double)var50.method_373((double)(8.0F + (var36 + var35) * 16.0F));
               var40 = (double)var50.method_370((double)(8.0F + (var36 + var35) * 16.0F));
               var48 = (double)var50.method_373((double)(8.0F + (var36 - var35) * 16.0F));
               var42 = (double)var50.method_370((double)(8.0F + (var36 - var35) * 16.0F));
               var54 = (double)var50.method_373((double)(8.0F + (-var36 - var35) * 16.0F));
            }

            var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
            var6.setVisible6(var16 * var8, var16 * var9, var16 * var10);
            double var56 = 3.90625E-5D;
            var6.addVertexWithUV((double)(var2 + 0), (double)var3 + var25, (double)(var4 + 0), var52 + var56, var44 + var56);
            var6.addVertexWithUV((double)(var2 + 0), (double)var3 + var27, (double)(var4 + 1), var38 + var56, var46 - var56);
            var6.addVertexWithUV((double)(var2 + 1), (double)var3 + var29, (double)(var4 + 1), var40 - var56, var48 - var56);
            var6.addVertexWithUV((double)(var2 + 1), (double)var3 + var31, (double)(var4 + 0), var42 - var56, var54 + var56);
            var6.addVertexWithUV((double)(var2 + 0), (double)var3 + var25, (double)(var4 + 0), var52 + var56, var44 + var56);
            var6.addVertexWithUV((double)(var2 + 1), (double)var3 + var31, (double)(var4 + 0), var42 - var56, var54 + var56);
            var6.addVertexWithUV((double)(var2 + 1), (double)var3 + var29, (double)(var4 + 1), var40 - var56, var48 - var56);
            var6.addVertexWithUV((double)(var2 + 0), (double)var3 + var27, (double)(var4 + 1), var38 + var56, var46 - var56);
         }

         var58 = this.field_6956;
      }

      label144: {
         label143: {
            if(var5 != null) {
               if(var58 == 0) {
                  var58 = var12;
                  if(var5 == null) {
                     break label144;
                  }

                  if(var12 == 0) {
                     break label143;
                  }
               }

               var6.setVisible5(var1.method_2444(this.field_6952, var2, var3 - 1, var4));
               var6.setVisible6(var15 * var8, var15 * var9, var15 * var10);
               this.drawTextBox0(var1, (double)var2, (double)var3 + var33, (double)var4, this.method_7290(var1, 0));
               var58 = 1;
            }

            var14 = var58;
         }

         var58 = 0;
      }

      int var62 = var58;

      while(true) {
         if(var62 < 4) {
            int var63 = var2;
            int var64 = var4;
            var60 = var62;
            if(var5 == null) {
               break;
            }

            if(var5 != null) {
               if(var62 == 0) {
                  var64 = var4 - 1;
               }

               var60 = var62;
            }

            byte var59 = 1;
            if(var5 != null) {
               if(var60 == 1) {
                  ++var64;
               }

               var60 = var62;
               var59 = 2;
            }

            if(var5 != null) {
               if(var60 == var59) {
                  var63 = var2 - 1;
               }

               var60 = var62;
               var59 = 3;
            }

            if(var60 == var59) {
               ++var63;
            }

            label193: {
               class_73 var53 = this.drawTextBox9(var1, var62 + 2, var24);
               var60 = this.field_6956;
               if(var5 != null) {
                  label119: {
                     if(!this.field_6956) {
                        var60 = var13[var62];
                        if(var5 == null) {
                           break label119;
                        }

                        if(var60 == 0) {
                           break label193;
                        }
                     }

                     var60 = var62;
                  }
               }

               label194: {
                  if(var5 != null) {
                     if(var60 == 0) {
                        var38 = var25;
                        var40 = var31;
                        var42 = (double)var2;
                        var46 = (double)(var2 + 1);
                        var44 = (double)var4 + var33;
                        var48 = (double)var4 + var33;
                        if(var5 != null) {
                           break label194;
                        }
                     }

                     var60 = var62;
                  }

                  var59 = 1;
                  if(var5 != null) {
                     if(var60 == 1) {
                        var38 = var29;
                        var40 = var27;
                        var42 = (double)(var2 + 1);
                        var46 = (double)var2;
                        var44 = (double)(var4 + 1) - var33;
                        var48 = (double)(var4 + 1) - var33;
                        if(var5 != null) {
                           break label194;
                        }
                     }

                     var60 = var62;
                     var59 = 2;
                  }

                  if(var60 == var59) {
                     var38 = var27;
                     var40 = var25;
                     var42 = (double)var2 + var33;
                     var46 = (double)var2 + var33;
                     var44 = (double)(var4 + 1);
                     var48 = (double)var4;
                     if(var5 != null) {
                        break label194;
                     }
                  }

                  var38 = var31;
                  var40 = var29;
                  var42 = (double)(var2 + 1) - var33;
                  var46 = (double)(var2 + 1) - var33;
                  var44 = (double)var4;
                  var48 = (double)(var4 + 1);
               }

               var14 = 1;
               float var65 = var53.method_370(0.0D);
               var35 = var53.method_370(8.0D);
               var36 = var53.method_373((1.0D - var38) * 16.0D * 0.5D);
               var37 = var53.method_373((1.0D - var40) * 16.0D * 0.5D);
               float var55 = var53.method_373(8.0D);
               var6.setVisible5(var1.method_2444(this.field_6952, var63, var3, var64));
               float var66 = 1.0F;
               var66 *= var62 < 2?var17:var18;
               var6.setVisible6(var16 * var66 * var8, var16 * var66 * var9, var16 * var66 * var10);
               var6.addVertexWithUV(var42, (double)var3 + var38, var44, (double)var65, (double)var36);
               var6.addVertexWithUV(var46, (double)var3 + var40, var48, (double)var35, (double)var37);
               var6.addVertexWithUV(var46, (double)(var3 + 0), var48, (double)var35, (double)var55);
               var6.addVertexWithUV(var42, (double)(var3 + 0), var44, (double)var65, (double)var55);
               var6.addVertexWithUV(var42, (double)(var3 + 0), var44, (double)var65, (double)var55);
               var6.addVertexWithUV(var46, (double)(var3 + 0), var48, (double)var35, (double)var55);
               var6.addVertexWithUV(var46, (double)var3 + var40, var48, (double)var35, (double)var37);
               var6.addVertexWithUV(var42, (double)var3 + var38, var44, (double)var65, (double)var36);
            }

            ++var62;
            if(var5 != null) {
               continue;
            }
         }

         this.field_6962 = var19;
         this.field_6963 = var21;
         var60 = var14;
         break;
      }

      return (boolean)var60;
   }

   // $FF: renamed from: a (int, int, int, awt) float
   public float method_7258(int var1, int var2, int var3, awt var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      float var7 = 0.0F;
      String[] var5 = var10000;
      int var8 = 0;

      while(var8 < 4) {
         int var9 = var1 - (var8 & 1);
         int var10 = var3 - (var8 >> 1 & 1);
         awt var13 = this.field_6952.getBlock(var9, var2 + 1, var10).method_2424();
         if(var5 != null) {
            if(var13 == var4) {
               return 1.0F;
            }

            var13 = this.field_6952.getBlock(var9, var2, var10).method_2424();
         }

         label43: {
            awt var11 = var13;
            var13 = var11;
            if(var5 != null) {
               if(var11 == var4) {
                  int var12;
                  label36: {
                     var12 = this.field_6952.method_33(var9, var2, var10);
                     if(var5 != null) {
                        if(var12 < 8 && var12 != 0) {
                           break label36;
                        }

                        var7 += class_366.method_2552(var12) * 10.0F;
                     }

                     var6 += 10;
                  }

                  var7 += class_366.method_2552(var12);
                  ++var6;
                  if(var5 != null) {
                     break label43;
                  }
               }

               var13 = var11;
            }

            if(!var13.method_5063()) {
               ++var7;
               ++var6;
            }
         }

         ++var8;
         if(var5 == null) {
            break;
         }
      }

      return 1.0F - var7 / (float)var6;
   }

   // $FF: renamed from: a (aji, ahb, int, int, int, int) void
   public void method_7259(aji var1, ahb var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.5F;
      float var8 = 1.0F;
      float var9 = 0.8F;
      float var10 = 0.6F;
      bmh var11 = bmh.instance;
      var11.setVisible2();
      var11.setVisible5(var1.method_2444(var2, var3, var4, var5));
      var11.setVisible6(var7, var7, var7);
      this.drawTextBox0(var1, -0.5D, -0.5D, -0.5D, this.drawTextBox9(var1, 0, var6));
      var11.setVisible6(var8, var8, var8);
      this.drawTextBox1(var1, -0.5D, -0.5D, -0.5D, this.drawTextBox9(var1, 1, var6));
      var11.setVisible6(var9, var9, var9);
      this.drawTextBox2(var1, -0.5D, -0.5D, -0.5D, this.drawTextBox9(var1, 2, var6));
      var11.setVisible6(var9, var9, var9);
      this.drawTextBox3(var1, -0.5D, -0.5D, -0.5D, this.drawTextBox9(var1, 3, var6));
      var11.setVisible6(var10, var10, var10);
      this.drawTextBox4(var1, -0.5D, -0.5D, -0.5D, this.drawTextBox9(var1, 4, var6));
      var11.setVisible6(var10, var10, var10);
      this.drawTextBox5(var1, -0.5D, -0.5D, -0.5D, this.drawTextBox9(var1, 5, var6));
      var11.getVisible8();
   }

   // $FF: renamed from: q (aji, int, int, int) boolean
   public boolean method_7260(aji var1, int var2, int var3, int var4) {
      int var6 = CustomColorizer.getColorMultiplier(var1, this.field_6952, var2, var3, var4);
      String[] var10000 = class_752.method_4253();
      float var7 = (float)(var6 >> 16 & 255) / 255.0F;
      float var8 = (float)(var6 >> 8 & 255) / 255.0F;
      String[] var5 = var10000;
      float var9 = (float)(var6 & 255) / 255.0F;
      int var13 = blt.field_7072;
      if(var5 != null) {
         if(blt.field_7072) {
            float var10 = (var7 * 30.0F + var8 * 59.0F + var9 * 11.0F) / 100.0F;
            float var11 = (var7 * 30.0F + var8 * 70.0F) / 100.0F;
            float var12 = (var7 * 30.0F + var9 * 70.0F) / 100.0F;
            var7 = var10;
            var8 = var11;
            var9 = var12;
         }

         var13 = bao.method_5270();
      }

      label48: {
         if(var5 != null) {
            if(var13 == 0) {
               break label48;
            }

            var13 = var1.method_2422();
         }

         if(var5 != null) {
            if(var13 != 0) {
               break label48;
            }

            var13 = this.field_6967;
         }

         if(var5 != null) {
            var13 = var13 != 0?this.method_7264(var1, var2, var3, var4, var7, var8, var9):this.method_7263(var1, var2, var3, var4, var7, var8, var9);
         }

         return (boolean)var13;
      }

      var13 = this.method_7267(var1, var2, var3, var4, var7, var8, var9);
      return (boolean)var13;
   }

   // $FF: renamed from: r (aji, int, int, int) boolean
   public boolean method_7261(aji var1, int var2, int var3, int var4) {
      int var9;
      label23: {
         label22: {
            String[] var10000 = class_752.method_4253();
            int var6 = this.field_6952.method_33(var2, var3, var4);
            String[] var5 = var10000;
            int var7 = var6 & 12;
            var9 = var7;
            byte var10001 = 4;
            if(var5 != null) {
               if(var7 == 4) {
                  this.field_6969 = 2;
                  this.field_6970 = 1;
                  this.field_6973 = 1;
                  this.field_6974 = 2;
                  if(var5 != null) {
                     break label22;
                  }
               }

               var9 = var7;
               if(var5 == null) {
                  break label23;
               }

               var10001 = 8;
            }

            if(var9 == var10001) {
               this.field_6971 = 2;
               this.field_6972 = 1;
               this.field_6973 = 3;
               this.field_6974 = 3;
            }
         }

         var9 = this.method_7260(var1, var2, var3, var4);
      }

      int var8 = var9;
      this.field_6971 = 0;
      this.field_6969 = 0;
      this.field_6970 = 0;
      this.field_6972 = 0;
      this.field_6973 = 0;
      this.field_6974 = 0;
      return (boolean)var8;
   }

   // $FF: renamed from: s (aji, int, int, int) boolean
   public boolean method_7262(aji var1, int var2, int var3, int var4) {
      int var8;
      label23: {
         label22: {
            String[] var10000 = class_752.method_4253();
            int var6 = this.field_6952.method_33(var2, var3, var4);
            String[] var5 = var10000;
            var8 = var6;
            byte var10001 = 3;
            if(var5 != null) {
               if(var6 == 3) {
                  this.field_6969 = 2;
                  this.field_6970 = 1;
                  this.field_6973 = 1;
                  this.field_6974 = 2;
                  if(var5 != null) {
                     break label22;
                  }
               }

               var8 = var6;
               if(var5 == null) {
                  break label23;
               }

               var10001 = 4;
            }

            if(var8 == var10001) {
               this.field_6971 = 2;
               this.field_6972 = 1;
               this.field_6973 = 3;
               this.field_6974 = 3;
            }
         }

         var8 = this.method_7260(var1, var2, var3, var4);
      }

      int var7 = var8;
      this.field_6971 = 0;
      this.field_6969 = 0;
      this.field_6970 = 0;
      this.field_6972 = 0;
      this.field_6973 = 0;
      this.field_6974 = 0;
      return (boolean)var7;
   }

   // $FF: renamed from: a (aji, int, int, int, float, float, float) boolean
   public boolean method_7263(aji var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      String[] var8;
      boolean var9;
      boolean var27;
      label985: {
         label988: {
            String[] var10000 = class_752.method_4253();
            this.field_6975 = true;
            var8 = var10000;
            var9 = bmh.instance.defaultTexture;
            var27 = Config.isBetterGrass();
            if(var8 != null) {
               if(!var27) {
                  break label988;
               }

               var27 = var9;
            }

            if(var8 == null) {
               break label985;
            }

            if(var27) {
               var27 = true;
               break label985;
            }
         }

         var27 = false;
      }

      boolean var10;
      boolean var11;
      boolean var12;
      float var13;
      float var14;
      float var15;
      float var16;
      boolean var17;
      int var18;
      int var28;
      label973: {
         label989: {
            label971: {
               var10 = var27;
               var11 = var1 == class_1192.field_6047;
               var12 = false;
               var13 = 0.0F;
               var14 = 0.0F;
               var15 = 0.0F;
               var16 = 0.0F;
               var17 = true;
               var18 = -1;
               bmh var19 = bmh.instance;
               var19.setVisible5(983055);
               if(var8 != null) {
                  if(var1 != class_1192.field_6027) {
                     break label971;
                  }

                  var17 = false;
               }

               if(var8 != null) {
                  break label989;
               }
            }

            var28 = this.method_7206();
            if(var8 == null) {
               break label973;
            }

            if(var28 != 0) {
               var17 = false;
            }
         }

         var28 = this.field_6956;
      }

      int var20;
      byte var21;
      byte var22;
      byte var23;
      int var24;
      float var25;
      byte var29;
      blm var30;
      label960: {
         label990: {
            if(var8 != null) {
               if(var28 == 0) {
                  var28 = var1.method_2445(this.field_6952, var2, var3 - 1, var4, 0);
                  if(var8 == null) {
                     break label960;
                  }

                  if(var28 == 0) {
                     break label990;
                  }
               }

               double var31;
               var28 = (var31 = this.field_6962 - 0.0D) == 0.0D?0:(var31 < 0.0D?-1:1);
            }

            if(var8 != null) {
               if(var28 <= 0) {
                  --var3;
               }

               this.field_6997 = var1.method_2444(this.field_6952, var2 - 1, var3, var4);
               this.field_6999 = var1.method_2444(this.field_6952, var2, var3, var4 - 1);
               this.field_7000 = var1.method_2444(this.field_6952, var2, var3, var4 + 1);
               this.field_7002 = var1.method_2444(this.field_6952, var2 + 1, var3, var4);
               this.field_6977 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4);
               this.field_6979 = this.getAmbientOcclusionLightValue(var2, var3, var4 - 1);
               this.field_6980 = this.getAmbientOcclusionLightValue(var2, var3, var4 + 1);
               this.field_6982 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4);
               var28 = this.field_6952.getBlock(var2 + 1, var3 - 1, var4).method_2421();
            }

            label948: {
               var20 = var28;
               var21 = this.field_6952.getBlock(var2 - 1, var3 - 1, var4).method_2421();
               var22 = this.field_6952.getBlock(var2, var3 - 1, var4 + 1).method_2421();
               var23 = this.field_6952.getBlock(var2, var3 - 1, var4 - 1).method_2421();
               if(var8 != null) {
                  if(var23 == 0 && var21 == 0) {
                     this.field_6976 = this.field_6977;
                     this.field_6996 = this.field_6997;
                     if(var8 != null) {
                        break label948;
                     }
                  }

                  this.field_6976 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4 - 1);
               }

               this.field_6996 = var1.method_2444(this.field_6952, var2 - 1, var3, var4 - 1);
            }

            label940: {
               label939: {
                  var29 = var22;
                  if(var8 != null) {
                     if(var22 != 0) {
                        break label939;
                     }

                     var29 = var21;
                  }

                  if(var29 == 0) {
                     this.field_6978 = this.field_6977;
                     this.field_6998 = this.field_6997;
                     if(var8 != null) {
                        break label940;
                     }
                  }
               }

               this.field_6978 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4 + 1);
               this.field_6998 = var1.method_2444(this.field_6952, var2 - 1, var3, var4 + 1);
            }

            label930: {
               label929: {
                  var28 = var23;
                  if(var8 != null) {
                     if(var23 != 0) {
                        break label929;
                     }

                     var28 = var20;
                  }

                  if(var28 == 0) {
                     this.field_6981 = this.field_6982;
                     this.field_7001 = this.field_7002;
                     if(var8 != null) {
                        break label930;
                     }
                  }
               }

               this.field_6981 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4 - 1);
               this.field_7001 = var1.method_2444(this.field_6952, var2 + 1, var3, var4 - 1);
            }

            label920: {
               label919: {
                  var28 = var22;
                  if(var8 != null) {
                     if(var22 != 0) {
                        break label919;
                     }

                     var28 = var20;
                  }

                  if(var28 == 0) {
                     this.field_6983 = this.field_6982;
                     this.field_7003 = this.field_7002;
                     if(var8 != null) {
                        break label920;
                     }
                  }
               }

               this.field_6983 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4 + 1);
               this.field_7003 = var1.method_2444(this.field_6952, var2 + 1, var3, var4 + 1);
            }

            double var32;
            var28 = (var32 = this.field_6962 - 0.0D) == 0.0D?0:(var32 < 0.0D?-1:1);
            if(var8 != null) {
               if(var28 <= 0) {
                  ++var3;
               }

               var28 = var18;
            }

            if(var8 != null) {
               if(var28 < 0) {
                  var18 = var1.method_2444(this.field_6952, var2, var3, var4);
               }

               var28 = var18;
            }

            label907: {
               label906: {
                  var24 = var28;
                  double var33;
                  var28 = (var33 = this.field_6962 - 0.0D) == 0.0D?0:(var33 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var28 > 0) {
                        var30 = this;
                        if(var8 == null) {
                           break label907;
                        }

                        if(this.field_6952.getBlock(var2, var3 - 1, var4).method_2453()) {
                           break label906;
                        }
                     }

                     var28 = var1.method_2444(this.field_6952, var2, var3 - 1, var4);
                  }

                  var24 = var28;
               }

               var30 = this;
            }

            var25 = var30.getAmbientOcclusionLightValue(var2, var3 - 1, var4);
            var13 = (this.field_6978 + this.field_6977 + this.field_6980 + var25) / 4.0F;
            var16 = (this.field_6980 + var25 + this.field_6983 + this.field_6982) / 4.0F;
            var15 = (var25 + this.field_6979 + this.field_6982 + this.field_6981) / 4.0F;
            var14 = (this.field_6977 + this.field_6976 + var25 + this.field_6979) / 4.0F;
            this.field_7016 = this.method_7265(this.field_6998, this.field_6997, this.field_7000, var24);
            this.field_7019 = this.method_7265(this.field_7000, this.field_7003, this.field_7002, var24);
            this.field_7018 = this.method_7265(this.field_6999, this.field_7002, this.field_7001, var24);
            this.field_7017 = this.method_7265(this.field_6997, this.field_6996, this.field_6999, var24);
            var27 = var11;
            if(var8 != null) {
               if(var11) {
                  var14 = var25;
                  var15 = var25;
                  var16 = var25;
                  var13 = var25;
                  this.field_7016 = this.field_7019 = this.field_7018 = this.field_7017 = var24;
               }

               var27 = var17;
            }

            label895: {
               if(var27) {
                  this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5 * 0.5F;
                  this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6 * 0.5F;
                  this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7 * 0.5F;
                  if(var8 != null) {
                     break label895;
                  }
               }

               this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = 0.5F;
               this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = 0.5F;
               this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = 0.5F;
            }

            this.field_7020 *= var13;
            this.field_7024 *= var13;
            this.field_7028 *= var13;
            this.field_7021 *= var14;
            this.field_7025 *= var14;
            this.field_7029 *= var14;
            this.field_7022 *= var15;
            this.field_7026 *= var15;
            this.field_7030 *= var15;
            this.field_7023 *= var16;
            this.field_7027 *= var16;
            this.field_7031 *= var16;
            this.drawTextBox0(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 0));
            var12 = true;
         }

         var28 = this.field_6956;
      }

      label890: {
         label991: {
            if(var8 != null) {
               if(var28 == 0) {
                  var28 = var1.method_2445(this.field_6952, var2, var3 + 1, var4, 1);
                  if(var8 == null) {
                     break label890;
                  }

                  if(var28 == 0) {
                     break label991;
                  }
               }

               double var34;
               var28 = (var34 = this.field_6963 - 1.0D) == 0.0D?0:(var34 < 0.0D?-1:1);
            }

            if(var8 != null) {
               if(var28 >= 0) {
                  ++var3;
               }

               this.field_7005 = var1.method_2444(this.field_6952, var2 - 1, var3, var4);
               this.field_7009 = var1.method_2444(this.field_6952, var2 + 1, var3, var4);
               this.field_7007 = var1.method_2444(this.field_6952, var2, var3, var4 - 1);
               this.field_7010 = var1.method_2444(this.field_6952, var2, var3, var4 + 1);
               this.field_6985 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4);
               this.field_6989 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4);
               this.field_6987 = this.getAmbientOcclusionLightValue(var2, var3, var4 - 1);
               this.field_6990 = this.getAmbientOcclusionLightValue(var2, var3, var4 + 1);
               var28 = this.field_6952.getBlock(var2 + 1, var3 + 1, var4).method_2421();
            }

            label878: {
               var20 = var28;
               var21 = this.field_6952.getBlock(var2 - 1, var3 + 1, var4).method_2421();
               var22 = this.field_6952.getBlock(var2, var3 + 1, var4 + 1).method_2421();
               var23 = this.field_6952.getBlock(var2, var3 + 1, var4 - 1).method_2421();
               if(var8 != null) {
                  if(var23 == 0 && var21 == 0) {
                     this.field_6984 = this.field_6985;
                     this.field_7004 = this.field_7005;
                     if(var8 != null) {
                        break label878;
                     }
                  }

                  this.field_6984 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4 - 1);
               }

               this.field_7004 = var1.method_2444(this.field_6952, var2 - 1, var3, var4 - 1);
            }

            label870: {
               label869: {
                  var28 = var23;
                  if(var8 != null) {
                     if(var23 != 0) {
                        break label869;
                     }

                     var28 = var20;
                  }

                  if(var28 == 0) {
                     this.field_6988 = this.field_6989;
                     this.field_7008 = this.field_7009;
                     if(var8 != null) {
                        break label870;
                     }
                  }
               }

               this.field_6988 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4 - 1);
               this.field_7008 = var1.method_2444(this.field_6952, var2 + 1, var3, var4 - 1);
            }

            label860: {
               label859: {
                  var29 = var22;
                  if(var8 != null) {
                     if(var22 != 0) {
                        break label859;
                     }

                     var29 = var21;
                  }

                  if(var29 == 0) {
                     this.field_6986 = this.field_6985;
                     this.field_7006 = this.field_7005;
                     if(var8 != null) {
                        break label860;
                     }
                  }
               }

               this.field_6986 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4 + 1);
               this.field_7006 = var1.method_2444(this.field_6952, var2 - 1, var3, var4 + 1);
            }

            label850: {
               label849: {
                  var28 = var22;
                  if(var8 != null) {
                     if(var22 != 0) {
                        break label849;
                     }

                     var28 = var20;
                  }

                  if(var28 == 0) {
                     this.field_6991 = this.field_6989;
                     this.field_7011 = this.field_7009;
                     if(var8 != null) {
                        break label850;
                     }
                  }
               }

               this.field_6991 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4 + 1);
               this.field_7011 = var1.method_2444(this.field_6952, var2 + 1, var3, var4 + 1);
            }

            double var35;
            var28 = (var35 = this.field_6963 - 1.0D) == 0.0D?0:(var35 < 0.0D?-1:1);
            if(var8 != null) {
               if(var28 >= 0) {
                  --var3;
               }

               var28 = var18;
            }

            if(var8 != null) {
               if(var28 < 0) {
                  var18 = var1.method_2444(this.field_6952, var2, var3, var4);
               }

               var28 = var18;
            }

            label837: {
               label836: {
                  var24 = var28;
                  double var36;
                  var28 = (var36 = this.field_6963 - 1.0D) == 0.0D?0:(var36 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var28 < 0) {
                        var30 = this;
                        if(var8 == null) {
                           break label837;
                        }

                        if(this.field_6952.getBlock(var2, var3 + 1, var4).method_2453()) {
                           break label836;
                        }
                     }

                     var28 = var1.method_2444(this.field_6952, var2, var3 + 1, var4);
                  }

                  var24 = var28;
               }

               var30 = this;
            }

            var25 = var30.getAmbientOcclusionLightValue(var2, var3 + 1, var4);
            var16 = (this.field_6986 + this.field_6985 + this.field_6990 + var25) / 4.0F;
            var13 = (this.field_6990 + var25 + this.field_6991 + this.field_6989) / 4.0F;
            var14 = (var25 + this.field_6987 + this.field_6989 + this.field_6988) / 4.0F;
            var15 = (this.field_6985 + this.field_6984 + var25 + this.field_6987) / 4.0F;
            this.field_7019 = this.method_7265(this.field_7006, this.field_7005, this.field_7010, var24);
            this.field_7016 = this.method_7265(this.field_7010, this.field_7011, this.field_7009, var24);
            this.field_7017 = this.method_7265(this.field_7007, this.field_7009, this.field_7008, var24);
            this.field_7018 = this.method_7265(this.field_7005, this.field_7004, this.field_7007, var24);
            var27 = var11;
            if(var8 != null) {
               if(var11) {
                  var14 = var25;
                  var15 = var25;
                  var16 = var25;
                  var13 = var25;
                  this.field_7016 = this.field_7019 = this.field_7018 = this.field_7017 = var24;
               }

               this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5;
               this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6;
               this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7;
               this.field_7020 *= var13;
               this.field_7024 *= var13;
               this.field_7028 *= var13;
               this.field_7021 *= var14;
               this.field_7025 *= var14;
               this.field_7029 *= var14;
               this.field_7022 *= var15;
               this.field_7026 *= var15;
               this.field_7030 *= var15;
               this.field_7023 *= var16;
               this.field_7027 *= var16;
               this.field_7031 *= var16;
               this.drawTextBox1(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 1));
               var27 = true;
            }

            var12 = var27;
         }

         var28 = this.field_6956;
      }

      class_73 var26;
      label826: {
         label992: {
            if(var8 != null) {
               if(var28 == 0) {
                  var28 = var1.method_2445(this.field_6952, var2, var3, var4 - 1, 2);
                  if(var8 == null) {
                     break label826;
                  }

                  if(var28 == 0) {
                     break label992;
                  }
               }

               double var37;
               var28 = (var37 = this.field_6964 - 0.0D) == 0.0D?0:(var37 < 0.0D?-1:1);
            }

            if(var8 != null) {
               if(var28 <= 0) {
                  --var4;
               }

               this.field_6992 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4);
               this.field_6979 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4);
               this.field_6987 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4);
               this.field_6993 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4);
               this.field_7012 = var1.method_2444(this.field_6952, var2 - 1, var3, var4);
               this.field_6999 = var1.method_2444(this.field_6952, var2, var3 - 1, var4);
               this.field_7007 = var1.method_2444(this.field_6952, var2, var3 + 1, var4);
               this.field_7013 = var1.method_2444(this.field_6952, var2 + 1, var3, var4);
               var28 = this.field_6952.getBlock(var2 + 1, var3, var4 - 1).method_2421();
            }

            label814: {
               var20 = var28;
               var21 = this.field_6952.getBlock(var2 - 1, var3, var4 - 1).method_2421();
               var22 = this.field_6952.getBlock(var2, var3 + 1, var4 - 1).method_2421();
               var23 = this.field_6952.getBlock(var2, var3 - 1, var4 - 1).method_2421();
               if(var8 != null) {
                  if(var21 == 0 && var23 == 0) {
                     this.field_6976 = this.field_6992;
                     this.field_6996 = this.field_7012;
                     if(var8 != null) {
                        break label814;
                     }
                  }

                  this.field_6976 = this.getAmbientOcclusionLightValue(var2 - 1, var3 - 1, var4);
               }

               this.field_6996 = var1.method_2444(this.field_6952, var2 - 1, var3 - 1, var4);
            }

            label806: {
               label805: {
                  var29 = var21;
                  if(var8 != null) {
                     if(var21 != 0) {
                        break label805;
                     }

                     var29 = var22;
                  }

                  if(var29 == 0) {
                     this.field_6984 = this.field_6992;
                     this.field_7004 = this.field_7012;
                     if(var8 != null) {
                        break label806;
                     }
                  }
               }

               this.field_6984 = this.getAmbientOcclusionLightValue(var2 - 1, var3 + 1, var4);
               this.field_7004 = var1.method_2444(this.field_6952, var2 - 1, var3 + 1, var4);
            }

            label796: {
               label795: {
                  var28 = var20;
                  if(var8 != null) {
                     if(var20 != 0) {
                        break label795;
                     }

                     var28 = var23;
                  }

                  if(var28 == 0) {
                     this.field_6981 = this.field_6993;
                     this.field_7001 = this.field_7013;
                     if(var8 != null) {
                        break label796;
                     }
                  }
               }

               this.field_6981 = this.getAmbientOcclusionLightValue(var2 + 1, var3 - 1, var4);
               this.field_7001 = var1.method_2444(this.field_6952, var2 + 1, var3 - 1, var4);
            }

            label786: {
               label785: {
                  var28 = var20;
                  if(var8 != null) {
                     if(var20 != 0) {
                        break label785;
                     }

                     var28 = var22;
                  }

                  if(var28 == 0) {
                     this.field_6988 = this.field_6993;
                     this.field_7008 = this.field_7013;
                     if(var8 != null) {
                        break label786;
                     }
                  }
               }

               this.field_6988 = this.getAmbientOcclusionLightValue(var2 + 1, var3 + 1, var4);
               this.field_7008 = var1.method_2444(this.field_6952, var2 + 1, var3 + 1, var4);
            }

            double var38;
            var28 = (var38 = this.field_6964 - 0.0D) == 0.0D?0:(var38 < 0.0D?-1:1);
            if(var8 != null) {
               if(var28 <= 0) {
                  ++var4;
               }

               var28 = var18;
            }

            if(var8 != null) {
               if(var28 < 0) {
                  var18 = var1.method_2444(this.field_6952, var2, var3, var4);
               }

               var28 = var18;
            }

            label773: {
               label772: {
                  var24 = var28;
                  double var39;
                  var28 = (var39 = this.field_6964 - 0.0D) == 0.0D?0:(var39 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var28 > 0) {
                        var30 = this;
                        if(var8 == null) {
                           break label773;
                        }

                        if(this.field_6952.getBlock(var2, var3, var4 - 1).method_2453()) {
                           break label772;
                        }
                     }

                     var28 = var1.method_2444(this.field_6952, var2, var3, var4 - 1);
                  }

                  var24 = var28;
               }

               var30 = this;
            }

            var25 = var30.getAmbientOcclusionLightValue(var2, var3, var4 - 1);
            var13 = (this.field_6992 + this.field_6984 + var25 + this.field_6987) / 4.0F;
            var14 = (var25 + this.field_6987 + this.field_6993 + this.field_6988) / 4.0F;
            var15 = (this.field_6979 + var25 + this.field_6981 + this.field_6993) / 4.0F;
            var16 = (this.field_6976 + this.field_6992 + this.field_6979 + var25) / 4.0F;
            this.field_7016 = this.method_7265(this.field_7012, this.field_7004, this.field_7007, var24);
            this.field_7017 = this.method_7265(this.field_7007, this.field_7013, this.field_7008, var24);
            this.field_7018 = this.method_7265(this.field_6999, this.field_7001, this.field_7013, var24);
            this.field_7019 = this.method_7265(this.field_6996, this.field_7012, this.field_6999, var24);
            var27 = var11;
            if(var8 != null) {
               if(var11) {
                  var14 = var25;
                  var15 = var25;
                  var16 = var25;
                  var13 = var25;
                  this.field_7016 = this.field_7019 = this.field_7018 = this.field_7017 = var24;
               }

               var27 = var17;
            }

            label761: {
               if(var27) {
                  this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5 * 0.8F;
                  this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6 * 0.8F;
                  this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7 * 0.8F;
                  if(var8 != null) {
                     break label761;
                  }
               }

               this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = 0.8F;
               this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = 0.8F;
               this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = 0.8F;
            }

            this.field_7020 *= var13;
            this.field_7024 *= var13;
            this.field_7028 *= var13;
            this.field_7021 *= var14;
            this.field_7025 *= var14;
            this.field_7029 *= var14;
            this.field_7022 *= var15;
            this.field_7026 *= var15;
            this.field_7030 *= var15;
            this.field_7023 *= var16;
            this.field_7027 *= var16;
            this.field_7031 *= var16;
            var26 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 2);
            var27 = var10;
            if(var8 != null) {
               if(var10) {
                  var26 = this.fixAoSideGrassTexture(var26, var2, var3, var4, 2, var5, var6, var7);
               }

               this.drawTextBox2(var1, (double)var2, (double)var3, (double)var4, var26);
               var27 = var9;
            }

            if(var8 != null) {
               label754: {
                  if(var27) {
                     var27 = field_6957;
                     if(var8 == null) {
                        break label754;
                     }

                     if(field_6957 && var26 == TextureUtils.iconGrassSide) {
                        var27 = this.method_7206();
                        if(var8 == null) {
                           break label754;
                        }

                        if(!var27) {
                           this.field_7020 *= var5;
                           this.field_7021 *= var5;
                           this.field_7022 *= var5;
                           this.field_7023 *= var5;
                           this.field_7024 *= var6;
                           this.field_7025 *= var6;
                           this.field_7026 *= var6;
                           this.field_7027 *= var6;
                           this.field_7028 *= var7;
                           this.field_7029 *= var7;
                           this.field_7030 *= var7;
                           this.field_7031 *= var7;
                           this.drawTextBox2(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                        }
                     }
                  }

                  var27 = true;
               }
            }

            var12 = var27;
         }

         var28 = this.field_6956;
      }

      label744: {
         label993: {
            if(var8 != null) {
               if(var28 == 0) {
                  var28 = var1.method_2445(this.field_6952, var2, var3, var4 + 1, 3);
                  if(var8 == null) {
                     break label744;
                  }

                  if(var28 == 0) {
                     break label993;
                  }
               }

               double var40;
               var28 = (var40 = this.field_6965 - 1.0D) == 0.0D?0:(var40 < 0.0D?-1:1);
            }

            if(var8 != null) {
               if(var28 >= 0) {
                  ++var4;
               }

               this.field_6994 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4);
               this.field_6995 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4);
               this.field_6980 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4);
               this.field_6990 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4);
               this.field_7014 = var1.method_2444(this.field_6952, var2 - 1, var3, var4);
               this.field_7015 = var1.method_2444(this.field_6952, var2 + 1, var3, var4);
               this.field_7000 = var1.method_2444(this.field_6952, var2, var3 - 1, var4);
               this.field_7010 = var1.method_2444(this.field_6952, var2, var3 + 1, var4);
               var28 = this.field_6952.getBlock(var2 + 1, var3, var4 + 1).method_2421();
            }

            label732: {
               var20 = var28;
               var21 = this.field_6952.getBlock(var2 - 1, var3, var4 + 1).method_2421();
               var22 = this.field_6952.getBlock(var2, var3 + 1, var4 + 1).method_2421();
               var23 = this.field_6952.getBlock(var2, var3 - 1, var4 + 1).method_2421();
               if(var8 != null) {
                  if(var21 == 0 && var23 == 0) {
                     this.field_6978 = this.field_6994;
                     this.field_6998 = this.field_7014;
                     if(var8 != null) {
                        break label732;
                     }
                  }

                  this.field_6978 = this.getAmbientOcclusionLightValue(var2 - 1, var3 - 1, var4);
               }

               this.field_6998 = var1.method_2444(this.field_6952, var2 - 1, var3 - 1, var4);
            }

            label724: {
               label723: {
                  var29 = var21;
                  if(var8 != null) {
                     if(var21 != 0) {
                        break label723;
                     }

                     var29 = var22;
                  }

                  if(var29 == 0) {
                     this.field_6986 = this.field_6994;
                     this.field_7006 = this.field_7014;
                     if(var8 != null) {
                        break label724;
                     }
                  }
               }

               this.field_6986 = this.getAmbientOcclusionLightValue(var2 - 1, var3 + 1, var4);
               this.field_7006 = var1.method_2444(this.field_6952, var2 - 1, var3 + 1, var4);
            }

            label714: {
               label713: {
                  var28 = var20;
                  if(var8 != null) {
                     if(var20 != 0) {
                        break label713;
                     }

                     var28 = var23;
                  }

                  if(var28 == 0) {
                     this.field_6983 = this.field_6995;
                     this.field_7003 = this.field_7015;
                     if(var8 != null) {
                        break label714;
                     }
                  }
               }

               this.field_6983 = this.getAmbientOcclusionLightValue(var2 + 1, var3 - 1, var4);
               this.field_7003 = var1.method_2444(this.field_6952, var2 + 1, var3 - 1, var4);
            }

            label704: {
               label703: {
                  var28 = var20;
                  if(var8 != null) {
                     if(var20 != 0) {
                        break label703;
                     }

                     var28 = var22;
                  }

                  if(var28 == 0) {
                     this.field_6991 = this.field_6995;
                     this.field_7011 = this.field_7015;
                     if(var8 != null) {
                        break label704;
                     }
                  }
               }

               this.field_6991 = this.getAmbientOcclusionLightValue(var2 + 1, var3 + 1, var4);
               this.field_7011 = var1.method_2444(this.field_6952, var2 + 1, var3 + 1, var4);
            }

            double var41;
            var28 = (var41 = this.field_6965 - 1.0D) == 0.0D?0:(var41 < 0.0D?-1:1);
            if(var8 != null) {
               if(var28 >= 0) {
                  --var4;
               }

               var28 = var18;
            }

            if(var8 != null) {
               if(var28 < 0) {
                  var18 = var1.method_2444(this.field_6952, var2, var3, var4);
               }

               var28 = var18;
            }

            label691: {
               label690: {
                  var24 = var28;
                  double var42;
                  var28 = (var42 = this.field_6965 - 1.0D) == 0.0D?0:(var42 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var28 < 0) {
                        var30 = this;
                        if(var8 == null) {
                           break label691;
                        }

                        if(this.field_6952.getBlock(var2, var3, var4 + 1).method_2453()) {
                           break label690;
                        }
                     }

                     var28 = var1.method_2444(this.field_6952, var2, var3, var4 + 1);
                  }

                  var24 = var28;
               }

               var30 = this;
            }

            var25 = var30.getAmbientOcclusionLightValue(var2, var3, var4 + 1);
            var13 = (this.field_6994 + this.field_6986 + var25 + this.field_6990) / 4.0F;
            var16 = (var25 + this.field_6990 + this.field_6995 + this.field_6991) / 4.0F;
            var15 = (this.field_6980 + var25 + this.field_6983 + this.field_6995) / 4.0F;
            var14 = (this.field_6978 + this.field_6994 + this.field_6980 + var25) / 4.0F;
            this.field_7016 = this.method_7265(this.field_7014, this.field_7006, this.field_7010, var24);
            this.field_7019 = this.method_7265(this.field_7010, this.field_7015, this.field_7011, var24);
            this.field_7018 = this.method_7265(this.field_7000, this.field_7003, this.field_7015, var24);
            this.field_7017 = this.method_7265(this.field_6998, this.field_7014, this.field_7000, var24);
            var27 = var11;
            if(var8 != null) {
               if(var11) {
                  var14 = var25;
                  var15 = var25;
                  var16 = var25;
                  var13 = var25;
                  this.field_7016 = this.field_7019 = this.field_7018 = this.field_7017 = var24;
               }

               var27 = var17;
            }

            label679: {
               if(var27) {
                  this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5 * 0.8F;
                  this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6 * 0.8F;
                  this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7 * 0.8F;
                  if(var8 != null) {
                     break label679;
                  }
               }

               this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = 0.8F;
               this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = 0.8F;
               this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = 0.8F;
            }

            this.field_7020 *= var13;
            this.field_7024 *= var13;
            this.field_7028 *= var13;
            this.field_7021 *= var14;
            this.field_7025 *= var14;
            this.field_7029 *= var14;
            this.field_7022 *= var15;
            this.field_7026 *= var15;
            this.field_7030 *= var15;
            this.field_7023 *= var16;
            this.field_7027 *= var16;
            this.field_7031 *= var16;
            var26 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 3);
            var27 = var10;
            if(var8 != null) {
               if(var10) {
                  var26 = this.fixAoSideGrassTexture(var26, var2, var3, var4, 3, var5, var6, var7);
               }

               this.drawTextBox3(var1, (double)var2, (double)var3, (double)var4, var26);
               var27 = var9;
            }

            if(var8 != null) {
               label672: {
                  if(var27) {
                     var27 = field_6957;
                     if(var8 == null) {
                        break label672;
                     }

                     if(field_6957 && var26 == TextureUtils.iconGrassSide) {
                        var27 = this.method_7206();
                        if(var8 == null) {
                           break label672;
                        }

                        if(!var27) {
                           this.field_7020 *= var5;
                           this.field_7021 *= var5;
                           this.field_7022 *= var5;
                           this.field_7023 *= var5;
                           this.field_7024 *= var6;
                           this.field_7025 *= var6;
                           this.field_7026 *= var6;
                           this.field_7027 *= var6;
                           this.field_7028 *= var7;
                           this.field_7029 *= var7;
                           this.field_7030 *= var7;
                           this.field_7031 *= var7;
                           this.drawTextBox3(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                        }
                     }
                  }

                  var27 = true;
               }
            }

            var12 = var27;
         }

         var28 = this.field_6956;
      }

      label662: {
         label994: {
            if(var8 != null) {
               if(var28 == 0) {
                  var28 = var1.method_2445(this.field_6952, var2 - 1, var3, var4, 4);
                  if(var8 == null) {
                     break label662;
                  }

                  if(var28 == 0) {
                     break label994;
                  }
               }

               double var43;
               var28 = (var43 = this.field_6960 - 0.0D) == 0.0D?0:(var43 < 0.0D?-1:1);
            }

            if(var8 != null) {
               if(var28 <= 0) {
                  --var2;
               }

               this.field_6977 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4);
               this.field_6992 = this.getAmbientOcclusionLightValue(var2, var3, var4 - 1);
               this.field_6994 = this.getAmbientOcclusionLightValue(var2, var3, var4 + 1);
               this.field_6985 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4);
               this.field_6997 = var1.method_2444(this.field_6952, var2, var3 - 1, var4);
               this.field_7012 = var1.method_2444(this.field_6952, var2, var3, var4 - 1);
               this.field_7014 = var1.method_2444(this.field_6952, var2, var3, var4 + 1);
               this.field_7005 = var1.method_2444(this.field_6952, var2, var3 + 1, var4);
               var28 = this.field_6952.getBlock(var2 - 1, var3 + 1, var4).method_2421();
            }

            label650: {
               var20 = var28;
               var21 = this.field_6952.getBlock(var2 - 1, var3 - 1, var4).method_2421();
               var22 = this.field_6952.getBlock(var2 - 1, var3, var4 - 1).method_2421();
               var23 = this.field_6952.getBlock(var2 - 1, var3, var4 + 1).method_2421();
               if(var8 != null) {
                  if(var22 == 0 && var21 == 0) {
                     this.field_6976 = this.field_6992;
                     this.field_6996 = this.field_7012;
                     if(var8 != null) {
                        break label650;
                     }
                  }

                  this.field_6976 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4 - 1);
               }

               this.field_6996 = var1.method_2444(this.field_6952, var2, var3 - 1, var4 - 1);
            }

            label642: {
               label641: {
                  var29 = var23;
                  if(var8 != null) {
                     if(var23 != 0) {
                        break label641;
                     }

                     var29 = var21;
                  }

                  if(var29 == 0) {
                     this.field_6978 = this.field_6994;
                     this.field_6998 = this.field_7014;
                     if(var8 != null) {
                        break label642;
                     }
                  }
               }

               this.field_6978 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4 + 1);
               this.field_6998 = var1.method_2444(this.field_6952, var2, var3 - 1, var4 + 1);
            }

            label632: {
               label631: {
                  var28 = var22;
                  if(var8 != null) {
                     if(var22 != 0) {
                        break label631;
                     }

                     var28 = var20;
                  }

                  if(var28 == 0) {
                     this.field_6984 = this.field_6992;
                     this.field_7004 = this.field_7012;
                     if(var8 != null) {
                        break label632;
                     }
                  }
               }

               this.field_6984 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4 - 1);
               this.field_7004 = var1.method_2444(this.field_6952, var2, var3 + 1, var4 - 1);
            }

            label622: {
               label621: {
                  var28 = var23;
                  if(var8 != null) {
                     if(var23 != 0) {
                        break label621;
                     }

                     var28 = var20;
                  }

                  if(var28 == 0) {
                     this.field_6986 = this.field_6994;
                     this.field_7006 = this.field_7014;
                     if(var8 != null) {
                        break label622;
                     }
                  }
               }

               this.field_6986 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4 + 1);
               this.field_7006 = var1.method_2444(this.field_6952, var2, var3 + 1, var4 + 1);
            }

            double var44;
            var28 = (var44 = this.field_6960 - 0.0D) == 0.0D?0:(var44 < 0.0D?-1:1);
            if(var8 != null) {
               if(var28 <= 0) {
                  ++var2;
               }

               var28 = var18;
            }

            if(var8 != null) {
               if(var28 < 0) {
                  var18 = var1.method_2444(this.field_6952, var2, var3, var4);
               }

               var28 = var18;
            }

            label609: {
               label608: {
                  var24 = var28;
                  double var45;
                  var28 = (var45 = this.field_6960 - 0.0D) == 0.0D?0:(var45 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var28 > 0) {
                        var30 = this;
                        if(var8 == null) {
                           break label609;
                        }

                        if(this.field_6952.getBlock(var2 - 1, var3, var4).method_2453()) {
                           break label608;
                        }
                     }

                     var28 = var1.method_2444(this.field_6952, var2 - 1, var3, var4);
                  }

                  var24 = var28;
               }

               var30 = this;
            }

            var25 = var30.getAmbientOcclusionLightValue(var2 - 1, var3, var4);
            var16 = (this.field_6977 + this.field_6978 + var25 + this.field_6994) / 4.0F;
            var13 = (var25 + this.field_6994 + this.field_6985 + this.field_6986) / 4.0F;
            var14 = (this.field_6992 + var25 + this.field_6984 + this.field_6985) / 4.0F;
            var15 = (this.field_6976 + this.field_6977 + this.field_6992 + var25) / 4.0F;
            this.field_7019 = this.method_7265(this.field_6997, this.field_6998, this.field_7014, var24);
            this.field_7016 = this.method_7265(this.field_7014, this.field_7005, this.field_7006, var24);
            this.field_7017 = this.method_7265(this.field_7012, this.field_7004, this.field_7005, var24);
            this.field_7018 = this.method_7265(this.field_6996, this.field_6997, this.field_7012, var24);
            var27 = var11;
            if(var8 != null) {
               if(var11) {
                  var14 = var25;
                  var15 = var25;
                  var16 = var25;
                  var13 = var25;
                  this.field_7016 = this.field_7019 = this.field_7018 = this.field_7017 = var24;
               }

               var27 = var17;
            }

            label597: {
               if(var27) {
                  this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5 * 0.6F;
                  this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6 * 0.6F;
                  this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7 * 0.6F;
                  if(var8 != null) {
                     break label597;
                  }
               }

               this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = 0.6F;
               this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = 0.6F;
               this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = 0.6F;
            }

            this.field_7020 *= var13;
            this.field_7024 *= var13;
            this.field_7028 *= var13;
            this.field_7021 *= var14;
            this.field_7025 *= var14;
            this.field_7029 *= var14;
            this.field_7022 *= var15;
            this.field_7026 *= var15;
            this.field_7030 *= var15;
            this.field_7023 *= var16;
            this.field_7027 *= var16;
            this.field_7031 *= var16;
            var26 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 4);
            var27 = var10;
            if(var8 != null) {
               if(var10) {
                  var26 = this.fixAoSideGrassTexture(var26, var2, var3, var4, 4, var5, var6, var7);
               }

               this.drawTextBox4(var1, (double)var2, (double)var3, (double)var4, var26);
               var27 = var9;
            }

            if(var8 != null) {
               label590: {
                  if(var27) {
                     var27 = field_6957;
                     if(var8 == null) {
                        break label590;
                     }

                     if(field_6957 && var26 == TextureUtils.iconGrassSide) {
                        var27 = this.method_7206();
                        if(var8 == null) {
                           break label590;
                        }

                        if(!var27) {
                           this.field_7020 *= var5;
                           this.field_7021 *= var5;
                           this.field_7022 *= var5;
                           this.field_7023 *= var5;
                           this.field_7024 *= var6;
                           this.field_7025 *= var6;
                           this.field_7026 *= var6;
                           this.field_7027 *= var6;
                           this.field_7028 *= var7;
                           this.field_7029 *= var7;
                           this.field_7030 *= var7;
                           this.field_7031 *= var7;
                           this.drawTextBox4(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                        }
                     }
                  }

                  var27 = true;
               }
            }

            var12 = var27;
         }

         var28 = this.field_6956;
      }

      label995: {
         if(var8 != null) {
            if(var28 == 0) {
               var27 = var1.method_2445(this.field_6952, var2 + 1, var3, var4, 5);
               if(var8 == null) {
                  return var27;
               }

               if(!var27) {
                  break label995;
               }
            }

            double var46;
            var28 = (var46 = this.field_6961 - 1.0D) == 0.0D?0:(var46 < 0.0D?-1:1);
         }

         if(var8 != null) {
            if(var28 >= 0) {
               ++var2;
            }

            this.field_6982 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4);
            this.field_6993 = this.getAmbientOcclusionLightValue(var2, var3, var4 - 1);
            this.field_6995 = this.getAmbientOcclusionLightValue(var2, var3, var4 + 1);
            this.field_6989 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4);
            this.field_7002 = var1.method_2444(this.field_6952, var2, var3 - 1, var4);
            this.field_7013 = var1.method_2444(this.field_6952, var2, var3, var4 - 1);
            this.field_7015 = var1.method_2444(this.field_6952, var2, var3, var4 + 1);
            this.field_7009 = var1.method_2444(this.field_6952, var2, var3 + 1, var4);
            var28 = this.field_6952.getBlock(var2 + 1, var3 + 1, var4).method_2421();
         }

         label568: {
            var20 = var28;
            var21 = this.field_6952.getBlock(var2 + 1, var3 - 1, var4).method_2421();
            var22 = this.field_6952.getBlock(var2 + 1, var3, var4 + 1).method_2421();
            var23 = this.field_6952.getBlock(var2 + 1, var3, var4 - 1).method_2421();
            if(var8 != null) {
               if(var21 == 0 && var23 == 0) {
                  this.field_6981 = this.field_6993;
                  this.field_7001 = this.field_7013;
                  if(var8 != null) {
                     break label568;
                  }
               }

               this.field_6981 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4 - 1);
            }

            this.field_7001 = var1.method_2444(this.field_6952, var2, var3 - 1, var4 - 1);
         }

         label560: {
            label559: {
               var29 = var21;
               if(var8 != null) {
                  if(var21 != 0) {
                     break label559;
                  }

                  var29 = var22;
               }

               if(var29 == 0) {
                  this.field_6983 = this.field_6995;
                  this.field_7003 = this.field_7015;
                  if(var8 != null) {
                     break label560;
                  }
               }
            }

            this.field_6983 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4 + 1);
            this.field_7003 = var1.method_2444(this.field_6952, var2, var3 - 1, var4 + 1);
         }

         label550: {
            label549: {
               var28 = var20;
               if(var8 != null) {
                  if(var20 != 0) {
                     break label549;
                  }

                  var28 = var23;
               }

               if(var28 == 0) {
                  this.field_6988 = this.field_6993;
                  this.field_7008 = this.field_7013;
                  if(var8 != null) {
                     break label550;
                  }
               }
            }

            this.field_6988 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4 - 1);
            this.field_7008 = var1.method_2444(this.field_6952, var2, var3 + 1, var4 - 1);
         }

         label540: {
            label539: {
               var28 = var20;
               if(var8 != null) {
                  if(var20 != 0) {
                     break label539;
                  }

                  var28 = var22;
               }

               if(var28 == 0) {
                  this.field_6991 = this.field_6995;
                  this.field_7011 = this.field_7015;
                  if(var8 != null) {
                     break label540;
                  }
               }
            }

            this.field_6991 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4 + 1);
            this.field_7011 = var1.method_2444(this.field_6952, var2, var3 + 1, var4 + 1);
         }

         double var47;
         var28 = (var47 = this.field_6961 - 1.0D) == 0.0D?0:(var47 < 0.0D?-1:1);
         if(var8 != null) {
            if(var28 >= 0) {
               --var2;
            }

            var28 = var18;
         }

         if(var8 != null) {
            if(var28 < 0) {
               var18 = var1.method_2444(this.field_6952, var2, var3, var4);
            }

            var28 = var18;
         }

         label527: {
            label526: {
               var24 = var28;
               double var48;
               var28 = (var48 = this.field_6961 - 1.0D) == 0.0D?0:(var48 < 0.0D?-1:1);
               if(var8 != null) {
                  if(var28 < 0) {
                     var30 = this;
                     if(var8 == null) {
                        break label527;
                     }

                     if(this.field_6952.getBlock(var2 + 1, var3, var4).method_2453()) {
                        break label526;
                     }
                  }

                  var28 = var1.method_2444(this.field_6952, var2 + 1, var3, var4);
               }

               var24 = var28;
            }

            var30 = this;
         }

         var25 = var30.getAmbientOcclusionLightValue(var2 + 1, var3, var4);
         var13 = (this.field_6982 + this.field_6983 + var25 + this.field_6995) / 4.0F;
         var14 = (this.field_6981 + this.field_6982 + this.field_6993 + var25) / 4.0F;
         var15 = (this.field_6993 + var25 + this.field_6988 + this.field_6989) / 4.0F;
         var16 = (var25 + this.field_6995 + this.field_6989 + this.field_6991) / 4.0F;
         this.field_7016 = this.method_7265(this.field_7002, this.field_7003, this.field_7015, var24);
         this.field_7019 = this.method_7265(this.field_7015, this.field_7009, this.field_7011, var24);
         this.field_7018 = this.method_7265(this.field_7013, this.field_7008, this.field_7009, var24);
         this.field_7017 = this.method_7265(this.field_7001, this.field_7002, this.field_7013, var24);
         var27 = var11;
         if(var8 != null) {
            if(var11) {
               var14 = var25;
               var15 = var25;
               var16 = var25;
               var13 = var25;
               this.field_7016 = this.field_7019 = this.field_7018 = this.field_7017 = var24;
            }

            var27 = var17;
         }

         label515: {
            if(var27) {
               this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5 * 0.6F;
               this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6 * 0.6F;
               this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7 * 0.6F;
               if(var8 != null) {
                  break label515;
               }
            }

            this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = 0.6F;
            this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = 0.6F;
            this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = 0.6F;
         }

         this.field_7020 *= var13;
         this.field_7024 *= var13;
         this.field_7028 *= var13;
         this.field_7021 *= var14;
         this.field_7025 *= var14;
         this.field_7029 *= var14;
         this.field_7022 *= var15;
         this.field_7026 *= var15;
         this.field_7030 *= var15;
         this.field_7023 *= var16;
         this.field_7027 *= var16;
         this.field_7031 *= var16;
         var26 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 5);
         var27 = var10;
         if(var8 != null) {
            if(var10) {
               var26 = this.fixAoSideGrassTexture(var26, var2, var3, var4, 5, var5, var6, var7);
            }

            this.drawTextBox5(var1, (double)var2, (double)var3, (double)var4, var26);
            var27 = var9;
         }

         if(var8 != null) {
            label508: {
               if(var27) {
                  var27 = field_6957;
                  if(var8 == null) {
                     break label508;
                  }

                  if(field_6957 && var26 == TextureUtils.iconGrassSide) {
                     var27 = this.method_7206();
                     if(var8 == null) {
                        break label508;
                     }

                     if(!var27) {
                        this.field_7020 *= var5;
                        this.field_7021 *= var5;
                        this.field_7022 *= var5;
                        this.field_7023 *= var5;
                        this.field_7024 *= var6;
                        this.field_7025 *= var6;
                        this.field_7026 *= var6;
                        this.field_7027 *= var6;
                        this.field_7028 *= var7;
                        this.field_7029 *= var7;
                        this.field_7030 *= var7;
                        this.field_7031 *= var7;
                        this.drawTextBox5(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                     }
                  }
               }

               var27 = true;
            }
         }

         var12 = var27;
      }

      this.field_6975 = false;
      var27 = var12;
      return var27;
   }

   // $FF: renamed from: b (aji, int, int, int, float, float, float) boolean
   public boolean method_7264(aji var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      String[] var8;
      boolean var9;
      float var10;
      float var11;
      float var12;
      float var13;
      boolean var14;
      int var15;
      int var33;
      label845: {
         label848: {
            label843: {
               this.field_6975 = true;
               var9 = false;
               String[] var10000 = class_752.method_4253();
               var10 = 0.0F;
               var11 = 0.0F;
               var12 = 0.0F;
               var13 = 0.0F;
               var14 = true;
               var15 = var1.method_2444(this.field_6952, var2, var3, var4);
               var8 = var10000;
               bmh var16 = bmh.instance;
               var16.setVisible5(983055);
               if(var8 != null) {
                  if(var1 != class_1192.field_6027) {
                     break label843;
                  }

                  var14 = false;
               }

               if(var8 != null) {
                  break label848;
               }
            }

            var33 = this.method_7206();
            if(var8 == null) {
               break label845;
            }

            if(var33 != 0) {
               var14 = false;
            }
         }

         var33 = this.field_6956;
      }

      int var17;
      byte var18;
      byte var19;
      byte var20;
      int var21;
      float var22;
      byte var34;
      blm var35;
      label832: {
         label849: {
            if(var8 != null) {
               if(var33 == 0) {
                  var33 = var1.method_2445(this.field_6952, var2, var3 - 1, var4, 0);
                  if(var8 == null) {
                     break label832;
                  }

                  if(var33 == 0) {
                     break label849;
                  }
               }

               double var38;
               var33 = (var38 = this.field_6962 - 0.0D) == 0.0D?0:(var38 < 0.0D?-1:1);
            }

            if(var8 != null) {
               if(var33 <= 0) {
                  --var3;
               }

               this.field_6997 = var1.method_2444(this.field_6952, var2 - 1, var3, var4);
               this.field_6999 = var1.method_2444(this.field_6952, var2, var3, var4 - 1);
               this.field_7000 = var1.method_2444(this.field_6952, var2, var3, var4 + 1);
               this.field_7002 = var1.method_2444(this.field_6952, var2 + 1, var3, var4);
               this.field_6977 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4);
               this.field_6979 = this.getAmbientOcclusionLightValue(var2, var3, var4 - 1);
               this.field_6980 = this.getAmbientOcclusionLightValue(var2, var3, var4 + 1);
               this.field_6982 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4);
               var33 = this.field_6952.getBlock(var2 + 1, var3 - 1, var4).method_2421();
            }

            label820: {
               var17 = var33;
               var18 = this.field_6952.getBlock(var2 - 1, var3 - 1, var4).method_2421();
               var19 = this.field_6952.getBlock(var2, var3 - 1, var4 + 1).method_2421();
               var20 = this.field_6952.getBlock(var2, var3 - 1, var4 - 1).method_2421();
               if(var8 != null) {
                  if(var20 == 0 && var18 == 0) {
                     this.field_6976 = this.field_6977;
                     this.field_6996 = this.field_6997;
                     if(var8 != null) {
                        break label820;
                     }
                  }

                  this.field_6976 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4 - 1);
               }

               this.field_6996 = var1.method_2444(this.field_6952, var2 - 1, var3, var4 - 1);
            }

            label812: {
               label811: {
                  var34 = var19;
                  if(var8 != null) {
                     if(var19 != 0) {
                        break label811;
                     }

                     var34 = var18;
                  }

                  if(var34 == 0) {
                     this.field_6978 = this.field_6977;
                     this.field_6998 = this.field_6997;
                     if(var8 != null) {
                        break label812;
                     }
                  }
               }

               this.field_6978 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4 + 1);
               this.field_6998 = var1.method_2444(this.field_6952, var2 - 1, var3, var4 + 1);
            }

            label802: {
               label801: {
                  var33 = var20;
                  if(var8 != null) {
                     if(var20 != 0) {
                        break label801;
                     }

                     var33 = var17;
                  }

                  if(var33 == 0) {
                     this.field_6981 = this.field_6982;
                     this.field_7001 = this.field_7002;
                     if(var8 != null) {
                        break label802;
                     }
                  }
               }

               this.field_6981 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4 - 1);
               this.field_7001 = var1.method_2444(this.field_6952, var2 + 1, var3, var4 - 1);
            }

            label792: {
               label791: {
                  var33 = var19;
                  if(var8 != null) {
                     if(var19 != 0) {
                        break label791;
                     }

                     var33 = var17;
                  }

                  if(var33 == 0) {
                     this.field_6983 = this.field_6982;
                     this.field_7003 = this.field_7002;
                     if(var8 != null) {
                        break label792;
                     }
                  }
               }

               this.field_6983 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4 + 1);
               this.field_7003 = var1.method_2444(this.field_6952, var2 + 1, var3, var4 + 1);
            }

            double var39;
            var33 = (var39 = this.field_6962 - 0.0D) == 0.0D?0:(var39 < 0.0D?-1:1);
            if(var8 != null) {
               if(var33 <= 0) {
                  ++var3;
               }

               var33 = var15;
            }

            label781: {
               label780: {
                  var21 = var33;
                  double var40;
                  var33 = (var40 = this.field_6962 - 0.0D) == 0.0D?0:(var40 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var33 > 0) {
                        var35 = this;
                        if(var8 == null) {
                           break label781;
                        }

                        if(this.field_6952.getBlock(var2, var3 - 1, var4).method_2453()) {
                           break label780;
                        }
                     }

                     var33 = var1.method_2444(this.field_6952, var2, var3 - 1, var4);
                  }

                  var21 = var33;
               }

               var35 = this;
            }

            label770: {
               var22 = var35.getAmbientOcclusionLightValue(var2, var3 - 1, var4);
               var10 = (this.field_6978 + this.field_6977 + this.field_6980 + var22) / 4.0F;
               var13 = (this.field_6980 + var22 + this.field_6983 + this.field_6982) / 4.0F;
               var12 = (var22 + this.field_6979 + this.field_6982 + this.field_6981) / 4.0F;
               var11 = (this.field_6977 + this.field_6976 + var22 + this.field_6979) / 4.0F;
               this.field_7016 = this.method_7265(this.field_6998, this.field_6997, this.field_7000, var21);
               this.field_7019 = this.method_7265(this.field_7000, this.field_7003, this.field_7002, var21);
               this.field_7018 = this.method_7265(this.field_6999, this.field_7002, this.field_7001, var21);
               this.field_7017 = this.method_7265(this.field_6997, this.field_6996, this.field_6999, var21);
               if(var8 != null) {
                  if(var14) {
                     this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5 * 0.5F;
                     this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6 * 0.5F;
                     this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7 * 0.5F;
                     if(var8 != null) {
                        break label770;
                     }
                  }

                  this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = 0.5F;
                  this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = 0.5F;
               }

               this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = 0.5F;
            }

            this.field_7020 *= var10;
            this.field_7024 *= var10;
            this.field_7028 *= var10;
            this.field_7021 *= var11;
            this.field_7025 *= var11;
            this.field_7029 *= var11;
            this.field_7022 *= var12;
            this.field_7026 *= var12;
            this.field_7030 *= var12;
            this.field_7023 *= var13;
            this.field_7027 *= var13;
            this.field_7031 *= var13;
            this.drawTextBox0(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 0));
            var9 = true;
         }

         var33 = this.field_6956;
      }

      label763: {
         label850: {
            if(var8 != null) {
               if(var33 == 0) {
                  var33 = var1.method_2445(this.field_6952, var2, var3 + 1, var4, 1);
                  if(var8 == null) {
                     break label763;
                  }

                  if(var33 == 0) {
                     break label850;
                  }
               }

               double var41;
               var33 = (var41 = this.field_6963 - 1.0D) == 0.0D?0:(var41 < 0.0D?-1:1);
            }

            if(var8 != null) {
               if(var33 >= 0) {
                  ++var3;
               }

               this.field_7005 = var1.method_2444(this.field_6952, var2 - 1, var3, var4);
               this.field_7009 = var1.method_2444(this.field_6952, var2 + 1, var3, var4);
               this.field_7007 = var1.method_2444(this.field_6952, var2, var3, var4 - 1);
               this.field_7010 = var1.method_2444(this.field_6952, var2, var3, var4 + 1);
               this.field_6985 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4);
               this.field_6989 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4);
               this.field_6987 = this.getAmbientOcclusionLightValue(var2, var3, var4 - 1);
               this.field_6990 = this.getAmbientOcclusionLightValue(var2, var3, var4 + 1);
               var33 = this.field_6952.getBlock(var2 + 1, var3 + 1, var4).method_2421();
            }

            label751: {
               var17 = var33;
               var18 = this.field_6952.getBlock(var2 - 1, var3 + 1, var4).method_2421();
               var19 = this.field_6952.getBlock(var2, var3 + 1, var4 + 1).method_2421();
               var20 = this.field_6952.getBlock(var2, var3 + 1, var4 - 1).method_2421();
               if(var8 != null) {
                  if(var20 == 0 && var18 == 0) {
                     this.field_6984 = this.field_6985;
                     this.field_7004 = this.field_7005;
                     if(var8 != null) {
                        break label751;
                     }
                  }

                  this.field_6984 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4 - 1);
               }

               this.field_7004 = var1.method_2444(this.field_6952, var2 - 1, var3, var4 - 1);
            }

            label743: {
               label742: {
                  var33 = var20;
                  if(var8 != null) {
                     if(var20 != 0) {
                        break label742;
                     }

                     var33 = var17;
                  }

                  if(var33 == 0) {
                     this.field_6988 = this.field_6989;
                     this.field_7008 = this.field_7009;
                     if(var8 != null) {
                        break label743;
                     }
                  }
               }

               this.field_6988 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4 - 1);
               this.field_7008 = var1.method_2444(this.field_6952, var2 + 1, var3, var4 - 1);
            }

            label733: {
               label732: {
                  var34 = var19;
                  if(var8 != null) {
                     if(var19 != 0) {
                        break label732;
                     }

                     var34 = var18;
                  }

                  if(var34 == 0) {
                     this.field_6986 = this.field_6985;
                     this.field_7006 = this.field_7005;
                     if(var8 != null) {
                        break label733;
                     }
                  }
               }

               this.field_6986 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4 + 1);
               this.field_7006 = var1.method_2444(this.field_6952, var2 - 1, var3, var4 + 1);
            }

            label723: {
               label722: {
                  var33 = var19;
                  if(var8 != null) {
                     if(var19 != 0) {
                        break label722;
                     }

                     var33 = var17;
                  }

                  if(var33 == 0) {
                     this.field_6991 = this.field_6989;
                     this.field_7011 = this.field_7009;
                     if(var8 != null) {
                        break label723;
                     }
                  }
               }

               this.field_6991 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4 + 1);
               this.field_7011 = var1.method_2444(this.field_6952, var2 + 1, var3, var4 + 1);
            }

            double var42;
            var33 = (var42 = this.field_6963 - 1.0D) == 0.0D?0:(var42 < 0.0D?-1:1);
            if(var8 != null) {
               if(var33 >= 0) {
                  --var3;
               }

               var33 = var15;
            }

            label712: {
               label711: {
                  var21 = var33;
                  double var43;
                  var33 = (var43 = this.field_6963 - 1.0D) == 0.0D?0:(var43 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var33 < 0) {
                        var35 = this;
                        if(var8 == null) {
                           break label712;
                        }

                        if(this.field_6952.getBlock(var2, var3 + 1, var4).method_2453()) {
                           break label711;
                        }
                     }

                     var33 = var1.method_2444(this.field_6952, var2, var3 + 1, var4);
                  }

                  var21 = var33;
               }

               var35 = this;
            }

            var22 = var35.getAmbientOcclusionLightValue(var2, var3 + 1, var4);
            var13 = (this.field_6986 + this.field_6985 + this.field_6990 + var22) / 4.0F;
            var10 = (this.field_6990 + var22 + this.field_6991 + this.field_6989) / 4.0F;
            var11 = (var22 + this.field_6987 + this.field_6989 + this.field_6988) / 4.0F;
            var12 = (this.field_6985 + this.field_6984 + var22 + this.field_6987) / 4.0F;
            this.field_7019 = this.method_7265(this.field_7006, this.field_7005, this.field_7010, var21);
            this.field_7016 = this.method_7265(this.field_7010, this.field_7011, this.field_7009, var21);
            this.field_7017 = this.method_7265(this.field_7007, this.field_7009, this.field_7008, var21);
            this.field_7018 = this.method_7265(this.field_7005, this.field_7004, this.field_7007, var21);
            this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5;
            this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6;
            this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7;
            this.field_7020 *= var10;
            this.field_7024 *= var10;
            this.field_7028 *= var10;
            this.field_7021 *= var11;
            this.field_7025 *= var11;
            this.field_7029 *= var11;
            this.field_7022 *= var12;
            this.field_7026 *= var12;
            this.field_7030 *= var12;
            this.field_7023 *= var13;
            this.field_7027 *= var13;
            this.field_7031 *= var13;
            this.drawTextBox1(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 1));
            var9 = true;
         }

         var33 = this.field_6956;
      }

      float var23;
      float var24;
      float var25;
      float var26;
      int var27;
      int var28;
      int var29;
      int var30;
      class_73 var31;
      String[] var32;
      boolean var36;
      String var37;
      label701: {
         label851: {
            if(var8 != null) {
               if(var33 == 0) {
                  var33 = var1.method_2445(this.field_6952, var2, var3, var4 - 1, 2);
                  if(var8 == null) {
                     break label701;
                  }

                  if(var33 == 0) {
                     break label851;
                  }
               }

               double var44;
               var33 = (var44 = this.field_6964 - 0.0D) == 0.0D?0:(var44 < 0.0D?-1:1);
            }

            if(var8 != null) {
               if(var33 <= 0) {
                  --var4;
               }

               this.field_6992 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4);
               this.field_6979 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4);
               this.field_6987 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4);
               this.field_6993 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4);
               this.field_7012 = var1.method_2444(this.field_6952, var2 - 1, var3, var4);
               this.field_6999 = var1.method_2444(this.field_6952, var2, var3 - 1, var4);
               this.field_7007 = var1.method_2444(this.field_6952, var2, var3 + 1, var4);
               this.field_7013 = var1.method_2444(this.field_6952, var2 + 1, var3, var4);
               var33 = this.field_6952.getBlock(var2 + 1, var3, var4 - 1).method_2421();
            }

            label689: {
               var17 = var33;
               var18 = this.field_6952.getBlock(var2 - 1, var3, var4 - 1).method_2421();
               var19 = this.field_6952.getBlock(var2, var3 + 1, var4 - 1).method_2421();
               var20 = this.field_6952.getBlock(var2, var3 - 1, var4 - 1).method_2421();
               if(var8 != null) {
                  if(var18 == 0 && var20 == 0) {
                     this.field_6976 = this.field_6992;
                     this.field_6996 = this.field_7012;
                     if(var8 != null) {
                        break label689;
                     }
                  }

                  this.field_6976 = this.getAmbientOcclusionLightValue(var2 - 1, var3 - 1, var4);
               }

               this.field_6996 = var1.method_2444(this.field_6952, var2 - 1, var3 - 1, var4);
            }

            label681: {
               label680: {
                  var34 = var18;
                  if(var8 != null) {
                     if(var18 != 0) {
                        break label680;
                     }

                     var34 = var19;
                  }

                  if(var34 == 0) {
                     this.field_6984 = this.field_6992;
                     this.field_7004 = this.field_7012;
                     if(var8 != null) {
                        break label681;
                     }
                  }
               }

               this.field_6984 = this.getAmbientOcclusionLightValue(var2 - 1, var3 + 1, var4);
               this.field_7004 = var1.method_2444(this.field_6952, var2 - 1, var3 + 1, var4);
            }

            label671: {
               label670: {
                  var33 = var17;
                  if(var8 != null) {
                     if(var17 != 0) {
                        break label670;
                     }

                     var33 = var20;
                  }

                  if(var33 == 0) {
                     this.field_6981 = this.field_6993;
                     this.field_7001 = this.field_7013;
                     if(var8 != null) {
                        break label671;
                     }
                  }
               }

               this.field_6981 = this.getAmbientOcclusionLightValue(var2 + 1, var3 - 1, var4);
               this.field_7001 = var1.method_2444(this.field_6952, var2 + 1, var3 - 1, var4);
            }

            label661: {
               label660: {
                  var33 = var17;
                  if(var8 != null) {
                     if(var17 != 0) {
                        break label660;
                     }

                     var33 = var19;
                  }

                  if(var33 == 0) {
                     this.field_6988 = this.field_6993;
                     this.field_7008 = this.field_7013;
                     if(var8 != null) {
                        break label661;
                     }
                  }
               }

               this.field_6988 = this.getAmbientOcclusionLightValue(var2 + 1, var3 + 1, var4);
               this.field_7008 = var1.method_2444(this.field_6952, var2 + 1, var3 + 1, var4);
            }

            double var45;
            var33 = (var45 = this.field_6964 - 0.0D) == 0.0D?0:(var45 < 0.0D?-1:1);
            if(var8 != null) {
               if(var33 <= 0) {
                  ++var4;
               }

               var33 = var15;
            }

            label650: {
               label649: {
                  var21 = var33;
                  double var46;
                  var33 = (var46 = this.field_6964 - 0.0D) == 0.0D?0:(var46 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var33 > 0) {
                        var35 = this;
                        if(var8 == null) {
                           break label650;
                        }

                        if(this.field_6952.getBlock(var2, var3, var4 - 1).method_2453()) {
                           break label649;
                        }
                     }

                     var33 = var1.method_2444(this.field_6952, var2, var3, var4 - 1);
                  }

                  var21 = var33;
               }

               var35 = this;
            }

            label639: {
               var22 = var35.getAmbientOcclusionLightValue(var2, var3, var4 - 1);
               var23 = (this.field_6992 + this.field_6984 + var22 + this.field_6987) / 4.0F;
               var24 = (var22 + this.field_6987 + this.field_6993 + this.field_6988) / 4.0F;
               var25 = (this.field_6979 + var22 + this.field_6981 + this.field_6993) / 4.0F;
               var26 = (this.field_6976 + this.field_6992 + this.field_6979 + var22) / 4.0F;
               var10 = (float)((double)var23 * this.field_6963 * (1.0D - this.field_6960) + (double)var24 * this.field_6963 * this.field_6960 + (double)var25 * (1.0D - this.field_6963) * this.field_6960 + (double)var26 * (1.0D - this.field_6963) * (1.0D - this.field_6960));
               var11 = (float)((double)var23 * this.field_6963 * (1.0D - this.field_6961) + (double)var24 * this.field_6963 * this.field_6961 + (double)var25 * (1.0D - this.field_6963) * this.field_6961 + (double)var26 * (1.0D - this.field_6963) * (1.0D - this.field_6961));
               var12 = (float)((double)var23 * this.field_6962 * (1.0D - this.field_6961) + (double)var24 * this.field_6962 * this.field_6961 + (double)var25 * (1.0D - this.field_6962) * this.field_6961 + (double)var26 * (1.0D - this.field_6962) * (1.0D - this.field_6961));
               var13 = (float)((double)var23 * this.field_6962 * (1.0D - this.field_6960) + (double)var24 * this.field_6962 * this.field_6960 + (double)var25 * (1.0D - this.field_6962) * this.field_6960 + (double)var26 * (1.0D - this.field_6962) * (1.0D - this.field_6960));
               var27 = this.method_7265(this.field_7012, this.field_7004, this.field_7007, var21);
               var28 = this.method_7265(this.field_7007, this.field_7013, this.field_7008, var21);
               var29 = this.method_7265(this.field_6999, this.field_7001, this.field_7013, var21);
               var30 = this.method_7265(this.field_6996, this.field_7012, this.field_6999, var21);
               this.field_7016 = this.method_7266(var27, var28, var29, var30, this.field_6963 * (1.0D - this.field_6960), this.field_6963 * this.field_6960, (1.0D - this.field_6963) * this.field_6960, (1.0D - this.field_6963) * (1.0D - this.field_6960));
               this.field_7017 = this.method_7266(var27, var28, var29, var30, this.field_6963 * (1.0D - this.field_6961), this.field_6963 * this.field_6961, (1.0D - this.field_6963) * this.field_6961, (1.0D - this.field_6963) * (1.0D - this.field_6961));
               this.field_7018 = this.method_7266(var27, var28, var29, var30, this.field_6962 * (1.0D - this.field_6961), this.field_6962 * this.field_6961, (1.0D - this.field_6962) * this.field_6961, (1.0D - this.field_6962) * (1.0D - this.field_6961));
               this.field_7019 = this.method_7266(var27, var28, var29, var30, this.field_6962 * (1.0D - this.field_6960), this.field_6962 * this.field_6960, (1.0D - this.field_6962) * this.field_6960, (1.0D - this.field_6962) * (1.0D - this.field_6960));
               if(var8 != null) {
                  if(var14) {
                     this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5 * 0.8F;
                     this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6 * 0.8F;
                     this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7 * 0.8F;
                     if(var8 != null) {
                        break label639;
                     }
                  }

                  this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = 0.8F;
                  this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = 0.8F;
               }

               this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = 0.8F;
            }

            this.field_7020 *= var10;
            this.field_7024 *= var10;
            this.field_7028 *= var10;
            this.field_7021 *= var11;
            this.field_7025 *= var11;
            this.field_7029 *= var11;
            this.field_7022 *= var12;
            this.field_7026 *= var12;
            this.field_7030 *= var12;
            this.field_7023 *= var13;
            this.field_7027 *= var13;
            this.field_7031 *= var13;
            var31 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 2);
            this.drawTextBox2(var1, (double)var2, (double)var3, (double)var4, var31);
            var36 = field_6957;
            if(var8 != null) {
               label631: {
                  if(field_6957) {
                     var37 = var31.method_374();
                     var32 = field_7032;
                     var36 = var37.equals("grass_side");
                     if(var8 == null) {
                        break label631;
                     }

                     if(var36) {
                        var36 = this.method_7206();
                        if(var8 == null) {
                           break label631;
                        }

                        if(!var36) {
                           this.field_7020 *= var5;
                           this.field_7021 *= var5;
                           this.field_7022 *= var5;
                           this.field_7023 *= var5;
                           this.field_7024 *= var6;
                           this.field_7025 *= var6;
                           this.field_7026 *= var6;
                           this.field_7027 *= var6;
                           this.field_7028 *= var7;
                           this.field_7029 *= var7;
                           this.field_7030 *= var7;
                           this.field_7031 *= var7;
                           this.drawTextBox2(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                        }
                     }
                  }

                  var36 = true;
               }
            }

            var9 = var36;
         }

         var33 = this.field_6956;
      }

      label622: {
         label852: {
            if(var8 != null) {
               if(var33 == 0) {
                  var33 = var1.method_2445(this.field_6952, var2, var3, var4 + 1, 3);
                  if(var8 == null) {
                     break label622;
                  }

                  if(var33 == 0) {
                     break label852;
                  }
               }

               double var47;
               var33 = (var47 = this.field_6965 - 1.0D) == 0.0D?0:(var47 < 0.0D?-1:1);
            }

            if(var8 != null) {
               if(var33 >= 0) {
                  ++var4;
               }

               this.field_6994 = this.getAmbientOcclusionLightValue(var2 - 1, var3, var4);
               this.field_6995 = this.getAmbientOcclusionLightValue(var2 + 1, var3, var4);
               this.field_6980 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4);
               this.field_6990 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4);
               this.field_7014 = var1.method_2444(this.field_6952, var2 - 1, var3, var4);
               this.field_7015 = var1.method_2444(this.field_6952, var2 + 1, var3, var4);
               this.field_7000 = var1.method_2444(this.field_6952, var2, var3 - 1, var4);
               this.field_7010 = var1.method_2444(this.field_6952, var2, var3 + 1, var4);
               var33 = this.field_6952.getBlock(var2 + 1, var3, var4 + 1).method_2421();
            }

            label610: {
               var17 = var33;
               var18 = this.field_6952.getBlock(var2 - 1, var3, var4 + 1).method_2421();
               var19 = this.field_6952.getBlock(var2, var3 + 1, var4 + 1).method_2421();
               var20 = this.field_6952.getBlock(var2, var3 - 1, var4 + 1).method_2421();
               if(var8 != null) {
                  if(var18 == 0 && var20 == 0) {
                     this.field_6978 = this.field_6994;
                     this.field_6998 = this.field_7014;
                     if(var8 != null) {
                        break label610;
                     }
                  }

                  this.field_6978 = this.getAmbientOcclusionLightValue(var2 - 1, var3 - 1, var4);
               }

               this.field_6998 = var1.method_2444(this.field_6952, var2 - 1, var3 - 1, var4);
            }

            label602: {
               label601: {
                  var34 = var18;
                  if(var8 != null) {
                     if(var18 != 0) {
                        break label601;
                     }

                     var34 = var19;
                  }

                  if(var34 == 0) {
                     this.field_6986 = this.field_6994;
                     this.field_7006 = this.field_7014;
                     if(var8 != null) {
                        break label602;
                     }
                  }
               }

               this.field_6986 = this.getAmbientOcclusionLightValue(var2 - 1, var3 + 1, var4);
               this.field_7006 = var1.method_2444(this.field_6952, var2 - 1, var3 + 1, var4);
            }

            label592: {
               label591: {
                  var33 = var17;
                  if(var8 != null) {
                     if(var17 != 0) {
                        break label591;
                     }

                     var33 = var20;
                  }

                  if(var33 == 0) {
                     this.field_6983 = this.field_6995;
                     this.field_7003 = this.field_7015;
                     if(var8 != null) {
                        break label592;
                     }
                  }
               }

               this.field_6983 = this.getAmbientOcclusionLightValue(var2 + 1, var3 - 1, var4);
               this.field_7003 = var1.method_2444(this.field_6952, var2 + 1, var3 - 1, var4);
            }

            label582: {
               label581: {
                  var33 = var17;
                  if(var8 != null) {
                     if(var17 != 0) {
                        break label581;
                     }

                     var33 = var19;
                  }

                  if(var33 == 0) {
                     this.field_6991 = this.field_6995;
                     this.field_7011 = this.field_7015;
                     if(var8 != null) {
                        break label582;
                     }
                  }
               }

               this.field_6991 = this.getAmbientOcclusionLightValue(var2 + 1, var3 + 1, var4);
               this.field_7011 = var1.method_2444(this.field_6952, var2 + 1, var3 + 1, var4);
            }

            double var48;
            var33 = (var48 = this.field_6965 - 1.0D) == 0.0D?0:(var48 < 0.0D?-1:1);
            if(var8 != null) {
               if(var33 >= 0) {
                  --var4;
               }

               var33 = var15;
            }

            label571: {
               label570: {
                  var21 = var33;
                  double var49;
                  var33 = (var49 = this.field_6965 - 1.0D) == 0.0D?0:(var49 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var33 < 0) {
                        var35 = this;
                        if(var8 == null) {
                           break label571;
                        }

                        if(this.field_6952.getBlock(var2, var3, var4 + 1).method_2453()) {
                           break label570;
                        }
                     }

                     var33 = var1.method_2444(this.field_6952, var2, var3, var4 + 1);
                  }

                  var21 = var33;
               }

               var35 = this;
            }

            label560: {
               var22 = var35.getAmbientOcclusionLightValue(var2, var3, var4 + 1);
               var23 = (this.field_6994 + this.field_6986 + var22 + this.field_6990) / 4.0F;
               var24 = (var22 + this.field_6990 + this.field_6995 + this.field_6991) / 4.0F;
               var25 = (this.field_6980 + var22 + this.field_6983 + this.field_6995) / 4.0F;
               var26 = (this.field_6978 + this.field_6994 + this.field_6980 + var22) / 4.0F;
               var10 = (float)((double)var23 * this.field_6963 * (1.0D - this.field_6960) + (double)var24 * this.field_6963 * this.field_6960 + (double)var25 * (1.0D - this.field_6963) * this.field_6960 + (double)var26 * (1.0D - this.field_6963) * (1.0D - this.field_6960));
               var11 = (float)((double)var23 * this.field_6962 * (1.0D - this.field_6960) + (double)var24 * this.field_6962 * this.field_6960 + (double)var25 * (1.0D - this.field_6962) * this.field_6960 + (double)var26 * (1.0D - this.field_6962) * (1.0D - this.field_6960));
               var12 = (float)((double)var23 * this.field_6962 * (1.0D - this.field_6961) + (double)var24 * this.field_6962 * this.field_6961 + (double)var25 * (1.0D - this.field_6962) * this.field_6961 + (double)var26 * (1.0D - this.field_6962) * (1.0D - this.field_6961));
               var13 = (float)((double)var23 * this.field_6963 * (1.0D - this.field_6961) + (double)var24 * this.field_6963 * this.field_6961 + (double)var25 * (1.0D - this.field_6963) * this.field_6961 + (double)var26 * (1.0D - this.field_6963) * (1.0D - this.field_6961));
               var27 = this.method_7265(this.field_7014, this.field_7006, this.field_7010, var21);
               var28 = this.method_7265(this.field_7010, this.field_7015, this.field_7011, var21);
               var29 = this.method_7265(this.field_7000, this.field_7003, this.field_7015, var21);
               var30 = this.method_7265(this.field_6998, this.field_7014, this.field_7000, var21);
               this.field_7016 = this.method_7266(var27, var30, var29, var28, this.field_6963 * (1.0D - this.field_6960), (1.0D - this.field_6963) * (1.0D - this.field_6960), (1.0D - this.field_6963) * this.field_6960, this.field_6963 * this.field_6960);
               this.field_7017 = this.method_7266(var27, var30, var29, var28, this.field_6962 * (1.0D - this.field_6960), (1.0D - this.field_6962) * (1.0D - this.field_6960), (1.0D - this.field_6962) * this.field_6960, this.field_6962 * this.field_6960);
               this.field_7018 = this.method_7266(var27, var30, var29, var28, this.field_6962 * (1.0D - this.field_6961), (1.0D - this.field_6962) * (1.0D - this.field_6961), (1.0D - this.field_6962) * this.field_6961, this.field_6962 * this.field_6961);
               this.field_7019 = this.method_7266(var27, var30, var29, var28, this.field_6963 * (1.0D - this.field_6961), (1.0D - this.field_6963) * (1.0D - this.field_6961), (1.0D - this.field_6963) * this.field_6961, this.field_6963 * this.field_6961);
               if(var8 != null) {
                  if(var14) {
                     this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5 * 0.8F;
                     this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6 * 0.8F;
                     this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7 * 0.8F;
                     if(var8 != null) {
                        break label560;
                     }
                  }

                  this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = 0.8F;
                  this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = 0.8F;
               }

               this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = 0.8F;
            }

            this.field_7020 *= var10;
            this.field_7024 *= var10;
            this.field_7028 *= var10;
            this.field_7021 *= var11;
            this.field_7025 *= var11;
            this.field_7029 *= var11;
            this.field_7022 *= var12;
            this.field_7026 *= var12;
            this.field_7030 *= var12;
            this.field_7023 *= var13;
            this.field_7027 *= var13;
            this.field_7031 *= var13;
            var31 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 3);
            this.drawTextBox3(var1, (double)var2, (double)var3, (double)var4, var31);
            var36 = field_6957;
            if(var8 != null) {
               label552: {
                  if(field_6957) {
                     var37 = var31.method_374();
                     var32 = field_7032;
                     var36 = var37.equals("grass_side");
                     if(var8 == null) {
                        break label552;
                     }

                     if(var36) {
                        var36 = this.method_7206();
                        if(var8 == null) {
                           break label552;
                        }

                        if(!var36) {
                           this.field_7020 *= var5;
                           this.field_7021 *= var5;
                           this.field_7022 *= var5;
                           this.field_7023 *= var5;
                           this.field_7024 *= var6;
                           this.field_7025 *= var6;
                           this.field_7026 *= var6;
                           this.field_7027 *= var6;
                           this.field_7028 *= var7;
                           this.field_7029 *= var7;
                           this.field_7030 *= var7;
                           this.field_7031 *= var7;
                           this.drawTextBox3(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                        }
                     }
                  }

                  var36 = true;
               }
            }

            var9 = var36;
         }

         var33 = this.field_6956;
      }

      label543: {
         label853: {
            if(var8 != null) {
               if(var33 == 0) {
                  var33 = var1.method_2445(this.field_6952, var2 - 1, var3, var4, 4);
                  if(var8 == null) {
                     break label543;
                  }

                  if(var33 == 0) {
                     break label853;
                  }
               }

               double var50;
               var33 = (var50 = this.field_6960 - 0.0D) == 0.0D?0:(var50 < 0.0D?-1:1);
            }

            if(var8 != null) {
               if(var33 <= 0) {
                  --var2;
               }

               this.field_6977 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4);
               this.field_6992 = this.getAmbientOcclusionLightValue(var2, var3, var4 - 1);
               this.field_6994 = this.getAmbientOcclusionLightValue(var2, var3, var4 + 1);
               this.field_6985 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4);
               this.field_6997 = var1.method_2444(this.field_6952, var2, var3 - 1, var4);
               this.field_7012 = var1.method_2444(this.field_6952, var2, var3, var4 - 1);
               this.field_7014 = var1.method_2444(this.field_6952, var2, var3, var4 + 1);
               this.field_7005 = var1.method_2444(this.field_6952, var2, var3 + 1, var4);
               var33 = this.field_6952.getBlock(var2 - 1, var3 + 1, var4).method_2421();
            }

            label531: {
               var17 = var33;
               var18 = this.field_6952.getBlock(var2 - 1, var3 - 1, var4).method_2421();
               var19 = this.field_6952.getBlock(var2 - 1, var3, var4 - 1).method_2421();
               var20 = this.field_6952.getBlock(var2 - 1, var3, var4 + 1).method_2421();
               if(var8 != null) {
                  if(var19 == 0 && var18 == 0) {
                     this.field_6976 = this.field_6992;
                     this.field_6996 = this.field_7012;
                     if(var8 != null) {
                        break label531;
                     }
                  }

                  this.field_6976 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4 - 1);
               }

               this.field_6996 = var1.method_2444(this.field_6952, var2, var3 - 1, var4 - 1);
            }

            label523: {
               label522: {
                  var34 = var20;
                  if(var8 != null) {
                     if(var20 != 0) {
                        break label522;
                     }

                     var34 = var18;
                  }

                  if(var34 == 0) {
                     this.field_6978 = this.field_6994;
                     this.field_6998 = this.field_7014;
                     if(var8 != null) {
                        break label523;
                     }
                  }
               }

               this.field_6978 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4 + 1);
               this.field_6998 = var1.method_2444(this.field_6952, var2, var3 - 1, var4 + 1);
            }

            label513: {
               label512: {
                  var33 = var19;
                  if(var8 != null) {
                     if(var19 != 0) {
                        break label512;
                     }

                     var33 = var17;
                  }

                  if(var33 == 0) {
                     this.field_6984 = this.field_6992;
                     this.field_7004 = this.field_7012;
                     if(var8 != null) {
                        break label513;
                     }
                  }
               }

               this.field_6984 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4 - 1);
               this.field_7004 = var1.method_2444(this.field_6952, var2, var3 + 1, var4 - 1);
            }

            label503: {
               label502: {
                  var33 = var20;
                  if(var8 != null) {
                     if(var20 != 0) {
                        break label502;
                     }

                     var33 = var17;
                  }

                  if(var33 == 0) {
                     this.field_6986 = this.field_6994;
                     this.field_7006 = this.field_7014;
                     if(var8 != null) {
                        break label503;
                     }
                  }
               }

               this.field_6986 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4 + 1);
               this.field_7006 = var1.method_2444(this.field_6952, var2, var3 + 1, var4 + 1);
            }

            double var51;
            var33 = (var51 = this.field_6960 - 0.0D) == 0.0D?0:(var51 < 0.0D?-1:1);
            if(var8 != null) {
               if(var33 <= 0) {
                  ++var2;
               }

               var33 = var15;
            }

            label492: {
               label491: {
                  var21 = var33;
                  double var52;
                  var33 = (var52 = this.field_6960 - 0.0D) == 0.0D?0:(var52 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var33 > 0) {
                        var35 = this;
                        if(var8 == null) {
                           break label492;
                        }

                        if(this.field_6952.getBlock(var2 - 1, var3, var4).method_2453()) {
                           break label491;
                        }
                     }

                     var33 = var1.method_2444(this.field_6952, var2 - 1, var3, var4);
                  }

                  var21 = var33;
               }

               var35 = this;
            }

            label481: {
               var22 = var35.getAmbientOcclusionLightValue(var2 - 1, var3, var4);
               var23 = (this.field_6977 + this.field_6978 + var22 + this.field_6994) / 4.0F;
               var24 = (var22 + this.field_6994 + this.field_6985 + this.field_6986) / 4.0F;
               var25 = (this.field_6992 + var22 + this.field_6984 + this.field_6985) / 4.0F;
               var26 = (this.field_6976 + this.field_6977 + this.field_6992 + var22) / 4.0F;
               var10 = (float)((double)var24 * this.field_6963 * this.field_6965 + (double)var25 * this.field_6963 * (1.0D - this.field_6965) + (double)var26 * (1.0D - this.field_6963) * (1.0D - this.field_6965) + (double)var23 * (1.0D - this.field_6963) * this.field_6965);
               var11 = (float)((double)var24 * this.field_6963 * this.field_6964 + (double)var25 * this.field_6963 * (1.0D - this.field_6964) + (double)var26 * (1.0D - this.field_6963) * (1.0D - this.field_6964) + (double)var23 * (1.0D - this.field_6963) * this.field_6964);
               var12 = (float)((double)var24 * this.field_6962 * this.field_6964 + (double)var25 * this.field_6962 * (1.0D - this.field_6964) + (double)var26 * (1.0D - this.field_6962) * (1.0D - this.field_6964) + (double)var23 * (1.0D - this.field_6962) * this.field_6964);
               var13 = (float)((double)var24 * this.field_6962 * this.field_6965 + (double)var25 * this.field_6962 * (1.0D - this.field_6965) + (double)var26 * (1.0D - this.field_6962) * (1.0D - this.field_6965) + (double)var23 * (1.0D - this.field_6962) * this.field_6965);
               var27 = this.method_7265(this.field_6997, this.field_6998, this.field_7014, var21);
               var28 = this.method_7265(this.field_7014, this.field_7005, this.field_7006, var21);
               var29 = this.method_7265(this.field_7012, this.field_7004, this.field_7005, var21);
               var30 = this.method_7265(this.field_6996, this.field_6997, this.field_7012, var21);
               this.field_7016 = this.method_7266(var28, var29, var30, var27, this.field_6963 * this.field_6965, this.field_6963 * (1.0D - this.field_6965), (1.0D - this.field_6963) * (1.0D - this.field_6965), (1.0D - this.field_6963) * this.field_6965);
               this.field_7017 = this.method_7266(var28, var29, var30, var27, this.field_6963 * this.field_6964, this.field_6963 * (1.0D - this.field_6964), (1.0D - this.field_6963) * (1.0D - this.field_6964), (1.0D - this.field_6963) * this.field_6964);
               this.field_7018 = this.method_7266(var28, var29, var30, var27, this.field_6962 * this.field_6964, this.field_6962 * (1.0D - this.field_6964), (1.0D - this.field_6962) * (1.0D - this.field_6964), (1.0D - this.field_6962) * this.field_6964);
               this.field_7019 = this.method_7266(var28, var29, var30, var27, this.field_6962 * this.field_6965, this.field_6962 * (1.0D - this.field_6965), (1.0D - this.field_6962) * (1.0D - this.field_6965), (1.0D - this.field_6962) * this.field_6965);
               if(var8 != null) {
                  if(var14) {
                     this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5 * 0.6F;
                     this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6 * 0.6F;
                     this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7 * 0.6F;
                     if(var8 != null) {
                        break label481;
                     }
                  }

                  this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = 0.6F;
                  this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = 0.6F;
               }

               this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = 0.6F;
            }

            this.field_7020 *= var10;
            this.field_7024 *= var10;
            this.field_7028 *= var10;
            this.field_7021 *= var11;
            this.field_7025 *= var11;
            this.field_7029 *= var11;
            this.field_7022 *= var12;
            this.field_7026 *= var12;
            this.field_7030 *= var12;
            this.field_7023 *= var13;
            this.field_7027 *= var13;
            this.field_7031 *= var13;
            var31 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 4);
            this.drawTextBox4(var1, (double)var2, (double)var3, (double)var4, var31);
            var36 = field_6957;
            if(var8 != null) {
               label473: {
                  if(field_6957) {
                     var37 = var31.method_374();
                     var32 = field_7032;
                     var36 = var37.equals("grass_side");
                     if(var8 == null) {
                        break label473;
                     }

                     if(var36) {
                        var36 = this.method_7206();
                        if(var8 == null) {
                           break label473;
                        }

                        if(!var36) {
                           this.field_7020 *= var5;
                           this.field_7021 *= var5;
                           this.field_7022 *= var5;
                           this.field_7023 *= var5;
                           this.field_7024 *= var6;
                           this.field_7025 *= var6;
                           this.field_7026 *= var6;
                           this.field_7027 *= var6;
                           this.field_7028 *= var7;
                           this.field_7029 *= var7;
                           this.field_7030 *= var7;
                           this.field_7031 *= var7;
                           this.drawTextBox4(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                        }
                     }
                  }

                  var36 = true;
               }
            }

            var9 = var36;
         }

         var33 = this.field_6956;
      }

      label854: {
         if(var8 != null) {
            if(var33 == 0) {
               var36 = var1.method_2445(this.field_6952, var2 + 1, var3, var4, 5);
               if(var8 == null) {
                  return var36;
               }

               if(!var36) {
                  break label854;
               }
            }

            double var53;
            var33 = (var53 = this.field_6961 - 1.0D) == 0.0D?0:(var53 < 0.0D?-1:1);
         }

         if(var8 != null) {
            if(var33 >= 0) {
               ++var2;
            }

            this.field_6982 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4);
            this.field_6993 = this.getAmbientOcclusionLightValue(var2, var3, var4 - 1);
            this.field_6995 = this.getAmbientOcclusionLightValue(var2, var3, var4 + 1);
            this.field_6989 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4);
            this.field_7002 = var1.method_2444(this.field_6952, var2, var3 - 1, var4);
            this.field_7013 = var1.method_2444(this.field_6952, var2, var3, var4 - 1);
            this.field_7015 = var1.method_2444(this.field_6952, var2, var3, var4 + 1);
            this.field_7009 = var1.method_2444(this.field_6952, var2, var3 + 1, var4);
            var33 = this.field_6952.getBlock(var2 + 1, var3 + 1, var4).method_2421();
         }

         label452: {
            var17 = var33;
            var18 = this.field_6952.getBlock(var2 + 1, var3 - 1, var4).method_2421();
            var19 = this.field_6952.getBlock(var2 + 1, var3, var4 + 1).method_2421();
            var20 = this.field_6952.getBlock(var2 + 1, var3, var4 - 1).method_2421();
            if(var8 != null) {
               if(var18 == 0 && var20 == 0) {
                  this.field_6981 = this.field_6993;
                  this.field_7001 = this.field_7013;
                  if(var8 != null) {
                     break label452;
                  }
               }

               this.field_6981 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4 - 1);
            }

            this.field_7001 = var1.method_2444(this.field_6952, var2, var3 - 1, var4 - 1);
         }

         label444: {
            label443: {
               var34 = var18;
               if(var8 != null) {
                  if(var18 != 0) {
                     break label443;
                  }

                  var34 = var19;
               }

               if(var34 == 0) {
                  this.field_6983 = this.field_6995;
                  this.field_7003 = this.field_7015;
                  if(var8 != null) {
                     break label444;
                  }
               }
            }

            this.field_6983 = this.getAmbientOcclusionLightValue(var2, var3 - 1, var4 + 1);
            this.field_7003 = var1.method_2444(this.field_6952, var2, var3 - 1, var4 + 1);
         }

         label434: {
            label433: {
               var33 = var17;
               if(var8 != null) {
                  if(var17 != 0) {
                     break label433;
                  }

                  var33 = var20;
               }

               if(var33 == 0) {
                  this.field_6988 = this.field_6993;
                  this.field_7008 = this.field_7013;
                  if(var8 != null) {
                     break label434;
                  }
               }
            }

            this.field_6988 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4 - 1);
            this.field_7008 = var1.method_2444(this.field_6952, var2, var3 + 1, var4 - 1);
         }

         label424: {
            label423: {
               var33 = var17;
               if(var8 != null) {
                  if(var17 != 0) {
                     break label423;
                  }

                  var33 = var19;
               }

               if(var33 == 0) {
                  this.field_6991 = this.field_6995;
                  this.field_7011 = this.field_7015;
                  if(var8 != null) {
                     break label424;
                  }
               }
            }

            this.field_6991 = this.getAmbientOcclusionLightValue(var2, var3 + 1, var4 + 1);
            this.field_7011 = var1.method_2444(this.field_6952, var2, var3 + 1, var4 + 1);
         }

         double var54;
         var33 = (var54 = this.field_6961 - 1.0D) == 0.0D?0:(var54 < 0.0D?-1:1);
         if(var8 != null) {
            if(var33 >= 0) {
               --var2;
            }

            var33 = var15;
         }

         label413: {
            label412: {
               var21 = var33;
               double var55;
               var33 = (var55 = this.field_6961 - 1.0D) == 0.0D?0:(var55 < 0.0D?-1:1);
               if(var8 != null) {
                  if(var33 < 0) {
                     var35 = this;
                     if(var8 == null) {
                        break label413;
                     }

                     if(this.field_6952.getBlock(var2 + 1, var3, var4).method_2453()) {
                        break label412;
                     }
                  }

                  var33 = var1.method_2444(this.field_6952, var2 + 1, var3, var4);
               }

               var21 = var33;
            }

            var35 = this;
         }

         label402: {
            var22 = var35.getAmbientOcclusionLightValue(var2 + 1, var3, var4);
            var23 = (this.field_6982 + this.field_6983 + var22 + this.field_6995) / 4.0F;
            var24 = (this.field_6981 + this.field_6982 + this.field_6993 + var22) / 4.0F;
            var25 = (this.field_6993 + var22 + this.field_6988 + this.field_6989) / 4.0F;
            var26 = (var22 + this.field_6995 + this.field_6989 + this.field_6991) / 4.0F;
            var10 = (float)((double)var23 * (1.0D - this.field_6962) * this.field_6965 + (double)var24 * (1.0D - this.field_6962) * (1.0D - this.field_6965) + (double)var25 * this.field_6962 * (1.0D - this.field_6965) + (double)var26 * this.field_6962 * this.field_6965);
            var11 = (float)((double)var23 * (1.0D - this.field_6962) * this.field_6964 + (double)var24 * (1.0D - this.field_6962) * (1.0D - this.field_6964) + (double)var25 * this.field_6962 * (1.0D - this.field_6964) + (double)var26 * this.field_6962 * this.field_6964);
            var12 = (float)((double)var23 * (1.0D - this.field_6963) * this.field_6964 + (double)var24 * (1.0D - this.field_6963) * (1.0D - this.field_6964) + (double)var25 * this.field_6963 * (1.0D - this.field_6964) + (double)var26 * this.field_6963 * this.field_6964);
            var13 = (float)((double)var23 * (1.0D - this.field_6963) * this.field_6965 + (double)var24 * (1.0D - this.field_6963) * (1.0D - this.field_6965) + (double)var25 * this.field_6963 * (1.0D - this.field_6965) + (double)var26 * this.field_6963 * this.field_6965);
            var27 = this.method_7265(this.field_7002, this.field_7003, this.field_7015, var21);
            var28 = this.method_7265(this.field_7015, this.field_7009, this.field_7011, var21);
            var29 = this.method_7265(this.field_7013, this.field_7008, this.field_7009, var21);
            var30 = this.method_7265(this.field_7001, this.field_7002, this.field_7013, var21);
            this.field_7016 = this.method_7266(var27, var30, var29, var28, (1.0D - this.field_6962) * this.field_6965, (1.0D - this.field_6962) * (1.0D - this.field_6965), this.field_6962 * (1.0D - this.field_6965), this.field_6962 * this.field_6965);
            this.field_7017 = this.method_7266(var27, var30, var29, var28, (1.0D - this.field_6962) * this.field_6964, (1.0D - this.field_6962) * (1.0D - this.field_6964), this.field_6962 * (1.0D - this.field_6964), this.field_6962 * this.field_6964);
            this.field_7018 = this.method_7266(var27, var30, var29, var28, (1.0D - this.field_6963) * this.field_6964, (1.0D - this.field_6963) * (1.0D - this.field_6964), this.field_6963 * (1.0D - this.field_6964), this.field_6963 * this.field_6964);
            this.field_7019 = this.method_7266(var27, var30, var29, var28, (1.0D - this.field_6963) * this.field_6965, (1.0D - this.field_6963) * (1.0D - this.field_6965), this.field_6963 * (1.0D - this.field_6965), this.field_6963 * this.field_6965);
            if(var8 != null) {
               if(var14) {
                  this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = var5 * 0.6F;
                  this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = var6 * 0.6F;
                  this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = var7 * 0.6F;
                  if(var8 != null) {
                     break label402;
                  }
               }

               this.field_7020 = this.field_7021 = this.field_7022 = this.field_7023 = 0.6F;
               this.field_7024 = this.field_7025 = this.field_7026 = this.field_7027 = 0.6F;
            }

            this.field_7028 = this.field_7029 = this.field_7030 = this.field_7031 = 0.6F;
         }

         this.field_7020 *= var10;
         this.field_7024 *= var10;
         this.field_7028 *= var10;
         this.field_7021 *= var11;
         this.field_7025 *= var11;
         this.field_7029 *= var11;
         this.field_7022 *= var12;
         this.field_7026 *= var12;
         this.field_7030 *= var12;
         this.field_7023 *= var13;
         this.field_7027 *= var13;
         this.field_7031 *= var13;
         var31 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 5);
         this.drawTextBox5(var1, (double)var2, (double)var3, (double)var4, var31);
         var36 = field_6957;
         if(var8 != null) {
            label394: {
               if(field_6957) {
                  var37 = var31.method_374();
                  String[] var10001 = field_7032;
                  var36 = var37.equals("grass_side");
                  if(var8 == null) {
                     break label394;
                  }

                  if(var36) {
                     var36 = this.method_7206();
                     if(var8 == null) {
                        break label394;
                     }

                     if(!var36) {
                        this.field_7020 *= var5;
                        this.field_7021 *= var5;
                        this.field_7022 *= var5;
                        this.field_7023 *= var5;
                        this.field_7024 *= var6;
                        this.field_7025 *= var6;
                        this.field_7026 *= var6;
                        this.field_7027 *= var6;
                        this.field_7028 *= var7;
                        this.field_7029 *= var7;
                        this.field_7030 *= var7;
                        this.field_7031 *= var7;
                        this.drawTextBox5(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                     }
                  }
               }

               var36 = true;
            }
         }

         var9 = var36;
      }

      this.field_6975 = false;
      var36 = var9;
      return var36;
   }

   // $FF: renamed from: a (int, int, int, int) int
   public int method_7265(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var1;
      if(var5 != null) {
         if(var1 == 0) {
            var1 = var4;
         }

         var10000 = var2;
      }

      if(var5 != null) {
         if(var10000 == 0) {
            var2 = var4;
         }

         var10000 = var3;
      }

      if(var5 != null) {
         if(var10000 == 0) {
            var3 = var4;
         }

         var10000 = var1 + var2 + var3 + var4 >> 2 & 16711935;
      }

      return var10000;
   }

   // $FF: renamed from: a (int, int, int, int, double, double, double, double) int
   public int method_7266(int var1, int var2, int var3, int var4, double var5, double var7, double var9, double var11) {
      int var13 = (int)((double)(var1 >> 16 & 255) * var5 + (double)(var2 >> 16 & 255) * var7 + (double)(var3 >> 16 & 255) * var9 + (double)(var4 >> 16 & 255) * var11) & 255;
      int var14 = (int)((double)(var1 & 255) * var5 + (double)(var2 & 255) * var7 + (double)(var3 & 255) * var9 + (double)(var4 & 255) * var11) & 255;
      return var13 << 16 | var14;
   }

   // $FF: renamed from: d (aji, int, int, int, float, float, float) boolean
   public boolean method_7267(aji var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      String[] var8;
      boolean var9;
      boolean var20;
      label536: {
         label539: {
            String[] var10000 = class_752.method_4253();
            this.field_6975 = false;
            var8 = var10000;
            var9 = bmh.instance.defaultTexture;
            var20 = Config.isBetterGrass();
            if(var8 != null) {
               if(!var20) {
                  break label539;
               }

               var20 = var9;
            }

            if(var8 == null) {
               break label536;
            }

            if(var20) {
               var20 = true;
               break label536;
            }
         }

         var20 = false;
      }

      boolean var10;
      bmh var11;
      boolean var12;
      int var13;
      float var14;
      float var15;
      float var16;
      float var17;
      int var10001;
      int var21;
      label525: {
         label540: {
            var10 = var20;
            var11 = bmh.instance;
            var12 = false;
            var13 = -1;
            var21 = this.field_6956;
            if(var8 != null) {
               if(!this.field_6956) {
                  var21 = var1.method_2445(this.field_6952, var2, var3 - 1, var4, 0);
                  if(var8 == null) {
                     break label525;
                  }

                  if(var21 == 0) {
                     break label540;
                  }
               }

               var21 = var13;
            }

            label514: {
               if(var8 != null) {
                  if(var21 >= 0) {
                     break label514;
                  }

                  var21 = var1.method_2444(this.field_6952, var2, var3, var4);
               }

               var13 = var21;
            }

            label508: {
               var14 = 0.5F;
               var15 = var14;
               var16 = var14;
               var17 = var14;
               if(var8 != null) {
                  if(var1 == class_1192.field_6027) {
                     break label508;
                  }

                  var15 = var14 * var5;
                  var16 = var14 * var6;
               }

               var17 = var14 * var7;
            }

            double var24;
            var10001 = (var24 = this.field_6962 - 0.0D) == 0.0D?0:(var24 < 0.0D?-1:1);
            if(var8 != null) {
               var10001 = var10001 > 0?var13:var1.method_2444(this.field_6952, var2, var3 - 1, var4);
            }

            var11.setVisible5(var10001);
            var11.setVisible6(var15, var16, var17);
            this.drawTextBox0(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 0));
            var12 = true;
         }

         var21 = this.field_6956;
      }

      label502: {
         label541: {
            if(var8 != null) {
               if(var21 == 0) {
                  var21 = var1.method_2445(this.field_6952, var2, var3 + 1, var4, 1);
                  if(var8 == null) {
                     break label502;
                  }

                  if(var21 == 0) {
                     break label541;
                  }
               }

               var21 = var13;
            }

            label491: {
               if(var8 != null) {
                  if(var21 >= 0) {
                     break label491;
                  }

                  var21 = var1.method_2444(this.field_6952, var2, var3, var4);
               }

               var13 = var21;
            }

            var14 = 1.0F;
            var15 = var14 * var5;
            var16 = var14 * var6;
            var17 = var14 * var7;
            double var25;
            var10001 = (var25 = this.field_6963 - 1.0D) == 0.0D?0:(var25 < 0.0D?-1:1);
            if(var8 != null) {
               var10001 = var10001 < 0?var13:var1.method_2444(this.field_6952, var2, var3 + 1, var4);
            }

            var11.setVisible5(var10001);
            var11.setVisible6(var15, var16, var17);
            this.drawTextBox1(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 1));
            var12 = true;
         }

         var21 = this.field_6956;
      }

      float var18;
      class_73 var19;
      class_73 var22;
      class_73 var23;
      label485: {
         label542: {
            if(var8 != null) {
               if(var21 == 0) {
                  var21 = var1.method_2445(this.field_6952, var2, var3, var4 - 1, 2);
                  if(var8 == null) {
                     break label485;
                  }

                  if(var21 == 0) {
                     break label542;
                  }
               }

               var21 = var13;
            }

            label474: {
               if(var8 != null) {
                  if(var21 >= 0) {
                     break label474;
                  }

                  var21 = var1.method_2444(this.field_6952, var2, var3, var4);
               }

               var13 = var21;
            }

            label468: {
               var15 = 0.8F;
               var16 = var15;
               var17 = var15;
               var18 = var15;
               if(var8 != null) {
                  if(var1 == class_1192.field_6027) {
                     break label468;
                  }

                  var16 = var15 * var5;
                  var17 = var15 * var6;
               }

               var18 = var15 * var7;
            }

            double var26;
            var10001 = (var26 = this.field_6964 - 0.0D) == 0.0D?0:(var26 < 0.0D?-1:1);
            if(var8 != null) {
               var10001 = var10001 > 0?var13:var1.method_2444(this.field_6952, var2, var3, var4 - 1);
            }

            var11.setVisible5(var10001);
            var11.setVisible6(var16, var17, var18);
            var19 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 2);
            var20 = var10;
            if(var8 != null) {
               if(var10) {
                  label458: {
                     label543: {
                        label544: {
                           label545: {
                              var23 = var19;
                              var22 = TextureUtils.iconGrassSide;
                              if(var8 != null) {
                                 if(var19 != TextureUtils.iconGrassSide) {
                                    var23 = var19;
                                    var22 = TextureUtils.iconMyceliumSide;
                                    if(var8 == null) {
                                       break label544;
                                    }

                                    if(var19 != TextureUtils.iconMyceliumSide) {
                                       break label545;
                                    }
                                 }

                                 var19 = Config.getSideGrassTexture(this.field_6952, var2, var3, var4, 2, var19);
                                 var23 = var19;
                                 var22 = TextureUtils.iconGrassTop;
                              }

                              if(var8 == null) {
                                 break label544;
                              }

                              if(var23 == var22) {
                                 var11.setVisible6(var16 * var5, var17 * var6, var18 * var7);
                              }
                           }

                           var23 = var19;
                           if(var8 == null) {
                              break label543;
                           }

                           var22 = TextureUtils.iconGrassSideSnowed;
                        }

                        if(var23 != var22) {
                           break label458;
                        }

                        var23 = Config.getSideSnowGrassTexture(this.field_6952, var2, var3, var4, 2);
                     }

                     var19 = var23;
                  }
               }

               this.drawTextBox2(var1, (double)var2, (double)var3, (double)var4, var19);
               var20 = var9;
            }

            if(var8 != null) {
               label436: {
                  if(var20) {
                     var20 = field_6957;
                     if(var8 == null) {
                        break label436;
                     }

                     if(field_6957 && var19 == TextureUtils.iconGrassSide) {
                        var20 = this.method_7206();
                        if(var8 == null) {
                           break label436;
                        }

                        if(!var20) {
                           var11.setVisible6(var16 * var5, var17 * var6, var18 * var7);
                           this.drawTextBox2(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                        }
                     }
                  }

                  var20 = true;
               }
            }

            var12 = var20;
         }

         var21 = this.field_6956;
      }

      label426: {
         label546: {
            if(var8 != null) {
               if(var21 == 0) {
                  var21 = var1.method_2445(this.field_6952, var2, var3, var4 + 1, 3);
                  if(var8 == null) {
                     break label426;
                  }

                  if(var21 == 0) {
                     break label546;
                  }
               }

               var21 = var13;
            }

            label415: {
               if(var8 != null) {
                  if(var21 >= 0) {
                     break label415;
                  }

                  var21 = var1.method_2444(this.field_6952, var2, var3, var4);
               }

               var13 = var21;
            }

            label409: {
               var15 = 0.8F;
               var16 = var15;
               var17 = var15;
               var18 = var15;
               if(var8 != null) {
                  if(var1 == class_1192.field_6027) {
                     break label409;
                  }

                  var16 = var15 * var5;
                  var17 = var15 * var6;
               }

               var18 = var15 * var7;
            }

            double var27;
            var10001 = (var27 = this.field_6965 - 1.0D) == 0.0D?0:(var27 < 0.0D?-1:1);
            if(var8 != null) {
               var10001 = var10001 < 0?var13:var1.method_2444(this.field_6952, var2, var3, var4 + 1);
            }

            var11.setVisible5(var10001);
            var11.setVisible6(var16, var17, var18);
            var19 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 3);
            var20 = var10;
            if(var8 != null) {
               if(var10) {
                  label399: {
                     label547: {
                        label548: {
                           label549: {
                              var23 = var19;
                              var22 = TextureUtils.iconGrassSide;
                              if(var8 != null) {
                                 if(var19 != TextureUtils.iconGrassSide) {
                                    var23 = var19;
                                    var22 = TextureUtils.iconMyceliumSide;
                                    if(var8 == null) {
                                       break label548;
                                    }

                                    if(var19 != TextureUtils.iconMyceliumSide) {
                                       break label549;
                                    }
                                 }

                                 var19 = Config.getSideGrassTexture(this.field_6952, var2, var3, var4, 3, var19);
                                 var23 = var19;
                                 var22 = TextureUtils.iconGrassTop;
                              }

                              if(var8 == null) {
                                 break label548;
                              }

                              if(var23 == var22) {
                                 var11.setVisible6(var16 * var5, var17 * var6, var18 * var7);
                              }
                           }

                           var23 = var19;
                           if(var8 == null) {
                              break label547;
                           }

                           var22 = TextureUtils.iconGrassSideSnowed;
                        }

                        if(var23 != var22) {
                           break label399;
                        }

                        var23 = Config.getSideSnowGrassTexture(this.field_6952, var2, var3, var4, 3);
                     }

                     var19 = var23;
                  }
               }

               this.drawTextBox3(var1, (double)var2, (double)var3, (double)var4, var19);
               var20 = var9;
            }

            if(var8 != null) {
               label377: {
                  if(var20) {
                     var20 = field_6957;
                     if(var8 == null) {
                        break label377;
                     }

                     if(field_6957 && var19 == TextureUtils.iconGrassSide) {
                        var20 = this.method_7206();
                        if(var8 == null) {
                           break label377;
                        }

                        if(!var20) {
                           var11.setVisible6(var16 * var5, var17 * var6, var18 * var7);
                           this.drawTextBox3(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                        }
                     }
                  }

                  var20 = true;
               }
            }

            var12 = var20;
         }

         var21 = this.field_6956;
      }

      label367: {
         label550: {
            if(var8 != null) {
               if(var21 == 0) {
                  var21 = var1.method_2445(this.field_6952, var2 - 1, var3, var4, 4);
                  if(var8 == null) {
                     break label367;
                  }

                  if(var21 == 0) {
                     break label550;
                  }
               }

               var21 = var13;
            }

            label356: {
               if(var8 != null) {
                  if(var21 >= 0) {
                     break label356;
                  }

                  var21 = var1.method_2444(this.field_6952, var2, var3, var4);
               }

               var13 = var21;
            }

            label350: {
               var15 = 0.6F;
               var16 = var15;
               var17 = var15;
               var18 = var15;
               if(var8 != null) {
                  if(var1 == class_1192.field_6027) {
                     break label350;
                  }

                  var16 = var15 * var5;
                  var17 = var15 * var6;
               }

               var18 = var15 * var7;
            }

            double var28;
            var10001 = (var28 = this.field_6960 - 0.0D) == 0.0D?0:(var28 < 0.0D?-1:1);
            if(var8 != null) {
               var10001 = var10001 > 0?var13:var1.method_2444(this.field_6952, var2 - 1, var3, var4);
            }

            var11.setVisible5(var10001);
            var11.setVisible6(var16, var17, var18);
            var19 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 4);
            var20 = var10;
            if(var8 != null) {
               if(var10) {
                  label340: {
                     label551: {
                        label552: {
                           label553: {
                              var23 = var19;
                              var22 = TextureUtils.iconGrassSide;
                              if(var8 != null) {
                                 if(var19 != TextureUtils.iconGrassSide) {
                                    var23 = var19;
                                    var22 = TextureUtils.iconMyceliumSide;
                                    if(var8 == null) {
                                       break label552;
                                    }

                                    if(var19 != TextureUtils.iconMyceliumSide) {
                                       break label553;
                                    }
                                 }

                                 var19 = Config.getSideGrassTexture(this.field_6952, var2, var3, var4, 4, var19);
                                 var23 = var19;
                                 var22 = TextureUtils.iconGrassTop;
                              }

                              if(var8 == null) {
                                 break label552;
                              }

                              if(var23 == var22) {
                                 var11.setVisible6(var16 * var5, var17 * var6, var18 * var7);
                              }
                           }

                           var23 = var19;
                           if(var8 == null) {
                              break label551;
                           }

                           var22 = TextureUtils.iconGrassSideSnowed;
                        }

                        if(var23 != var22) {
                           break label340;
                        }

                        var23 = Config.getSideSnowGrassTexture(this.field_6952, var2, var3, var4, 4);
                     }

                     var19 = var23;
                  }
               }

               this.drawTextBox4(var1, (double)var2, (double)var3, (double)var4, var19);
               var20 = var9;
            }

            if(var8 != null) {
               label318: {
                  if(var20) {
                     var20 = field_6957;
                     if(var8 == null) {
                        break label318;
                     }

                     if(field_6957 && var19 == TextureUtils.iconGrassSide) {
                        var20 = this.method_7206();
                        if(var8 == null) {
                           break label318;
                        }

                        if(!var20) {
                           var11.setVisible6(var16 * var5, var17 * var6, var18 * var7);
                           this.drawTextBox4(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                        }
                     }
                  }

                  var20 = true;
               }
            }

            var12 = var20;
         }

         var21 = this.field_6956;
      }

      label554: {
         if(var8 != null) {
            if(var21 == 0) {
               var20 = var1.method_2445(this.field_6952, var2 + 1, var3, var4, 5);
               if(var8 == null) {
                  return var20;
               }

               if(!var20) {
                  break label554;
               }
            }

            var21 = var13;
         }

         label297: {
            if(var8 != null) {
               if(var21 >= 0) {
                  break label297;
               }

               var21 = var1.method_2444(this.field_6952, var2, var3, var4);
            }

            var13 = var21;
         }

         label291: {
            var15 = 0.6F;
            var16 = var15;
            var17 = var15;
            var18 = var15;
            if(var8 != null) {
               if(var1 == class_1192.field_6027) {
                  break label291;
               }

               var16 = var15 * var5;
               var17 = var15 * var6;
            }

            var18 = var15 * var7;
         }

         double var29;
         var10001 = (var29 = this.field_6961 - 1.0D) == 0.0D?0:(var29 < 0.0D?-1:1);
         if(var8 != null) {
            var10001 = var10001 < 0?var13:var1.method_2444(this.field_6952, var2 + 1, var3, var4);
         }

         var11.setVisible5(var10001);
         var11.setVisible6(var16, var17, var18);
         var19 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 5);
         var20 = var10;
         if(var8 != null) {
            if(var10) {
               label281: {
                  label555: {
                     label556: {
                        label557: {
                           var23 = var19;
                           var22 = TextureUtils.iconGrassSide;
                           if(var8 != null) {
                              if(var19 != TextureUtils.iconGrassSide) {
                                 var23 = var19;
                                 var22 = TextureUtils.iconMyceliumSide;
                                 if(var8 == null) {
                                    break label556;
                                 }

                                 if(var19 != TextureUtils.iconMyceliumSide) {
                                    break label557;
                                 }
                              }

                              var19 = Config.getSideGrassTexture(this.field_6952, var2, var3, var4, 5, var19);
                              var23 = var19;
                              var22 = TextureUtils.iconGrassTop;
                           }

                           if(var8 == null) {
                              break label556;
                           }

                           if(var23 == var22) {
                              var11.setVisible6(var16 * var5, var17 * var6, var18 * var7);
                           }
                        }

                        var23 = var19;
                        if(var8 == null) {
                           break label555;
                        }

                        var22 = TextureUtils.iconGrassSideSnowed;
                     }

                     if(var23 != var22) {
                        break label281;
                     }

                     var23 = Config.getSideSnowGrassTexture(this.field_6952, var2, var3, var4, 5);
                  }

                  var19 = var23;
               }
            }

            this.drawTextBox5(var1, (double)var2, (double)var3, (double)var4, var19);
            var20 = var9;
         }

         if(var8 != null) {
            label259: {
               if(var20) {
                  var20 = field_6957;
                  if(var8 == null) {
                     break label259;
                  }

                  if(field_6957 && var19 == TextureUtils.iconGrassSide) {
                     var20 = this.method_7206();
                     if(var8 == null) {
                        break label259;
                     }

                     if(!var20) {
                        var11.setVisible6(var16 * var5, var17 * var6, var18 * var7);
                        this.drawTextBox5(var1, (double)var2, (double)var3, (double)var4, class_415.method_2666());
                     }
                  }
               }

               var20 = true;
            }
         }

         var12 = var20;
      }

      var20 = var12;
      return var20;
   }

   // $FF: renamed from: a (eR, int, int, int) boolean
   public boolean method_7268(class_434 var1, int var2, int var3, int var4) {
      bmh var6 = bmh.instance;
      var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      var6.setVisible6(1.0F, 1.0F, 1.0F);
      int var7 = this.field_6952.method_33(var2, var3, var4);
      int var8 = class_428.method_2711(var7);
      int var9 = class_434.method_2739(var7);
      class_73 var10 = var1.method_2738(var9);
      int var11 = 4 + var9 * 2;
      int var12 = 5 + var9 * 2;
      String[] var10000 = class_752.method_4253();
      double var13 = 15.0D - (double)var11;
      double var15 = 15.0D;
      double var17 = 4.0D;
      double var19 = 4.0D + (double)var12;
      double var21 = (double)var10.method_370(var13);
      double var23 = (double)var10.method_370(var15);
      double var25 = (double)var10.method_373(var17);
      double var27 = (double)var10.method_373(var19);
      double var29 = 0.0D;
      double var31 = 0.0D;
      String[] var5 = var10000;
      int var48 = var8;
      if(var5 != null) {
         switch(var8) {
         case 0:
            var29 = 8.0D - (double)(var11 / 2);
            var31 = 15.0D - (double)var11;
            if(var5 != null) {
               break;
            }
         case 1:
            var29 = 1.0D;
            var31 = 8.0D - (double)(var11 / 2);
            if(var5 != null) {
               break;
            }
         case 2:
            var29 = 8.0D - (double)(var11 / 2);
            var31 = 1.0D;
            if(var5 != null) {
               break;
            }
         case 3:
            var29 = 15.0D - (double)var11;
            var31 = 8.0D - (double)(var11 / 2);
         }

         var48 = var2;
      }

      double var33 = (double)var48 + var29 / 16.0D;
      double var35 = (double)var2 + (var29 + (double)var11) / 16.0D;
      double var37 = (double)var3 + (12.0D - (double)var12) / 16.0D;
      double var39 = (double)var3 + 0.75D;
      double var41 = (double)var4 + var31 / 16.0D;
      double var43 = (double)var4 + (var31 + (double)var11) / 16.0D;
      var6.addVertexWithUV(var33, var37, var41, var21, var27);
      var6.addVertexWithUV(var33, var37, var43, var23, var27);
      var6.addVertexWithUV(var33, var39, var43, var23, var25);
      var6.addVertexWithUV(var33, var39, var41, var21, var25);
      var6.addVertexWithUV(var35, var37, var43, var21, var27);
      var6.addVertexWithUV(var35, var37, var41, var23, var27);
      var6.addVertexWithUV(var35, var39, var41, var23, var25);
      var6.addVertexWithUV(var35, var39, var43, var21, var25);
      var6.addVertexWithUV(var35, var37, var41, var21, var27);
      var6.addVertexWithUV(var33, var37, var41, var23, var27);
      var6.addVertexWithUV(var33, var39, var41, var23, var25);
      var6.addVertexWithUV(var35, var39, var41, var21, var25);
      var6.addVertexWithUV(var33, var37, var43, var21, var27);
      var6.addVertexWithUV(var35, var37, var43, var23, var27);
      var6.addVertexWithUV(var35, var39, var43, var23, var25);
      var6.addVertexWithUV(var33, var39, var43, var21, var25);
      int var45 = var11;
      var48 = var9;
      if(var5 != null) {
         if(var9 >= 2) {
            var45 = var11 - 1;
         }

         var21 = (double)var10.method_368();
         var23 = (double)var10.method_370((double)var45);
         var25 = (double)var10.method_371();
         var27 = (double)var10.method_373((double)var45);
         var6.addVertexWithUV(var33, var39, var43, var21, var27);
         var6.addVertexWithUV(var35, var39, var43, var23, var27);
         var6.addVertexWithUV(var35, var39, var41, var23, var25);
         var6.addVertexWithUV(var33, var39, var41, var21, var25);
         var6.addVertexWithUV(var33, var37, var41, var21, var25);
         var6.addVertexWithUV(var35, var37, var41, var23, var25);
         var6.addVertexWithUV(var35, var37, var43, var23, var27);
         var6.addVertexWithUV(var33, var37, var43, var21, var27);
         var21 = (double)var10.method_370(12.0D);
         var23 = (double)var10.method_369();
         var25 = (double)var10.method_371();
         var27 = (double)var10.method_373(4.0D);
         var29 = 8.0D;
         var31 = 0.0D;
         var48 = var8;
      }

      label72: {
         label87: {
            if(var5 != null) {
               double var46;
               switch(var48) {
               case 0:
                  var29 = 8.0D;
                  var31 = 12.0D;
                  var46 = var21;
                  var21 = var23;
                  var23 = var46;
                  if(var5 != null) {
                     break;
                  }
               case 1:
                  var29 = 0.0D;
                  var31 = 8.0D;
                  if(var5 != null) {
                     break;
                  }
               case 2:
                  var29 = 8.0D;
                  var31 = 0.0D;
                  if(var5 != null) {
                     break;
                  }
               case 3:
                  var29 = 12.0D;
                  var31 = 8.0D;
                  var46 = var21;
                  var21 = var23;
                  var23 = var46;
               }

               var33 = (double)var2 + var29 / 16.0D;
               var35 = (double)var2 + (var29 + 4.0D) / 16.0D;
               var37 = (double)var3 + 0.75D;
               var39 = (double)var3 + 1.0D;
               var41 = (double)var4 + var31 / 16.0D;
               var43 = (double)var4 + (var31 + 4.0D) / 16.0D;
               if(var5 == null) {
                  break label87;
               }

               var48 = var8;
            }

            if(var48 != 2) {
               label89: {
                  var48 = var8;
                  if(var5 != null) {
                     if(var8 == 0) {
                        break label89;
                     }

                     var48 = var8;
                  }

                  label57: {
                     byte var10001 = 1;
                     if(var5 != null) {
                        if(var48 == 1) {
                           break label57;
                        }

                        var48 = var8;
                        if(var5 == null) {
                           return (boolean)var48;
                        }

                        var10001 = 3;
                     }

                     if(var48 != var10001) {
                        break label72;
                     }
                  }

                  var6.addVertexWithUV(var35, var37, var41, var21, var27);
                  var6.addVertexWithUV(var33, var37, var41, var23, var27);
                  var6.addVertexWithUV(var33, var39, var41, var23, var25);
                  var6.addVertexWithUV(var35, var39, var41, var21, var25);
                  var6.addVertexWithUV(var33, var37, var41, var23, var27);
                  var6.addVertexWithUV(var35, var37, var41, var21, var27);
                  var6.addVertexWithUV(var35, var39, var41, var21, var25);
                  var6.addVertexWithUV(var33, var39, var41, var23, var25);
                  if(var5 != null) {
                     break label72;
                  }
               }
            }

            var6.addVertexWithUV(var33, var37, var41, var23, var27);
            var6.addVertexWithUV(var33, var37, var43, var21, var27);
            var6.addVertexWithUV(var33, var39, var43, var21, var25);
            var6.addVertexWithUV(var33, var39, var41, var23, var25);
            var6.addVertexWithUV(var33, var37, var43, var21, var27);
            var6.addVertexWithUV(var33, var37, var41, var23, var27);
            var6.addVertexWithUV(var33, var39, var41, var23, var25);
         }

         var6.addVertexWithUV(var33, var39, var43, var21, var25);
      }

      var48 = 1;
      return (boolean)var48;
   }

   // $FF: renamed from: a (d5, int, int, int) boolean
   public boolean method_7269(class_490 var1, int var2, int var3, int var4) {
      float var6 = 0.1875F;
      this.method_7204(this.method_7291(class_1192.field_6047));
      String[] var10000 = class_752.method_4253();
      this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      this.method_7260(var1, var2, var3, var4);
      this.field_6956 = true;
      String[] var5 = var10000;
      this.method_7204(this.method_7291(class_1192.field_6076));
      this.method_7209(0.125D, 0.0062500000931322575D, 0.125D, 0.875D, (double)var6, 0.875D);
      this.method_7260(var1, var2, var3, var4);
      class_73 var7 = this.method_7291(class_1192.field_6162);
      boolean var8 = Config.isConnectedTextures();
      if(var5 != null) {
         if(var8) {
            var7 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, var2, var3, var4, -1, var7);
         }

         this.method_7204(var7);
         this.method_7209(0.1875D, (double)var6, 0.1875D, 0.8125D, 0.875D, 0.8125D);
         this.method_7260(var1, var2, var3, var4);
         this.field_6956 = false;
         this.method_7205();
         var8 = true;
      }

      return var8;
   }

   // $FF: renamed from: t (aji, int, int, int) boolean
   public boolean method_7270(aji var1, int var2, int var3, int var4) {
      int var6 = var1.method_2495(this.field_6952, var2, var3, var4);
      float var7 = (float)(var6 >> 16 & 255) / 255.0F;
      String[] var5 = class_752.method_4253();
      float var8 = (float)(var6 >> 8 & 255) / 255.0F;
      float var9 = (float)(var6 & 255) / 255.0F;
      boolean var10000 = blt.field_7072;
      if(var5 != null) {
         if(blt.field_7072) {
            float var10 = (var7 * 30.0F + var8 * 59.0F + var9 * 11.0F) / 100.0F;
            float var11 = (var7 * 30.0F + var8 * 70.0F) / 100.0F;
            float var12 = (var7 * 30.0F + var9 * 70.0F) / 100.0F;
            var7 = var10;
            var8 = var11;
            var9 = var12;
         }

         var10000 = this.method_7271(var1, var2, var3, var4, var7, var8, var9);
      }

      return var10000;
   }

   // $FF: renamed from: e (aji, int, int, int, float, float, float) boolean
   public boolean method_7271(aji var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      String[] var8;
      bmh var9;
      float var16;
      float var17;
      int var10001;
      float var18;
      float var20;
      float var21;
      float var22;
      float var24;
      float var25;
      float var26;
      float var27;
      int var28;
      boolean var29;
      label59: {
         label62: {
            float var15;
            float var19;
            float var23;
            label63: {
               var9 = bmh.instance;
               boolean var10 = false;
               float var11 = 0.5F;
               float var12 = 1.0F;
               float var13 = 0.8F;
               float var14 = 0.6F;
               var15 = var11 * var5;
               var16 = var12 * var5;
               var17 = var13 * var5;
               var18 = var14 * var5;
               var19 = var11 * var6;
               var20 = var12 * var6;
               var21 = var13 * var6;
               var22 = var14 * var6;
               var23 = var11 * var7;
               var24 = var12 * var7;
               var25 = var13 * var7;
               String[] var10000 = class_752.method_4253();
               var26 = var14 * var7;
               var27 = 0.0625F;
               var8 = var10000;
               var28 = var1.method_2444(this.field_6952, var2, var3, var4);
               var29 = this.field_6956;
               if(var8 != null) {
                  if(this.field_6956) {
                     break label63;
                  }

                  var29 = var1.method_2445(this.field_6952, var2, var3 - 1, var4, 0);
               }

               if(var8 == null) {
                  break label59;
               }

               if(!var29) {
                  break label62;
               }
            }

            double var30;
            var10001 = (var30 = this.field_6962 - 0.0D) == 0.0D?0:(var30 < 0.0D?-1:1);
            if(var8 != null) {
               var10001 = var10001 > 0?var28:var1.method_2444(this.field_6952, var2, var3 - 1, var4);
            }

            var9.setVisible5(var10001);
            var9.setVisible6(var15, var19, var23);
            this.drawTextBox0(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 0));
         }

         var29 = this.field_6956;
      }

      label64: {
         label65: {
            if(var8 != null) {
               if(var29) {
                  break label65;
               }

               var29 = var1.method_2445(this.field_6952, var2, var3 + 1, var4, 1);
            }

            if(var8 == null) {
               return var29;
            }

            if(!var29) {
               break label64;
            }
         }

         double var31;
         var10001 = (var31 = this.field_6963 - 1.0D) == 0.0D?0:(var31 < 0.0D?-1:1);
         if(var8 != null) {
            var10001 = var10001 < 0?var28:var1.method_2444(this.field_6952, var2, var3 + 1, var4);
         }

         var9.setVisible5(var10001);
         var9.setVisible6(var16, var20, var24);
         this.drawTextBox1(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 1));
      }

      var9.setVisible5(var28);
      var9.setVisible6(var17, var21, var25);
      var9.method_7468(0.0F, 0.0F, var27);
      this.drawTextBox2(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 2));
      var9.method_7468(0.0F, 0.0F, -var27);
      var9.method_7468(0.0F, 0.0F, -var27);
      this.drawTextBox3(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 3));
      var9.method_7468(0.0F, 0.0F, var27);
      var9.setVisible6(var18, var22, var26);
      var9.method_7468(var27, 0.0F, 0.0F);
      this.drawTextBox4(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 4));
      var9.method_7468(-var27, 0.0F, 0.0F);
      var9.method_7468(-var27, 0.0F, 0.0F);
      this.drawTextBox5(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 5));
      var9.method_7468(var27, 0.0F, 0.0F);
      var29 = true;
      return var29;
   }

   // $FF: renamed from: a (e6, int, int, int) boolean
   public boolean method_7272(class_462 var1, int var2, int var3, int var4) {
      String[] var5;
      boolean var6;
      float var7;
      float var8;
      boolean var9;
      boolean var10;
      boolean var21;
      label121: {
         label120: {
            var6 = false;
            var7 = 0.375F;
            var8 = 0.625F;
            String[] var10000 = class_752.method_4253();
            this.method_7209((double)var7, 0.0D, (double)var7, (double)var8, 1.0D, (double)var8);
            this.method_7260(var1, var2, var3, var4);
            var6 = true;
            var5 = var10000;
            var9 = false;
            var10 = false;
            var21 = var1.method_2807(this.field_6952, var2 - 1, var3, var4);
            if(var5 != null) {
               if(!var21) {
                  var21 = var1.method_2807(this.field_6952, var2 + 1, var3, var4);
                  if(var5 == null) {
                     break label121;
                  }

                  if(!var21) {
                     break label120;
                  }
               }

               var21 = true;
            }

            var9 = var21;
         }

         var21 = var1.method_2807(this.field_6952, var2, var3, var4 - 1);
      }

      label110: {
         label109: {
            if(var5 != null) {
               if(!var21) {
                  var21 = var1.method_2807(this.field_6952, var2, var3, var4 + 1);
                  if(var5 == null) {
                     break label110;
                  }

                  if(!var21) {
                     break label109;
                  }
               }

               var21 = true;
            }

            var10 = var21;
         }

         var21 = var1.method_2807(this.field_6952, var2 - 1, var3, var4);
      }

      boolean var11 = var21;
      boolean var12 = var1.method_2807(this.field_6952, var2 + 1, var3, var4);
      boolean var13 = var1.method_2807(this.field_6952, var2, var3, var4 - 1);
      boolean var14 = var1.method_2807(this.field_6952, var2, var3, var4 + 1);
      if(var5 != null) {
         if(!var9) {
            label96: {
               var21 = var10;
               if(var5 != null) {
                  if(var10) {
                     break label96;
                  }

                  var21 = true;
               }

               var9 = var21;
            }
         }

         var7 = 0.4375F;
         var8 = 0.5625F;
      }

      float var15 = 0.75F;
      float var16 = 0.9375F;
      float var17 = var11?0.0F:var7;
      float var18 = var12?1.0F:var8;
      float var19 = var13?0.0F:var7;
      float var20 = var14?1.0F:var8;
      this.field_6955 = true;
      var21 = var9;
      if(var5 != null) {
         if(var9) {
            this.method_7209((double)var17, (double)var15, (double)var7, (double)var18, (double)var16, (double)var8);
            this.method_7260(var1, var2, var3, var4);
            var6 = true;
         }

         var21 = var10;
      }

      if(var5 != null) {
         if(var21) {
            this.method_7209((double)var7, (double)var15, (double)var19, (double)var8, (double)var16, (double)var20);
            this.method_7260(var1, var2, var3, var4);
            var6 = true;
         }

         var15 = 0.375F;
         var16 = 0.5625F;
         var21 = var9;
      }

      if(var5 != null) {
         if(var21) {
            this.method_7209((double)var17, (double)var15, (double)var7, (double)var18, (double)var16, (double)var8);
            this.method_7260(var1, var2, var3, var4);
            var6 = true;
         }

         var21 = var10;
      }

      if(var5 != null) {
         if(var21) {
            this.method_7209((double)var7, (double)var15, (double)var19, (double)var8, (double)var16, (double)var20);
            this.method_7260(var1, var2, var3, var4);
            var6 = true;
         }

         this.field_6955 = false;
         var1.method_2486(this.field_6952, var2, var3, var4);
         var21 = Config.isBetterSnow();
      }

      if(var5 != null) {
         if(var21) {
            var21 = this.hasSnowNeighbours(var2, var3, var4);
            if(var5 == null) {
               return var21;
            }

            if(var21) {
               this.renderSnow(var2, var3, var4, class_1192.field_6104.method_2490());
            }
         }

         var21 = var6;
      }

      return var21;
   }

   // $FF: renamed from: a (f4, int, int, int) boolean
   public boolean method_7273(class_424 var1, int var2, int var3, int var4) {
      String[] var5;
      boolean var6;
      boolean var7;
      boolean var8;
      boolean var9;
      boolean var13;
      label157: {
         label160: {
            String[] var10000 = class_752.method_4253();
            var6 = var1.method_2698(this.field_6952, var2 - 1, var3, var4);
            var7 = var1.method_2698(this.field_6952, var2 + 1, var3, var4);
            var5 = var10000;
            var8 = var1.method_2698(this.field_6952, var2, var3, var4 - 1);
            var9 = var1.method_2698(this.field_6952, var2, var3, var4 + 1);
            var13 = var8;
            if(var5 != null) {
               if(!var8) {
                  break label160;
               }

               var13 = var9;
            }

            if(var5 != null) {
               if(!var13) {
                  break label160;
               }

               var13 = var6;
            }

            if(var5 != null) {
               if(var13) {
                  break label160;
               }

               var13 = var7;
            }

            if(var5 == null) {
               break label157;
            }

            if(!var13) {
               var13 = true;
               break label157;
            }
         }

         var13 = false;
      }

      boolean var10;
      label136: {
         label161: {
            var10 = var13;
            var13 = var8;
            if(var5 != null) {
               if(var8) {
                  break label161;
               }

               var13 = var9;
            }

            if(var5 != null) {
               if(var13) {
                  break label161;
               }

               var13 = var6;
            }

            if(var5 != null) {
               if(!var13) {
                  break label161;
               }

               var13 = var7;
            }

            if(var5 == null) {
               break label136;
            }

            if(var13) {
               var13 = true;
               break label136;
            }
         }

         var13 = false;
      }

      label115: {
         label166: {
            label113: {
               label163: {
                  boolean var11 = var13;
                  boolean var12 = this.field_6952.method_34(var2, var3 + 1, var4);
                  var13 = var10;
                  if(var5 != null) {
                     if(!var10) {
                        var13 = var11;
                        if(var5 == null) {
                           break label113;
                        }

                        if(!var11) {
                           break label163;
                        }
                     }

                     var13 = var12;
                  }

                  if(var5 == null) {
                     break label113;
                  }

                  if(var13) {
                     if(var5 != null) {
                        if(var10) {
                           this.method_7209(0.3125D, 0.0D, 0.0D, 0.6875D, 0.8125D, 1.0D);
                           this.method_7260(var1, var2, var3, var4);
                           if(var5 != null) {
                              break label166;
                           }
                        }

                        this.method_7209(0.0D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
                        this.method_7260(var1, var2, var3, var4);
                     }

                     if(var5 != null) {
                        break label166;
                     }
                  }
               }

               this.method_7209(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);
               this.method_7260(var1, var2, var3, var4);
               var13 = var6;
            }

            if(var5 != null) {
               if(var13) {
                  this.method_7209(0.0D, 0.0D, 0.3125D, 0.25D, 0.8125D, 0.6875D);
                  this.method_7260(var1, var2, var3, var4);
               }

               var13 = var7;
            }

            if(var5 != null) {
               if(var13) {
                  this.method_7209(0.75D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
                  this.method_7260(var1, var2, var3, var4);
               }

               var13 = var8;
            }

            if(var5 != null) {
               if(var13) {
                  this.method_7209(0.3125D, 0.0D, 0.0D, 0.6875D, 0.8125D, 0.25D);
                  this.method_7260(var1, var2, var3, var4);
               }

               var13 = var9;
            }

            if(var5 == null) {
               break label115;
            }

            if(var13) {
               this.method_7209(0.3125D, 0.0D, 0.75D, 0.6875D, 0.8125D, 1.0D);
               this.method_7260(var1, var2, var3, var4);
            }
         }

         var1.method_2486(this.field_6952, var2, var3, var4);
         var13 = Config.isBetterSnow();
      }

      if(var5 != null) {
         if(var13) {
            var13 = this.hasSnowNeighbours(var2, var3, var4);
            if(var5 == null) {
               return var13;
            }

            if(var13) {
               this.renderSnow(var2, var3, var4, class_1192.field_6104.method_2490());
            }
         }

         var13 = true;
      }

      return var13;
   }

   // $FF: renamed from: a (eZ, int, int, int) boolean
   public boolean method_7274(class_416 var1, int var2, int var3, int var4) {
      boolean var6 = false;
      String[] var5 = class_752.method_4253();
      int var7 = 0;
      int var8 = 0;

      int var10000;
      while(true) {
         if(var8 < 8) {
            byte var9 = 0;
            byte var10 = 1;
            var10000 = var8;
            if(var5 == null) {
               break;
            }

            if(var5 != null) {
               if(var8 == 0) {
                  var9 = 2;
               }

               var10000 = var8;
            }

            byte var10001 = 1;
            if(var5 != null) {
               if(var10000 == 1) {
                  var9 = 3;
               }

               var10000 = var8;
               var10001 = 2;
            }

            if(var5 != null) {
               if(var10000 == var10001) {
                  var9 = 4;
               }

               var10000 = var8;
               var10001 = 3;
            }

            if(var5 != null) {
               if(var10000 == var10001) {
                  var9 = 5;
                  var10 = 2;
               }

               var10000 = var8;
               var10001 = 4;
            }

            if(var5 != null) {
               if(var10000 == var10001) {
                  var9 = 6;
                  var10 = 3;
               }

               var10000 = var8;
               var10001 = 5;
            }

            if(var5 != null) {
               if(var10000 == var10001) {
                  var9 = 7;
                  var10 = 5;
               }

               var10000 = var8;
               var10001 = 6;
            }

            label87: {
               if(var5 != null) {
                  if(var10000 == var10001) {
                     var9 = 6;
                     var10 = 2;
                  }

                  var10000 = var8;
                  if(var5 == null) {
                     break label87;
                  }

                  var10001 = 7;
               }

               if(var10000 == var10001) {
                  var9 = 3;
               }

               var10000 = var9;
            }

            float var11 = (float)var10000 / 16.0F;
            float var12 = 1.0F - (float)var7 / 16.0F;
            float var13 = 1.0F - (float)(var7 + var10) / 16.0F;
            var7 += var10;
            this.method_7209((double)(0.5F - var11), (double)var13, (double)(0.5F - var11), (double)(0.5F + var11), (double)var12, (double)(0.5F + var11));
            this.method_7260(var1, var2, var3, var4);
            ++var8;
            if(var5 != null) {
               continue;
            }
         }

         byte var14 = 1;
         this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         var10000 = var14;
         break;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (eV, int, int, int) boolean
   public boolean method_7275(class_430 var1, int var2, int var3, int var4) {
      String[] var5;
      boolean var6;
      byte var8;
      int var9;
      float var10;
      float var11;
      float var12;
      float var13;
      float var16;
      float var17;
      float var18;
      float var19;
      int var23;
      byte var25;
      label181: {
         float var14;
         float var15;
         label184: {
            label185: {
               blm var26;
               label178: {
                  label177: {
                     label186: {
                        label175: {
                           label187: {
                              label188: {
                                 var6 = true;
                                 String[] var10000 = class_752.method_4253();
                                 int var7 = this.field_6952.method_33(var2, var3, var4);
                                 var5 = var10000;
                                 var8 = class_430.method_2714(var7);
                                 var9 = class_428.method_2711(var7);
                                 var10 = 0.375F;
                                 var11 = 0.5625F;
                                 var12 = 0.75F;
                                 var13 = 0.9375F;
                                 var14 = 0.3125F;
                                 var15 = 1.0F;
                                 var23 = var9;
                                 if(var5 != null) {
                                    if(var9 == 2) {
                                       break label188;
                                    }

                                    var23 = var9;
                                 }

                                 if(var5 == null) {
                                    break label175;
                                 }

                                 if(var23 != 0) {
                                    break label187;
                                 }
                              }

                              aji var24 = this.field_6952.getBlock(var2 - 1, var3, var4);
                              aji var10001 = class_1192.field_6163;
                              if(var5 != null) {
                                 if(var24 != class_1192.field_6163) {
                                    break label187;
                                 }

                                 var24 = this.field_6952.getBlock(var2 + 1, var3, var4);
                                 var10001 = class_1192.field_6163;
                              }

                              if(var24 == var10001) {
                                 break label186;
                              }
                           }

                           var23 = var9;
                        }

                        label189: {
                           var25 = 3;
                           if(var5 != null) {
                              if(var23 == 3) {
                                 break label189;
                              }

                              var23 = var9;
                              var25 = 1;
                           }

                           if(var5 == null) {
                              break label185;
                           }

                           if(var23 != var25) {
                              break label177;
                           }
                        }

                        var26 = this;
                        if(var5 == null) {
                           break label178;
                        }

                        if(this.field_6952.getBlock(var2, var3, var4 - 1) != class_1192.field_6163) {
                           break label177;
                        }

                        var26 = this;
                        if(var5 == null) {
                           break label178;
                        }

                        if(this.field_6952.getBlock(var2, var3, var4 + 1) != class_1192.field_6163) {
                           break label177;
                        }
                     }

                     var10 -= 0.1875F;
                     var11 -= 0.1875F;
                     var12 -= 0.1875F;
                     var13 -= 0.1875F;
                     var14 -= 0.1875F;
                     var15 -= 0.1875F;
                  }

                  var26 = this;
               }

               var26.field_6956 = true;
               if(var5 == null) {
                  break label184;
               }

               var23 = var9;
               var25 = 3;
            }

            if(var23 != var25 && var9 != 1) {
               var16 = 0.0F;
               var17 = 0.125F;
               var18 = 0.4375F;
               var19 = 0.5625F;
               this.method_7209((double)var16, (double)var14, (double)var18, (double)var17, (double)var15, (double)var19);
               this.method_7260(var1, var2, var3, var4);
               var16 = 0.875F;
               var17 = 1.0F;
               this.method_7209((double)var16, (double)var14, (double)var18, (double)var17, (double)var15, (double)var19);
               this.method_7260(var1, var2, var3, var4);
               if(var5 != null) {
                  break label181;
               }
            }

            this.field_6973 = 1;
         }

         var16 = 0.4375F;
         var17 = 0.5625F;
         var18 = 0.0F;
         var19 = 0.125F;
         this.method_7209((double)var16, (double)var14, (double)var18, (double)var17, (double)var15, (double)var19);
         this.method_7260(var1, var2, var3, var4);
         var18 = 0.875F;
         var19 = 1.0F;
         this.method_7209((double)var16, (double)var14, (double)var18, (double)var17, (double)var15, (double)var19);
         this.method_7260(var1, var2, var3, var4);
         this.field_6973 = 0;
      }

      label190: {
         var23 = var8;
         if(var5 != null) {
            if(var8 != 0) {
               label120: {
                  label119: {
                     label192: {
                        var23 = var9;
                        if(var5 != null) {
                           if(var9 == 2) {
                              break label192;
                           }

                           var23 = var9;
                        }

                        if(var5 == null) {
                           break label120;
                        }

                        if(var23 != 0) {
                           break label119;
                        }
                     }

                     this.field_6973 = 1;
                  }

                  var23 = var9;
               }

               label193: {
                  float var20;
                  float var21;
                  float var22;
                  label194: {
                     var25 = 3;
                     if(var5 != null) {
                        if(var23 == 3) {
                           var16 = 0.0F;
                           var17 = 0.125F;
                           var18 = 0.875F;
                           var19 = 1.0F;
                           var20 = 0.5625F;
                           var21 = 0.8125F;
                           var22 = 0.9375F;
                           this.method_7209(0.8125D, (double)var10, 0.0D, 0.9375D, (double)var13, 0.125D);
                           this.method_7260(var1, var2, var3, var4);
                           this.method_7209(0.8125D, (double)var10, 0.875D, 0.9375D, (double)var13, 1.0D);
                           this.method_7260(var1, var2, var3, var4);
                           this.method_7209(0.5625D, (double)var10, 0.0D, 0.8125D, (double)var11, 0.125D);
                           this.method_7260(var1, var2, var3, var4);
                           this.method_7209(0.5625D, (double)var10, 0.875D, 0.8125D, (double)var11, 1.0D);
                           this.method_7260(var1, var2, var3, var4);
                           this.method_7209(0.5625D, (double)var12, 0.0D, 0.8125D, (double)var13, 0.125D);
                           this.method_7260(var1, var2, var3, var4);
                           this.method_7209(0.5625D, (double)var12, 0.875D, 0.8125D, (double)var13, 1.0D);
                           this.method_7260(var1, var2, var3, var4);
                           if(var5 != null) {
                              break label193;
                           }
                        }

                        var23 = var9;
                        if(var5 == null) {
                           break label194;
                        }

                        var25 = 1;
                     }

                     if(var23 == var25) {
                        var16 = 0.0F;
                        var17 = 0.125F;
                        var18 = 0.875F;
                        var19 = 1.0F;
                        var20 = 0.0625F;
                        var21 = 0.1875F;
                        var22 = 0.4375F;
                        this.method_7209(0.0625D, (double)var10, 0.0D, 0.1875D, (double)var13, 0.125D);
                        this.method_7260(var1, var2, var3, var4);
                        this.method_7209(0.0625D, (double)var10, 0.875D, 0.1875D, (double)var13, 1.0D);
                        this.method_7260(var1, var2, var3, var4);
                        this.method_7209(0.1875D, (double)var10, 0.0D, 0.4375D, (double)var11, 0.125D);
                        this.method_7260(var1, var2, var3, var4);
                        this.method_7209(0.1875D, (double)var10, 0.875D, 0.4375D, (double)var11, 1.0D);
                        this.method_7260(var1, var2, var3, var4);
                        this.method_7209(0.1875D, (double)var12, 0.0D, 0.4375D, (double)var13, 0.125D);
                        this.method_7260(var1, var2, var3, var4);
                        this.method_7209(0.1875D, (double)var12, 0.875D, 0.4375D, (double)var13, 1.0D);
                        this.method_7260(var1, var2, var3, var4);
                        if(var5 != null) {
                           break label193;
                        }
                     }

                     var23 = var9;
                  }

                  if(var5 != null) {
                     if(var23 == 0) {
                        var16 = 0.0F;
                        var17 = 0.125F;
                        var18 = 0.875F;
                        var19 = 1.0F;
                        var20 = 0.5625F;
                        var21 = 0.8125F;
                        var22 = 0.9375F;
                        this.method_7209(0.0D, (double)var10, 0.8125D, 0.125D, (double)var13, 0.9375D);
                        this.method_7260(var1, var2, var3, var4);
                        this.method_7209(0.875D, (double)var10, 0.8125D, 1.0D, (double)var13, 0.9375D);
                        this.method_7260(var1, var2, var3, var4);
                        this.method_7209(0.0D, (double)var10, 0.5625D, 0.125D, (double)var11, 0.8125D);
                        this.method_7260(var1, var2, var3, var4);
                        this.method_7209(0.875D, (double)var10, 0.5625D, 1.0D, (double)var11, 0.8125D);
                        this.method_7260(var1, var2, var3, var4);
                        this.method_7209(0.0D, (double)var12, 0.5625D, 0.125D, (double)var13, 0.8125D);
                        this.method_7260(var1, var2, var3, var4);
                        this.method_7209(0.875D, (double)var12, 0.5625D, 1.0D, (double)var13, 0.8125D);
                        this.method_7260(var1, var2, var3, var4);
                        if(var5 != null) {
                           break label193;
                        }
                     }

                     var23 = var9;
                  }

                  if(var23 == 2) {
                     var16 = 0.0F;
                     var17 = 0.125F;
                     var18 = 0.875F;
                     var19 = 1.0F;
                     var20 = 0.0625F;
                     var21 = 0.1875F;
                     var22 = 0.4375F;
                     this.method_7209(0.0D, (double)var10, 0.0625D, 0.125D, (double)var13, 0.1875D);
                     this.method_7260(var1, var2, var3, var4);
                     this.method_7209(0.875D, (double)var10, 0.0625D, 1.0D, (double)var13, 0.1875D);
                     this.method_7260(var1, var2, var3, var4);
                     this.method_7209(0.0D, (double)var10, 0.1875D, 0.125D, (double)var11, 0.4375D);
                     this.method_7260(var1, var2, var3, var4);
                     this.method_7209(0.875D, (double)var10, 0.1875D, 1.0D, (double)var11, 0.4375D);
                     this.method_7260(var1, var2, var3, var4);
                     this.method_7209(0.0D, (double)var12, 0.1875D, 0.125D, (double)var13, 0.4375D);
                     this.method_7260(var1, var2, var3, var4);
                     this.method_7209(0.875D, (double)var12, 0.1875D, 1.0D, (double)var13, 0.4375D);
                     this.method_7260(var1, var2, var3, var4);
                  }
               }

               if(var5 != null) {
                  break label190;
               }
            }

            var23 = var9;
         }

         if(var5 != null) {
            label87: {
               if(var23 != 3) {
                  if(var5 == null) {
                     break label87;
                  }

                  if(var9 != 1) {
                     var16 = 0.375F;
                     var17 = 0.5F;
                     var18 = 0.4375F;
                     var19 = 0.5625F;
                     this.method_7209((double)var16, (double)var10, (double)var18, (double)var17, (double)var13, (double)var19);
                     this.method_7260(var1, var2, var3, var4);
                     var16 = 0.5F;
                     var17 = 0.625F;
                     this.method_7209((double)var16, (double)var10, (double)var18, (double)var17, (double)var13, (double)var19);
                     this.method_7260(var1, var2, var3, var4);
                     var16 = 0.625F;
                     var17 = 0.875F;
                     this.method_7209((double)var16, (double)var10, (double)var18, (double)var17, (double)var11, (double)var19);
                     this.method_7260(var1, var2, var3, var4);
                     this.method_7209((double)var16, (double)var12, (double)var18, (double)var17, (double)var13, (double)var19);
                     this.method_7260(var1, var2, var3, var4);
                     var16 = 0.125F;
                     var17 = 0.375F;
                     this.method_7209((double)var16, (double)var10, (double)var18, (double)var17, (double)var11, (double)var19);
                     this.method_7260(var1, var2, var3, var4);
                     this.method_7209((double)var16, (double)var12, (double)var18, (double)var17, (double)var13, (double)var19);
                     this.method_7260(var1, var2, var3, var4);
                     if(var5 != null) {
                        break label87;
                     }
                  }
               }

               this.field_6973 = 1;
               var16 = 0.4375F;
               var17 = 0.5625F;
               var18 = 0.375F;
               var19 = 0.5F;
               this.method_7209((double)var16, (double)var10, (double)var18, (double)var17, (double)var13, (double)var19);
               this.method_7260(var1, var2, var3, var4);
               var18 = 0.5F;
               var19 = 0.625F;
               this.method_7209((double)var16, (double)var10, (double)var18, (double)var17, (double)var13, (double)var19);
               this.method_7260(var1, var2, var3, var4);
               var18 = 0.625F;
               var19 = 0.875F;
               this.method_7209((double)var16, (double)var10, (double)var18, (double)var17, (double)var11, (double)var19);
               this.method_7260(var1, var2, var3, var4);
               this.method_7209((double)var16, (double)var12, (double)var18, (double)var17, (double)var13, (double)var19);
               this.method_7260(var1, var2, var3, var4);
               var18 = 0.125F;
               var19 = 0.375F;
               this.method_7209((double)var16, (double)var10, (double)var18, (double)var17, (double)var11, (double)var19);
               this.method_7260(var1, var2, var3, var4);
               this.method_7209((double)var16, (double)var12, (double)var18, (double)var17, (double)var13, (double)var19);
               this.method_7260(var1, var2, var3, var4);
            }
         }
      }

      boolean var27 = Config.isBetterSnow();
      if(var5 != null) {
         if(var27) {
            var27 = this.hasSnowNeighbours(var2, var3, var4);
            if(var5 == null) {
               return var27;
            }

            if(var27) {
               this.renderSnow(var2, var3, var4, class_1192.field_6104.method_2490());
            }
         }

         this.field_6956 = false;
         this.field_6973 = 0;
         this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         var27 = var6;
      }

      return var27;
   }

   // $FF: renamed from: a (ee, int, int, int) boolean
   public boolean method_7276(class_480 var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      bmh var6 = bmh.instance;
      String[] var5 = var10000;
      var6.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
      int var7 = var1.method_2495(this.field_6952, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      boolean var14 = blt.field_7072;
      if(var5 != null) {
         if(blt.field_7072) {
            float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
            float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
            float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
            var8 = var11;
            var9 = var12;
            var10 = var13;
         }

         var6.setVisible6(var8, var9, var10);
         var14 = this.method_7277(var1, var2, var3, var4, this.field_6952.method_33(var2, var3, var4), false);
      }

      return var14;
   }

   // $FF: renamed from: a (ee, int, int, int, int, boolean) boolean
   public boolean method_7277(class_480 var1, int var2, int var3, int var4, int var5, boolean var6) {
      String[] var10000 = class_752.method_4253();
      bmh var8 = bmh.instance;
      String[] var7 = var10000;
      int var9 = class_480.method_2838(var5);
      double var10 = 0.625D;
      this.method_7209(0.0D, var10, 0.0D, 1.0D, 1.0D, 1.0D);
      if(var7 != null) {
         label99: {
            if(var6 != 0) {
               var8.setVisible2();
               var8.method_7466(0.0F, -1.0F, 0.0F);
               this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 0, var5));
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(0.0F, 1.0F, 0.0F);
               this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 1, var5));
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(0.0F, 0.0F, -1.0F);
               this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 2, var5));
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(0.0F, 0.0F, 1.0F);
               this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 3, var5));
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(-1.0F, 0.0F, 0.0F);
               this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 4, var5));
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(1.0F, 0.0F, 0.0F);
               this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 5, var5));
               var8.getVisible8();
               if(var7 != null) {
                  break label99;
               }
            }

            this.method_7260(var1, var2, var3, var4);
         }
      }

      float var12;
      int var27;
      label104: {
         var27 = var6;
         if(var7 != null) {
            if(var6 != 0) {
               break label104;
            }

            var8.setVisible5(var1.method_2444(this.field_6952, var2, var3, var4));
            var27 = var1.method_2495(this.field_6952, var2, var3, var4);
         }

         int var13 = var27;
         float var14 = (float)(var13 >> 16 & 255) / 255.0F;
         var12 = (float)(var13 >> 8 & 255) / 255.0F;
         float var15 = (float)(var13 & 255) / 255.0F;
         if(blt.field_7072) {
            float var16 = (var14 * 30.0F + var12 * 59.0F + var15 * 11.0F) / 100.0F;
            float var17 = (var14 * 30.0F + var12 * 70.0F) / 100.0F;
            float var18 = (var14 * 30.0F + var15 * 70.0F) / 100.0F;
            var14 = var16;
            var12 = var17;
            var15 = var18;
         }

         var8.setVisible6(var14, var12, var15);
      }

      class_73 var24;
      label88: {
         String[] var23 = field_7032;
         var24 = class_480.method_2840("hopper_outside");
         class_73 var25 = class_480.method_2840("hopper_inside");
         var12 = 0.125F;
         if(var7 != null) {
            if(var6 != 0) {
               var8.setVisible2();
               var8.method_7466(1.0F, 0.0F, 0.0F);
               this.drawTextBox5(var1, (double)(-1.0F + var12), 0.0D, 0.0D, var24);
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(-1.0F, 0.0F, 0.0F);
               this.drawTextBox4(var1, (double)(1.0F - var12), 0.0D, 0.0D, var24);
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(0.0F, 0.0F, 1.0F);
               this.drawTextBox3(var1, 0.0D, 0.0D, (double)(-1.0F + var12), var24);
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(0.0F, 0.0F, -1.0F);
               this.drawTextBox2(var1, 0.0D, 0.0D, (double)(1.0F - var12), var24);
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(0.0F, 1.0F, 0.0F);
               this.drawTextBox1(var1, 0.0D, -1.0D + var10, 0.0D, var25);
               var8.getVisible8();
               if(var7 != null) {
                  break label88;
               }
            }

            this.drawTextBox5(var1, (double)((float)var2 - 1.0F + var12), (double)var3, (double)var4, var24);
            this.drawTextBox4(var1, (double)((float)var2 + 1.0F - var12), (double)var3, (double)var4, var24);
            this.drawTextBox3(var1, (double)var2, (double)var3, (double)((float)var4 - 1.0F + var12), var24);
            this.drawTextBox2(var1, (double)var2, (double)var3, (double)((float)var4 + 1.0F - var12), var24);
         }

         this.drawTextBox1(var1, (double)var2, (double)((float)var3 - 1.0F) + var10, (double)var4, var25);
      }

      this.method_7204(var24);
      double var26 = 0.25D;
      double var28 = 0.25D;
      this.method_7209(var26, var28, var26, 1.0D - var26, var10 - 0.002D, 1.0D - var26);
      if(var7 != null) {
         label79: {
            if(var6 != 0) {
               var8.setVisible2();
               var8.method_7466(1.0F, 0.0F, 0.0F);
               this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, var24);
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(-1.0F, 0.0F, 0.0F);
               this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, var24);
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(0.0F, 0.0F, 1.0F);
               this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, var24);
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(0.0F, 0.0F, -1.0F);
               this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, var24);
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(0.0F, 1.0F, 0.0F);
               this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, var24);
               var8.getVisible8();
               var8.setVisible2();
               var8.method_7466(0.0F, -1.0F, 0.0F);
               this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, var24);
               var8.getVisible8();
               if(var7 != null) {
                  break label79;
               }
            }

            this.method_7260(var1, var2, var3, var4);
         }
      }

      var27 = var6;
      if(var7 != null) {
         if(var6 == 0) {
            double var19 = 0.375D;
            double var21 = 0.25D;
            this.method_7204(var24);
            var27 = var9;
            if(var7 != null) {
               if(var9 == 0) {
                  this.method_7209(var19, 0.0D, var19, 1.0D - var19, 0.25D, 1.0D - var19);
                  this.method_7260(var1, var2, var3, var4);
               }

               var27 = var9;
            }

            byte var10001 = 2;
            if(var7 != null) {
               if(var27 == 2) {
                  this.method_7209(var19, var28, 0.0D, 1.0D - var19, var28 + var21, var26);
                  this.method_7260(var1, var2, var3, var4);
               }

               var27 = var9;
               var10001 = 3;
            }

            if(var7 != null) {
               if(var27 == var10001) {
                  this.method_7209(var19, var28, 1.0D - var26, 1.0D - var19, var28 + var21, 1.0D);
                  this.method_7260(var1, var2, var3, var4);
               }

               var27 = var9;
               var10001 = 4;
            }

            if(var7 != null) {
               if(var27 == var10001) {
                  this.method_7209(0.0D, var28, var19, var26, var28 + var21, 1.0D - var19);
                  this.method_7260(var1, var2, var3, var4);
               }

               var27 = var9;
               if(var7 == null) {
                  return (boolean)var27;
               }

               var10001 = 5;
            }

            if(var27 == var10001) {
               this.method_7209(1.0D - var26, var28, var19, 1.0D, var28 + var21, 1.0D - var19);
               this.method_7260(var1, var2, var3, var4);
            }
         }

         this.method_7205();
         var27 = 1;
      }

      return (boolean)var27;
   }

   // $FF: renamed from: a (fN, int, int, int) boolean
   public boolean method_7278(class_398 var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      var1.method_2626(this.field_6952, var2, var3, var4);
      String[] var5 = var10000;
      this.method_7210(var1);
      this.method_7260(var1, var2, var3, var4);
      this.field_6955 = true;
      boolean var6 = var1.method_2629(this.field_6952, var2, var3, var4);
      this.method_7210(var1);
      this.method_7260(var1, var2, var3, var4);
      boolean var7 = var6;
      if(var5 != null) {
         if(var6) {
            var7 = var1.method_2630(this.field_6952, var2, var3, var4);
            if(var5 == null) {
               return var7;
            }

            if(var7) {
               this.method_7210(var1);
               this.method_7260(var1, var2, var3, var4);
            }
         }

         this.field_6955 = false;
         var7 = true;
      }

      return var7;
   }

   // $FF: renamed from: u (aji, int, int, int) boolean
   public boolean method_7279(aji var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      bmh var6 = bmh.instance;
      int var7 = this.field_6952.method_33(var2, var3, var4);
      String[] var5 = var10000;
      if((var7 & 8) != 0) {
         if(this.field_6952.getBlock(var2, var3 - 1, var4) != var1) {
            return false;
         }
      } else if(this.field_6952.getBlock(var2, var3 + 1, var4) != var1) {
         return false;
      }

      boolean var8 = false;
      float var9 = 0.5F;
      float var10 = 1.0F;
      float var11 = 0.8F;
      float var12 = 0.6F;
      int var13 = var1.method_2444(this.field_6952, var2, var3, var4);
      double var15;
      int var10001 = (var15 = this.field_6962 - 0.0D) == 0.0D?0:(var15 < 0.0D?-1:1);
      if(var5 != null) {
         var10001 = var10001 > 0?var13:var1.method_2444(this.field_6952, var2, var3 - 1, var4);
      }

      var6.setVisible5(var10001);
      var6.setVisible6(var9, var9, var9);
      this.drawTextBox0(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 0));
      var8 = true;
      double var16;
      var10001 = (var16 = this.field_6963 - 1.0D) == 0.0D?0:(var16 < 0.0D?-1:1);
      if(var5 != null) {
         var10001 = var10001 < 0?var13:var1.method_2444(this.field_6952, var2, var3 + 1, var4);
      }

      var6.setVisible5(var10001);
      var6.setVisible6(var10, var10, var10);
      this.drawTextBox1(var1, (double)var2, (double)var3, (double)var4, this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 1));
      var8 = true;
      double var17;
      var10001 = (var17 = this.field_6964 - 0.0D) == 0.0D?0:(var17 < 0.0D?-1:1);
      if(var5 != null) {
         var10001 = var10001 > 0?var13:var1.method_2444(this.field_6952, var2, var3, var4 - 1);
      }

      var6.setVisible5(var10001);
      var6.setVisible6(var11, var11, var11);
      class_73 var14 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 2);
      this.drawTextBox2(var1, (double)var2, (double)var3, (double)var4, var14);
      var8 = true;
      this.field_6954 = false;
      double var18;
      var10001 = (var18 = this.field_6965 - 1.0D) == 0.0D?0:(var18 < 0.0D?-1:1);
      if(var5 != null) {
         var10001 = var10001 < 0?var13:var1.method_2444(this.field_6952, var2, var3, var4 + 1);
      }

      var6.setVisible5(var10001);
      var6.setVisible6(var11, var11, var11);
      var14 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 3);
      this.drawTextBox3(var1, (double)var2, (double)var3, (double)var4, var14);
      var8 = true;
      this.field_6954 = false;
      double var19;
      var10001 = (var19 = this.field_6960 - 0.0D) == 0.0D?0:(var19 < 0.0D?-1:1);
      if(var5 != null) {
         var10001 = var10001 > 0?var13:var1.method_2444(this.field_6952, var2 - 1, var3, var4);
      }

      var6.setVisible5(var10001);
      var6.setVisible6(var12, var12, var12);
      var14 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 4);
      this.drawTextBox4(var1, (double)var2, (double)var3, (double)var4, var14);
      var8 = true;
      this.field_6954 = false;
      double var20;
      var10001 = (var20 = this.field_6961 - 1.0D) == 0.0D?0:(var20 < 0.0D?-1:1);
      if(var5 != null) {
         var10001 = var10001 < 0?var13:var1.method_2444(this.field_6952, var2 + 1, var3, var4);
      }

      var6.setVisible5(var10001);
      var6.setVisible6(var12, var12, var12);
      var14 = this.drawTextBox8(var1, this.field_6952, var2, var3, var4, 5);
      this.drawTextBox5(var1, (double)var2, (double)var3, (double)var4, var14);
      var8 = true;
      this.field_6954 = false;
      return var8;
   }

   // $FF: renamed from: a (aji, double, double, double, vL) void
   public void drawTextBox0(aji var1, double var2, double var4, double var6, class_73 var8) {
      String[] var10000 = class_752.method_4253();
      bmh var10 = bmh.instance;
      String[] var9 = var10000;
      byte var39 = this.method_7206();
      if(var9 != null) {
         if(var39 != 0) {
            var8 = this.field_6953;
         }

         var39 = Config.isConnectedTextures();
      }

      class_73 var40;
      if(var9 != null) {
         if(var39 != 0) {
            label192: {
               var40 = this.field_6953;
               if(var9 != null) {
                  if(this.field_6953 != null) {
                     break label192;
                  }

                  var40 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, (int)var2, (int)var4, (int)var6, 0, var8);
               }

               var8 = var40;
            }
         }

         var39 = 0;
      }

      int var11;
      byte var10001;
      int var42;
      label186: {
         var11 = var39;
         if(Config.isNaturalTextures()) {
            var40 = this.field_6953;
            if(var9 == null) {
               break label186;
            }

            if(this.field_6953 == null && this.field_6974 == 0) {
               var40 = var8;
               if(var9 == null) {
                  break label186;
               }

               class_890 var12 = NaturalTextures.getNaturalProperties(var8);
               if(var12 != null) {
                  int var13;
                  label200: {
                     var13 = Config.getRandom((int)var2, (int)var4, (int)var6, 0);
                     var42 = var12.yPosition8;
                     var10001 = 1;
                     if(var9 != null) {
                        if(var12.yPosition8 > 1) {
                           this.field_6974 = var13 & 3;
                        }

                        var42 = var12.yPosition8;
                        if(var9 == null) {
                           break label200;
                        }

                        var10001 = 2;
                     }

                     if(var42 == var10001) {
                        this.field_6974 = this.field_6974 / 2 * 3;
                     }

                     var42 = var12.yPosition9;
                  }

                  if(var9 != null) {
                     if(var42 != 0) {
                        int var41 = var13 & 4;
                        if(var9 != null) {
                           var41 = var41 != 0?1:0;
                        }

                        this.field_6954 = (boolean)var41;
                     }

                     var42 = 1;
                  }

                  var11 = var42;
               }
            }
         }

         var40 = var8;
      }

      double var14;
      double var16;
      double var18;
      double var38;
      label168: {
         label167: {
            double var43;
            label202: {
               label203: {
                  label164: {
                     var38 = (double)var40.method_370(this.field_6960 * 16.0D);
                     var14 = (double)var8.method_370(this.field_6961 * 16.0D);
                     var16 = (double)var8.method_373(this.field_6964 * 16.0D);
                     var18 = (double)var8.method_373(this.field_6965 * 16.0D);
                     var43 = this.field_6960;
                     if(var9 != null) {
                        if(this.field_6960 >= 0.0D) {
                           double var45;
                           var42 = (var45 = this.field_6961 - 1.0D) == 0.0D?0:(var45 < 0.0D?-1:1);
                           if(var9 == null) {
                              break label203;
                           }

                           if(var42 <= 0) {
                              break label164;
                           }
                        }

                        var38 = (double)var8.method_368();
                        var43 = (double)var8.method_369();
                     }

                     var14 = var43;
                  }

                  var43 = this.field_6964;
                  if(var9 == null) {
                     break label202;
                  }

                  double var46;
                  var42 = (var46 = this.field_6964 - 0.0D) == 0.0D?0:(var46 < 0.0D?-1:1);
               }

               if(var42 >= 0) {
                  double var47;
                  var42 = (var47 = this.field_6965 - 1.0D) == 0.0D?0:(var47 < 0.0D?-1:1);
                  if(var9 == null) {
                     break label168;
                  }

                  if(var42 <= 0) {
                     break label167;
                  }
               }

               var16 = (double)var8.method_371();
               var43 = (double)var8.method_372();
            }

            var18 = var43;
         }

         var42 = this.field_6954;
      }

      double var20;
      if(var42 != 0) {
         var20 = var38;
         var38 = var14;
         var14 = var20;
      }

      double var22;
      double var24;
      double var26;
      double var28;
      label143: {
         label204: {
            var20 = var14;
            var22 = var38;
            var24 = var16;
            var26 = var18;
            var42 = this.field_6974;
            var10001 = 2;
            if(var9 != null) {
               if(this.field_6974 == 2) {
                  var38 = (double)var8.method_370(this.field_6964 * 16.0D);
                  var16 = (double)var8.method_373(16.0D - this.field_6961 * 16.0D);
                  var14 = (double)var8.method_370(this.field_6965 * 16.0D);
                  var18 = (double)var8.method_373(16.0D - this.field_6960 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var24 = var16;
                     var26 = var18;
                     var20 = var38;
                     var22 = var14;
                     var16 = var18;
                     var18 = var24;
                  }

                  if(var9 != null) {
                     break label204;
                  }
               }

               var42 = this.field_6974;
               var10001 = 1;
            }

            if(var9 != null) {
               if(var42 == var10001) {
                  var38 = (double)var8.method_370(16.0D - this.field_6965 * 16.0D);
                  var16 = (double)var8.method_373(this.field_6960 * 16.0D);
                  var14 = (double)var8.method_370(16.0D - this.field_6964 * 16.0D);
                  var18 = (double)var8.method_373(this.field_6961 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var20 = var14;
                     var22 = var38;
                     var38 = var14;
                     var14 = var22;
                     var24 = var18;
                     var26 = var16;
                  }

                  if(var9 != null) {
                     break label204;
                  }
               }

               var42 = this.field_6974;
               if(var9 == null) {
                  break label143;
               }

               var10001 = 3;
            }

            if(var42 == var10001) {
               var38 = (double)var8.method_370(16.0D - this.field_6960 * 16.0D);
               var14 = (double)var8.method_370(16.0D - this.field_6961 * 16.0D);
               var16 = (double)var8.method_373(16.0D - this.field_6964 * 16.0D);
               var18 = (double)var8.method_373(16.0D - this.field_6965 * 16.0D);
               if(var9 != null) {
                  if(this.field_6954) {
                     var28 = var38;
                     var38 = var14;
                     var14 = var28;
                  }

                  var20 = var14;
                  var22 = var38;
                  var24 = var16;
               }

               var26 = var18;
            }
         }

         var42 = var11;
      }

      if(var42 != 0) {
         this.field_6974 = 0;
         this.field_6954 = false;
      }

      var28 = var2 + this.field_6960;
      double var30 = var2 + this.field_6961;
      double var32 = var4 + this.field_6962;
      double var34 = var6 + this.field_6964;
      double var36 = var6 + this.field_6965;
      boolean var44 = this.field_6959;
      if(var9 != null) {
         if(this.field_6959) {
            var28 = var2 + this.field_6961;
            var30 = var2 + this.field_6960;
         }

         var44 = this.field_6975;
      }

      if(var44) {
         var10.setVisible6(this.field_7020, this.field_7024, this.field_7028);
         var10.setVisible5(this.field_7016);
         var10.addVertexWithUV(var28, var32, var36, var22, var26);
         var10.setVisible6(this.field_7021, this.field_7025, this.field_7029);
         var10.setVisible5(this.field_7017);
         var10.addVertexWithUV(var28, var32, var34, var38, var16);
         var10.setVisible6(this.field_7022, this.field_7026, this.field_7030);
         var10.setVisible5(this.field_7018);
         var10.addVertexWithUV(var30, var32, var34, var20, var24);
         var10.setVisible6(this.field_7023, this.field_7027, this.field_7031);
         var10.setVisible5(this.field_7019);
         var10.addVertexWithUV(var30, var32, var36, var14, var18);
         if(var9 != null) {
            return;
         }
      }

      var10.addVertexWithUV(var28, var32, var36, var22, var26);
      var10.addVertexWithUV(var28, var32, var34, var38, var16);
      var10.addVertexWithUV(var30, var32, var34, var20, var24);
      var10.addVertexWithUV(var30, var32, var36, var14, var18);
   }

   // $FF: renamed from: b (aji, double, double, double, vL) void
   public void drawTextBox1(aji var1, double var2, double var4, double var6, class_73 var8) {
      String[] var10000 = class_752.method_4253();
      bmh var10 = bmh.instance;
      String[] var9 = var10000;
      byte var39 = this.method_7206();
      if(var9 != null) {
         if(var39 != 0) {
            var8 = this.field_6953;
         }

         var39 = Config.isConnectedTextures();
      }

      class_73 var40;
      if(var9 != null) {
         if(var39 != 0) {
            label198: {
               var40 = this.field_6953;
               if(var9 != null) {
                  if(this.field_6953 != null) {
                     break label198;
                  }

                  var40 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, (int)var2, (int)var4, (int)var6, 1, var8);
               }

               var8 = var40;
            }
         }

         var39 = 0;
      }

      int var11;
      byte var10001;
      int var42;
      label192: {
         var11 = var39;
         if(Config.isNaturalTextures()) {
            var40 = this.field_6953;
            if(var9 == null) {
               break label192;
            }

            if(this.field_6953 == null && this.field_6973 == 0) {
               var40 = var8;
               if(var9 == null) {
                  break label192;
               }

               class_890 var12 = NaturalTextures.getNaturalProperties(var8);
               if(var12 != null) {
                  int var13;
                  label206: {
                     var13 = Config.getRandom((int)var2, (int)var4, (int)var6, 1);
                     var42 = var12.yPosition8;
                     var10001 = 1;
                     if(var9 != null) {
                        if(var12.yPosition8 > 1) {
                           this.field_6973 = var13 & 3;
                        }

                        var42 = var12.yPosition8;
                        if(var9 == null) {
                           break label206;
                        }

                        var10001 = 2;
                     }

                     if(var42 == var10001) {
                        this.field_6973 = this.field_6973 / 2 * 3;
                     }

                     var42 = var12.yPosition9;
                  }

                  if(var9 != null) {
                     if(var42 != 0) {
                        int var41 = var13 & 4;
                        if(var9 != null) {
                           var41 = var41 != 0?1:0;
                        }

                        this.field_6954 = (boolean)var41;
                     }

                     var42 = 1;
                  }

                  var11 = var42;
               }
            }
         }

         var40 = var8;
      }

      double var14;
      double var16;
      double var18;
      double var20;
      double var38;
      double var43;
      label174: {
         label173: {
            label208: {
               label209: {
                  label170: {
                     label210: {
                        var38 = (double)var40.method_370(this.field_6960 * 16.0D);
                        var14 = (double)var8.method_370(this.field_6961 * 16.0D);
                        var16 = (double)var8.method_373(this.field_6964 * 16.0D);
                        var18 = (double)var8.method_373(this.field_6965 * 16.0D);
                        var42 = this.field_6954;
                        if(var9 != null) {
                           if(this.field_6954) {
                              var20 = var38;
                              var38 = var14;
                              var14 = var20;
                           }

                           var43 = this.field_6960;
                           if(var9 == null) {
                              break label210;
                           }

                           double var45;
                           var42 = (var45 = this.field_6960 - 0.0D) == 0.0D?0:(var45 < 0.0D?-1:1);
                        }

                        if(var42 >= 0) {
                           double var46;
                           var42 = (var46 = this.field_6961 - 1.0D) == 0.0D?0:(var46 < 0.0D?-1:1);
                           if(var9 == null) {
                              break label209;
                           }

                           if(var42 <= 0) {
                              break label170;
                           }
                        }

                        var38 = (double)var8.method_368();
                        var43 = (double)var8.method_369();
                     }

                     var14 = var43;
                  }

                  var43 = this.field_6964;
                  if(var9 == null) {
                     break label208;
                  }

                  double var47;
                  var42 = (var47 = this.field_6964 - 0.0D) == 0.0D?0:(var47 < 0.0D?-1:1);
               }

               if(var42 >= 0) {
                  var43 = this.field_6965;
                  if(var9 == null) {
                     break label174;
                  }

                  if(this.field_6965 <= 1.0D) {
                     break label173;
                  }
               }

               var16 = (double)var8.method_371();
               var43 = (double)var8.method_372();
            }

            var18 = var43;
         }

         var43 = var14;
      }

      double var22;
      double var24;
      double var26;
      double var28;
      label145: {
         label212: {
            var20 = var43;
            var22 = var38;
            var24 = var16;
            var26 = var18;
            var42 = this.field_6973;
            var10001 = 1;
            if(var9 != null) {
               if(this.field_6973 == 1) {
                  var38 = (double)var8.method_370(this.field_6964 * 16.0D);
                  var16 = (double)var8.method_373(16.0D - this.field_6961 * 16.0D);
                  var14 = (double)var8.method_370(this.field_6965 * 16.0D);
                  var18 = (double)var8.method_373(16.0D - this.field_6960 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var24 = var16;
                     var26 = var18;
                     var20 = var38;
                     var22 = var14;
                     var16 = var18;
                     var18 = var24;
                  }

                  if(var9 != null) {
                     break label212;
                  }
               }

               var42 = this.field_6973;
               var10001 = 2;
            }

            if(var9 != null) {
               if(var42 == var10001) {
                  var38 = (double)var8.method_370(16.0D - this.field_6965 * 16.0D);
                  var16 = (double)var8.method_373(this.field_6960 * 16.0D);
                  var14 = (double)var8.method_370(16.0D - this.field_6964 * 16.0D);
                  var18 = (double)var8.method_373(this.field_6961 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var20 = var14;
                     var22 = var38;
                     var38 = var14;
                     var14 = var22;
                     var24 = var18;
                     var26 = var16;
                  }

                  if(var9 != null) {
                     break label212;
                  }
               }

               var42 = this.field_6973;
               if(var9 == null) {
                  break label145;
               }

               var10001 = 3;
            }

            if(var42 == var10001) {
               var38 = (double)var8.method_370(16.0D - this.field_6960 * 16.0D);
               var14 = (double)var8.method_370(16.0D - this.field_6961 * 16.0D);
               var16 = (double)var8.method_373(16.0D - this.field_6964 * 16.0D);
               var18 = (double)var8.method_373(16.0D - this.field_6965 * 16.0D);
               if(var9 != null) {
                  if(this.field_6954) {
                     var28 = var38;
                     var38 = var14;
                     var14 = var28;
                  }

                  var20 = var14;
                  var22 = var38;
                  var24 = var16;
               }

               var26 = var18;
            }
         }

         var42 = var11;
      }

      if(var42 != 0) {
         this.field_6973 = 0;
         this.field_6954 = false;
      }

      var28 = var2 + this.field_6960;
      double var30 = var2 + this.field_6961;
      double var32 = var4 + this.field_6963;
      double var34 = var6 + this.field_6964;
      double var36 = var6 + this.field_6965;
      boolean var44 = this.field_6959;
      if(var9 != null) {
         if(this.field_6959) {
            var28 = var2 + this.field_6961;
            var30 = var2 + this.field_6960;
         }

         var44 = this.field_6975;
      }

      if(var44) {
         var10.setVisible6(this.field_7020, this.field_7024, this.field_7028);
         var10.setVisible5(this.field_7016);
         var10.addVertexWithUV(var30, var32, var36, var14, var18);
         var10.setVisible6(this.field_7021, this.field_7025, this.field_7029);
         var10.setVisible5(this.field_7017);
         var10.addVertexWithUV(var30, var32, var34, var20, var24);
         var10.setVisible6(this.field_7022, this.field_7026, this.field_7030);
         var10.setVisible5(this.field_7018);
         var10.addVertexWithUV(var28, var32, var34, var38, var16);
         var10.setVisible6(this.field_7023, this.field_7027, this.field_7031);
         var10.setVisible5(this.field_7019);
         var10.addVertexWithUV(var28, var32, var36, var22, var26);
         if(var9 != null) {
            return;
         }
      }

      var10.addVertexWithUV(var30, var32, var36, var14, var18);
      var10.addVertexWithUV(var30, var32, var34, var20, var24);
      var10.addVertexWithUV(var28, var32, var34, var38, var16);
      var10.addVertexWithUV(var28, var32, var36, var22, var26);
   }

   // $FF: renamed from: c (aji, double, double, double, vL) void
   public void drawTextBox2(aji var1, double var2, double var4, double var6, class_73 var8) {
      String[] var10000 = class_752.method_4253();
      bmh var10 = bmh.instance;
      String[] var9 = var10000;
      byte var39 = this.method_7206();
      if(var9 != null) {
         if(var39 != 0) {
            var8 = this.field_6953;
         }

         var39 = Config.isConnectedTextures();
      }

      class_73 var40;
      if(var9 != null) {
         if(var39 != 0) {
            label208: {
               var40 = this.field_6953;
               if(var9 != null) {
                  if(this.field_6953 != null) {
                     break label208;
                  }

                  var40 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, (int)var2, (int)var4, (int)var6, 2, var8);
               }

               var8 = var40;
            }
         }

         var39 = 0;
      }

      int var11;
      byte var10001;
      int var42;
      label202: {
         var11 = var39;
         if(Config.isNaturalTextures()) {
            var40 = this.field_6953;
            if(var9 == null) {
               break label202;
            }

            if(this.field_6953 == null && this.field_6969 == 0) {
               var40 = var8;
               if(var9 == null) {
                  break label202;
               }

               class_890 var12 = NaturalTextures.getNaturalProperties(var8);
               if(var12 != null) {
                  int var13;
                  label216: {
                     var13 = Config.getRandom((int)var2, (int)var4, (int)var6, 2);
                     var42 = var12.yPosition8;
                     var10001 = 1;
                     if(var9 != null) {
                        if(var12.yPosition8 > 1) {
                           this.field_6969 = var13 & 3;
                        }

                        var42 = var12.yPosition8;
                        if(var9 == null) {
                           break label216;
                        }

                        var10001 = 2;
                     }

                     if(var42 == var10001) {
                        this.field_6969 = this.field_6969 / 2 * 3;
                     }

                     var42 = var12.yPosition9;
                  }

                  if(var9 != null) {
                     if(var42 != 0) {
                        int var41 = var13 & 4;
                        if(var9 != null) {
                           var41 = var41 != 0?1:0;
                        }

                        this.field_6954 = (boolean)var41;
                     }

                     var42 = 1;
                  }

                  var11 = var42;
               }
            }
         }

         var40 = var8;
      }

      double var14;
      double var38;
      label184: {
         var38 = (double)var40.method_370(this.field_6960 * 16.0D);
         var14 = (double)var8.method_370(this.field_6961 * 16.0D);
         if(var9 != null) {
            if(!this.field_6955) {
               break label184;
            }

            var14 = (double)var8.method_370((1.0D - this.field_6960) * 16.0D);
         }

         var38 = (double)var8.method_370((1.0D - this.field_6961) * 16.0D);
      }

      double var16;
      double var18;
      double var20;
      double var43;
      label178: {
         label177: {
            label218: {
               label219: {
                  label174: {
                     label220: {
                        var16 = (double)var8.method_373(16.0D - this.field_6963 * 16.0D);
                        var18 = (double)var8.method_373(16.0D - this.field_6962 * 16.0D);
                        var42 = this.field_6954;
                        if(var9 != null) {
                           if(this.field_6954) {
                              var20 = var38;
                              var38 = var14;
                              var14 = var20;
                           }

                           var43 = this.field_6960;
                           if(var9 == null) {
                              break label220;
                           }

                           double var45;
                           var42 = (var45 = this.field_6960 - 0.0D) == 0.0D?0:(var45 < 0.0D?-1:1);
                        }

                        if(var42 >= 0) {
                           double var46;
                           var42 = (var46 = this.field_6961 - 1.0D) == 0.0D?0:(var46 < 0.0D?-1:1);
                           if(var9 == null) {
                              break label219;
                           }

                           if(var42 <= 0) {
                              break label174;
                           }
                        }

                        var38 = (double)var8.method_368();
                        var43 = (double)var8.method_369();
                     }

                     var14 = var43;
                  }

                  var43 = this.field_6962;
                  if(var9 == null) {
                     break label218;
                  }

                  double var47;
                  var42 = (var47 = this.field_6962 - 0.0D) == 0.0D?0:(var47 < 0.0D?-1:1);
               }

               if(var42 >= 0) {
                  var43 = this.field_6963;
                  if(var9 == null) {
                     break label178;
                  }

                  if(this.field_6963 <= 1.0D) {
                     break label177;
                  }
               }

               var16 = (double)var8.method_371();
               var43 = (double)var8.method_372();
            }

            var18 = var43;
         }

         var43 = var14;
      }

      double var22;
      double var24;
      double var26;
      double var28;
      label149: {
         label222: {
            var20 = var43;
            var22 = var38;
            var24 = var16;
            var26 = var18;
            var42 = this.field_6969;
            var10001 = 2;
            if(var9 != null) {
               if(this.field_6969 == 2) {
                  var38 = (double)var8.method_370(this.field_6962 * 16.0D);
                  var14 = (double)var8.method_370(this.field_6963 * 16.0D);
                  var16 = (double)var8.method_373(16.0D - this.field_6960 * 16.0D);
                  var18 = (double)var8.method_373(16.0D - this.field_6961 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var24 = var16;
                     var26 = var18;
                     var20 = var38;
                     var22 = var14;
                     var16 = var18;
                     var18 = var24;
                  }

                  if(var9 != null) {
                     break label222;
                  }
               }

               var42 = this.field_6969;
               var10001 = 1;
            }

            if(var9 != null) {
               if(var42 == var10001) {
                  var38 = (double)var8.method_370(16.0D - this.field_6963 * 16.0D);
                  var14 = (double)var8.method_370(16.0D - this.field_6962 * 16.0D);
                  var16 = (double)var8.method_373(this.field_6961 * 16.0D);
                  var18 = (double)var8.method_373(this.field_6960 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var20 = var14;
                     var22 = var38;
                     var38 = var14;
                     var14 = var22;
                     var24 = var18;
                     var26 = var16;
                  }

                  if(var9 != null) {
                     break label222;
                  }
               }

               var42 = this.field_6969;
               if(var9 == null) {
                  break label149;
               }

               var10001 = 3;
            }

            if(var42 == var10001) {
               var38 = (double)var8.method_370(16.0D - this.field_6960 * 16.0D);
               var14 = (double)var8.method_370(16.0D - this.field_6961 * 16.0D);
               var16 = (double)var8.method_373(this.field_6963 * 16.0D);
               var18 = (double)var8.method_373(this.field_6962 * 16.0D);
               if(var9 != null) {
                  if(this.field_6954) {
                     var28 = var38;
                     var38 = var14;
                     var14 = var28;
                  }

                  var20 = var14;
                  var22 = var38;
                  var24 = var16;
               }

               var26 = var18;
            }
         }

         var42 = var11;
      }

      if(var42 != 0) {
         this.field_6969 = 0;
         this.field_6954 = false;
      }

      var28 = var2 + this.field_6960;
      double var30 = var2 + this.field_6961;
      double var32 = var4 + this.field_6962;
      double var34 = var4 + this.field_6963;
      double var36 = var6 + this.field_6964;
      boolean var44 = this.field_6959;
      if(var9 != null) {
         if(this.field_6959) {
            var28 = var2 + this.field_6961;
            var30 = var2 + this.field_6960;
         }

         var44 = this.field_6975;
      }

      if(var44) {
         var10.setVisible6(this.field_7020, this.field_7024, this.field_7028);
         var10.setVisible5(this.field_7016);
         var10.addVertexWithUV(var28, var34, var36, var20, var24);
         var10.setVisible6(this.field_7021, this.field_7025, this.field_7029);
         var10.setVisible5(this.field_7017);
         var10.addVertexWithUV(var30, var34, var36, var38, var16);
         var10.setVisible6(this.field_7022, this.field_7026, this.field_7030);
         var10.setVisible5(this.field_7018);
         var10.addVertexWithUV(var30, var32, var36, var22, var26);
         var10.setVisible6(this.field_7023, this.field_7027, this.field_7031);
         var10.setVisible5(this.field_7019);
         var10.addVertexWithUV(var28, var32, var36, var14, var18);
         if(var9 != null) {
            return;
         }
      }

      var10.addVertexWithUV(var28, var34, var36, var20, var24);
      var10.addVertexWithUV(var30, var34, var36, var38, var16);
      var10.addVertexWithUV(var30, var32, var36, var22, var26);
      var10.addVertexWithUV(var28, var32, var36, var14, var18);
   }

   // $FF: renamed from: d (aji, double, double, double, vL) void
   public void drawTextBox3(aji var1, double var2, double var4, double var6, class_73 var8) {
      String[] var10000 = class_752.method_4253();
      bmh var10 = bmh.instance;
      String[] var9 = var10000;
      byte var39 = this.method_7206();
      if(var9 != null) {
         if(var39 != 0) {
            var8 = this.field_6953;
         }

         var39 = Config.isConnectedTextures();
      }

      class_73 var40;
      if(var9 != null) {
         if(var39 != 0) {
            label198: {
               var40 = this.field_6953;
               if(var9 != null) {
                  if(this.field_6953 != null) {
                     break label198;
                  }

                  var40 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, (int)var2, (int)var4, (int)var6, 3, var8);
               }

               var8 = var40;
            }
         }

         var39 = 0;
      }

      int var11;
      byte var10001;
      int var42;
      label192: {
         var11 = var39;
         if(Config.isNaturalTextures()) {
            var40 = this.field_6953;
            if(var9 == null) {
               break label192;
            }

            if(this.field_6953 == null && this.field_6970 == 0) {
               var40 = var8;
               if(var9 == null) {
                  break label192;
               }

               class_890 var12 = NaturalTextures.getNaturalProperties(var8);
               if(var12 != null) {
                  int var13;
                  label206: {
                     var13 = Config.getRandom((int)var2, (int)var4, (int)var6, 3);
                     var42 = var12.yPosition8;
                     var10001 = 1;
                     if(var9 != null) {
                        if(var12.yPosition8 > 1) {
                           this.field_6970 = var13 & 3;
                        }

                        var42 = var12.yPosition8;
                        if(var9 == null) {
                           break label206;
                        }

                        var10001 = 2;
                     }

                     if(var42 == var10001) {
                        this.field_6970 = this.field_6970 / 2 * 3;
                     }

                     var42 = var12.yPosition9;
                  }

                  if(var9 != null) {
                     if(var42 != 0) {
                        int var41 = var13 & 4;
                        if(var9 != null) {
                           var41 = var41 != 0?1:0;
                        }

                        this.field_6954 = (boolean)var41;
                     }

                     var42 = 1;
                  }

                  var11 = var42;
               }
            }
         }

         var40 = var8;
      }

      double var14;
      double var16;
      double var18;
      double var20;
      double var38;
      double var43;
      label174: {
         label173: {
            label208: {
               label209: {
                  label170: {
                     label210: {
                        var38 = (double)var40.method_370(this.field_6960 * 16.0D);
                        var14 = (double)var8.method_370(this.field_6961 * 16.0D);
                        var16 = (double)var8.method_373(16.0D - this.field_6963 * 16.0D);
                        var18 = (double)var8.method_373(16.0D - this.field_6962 * 16.0D);
                        var42 = this.field_6954;
                        if(var9 != null) {
                           if(this.field_6954) {
                              var20 = var38;
                              var38 = var14;
                              var14 = var20;
                           }

                           var43 = this.field_6960;
                           if(var9 == null) {
                              break label210;
                           }

                           double var45;
                           var42 = (var45 = this.field_6960 - 0.0D) == 0.0D?0:(var45 < 0.0D?-1:1);
                        }

                        if(var42 >= 0) {
                           double var46;
                           var42 = (var46 = this.field_6961 - 1.0D) == 0.0D?0:(var46 < 0.0D?-1:1);
                           if(var9 == null) {
                              break label209;
                           }

                           if(var42 <= 0) {
                              break label170;
                           }
                        }

                        var38 = (double)var8.method_368();
                        var43 = (double)var8.method_369();
                     }

                     var14 = var43;
                  }

                  var43 = this.field_6962;
                  if(var9 == null) {
                     break label208;
                  }

                  double var47;
                  var42 = (var47 = this.field_6962 - 0.0D) == 0.0D?0:(var47 < 0.0D?-1:1);
               }

               if(var42 >= 0) {
                  var43 = this.field_6963;
                  if(var9 == null) {
                     break label174;
                  }

                  if(this.field_6963 <= 1.0D) {
                     break label173;
                  }
               }

               var16 = (double)var8.method_371();
               var43 = (double)var8.method_372();
            }

            var18 = var43;
         }

         var43 = var14;
      }

      double var22;
      double var24;
      double var26;
      double var28;
      label145: {
         label212: {
            var20 = var43;
            var22 = var38;
            var24 = var16;
            var26 = var18;
            var42 = this.field_6970;
            var10001 = 1;
            if(var9 != null) {
               if(this.field_6970 == 1) {
                  var38 = (double)var8.method_370(this.field_6962 * 16.0D);
                  var18 = (double)var8.method_373(16.0D - this.field_6960 * 16.0D);
                  var14 = (double)var8.method_370(this.field_6963 * 16.0D);
                  var16 = (double)var8.method_373(16.0D - this.field_6961 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var24 = var16;
                     var26 = var18;
                     var20 = var38;
                     var22 = var14;
                     var16 = var18;
                     var18 = var24;
                  }

                  if(var9 != null) {
                     break label212;
                  }
               }

               var42 = this.field_6970;
               var10001 = 2;
            }

            if(var9 != null) {
               if(var42 == var10001) {
                  var38 = (double)var8.method_370(16.0D - this.field_6963 * 16.0D);
                  var16 = (double)var8.method_373(this.field_6960 * 16.0D);
                  var14 = (double)var8.method_370(16.0D - this.field_6962 * 16.0D);
                  var18 = (double)var8.method_373(this.field_6961 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var20 = var14;
                     var22 = var38;
                     var38 = var14;
                     var14 = var22;
                     var24 = var18;
                     var26 = var16;
                  }

                  if(var9 != null) {
                     break label212;
                  }
               }

               var42 = this.field_6970;
               if(var9 == null) {
                  break label145;
               }

               var10001 = 3;
            }

            if(var42 == var10001) {
               var38 = (double)var8.method_370(16.0D - this.field_6960 * 16.0D);
               var14 = (double)var8.method_370(16.0D - this.field_6961 * 16.0D);
               var16 = (double)var8.method_373(this.field_6963 * 16.0D);
               var18 = (double)var8.method_373(this.field_6962 * 16.0D);
               if(var9 != null) {
                  if(this.field_6954) {
                     var28 = var38;
                     var38 = var14;
                     var14 = var28;
                  }

                  var20 = var14;
                  var22 = var38;
                  var24 = var16;
               }

               var26 = var18;
            }
         }

         var42 = var11;
      }

      if(var42 != 0) {
         this.field_6970 = 0;
         this.field_6954 = false;
      }

      var28 = var2 + this.field_6960;
      double var30 = var2 + this.field_6961;
      double var32 = var4 + this.field_6962;
      double var34 = var4 + this.field_6963;
      double var36 = var6 + this.field_6965;
      boolean var44 = this.field_6959;
      if(var9 != null) {
         if(this.field_6959) {
            var28 = var2 + this.field_6961;
            var30 = var2 + this.field_6960;
         }

         var44 = this.field_6975;
      }

      if(var44) {
         var10.setVisible6(this.field_7020, this.field_7024, this.field_7028);
         var10.setVisible5(this.field_7016);
         var10.addVertexWithUV(var28, var34, var36, var38, var16);
         var10.setVisible6(this.field_7021, this.field_7025, this.field_7029);
         var10.setVisible5(this.field_7017);
         var10.addVertexWithUV(var28, var32, var36, var22, var26);
         var10.setVisible6(this.field_7022, this.field_7026, this.field_7030);
         var10.setVisible5(this.field_7018);
         var10.addVertexWithUV(var30, var32, var36, var14, var18);
         var10.setVisible6(this.field_7023, this.field_7027, this.field_7031);
         var10.setVisible5(this.field_7019);
         var10.addVertexWithUV(var30, var34, var36, var20, var24);
         if(var9 != null) {
            return;
         }
      }

      var10.addVertexWithUV(var28, var34, var36, var38, var16);
      var10.addVertexWithUV(var28, var32, var36, var22, var26);
      var10.addVertexWithUV(var30, var32, var36, var14, var18);
      var10.addVertexWithUV(var30, var34, var36, var20, var24);
   }

   // $FF: renamed from: e (aji, double, double, double, vL) void
   public void drawTextBox4(aji var1, double var2, double var4, double var6, class_73 var8) {
      String[] var10000 = class_752.method_4253();
      bmh var10 = bmh.instance;
      String[] var9 = var10000;
      byte var39 = this.method_7206();
      if(var9 != null) {
         if(var39 != 0) {
            var8 = this.field_6953;
         }

         var39 = Config.isConnectedTextures();
      }

      class_73 var40;
      if(var9 != null) {
         if(var39 != 0) {
            label198: {
               var40 = this.field_6953;
               if(var9 != null) {
                  if(this.field_6953 != null) {
                     break label198;
                  }

                  var40 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, (int)var2, (int)var4, (int)var6, 4, var8);
               }

               var8 = var40;
            }
         }

         var39 = 0;
      }

      int var11;
      byte var10001;
      int var42;
      label192: {
         var11 = var39;
         if(Config.isNaturalTextures()) {
            var40 = this.field_6953;
            if(var9 == null) {
               break label192;
            }

            if(this.field_6953 == null && this.field_6972 == 0) {
               var40 = var8;
               if(var9 == null) {
                  break label192;
               }

               class_890 var12 = NaturalTextures.getNaturalProperties(var8);
               if(var12 != null) {
                  int var13;
                  label206: {
                     var13 = Config.getRandom((int)var2, (int)var4, (int)var6, 4);
                     var42 = var12.yPosition8;
                     var10001 = 1;
                     if(var9 != null) {
                        if(var12.yPosition8 > 1) {
                           this.field_6972 = var13 & 3;
                        }

                        var42 = var12.yPosition8;
                        if(var9 == null) {
                           break label206;
                        }

                        var10001 = 2;
                     }

                     if(var42 == var10001) {
                        this.field_6972 = this.field_6972 / 2 * 3;
                     }

                     var42 = var12.yPosition9;
                  }

                  if(var9 != null) {
                     if(var42 != 0) {
                        int var41 = var13 & 4;
                        if(var9 != null) {
                           var41 = var41 != 0?1:0;
                        }

                        this.field_6954 = (boolean)var41;
                     }

                     var42 = 1;
                  }

                  var11 = var42;
               }
            }
         }

         var40 = var8;
      }

      double var14;
      double var16;
      double var18;
      double var20;
      double var38;
      double var43;
      label174: {
         label173: {
            label208: {
               label209: {
                  label170: {
                     label210: {
                        var38 = (double)var40.method_370(this.field_6964 * 16.0D);
                        var14 = (double)var8.method_370(this.field_6965 * 16.0D);
                        var16 = (double)var8.method_373(16.0D - this.field_6963 * 16.0D);
                        var18 = (double)var8.method_373(16.0D - this.field_6962 * 16.0D);
                        var42 = this.field_6954;
                        if(var9 != null) {
                           if(this.field_6954) {
                              var20 = var38;
                              var38 = var14;
                              var14 = var20;
                           }

                           var43 = this.field_6964;
                           if(var9 == null) {
                              break label210;
                           }

                           double var45;
                           var42 = (var45 = this.field_6964 - 0.0D) == 0.0D?0:(var45 < 0.0D?-1:1);
                        }

                        if(var42 >= 0) {
                           double var46;
                           var42 = (var46 = this.field_6965 - 1.0D) == 0.0D?0:(var46 < 0.0D?-1:1);
                           if(var9 == null) {
                              break label209;
                           }

                           if(var42 <= 0) {
                              break label170;
                           }
                        }

                        var38 = (double)var8.method_368();
                        var43 = (double)var8.method_369();
                     }

                     var14 = var43;
                  }

                  var43 = this.field_6962;
                  if(var9 == null) {
                     break label208;
                  }

                  double var47;
                  var42 = (var47 = this.field_6962 - 0.0D) == 0.0D?0:(var47 < 0.0D?-1:1);
               }

               if(var42 >= 0) {
                  var43 = this.field_6963;
                  if(var9 == null) {
                     break label174;
                  }

                  if(this.field_6963 <= 1.0D) {
                     break label173;
                  }
               }

               var16 = (double)var8.method_371();
               var43 = (double)var8.method_372();
            }

            var18 = var43;
         }

         var43 = var14;
      }

      double var22;
      double var24;
      double var26;
      double var28;
      label145: {
         label212: {
            var20 = var43;
            var22 = var38;
            var24 = var16;
            var26 = var18;
            var42 = this.field_6972;
            var10001 = 1;
            if(var9 != null) {
               if(this.field_6972 == 1) {
                  var38 = (double)var8.method_370(this.field_6962 * 16.0D);
                  var16 = (double)var8.method_373(16.0D - this.field_6965 * 16.0D);
                  var14 = (double)var8.method_370(this.field_6963 * 16.0D);
                  var18 = (double)var8.method_373(16.0D - this.field_6964 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var24 = var16;
                     var26 = var18;
                     var20 = var38;
                     var22 = var14;
                     var16 = var18;
                     var18 = var24;
                  }

                  if(var9 != null) {
                     break label212;
                  }
               }

               var42 = this.field_6972;
               var10001 = 2;
            }

            if(var9 != null) {
               if(var42 == var10001) {
                  var38 = (double)var8.method_370(16.0D - this.field_6963 * 16.0D);
                  var16 = (double)var8.method_373(this.field_6964 * 16.0D);
                  var14 = (double)var8.method_370(16.0D - this.field_6962 * 16.0D);
                  var18 = (double)var8.method_373(this.field_6965 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var20 = var14;
                     var22 = var38;
                     var38 = var14;
                     var14 = var22;
                     var24 = var18;
                     var26 = var16;
                  }

                  if(var9 != null) {
                     break label212;
                  }
               }

               var42 = this.field_6972;
               if(var9 == null) {
                  break label145;
               }

               var10001 = 3;
            }

            if(var42 == var10001) {
               var38 = (double)var8.method_370(16.0D - this.field_6964 * 16.0D);
               var14 = (double)var8.method_370(16.0D - this.field_6965 * 16.0D);
               var16 = (double)var8.method_373(this.field_6963 * 16.0D);
               var18 = (double)var8.method_373(this.field_6962 * 16.0D);
               if(var9 != null) {
                  if(this.field_6954) {
                     var28 = var38;
                     var38 = var14;
                     var14 = var28;
                  }

                  var20 = var14;
                  var22 = var38;
                  var24 = var16;
               }

               var26 = var18;
            }
         }

         var42 = var11;
      }

      if(var42 != 0) {
         this.field_6972 = 0;
         this.field_6954 = false;
      }

      var28 = var2 + this.field_6960;
      double var30 = var4 + this.field_6962;
      double var32 = var4 + this.field_6963;
      double var34 = var6 + this.field_6964;
      double var36 = var6 + this.field_6965;
      boolean var44 = this.field_6959;
      if(var9 != null) {
         if(this.field_6959) {
            var34 = var6 + this.field_6965;
            var36 = var6 + this.field_6964;
         }

         var44 = this.field_6975;
      }

      if(var44) {
         var10.setVisible6(this.field_7020, this.field_7024, this.field_7028);
         var10.setVisible5(this.field_7016);
         var10.addVertexWithUV(var28, var32, var36, var20, var24);
         var10.setVisible6(this.field_7021, this.field_7025, this.field_7029);
         var10.setVisible5(this.field_7017);
         var10.addVertexWithUV(var28, var32, var34, var38, var16);
         var10.setVisible6(this.field_7022, this.field_7026, this.field_7030);
         var10.setVisible5(this.field_7018);
         var10.addVertexWithUV(var28, var30, var34, var22, var26);
         var10.setVisible6(this.field_7023, this.field_7027, this.field_7031);
         var10.setVisible5(this.field_7019);
         var10.addVertexWithUV(var28, var30, var36, var14, var18);
         if(var9 != null) {
            return;
         }
      }

      var10.addVertexWithUV(var28, var32, var36, var20, var24);
      var10.addVertexWithUV(var28, var32, var34, var38, var16);
      var10.addVertexWithUV(var28, var30, var34, var22, var26);
      var10.addVertexWithUV(var28, var30, var36, var14, var18);
   }

   // $FF: renamed from: f (aji, double, double, double, vL) void
   public void drawTextBox5(aji var1, double var2, double var4, double var6, class_73 var8) {
      String[] var10000 = class_752.method_4253();
      bmh var10 = bmh.instance;
      String[] var9 = var10000;
      byte var39 = this.method_7206();
      if(var9 != null) {
         if(var39 != 0) {
            var8 = this.field_6953;
         }

         var39 = Config.isConnectedTextures();
      }

      class_73 var40;
      if(var9 != null) {
         if(var39 != 0) {
            label208: {
               var40 = this.field_6953;
               if(var9 != null) {
                  if(this.field_6953 != null) {
                     break label208;
                  }

                  var40 = ConnectedTextures.getConnectedTexture(this.field_6952, var1, (int)var2, (int)var4, (int)var6, 5, var8);
               }

               var8 = var40;
            }
         }

         var39 = 0;
      }

      int var11;
      byte var10001;
      int var42;
      label202: {
         var11 = var39;
         if(Config.isNaturalTextures()) {
            var40 = this.field_6953;
            if(var9 == null) {
               break label202;
            }

            if(this.field_6953 == null && this.field_6971 == 0) {
               var40 = var8;
               if(var9 == null) {
                  break label202;
               }

               class_890 var12 = NaturalTextures.getNaturalProperties(var8);
               if(var12 != null) {
                  int var13;
                  label216: {
                     var13 = Config.getRandom((int)var2, (int)var4, (int)var6, 5);
                     var42 = var12.yPosition8;
                     var10001 = 1;
                     if(var9 != null) {
                        if(var12.yPosition8 > 1) {
                           this.field_6971 = var13 & 3;
                        }

                        var42 = var12.yPosition8;
                        if(var9 == null) {
                           break label216;
                        }

                        var10001 = 2;
                     }

                     if(var42 == var10001) {
                        this.field_6971 = this.field_6971 / 2 * 3;
                     }

                     var42 = var12.yPosition9;
                  }

                  if(var9 != null) {
                     if(var42 != 0) {
                        int var41 = var13 & 4;
                        if(var9 != null) {
                           var41 = var41 != 0?1:0;
                        }

                        this.field_6954 = (boolean)var41;
                     }

                     var42 = 1;
                  }

                  var11 = var42;
               }
            }
         }

         var40 = var8;
      }

      double var14;
      double var38;
      label184: {
         var38 = (double)var40.method_370(this.field_6964 * 16.0D);
         var14 = (double)var8.method_370(this.field_6965 * 16.0D);
         if(var9 != null) {
            if(!this.field_6955) {
               break label184;
            }

            var14 = (double)var8.method_370((1.0D - this.field_6964) * 16.0D);
         }

         var38 = (double)var8.method_370((1.0D - this.field_6965) * 16.0D);
      }

      double var16;
      double var18;
      double var20;
      double var43;
      label178: {
         label177: {
            label218: {
               label219: {
                  label174: {
                     label220: {
                        var16 = (double)var8.method_373(16.0D - this.field_6963 * 16.0D);
                        var18 = (double)var8.method_373(16.0D - this.field_6962 * 16.0D);
                        var42 = this.field_6954;
                        if(var9 != null) {
                           if(this.field_6954) {
                              var20 = var38;
                              var38 = var14;
                              var14 = var20;
                           }

                           var43 = this.field_6964;
                           if(var9 == null) {
                              break label220;
                           }

                           double var45;
                           var42 = (var45 = this.field_6964 - 0.0D) == 0.0D?0:(var45 < 0.0D?-1:1);
                        }

                        if(var42 >= 0) {
                           double var46;
                           var42 = (var46 = this.field_6965 - 1.0D) == 0.0D?0:(var46 < 0.0D?-1:1);
                           if(var9 == null) {
                              break label219;
                           }

                           if(var42 <= 0) {
                              break label174;
                           }
                        }

                        var38 = (double)var8.method_368();
                        var43 = (double)var8.method_369();
                     }

                     var14 = var43;
                  }

                  var43 = this.field_6962;
                  if(var9 == null) {
                     break label218;
                  }

                  double var47;
                  var42 = (var47 = this.field_6962 - 0.0D) == 0.0D?0:(var47 < 0.0D?-1:1);
               }

               if(var42 >= 0) {
                  var43 = this.field_6963;
                  if(var9 == null) {
                     break label178;
                  }

                  if(this.field_6963 <= 1.0D) {
                     break label177;
                  }
               }

               var16 = (double)var8.method_371();
               var43 = (double)var8.method_372();
            }

            var18 = var43;
         }

         var43 = var14;
      }

      double var22;
      double var24;
      double var26;
      double var28;
      label149: {
         label222: {
            var20 = var43;
            var22 = var38;
            var24 = var16;
            var26 = var18;
            var42 = this.field_6971;
            var10001 = 2;
            if(var9 != null) {
               if(this.field_6971 == 2) {
                  var38 = (double)var8.method_370(this.field_6962 * 16.0D);
                  var16 = (double)var8.method_373(16.0D - this.field_6964 * 16.0D);
                  var14 = (double)var8.method_370(this.field_6963 * 16.0D);
                  var18 = (double)var8.method_373(16.0D - this.field_6965 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var24 = var16;
                     var26 = var18;
                     var20 = var38;
                     var22 = var14;
                     var16 = var18;
                     var18 = var24;
                  }

                  if(var9 != null) {
                     break label222;
                  }
               }

               var42 = this.field_6971;
               var10001 = 1;
            }

            if(var9 != null) {
               if(var42 == var10001) {
                  var38 = (double)var8.method_370(16.0D - this.field_6963 * 16.0D);
                  var16 = (double)var8.method_373(this.field_6965 * 16.0D);
                  var14 = (double)var8.method_370(16.0D - this.field_6962 * 16.0D);
                  var18 = (double)var8.method_373(this.field_6964 * 16.0D);
                  if(var9 != null) {
                     if(this.field_6954) {
                        var28 = var38;
                        var38 = var14;
                        var14 = var28;
                     }

                     var20 = var14;
                     var22 = var38;
                     var38 = var14;
                     var14 = var22;
                     var24 = var18;
                     var26 = var16;
                  }

                  if(var9 != null) {
                     break label222;
                  }
               }

               var42 = this.field_6971;
               if(var9 == null) {
                  break label149;
               }

               var10001 = 3;
            }

            if(var42 == var10001) {
               var38 = (double)var8.method_370(16.0D - this.field_6964 * 16.0D);
               var14 = (double)var8.method_370(16.0D - this.field_6965 * 16.0D);
               var16 = (double)var8.method_373(this.field_6963 * 16.0D);
               var18 = (double)var8.method_373(this.field_6962 * 16.0D);
               if(var9 != null) {
                  if(this.field_6954) {
                     var28 = var38;
                     var38 = var14;
                     var14 = var28;
                  }

                  var20 = var14;
                  var22 = var38;
                  var24 = var16;
               }

               var26 = var18;
            }
         }

         var42 = var11;
      }

      if(var42 != 0) {
         this.field_6971 = 0;
         this.field_6954 = false;
      }

      var28 = var2 + this.field_6961;
      double var30 = var4 + this.field_6962;
      double var32 = var4 + this.field_6963;
      double var34 = var6 + this.field_6964;
      double var36 = var6 + this.field_6965;
      boolean var44 = this.field_6959;
      if(var9 != null) {
         if(this.field_6959) {
            var34 = var6 + this.field_6965;
            var36 = var6 + this.field_6964;
         }

         var44 = this.field_6975;
      }

      if(var44) {
         var10.setVisible6(this.field_7020, this.field_7024, this.field_7028);
         var10.setVisible5(this.field_7016);
         var10.addVertexWithUV(var28, var30, var36, var22, var26);
         var10.setVisible6(this.field_7021, this.field_7025, this.field_7029);
         var10.setVisible5(this.field_7017);
         var10.addVertexWithUV(var28, var30, var34, var14, var18);
         var10.setVisible6(this.field_7022, this.field_7026, this.field_7030);
         var10.setVisible5(this.field_7018);
         var10.addVertexWithUV(var28, var32, var34, var20, var24);
         var10.setVisible6(this.field_7023, this.field_7027, this.field_7031);
         var10.setVisible5(this.field_7019);
         var10.addVertexWithUV(var28, var32, var36, var38, var16);
         if(var9 != null) {
            return;
         }
      }

      var10.addVertexWithUV(var28, var30, var36, var22, var26);
      var10.addVertexWithUV(var28, var30, var34, var14, var18);
      var10.addVertexWithUV(var28, var32, var34, var20, var24);
      var10.addVertexWithUV(var28, var32, var36, var38, var16);
   }

   // $FF: renamed from: a (aji, int, float) void
   public void drawTextBox6(aji var1, int var2, float var3) {
      String[] var4;
      bmh var5;
      int var6;
      label527: {
         label531: {
            String[] var10000 = class_752.method_4253();
            var5 = bmh.instance;
            var4 = var10000;
            var6 = var1 == class_1192.field_6027?1:0;
            aji var20 = var1;
            aji var10001 = class_1192.field_6050;
            if(var4 != null) {
               if(var1 == class_1192.field_6050) {
                  break label531;
               }

               var20 = var1;
               var10001 = class_1192.field_6182;
            }

            if(var4 != null) {
               if(var20 == var10001) {
                  break label531;
               }

               var20 = var1;
               var10001 = class_1192.field_6088;
            }

            if(var20 != var10001) {
               break label527;
            }
         }

         var2 = 3;
      }

      int var21 = this.field_6958;
      int var7;
      float var8;
      float var9;
      float var10;
      if(var4 != null) {
         if(this.field_6958) {
            var7 = var1.method_2494(var2);
            var21 = var6;
            if(var4 != null) {
               if(var6 != 0) {
                  var7 = 16777215;
               }

               var21 = var7 >> 16 & 255;
            }

            var8 = (float)var21 / 255.0F;
            var9 = (float)(var7 >> 8 & 255) / 255.0F;
            var10 = (float)(var7 & 255) / 255.0F;
            GL11.glColor4f(var8 * var3, var9 * var3, var10 * var3, 1.0F);
         }

         var21 = var1.method_2436();
      }

      int var11;
      label533: {
         byte var22;
         label534: {
            var7 = var21;
            this.method_7210(var1);
            var21 = var7;
            if(var4 != null) {
               if(var7 != 0) {
                  var21 = var7;
                  var22 = 31;
                  if(var4 == null) {
                     break label534;
                  }

                  if(var7 != 31) {
                     var21 = var7;
                     var22 = 39;
                     if(var4 == null) {
                        break label534;
                     }

                     if(var7 != 39) {
                        var21 = var7;
                        var22 = 16;
                        if(var4 == null) {
                           break label534;
                        }

                        if(var7 != 16) {
                           var21 = var7;
                           var22 = 26;
                           if(var4 == null) {
                              break label534;
                           }

                           if(var7 != 26) {
                              var21 = var7;
                              var22 = 1;
                              if(var4 != null) {
                                 if(var7 == 1) {
                                    var5.setVisible2();
                                    var5.method_7466(0.0F, -1.0F, 0.0F);
                                    class_73 var12 = this.drawTextBox9(var1, 0, var2);
                                    this.method_7252(var12, -0.5D, -0.5D, -0.5D, 1.0F);
                                    var5.getVisible8();
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 19;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    var5.setVisible2();
                                    var5.method_7466(0.0F, -1.0F, 0.0F);
                                    var1.method_2500();
                                    this.method_7253(var1, var2, this.field_6963, -0.5D, -0.5D, -0.5D);
                                    var5.getVisible8();
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 23;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    var5.setVisible2();
                                    var5.method_7466(0.0F, -1.0F, 0.0F);
                                    var1.method_2500();
                                    var5.getVisible8();
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 13;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    var1.method_2500();
                                    GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                                    var8 = 0.0625F;
                                    var5.setVisible2();
                                    var5.method_7466(0.0F, -1.0F, 0.0F);
                                    this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 0));
                                    var5.getVisible8();
                                    var5.setVisible2();
                                    var5.method_7466(0.0F, 1.0F, 0.0F);
                                    this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 1));
                                    var5.getVisible8();
                                    var5.setVisible2();
                                    var5.method_7466(0.0F, 0.0F, -1.0F);
                                    var5.method_7468(0.0F, 0.0F, var8);
                                    this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 2));
                                    var5.method_7468(0.0F, 0.0F, -var8);
                                    var5.getVisible8();
                                    var5.setVisible2();
                                    var5.method_7466(0.0F, 0.0F, 1.0F);
                                    var5.method_7468(0.0F, 0.0F, -var8);
                                    this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 3));
                                    var5.method_7468(0.0F, 0.0F, var8);
                                    var5.getVisible8();
                                    var5.setVisible2();
                                    var5.method_7466(-1.0F, 0.0F, 0.0F);
                                    var5.method_7468(var8, 0.0F, 0.0F);
                                    this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 4));
                                    var5.method_7468(-var8, 0.0F, 0.0F);
                                    var5.getVisible8();
                                    var5.setVisible2();
                                    var5.method_7466(1.0F, 0.0F, 0.0F);
                                    var5.method_7468(-var8, 0.0F, 0.0F);
                                    this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 5));
                                    var5.method_7468(var8, 0.0F, 0.0F);
                                    var5.getVisible8();
                                    GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 22;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                                    GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                                    class_1408.field_7499.method_7690(var1, var2, var3);
                                    GL11.glEnable('\u803a');
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 6;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    var5.setVisible2();
                                    var5.method_7466(0.0F, -1.0F, 0.0F);
                                    this.method_7256(var1, var2, -0.5D, -0.5D, -0.5D);
                                    var5.getVisible8();
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 2;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    var5.setVisible2();
                                    var5.method_7466(0.0F, -1.0F, 0.0F);
                                    this.method_7251(var1, -0.5D, -0.5D, -0.5D, 0.0D, 0.0D, 0);
                                    var5.getVisible8();
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 10;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    var11 = 0;

                                    do {
                                       if(var11 >= 2) {
                                          return;
                                       }

                                       var21 = var11;
                                       if(var4 != null) {
                                          if(var11 == 0) {
                                             this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5D);
                                          }

                                          var21 = var11;
                                       }

                                       if(var4 != null) {
                                          if(var21 == 1) {
                                             this.method_7209(0.0D, 0.0D, 0.5D, 1.0D, 0.5D, 1.0D);
                                          }

                                          GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                                          var5.setVisible2();
                                          var5.method_7466(0.0F, -1.0F, 0.0F);
                                          this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 0));
                                          var5.getVisible8();
                                          var5.setVisible2();
                                          var5.method_7466(0.0F, 1.0F, 0.0F);
                                          this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 1));
                                          var5.getVisible8();
                                          var5.setVisible2();
                                          var5.method_7466(0.0F, 0.0F, -1.0F);
                                          this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 2));
                                          var5.getVisible8();
                                          var5.setVisible2();
                                          var5.method_7466(0.0F, 0.0F, 1.0F);
                                          this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 3));
                                          var5.getVisible8();
                                          var5.setVisible2();
                                          var5.method_7466(-1.0F, 0.0F, 0.0F);
                                          this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 4));
                                          var5.getVisible8();
                                          var5.setVisible2();
                                          var5.method_7466(1.0F, 0.0F, 0.0F);
                                          this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 5));
                                          var5.getVisible8();
                                       }

                                       GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                                       ++var11;
                                    } while(var4 != null);
                                 }

                                 var21 = var7;
                                 var22 = 27;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    var11 = 0;
                                    GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                                    var5.setVisible2();
                                    int var18 = 0;

                                    while(true) {
                                       if(var18 < 8) {
                                          byte var13 = 0;
                                          byte var14 = 1;
                                          var21 = var18;
                                          if(var4 == null) {
                                             break;
                                          }

                                          if(var4 != null) {
                                             if(var18 == 0) {
                                                var13 = 2;
                                             }

                                             var21 = var18;
                                          }

                                          var22 = 1;
                                          if(var4 != null) {
                                             if(var21 == 1) {
                                                var13 = 3;
                                             }

                                             var21 = var18;
                                             var22 = 2;
                                          }

                                          if(var4 != null) {
                                             if(var21 == var22) {
                                                var13 = 4;
                                             }

                                             var21 = var18;
                                             var22 = 3;
                                          }

                                          if(var4 != null) {
                                             if(var21 == var22) {
                                                var13 = 5;
                                                var14 = 2;
                                             }

                                             var21 = var18;
                                             var22 = 4;
                                          }

                                          if(var4 != null) {
                                             if(var21 == var22) {
                                                var13 = 6;
                                                var14 = 3;
                                             }

                                             var21 = var18;
                                             var22 = 5;
                                          }

                                          if(var4 != null) {
                                             if(var21 == var22) {
                                                var13 = 7;
                                                var14 = 5;
                                             }

                                             var21 = var18;
                                             var22 = 6;
                                          }

                                          label540: {
                                             if(var4 != null) {
                                                if(var21 == var22) {
                                                   var13 = 6;
                                                   var14 = 2;
                                                }

                                                var21 = var18;
                                                if(var4 == null) {
                                                   break label540;
                                                }

                                                var22 = 7;
                                             }

                                             if(var21 == var22) {
                                                var13 = 3;
                                             }

                                             var21 = var13;
                                          }

                                          float var15 = (float)var21 / 16.0F;
                                          float var16 = 1.0F - (float)var11 / 16.0F;
                                          float var17 = 1.0F - (float)(var11 + var14) / 16.0F;
                                          var11 += var14;
                                          this.method_7209((double)(0.5F - var15), (double)var17, (double)(0.5F - var15), (double)(0.5F + var15), (double)var16, (double)(0.5F + var15));
                                          var5.method_7466(0.0F, -1.0F, 0.0F);
                                          this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 0));
                                          var5.method_7466(0.0F, 1.0F, 0.0F);
                                          this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 1));
                                          var5.method_7466(0.0F, 0.0F, -1.0F);
                                          this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 2));
                                          var5.method_7466(0.0F, 0.0F, 1.0F);
                                          this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 3));
                                          var5.method_7466(-1.0F, 0.0F, 0.0F);
                                          this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 4));
                                          var5.method_7466(1.0F, 0.0F, 0.0F);
                                          this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 5));
                                          ++var18;
                                          if(var4 != null) {
                                             continue;
                                          }
                                       }

                                       var5.getVisible8();
                                       break;
                                    }

                                    GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                                    this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 11;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    var11 = 0;

                                    while(true) {
                                       if(var11 < 4) {
                                          var9 = 0.125F;
                                          if(var4 == null) {
                                             break;
                                          }

                                          var21 = var11;
                                          if(var4 != null) {
                                             if(var11 == 0) {
                                                this.method_7209((double)(0.5F - var9), 0.0D, 0.0D, (double)(0.5F + var9), 1.0D, (double)(var9 * 2.0F));
                                             }

                                             var21 = var11;
                                          }

                                          var22 = 1;
                                          if(var4 != null) {
                                             if(var21 == 1) {
                                                this.method_7209((double)(0.5F - var9), 0.0D, (double)(1.0F - var9 * 2.0F), (double)(0.5F + var9), 1.0D, 1.0D);
                                             }

                                             var9 = 0.0625F;
                                             var21 = var11;
                                             var22 = 2;
                                          }

                                          label544: {
                                             if(var4 != null) {
                                                if(var21 == var22) {
                                                   this.method_7209((double)(0.5F - var9), (double)(1.0F - var9 * 3.0F), (double)(-var9 * 2.0F), (double)(0.5F + var9), (double)(1.0F - var9), (double)(1.0F + var9 * 2.0F));
                                                }

                                                var21 = var11;
                                                if(var4 == null) {
                                                   break label544;
                                                }

                                                var22 = 3;
                                             }

                                             if(var21 == var22) {
                                                this.method_7209((double)(0.5F - var9), (double)(0.5F - var9 * 3.0F), (double)(-var9 * 2.0F), (double)(0.5F + var9), (double)(0.5F - var9), (double)(1.0F + var9 * 2.0F));
                                             }

                                             GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                                             var5.setVisible2();
                                             var5.method_7466(0.0F, -1.0F, 0.0F);
                                             this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 0));
                                             var5.getVisible8();
                                             var5.setVisible2();
                                             var5.method_7466(0.0F, 1.0F, 0.0F);
                                             this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 1));
                                             var5.getVisible8();
                                             var5.setVisible2();
                                             var5.method_7466(0.0F, 0.0F, -1.0F);
                                             this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 2));
                                             var5.getVisible8();
                                             var5.setVisible2();
                                             var5.method_7466(0.0F, 0.0F, 1.0F);
                                             this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 3));
                                             var5.getVisible8();
                                             var5.setVisible2();
                                             var5.method_7466(-1.0F, 0.0F, 0.0F);
                                             this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 4));
                                             var5.getVisible8();
                                             var5.setVisible2();
                                             var5.method_7466(1.0F, 0.0F, 0.0F);
                                             this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 5));
                                             var5.getVisible8();
                                          }

                                          GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                                          ++var11;
                                          if(var4 != null) {
                                             continue;
                                          }
                                       }

                                       this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
                                       break;
                                    }

                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 21;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    var11 = 0;

                                    do {
                                       if(var11 >= 3) {
                                          return;
                                       }

                                       var9 = 0.0625F;
                                       var21 = var11;
                                       if(var4 != null) {
                                          if(var11 == 0) {
                                             this.method_7209((double)(0.5F - var9), 0.30000001192092896D, 0.0D, (double)(0.5F + var9), 1.0D, (double)(var9 * 2.0F));
                                          }

                                          var21 = var11;
                                       }

                                       label547: {
                                          var22 = 1;
                                          if(var4 != null) {
                                             if(var21 == 1) {
                                                this.method_7209((double)(0.5F - var9), 0.30000001192092896D, (double)(1.0F - var9 * 2.0F), (double)(0.5F + var9), 1.0D, 1.0D);
                                             }

                                             var9 = 0.0625F;
                                             var21 = var11;
                                             if(var4 == null) {
                                                break label547;
                                             }

                                             var22 = 2;
                                          }

                                          if(var21 == var22) {
                                             this.method_7209((double)(0.5F - var9), 0.5D, 0.0D, (double)(0.5F + var9), (double)(1.0F - var9), 1.0D);
                                          }

                                          GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                                          var5.setVisible2();
                                          var5.method_7466(0.0F, -1.0F, 0.0F);
                                          this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 0));
                                          var5.getVisible8();
                                          var5.setVisible2();
                                          var5.method_7466(0.0F, 1.0F, 0.0F);
                                          this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 1));
                                          var5.getVisible8();
                                          var5.setVisible2();
                                          var5.method_7466(0.0F, 0.0F, -1.0F);
                                          this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 2));
                                          var5.getVisible8();
                                          var5.setVisible2();
                                          var5.method_7466(0.0F, 0.0F, 1.0F);
                                          this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 3));
                                          var5.getVisible8();
                                          var5.setVisible2();
                                          var5.method_7466(-1.0F, 0.0F, 0.0F);
                                          this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 4));
                                          var5.getVisible8();
                                          var5.setVisible2();
                                          var5.method_7466(1.0F, 0.0F, 0.0F);
                                          this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, this.method_7290(var1, 5));
                                          var5.getVisible8();
                                       }

                                       GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                                       ++var11;
                                    } while(var4 != null);
                                 }

                                 var21 = var7;
                                 var22 = 32;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    var11 = 0;

                                    while(true) {
                                       if(var11 < 2) {
                                          if(var4 == null) {
                                             break;
                                          }

                                          var21 = var11;
                                          if(var4 != null) {
                                             if(var11 == 0) {
                                                this.method_7209(0.0D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
                                             }

                                             var21 = var11;
                                          }

                                          if(var4 != null) {
                                             if(var21 == 1) {
                                                this.method_7209(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);
                                             }

                                             GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                                             var5.setVisible2();
                                             var5.method_7466(0.0F, -1.0F, 0.0F);
                                             this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 0, var2));
                                             var5.getVisible8();
                                             var5.setVisible2();
                                             var5.method_7466(0.0F, 1.0F, 0.0F);
                                             this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 1, var2));
                                             var5.getVisible8();
                                             var5.setVisible2();
                                             var5.method_7466(0.0F, 0.0F, -1.0F);
                                             this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 2, var2));
                                             var5.getVisible8();
                                             var5.setVisible2();
                                             var5.method_7466(0.0F, 0.0F, 1.0F);
                                             this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 3, var2));
                                             var5.getVisible8();
                                             var5.setVisible2();
                                             var5.method_7466(-1.0F, 0.0F, 0.0F);
                                             this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 4, var2));
                                             var5.getVisible8();
                                             var5.setVisible2();
                                             var5.method_7466(1.0F, 0.0F, 0.0F);
                                             this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 5, var2));
                                             var5.getVisible8();
                                          }

                                          GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                                          ++var11;
                                          if(var4 != null) {
                                             continue;
                                          }
                                       }

                                       this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
                                       break;
                                    }

                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 35;
                              }

                              if(var4 != null) {
                                 if(var21 == var22) {
                                    GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                                    this.method_7223((class_467)var1, 0, 0, 0, var2 << 2, true);
                                    GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = var7;
                                 var22 = 34;
                              }

                              label551: {
                                 if(var4 != null) {
                                    if(var21 == var22) {
                                       var11 = 0;

                                       while(true) {
                                          if(var11 < 3) {
                                             if(var4 == null) {
                                                break;
                                             }

                                             label318: {
                                                label555: {
                                                   var21 = var11;
                                                   if(var4 != null) {
                                                      if(var11 == 0) {
                                                         this.method_7209(0.125D, 0.0D, 0.125D, 0.875D, 0.1875D, 0.875D);
                                                         this.method_7204(this.method_7291(class_1192.field_6076));
                                                         if(var4 != null) {
                                                            break label555;
                                                         }
                                                      }

                                                      var21 = var11;
                                                   }

                                                   var22 = 1;
                                                   if(var4 != null) {
                                                      if(var21 == 1) {
                                                         this.method_7209(0.1875D, 0.1875D, 0.1875D, 0.8125D, 0.875D, 0.8125D);
                                                         this.method_7204(this.method_7291(class_1192.field_6162));
                                                         if(var4 != null) {
                                                            break label555;
                                                         }
                                                      }

                                                      var21 = var11;
                                                      if(var4 == null) {
                                                         break label318;
                                                      }

                                                      var22 = 2;
                                                   }

                                                   if(var21 == var22) {
                                                      this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
                                                      this.method_7204(this.method_7291(class_1192.field_6047));
                                                   }
                                                }

                                                GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                                                var5.setVisible2();
                                                var5.method_7466(0.0F, -1.0F, 0.0F);
                                                this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 0, var2));
                                                var5.getVisible8();
                                                var5.setVisible2();
                                                var5.method_7466(0.0F, 1.0F, 0.0F);
                                                this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 1, var2));
                                                var5.getVisible8();
                                                var5.setVisible2();
                                                var5.method_7466(0.0F, 0.0F, -1.0F);
                                                this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 2, var2));
                                                var5.getVisible8();
                                                var5.setVisible2();
                                                var5.method_7466(0.0F, 0.0F, 1.0F);
                                                this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 3, var2));
                                                var5.getVisible8();
                                                var5.setVisible2();
                                                var5.method_7466(-1.0F, 0.0F, 0.0F);
                                                this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 4, var2));
                                                var5.getVisible8();
                                                var5.setVisible2();
                                                var5.method_7466(1.0F, 0.0F, 0.0F);
                                                this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 5, var2));
                                                var5.getVisible8();
                                             }

                                             GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                                             ++var11;
                                             if(var4 != null) {
                                                continue;
                                             }
                                          }

                                          this.method_7209(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
                                          this.method_7205();
                                          break;
                                       }

                                       if(var4 != null) {
                                          return;
                                       }
                                    }

                                    var21 = var7;
                                    if(var4 == null) {
                                       break label551;
                                    }

                                    var22 = 38;
                                 }

                                 if(var21 == var22) {
                                    GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
                                    this.method_7277((class_480)var1, 0, 0, 0, 0, true);
                                    GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = Reflector.ModLoader.exists();
                              }

                              if(var4 != null) {
                                 if(var21 != 0) {
                                    Reflector.callVoid(Reflector.ModLoader_renderInvBlock, new Object[]{this, var1, Integer.valueOf(var2), Integer.valueOf(var7)});
                                    if(var4 != null) {
                                       return;
                                    }
                                 }

                                 var21 = Reflector.FMLRenderAccessLibrary.exists();
                              }

                              if(var21 == 0) {
                                 return;
                              }

                              Reflector.callVoid(Reflector.FMLRenderAccessLibrary_renderInventoryBlock, new Object[]{this, var1, Integer.valueOf(var2), Integer.valueOf(var7)});
                              if(var4 != null) {
                                 return;
                              }
                           }
                        }
                     }
                  }
               }

               var21 = var7;
            }

            if(var4 == null) {
               break label533;
            }

            var22 = 16;
         }

         if(var21 == var22) {
            var2 = 1;
         }

         var1.method_2500();
         this.method_7210(var1);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         var5.setVisible2();
         var5.method_7466(0.0F, -1.0F, 0.0F);
         this.drawTextBox0(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 0, var2));
         var5.getVisible8();
         var21 = var6;
      }

      if(var4 != null) {
         label297: {
            if(var21 != 0) {
               var21 = this.field_6958;
               if(var4 == null) {
                  break label297;
               }

               if(this.field_6958) {
                  var11 = var1.method_2494(var2);
                  var9 = (float)(var11 >> 16 & 255) / 255.0F;
                  var10 = (float)(var11 >> 8 & 255) / 255.0F;
                  float var19 = (float)(var11 & 255) / 255.0F;
                  GL11.glColor4f(var9 * var3, var10 * var3, var19 * var3, 1.0F);
               }
            }

            var5.setVisible2();
            var5.method_7466(0.0F, 1.0F, 0.0F);
            this.drawTextBox1(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 1, var2));
            var5.getVisible8();
            var21 = var6;
         }
      }

      if(var4 != null) {
         label290: {
            if(var21 != 0) {
               if(var4 == null) {
                  break label290;
               }

               if(this.field_6958) {
                  GL11.glColor4f(var3, var3, var3, 1.0F);
               }
            }

            var5.setVisible2();
            var5.method_7466(0.0F, 0.0F, -1.0F);
            this.drawTextBox2(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 2, var2));
            var5.getVisible8();
            var5.setVisible2();
            var5.method_7466(0.0F, 0.0F, 1.0F);
            this.drawTextBox3(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 3, var2));
            var5.getVisible8();
            var5.setVisible2();
            var5.method_7466(-1.0F, 0.0F, 0.0F);
            this.drawTextBox4(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 4, var2));
            var5.getVisible8();
            var5.setVisible2();
            var5.method_7466(1.0F, 0.0F, 0.0F);
            this.drawTextBox5(var1, 0.0D, 0.0D, 0.0D, this.drawTextBox9(var1, 5, var2));
            var5.getVisible8();
         }
      }

      GL11.glTranslatef(0.5F, 0.5F, 0.5F);
   }

   // $FF: renamed from: a (int) boolean
   public static boolean drawTextBox7(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0;
      if(var1 != null) {
         switch(var0) {
         case -1:
            return false;
         case 0:
         case 10:
         case 11:
         case 13:
         case 16:
         case 21:
         case 22:
         case 26:
         case 27:
         case 31:
         case 32:
         case 34:
         case 35:
         case 39:
            return true;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 12:
         case 14:
         case 15:
         case 17:
         case 18:
         case 19:
         case 20:
         case 23:
         case 24:
         case 25:
         case 28:
         case 29:
         case 30:
         case 33:
         case 36:
         case 37:
         case 38:
         default:
            var10000 = Reflector.ModLoader.exists();
         }
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = Reflector.callBoolean(Reflector.ModLoader_renderBlockIsItemFull3D, new Object[]{Integer.valueOf(var0)});
            return (boolean)var10000;
         }

         var10000 = Reflector.FMLRenderAccessLibrary.exists();
      }

      if(var1 != null) {
         var10000 = var10000 != 0?Reflector.callBoolean(Reflector.FMLRenderAccessLibrary_renderItemAsFull3DBlock, new Object[]{Integer.valueOf(var0)}):0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (aji, ahl, int, int, int, int) vL
   public class_73 drawTextBox8(aji var1, ahl var2, int var3, int var4, int var5, int var6) {
      return this.method_7292(var1.method_2447(var2, var3, var4, var5, var6));
   }

   // $FF: renamed from: a (aji, int, int) vL
   public class_73 drawTextBox9(aji var1, int var2, int var3) {
      return this.method_7292(var1.method_2448(var2, var3));
   }

   // $FF: renamed from: a (aji, int) vL
   public class_73 method_7290(aji var1, int var2) {
      return this.method_7292(var1.getBlockTextureFromSide(var2));
   }

   // $FF: renamed from: b (aji) vL
   public class_73 method_7291(aji var1) {
      return this.method_7292(var1.getBlockTextureFromSide(1));
   }

   // $FF: renamed from: b (vL) vL
   public class_73 method_7292(class_73 var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            bpz var3 = (bpz)bao.method_5273().method_5288().method_8121(bpz.field_7757);
            String[] var10001 = field_7032;
            var1 = var3.method_7957("missingno");
         }

         var10000 = var1;
      }

      return (class_73)var10000;
   }

   private float getAmbientOcclusionLightValue(int var1, int var2, int var3) {
      aji var4 = this.field_6952.getBlock(var1, var2, var3);
      return var4.method_2432()?this.aoLightValueOpaque:1.0F;
   }

   private class_73 fixAoSideGrassTexture(class_73 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      class_73 var10000;
      class_73 var10001;
      label39: {
         String[] var9;
         label40: {
            var9 = class_752.method_4253();
            var10000 = var1;
            var10001 = TextureUtils.iconGrassSide;
            if(var9 != null) {
               if(var1 != TextureUtils.iconGrassSide) {
                  var10000 = var1;
                  var10001 = TextureUtils.iconMyceliumSide;
                  if(var9 == null) {
                     break label39;
                  }

                  if(var1 != TextureUtils.iconMyceliumSide) {
                     break label40;
                  }
               }

               var1 = Config.getSideGrassTexture(this.field_6952, var2, var3, var4, var5, var1);
               var10000 = var1;
               var10001 = TextureUtils.iconGrassTop;
            }

            if(var9 == null) {
               break label39;
            }

            if(var10000 == var10001) {
               this.field_7020 *= var6;
               this.field_7021 *= var6;
               this.field_7022 *= var6;
               this.field_7023 *= var6;
               this.field_7024 *= var7;
               this.field_7025 *= var7;
               this.field_7026 *= var7;
               this.field_7027 *= var7;
               this.field_7028 *= var8;
               this.field_7029 *= var8;
               this.field_7030 *= var8;
               this.field_7031 *= var8;
            }
         }

         var10000 = var1;
         if(var9 == null) {
            return var10000;
         }

         var10001 = TextureUtils.iconGrassSideSnowed;
      }

      if(var10000 == var10001) {
         var1 = Config.getSideSnowGrassTexture(this.field_6952, var2, var3, var4, var5);
      }

      var10000 = var1;
      return var10000;
   }

   private boolean hasSnowNeighbours(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      aji var5 = class_1192.field_6104;
      String[] var4 = var10000;
      aji var6 = this.field_6952.getBlock(var1 - 1, var2, var3);
      boolean var7;
      if(var4 != null) {
         label28: {
            if(var6 != var5) {
               var6 = this.field_6952.getBlock(var1 + 1, var2, var3);
               if(var4 == null) {
                  break label28;
               }

               if(var6 != var5) {
                  var6 = this.field_6952.getBlock(var1, var2, var3 - 1);
                  if(var4 == null) {
                     break label28;
                  }

                  if(var6 != var5) {
                     var6 = this.field_6952.getBlock(var1, var2, var3 + 1);
                     if(var4 == null) {
                        break label28;
                     }

                     if(var6 != var5) {
                        var7 = false;
                        return var7;
                     }
                  }
               }
            }

            var6 = this.field_6952.getBlock(var1, var2 - 1, var3);
         }
      }

      var7 = var6.method_2453();
      return var7;
   }

   private void renderSnow(int var1, int var2, int var3, double var4) {
      String[] var6 = class_752.method_4253();
      if(var6 != null && this.betterSnowEnabled) {
         this.method_7210(class_1192.field_6104);
         this.field_6963 = var4;
         this.method_7260(class_1192.field_6104, var1, var2, var3);
      }

   }

   public static blm getInstance() {
      String[] var0 = class_752.method_4253();
      blm var10000 = instance;
      if(var0 != null) {
         if(instance == null) {
            var10000 = new blm;
            var10000.method_7203();
            instance = var10000;
         }

         var10000 = instance;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7293() {
      // $FF: Couldn't be decompiled
   }
}

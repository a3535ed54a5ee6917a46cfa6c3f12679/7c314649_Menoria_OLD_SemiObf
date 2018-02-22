import java.util.Random;

// $FF: renamed from: he
public class class_1174 extends class_1162 {

   // $FF: renamed from: c byte[]
   static final byte[] field_5991;
   // $FF: renamed from: d java.util.Random
   Random field_5992;
   // $FF: renamed from: e ahb
   ahb field_5993;
   // $FF: renamed from: f int[]
   int[] field_5994;
   // $FF: renamed from: g int
   int field_5995;
   // $FF: renamed from: h int
   int field_5996;
   // $FF: renamed from: i double
   double field_5997;
   // $FF: renamed from: j double
   double field_5998;
   // $FF: renamed from: k double
   double field_5999;
   // $FF: renamed from: l double
   double field_6000;
   // $FF: renamed from: m double
   double field_6001;
   // $FF: renamed from: n int
   int field_6002;
   // $FF: renamed from: o int
   int field_6003;
   // $FF: renamed from: p int
   int field_6004;
   // $FF: renamed from: q int[][]
   int[][] field_6005;
   // $FF: renamed from: r java.lang.String
   private static final String field_6006 = "CL_00000400";


   // $FF: renamed from: <init> (boolean) void
   public void method_6350(boolean var1) {
      super.method_6350(var1);
      this.field_5992 = new Random();
      this.field_5994 = new int[]{0, 0, 0};
      this.field_5997 = 0.618D;
      this.field_5998 = 1.0D;
      this.field_5999 = 0.381D;
      this.field_6000 = 1.0D;
      this.field_6001 = 1.0D;
      this.field_6002 = 1;
      this.field_6003 = 12;
      this.field_6004 = 4;
   }

   // $FF: renamed from: b () void
   void method_6384() {
      String[] var10000 = class_752.method_4253();
      this.field_5996 = (int)((double)this.field_5995 * this.field_5997);
      String[] var1 = var10000;
      int var25 = this.field_5996;
      if(var1 != null) {
         if(this.field_5996 >= this.field_5995) {
            this.field_5996 = this.field_5995 - 1;
         }

         var25 = (int)(1.382D + Math.pow(this.field_6001 * (double)this.field_5995 / 13.0D, 2.0D));
      }

      int var2 = var25;
      var25 = var2;
      byte var10001 = 1;
      if(var1 != null) {
         if(var2 < 1) {
            var2 = 1;
         }

         var25 = var2 * this.field_5995;
         var10001 = 4;
      }

      int[][] var3 = new int[var25][var10001];
      int var4 = this.field_5994[1] + this.field_5995 - this.field_6004;
      int var5 = 1;
      int var6 = this.field_5994[1] + this.field_5996;
      int var7 = var4 - this.field_5994[1];
      var3[0][0] = this.field_5994[0];
      var3[0][1] = var4;
      var3[0][2] = this.field_5994[2];
      var3[0][3] = var6;
      --var4;

      while(true) {
         if(var7 >= 0) {
            int var8 = 0;
            float var9 = this.method_6386(var7);
            if(var1 == null) {
               break;
            }

            label91: {
               label80: {
                  if(var1 != null) {
                     if(var9 >= 0.0F) {
                        break label80;
                     }

                     --var4;
                     --var7;
                  }

                  if(var1 != null) {
                     break label91;
                  }
               }

               double var10 = 0.5D;

               label71:
               do {
                  var25 = var8;
                  int var26 = var2;

                  int var16;
                  int var17;
                  int[] var18;
                  do {
                     if(var25 >= var26) {
                        break label71;
                     }

                     double var12 = this.field_6000 * (double)var9 * ((double)this.field_5992.nextFloat() + 0.328D);
                     double var14 = (double)this.field_5992.nextFloat() * 2.0D * 3.141592653589793D;
                     var16 = class_1715.method_9561(var12 * Math.sin(var14) + (double)this.field_5994[0] + var10);
                     var17 = class_1715.method_9561(var12 * Math.cos(var14) + (double)this.field_5994[2] + var10);
                     var18 = new int[]{var16, var4, var17};
                     int[] var19 = new int[]{var16, var4 + this.field_6004, var17};
                     if(var1 == null) {
                        continue label71;
                     }

                     var25 = this.method_6394(var18, var19);
                     var26 = -1;
                  } while(var1 == null);

                  if(var25 == -1) {
                     int[] var20;
                     label58: {
                        var20 = new int[]{this.field_5994[0], this.field_5994[1], this.field_5994[2]};
                        double var21 = Math.sqrt(Math.pow((double)Math.abs(this.field_5994[0] - var18[0]), 2.0D) + Math.pow((double)Math.abs(this.field_5994[2] - var18[2]), 2.0D));
                        double var23 = var21 * this.field_5999;
                        int[] var27 = var18;
                        var10001 = 1;
                        if(var1 != null) {
                           if((double)var18[1] - var23 > (double)var6) {
                              var20[1] = var6;
                              if(var1 != null) {
                                 break label58;
                              }
                           }

                           var27 = var20;
                           var10001 = 1;
                        }

                        var27[var10001] = (int)((double)var18[1] - var23);
                     }

                     if(this.method_6394(var20, var18) == -1) {
                        var3[var5][0] = var16;
                        var3[var5][1] = var4;
                        var3[var5][2] = var17;
                        var3[var5][3] = var20[1];
                        ++var5;
                     }
                  }

                  ++var8;
               } while(var1 != null);

               --var4;
               --var7;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_6005 = new int[var5][4];
         System.arraycopy(var3, 0, this.field_6005, 0, var5);
         break;
      }

   }

   // $FF: renamed from: b (int, int, int, float, byte, aji) void
   void method_6385(int var1, int var2, int var3, float var4, byte var5, aji var6) {
      int var8 = (int)((double)var4 + 0.618D);
      byte var9 = field_5991[var5];
      byte var10 = field_5991[var5 + 3];
      String[] var10000 = class_752.method_4253();
      int[] var11 = new int[]{var1, var2, var3};
      int[] var12 = new int[]{0, 0, 0};
      int var13 = -var8;
      int var14 = -var8;
      String[] var7 = var10000;
      var12[var5] = var11[var5];

      do {
         int var18 = var13;

         label50:
         while(true) {
            if(var18 > var8) {
               return;
            }

            var12[var9] = var11[var9] + var13;
            var14 = -var8;

            while(true) {
               if(var14 > var8) {
                  break label50;
               }

               label60: {
                  double var15 = Math.pow((double)Math.abs(var13) + 0.5D, 2.0D) + Math.pow((double)Math.abs(var14) + 0.5D, 2.0D);
                  if(var7 != null) {
                     double var19;
                     var18 = (var19 = var15 - (double)(var4 * var4)) == 0.0D?0:(var19 < 0.0D?-1:1);
                     if(var7 == null) {
                        break;
                     }

                     if(var18 > 0) {
                        ++var14;
                        if(var7 != null) {
                           break label60;
                        }
                     }

                     var12[var10] = var11[var10] + var14;
                  }

                  aji var17 = this.field_5993.getBlock(var12[0], var12[1], var12[2]);
                  if(var7 != null) {
                     if(var17.method_2424() != awt.field_4170 && var17.method_2424() != awt.field_4179) {
                        ++var14;
                        if(var7 != null) {
                           break label60;
                        }
                     }

                     this.method_6354(this.field_5993, var12[0], var12[1], var12[2], var6, 0);
                  }

                  ++var14;
               }

               if(var7 == null) {
                  break label50;
               }
            }
         }

         ++var13;
      } while(var7 != null);

   }

   // $FF: renamed from: b (int) float
   float method_6386(int var1) {
      String[] var2 = class_752.method_4253();
      double var7;
      int var10000 = (var7 = (double)var1 - (double)((float)this.field_5995) * 0.3D) == 0.0D?0:(var7 < 0.0D?-1:1);
      if(var2 != null) {
         if(var10000 < 0) {
            return -1.618F;
         }

         var10000 = this.field_5995;
      }

      float var5;
      label33: {
         float var6;
         label37: {
            float var3 = (float)var10000 / 2.0F;
            float var4 = (float)this.field_5995 / 2.0F - (float)var1;
            float var8;
            var10000 = (var8 = var4 - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
            if(var2 != null) {
               if(var10000 == 0) {
                  var5 = var3;
                  if(var2 != null) {
                     break label33;
                  }
               }

               var6 = Math.abs(var4);
               if(var2 == null) {
                  break label37;
               }

               float var9;
               var10000 = (var9 = var6 - var3) == 0.0F?0:(var9 < 0.0F?-1:1);
            }

            if(var10000 >= 0) {
               var5 = 0.0F;
               if(var2 != null) {
                  break label33;
               }
            }

            var6 = (float)Math.sqrt(Math.pow((double)Math.abs(var3), 2.0D) - Math.pow((double)Math.abs(var4), 2.0D));
         }

         var5 = var6;
      }

      var5 *= 0.5F;
      return var5;
   }

   // $FF: renamed from: c (int) float
   float method_6387(int var1) {
      float var3;
      label47: {
         String[] var2 = class_752.method_4253();
         int var10000 = var1;
         if(var2 != null) {
            if(var1 < 0) {
               break label47;
            }

            var10000 = var1;
         }

         if(var2 != null) {
            if(var10000 >= this.field_6004) {
               break label47;
            }

            var10000 = var1;
         }

         label24: {
            if(var2 != null) {
               if(var10000 == 0) {
                  break label24;
               }

               var10000 = var1;
            }

            if(var10000 != this.field_6004 - 1) {
               var3 = 3.0F;
               return var3;
            }
         }

         var3 = 2.0F;
         return var3;
      }

      var3 = -1.0F;
      return var3;
   }

   // $FF: renamed from: b (int, int, int) void
   void method_6388(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = var2;
      String[] var4 = var10000;
      int var6 = var2 + this.field_6004;

      while(var5 < var6) {
         float var7 = this.method_6387(var5 - var2);
         this.method_6385(var1, var5, var3, var7, (byte)1, class_1192.field_6044);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int[], int[], aji) void
   void method_6389(int[] var1, int[] var2, aji var3) {
      int[] var5 = new int[]{0, 0, 0};
      String[] var10000 = class_752.method_4253();
      byte var6 = 0;
      String[] var4 = var10000;
      byte var7 = 0;

      int var10001;
      int var22;
      while(true) {
         if(var6 < 3) {
            var5[var6] = var2[var6] - var1[var6];
            var22 = Math.abs(var5[var6]);
            if(var4 == null) {
               break;
            }

            var10001 = Math.abs(var5[var7]);
            if(var4 != null) {
               if(var22 > var10001) {
                  var7 = var6;
               }

               var22 = var6;
               var10001 = 1;
            }

            var6 = (byte)(var22 + var10001);
            if(var4 != null) {
               continue;
            }
         }

         var22 = var5[var7];
         break;
      }

      if(var4 != null) {
         if(var22 == 0) {
            return;
         }

         var22 = field_5991[var7];
      }

      int var8;
      byte var9;
      int var10;
      label65: {
         var8 = var22;
         var9 = field_5991[var7 + 3];
         var22 = var5[var7];
         if(var4 != null) {
            if(var22 > 0) {
               var10 = 1;
               if(var4 != null) {
                  break label65;
               }
            }

            var22 = -1;
         }

         var10 = var22;
      }

      double var11 = (double)var5[var8] / (double)var5[var7];
      double var13 = (double)var5[var9] / (double)var5[var7];
      int[] var15 = new int[]{0, 0, 0};
      int var16 = 0;
      int var17 = var5[var7] + var10;

      while(var16 != var17) {
         var15[var7] = class_1715.method_9561((double)(var1[var7] + var16) + 0.5D);
         var15[var8] = class_1715.method_9561((double)var1[var8] + (double)var16 * var11 + 0.5D);
         var15[var9] = class_1715.method_9561((double)var1[var9] + (double)var16 * var13 + 0.5D);
         byte var18 = 0;
         int var19 = Math.abs(var15[0] - var1[0]);
         int var20 = Math.abs(var15[2] - var1[2]);
         int var21 = Math.max(var19, var20);
         var22 = var21;
         if(var4 != null) {
            label53: {
               if(var21 > 0) {
                  label87: {
                     var22 = var19;
                     var10001 = var21;
                     if(var4 != null) {
                        if(var19 == var21) {
                           var18 = 4;
                           if(var4 != null) {
                              break label87;
                           }
                        }

                        var22 = var20;
                        var10001 = var21;
                     }

                     if(var4 == null) {
                        break label53;
                     }

                     if(var22 == var10001) {
                        var18 = 8;
                     }
                  }
               }

               this.method_6354(this.field_5993, var15[0], var15[1], var15[2], var3, var18);
               var22 = var16;
               var10001 = var10;
            }

            var22 += var10001;
         }

         var16 = var22;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c () void
   void method_6390() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      int var3 = this.field_6005.length;
      String[] var1 = var10000;

      while(var2 < var3) {
         int var4 = this.field_6005[var2][0];
         int var5 = this.field_6005[var2][1];
         int var6 = this.field_6005[var2][2];
         this.method_6388(var4, var5, var6);
         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (int) boolean
   boolean method_6391(int var1) {
      String[] var2 = class_752.method_4253();
      double var3;
      int var10000 = (var3 = (double)var1 - (double)this.field_5995 * 0.2D) == 0.0D?0:(var3 < 0.0D?-1:1);
      if(var2 != null) {
         var10000 = var10000 >= 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d () void
   void method_6392() {
      int var2 = this.field_5994[0];
      int var3 = this.field_5994[1];
      String[] var10000 = class_752.method_4253();
      int var4 = this.field_5994[1] + this.field_5996;
      String[] var1 = var10000;
      int var5 = this.field_5994[2];
      int[] var6 = new int[]{var2, var3, var5};
      int[] var7 = new int[]{var2, var4, var5};
      this.method_6389(var6, var7, class_1192.field_6042);
      class_1174 var8 = this;
      if(var1 != null) {
         if(this.field_6002 != 2) {
            return;
         }

         ++var6[0];
         ++var7[0];
         this.method_6389(var6, var7, class_1192.field_6042);
         ++var6[2];
         ++var7[2];
         this.method_6389(var6, var7, class_1192.field_6042);
         var6[0] += -1;
         var7[0] += -1;
         var8 = this;
      }

      var8.method_6389(var6, var7, class_1192.field_6042);
   }

   // $FF: renamed from: e () void
   void method_6393() {
      int var2 = 0;
      int var3 = this.field_6005.length;
      String[] var1 = class_752.method_4253();
      int[] var4 = new int[]{this.field_5994[0], this.field_5994[1], this.field_5994[2]};

      while(var2 < var3) {
         int[] var5 = this.field_6005[var2];
         int[] var6 = new int[]{var5[0], var5[1], var5[2]};
         var4[1] = var5[3];
         int var7 = var4[1] - this.field_5994[1];
         if(var1 != null) {
            if(this.method_6391(var7)) {
               this.method_6389(var4, var6, class_1192.field_6042);
            }

            ++var2;
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int[], int[]) int
   int method_6394(int[] var1, int[] var2) {
      int[] var4 = new int[]{0, 0, 0};
      byte var5 = 0;
      String[] var10000 = class_752.method_4253();
      byte var6 = 0;
      String[] var3 = var10000;

      int var18;
      while(true) {
         if(var5 < 3) {
            var4[var5] = var2[var5] - var1[var5];
            var18 = Math.abs(var4[var5]);
            if(var3 == null) {
               break;
            }

            int var10001 = Math.abs(var4[var6]);
            if(var3 != null) {
               if(var18 > var10001) {
                  var6 = var5;
               }

               var18 = var5;
               var10001 = 1;
            }

            var5 = (byte)(var18 + var10001);
            if(var3 != null) {
               continue;
            }
         }

         var18 = var4[var6];
         break;
      }

      if(var3 != null) {
         if(var18 == 0) {
            return -1;
         }

         var18 = field_5991[var6];
      }

      int var7;
      byte var8;
      int var9;
      label69: {
         var7 = var18;
         var8 = field_5991[var6 + 3];
         var18 = var4[var6];
         if(var3 != null) {
            if(var18 > 0) {
               var9 = 1;
               if(var3 != null) {
                  break label69;
               }
            }

            var18 = -1;
         }

         var9 = var18;
      }

      double var10 = (double)var4[var7] / (double)var4[var6];
      double var12 = (double)var4[var8] / (double)var4[var6];
      int[] var14 = new int[]{0, 0, 0};
      int var15 = 0;
      int var16 = var4[var6] + var9;

      while(true) {
         if(var15 != var16) {
            label84: {
               var14[var6] = var1[var6] + var15;
               var14[var7] = class_1715.method_9561((double)var1[var7] + (double)var15 * var10);
               var14[var8] = class_1715.method_9561((double)var1[var8] + (double)var15 * var12);
               aji var17 = this.field_5993.getBlock(var14[0], var14[1], var14[2]);
               var18 = this.method_6362(var17);
               if(var3 == null) {
                  break;
               }

               if(var3 != null) {
                  if(var18 == 0 && var3 != null) {
                     break label84;
                  }

                  var18 = var15 + var9;
               }

               var15 = var18;
               if(var3 != null) {
                  continue;
               }
            }
         }

         var18 = var15;
         break;
      }

      if(var3 != null) {
         if(var18 == var16) {
            var18 = -1;
            return var18;
         }

         var18 = var15;
      }

      var18 = Math.abs(var18);
      return var18;
   }

   // $FF: renamed from: f () boolean
   boolean method_6395() {
      String[] var1;
      int[] var2;
      int[] var3;
      label44: {
         var2 = new int[]{this.field_5994[0], this.field_5994[1], this.field_5994[2]};
         String[] var10000 = class_752.method_4253();
         var3 = new int[]{this.field_5994[0], this.field_5994[1] + this.field_5995 - 1, this.field_5994[2]};
         var1 = var10000;
         aji var4 = this.field_5993.getBlock(this.field_5994[0], this.field_5994[1] - 1, this.field_5994[2]);
         aji var6 = var4;
         if(var1 != null) {
            if(var4 == class_1192.field_6028) {
               break label44;
            }

            var6 = var4;
         }

         Object var10001 = class_1192.field_6027;
         if(var1 != null) {
            if(var6 == class_1192.field_6027) {
               break label44;
            }

            var6 = var4;
            var10001 = class_1192.field_6087;
         }

         if(var6 != var10001) {
            return false;
         }
      }

      int var5 = this.method_6394(var2, var3);
      int var7 = var5;
      byte var8 = -1;
      if(var1 != null) {
         if(var5 == -1) {
            return true;
         }

         var7 = var5;
         if(var1 == null) {
            return (boolean)var7;
         }

         var8 = 6;
      }

      if(var7 < var8) {
         return false;
      } else {
         this.field_5995 = var5;
         var7 = 1;
         return (boolean)var7;
      }
   }

   // $FF: renamed from: b (double, double, double) void
   public void method_6352(double var1, double var3, double var5) {
      String[] var10000 = class_752.method_4253();
      this.field_6003 = (int)(var1 * 12.0D);
      String[] var7 = var10000;
      if(var7 != null) {
         if(var1 > 0.5D) {
            this.field_6004 = 5;
         }

         this.field_6000 = var3;
         this.field_6001 = var5;
      }

   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      this.field_5993 = var1;
      long var7 = var2.nextLong();
      this.field_5992.setSeed(var7);
      String[] var10000 = class_752.method_4253();
      this.field_5994[0] = var3;
      this.field_5994[1] = var4;
      this.field_5994[2] = var5;
      String[] var6 = var10000;
      int var9 = this.field_5995;
      if(var6 != null) {
         if(this.field_5995 == 0) {
            this.field_5995 = 5 + this.field_5992.nextInt(this.field_6003);
         }

         var9 = this.method_6395();
      }

      if(var6 != null) {
         if(var9 == 0) {
            return false;
         }

         this.method_6384();
         this.method_6390();
         this.method_6392();
         this.method_6393();
         var9 = 1;
      }

      return (boolean)var9;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6396() {
      boolean var10000 = true;
      char[] var10003 = "eJ¼áTÚ2Óá".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6006 = (new String((char[])var4)).intern();
            String var2 = field_6006;
            field_5991 = new byte[]{(byte)2, (byte)0, (byte)0, (byte)1, (byte)2, (byte)1};
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 124;
            break;
         case 1:
            var10009 = 92;
            break;
         case 2:
            var10009 = 185;
            break;
         case 3:
            var10009 = 139;
            break;
         case 4:
            var10009 = 245;
            break;
         case 5:
            var10009 = 62;
            break;
         default:
            var10009 = 176;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

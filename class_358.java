import java.util.Random;

// $FF: renamed from: fz
public class class_358 extends aji {

   // $FF: renamed from: M boolean
   private boolean field_2012;
   // $FF: renamed from: N java.lang.String
   private static final String field_2013 = "reddust";


   // $FF: renamed from: <init> (boolean) void
   public void method_2539(boolean var1) {
      String[] var10000 = class_752.method_4253();
      super.method_2427(awt.field_4174);
      String[] var2 = var10000;
      if(var2 != null) {
         if(var1) {
            this.method_2440(true);
         }

         this.field_2012 = var1;
      }

   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 30;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz) void
   public void method_2484(ahb var1, int var2, int var3, int var4, class_792 var5) {
      this.method_2540(var1, var2, var3, var4);
      super.method_2484(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: b (ahb, int, int, int, sa) void
   public void method_2482(ahb var1, int var2, int var3, int var4, class_689 var5) {
      this.method_2540(var1, var2, var3, var4);
      super.method_2482(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      this.method_2540(var1, var2, var3, var4);
      return super.method_2481(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   private void method_2540(ahb var1, int var2, int var3, int var4) {
      this.method_2541(var1, var2, var3, var4);
      if(this == class_1192.field_6099) {
         var1.method_2058(var2, var3, var4, class_1192.field_6100);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      if(this == class_1192.field_6100) {
         var1.method_2058(var2, var3, var4, class_1192.field_6099);
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5189;
   }

   // $FF: renamed from: a (int, java.util.Random) int
   public int method_2504(int var1, Random var2) {
      return this.method_2463(var2) + var2.nextInt(var1 + 1);
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 4 + var1.nextInt(2);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.method_2467(var1, var2, var3, var4, var5, var6, var7);
      if(this.method_2464(var5, var1.field_1819, var7) != adb.method_2920(this)) {
         int var8 = 1 + var1.field_1819.nextInt(5);
         this.method_2469(var1, var2, var3, var4, var8);
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      class_358 var10000 = this;
      if(var6 != null) {
         if(!this.field_2012) {
            return;
         }

         var10000 = this;
      }

      var10000.method_2541(var1, var2, var3, var4);
   }

   // $FF: renamed from: i (ahb, int, int, int) void
   private void method_2541(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      Random var6 = var1.field_1819;
      double var7 = 0.0625D;
      String[] var5 = var10000;
      int var9 = 0;

      while(var9 < 6) {
         double var10 = (double)((float)var2 + var6.nextFloat());
         double var12 = (double)((float)var3 + var6.nextFloat());
         double var14 = (double)((float)var4 + var6.nextFloat());
         int var16 = var9;
         if(var5 != null) {
            label148: {
               if(var9 == 0) {
                  var16 = var1.getBlock(var2, var3 + 1, var4).method_2453();
                  if(var5 == null) {
                     break label148;
                  }

                  if(var16 == 0) {
                     var12 = (double)(var3 + 1) + var7;
                  }
               }

               var16 = var9;
            }
         }

         byte var10001 = 1;
         if(var5 != null) {
            label140: {
               if(var16 == 1) {
                  var16 = var1.getBlock(var2, var3 - 1, var4).method_2453();
                  if(var5 == null) {
                     break label140;
                  }

                  if(var16 == 0) {
                     var12 = (double)(var3 + 0) - var7;
                  }
               }

               var16 = var9;
            }

            var10001 = 2;
         }

         if(var5 != null) {
            label132: {
               if(var16 == var10001) {
                  var16 = var1.getBlock(var2, var3, var4 + 1).method_2453();
                  if(var5 == null) {
                     break label132;
                  }

                  if(var16 == 0) {
                     var14 = (double)(var4 + 1) + var7;
                  }
               }

               var16 = var9;
            }

            var10001 = 3;
         }

         if(var5 != null) {
            label124: {
               if(var16 == var10001) {
                  var16 = var1.getBlock(var2, var3, var4 - 1).method_2453();
                  if(var5 == null) {
                     break label124;
                  }

                  if(var16 == 0) {
                     var14 = (double)(var4 + 0) - var7;
                  }
               }

               var16 = var9;
            }

            var10001 = 4;
         }

         label157: {
            if(var5 != null) {
               label112: {
                  if(var16 == var10001) {
                     var16 = var1.getBlock(var2 + 1, var3, var4).method_2453();
                     if(var5 == null) {
                        break label112;
                     }

                     if(var16 == 0) {
                        var10 = (double)(var2 + 1) + var7;
                     }
                  }

                  var16 = var9;
               }

               if(var5 == null) {
                  break label157;
               }

               var10001 = 5;
            }

            if(var16 == var10001) {
               var16 = var1.getBlock(var2 - 1, var3, var4).method_2453();
               if(var5 == null) {
                  break label157;
               }

               if(var16 == 0) {
                  var10 = (double)(var2 + 0) - var7;
               }
            }

            double var17;
            var16 = (var17 = var10 - (double)var2) == 0.0D?0:(var17 < 0.0D?-1:1);
         }

         label101: {
            label159: {
               if(var5 != null) {
                  if(var16 < 0) {
                     break label159;
                  }

                  double var18;
                  var16 = (var18 = var10 - (double)(var2 + 1)) == 0.0D?0:(var18 < 0.0D?-1:1);
               }

               if(var5 != null) {
                  if(var16 > 0) {
                     break label159;
                  }

                  double var19;
                  var16 = (var19 = var12 - 0.0D) == 0.0D?0:(var19 < 0.0D?-1:1);
               }

               if(var5 != null) {
                  if(var16 < 0) {
                     break label159;
                  }

                  double var20;
                  var16 = (var20 = var12 - (double)(var3 + 1)) == 0.0D?0:(var20 < 0.0D?-1:1);
               }

               if(var5 != null) {
                  if(var16 > 0) {
                     break label159;
                  }

                  double var21;
                  var16 = (var21 = var14 - (double)var4) == 0.0D?0:(var21 < 0.0D?-1:1);
               }

               if(var5 != null) {
                  if(var16 < 0) {
                     break label159;
                  }

                  double var22;
                  var16 = (var22 = var14 - (double)(var4 + 1)) == 0.0D?0:(var22 < 0.0D?-1:1);
               }

               if(var16 <= 0) {
                  break label101;
               }
            }

            var1.method_2087("reddust", var10, var12, var14, 0.0D, 0.0D, 0.0D);
         }

         ++var9;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      add var10000 = new add;
      var10000.method_3721(class_1192.field_6099);
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = " ;¶Þòk¨".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2013 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 15;
            break;
         case 1:
            var10009 = 131;
            break;
         case 2:
            var10009 = 15;
            break;
         case 3:
            var10009 = 103;
            break;
         case 4:
            var10009 = 90;
            break;
         case 5:
            var10009 = 197;
            break;
         default:
            var10009 = 1;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

import java.util.Random;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: e_
public class class_415 extends aji implements class_27 {

   // $FF: renamed from: M org.apache.logging.log4j.Logger
   private static final Logger field_2128;
   // $FF: renamed from: N vL
   private IIcon field_2129;
   // $FF: renamed from: O vL
   private IIcon field_2130;
   // $FF: renamed from: P vL
   private IIcon field_2131;
   // $FF: renamed from: Q java.lang.String[]
   private static final String[] field_2132;


   // $FF: renamed from: <init> () void
   protected void method_2665() {
      super.method_2427(awt.field_4171);
      this.method_2440(true);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            return this.field_2129;
         }

         var10000 = var1;
      }

      return var10000 == 0?class_1192.field_6028.getBlockTextureFromSide(var1):this.field_2010;
   }

   // $FF: renamed from: e (ahl, int, int, int, int) vL
   public IIcon method_2447(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         if(var5 == 1) {
            return this.field_2129;
         }

         var10000 = var5;
      }

      if(var10000 == 0) {
         return class_1192.field_6028.getBlockTextureFromSide(var5);
      } else {
         awt var7 = var1.getBlock(var2, var3 + 1, var4).method_2424();
         awt var8 = var7;
         awt var10001 = awt.field_4194;
         if(var6 != null) {
            if(var7 == awt.field_4194) {
               return this.field_2130;
            }

            var8 = var7;
            var10001 = awt.field_4195;
         }

         if(var8 != var10001) {
            return this.field_2010;
         } else {
            return this.field_2130;
         }
      }
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2132;
      this.field_2010 = var1.method_375(var10002.append("_side").toString());
      this.field_2129 = var1.method_375(this.method_2533() + "_top");
      this.field_2130 = var1.method_375(this.method_2533() + "_side_snowed");
      this.field_2131 = var1.method_375(this.method_2533() + "_side_overlay");
   }

   // $FF: renamed from: D () int
   public int method_2493() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return class_1040.method_5891(var1, var3);
   }

   // $FF: renamed from: i (int) int
   public int method_2494(int var1) {
      return this.method_2493();
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      int var6 = 0;
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var5 = var10000;
      int var8 = 0;
      int var9 = -1;

      int var12;
      while(true) {
         if(var9 <= 1) {
            var12 = -1;
            if(var5 == null) {
               break;
            }

            int var10 = -1;

            while(true) {
               if(var10 <= 1) {
                  int var11 = var1.method_35(var2 + var10, var4 + var9).method_5715(var2 + var10, var3, var4 + var9);
                  var6 += (var11 & 16711680) >> 16;
                  var7 += (var11 & '\uff00') >> 8;
                  var8 += var11 & 255;
                  ++var10;
                  if(var5 == null) {
                     break;
                  }

                  if(var5 != null) {
                     continue;
                  }
               }

               ++var9;
               break;
            }

            if(var5 != null) {
               continue;
            }
         }

         var12 = (var6 / 9 & 255) << 16 | (var7 / 9 & 255) << 8 | var8 / 9 & 255;
         break;
      }

      return var12;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.method_2069(var2, var3 + 1, var4);
      }

      byte var10001;
      label83: {
         var10001 = 4;
         if(var6 != null) {
            label84: {
               if(var10000 < 4) {
                  var10000 = var1.getBlock(var2, var3 + 1, var4).method_2420();
                  var10001 = 2;
                  if(var6 == null) {
                     break label84;
                  }

                  if(var10000 > 2) {
                     var1.method_2058(var2, var3, var4, class_1192.field_6028);
                     if(var6 != null) {
                        return;
                     }
                  }
               }

               var10000 = var1.method_2069(var2, var3 + 1, var4);
               if(var6 == null) {
                  break label83;
               }

               var10001 = 9;
            }
         }

         if(var10000 < var10001) {
            return;
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while(var7 < 4) {
         int var8 = var2 + var5.nextInt(3) - 1;
         int var9 = var3 + var5.nextInt(5) - 3;
         int var10 = var4 + var5.nextInt(3) - 1;
         aji var11 = var1.getBlock(var8, var9 + 1, var10);
         if(var6 != null) {
            if(var1.getBlock(var8, var9, var10) == class_1192.field_6028) {
               label89: {
                  var10000 = var1.method_33(var8, var9, var10);
                  if(var6 != null) {
                     if(var10000 != 0) {
                        break label89;
                     }

                     var10000 = var1.method_2069(var8, var9 + 1, var10);
                  }

                  var10001 = 4;
                  if(var6 != null) {
                     if(var10000 < 4) {
                        break label89;
                     }

                     var10000 = var11.method_2420();
                     if(var6 == null) {
                        break label89;
                     }

                     var10001 = 2;
                  }

                  if(var10000 <= var10001) {
                     var1.method_2058(var8, var9, var10, class_1192.field_6027);
                  }
               }
            }

            ++var7;
         }

         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1192.field_6028.method_2464(0, var2, var3);
   }

   // $FF: renamed from: i () vL
   public static IIcon method_2666() {
      return class_1192.field_6027.field_2131;
   }

   // $FF: renamed from: b (ahb, int, int, int, boolean) boolean
   public boolean method_121(ahb var1, int var2, int var3, int var4, boolean var5) {
      return true;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_122(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   // $FF: renamed from: c (ahb, java.util.Random, int, int, int) void
   public void method_123(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;

      while(var7 < 128) {
         int var8 = var3;
         int var9 = var4 + 1;
         int var10 = var5;
         int var11 = 0;

         label74: {
            label73: {
               aji var16;
               while(true) {
                  if(var11 < var7 / 16) {
                     var8 += var2.nextInt(3) - 1;
                     var9 += (var2.nextInt(3) - 1) * var2.nextInt(3) / 2;
                     var10 += var2.nextInt(3) - 1;
                     if(var6 == null) {
                        break label74;
                     }

                     var16 = var1.getBlock(var8, var9 - 1, var10);
                     if(var6 == null) {
                        break;
                     }

                     if(var16 != class_1192.field_6027 || var1.getBlock(var8, var9, var10).method_2433() && var6 != null) {
                        break label73;
                     }

                     ++var11;
                     if(var6 != null) {
                        continue;
                     }
                  }

                  var16 = var1.getBlock(var8, var9, var10);
                  break;
               }

               if(var16.field_2007 == awt.field_4170) {
                  label83: {
                     int var17;
                     label84: {
                        var17 = var2.nextInt(8);
                        if(var6 != null) {
                           if(var17 == 0) {
                              break label84;
                           }

                           var17 = class_1192.field_6058.method_2505(var1, var8, var9, var10);
                        }

                        if(var6 != null) {
                           if(var17 == 0) {
                              break label83;
                           }

                           var1.method_2054(var8, var9, var10, class_1192.field_6058, 1, 3);
                        }

                        if(var6 != null) {
                           break label83;
                        }
                     }

                     String var15 = var1.method_35(var8, var10).method_5698(var2, var8, var9, var10);
                     Logger var18 = field_2128;
                     StringBuilder var10001 = new StringBuilder();
                     String[] var14 = field_2132;
                     var18.debug(var10001.append("Flower in ").append(var1.method_35(var8, var10).field_5031).append(": ").append(var15).toString());
                     class_447 var12 = class_447.method_2774(var15);
                     if(var6 == null) {
                        break label74;
                     }

                     if(var12 != null) {
                        label40: {
                           var17 = var12.method_2505(var1, var8, var9, var10);
                           if(var6 != null) {
                              if(var17 == 0) {
                                 break label40;
                              }

                              var17 = class_447.method_2775(var15);
                           }

                           int var13 = var17;
                           var1.method_2054(var8, var9, var10, var12, var13, 3);
                        }
                     }
                  }
               }
            }

            ++var7;
         }

         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

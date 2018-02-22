import java.util.Random;

// $FF: renamed from: fg
public class class_375 extends class_373 {

   // $FF: renamed from: O int[][]
   public static final int[][] field_2048;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_2049;


   // $FF: renamed from: <init> () void
   public void method_2578() {
      String[] var10001 = field_2049;
      super.method_2576("portal", awt.field_4200, false);
      this.method_2440(true);
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var10000 = class_752.method_4253();
      super.method_2456(var1, var2, var3, var4, var5);
      String[] var6 = var10000;
      int var10 = var1.field_1820.method_6168();
      if(var6 != null) {
         if(var10 == 0) {
            return;
         }

         class_1038 var11 = var1.method_2196();
         String[] var10001 = field_2049;
         var10 = var11.method_5878("doMobSpawning");
      }

      if(var6 != null) {
         if(var10 == 0) {
            return;
         }

         var10 = var5.nextInt(2000);
      }

      if(var6 != null) {
         if(var10 >= var1.field_1818.method_5392()) {
            return;
         }

         var10 = var3;
      }

      int var7 = var10;

      while(true) {
         if(!ahb.method_2135(var1, var2, var7, var4)) {
            var10 = var7;
            if(var6 == null || var6 == null) {
               break;
            }

            if(var7 > 0) {
               --var7;
               if(var6 != null) {
                  continue;
               }
            }
         }

         var10 = var7;
         break;
      }

      int var12;
      ahb var13;
      int var10002;
      label77: {
         if(var6 != null) {
            if(var10 <= 0) {
               return;
            }

            var13 = var1;
            var12 = var2;
            var10002 = var7 + 1;
            if(var6 == null) {
               break label77;
            }

            var10 = var1.getBlock(var2, var10002, var4).method_2433();
         }

         if(var10 != 0) {
            return;
         }

         var13 = var1;
         var12 = 57;
         var10002 = var2;
      }

      class_689 var8 = class_512.method_2987(var13, var12, (double)var10002 + 0.5D, (double)var7 + 1.1D, (double)var4 + 0.5D);
      class_689 var9 = var8;
      if(var6 != null) {
         if(var8 == null) {
            return;
         }

         var9 = var8;
      }

      var9.field_3048 = var8.method_3930();
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = method_2580(var1.method_33(var2, var3, var4));
      String[] var5 = var10000;
      if(var6 == 0) {
         label56: {
            label51: {
               label50: {
                  label49: {
                     aji var9 = var1.getBlock(var2 - 1, var3, var4);
                     class_375 var10001 = this;
                     if(var5 != null) {
                        if(var9 == this) {
                           break label49;
                        }

                        var9 = var1.getBlock(var2 + 1, var3, var4);
                        var10001 = this;
                     }

                     if(var9 != var10001) {
                        break label50;
                     }
                  }

                  var6 = 1;
                  if(var5 != null) {
                     break label51;
                  }
               }

               var6 = 2;
            }

            boolean var10 = var1 instanceof ahb;
            if(var5 != null) {
               if(!var10) {
                  break label56;
               }

               var10 = ((ahb)var1).field_1832;
            }

            if(var5 != null && !var10) {
               ((ahb)var1).method_2055(var2, var3, var4, var6, 2);
            }
         }
      }

      float var7 = 0.125F;
      float var8 = 0.125F;
      int var12 = var6;
      byte var11 = 1;
      if(var5 != null) {
         if(var6 == 1) {
            var7 = 0.5F;
         }

         var12 = var6;
         var11 = 2;
      }

      if(var12 == var11) {
         var8 = 0.5F;
      }

      this.method_2443(0.5F - var7, 0.0F, 0.5F - var8, 0.5F + var7, 1.0F, 0.5F + var8);
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   public boolean method_2579(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      class_1193 var10001 = new class_1193;
      var10001.method_6412(var1, var2, var3, var4, 1);
      class_1193 var6 = var10001;
      String[] var5 = var10000;
      class_1193 var8 = new class_1193;
      var8.method_6412(var1, var2, var3, var4, 2);
      class_1193 var7 = var8;
      int var9 = var6.method_6416();
      if(var5 != null) {
         label30: {
            if(var9 != 0) {
               var9 = class_1193.method_6418(var6);
               if(var5 == null) {
                  break label30;
               }

               if(var9 == 0) {
                  var6.method_6417();
                  return true;
               }
            }

            var9 = var7.method_6416();
         }
      }

      if(var5 != null) {
         if(var9 != 0) {
            var9 = class_1193.method_6418(var7);
            if(var5 == null) {
               return (boolean)var9;
            }

            if(var9 == 0) {
               var7.method_6417();
               return true;
            }
         }

         var9 = 0;
      }

      return (boolean)var9;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6;
      class_1193 var8;
      class_1193 var9;
      int var11;
      label81: {
         int var7 = method_2580(var1.method_33(var2, var3, var4));
         String[] var10000 = class_752.method_4253();
         class_1193 var10001 = new class_1193;
         var10001.method_6412(var1, var2, var3, var4, 1);
         var8 = var10001;
         var6 = var10000;
         class_1193 var10 = new class_1193;
         var10.method_6412(var1, var2, var3, var4, 2);
         var9 = var10;
         var11 = var7;
         int var13 = 1;
         boolean var12;
         if(var6 != null) {
            label82: {
               if(var7 == 1) {
                  label73: {
                     var12 = var8.method_6416();
                     if(var6 != null) {
                        if(var12) {
                           var11 = class_1193.method_6418(var8);
                           var13 = class_1193.method_6419(var8) * class_1193.method_6420(var8);
                           if(var6 == null) {
                              break label82;
                           }

                           if(var11 >= var13) {
                              break label73;
                           }
                        }

                        var1.method_2058(var2, var3, var4, class_1192.field_6025);
                     }

                     if(var6 != null) {
                        return;
                     }
                  }
               }

               var11 = var7;
               if(var6 == null) {
                  break label81;
               }

               var13 = 2;
            }
         }

         if(var11 == var13) {
            label59: {
               var12 = var9.method_6416();
               if(var6 != null) {
                  if(var12) {
                     var11 = class_1193.method_6418(var9);
                     if(var6 == null) {
                        break label81;
                     }

                     if(var11 >= class_1193.method_6419(var9) * class_1193.method_6420(var9)) {
                        break label59;
                     }
                  }

                  var1.method_2058(var2, var3, var4, class_1192.field_6025);
               }

               if(var6 != null) {
                  return;
               }
            }
         }

         var11 = var7;
      }

      if(var6 != null) {
         if(var11 != 0) {
            return;
         }

         var11 = var8.method_6416();
      }

      if(var6 != null) {
         if(var11 != 0) {
            return;
         }

         var11 = var9.method_6416();
      }

      if(var6 != null && var11 == 0) {
         var1.method_2058(var2, var3, var4, class_1192.field_6025);
      }

   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      int var7 = 0;
      String[] var6 = class_752.method_4253();
      aji var10000 = var1.getBlock(var2, var3, var4);
      class_375 var10001 = this;
      int var14;
      if(var6 != null) {
         if(var10000 == this) {
            label229: {
               var7 = method_2580(var1.method_33(var2, var3, var4));
               var14 = var7;
               if(var6 != null) {
                  if(var7 == 0) {
                     return false;
                  }

                  var14 = var7;
               }

               byte var15 = 2;
               if(var6 != null) {
                  label197: {
                     if(var14 == 2) {
                        var14 = var5;
                        var15 = 5;
                        if(var6 == null) {
                           break label197;
                        }

                        if(var5 != 5) {
                           var14 = var5;
                           var15 = 4;
                           if(var6 == null) {
                              break label197;
                           }

                           if(var5 != 4) {
                              return false;
                           }
                        }
                     }

                     var14 = var7;
                     var15 = 1;
                  }
               }

               if(var6 != null) {
                  if(var14 != var15) {
                     break label229;
                  }

                  var14 = var5;
                  var15 = 3;
               }

               if(var6 != null) {
                  if(var14 == var15) {
                     break label229;
                  }

                  var14 = var5;
                  if(var6 == null) {
                     return (boolean)var14;
                  }

                  var15 = 2;
               }

               if(var14 != var15) {
                  var14 = 0;
                  return (boolean)var14;
               }
            }
         }

         var10000 = var1.getBlock(var2 - 1, var3, var4);
         var10001 = this;
      }

      byte var16;
      label188: {
         label187: {
            if(var6 != null) {
               if(var10000 != var10001) {
                  break label187;
               }

               var10000 = var1.getBlock(var2 - 2, var3, var4);
               var10001 = this;
            }

            if(var10000 != var10001) {
               var16 = 1;
               break label188;
            }
         }

         var16 = 0;
      }

      byte var8;
      label179: {
         label178: {
            var8 = var16;
            var10000 = var1.getBlock(var2 + 1, var3, var4);
            var10001 = this;
            if(var6 != null) {
               if(var10000 != this) {
                  break label178;
               }

               var10000 = var1.getBlock(var2 + 2, var3, var4);
               var10001 = this;
            }

            if(var10000 != var10001) {
               var16 = 1;
               break label179;
            }
         }

         var16 = 0;
      }

      byte var9;
      label170: {
         label169: {
            var9 = var16;
            var10000 = var1.getBlock(var2, var3, var4 - 1);
            var10001 = this;
            if(var6 != null) {
               if(var10000 != this) {
                  break label169;
               }

               var10000 = var1.getBlock(var2, var3, var4 - 2);
               var10001 = this;
            }

            if(var10000 != var10001) {
               var16 = 1;
               break label170;
            }
         }

         var16 = 0;
      }

      byte var10;
      label161: {
         label160: {
            var10 = var16;
            var10000 = var1.getBlock(var2, var3, var4 + 1);
            var10001 = this;
            if(var6 != null) {
               if(var10000 != this) {
                  break label160;
               }

               var10000 = var1.getBlock(var2, var3, var4 + 2);
               var10001 = this;
            }

            if(var10000 != var10001) {
               var16 = 1;
               break label161;
            }
         }

         var16 = 0;
      }

      byte var11 = var16;
      var14 = var8;
      if(var6 != null) {
         label151: {
            if(var8 == 0) {
               var14 = var9;
               if(var6 == null) {
                  break label151;
               }

               if(var9 == 0) {
                  var14 = var7;
                  if(var6 == null) {
                     break label151;
                  }

                  if(var7 != 1) {
                     var14 = 0;
                     break label151;
                  }
               }
            }

            var14 = 1;
         }
      }

      int var12 = var14;
      var14 = var10;
      if(var6 != null) {
         label140: {
            if(var10 == 0) {
               var14 = var11;
               if(var6 == null) {
                  break label140;
               }

               if(var11 == 0) {
                  var14 = var7;
                  if(var6 == null) {
                     break label140;
                  }

                  if(var7 != 2) {
                     var14 = 0;
                     break label140;
                  }
               }
            }

            var14 = 1;
         }
      }

      int var13 = var14;
      var14 = var12;
      if(var6 != null) {
         label129: {
            if(var12 != 0) {
               var14 = var5;
               if(var6 == null) {
                  break label129;
               }

               if(var5 == 4) {
                  return true;
               }
            }

            var14 = var12;
         }
      }

      if(var6 != null) {
         label122: {
            if(var14 != 0) {
               var14 = var5;
               if(var6 == null) {
                  break label122;
               }

               if(var5 == 5) {
                  return true;
               }
            }

            var14 = var13;
         }
      }

      if(var6 != null) {
         label115: {
            if(var14 != 0) {
               var14 = var5;
               if(var6 == null) {
                  break label115;
               }

               if(var5 == 2) {
                  return true;
               }
            }

            var14 = var13;
         }
      }

      if(var6 != null) {
         if(var14 != 0) {
            var14 = var5;
            if(var6 == null) {
               return (boolean)var14;
            }

            if(var5 == 3) {
               return true;
            }
         }

         var14 = 0;
      }

      return (boolean)var14;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: w () int
   public int method_2477() {
      return 1;
   }

   // $FF: renamed from: a (ahb, int, int, int, sa) void
   public void method_2498(ahb var1, int var2, int var3, int var4, class_689 var5) {
      String[] var6 = class_752.method_4253();
      class_689 var10000 = var5.field_2988;
      if(var6 != null) {
         if(var5.field_2988 != null) {
            return;
         }

         var10000 = var5.field_2987;
      }

      if(var6 != null) {
         if(var10000 != null) {
            return;
         }

         var10000 = var5;
      }

      var10000.method_3929();
   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5.nextInt(100);
      if(var6 != null) {
         if(var10000 == 0) {
            double var10001 = (double)var2 + 0.5D;
            double var10002 = (double)var3 + 0.5D;
            double var10003 = (double)var4 + 0.5D;
            String[] var21 = field_2049;
            var1.method_2085(var10001, var10002, var10003, "portal.portal", 0.5F, var5.nextFloat() * 0.4F + 0.8F, false);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while(var7 < 4) {
         double var8;
         double var10;
         double var12;
         double var14;
         double var16;
         double var18;
         label33: {
            int var20;
            label32: {
               var8 = (double)((float)var2 + var5.nextFloat());
               var10 = (double)((float)var3 + var5.nextFloat());
               var12 = (double)((float)var4 + var5.nextFloat());
               var14 = 0.0D;
               var16 = 0.0D;
               var18 = 0.0D;
               var20 = var5.nextInt(2) * 2 - 1;
               var14 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
               var16 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
               var18 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
               if(var6 != null) {
                  if(var1.getBlock(var2 - 1, var3, var4) != this && var1.getBlock(var2 + 1, var3, var4) != this) {
                     break label32;
                  }

                  var12 = (double)var4 + 0.5D + 0.25D * (double)var20;
                  var18 = (double)(var5.nextFloat() * 2.0F * (float)var20);
               }

               if(var6 != null) {
                  break label33;
               }
            }

            var8 = (double)var2 + 0.5D + 0.25D * (double)var20;
            var14 = (double)(var5.nextFloat() * 2.0F * (float)var20);
         }

         String[] var22 = field_2049;
         var1.method_2087("portal", var8, var10, var12, var14, var16, var18);
         ++var7;
         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return adb.method_2919(0);
   }

   // $FF: renamed from: c (int) int
   public static int method_2580(int var0) {
      return var0 & 3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "OWÍú¨OWÍú¨\r[WòáÆ^OÑç£OWÍú¨";
      int var4 = "OWÍú¨OWÍú¨\r[WòáÆ^OÑç£OWÍú¨".length();
      char var1 = 13;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2049 = var5;
                  field_2048 = new int[][]{new int[0], {3, 1}, {2, 0}};
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 136;
               break;
            case 1:
               var10009 = 143;
               break;
            case 2:
               var10009 = 8;
               break;
            case 3:
               var10009 = 57;
               break;
            case 4:
               var10009 = 92;
               break;
            case 5:
               var10009 = 115;
               break;
            default:
               var10009 = 1;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

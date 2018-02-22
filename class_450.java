import java.util.Random;

// $FF: renamed from: eu
public class class_450 extends class_446 implements class_27 {

   // $FF: renamed from: N vL[]
   private class_73[] field_2199;
   // $FF: renamed from: O java.lang.String
   private static final String field_2200 = "_stage_";


   // $FF: renamed from: <init> () void
   protected void method_2770() {
      super.method_2770();
      this.method_2440(true);
      float var1 = 0.5F;
      this.method_2443(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
      this.method_2521((class_872)null);
      this.method_2437(0.0F);
      this.method_2428(field_1979);
      this.method_2513();
   }

   // $FF: renamed from: d (aji) boolean
   protected boolean method_2771(aji var1) {
      return var1 == class_1192.field_6087;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var10000 = class_752.method_4253();
      super.method_2456(var1, var2, var3, var4, var5);
      String[] var6 = var10000;
      int var9 = var1.method_2069(var2, var3 + 1, var4);
      if(var6 != null) {
         if(var9 < 9) {
            return;
         }

         var9 = var1.method_33(var2, var3, var4);
      }

      int var7 = var9;
      if(var7 < 7) {
         float var8 = this.method_2783(var1, var2, var3, var4);
         if(var6 != null && var5.nextInt((int)(25.0F / var8) + 1) == 0) {
            ++var7;
            var1.method_2055(var2, var3, var4, var7, 2);
         }
      }

   }

   // $FF: renamed from: e (ahb, int, int, int) void
   public void method_2782(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4) + class_1715.method_9575(var1.field_1819, 2, 5);
      String[] var5 = var10000;
      if(var5 != null) {
         if(var6 > 7) {
            var6 = 7;
         }

         var1.method_2055(var2, var3, var4, var6, 2);
      }

   }

   // $FF: renamed from: i (ahb, int, int, int) float
   private float method_2783(ahb var1, int var2, int var3, int var4) {
      String[] var5;
      float var6;
      aji var7;
      aji var8;
      aji var11;
      aji var12;
      aji var13;
      aji var14;
      class_450 var10001;
      aji var21;
      byte var22;
      label145: {
         label144: {
            var6 = 1.0F;
            var7 = var1.getBlock(var2, var3, var4 - 1);
            var8 = var1.getBlock(var2, var3, var4 + 1);
            String[] var10000 = class_752.method_4253();
            aji var9 = var1.getBlock(var2 - 1, var3, var4);
            aji var10 = var1.getBlock(var2 + 1, var3, var4);
            var11 = var1.getBlock(var2 - 1, var3, var4 - 1);
            var12 = var1.getBlock(var2 + 1, var3, var4 - 1);
            var13 = var1.getBlock(var2 + 1, var3, var4 + 1);
            var5 = var10000;
            var14 = var1.getBlock(var2 - 1, var3, var4 + 1);
            var21 = var9;
            var10001 = this;
            if(var5 != null) {
               if(var9 == this) {
                  break label144;
               }

               var21 = var10;
               var10001 = this;
            }

            if(var21 != var10001) {
               var22 = 0;
               break label145;
            }
         }

         var22 = 1;
      }

      byte var15;
      label136: {
         label135: {
            var15 = var22;
            var21 = var7;
            var10001 = this;
            if(var5 != null) {
               if(var7 == this) {
                  break label135;
               }

               var21 = var8;
               var10001 = this;
            }

            if(var21 != var10001) {
               var22 = 0;
               break label136;
            }
         }

         var22 = 1;
      }

      byte var16;
      label127: {
         label148: {
            var16 = var22;
            var21 = var11;
            var10001 = this;
            if(var5 != null) {
               if(var11 == this) {
                  break label148;
               }

               var21 = var12;
               var10001 = this;
            }

            if(var5 != null) {
               if(var21 == var10001) {
                  break label148;
               }

               var21 = var13;
               var10001 = this;
            }

            if(var5 != null) {
               if(var21 == var10001) {
                  break label148;
               }

               var21 = var14;
               var10001 = this;
            }

            if(var21 != var10001) {
               var22 = 0;
               break label127;
            }
         }

         var22 = 1;
      }

      byte var17 = var22;
      int var18 = var2 - 1;

      int var24;
      while(true) {
         if(var18 <= var2 + 1) {
            var24 = var4 - 1;
            if(var5 == null) {
               break;
            }

            int var19 = var24;

            while(true) {
               if(var19 <= var4 + 1) {
                  float var20 = 0.0F;
                  if(var5 == null) {
                     break;
                  }

                  int var23;
                  label97: {
                     label151: {
                        ahb var25 = var1;
                        var23 = var18;
                        int var10002 = var3 - 1;
                        int var10003 = var19;
                        if(var5 != null) {
                           if(var1.getBlock(var18, var10002, var19) != class_1192.field_6087) {
                              break label151;
                           }

                           var20 = 1.0F;
                           var25 = var1;
                           var23 = var18;
                           var10002 = var3 - 1;
                           var10003 = var19;
                        }

                        var24 = var25.method_33(var23, var10002, var10003);
                        if(var5 == null) {
                           break label97;
                        }

                        if(var24 > 0) {
                           var20 = 3.0F;
                        }
                     }

                     var24 = var18;
                  }

                  label87: {
                     label86: {
                        var23 = var2;
                        if(var5 != null) {
                           if(var24 != var2) {
                              break label86;
                           }

                           var24 = var19;
                           var23 = var4;
                        }

                        if(var24 == var23) {
                           break label87;
                        }
                     }

                     var20 /= 4.0F;
                  }

                  var6 += var20;
                  ++var19;
                  if(var5 != null) {
                     continue;
                  }
               }

               ++var18;
               break;
            }

            if(var5 != null) {
               continue;
            }
         }

         var24 = var17;
         break;
      }

      label152: {
         if(var5 != null) {
            if(var24 != 0) {
               break label152;
            }

            var24 = var15;
         }

         if(var5 != null) {
            if(var24 == 0) {
               return var6;
            }

            var24 = var16;
         }

         if(var24 == 0) {
            return var6;
         }
      }

      var6 /= 2.0F;
      return var6;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      if(var3 != null) {
         label17: {
            if(var2 >= 0) {
               var10000 = var2;
               if(var3 == null) {
                  break label17;
               }

               if(var2 <= 7) {
                  return this.field_2199[var2];
               }
            }

            var10000 = 7;
         }
      }

      var2 = var10000;
      return this.field_2199[var2];
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 6;
   }

   // $FF: renamed from: e () adb
   protected adb method_2784() {
      return class_1010.field_5153;
   }

   // $FF: renamed from: i () adb
   protected adb method_2785() {
      return class_1010.field_5154;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.method_2467(var1, var2, var3, var4, var5, var6, 0);
      String[] var8 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var8 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var5;
      }

      int var10001 = 7;
      if(var8 != null) {
         if(var10000 < 7) {
            return;
         }

         var10000 = 3;
         var10001 = var7;
      }

      int var9 = var10000 + var10001;
      int var10 = 0;

      while(var10 < var9) {
         if(var1.field_1819.nextInt(15) <= var5) {
            add var10005 = new add;
            var10005.method_3726(this.method_2784(), 1, 0);
            this.method_2468(var1, var2, var3, var4, var10005);
         }

         ++var10;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return var1 == 7?this.method_2785():this.method_2784();
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 1;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return this.method_2784();
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2199 = new class_73[8];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_2199.length) {
         this.field_2199[var3] = var1.method_375(this.method_2533() + "_stage_" + var3);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, boolean) boolean
   public boolean method_121(ahb var1, int var2, int var3, int var4, boolean var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.method_33(var2, var3, var4);
      if(var6 != null) {
         if(var10000 == 7) {
            return false;
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_122(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   // $FF: renamed from: c (ahb, java.util.Random, int, int, int) void
   public void method_123(ahb var1, Random var2, int var3, int var4, int var5) {
      this.method_2782(var1, var3, var4, var5);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "·½åÖÓ±".toCharArray();
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
            field_2200 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 216;
            break;
         case 1:
            var10009 = 66;
            break;
         case 2:
            var10009 = 79;
            break;
         case 3:
            var10009 = 2;
            break;
         case 4:
            var10009 = 55;
            break;
         case 5:
            var10009 = 48;
            break;
         default:
            var10009 = 104;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

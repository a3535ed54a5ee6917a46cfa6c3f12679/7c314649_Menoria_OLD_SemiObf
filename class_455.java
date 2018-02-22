import java.util.Random;

// $FF: renamed from: eD
public class class_455 extends class_446 implements class_27 {

   // $FF: renamed from: N aji
   private final aji field_2207;
   // $FF: renamed from: O vL
   private class_73 field_2208;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_2209;


   // $FF: renamed from: <init> (aji) void
   protected void method_2786(aji var1) {
      super.method_2770();
      this.field_2207 = var1;
      this.method_2440(true);
      float var2 = 0.125F;
      this.method_2443(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 0.25F, 0.5F + var2);
      this.method_2521((class_872)null);
   }

   // $FF: renamed from: d (aji) boolean
   protected boolean method_2771(aji var1) {
      return var1 == class_1192.field_6087;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      class_455 var10000 = this;
      ahb var10001 = var1;
      int var10002 = var2;
      int var10003 = var3;
      int var10004 = var4;
      if(var6 != null) {
         super.method_2456(var1, var2, var3, var4, var5);
         if(var1.method_2069(var2, var3 + 1, var4) < 9) {
            return;
         }

         var10000 = this;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
         var10004 = var4;
      }

      float var7 = var10000.method_2788(var10001, var10002, var10003, var10004);
      int var13 = var5.nextInt((int)(25.0F / var7) + 1);
      if(var6 != null) {
         if(var13 != 0) {
            return;
         }

         var13 = var1.method_33(var2, var3, var4);
      }

      label107: {
         int var8 = var13;
         if(var6 != null) {
            if(var8 >= 7) {
               break label107;
            }

            ++var8;
            var1.method_2055(var2, var3, var4, var8, 2);
         }

         if(var6 != null) {
            return;
         }
      }

      aji var14 = var1.getBlock(var2 - 1, var3, var4);
      aji var15 = this.field_2207;
      if(var6 != null) {
         if(var14 == this.field_2207) {
            return;
         }

         var14 = var1.getBlock(var2 + 1, var3, var4);
         var15 = this.field_2207;
      }

      if(var6 != null) {
         if(var14 == var15) {
            return;
         }

         var14 = var1.getBlock(var2, var3, var4 - 1);
         var15 = this.field_2207;
      }

      if(var6 != null) {
         if(var14 == var15) {
            return;
         }

         var14 = var1.getBlock(var2, var3, var4 + 1);
         var15 = this.field_2207;
      }

      if(var14 != var15) {
         int var9 = var5.nextInt(4);
         int var10 = var2;
         int var11 = var4;
         var13 = var9;
         if(var6 != null) {
            if(var9 == 0) {
               var10 = var2 - 1;
            }

            var13 = var9;
         }

         byte var16 = 1;
         if(var6 != null) {
            if(var13 == 1) {
               ++var10;
            }

            var13 = var9;
            var16 = 2;
         }

         if(var6 != null) {
            if(var13 == var16) {
               var11 = var4 - 1;
            }

            var13 = var9;
            var16 = 3;
         }

         if(var13 == var16) {
            ++var11;
         }

         aji var12 = var1.getBlock(var10, var3 - 1, var11);
         var14 = var1.getBlock(var10, var3, var11);
         if(var6 != null) {
            if(var14.field_2007 != awt.field_4170) {
               return;
            }

            var14 = var12;
         }

         label82: {
            label121: {
               var15 = class_1192.field_6087;
               if(var6 != null) {
                  if(var14 == class_1192.field_6087) {
                     break label82;
                  }

                  var14 = var12;
                  if(var6 == null) {
                     break label121;
                  }

                  var15 = class_1192.field_6028;
               }

               if(var14 == var15) {
                  break label82;
               }

               var14 = var12;
            }

            if(var14 != class_1192.field_6027) {
               return;
            }
         }

         var1.method_2058(var10, var3, var11, this.field_2207);
      }
   }

   // $FF: renamed from: e (ahb, int, int, int) void
   public void method_2787(ahb var1, int var2, int var3, int var4) {
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
   private float method_2788(ahb var1, int var2, int var3, int var4) {
      String[] var5;
      float var6;
      aji var7;
      aji var8;
      aji var11;
      aji var12;
      aji var13;
      aji var14;
      class_455 var10001;
      aji var22;
      byte var23;
      label145: {
         label144: {
            String[] var10000 = class_752.method_4253();
            var6 = 1.0F;
            var5 = var10000;
            var7 = var1.getBlock(var2, var3, var4 - 1);
            var8 = var1.getBlock(var2, var3, var4 + 1);
            aji var9 = var1.getBlock(var2 - 1, var3, var4);
            aji var10 = var1.getBlock(var2 + 1, var3, var4);
            var11 = var1.getBlock(var2 - 1, var3, var4 - 1);
            var12 = var1.getBlock(var2 + 1, var3, var4 - 1);
            var13 = var1.getBlock(var2 + 1, var3, var4 + 1);
            var14 = var1.getBlock(var2 - 1, var3, var4 + 1);
            var22 = var9;
            var10001 = this;
            if(var5 != null) {
               if(var9 == this) {
                  break label144;
               }

               var22 = var10;
               var10001 = this;
            }

            if(var22 != var10001) {
               var23 = 0;
               break label145;
            }
         }

         var23 = 1;
      }

      byte var15;
      label136: {
         label135: {
            var15 = var23;
            var22 = var7;
            var10001 = this;
            if(var5 != null) {
               if(var7 == this) {
                  break label135;
               }

               var22 = var8;
               var10001 = this;
            }

            if(var22 != var10001) {
               var23 = 0;
               break label136;
            }
         }

         var23 = 1;
      }

      byte var16;
      label127: {
         label148: {
            var16 = var23;
            var22 = var11;
            var10001 = this;
            if(var5 != null) {
               if(var11 == this) {
                  break label148;
               }

               var22 = var12;
               var10001 = this;
            }

            if(var5 != null) {
               if(var22 == var10001) {
                  break label148;
               }

               var22 = var13;
               var10001 = this;
            }

            if(var5 != null) {
               if(var22 == var10001) {
                  break label148;
               }

               var22 = var14;
               var10001 = this;
            }

            if(var22 != var10001) {
               var23 = 0;
               break label127;
            }
         }

         var23 = 1;
      }

      byte var17 = var23;
      int var18 = var2 - 1;

      int var25;
      while(true) {
         if(var18 <= var2 + 1) {
            var25 = var4 - 1;
            if(var5 == null) {
               break;
            }

            int var19 = var25;

            while(true) {
               if(var19 <= var4 + 1) {
                  aji var20 = var1.getBlock(var18, var3 - 1, var19);
                  float var21 = 0.0F;
                  if(var5 == null) {
                     break;
                  }

                  label97: {
                     label151: {
                        if(var5 != null) {
                           if(var20 != class_1192.field_6087) {
                              break label151;
                           }

                           var21 = 1.0F;
                        }

                        var25 = var1.method_33(var18, var3 - 1, var19);
                        if(var5 == null) {
                           break label97;
                        }

                        if(var25 > 0) {
                           var21 = 3.0F;
                        }
                     }

                     var25 = var18;
                  }

                  label87: {
                     label86: {
                        int var24 = var2;
                        if(var5 != null) {
                           if(var25 != var2) {
                              break label86;
                           }

                           var25 = var19;
                           var24 = var4;
                        }

                        if(var25 == var24) {
                           break label87;
                        }
                     }

                     var21 /= 4.0F;
                  }

                  var6 += var21;
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

         var25 = var17;
         break;
      }

      label152: {
         if(var5 != null) {
            if(var25 != 0) {
               break label152;
            }

            var25 = var15;
         }

         if(var5 != null) {
            if(var25 == 0) {
               return var6;
            }

            var25 = var16;
         }

         if(var25 == 0) {
            return var6;
         }
      }

      var6 /= 2.0F;
      return var6;
   }

   // $FF: renamed from: i (int) int
   public int method_2494(int var1) {
      int var2 = var1 * 32;
      int var3 = 255 - var1 * 8;
      int var4 = var1 * 4;
      return var2 << 16 | var3 << 8 | var4;
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      return this.method_2494(var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      float var1 = 0.125F;
      this.method_2443(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.field_2003 = (double)((float)(var1.method_33(var2, var3, var4) * 2 + 2) / 16.0F);
      float var5 = 0.125F;
      this.method_2443(0.5F - var5, 0.0F, 0.5F - var5, 0.5F + var5, (float)this.field_2003, 0.5F + var5);
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 19;
   }

   // $FF: renamed from: f (ahl, int, int, int) int
   public int method_2789(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var7 = var6;
      if(var5 != null) {
         if(var6 >= 7) {
            aji var8 = var1.getBlock(var2 - 1, var3, var4);
            aji var10001 = this.field_2207;
            if(var5 != null) {
               if(var8 == this.field_2207) {
                  return 0;
               }

               var8 = var1.getBlock(var2 + 1, var3, var4);
               var10001 = this.field_2207;
            }

            if(var5 != null) {
               if(var8 == var10001) {
                  return 1;
               }

               var8 = var1.getBlock(var2, var3, var4 - 1);
               var10001 = this.field_2207;
            }

            if(var5 != null) {
               if(var8 == var10001) {
                  return 2;
               }

               var8 = var1.getBlock(var2, var3, var4 + 1);
               var10001 = this.field_2207;
            }

            if(var8 == var10001) {
               return 3;
            }

            return -1;
         }

         var7 = -1;
      }

      return var7;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.method_2467(var1, var2, var3, var4, var5, var6, var7);
      String[] var8 = class_752.method_4253();
      if(!var1.field_1832) {
         adb var9 = null;
         if(this.field_2207 == class_1192.field_6112) {
            var9 = class_1010.field_5218;
         }

         if(this.field_2207 == class_1192.field_6128) {
            var9 = class_1010.field_5219;
         }

         int var10 = 0;

         while(var10 < 3) {
            if(var1.field_1819.nextInt(15) <= var5) {
               add var10005 = new add;
               var10005.method_3724(var9);
               this.method_2468(var1, var2, var3, var4, var10005);
            }

            ++var10;
            if(var8 == null) {
               break;
            }
         }

      }
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return null;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 1;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      aji var10000 = this.field_2207;
      aji var10001 = class_1192.field_6112;
      if(var5 != null) {
         if(this.field_2207 == class_1192.field_6112) {
            return class_1010.field_5218;
         }

         var10000 = this.field_2207;
         var10001 = class_1192.field_6128;
      }

      return var10000 == var10001?class_1010.field_5219:adb.method_2919(0);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2209;
      this.field_2010 = var1.method_375(var10002.append("_disconnected").toString());
      this.field_2208 = var1.method_375(this.method_2533() + "_connected");
   }

   // $FF: renamed from: e () vL
   public class_73 method_2790() {
      return this.field_2208;
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
      this.method_2787(var1, var3, var4, var5);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Þ¶n9×¤ï·d>Ñ\nÞ±h$Ú©õ·c";
      int var4 = "Þ¶n9×¤ï·d>Ñ\nÞ±h$Ú©õ·c".length();
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
                  field_2209 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 76;
               break;
            case 1:
               var10009 = 31;
               break;
            case 2:
               var10009 = 202;
               break;
            case 3:
               var10009 = 135;
               break;
            case 4:
               var10009 = 121;
               break;
            case 5:
               var10009 = 41;
               break;
            default:
               var10009 = 7;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

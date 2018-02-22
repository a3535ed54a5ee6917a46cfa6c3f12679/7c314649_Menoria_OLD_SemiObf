import ca.diiza.e.class_804;
import ca.diiza.e.class_805;
import ca.diiza.e.class_806;
import java.util.List;
import java.util.Random;

// $FF: renamed from: eG
public abstract class class_443 extends aji {

   // $FF: renamed from: M boolean
   private final boolean field_2185;
   // $FF: renamed from: N java.lang.String
   private static final String field_2186;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2187;


   // $FF: renamed from: <init> (boolean) void
   protected void method_2762(boolean var1) {
      super.method_2427(awt.field_4186);
      this.method_2440(true);
      this.method_2521(class_872.field_4246);
      this.field_2185 = var1;
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_2185;
      if(var2 != null) {
         var10000 = this.field_2185?30:20;
      }

      return var10000;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: d (ahb, int, int, int, int) boolean
   public boolean method_2479(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      byte var10001 = 2;
      if(var6 != null) {
         label71: {
            if(var5 == 2) {
               var10000 = var1.getBlock(var2, var3, var4 + 1).method_2433();
               if(var6 == null) {
                  break label71;
               }

               if(var10000 != 0) {
                  var10000 = 1;
                  return (boolean)var10000;
               }
            }

            var10000 = var5;
         }

         var10001 = 3;
      }

      if(var6 != null) {
         label61: {
            if(var10000 == var10001) {
               var10000 = var1.getBlock(var2, var3, var4 - 1).method_2433();
               if(var6 == null) {
                  break label61;
               }

               if(var10000 != 0) {
                  var10000 = 1;
                  return (boolean)var10000;
               }
            }

            var10000 = var5;
         }

         var10001 = 4;
      }

      label77: {
         label78: {
            if(var6 != null) {
               label43: {
                  if(var10000 == var10001) {
                     var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
                     if(var6 == null) {
                        break label43;
                     }

                     if(var10000 != 0) {
                        var10000 = 1;
                        return (boolean)var10000;
                     }
                  }

                  var10000 = var5;
               }

               if(var6 == null) {
                  break label78;
               }

               var10001 = 5;
            }

            if(var10000 != var10001) {
               break label77;
            }

            var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
         }

         if(var6 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
      if(var5 != null) {
         if(var10000) {
            var10000 = true;
            return var10000;
         }

         var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
      }

      aji var6;
      label36: {
         if(var5 != null) {
            if(var10000) {
               var10000 = true;
               return var10000;
            }

            var6 = var1.getBlock(var2, var3, var4 - 1);
            if(var5 == null) {
               break label36;
            }

            var10000 = var6.method_2433();
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }

         var6 = var1.getBlock(var2, var3, var4 + 1);
      }

      var10000 = var6.method_2433();
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var11 = var1.method_33(var2, var3, var4);
      String[] var10000 = class_752.method_4253();
      int var12 = var11 & 8;
      String[] var10 = var10000;
      var11 &= 7;
      int var13 = var5;
      byte var10001 = 2;
      if(var10 != null) {
         label73: {
            if(var5 == 2) {
               var13 = var1.getBlock(var2, var3, var4 + 1).method_2433();
               if(var10 == null) {
                  break label73;
               }

               if(var13 != 0) {
                  var11 = 4;
                  if(var10 != null) {
                     return var11 + var12;
                  }
               }
            }

            var13 = var5;
         }

         var10001 = 3;
      }

      if(var10 != null) {
         label62: {
            if(var13 == var10001) {
               var13 = var1.getBlock(var2, var3, var4 - 1).method_2433();
               if(var10 == null) {
                  break label62;
               }

               if(var13 != 0) {
                  var11 = 3;
                  if(var10 != null) {
                     return var11 + var12;
                  }
               }
            }

            var13 = var5;
         }

         var10001 = 4;
      }

      label79: {
         if(var10 != null) {
            label47: {
               if(var13 == var10001) {
                  var13 = var1.getBlock(var2 + 1, var3, var4).method_2433();
                  if(var10 == null) {
                     break label47;
                  }

                  if(var13 != 0) {
                     var11 = 2;
                     if(var10 != null) {
                        return var11 + var12;
                     }
                  }
               }

               var13 = var5;
            }

            if(var10 == null) {
               break label79;
            }

            var10001 = 5;
         }

         if(var13 == var10001) {
            var13 = var1.getBlock(var2 - 1, var3, var4).method_2433();
            if(var10 == null) {
               break label79;
            }

            if(var13 != 0) {
               var11 = 1;
               if(var10 != null) {
                  return var11 + var12;
               }
            }
         }

         var13 = this.method_2763(var1, var2, var3, var4);
      }

      var11 = var13;
      return var11 + var12;
   }

   // $FF: renamed from: h (ahb, int, int, int) int
   private int method_2763(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
      if(var5 != null) {
         if(var10000 != 0) {
            var10000 = 1;
            return var10000;
         }

         var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
      }

      if(var5 != null) {
         if(var10000 != 0) {
            var10000 = 2;
            return var10000;
         }

         var10000 = var1.getBlock(var2, var3, var4 - 1).method_2433();
      }

      if(var5 != null) {
         if(var10000 != 0) {
            var10000 = 3;
            return var10000;
         }

         var10000 = var1.getBlock(var2, var3, var4 + 1).method_2433();
      }

      if(var5 != null) {
         var10000 = var10000 != 0?4:1;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.method_2764(var1, var2, var3, var4);
      if(var6 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4) & 7;
      }

      int var7 = var10000;
      byte var8 = 0;
      var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
      if(var6 != null) {
         label70: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label70;
               }

               if(var7 == 1) {
                  var8 = 1;
               }
            }

            var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
         }
      }

      if(var6 != null) {
         label63: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label63;
               }

               if(var7 == 2) {
                  var8 = 1;
               }
            }

            var10000 = var1.getBlock(var2, var3, var4 - 1).method_2433();
         }
      }

      if(var6 != null) {
         label56: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label56;
               }

               if(var7 == 3) {
                  var8 = 1;
               }
            }

            var10000 = var1.getBlock(var2, var3, var4 + 1).method_2433();
         }
      }

      if(var6 != null) {
         label49: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label49;
               }

               if(var7 == 4) {
                  var8 = 1;
               }
            }

            var10000 = var8;
         }
      }

      if(var6 != null && var10000 != 0) {
         this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: i (ahb, int, int, int) boolean
   private boolean method_2764(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = this.method_2480(var1, var2, var3, var4);
      if(var5 != null) {
         if(!var10000) {
            this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
            var1.method_2056(var2, var3, var4);
            return false;
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.method_33(var2, var3, var4);
      this.method_2765(var5);
   }

   // $FF: renamed from: c (int) void
   private void method_2765(int var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = var1 & 7;
      String[] var2 = var10000;
      int var9 = var1 & 8;
      if(var2 != null) {
         var9 = var9 > 0?1:0;
      }

      int var4 = var9;
      float var5 = 0.375F;
      float var6 = 0.625F;
      float var7 = 0.1875F;
      float var8 = 0.125F;
      var9 = var4;
      if(var2 != null) {
         if(var4 != 0) {
            var8 = 0.0625F;
         }

         var9 = var3;
      }

      byte var10001 = 1;
      if(var2 != null) {
         if(var9 == 1) {
            this.method_2443(0.0F, var5, 0.5F - var7, var8, var6, 0.5F + var7);
            if(var2 != null) {
               return;
            }
         }

         var9 = var3;
         var10001 = 2;
      }

      if(var2 != null) {
         if(var9 == var10001) {
            this.method_2443(1.0F - var8, var5, 0.5F - var7, 1.0F, var6, 0.5F + var7);
            if(var2 != null) {
               return;
            }
         }

         var9 = var3;
         var10001 = 3;
      }

      if(var2 != null) {
         if(var9 == var10001) {
            this.method_2443(0.5F - var7, var5, 0.0F, 0.5F + var7, var6, var8);
            if(var2 != null) {
               return;
            }
         }

         var9 = var3;
         var10001 = 4;
      }

      if(var9 == var10001) {
         this.method_2443(0.5F - var7, var5, 1.0F - var8, 0.5F + var7, var6, 1.0F);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, yz) void
   public void method_2484(ahb var1, int var2, int var3, int var4, class_792 var5) {}

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      int var11 = var1.method_33(var2, var3, var4);
      String[] var10 = var10000;
      int var12 = var11 & 7;
      int var13 = 8 - (var11 & 8);
      int var14 = var13;
      if(var10 != null) {
         if(var13 == 0) {
            return true;
         }

         var1.method_2055(var2, var3, var4, var12 + var13, 3);
         var1.method_2062(var2, var3, var4, var2, var3, var4);
         double var10001 = (double)var2 + 0.5D;
         double var10002 = (double)var3 + 0.5D;
         double var10003 = (double)var4 + 0.5D;
         String[] var10004 = field_2187;
         var1.method_2084(var10001, var10002, var10003, "random.click", 0.3F, 0.6F);
         this.method_2767(var1, var2, var3, var4, var12);
         var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
         var14 = 1;
      }

      return (boolean)var14;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var7 = class_752.method_4253();
      if(var7 != null) {
         if((var6 & 8) > 0) {
            int var8 = var6 & 7;
            this.method_2767(var1, var2, var3, var4, var8);
         }

         super.method_2462(var1, var2, var3, var4, var5, var6);
      }

   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.method_33(var2, var3, var4) & 8;
      if(var6 != null) {
         var10000 = var10000 > 0?15:0;
      }

      return var10000;
   }

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = class_752.method_4253();
      int var10000 = var7 & 8;
      if(var6 != null) {
         if(var10000 == 0) {
            return 0;
         }

         var10000 = var7 & 7;
      }

      int var8 = var10000;
      var10000 = var8;
      byte var10001 = 5;
      if(var6 != null) {
         label87: {
            if(var8 == 5) {
               var10000 = var5;
               var10001 = 1;
               if(var6 == null) {
                  break label87;
               }

               if(var5 == 1) {
                  var10000 = 15;
                  return var10000;
               }
            }

            var10000 = var8;
            var10001 = 4;
         }
      }

      if(var6 != null) {
         label78: {
            if(var10000 == var10001) {
               var10000 = var5;
               var10001 = 2;
               if(var6 == null) {
                  break label78;
               }

               if(var5 == 2) {
                  var10000 = 15;
                  return var10000;
               }
            }

            var10000 = var8;
            var10001 = 3;
         }
      }

      if(var6 != null) {
         label69: {
            if(var10000 == var10001) {
               var10000 = var5;
               var10001 = 3;
               if(var6 == null) {
                  break label69;
               }

               if(var5 == 3) {
                  var10000 = 15;
                  return var10000;
               }
            }

            var10000 = var8;
            var10001 = 2;
         }
      }

      if(var6 != null) {
         label60: {
            if(var10000 == var10001) {
               var10000 = var5;
               var10001 = 4;
               if(var6 == null) {
                  break label60;
               }

               if(var5 == 4) {
                  var10000 = 15;
                  return var10000;
               }
            }

            var10000 = var8;
            var10001 = 1;
         }
      }

      label52: {
         if(var6 != null) {
            if(var10000 != var10001) {
               break label52;
            }

            var10000 = var5;
            if(var6 == null) {
               return var10000;
            }

            var10001 = 5;
         }

         if(var10000 == var10001) {
            var10000 = 15;
            return var10000;
         }
      }

      var10000 = 0;
      return var10000;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      var10000 = var7 & 8;
      if(var6 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.field_2185;
      }

      if(var6 != null) {
         if(var10000 != 0) {
            this.method_2766(var1, var2, var3, var4);
            if(var6 != null) {
               return;
            }
         }

         var1.method_2055(var2, var3, var4, var7 & 7, 3);
         var10000 = var7 & 7;
      }

      int var8 = var10000;
      this.method_2767(var1, var2, var3, var4, var8);
      double var10001 = (double)var2 + 0.5D;
      double var10002 = (double)var3 + 0.5D;
      double var10003 = (double)var4 + 0.5D;
      String[] var10004 = field_2187;
      var1.method_2084(var10001, var10002, var10003, "random.click", 0.3F, 0.5F);
      var1.method_2062(var2, var3, var4, var2, var3, var4);
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      float var1 = 0.1875F;
      float var2 = 0.125F;
      float var3 = 0.125F;
      this.method_2443(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   // $FF: renamed from: a (ahb, int, int, int, sa) void
   public void method_2498(ahb var1, int var2, int var3, int var4, class_689 var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = this.field_2185;
      }

      if(var6 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4) & 8;
      }

      if(var10000 == 0) {
         this.method_2766(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: m (ahb, int, int, int) void
   private void method_2766(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var7 = var6 & 7;
      int var15 = var6 & 8;
      if(var5 != null) {
         var15 = var15 != 0?1:0;
      }

      int var8 = var15;
      this.method_2765(var6);
      List var9 = var1.method_2157(class_713.class, class_1343.method_7093((double)var2 + this.field_1999, (double)var3 + this.field_2000, (double)var4 + this.field_2001, (double)var2 + this.field_2002, (double)var3 + this.field_2003, (double)var4 + this.field_2004));
      List var10 = var1.method_2157(class_806.class, class_1343.method_7093((double)var2 + this.field_1999, (double)var3 + this.field_2000, (double)var4 + this.field_2001, (double)var2 + this.field_2002, (double)var3 + this.field_2003, (double)var4 + this.field_2004));
      List var11 = var1.method_2157(class_804.class, class_1343.method_7093((double)var2 + this.field_1999, (double)var3 + this.field_2000, (double)var4 + this.field_2001, (double)var2 + this.field_2002, (double)var3 + this.field_2003, (double)var4 + this.field_2004));
      List var12 = var1.method_2157(class_805.class, class_1343.method_7093((double)var2 + this.field_1999, (double)var3 + this.field_2000, (double)var4 + this.field_2001, (double)var2 + this.field_2002, (double)var3 + this.field_2003, (double)var4 + this.field_2004));
      var9.addAll(var10);
      var9.addAll(var11);
      var9.addAll(var12);
      var15 = var9.isEmpty();
      if(var5 != null) {
         var15 = var15 == 0?1:0;
      }

      int var13 = var15;
      var15 = var13;
      double var10001;
      double var10002;
      double var10003;
      if(var5 != null) {
         label47: {
            if(var13 != 0) {
               var15 = var8;
               if(var5 == null) {
                  break label47;
               }

               if(var8 == 0) {
                  var1.method_2055(var2, var3, var4, var7 | 8, 3);
                  this.method_2767(var1, var2, var3, var4, var7);
                  var1.method_2062(var2, var3, var4, var2, var3, var4);
                  var10001 = (double)var2 + 0.5D;
                  var10002 = (double)var3 + 0.5D;
                  var10003 = (double)var4 + 0.5D;
                  String[] var14 = field_2187;
                  var1.method_2084(var10001, var10002, var10003, "random.click", 0.3F, 0.6F);
               }
            }

            var15 = var13;
         }
      }

      if(var5 != null) {
         label40: {
            if(var15 == 0) {
               var15 = var8;
               if(var5 == null) {
                  break label40;
               }

               if(var8 != 0) {
                  var1.method_2055(var2, var3, var4, var7, 3);
                  this.method_2767(var1, var2, var3, var4, var7);
                  var1.method_2062(var2, var3, var4, var2, var3, var4);
                  var10001 = (double)var2 + 0.5D;
                  var10002 = (double)var3 + 0.5D;
                  var10003 = (double)var4 + 0.5D;
                  String[] var10004 = field_2187;
                  var1.method_2084(var10001, var10002, var10003, "random.click", 0.3F, 0.5F);
               }
            }

            var15 = var13;
         }
      }

      if(var15 != 0) {
         var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
      }

   }

   // $FF: renamed from: h (ahb, int, int, int, int) void
   private void method_2767(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      var1.method_2063(var2, var3, var4, this);
      String[] var6 = var10000;
      int var7 = var5;
      byte var10001 = 1;
      if(var6 != null) {
         if(var5 == 1) {
            var1.method_2063(var2 - 1, var3, var4, this);
            if(var6 != null) {
               return;
            }
         }

         var7 = var5;
         var10001 = 2;
      }

      if(var6 != null) {
         if(var7 == var10001) {
            var1.method_2063(var2 + 1, var3, var4, this);
            if(var6 != null) {
               return;
            }
         }

         var7 = var5;
         var10001 = 3;
      }

      if(var6 != null) {
         if(var7 == var10001) {
            var1.method_2063(var2, var3, var4 - 1, this);
            if(var6 != null) {
               return;
            }
         }

         var7 = var5;
         var10001 = 4;
      }

      if(var7 == var10001) {
         var1.method_2063(var2, var3, var4 + 1, this);
         if(var6 != null) {
            return;
         }
      }

      var1.method_2063(var2, var3 - 1, var4, this);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {}

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Ñ3Ò¶y¢ý\\Û\fà®éÉgñ£í";
      int var4 = "Ñ3Ò¶y¢ý\\Û\fà®éÉgñ£í".length();
      char var1 = 11;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2187 = var5;
                  String[] var10 = field_2187;
                  field_2186 = "CL_00000209";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 48;
               break;
            case 1:
               var10009 = 109;
               break;
            case 2:
               var10009 = 206;
               break;
            case 3:
               var10009 = 64;
               break;
            case 4:
               var10009 = 36;
               break;
            case 5:
               var10009 = 6;
               break;
            default:
               var10009 = 235;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

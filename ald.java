import java.util.Random;

public class ald extends class_473 {

   // $FF: renamed from: <init> () void
   public void method_2861() {
      super.method_2427(awt.field_4186);
      this.method_2500();
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      float var1 = 0.375F;
      float var2 = var1 / 2.0F;
      this.method_2443(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var1, 0.5F + var2);
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 33;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      boolean var15;
      label69: {
         String[] var10000 = class_752.method_4253();
         add var11 = var5.field_3616.method_3593();
         String[] var10 = var10000;
         add var14 = var11;
         if(var10 != null) {
            if(var11 == null) {
               break label69;
            }

            var14 = var11;
         }

         var15 = var14.method_3730() instanceof abh;
         if(var10 == null) {
            return var15;
         }

         if(var15) {
            class_586 var12 = this.method_2863(var1, var2, var3, var4);
            class_586 var16 = var12;
            if(var10 != null) {
               if(var12 == null) {
                  return false;
               }

               var16 = var12;
            }

            adb var17 = var16.method_3147();
            if(var10 != null) {
               if(var17 != null) {
                  return false;
               }

               var17 = var11.method_3730();
            }

            aji var13 = aji.method_2417(var17);
            int var18 = this.method_2862(var13, var11.method_3745());
            if(var10 != null) {
               if(var18 == 0) {
                  return false;
               }

               var12.method_3146(var11.method_3730(), var11.method_3745());
               var12.method_91();
               var18 = var1.method_2055(var2, var3, var4, var11.method_3745(), 2);
            }

            if(var10 != null) {
               if(var18 == 0) {
                  var1.method_2059(var2, var3, var4);
               }

               var18 = var5.field_3640.field_2839;
            }

            if(var10 != null) {
               if(var18 == 0) {
                  var18 = --var11.field_2958;
                  if(var10 == null) {
                     return (boolean)var18;
                  }

                  if(var18 <= 0) {
                     var5.field_3616.method_87(var5.field_3616.field_2846, (add)null);
                  }
               }

               var18 = 1;
            }

            return (boolean)var18;
         }
      }

      var15 = false;
      return var15;
   }

   // $FF: renamed from: a (aji, int) boolean
   private boolean method_2862(aji var1, int var2) {
      String[] var3 = class_752.method_4253();
      aji var10000 = var1;
      Object var10001 = class_1192.field_6064;
      if(var3 != null) {
         if(var1 == class_1192.field_6064) {
            return true;
         }

         var10000 = var1;
         var10001 = class_1192.field_6065;
      }

      label78: {
         if(var3 != null) {
            if(var10000 == var10001) {
               return true;
            }

            var10000 = var1;
            if(var3 == null) {
               break label78;
            }

            var10001 = class_1192.field_6107;
         }

         if(var10000 == var10001) {
            return true;
         }

         var10000 = var1;
      }

      var10001 = class_1192.field_6066;
      if(var3 != null) {
         if(var10000 == class_1192.field_6066) {
            return true;
         }

         var10000 = var1;
         var10001 = class_1192.field_6067;
      }

      label80: {
         if(var3 != null) {
            if(var10000 == var10001) {
               return true;
            }

            var10000 = var1;
            if(var3 == null) {
               break label80;
            }

            var10001 = class_1192.field_6031;
         }

         if(var10000 == var10001) {
            return true;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(var10000 == class_1192.field_6059) {
            return true;
         }

         var10000 = var1;
      }

      int var4;
      if(var10000 == class_1192.field_6058) {
         var4 = var2;
         if(var3 == null) {
            return (boolean)var4;
         }

         if(var2 == 2) {
            return true;
         }
      }

      var4 = 0;
      return (boolean)var4;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      adb var7;
      label23: {
         class_586 var6 = this.method_2863(var1, var2, var3, var4);
         String[] var5 = class_752.method_4253();
         class_586 var10000 = var6;
         if(var5 != null) {
            if(var6 == null) {
               break label23;
            }

            var10000 = var6;
         }

         var7 = var10000.method_3147();
         if(var5 == null) {
            return var7;
         }

         if(var7 != null) {
            return var6.method_3147();
         }
      }

      var7 = class_1010.field_5246;
      return var7;
   }

   // $FF: renamed from: k (ahb, int, int, int) int
   public int method_2518(ahb var1, int var2, int var3, int var4) {
      class_586 var6 = this.method_2863(var1, var2, var3, var4);
      String[] var5 = class_752.method_4253();
      class_586 var10000 = var6;
      if(var5 != null) {
         if(var6 == null) {
            return 0;
         }

         var10000 = var6;
      }

      if(var5 != null) {
         if(var10000.method_3147() == null) {
            return 0;
         }

         var10000 = var6;
      }

      return var10000.method_3148();
   }

   // $FF: renamed from: K () boolean
   public boolean method_2525() {
      return true;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      boolean var10000;
      label24: {
         String[] var5 = class_752.method_4253();
         var10000 = super.method_2480(var1, var2, var3, var4);
         if(var5 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
         }

         if(var5 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      if(var6 != null && !ahb.method_2135(var1, var2, var3 - 1, var4)) {
         this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var10000 = class_752.method_4253();
      class_586 var8 = this.method_2863(var1, var2, var3, var4);
      String[] var7 = var10000;
      if(var7 != null) {
         if(var8 != null && var8.method_3147() != null) {
            add var10005 = new add;
            var10005.method_3726(var8.method_3147(), 1, var8.method_3148());
            this.method_2468(var1, var2, var3, var4, var10005);
         }

         super.method_2462(var1, var2, var3, var4, var5, var6);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, int, yz) void
   public void method_2522(ahb var1, int var2, int var3, int var4, int var5, class_792 var6) {
      String[] var7 = class_752.method_4253();
      ald var10000 = this;
      ahb var10001 = var1;
      int var10002 = var2;
      int var10003 = var3;
      int var10004 = var4;
      if(var7 != null) {
         super.method_2522(var1, var2, var3, var4, var5, var6);
         if(!var6.field_3640.field_2839) {
            return;
         }

         var10000 = this;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
         var10004 = var4;
      }

      class_586 var8 = var10000.method_2863(var10001, var10002, var10003, var10004);
      class_586 var9 = var8;
      if(var7 != null) {
         if(var8 == null) {
            return;
         }

         var9 = var8;
      }

      var9.method_3146(adb.method_2919(0), 0);
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5246;
   }

   // $FF: renamed from: e (ahb, int, int, int) gu
   private class_586 method_2863(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      class_580 var6 = var1.method_31(var2, var3, var4);
      String[] var5 = var10000;
      class_580 var7 = var6;
      if(var5 != null) {
         if(var6 == null) {
            return null;
         }

         var7 = var6;
      }

      if(var5 != null) {
         if(!(var7 instanceof class_586)) {
            return null;
         }

         var7 = var6;
      }

      return (class_586)var7;
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      Object var4 = null;
      String[] var3 = class_752.method_4253();
      byte var5 = 0;
      switch(var2) {
      case 2:
         var4 = class_1192.field_6064;
         break;
      case 3:
         var4 = class_1192.field_6031;
         var5 = 0;
         break;
      case 4:
         var4 = class_1192.field_6031;
         var5 = 1;
         break;
      case 5:
         var4 = class_1192.field_6031;
         var5 = 2;
         break;
      case 6:
         var4 = class_1192.field_6031;
         var5 = 3;
         break;
      case 7:
         var4 = class_1192.field_6067;
         break;
      case 8:
         var4 = class_1192.field_6066;
         break;
      case 9:
         var4 = class_1192.field_6107;
         break;
      case 10:
         var4 = class_1192.field_6059;
         break;
      case 11:
         var4 = class_1192.field_6058;
         var5 = 2;
         break;
      case 12:
         var4 = class_1192.field_6031;
         var5 = 4;
         break;
      case 13:
         var4 = class_1192.field_6031;
         var5 = 5;
         break;
      default:
         if(var3 != null) {
            break;
         }
      case 1:
         var4 = class_1192.field_6065;
         var5 = 0;
      }

      class_586 var10000 = new class_586;
      var10000.method_3145(adb.method_2920((aji)var4), var5);
      return var10000;
   }
}

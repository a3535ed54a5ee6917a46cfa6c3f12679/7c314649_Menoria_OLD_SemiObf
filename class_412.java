import java.util.Random;

// $FF: renamed from: fC
public class class_412 extends aji {

   // $FF: renamed from: <init> () void
   protected void method_2654() {
      super.method_2427(awt.field_4180);
      float var1 = 0.375F;
      this.method_2443(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 1.0F, 0.5F + var1);
      this.method_2440(true);
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6;
      byte var9;
      label59: {
         var6 = class_752.method_4253();
         ahb var10000 = var1;
         int var10001 = var2;
         int var10002 = var3 - 1;
         int var10003 = var4;
         if(var6 != null) {
            if(var1.getBlock(var2, var10002, var4) != class_1192.field_6109) {
               var9 = this.method_2655(var1, var2, var3, var4);
               if(var6 == null) {
                  break label59;
               }

               if(var9 == 0) {
                  return;
               }
            }

            var10000 = var1;
            var10001 = var2;
            var10002 = var3 + 1;
            var10003 = var4;
         }

         var9 = var10000.method_34(var10001, var10002, var10003);
      }

      if(var6 != null) {
         if(var9 == 0) {
            return;
         }

         var9 = 1;
      }

      int var7 = var9;

      while(true) {
         if(var1.getBlock(var2, var3 - var7, var4) == this) {
            ++var7;
            if(var6 == null) {
               break;
            }

            if(var6 != null) {
               continue;
            }
         }

         int var10 = var7;
         if(var6 != null) {
            if(var7 >= 3) {
               break;
            }

            var10 = var1.method_33(var2, var3, var4);
         }

         int var8 = var10;
         if(var6 != null) {
            if(var8 == 15) {
               var1.method_2058(var2, var3 + 1, var4, this);
               var1.method_2055(var2, var3, var4, 0, 4);
               if(var6 != null) {
                  break;
               }
            }

            var1.method_2055(var2, var3, var4, var8 + 1, 4);
         }
         break;
      }

   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      aji var6 = var1.getBlock(var2, var3 - 1, var4);
      String[] var5 = var10000;
      aji var7 = var6;
      if(var5 != null) {
         if(var6 == this) {
            return true;
         }

         var7 = var6;
      }

      if(var5 != null) {
         label56: {
            if(var7 != class_1192.field_6027) {
               var7 = var6;
               if(var5 == null) {
                  break label56;
               }

               if(var6 != class_1192.field_6028) {
                  var7 = var6;
                  if(var5 == null) {
                     break label56;
                  }

                  if(var6 != class_1192.field_6037) {
                     return false;
                  }
               }
            }

            var7 = var1.getBlock(var2 - 1, var3 - 1, var4);
         }
      }

      awt var8 = var7.method_2424();
      awt var10001 = awt.field_4177;
      if(var5 != null) {
         if(var8 == awt.field_4177) {
            return true;
         }

         var8 = var1.getBlock(var2 + 1, var3 - 1, var4).method_2424();
         var10001 = awt.field_4177;
      }

      if(var5 != null) {
         if(var8 == var10001) {
            return true;
         }

         var8 = var1.getBlock(var2, var3 - 1, var4 - 1).method_2424();
         var10001 = awt.field_4177;
      }

      if(var5 != null) {
         if(var8 == var10001) {
            return true;
         }

         var8 = var1.getBlock(var2, var3 - 1, var4 + 1).method_2424();
         var10001 = awt.field_4177;
      }

      return var8 == var10001;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      this.method_2655(var1, var2, var3, var4);
   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   protected final boolean method_2655(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = this.method_2505(var1, var2, var3, var4);
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

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      return this.method_2480(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5196;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 1;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5196;
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      return var1.method_35(var2, var4).method_5715(var2, var3, var4);
   }
}

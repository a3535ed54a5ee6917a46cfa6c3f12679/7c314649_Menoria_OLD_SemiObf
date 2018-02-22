import java.util.Random;

// $FF: renamed from: eR
public class class_434 extends class_428 implements class_27 {

   // $FF: renamed from: M vL[]
   private class_73[] field_2162;
   // $FF: renamed from: N java.lang.String
   private static final String field_2163 = "_stage_";


   // $FF: renamed from: <init> () void
   public void method_2737() {
      super.method_2427(awt.field_4180);
      this.method_2440(true);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return this.field_2162[2];
   }

   // $FF: renamed from: c (int) vL
   public class_73 method_2738(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         int var10001;
         label18: {
            if(var1 >= 0) {
               var10000 = var1;
               var10001 = this.field_2162.length;
               if(var2 == null) {
                  break label18;
               }

               if(var1 < var10001) {
                  return this.field_2162[var1];
               }
            }

            var10000 = this.field_2162.length;
            var10001 = 1;
         }

         var10000 -= var10001;
      }

      var1 = var10000;
      return this.field_2162[var1];
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.method_2505(var1, var2, var3, var4);
      if(var6 != null) {
         if(var10000 == 0) {
            this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
            var1.method_2054(var2, var3, var4, method_2416(0), 0, 2);
            if(var6 != null) {
               return;
            }
         }

         var10000 = var1.field_1819.nextInt(5);
      }

      if(var6 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      int var8 = method_2739(var7);
      if(var6 != null && var8 < 2) {
         ++var8;
         var1.method_2055(var2, var3, var4, var8 << 2 | method_2711(var7), 2);
      }

   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = method_2711(var1.method_33(var2, var3, var4));
      String[] var5 = var10000;
      var2 += class_1649.field_8587[var6];
      var4 += class_1649.field_8588[var6];
      aji var7 = var1.getBlock(var2, var3, var4);
      int var8;
      if(var7 == class_1192.field_6042) {
         var8 = class_408.method_2652(var1.method_33(var2, var3, var4));
         if(var5 == null) {
            return (boolean)var8;
         }

         if(var8 == 3) {
            var8 = 1;
            return (boolean)var8;
         }
      }

      var8 = 0;
      return (boolean)var8;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 28;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2452(var1, var2, var3, var4);
   }

   // $FF: renamed from: g (ahb, int, int, int) kg
   public class_1343 method_2450(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2450(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      int var9;
      int var10;
      float var11;
      label31: {
         String[] var5;
         label30: {
            label29: {
               int var6 = var1.method_33(var2, var3, var4);
               int var7 = method_2711(var6);
               int var8 = method_2739(var6);
               String[] var10000 = class_752.method_4253();
               var9 = 4 + var8 * 2;
               var10 = 5 + var8 * 2;
               var11 = (float)var9 / 2.0F;
               var5 = var10000;
               if(var5 != null) {
                  switch(var7) {
                  case 0:
                     this.method_2443((8.0F - var11) / 16.0F, (12.0F - (float)var10) / 16.0F, (15.0F - (float)var9) / 16.0F, (8.0F + var11) / 16.0F, 0.75F, 0.9375F);
                     break;
                  case 1:
                     break label30;
                  case 2:
                     break label29;
                  case 3:
                     break label31;
                  default:
                     return;
                  }
               }

               if(var5 != null) {
                  return;
               }
            }

            this.method_2443((8.0F - var11) / 16.0F, (12.0F - (float)var10) / 16.0F, 0.0625F, (8.0F + var11) / 16.0F, 0.75F, (1.0F + (float)var9) / 16.0F);
            if(var5 != null) {
               return;
            }
         }

         this.method_2443(0.0625F, (12.0F - (float)var10) / 16.0F, (8.0F - var11) / 16.0F, (1.0F + (float)var9) / 16.0F, 0.75F, (8.0F + var11) / 16.0F);
         if(var5 != null) {
            return;
         }
      }

      this.method_2443((15.0F - (float)var9) / 16.0F, (12.0F - (float)var10) / 16.0F, (8.0F - var11) / 16.0F, 0.9375F, 0.75F, (8.0F + var11) / 16.0F);
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      int var7 = ((class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3) + 0) % 4;
      var1.method_2055(var2, var3, var4, var7, 2);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10000;
      label20: {
         String[] var10 = class_752.method_4253();
         var10000 = var5;
         if(var10 != null) {
            if(var5 != 1) {
               var10000 = var5;
               if(var10 == null) {
                  return var10000;
               }

               if(var5 != 0) {
                  break label20;
               }
            }

            var10000 = 2;
         }

         var5 = var10000;
      }

      var10000 = class_1649.field_8592[class_1649.field_8591[var5]];
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      if(var6 != null && !this.method_2505(var1, var2, var3, var4)) {
         this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
         var1.method_2054(var2, var3, var4, method_2416(0), 0, 2);
      }

   }

   // $FF: renamed from: d (int) int
   public static int method_2739(int var0) {
      return (var0 & 12) >> 2;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      String[] var10000 = class_752.method_4253();
      int var9 = method_2739(var5);
      String[] var8 = var10000;
      byte var10 = 1;
      int var12 = var9;
      if(var8 != null) {
         if(var9 >= 2) {
            var10 = 3;
         }

         var12 = 0;
      }

      int var11 = var12;

      while(var11 < var10) {
         add var10005 = new add;
         var10005.method_3726(class_1010.field_5208, 1, 3);
         this.method_2468(var1, var2, var3, var4, var10005);
         ++var11;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5208;
   }

   // $FF: renamed from: k (ahb, int, int, int) int
   public int method_2518(ahb var1, int var2, int var3, int var4) {
      return 3;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2162 = new class_73[3];
      String[] var2 = class_752.method_4253();
      int var3 = 0;

      while(var3 < this.field_2162.length) {
         this.field_2162[var3] = var1.method_375(this.method_2533() + "_stage_" + var3);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, boolean) boolean
   public boolean method_121(ahb var1, int var2, int var3, int var4, boolean var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      int var8 = method_2739(var7);
      String[] var6 = var10000;
      int var9 = var8;
      if(var6 != null) {
         if(var8 >= 2) {
            return false;
         }

         var9 = 1;
      }

      return (boolean)var9;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_122(ahb var1, Random var2, int var3, int var4, int var5) {
      return true;
   }

   // $FF: renamed from: c (ahb, java.util.Random, int, int, int) void
   public void method_123(ahb var1, Random var2, int var3, int var4, int var5) {
      int var6 = var1.method_33(var3, var4, var5);
      int var7 = class_428.method_2711(var6);
      int var8 = method_2739(var6);
      ++var8;
      var1.method_2055(var3, var4, var5, var8 << 2 | var7, 2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "dvíEVÜ".toCharArray();
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
            field_2163 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 124;
            break;
         case 1:
            var10009 = 50;
            break;
         case 2:
            var10009 = 69;
            break;
         case 3:
            var10009 = 203;
            break;
         case 4:
            var10009 = 101;
            break;
         case 5:
            var10009 = 116;
            break;
         default:
            var10009 = 196;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

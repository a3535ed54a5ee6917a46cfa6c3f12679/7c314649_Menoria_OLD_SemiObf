import java.util.Random;

// $FF: renamed from: ed
public class class_481 extends class_473 {

   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2257;


   // $FF: renamed from: <init> () void
   protected void method_2842() {
      super.method_2427(awt.field_4174);
      this.method_2521(class_872.field_4245);
      this.method_2443(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
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
      return 22;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return adb.method_2920(class_1192.field_6076);
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 8;
   }

   // $FF: renamed from: E () boolean
   protected boolean method_2502() {
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      String[] var10000 = class_752.method_4253();
      byte var8 = 0;
      String[] var7 = var10000;
      int var9 = class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3;
      int var10 = var9;
      if(var7 != null) {
         if(var9 == 0) {
            var8 = 2;
         }

         var10 = var9;
      }

      byte var10001 = 1;
      if(var7 != null) {
         if(var10 == 1) {
            var8 = 5;
         }

         var10 = var9;
         var10001 = 2;
      }

      if(var7 != null) {
         if(var10 == var10001) {
            var8 = 3;
         }

         var10 = var9;
         if(var7 == null) {
            return;
         }

         var10001 = 3;
      }

      if(var10 == var10001) {
         var8 = 4;
      }

      var1.method_2055(var2, var3, var4, var8, 2);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      class_1677 var11 = var5.method_4632();
      class_587 var12 = (class_587)var1.method_31(var2, var3, var4);
      String[] var10 = var10000;
      if(var11 != null && var12 != null) {
         boolean var13 = var1.getBlock(var2, var3 + 1, var4).method_2433();
         if(var10 != null) {
            if(var13) {
               return true;
            }

            var13 = var1.field_1832;
         }

         if(var10 != null) {
            if(var13) {
               return true;
            }

            var11.method_9243(var12);
            var5.method_4575(var11);
            var13 = true;
         }

         return var13;
      } else {
         return true;
      }
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_587 var10000 = new class_587;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;

      while(var7 < 3) {
         double var22 = (double)((float)var2 + var5.nextFloat());
         double var10 = (double)((float)var3 + var5.nextFloat());
         var22 = (double)((float)var4 + var5.nextFloat());
         double var14 = 0.0D;
         double var16 = 0.0D;
         double var18 = 0.0D;
         int var20 = var5.nextInt(2) * 2 - 1;
         int var21 = var5.nextInt(2) * 2 - 1;
         var14 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         var16 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         var18 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         double var12 = (double)var4 + 0.5D + 0.25D * (double)var21;
         var18 = (double)(var5.nextFloat() * 1.0F * (float)var21);
         double var8 = (double)var2 + 0.5D + 0.25D * (double)var20;
         var14 = (double)(var5.nextFloat() * 1.0F * (float)var20);
         String[] var10001 = field_2257;
         var1.method_2087("portal", var8, var10, var12, var14, var16, var18);
         ++var7;
         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10002 = field_2257;
      this.field_2010 = var1.method_375("obsidian");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\r±²\b°·V";
      int var4 = "\r±²\b°·V".length();
      char var1 = 6;
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
                  field_2257 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 217;
               break;
            case 1:
               var10009 = 81;
               break;
            case 2:
               var10009 = 103;
               break;
            case 3:
               var10009 = 207;
               break;
            case 4:
               var10009 = 119;
               break;
            case 5:
               var10009 = 223;
               break;
            default:
               var10009 = 147;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

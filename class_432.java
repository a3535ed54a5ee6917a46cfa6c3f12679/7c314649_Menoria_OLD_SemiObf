import java.util.Random;

// $FF: renamed from: eU
public class class_432 extends class_431 {

   // $FF: renamed from: N double[]
   public static final double[] field_2158;
   // $FF: renamed from: O int[]
   private static final int[] field_2159;
   // $FF: renamed from: P java.lang.String
   private static final String field_2160 = "reddust";


   // $FF: renamed from: <init> (boolean) void
   protected void method_2715(boolean var1) {
      super.method_2715(var1);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.method_33(var2, var3, var4);
      int var11 = (var10 & 12) >> 2;
      var11 = var11 + 1 << 2 & 12;
      var1.method_2055(var2, var3, var4, var11 | var10 & 3, 3);
      return true;
   }

   // $FF: renamed from: m (int) int
   protected int method_2730(int var1) {
      return field_2159[(var1 & 12) >> 2] * 2;
   }

   // $FF: renamed from: i () eS
   protected class_431 method_2731() {
      return class_1192.field_6120;
   }

   // $FF: renamed from: P () eS
   protected class_431 method_2732() {
      return class_1192.field_6119;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5213;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5213;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 15;
   }

   // $FF: renamed from: f (ahl, int, int, int, int) boolean
   public boolean method_2718(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.method_2721(var1, var2, var3, var4, var5);
      if(var6 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d (aji) boolean
   protected boolean method_2724(aji var1) {
      return method_2726(var1);
   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.field_2157;
      if(var6 != null) {
         if(!this.field_2157) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      double var9;
      double var11;
      double var13;
      double var15;
      double var17;
      label56: {
         int var7 = var10000;
         int var8 = method_2711(var7);
         var9 = (double)((float)var2 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         var11 = (double)((float)var3 + 0.4F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         var13 = (double)((float)var4 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         var15 = 0.0D;
         var17 = 0.0D;
         var10000 = var5.nextInt(2);
         if(var6 != null) {
            if(var10000 == 0) {
               switch(var8) {
               case 0:
                  var17 = -0.3125D;
                  if(var6 != null) {
                     break;
                  }
               case 2:
                  var17 = 0.3125D;
                  if(var6 != null) {
                     break;
                  }
               case 3:
                  var15 = -0.3125D;
                  if(var6 != null) {
                     break;
                  }
               case 1:
                  var15 = 0.3125D;
               }

               if(var6 != null) {
                  break label56;
               }
            }

            var10000 = (var7 & 12) >> 2;
         }

         int var19 = var10000;
         if(var6 == null) {
            return;
         }

         switch(var8) {
         case 0:
            var17 = field_2158[var19];
            if(var6 != null) {
               break;
            }
         case 2:
            var17 = -field_2158[var19];
            if(var6 != null) {
               break;
            }
         case 3:
            var15 = field_2158[var19];
            if(var6 != null) {
               break;
            }
         case 1:
            var15 = -field_2158[var19];
         }
      }

      var1.method_2087("reddust", var9 + var15, var11, var13 + var17, 0.0D, 0.0D, 0.0D);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      super.method_2462(var1, var2, var3, var4, var5, var6);
      this.method_2723(var1, var2, var3, var4);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "ÿ,1÷".toCharArray();
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
            field_2160 = (new String((char[])var3)).intern();
            field_2158 = new double[]{-0.0625D, 0.0625D, 0.1875D, 0.3125D};
            field_2159 = new int[]{1, 2, 3, 4};
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 255;
            break;
         case 1:
            var10009 = 1;
            break;
         case 2:
            var10009 = 116;
            break;
         case 3:
            var10009 = 109;
            break;
         case 4:
            var10009 = 194;
            break;
         case 5:
            var10009 = 217;
            break;
         default:
            var10009 = 24;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

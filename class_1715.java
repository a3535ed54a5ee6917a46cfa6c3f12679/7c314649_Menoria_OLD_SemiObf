import java.util.Random;

// $FF: renamed from: vs
public class class_1715 {

   // $FF: renamed from: a int
   private static final int field_8986 = 12;
   // $FF: renamed from: b int
   private static final int field_8987 = 4095;
   // $FF: renamed from: c int
   private static final int field_8988 = 4096;
   // $FF: renamed from: d float
   public static final float field_8989 = 3.1415927F;
   // $FF: renamed from: e float
   public static final float field_8990 = 6.2831855F;
   // $FF: renamed from: f float
   public static final float field_8991 = 1.5707964F;
   // $FF: renamed from: g float
   private static final float field_8992 = 6.2831855F;
   // $FF: renamed from: h float
   private static final float field_8993 = 360.0F;
   // $FF: renamed from: i float
   private static final float field_8994 = 651.8986F;
   // $FF: renamed from: j float
   private static final float field_8995 = 11.377778F;
   // $FF: renamed from: k float
   public static final float field_8996 = 0.017453292F;
   // $FF: renamed from: l float[]
   private static final float[] field_8997;
   // $FF: renamed from: m boolean
   public static boolean field_8998;
   // $FF: renamed from: n float[]
   private static float[] field_8999;
   // $FF: renamed from: o int[]
   private static final int[] field_9000;
   // $FF: renamed from: p java.lang.String
   private static final String field_9001 = "CL_00001496";


   // $FF: renamed from: <init> () void
   public void method_9554() {
      super();
   }

   // $FF: renamed from: b (float) float
   public static final float method_9555(float var0) {
      return field_8998?field_8997[(int)(var0 * 651.8986F) & 4095]:field_8999[(int)(var0 * 10430.378F) & '\uffff'];
   }

   // $FF: renamed from: c (float) float
   public static final float method_9556(float var0) {
      return field_8998?field_8997[(int)((var0 + 1.5707964F) * 651.8986F) & 4095]:field_8999[(int)(var0 * 10430.378F + 16384.0F) & '\uffff'];
   }

   // $FF: renamed from: d (float) float
   public static final float method_9557(float var0) {
      return (float)Math.sqrt((double)var0);
   }

   // $FF: renamed from: b (double) float
   public static final float method_9558(double var0) {
      return (float)Math.sqrt(var0);
   }

   // $FF: renamed from: e (float) int
   public static int method_9559(float var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = (int)var0;
      String[] var1 = var10000;
      float var4;
      int var3 = (var4 = var0 - (float)var2) == 0.0F?0:(var4 < 0.0F?-1:1);
      if(var1 != null) {
         var3 = var3 < 0?var2 - 1:var2;
      }

      return var3;
   }

   // $FF: renamed from: c (double) int
   public static int method_9560(double var0) {
      return (int)(var0 + 1024.0D) - 1024;
   }

   // $FF: renamed from: d (double) int
   public static int method_9561(double var0) {
      String[] var10000 = class_752.method_4253();
      int var3 = (int)var0;
      String[] var2 = var10000;
      double var5;
      int var4 = (var5 = var0 - (double)var3) == 0.0D?0:(var5 < 0.0D?-1:1);
      if(var2 != null) {
         var4 = var4 < 0?var3 - 1:var3;
      }

      return var4;
   }

   // $FF: renamed from: e (double) long
   public static long method_9562(double var0) {
      long var2 = (long)var0;
      return var0 < (double)var2?var2 - 1L:var2;
   }

   // $FF: renamed from: f (double) int
   public static int method_9563(double var0) {
      String[] var2 = class_752.method_4253();
      double var10000 = var0;
      double var10001 = 0.0D;
      if(var2 != null) {
         if(var0 >= 0.0D) {
            var10000 = var0;
            return (int)var10000;
         }

         var10000 = -var0;
         var10001 = 1.0D;
      }

      var10000 += var10001;
      return (int)var10000;
   }

   // $FF: renamed from: f (float) float
   public static float method_9564(float var0) {
      String[] var1 = class_752.method_4253();
      float var10000 = var0;
      if(var1 != null) {
         if(var0 >= 0.0F) {
            var10000 = var0;
            return var10000;
         }

         var10000 = var0;
      }

      var10000 = -var10000;
      return var10000;
   }

   // $FF: renamed from: b (int) int
   public static int method_9565(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0;
      if(var1 != null) {
         if(var0 >= 0) {
            var10000 = var0;
            return var10000;
         }

         var10000 = var0;
      }

      var10000 = -var10000;
      return var10000;
   }

   // $FF: renamed from: g (float) int
   public static int method_9566(float var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = (int)var0;
      String[] var1 = var10000;
      float var4;
      int var3 = (var4 = var0 - (float)var2) == 0.0F?0:(var4 < 0.0F?-1:1);
      if(var1 != null) {
         var3 = var3 > 0?var2 + 1:var2;
      }

      return var3;
   }

   // $FF: renamed from: g (double) int
   public static int method_9567(double var0) {
      String[] var10000 = class_752.method_4253();
      int var3 = (int)var0;
      String[] var2 = var10000;
      double var5;
      int var4 = (var5 = var0 - (double)var3) == 0.0D?0:(var5 < 0.0D?-1:1);
      if(var2 != null) {
         var4 = var4 > 0?var3 + 1:var3;
      }

      return var4;
   }

   // $FF: renamed from: b (int, int, int) int
   public static int method_9568(int var0, int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var0;
      int var10001 = var1;
      if(var3 != null) {
         if(var0 < var1) {
            var10000 = var1;
            return var10000;
         }

         var10000 = var0;
         if(var3 == null) {
            return var10000;
         }

         var10001 = var2;
      }

      var10000 = var10000 > var10001?var2:var0;
      return var10000;
   }

   // $FF: renamed from: b (float, float, float) float
   public static float method_9569(float var0, float var1, float var2) {
      String[] var3 = class_752.method_4253();
      float var5;
      int var10000 = (var5 = var0 - var1) == 0.0F?0:(var5 < 0.0F?-1:1);
      float var4;
      if(var3 != null) {
         if(var10000 < 0) {
            var4 = var1;
            return var4;
         }

         var4 = var0;
         if(var3 == null) {
            return var4;
         }

         float var6;
         var10000 = (var6 = var0 - var2) == 0.0F?0:(var6 < 0.0F?-1:1);
      }

      var4 = var10000 > 0?var2:var0;
      return var4;
   }

   // $FF: renamed from: b (double, double, double) double
   public static double method_9570(double var0, double var2, double var4) {
      String[] var6 = class_752.method_4253();
      double var8;
      int var10000 = (var8 = var0 - var2) == 0.0D?0:(var8 < 0.0D?-1:1);
      double var7;
      if(var6 != null) {
         if(var10000 < 0) {
            var7 = var2;
            return var7;
         }

         var7 = var0;
         if(var6 == null) {
            return var7;
         }

         double var9;
         var10000 = (var9 = var0 - var4) == 0.0D?0:(var9 < 0.0D?-1:1);
      }

      var7 = var10000 > 0?var4:var0;
      return var7;
   }

   // $FF: renamed from: c (double, double, double) double
   public static double method_9571(double var0, double var2, double var4) {
      double var10001;
      double var7;
      label26: {
         String[] var6 = class_752.method_4253();
         double var8;
         int var10000 = (var8 = var4 - 0.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
         if(var6 != null) {
            if(var10000 < 0) {
               var7 = var0;
               return var7;
            }

            var7 = var4;
            var10001 = 1.0D;
            if(var6 == null) {
               break label26;
            }

            double var9;
            var10000 = (var9 = var4 - 1.0D) == 0.0D?0:(var9 < 0.0D?-1:1);
         }

         if(var10000 > 0) {
            var7 = var2;
            return var7;
         }

         var7 = var0;
         var10001 = (var2 - var0) * var4;
      }

      var7 += var10001;
      return var7;
   }

   // $FF: renamed from: b (double, double) double
   public static double method_9572(double var0, double var2) {
      String[] var4 = class_752.method_4253();
      double var6;
      int var10000 = (var6 = var0 - 0.0D) == 0.0D?0:(var6 < 0.0D?-1:1);
      if(var4 != null) {
         if(var10000 < 0) {
            var0 = -var0;
         }

         double var7;
         var10000 = (var7 = var2 - 0.0D) == 0.0D?0:(var7 < 0.0D?-1:1);
      }

      double var5;
      if(var4 != null) {
         if(var10000 < 0) {
            var2 = -var2;
         }

         var5 = var0;
         if(var4 == null) {
            return var5;
         }

         double var8;
         var10000 = (var8 = var0 - var2) == 0.0D?0:(var8 < 0.0D?-1:1);
      }

      var5 = var10000 > 0?var0:var2;
      return var5;
   }

   // $FF: renamed from: b (int, int) int
   public static int method_9573(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var0;
      if(var2 != null) {
         if(var0 < 0) {
            var10000 = -((-var0 - 1) / var1) - 1;
            return var10000;
         }

         var10000 = var0;
      }

      var10000 /= var1;
      return var10000;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   public static boolean method_9574(String var0) {
      int var2;
      label24: {
         String[] var1 = class_752.method_4253();
         String var10000 = var0;
         if(var1 != null) {
            if(var0 == null) {
               break label24;
            }

            var10000 = var0;
         }

         var2 = var10000.length();
         if(var1 == null) {
            return (boolean)var2;
         }

         if(var2 != 0) {
            var2 = 0;
            return (boolean)var2;
         }
      }

      var2 = 1;
      return (boolean)var2;
   }

   // $FF: renamed from: b (java.util.Random, int, int) int
   public static int method_9575(Random var0, int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      int var10001 = var2;
      if(var3 != null) {
         if(var1 >= var2) {
            var10000 = var1;
            return var10000;
         }

         var10000 = var0.nextInt(var2 - var1 + 1);
         var10001 = var1;
      }

      var10000 += var10001;
      return var10000;
   }

   // $FF: renamed from: b (java.util.Random, float, float) float
   public static float method_9576(Random var0, float var1, float var2) {
      String[] var3 = class_752.method_4253();
      float var10000 = var1;
      float var10001 = var2;
      if(var3 != null) {
         if(var1 >= var2) {
            var10000 = var1;
            return var10000;
         }

         var10000 = var0.nextFloat() * (var2 - var1);
         var10001 = var1;
      }

      var10000 += var10001;
      return var10000;
   }

   // $FF: renamed from: b (java.util.Random, double, double) double
   public static double method_9577(Random var0, double var1, double var3) {
      String[] var5 = class_752.method_4253();
      double var10000 = var1;
      double var10001 = var3;
      if(var5 != null) {
         if(var1 >= var3) {
            var10000 = var1;
            return var10000;
         }

         var10000 = var0.nextDouble() * (var3 - var1);
         var10001 = var1;
      }

      var10000 += var10001;
      return var10000;
   }

   // $FF: renamed from: b (long[]) double
   public static double method_9578(long[] var0) {
      String[] var10000 = class_752.method_4253();
      long var2 = 0L;
      long[] var4 = var0;
      int var5 = var0.length;
      String[] var1 = var10000;
      int var6 = 0;

      long var9;
      while(true) {
         if(var6 < var5) {
            long var7 = var4[var6];
            var9 = var2 + var7;
            if(var1 == null) {
               break;
            }

            var2 = var9;
            ++var6;
            if(var1 != null) {
               continue;
            }
         }

         var9 = var2;
         break;
      }

      return (double)var9 / (double)var0.length;
   }

   // $FF: renamed from: h (float) float
   public static float method_9579(float var0) {
      String[] var10000 = class_752.method_4253();
      var0 %= 360.0F;
      String[] var1 = var10000;
      float var4;
      int var2 = (var4 = var0 - 180.0F) == 0.0F?0:(var4 < 0.0F?-1:1);
      float var3;
      if(var1 != null) {
         if(var2 >= 0) {
            var0 -= 360.0F;
         }

         var3 = var0;
         if(var1 == null) {
            return var3;
         }

         float var5;
         var2 = (var5 = var0 - -180.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
      }

      if(var2 < 0) {
         var0 += 360.0F;
      }

      var3 = var0;
      return var3;
   }

   // $FF: renamed from: h (double) double
   public static double method_9580(double var0) {
      var0 %= 360.0D;
      String[] var2 = class_752.method_4253();
      double var4;
      int var10000 = (var4 = var0 - 180.0D) == 0.0D?0:(var4 < 0.0D?-1:1);
      double var3;
      if(var2 != null) {
         if(var10000 >= 0) {
            var0 -= 360.0D;
         }

         var3 = var0;
         if(var2 == null) {
            return var3;
         }

         double var5;
         var10000 = (var5 = var0 - -180.0D) == 0.0D?0:(var5 < 0.0D?-1:1);
      }

      if(var10000 < 0) {
         var0 += 360.0D;
      }

      var3 = var0;
      return var3;
   }

   // $FF: renamed from: b (java.lang.String, int) int
   public static int method_9581(String var0, int var1) {
      int var2 = var1;

      try {
         var2 = Integer.parseInt(var0);
      } catch (Throwable var4) {
         ;
      }

      return var2;
   }

   // $FF: renamed from: b (java.lang.String, int, int) int
   public static int method_9582(String var0, int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = var1;
      String[] var3 = var10000;

      try {
         var4 = Integer.parseInt(var0);
      } catch (Throwable var6) {
         ;
      }

      int var8;
      label26: {
         try {
            var8 = var4;
            if(var3 == null) {
               return var8;
            }

            if(var4 >= var2) {
               break label26;
            }
         } catch (Throwable var7) {
            throw method_9591(var7);
         }

         var4 = var2;
      }

      var8 = var4;
      return var8;
   }

   // $FF: renamed from: b (java.lang.String, double) double
   public static double method_9583(String var0, double var1) {
      double var3 = var1;

      try {
         var3 = Double.parseDouble(var0);
      } catch (Throwable var6) {
         ;
      }

      return var3;
   }

   // $FF: renamed from: b (java.lang.String, double, double) double
   public static double method_9584(String var0, double var1, double var3) {
      String[] var10000 = class_752.method_4253();
      double var6 = var1;
      String[] var5 = var10000;

      try {
         var6 = Double.parseDouble(var0);
      } catch (Throwable var9) {
         ;
      }

      double var11;
      label26: {
         try {
            var11 = var6;
            if(var5 == null) {
               return var11;
            }

            if(var6 >= var3) {
               break label26;
            }
         } catch (Throwable var10) {
            throw method_9591(var10);
         }

         var6 = var3;
      }

      var11 = var6;
      return var11;
   }

   // $FF: renamed from: c (int) int
   public static int method_9585(int var0) {
      int var1 = var0 - 1;
      var1 |= var1 >> 1;
      var1 |= var1 >> 2;
      var1 |= var1 >> 4;
      var1 |= var1 >> 8;
      var1 |= var1 >> 16;
      return var1 + 1;
   }

   // $FF: renamed from: e (int) boolean
   private static boolean method_9586(int var0) {
      int var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = var0;
         if(var1 != null) {
            if(var0 == 0) {
               break label24;
            }

            var10000 = var0 & var0 - 1;
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 == 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: f (int) int
   private static int method_9587(int var0) {
      int var10000;
      label14: {
         String[] var1 = class_752.method_4253();
         var10000 = method_9586(var0);
         if(var1 != null) {
            if(var10000 != 0) {
               var10000 = var0;
               break label14;
            }

            var10000 = var0;
         }

         var10000 = method_9585(var10000);
      }

      var0 = var10000;
      return field_9000[(int)((long)var0 * 125613361L >> 27) & 31];
   }

   // $FF: renamed from: g (int) int
   public static int method_9588(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = method_9587(var0);
      int var10001 = method_9586(var0);
      if(var1 != null) {
         var10001 = var10001 != 0?0:1;
      }

      return var10000 - var10001;
   }

   // $FF: renamed from: c (int, int) int
   public static int method_9589(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 == 0) {
            return 0;
         }

         var10000 = var0;
      }

      if(var2 != null) {
         if(var10000 < 0) {
            var1 *= -1;
         }

         var10000 = var0 % var1;
      }

      int var3 = var10000;
      var10000 = var3;
      if(var2 != null) {
         if(var3 == 0) {
            var10000 = var0;
            return var10000;
         }

         var10000 = var0 + var1;
      }

      var10000 -= var3;
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9590() {
      boolean var10000 = true;
      char[] var10003 = ";hÿzJI|".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_9001 = (new String((char[])var4)).intern();
            String var2 = field_9001;
            field_8997 = new float[4096];
            field_8998 = false;
            field_8999 = new float[65536];

            int var1;
            for(var1 = 0; var1 < 65536; ++var1) {
               field_8999[var1] = (float)Math.sin((double)var1 * 3.141592653589793D * 2.0D / 65536.0D);
            }

            field_9000 = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};

            for(var1 = 0; var1 < 4096; ++var1) {
               field_8997[var1] = (float)Math.sin((double)(((float)var1 + 0.5F) / 4096.0F * 6.2831855F));
            }

            for(var1 = 0; var1 < 360; var1 += 90) {
               field_8997[(int)((float)var1 * 11.377778F) & 4095] = (float)Math.sin((double)((float)var1 * 0.017453292F));
            }

            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 220;
            break;
         case 1:
            var10009 = 128;
            break;
         case 2:
            var10009 = 4;
            break;
         case 3:
            var10009 = 238;
            break;
         case 4:
            var10009 = 235;
            break;
         case 5:
            var10009 = 131;
            break;
         default:
            var10009 = 222;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_9591(Throwable var0) {
      return var0;
   }
}

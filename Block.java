import java.util.List;
import java.util.Random;

public class Block {

   // $FF: renamed from: c cw
   public static final class_1025 field_1973;
   // $FF: renamed from: a a5
   private class_872 field_1974;
   // $FF: renamed from: d java.lang.String
   protected String field_1975;
   // $FF: renamed from: e f_
   public static final class_1061 field_1976;
   // $FF: renamed from: f f_
   public static final class_1061 field_1977;
   // $FF: renamed from: g f_
   public static final class_1061 field_1978;
   // $FF: renamed from: h f_
   public static final class_1061 field_1979;
   // $FF: renamed from: i f_
   public static final class_1061 field_1980;
   // $FF: renamed from: j f_
   public static final class_1061 field_1981;
   // $FF: renamed from: k f_
   public static final class_1061 field_1982;
   // $FF: renamed from: l f_
   public static final class_1061 field_1983;
   // $FF: renamed from: m f_
   public static final class_1061 field_1984;
   // $FF: renamed from: n f_
   public static final class_1061 field_1985;
   // $FF: renamed from: o f_
   public static final class_1061 field_1986;
   // $FF: renamed from: p f_
   public static final class_1061 field_1987;
   // $FF: renamed from: q boolean
   protected boolean field_1988;
   // $FF: renamed from: r int
   protected int field_1989;
   // $FF: renamed from: s boolean
   protected boolean field_1990;
   // $FF: renamed from: t int
   protected int field_1991;
   // $FF: renamed from: u boolean
   protected boolean field_1992;
   // $FF: renamed from: v float
   protected float field_1993;
   // $FF: renamed from: w float
   protected float field_1994;
   // $FF: renamed from: x boolean
   protected boolean field_1995;
   // $FF: renamed from: y boolean
   protected boolean field_1996;
   // $FF: renamed from: z boolean
   protected boolean field_1997;
   // $FF: renamed from: A boolean
   protected boolean field_1998;
   // $FF: renamed from: B double
   protected double field_1999;
   // $FF: renamed from: C double
   protected double field_2000;
   // $FF: renamed from: D double
   protected double field_2001;
   // $FF: renamed from: E double
   protected double field_2002;
   // $FF: renamed from: F double
   protected double field_2003;
   // $FF: renamed from: G double
   protected double field_2004;
   // $FF: renamed from: H f_
   public class_1061 field_2005;
   // $FF: renamed from: I float
   public float field_2006;
   // $FF: renamed from: J awt
   protected final awt field_2007;
   // $FF: renamed from: K float
   public float field_2008;
   // $FF: renamed from: b java.lang.String
   private String field_2009;
   // $FF: renamed from: L vL
   protected class_73 field_2010;
   private static final String __OBFID;
   // $FF: renamed from: M java.lang.String[]
   private static final String[] field_2011;


   // $FF: renamed from: b (aji) int
   public static int method_2415(aji var0) {
      return field_1973.method_5816(var0);
   }

   // $FF: renamed from: e (int) aji
   public static aji method_2416(int var0) {
      return (aji)field_1973.method_5817(var0);
   }

   // $FF: renamed from: a (adb) aji
   public static aji method_2417(adb var0) {
      return method_2416(adb.method_2918(var0));
   }

   // $FF: renamed from: b (java.lang.String) aji
   public static aji method_2418(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j () boolean
   public boolean method_2419() {
      return this.field_1988;
   }

   // $FF: renamed from: k () int
   public int method_2420() {
      return this.field_1989;
   }

   // $FF: renamed from: l () boolean
   public boolean method_2421() {
      return this.field_1990;
   }

   // $FF: renamed from: m () int
   public int method_2422() {
      return this.field_1991;
   }

   // $FF: renamed from: n () boolean
   public boolean method_2423() {
      return this.field_1992;
   }

   // $FF: renamed from: o () awt
   public awt method_2424() {
      return this.field_2007;
   }

   // $FF: renamed from: f (int) jj
   public class_1319 method_2425(int var1) {
      return this.method_2424().method_5079();
   }

   // $FF: renamed from: p () void
   public static void method_2426() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <init> (awt) void
   protected void method_2427(awt var1) {
      super();
      this.field_1995 = true;
      this.field_1996 = true;
      this.field_2005 = field_1976;
      this.field_2006 = 1.0F;
      String[] var10000 = class_752.method_4253();
      this.field_2008 = 0.6F;
      this.field_2007 = var1;
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      String[] var2 = var10000;

      short var10001;
      aji var5;
      label39: {
         label38: {
            try {
               this.field_1988 = this.method_2453();
               var5 = this;
               var10001 = this.method_2453();
               if(var2 == null) {
                  break label39;
               }

               if(var10001 != 0) {
                  break label38;
               }
            } catch (NumberFormatException var4) {
               throw method_2538(var4);
            }

            var10001 = 0;
            break label39;
         }

         var10001 = 255;
      }

      boolean var6;
      label30: {
         label29: {
            try {
               var5.field_1989 = var10001;
               var5 = this;
               var6 = var1.method_5064();
               if(var2 == null) {
                  break label30;
               }

               if(!var6) {
                  break label29;
               }
            } catch (NumberFormatException var3) {
               throw method_2538(var3);
            }

            var6 = false;
            break label30;
         }

         var6 = true;
      }

      var5.field_1990 = var6;
   }

   // $FF: renamed from: a (f_) aji
   protected aji method_2428(class_1061 var1) {
      this.field_2005 = var1;
      return this;
   }

   // $FF: renamed from: g (int) aji
   public aji method_2429(int var1) {
      this.field_1989 = var1;
      return this;
   }

   // $FF: renamed from: a (float) aji
   protected aji method_2430(float var1) {
      this.field_1991 = (int)(15.0F * var1);
      return this;
   }

   // $FF: renamed from: b (float) aji
   protected aji method_2431(float var1) {
      this.field_1994 = var1 * 3.0F;
      return this;
   }

   // $FF: renamed from: q () boolean
   public boolean method_2432() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: r () boolean
   public boolean method_2433() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return true;
   }

   // $FF: renamed from: b (ahl, int, int, int) boolean
   public boolean method_2435(ahl var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();

      boolean var10000;
      label32: {
         try {
            var10000 = this.field_2007.method_5065();
            if(var5 == null) {
               return var10000;
            }

            if(!var10000) {
               break label32;
            }
         } catch (NumberFormatException var6) {
            throw method_2538(var6);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 0;
   }

   // $FF: renamed from: c (float) aji
   protected aji method_2437(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: s () aji
   protected aji method_2438() {
      this.method_2437(-1.0F);
      return this;
   }

   // $FF: renamed from: f (ahb, int, int, int) float
   public float method_2439(ahb var1, int var2, int var3, int var4) {
      return this.field_1993;
   }

   // $FF: renamed from: a (boolean) aji
   protected aji method_2440(boolean var1) {
      this.field_1997 = var1;
      return this;
   }

   // $FF: renamed from: t () boolean
   public boolean method_2441() {
      return this.field_1997;
   }

   // $FF: renamed from: u () boolean
   public boolean method_2442() {
      return this.field_1998;
   }

   // $FF: renamed from: a (float, float, float, float, float, float) void
   protected final void method_2443(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_1999 = (double)var1;
      this.field_2000 = (double)var2;
      this.field_2001 = (double)var3;
      this.field_2002 = (double)var4;
      this.field_2003 = (double)var5;
      this.field_2004 = (double)var6;
   }

   // $FF: renamed from: c (ahl, int, int, int) int
   public int method_2444(ahl param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (ahl, int, int, int, int) boolean
   public boolean method_2446(ahl var1, int var2, int var3, int var4, int var5) {
      return var1.getBlock(var2, var3, var4).method_2424().method_5063();
   }

   // $FF: renamed from: e (ahl, int, int, int, int) vL
   public class_73 method_2447(ahl var1, int var2, int var3, int var4, int var5) {
      return this.method_2448(var5, var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return this.field_2010;
   }

   // $FF: renamed from: h (int) vL
   public final class_73 getBlockTextureFromSide(int var1) {
      return this.method_2448(var1, 0);
   }

   // $FF: renamed from: g (ahb, int, int, int) kg
   public class_1343 method_2450(ahb var1, int var2, int var3, int var4) {
      return class_1343.method_7093((double)var2 + this.field_1999, (double)var3 + this.field_2000, (double)var4 + this.field_2001, (double)var2 + this.field_2002, (double)var3 + this.field_2003, (double)var4 + this.field_2004);
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb param1, int param2, int param3, int param4, class_1343 param5, List param6, class_689 param7) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return class_1343.method_7093((double)var2 + this.field_1999, (double)var3 + this.field_2000, (double)var4 + this.field_2001, (double)var2 + this.field_2002, (double)var3 + this.field_2003, (double)var4 + this.field_2004);
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return true;
   }

   // $FF: renamed from: a (int, boolean) boolean
   public boolean method_2454(int var1, boolean var2) {
      return this.method_2455();
   }

   // $FF: renamed from: v () boolean
   public boolean method_2455() {
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {}

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {}

   // $FF: renamed from: b (ahb, int, int, int, int) void
   public void method_2458(ahb var1, int var2, int var3, int var4, int var5) {}

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {}

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 10;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {}

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {}

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 1;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return adb.method_2920(this);
   }

   // $FF: renamed from: a (yz, ahb, int, int, int) float
   public float method_2465(class_792 param1, ahb param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ahb, int, int, int, int, int) void
   public final void method_2466(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      this.method_2467(var1, var2, var3, var4, var5, 1.0F, var6);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb param1, int param2, int param3, int param4, int param5, float param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ahb, int, int, int, add) void
   protected void method_2468(ahb param1, int param2, int param3, int param4, add param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (ahb, int, int, int, int) void
   protected void method_2469(ahb param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return 0;
   }

   // $FF: renamed from: a (sa) float
   public float method_2471(class_689 var1) {
      return this.field_1994 / 5.0F;
   }

   // $FF: renamed from: a (ahb, int, int, int, azw, azw) azu
   public azu method_2472(ahb param1, int param2, int param3, int param4, azw param5, azw param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (azw) boolean
   private boolean method_2473(azw param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (azw) boolean
   private boolean method_2474(azw param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (azw) boolean
   private boolean method_2475(azw param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ahb, int, int, int, df) void
   public void method_2476(ahb var1, int var2, int var3, int var4, class_1036 var5) {}

   // $FF: renamed from: w () int
   public int method_2477() {
      return 0;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, add) boolean
   public boolean method_2478(ahb var1, int var2, int var3, int var4, int var5, add var6) {
      return this.method_2479(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: d (ahb, int, int, int, int) boolean
   public boolean method_2479(ahb var1, int var2, int var3, int var4, int var5) {
      return this.method_2480(var1, var2, var3, var4);
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      return var1.getBlock(var2, var3, var4).field_2007.method_5071();
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      return false;
   }

   // $FF: renamed from: b (ahb, int, int, int, sa) void
   public void method_2482(ahb var1, int var2, int var3, int var4, class_689 var5) {}

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      return var9;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz) void
   public void method_2484(ahb var1, int var2, int var3, int var4, class_792 var5) {}

   // $FF: renamed from: a (ahb, int, int, int, sa, azw) void
   public void method_2485(ahb var1, int var2, int var3, int var4, class_689 var5, azw var6) {}

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {}

   // $FF: renamed from: x () double
   public final double method_2487() {
      return this.field_1999;
   }

   // $FF: renamed from: y () double
   public final double method_2488() {
      return this.field_2002;
   }

   // $FF: renamed from: z () double
   public final double method_2489() {
      return this.field_2000;
   }

   // $FF: renamed from: A () double
   public final double method_2490() {
      return this.field_2003;
   }

   // $FF: renamed from: B () double
   public final double method_2491() {
      return this.field_2001;
   }

   // $FF: renamed from: C () double
   public final double method_2492() {
      return this.field_2004;
   }

   // $FF: renamed from: D () int
   public int method_2493() {
      return 16777215;
   }

   // $FF: renamed from: i (int) int
   public int method_2494(int var1) {
      return 16777215;
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      return 16777215;
   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      return 0;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int, sa) void
   public void method_2498(ahb var1, int var2, int var3, int var4, class_689 var5) {}

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      return 0;
   }

   // $FF: renamed from: g () void
   public void method_2500() {}

   // $FF: renamed from: a (ahb, yz, int, int, int, int) void
   public void method_2501(ahb param1, class_792 param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: E () boolean
   protected boolean method_2502() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      adb var4 = adb.method_2920(this);
      String[] var2 = var10000;

      label39: {
         adb var7;
         label34: {
            try {
               var7 = var4;
               if(var2 == null) {
                  break label34;
               }

               if(var4 == null) {
                  break label39;
               }
            } catch (NumberFormatException var6) {
               throw method_2538(var6);
            }

            var7 = var4;
         }

         int var8;
         label26: {
            try {
               var8 = var7.method_2932();
               if(var2 == null) {
                  break label26;
               }

               if(var8 == 0) {
                  break label39;
               }
            } catch (NumberFormatException var5) {
               throw method_2538(var5);
            }

            var8 = var1;
         }

         var3 = var8;
      }

      add var9 = new add;
      var9.method_3726(var4, 1, var3);
      return var9;
   }

   // $FF: renamed from: a (int, java.util.Random) int
   public int method_2504(int var1, Random var2) {
      return this.method_2463(var2);
   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {}

   // $FF: renamed from: e (ahb, int, int, int, int) void
   public void method_2507(ahb var1, int var2, int var3, int var4, int var5) {}

   // $FF: renamed from: c (java.lang.String) aji
   public aji method_2508(String var1) {
      this.field_2009 = var1;
      return this;
   }

   // $FF: renamed from: F () java.lang.String
   public String method_2509() {
      StringBuilder var10000 = (new StringBuilder()).append(this.method_2510());
      String[] var10001 = field_2011;
      return class_1563.method_8581(var10000.append(".name").toString());
   }

   // $FF: renamed from: a () java.lang.String
   public String method_2510() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_2011;
      return var10000.append("tile.").append(this.field_2009).toString();
   }

   // $FF: renamed from: a (ahb, int, int, int, int, int) boolean
   public boolean method_2511(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      return false;
   }

   // $FF: renamed from: G () boolean
   public boolean method_2512() {
      return this.field_1996;
   }

   // $FF: renamed from: H () aji
   protected aji method_2513() {
      this.field_1996 = false;
      return this;
   }

   // $FF: renamed from: h () int
   public int method_2514() {
      return this.field_2007.method_5074();
   }

   // $FF: renamed from: I () float
   public float method_2515() {
      float var10000;
      try {
         if(this.method_2432()) {
            var10000 = 0.2F;
            return var10000;
         }
      } catch (NumberFormatException var1) {
         throw method_2538(var1);
      }

      var10000 = 1.0F;
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, sa, float) void
   public void method_2516(ahb var1, int var2, int var3, int var4, class_689 var5, float var6) {}

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return adb.method_2920(this);
   }

   // $FF: renamed from: k (ahb, int, int, int) int
   public int method_2518(ahb var1, int var2, int var3, int var4) {
      return this.method_2470(var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
   }

   // $FF: renamed from: J () a5
   public class_872 method_2520() {
      return this.field_1974;
   }

   // $FF: renamed from: a (a5) aji
   public aji method_2521(class_872 var1) {
      this.field_1974 = var1;
      return this;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, yz) void
   public void method_2522(ahb var1, int var2, int var3, int var4, int var5, class_792 var6) {}

   // $FF: renamed from: f (ahb, int, int, int, int) void
   public void method_2523(ahb var1, int var2, int var3, int var4, int var5) {}

   // $FF: renamed from: l (ahb, int, int, int) void
   public void method_2524(ahb var1, int var2, int var3, int var4) {}

   // $FF: renamed from: K () boolean
   public boolean method_2525() {
      return false;
   }

   // $FF: renamed from: L () boolean
   public boolean method_2526() {
      return true;
   }

   // $FF: renamed from: a (df) boolean
   public boolean method_2527(class_1036 var1) {
      return true;
   }

   // $FF: renamed from: c (aji) boolean
   public boolean method_2528(aji var1) {
      boolean var10000;
      try {
         if(this == var1) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var2) {
         throw method_2538(var2);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: a (aji, aji) boolean
   public static boolean method_2529(aji param0, aji param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return false;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      return 0;
   }

   // $FF: renamed from: d (java.lang.String) aji
   protected aji method_2532(String var1) {
      this.field_1975 = var1;
      return this;
   }

   // $FF: renamed from: N () java.lang.String
   protected String method_2533() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int) vL
   public class_73 method_2534(int var1, int var2) {
      return this.method_2448(var1, var2);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2010 = var1.method_375(this.method_2533());
   }

   // $FF: renamed from: O () java.lang.String
   public String getItemIconName() {
      return null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.NumberFormatException) java.lang.NumberFormatException
   private static NumberFormatException method_2538(NumberFormatException var0) {
      return var0;
   }
}

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public abstract class World implements ahl {

   // $FF: renamed from: d boolean
   public boolean field_1801;
   // $FF: renamed from: e java.util.List
   public List field_1802;
   // $FF: renamed from: f java.util.List
   protected List field_1803;
   // $FF: renamed from: g java.util.List
   public List field_1804;
   // $FF: renamed from: a java.util.List
   private List field_1805;
   // $FF: renamed from: b java.util.List
   private List field_1806;
   // $FF: renamed from: h java.util.List
   public List field_1807;
   // $FF: renamed from: i java.util.List
   public List field_1808;
   // $FF: renamed from: c long
   private long field_1809;
   // $FF: renamed from: j int
   public int field_1810;
   // $FF: renamed from: k int
   protected int field_1811;
   // $FF: renamed from: l int
   protected final int field_1812;
   // $FF: renamed from: m float
   protected float field_1813;
   // $FF: renamed from: n float
   protected float field_1814;
   // $FF: renamed from: o float
   protected float field_1815;
   // $FF: renamed from: p float
   protected float field_1816;
   // $FF: renamed from: q int
   public int field_1817;
   // $FF: renamed from: r aq
   public class_918 field_1818;
   // $FF: renamed from: s java.util.Random
   public Random field_1819;
   // $FF: renamed from: t gU
   public final class_1089 field_1820;
   // $FF: renamed from: u java.util.List
   protected List field_1821;
   // $FF: renamed from: v gG
   protected class_25 field_1822;
   // $FF: renamed from: w j9
   protected final class_29 field_1823;
   // $FF: renamed from: x jY
   protected class_1303 field_1824;
   // $FF: renamed from: y boolean
   public boolean field_1825;
   // $FF: renamed from: z kd
   public class_1341 field_1826;
   // $FF: renamed from: A jS
   public final class_1294 field_1827;
   // $FF: renamed from: B zc
   protected final class_1851 field_1828;
   // $FF: renamed from: C qi
   public final class_1535 field_1829;
   // $FF: renamed from: J java.util.Calendar
   private final Calendar field_1830;
   // $FF: renamed from: D kl
   protected class_1348 field_1831;
   // $FF: renamed from: E boolean
   public boolean field_1832;
   // $FF: renamed from: F java.util.Set
   protected Set field_1833;
   // $FF: renamed from: K int
   private int field_1834;
   // $FF: renamed from: G boolean
   protected boolean field_1835;
   // $FF: renamed from: H boolean
   protected boolean field_1836;
   // $FF: renamed from: L java.util.ArrayList
   private ArrayList field_1837;
   // $FF: renamed from: M boolean
   private boolean field_1838;
   // $FF: renamed from: I int[]
   int[] field_1839;
   private static final String __OBFID;
   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_1840;


   // $FF: renamed from: a (int, int) dz
   public class_985 method_35(int var1, int var2) {
      String[] var3 = class_752.method_4253();

      label34: {
         ahb var10000;
         try {
            var10000 = this;
            if(var3 == null) {
               return var10000.field_1820.field_5734.method_5537(var1, var2);
            }

            if(this.method_2048(var1, 0, var2)) {
               break label34;
            }
         } catch (Throwable var10) {
            throw method_2225(var10);
         }

         var10000 = this;
         return var10000.field_1820.field_5734.method_5537(var1, var2);
      }

      class_1069 var4 = this.method_2052(var1, var2);

      try {
         return var4.method_6059(var1 & 15, var2 & 15, this.field_1820.field_5734);
      } catch (Throwable var9) {
         String[] var8 = field_1840;
         class_1346 var6 = class_1346.method_7153(var9, "Getting biome");
         class_1605 var7 = var6.method_7150("Coordinates of biome request");
         class_1041 var10002 = new class_1041;
         var10002.method_5893(this, var1, var2);
         var7.method_8777("Location", var10002);
         class_643 var11 = new class_643;
         var11.method_3525(var6);
         throw var11;
      }
   }

   // $FF: renamed from: v () d0
   public class_958 method_2041() {
      return this.field_1820.field_5734;
   }

   // $FF: renamed from: <init> (j9, java.lang.String, gU, dt, qi) void
   public void method_2042(class_29 param1, String param2, class_1089 param3, class_1045 param4, class_1535 param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <init> (j9, java.lang.String, dt, gU, qi) void
   public void method_2043(class_29 param1, String param2, class_1045 param3, class_1089 param4, class_1535 param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j () gG
   protected abstract class_25 method_2044();

   // $FF: renamed from: a (dt) void
   protected void method_2045(class_1045 var1) {
      this.field_1824.method_6873(true);
   }

   // $FF: renamed from: f () void
   public void method_2046() {
      this.method_2188(8, 64, 8);
   }

   // $FF: renamed from: b (int, int) aji
   public aji method_2047(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 63;
      String[] var3 = var10000;

      while(!this.method_34(var1, var4 + 1, var2)) {
         ++var4;
         if(var3 == null) {
            break;
         }
      }

      return this.getBlock(var1, var4, var2);
   }

   // $FF: renamed from: a (int, int, int) aji
   public aji getBlock(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int, int) boolean
   public boolean method_34(int var1, int var2, int var3) {
      boolean var10000;
      try {
         if(this.getBlock(var1, var2, var3).method_2424() == awt.field_4170) {
            var10000 = true;
            return var10000;
         }
      } catch (class_643 var4) {
         throw method_2225(var4);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: d (int, int, int) boolean
   public boolean method_2048(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int, int) boolean
   public boolean method_2049(int var1, int var2, int var3, int var4) {
      return this.method_2050(var1 - var4, var2 - var4, var3 - var4, var1 + var4, var2 + var4, var3 + var4);
   }

   // $FF: renamed from: b (int, int, int, int, int, int) boolean
   public boolean method_2050(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int) boolean
   protected boolean method_2051(int var1, int var2) {
      return this.field_1822.method_103(var1, var2);
   }

   // $FF: renamed from: d (int, int) gI
   public class_1069 method_2052(int var1, int var2) {
      return this.method_2053(var1 >> 4, var2 >> 4);
   }

   // $FF: renamed from: e (int, int) gI
   public class_1069 method_2053(int var1, int var2) {
      return this.field_1822.method_104(var1, var2);
   }

   // $FF: renamed from: d (int, int, int, aji, int, int) boolean
   public boolean method_2054(int param1, int param2, int param3, aji param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (int, int, int) int
   public int method_33(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int, int, int) boolean
   public boolean method_2055(int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (int, int, int) boolean
   public boolean method_2056(int var1, int var2, int var3) {
      return this.method_2054(var1, var2, var3, class_1192.field_6025, 0, 3);
   }

   // $FF: renamed from: a (int, int, int, boolean) boolean
   public boolean method_2057(int param1, int param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, aji) boolean
   public boolean method_2058(int var1, int var2, int var3, aji var4) {
      return this.method_2054(var1, var2, var3, var4, 0, 3);
   }

   // $FF: renamed from: g (int, int, int) void
   public void method_2059(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var5)).method_70(var1, var2, var3);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (int, int, int, aji) void
   public void method_2060(int var1, int var2, int var3, aji var4) {
      this.method_2063(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (int, int, int, int) void
   public void method_2061(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();

      ahb var10;
      label57: {
         int var10000;
         int var6;
         label51: {
            label50: {
               try {
                  var10000 = var3;
                  if(var5 == null) {
                     break label51;
                  }

                  if(var3 <= var4) {
                     break label50;
                  }
               } catch (class_643 var9) {
                  throw method_2225(var9);
               }

               var6 = var4;
               var4 = var3;
               var3 = var6;
            }

            try {
               var10 = this;
               if(var5 == null) {
                  break label57;
               }

               var10000 = this.field_1820.field_5736;
            } catch (class_643 var8) {
               throw method_2225(var8);
            }
         }

         if(var10000 == 0) {
            var6 = var3;

            while(var6 <= var4) {
               try {
                  this.method_2152(class_95.field_53, var1, var6, var2);
                  ++var6;
                  if(var5 == null) {
                     return;
                  }

                  if(var5 == null) {
                     break;
                  }
               } catch (class_643 var7) {
                  throw method_2225(var7);
               }
            }
         }

         var10 = this;
      }

      var10.method_2062(var1, var3, var2, var1, var4, var2);
   }

   // $FF: renamed from: c (int, int, int, int, int, int) void
   public void method_2062(int var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = 0;
      String[] var7 = var10000;

      while(var8 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var8)).method_72(var1, var2, var3, var4, var5, var6);
         ++var8;
         if(var7 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (int, int, int, aji) void
   public void method_2063(int var1, int var2, int var3, aji var4) {
      this.method_2065(var1 - 1, var2, var3, var4);
      this.method_2065(var1 + 1, var2, var3, var4);
      this.method_2065(var1, var2 - 1, var3, var4);
      this.method_2065(var1, var2 + 1, var3, var4);
      this.method_2065(var1, var2, var3 - 1, var4);
      this.method_2065(var1, var2, var3 + 1, var4);
   }

   // $FF: renamed from: b (int, int, int, aji, int) void
   public void method_2064(int param1, int param2, int param3, aji param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (int, int, int, aji) void
   public void method_2065(int param1, int param2, int param3, aji param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int, aji) boolean
   public boolean method_2066(int var1, int var2, int var3, aji var4) {
      return false;
   }

   // $FF: renamed from: i (int, int, int) boolean
   public boolean method_2067(int var1, int var2, int var3) {
      return this.method_2053(var1 >> 4, var3 >> 4).method_6038(var1 & 15, var2, var3 & 15);
   }

   // $FF: renamed from: j (int, int, int) int
   public int method_2068(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: k (int, int, int) int
   public int method_2069(int var1, int var2, int var3) {
      return this.method_2070(var1, var2, var3, true);
   }

   // $FF: renamed from: b (int, int, int, boolean) int
   public int method_2070(int param1, int param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (int, int) int
   public int method_2071(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g (int, int) int
   public int method_2072(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (H, int, int, int) int
   public int method_2073(class_95 param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (H, int, int, int) int
   public int method_2074(class_95 param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (H, int, int, int, int) void
   public void method_2075(class_95 param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: m (int, int, int) void
   public void method_2076(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var5)).method_71(var1, var2, var3);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (int, int, int, int) int
   public int method_32(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = this.method_2073(class_95.field_53, var1, var2, var3);
      int var7 = this.method_2073(class_95.field_54, var1, var2, var3);
      String[] var5 = var10000;

      int var10001;
      int var9;
      label20: {
         try {
            var9 = var7;
            var10001 = var4;
            if(var5 == null) {
               return var9 | var10001;
            }

            if(var7 >= var4) {
               break label20;
            }
         } catch (class_643 var8) {
            throw method_2225(var8);
         }

         var7 = var4;
      }

      var9 = var6 << 20;
      var10001 = var7 << 4;
      return var9 | var10001;
   }

   // $FF: renamed from: n (int, int, int) float
   public float method_2077(int var1, int var2, int var3) {
      return this.field_1820.field_5737[this.method_2069(var1, var2, var3)];
   }

   // $FF: renamed from: w () boolean
   public boolean method_2078() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (azw, azw) azu
   public azu method_2079(azw var1, azw var2) {
      return this.method_2081(var1, var2, false, false, false);
   }

   // $FF: renamed from: a (azw, azw, boolean) azu
   public azu method_2080(azw var1, azw var2, boolean var3) {
      return this.method_2081(var1, var2, var3, false, false);
   }

   // $FF: renamed from: a (azw, azw, boolean, boolean, boolean) azu
   public azu method_2081(azw param1, azw param2, boolean param3, boolean param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa, java.lang.String, float, float) void
   public void method_2082(class_689 var1, String var2, float var3, float var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      String[] var5 = var10000;

      while(var6 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var6)).method_73(var2, var1.field_2994, var1.field_2995 - (double)var1.field_3013, var1.field_2996, var3, var4);
         ++var6;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (yz, java.lang.String, float, float) void
   public void method_2083(class_792 var1, String var2, float var3, float var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      String[] var5 = var10000;

      while(var6 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var6)).method_74(var1, var2, var1.field_2994, var1.field_2995 - (double)var1.field_3013, var1.field_2996, var3, var4);
         ++var6;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (double, double, double, java.lang.String, float, float) void
   public void method_2084(double var1, double var3, double var5, String var7, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      int var11 = 0;
      String[] var10 = var10000;

      while(var11 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var11)).method_73(var7, var1, var3, var5, var8, var9);
         ++var11;
         if(var10 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (double, double, double, java.lang.String, float, float, boolean) void
   public void method_2085(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10) {}

   // $FF: renamed from: a (java.lang.String, int, int, int) void
   public void method_2086(String var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      String[] var5 = var10000;

      while(var6 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var6)).method_78(var1, var2, var3, var4);
         ++var6;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, double, double, double, double, double, double) void
   public void method_2087(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      String[] var10000 = class_752.method_4253();
      int var15 = 0;
      String[] var14 = var10000;

      while(var15 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var15)).method_75(var1, var2, var4, var6, var8, var10, var12);
         ++var15;
         if(var14 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (sa) boolean
   public boolean method_2088(class_689 var1) {
      this.field_1808.add(var1);
      return true;
   }

   // $FF: renamed from: d (sa) boolean
   public boolean method_2089(class_689 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa) void
   protected void method_2090(class_689 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var3)).method_76(var1);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (sa) void
   protected void method_2091(class_689 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var3)).method_77(var1);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e (sa) void
   public void method_2092(class_689 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (sa) void
   public void method_2093(class_689 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ds) void
   public void method_2094(class_21 var1) {
      this.field_1821.add(var1);
   }

   // $FF: renamed from: b (ds) void
   public void method_2095(class_21 var1) {
      this.field_1821.remove(var1);
   }

   // $FF: renamed from: a (sa, kg) java.util.List
   public List method_2096(class_689 param1, class_1343 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (kg) java.util.List
   public List method_2097(class_1343 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (float) int
   public int method_2098(float var1) {
      String[] var10000 = class_752.method_4253();
      float var3 = this.method_2101(var1);
      String[] var2 = var10000;
      float var4 = 1.0F - (class_1715.method_9556(var3 * 3.1415927F * 2.0F) * 2.0F + 0.5F);

      int var7;
      label37: {
         label36: {
            try {
               float var8;
               var7 = (var8 = var4 - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
               if(var2 == null) {
                  break label37;
               }

               if(var7 >= 0) {
                  break label36;
               }
            } catch (class_643 var6) {
               throw method_2225(var6);
            }

            var4 = 0.0F;
         }

         float var9;
         var7 = (var9 = var4 - 1.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
      }

      label27: {
         try {
            if(var2 == null) {
               return var7;
            }

            if(var7 <= 0) {
               break label27;
            }
         } catch (class_643 var5) {
            throw method_2225(var5);
         }

         var4 = 1.0F;
      }

      var4 = 1.0F - var4;
      var4 = (float)((double)var4 * (1.0D - (double)(this.method_2200(var1) * 5.0F) / 16.0D));
      var4 = (float)((double)var4 * (1.0D - (double)(this.method_2198(var1) * 5.0F) / 16.0D));
      var4 = 1.0F - var4;
      var7 = (int)(var4 * 11.0F);
      return var7;
   }

   // $FF: renamed from: b (float) float
   public float method_2099(float var1) {
      float var3 = this.method_2101(var1);
      String[] var10000 = class_752.method_4253();
      float var4 = 1.0F - (class_1715.method_9556(var3 * 3.1415927F * 2.0F) * 2.0F + 0.2F);
      String[] var2 = var10000;

      int var7;
      float var8;
      float var10001;
      label34: {
         label33: {
            try {
               float var9;
               var7 = (var9 = var4 - 0.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
               if(var2 == null) {
                  break label34;
               }

               if(var7 >= 0) {
                  break label33;
               }
            } catch (class_643 var6) {
               throw method_2225(var6);
            }

            var4 = 0.0F;
         }

         try {
            var8 = var4;
            var10001 = 1.0F;
            if(var2 == null) {
               return var8 + var10001;
            }

            float var10;
            var7 = (var10 = var4 - 1.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
         } catch (class_643 var5) {
            throw method_2225(var5);
         }
      }

      if(var7 > 0) {
         var4 = 1.0F;
      }

      var4 = 1.0F - var4;
      var4 = (float)((double)var4 * (1.0D - (double)(this.method_2200(var1) * 5.0F) / 16.0D));
      var4 = (float)((double)var4 * (1.0D - (double)(this.method_2198(var1) * 5.0F) / 16.0D));
      var8 = var4 * 0.8F;
      var10001 = 0.2F;
      return var8 + var10001;
   }

   // $FF: renamed from: a (sa, float) azw
   public azw method_2100(class_689 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (float) float
   public float method_2101(float var1) {
      return this.field_1820.method_6166(this.field_1824.method_6841(), var1);
   }

   // $FF: renamed from: x () int
   public int method_2102() {
      return this.field_1820.method_6167(this.field_1824.method_6841());
   }

   // $FF: renamed from: y () float
   public float method_2103() {
      return class_1089.field_5730[this.field_1820.method_6167(this.field_1824.method_6841())];
   }

   // $FF: renamed from: d (float) float
   public float method_2104(float var1) {
      float var2 = this.method_2101(var1);
      return var2 * 3.1415927F * 2.0F;
   }

   // $FF: renamed from: e (float) azw
   public azw method_2105(float var1) {
      String[] var10000 = class_752.method_4253();
      float var3 = this.method_2101(var1);
      float var4 = class_1715.method_9556(var3 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      String[] var2 = var10000;

      float var17;
      float var10001;
      label75: {
         int var16;
         label70: {
            label69: {
               try {
                  float var18;
                  var16 = (var18 = var4 - 0.0F) == 0.0F?0:(var18 < 0.0F?-1:1);
                  if(var2 == null) {
                     break label70;
                  }

                  if(var16 >= 0) {
                     break label69;
                  }
               } catch (class_643 var15) {
                  throw method_2225(var15);
               }

               var4 = 0.0F;
            }

            try {
               var17 = var4;
               var10001 = 1.0F;
               if(var2 == null) {
                  break label75;
               }

               float var19;
               var16 = (var19 = var4 - 1.0F) == 0.0F?0:(var19 < 0.0F?-1:1);
            } catch (class_643 var14) {
               throw method_2225(var14);
            }
         }

         if(var16 > 0) {
            var4 = 1.0F;
         }

         var17 = (float)(this.field_1809 >> 16 & 255L);
         var10001 = 255.0F;
      }

      float var5 = var17 / var10001;
      float var6 = (float)(this.field_1809 >> 8 & 255L) / 255.0F;
      float var7 = (float)(this.field_1809 & 255L) / 255.0F;
      float var8 = this.method_2200(var1);

      float var9;
      float var10;
      label56: {
         label55: {
            try {
               var17 = var8;
               var10001 = 0.0F;
               if(var2 == null) {
                  break label56;
               }

               if(var8 <= 0.0F) {
                  break label55;
               }
            } catch (class_643 var13) {
               throw method_2225(var13);
            }

            var9 = (var5 * 0.3F + var6 * 0.59F + var7 * 0.11F) * 0.6F;
            var10 = 1.0F - var8 * 0.95F;
            var5 = var5 * var10 + var9 * (1.0F - var10);
            var6 = var6 * var10 + var9 * (1.0F - var10);
            var7 = var7 * var10 + var9 * (1.0F - var10);
         }

         var5 *= var4 * 0.9F + 0.1F;
         var6 *= var4 * 0.9F + 0.1F;
         var17 = var7;
         var10001 = var4 * 0.85F + 0.15F;
      }

      var7 = var17 * var10001;
      var9 = this.method_2198(var1);

      label45: {
         try {
            var17 = var9;
            if(var2 == null) {
               return azw.method_5086((double)var17, (double)var6, (double)var7);
            }

            if(var9 <= 0.0F) {
               break label45;
            }
         } catch (class_643 var12) {
            throw method_2225(var12);
         }

         var10 = (var5 * 0.3F + var6 * 0.59F + var7 * 0.11F) * 0.2F;
         float var11 = 1.0F - var9 * 0.95F;
         var5 = var5 * var11 + var10 * (1.0F - var11);
         var6 = var6 * var11 + var10 * (1.0F - var11);
         var7 = var7 * var11 + var10 * (1.0F - var11);
      }

      var17 = var5;
      return azw.method_5086((double)var17, (double)var6, (double)var7);
   }

   // $FF: renamed from: f (float) azw
   public azw method_2106(float var1) {
      float var2 = this.method_2101(var1);
      return this.field_1820.method_6170(var2, var1);
   }

   // $FF: renamed from: h (int, int) int
   public int method_2107(int var1, int var2) {
      return this.method_2052(var1, var2).method_6052(var1 & 15, var2 & 15);
   }

   // $FF: renamed from: i (int, int) int
   public int method_2108(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g (float) float
   public float method_2109(float var1) {
      String[] var10000 = class_752.method_4253();
      float var3 = this.method_2101(var1);
      float var4 = 1.0F - (class_1715.method_9556(var3 * 3.1415927F * 2.0F) * 2.0F + 0.25F);
      String[] var2 = var10000;

      int var7;
      float var8;
      float var10001;
      label34: {
         label33: {
            try {
               float var9;
               var7 = (var9 = var4 - 0.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
               if(var2 == null) {
                  break label34;
               }

               if(var7 >= 0) {
                  break label33;
               }
            } catch (class_643 var6) {
               throw method_2225(var6);
            }

            var4 = 0.0F;
         }

         try {
            var8 = var4;
            var10001 = 1.0F;
            if(var2 == null) {
               return var8 * var10001;
            }

            float var10;
            var7 = (var10 = var4 - 1.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
         } catch (class_643 var5) {
            throw method_2225(var5);
         }
      }

      if(var7 > 0) {
         var4 = 1.0F;
      }

      var8 = var4 * var4;
      var10001 = 0.5F;
      return var8 * var10001;
   }

   // $FF: renamed from: a (int, int, int, aji, int) void
   public void method_2110(int var1, int var2, int var3, aji var4, int var5) {}

   // $FF: renamed from: a (int, int, int, aji, int, int) void
   public void method_2111(int var1, int var2, int var3, aji var4, int var5, int var6) {}

   // $FF: renamed from: b (int, int, int, aji, int, int) void
   public void method_2112(int var1, int var2, int var3, aji var4, int var5, int var6) {}

   // $FF: renamed from: h () void
   public void method_2113() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.util.Collection) void
   public void method_2114(Collection param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g (sa) void
   public void method_2115(class_689 var1) {
      this.method_2116(var1, true);
   }

   // $FF: renamed from: a (sa, boolean) void
   public void method_2116(class_689 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (kg) boolean
   public boolean method_2117(class_1343 var1) {
      return this.method_2118(var1, (class_689)null);
   }

   // $FF: renamed from: a (kg, sa) boolean
   public boolean method_2118(class_1343 param1, class_689 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (kg) boolean
   public boolean method_2119(class_1343 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (kg) boolean
   public boolean method_2120(class_1343 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = class_1715.method_9561(var1.field_6909);
      int var4 = class_1715.method_9561(var1.field_6912 + 1.0D);
      int var5 = class_1715.method_9561(var1.field_6910);
      int var6 = class_1715.method_9561(var1.field_6913 + 1.0D);
      int var7 = class_1715.method_9561(var1.field_6911);
      int var8 = class_1715.method_9561(var1.field_6914 + 1.0D);
      String[] var2 = var10000;

      int var18;
      label123: {
         label122: {
            try {
               double var19;
               var18 = (var19 = var1.field_6909 - 0.0D) == 0.0D?0:(var19 < 0.0D?-1:1);
               if(var2 == null) {
                  break label123;
               }

               if(var18 >= 0) {
                  break label122;
               }
            } catch (class_643 var17) {
               throw method_2225(var17);
            }

            --var3;
         }

         double var20;
         var18 = (var20 = var1.field_6910 - 0.0D) == 0.0D?0:(var20 < 0.0D?-1:1);
      }

      label114: {
         label113: {
            try {
               if(var2 == null) {
                  break label114;
               }

               if(var18 >= 0) {
                  break label113;
               }
            } catch (class_643 var16) {
               throw method_2225(var16);
            }

            --var5;
         }

         double var21;
         var18 = (var21 = var1.field_6911 - 0.0D) == 0.0D?0:(var21 < 0.0D?-1:1);
      }

      label105: {
         label104: {
            try {
               if(var2 == null) {
                  break label105;
               }

               if(var18 >= 0) {
                  break label104;
               }
            } catch (class_643 var15) {
               throw method_2225(var15);
            }

            --var7;
         }

         var18 = var3;
      }

      int var9 = var18;

      label96:
      while(true) {
         var18 = var9;

         label93:
         while(true) {
            if(var18 < var4) {
               var18 = var5;
               if(var2 == null) {
                  break;
               }

               int var10 = var5;

               label85:
               while(true) {
                  var18 = var10;

                  while(true) {
                     if(var18 >= var6) {
                        break label85;
                     }

                     var18 = var7;
                     if(var2 == null) {
                        continue label93;
                     }

                     int var11 = var7;

                     while(true) {
                        if(var11 < var8) {
                           aji var12 = this.getBlock(var9, var10, var11);

                           label131: {
                              try {
                                 if(var2 == null) {
                                    break label131;
                                 }

                                 var18 = var12.method_2424().method_5062();
                                 if(var2 == null) {
                                    break;
                                 }
                              } catch (class_643 var14) {
                                 throw method_2225(var14);
                              }

                              try {
                                 if(var18 != 0) {
                                    return true;
                                 }
                              } catch (class_643 var13) {
                                 throw method_2225(var13);
                              }

                              ++var11;
                           }

                           if(var2 != null) {
                              continue;
                           }
                        }

                        ++var10;
                        if(var2 == null) {
                           break label85;
                        }
                        continue label85;
                     }
                  }
               }

               ++var9;
               if(var2 != null) {
                  continue label96;
               }
            }

            var18 = 0;
            break;
         }

         return (boolean)var18;
      }
   }

   // $FF: renamed from: e (kg) boolean
   public boolean method_2121(class_1343 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (kg, awt, sa) boolean
   public boolean method_2122(class_1343 param1, awt param2, class_689 param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (kg, awt) boolean
   public boolean method_2123(class_1343 param1, awt param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (kg, awt) boolean
   public boolean method_2124(class_1343 param1, awt param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa, double, double, double, float, boolean) df
   public class_1036 method_2125(class_689 var1, double var2, double var4, double var6, float var8, boolean var9) {
      return this.method_2126(var1, var2, var4, var6, var8, false, var9);
   }

   // $FF: renamed from: a (sa, double, double, double, float, boolean, boolean) df
   public class_1036 method_2126(class_689 var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      class_1036 var10000 = new class_1036;
      var10000.method_5862(this, var1, var2, var4, var6, var8);
      class_1036 var11 = var10000;
      var11.field_5480 = var9;
      var11.field_5481 = var10;
      var11.method_5863();
      var11.method_5864(true);
      return var11;
   }

   // $FF: renamed from: a (azw, kg) float
   public float method_2127(azw param1, class_1343 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (yz, int, int, int, int) boolean
   public boolean method_2128(class_792 param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: z () java.lang.String
   public String method_2129() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_1840;
      return var10000.append("All: ").append(this.field_1802.size()).toString();
   }

   // $FF: renamed from: A () java.lang.String
   public String method_2130() {
      return this.field_1822.method_110();
   }

   // $FF: renamed from: o (int, int, int) gi
   public class_580 method_31(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int, gi) void
   public void method_2131(int param1, int param2, int param3, class_580 param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: p (int, int, int) void
   public void method_2132(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (gi) void
   public void method_2133(class_580 var1) {
      this.field_1806.add(var1);
   }

   // $FF: renamed from: q (int, int, int) boolean
   public boolean method_2134(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      class_1343 var5 = this.getBlock(var1, var2, var3).method_2452(this, var1, var2, var3);
      String[] var4 = var10000;

      int var9;
      label47: {
         class_1343 var8;
         label34: {
            try {
               var8 = var5;
               if(var4 == null) {
                  break label34;
               }

               if(var5 == null) {
                  break label47;
               }
            } catch (class_643 var7) {
               throw method_2225(var7);
            }

            var8 = var5;
         }

         try {
            double var10;
            var9 = (var10 = var8.method_7106() - 1.0D) == 0.0D?0:(var10 < 0.0D?-1:1);
            if(var4 == null) {
               return (boolean)var9;
            }

            if(var9 < 0) {
               break label47;
            }
         } catch (class_643 var6) {
            throw method_2225(var6);
         }

         var9 = 1;
         return (boolean)var9;
      }

      var9 = 0;
      return (boolean)var9;
   }

   // $FF: renamed from: a (ahl, int, int, int) boolean
   public static boolean method_2135(ahl param0, int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int, int, boolean) boolean
   public boolean method_2136(int param1, int param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: B () void
   public void method_2137() {
      int var1 = this.method_2098(1.0F);

      try {
         if(var1 != this.field_1810) {
            this.field_1810 = var1;
         }

      } catch (class_643 var2) {
         throw method_2225(var2);
      }
   }

   // $FF: renamed from: a (boolean, boolean) void
   public void method_2138(boolean var1, boolean var2) {
      this.field_1835 = var1;
      this.field_1836 = var2;
   }

   // $FF: renamed from: b () void
   public void method_2139() {
      this.method_2141();
   }

   // $FF: renamed from: a () void
   private void method_2140() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: o () void
   protected void method_2141() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: C () void
   protected void method_2142() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: p () int
   protected abstract int method_2143();

   // $FF: renamed from: a (int, int, gI) void
   protected void method_2144(int param1, int param2, class_1069 param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   protected void method_2145() {
      this.method_2142();
   }

   // $FF: renamed from: r (int, int, int) boolean
   public boolean method_2146(int var1, int var2, int var3) {
      return this.method_2148(var1, var2, var3, false);
   }

   // $FF: renamed from: s (int, int, int) boolean
   public boolean method_2147(int var1, int var2, int var3) {
      return this.method_2148(var1, var2, var3, true);
   }

   // $FF: renamed from: d (int, int, int, boolean) boolean
   public boolean method_2148(int param1, int param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (int, int, int, boolean) boolean
   public boolean method_2149(int param1, int param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: t (int, int, int) boolean
   public boolean method_2150(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      boolean var5 = false;
      String[] var4 = var10000;

      boolean var7;
      label20: {
         try {
            var7 = this.field_1820.field_5736;
            if(var4 == null) {
               return var7;
            }

            if(this.field_1820.field_5736) {
               break label20;
            }
         } catch (class_643 var6) {
            throw method_2225(var6);
         }

         var5 |= this.method_2152(class_95.field_53, var1, var2, var3);
      }

      var5 |= this.method_2152(class_95.field_54, var1, var2, var3);
      var7 = var5;
      return var7;
   }

   // $FF: renamed from: a (int, int, int, H) int
   private int method_2151(int param1, int param2, int param3, class_95 param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (H, int, int, int) boolean
   public boolean method_2152(class_95 param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (boolean) boolean
   public boolean method_2153(boolean var1) {
      return false;
   }

   // $FF: renamed from: a (gI, boolean) java.util.List
   public List method_2154(class_1069 var1, boolean var2) {
      return null;
   }

   // $FF: renamed from: b (sa, kg) java.util.List
   public List method_2155(class_689 var1, class_1343 var2) {
      return this.method_2156(var1, var2, (class_82)null);
   }

   // $FF: renamed from: a (sa, kg, xT) java.util.List
   public List method_2156(class_689 var1, class_1343 var2, class_82 var3) {
      ArrayList var5 = new ArrayList();
      int var6 = class_1715.method_9561((var2.field_6909 - 2.0D) / 16.0D);
      int var7 = class_1715.method_9561((var2.field_6912 + 2.0D) / 16.0D);
      String[] var10000 = class_752.method_4253();
      int var8 = class_1715.method_9561((var2.field_6911 - 2.0D) / 16.0D);
      int var9 = class_1715.method_9561((var2.field_6914 + 2.0D) / 16.0D);
      String[] var4 = var10000;
      int var10 = var6;

      do {
         int var14 = var10;

         label47:
         while(true) {
            if(var14 > var7) {
               return var5;
            }

            int var11 = var8;

            while(true) {
               if(var11 > var9) {
                  break label47;
               }

               label42: {
                  ahb var15;
                  int var10001;
                  int var10002;
                  label41: {
                     try {
                        var15 = this;
                        var10001 = var10;
                        var10002 = var11;
                        if(var4 == null) {
                           break label41;
                        }

                        var14 = this.method_2051(var10, var11);
                        if(var4 == null) {
                           break;
                        }
                     } catch (class_643 var13) {
                        throw method_2225(var13);
                     }

                     try {
                        if(var14 == 0) {
                           break label42;
                        }

                        var15 = this;
                        var10001 = var10;
                        var10002 = var11;
                     } catch (class_643 var12) {
                        throw method_2225(var12);
                     }
                  }

                  var15.method_2053(var10001, var10002).method_6046(var1, var2, var5, var3);
               }

               ++var11;
               if(var4 == null) {
                  break label47;
               }
            }
         }

         ++var10;
      } while(var4 != null);

      return var5;
   }

   // $FF: renamed from: a (java.lang.Class, kg) java.util.List
   public List method_2157(Class var1, class_1343 var2) {
      return this.method_2158(var1, var2, (class_82)null);
   }

   // $FF: renamed from: a (java.lang.Class, kg, xT) java.util.List
   public List method_2158(Class var1, class_1343 var2, class_82 var3) {
      int var5 = class_1715.method_9561((var2.field_6909 - 2.0D) / 16.0D);
      String[] var10000 = class_752.method_4253();
      int var6 = class_1715.method_9561((var2.field_6912 + 2.0D) / 16.0D);
      int var7 = class_1715.method_9561((var2.field_6911 - 2.0D) / 16.0D);
      int var8 = class_1715.method_9561((var2.field_6914 + 2.0D) / 16.0D);
      String[] var4 = var10000;
      ArrayList var9 = new ArrayList();
      int var10 = var5;

      do {
         int var14 = var10;

         label47:
         while(true) {
            if(var14 > var6) {
               return var9;
            }

            int var11 = var7;

            while(true) {
               if(var11 > var8) {
                  break label47;
               }

               label42: {
                  ahb var15;
                  int var10001;
                  int var10002;
                  label41: {
                     try {
                        var15 = this;
                        var10001 = var10;
                        var10002 = var11;
                        if(var4 == null) {
                           break label41;
                        }

                        var14 = this.method_2051(var10, var11);
                        if(var4 == null) {
                           break;
                        }
                     } catch (class_643 var13) {
                        throw method_2225(var13);
                     }

                     try {
                        if(var14 == 0) {
                           break label42;
                        }

                        var15 = this;
                        var10001 = var10;
                        var10002 = var11;
                     } catch (class_643 var12) {
                        throw method_2225(var12);
                     }
                  }

                  var15.method_2053(var10001, var10002).method_6047(var1, var2, var9, var3);
               }

               ++var11;
               if(var4 == null) {
                  break label47;
               }
            }
         }

         ++var10;
      } while(var4 != null);

      return var9;
   }

   // $FF: renamed from: a (java.lang.Class, kg, sa) sa
   public class_689 method_2159(Class param1, class_1343 param2, class_689 param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int) sa
   public abstract class_689 method_2160(int var1);

   // $FF: renamed from: D () java.util.List
   public List method_2161() {
      return this.field_1802;
   }

   // $FF: renamed from: b (int, int, int, gi) void
   public void method_2162(int param1, int param2, int param3, class_580 param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.Class) int
   public int method_2163(Class param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.util.List) void
   public void method_2164(List var1) {
      String[] var10000 = class_752.method_4253();
      this.field_1802.addAll(var1);
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < var1.size()) {
         this.method_2090((class_689)var1.get(var3));
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.util.List) void
   public void method_2165(List var1) {
      this.field_1803.addAll(var1);
   }

   // $FF: renamed from: a (aji, int, int, int, boolean, int, sa, add) boolean
   public boolean canPlaceEntityOnSide(aji param1, int param2, int param3, int param4, boolean param5, int param6, class_689 param7, add param8) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa, sa, float, boolean, boolean, boolean, boolean) jK
   public class_1289 method_2167(class_689 var1, class_689 var2, float var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      String[] var10001 = field_1840;
      this.field_1829.method_8332("pathfind");
      int var8 = class_1715.method_9561(var1.field_2994);
      int var9 = class_1715.method_9561(var1.field_2995 + 1.0D);
      int var10 = class_1715.method_9561(var1.field_2996);
      int var11 = (int)(var3 + 16.0F);
      int var12 = var8 - var11;
      int var13 = var9 - var11;
      int var14 = var10 - var11;
      int var15 = var8 + var11;
      int var16 = var9 + var11;
      int var17 = var10 + var11;
      class_1049 var10000 = new class_1049;
      var10000.method_5949(this, var12, var13, var14, var15, var16, var17, 0);
      class_1049 var18 = var10000;
      class_1290 var20 = new class_1290;
      var20.method_6752(var18, var4, var5, var6, var7);
      class_1289 var19 = var20.method_6753(var1, var2, var3);
      this.field_1829.method_8333();
      return var19;
   }

   // $FF: renamed from: a (sa, int, int, int, float, boolean, boolean, boolean, boolean) jK
   public class_1289 method_2168(class_689 var1, int var2, int var3, int var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      String[] var10001 = field_1840;
      this.field_1829.method_8332("pathfind");
      int var10 = class_1715.method_9561(var1.field_2994);
      int var11 = class_1715.method_9561(var1.field_2995);
      int var12 = class_1715.method_9561(var1.field_2996);
      int var13 = (int)(var5 + 8.0F);
      int var14 = var10 - var13;
      int var15 = var11 - var13;
      int var16 = var12 - var13;
      int var17 = var10 + var13;
      int var18 = var11 + var13;
      int var19 = var12 + var13;
      class_1049 var10000 = new class_1049;
      var10000.method_5949(this, var14, var15, var16, var17, var18, var19, 0);
      class_1049 var20 = var10000;
      class_1290 var22 = new class_1290;
      var22.method_6752(var20, var6, var7, var8, var9);
      class_1289 var21 = var22.method_6754(var1, var2, var3, var4, var5);
      this.field_1829.method_8333();
      return var21;
   }

   // $FF: renamed from: e (int, int, int, int) int
   public int method_38(int var1, int var2, int var3, int var4) {
      return this.getBlock(var1, var2, var3).method_2499(this, var1, var2, var3, var4);
   }

   // $FF: renamed from: u (int, int, int) int
   public int method_2169(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (int, int, int, int) boolean
   public boolean method_2170(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            var10000 = this.method_2171(var1, var2, var3, var4);
            if(var5 == null) {
               return (boolean)var10000;
            }

            if(var10000 > 0) {
               break label32;
            }
         } catch (class_643 var6) {
            throw method_2225(var6);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: g (int, int, int, int) int
   public int method_2171(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: v (int, int, int) boolean
   public boolean method_2172(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: w (int, int, int) int
   public int method_2173(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa, double) yz
   public class_792 method_2174(class_689 var1, double var2) {
      return this.method_2175(var1.field_2994, var1.field_2995, var1.field_2996, var2);
   }

   // $FF: renamed from: a (double, double, double, double) yz
   public class_792 method_2175(double param1, double param3, double param5, double param7) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sa, double) yz
   public class_792 method_2176(class_689 var1, double var2) {
      return this.method_2177(var1.field_2994, var1.field_2995, var1.field_2996, var2);
   }

   // $FF: renamed from: b (double, double, double, double) yz
   public class_792 method_2177(double param1, double param3, double param5, double param7) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String) yz
   public class_792 method_2178(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.util.UUID) yz
   public class_792 method_2179(UUID param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: F () void
   public void method_2180() {}

   // $FF: renamed from: G () void
   public void method_2181() {
      this.field_1823.method_126();
   }

   // $FF: renamed from: a (long) void
   public void method_2182(long var1) {
      this.field_1824.method_6848(var1);
   }

   // $FF: renamed from: H () long
   public long method_2183() {
      return this.field_1824.method_6836();
   }

   // $FF: renamed from: I () long
   public long method_2184() {
      return this.field_1824.method_6840();
   }

   // $FF: renamed from: J () long
   public long method_2185() {
      return this.field_1824.method_6841();
   }

   // $FF: renamed from: b (long) void
   public void method_2186(long var1) {
      this.field_1824.method_6849(var1);
   }

   // $FF: renamed from: K () vF
   public class_1661 method_2187() {
      class_1661 var10000 = new class_1661;
      var10000.method_9151(this.field_1824.method_6837(), this.field_1824.method_6838(), this.field_1824.method_6839());
      return var10000;
   }

   // $FF: renamed from: x (int, int, int) void
   public void method_2188(int var1, int var2, int var3) {
      this.field_1824.method_6850(var1, var2, var3);
   }

   // $FF: renamed from: h (sa) void
   public void method_2189(class_689 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (yz, int, int, int) boolean
   public boolean method_2190(class_792 var1, int var2, int var3, int var4) {
      return true;
   }

   // $FF: renamed from: a (sa, byte) void
   public void method_2191(class_689 var1, byte var2) {}

   // $FF: renamed from: L () gG
   public class_25 method_2192() {
      return this.field_1822;
   }

   // $FF: renamed from: c (int, int, int, aji, int, int) void
   public void method_2193(int var1, int var2, int var3, aji var4, int var5, int var6) {
      var4.method_2511(this, var1, var2, var3, var5, var6);
   }

   // $FF: renamed from: M () j9
   public class_29 method_2194() {
      return this.field_1823;
   }

   // $FF: renamed from: N () jY
   public class_1303 method_2195() {
      return this.field_1824;
   }

   // $FF: renamed from: O () dh
   public class_1038 method_2196() {
      return this.field_1824.method_6874();
   }

   // $FF: renamed from: c () void
   public void method_2197() {}

   // $FF: renamed from: h (float) float
   public float method_2198(float var1) {
      return (this.field_1815 + (this.field_1816 - this.field_1815) * var1) * this.method_2200(var1);
   }

   // $FF: renamed from: i (float) void
   public void method_2199(float var1) {
      this.field_1815 = var1;
      this.field_1816 = var1;
   }

   // $FF: renamed from: j (float) float
   public float method_2200(float var1) {
      return this.field_1813 + (this.field_1814 - this.field_1813) * var1;
   }

   // $FF: renamed from: k (float) void
   public void method_2201(float var1) {
      this.field_1813 = var1;
      this.field_1814 = var1;
   }

   // $FF: renamed from: P () boolean
   public boolean method_2202() {
      String[] var1 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            double var3;
            var10000 = (var3 = (double)this.method_2198(1.0F) - 0.9D) == 0.0D?0:(var3 < 0.0D?-1:1);
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 > 0) {
               break label32;
            }
         } catch (class_643 var2) {
            throw method_2225(var2);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: Q () boolean
   public boolean method_2203() {
      String[] var1 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            double var3;
            var10000 = (var3 = (double)this.method_2200(1.0F) - 0.2D) == 0.0D?0:(var3 < 0.0D?-1:1);
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 > 0) {
               break label32;
            }
         } catch (class_643 var2) {
            throw method_2225(var2);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: y (int, int, int) boolean
   public boolean method_2204(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: z (int, int, int) boolean
   public boolean method_2205(int var1, int var2, int var3) {
      class_985 var4 = this.method_35(var1, var3);
      return var4.method_5709();
   }

   // $FF: renamed from: a (java.lang.String, jO) void
   public void method_2206(String var1, class_1293 var2) {
      this.field_1826.method_7080(var1, var2);
   }

   // $FF: renamed from: a (java.lang.Class, java.lang.String) jO
   public class_1293 method_2207(Class var1, String var2) {
      return this.field_1826.method_7079(var1, var2);
   }

   // $FF: renamed from: b (java.lang.String) int
   public int method_2208(String var1) {
      return this.field_1826.method_7084(var1);
   }

   // $FF: renamed from: b (int, int, int, int, int) void
   public void method_2209(int var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;

      while(var7 < this.field_1821.size()) {
         ((class_21)this.field_1821.get(var7)).method_79(var1, var2, var3, var4, var5);
         ++var7;
         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (int, int, int, int, int) void
   public void method_2210(int var1, int var2, int var3, int var4, int var5) {
      this.method_2211((class_792)null, var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (yz, int, int, int, int, int) void
   public void method_2211(class_792 var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();

      try {
         int var8 = 0;

         while(var8 < this.field_1821.size()) {
            try {
               ((class_21)this.field_1821.get(var8)).method_80(var1, var2, var3, var4, var5, var6);
               ++var8;
               if(var7 == null || var7 == null) {
                  break;
               }
            } catch (Throwable var12) {
               throw method_2225(var12);
            }
         }

      } catch (Throwable var13) {
         String[] var11 = field_1840;
         class_1346 var9 = class_1346.method_7153(var13, "Playing level event");
         class_1605 var10 = var9.method_7150("Level event being played");
         var10.method_8778("Block coordinates", class_1605.method_8776(var3, var4, var5));
         var10.method_8778("Event source", var1);
         var10.method_8778("Event type", Integer.valueOf(var2));
         var10.method_8778("Event data", Integer.valueOf(var6));
         class_643 var10000 = new class_643;
         var10000.method_3525(var9);
         throw var10000;
      }
   }

   // $FF: renamed from: R () int
   public int method_36() {
      return 256;
   }

   // $FF: renamed from: S () int
   public int method_2212() {
      String[] var1 = class_752.method_4253();

      short var10000;
      label32: {
         try {
            var10000 = this.field_1820.field_5736;
            if(var1 == null) {
               return var10000;
            }

            if(this.field_1820.field_5736) {
               break label32;
            }
         } catch (class_643 var2) {
            throw method_2225(var2);
         }

         var10000 = 256;
         return var10000;
      }

      var10000 = 128;
      return var10000;
   }

   // $FF: renamed from: A (int, int, int) java.util.Random
   public Random method_2213(int var1, int var2, int var3) {
      long var4 = (long)var1 * 341873128712L + (long)var2 * 132897987541L + this.method_2195().method_6836() + (long)var3;
      this.field_1819.setSeed(var4);
      return this.field_1819;
   }

   // $FF: renamed from: b (java.lang.String, int, int, int) dd
   public class_1034 method_2214(String var1, int var2, int var3, int var4) {
      return this.method_2192().method_112(this, var1, var2, var3, var4);
   }

   // $FF: renamed from: T () boolean
   public boolean method_37() {
      return false;
   }

   // $FF: renamed from: U () double
   public double method_2215() {
      double var10000;
      try {
         if(this.field_1824.method_6868() == class_1046.field_5528) {
            var10000 = 0.0D;
            return var10000;
         }
      } catch (class_643 var1) {
         throw method_2225(var1);
      }

      var10000 = 63.0D;
      return var10000;
   }

   // $FF: renamed from: a (kj) tR
   public class_1605 method_2216(class_1346 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (int, int, int, int, int) void
   public void method_2217(int var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;

      while(var7 < this.field_1821.size()) {
         class_21 var8 = (class_21)this.field_1821.get(var7);
         var8.method_81(var1, var2, var3, var4, var5);
         ++var7;
         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: V () java.util.Calendar
   public Calendar method_2218() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (double, double, double, double, double, double, ro) void
   public void method_2219(double var1, double var3, double var5, double var7, double var9, double var11, class_1583 var13) {}

   // $FF: renamed from: W () kl
   public class_1348 method_2220() {
      return this.field_1831;
   }

   // $FF: renamed from: f (int, int, int, aji) void
   public void method_2221(int param1, int param2, int param3, aji param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (double, double, double) float
   public float method_2222(double var1, double var3, double var5) {
      return this.method_2223(class_1715.method_9561(var1), class_1715.method_9561(var3), class_1715.method_9561(var5));
   }

   // $FF: renamed from: B (int, int, int) float
   public float method_2223(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: X () void
   public void method_2224() {
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_1821.iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         class_21 var3 = (class_21)var2.next();
         var3.method_82();
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_2225(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2226() {
      // $FF: Couldn't be decompiled
   }
}

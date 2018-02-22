import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: dk
public class class_354 extends ahb {

   // $FF: renamed from: N org.apache.logging.log4j.Logger
   private static final Logger field_1849;
   // $FF: renamed from: O net.minecraft.server.MinecraftServer
   private final MinecraftServer field_1850;
   // $FF: renamed from: P ub
   private final class_1657 field_1851;
   // $FF: renamed from: Q ue
   private final class_1660 field_1852;
   // $FF: renamed from: R java.util.Set
   private Set field_1853;
   // $FF: renamed from: S java.util.TreeSet
   private TreeSet field_1854;
   // $FF: renamed from: T ug
   public class_1665 field_1855;
   // $FF: renamed from: U boolean
   public boolean field_1856;
   // $FF: renamed from: V boolean
   private boolean field_1857;
   // $FF: renamed from: W int
   private int field_1858;
   // $FF: renamed from: X dw
   private final class_1048 field_1859;
   // $FF: renamed from: Y dv
   private final class_1047 field_1860;
   // $FF: renamed from: Z AW[]
   private class_659[] field_1861;
   // $FF: renamed from: aa int
   private int field_1862;
   // $FF: renamed from: ab vD[]
   private static final class_1652[] field_1863;
   // $FF: renamed from: ac java.util.List
   private List field_1864;
   // $FF: renamed from: ad vl
   private class_1706 field_1865;
   // $FF: renamed from: ae java.lang.String
   private static final String field_1866;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] field_1867;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, j9, java.lang.String, int, dt, qi) void
   public void method_2239(MinecraftServer param1, class_29 param2, String param3, int param4, class_1045 param5, class_1535 param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_2139() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (as, int, int, int) vC
   public class_1653 method_2240(class_922 var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      List var6 = this.method_2192().method_111(var1, var2, var3, var4);
      String[] var5 = var10000;

      class_1653 var10;
      label28: {
         List var9;
         label27: {
            try {
               var9 = var6;
               if(var5 == null) {
                  break label27;
               }

               if(var6 == null) {
                  break label28;
               }
            } catch (IllegalStateException var8) {
               throw method_2260(var8);
            }

            var9 = var6;
         }

         try {
            if(!var9.isEmpty()) {
               var10 = (class_1653)class_1725.method_9638(this.field_1819, var6);
               return var10;
            }
         } catch (IllegalStateException var7) {
            throw method_2260(var7);
         }
      }

      var10 = null;
      return var10;
   }

   // $FF: renamed from: c () void
   public void method_2197() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   protected void method_2241() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i () void
   private void method_2242() {
      this.field_1824.method_6863(0);
      this.field_1824.method_6861(false);
      this.field_1824.method_6859(0);
      this.field_1824.method_6857(false);
   }

   // $FF: renamed from: k () boolean
   public boolean method_2243() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () void
   public void method_2046() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   protected void method_2145() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int, aji) boolean
   public boolean method_2066(int var1, int var2, int var3, aji var4) {
      class_1050 var10000 = new class_1050;
      var10000.method_5952(var1, var2, var3, var4);
      class_1050 var5 = var10000;
      return this.field_1864.contains(var5);
   }

   // $FF: renamed from: a (int, int, int, aji, int) void
   public void method_2110(int var1, int var2, int var3, aji var4, int var5) {
      this.method_2111(var1, var2, var3, var4, var5, 0);
   }

   // $FF: renamed from: a (int, int, int, aji, int, int) void
   public void method_2111(int param1, int param2, int param3, aji param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, aji, int, int) void
   public void method_2112(int param1, int param2, int param3, aji param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () void
   public void method_2113() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: l () void
   public void method_2244() {
      this.field_1858 = 0;
   }

   // $FF: renamed from: a (boolean) boolean
   public boolean method_2153(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (gI, boolean) java.util.List
   public List method_2154(class_1069 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa, boolean) void
   public void method_2116(class_689 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j () gG
   protected class_25 method_2044() {
      class_26 var1 = this.field_1823.method_127(this.field_1820);
      class_1665 var10001 = new class_1665;
      var10001.method_9187(this, var1, this.field_1820.method_6164());
      this.field_1855 = var10001;
      return this.field_1855;
   }

   // $FF: renamed from: d (int, int, int, int, int, int) java.util.List
   public List method_2245(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (yz, int, int, int) boolean
   public boolean method_2190(class_792 var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();

      boolean var10000;
      label32: {
         try {
            var10000 = this.field_1850.method_2394(this, var2, var3, var4, var1);
            if(var5 == null) {
               return var10000;
            }

            if(!var10000) {
               break label32;
            }
         } catch (IllegalStateException var6) {
            throw method_2260(var6);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   // $FF: renamed from: a (dt) void
   protected void method_2045(class_1045 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (dt) void
   protected void method_2246(class_1045 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: m () void
   protected void method_2247() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: n () vF
   public class_1661 method_2248() {
      return this.field_1820.method_6175();
   }

   // $FF: renamed from: b (boolean, vu) void
   public void method_2249(boolean param1, class_81 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: q () void
   public void method_2250() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   protected void method_2251() {
      this.method_2181();
      this.field_1823.method_128(this.field_1824, this.field_1850.method_2383().method_8922());
      this.field_1826.method_7081();
   }

   // $FF: renamed from: a (sa) void
   protected void method_2090(class_689 var1) {
      super.method_2090(var1);
      this.field_1865.method_9478(var1.method_3845(), var1);
      String[] var10000 = class_752.method_4253();
      class_689[] var3 = var1.method_3955();
      String[] var2 = var10000;
      if(var3 != null) {
         int var4 = 0;

         while(var4 < var3.length) {
            this.field_1865.method_9478(var3[var4].method_3845(), var3[var4]);
            ++var4;
            if(var2 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: b (sa) void
   protected void method_2091(class_689 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_2091(var1);
      this.field_1865.method_9481(var1.method_3845());
      class_689[] var3 = var1.method_3955();
      String[] var2 = var10000;
      if(var3 != null) {
         int var4 = 0;

         while(var4 < var3.length) {
            this.field_1865.method_9481(var3[var4].method_3845());
            ++var4;
            if(var2 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: a (int) sa
   public class_689 method_2160(int var1) {
      return (class_689)this.field_1865.method_9475(var1);
   }

   // $FF: renamed from: c (sa) boolean
   public boolean method_2088(class_689 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa, byte) void
   public void method_2191(class_689 var1, byte var2) {
      class_1657 var10000 = this.method_2256();
      class_283 var10002 = new class_283;
      var10002.method_1635(var1, var2);
      var10000.method_9120(var1, var10002);
   }

   // $FF: renamed from: a (sa, double, double, double, float, boolean, boolean) df
   public class_1036 method_2126(class_689 param1, double param2, double param4, double param6, float param8, boolean param9, boolean param10) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int, int, aji, int, int) void
   public void method_2193(int var1, int var2, int var3, aji var4, int var5, int var6) {
      String[] var10000 = class_752.method_4253();
      class_1033 var10001 = new class_1033;
      var10001.method_5846(var1, var2, var3, var4, var5, var6);
      class_1033 var8 = var10001;
      String[] var7 = var10000;
      Iterator var9 = this.field_1861[this.field_1862].iterator();

      while(true) {
         if(!var9.hasNext()) {
            this.field_1861[this.field_1862].add(var8);
            break;
         }

         class_1033 var10 = (class_1033)var9.next();
         if(var10.equals(var8)) {
            if(var7 != null) {
               return;
            }
            break;
         }
      }

   }

   // $FF: renamed from: r () void
   private void method_2252() {
      String[] var1 = class_752.method_4253();

      do {
         boolean var10000 = this.field_1861[this.field_1862].isEmpty();

         int var2;
         label45:
         while(true) {
            if(var10000) {
               return;
            }

            var2 = this.field_1862;
            this.field_1862 ^= 1;
            Iterator var3 = this.field_1861[var2].iterator();

            while(true) {
               if(!var3.hasNext()) {
                  break label45;
               }

               class_1033 var4 = (class_1033)var3.next();

               label40: {
                  class_354 var6;
                  label55: {
                     try {
                        var6 = this;
                        if(var1 == null) {
                           break label55;
                        }

                        var10000 = this.method_2253(var4);
                        if(var1 == null) {
                           break;
                        }
                     } catch (IllegalStateException var5) {
                        throw method_2260(var5);
                     }

                     if(!var10000) {
                        break label40;
                     }

                     var6 = this;
                  }

                  class_1627 var7 = var6.field_1850.method_2383();
                  double var10001 = (double)var4.method_5847();
                  double var10002 = (double)var4.method_5848();
                  double var10003 = (double)var4.method_5849();
                  int var10005 = this.field_1820.field_5738;
                  class_297 var10006 = new class_297;
                  var10006.method_1699(var4.method_5847(), var4.method_5848(), var4.method_5849(), var4.method_5852(), var4.method_5850(), var4.method_5851());
                  var7.method_8903(var10001, var10002, var10003, 64.0D, var10005, var10006);
               }

               if(var1 == null) {
                  break label45;
               }
            }
         }

         this.field_1861[var2].clear();
      } while(var1 != null);

   }

   // $FF: renamed from: b (dc) boolean
   private boolean method_2253(class_1033 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: s () void
   public void method_2254() {
      this.field_1823.method_131();
   }

   // $FF: renamed from: o () void
   protected void method_2141() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: p () int
   protected int method_2143() {
      return this.field_1850.method_2383().method_8920();
   }

   // $FF: renamed from: t () net.minecraft.server.MinecraftServer
   public MinecraftServer method_2255() {
      return this.field_1850;
   }

   // $FF: renamed from: u () ub
   public class_1657 method_2256() {
      return this.field_1851;
   }

   // $FF: renamed from: E () ue
   public class_1660 method_2257() {
      return this.field_1852;
   }

   // $FF: renamed from: Y () dw
   public class_1048 method_2258() {
      return this.field_1859;
   }

   // $FF: renamed from: b (java.lang.String, double, double, double, int, double, double, double, double) void
   public void method_2259(String param1, double param2, double param4, double param6, int param8, double param9, double param11, double param13, double param15) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_2226() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_2260(Throwable var0) {
      return var0;
   }
}

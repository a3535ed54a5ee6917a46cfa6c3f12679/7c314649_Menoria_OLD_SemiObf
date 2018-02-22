package net.minecraft.server;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.net.Proxy;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.apache.logging.log4j.Logger;

public abstract class MinecraftServer implements class_20, Runnable, class_75 {

   // $FF: renamed from: i org.apache.logging.log4j.Logger
   private static final Logger field_1914;
   // $FF: renamed from: a java.io.File
   public static final File field_1915;
   // $FF: renamed from: j net.minecraft.server.MinecraftServer
   private static MinecraftServer field_1916;
   // $FF: renamed from: k j_
   private final class_30 field_1917;
   // $FF: renamed from: l vS
   private final class_1683 field_1918;
   // $FF: renamed from: m java.io.File
   private final File field_1919;
   // $FF: renamed from: n java.util.List
   private final List field_1920;
   // $FF: renamed from: o a4
   private final class_14 field_1921;
   // $FF: renamed from: b qi
   public final class_1535 field_1922;
   // $FF: renamed from: p uo
   private final class_1680 field_1923;
   // $FF: renamed from: q tS
   private final class_1606 field_1924;
   // $FF: renamed from: r java.util.Random
   private final Random field_1925;
   // $FF: renamed from: t int
   private int field_1926;
   // $FF: renamed from: c dk[]
   public class_354[] field_1927;
   // $FF: renamed from: u uJ
   private class_1627 field_1928;
   // $FF: renamed from: v boolean
   private boolean field_1929;
   // $FF: renamed from: w boolean
   private boolean field_1930;
   // $FF: renamed from: x int
   private int field_1931;
   // $FF: renamed from: d java.net.Proxy
   protected final Proxy field_1932;
   // $FF: renamed from: e java.lang.String
   public String field_1933;
   // $FF: renamed from: f int
   public int field_1934;
   // $FF: renamed from: y boolean
   private boolean field_1935;
   // $FF: renamed from: z boolean
   private boolean field_1936;
   // $FF: renamed from: A boolean
   private boolean field_1937;
   // $FF: renamed from: B boolean
   private boolean field_1938;
   // $FF: renamed from: C boolean
   private boolean field_1939;
   // $FF: renamed from: D java.lang.String
   private String field_1940;
   // $FF: renamed from: E int
   private int field_1941;
   // $FF: renamed from: F int
   private int field_1942;
   // $FF: renamed from: g long[]
   public final long[] field_1943;
   // $FF: renamed from: h long[][]
   public long[][] field_1944;
   // $FF: renamed from: G java.security.KeyPair
   private KeyPair field_1945;
   // $FF: renamed from: H java.lang.String
   private String field_1946;
   // $FF: renamed from: I java.lang.String
   private String field_1947;
   // $FF: renamed from: J java.lang.String
   private String field_1948;
   // $FF: renamed from: K boolean
   private boolean field_1949;
   // $FF: renamed from: L boolean
   private boolean field_1950;
   // $FF: renamed from: M boolean
   private boolean field_1951;
   // $FF: renamed from: N java.lang.String
   private String field_1952;
   // $FF: renamed from: O boolean
   private boolean field_1953;
   // $FF: renamed from: P long
   private long field_1954;
   // $FF: renamed from: Q java.lang.String
   private String field_1955;
   // $FF: renamed from: R boolean
   private boolean field_1956;
   // $FF: renamed from: S boolean
   private boolean field_1957;
   // $FF: renamed from: T com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
   private final YggdrasilAuthenticationService field_1958;
   // $FF: renamed from: U com.mojang.authlib.minecraft.MinecraftSessionService
   private final MinecraftSessionService field_1959;
   // $FF: renamed from: V long
   private long field_1960;
   // $FF: renamed from: W com.mojang.authlib.GameProfileRepository
   private final GameProfileRepository field_1961;
   // $FF: renamed from: X uA
   private final class_1618 field_1962;
   private static final String __OBFID;
   // $FF: renamed from: Y java.lang.String
   private static String field_1963;
   // $FF: renamed from: s java.lang.String[]
   private static final String[] field_1964;


   // $FF: renamed from: <init> (java.io.File, java.net.Proxy) void
   public void method_2311(File var1, Proxy var2) {
      super();
      String var10000 = method_2410();
      class_1683 var10002 = new class_1683;
      String[] var10004 = field_1964;
      var10002.method_9265("server", this, method_2397());
      this.field_1918 = var10002;
      this.field_1920 = new ArrayList();
      class_1535 var8 = new class_1535;
      var8.method_8330();
      this.field_1922 = var8;
      String var3 = var10000;
      class_1606 var10001 = new class_1606;
      var10001.method_8787();
      this.field_1924 = var10001;
      this.field_1925 = new Random();
      this.field_1926 = -1;
      this.field_1929 = true;
      this.field_1942 = 0;
      this.field_1943 = new long[100];
      this.field_1952 = "";
      this.field_1960 = 0L;
      class_1618 var5 = new class_1618;
      var5.method_8833(this, field_1915);
      this.field_1962 = var5;
      field_1916 = this;
      this.field_1932 = var2;
      this.field_1919 = var1;
      class_1680 var6 = new class_1680;
      var6.method_9251(this);
      this.field_1923 = var6;
      class_669 var7 = new class_669;
      var7.method_3625();
      this.field_1921 = var7;
      class_1302 var9 = new class_1302;
      var9.method_6819(var1);
      this.field_1917 = var9;
      YggdrasilAuthenticationService var10 = new YggdrasilAuthenticationService;
      var10.method_1431(var2, UUID.randomUUID().toString());
      this.field_1958 = var10;
      this.field_1959 = this.field_1958.createMinecraftSessionService();
      this.field_1961 = this.field_1958.createProfileRepository();
      if(var3 != null) {
         int var4 = class_689.method_3976();
         ++var4;
         class_689.method_3975(var4);
      }

   }

   // $FF: renamed from: e () boolean
   protected abstract boolean method_2312();

   // $FF: renamed from: a (java.lang.String) void
   protected void method_2313(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String) void
   protected synchronized void method_2314(String var1) {
      this.field_1955 = var1;
   }

   // $FF: renamed from: f () java.lang.String
   public synchronized String method_2315() {
      return this.field_1955;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, long, du, java.lang.String) void
   protected void method_2316(String param1, String param2, long param3, class_1046 param5, String param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   protected void method_2317() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () boolean
   public abstract boolean method_2318();

   // $FF: renamed from: i () G
   public abstract class_94 method_2319();

   // $FF: renamed from: j () aq
   public abstract class_918 method_2320();

   // $FF: renamed from: k () boolean
   public abstract boolean method_2321();

   // $FF: renamed from: l () int
   public abstract int method_2322();

   // $FF: renamed from: m () boolean
   public abstract boolean method_2323();

   // $FF: renamed from: a_ (java.lang.String, int) void
   protected void method_2324(String var1, int var2) {
      this.field_1933 = var1;
      this.field_1934 = var2;
      Logger var10000 = field_1914;
      StringBuilder var10001 = (new StringBuilder()).append(var1);
      String[] var10002 = field_1964;
      var10000.info(var10001.append(": ").append(var2).append("%").toString());
   }

   // $FF: renamed from: n () void
   protected void method_2325() {
      this.field_1933 = null;
      this.field_1934 = 0;
   }

   // $FF: renamed from: a (boolean) void
   protected void method_2326(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: o () void
   public void method_2327() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: q () boolean
   public boolean method_2328() {
      return this.field_1929;
   }

   // $FF: renamed from: r () void
   public void method_2329() {
      this.field_1929 = false;
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (tS) void
   private void method_2330(class_1606 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: s () java.io.File
   protected File method_2331() {
      return new File(".");
   }

   // $FF: renamed from: a (kj) void
   protected void method_2332(class_1346 var1) {}

   // $FF: renamed from: t () void
   protected void method_2333() {}

   // $FF: renamed from: u () void
   public void method_2334() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: v () void
   public void method_2335() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: w () boolean
   public boolean method_2336() {
      return true;
   }

   // $FF: renamed from: x () void
   public void method_2337() {
      class_653 var10000 = new class_653;
      String[] var10003 = field_1964;
      var10000.method_3552(this, "Server thread");
      var10000.start();
   }

   // $FF: renamed from: d (java.lang.String) java.io.File
   public File method_2338(String var1) {
      return new File(this.method_2331(), var1);
   }

   // $FF: renamed from: f (java.lang.String) void
   public void method_2339(String var1) {
      field_1914.warn(var1);
   }

   // $FF: renamed from: a (int) dk
   public class_354 method_2340(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: B () java.lang.String
   public String method_2341() {
      String[] var10000 = field_1964;
      return "1.7.10";
   }

   // $FF: renamed from: C () int
   public int method_2342() {
      return this.field_1928.method_8915();
   }

   // $FF: renamed from: D () int
   public int method_2343() {
      return this.field_1928.method_8916();
   }

   // $FF: renamed from: E () java.lang.String[]
   public String[] method_2344() {
      return this.field_1928.method_8892();
   }

   // $FF: renamed from: F () com.mojang.authlib.GameProfile[]
   public GameProfile[] method_2345() {
      return this.field_1928.method_8893();
   }

   public String getServerModName() {
      String[] var10000 = field_1964;
      return "vanilla";
   }

   // $FF: renamed from: b (kj) kj
   public class_1346 method_2346(class_1346 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bh, java.lang.String) java.util.List
   public List method_2347(class_20 param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: I () net.minecraft.server.MinecraftServer
   public static MinecraftServer method_2348() {
      return field_1916;
   }

   // $FF: renamed from: b_ () java.lang.String
   public String method_64() {
      String[] var10000 = field_1964;
      return "Server";
   }

   // $FF: renamed from: a (rV) void
   public void method_66(class_66 var1) {
      field_1914.info(var1.method_342());
   }

   // $FF: renamed from: a (int, java.lang.String) boolean
   public boolean method_67(int var1, String var2) {
      return true;
   }

   // $FF: renamed from: J () a4
   public class_14 method_2349() {
      return this.field_1921;
   }

   // $FF: renamed from: K () java.security.KeyPair
   public KeyPair method_2350() {
      return this.field_1945;
   }

   // $FF: renamed from: M () java.lang.String
   public String method_2351() {
      return this.field_1946;
   }

   // $FF: renamed from: j (java.lang.String) void
   public void method_2352(String var1) {
      this.field_1946 = var1;
   }

   // $FF: renamed from: N () boolean
   public boolean method_2353() {
      boolean var10000;
      try {
         if(this.field_1946 != null) {
            var10000 = true;
            return var10000;
         }
      } catch (class_643 var1) {
         throw method_2411(var1);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: O () java.lang.String
   public String method_2354() {
      return this.field_1947;
   }

   // $FF: renamed from: k (java.lang.String) void
   public void method_2355(String var1) {
      this.field_1947 = var1;
   }

   // $FF: renamed from: l (java.lang.String) void
   public void method_2356(String var1) {
      this.field_1948 = var1;
   }

   // $FF: renamed from: P () java.lang.String
   public String method_2357() {
      return this.field_1948;
   }

   // $FF: renamed from: a (java.security.KeyPair) void
   public void method_2358(KeyPair var1) {
      this.field_1945 = var1;
   }

   // $FF: renamed from: a (aq) void
   public void method_2359(class_918 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: Q () boolean
   protected boolean method_2360() {
      return true;
   }

   // $FF: renamed from: R () boolean
   public boolean method_2361() {
      return this.field_1949;
   }

   // $FF: renamed from: b (boolean) void
   public void method_2362(boolean var1) {
      this.field_1949 = var1;
   }

   // $FF: renamed from: c (boolean) void
   public void method_2363(boolean var1) {
      this.field_1950 = var1;
   }

   // $FF: renamed from: S () j_
   public class_30 method_2364() {
      return this.field_1917;
   }

   // $FF: renamed from: U () void
   public void method_2365() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: V () java.lang.String
   public String method_2366() {
      return this.field_1952;
   }

   // $FF: renamed from: a (vS) void
   public void method_376(class_1683 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (vS) void
   public void method_377(class_1683 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: W () boolean
   public boolean method_378() {
      return true;
   }

   // $FF: renamed from: X () boolean
   public abstract boolean method_2367();

   // $FF: renamed from: Y () boolean
   public boolean method_2368() {
      return this.field_1935;
   }

   // $FF: renamed from: d (boolean) void
   public void method_2369(boolean var1) {
      this.field_1935 = var1;
   }

   // $FF: renamed from: Z () boolean
   public boolean method_2370() {
      return this.field_1936;
   }

   // $FF: renamed from: e (boolean) void
   public void method_2371(boolean var1) {
      this.field_1936 = var1;
   }

   // $FF: renamed from: aa () boolean
   public boolean method_2372() {
      return this.field_1937;
   }

   // $FF: renamed from: f (boolean) void
   public void method_2373(boolean var1) {
      this.field_1937 = var1;
   }

   // $FF: renamed from: ab () boolean
   public boolean method_2374() {
      return this.field_1938;
   }

   // $FF: renamed from: g (boolean) void
   public void method_2375(boolean var1) {
      this.field_1938 = var1;
   }

   // $FF: renamed from: ac () boolean
   public boolean method_2376() {
      return this.field_1939;
   }

   // $FF: renamed from: h (boolean) void
   public void method_2377(boolean var1) {
      this.field_1939 = var1;
   }

   // $FF: renamed from: ad () boolean
   public abstract boolean method_2378();

   // $FF: renamed from: ae () java.lang.String
   public String method_2379() {
      return this.field_1940;
   }

   // $FF: renamed from: n (java.lang.String) void
   public void method_2380(String var1) {
      this.field_1940 = var1;
   }

   // $FF: renamed from: af () int
   public int method_2381() {
      return this.field_1941;
   }

   // $FF: renamed from: c (int) void
   public void method_2382(int var1) {
      this.field_1941 = var1;
   }

   // $FF: renamed from: ah () uJ
   public class_1627 method_2383() {
      return this.field_1928;
   }

   // $FF: renamed from: a (uJ) void
   public void method_2384(class_1627 var1) {
      this.field_1928 = var1;
   }

   // $FF: renamed from: a (G) void
   public void method_2385(class_94 var1) {
      String var10000 = method_2410();
      int var3 = 0;
      String var2 = var10000;

      while(var3 < this.field_1927.length) {
         method_2348().field_1927[var3].method_2195().method_6866(var1);
         ++var3;
         if(var2 != null) {
            break;
         }
      }

   }

   // $FF: renamed from: ai () uo
   public class_1680 method_2386() {
      return this.field_1923;
   }

   // $FF: renamed from: aj () boolean
   public boolean method_2387() {
      return this.field_1953;
   }

   // $FF: renamed from: ak () boolean
   public boolean method_2388() {
      return false;
   }

   // $FF: renamed from: a (G, boolean) java.lang.String
   public abstract String method_2389(class_94 var1, boolean var2);

   // $FF: renamed from: al () int
   public int method_2390() {
      return this.field_1931;
   }

   // $FF: renamed from: am () void
   public void method_2391() {
      this.field_1956 = true;
   }

   // $FF: renamed from: an () vS
   public class_1683 method_2392() {
      return this.field_1918;
   }

   // $FF: renamed from: f_ () vF
   public class_1661 method_68() {
      class_1661 var10000 = new class_1661;
      var10000.method_9151(0, 0, 0);
      return var10000;
   }

   // $FF: renamed from: d () ahb
   public ahb method_69() {
      return this.field_1927[0];
   }

   // $FF: renamed from: ao () int
   public int method_2393() {
      return 16;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz) boolean
   public boolean method_2394(ahb var1, int var2, int var3, int var4, class_792 var5) {
      return false;
   }

   // $FF: renamed from: ap () boolean
   public boolean method_2395() {
      return this.field_1957;
   }

   // $FF: renamed from: aq () java.net.Proxy
   public Proxy method_2396() {
      return this.field_1932;
   }

   // $FF: renamed from: ar () long
   public static long method_2397() {
      return System.currentTimeMillis();
   }

   // $FF: renamed from: as () int
   public int method_2398() {
      return this.field_1942;
   }

   // $FF: renamed from: d (int) void
   public void method_2399(int var1) {
      this.field_1942 = var1;
   }

   // $FF: renamed from: c_ () rV
   public class_66 method_65() {
      class_1082 var10000 = new class_1082;
      var10000.method_6134(this.method_64());
      return var10000;
   }

   // $FF: renamed from: at () boolean
   public boolean method_2400() {
      return true;
   }

   // $FF: renamed from: av () com.mojang.authlib.minecraft.MinecraftSessionService
   public MinecraftSessionService method_2401() {
      return this.field_1959;
   }

   // $FF: renamed from: aw () com.mojang.authlib.GameProfileRepository
   public GameProfileRepository method_2402() {
      return this.field_1961;
   }

   // $FF: renamed from: ax () uA
   public class_1618 method_2403() {
      return this.field_1962;
   }

   // $FF: renamed from: ay () tS
   public class_1606 method_2404() {
      return this.field_1924;
   }

   // $FF: renamed from: az () void
   public void method_2405() {
      this.field_1960 = 0L;
   }

   // $FF: renamed from: aA () org.apache.logging.log4j.Logger
   static Logger method_2406() {
      return field_1914;
   }

   // $FF: renamed from: a (net.minecraft.server.MinecraftServer) uJ
   static class_1627 method_2407(MinecraftServer var0) {
      return var0.field_1928;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2408() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.String) void
   public static void method_2409(String var0) {
      field_1963 = var0;
   }

   // $FF: renamed from: a () java.lang.String
   public static String method_2410() {
      return field_1963;
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_2411(Throwable var0) {
      return var0;
   }
}

import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: xi
public class class_793 extends class_792 implements class_16 {

   // $FF: renamed from: a1 org.apache.logging.log4j.Logger
   private static final Logger field_3652;
   // $FF: renamed from: a2 java.lang.String
   private String field_3653;
   // $FF: renamed from: a3 us
   public class_1684 field_3654;
   // $FF: renamed from: a4 net.minecraft.server.MinecraftServer
   public final MinecraftServer field_3655;
   // $FF: renamed from: a5 ui
   public final class_1668 field_3656;
   // $FF: renamed from: a6 double
   public double field_3657;
   // $FF: renamed from: a7 double
   public double field_3658;
   // $FF: renamed from: a8 java.util.List
   public final List field_3659;
   // $FF: renamed from: a9 java.util.List
   private final List field_3660;
   // $FF: renamed from: a_ ve
   private final class_1700 field_3661;
   // $FF: renamed from: bL float
   private float field_3662;
   // $FF: renamed from: bM float
   private float field_3663;
   // $FF: renamed from: bN int
   private int field_3664;
   // $FF: renamed from: bO boolean
   private boolean field_3665;
   // $FF: renamed from: bP int
   private int field_3666;
   // $FF: renamed from: bQ int
   private int field_3667;
   // $FF: renamed from: bR ay
   private class_932 field_3668;
   // $FF: renamed from: bS boolean
   private boolean field_3669;
   // $FF: renamed from: bT long
   private long field_3670;
   // $FF: renamed from: bU int
   private int field_3671;
   // $FF: renamed from: bV boolean
   public boolean field_3672;
   // $FF: renamed from: bW int
   public int field_3673;
   // $FF: renamed from: bX boolean
   public boolean field_3674;
   // $FF: renamed from: bY java.lang.String
   private static final String field_3675;
   // $FF: renamed from: fb java.lang.String[]
   private static final String[] field_3676;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, dk, com.mojang.authlib.GameProfile, ui) void
   public void method_4637(MinecraftServer param1, class_354 param2, GameProfile param3, class_1668 param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3676;
      var1.method_8667("playerGameType", this.field_3656.method_9200().method_443());
   }

   // $FF: renamed from: a (int) void
   public void method_4620(int var1) {
      super.method_4620(var1);
      this.field_3666 = -1;
   }

   // $FF: renamed from: a () void
   public void method_4638() {
      this.field_3619.method_3647(this);
   }

   // $FF: renamed from: e_ () void
   protected void method_4582() {
      this.field_3013 = 0.0F;
   }

   // $FF: renamed from: g () float
   public float method_3880() {
      return 1.62F;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_4639() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i () void
   protected void method_4640() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (vX) void
   public void method_4190(class_1691 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4583(class_792 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int) void
   public void method_3964(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (gi) void
   private void method_4641(class_580 var1) {
      String[] var2 = class_752.method_4253();

      class_580 var10000;
      label28: {
         try {
            var10000 = var1;
            if(var2 == null) {
               break label28;
            }

            if(var1 == null) {
               return;
            }
         } catch (class_643 var5) {
            throw method_4659(var5);
         }

         var10000 = var1;
      }

      class_250 var3 = var10000.method_3100();

      try {
         if(var3 != null) {
            this.field_3654.method_9291(var3);
         }
      } catch (class_643 var4) {
         throw method_4659(var4);
      }

   }

   // $FF: renamed from: a (sa, int) void
   public void method_4238(class_689 var1, int var2) {
      super.method_4238(var1, var2);
      this.field_3619.method_3650();
   }

   // $FF: renamed from: a (int, int, int) ax
   public class_931 method_4600(int var1, int var2, int var3) {
      class_931 var5 = super.method_4600(var1, var2, var3);
      String[] var4 = class_752.method_4253();

      class_931 var10000;
      label20: {
         try {
            var10000 = var5;
            if(var4 == null) {
               return var10000;
            }

            if(var5 != class_931.field_4744) {
               break label20;
            }
         } catch (class_643 var7) {
            throw method_4659(var7);
         }

         class_319 var8 = new class_319;
         var8.method_1808(this, var1, var2, var3);
         class_319 var6 = var8;
         this.method_4650().method_2256().method_9119(this, var6);
         this.field_3654.method_9290(this.field_2994, this.field_2995, this.field_2996, this.field_3000, this.field_3001);
         this.field_3654.method_9291(var6);
      }

      var10000 = var5;
      return var10000;
   }

   // $FF: renamed from: a (boolean, boolean, boolean) void
   public void method_4602(boolean param1, boolean param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa) void
   public void method_3925(class_689 var1) {
      super.method_3925(var1);
      class_1684 var10000 = this.field_3654;
      class_311 var10001 = new class_311;
      var10001.method_1775(0, this, this.field_2988);
      var10000.method_9291(var10001);
      this.field_3654.method_9290(this.field_2994, this.field_2995, this.field_2996, this.field_3000, this.field_3001);
   }

   // $FF: renamed from: a (double, boolean) void
   protected void method_3870(double var1, boolean var3) {}

   // $FF: renamed from: c (double, boolean) void
   public void method_4642(double var1, boolean var3) {
      super.method_3870(var1, var3);
   }

   // $FF: renamed from: a (gi) void
   public void method_4586(class_580 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: l () void
   private void method_4643() {
      this.field_3671 = this.field_3671 % 100 + 1;
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_4581(int var1, int var2, int var3) {
      this.method_4643();
      class_1684 var10000 = this.field_3654;
      class_289 var10001 = new class_289;
      String[] var10005 = field_3676;
      var10001.method_1661(this.field_3671, 1, "Crafting", 9, true);
      var10000.method_9291(var10001);
      class_684 var4 = new class_684;
      var4.method_3704(this.field_3616, this.field_2990, var1, var2, var3);
      this.field_3619 = var4;
      this.field_3619.field_2870 = this.field_3671;
      this.field_3619.method_3647(this);
   }

   // $FF: renamed from: a (int, int, int, java.lang.String) void
   public void method_4579(int var1, int var2, int var3, String var4) {
      class_1684 var10000;
      class_289 var10001;
      class_289 var10002;
      int var10003;
      byte var10004;
      String var10005;
      label21: {
         try {
            this.method_4643();
            var10000 = this.field_3654;
            var10001 = new class_289;
            var10002 = var10001;
            var10003 = this.field_3671;
            var10004 = 4;
            if(var4 == null) {
               var10005 = "";
               break label21;
            }
         } catch (class_643 var5) {
            throw method_4659(var5);
         }

         var10005 = var4;
      }

      var10002.method_1661(var10003, var10004, var10005, 9, var4 != null);
      var10000.method_9291(var10001);
      class_683 var6 = new class_683;
      var6.method_3703(this.field_3616, this.field_2990, var1, var2, var3);
      this.field_3619 = var6;
      this.field_3619.field_2870 = this.field_3671;
      this.field_3619.method_3647(this);
   }

   // $FF: renamed from: c (int, int, int) void
   public void method_4580(int var1, int var2, int var3) {
      this.method_4643();
      class_1684 var10000 = this.field_3654;
      class_289 var10001 = new class_289;
      String[] var10005 = field_3676;
      var10001.method_1661(this.field_3671, 8, "Repairing", 9, true);
      var10000.method_9291(var10001);
      class_675 var4 = new class_675;
      var4.method_3687(this.field_3616, this.field_2990, var1, var2, var3, this);
      this.field_3619 = var4;
      this.field_3619.field_2870 = this.field_3671;
      this.field_3619.method_3647(this);
   }

   // $FF: renamed from: a (vI) void
   public void method_4575(class_22 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (gv) void
   public void method_4576(class_585 var1) {
      this.method_4643();
      class_1684 var10000 = this.field_3654;
      class_289 var10001 = new class_289;
      var10001.method_1661(this.field_3671, 9, var1.method_88(), var1.method_83(), var1.method_89());
      var10000.method_9291(var10001);
      class_682 var2 = new class_682;
      var2.method_3702(this.field_3616, var1);
      this.field_3619 = var2;
      this.field_3619.field_2870 = this.field_3671;
      this.field_3619.method_3647(this);
   }

   // $FF: renamed from: a (xv) void
   public void method_4577(class_696 var1) {
      this.method_4643();
      class_1684 var10000 = this.field_3654;
      class_289 var10001 = new class_289;
      var10001.method_1661(this.field_3671, 9, var1.method_88(), var1.method_83(), var1.method_89());
      var10000.method_9291(var10001);
      class_682 var2 = new class_682;
      var2.method_3702(this.field_3616, var1);
      this.field_3619 = var2;
      this.field_3619.field_2870 = this.field_3671;
      this.field_3619.method_3647(this);
   }

   // $FF: renamed from: a (gq) void
   public void method_4585(class_589 var1) {
      class_1684 var10000;
      class_289 var10001;
      class_289 var10002;
      int var10003;
      byte var10004;
      label16: {
         try {
            this.method_4643();
            var10000 = this.field_3654;
            var10001 = new class_289;
            var10002 = var10001;
            var10003 = this.field_3671;
            if(var1 instanceof class_590) {
               var10004 = 10;
               break label16;
            }
         } catch (class_643 var2) {
            throw method_4659(var2);
         }

         var10004 = 3;
      }

      var10002.method_1661(var10003, var10004, var1.method_88(), var1.method_83(), var1.method_89());
      var10000.method_9291(var10001);
      class_678 var3 = new class_678;
      var3.method_3696(this.field_3616, var1);
      this.field_3619 = var3;
      this.field_3619.field_2870 = this.field_3671;
      this.field_3619.method_3647(this);
   }

   // $FF: renamed from: a (gl) void
   public void method_4588(class_595 var1) {
      this.method_4643();
      class_1684 var10000 = this.field_3654;
      class_289 var10001 = new class_289;
      var10001.method_1661(this.field_3671, 5, var1.method_88(), var1.method_83(), var1.method_89());
      var10000.method_9291(var10001);
      class_673 var2 = new class_673;
      var2.method_3684(this.field_3616, var1);
      this.field_3619 = var2;
      this.field_3619.field_2870 = this.field_3671;
      this.field_3619.method_3647(this);
   }

   // $FF: renamed from: a (gk) void
   public void method_4589(class_596 var1) {
      this.method_4643();
      class_1684 var10000 = this.field_3654;
      class_289 var10001 = new class_289;
      var10001.method_1661(this.field_3671, 7, var1.method_88(), var1.method_83(), var1.method_89());
      var10000.method_9291(var10001);
      class_674 var2 = new class_674;
      var2.method_3685(this.field_3616, var1);
      this.field_3619 = var2;
      this.field_3619.field_2870 = this.field_3671;
      this.field_3619.method_3647(this);
   }

   // $FF: renamed from: a (c5, java.lang.String) void
   public void method_4590(class_18 var1, String var2) {
      this.method_4643();
      class_679 var10001 = new class_679;
      var10001.method_3697(this.field_3616, var1, this.field_2990);
      this.field_3619 = var10001;
      this.field_3619.field_2870 = this.field_3671;
      this.field_3619.method_3647(this);
      class_898 var3 = ((class_679)this.field_3619).method_3698();

      class_1684 var10000;
      class_289 var16;
      class_289 var10002;
      int var10003;
      byte var10004;
      String var10005;
      label77: {
         try {
            var10000 = this.field_3654;
            var16 = new class_289;
            var10002 = var16;
            var10003 = this.field_3671;
            var10004 = 6;
            if(var2 == null) {
               var10005 = "";
               break label77;
            }
         } catch (IOException var14) {
            throw method_4659(var14);
         }

         var10005 = var2;
      }

      var10002.method_1661(var10003, var10004, var10005, var3.method_83(), var2 != null);
      var10000.method_9291(var16);
      class_658 var4 = var1.method_56(this);
      if(var4 != null) {
         class_112 var15 = new class_112;
         var15.method_516(Unpooled.buffer());
         class_112 var5 = var15;

         try {
            var5.writeInt(this.field_3671);
            var4.method_3567(var5);
            var10000 = this.field_3654;
            class_285 var18 = new class_285;
            String[] var8 = field_3676;
            var18.method_1642("MC|TrList", var5);
            var10000.method_9291(var18);
         } catch (IOException var12) {
            String[] var17 = field_3676;
            field_3652.error("Couldn\'t send trade list", var12);
         } finally {
            var5.release();
         }
      }

   }

   // $FF: renamed from: a (wR, vI) void
   public void method_4578(class_772 param1, class_22 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (Al, int, add) void
   public void method_51(class_671 param1, int param2, add param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (Al) void
   public void method_4644(class_671 var1) {
      this.method_50(var1, var1.method_3649());
   }

   // $FF: renamed from: b (Al, java.util.List) void
   public void method_50(class_671 var1, List var2) {
      class_1684 var10000 = this.field_3654;
      class_288 var10001 = new class_288;
      var10001.method_1657(var1.field_2870, var2);
      var10000.method_9291(var10001);
      var10000 = this.field_3654;
      class_286 var3 = new class_286;
      var3.method_1647(-1, -1, this.field_3616.method_3617());
      var10000.method_9291(var3);
   }

   // $FF: renamed from: b (Al, int, int) void
   public void method_52(class_671 var1, int var2, int var3) {
      class_1684 var10000 = this.field_3654;
      class_287 var10001 = new class_287;
      var10001.method_1652(var1.field_2870, var2, var3);
      var10000.method_9291(var10001);
   }

   // $FF: renamed from: k () void
   public void method_4564() {
      class_1684 var10000 = this.field_3654;
      class_290 var10001 = new class_290;
      var10001.method_1670(this.field_3619.field_2870);
      var10000.method_9291(var10001);
      this.method_4646();
   }

   // $FF: renamed from: m () void
   public void method_4645() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: n () void
   public void method_4646() {
      this.field_3619.method_3658(this);
      this.field_3619 = this.field_3618;
   }

   // $FF: renamed from: b (float, float, boolean, boolean) void
   public void method_4647(float param1, float param2, boolean param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (u2, int) void
   public void method_4615(class_1601 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: o () void
   public void method_4648() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: r () void
   public void method_4649() {
      this.field_3663 = -1.0E8F;
   }

   // $FF: renamed from: b (rV) void
   public void method_4610(class_66 var1) {
      class_1684 var10000 = this.field_3654;
      class_293 var10001 = new class_293;
      var10001.method_1683(var1);
      var10000.method_9291(var10001);
   }

   // $FF: renamed from: p () void
   protected void method_4563() {
      class_1684 var10000 = this.field_3654;
      class_283 var10001 = new class_283;
      var10001.method_1635(this, (byte)9);
      var10000.method_9291(var10001);
      super.method_4563();
   }

   // $FF: renamed from: a (add, int) void
   public void method_4626(add param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (yz, boolean) void
   public void method_4629(class_792 var1, boolean var2) {
      super.method_4629(var1, var2);
      this.field_3666 = -1;
      this.field_3663 = -1.0F;
      this.field_3664 = -1;
      this.field_3660.addAll(((class_793)var1).field_3660);
   }

   // $FF: renamed from: a (v5) void
   protected void method_4184(class_1645 var1) {
      super.method_4184(var1);
      class_1684 var10000 = this.field_3654;
      class_334 var10001 = new class_334;
      var10001.method_1891(this.method_3845(), var1);
      var10000.method_9291(var10001);
   }

   // $FF: renamed from: a (v5, boolean) void
   protected void method_4185(class_1645 var1, boolean var2) {
      super.method_4185(var1, var2);
      class_1684 var10000 = this.field_3654;
      class_334 var10001 = new class_334;
      var10001.method_1891(this.method_3845(), var1);
      var10000.method_9291(var10001);
   }

   // $FF: renamed from: b (v5) void
   protected void method_4186(class_1645 var1) {
      super.method_4186(var1);
      class_1684 var10000 = this.field_3654;
      class_317 var10001 = new class_317;
      var10001.method_1801(this.method_3845(), var1);
      var10000.method_9291(var10001);
   }

   // $FF: renamed from: a (double, double, double) void
   public void method_4219(double var1, double var3, double var5) {
      this.field_3654.method_9290(var1, var3, var5, this.field_3000, this.field_3001);
   }

   // $FF: renamed from: b (sa) void
   public void method_4596(class_689 var1) {
      class_1657 var10000 = this.method_4650().method_2256();
      class_342 var10002 = new class_342;
      var10002.method_1937(var1, 4);
      var10000.method_9120(this, var10002);
   }

   // $FF: renamed from: c (sa) void
   public void method_4597(class_689 var1) {
      class_1657 var10000 = this.method_4650().method_2256();
      class_342 var10002 = new class_342;
      var10002.method_1937(var1, 5);
      var10000.method_9120(this, var10002);
   }

   // $FF: renamed from: q () void
   public void method_4630() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: s () dk
   public class_354 method_4650() {
      return (class_354)this.field_2990;
   }

   // $FF: renamed from: a (G) void
   public void method_4631(class_94 var1) {
      this.field_3656.method_9199(var1);
      class_1684 var10000 = this.field_3654;
      class_281 var10001 = new class_281;
      var10001.method_1621(3, (float)var1.method_443());
      var10000.method_9291(var10001);
   }

   // $FF: renamed from: a (rV) void
   public void method_66(class_66 var1) {
      class_1684 var10000 = this.field_3654;
      class_293 var10001 = new class_293;
      var10001.method_1683(var1);
      var10000.method_9291(var10001);
   }

   // $FF: renamed from: a (int, java.lang.String) boolean
   public boolean method_67(int param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: t () java.lang.String
   public String method_4651() {
      String var1 = this.field_3654.field_8783.method_557().toString();
      var1 = var1.substring(var1.indexOf("/") + 1);
      var1 = var1.substring(0, var1.indexOf(":"));
      return var1;
   }

   // $FF: renamed from: b (tb) void
   public void method_4652(class_275 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: v () ay
   public class_932 method_4653() {
      return this.field_3668;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_4654(String var1) {
      class_1684 var10000 = this.field_3654;
      class_285 var10001 = new class_285;
      String[] var10003 = field_3676;
      var10001.method_1643("MC|RPack", var1.getBytes(Charsets.UTF_8));
      var10000.method_9291(var10001);
   }

   // $FF: renamed from: f_ () vF
   public class_1661 method_68() {
      class_1661 var10000 = new class_1661;
      var10000.method_9151(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995 + 0.5D), class_1715.method_9561(this.field_2996));
      return var10000;
   }

   // $FF: renamed from: w () void
   public void method_4655() {
      this.field_3670 = MinecraftServer.method_2397();
   }

   // $FF: renamed from: x () ve
   public class_1700 method_4656() {
      return this.field_3661;
   }

   // $FF: renamed from: s (sa) void
   public void method_4657(class_689 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a1 () long
   public long method_4658() {
      return this.field_3670;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4636() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_4659(Throwable var0) {
      return var0;
   }
}

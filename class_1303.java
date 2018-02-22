import net.minecraft.server.MinecraftServer;

// $FF: renamed from: jY
public class class_1303 {

   // $FF: renamed from: b long
   private long field_6682;
   // $FF: renamed from: c du
   private class_1046 field_6683;
   // $FF: renamed from: d java.lang.String
   private String field_6684;
   // $FF: renamed from: e int
   private int field_6685;
   // $FF: renamed from: f int
   private int field_6686;
   // $FF: renamed from: g int
   private int field_6687;
   // $FF: renamed from: h long
   private long field_6688;
   // $FF: renamed from: i long
   private long field_6689;
   // $FF: renamed from: j long
   private long field_6690;
   // $FF: renamed from: k long
   private long field_6691;
   // $FF: renamed from: l ro
   private class_1583 field_6692;
   // $FF: renamed from: m int
   private int field_6693;
   // $FF: renamed from: n java.lang.String
   private String field_6694;
   // $FF: renamed from: o int
   private int field_6695;
   // $FF: renamed from: p boolean
   private boolean field_6696;
   // $FF: renamed from: q int
   private int field_6697;
   // $FF: renamed from: r boolean
   private boolean field_6698;
   // $FF: renamed from: s int
   private int field_6699;
   // $FF: renamed from: t G
   private class_94 field_6700;
   // $FF: renamed from: u boolean
   private boolean field_6701;
   // $FF: renamed from: v boolean
   private boolean field_6702;
   // $FF: renamed from: w boolean
   private boolean field_6703;
   // $FF: renamed from: x boolean
   private boolean field_6704;
   // $FF: renamed from: y dh
   private class_1038 field_6705;
   // $FF: renamed from: z java.lang.String
   private static final String field_6706;
   // $FF: renamed from: A java.lang.String[]
   private static final String[] field_6707;


   // $FF: renamed from: <init> () void
   protected void method_6829() {
      super();
      this.field_6683 = class_1046.field_5527;
      this.field_6684 = "";
      class_1038 var10001 = new class_1038;
      var10001.method_5874();
      this.field_6705 = var10001;
   }

   // $FF: renamed from: <init> (ro) void
   public void method_6830(class_1583 var1) {
      String[] var2;
      String[] var5;
      boolean var6;
      class_1303 var12;
      label110: {
         int var8;
         label113: {
            String[] var10000 = class_752.method_4253();
            super();
            var2 = var10000;
            this.field_6683 = class_1046.field_5527;
            this.field_6684 = "";
            class_1038 var10001 = new class_1038;
            var10001.method_5874();
            this.field_6705 = var10001;
            var5 = field_6707;
            this.field_6682 = var1.method_8682("RandomSeed");
            var6 = var1.initGui8("generatorName", 8);
            if(var2 != null) {
               label114: {
                  if(var6) {
                     label94: {
                        label116: {
                           String var3 = var1.method_8685("generatorName");
                           this.field_6683 = class_1046.method_5931(var3);
                           class_1046 var7 = this.field_6683;
                           if(var2 != null) {
                              if(this.field_6683 == null) {
                                 this.field_6683 = class_1046.field_5527;
                                 if(var2 != null) {
                                    break label116;
                                 }
                              }

                              var7 = this.field_6683;
                           }

                           var6 = var7.method_5930();
                           if(var2 == null) {
                              break label94;
                           }

                           if(var6) {
                              int var4;
                              label82: {
                                 var4 = 0;
                                 var5 = field_6707;
                                 int var9 = var1.initGui8("generatorVersion", 99);
                                 if(var2 != null) {
                                    if(var9 == 0) {
                                       break label82;
                                    }

                                    var9 = var1.method_8681("generatorVersion");
                                 }

                                 var4 = var9;
                              }

                              this.field_6683 = this.field_6683.method_5926(var4);
                           }
                        }

                        var5 = field_6707;
                        var6 = var1.initGui8("generatorOptions", 8);
                     }

                     if(var2 == null) {
                        break label114;
                     }

                     if(var6) {
                        var5 = field_6707;
                        this.field_6684 = var1.method_8685("generatorOptions");
                     }
                  }

                  var12 = this;
                  var5 = field_6707;
                  var8 = var1.method_8681("GameType");
                  if(var2 == null) {
                     break label113;
                  }

                  this.field_6700 = class_94.method_449(var8);
                  var6 = var1.initGui8("MapFeatures", 99);
               }
            }

            if(var6) {
               var5 = field_6707;
               this.field_6701 = var1.method_8690("MapFeatures");
               if(var2 != null) {
                  break label110;
               }
            }

            var12 = this;
            var8 = 1;
         }

         var12.field_6701 = (boolean)var8;
      }

      label76: {
         var5 = field_6707;
         this.field_6685 = var1.method_8681("SpawnX");
         this.field_6686 = var1.method_8681("SpawnY");
         this.field_6687 = var1.method_8681("SpawnZ");
         var12 = this;
         long var10 = var1.method_8682("Time");
         if(var2 != null) {
            this.field_6688 = var10;
            if(var1.initGui8("DayTime", 99)) {
               this.field_6689 = var1.method_8682("DayTime");
               if(var2 != null) {
                  break label76;
               }
            }

            var12 = this;
            var10 = this.field_6688;
         }

         var12.field_6689 = var10;
      }

      label69: {
         var5 = field_6707;
         this.field_6690 = var1.method_8682("LastPlayed");
         this.field_6691 = var1.method_8682("SizeOnDisk");
         this.field_6694 = var1.method_8685("LevelName");
         this.field_6695 = var1.method_8681("version");
         this.field_6697 = var1.method_8681("rainTime");
         this.field_6696 = var1.method_8690("raining");
         this.field_6699 = var1.method_8681("thunderTime");
         this.field_6698 = var1.method_8690("thundering");
         var12 = this;
         boolean var11 = var1.method_8690("hardcore");
         if(var2 != null) {
            this.field_6702 = var11;
            if(var1.initGui8("initialized", 99)) {
               this.field_6704 = var1.method_8690("initialized");
               if(var2 != null) {
                  break label69;
               }
            }

            var12 = this;
            var11 = true;
         }

         var12.field_6704 = var11;
      }

      label117: {
         var5 = field_6707;
         if(var1.initGui8("allowCommands", 99)) {
            this.field_6703 = var1.method_8690("allowCommands");
            if(var2 != null) {
               break label117;
            }
         }

         this.field_6703 = this.field_6700 == class_94.field_46;
      }

      var5 = field_6707;
      var6 = var1.initGui8("Player", 10);
      if(var2 != null) {
         if(var6) {
            this.field_6692 = var1.method_8688("Player");
            this.field_6693 = this.field_6692.method_8681("Dimension");
         }

         var5 = field_6707;
         var6 = var1.initGui8("GameRules", 10);
      }

      if(var6) {
         String[] var10002 = field_6707;
         this.field_6705.method_5880(var1.method_8688("GameRules"));
      }

   }

   // $FF: renamed from: <init> (dt, java.lang.String) void
   public void method_6831(class_1045 var1, String var2) {
      super();
      this.field_6683 = class_1046.field_5527;
      this.field_6684 = "";
      class_1038 var10001 = new class_1038;
      var10001.method_5874();
      this.field_6705 = var10001;
      this.field_6682 = var1.method_5911();
      this.field_6700 = var1.method_5912();
      this.field_6701 = var1.method_5914();
      this.field_6694 = var2;
      this.field_6702 = var1.method_5913();
      this.field_6683 = var1.method_5915();
      this.field_6684 = var1.method_5918();
      this.field_6703 = var1.method_5916();
      this.field_6704 = false;
   }

   // $FF: renamed from: <init> (jY) void
   public void method_6832(class_1303 var1) {
      super();
      this.field_6683 = class_1046.field_5527;
      this.field_6684 = "";
      class_1038 var10001 = new class_1038;
      var10001.method_5874();
      this.field_6705 = var10001;
      this.field_6682 = var1.field_6682;
      this.field_6683 = var1.field_6683;
      this.field_6684 = var1.field_6684;
      this.field_6700 = var1.field_6700;
      this.field_6701 = var1.field_6701;
      this.field_6685 = var1.field_6685;
      this.field_6686 = var1.field_6686;
      this.field_6687 = var1.field_6687;
      this.field_6688 = var1.field_6688;
      this.field_6689 = var1.field_6689;
      this.field_6690 = var1.field_6690;
      this.field_6691 = var1.field_6691;
      this.field_6692 = var1.field_6692;
      this.field_6693 = var1.field_6693;
      this.field_6694 = var1.field_6694;
      this.field_6695 = var1.field_6695;
      this.field_6697 = var1.field_6697;
      this.field_6696 = var1.field_6696;
      this.field_6699 = var1.field_6699;
      this.field_6698 = var1.field_6698;
      this.field_6702 = var1.field_6702;
      this.field_6703 = var1.field_6703;
      this.field_6704 = var1.field_6704;
      this.field_6705 = var1.field_6705;
   }

   // $FF: renamed from: b () ro
   public class_1583 method_6833() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var1 = var10000;
      this.method_6835(var1, this.field_6692);
      return var1;
   }

   // $FF: renamed from: b (ro) ro
   public class_1583 method_6834(class_1583 var1) {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var2 = var10000;
      this.method_6835(var2, var1);
      return var2;
   }

   // $FF: renamed from: b (ro, ro) void
   private void method_6835(class_1583 var1, class_1583 var2) {
      String[] var4 = field_6707;
      var1.method_8668("RandomSeed", this.field_6682);
      var1.initGui1("generatorName", this.field_6683.method_5922());
      var1.method_8667("generatorVersion", this.field_6683.method_5925());
      var1.initGui1("generatorOptions", this.field_6684);
      String[] var10000 = class_752.method_4253();
      var1.method_8667("GameType", this.field_6700.method_443());
      var1.initGui4("MapFeatures", this.field_6701);
      var1.method_8667("SpawnX", this.field_6685);
      var1.method_8667("SpawnY", this.field_6686);
      var1.method_8667("SpawnZ", this.field_6687);
      String[] var3 = var10000;
      var1.method_8668("Time", this.field_6688);
      var1.method_8668("DayTime", this.field_6689);
      var1.method_8668("SizeOnDisk", this.field_6691);
      var1.method_8668("LastPlayed", MinecraftServer.method_2397());
      var1.initGui1("LevelName", this.field_6694);
      var1.method_8667("version", this.field_6695);
      var1.method_8667("rainTime", this.field_6697);
      var1.initGui4("raining", this.field_6696);
      var1.method_8667("thunderTime", this.field_6699);
      var1.initGui4("thundering", this.field_6698);
      var1.initGui4("hardcore", this.field_6702);
      var1.initGui4("allowCommands", this.field_6703);
      var1.initGui4("initialized", this.field_6704);
      var1.method_8664("GameRules", this.field_6705.method_5879());
      class_1583 var5 = var2;
      if(var3 != null) {
         if(var2 == null) {
            return;
         }

         var5 = var1;
      }

      String[] var10001 = field_6707;
      var5.method_8664("Player", var2);
   }

   // $FF: renamed from: c () long
   public long method_6836() {
      return this.field_6682;
   }

   // $FF: renamed from: d () int
   public int method_6837() {
      return this.field_6685;
   }

   // $FF: renamed from: e () int
   public int method_6838() {
      return this.field_6686;
   }

   // $FF: renamed from: f () int
   public int method_6839() {
      return this.field_6687;
   }

   // $FF: renamed from: g () long
   public long method_6840() {
      return this.field_6688;
   }

   // $FF: renamed from: h () long
   public long method_6841() {
      return this.field_6689;
   }

   // $FF: renamed from: i () long
   public long method_6842() {
      return this.field_6691;
   }

   // $FF: renamed from: j () ro
   public class_1583 method_6843() {
      return this.field_6692;
   }

   // $FF: renamed from: k () int
   public int method_6844() {
      return this.field_6693;
   }

   // $FF: renamed from: b (int) void
   public void method_6845(int var1) {
      this.field_6685 = var1;
   }

   // $FF: renamed from: c (int) void
   public void method_6846(int var1) {
      this.field_6686 = var1;
   }

   // $FF: renamed from: d (int) void
   public void method_6847(int var1) {
      this.field_6687 = var1;
   }

   // $FF: renamed from: a (long) void
   public void method_6848(long var1) {
      this.field_6688 = var1;
   }

   // $FF: renamed from: b (long) void
   public void method_6849(long var1) {
      this.field_6689 = var1;
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_6850(int var1, int var2, int var3) {
      this.field_6685 = var1;
      this.field_6686 = var2;
      this.field_6687 = var3;
   }

   // $FF: renamed from: l () java.lang.String
   public String method_6851() {
      return this.field_6694;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_6852(String var1) {
      this.field_6694 = var1;
   }

   // $FF: renamed from: m () int
   public int method_6853() {
      return this.field_6695;
   }

   // $FF: renamed from: f (int) void
   public void method_6854(int var1) {
      this.field_6695 = var1;
   }

   // $FF: renamed from: n () long
   public long method_6855() {
      return this.field_6690;
   }

   // $FF: renamed from: o () boolean
   public boolean method_6856() {
      return this.field_6698;
   }

   // $FF: renamed from: b (boolean) void
   public void method_6857(boolean var1) {
      this.field_6698 = var1;
   }

   // $FF: renamed from: p () int
   public int method_6858() {
      return this.field_6699;
   }

   // $FF: renamed from: g (int) void
   public void method_6859(int var1) {
      this.field_6699 = var1;
   }

   // $FF: renamed from: q () boolean
   public boolean method_6860() {
      return this.field_6696;
   }

   // $FF: renamed from: c (boolean) void
   public void method_6861(boolean var1) {
      this.field_6696 = var1;
   }

   // $FF: renamed from: r () int
   public int method_6862() {
      return this.field_6697;
   }

   // $FF: renamed from: h (int) void
   public void method_6863(int var1) {
      this.field_6697 = var1;
   }

   // $FF: renamed from: s () G
   public class_94 method_6864() {
      return this.field_6700;
   }

   // $FF: renamed from: t () boolean
   public boolean method_6865() {
      return this.field_6701;
   }

   // $FF: renamed from: b (G) void
   public void method_6866(class_94 var1) {
      this.field_6700 = var1;
   }

   // $FF: renamed from: u () boolean
   public boolean method_6867() {
      return this.field_6702;
   }

   // $FF: renamed from: v () du
   public class_1046 method_6868() {
      return this.field_6683;
   }

   // $FF: renamed from: b (du) void
   public void method_6869(class_1046 var1) {
      this.field_6683 = var1;
   }

   // $FF: renamed from: w () java.lang.String
   public String method_6870() {
      return this.field_6684;
   }

   // $FF: renamed from: x () boolean
   public boolean method_6871() {
      return this.field_6703;
   }

   // $FF: renamed from: y () boolean
   public boolean method_6872() {
      return this.field_6704;
   }

   // $FF: renamed from: e (boolean) void
   public void method_6873(boolean var1) {
      this.field_6704 = var1;
   }

   // $FF: renamed from: z () dh
   public class_1038 method_6874() {
      return this.field_6705;
   }

   // $FF: renamed from: b (tR) void
   public void method_6875(class_1605 var1) {
      String[] var2 = field_6707;
      class_1255 var10002 = new class_1255;
      var10002.method_6609(this);
      var1.method_8777("Level seed", var10002);
      class_1256 var3 = new class_1256;
      var3.method_6612(this);
      var1.method_8777("Level generator", var3);
      class_1257 var4 = new class_1257;
      var4.method_6615(this);
      var1.method_8777("Level generator options", var4);
      class_1258 var5 = new class_1258;
      var5.method_6618(this);
      var1.method_8777("Level spawn location", var5);
      class_1259 var6 = new class_1259;
      var6.method_6621(this);
      var1.method_8777("Level time", var6);
      class_1260 var7 = new class_1260;
      var7.method_6624(this);
      var1.method_8777("Level dimension", var7);
      class_1261 var8 = new class_1261;
      var8.method_6627(this);
      var1.method_8777("Level storage version", var8);
      class_1262 var9 = new class_1262;
      var9.method_6631(this);
      var1.method_8777("Level weather", var9);
      class_1263 var10 = new class_1263;
      var10.method_6634(this);
      var1.method_8777("Level game mode", var10);
   }

   // $FF: renamed from: b (jY) du
   static class_1046 method_6876(class_1303 var0) {
      return var0.field_6683;
   }

   // $FF: renamed from: c (jY) boolean
   static boolean method_6877(class_1303 var0) {
      return var0.field_6701;
   }

   // $FF: renamed from: d (jY) java.lang.String
   static String method_6878(class_1303 var0) {
      return var0.field_6684;
   }

   // $FF: renamed from: e (jY) int
   static int method_6879(class_1303 var0) {
      return var0.field_6685;
   }

   // $FF: renamed from: f (jY) int
   static int method_6880(class_1303 var0) {
      return var0.field_6686;
   }

   // $FF: renamed from: g (jY) int
   static int method_6881(class_1303 var0) {
      return var0.field_6687;
   }

   // $FF: renamed from: h (jY) long
   static long method_6882(class_1303 var0) {
      return var0.field_6688;
   }

   // $FF: renamed from: i (jY) long
   static long method_6883(class_1303 var0) {
      return var0.field_6689;
   }

   // $FF: renamed from: j (jY) int
   static int method_6884(class_1303 var0) {
      return var0.field_6693;
   }

   // $FF: renamed from: k (jY) int
   static int method_6885(class_1303 var0) {
      return var0.field_6695;
   }

   // $FF: renamed from: l (jY) int
   static int method_6886(class_1303 var0) {
      return var0.field_6697;
   }

   // $FF: renamed from: m (jY) boolean
   static boolean method_6887(class_1303 var0) {
      return var0.field_6696;
   }

   // $FF: renamed from: n (jY) int
   static int method_6888(class_1303 var0) {
      return var0.field_6699;
   }

   // $FF: renamed from: o (jY) boolean
   static boolean method_6889(class_1303 var0) {
      return var0.field_6698;
   }

   // $FF: renamed from: p (jY) G
   static class_94 method_6890(class_1303 var0) {
      return var0.field_6700;
   }

   // $FF: renamed from: q (jY) boolean
   static boolean method_6891(class_1303 var0) {
      return var0.field_6702;
   }

   // $FF: renamed from: r (jY) boolean
   static boolean method_6892(class_1303 var0) {
      return var0.field_6703;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6893() {
      // $FF: Couldn't be decompiled
   }
}

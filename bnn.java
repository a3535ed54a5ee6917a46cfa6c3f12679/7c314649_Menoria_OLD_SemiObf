import ca.diiza.e.class_803;
import ca.diiza.e.class_804;
import ca.diiza.e.class_805;
import ca.diiza.e.class_806;
import ca.diiza.p.class_854;
import ca.diiza.p.class_855;
import ca.diiza.p.class_856;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class bnn {

   // $FF: renamed from: q java.util.Map
   private Map field_7417;
   // $FF: renamed from: a bnn
   public static bnn field_7418;
   // $FF: renamed from: r kU
   private FontRenderer field_7419;
   // $FF: renamed from: b double
   public static double field_7420;
   // $FF: renamed from: c double
   public static double field_7421;
   // $FF: renamed from: d double
   public static double field_7422;
   // $FF: renamed from: e bqf
   public bqf field_7423;
   // $FF: renamed from: f bly
   public bly field_7424;
   // $FF: renamed from: g ahb
   public ahb field_7425;
   // $FF: renamed from: h sv
   public class_752 field_7426;
   // $FF: renamed from: i sa
   public class_689 field_7427;
   // $FF: renamed from: j float
   public float field_7428;
   // $FF: renamed from: k float
   public float field_7429;
   // $FF: renamed from: l bbj
   public bbj field_7430;
   // $FF: renamed from: m double
   public double field_7431;
   // $FF: renamed from: n double
   public double field_7432;
   // $FF: renamed from: o double
   public double field_7433;
   // $FF: renamed from: p boolean
   public static boolean field_7434;
   private static final String __OBFID;
   // $FF: renamed from: s java.lang.String[]
   private static final String[] field_7435;


   // $FF: renamed from: <init> () void
   private void method_7616() {
      super();
      this.field_7417 = new HashMap();
      Map var10000 = this.field_7417;
      class_842 var10002 = new class_842;
      var10002.method_4727();
      var10000.put(class_785.class, var10002);
      var10000 = this.field_7417;
      bov var3 = new bov;
      var3.method_4727();
      var10000.put(class_784.class, var3);
      var10000 = this.field_7417;
      class_847 var4 = new class_847;
      class_1235 var10004 = new class_1235;
      var10004.method_6510();
      class_1235 var10005 = new class_1235;
      var10005.drawGradientRect2(0.5F);
      var4.method_4903(var10004, var10005, 0.7F);
      var10000.put(class_771.class, var4);
      var10000 = this.field_7417;
      class_846 var5 = new class_846;
      class_1233 var9 = new class_1233;
      var9.method_6510();
      class_1234 var14 = new class_1234;
      var14.method_6510();
      var5.method_4900(var9, var14, 0.7F);
      var10000.put(class_770.class, var5);
      var10000 = this.field_7417;
      class_832 var6 = new class_832;
      class_1236 var11 = new class_1236;
      var11.method_6510();
      var6.method_4798(var11, 0.7F);
      var10000.put(class_773.class, var6);
      var10000 = this.field_7417;
      class_849 var7 = new class_849;
      var11 = new class_1236;
      var11.method_6510();
      var7.method_4798(var11, 0.7F);
      var10000.put(class_774.class, var7);
      var10000 = this.field_7417;
      class_836 var8 = new class_836;
      class_1211 var15 = new class_1211;
      var15.method_6510();
      class_1211 var17 = new class_1211;
      var17.method_6510();
      var8.method_4858(var15, var17, 0.5F);
      var10000.put(class_777.class, var8);
      var10000 = this.field_7417;
      class_833 var10 = new class_833;
      class_1225 var18 = new class_1225;
      var18.method_6510();
      var10.method_4798(var18, 0.3F);
      var10000.put(class_775.class, var10);
      var10000 = this.field_7417;
      class_848 var12 = new class_848;
      class_1237 var20 = new class_1237;
      var20.method_6510();
      var12.method_4798(var20, 0.4F);
      var10000.put(class_778.class, var12);
      var10000 = this.field_7417;
      class_845 var13 = new class_845;
      var13.method_4727();
      var10000.put(class_787.class, var13);
      var10000 = this.field_7417;
      class_831 var16 = new class_831;
      var16.method_4727();
      var10000.put(class_789.class, var16);
      var10000 = this.field_7417;
      bnm var19 = new bnm;
      var19.method_4727();
      var10000.put(class_780.class, var19);
      var10000 = this.field_7417;
      class_843 var21 = new class_843;
      var21.method_4727();
      var10000.put(class_766.class, var21);
      var10000 = this.field_7417;
      class_853 var23 = new class_853;
      var23.method_4727();
      var10000.put(class_786.class, var23);
      var10000 = this.field_7417;
      class_838 var25 = new class_838;
      var25.method_4727();
      var10000.put(class_783.class, var25);
      var10000 = this.field_7417;
      class_834 var27 = new class_834;
      var27.method_4727();
      var10000.put(class_790.class, var27);
      var10000 = this.field_7417;
      class_852 var29 = new class_852;
      var29.method_4727();
      var10000.put(class_781.class, var29);
      var10000 = this.field_7417;
      class_844 var31 = new class_844;
      class_1219 var24 = new class_1219;
      var24.method_6535(16);
      class_1219 var22 = new class_1219;
      var22.method_6535(0);
      var31.method_4892(var24, var22, 0.25F);
      var10000.put(class_754.class, var31);
      var10000 = this.field_7417;
      class_850 var32 = new class_850;
      var32.method_4727();
      var10000.put(class_755.class, var32);
      var10000 = this.field_7417;
      class_826 var33 = new class_826;
      var33.method_4727();
      var10000.put(class_792.class, var33);
      var10000 = this.field_7417;
      class_829 var34 = new class_829;
      class_1245 var26 = new class_1245;
      var26.method_6510();
      var34.method_4837(var26, 0.5F, 6.0F);
      var10000.put(class_788.class, var34);
      var10000 = this.field_7417;
      class_830 var35 = new class_830;
      var35.method_4727();
      var10000.put(class_760.class, var35);
      var10000 = this.field_7417;
      class_841 var36 = new class_841;
      class_1216 var28 = new class_1216;
      var28.method_6510();
      var36.method_4798(var28, 0.7F);
      var10000.put(class_763.class, var36);
      var10000 = this.field_7417;
      class_839 var37 = new class_839;
      var37.method_4727();
      var10000.put(class_768.class, var37);
      var10000 = this.field_7417;
      class_840 var38 = new class_840;
      var38.method_4727();
      var10000.put(class_765.class, var38);
      var10000 = this.field_7417;
      class_835 var39 = new class_835;
      var39.method_4727();
      var10000.put(class_757.class, var39);
      var10000 = this.field_7417;
      bnl var40 = new bnl;
      var40.method_4727();
      var10000.put(class_758.class, var40);
      var10000 = this.field_7417;
      class_816 var41 = new class_816;
      var41.method_4727();
      var10000.put(class_705.class, var41);
      var10000 = this.field_7417;
      class_837 var42 = new class_837;
      var42.method_4727();
      var10000.put(class_791.class, var42);
      var10000 = this.field_7417;
      class_817 var43 = new class_817;
      var43.method_4727();
      var10000.put(class_689.class, var43);
      var10000 = this.field_7417;
      class_822 var44 = new class_822;
      var44.method_4727();
      var10000.put(class_749.class, var44);
      var10000 = this.field_7417;
      bnx var45 = new bnx;
      var45.method_4727();
      var10000.put(class_751.class, var45);
      var10000 = this.field_7417;
      class_809 var46 = new class_809;
      var46.method_4727();
      var10000.put(class_750.class, var46);
      var10000 = this.field_7417;
      class_819 var47 = new class_819;
      var47.method_4727();
      var10000.put(class_713.class, var47);
      var10000 = this.field_7417;
      class_856 var48 = new class_856;
      var48.method_4727();
      var10000.put(class_806.class, var48);
      var10000 = this.field_7417;
      class_854 var49 = new class_854;
      var49.method_4727();
      var10000.put(class_804.class, var49);
      var10000 = this.field_7417;
      class_855 var50 = new class_855;
      var50.method_4727();
      var10000.put(class_805.class, var50);
      var10000 = this.field_7417;
      class_810 var51 = new class_810;
      var51.method_4750(class_1010.field_5354);
      var10000.put(class_803.class, var51);
      var10000 = this.field_7417;
      var51 = new class_810;
      var51.method_4750(class_1010.field_5190);
      var10000.put(class_802.class, var51);
      var10000 = this.field_7417;
      var51 = new class_810;
      var51.method_4750(class_1010.field_5225);
      var10000.put(class_800.class, var51);
      var10000 = this.field_7417;
      var51 = new class_810;
      var51.method_4750(class_1010.field_5237);
      var10000.put(class_712.class, var51);
      var10000 = this.field_7417;
      var51 = new class_810;
      var51.method_4750(class_1010.field_5201);
      var10000.put(class_801.class, var51);
      var10000 = this.field_7417;
      var51 = new class_810;
      var51.method_4749(class_1010.field_5230, 16384);
      var10000.put(class_798.class, var51);
      var10000 = this.field_7417;
      var51 = new class_810;
      var51.method_4750(class_1010.field_5240);
      var10000.put(class_799.class, var51);
      var10000 = this.field_7417;
      var51 = new class_810;
      var51.method_4750(class_1010.field_5257);
      var10000.put(class_707.class, var51);
      var10000 = this.field_7417;
      class_813 var52 = new class_813;
      var52.method_4765(2.0F);
      var10000.put(class_711.class, var52);
      var10000 = this.field_7417;
      var52 = new class_813;
      var52.method_4765(0.5F);
      var10000.put(class_710.class, var52);
      var10000 = this.field_7417;
      class_820 var53 = new class_820;
      var53.method_4727();
      var10000.put(class_709.class, var53);
      var10000 = this.field_7417;
      class_811 var54 = new class_811;
      var54.method_4727();
      var10000.put(class_699.class, var54);
      var10000 = this.field_7417;
      class_815 var55 = new class_815;
      var55.method_4727();
      var10000.put(class_715.class, var55);
      var10000 = this.field_7417;
      class_821 var56 = new class_821;
      var56.method_4727();
      var10000.put(class_714.class, var56);
      var10000 = this.field_7417;
      class_814 var57 = new class_814;
      var57.method_4727();
      var10000.put(class_700.class, var57);
      var10000 = this.field_7417;
      class_824 var58 = new class_824;
      var58.method_4727();
      var10000.put(class_691.class, var58);
      var10000 = this.field_7417;
      class_825 var59 = new class_825;
      var59.method_4727();
      var10000.put(class_692.class, var59);
      var10000 = this.field_7417;
      class_823 var60 = new class_823;
      var60.method_4727();
      var10000.put(class_690.class, var60);
      var10000 = this.field_7417;
      class_818 var61 = new class_818;
      var61.method_4727();
      var10000.put(class_701.class, var61);
      var10000 = this.field_7417;
      class_812 var62 = new class_812;
      var62.method_4727();
      var10000.put(class_704.class, var62);
      var10000 = this.field_7417;
      class_828 var63 = new class_828;
      class_1238 var30 = new class_1238;
      var30.method_6510();
      var63.method_4798(var30, 0.75F);
      var10000.put(class_772.class, var63);
      var10000 = this.field_7417;
      class_808 var64 = new class_808;
      var64.method_4727();
      var10000.put(class_703.class, var64);
      Iterator var1 = this.field_7417.values().iterator();

      while(var1.hasNext()) {
         bno var2 = (bno)var1.next();
         var2.method_4739(this);
      }

   }

   // $FF: renamed from: a (java.lang.Class) bno
   public bno method_7617(Class param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa) bno
   public bno method_7618(class_689 var1) {
      return this.method_7617(var1.getClass());
   }

   // $FF: renamed from: a (ahb, bqf, kU, sv, sa, bbj, float) void
   public void method_7619(ahb param1, bqf param2, FontRenderer param3, class_752 param4, class_689 param5, bbj param6, float param7) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa, float) boolean
   public boolean method_7620(class_689 var1, float var2) {
      return this.method_7621(var1, var2, false);
   }

   // $FF: renamed from: a (sa, float, boolean) boolean
   public boolean method_7621(class_689 param1, float param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) boolean
   public boolean method_7622(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      return this.method_7623(var1, var2, var4, var6, var8, var9, false);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float, boolean) boolean
   public boolean method_7623(class_689 param1, double param2, double param4, double param6, float param8, float param9, boolean param10) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sa, double, double, double, float, float) void
   private void method_7624(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glDepthMask(false);
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      GL11.glDisable(2884);
      GL11.glDisable(3042);
      float var10 = var1.field_3014 / 2.0F;
      class_1343 var11 = class_1343.method_7093(var2 - (double)var10, var4, var6 - (double)var10, var2 + (double)var10, var4 + (double)var1.field_3015, var6 + (double)var10);
      bma.setSelectionPos4(var11, 16777215);
      GL11.glEnable(3553);
      GL11.glEnable(2896);
      GL11.glEnable(2884);
      GL11.glDisable(3042);
      GL11.glDepthMask(true);
   }

   // $FF: renamed from: a (ahb) void
   public void method_7625(ahb var1) {
      this.field_7425 = var1;
   }

   // $FF: renamed from: a (double, double, double) double
   public double method_7626(double var1, double var3, double var5) {
      double var7 = var1 - this.field_7431;
      double var9 = var3 - this.field_7432;
      double var11 = var5 - this.field_7433;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   // $FF: renamed from: a () kU
   public FontRenderer method_7627() {
      return this.field_7419;
   }

   // $FF: renamed from: a (vM) void
   public void method_7628(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.field_7417.values().iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         bno var4 = (bno)var3.next();
         var4.method_4742(var1);
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_7629() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_7630(Throwable var0) {
      return var0;
   }
}


// $FF: renamed from: w
public enum class_131 {

   // $FF: renamed from: a w
   field_306,
   // $FF: renamed from: b w
   field_307,
   // $FF: renamed from: c w
   field_308,
   // $FF: renamed from: d w
   field_309,
   // $FF: renamed from: e w
   field_310,
   OBSIDIAN,
   TITANE,
   EXONITE,
   AMBRE,
   MENORIUM,
   AMBRE_R;
   // $FF: renamed from: g int
   private int field_311;
   // $FF: renamed from: h int[]
   private int[] field_312;
   // $FF: renamed from: i int
   private int field_313;
   // $FF: renamed from: j w[]
   private static final class_131[] field_314;
   // $FF: renamed from: k w[]
   private static final class_131[] field_315;
   // $FF: renamed from: l java.lang.String
   private static final String field_316;
   // $FF: renamed from: m w[]
   private static final class_131[] field_317;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, int, int, int[], int) void
   private void method_606(String var1, int var2, String var3, int var4, String var5, int var6, int var7, int[] var8, int var9) {
      super(var1, var2);
      this.field_311 = var7;
      this.field_312 = var8;
      this.field_313 = var9;
   }

   // $FF: renamed from: b (int) int
   public int method_607(int var1) {
      return class_525.method_2997()[var1] * this.field_311;
   }

   // $FF: renamed from: c (int) int
   public int method_608(int var1) {
      return this.field_312[var1];
   }

   // $FF: renamed from: b () int
   public int method_609() {
      return this.field_313;
   }

   // $FF: renamed from: c () adb
   public adb method_610() {
      String[] var1 = class_752.method_4253();
      class_131 var10000 = this;
      class_131 var10001 = field_306;
      adb var2;
      if(var1 != null) {
         if(this == field_306) {
            var2 = class_1010.field_5192;
            return var2;
         }

         var10000 = this;
         var10001 = field_307;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5123;
            return var2;
         }

         var10000 = this;
         var10001 = field_309;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5124;
            return var2;
         }

         var10000 = this;
         var10001 = field_308;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5123;
            return var2;
         }

         var10000 = this;
         var10001 = field_310;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5122;
            return var2;
         }

         var10000 = this;
         var10001 = OBSIDIAN;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5283;
            return var2;
         }

         var10000 = this;
         var10001 = TITANE;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5285;
            return var2;
         }

         var10000 = this;
         var10001 = EXONITE;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5286;
            return var2;
         }

         var10000 = this;
         var10001 = AMBRE;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5287;
            return var2;
         }

         var10000 = this;
         var10001 = MENORIUM;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5288;
            return var2;
         }

         var10000 = this;
         var10001 = AMBRE_R;
      }

      var2 = var10000 == var10001?class_1010.field_5284:null;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_611() {
      // $FF: Couldn't be decompiled
   }
}

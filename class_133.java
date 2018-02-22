
// $FF: renamed from: y
public enum class_133 {

   // $FF: renamed from: a y
   field_336,
   // $FF: renamed from: b y
   field_337,
   // $FF: renamed from: c y
   field_338,
   // $FF: renamed from: d y
   field_339,
   // $FF: renamed from: e y
   field_340,
   OBSIDIAN,
   TITANE,
   EXONITE,
   AMBRE,
   MENORIUM,
   RENFORCED;
   // $FF: renamed from: g int
   private final int field_341;
   // $FF: renamed from: h int
   private final int field_342;
   // $FF: renamed from: i float
   private final float field_343;
   // $FF: renamed from: j float
   private final float field_344;
   // $FF: renamed from: k int
   private final int field_345;
   // $FF: renamed from: l y[]
   private static final class_133[] field_346;
   // $FF: renamed from: m y[]
   private static final class_133[] field_347;
   // $FF: renamed from: n java.lang.String
   private static final String field_348;
   // $FF: renamed from: o y[]
   private static final class_133[] field_349;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, int, int, int, float, float, int) void
   private void method_627(String var1, int var2, String var3, int var4, String var5, int var6, int var7, int var8, float var9, float var10, int var11) {
      super(var1, var2);
      this.field_341 = var7;
      this.field_342 = var8;
      this.field_343 = var9;
      this.field_344 = var10;
      this.field_345 = var11;
   }

   // $FF: renamed from: b () int
   public int method_628() {
      return this.field_342;
   }

   // $FF: renamed from: c () float
   public float method_629() {
      return this.field_343;
   }

   // $FF: renamed from: d () float
   public float method_630() {
      return this.field_344;
   }

   // $FF: renamed from: e () int
   public int method_631() {
      return this.field_341;
   }

   // $FF: renamed from: f () int
   public int method_632() {
      return this.field_345;
   }

   // $FF: renamed from: g () adb
   public adb method_633() {
      String[] var1 = class_752.method_4253();
      class_133 var10000 = this;
      class_133 var10001 = field_336;
      adb var2;
      if(var1 != null) {
         if(this == field_336) {
            var2 = adb.method_2920(class_1192.field_6030);
            return var2;
         }

         var10000 = this;
         var10001 = field_337;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = adb.method_2920(class_1192.field_6029);
            return var2;
         }

         var10000 = this;
         var10001 = field_340;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5124;
            return var2;
         }

         var10000 = this;
         var10001 = field_338;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = class_1010.field_5123;
            return var2;
         }

         var10000 = this;
         var10001 = field_339;
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
         var10001 = RENFORCED;
      }

      var2 = var10000 == var10001?class_1010.field_5284:null;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_634() {
      // $FF: Couldn't be decompiled
   }
}

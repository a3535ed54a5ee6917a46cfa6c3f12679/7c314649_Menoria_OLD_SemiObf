import java.util.Map;

// $FF: renamed from: x
public enum class_132 {

   // $FF: renamed from: a x
   field_318,
   // $FF: renamed from: b x
   field_319,
   // $FF: renamed from: c x
   field_320,
   // $FF: renamed from: d x
   field_321;
   // $FF: renamed from: f java.util.Map
   private static final Map field_322;
   // $FF: renamed from: g int
   private final int field_323;
   // $FF: renamed from: h java.lang.String
   private final String field_324;
   // $FF: renamed from: i vL
   private IIcon field_325;
   // $FF: renamed from: j vL
   private IIcon field_326;
   // $FF: renamed from: k int
   private final int field_327;
   // $FF: renamed from: l float
   private final float field_328;
   // $FF: renamed from: m int
   private final int field_329;
   // $FF: renamed from: n float
   private final float field_330;
   // $FF: renamed from: o boolean
   private boolean field_331;
   // $FF: renamed from: p x[]
   private static final class_132[] field_332;
   // $FF: renamed from: q java.lang.String
   private static final String field_333;
   // $FF: renamed from: r x[]
   private static final class_132[] field_334;
   // $FF: renamed from: s java.lang.String[]
   private static final String[] field_335;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, int, java.lang.String, int, float, int, float) void
   private void method_612(String var1, int var2, String var3, int var4, int var5, String var6, int var7, float var8, int var9, float var10) {
      super(var1, var2);
      this.field_331 = false;
      this.field_323 = var5;
      this.field_324 = var6;
      this.field_327 = var7;
      this.field_328 = var8;
      this.field_329 = var9;
      this.field_330 = var10;
      this.field_331 = true;
   }

   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, int, java.lang.String, int, float) void
   private void method_613(String var1, int var2, String var3, int var4, int var5, String var6, int var7, float var8) {
      super(var1, var2);
      this.field_331 = false;
      this.field_323 = var5;
      this.field_324 = var6;
      this.field_327 = var7;
      this.field_328 = var8;
      this.field_329 = 0;
      this.field_330 = 0.0F;
      this.field_331 = false;
   }

   // $FF: renamed from: b () int
   public int method_614() {
      return this.field_323;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_615() {
      return this.field_324;
   }

   // $FF: renamed from: d () int
   public int method_616() {
      return this.field_327;
   }

   // $FF: renamed from: e () float
   public float method_617() {
      return this.field_328;
   }

   // $FF: renamed from: f () int
   public int method_618() {
      return this.field_329;
   }

   // $FF: renamed from: g () float
   public float method_619() {
      return this.field_330;
   }

   // $FF: renamed from: b (vM) void
   public void method_620(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      StringBuilder var10003 = new StringBuilder();
      String[] var3 = field_335;
      this.field_325 = var1.method_375(var10003.append("fish_").append(this.field_324).append("_raw").toString());
      String[] var2 = var10000;
      class_132 var4 = this;
      if(var2 != null) {
         if(!this.field_331) {
            return;
         }

         var4 = this;
      }

      StringBuilder var10002 = new StringBuilder();
      var3 = field_335;
      var4.field_326 = var1.method_375(var10002.append("fish_").append(this.field_324).append("_cooked").toString());
   }

   // $FF: renamed from: h () vL
   public IIcon method_621() {
      return this.field_325;
   }

   // $FF: renamed from: i () vL
   public IIcon method_622() {
      return this.field_326;
   }

   // $FF: renamed from: j () boolean
   public boolean method_623() {
      return this.field_331;
   }

   // $FF: renamed from: b (int) x
   public static class_132 method_624(int var0) {
      String[] var10000 = class_752.method_4253();
      class_132 var2 = (class_132)field_322.get(Integer.valueOf(var0));
      String[] var1 = var10000;
      class_132 var3 = var2;
      if(var1 != null) {
         var3 = var2 == null?field_318:var2;
      }

      return var3;
   }

   // $FF: renamed from: b (add) x
   public static class_132 method_625(add var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0.method_3730() instanceof class_558;
      class_132 var2;
      if(var1 != null) {
         if(var10000 == 0) {
            var2 = field_318;
            return var2;
         }

         var10000 = var0.method_3745();
      }

      var2 = method_624(var10000);
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_626() {
      // $FF: Couldn't be decompiled
   }
}

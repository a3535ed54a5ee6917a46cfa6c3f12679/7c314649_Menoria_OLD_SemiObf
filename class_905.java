
// $FF: renamed from: af
public enum class_905 {

   // $FF: renamed from: a af
   field_4445,
   // $FF: renamed from: b af
   field_4446,
   // $FF: renamed from: c af
   field_4447,
   // $FF: renamed from: d af
   field_4448,
   // $FF: renamed from: e af
   field_4449,
   // $FF: renamed from: f af
   field_4450;
   // $FF: renamed from: h int
   private final int field_4451;
   // $FF: renamed from: i int
   private final int field_4452;
   // $FF: renamed from: j int
   private final int field_4453;
   // $FF: renamed from: k int
   private final int field_4454;
   // $FF: renamed from: l int
   private final int field_4455;
   // $FF: renamed from: m af[]
   private static final class_905[] field_4456;
   // $FF: renamed from: n java.lang.String
   private static final String field_4457;
   // $FF: renamed from: o af[]
   // $FF: synthetic field
   private static final class_905[] field_4458;


   // $FF: renamed from: <init> (java.lang.String, int, int, int, int, int, int) void
   private void method_5321(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2);
      this.field_4451 = var3;
      this.field_4452 = var4;
      this.field_4453 = var5;
      this.field_4454 = var6;
      this.field_4455 = var7;
   }

   // $FF: renamed from: a () int
   public int method_5322() {
      return this.field_4453;
   }

   // $FF: renamed from: b () int
   public int method_5323() {
      return this.field_4454;
   }

   // $FF: renamed from: c () int
   public int method_5324() {
      return this.field_4455;
   }

   // $FF: renamed from: b (int) af
   public static class_905 method_5325(int var0) {
      return field_4456[var0 % field_4456.length];
   }

   // $FF: renamed from: <clinit> () void
   static void method_5326() {
      // $FF: Couldn't be decompiled
   }
}

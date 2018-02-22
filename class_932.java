
// $FF: renamed from: ay
public enum class_932 {

   // $FF: renamed from: a ay
   field_4754,
   // $FF: renamed from: b ay
   field_4755,
   // $FF: renamed from: c ay
   field_4756;
   // $FF: renamed from: e ay[]
   private static final class_932[] field_4757;
   // $FF: renamed from: f int
   private final int field_4758;
   // $FF: renamed from: g java.lang.String
   private final String field_4759;
   // $FF: renamed from: h ay[]
   private static final class_932[] field_4760;
   // $FF: renamed from: i java.lang.String
   private static final String field_4761;
   // $FF: renamed from: j ay[]
   private static final class_932[] field_4762;
   // $FF: renamed from: k ay[]
   private static final class_932[] field_4763;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, int, int, java.lang.String) void
   private void method_5458(String var1, int var2, String var3, int var4, String var5, int var6, int var7, String var8) {
      super(var1, var2);
      this.field_4758 = var7;
      this.field_4759 = var8;
   }

   // $FF: renamed from: b () int
   public int method_5459() {
      return this.field_4758;
   }

   // $FF: renamed from: b (int) ay
   public static class_932 method_5460(int var0) {
      return field_4757[var0 % field_4757.length];
   }

   // $FF: renamed from: c () java.lang.String
   public String method_5461() {
      return this.field_4759;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5462() {
      // $FF: Couldn't be decompiled
   }
}

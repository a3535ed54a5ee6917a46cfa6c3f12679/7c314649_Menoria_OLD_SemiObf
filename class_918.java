
// $FF: renamed from: aq
public enum class_918 {

   // $FF: renamed from: a aq
   field_4627,
   // $FF: renamed from: b aq
   field_4628,
   // $FF: renamed from: c aq
   field_4629,
   // $FF: renamed from: d aq
   field_4630;
   // $FF: renamed from: f aq[]
   private static final class_918[] field_4631;
   // $FF: renamed from: g int
   private final int field_4632;
   // $FF: renamed from: h java.lang.String
   private final String field_4633;
   // $FF: renamed from: i java.lang.String
   private static final String field_4634;
   // $FF: renamed from: j aq[]
   // $FF: synthetic field
   private static final class_918[] field_4635;


   // $FF: renamed from: <init> (java.lang.String, int, int, java.lang.String) void
   private void method_5391(String var1, int var2, int var3, String var4) {
      super(var1, var2);
      this.field_4632 = var3;
      this.field_4633 = var4;
   }

   // $FF: renamed from: b () int
   public int method_5392() {
      return this.field_4632;
   }

   // $FF: renamed from: b (int) aq
   public static class_918 method_5393(int var0) {
      return field_4631[var0 % field_4631.length];
   }

   // $FF: renamed from: c () java.lang.String
   public String method_5394() {
      return this.field_4633;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5395() {
      // $FF: Couldn't be decompiled
   }
}

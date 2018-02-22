import java.util.Map;

// $FF: renamed from: R
public enum class_103 {

   // $FF: renamed from: a R
   field_147,
   // $FF: renamed from: b R
   field_148;
   // $FF: renamed from: d java.util.Map
   private static final Map field_149;
   // $FF: renamed from: e java.lang.String
   private final String field_150;
   // $FF: renamed from: f R[]
   private static final class_103[] field_151;
   // $FF: renamed from: g java.lang.String
   private static final String field_152;
   // $FF: renamed from: h R[]
   private static final class_103[] field_153;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String) void
   private void method_487(String var1, int var2, String var3, int var4, String var5) {
      super(var1, var2);
      this.field_150 = var5;
   }

   // $FF: renamed from: b (java.lang.String) R
   public static class_103 method_488(String var0) {
      return (class_103)field_149.get(var0.toLowerCase());
   }

   // $FF: renamed from: <clinit> () void
   static void method_489() {
      // $FF: Couldn't be decompiled
   }
}

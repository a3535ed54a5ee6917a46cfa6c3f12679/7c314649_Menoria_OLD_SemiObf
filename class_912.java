import java.util.Map;

// $FF: renamed from: am
public enum class_912 {

   // $FF: renamed from: a am
   field_4589,
   // $FF: renamed from: b am
   field_4590,
   // $FF: renamed from: c am
   field_4591;
   // $FF: renamed from: e java.util.Map
   private static final Map field_4592;
   // $FF: renamed from: f boolean
   private final boolean field_4593;
   // $FF: renamed from: g java.lang.String
   private final String field_4594;
   // $FF: renamed from: h am[]
   private static final class_912[] field_4595;
   // $FF: renamed from: i java.lang.String
   private static final String field_4596;
   // $FF: renamed from: j am[]
   private static final class_912[] field_4597;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, boolean) void
   private void method_5370(String var1, int var2, String var3, int var4, String var5, boolean var6) {
      super(var1, var2);
      this.field_4594 = var5;
      this.field_4593 = var6;
   }

   // $FF: renamed from: b () boolean
   public boolean method_5371() {
      return this.field_4593;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_5372() {
      return this.field_4594;
   }

   // $FF: renamed from: b (java.lang.String) am
   public static class_912 method_5373(String var0) {
      return (class_912)field_4592.get(var0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5374() {
      // $FF: Couldn't be decompiled
   }
}

import java.util.Map;

// $FF: renamed from: al
public enum class_911 {

   // $FF: renamed from: a al
   field_4578,
   // $FF: renamed from: b al
   field_4579,
   // $FF: renamed from: c al
   field_4580,
   // $FF: renamed from: d al
   field_4581,
   // $FF: renamed from: e al
   field_4582;
   // $FF: renamed from: g java.util.Map
   private static final Map field_4583;
   // $FF: renamed from: h boolean
   private final boolean field_4584;
   // $FF: renamed from: i java.lang.String
   private final String field_4585;
   // $FF: renamed from: j al[]
   private static final class_911[] field_4586;
   // $FF: renamed from: k java.lang.String
   private static final String field_4587;
   // $FF: renamed from: l al[]
   private static final class_911[] field_4588;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, boolean) void
   private void method_5365(String var1, int var2, String var3, int var4, String var5, boolean var6) {
      super(var1, var2);
      this.field_4585 = var5;
      this.field_4584 = var6;
   }

   // $FF: renamed from: b () boolean
   public boolean method_5366() {
      return this.field_4584;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_5367() {
      return this.field_4585;
   }

   // $FF: renamed from: b (java.lang.String) al
   public static class_911 method_5368(String var0) {
      return (class_911)field_4583.get(var0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5369() {
      // $FF: Couldn't be decompiled
   }
}

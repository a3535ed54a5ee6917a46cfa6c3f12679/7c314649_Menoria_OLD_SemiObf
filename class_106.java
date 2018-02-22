import com.google.common.collect.Maps;
import java.util.Map;

// $FF: renamed from: W
public enum class_106 {

   // $FF: renamed from: a W
   field_179,
   // $FF: renamed from: b W
   field_180;
   // $FF: renamed from: d java.lang.String
   private final String field_181;
   // $FF: renamed from: e java.lang.String
   private final String field_182;
   // $FF: renamed from: f int
   private final int field_183;
   // $FF: renamed from: g java.util.Map
   private final Map field_184;
   // $FF: renamed from: h W[]
   private static final class_106[] field_185;
   // $FF: renamed from: i java.lang.String
   private static final String field_186;
   // $FF: renamed from: j W[]
   private static final class_106[] field_187;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, int) void
   private void method_498(String var1, int var2, String var3, int var4, String var5, String var6, int var7) {
      super(var1, var2);
      this.field_184 = Maps.newHashMap();
      this.field_181 = var5;
      this.field_182 = var6;
      this.field_183 = var7;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_499() {
      return this.field_181;
   }

   // $FF: renamed from: c () java.lang.String
   protected String method_500() {
      return this.field_182;
   }

   // $FF: renamed from: d () int
   protected int method_501() {
      return this.field_183;
   }

   // $FF: renamed from: e () java.util.Map
   protected Map method_502() {
      return this.field_184;
   }

   // $FF: renamed from: <clinit> () void
   static void method_503() {
      // $FF: Couldn't be decompiled
   }
}

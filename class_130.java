import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

// $FF: renamed from: v
public enum class_130 {

   // $FF: renamed from: a v
   field_276,
   // $FF: renamed from: b v
   field_277,
   // $FF: renamed from: c v
   field_278,
   // $FF: renamed from: d v
   field_279,
   // $FF: renamed from: e v
   field_280,
   // $FF: renamed from: f v
   field_281,
   // $FF: renamed from: g v
   field_282,
   // $FF: renamed from: h v
   field_283,
   // $FF: renamed from: i v
   field_284,
   // $FF: renamed from: j v
   field_285,
   // $FF: renamed from: k v
   field_286,
   // $FF: renamed from: l v
   field_287,
   // $FF: renamed from: m v
   field_288,
   // $FF: renamed from: n v
   field_289,
   // $FF: renamed from: o v
   field_290,
   // $FF: renamed from: p v
   field_291,
   // $FF: renamed from: q v
   field_292,
   // $FF: renamed from: r v
   field_293,
   // $FF: renamed from: s v
   field_294,
   // $FF: renamed from: t v
   field_295,
   // $FF: renamed from: u v
   field_296,
   // $FF: renamed from: v v
   field_297;
   // $FF: renamed from: x java.util.Map
   private static final Map field_298;
   // $FF: renamed from: y java.util.Map
   private static final Map field_299;
   // $FF: renamed from: z java.util.regex.Pattern
   private static final Pattern field_300;
   // $FF: renamed from: A char
   private final char field_301;
   // $FF: renamed from: B boolean
   private final boolean field_302;
   // $FF: renamed from: C java.lang.String
   private final String field_303;
   // $FF: renamed from: D java.lang.String
   private static final String field_304;
   // $FF: renamed from: E v[]
   // $FF: synthetic field
   private static final class_130[] field_305;


   // $FF: renamed from: <init> (java.lang.String, int, char) void
   private void method_596(String var1, int var2, char var3) {
      this.method_597(var1, var2, var3, false);
   }

   // $FF: renamed from: <init> (java.lang.String, int, char, boolean) void
   private void method_597(String var1, int var2, char var3, boolean var4) {
      super(var1, var2);
      this.field_301 = var3;
      this.field_302 = var4;
      this.field_303 = "§" + var3;
   }

   // $FF: renamed from: b () char
   public char method_598() {
      return this.field_301;
   }

   // $FF: renamed from: c () boolean
   public boolean method_599() {
      return this.field_302;
   }

   // $FF: renamed from: d () boolean
   public boolean method_600() {
      boolean var2;
      label17: {
         String[] var1 = class_752.method_4253();
         class_130 var10000 = this;
         if(var1 != null) {
            if(this.field_302) {
               break label17;
            }

            var10000 = this;
         }

         if(var10000 != field_297) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_601() {
      return this.name().toLowerCase();
   }

   public String toString() {
      return this.field_303;
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static String method_602(String var0) {
      return var0 == null?null:field_300.matcher(var0).replaceAll("");
   }

   // $FF: renamed from: c (java.lang.String) v
   public static class_130 method_603(String var0) {
      String[] var1 = class_752.method_4253();
      Object var10000 = var0;
      class_130 var2;
      if(var1 != null) {
         if(var0 == null) {
            var2 = null;
            return var2;
         }

         var10000 = field_299.get(var0.toLowerCase());
      }

      var2 = (class_130)var10000;
      return var2;
   }

   // $FF: renamed from: b (boolean, boolean) java.util.Collection
   public static Collection method_604(boolean var0, boolean var1) {
      String[] var10000 = class_752.method_4253();
      ArrayList var3 = new ArrayList();
      String[] var2 = var10000;
      class_130[] var4 = values();
      int var5 = var4.length;
      int var6 = 0;

      while(var6 < var5) {
         label47: {
            class_130 var7 = var4[var6];
            boolean var8 = var7.method_600();
            if(var2 != null) {
               label37: {
                  if(var8) {
                     var8 = var0;
                     if(var2 == null) {
                        break label37;
                     }

                     if(!var0) {
                        break label47;
                     }
                  }

                  var8 = var7.method_599();
               }
            }

            if(var2 != null && (!var8 || var2 != null && var1)) {
               var3.add(var7.method_601());
            }
         }

         ++var6;
         if(var2 == null) {
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_605() {
      // $FF: Couldn't be decompiled
   }
}

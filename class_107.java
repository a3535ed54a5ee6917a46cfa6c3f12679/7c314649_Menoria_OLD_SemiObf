
// $FF: renamed from: X
public enum class_107 {

   // $FF: renamed from: a X
   field_188,
   // $FF: renamed from: b X
   field_189;
   // $FF: renamed from: d java.lang.String
   private final String field_190;
   // $FF: renamed from: e X[]
   private static final class_107[] field_191;
   // $FF: renamed from: f java.lang.String
   private static final String field_192;
   // $FF: renamed from: g X[]
   private static final class_107[] field_193;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String) void
   private void method_504(String var1, int var2, String var3, int var4, String var5) {
      super(var1, var2);
      this.field_190 = var5;
   }

   // $FF: renamed from: b (java.lang.String) X
   public static class_107 method_505(String var0) {
      String[] var10000 = class_752.method_4253();
      class_107[] var2 = values();
      String[] var1 = var10000;
      int var3 = var2.length;
      int var4 = 0;

      while(var4 < var3) {
         class_107 var5 = var2[var4];
         if(var1 != null) {
            if(var5.field_190.equals(var0)) {
               return var5;
            }

            ++var4;
         }

         if(var1 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_506() {
      // $FF: Couldn't be decompiled
   }
}

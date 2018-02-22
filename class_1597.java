import java.util.concurrent.Callable;

// $FF: renamed from: tJ
class class_1597 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8315;
   // $FF: renamed from: b kj
   final class_1346 field_8316;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8317;


   // $FF: renamed from: <init> (kj) void
   void method_8733(class_1346 var1) {
      this.field_8316 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8734() {
      byte var1 = 0;
      int var2 = 56 * var1;
      int var3 = var2 / 1024 / 1024;
      byte var4 = 0;
      int var5 = 56 * var4;
      int var6 = var5 / 1024 / 1024;
      StringBuilder var10000 = (new StringBuilder()).append(var1);
      String[] var7 = field_8317;
      return var10000.append(" (").append(var2).append(" bytes; ").append(var3).append(" MB) allocated, ").append(var4).append(" (").append(var5).append(" bytes; ").append(var6).append(" MB) used").toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8735() {
      // $FF: Couldn't be decompiled
   }
}

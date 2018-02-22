import java.util.concurrent.Callable;

// $FF: renamed from: tG
class class_1594 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8306;
   // $FF: renamed from: b kj
   final class_1346 field_8307;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8308;


   // $FF: renamed from: <init> (kj) void
   void method_8726(class_1346 var1) {
      this.field_8307 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8727() {
      Runtime var1 = Runtime.getRuntime();
      long var2 = var1.maxMemory();
      long var4 = var1.totalMemory();
      long var6 = var1.freeMemory();
      long var8 = var2 / 1024L / 1024L;
      long var10 = var4 / 1024L / 1024L;
      long var12 = var6 / 1024L / 1024L;
      StringBuilder var10000 = (new StringBuilder()).append(var6);
      String[] var14 = field_8308;
      return var10000.append(" bytes (").append(var12).append(" MB) / ").append(var4).append(" bytes (").append(var10).append(" MB) up to ").append(var2).append(" bytes (").append(var8).append(" MB)").toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8728() {
      // $FF: Couldn't be decompiled
   }
}

import java.util.concurrent.Callable;

// $FF: renamed from: kA
class class_1305 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6709;
   // $FF: renamed from: b bao
   final bao field_6710;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6711;


   // $FF: renamed from: <init> (bao) void
   void method_6894(bao var1) {
      this.field_6710 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6895() {
      byte var1 = 0;
      int var2 = 56 * var1;
      int var3 = var2 / 1024 / 1024;
      byte var4 = 0;
      int var5 = 56 * var4;
      int var6 = var5 / 1024 / 1024;
      StringBuilder var10000 = (new StringBuilder()).append(var1);
      String[] var7 = field_6711;
      return var10000.append(" (").append(var2).append(" bytes; ").append(var3).append(" MB) allocated, ").append(var4).append(" (").append(var5).append(" bytes; ").append(var6).append(" MB) used").toString();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_6896() {
      return this.method_6895();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6897() {
      // $FF: Couldn't be decompiled
   }
}

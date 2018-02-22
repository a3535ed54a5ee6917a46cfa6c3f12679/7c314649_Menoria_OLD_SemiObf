
// $FF: renamed from: rN
class class_1544 {

   // $FF: renamed from: b long
   private final long field_8097;
   // $FF: renamed from: c int
   private final int field_8098;
   // $FF: renamed from: d double
   private final double field_8099;
   // $FF: renamed from: e java.lang.String
   private static final String field_8100;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8101;


   // $FF: renamed from: <init> (long, int, double) void
   private void method_8391(long var1, int var3, double var4) {
      super();
      this.field_8097 = var1;
      this.field_8098 = var3;
      this.field_8099 = var4;
   }

   // $FF: renamed from: b (long) rN
   public class_1544 method_8392(long var1) {
      class_1544 var10000 = new class_1544;
      var10000.method_8391(var1 + this.field_8097, this.field_8098 + 1, (double)((var1 + this.field_8097) / (long)(this.field_8098 + 1)));
      return var10000;
   }

   // $FF: renamed from: b () long
   public long method_8393() {
      return this.field_8097;
   }

   // $FF: renamed from: c () int
   public int method_8394() {
      return this.field_8098;
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_8101;
      return var10000.append("{totalBytes=").append(this.field_8097).append(", count=").append(this.field_8098).append(", averageBytes=").append(this.field_8099).append('}').toString();
   }

   // $FF: renamed from: <init> (long, int, double, java.lang.Object) void
   void method_8395(long var1, int var3, double var4, Object var6) {
      this.method_8391(var1, var3, var4);
   }

   // $FF: renamed from: b (rN) long
   static long method_8396(class_1544 var0) {
      return var0.field_8097;
   }

   // $FF: renamed from: c (rN) int
   static int method_8397(class_1544 var0) {
      return var0.field_8098;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8398() {
      // $FF: Couldn't be decompiled
   }
}

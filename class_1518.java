import java.util.concurrent.Callable;

// $FF: renamed from: rA
class class_1518 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7991;
   // $FF: renamed from: b kj
   final class_1346 field_7992;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7993;


   // $FF: renamed from: <init> (kj) void
   void method_8242(class_1346 var1) {
      this.field_7992 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8243() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_7993;
      return var10000.append(System.getProperty("java.version")).append(", ").append(System.getProperty("java.vendor")).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8244() {
      // $FF: Couldn't be decompiled
   }
}

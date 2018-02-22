import java.util.concurrent.Callable;

// $FF: renamed from: rO
class class_1546 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8107;
   // $FF: renamed from: b kj
   final class_1346 field_8108;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8109;


   // $FF: renamed from: <init> (kj) void
   void method_8402(class_1346 var1) {
      this.field_8108 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8403() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_8109;
      return var10000.append(System.getProperty("java.vm.name")).append(" (").append(System.getProperty("java.vm.info")).append("), ").append(System.getProperty("java.vm.vendor")).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8404() {
      // $FF: Couldn't be decompiled
   }
}

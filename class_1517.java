import java.util.concurrent.Callable;

// $FF: renamed from: q_
class class_1517 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7988;
   // $FF: renamed from: b kj
   final class_1346 field_7989;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7990;


   // $FF: renamed from: <init> (kj) void
   void method_8239(class_1346 var1) {
      this.field_7989 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8240() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_7990;
      return var10000.append(System.getProperty("os.name")).append(" (").append(System.getProperty("os.arch")).append(") version ").append(System.getProperty("os.version")).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8241() {
      // $FF: Couldn't be decompiled
   }
}

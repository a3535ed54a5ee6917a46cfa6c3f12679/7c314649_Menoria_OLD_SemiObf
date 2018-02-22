
// $FF: renamed from: AG
public class class_643 extends RuntimeException {

   // $FF: renamed from: b kj
   private final class_1346 field_2776;


   // $FF: renamed from: <init> (kj) void
   public void method_3525(class_1346 var1) {
      super();
      this.field_2776 = var1;
   }

   // $FF: renamed from: b () kj
   public class_1346 method_3526() {
      return this.field_2776;
   }

   public Throwable getCause() {
      return this.field_2776.method_7143();
   }

   public String getMessage() {
      return this.field_2776.method_7142();
   }
}

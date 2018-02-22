import java.util.concurrent.Callable;

// $FF: renamed from: uc
class class_1658 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8629;
   // $FF: renamed from: b int
   final int field_8630;
   // $FF: renamed from: c ub
   final class_1657 field_8631;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8632;


   // $FF: renamed from: <init> (ub, int) void
   void method_9125(class_1657 var1, int var2) {
      this.field_8631 = var1;
      this.field_8630 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_9126() {
      StringBuilder var10000 = new StringBuilder();
      String[] var2 = field_8632;
      String var1 = var10000.append("Once per ").append(this.field_8630).append(" ticks").toString();
      if(this.field_8630 == Integer.MAX_VALUE) {
         var1 = "Maximum (" + var1 + ")";
      }

      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9127() {
      // $FF: Couldn't be decompiled
   }
}

import java.util.concurrent.Callable;

// $FF: renamed from: gE
class class_1067 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_5615;
   // $FF: renamed from: b gi
   final class_580 field_5616;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5617;


   // $FF: renamed from: <init> (gi) void
   void method_6004(class_580 var1) {
      this.field_5616 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6005() {
      int var1 = this.field_5616.field_2464.method_33(this.field_5616.field_2465, this.field_5616.field_2466, this.field_5616.field_2467);
      String[] var3;
      if(var1 < 0) {
         StringBuilder var10000 = new StringBuilder();
         var3 = field_5617;
         return var10000.append("Unknown? (Got ").append(var1).append(")").toString();
      } else {
         var3 = field_5617;
         String var2 = String.format("%4s", new Object[]{Integer.toBinaryString(var1)}).replace(" ", "0");
         return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[]{Integer.valueOf(var1), var2});
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_6006() {
      // $FF: Couldn't be decompiled
   }
}

import java.util.concurrent.Callable;

// $FF: renamed from: t_
final class class_1617 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8419;
   // $FF: renamed from: b int
   final int field_8420;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8421;


   // $FF: renamed from: <init> (int) void
   void method_8830(int var1) {
      this.field_8420 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8831() {
      String[] var2;
      if(this.field_8420 < 0) {
         StringBuilder var10000 = new StringBuilder();
         var2 = field_8421;
         return var10000.append("Unknown? (Got ").append(this.field_8420).append(")").toString();
      } else {
         var2 = field_8421;
         String var1 = String.format("%4s", new Object[]{Integer.toBinaryString(this.field_8420)}).replace(" ", "0");
         return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[]{Integer.valueOf(this.field_8420), var1});
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_8832() {
      // $FF: Couldn't be decompiled
   }
}

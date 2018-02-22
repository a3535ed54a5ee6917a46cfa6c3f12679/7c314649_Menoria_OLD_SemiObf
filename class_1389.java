
// $FF: renamed from: nI
class class_1389 implements class_59 {

   // $FF: renamed from: a boolean
   private boolean field_7384;
   // $FF: renamed from: b java.lang.String
   private static final String field_7385;
   // $FF: renamed from: c nF
   final class_1386 field_7386;
   // $FF: renamed from: d l
   final class_120 field_7387;
   // $FF: renamed from: e nH
   final class_1388 field_7388;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7389;


   // $FF: renamed from: <init> (nH, nF, l) void
   void method_7590(class_1388 var1, class_1386 var2, class_120 var3) {
      this.field_7388 = var1;
      this.field_7386 = var2;
      this.field_7387 = var3;
      super();
      this.field_7384 = false;
   }

   // $FF: renamed from: b (tC) void
   public void method_242(class_300 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tB) void
   public void method_243(class_302 var1) {
      long var2 = var1.method_1729();
      long var4 = bao.method_5283();
      this.field_7386.field_7365 = var4 - var2;
      class_120 var10000 = this.field_7387;
      class_1082 var10001 = new class_1082;
      String[] var10003 = field_7389;
      var10001.method_6134("Finished");
      var10000.method_558(var10001);
   }

   // $FF: renamed from: b (rV) void
   public void method_237(class_66 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ag, ag) void
   public void method_238(class_906 var1, class_906 var2) {
      try {
         if(var2 != class_906.field_4461) {
            UnsupportedOperationException var10000 = new UnsupportedOperationException;
            StringBuilder var10002 = new StringBuilder();
            String[] var10003 = field_7389;
            var10000.<init>(var10002.append("Unexpected change in protocol to ").append(var2).toString());
            throw var10000;
         }
      } catch (UnsupportedOperationException var3) {
         throw method_7591(var3);
      }
   }

   // $FF: renamed from: b () void
   public void method_239() {}

   // $FF: renamed from: b (java.lang.UnsupportedOperationException) java.lang.UnsupportedOperationException
   private static UnsupportedOperationException method_7591(UnsupportedOperationException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7592() {
      // $FF: Couldn't be decompiled
   }
}

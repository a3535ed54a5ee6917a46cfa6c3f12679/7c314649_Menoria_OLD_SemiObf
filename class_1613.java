
// $FF: renamed from: u8
final class class_1613 implements class_71 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8413;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8414;


   // $FF: renamed from: <init> () void
   void method_8819() {
      super();
   }

   // $FF: renamed from: b (int) java.lang.String
   public String method_364(int var1) {
      String[] var10000 = class_752.method_4253();
      double var3 = (double)var1 / 100.0D;
      String[] var2 = var10000;
      double var5 = var3 / 1000.0D;
      double var11;
      int var8 = (var11 = var5 - 0.5D) == 0.0D?0:(var11 < 0.0D?-1:1);
      String[] var7;
      StringBuilder var9;
      String var10;
      if(var2 != null) {
         if(var8 > 0) {
            var9 = (new StringBuilder()).append(class_1601.method_8759().format(var5));
            var7 = field_8414;
            var10 = var9.append(" km").toString();
            return var10;
         }

         double var12;
         var8 = (var12 = var3 - 0.5D) == 0.0D?0:(var12 < 0.0D?-1:1);
      }

      if(var8 > 0) {
         var9 = (new StringBuilder()).append(class_1601.method_8759().format(var3));
         var7 = field_8414;
         var10 = var9.append(" m").toString();
      } else {
         var9 = (new StringBuilder()).append(var1);
         String[] var10001 = field_8414;
         var10 = var9.append(" cm").toString();
      }

      return var10;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8820() {
      // $FF: Couldn't be decompiled
   }
}

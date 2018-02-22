
// $FF: renamed from: u7
final class class_1611 implements class_71 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8408;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8409;


   // $FF: renamed from: <init> () void
   void method_8813() {
      super();
   }

   // $FF: renamed from: b (int) java.lang.String
   public String method_364(int var1) {
      double var3 = (double)var1 / 20.0D;
      String[] var2 = class_752.method_4253();
      double var5 = var3 / 60.0D;
      double var7 = var5 / 60.0D;
      double var9 = var7 / 24.0D;
      double var11 = var9 / 365.0D;
      double var16;
      int var10000 = (var16 = var11 - 0.5D) == 0.0D?0:(var16 < 0.0D?-1:1);
      String[] var13;
      StringBuilder var14;
      String var15;
      if(var2 != null) {
         if(var10000 > 0) {
            var14 = (new StringBuilder()).append(class_1601.method_8759().format(var11));
            var13 = field_8409;
            var15 = var14.append(" y").toString();
            return var15;
         }

         double var17;
         var10000 = (var17 = var9 - 0.5D) == 0.0D?0:(var17 < 0.0D?-1:1);
      }

      if(var2 != null) {
         if(var10000 > 0) {
            var14 = (new StringBuilder()).append(class_1601.method_8759().format(var9));
            var13 = field_8409;
            var15 = var14.append(" d").toString();
            return var15;
         }

         double var18;
         var10000 = (var18 = var7 - 0.5D) == 0.0D?0:(var18 < 0.0D?-1:1);
      }

      if(var2 != null) {
         if(var10000 > 0) {
            var14 = (new StringBuilder()).append(class_1601.method_8759().format(var7));
            var13 = field_8409;
            var15 = var14.append(" h").toString();
            return var15;
         }

         double var19;
         var10000 = (var19 = var5 - 0.5D) == 0.0D?0:(var19 < 0.0D?-1:1);
      }

      if(var10000 > 0) {
         var14 = (new StringBuilder()).append(class_1601.method_8759().format(var5));
         var13 = field_8409;
         var15 = var14.append(" m").toString();
      } else {
         var14 = (new StringBuilder()).append(var3);
         String[] var10001 = field_8409;
         var15 = var14.append(" s").toString();
      }

      return var15;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8814() {
      // $FF: Couldn't be decompiled
   }
}

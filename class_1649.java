
// $FF: renamed from: uZ
public class class_1649 {

   // $FF: renamed from: b int[]
   public static final int[] field_8587;
   // $FF: renamed from: c int[]
   public static final int[] field_8588;
   // $FF: renamed from: d java.lang.String[]
   public static final String[] field_8589;
   // $FF: renamed from: e int[]
   public static final int[] field_8590;
   // $FF: renamed from: f int[]
   public static final int[] field_8591;
   // $FF: renamed from: g int[]
   public static final int[] field_8592;
   // $FF: renamed from: h int[]
   public static final int[] field_8593;
   // $FF: renamed from: i int[]
   public static final int[] field_8594;
   // $FF: renamed from: j int[][]
   public static final int[][] field_8595;


   // $FF: renamed from: b (double, double) int
   public static int method_9086(double var0, double var2) {
      String[] var4 = class_752.method_4253();
      float var5;
      int var10000 = (var5 = class_1715.method_9564((float)var0) - class_1715.method_9564((float)var2)) == 0.0F?0:(var5 < 0.0F?-1:1);
      if(var4 != null) {
         if(var10000 > 0) {
            double var6;
            var10000 = (var6 = var0 - 0.0D) == 0.0D?0:(var6 < 0.0D?-1:1);
            if(var4 != null) {
               if(var10000 > 0) {
                  return 1;
               }

               var10000 = 3;
            }

            return var10000;
         }

         double var7;
         var10000 = (var7 = var2 - 0.0D) == 0.0D?0:(var7 < 0.0D?-1:1);
      }

      if(var4 != null) {
         if(var10000 > 0) {
            return 2;
         }

         var10000 = 0;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9087() {
      // $FF: Couldn't be decompiled
   }
}

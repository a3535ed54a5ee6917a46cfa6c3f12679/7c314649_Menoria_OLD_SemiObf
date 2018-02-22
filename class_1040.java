
// $FF: renamed from: dj
public class class_1040 {

   // $FF: renamed from: b int[]
   private static int[] field_5503;


   // $FF: renamed from: b (int[]) void
   public static void method_5890(int[] var0) {
      field_5503 = var0;
   }

   // $FF: renamed from: b (double, double) int
   public static int method_5891(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0D - var0) * 255.0D);
      int var5 = (int)((1.0D - var2) * 255.0D);
      return field_5503[var5 << 8 | var4];
   }

   // $FF: renamed from: <clinit> () void
   static void method_5892() {
      field_5503 = new int[65536];
   }
}

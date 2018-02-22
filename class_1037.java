
// $FF: renamed from: dg
public class class_1037 {

   // $FF: renamed from: b int[]
   private static int[] field_5493;


   // $FF: renamed from: b (int[]) void
   public static void method_5868(int[] var0) {
      field_5493 = var0;
   }

   // $FF: renamed from: b (double, double) int
   public static int method_5869(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0D - var0) * 255.0D);
      int var5 = (int)((1.0D - var2) * 255.0D);
      return field_5493[var5 << 8 | var4];
   }

   // $FF: renamed from: b () int
   public static int method_5870() {
      return 6396257;
   }

   // $FF: renamed from: c () int
   public static int method_5871() {
      return 8431445;
   }

   // $FF: renamed from: d () int
   public static int method_5872() {
      return 4764952;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5873() {
      field_5493 = new int[65536];
   }
}

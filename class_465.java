import java.util.List;

// $FF: renamed from: e4
public class class_465 extends class_464 {

   // $FF: renamed from: M java.lang.String[]
   public static final String[] field_2230;
   // $FF: renamed from: O vL
   private static class_73 field_2231;
   // $FF: renamed from: P vL
   private static class_73 field_2232;
   // $FF: renamed from: Q java.lang.String[]
   private static final String[] field_2233;


   // $FF: renamed from: <init> () void
   public void method_2812() {
      super.method_2812();
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return var2 == 1?field_2232:field_2231;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var2 = field_2233;
      field_2231 = var1.method_375("sand");
      field_2232 = var1.method_375("red_sand");
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 1);
      var3.add(var10001);
   }

   // $FF: renamed from: f (int) jj
   public class_1319 method_2425(int var1) {
      return var1 == 1?class_1319.field_6757:class_1319.field_6749;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

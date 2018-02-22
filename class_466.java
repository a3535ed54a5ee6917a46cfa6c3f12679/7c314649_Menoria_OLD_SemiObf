import java.util.Random;

// $FF: renamed from: e3
public class class_466 extends class_464 {

   // $FF: renamed from: <init> () void
   public void method_2812() {
      super.method_2812();
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var3;
      if(var4 != null) {
         if(var3 > 3) {
            var3 = 3;
         }

         var10000 = var2.nextInt(10 - var3 * 3);
      }

      return var10000 == 0?class_1010.field_5176:adb.method_2920(this);
   }
}

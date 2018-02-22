import java.util.List;

// $FF: renamed from: eN
public class class_438 extends aji {

   // $FF: renamed from: M vL[]
   private class_73[] field_2172;


   // $FF: renamed from: <init> (awt) void
   public void method_2427(awt var1) {
      super.method_2427(var1);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return this.field_2172[var2 % this.field_2172.length];
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1;
   }

   // $FF: renamed from: c (int) int
   public static int method_2751(int var0) {
      return method_2752(var0);
   }

   // $FF: renamed from: d (int) int
   public static int method_2752(int var0) {
      return ~var0 & 15;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < 16) {
         add var10001 = new add;
         var10001.method_3726(var1, 1, var5);
         var3.add(var10001);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2172 = new class_73[16];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_2172.length) {
         this.field_2172[var3] = var1.method_375(this.method_2533() + "_" + class_537.field_2386[method_2752(var3)]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: f (int) jj
   public class_1319 method_2425(int var1) {
      return class_1319.method_6942(var1);
   }
}

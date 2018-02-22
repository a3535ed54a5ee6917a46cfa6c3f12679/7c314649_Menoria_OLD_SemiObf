import java.util.Random;

// $FF: renamed from: dB
public class class_1005 extends class_985 {

   // $FF: renamed from: <init> (int) void
   public void method_5691(int var1) {
      super.method_5691(var1);
      this.field_5045.clear();
      this.field_5034 = class_1192.field_6037;
      this.field_5036 = class_1192.field_6037;
      this.field_5043.field_5444 = -999;
      this.field_5043.field_5447 = 2;
      this.field_5043.field_5449 = 50;
      this.field_5043.field_5450 = 10;
      this.field_5045.clear();
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      super.method_5714(var1, var2, var3, var4);
      String[] var5 = var10000;
      int var9 = var2.nextInt(1000);
      if(var5 != null) {
         if(var9 != 0) {
            return;
         }

         var9 = var3 + var2.nextInt(16) + 8;
      }

      int var6 = var9;
      int var7 = var4 + var2.nextInt(16) + 8;
      class_1156 var10 = new class_1156;
      var10.method_6349();
      class_1156 var8 = var10;
      var8.method_6351(var1, var2, var6, var1.method_2071(var6, var7) + 1, var7);
   }
}

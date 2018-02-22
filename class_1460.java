
// $FF: renamed from: qJ
public class class_1460 implements class_41 {

   // $FF: renamed from: <init> () void
   public void method_7939() {
      super();
   }

   // $FF: renamed from: b (qH, add) add
   public final add method_176(class_48 var1, add var2) {
      add var3 = this.method_7940(var1, var2);
      this.method_7942(var1);
      this.method_7943(var1, class_484.method_2849(var1.method_186()));
      return var3;
   }

   // $FF: renamed from: a (qH, add) add
   protected add method_7940(class_48 var1, add var2) {
      class_905 var3 = class_484.method_2849(var1.method_186());
      class_45 var4 = class_484.method_2848(var1);
      add var5 = var2.method_3729(1);
      method_7941(var1.method_182(), var5, 6, var3, var4);
      return var2;
   }

   // $FF: renamed from: b (ahb, add, int, af, q7) void
   public static void method_7941(ahb var0, add var1, int var2, class_905 var3, class_45 var4) {
      double var5 = var4.method_179();
      double var7 = var4.method_180();
      double var9 = var4.method_181();
      class_699 var10000 = new class_699;
      var10000.method_4025(var0, var5, var7 - 0.3D, var9, var1);
      class_699 var11 = var10000;
      double var12 = var0.field_1819.nextDouble() * 0.1D + 0.2D;
      var11.field_2997 = (double)var3.method_5322() * var12;
      var11.field_2998 = 0.20000000298023224D;
      var11.field_2999 = (double)var3.method_5324() * var12;
      var11.field_2997 += var0.field_1819.nextGaussian() * 0.007499999832361937D * (double)var2;
      var11.field_2998 += var0.field_1819.nextGaussian() * 0.007499999832361937D * (double)var2;
      var11.field_2999 += var0.field_1819.nextGaussian() * 0.007499999832361937D * (double)var2;
      var0.method_2089(var11);
   }

   // $FF: renamed from: b (qH) void
   protected void method_7942(class_48 var1) {
      var1.method_182().method_2210(1000, var1.method_183(), var1.method_184(), var1.method_185(), 0);
   }

   // $FF: renamed from: b (qH, af) void
   protected void method_7943(class_48 var1, class_905 var2) {
      var1.method_182().method_2210(2000, var1.method_183(), var1.method_184(), var1.method_185(), this.method_7944(var2));
   }

   // $FF: renamed from: b (af) int
   private int method_7944(class_905 var1) {
      return var1.method_5322() + 1 + (var1.method_5324() + 1) * 3;
   }
}

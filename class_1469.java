
// $FF: renamed from: qM
public abstract class class_1469 extends class_1460 {

   // $FF: renamed from: <init> () void
   public void method_7939() {
      super.method_7939();
   }

   // $FF: renamed from: a (qH, add) add
   public add method_7940(class_48 var1, add var2) {
      ahb var3 = var1.method_182();
      class_45 var4 = class_484.method_2848(var1);
      class_905 var5 = class_484.method_2849(var1.method_186());
      class_12 var6 = this.method_7945(var3, var4);
      var6.method_29((double)var5.method_5322(), (double)((float)var5.method_5323() + 0.1F), (double)var5.method_5324(), this.method_7947(), this.method_7946());
      var3.method_2089((class_689)var6);
      var2.method_3729(1);
      return var2;
   }

   // $FF: renamed from: b (qH) void
   protected void method_7942(class_48 var1) {
      var1.method_182().method_2210(1002, var1.method_183(), var1.method_184(), var1.method_185(), 0);
   }

   // $FF: renamed from: b (ahb, q7) Aj
   protected abstract class_12 method_7945(ahb var1, class_45 var2);

   // $FF: renamed from: b () float
   protected float method_7946() {
      return 6.0F;
   }

   // $FF: renamed from: c () float
   protected float method_7947() {
      return 1.1F;
   }
}


// $FF: renamed from: bl
public class class_571 extends ItemBlock {

   // $FF: renamed from: n aji
   private aji field_2448;


   // $FF: renamed from: <init> (aji, aji) void
   public void getBlock61(aji var1, aji var2) {
      super.getBlock51(var1);
      this.field_2448 = var2;
      this.method_2935(0);
      this.method_2933(true);
   }

   // $FF: renamed from: b_ (int) vL
   public IIcon getIconFromDamage(int var1) {
      return this.field_2448.method_2448(2, var1);
   }

   // $FF: renamed from: a (int) int
   public int method_2931(int var1) {
      return var1;
   }
}

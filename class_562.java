
// $FF: renamed from: bv
public class class_562 extends ItemBlock {

   // $FF: renamed from: <init> (aji) void
   public void getBlock51(aji var1) {
      super.getBlock51(var1);
      this.method_2935(0);
      this.method_2933(true);
   }

   // $FF: renamed from: b_ (int) vL
   public IIcon getIconFromDamage(int var1) {
      return this.blockInstance.method_2534(2, class_438.method_2751(var1));
   }

   // $FF: renamed from: a (int) int
   public int method_2931(int var1) {
      return var1;
   }

   // $FF: renamed from: a (add) java.lang.String
   public String getUnlocalizedName(add var1) {
      return super.getUnlocalizedName() + "." + class_537.field_2385[class_438.method_2751(var1.method_3745())];
   }
}

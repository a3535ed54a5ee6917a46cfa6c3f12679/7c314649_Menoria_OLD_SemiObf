
// $FF: renamed from: bn
public class class_569 extends ItemBlock {

   // $FF: renamed from: n aji
   private final aji field_2445;
   // $FF: renamed from: o java.lang.String[]
   private String[] field_2446;


   // $FF: renamed from: <init> (aji, boolean) void
   public void getBlock59(aji var1, boolean var2) {
      String[] var10000 = class_752.method_4253();
      super.getBlock51(var1);
      String[] var3 = var10000;
      this.field_2445 = var1;
      if(var3 != null) {
         if(!var2) {
            return;
         }

         this.method_2935(0);
      }

      this.method_2933(true);
   }

   // $FF: renamed from: a (add, int) int
   public int method_2953(add var1, int var2) {
      return this.field_2445.method_2494(var1.method_3745());
   }

   // $FF: renamed from: b_ (int) vL
   public IIcon getIconFromDamage(int var1) {
      return this.field_2445.method_2448(0, var1);
   }

   // $FF: renamed from: a (int) int
   public int method_2931(int var1) {
      return var1;
   }

   // $FF: renamed from: b (java.lang.String[]) bn
   public class_569 getBlock60(String[] var1) {
      this.field_2446 = var1;
      return this;
   }

   // $FF: renamed from: a (add) java.lang.String
   public String getUnlocalizedName(add var1) {
      String[] var2 = class_752.method_4253();
      class_569 var10000 = this;
      if(var2 != null) {
         if(this.field_2446 != null) {
            int var3 = var1.method_3745();
            int var4 = var3;
            if(var2 != null) {
               if(var3 < 0) {
                  return super.getUnlocalizedName(var1);
               }

               var4 = var3;
            }

            if(var4 < this.field_2446.length) {
               return super.getUnlocalizedName(var1) + "." + this.field_2446[var3];
            }

            return super.getUnlocalizedName(var1);
         }

         var10000 = this;
      }

      return var10000.getUnlocalizedName(var1);
   }
}


// $FF: renamed from: bq
public class class_565 extends ItemBlock {

   // $FF: renamed from: n aji
   protected final aji field_2442;
   // $FF: renamed from: o java.lang.String[]
   protected final String[] field_2443;


   // $FF: renamed from: <init> (aji, aji, java.lang.String[]) void
   public void getBlock56(aji var1, aji var2, String[] var3) {
      super.getBlock51(var1);
      this.field_2442 = var2;
      this.field_2443 = var3;
      this.method_2935(0);
      this.method_2933(true);
   }

   // $FF: renamed from: b_ (int) vL
   public IIcon getIconFromDamage(int var1) {
      return this.field_2442.method_2448(2, var1);
   }

   // $FF: renamed from: a (int) int
   public int method_2931(int var1) {
      return var1;
   }

   // $FF: renamed from: a (add) java.lang.String
   public String getUnlocalizedName(add var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = var1.method_3745();
      String[] var2 = var10000;
      int var4 = var3;
      if(var2 != null) {
         label17: {
            if(var3 >= 0) {
               var4 = var3;
               if(var2 == null) {
                  break label17;
               }

               if(var3 < this.field_2443.length) {
                  return super.getUnlocalizedName() + "." + this.field_2443[var3];
               }
            }

            var4 = 0;
         }
      }

      var3 = var4;
      return super.getUnlocalizedName() + "." + this.field_2443[var3];
   }
}

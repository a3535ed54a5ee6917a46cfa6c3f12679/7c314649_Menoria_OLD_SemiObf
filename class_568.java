
// $FF: renamed from: bp
public class class_568 extends ItemBlock {

   // $FF: renamed from: n fX
   private final class_382 field_2444;


   // $FF: renamed from: <init> (fX) void
   public void getBlock58(class_382 var1) {
      super.getBlock51(var1);
      this.field_2444 = var1;
      this.method_2935(0);
      this.method_2933(true);
   }

   // $FF: renamed from: a (int) int
   public int method_2931(int var1) {
      return var1 | 4;
   }

   // $FF: renamed from: b_ (int) vL
   public IIcon getIconFromDamage(int var1) {
      return this.field_2444.method_2448(0, var1);
   }

   // $FF: renamed from: a (add, int) int
   public int method_2953(add var1, int var2) {
      return this.field_2444.method_2494(var1.method_3745());
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

               if(var3 < this.field_2444.method_2594().length) {
                  return super.getUnlocalizedName() + "." + this.field_2444.method_2594()[var3];
               }
            }

            var4 = 0;
         }
      }

      var3 = var4;
      return super.getUnlocalizedName() + "." + this.field_2444.method_2594()[var3];
   }
}


// $FF: renamed from: bs
public class class_566 extends class_565 {

   // $FF: renamed from: <init> (aji, ey, java.lang.String[]) void
   public void getBlock57(aji var1, class_448 var2, String[] var3) {
      super.getBlock56(var1, var2, var3);
   }

   // $FF: renamed from: b_ (int) vL
   public IIcon getIconFromDamage(int var1) {
      return class_448.method_2778(var1) == 0?((class_448)this.field_2442).field_2197[0]:((class_448)this.field_2442).method_2779(true, var1);
   }

   // $FF: renamed from: a (add, int) int
   public int method_2953(add var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = class_448.method_2778(var1.method_3745());
      String[] var3 = var10000;
      int var5 = var4;
      if(var3 != null) {
         if(var4 != 2) {
            label16: {
               var5 = var4;
               if(var3 != null) {
                  if(var4 == 3) {
                     break label16;
                  }

                  var5 = super.method_2953(var1, var2);
               }

               return var5;
            }
         }

         var5 = class_1040.method_5891(0.5D, 1.0D);
      }

      return var5;
   }
}

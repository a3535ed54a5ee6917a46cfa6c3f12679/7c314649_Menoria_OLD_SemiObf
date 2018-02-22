
// $FF: renamed from: gp
public class class_591 extends class_580 {

   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
   }

   // $FF: renamed from: g () void
   public void getBlock94() {
      String[] var1 = class_752.method_4253();
      ahb var10000 = this.field_2464;
      if(var1 != null) {
         if(this.field_2464 == null) {
            return;
         }

         var10000 = this.field_2464;
      }

      int var2 = var10000.field_1832;
      if(var1 != null) {
         if(var2 != 0) {
            return;
         }

         long var4;
         var2 = (var4 = this.field_2464.method_2184() % 20L - 0L) == 0L?0:(var4 < 0L?-1:1);
      }

      aji var3;
      label41: {
         if(var1 != null) {
            if(var2 != 0) {
               return;
            }

            this.field_2470 = this.getBlock99();
            var3 = this.field_2470;
            if(var1 == null) {
               break label41;
            }

            var2 = this.field_2470 instanceof class_486;
         }

         if(var2 == 0) {
            return;
         }

         var3 = this.field_2470;
      }

      ((class_486)var3).method_2851(this.field_2464, this.field_2465, this.field_2466, this.field_2467);
   }
}


// $FF: renamed from: xx
public class class_693 extends class_690 {

   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_3980(ahb var1, double var2, double var4, double var6) {
      super.method_3980(var1, var2, var4, var6);
   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3919(class_792 var1) {
      String[] var2;
      class_693 var3;
      label49: {
         var2 = class_752.method_4253();
         class_689 var10000 = this.field_2987;
         if(var2 != null) {
            label50: {
               if(this.field_2987 != null) {
                  var10000 = this.field_2987;
                  if(var2 == null) {
                     break label50;
                  }

                  if(this.field_2987 instanceof class_792) {
                     var10000 = this.field_2987;
                     if(var2 == null) {
                        break label50;
                     }

                     if(this.field_2987 != var1) {
                        return true;
                     }
                  }
               }

               var3 = this;
               if(var2 == null) {
                  break label49;
               }

               var10000 = this.field_2987;
            }
         }

         if(var10000 != null) {
            var3 = this;
            if(var2 == null) {
               break label49;
            }

            if(this.field_2987 != var1) {
               return false;
            }
         }

         var3 = this;
      }

      boolean var4 = var3.field_2990.field_1832;
      if(var2 != null) {
         if(!var4) {
            var1.method_3925(this);
         }

         var4 = true;
      }

      return var4;
   }

   // $FF: renamed from: s () int
   public int method_3994() {
      return 0;
   }
}

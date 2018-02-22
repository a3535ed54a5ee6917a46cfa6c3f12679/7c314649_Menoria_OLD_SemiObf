package ca.diiza.i;

import ca.diiza.i.class_576;

// $FF: renamed from: ca.diiza.i.g
public class class_507 extends adb {

   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2922(1);
      this.method_2974(class_872.field_4248);
   }

   // $FF: renamed from: b (add, ahb, yz) add
   public add method_2929(add var1, ahb var2, class_792 var3) {
      boolean var4 = class_576.getBlock65();
      int var10000 = var3.field_3640.field_2839;
      if(var4) {
         if(!var3.field_3640.field_2839) {
            --var1.field_2958;
         }

         var10000 = var2.field_1832;
      }

      add var5;
      label37: {
         if(var4) {
            if(var10000 == 0) {
               var3.clearActiveDebuffs();
            }

            var5 = var1;
            if(!var4) {
               break label37;
            }

            var10000 = var1.field_2958;
         }

         if(var10000 <= 0) {
            var5 = new add;
            var5.method_3724(class_1010.field_5231);
         } else {
            var5 = var1;
         }
      }

      if(class_689.method_3977() == 0) {
         class_576.getBlock63(!var4);
      }

      return var5;
   }

   // $FF: renamed from: d_ (add) int
   public int method_2958(add var1) {
      return 24;
   }

   // $FF: renamed from: d (add) A
   public class_92 method_2957(add var1) {
      return class_92.field_25;
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      var3.method_4626(var1, this.method_2958(var1));
      return var1;
   }
}

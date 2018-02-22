
// $FF: renamed from: b5
public class class_553 extends adb {

   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2922(1);
      this.method_2974(class_872.field_4248);
   }

   // $FF: renamed from: b (add, ahb, yz) add
   public add method_2929(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var3.field_3640.field_2839;
      if(var4 != null) {
         if(!var3.field_3640.field_2839) {
            --var1.field_2958;
         }

         var10000 = var2.field_1832;
      }

      add var5;
      if(var4 != null) {
         if(var10000 == 0) {
            var3.method_4174();
         }

         var5 = var1;
         if(var4 == null) {
            return var5;
         }

         var10000 = var1.field_2958;
      }

      if(var10000 <= 0) {
         var5 = new add;
         var5.method_3724(class_1010.field_5183);
         return var5;
      } else {
         var5 = var1;
         return var5;
      }
   }

   // $FF: renamed from: d_ (add) int
   public int method_2958(add var1) {
      return 32;
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

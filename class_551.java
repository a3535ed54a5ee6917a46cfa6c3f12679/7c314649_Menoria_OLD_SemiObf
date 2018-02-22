
// $FF: renamed from: b7
public class class_551 extends adb {

   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2974(class_872.fontRendererInstance1);
   }

   // $FF: renamed from: a (add, yz, sv) boolean
   public boolean method_2940(add var1, class_792 var2, class_752 var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = var1.method_3773();
      if(var4 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = var3 instanceof class_753;
      }

      if(var4 != null) {
         if(var10000) {
            class_753 var5 = (class_753)var3;
            var5.method_4286(var1.method_3770());
            var5.method_4285();
            --var1.field_2958;
            return true;
         }

         var10000 = super.method_2940(var1, var2, var3);
      }

      return var10000;
   }
}

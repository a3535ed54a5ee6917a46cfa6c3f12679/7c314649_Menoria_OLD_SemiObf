
// $FF: renamed from: d5
public class class_490 extends class_473 {

   // $FF: renamed from: <init> () void
   public void method_2860() {
      super.method_2427(awt.field_4188);
      this.method_2437(3.0F);
      this.method_2521(class_872.field_4248);
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_596 var10000 = new class_596;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      ahb var10000 = var1;
      if(var10 != null) {
         if(var1.field_1832) {
            return true;
         }

         var10000 = var1;
      }

      class_596 var11 = (class_596)var10000.method_31(var2, var3, var4);
      if(var11 != null) {
         var5.method_4589(var11);
      }

      return true;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 34;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      super.method_2535(var1);
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      super.method_2506(var1, var2, var3, var4, var5, var6);
      if(var6.method_3773()) {
         ((class_596)var1.method_31(var2, var3, var4)).method_3183(var6.method_3770());
      }

   }
}

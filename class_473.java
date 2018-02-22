
// $FF: renamed from: d4
public abstract class class_473 extends aji implements class_28 {

   // $FF: renamed from: <init> (awt) void
   protected void method_2427(awt var1) {
      super.method_2427(var1);
      this.field_1998 = true;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      super.method_2461(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      super.method_2462(var1, var2, var3, var4, var5, var6);
      var1.method_2132(var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, int) boolean
   public boolean method_2511(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      super.method_2511(var1, var2, var3, var4, var5, var6);
      String[] var10000 = class_752.method_4253();
      class_580 var8 = var1.method_31(var2, var3, var4);
      String[] var7 = var10000;
      class_580 var9 = var8;
      if(var7 != null) {
         if(var8 == null) {
            return false;
         }

         var9 = var8;
      }

      return var9.method_3104(var5, var6);
   }
}

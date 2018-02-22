
// $FF: renamed from: fW
public class class_381 extends aji {

   // $FF: renamed from: M boolean
   protected boolean field_2057;


   // $FF: renamed from: <init> (awt, boolean) void
   protected void method_2588(awt var1, boolean var2) {
      super.method_2427(var1);
      this.field_2057 = var2;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      aji var7 = var1.getBlock(var2, var3, var4);
      String[] var6 = var10000;
      boolean var8 = this.field_2057;
      if(var6 != null) {
         if(!this.field_2057 && var7 == this) {
            return false;
         }

         var8 = super.method_2445(var1, var2, var3, var4, var5);
      }

      return var8;
   }
}

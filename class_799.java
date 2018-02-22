
// $FF: renamed from: xM
public class class_799 extends class_797 {

   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: <init> (ahb, sv) void
   public void method_4682(ahb var1, class_752 var2) {
      super.method_4682(var1, var2);
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4683(ahb var1, double var2, double var4, double var6) {
      super.method_4683(var1, var2, var4, var6);
   }

   // $FF: renamed from: d () float
   protected float method_4686() {
      return 0.07F;
   }

   // $FF: renamed from: a () float
   protected float method_4684() {
      return 0.7F;
   }

   // $FF: renamed from: b () float
   protected float method_4685() {
      return -20.0F;
   }

   // $FF: renamed from: b (azu) void
   protected void method_4687(azu var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_2990.field_1832;
      if(var2 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         this.field_2990.method_2210(2002, (int)Math.round(this.field_2994), (int)Math.round(this.field_2995), (int)Math.round(this.field_2996), 0);
         var10000 = 3 + this.field_2990.field_1819.nextInt(5) + this.field_2990.field_1819.nextInt(5);
      }

      int var3 = var10000;

      while(true) {
         if(var3 > 0) {
            int var4 = class_715.method_4090(var3);
            var3 -= var4;
            ahb var5 = this.field_2990;
            class_715 var10001 = new class_715;
            var10001.method_4087(this.field_2990, this.field_2994, this.field_2995, this.field_2996, var4);
            var5.method_2089(var10001);
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.method_3851();
         break;
      }

   }
}

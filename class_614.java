
// $FF: renamed from: n4
public abstract class class_614 {

   // $FF: renamed from: b n3
   protected class_1380 field_2659;


   // $FF: renamed from: <init> () void
   public void method_3391() {
      super();
   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public abstract void method_3392(class_580 var1, double var2, double var4, double var6, float var8);

   // $FF: renamed from: b (bqx) void
   protected void method_3393(bqx var1) {
      String[] var10000 = class_752.method_4253();
      bqf var3 = this.field_2659.field_7333;
      String[] var2 = var10000;
      bqf var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return;
         }

         var4 = var3;
      }

      var4.bindTexture(var1);
   }

   // $FF: renamed from: b (n3) void
   public void method_3394(class_1380 var1) {
      this.field_2659 = var1;
   }

   // $FF: renamed from: b (ahb) void
   public void method_3395(ahb var1) {}

   // $FF: renamed from: a () kU
   public FontRenderer method_3396() {
      return this.field_2659.method_7535();
   }
}

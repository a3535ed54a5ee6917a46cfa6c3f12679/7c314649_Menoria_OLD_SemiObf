
// $FF: renamed from: nP
public class GuiTextField6 extends GuiTextField5 {

   // $FF: renamed from: a bbj
   private bbj field_7410;


   // $FF: renamed from: <init> (bbj) void
   public void method_7609(bbj var1) {
      super.method_7607();
      this.field_7410 = var1;
   }

   // $FF: renamed from: b () void
   public void method_7608() {
      String[] var10000 = class_752.method_4253();
      this.field_7406 = 0.0F;
      String[] var1 = var10000;
      this.field_7407 = 0.0F;
      boolean var2 = this.field_7410.field_4532.getEnableBackgroundDrawing2();
      if(var1 != null) {
         if(var2) {
            ++this.field_7407;
         }

         var2 = this.field_7410.field_4534.getEnableBackgroundDrawing2();
      }

      if(var1 != null) {
         if(var2) {
            --this.field_7407;
         }

         var2 = this.field_7410.field_4533.getEnableBackgroundDrawing2();
      }

      if(var1 != null) {
         if(var2) {
            ++this.field_7406;
         }

         var2 = this.field_7410.field_4535.getEnableBackgroundDrawing2();
      }

      GuiTextField6 var3;
      label50: {
         if(var1 != null) {
            if(var2) {
               --this.field_7406;
            }

            this.field_7408 = this.field_7410.field_4536.getEnableBackgroundDrawing2();
            this.field_7409 = this.field_7410.field_4537.getEnableBackgroundDrawing2();
            var3 = this;
            if(var1 == null) {
               break label50;
            }

            var2 = this.field_7409;
         }

         if(!var2) {
            return;
         }

         this.field_7406 = (float)((double)this.field_7406 * 0.3D);
         var3 = this;
      }

      var3.field_7407 = (float)((double)var3.field_7407 * 0.3D);
   }
}

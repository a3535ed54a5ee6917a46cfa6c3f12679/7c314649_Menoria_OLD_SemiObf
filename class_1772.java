
// $FF: renamed from: y0
public class class_1772 extends class_1771 {

   // $FF: renamed from: n wL
   private class_776 field_9258;


   // $FF: renamed from: <init> (wL, java.lang.Class, int, boolean) void
   public void method_9744(class_776 var1, Class var2, int var3, boolean var4) {
      super.method_9740(var1, var2, var3, var4);
      this.field_9258 = var1;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      boolean var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_9258.method_4476();
         if(var1 != null) {
            if(var10000) {
               break label24;
            }

            var10000 = super.method_9649();
         }

         if(var1 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }
}

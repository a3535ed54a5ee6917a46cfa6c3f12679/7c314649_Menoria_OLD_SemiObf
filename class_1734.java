
// $FF: renamed from: ys
public class class_1734 extends class_1727 {

   // $FF: renamed from: c sw
   private class_753 field_9064;


   // $FF: renamed from: <init> (sw) void
   public void method_9665(class_753 var1) {
      super.method_9648();
      this.field_9064 = var1;
      this.method_9655(4);
      var1.method_4257().method_9791(true);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9064.method_3876();
      if(var1 != null) {
         if(!var10000) {
            var10000 = this.field_9064.method_3881();
            if(var1 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      String[] var1 = class_752.method_4253();
      class_753 var10000 = this.field_9064;
      if(var1 != null) {
         if(this.field_9064.method_4165().nextFloat() >= 0.8F) {
            return;
         }

         var10000 = this.field_9064;
      }

      var10000.method_4256().method_9972();
   }
}

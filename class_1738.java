
// $FF: renamed from: yp
public class class_1738 extends class_1737 {

   // $FF: renamed from: a boolean
   boolean field_9083;
   // $FF: renamed from: k int
   int field_9084;


   // $FF: renamed from: <init> (sw, boolean) void
   public void method_9673(class_753 var1, boolean var2) {
      super.method_9671(var1);
      this.field_9075 = var1;
      this.field_9083 = var2;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      int var10000;
      label32: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_9083;
         if(var1 != null) {
            if(!this.field_9083) {
               break label32;
            }

            var10000 = this.field_9084;
         }

         if(var1 != null) {
            if(var10000 <= 0) {
               break label32;
            }

            var10000 = super.method_9650();
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9084 = 20;
      this.field_9079.method_2673(this.field_9075.field_2990, this.field_9076, this.field_9077, this.field_9078, true);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      String[] var1 = class_752.method_4253();
      class_1738 var10000 = this;
      if(var1 != null) {
         if(!this.field_9083) {
            return;
         }

         var10000 = this;
      }

      var10000.field_9079.method_2673(this.field_9075.field_2990, this.field_9076, this.field_9077, this.field_9078, false);
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      --this.field_9084;
      super.method_9654();
   }
}

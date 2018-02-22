
// $FF: renamed from: y2
public class class_1769 extends class_1766 {

   // $FF: renamed from: h wL
   class_776 field_9246;
   // $FF: renamed from: i sv
   class_752 field_9247;
   // $FF: renamed from: j int
   private int field_9248;


   // $FF: renamed from: <init> (wL) void
   public void method_9738(class_776 var1) {
      super.method_9732(var1, false);
      this.field_9246 = var1;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      Object var10000 = this.field_9246;
      if(var1 != null) {
         if(!this.field_9246.method_4476()) {
            return false;
         }

         var10000 = this.field_9246.method_4481();
      }

      Object var2 = var10000;
      var10000 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         this.field_9247 = ((class_752)var2).method_4169();
         var10000 = var2;
      }

      int var4;
      label49: {
         int var3 = ((class_752)var10000).method_4170();
         var4 = var3;
         if(var1 != null) {
            if(var3 == this.field_9248) {
               break label49;
            }

            var4 = this.method_9735(this.field_9247, false);
         }

         if(var1 != null) {
            if(var4 == 0) {
               break label49;
            }

            var4 = this.field_9246.method_4484(this.field_9247, (class_752)var2);
         }

         if(var1 == null) {
            return (boolean)var4;
         }

         if(var4 != 0) {
            var4 = 1;
            return (boolean)var4;
         }
      }

      var4 = 0;
      return (boolean)var4;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      String[] var10000 = class_752.method_4253();
      this.field_9236.method_4260(this.field_9247);
      class_752 var2 = this.field_9246.method_4481();
      String[] var1 = var10000;
      if(var1 != null) {
         if(var2 != null) {
            this.field_9248 = var2.method_4170();
         }

         super.method_9652();
      }

   }
}

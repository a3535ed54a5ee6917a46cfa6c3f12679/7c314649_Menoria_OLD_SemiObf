
// $FF: renamed from: yV
public class class_1744 extends class_1727 {

   // $FF: renamed from: c wU
   private class_768 field_9117;


   // $FF: renamed from: <init> (wU) void
   public void method_9690(class_768 var1) {
      super.method_9648();
      this.field_9117 = var1;
      this.method_9655(5);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9117.method_3917();
      if(var1 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = this.field_9117.method_3876();
      }

      if(var1 != null) {
         if(var10000) {
            return false;
         }

         var10000 = this.field_9117.field_3005;
      }

      class_768 var3;
      label60: {
         if(var1 != null) {
            if(!var10000) {
               return false;
            }

            var3 = this.field_9117;
            if(var1 == null) {
               break label60;
            }

            var10000 = this.field_9117.field_3009;
         }

         if(var10000) {
            return false;
         }

         var3 = this.field_9117;
      }

      class_792 var2 = var3.method_55();
      if(var2 == null) {
         return false;
      } else {
         double var5;
         int var4 = (var5 = this.field_9117.method_3891(var2) - 16.0D) == 0.0D?0:(var5 < 0.0D?-1:1);
         if(var1 != null) {
            if(var4 > 0) {
               return false;
            }

            var4 = var2.field_3619 instanceof class_671;
         }

         if(var1 != null) {
            if(var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (boolean)var4;
      }
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9117.method_4257().method_9802();
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9117.method_54((class_792)null);
   }
}

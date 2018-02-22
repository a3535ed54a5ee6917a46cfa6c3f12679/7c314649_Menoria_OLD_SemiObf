
// $FF: renamed from: yS
public class class_1747 extends class_1727 {

   // $FF: renamed from: c w3
   class_789 field_9136;
   // $FF: renamed from: d sv
   class_752 field_9137;


   // $FF: renamed from: <init> (w3) void
   public void method_9695(class_789 var1) {
      super.method_9648();
      this.field_9136 = var1;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var10000 = class_752.method_4253();
      class_752 var2 = this.field_9136.method_4259();
      String[] var1 = var10000;
      int var3 = this.field_9136.method_4533();
      if(var1 != null) {
         if(var3 <= 0) {
            label29: {
               if(var2 != null) {
                  double var4;
                  var3 = (var4 = this.field_9136.method_3891(var2) - 9.0D) == 0.0D?0:(var4 < 0.0D?-1:1);
                  if(var1 == null) {
                     return (boolean)var3;
                  }

                  if(var3 < 0) {
                     break label29;
                  }
               }

               var3 = 0;
               return (boolean)var3;
            }
         }

         var3 = 1;
      }

      return (boolean)var3;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9136.method_4257().method_9802();
      this.field_9137 = this.field_9136.method_4259();
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9137 = null;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      String[] var1 = class_752.method_4253();
      class_1747 var10000 = this;
      if(var1 != null) {
         if(this.field_9137 == null) {
            this.field_9136.method_4534(-1);
            return;
         }

         var10000 = this;
      }

      class_789 var3;
      label32: {
         double var4;
         int var2 = (var4 = var10000.field_9136.method_3891(this.field_9137) - 49.0D) == 0.0D?0:(var4 < 0.0D?-1:1);
         if(var1 != null) {
            if(var2 > 0) {
               this.field_9136.method_4534(-1);
               return;
            }

            var3 = this.field_9136;
            if(var1 == null) {
               break label32;
            }

            var2 = this.field_9136.method_4258().method_9814(this.field_9137);
         }

         if(var2 == 0) {
            this.field_9136.method_4534(-1);
            return;
         }

         var3 = this.field_9136;
      }

      var3.method_4534(1);
   }
}

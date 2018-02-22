
// $FF: renamed from: yR
public class class_1748 extends class_1727 {

   // $FF: renamed from: c wL
   private class_776 field_9138;
   // $FF: renamed from: d boolean
   private boolean field_9139;


   // $FF: renamed from: <init> (wL) void
   public void method_9696(class_776 var1) {
      super.method_9648();
      this.field_9138 = var1;
      this.method_9655(5);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9138.method_4476();
      if(var1 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = this.field_9138.method_3876();
      }

      Object var3;
      label46: {
         if(var1 != null) {
            if(var10000) {
               return false;
            }

            var3 = this.field_9138;
            if(var1 == null) {
               break label46;
            }

            var10000 = this.field_9138.field_3005;
         }

         if(!var10000) {
            return false;
         }

         var3 = this.field_9138.method_4481();
      }

      Object var2 = var3;
      if(var2 == null) {
         return true;
      } else {
         double var5;
         int var4 = (var5 = this.field_9138.method_3891((class_689)var2) - 144.0D) == 0.0D?0:(var5 < 0.0D?-1:1);
         if(var1 != null) {
            if(var4 < 0 && ((class_752)var2).method_4166() != null) {
               return false;
            }

            var4 = this.field_9139;
         }

         return (boolean)var4;
      }
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9138.method_4257().method_9802();
      this.field_9138.method_4479(true);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9138.method_4479(false);
   }

   // $FF: renamed from: b (boolean) void
   public void method_9697(boolean var1) {
      this.field_9139 = var1;
   }
}

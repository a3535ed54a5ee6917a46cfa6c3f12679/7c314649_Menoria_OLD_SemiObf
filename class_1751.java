
// $FF: renamed from: yO
public class class_1751 extends class_1727 {

   // $FF: renamed from: c wI
   private class_761 field_9146;
   // $FF: renamed from: d y_
   private class_1841 field_9147;


   // $FF: renamed from: <init> (wI) void
   public void method_9700(class_761 var1) {
      super.method_9648();
      this.field_9146 = var1;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      ahb var10000 = this.field_9146.field_2990;
      if(var1 != null) {
         if(this.field_9146.field_2990.method_2078()) {
            return false;
         }

         var10000 = this.field_9146.field_2990;
      }

      class_1849 var2 = var10000.field_1827.method_6780(class_1715.method_9561(this.field_9146.field_2994), class_1715.method_9561(this.field_9146.field_2995), class_1715.method_9561(this.field_9146.field_2996), 16);
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         this.field_9147 = var2.method_10010(class_1715.method_9561(this.field_9146.field_2994), class_1715.method_9561(this.field_9146.field_2995), class_1715.method_9561(this.field_9146.field_2996));
      }

      class_1841 var3 = this.field_9147;
      if(var1 != null) {
         if(this.field_9147 == null) {
            return false;
         }

         var3 = this.field_9147;
      }

      double var5;
      int var4 = (var5 = (double)var3.method_9960(class_1715.method_9561(this.field_9146.field_2994), class_1715.method_9561(this.field_9146.field_2995), class_1715.method_9561(this.field_9146.field_2996)) - 2.25D) == 0.0D?0:(var5 < 0.0D?-1:1);
      if(var1 != null) {
         var4 = var4 < 0?1:0;
      }

      return (boolean)var4;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9146.field_2990.method_2078();
      if(var1 != null) {
         if(var10000) {
            return false;
         }

         var10000 = this.field_9147.field_9403;
      }

      label33: {
         if(var1 != null) {
            if(var10000) {
               break label33;
            }

            var10000 = this.field_9147.method_9964(class_1715.method_9561(this.field_9146.field_2994), class_1715.method_9561(this.field_9146.field_2996));
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

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9146.method_4257().method_9786(false);
      this.field_9146.method_4257().method_9787(false);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9146.method_4257().method_9786(true);
      this.field_9146.method_4257().method_9787(true);
      this.field_9147 = null;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      this.field_9147.method_9966();
   }
}

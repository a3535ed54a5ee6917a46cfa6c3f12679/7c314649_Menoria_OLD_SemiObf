
// $FF: renamed from: yj
public class class_1742 extends class_1727 {

   // $FF: renamed from: c wN
   private class_777 field_9102;
   // $FF: renamed from: d yz
   private class_792 field_9103;
   // $FF: renamed from: e ahb
   private ahb field_9104;
   // $FF: renamed from: f float
   private float field_9105;
   // $FF: renamed from: g int
   private int field_9106;


   // $FF: renamed from: <init> (wN, float) void
   public void method_9685(class_777 var1, float var2) {
      super.method_9648();
      this.field_9102 = var1;
      this.field_9104 = var1.field_2990;
      this.field_9105 = var2;
      this.method_9655(2);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var10000 = class_752.method_4253();
      this.field_9103 = this.field_9104.method_2174(this.field_9102, (double)this.field_9105);
      String[] var1 = var10000;
      class_1742 var2 = this;
      if(var1 != null) {
         if(this.field_9103 == null) {
            return false;
         }

         var2 = this;
      }

      return var2.method_9686(this.field_9103);
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9103.method_3917();
      if(var1 != null) {
         if(var10000 == 0) {
            return false;
         }

         double var2;
         var10000 = (var2 = this.field_9102.method_3891(this.field_9103) - (double)(this.field_9105 * this.field_9105)) == 0.0D?0:(var2 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var10000 > 0) {
            return false;
         }

         var10000 = this.field_9106;
      }

      label41: {
         if(var1 != null) {
            if(var10000 <= 0) {
               break label41;
            }

            var10000 = this.method_9686(this.field_9103);
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
      this.field_9102.method_4496(true);
      this.field_9106 = 40 + this.field_9102.method_4165().nextInt(40);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9102.method_4496(false);
      this.field_9103 = null;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      this.field_9102.method_4254().method_9976(this.field_9103.field_2994, this.field_9103.field_2995 + (double)this.field_9103.method_3880(), this.field_9103.field_2996, 10.0F, (float)this.field_9102.method_4271());
      --this.field_9106;
   }

   // $FF: renamed from: b (yz) boolean
   private boolean method_9686(class_792 var1) {
      String[] var10000 = class_752.method_4253();
      add var3 = var1.field_3616.method_3593();
      String[] var2 = var10000;
      if(var3 == null) {
         return false;
      } else {
         boolean var4 = this.field_9102.method_4476();
         if(var2 != null) {
            if(!var4 && var3.method_3730() == class_1010.field_5209) {
               return true;
            }

            var4 = this.field_9102.method_4378(var3);
         }

         return var4;
      }
   }
}

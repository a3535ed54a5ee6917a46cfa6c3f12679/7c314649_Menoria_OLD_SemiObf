
// $FF: renamed from: yX
public class class_1768 extends class_1766 {

   // $FF: renamed from: h wX
   class_765 field_9244;
   // $FF: renamed from: i sv
   class_752 field_9245;


   // $FF: renamed from: <init> (wX) void
   public void method_9737(class_765 var1) {
      super.method_9733(var1, false, true);
      this.field_9244 = var1;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var10000 = class_752.method_4253();
      class_1849 var2 = this.field_9244.method_4346();
      String[] var1 = var10000;
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         this.field_9245 = var2.method_10016(this.field_9244);
      }

      boolean var3 = this.method_9735(this.field_9245, false);
      if(var1 != null) {
         if(!var3) {
            int var4 = this.field_9236.method_4165().nextInt(20);
            if(var1 != null) {
               if(var4 == 0) {
                  this.field_9245 = var2.method_10017(this.field_9244);
                  return this.method_9735(this.field_9245, false);
               }

               var4 = 0;
            }

            return (boolean)var4;
         }

         var3 = true;
      }

      return var3;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9244.method_4260(this.field_9245);
      super.method_9652();
   }
}

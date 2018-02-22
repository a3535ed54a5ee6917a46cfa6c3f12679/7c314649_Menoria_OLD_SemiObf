
// $FF: renamed from: bC
public class class_547 extends adb {

   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2974(class_872.field_4247);
      this.method_2922(1);
      this.method_2935(25);
   }

   // $FF: renamed from: f () boolean
   public boolean method_2942() {
      return true;
   }

   // $FF: renamed from: g () boolean
   public boolean method_2943() {
      return true;
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      add var9;
      label45: {
         String[] var4;
         class_689 var7;
         label46: {
            var4 = class_752.method_4253();
            boolean var10000 = var3.method_3937();
            if(var4 != null) {
               if(!var10000) {
                  break label45;
               }

               var7 = var3.field_2988;
               if(var4 == null) {
                  break label46;
               }

               var10000 = var3.field_2988 instanceof class_771;
            }

            if(!var10000) {
               break label45;
            }

            var7 = var3.field_2988;
         }

         class_771 var5 = (class_771)var7;
         int var8 = var5.method_4398().method_9679();
         if(var4 != null) {
            if(var8 == 0) {
               break label45;
            }

            var9 = var1;
            if(var4 == null) {
               return var9;
            }

            var8 = var1.method_3747() - var1.method_3745();
         }

         if(var8 >= 7) {
            var5.method_4398().method_9678();
            var1.method_3749(7, var3);
            var9 = var1;
            if(var4 == null) {
               return var9;
            }

            if(var1.field_2958 == 0) {
               var9 = new add;
               var9.method_3724(class_1010.field_5203);
               add var6 = var9;
               var6.method_3769(var1.field_2961);
               return var6;
            }
         }
      }

      var9 = var1;
      return var9;
   }
}

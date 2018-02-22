
// $FF: renamed from: w7
public class class_785 extends class_784 {

   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.7F, 0.5F);
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(12.0D);
   }

   // $FF: renamed from: n (sa) boolean
   public boolean method_4228(class_689 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = super.method_4228(var1);
      if(var2 != null) {
         if(var10000) {
            byte var4 = var1 instanceof class_752;
            if(var2 != null) {
               if(var4 != 0) {
                  byte var3;
                  label28: {
                     var3 = 0;
                     class_918 var5 = this.field_2990.field_1818;
                     class_918 var10001 = class_918.field_4629;
                     if(var2 != null) {
                        if(this.field_2990.field_1818 == class_918.field_4629) {
                           var3 = 7;
                           if(var2 != null) {
                              break label28;
                           }
                        }

                        var5 = this.field_2990.field_1818;
                        var10001 = class_918.field_4630;
                     }

                     if(var5 == var10001) {
                        var3 = 15;
                     }
                  }

                  var4 = var3;
                  if(var2 == null) {
                     return (boolean)var4;
                  }

                  if(var3 > 0) {
                     class_752 var7 = (class_752)var1;
                     class_1645 var6 = new class_1645;
                     var6.method_9012(class_1635.field_8509.field_8526, var3 * 20, 0);
                     var7.method_4179(var6);
                  }
               }

               var4 = 1;
            }

            return (boolean)var4;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: a (xY) xY
   public class_83 method_4282(class_83 var1) {
      return var1;
   }
}

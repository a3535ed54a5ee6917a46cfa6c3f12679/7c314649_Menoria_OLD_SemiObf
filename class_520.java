
// $FF: renamed from: bz
public class class_520 extends adb {

   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2974(class_872.fontRendererInstance3);
   }

   // $FF: renamed from: b_ (int) vL
   public class_73 getIconFromDamage(int var1) {
      return class_1010.field_5230.getIconFromDamage(0);
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      azu var5 = this.method_2968(var2, var3, true);
      String[] var4 = class_752.method_4253();
      azu var10000 = var5;
      if(var4 != null) {
         if(var5 == null) {
            return var1;
         }

         var10000 = var5;
      }

      if(var4 != null) {
         if(var10000.field_4212 != class_100.field_85) {
            return var1;
         }

         var10000 = var5;
      }

      int var6 = var10000.field_4213;
      int var7 = var5.field_4214;
      int var8 = var5.field_4215;
      boolean var10 = var2.method_2190(var3, var6, var7, var8);
      if(var4 != null) {
         if(!var10) {
            return var1;
         }

         var10 = var3.method_4628(var6, var7, var8, var5.field_4216, var1);
      }

      if(!var10) {
         return var1;
      } else {
         if(var2.getBlock(var6, var7, var8).method_2424() == awt.field_4177) {
            class_792 var12;
            add var10001;
            label57: {
               --var1.field_2958;
               int var11 = var1.field_2958;
               if(var4 != null) {
                  if(var1.field_2958 <= 0) {
                     add var9 = new add;
                     var9.method_3724(class_1010.field_5230);
                     return var9;
                  }

                  var12 = var3;
                  if(var4 == null) {
                     break label57;
                  }

                  class_666 var13 = var3.field_3616;
                  var10001 = new add;
                  var10001.method_3724(class_1010.field_5230);
                  var11 = var13.method_3607(var10001);
               }

               if(var11 != 0) {
                  return var1;
               }

               var12 = var3;
            }

            var10001 = new add;
            var10001.method_3726(class_1010.field_5230, 1, 0);
            var12.method_4570(var10001, false);
         }

         return var1;
      }
   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {}
}

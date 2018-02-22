import java.util.Random;

// $FF: renamed from: ex
public class class_449 extends class_446 {

   // $FF: renamed from: <init> () void
   protected void method_2770() {
      super.method_2427(awt.field_4181);
      float var1 = 0.4F;
      this.method_2443(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.8F, 0.5F + var1);
   }

   // $FF: renamed from: d (aji) boolean
   protected boolean method_2771(aji var1) {
      boolean var3;
      label36: {
         String[] var2 = class_752.method_4253();
         aji var10000 = var1;
         Object var10001 = class_1192.field_6037;
         if(var2 != null) {
            if(var1 == class_1192.field_6037) {
               break label36;
            }

            var10000 = var1;
            var10001 = class_1192.field_6186;
         }

         if(var2 != null) {
            if(var10000 == var10001) {
               break label36;
            }

            var10000 = var1;
            var10001 = class_1192.field_6183;
         }

         if(var2 != null) {
            if(var10000 == var10001) {
               break label36;
            }

            var10000 = var1;
            var10001 = class_1192.field_6028;
         }

         if(var10000 != var10001) {
            var3 = false;
            return var3;
         }
      }

      var3 = true;
      return var3;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return null;
   }

   // $FF: renamed from: a (ahb, yz, int, int, int, int) void
   public void method_2501(ahb var1, class_792 var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      if(!var1.field_1832) {
         label26: {
            class_792 var8;
            label30: {
               add var10000 = var2.method_4593();
               if(var7 != null) {
                  if(var10000 == null) {
                     break label26;
                  }

                  var8 = var2;
                  if(var7 == null) {
                     break label30;
                  }

                  var10000 = var2.method_4593();
               }

               if(var10000.method_3730() != class_1010.field_5216) {
                  break label26;
               }

               var8 = var2;
            }

            var8.method_4615(class_1698.field_8908[aji.method_2415(this)], 1);
            add var10005 = new add;
            var10005.method_3723(class_1192.field_6059, 1, var6);
            this.method_2468(var1, var3, var4, var5, var10005);
            if(var7 != null) {
               return;
            }
         }
      }

      super.method_2501(var1, var2, var3, var4, var5, var6);
   }
}

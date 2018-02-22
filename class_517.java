
// $FF: renamed from: cd
public class class_517 extends adb {

   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2922(1);
      this.method_2935(238);
      this.method_2974(class_872.fontRendererInstance1);
   }

   // $FF: renamed from: a (add, ahb, aji, int, int, int, sv) boolean
   public boolean method_2938(add var1, ahb var2, aji var3, int var4, int var5, int var6, class_752 var7) {
      label41: {
         String[] var8 = class_752.method_4253();
         aji var10000 = var3;
         if(var8 != null) {
            if(var3.method_2424() == awt.field_4179) {
               break label41;
            }

            var10000 = var3;
         }

         if(var8 != null) {
            if(var10000 == class_1192.field_6057) {
               break label41;
            }

            var10000 = var3;
         }

         Object var10001 = class_1192.field_6058;
         if(var8 != null) {
            if(var10000 == class_1192.field_6058) {
               break label41;
            }

            var10000 = var3;
            var10001 = class_1192.field_6131;
         }

         if(var8 != null) {
            if(var10000 == var10001) {
               break label41;
            }

            var10000 = var3;
            var10001 = class_1192.field_6156;
         }

         if(var10000 != var10001) {
            return super.method_2938(var1, var2, var3, var4, var5, var6, var7);
         }
      }

      var1.method_3749(1, var7);
      return true;
   }

   // $FF: renamed from: b (aji) boolean
   public boolean method_2939(aji var1) {
      boolean var3;
      label28: {
         String[] var2 = class_752.method_4253();
         aji var10000 = var1;
         if(var2 != null) {
            if(var1 == class_1192.field_6057) {
               break label28;
            }

            var10000 = var1;
         }

         Object var10001 = class_1192.field_6082;
         if(var2 != null) {
            if(var10000 == class_1192.field_6082) {
               break label28;
            }

            var10000 = var1;
            var10001 = class_1192.field_6156;
         }

         if(var10000 != var10001) {
            var3 = false;
            return var3;
         }
      }

      var3 = true;
      return var3;
   }

   // $FF: renamed from: a (add, aji) float
   public float method_2927(add var1, aji var2) {
      String[] var3 = class_752.method_4253();
      aji var10000 = var2;
      if(var3 != null) {
         if(var2 == class_1192.field_6057) {
            return 15.0F;
         }

         var10000 = var2;
      }

      if(var3 != null) {
         if(var10000.method_2424() == awt.field_4179) {
            return 15.0F;
         }

         var10000 = var2;
      }

      if(var10000 == class_1192.field_6062) {
         return 5.0F;
      } else {
         return super.method_2927(var1, var2);
      }
   }
}

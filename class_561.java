import java.util.List;

// $FF: renamed from: b0
public class class_561 extends class_557 {

   // $FF: renamed from: <init> (int, float, boolean) void
   public void getBlock40(int var1, float var2, boolean var3) {
      super.getBlock40(var1, var2, var3);
      this.method_2933(true);
   }

   // $FF: renamed from: e (add) boolean
   public boolean method_2965(add var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.method_3745();
      if(var2 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f (add) z
   public class_134 method_2966(add var1) {
      return var1.method_3745() == 0?class_134.field_352:class_134.field_353;
   }

   // $FF: renamed from: e (add, ahb, yz) void
   protected void getBlock42(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var2.field_1832;
      class_1645 var10001;
      if(var4 != null) {
         if(!var2.field_1832) {
            var10001 = new class_1645;
            var10001.method_9012(class_1635.field_8512.field_8526, 2400, 0);
            var3.method_4179(var10001);
         }

         var10000 = var1.method_3745();
      }

      label31: {
         if(var4 != null) {
            if(var10000 <= 0) {
               break label31;
            }

            var10000 = var2.field_1832;
         }

         if(var10000 != 0) {
            return;
         }

         var10001 = new class_1645;
         var10001.method_9012(class_1635.field_8500.field_8526, 600, 4);
         var3.method_4179(var10001);
         var10001 = new class_1645;
         var10001.method_9012(class_1635.field_8501.field_8526, 6000, 0);
         var3.method_4179(var10001);
         var10001 = new class_1645;
         var10001.method_9012(class_1635.field_8502.field_8526, 6000, 0);
         var3.method_4179(var10001);
         if(var4 != null) {
            return;
         }
      }

      super.getBlock42(var1, var2, var3);
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void getSubItems(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 1);
      var3.add(var10001);
   }
}

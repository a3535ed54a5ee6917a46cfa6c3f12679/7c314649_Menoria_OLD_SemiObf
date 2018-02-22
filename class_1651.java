import java.util.Random;

// $FF: renamed from: vE
public class class_1651 extends class_1650 {

   // $FF: renamed from: a add
   private final add field_8598;
   // $FF: renamed from: d float
   private float field_8599;
   // $FF: renamed from: e boolean
   private boolean field_8600;


   // $FF: renamed from: <init> (add, int) void
   public void method_9090(add var1, int var2) {
      super.method_9088(var2);
      this.field_8598 = var1;
   }

   // $FF: renamed from: b (java.util.Random) add
   public add method_9091(Random var1) {
      add var3 = this.field_8598.method_3754();
      String[] var2 = class_752.method_4253();
      float var6;
      int var10000 = (var6 = this.field_8599 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
      if(var2 != null) {
         if(var10000 > 0) {
            int var5;
            label31: {
               label38: {
                  int var4 = (int)(this.field_8599 * (float)this.field_8598.method_3747());
                  var5 = var3.method_3747() - var1.nextInt(var1.nextInt(var4) + 1);
                  var10000 = var5;
                  int var10001 = var4;
                  if(var2 != null) {
                     if(var5 > var4) {
                        var5 = var4;
                     }

                     var10000 = var5;
                     if(var2 == null) {
                        break label38;
                     }

                     var10001 = 1;
                  }

                  if(var10000 >= var10001) {
                     break label31;
                  }

                  var10000 = 1;
               }

               var5 = var10000;
            }

            var3.method_3746(var5);
         }

         var10000 = this.field_8600;
      }

      if(var10000 != 0) {
         class_980.method_5663(var1, var3, 30);
      }

      return var3;
   }

   // $FF: renamed from: b (float) vE
   public class_1651 method_9092(float var1) {
      this.field_8599 = var1;
      return this;
   }

   // $FF: renamed from: b () vE
   public class_1651 method_9093() {
      this.field_8600 = true;
      return this;
   }
}

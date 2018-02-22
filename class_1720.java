
// $FF: renamed from: vv
public class class_1720 {

   // $FF: renamed from: b float
   private float field_9020;
   // $FF: renamed from: c float
   private float field_9021;
   // $FF: renamed from: d float
   private float field_9022;


   // $FF: renamed from: <init> () void
   public void method_9612() {
      super();
   }

   // $FF: renamed from: b (float, float) float
   public float method_9613(float var1, float var2) {
      float var4;
      label36: {
         label35: {
            label39: {
               this.field_9020 += var1;
               String[] var3 = class_752.method_4253();
               var1 = (this.field_9020 - this.field_9021) * var2;
               this.field_9022 += (var1 - this.field_9022) * 0.5F;
               float var5;
               int var10000 = (var5 = var1 - 0.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
               if(var3 != null) {
                  if(var10000 > 0) {
                     var4 = var1;
                     if(var3 == null) {
                        break label35;
                     }

                     if(var1 > this.field_9022) {
                        break label39;
                     }
                  }

                  var4 = var1;
                  if(var3 == null) {
                     return var4;
                  }

                  float var6;
                  var10000 = (var6 = var1 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
               }

               if(var10000 >= 0) {
                  break label36;
               }

               var4 = var1;
               if(var3 == null) {
                  return var4;
               }

               if(var1 >= this.field_9022) {
                  break label36;
               }
            }

            var4 = this.field_9022;
         }

         var1 = var4;
      }

      this.field_9021 += var1;
      var4 = var1;
      return var4;
   }
}

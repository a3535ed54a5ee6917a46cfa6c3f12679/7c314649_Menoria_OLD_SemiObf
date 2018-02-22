
// $FF: renamed from: dd
public class class_1034 {

   // $FF: renamed from: b int
   public final int field_5472;
   // $FF: renamed from: c int
   public final int field_5473;
   // $FF: renamed from: d int
   public final int field_5474;


   // $FF: renamed from: <init> (int, int, int) void
   public void method_5854(int var1, int var2, int var3) {
      super();
      this.field_5472 = var1;
      this.field_5473 = var2;
      this.field_5474 = var3;
   }

   // $FF: renamed from: <init> (azw) void
   public void method_5855(azw var1) {
      this.method_5854(class_1715.method_9561(var1.field_4220), class_1715.method_9561(var1.field_4221), class_1715.method_9561(var1.field_4222));
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1 instanceof class_1034;
      if(var2 != null) {
         if(var10000) {
            int var4;
            label40: {
               class_1034 var3 = (class_1034)var1;
               var4 = var3.field_5472;
               int var10001 = this.field_5472;
               if(var2 != null) {
                  if(var3.field_5472 != this.field_5472) {
                     break label40;
                  }

                  var4 = var3.field_5473;
                  var10001 = this.field_5473;
               }

               if(var2 != null) {
                  if(var4 != var10001) {
                     break label40;
                  }

                  var4 = var3.field_5474;
                  if(var2 == null) {
                     return (boolean)var4;
                  }

                  var10001 = this.field_5474;
               }

               if(var4 == var10001) {
                  var4 = 1;
                  return (boolean)var4;
               }
            }

            var4 = 0;
            return (boolean)var4;
         }

         var10000 = false;
      }

      return var10000;
   }

   public int hashCode() {
      return this.field_5472 * 8976890 + this.field_5473 * 981131 + this.field_5474;
   }
}

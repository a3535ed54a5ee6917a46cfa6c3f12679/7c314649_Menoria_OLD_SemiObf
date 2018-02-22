
// $FF: renamed from: yC
public class class_1763 extends class_1727 {

   // $FF: renamed from: c wI
   private class_761 field_9215;
   // $FF: renamed from: d y_
   private class_1841 field_9216;
   // $FF: renamed from: e int
   private int field_9217;
   // $FF: renamed from: f int
   private int field_9218;


   // $FF: renamed from: <init> (wI) void
   public void method_9725(class_761 var1) {
      super.method_9648();
      this.field_9217 = -1;
      this.field_9218 = -1;
      this.field_9215 = var1;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      boolean var7;
      label76: {
         String[] var10000 = class_752.method_4253();
         int var2 = class_1715.method_9561(this.field_9215.field_2994);
         String[] var1 = var10000;
         int var3 = class_1715.method_9561(this.field_9215.field_2995);
         int var4 = class_1715.method_9561(this.field_9215.field_2996);
         int var6 = this.field_9215.field_2990.method_2078();
         if(var1 != null) {
            label71: {
               if(var6 != 0) {
                  var6 = this.field_9215.field_2990.method_2203();
                  if(var1 == null) {
                     break label71;
                  }

                  if(var6 == 0) {
                     var7 = this.field_9215.field_2990.method_35(var2, var4).method_5708();
                     if(var1 == null) {
                        return var7;
                     }

                     if(var7) {
                        break label76;
                     }
                  }
               }

               var6 = this.field_9215.field_2990.field_1820.field_5736;
            }
         }

         if(var1 != null) {
            if(var6 != 0) {
               break label76;
            }

            var6 = this.field_9215.method_4165().nextInt(50);
         }

         class_761 var9;
         label54: {
            class_1763 var8;
            label77: {
               if(var1 != null) {
                  if(var6 != 0) {
                     return false;
                  }

                  var8 = this;
                  if(var1 == null) {
                     break label77;
                  }

                  var6 = this.field_9217;
               }

               if(var6 != -1) {
                  var9 = this.field_9215;
                  if(var1 == null) {
                     break label54;
                  }

                  if(this.field_9215.method_3889((double)this.field_9217, this.field_9215.field_2995, (double)this.field_9218) < 4.0D) {
                     return false;
                  }
               }

               var8 = this;
            }

            var9 = var8.field_9215;
         }

         class_1849 var5 = var9.field_2990.field_1827.method_6780(var2, var3, var4, 14);
         if(var1 != null) {
            if(var5 == null) {
               return false;
            }

            this.field_9216 = var5.method_10011(var2, var3, var4);
         }

         return this.field_9216 != null;
      }

      var7 = false;
      return var7;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9215.method_4257().method_9801();
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      String[] var10000 = class_752.method_4253();
      this.field_9217 = -1;
      String[] var1 = var10000;
      double var4;
      int var3 = (var4 = this.field_9215.method_3889((double)this.field_9216.method_9961(), (double)this.field_9216.field_9398, (double)this.field_9216.method_9963()) - 256.0D) == 0.0D?0:(var4 < 0.0D?-1:1);
      if(var1 != null) {
         if(var3 > 0) {
            azw var2 = class_1787.method_9819(this.field_9215, 14, 3, azw.method_5086((double)this.field_9216.method_9961() + 0.5D, (double)this.field_9216.method_9962(), (double)this.field_9216.method_9963() + 0.5D));
            if(var2 != null) {
               this.field_9215.method_4257().method_9794(var2.field_4220, var2.field_4221, var2.field_4222, 1.0D);
            }

            if(var1 != null) {
               return;
            }
         }

         this.field_9215.method_4257().method_9794((double)this.field_9216.method_9961() + 0.5D, (double)this.field_9216.method_9962(), (double)this.field_9216.method_9963() + 0.5D, 1.0D);
      }

   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9217 = this.field_9216.method_9961();
      this.field_9218 = this.field_9216.method_9963();
      this.field_9216 = null;
   }
}

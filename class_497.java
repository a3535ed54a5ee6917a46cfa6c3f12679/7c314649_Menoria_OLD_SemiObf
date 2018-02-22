
// $FF: renamed from: aV
public class class_497 extends class_492 {

   // $FF: renamed from: g yz
   private class_792 field_2302;
   // $FF: renamed from: h int
   private int field_2303;


   // $FF: renamed from: <init> (yz, vI, int, int, int) void
   public void method_2893(class_792 var1, class_22 var2, int var3, int var4, int var5) {
      super.method_2869(var2, var3, var4, var5);
      this.field_2302 = var1;
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      return false;
   }

   // $FF: renamed from: b (int) add
   public add method_2881(int var1) {
      String[] var2 = class_752.method_4253();
      class_497 var10000 = this;
      if(var2 != null) {
         if(this.method_2876()) {
            this.field_2303 += Math.min(var1, this.method_2875().field_2958);
         }

         var10000 = this;
      }

      return var10000.method_2881(var1);
   }

   // $FF: renamed from: b (yz, add) void
   public void method_2873(class_792 var1, add var2) {
      this.method_2872(var2);
      super.method_2873(var1, var2);
   }

   // $FF: renamed from: b (add, int) void
   protected void method_2871(add var1, int var2) {
      this.field_2303 += var2;
      this.method_2872(var1);
   }

   // $FF: renamed from: a (add) void
   protected void method_2872(add var1) {
      String[] var10000 = class_752.method_4253();
      var1.method_3762(this.field_2302.field_2990, this.field_2302, this.field_2303);
      String[] var2 = var10000;
      if(var2 == null) {
         this.field_2303 = 0;
      } else {
         label80: {
            if(!this.field_2302.field_2990.field_1832) {
               int var3;
               int var5;
               int var6;
               label71: {
                  var3 = this.field_2303;
                  float var4 = class_1018.method_5783().method_5791(var1);
                  float var10;
                  var6 = (var10 = var4 - 0.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
                  if(var2 != null) {
                     if(var6 == 0) {
                        var3 = 0;
                        if(var2 != null) {
                           var6 = var3;
                           break label71;
                        }
                     }

                     float var11;
                     var6 = (var11 = var4 - 1.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
                  }

                  if(var2 != null) {
                     if(var6 < 0) {
                        var5 = class_1715.method_9559((float)var3 * var4);
                        var6 = var5;
                        if(var2 != null) {
                           label43: {
                              if(var5 < class_1715.method_9566((float)var3 * var4)) {
                                 float var12;
                                 var6 = (var12 = (float)Math.random() - ((float)var3 * var4 - (float)var5)) == 0.0F?0:(var12 < 0.0F?-1:1);
                                 if(var2 == null) {
                                    break label43;
                                 }

                                 if(var6 < 0) {
                                    ++var5;
                                 }
                              }

                              var6 = var5;
                           }
                        }

                        var3 = var6;
                     }

                     var6 = var3;
                  }
               }

               while(var6 > 0) {
                  var5 = class_715.method_4090(var3);
                  var3 -= var5;
                  ahb var8 = this.field_2302.field_2990;
                  class_715 var10001 = new class_715;
                  var10001.method_4087(this.field_2302.field_2990, this.field_2302.field_2994, this.field_2302.field_2995 + 0.5D, this.field_2302.field_2996 + 0.5D, var5);
                  var8.method_2089(var10001);
                  if(var2 == null) {
                     break label80;
                  }

                  if(var2 == null) {
                     break;
                  }

                  var6 = var3;
               }
            }

            this.field_2303 = 0;
         }
      }

      adb var9 = var1.method_3730();
      adb var7 = class_1010.field_5123;
      if(var2 != null) {
         if(var9 == class_1010.field_5123) {
            this.field_2302.method_4615(class_1600.field_8335, 1);
         }

         var9 = var1.method_3730();
         var7 = class_1010.field_5207;
      }

      if(var9 == var7) {
         this.field_2302.method_4615(class_1600.field_8340, 1);
      }

   }
}

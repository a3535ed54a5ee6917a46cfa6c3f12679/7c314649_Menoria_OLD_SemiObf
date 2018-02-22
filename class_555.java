
// $FF: renamed from: b3
public class class_555 extends adb {

   // $FF: renamed from: n y
   protected class_133 field_2419;


   // $FF: renamed from: <init> (y) void
   public void getBlock36(class_133 var1) {
      super.method_2917();
      this.field_2419 = var1;
      this.field_2333 = 1;
      this.method_2935(var1.method_628());
      this.method_2974(class_872.fontRendererInstance1);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      boolean var10000 = var2.method_4628(var4, var5, var6, var7, var1);
      if(var11 != null) {
         if(var10000) {
            aji var12 = var3.getBlock(var4, var5, var6);
            int var14 = var7;
            if(var11 != null) {
               if(var7 != 0) {
                  label52: {
                     aji var15 = var3.getBlock(var4, var5 + 1, var6);
                     if(var11 != null) {
                        if(var15.method_2424() != awt.field_4170) {
                           break label52;
                        }

                        var15 = var12;
                     }

                     if(var11 != null) {
                        label36: {
                           if(var15 != class_1192.field_6027) {
                              var15 = var12;
                              if(var11 == null) {
                                 break label36;
                              }

                              if(var12 != class_1192.field_6028) {
                                 break label52;
                              }
                           }

                           var15 = class_1192.field_6087;
                        }
                     }

                     aji var13 = var15;
                     var3.method_2084((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var13.field_2005.method_5995(), (var13.field_2005.method_5992() + 1.0F) / 2.0F, var13.field_2005.method_5993() * 0.8F);
                     var10000 = var3.field_1832;
                     if(var11 != null) {
                        if(var3.field_1832) {
                           return true;
                        }

                        var3.method_2058(var4, var5, var6, var13);
                        var1.method_3749(1, var2);
                        var10000 = true;
                     }

                     return var10000;
                  }
               }

               var14 = 0;
            }

            return (boolean)var14;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2942() {
      return true;
   }

   // $FF: renamed from: e () java.lang.String
   public String getBlock37() {
      return this.field_2419.toString();
   }
}

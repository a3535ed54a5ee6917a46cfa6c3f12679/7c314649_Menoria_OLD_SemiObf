
// $FF: renamed from: jA
public class class_1284 extends class_1265 {

   // $FF: renamed from: f jm
   private class_1265 field_6588;
   // $FF: renamed from: g jm
   private class_1265 field_6589;


   // $FF: renamed from: <init> (long, jm, jm) void
   public void method_6713(long var1, class_1265 var3, class_1265 var4) {
      super.method_6675(var1);
      this.field_6588 = var3;
      this.field_6589 = var4;
   }

   // $FF: renamed from: b (long) void
   public void method_6676(long var1) {
      this.field_6588.method_6676(var1);
      this.field_6589.method_6676(var1);
      super.method_6676(var1);
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      int[] var6 = this.field_6588.method_6679(var1, var2, var3, var4);
      String[] var10000 = class_752.method_4253();
      int[] var7 = this.field_6589.method_6679(var1, var2, var3, var4);
      int[] var8 = class_1323.method_6956(var3 * var4);
      int var9 = 0;
      String[] var5 = var10000;

      int[] var10;
      while(true) {
         if(var9 < var3 * var4) {
            var10 = var6;
            if(var5 == null) {
               break;
            }

            label74: {
               int var10001;
               label84: {
                  int var11;
                  label85: {
                     label71: {
                        var10001 = var9;
                        if(var5 != null) {
                           if(var6[var9] != class_985.field_4988.field_5050) {
                              var11 = var6[var9];
                              var10001 = class_985.field_5012.field_5050;
                              if(var5 == null) {
                                 break label85;
                              }

                              if(var11 != class_985.field_5012.field_5050) {
                                 break label71;
                              }
                           }

                           var10 = var8;
                           var10001 = var9;
                        }

                        var10[var10001] = var6[var9];
                        if(var5 != null) {
                           break label74;
                        }
                     }

                     var10 = var7;
                     var10001 = var9;
                     if(var5 == null) {
                        break label84;
                     }

                     var11 = var7[var9];
                     var10001 = class_985.field_4995.field_5050;
                  }

                  if(var11 == var10001) {
                     label56: {
                        label55: {
                           label86: {
                              var11 = var6[var9];
                              var10001 = class_985.field_5000.field_5050;
                              if(var5 != null) {
                                 if(var11 == class_985.field_5000.field_5050) {
                                    var8[var9] = class_985.field_4999.field_5050;
                                    if(var5 != null) {
                                       break label74;
                                    }
                                 }

                                 var10 = var6;
                                 var10001 = var9;
                                 if(var5 == null) {
                                    break label86;
                                 }

                                 var11 = var6[var9];
                                 var10001 = class_985.field_5002.field_5050;
                              }

                              if(var11 != var10001) {
                                 var10 = var6;
                                 var10001 = var9;
                                 if(var5 == null) {
                                    break label56;
                                 }

                                 if(var6[var9] != class_985.field_5003.field_5050) {
                                    break label55;
                                 }
                              }

                              var10 = var8;
                              var10001 = var9;
                           }

                           var10[var10001] = class_985.field_5003.field_5050;
                           if(var5 != null) {
                              break label74;
                           }
                        }

                        var10 = var8;
                        var10001 = var9;
                     }

                     var10[var10001] = var7[var9] & 255;
                     if(var5 != null) {
                        break label74;
                     }
                  }

                  var10 = var8;
                  var10001 = var9;
               }

               var10[var10001] = var6[var9];
            }

            ++var9;
            if(var5 != null) {
               continue;
            }
         }

         var10 = var8;
         break;
      }

      return var10;
   }
}

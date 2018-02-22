
// $FF: renamed from: cq
public class class_1014 implements class_19 {

   // $FF: renamed from: <init> () void
   public void method_5774() {
      super();
   }

   // $FF: renamed from: b (aO, ahb) boolean
   public boolean method_60(class_897 var1, ahb var2) {
      int var4 = 0;
      String[] var10000 = class_752.method_4253();
      add var5 = null;
      String[] var3 = var10000;
      int var6 = 0;

      add var8;
      while(true) {
         if(var6 < var1.method_83()) {
            add var7 = var1.method_84(var6);
            var8 = var7;
            if(var3 == null) {
               break;
            }

            label71: {
               if(var3 != null) {
                  if(var7 == null) {
                     break label71;
                  }

                  var8 = var7;
               }

               adb var9 = var8.method_3730();
               adb var10001 = class_1010.field_5243;
               if(var3 != null) {
                  if(var9 == class_1010.field_5243) {
                     var8 = var5;
                     if(var3 != null) {
                        if(var5 != null) {
                           return false;
                        }

                        var8 = var7;
                     }

                     var5 = var8;
                     if(var3 != null) {
                        break label71;
                     }
                  }

                  var9 = var7.method_3730();
                  var10001 = class_1010.field_5242;
               }

               if(var9 == var10001) {
                  ++var4;
                  if(var3 != null) {
                     break label71;
                  }
               }

               return false;
            }

            ++var6;
            if(var3 != null) {
               continue;
            }
         }

         var8 = var5;
         break;
      }

      int var10;
      if(var8 != null) {
         var10 = var4;
         if(var3 == null) {
            return (boolean)var10;
         }

         if(var4 > 0) {
            var10 = 1;
            return (boolean)var10;
         }
      }

      var10 = 0;
      return (boolean)var10;
   }

   // $FF: renamed from: b (aO) add
   public add method_61(class_897 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      add var4 = null;
      String[] var2 = var10000;
      int var5 = 0;

      add var7;
      while(true) {
         if(var5 < var1.method_83()) {
            add var6 = var1.method_84(var5);
            var7 = var6;
            if(var2 == null) {
               break;
            }

            label72: {
               if(var2 != null) {
                  if(var6 == null) {
                     break label72;
                  }

                  var7 = var6;
               }

               adb var9 = var7.method_3730();
               adb var10001 = class_1010.field_5243;
               if(var2 != null) {
                  if(var9 == class_1010.field_5243) {
                     var7 = var4;
                     if(var2 != null) {
                        if(var4 != null) {
                           return null;
                        }

                        var7 = var6;
                     }

                     var4 = var7;
                     if(var2 != null) {
                        break label72;
                     }
                  }

                  var9 = var6.method_3730();
                  var10001 = class_1010.field_5242;
               }

               if(var9 == var10001) {
                  ++var3;
                  if(var2 != null) {
                     break label72;
                  }
               }

               return null;
            }

            ++var5;
            if(var2 != null) {
               continue;
            }
         }

         var7 = var4;
         break;
      }

      if(var7 != null && var3 >= 1) {
         var7 = new add;
         var7.method_3725(class_1010.field_5243, var3 + 1);
         add var8 = var7;
         var8.method_3769((class_1583)var4.method_3767().method_8633());
         var7 = var4;
         if(var2 != null) {
            if(var4.method_3773()) {
               var8.method_3771(var4.method_3770());
            }

            var7 = var8;
         }

         return var7;
      } else {
         return null;
      }
   }

   // $FF: renamed from: b () int
   public int method_62() {
      return 9;
   }

   // $FF: renamed from: c () add
   public add method_63() {
      return null;
   }
}

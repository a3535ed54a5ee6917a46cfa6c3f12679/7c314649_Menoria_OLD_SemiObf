import java.util.Random;

// $FF: renamed from: hP
public class class_1176 extends class_1151 {

   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6349();
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      int var7 = var3;
      String[] var10000 = class_752.method_4253();
      int var8 = var5;
      String[] var6 = var10000;

      label57:
      while(true) {
         int var10 = var4;

         label54:
         while(var10 < 128) {
            var10 = var1.method_34(var3, var4, var5);
            if(var6 == null) {
               return (boolean)var10;
            }

            label51: {
               if(var6 != null) {
                  if(var10 != 0) {
                     int var9 = 2;

                     while(var9 <= 5) {
                        var10 = class_1192.field_6131.method_2479(var1, var3, var4, var5, var9);
                        if(var6 == null) {
                           continue label54;
                        }

                        label40: {
                           if(var6 != null) {
                              if(var10 == 0) {
                                 break label40;
                              }

                              var1.method_2054(var3, var4, var5, class_1192.field_6131, 1 << class_1649.field_8591[class_1707.field_8946[var9]], 2);
                           }

                           if(var6 != null) {
                              break;
                           }
                        }

                        ++var9;
                        if(var6 == null) {
                           break;
                        }
                     }

                     if(var6 != null) {
                        break label51;
                     }
                  }

                  var3 = var7 + var2.nextInt(4) - var2.nextInt(4);
                  var10 = var8 + var2.nextInt(4) - var2.nextInt(4);
               }

               var5 = var10;
            }

            ++var4;
            if(var6 != null) {
               continue label57;
            }
            break;
         }

         var10 = 1;
         return (boolean)var10;
      }
   }
}

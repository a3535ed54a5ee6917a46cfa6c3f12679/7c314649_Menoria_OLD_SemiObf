
// $FF: renamed from: At
public class class_678 extends class_671 {

   // $FF: renamed from: i gq
   private class_589 field_2911;


   // $FF: renamed from: <init> (vI, gq) void
   public void method_3696(class_22 var1, class_589 var2) {
      String[] var10000 = class_752.method_4253();
      super.method_3645();
      String[] var3 = var10000;
      this.field_2911 = var2;
      int var4 = 0;

      class_492 var10001;
      int var5;
      byte var6;
      while(true) {
         if(var4 < 3) {
            var6 = 0;
            if(var3 == null) {
               break;
            }

            var5 = 0;

            while(true) {
               if(var5 < 3) {
                  var10001 = new class_492;
                  var10001.method_2869(var2, var5 + var4 * 3, 62 + var5 * 18, 17 + var4 * 18);
                  this.method_3646(var10001);
                  ++var5;
                  if(var3 == null) {
                     break;
                  }

                  if(var3 != null) {
                     continue;
                  }
               }

               ++var4;
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var6 = 0;
         break;
      }

      var4 = var6;

      while(true) {
         if(var4 < 3) {
            var6 = 0;
            if(var3 == null) {
               break;
            }

            var5 = 0;

            while(true) {
               if(var5 < 9) {
                  var10001 = new class_492;
                  var10001.method_2869(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18);
                  this.method_3646(var10001);
                  ++var5;
                  if(var3 == null) {
                     break;
                  }

                  if(var3 != null) {
                     continue;
                  }
               }

               ++var4;
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var6 = 0;
         break;
      }

      var4 = var6;

      while(var4 < 9) {
         var10001 = new class_492;
         var10001.method_2869(var1, var4, 8 + var4 * 18, 142);
         this.method_3646(var10001);
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      return this.field_2911.method_92(var1);
   }

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      add var4 = null;
      String[] var3 = var10000;
      class_492 var5 = (class_492)this.field_2869.get(var2);
      class_492 var7 = var5;
      if(var3 != null) {
         if(var5 == null) {
            return var4;
         }

         var7 = var5;
      }

      if(var3 != null) {
         if(!var7.method_2876()) {
            return var4;
         }

         var7 = var5;
      }

      add var6;
      int var8;
      label46: {
         label60: {
            var6 = var7.method_2875();
            var4 = var6.method_3754();
            var8 = var2;
            if(var3 != null) {
               if(var2 < 9) {
                  var8 = this.method_3667(var6, 9, 45, true);
                  if(var3 == null) {
                     break label46;
                  }

                  if(var8 == 0) {
                     return null;
                  }
                  break label60;
               }

               var8 = this.method_3667(var6, 0, 9, false);
            }

            if(var3 == null) {
               break label46;
            }

            if(var8 == 0) {
               return null;
            }
         }

         var8 = var6.field_2958;
      }

      label34: {
         if(var8 == 0) {
            var5.method_2877((add)null);
            if(var3 != null) {
               break label34;
            }
         }

         var5.method_2878();
      }

      if(var6.field_2958 == var4.field_2958) {
         return null;
      } else {
         var5.method_2873(var1, var6);
         return var4;
      }
   }
}

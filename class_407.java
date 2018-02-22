
// $FF: renamed from: fD
public abstract class class_407 extends aji {

   // $FF: renamed from: M vL
   protected class_73 field_2112;


   // $FF: renamed from: <init> (awt) void
   protected void method_2427(awt var1) {
      super.method_2427(var1);
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 31;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var11 = var9 & 3;
      String[] var10000 = class_752.method_4253();
      byte var12 = 0;
      String[] var10 = var10000;
      int var13 = var5;
      if(var10 != null) {
         switch(var5) {
         case 2:
         case 3:
            var12 = 8;
            if(var10 != null) {
               break;
            }
         case 4:
         case 5:
            var12 = 4;
            if(var10 != null) {
               break;
            }
         case 0:
         case 1:
            var12 = 0;
         }

         var13 = var11 | var12;
      }

      return var13;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      int var4 = var2 & 12;
      String[] var10000 = class_752.method_4253();
      int var5 = var2 & 3;
      String[] var3 = var10000;
      int var6 = var4;
      if(var3 != null) {
         label74: {
            if(var4 == 0) {
               var6 = var1;
               if(var3 != null) {
                  if(var1 == 1) {
                     return this.method_2649(var5);
                  }

                  var6 = var1;
               }

               if(var3 == null) {
                  break label74;
               }

               if(var6 == 0) {
                  return this.method_2649(var5);
               }
            }

            var6 = var4;
         }
      }

      byte var10001 = 4;
      if(var3 != null) {
         label59: {
            if(var6 == 4) {
               var6 = var1;
               var10001 = 5;
               if(var3 != null) {
                  if(var1 == 5) {
                     return this.method_2649(var5);
                  }

                  var6 = var1;
                  var10001 = 4;
               }

               if(var3 == null) {
                  break label59;
               }

               if(var6 == var10001) {
                  return this.method_2649(var5);
               }
            }

            var6 = var4;
            var10001 = 8;
         }
      }

      if(var3 != null) {
         if(var6 != var10001) {
            return this.method_2648(var5);
         }

         var6 = var1;
         var10001 = 2;
      }

      if(var3 != null) {
         if(var6 == var10001) {
            return this.method_2649(var5);
         }

         var6 = var1;
         var10001 = 3;
      }

      if(var6 != var10001) {
         return this.method_2648(var5);
      } else {
         return this.method_2649(var5);
      }
   }

   // $FF: renamed from: c (int) vL
   protected abstract class_73 method_2648(int var1);

   // $FF: renamed from: k (int) vL
   protected class_73 method_2649(int var1) {
      return this.field_2112;
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1 & 3;
   }

   // $FF: renamed from: l (int) int
   public int method_2650(int var1) {
      return var1 & 3;
   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      add var10000 = new add;
      var10000.method_3726(adb.method_2920(this), 1, this.method_2650(var1));
      return var10000;
   }
}

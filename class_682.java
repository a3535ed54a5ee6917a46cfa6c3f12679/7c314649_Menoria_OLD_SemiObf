
// $FF: renamed from: Ap
public class class_682 extends class_671 {

   // $FF: renamed from: i vI
   private final class_22 field_2923;


   // $FF: renamed from: <init> (Af, vI) void
   public void method_3702(class_666 var1, class_22 var2) {
      super.method_3645();
      this.field_2923 = var2;
      String[] var10000 = class_752.method_4253();
      var2.method_93();
      String[] var3 = var10000;
      byte var4 = 51;
      int var5 = 0;

      class_492 var10001;
      while(true) {
         if(var5 < var2.method_83()) {
            var10001 = new class_492;
            var10001.method_2869(var2, var5, 44 + var5 * 18, 20);
            this.method_3646(var10001);
            ++var5;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var5 = 0;
         break;
      }

      byte var7;
      while(true) {
         if(var5 < 3) {
            var7 = 0;
            if(var3 == null) {
               break;
            }

            int var6 = 0;

            while(true) {
               if(var6 < 9) {
                  var10001 = new class_492;
                  var10001.method_2869(var1, var6 + var5 * 9 + 9, 8 + var6 * 18, var5 * 18 + var4);
                  this.method_3646(var10001);
                  ++var6;
                  if(var3 == null) {
                     break;
                  }

                  if(var3 != null) {
                     continue;
                  }
               }

               ++var5;
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var7 = 0;
         break;
      }

      var5 = var7;

      while(var5 < 9) {
         var10001 = new class_492;
         var10001.method_2869(var1, var5, 8 + var5 * 18, 58 + var4);
         this.method_3646(var10001);
         ++var5;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      return this.field_2923.method_92(var1);
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

      int var8;
      label40: {
         add var6;
         label54: {
            var6 = var7.method_2875();
            var4 = var6.method_3754();
            var8 = var2;
            if(var3 != null) {
               if(var2 < this.field_2923.method_83()) {
                  var8 = this.method_3667(var6, this.field_2923.method_83(), this.field_2869.size(), true);
                  if(var3 == null) {
                     break label40;
                  }

                  if(var8 == 0) {
                     return null;
                  }
                  break label54;
               }

               var8 = this.method_3667(var6, 0, this.field_2923.method_83(), false);
            }

            if(var3 == null) {
               break label40;
            }

            if(var8 == 0) {
               return null;
            }
         }

         var8 = var6.field_2958;
      }

      if(var8 == 0) {
         var5.method_2877((add)null);
         if(var3 != null) {
            return var4;
         }
      }

      var5.method_2878();
      return var4;
   }

   // $FF: renamed from: a (yz) void
   public void method_3658(class_792 var1) {
      super.method_3658(var1);
      this.field_2923.method_94();
   }
}


// $FF: renamed from: Am
public class class_685 extends class_671 {

   // $FF: renamed from: i vI
   private class_22 field_2940;
   // $FF: renamed from: l int
   private int field_2941;


   // $FF: renamed from: <init> (vI, vI) void
   public void method_3705(class_22 var1, class_22 var2) {
      super.method_3645();
      String[] var10000 = class_752.method_4253();
      this.field_2940 = var2;
      this.field_2941 = var2.method_83() / 9;
      var2.method_93();
      int var4 = (this.field_2941 - 4) * 18;
      int var5 = 0;
      String[] var3 = var10000;

      class_492 var10001;
      int var6;
      byte var7;
      while(true) {
         if(var5 < this.field_2941) {
            var7 = 0;
            if(var3 == null) {
               break;
            }

            var6 = 0;

            while(true) {
               if(var6 < 9) {
                  var10001 = new class_492;
                  var10001.method_2869(var2, var6 + var5 * 9, 8 + var6 * 18, 18 + var5 * 18);
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

      while(true) {
         if(var5 < 3) {
            var7 = 0;
            if(var3 == null) {
               break;
            }

            var6 = 0;

            while(true) {
               if(var6 < 9) {
                  var10001 = new class_492;
                  var10001.method_2869(var1, var6 + var5 * 9 + 9, 8 + var6 * 18, 103 + var5 * 18 + var4);
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
         var10001.method_2869(var1, var5, 8 + var5 * 18, 161 + var4);
         this.method_3646(var10001);
         ++var5;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      return this.field_2940.method_92(var1);
   }

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      add var4 = null;
      class_492 var5 = (class_492)this.field_2869.get(var2);
      String[] var3 = class_752.method_4253();
      class_492 var10000 = var5;
      if(var3 != null) {
         if(var5 == null) {
            return var4;
         }

         var10000 = var5;
      }

      if(var3 != null) {
         if(!var10000.method_2876()) {
            return var4;
         }

         var10000 = var5;
      }

      int var7;
      label40: {
         add var6;
         label54: {
            var6 = var10000.method_2875();
            var4 = var6.method_3754();
            var7 = var2;
            if(var3 != null) {
               if(var2 < this.field_2941 * 9) {
                  var7 = this.method_3667(var6, this.field_2941 * 9, this.field_2869.size(), true);
                  if(var3 == null) {
                     break label40;
                  }

                  if(var7 == 0) {
                     return null;
                  }
                  break label54;
               }

               var7 = this.method_3667(var6, 0, this.field_2941 * 9, false);
            }

            if(var3 == null) {
               break label40;
            }

            if(var7 == 0) {
               return null;
            }
         }

         var7 = var6.field_2958;
      }

      if(var7 == 0) {
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
      this.field_2940.method_94();
   }

   // $FF: renamed from: a () vI
   public class_22 method_3706() {
      return this.field_2940;
   }
}

import java.util.Random;

// $FF: renamed from: hA
public class class_1191 extends class_1151 {

   // $FF: renamed from: c aji
   private aji field_6023;
   // $FF: renamed from: d boolean
   private boolean field_6024;


   // $FF: renamed from: <init> (aji, boolean) void
   public void method_6409(aji var1, boolean var2) {
      super.method_6349();
      this.field_6023 = var1;
      this.field_6024 = var2;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      aji var10000 = var1.getBlock(var3, var4 + 1, var5);
      if(var6 != null) {
         if(var10000 != class_1192.field_6113) {
            return false;
         }

         var10000 = var1.getBlock(var3, var4, var5);
      }

      label134: {
         if(var6 != null) {
            if(var10000.method_2424() == awt.field_4170) {
               break label134;
            }

            var10000 = var1.getBlock(var3, var4, var5);
         }

         if(var10000 != class_1192.field_6113) {
            return false;
         }
      }

      int var7 = 0;
      var10000 = var1.getBlock(var3 - 1, var4, var5);
      aji var10001 = class_1192.field_6113;
      if(var6 != null) {
         if(var10000 == class_1192.field_6113) {
            ++var7;
         }

         var10000 = var1.getBlock(var3 + 1, var4, var5);
         var10001 = class_1192.field_6113;
      }

      if(var6 != null) {
         if(var10000 == var10001) {
            ++var7;
         }

         var10000 = var1.getBlock(var3, var4, var5 - 1);
         var10001 = class_1192.field_6113;
      }

      if(var6 != null) {
         if(var10000 == var10001) {
            ++var7;
         }

         var10000 = var1.getBlock(var3, var4, var5 + 1);
         var10001 = class_1192.field_6113;
      }

      if(var6 != null) {
         if(var10000 == var10001) {
            ++var7;
         }

         var10000 = var1.getBlock(var3, var4 - 1, var5);
         var10001 = class_1192.field_6113;
      }

      if(var10000 == var10001) {
         ++var7;
      }

      int var8 = 0;
      int var10 = var1.method_34(var3 - 1, var4, var5);
      if(var6 != null) {
         if(var10 != 0) {
            ++var8;
         }

         var10 = var1.method_34(var3 + 1, var4, var5);
      }

      if(var6 != null) {
         if(var10 != 0) {
            ++var8;
         }

         var10 = var1.method_34(var3, var4, var5 - 1);
      }

      if(var6 != null) {
         if(var10 != 0) {
            ++var8;
         }

         var10 = var1.method_34(var3, var4, var5 + 1);
      }

      if(var6 != null) {
         if(var10 != 0) {
            ++var8;
         }

         var10 = var1.method_34(var3, var4 - 1, var5);
      }

      if(var6 != null) {
         if(var10 != 0) {
            ++var8;
         }

         var10 = this.field_6024;
      }

      label112: {
         label111: {
            label110: {
               byte var9;
               label138: {
                  if(var6 != null) {
                     if(var10 == 0) {
                        var10 = var7;
                        var9 = 4;
                        if(var6 == null) {
                           break label138;
                        }

                        if(var7 == 4) {
                           if(var6 == null) {
                              break label111;
                           }

                           if(var8 == 1) {
                              break label110;
                           }
                        }
                     }

                     var10 = var7;
                  }

                  if(var6 == null) {
                     return (boolean)var10;
                  }

                  var9 = 5;
               }

               if(var10 != var9) {
                  break label112;
               }
            }

            var1.method_2054(var3, var4, var5, this.field_6023, 0, 2);
         }

         var1.field_1801 = true;
         this.field_6023.method_2456(var1, var3, var4, var5, var2);
         var1.field_1801 = false;
      }

      var10 = 1;
      return (boolean)var10;
   }
}

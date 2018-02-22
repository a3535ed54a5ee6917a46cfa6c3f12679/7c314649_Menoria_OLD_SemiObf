import java.util.Random;

// $FF: renamed from: hN
public class class_1178 extends class_1151 {

   // $FF: renamed from: c aji
   private aji field_6009;


   // $FF: renamed from: <init> (aji) void
   public void method_6398(aji var1) {
      super.method_6349();
      this.field_6009 = var1;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      aji var10000;
      aji var10001;
      String[] var6;
      label110: {
         var6 = class_752.method_4253();
         var10000 = var1.getBlock(var3, var4 + 1, var5);
         var10001 = class_1192.field_6026;
         if(var6 != null) {
            if(var10000 != class_1192.field_6026) {
               return false;
            }

            var10000 = var1.getBlock(var3, var4 - 1, var5);
            if(var6 == null) {
               break label110;
            }

            var10001 = class_1192.field_6026;
         }

         if(var10000 != var10001) {
            return false;
         }

         var10000 = var1.getBlock(var3, var4, var5);
      }

      label100: {
         if(var6 != null) {
            if(var10000.method_2424() == awt.field_4170) {
               break label100;
            }

            var10000 = var1.getBlock(var3, var4, var5);
         }

         if(var10000 != class_1192.field_6026) {
            return false;
         }
      }

      int var7 = 0;
      var10000 = var1.getBlock(var3 - 1, var4, var5);
      var10001 = class_1192.field_6026;
      if(var6 != null) {
         if(var10000 == class_1192.field_6026) {
            ++var7;
         }

         var10000 = var1.getBlock(var3 + 1, var4, var5);
         var10001 = class_1192.field_6026;
      }

      if(var6 != null) {
         if(var10000 == var10001) {
            ++var7;
         }

         var10000 = var1.getBlock(var3, var4, var5 - 1);
         var10001 = class_1192.field_6026;
      }

      if(var6 != null) {
         if(var10000 == var10001) {
            ++var7;
         }

         var10000 = var1.getBlock(var3, var4, var5 + 1);
         var10001 = class_1192.field_6026;
      }

      if(var10000 == var10001) {
         ++var7;
      }

      int var8 = 0;
      int var9 = var1.method_34(var3 - 1, var4, var5);
      if(var6 != null) {
         if(var9 != 0) {
            ++var8;
         }

         var9 = var1.method_34(var3 + 1, var4, var5);
      }

      if(var6 != null) {
         if(var9 != 0) {
            ++var8;
         }

         var9 = var1.method_34(var3, var4, var5 - 1);
      }

      if(var6 != null) {
         if(var9 != 0) {
            ++var8;
         }

         var9 = var1.method_34(var3, var4, var5 + 1);
      }

      if(var6 != null) {
         if(var9 != 0) {
            ++var8;
         }

         var9 = var7;
      }

      if(var6 != null) {
         if(var9 == 3) {
            var9 = var8;
            if(var6 == null) {
               return (boolean)var9;
            }

            if(var8 == 1) {
               var1.method_2054(var3, var4, var5, this.field_6009, 0, 2);
               var1.field_1801 = true;
               this.field_6009.method_2456(var1, var3, var4, var5, var2);
               var1.field_1801 = false;
            }
         }

         var9 = 1;
      }

      return (boolean)var9;
   }
}

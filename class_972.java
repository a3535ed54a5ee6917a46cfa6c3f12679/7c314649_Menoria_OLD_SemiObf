
// $FF: renamed from: ma
public abstract class class_972 extends bcm {

   // $FF: renamed from: <init> (bao, int, int, int, int, int) void
   public void method_5549(bao var1, int var2, int var3, int var4, int var5, int var6) {
      super.method_5549(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {}

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      return false;
   }

   // $FF: renamed from: a () void
   protected void method_5557() {}

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      String[] var8 = class_752.method_4253();
      class_31 var10000 = this.method_5606(var1);
      int var10004 = this.method_5573();
      int var10009 = this.method_5562(var6, var7);
      if(var8 != null) {
         var10009 = var10009 == var1?1:0;
      }

      var10000.method_147(var1, var2, var3, var10004, var4, var5, var6, var7, (boolean)var10009);
   }

   // $FF: renamed from: b (int, int, int) boolean
   public boolean method_5604(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.method_5567(var2);
      if(var4 != null) {
         if(var10000 != 0) {
            int var5 = this.method_5562(var1, var2);
            var10000 = var5;
            if(var4 == null) {
               return (boolean)var10000;
            }

            if(var5 >= 0) {
               int var6 = this.field_4859 + this.field_4854 / 2 - this.method_5573() / 2 + 2;
               int var7 = this.field_4856 + 4 - this.method_5566() + var5 * this.field_4860 + this.field_4873;
               int var8 = var1 - var6;
               int var9 = var2 - var7;
               var10000 = this.method_5606(var5).method_148(var5, var1, var2, var3, var8, var9);
               if(var4 == null) {
                  return (boolean)var10000;
               }

               if(var10000 != 0) {
                  this.method_5571(false);
                  return true;
               }
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (int, int, int) boolean
   public boolean method_5605(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(true) {
         if(var5 < this.method_5553()) {
            int var6 = this.field_4859 + this.field_4854 / 2 - this.method_5573() / 2 + 2;
            int var7 = this.field_4856 + 4 - this.method_5566() + var5 * this.field_4860 + this.field_4873;
            int var8 = var1 - var6;
            int var9 = var2 - var7;
            this.method_5606(var5).method_149(var5, var1, var2, var3, var8, var9);
            ++var5;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_5571(true);
         break;
      }

      return false;
   }

   // $FF: renamed from: c (int) l9
   public abstract class_31 method_5606(int var1);
}

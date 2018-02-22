
// $FF: renamed from: fd
public class class_373 extends aji {

   // $FF: renamed from: M boolean
   private boolean field_2044;
   // $FF: renamed from: N java.lang.String
   private String field_2045;


   // $FF: renamed from: <init> (java.lang.String, awt, boolean) void
   protected void method_2576(String var1, awt var2, boolean var3) {
      super.method_2427(var2);
      this.field_2044 = var3;
      this.field_2045 = var1;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6;
      aji var7;
      class_373 var8;
      label45: {
         label51: {
            label49: {
               String[] var10000 = class_752.method_4253();
               var7 = var1.getBlock(var2, var3, var4);
               var6 = var10000;
               var8 = this;
               if(var6 != null) {
                  if(this == class_1192.field_6047) {
                     break label49;
                  }

                  var8 = this;
               }

               if(var6 == null) {
                  break label45;
               }

               if(var8 != class_1192.field_6192) {
                  break label51;
               }
            }

            int var9 = var1.method_33(var2, var3, var4);
            if(var6 != null) {
               if(var9 == var1.method_33(var2 - class_1707.field_8947[var5], var3 - class_1707.field_8948[var5], var4 - class_1707.field_8949[var5])) {
                  if(var7 == this) {
                     return false;
                  }
                  break label51;
               }

               var9 = 1;
            }

            return (boolean)var9;
         }

         var8 = this;
      }

      boolean var10 = var8.field_2044;
      if(var6 != null) {
         if(!var10 && var7 == this) {
            return false;
         }

         var10 = super.method_2445(var1, var2, var3, var4, var5);
      }

      return var10;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2010 = var1.method_375(this.field_2045);
   }
}

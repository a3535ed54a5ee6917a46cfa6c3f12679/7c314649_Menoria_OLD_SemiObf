
// $FF: renamed from: xF
public class class_710 extends class_708 {

   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.3125F, 0.3125F);
   }

   // $FF: renamed from: <init> (ahb, sv, double, double, double) void
   public void method_4065(ahb var1, class_752 var2, double var3, double var5, double var7) {
      super.method_4065(var1, var2, var3, var5, var7);
      this.method_3852(0.3125F, 0.3125F);
   }

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4064(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4064(var1, var2, var4, var6, var8, var10, var12);
      this.method_3852(0.3125F, 0.3125F);
   }

   // $FF: renamed from: b (azu) void
   protected void method_4067(azu var1) {
      class_710 var10;
      label71: {
         label74: {
            String[] var2;
            azu var6;
            label75: {
               var2 = class_752.method_4253();
               Object var10000 = this;
               if(var2 != null) {
                  if(this.field_2990.field_1832) {
                     return;
                  }

                  var6 = var1;
                  if(var2 == null) {
                     break label75;
                  }

                  var10000 = var1.field_4218;
               }

               if(var10000 != null) {
                  class_689 var8;
                  label77: {
                     boolean var7 = var1.field_4218.method_3873();
                     if(var2 != null) {
                        if(var7) {
                           break label74;
                        }

                        var8 = var1.field_4218;
                        if(var2 == null) {
                           break label77;
                        }

                        var7 = var1.field_4218.method_3896(class_1691.method_9330(this, this.field_3168), 5.0F);
                     }

                     if(!var7) {
                        break label74;
                     }

                     var8 = var1.field_4218;
                  }

                  var8.method_3860(5);
                  if(var2 != null) {
                     break label74;
                  }
               }

               var6 = var1;
            }

            int var3 = var6.field_4213;
            int var4 = var1.field_4214;
            int var5 = var1.field_4215;
            int var9 = var1.field_4216;
            if(var2 != null) {
               switch(var1.field_4216) {
               case 1:
                  ++var4;
                  if(var2 != null) {
                     break;
                  }
               case 0:
                  --var4;
                  if(var2 != null) {
                     break;
                  }
               case 2:
                  --var5;
                  if(var2 != null) {
                     break;
                  }
               case 3:
                  ++var5;
                  if(var2 != null) {
                     break;
                  }
               case 5:
                  ++var3;
                  if(var2 != null) {
                     break;
                  }
               case 4:
                  --var3;
               }

               var10 = this;
               if(var2 == null) {
                  break label71;
               }

               var9 = this.field_2990.method_34(var3, var4, var5);
            }

            if(var9 != 0) {
               this.field_2990.method_2058(var3, var4, var5, class_1192.field_6078);
            }
         }

         var10 = this;
      }

      var10.method_3851();
   }

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      return false;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      return false;
   }
}

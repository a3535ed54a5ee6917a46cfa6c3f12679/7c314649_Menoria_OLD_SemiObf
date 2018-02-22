import java.util.Random;

// $FF: renamed from: yr
public class class_1735 extends class_1727 {

   // $FF: renamed from: c wI
   private class_761 field_9065;
   // $FF: renamed from: d double
   private double field_9066;
   // $FF: renamed from: e double
   private double field_9067;
   // $FF: renamed from: f double
   private double field_9068;
   // $FF: renamed from: g double
   private double field_9069;
   // $FF: renamed from: h ahb
   private ahb field_9070;


   // $FF: renamed from: <init> (wI, double) void
   public void method_9666(class_761 var1, double var2) {
      super.method_9648();
      this.field_9065 = var1;
      this.field_9069 = var2;
      this.field_9070 = var1.field_2990;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9070.method_2078();
      if(var1 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = this.field_9065.method_3936();
      }

      class_1735 var3;
      label40: {
         if(var1 != null) {
            if(!var10000) {
               return false;
            }

            var3 = this;
            if(var1 == null) {
               break label40;
            }

            var10000 = this.field_9070.method_2067(class_1715.method_9561(this.field_9065.field_2994), (int)this.field_9065.field_3004.field_6910, class_1715.method_9561(this.field_9065.field_2996));
         }

         if(!var10000) {
            return false;
         }

         var3 = this;
      }

      azw var2 = var3.method_9667();
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         this.field_9066 = var2.field_4220;
         this.field_9067 = var2.field_4221;
         this.field_9068 = var2.field_4222;
      }

      return true;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9065.method_4257().method_9801();
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9065.method_4257().method_9794(this.field_9066, this.field_9067, this.field_9068, this.field_9069);
   }

   // $FF: renamed from: a () azw
   private azw method_9667() {
      String[] var10000 = class_752.method_4253();
      Random var2 = this.field_9065.method_4165();
      String[] var1 = var10000;
      int var3 = 0;

      while(true) {
         if(var3 < 10) {
            int var4 = class_1715.method_9561(this.field_9065.field_2994 + (double)var2.nextInt(20) - 10.0D);
            int var5 = class_1715.method_9561(this.field_9065.field_3004.field_6910 + (double)var2.nextInt(6) - 3.0D);
            int var6 = class_1715.method_9561(this.field_9065.field_2996 + (double)var2.nextInt(20) - 10.0D);
            if(var1 != null) {
               if(!this.field_9070.method_2067(var4, var5, var6)) {
                  label21: {
                     float var8;
                     int var7 = (var8 = this.field_9065.method_4331(var4, var5, var6) - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
                     if(var1 != null) {
                        if(var7 >= 0) {
                           break label21;
                        }

                        var7 = var4;
                     }

                     return azw.method_5086((double)var7, (double)var5, (double)var6);
                  }
               }

               ++var3;
            }

            if(var1 != null) {
               continue;
            }
         }

         return null;
      }
   }
}

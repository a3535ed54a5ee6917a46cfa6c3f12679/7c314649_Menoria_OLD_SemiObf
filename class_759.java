
// $FF: renamed from: wG
public abstract class class_759 extends class_753 {

   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {}

   // $FF: renamed from: a (double, boolean) void
   protected void method_3870(double var1, boolean var3) {}

   // $FF: renamed from: e (float, float) void
   public void method_4224(float var1, float var2) {
      String[] var3;
      label62: {
         class_759 var9;
         label58: {
            label63: {
               var3 = class_752.method_4253();
               boolean var10000 = this.method_3876();
               if(var3 != null) {
                  if(var10000) {
                     this.method_3882(var1, var2, 0.02F);
                     this.method_3864(this.field_2997, this.field_2998, this.field_2999);
                     this.field_2997 *= 0.800000011920929D;
                     this.field_2998 *= 0.800000011920929D;
                     this.field_2999 *= 0.800000011920929D;
                     if(var3 != null) {
                        break label62;
                     }
                  }

                  var9 = this;
                  if(var3 == null) {
                     break label63;
                  }

                  var10000 = this.method_3881();
               }

               if(!var10000) {
                  break label58;
               }

               this.method_3882(var1, var2, 0.02F);
               this.method_3864(this.field_2997, this.field_2998, this.field_2999);
               this.field_2997 *= 0.5D;
               this.field_2998 *= 0.5D;
               var9 = this;
            }

            var9.field_2999 *= 0.5D;
            if(var3 != null) {
               break label62;
            }
         }

         float var4;
         label43: {
            var4 = 0.91F;
            var9 = this;
            if(var3 != null) {
               if(!this.field_3005) {
                  break label43;
               }

               var9 = this;
            }

            var4 = var9.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_3004.field_6910) - 1, class_1715.method_9561(this.field_2996)).field_2008 * 0.91F;
         }

         float var5 = 0.16277136F / (var4 * var4 * var4);
         this.method_3882(var1, var2, this.field_3005?0.1F * var5:0.02F);
         var4 = 0.91F;
         var9 = this;
         if(var3 != null) {
            if(this.field_3005) {
               var4 = this.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_3004.field_6910) - 1, class_1715.method_9561(this.field_2996)).field_2008 * 0.91F;
            }

            this.method_3864(this.field_2997, this.field_2998, this.field_2999);
            this.field_2997 *= (double)var4;
            this.field_2998 *= (double)var4;
            var9 = this;
         }

         var9.field_2999 *= (double)var4;
      }

      this.field_3322 = this.field_3323;
      double var10 = this.field_2994 - this.field_2991;
      double var6 = this.field_2996 - this.field_2993;
      float var8 = class_1715.method_9558(var10 * var10 + var6 * var6) * 4.0F;
      if(var3 != null) {
         if(var8 > 1.0F) {
            var8 = 1.0F;
         }

         this.field_3323 += (var8 - this.field_3323) * 0.4F;
         this.field_3324 += this.field_3323;
      }

   }

   // $FF: renamed from: h_ () boolean
   public boolean method_4197() {
      return false;
   }
}

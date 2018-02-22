
// $FF: renamed from: ym
public abstract class class_1737 extends class_1727 {

   // $FF: renamed from: c sw
   protected class_753 field_9075;
   // $FF: renamed from: d int
   protected int field_9076;
   // $FF: renamed from: e int
   protected int field_9077;
   // $FF: renamed from: f int
   protected int field_9078;
   // $FF: renamed from: g eY
   protected class_417 field_9079;
   // $FF: renamed from: h boolean
   boolean field_9080;
   // $FF: renamed from: i float
   float field_9081;
   // $FF: renamed from: j float
   float field_9082;


   // $FF: renamed from: <init> (sw) void
   public void method_9671(class_753 var1) {
      super.method_9648();
      this.field_9075 = var1;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      class_753 var10000 = this.field_9075;
      if(var1 != null) {
         if(!this.field_9075.field_3006) {
            return false;
         }

         var10000 = this.field_9075;
      }

      boolean var7;
      label72: {
         class_1783 var2 = var10000.method_4257();
         class_1289 var3 = var2.method_9798();
         class_1289 var6 = var3;
         if(var1 != null) {
            if(var3 == null) {
               break label72;
            }

            var6 = var3;
         }

         var7 = var6.method_6741();
         if(var1 == null) {
            return var7;
         }

         if(!var7) {
            label73: {
               byte var8 = var2.method_9788();
               if(var1 != null) {
                  if(var8 == 0) {
                     break label73;
                  }

                  var8 = 0;
               }

               int var4 = var8;

               int var10;
               while(true) {
                  if(var4 < Math.min(var3.method_6746() + 2, var3.method_6744())) {
                     label46: {
                        class_1288 var5 = var3.method_6743(var4);
                        this.field_9076 = var5.field_6599;
                        this.field_9077 = var5.field_6600 + 1;
                        this.field_9078 = var5.field_6601;
                        class_1737 var9 = this;
                        if(var1 != null) {
                           double var11;
                           var10 = (var11 = this.field_9075.method_3889((double)this.field_9076, this.field_9075.field_2995, (double)this.field_9078) - 2.25D) == 0.0D?0:(var11 < 0.0D?-1:1);
                           if(var1 == null) {
                              break;
                           }

                           if(var10 > 0) {
                              break label46;
                           }

                           this.field_9079 = this.method_9672(this.field_9076, this.field_9077, this.field_9078);
                           var9 = this;
                        }

                        if(var9.field_9079 != null) {
                           return true;
                        }
                     }

                     ++var4;
                     if(var1 != null) {
                        continue;
                     }
                  }

                  this.field_9076 = class_1715.method_9561(this.field_9075.field_2994);
                  this.field_9077 = class_1715.method_9561(this.field_9075.field_2995 + 1.0D);
                  this.field_9078 = class_1715.method_9561(this.field_9075.field_2996);
                  this.field_9079 = this.method_9672(this.field_9076, this.field_9077, this.field_9078);
                  var10 = this.field_9079 != null?1:0;
                  break;
               }

               return (boolean)var10;
            }
         }
      }

      var7 = false;
      return var7;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9080;
      if(var1 != null) {
         var10000 = !this.field_9080;
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9080 = false;
      this.field_9081 = (float)((double)((float)this.field_9076 + 0.5F) - this.field_9075.field_2994);
      this.field_9082 = (float)((double)((float)this.field_9078 + 0.5F) - this.field_9075.field_2996);
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      float var1 = (float)((double)((float)this.field_9076 + 0.5F) - this.field_9075.field_2994);
      float var2 = (float)((double)((float)this.field_9078 + 0.5F) - this.field_9075.field_2996);
      float var3 = this.field_9081 * var1 + this.field_9082 * var2;
      if(var3 < 0.0F) {
         this.field_9080 = true;
      }

   }

   // $FF: renamed from: b (int, int, int) eY
   private class_417 method_9672(int var1, int var2, int var3) {
      aji var5 = this.field_9075.field_2990.getBlock(var1, var2, var3);
      String[] var4 = class_752.method_4253();
      aji var10000 = var5;
      if(var4 != null) {
         if(var5 != class_1192.field_6090) {
            return null;
         }

         var10000 = var5;
      }

      return (class_417)var10000;
   }
}

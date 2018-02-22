
// $FF: renamed from: wY
public abstract class class_762 extends class_761 implements class_9 {

   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: aE () boolean
   public boolean method_4158() {
      return true;
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      return this.field_2990.method_2117(this.field_3004);
   }

   // $FF: renamed from: q () int
   public int method_4263() {
      return 120;
   }

   // $FF: renamed from: v () boolean
   protected boolean method_4269() {
      return true;
   }

   // $FF: renamed from: e (yz) int
   protected int method_4163(class_792 var1) {
      return 1 + this.field_2990.field_1819.nextInt(3);
   }

   // $FF: renamed from: C () void
   public void method_3857() {
      String[] var10000 = class_752.method_4253();
      int var2 = this.method_3949();
      String[] var1 = var10000;
      super.method_3857();
      class_762 var3 = this;
      if(var1 != null) {
         label26: {
            if(this.method_3917()) {
               var3 = this;
               if(var1 == null) {
                  break label26;
               }

               if(!this.method_3876()) {
                  --var2;
                  this.method_3950(var2);
                  int var4 = this.method_3949();
                  if(var1 != null) {
                     if(var4 != -20) {
                        return;
                     }

                     this.method_3950(0);
                     this.method_3896(class_1691.field_8834, 2.0F);
                  }

                  if(var1 != null) {
                     return;
                  }
               }
            }

            var3 = this;
         }
      }

      var3.method_3950(300);
   }
}


// $FF: renamed from: xk
public class class_705 extends class_689 {

   // $FF: renamed from: at int
   public int field_3155;
   // $FF: renamed from: au int
   public int field_3156;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_2986 = true;
      this.method_3852(2.0F, 2.0F);
      this.field_3013 = this.field_3015 / 2.0F;
      this.field_3156 = 5;
      this.field_3155 = this.field_3028.nextInt(100000);
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4060(ahb var1, double var2, double var4, double var6) {
      this.method_3847(var1);
      this.method_3854(var2, var4, var6);
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      this.field_3036.method_9497(8, Integer.valueOf(this.field_3156));
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      this.field_2991 = this.field_2994;
      this.field_2992 = this.field_2995;
      this.field_2993 = this.field_2996;
      ++this.field_3155;
      String[] var1 = class_752.method_4253();
      this.field_3036.method_9506(8, Integer.valueOf(this.field_3156));
      int var2 = class_1715.method_9561(this.field_2994);
      int var3 = class_1715.method_9561(this.field_2995);
      int var4 = class_1715.method_9561(this.field_2996);
      ahb var10000 = this.field_2990;
      if(var1 != null) {
         if(!(this.field_2990.field_1820 instanceof class_1090)) {
            return;
         }

         var10000 = this.field_2990;
      }

      int var10001 = var2;
      int var10002 = var3;
      int var10003 = var4;
      if(var1 != null) {
         if(var10000.getBlock(var2, var3, var4) == class_1192.field_6078) {
            return;
         }

         var10000 = this.field_2990;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      var10000.method_2058(var10001, var10002, var10003, class_1192.field_6078);
   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {}

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {}

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      return true;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000 != 0) {
            return false;
         }

         var10000 = this.field_3012;
      }

      if(var3 != null) {
         if(var10000 == 0) {
            var10000 = this.field_2990.field_1832;
            if(var3 == null) {
               return (boolean)var10000;
            }

            if(!this.field_2990.field_1832) {
               this.field_3156 = 0;
               var10000 = this.field_3156;
               if(var3 == null) {
                  return (boolean)var10000;
               }

               if(this.field_3156 <= 0) {
                  this.method_3851();
                  var10000 = this.field_2990.field_1832;
                  if(var3 == null) {
                     return (boolean)var10000;
                  }

                  if(!this.field_2990.field_1832) {
                     this.field_2990.method_2125((class_689)null, this.field_2994, this.field_2995, this.field_2996, 6.0F, true);
                  }
               }
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }
}

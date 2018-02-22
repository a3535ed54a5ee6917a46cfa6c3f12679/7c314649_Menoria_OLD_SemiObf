
// $FF: renamed from: oC
public class class_852 extends class_851 {

   // $FF: renamed from: q bqx
   private static final bqx field_3925;
   // $FF: renamed from: r bqx
   private static final bqx field_3926;
   // $FF: renamed from: s bqx
   private static final bqx field_3927;
   // $FF: renamed from: t mX
   private class_1242 field_3928;
   // $FF: renamed from: u mZ
   private class_1243 field_3929;
   // $FF: renamed from: v mX
   protected class_1242 field_3930;
   // $FF: renamed from: w mX
   protected class_1242 field_3931;
   // $FF: renamed from: x mX
   protected class_1242 field_3932;
   // $FF: renamed from: y mX
   protected class_1242 field_3933;
   // $FF: renamed from: z int
   private int field_3934;
   // $FF: renamed from: A java.lang.String
   private static final String field_3935;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1245 var10001 = new class_1245;
      var10001.method_6510();
      super.method_4915(var10001, 0.5F, 1.0F);
      this.field_3934 = 1;
      this.field_3928 = this.field_3917;
      class_1243 var1 = new class_1243;
      var1.method_6510();
      this.field_3929 = var1;
   }

   // $FF: renamed from: b () void
   protected void method_4916() {
      class_1245 var10001 = new class_1245;
      var10001.drawCenteredString7(1.0F, true);
      this.field_3919 = var10001;
      var10001 = new class_1245;
      var10001.drawCenteredString7(0.5F, true);
      this.field_3920 = var10001;
      this.field_3930 = this.field_3919;
      this.field_3931 = this.field_3920;
      class_1243 var1 = new class_1243;
      var1.drawCenteredString5(1.0F, 0.0F, true);
      this.field_3932 = var1;
      var1 = new class_1243;
      var1.drawCenteredString5(0.5F, 0.0F, true);
      this.field_3933 = var1;
   }

   // $FF: renamed from: b (w9, int, float) int
   protected int method_4925(class_781 var1, int var2, float var3) {
      this.method_4929(var1);
      return super.method_4919(var1, var2, var3);
   }

   // $FF: renamed from: b (w9, double, double, double, float, float) void
   public void method_4926(class_781 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4929(var1);
      super.method_4830(var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: b (w9) bqx
   protected bqx method_4927(class_781 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1 instanceof class_782;
      bqx var3;
      if(var2 != null) {
         if(var10000) {
            var3 = field_3925;
            return var3;
         }

         var10000 = var1.method_4515();
      }

      var3 = var10000?field_3927:field_3926;
      return var3;
   }

   // $FF: renamed from: b (w9, float) void
   protected void method_4928(class_781 var1, float var2) {
      this.method_4929(var1);
      super.method_4923(var1, var2);
   }

   // $FF: renamed from: c (w9) void
   private void method_4929(class_781 var1) {
      label23: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(var1.method_4515()) {
               class_852 var10000 = this;
               if(var2 != null) {
                  if(this.field_3934 != this.field_3929.drawCenteredString6()) {
                     class_1243 var10001 = new class_1243;
                     var10001.method_6510();
                     this.field_3929 = var10001;
                     this.field_3934 = this.field_3929.drawCenteredString6();
                     var10001 = new class_1243;
                     var10001.drawCenteredString5(1.0F, 0.0F, true);
                     this.field_3932 = var10001;
                     var10001 = new class_1243;
                     var10001.drawCenteredString5(0.5F, 0.0F, true);
                     this.field_3933 = var10001;
                  }

                  this.field_3844 = this.field_3929;
                  this.field_3919 = this.field_3932;
                  var10000 = this;
               }

               var10000.field_3920 = this.field_3933;
               if(var2 != null) {
                  break label23;
               }
            }

            this.field_3844 = this.field_3928;
            this.field_3919 = this.field_3930;
         }

         this.field_3920 = this.field_3931;
      }

      this.field_3917 = (class_1242)this.field_3844;
   }

   // $FF: renamed from: b (w9, float, float, float) void
   protected void method_4930(class_781 var1, float var2, float var3, float var4) {
      String[] var5 = class_752.method_4253();
      if(var5 != null) {
         if(var1.method_4518()) {
            var3 += (float)(Math.cos((double)var1.field_3029 * 3.25D) * 3.141592653589793D * 0.25D);
         }

         super.method_4804(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: b (sw, float) void
   protected void method_4923(class_753 var1, float var2) {
      this.method_4928((class_781)var1, var2);
   }

   // $FF: renamed from: b (sw) bqx
   protected bqx method_4921(class_753 var1) {
      return this.method_4927((class_781)var1);
   }

   // $FF: renamed from: a (sw, double, double, double, float, float) void
   public void method_4830(class_753 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4926((class_781)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: b (sw, int, float) int
   protected int method_4919(class_753 var1, int var2, float var3) {
      return this.method_4925((class_781)var1, var2, var3);
   }

   // $FF: renamed from: a (sv, int, float) int
   protected int method_4810(class_752 var1, int var2, float var3) {
      return this.method_4925((class_781)var1, var2, var3);
   }

   // $FF: renamed from: c (sv, float) void
   protected void method_4807(class_752 var1, float var2) {
      this.method_4928((class_781)var1, var2);
   }

   // $FF: renamed from: a (sv, float, float, float) void
   protected void method_4804(class_752 var1, float var2, float var3, float var4) {
      this.method_4930((class_781)var1, var2, var3, var4);
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4926((class_781)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4927((class_781)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4926((class_781)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      // $FF: Couldn't be decompiled
   }
}

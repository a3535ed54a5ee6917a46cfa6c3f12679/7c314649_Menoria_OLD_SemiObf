
// $FF: renamed from: Ae
public class class_665 {

   // $FF: renamed from: b boolean
   public boolean field_2836;
   // $FF: renamed from: c boolean
   public boolean field_2837;
   // $FF: renamed from: d boolean
   public boolean field_2838;
   // $FF: renamed from: e boolean
   public boolean field_2839;
   // $FF: renamed from: f boolean
   public boolean field_2840;
   // $FF: renamed from: g float
   private float field_2841;
   // $FF: renamed from: h float
   private float field_2842;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_2843;


   // $FF: renamed from: <init> () void
   public void method_3584() {
      super();
      this.field_2840 = true;
      this.field_2841 = 0.05F;
      this.field_2842 = 0.1F;
   }

   // $FF: renamed from: b (ro) void
   public void method_3585(class_1583 var1) {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var2 = var10000;
      String[] var3 = field_2843;
      var2.initGui4("invulnerable", this.field_2836);
      var2.initGui4("flying", this.field_2837);
      var2.initGui4("mayfly", this.field_2838);
      var2.initGui4("instabuild", this.field_2839);
      var2.initGui4("mayBuild", this.field_2840);
      var2.method_8669("flySpeed", this.field_2841);
      var2.method_8669("walkSpeed", this.field_2842);
      var1.method_8664("abilities", var2);
   }

   // $FF: renamed from: c (ro) void
   public void method_3586(class_1583 var1) {
      String[] var2 = class_752.method_4253();
      class_1583 var10000 = var1;
      String[] var4 = field_2843;
      String var10001 = "abilities";
      if(var2 != null) {
         if(!var1.initGui8("abilities", 10)) {
            return;
         }

         var10000 = var1;
         var10001 = "abilities";
      }

      class_1583 var3 = var10000.method_8688(var10001);
      var4 = field_2843;
      this.field_2836 = var3.method_8690("invulnerable");
      this.field_2837 = var3.method_8690("flying");
      this.field_2838 = var3.method_8690("mayfly");
      this.field_2839 = var3.method_8690("instabuild");
      boolean var5 = var3.initGui8("flySpeed", 99);
      if(var2 != null) {
         if(var5) {
            this.field_2841 = var3.method_8683("flySpeed");
            this.field_2842 = var3.method_8683("walkSpeed");
         }

         var4 = field_2843;
         var5 = var3.initGui8("mayBuild", 1);
      }

      if(var5) {
         String[] var10002 = field_2843;
         this.field_2840 = var3.method_8690("mayBuild");
      }

   }

   // $FF: renamed from: b () float
   public float method_3587() {
      return this.field_2841;
   }

   // $FF: renamed from: b (float) void
   public void method_3588(float var1) {
      this.field_2841 = var1;
   }

   // $FF: renamed from: c () float
   public float method_3589() {
      return this.field_2842;
   }

   // $FF: renamed from: c (float) void
   public void method_3590(float var1) {
      this.field_2842 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3591() {
      // $FF: Couldn't be decompiled
   }
}


// $FF: renamed from: aR
public class class_492 {

   // $FF: renamed from: b int
   private final int field_2285;
   // $FF: renamed from: c vI
   public final class_22 field_2286;
   // $FF: renamed from: d int
   public int field_2287;
   // $FF: renamed from: e int
   public int field_2288;
   // $FF: renamed from: f int
   public int field_2289;


   // $FF: renamed from: <init> (vI, int, int, int) void
   public void method_2869(class_22 var1, int var2, int var3, int var4) {
      super();
      this.field_2286 = var1;
      this.field_2285 = var2;
      this.field_2288 = var3;
      this.field_2289 = var4;
   }

   // $FF: renamed from: b (add, add) void
   public void method_2870(add var1, add var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = var1;
      if(var3 != null) {
         if(var1 == null) {
            return;
         }

         var10000 = var2;
      }

      if(var3 != null) {
         if(var10000 == null) {
            return;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(var10000.method_3730() != var2.method_3730()) {
            return;
         }

         var10000 = var2;
      }

      int var4 = var10000.field_2958 - var1.field_2958;
      if(var4 > 0) {
         this.method_2871(var1, var4);
      }

   }

   // $FF: renamed from: b (add, int) void
   protected void method_2871(add var1, int var2) {}

   // $FF: renamed from: a (add) void
   protected void method_2872(add var1) {}

   // $FF: renamed from: b (yz, add) void
   public void method_2873(class_792 var1, add var2) {
      this.method_2878();
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      return true;
   }

   // $FF: renamed from: a () add
   public add method_2875() {
      return this.field_2286.method_84(this.field_2285);
   }

   // $FF: renamed from: b () boolean
   public boolean method_2876() {
      return this.method_2875() != null;
   }

   // $FF: renamed from: d (add) void
   public void method_2877(add var1) {
      this.field_2286.method_87(this.field_2285, var1);
      this.method_2878();
   }

   // $FF: renamed from: c () void
   public void method_2878() {
      this.field_2286.method_91();
   }

   // $FF: renamed from: d () int
   public int method_2879() {
      return this.field_2286.method_90();
   }

   // $FF: renamed from: e () vL
   public IIcon method_2880() {
      return null;
   }

   // $FF: renamed from: b (int) add
   public add method_2881(int var1) {
      return this.field_2286.method_85(this.field_2285, var1);
   }

   // $FF: renamed from: b (vI, int) boolean
   public boolean method_2882(class_22 var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000;
      if(var1 == this.field_2286) {
         var10000 = var2;
         if(var3 == null) {
            return (boolean)var10000;
         }

         if(var2 == this.field_2285) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_2883(class_792 var1) {
      return true;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2884() {
      return true;
   }
}

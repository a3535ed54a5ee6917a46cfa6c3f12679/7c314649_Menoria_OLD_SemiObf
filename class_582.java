
// $FF: renamed from: gy
public class class_582 extends class_580 {

   // $FF: renamed from: m java.lang.String[]
   public String[] field_2478;
   // $FF: renamed from: n int
   public int field_2479;
   // $FF: renamed from: o boolean
   private boolean field_2480;
   // $FF: renamed from: p yz
   private class_792 field_2481;
   // $FF: renamed from: q java.lang.String[]
   private static final String[] field_2482;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      this.field_2478 = new String[]{"", "", "", ""};
      this.field_2479 = -1;
      this.field_2480 = true;
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      String[] var2 = field_2482;
      var1.initGui1("Text1", this.field_2478[0]);
      var1.initGui1("Text2", this.field_2478[1]);
      var1.initGui1("Text3", this.field_2478[2]);
      var1.initGui1("Text4", this.field_2478[3]);
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      this.field_2480 = false;
      String[] var2 = class_752.method_4253();
      super.getBlock92(var1);
      int var3 = 0;

      while(var3 < 4) {
         String[] var10000 = this.field_2478;
         StringBuilder var10003 = new StringBuilder();
         String[] var10004 = field_2482;
         var10000[var3] = var1.method_8685(var10003.append("Text").append(var3 + 1).toString());
         if(var2 != null) {
            if(this.field_2478[var3].length() > 15) {
               this.field_2478[var3] = this.field_2478[var3].substring(0, 15);
            }

            ++var3;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: q () r1
   public class_250 method_3100() {
      String[] var1 = new String[4];
      System.arraycopy(this.field_2478, 0, var1, 0, 4);
      class_338 var10000 = new class_338;
      var10000.method_1915(this.field_2465, this.field_2466, this.field_2467, var1);
      return var10000;
   }

   // $FF: renamed from: b () boolean
   public boolean method_3117() {
      return this.field_2480;
   }

   // $FF: renamed from: b (boolean) void
   public void method_3118(boolean var1) {
      String[] var2 = class_752.method_4253();
      class_582 var10000 = this;
      if(var2 != null) {
         this.field_2480 = var1;
         if(var1) {
            return;
         }

         var10000 = this;
      }

      var10000.field_2481 = null;
   }

   // $FF: renamed from: b (yz) void
   public void method_3119(class_792 var1) {
      this.field_2481 = var1;
   }

   // $FF: renamed from: d () yz
   public class_792 method_3120() {
      return this.field_2481;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      // $FF: Couldn't be decompiled
   }
}


// $FF: renamed from: eh
public class class_477 extends class_473 {

   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2249;


   // $FF: renamed from: <init> () void
   public void method_2831() {
      super.method_2427(awt.field_4173);
      this.method_2521(class_872.field_4246);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var10000 = class_752.method_4253();
      boolean var7 = var1.method_2172(var2, var3, var4);
      String[] var6 = var10000;
      class_583 var8 = (class_583)var1.method_31(var2, var3, var4);
      class_583 var9 = var8;
      if(var6 != null) {
         if(var8 == null) {
            return;
         }

         var9 = var8;
      }

      boolean var10 = var9.field_2484;
      if(var6 != null) {
         if(var10 == var7) {
            return;
         }

         var10 = var7;
      }

      if(var10) {
         var8.method_3122(var1, var2, var3, var4);
      }

      var8.field_2484 = var7;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      ahb var10000 = var1;
      if(var10 != null) {
         if(var1.field_1832) {
            return true;
         }

         var10000 = var1;
      }

      class_583 var11 = (class_583)var10000.method_31(var2, var3, var4);
      class_583 var12 = var11;
      if(var10 != null) {
         if(var11 == null) {
            return true;
         }

         var11.method_3121();
         var12 = var11;
      }

      var12.method_3122(var1, var2, var3, var4);
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz) void
   public void method_2484(ahb var1, int var2, int var3, int var4, class_792 var5) {
      String[] var6 = class_752.method_4253();
      ahb var10000 = var1;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1;
      }

      class_583 var7 = (class_583)var10000.method_31(var2, var3, var4);
      class_583 var8 = var7;
      if(var6 != null) {
         if(var7 == null) {
            return;
         }

         var8 = var7;
      }

      var8.method_3122(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_583 var10000 = new class_583;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, int) boolean
   public boolean method_2511(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      float var8 = (float)Math.pow(2.0D, (double)(var6 - 12) / 12.0D);
      String[] var7 = class_752.method_4253();
      String[] var10 = field_2249;
      String var9 = "harp";
      int var10000 = var5;
      byte var10001 = 1;
      if(var7 != null) {
         if(var5 == 1) {
            var9 = "bd";
         }

         var10000 = var5;
         var10001 = 2;
      }

      if(var7 != null) {
         if(var10000 == var10001) {
            var10 = field_2249;
            var9 = "snare";
         }

         var10000 = var5;
         var10001 = 3;
      }

      if(var7 != null) {
         if(var10000 == var10001) {
            var10 = field_2249;
            var9 = "hat";
         }

         var10000 = var5;
         if(var7 == null) {
            return (boolean)var10000;
         }

         var10001 = 4;
      }

      if(var10000 == var10001) {
         var10 = field_2249;
         var9 = "bassattack";
      }

      double var11 = (double)var2 + 0.5D;
      double var10002 = (double)var3 + 0.5D;
      double var10003 = (double)var4 + 0.5D;
      StringBuilder var10004 = new StringBuilder();
      var10 = field_2249;
      var1.method_2084(var11, var10002, var10003, var10004.append("note.").append(var9).toString(), 3.0F, var8);
      var1.method_2087("note", (double)var2 + 0.5D, (double)var3 + 1.2D, (double)var4 + 0.5D, (double)var6 / 24.0D, 0.0D, 0.0D);
      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

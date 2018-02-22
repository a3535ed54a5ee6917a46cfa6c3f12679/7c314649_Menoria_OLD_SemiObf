
// $FF: renamed from: ea
public class class_485 extends class_484 {

   // $FF: renamed from: R q1
   private final class_41 field_2269;
   // $FF: renamed from: S java.lang.String[]
   private static final String[] field_2270;


   // $FF: renamed from: <init> () void
   public void method_2844() {
      super.method_2844();
      class_1460 var10001 = new class_1460;
      var10001.method_7939();
      this.field_2269 = var10001;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var2 = field_2270;
      this.field_2010 = var1.method_375("furnace_side");
      this.field_2265 = var1.method_375("furnace_top");
      this.field_2266 = var1.method_375(this.method_2533() + "_front_horizontal");
      this.field_2267 = var1.method_375(this.method_2533() + "_front_vertical");
   }

   // $FF: renamed from: b (add) q1
   protected class_41 method_2847(add var1) {
      return this.field_2269;
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_590 var10000 = new class_590;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   protected void method_2846(ahb var1, int var2, int var3, int var4) {
      class_1501 var10000 = new class_1501;
      var10000.method_8131(var1, var2, var3, var4);
      class_1501 var6 = var10000;
      String[] var5 = class_752.method_4253();
      class_589 var7 = (class_589)var6.method_187();
      class_589 var13 = var7;
      if(var5 != null) {
         if(var7 == null) {
            return;
         }

         var13 = var7;
      }

      int var8;
      label57: {
         var8 = var13.method_3155();
         if(var5 != null) {
            if(var8 >= 0) {
               break label57;
            }

            var1.method_2210(1001, var2, var3, var4, 0);
         }

         if(var5 != null) {
            return;
         }
      }

      add var12;
      label63: {
         add var9;
         add var15;
         label64: {
            var9 = var7.method_84(var8);
            int var10 = var1.method_33(var2, var3, var4) & 7;
            class_22 var11 = class_585.method_3141(var1, (double)(var2 + class_1707.field_8947[var10]), (double)(var3 + class_1707.field_8948[var10]), (double)(var4 + class_1707.field_8949[var10]));
            class_22 var14 = var11;
            if(var5 != null) {
               if(var11 == null) {
                  break label64;
               }

               var14 = var11;
            }

            var12 = class_585.method_3134(var14, var9.method_3754().method_3729(1), class_1707.field_8946[var10]);
            var15 = var12;
            if(var5 != null) {
               if(var12 == null) {
                  var12 = var9.method_3754();
                  if(--var12.field_2958 == 0) {
                     var12 = null;
                  }
                  break label63;
               }

               var15 = var9.method_3754();
            }

            var12 = var15;
            if(var5 != null) {
               break label63;
            }
         }

         var12 = this.field_2269.method_176(var6, var9);
         var15 = var12;
         if(var5 != null) {
            if(var12 == null) {
               break label63;
            }

            var15 = var12;
         }

         if(var15.field_2958 == 0) {
            var12 = null;
         }
      }

      var7.method_87(var8, var12);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}

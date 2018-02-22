
// $FF: renamed from: bj
public class class_525 extends adb {

   // $FF: renamed from: n int[]
   private static final int[] field_2361;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2362;
   // $FF: renamed from: p java.lang.String[]
   public static final String[] field_2363;
   // $FF: renamed from: q q1
   private static final class_41 field_2364;
   // $FF: renamed from: r int
   public final int field_2365;
   // $FF: renamed from: s int
   public final int field_2366;
   // $FF: renamed from: t int
   public final int field_2367;
   // $FF: renamed from: u w
   private final class_131 field_2368;
   // $FF: renamed from: v vL
   private IIcon field_2369;
   // $FF: renamed from: w vL
   private IIcon field_2370;
   // $FF: renamed from: x java.lang.String
   private static final String field_2371;
   // $FF: renamed from: y java.lang.String[]
   private static final String[] field_2372;


   // $FF: renamed from: <init> (w, int, int) void
   public void method_2990(class_131 var1, int var2, int var3) {
      super.method_2917();
      this.field_2368 = var1;
      this.field_2365 = var3;
      this.field_2367 = var2;
      this.field_2366 = var1.method_608(var3);
      this.method_2935(var1.method_607(var3));
      this.field_2333 = 1;
      this.method_2974(class_872.fontRendererInstance2);
      class_484.field_2263.method_189(this, field_2364);
   }

   // $FF: renamed from: a (add, int) int
   public int method_2953(add param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () boolean
   public boolean method_2970() {
      boolean var10000;
      try {
         if(this.field_2368 == class_131.field_306) {
            var10000 = true;
            return var10000;
         }
      } catch (UnsupportedOperationException var1) {
         throw method_2998(var1);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: c () int
   public int method_2969() {
      return this.field_2368.method_609();
   }

   // $FF: renamed from: e () w
   public class_131 method_2991() {
      return this.field_2368;
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2992(add param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (add) int
   public int method_2993(add param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2971(int var1, int var2) {
      IIcon var10000;
      try {
         if(var2 == 1) {
            var10000 = this.field_2369;
            return var10000;
         }
      } catch (UnsupportedOperationException var3) {
         throw method_2998(var3);
      }

      var10000 = super.method_2971(var1, var2);
      return var10000;
   }

   // $FF: renamed from: g (add) void
   public void method_2994(add param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (add, int) void
   public void method_2995(add param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (add, add) boolean
   public boolean method_2976(add param1, add param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add param1, ahb param2, class_792 param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int) vL
   public static IIcon method_2996(int var0) {
      try {
         switch(var0) {
         case 0:
            return class_1010.field_5168.field_2370;
         case 1:
            return class_1010.field_5169.field_2370;
         case 2:
            return class_1010.field_5170.field_2370;
         case 3:
            return class_1010.field_5171.field_2370;
         default:
            return null;
         }
      } catch (UnsupportedOperationException var1) {
         throw method_2998(var1);
      }
   }

   // $FF: renamed from: i () int[]
   static int[] method_2997() {
      return field_2361;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.UnsupportedOperationException) java.lang.UnsupportedOperationException
   private static UnsupportedOperationException method_2998(UnsupportedOperationException var0) {
      return var0;
   }
}

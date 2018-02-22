package ca.diiza.r;

import ca.diiza.h.class_688;

// $FF: renamed from: ca.diiza.r.b
public class class_506 extends class_492 {

   // $FF: renamed from: a yz
   private class_792 field_2326;
   // $FF: renamed from: g int
   private int field_2327;
   // $FF: renamed from: h boolean
   private static boolean field_2328;


   // $FF: renamed from: <init> (yz, ca.diiza.h.a, int, int, int) void
   public void method_2911(class_792 var1, class_688 var2, int var3, int var4, int var5) {
      super.method_2869(var2, var3, var4, var5);
      boolean var6 = method_2914();
      this.field_2326 = var1;
      if(!var6) {
         int var7 = class_689.method_3977();
         ++var7;
         class_689.method_3975(var7);
      }

   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      return true;
   }

   // $FF: renamed from: c (add) void
   public void method_2912(add var1) {}

   // $FF: renamed from: b (add, int) void
   protected void method_2871(add var1, int var2) {}

   // $FF: renamed from: a (add) void
   protected void method_2872(add var1) {}

   // $FF: renamed from: a (boolean) void
   public static void method_2913(boolean var0) {
      field_2328 = var0;
   }

   // $FF: renamed from: g () boolean
   public static boolean method_2914() {
      return field_2328;
   }

   // $FF: renamed from: h () boolean
   public static boolean method_2915() {
      boolean var0 = method_2914();
      return !var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2916() {
      if(method_2915()) {
         method_2913(true);
      }

   }
}

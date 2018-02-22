package ca.diiza.l;

import ca.diiza.l.class_862;

// $FF: renamed from: ca.diiza.l.d
public class class_154 extends bcb {

   // $FF: renamed from: b ca.diiza.l.d
   private static class_154 field_515;
   // $FF: renamed from: o int
   private int field_516;
   // $FF: renamed from: p ca.diiza.l.d
   private class_154 field_517;
   // $FF: renamed from: q ca.diiza.l.d
   private class_154 field_518;
   // $FF: renamed from: r int
   private int field_519;
   // $FF: renamed from: s java.lang.String[]
   private static final String[] field_520;


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_792(String var1) {
      super.method_748(0, 0, 0, 0, 0, var1);
      this.field_519 = 0;
   }

   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_748(0, 0, 0, 0, 0, "");
      this.field_519 = 0;
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (bao, int, int) boolean
   public boolean method_753(bao param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () void
   public void method_793() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bao, char, int) void
   protected static void method_794(bao var0, char var1, int var2) {
      int var3 = class_862.method_5030();

      class_154 var10000;
      label20: {
         try {
            var10000 = field_515;
            if(var3 == 0) {
               break label20;
            }

            if(field_515 == null) {
               return;
            }
         } catch (NumberFormatException var4) {
            throw method_808(var4);
         }

         var10000 = field_515;
      }

      var10000.method_795(var0, var1, var2);
   }

   // $FF: renamed from: b (bao, char, int) void
   private void method_795(bao param1, char param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (char) boolean
   protected boolean method_796(char param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   protected void method_797() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int) void
   protected void method_798(int var1) {
      this.field_516 = var1;
   }

   // $FF: renamed from: c (int, int) void
   protected void method_799(int var1, int var2) {
      this.field_447 = var1;
      this.field_448 = var2;
   }

   // $FF: renamed from: d (int, int) void
   protected void method_800(int var1, int var2) {
      this.field_445 = var1;
      this.field_446 = var2;
   }

   // $FF: renamed from: a (int, int, int, int) void
   protected void method_801(int var1, int var2, int var3, int var4) {
      this.field_447 = var1;
      this.field_448 = var2;
      this.field_445 = var3;
      this.field_446 = var4;
   }

   // $FF: renamed from: a (ca.diiza.l.d) void
   protected void method_802(class_154 var1) {
      this.field_518 = var1;
   }

   // $FF: renamed from: b (ca.diiza.l.d) void
   protected void method_803(class_154 var1) {
      this.field_517 = var1;
   }

   // $FF: renamed from: f () void
   protected static void method_804() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   protected static void method_805() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () ca.diiza.l.d
   protected static class_154 method_806() {
      return field_515;
   }

   // $FF: renamed from: b (int) void
   protected void method_807(int var1) {
      this.field_519 = var1;
   }

   // $FF: renamed from: b (java.lang.NumberFormatException) java.lang.NumberFormatException
   private static NumberFormatException method_808(NumberFormatException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      // $FF: Couldn't be decompiled
   }
}

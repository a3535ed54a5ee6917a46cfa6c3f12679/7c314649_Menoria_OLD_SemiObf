package ca.diiza.v.a;


// $FF: renamed from: ca.diiza.v.a.a
public enum class_1009 {

   NORMAL,
   FIRE,
   SLOW,
   POISON;
   // $FF: renamed from: a adb
   private adb field_5110;
   // $FF: renamed from: b ca.diiza.v.a.a[]
   private static class_1009[] field_5111;
   // $FF: renamed from: c ca.diiza.v.a.a[]
   // $FF: synthetic field
   private static final class_1009[] field_5112;
   // $FF: renamed from: d int
   private static int field_5113;


   // $FF: renamed from: <init> (java.lang.String, int, adb) void
   private void method_5744(String var1, int var2, adb var3) {
      super(var1, var2);
      this.field_5110 = var3;
   }

   // $FF: renamed from: a () adb
   public adb method_5745() {
      return this.field_5110;
   }

   // $FF: renamed from: b () ca.diiza.v.a.a
   public class_1009 method_5746() {
      int var1 = method_5749();
      class_1009 var10000 = field_5111[(this.ordinal() + 1) % field_5111.length];
      if(var1 == 0) {
         int var2 = class_689.method_3976();
         ++var2;
         class_689.method_3975(var2);
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5747() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int) void
   public static void method_5748(int var0) {
      field_5113 = var0;
   }

   // $FF: renamed from: c () int
   public static int method_5749() {
      return field_5113;
   }

   // $FF: renamed from: d () int
   public static int method_5750() {
      int var0 = method_5749();
      return var0 == 0?101:0;
   }
}

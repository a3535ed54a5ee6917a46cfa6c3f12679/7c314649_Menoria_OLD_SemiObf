package ca.diiza.f;

import ca.diiza.f.A;

// $FF: renamed from: ca.diiza.f.d
public enum class_239 implements A {

   MONEY,
   AMBRE,
   POINTS_BOUTIQUE;
   // $FF: renamed from: a java.lang.String
   private String field_1282;
   // $FF: renamed from: b int
   private int field_1283;
   // $FF: renamed from: c ca.diiza.f.d[]
   // $FF: synthetic field
   private static final class_239[] field_1284;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String) void
   private void method_1294(String var1, int var2, String var3, int var4, String var5) {
      super(var1, var2);
      this.field_1283 = var4;
      this.field_1282 = var5;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1295() {
      return this.field_1282;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_0() {
      return this.method_1295();
   }

   // $FF: renamed from: b () int
   public int method_1() {
      return this.field_1283;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1296() {
      // $FF: Couldn't be decompiled
   }
}

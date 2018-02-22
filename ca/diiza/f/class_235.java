package ca.diiza.f;

import ca.diiza.f.A;

// $FF: renamed from: ca.diiza.f.f
public enum class_235 implements A {

   LONG,
   MEDIUM,
   SHORT;
   // $FF: renamed from: a java.lang.String
   private String field_1270;
   // $FF: renamed from: b long
   private long field_1271;
   // $FF: renamed from: c int
   private int field_1272;
   // $FF: renamed from: d ca.diiza.f.f[]
   // $FF: synthetic field
   private static final class_235[] field_1273;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, long) void
   private void method_1283(String var1, int var2, String var3, int var4, String var5, long var6) {
      super(var1, var2);
      this.field_1272 = var4;
      this.field_1270 = var5;
      this.field_1271 = var6;
   }

   // $FF: renamed from: c () long
   public long method_1284() {
      return this.field_1271;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_0() {
      return this.field_1270;
   }

   // $FF: renamed from: b () int
   public int method_1() {
      return this.field_1272;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1285() {
      // $FF: Couldn't be decompiled
   }
}

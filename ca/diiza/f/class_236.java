package ca.diiza.f;

import ca.diiza.f.A;

// $FF: renamed from: ca.diiza.f.a
public enum class_236 implements A {

   ALL,
   BLOCKS,
   SWORDS,
   TOOLS,
   POTIONS;
   // $FF: renamed from: a java.lang.String
   private String field_1274;
   // $FF: renamed from: b int
   private int field_1275;
   // $FF: renamed from: c ca.diiza.f.a[]
   // $FF: synthetic field
   private static final class_236[] field_1276;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String) void
   private void method_1286(String var1, int var2, String var3, int var4, String var5) {
      super(var1, var2);
      this.field_1275 = var4;
      this.field_1274 = var5;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_0() {
      return this.field_1274;
   }

   // $FF: renamed from: b () int
   public int method_1() {
      return this.field_1275;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1287() {
      // $FF: Couldn't be decompiled
   }
}

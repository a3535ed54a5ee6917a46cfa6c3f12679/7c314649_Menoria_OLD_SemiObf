package ca.diiza.f;

import ca.diiza.f.A;
import ca.diiza.f.class_234;
import ca.diiza.m.a;
import java.util.ArrayList;
import java.util.Collections;

// $FF: renamed from: ca.diiza.f.e
public enum class_240 implements A {

   NONE,
   PRICE_INCREASE,
   PRICE_DECREASE,
   TIME_INCREASE,
   TIME_DECREASE;
   // $FF: renamed from: a java.lang.String
   private String field_1285;
   // $FF: renamed from: b int
   private int field_1286;
   // $FF: renamed from: c ca.diiza.f.e[]
   // $FF: synthetic field
   private static final class_240[] field_1287;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String) void
   private void method_1297(String var1, int var2, String var3, int var4, String var5) {
      super(var1, var2);
      this.field_1286 = var4;
      this.field_1285 = var5;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1298() {
      return this.field_1285;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_0() {
      return this.method_1298();
   }

   // $FF: renamed from: b (java.util.ArrayList) java.util.ArrayList
   public ArrayList<a> method_1299(ArrayList<a> var1) {
      if(this != NONE) {
         class_234 var10001 = new class_234;
         var10001.method_1280(this, this);
         Collections.sort(var1, var10001);
      }

      return var1;
   }

   // $FF: renamed from: b () int
   public int method_1() {
      return this.field_1286;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1300() {
      // $FF: Couldn't be decompiled
   }
}

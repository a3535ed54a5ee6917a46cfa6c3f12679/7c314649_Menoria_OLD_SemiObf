package ca.diiza.s;

import ca.diiza.s.class_91;
import java.awt.Toolkit;
import java.util.Timer;

// $FF: renamed from: ca.diiza.s.a
public class class_88 {

   // $FF: renamed from: a java.awt.Toolkit
   Toolkit field_12;
   // $FF: renamed from: b java.util.Timer
   Timer field_13;
   // $FF: renamed from: c java.lang.String
   private String field_14;
   // $FF: renamed from: d boolean
   public static boolean field_15;
   // $FF: renamed from: e boolean
   private static boolean field_16;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_17;


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_411(String var1) {
      boolean var10000 = method_416();
      super();
      boolean var2 = var10000;
      this.field_14 = var1;
      this.field_12 = Toolkit.getDefaultToolkit();
      this.field_13 = new Timer();
      Timer var4 = this.field_13;
      class_91 var10001 = new class_91;
      var10001.method_421(this);
      var4.schedule(var10001, 0L, 60000L);
      if(var2) {
         int var3 = class_689.method_3976();
         ++var3;
         class_689.method_3975(var3);
      }

   }

   // $FF: renamed from: a () void
   private void method_412() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ca.diiza.s.a) void
   static void method_413(class_88 var0) {
      var0.method_412();
   }

   // $FF: renamed from: <clinit> () void
   static void method_414() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (boolean) void
   public static void method_415(boolean var0) {
      field_16 = var0;
   }

   // $FF: renamed from: b () boolean
   public static boolean method_416() {
      return field_16;
   }

   // $FF: renamed from: c () boolean
   public static boolean method_417() {
      boolean var0 = method_416();
      return !var0;
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_418(Exception var0) {
      return var0;
   }
}

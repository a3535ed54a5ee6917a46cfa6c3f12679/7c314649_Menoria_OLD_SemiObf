package ca.diiza.m;

import ca.diiza.f.class_214;

// $FF: renamed from: ca.diiza.m.a
public class class_1664 {

   // $FF: renamed from: a int
   private int field_8663;
   // $FF: renamed from: b add
   private add field_8664;
   // $FF: renamed from: c long
   private long field_8665;
   // $FF: renamed from: d int
   private int field_8666;
   // $FF: renamed from: e java.lang.String
   private String field_8667;
   // $FF: renamed from: f int
   private int field_8668;
   // $FF: renamed from: g boolean
   private boolean field_8669;
   // $FF: renamed from: h ca.diiza.f.p
   final class_214 field_8670;
   // $FF: renamed from: i boolean
   private static boolean field_8671;


   // $FF: renamed from: <init> (ca.diiza.f.p, int, add, int, long, java.lang.String, int, boolean) void
   public void method_9174(class_214 var1, int var2, add var3, int var4, long var5, String var7, int var8, boolean var9) {
      super();
      this.field_8670 = var1;
      this.field_8663 = var2;
      boolean var10000 = method_9185();
      this.field_8664 = var3;
      this.field_8666 = var4;
      boolean var10 = var10000;
      this.field_8665 = var5;
      this.field_8667 = var7;
      this.field_8668 = var8;
      this.field_8669 = var9;
      if(var10) {
         int var11 = class_689.method_3977();
         ++var11;
         class_689.method_3975(var11);
      }

   }

   // $FF: renamed from: a () int
   public int method_9175() {
      return this.field_8663;
   }

   // $FF: renamed from: b () add
   public add method_9176() {
      return this.field_8664;
   }

   // $FF: renamed from: c () long
   public long method_9177() {
      return this.field_8665;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_9178() {
      return this.field_8667;
   }

   // $FF: renamed from: e () int
   public int method_9179() {
      return this.field_8668;
   }

   // $FF: renamed from: f () boolean
   public boolean method_9180() {
      return this.field_8669;
   }

   // $FF: renamed from: g () int
   public int method_9181() {
      return this.field_8666;
   }

   // $FF: renamed from: h () boolean
   public boolean method_9182() {
      boolean var1 = method_9184();
      long var2;
      int var10000 = (var2 = this.method_9177() - System.currentTimeMillis()) == 0L?0:(var2 < 0L?-1:1);
      if(var1) {
         var10000 = var10000 <= 0?1:0;
      }

      if(class_689.method_3976() != 0) {
         method_9183(!var1);
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (boolean) void
   public static void method_9183(boolean var0) {
      field_8671 = var0;
   }

   // $FF: renamed from: i () boolean
   public static boolean method_9184() {
      return field_8671;
   }

   // $FF: renamed from: j () boolean
   public static boolean method_9185() {
      boolean var0 = method_9184();
      return !var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9186() {
      if(method_9185()) {
         method_9183(true);
      }

   }
}

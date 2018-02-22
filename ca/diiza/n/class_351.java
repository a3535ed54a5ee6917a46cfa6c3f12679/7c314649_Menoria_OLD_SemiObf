package ca.diiza.n;

import ca.diiza.n.class_350;

// $FF: renamed from: ca.diiza.n.c
public class class_351 extends class_250 {

   // $FF: renamed from: a ro
   private class_1583 field_1784;
   // $FF: renamed from: c int
   private int field_1785;
   // $FF: renamed from: d int
   private int field_1786;
   // $FF: renamed from: e long
   private long field_1787;
   // $FF: renamed from: f java.lang.String
   private static final String field_1788 = "CL_00001507";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (ro, int, int, long) void
   public void method_2023(class_1583 var1, int var2, int var3, long var4) {
      super.method_1449();
      this.field_1784 = var1;
      this.field_1785 = var2;
      this.field_1786 = var3;
      this.field_1787 = var4;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1784 = var1.method_521();
      this.field_1785 = var1.readInt();
      this.field_1786 = var1.readInt();
      this.field_1787 = var1.readLong();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_520(this.field_1784);
      var1.writeInt(this.field_1785);
      var1.writeInt(this.field_1786);
      boolean var2 = class_350.method_2021();
      var1.writeLong(this.field_1787);
      if(class_689.method_3976() != 0) {
         class_350.method_2020(!var2);
      }

   }

   // $FF: renamed from: a (tL) void
   public void method_2024(class_63 var1) {}

   // $FF: renamed from: a () ro
   public class_1583 method_2025() {
      return this.field_1784;
   }

   // $FF: renamed from: d () int
   public int method_2026() {
      return this.field_1786;
   }

   // $FF: renamed from: e () long
   public long method_2027() {
      return this.field_1787;
   }

   // $FF: renamed from: f () int
   public int method_2028() {
      return this.field_1785;
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_2024((class_63)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "ïø}Xþ_".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_1788 = (new String((char[])var4)).intern();
            String var2 = field_1788;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 145;
            break;
         case 1:
            var10009 = 137;
            break;
         case 2:
            var10009 = 31;
            break;
         case 3:
            var10009 = 85;
            break;
         case 4:
            var10009 = 21;
            break;
         case 5:
            var10009 = 243;
            break;
         default:
            var10009 = 2;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

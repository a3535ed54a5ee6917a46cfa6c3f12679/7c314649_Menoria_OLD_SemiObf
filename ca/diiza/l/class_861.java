package ca.diiza.l;

import java.awt.Point;

// $FF: renamed from: ca.diiza.l.m
class class_861 {

   // $FF: renamed from: a int
   private int field_4137;
   // $FF: renamed from: b java.awt.Point[]
   private Point[] field_4138;


   // $FF: renamed from: <init> (int) void
   void method_5019(int var1) {
      super();
      this.field_4138 = new Point[var1];
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      this.field_4138[0] = new Point(var2, var3);

      for(int var7 = 1; var7 < var1; ++var7) {
         switch(var4) {
         case 0:
            --var3;
            break;
         case 1:
            ++var2;
            break;
         case 2:
            ++var3;
            break;
         case 3:
            --var2;
         }

         ++var5;
         if(var5 > var6) {
            var4 = var4 + 1 & 3;
            var5 = 0;
            if(var4 == 0 || var4 == 2) {
               ++var6;
            }
         }

         this.field_4138[var7] = new Point(var2, var3);
      }

   }

   // $FF: renamed from: a () java.awt.Point
   Point method_5020() {
      return this.field_4138[this.field_4137++];
   }

   // $FF: renamed from: b () int
   int method_5021() {
      return this.field_4137;
   }

   // $FF: renamed from: c () void
   void method_5022() {
      this.field_4137 = 0;
   }
}

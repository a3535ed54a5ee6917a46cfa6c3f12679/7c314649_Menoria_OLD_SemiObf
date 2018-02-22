package ca.diiza.l;

import ca.diiza.l.class_857;
import ca.diiza.l.class_862;
import ca.diiza.l.n;
import ca.diiza.l.o;

// $FF: renamed from: ca.diiza.l.o
class class_863 extends n implements Comparable<o> {

   // $FF: renamed from: p double
   double field_4155;
   // $FF: renamed from: q double
   double field_4156;
   // $FF: renamed from: r double
   double field_4157;
   // $FF: renamed from: s double
   double field_4158;
   // $FF: renamed from: t double
   double field_4159;
   // $FF: renamed from: u ca.diiza.l.h
   final class_857 field_4160;


   // $FF: renamed from: <init> (ca.diiza.l.h, ca.diiza.l.n, double) void
   protected void method_5033(class_857 var1, class_862 var2, double var3) {
      this.field_4160 = var1;
      super.method_5025(var2);
      double var6 = (double)var2.field_4145 * var3;
      bnn var8 = bnn.field_7418;
      this.field_4155 = var6 - bnn.field_7420 + 0.5D;
      var6 = (double)var2.field_4147 * var3;
      int var10000 = class_862.method_5031();
      var8 = bnn.field_7418;
      int var5 = var10000;
      this.field_4157 = var6 - bnn.field_7422 + 0.5D;
      var6 = (double)var2.field_4146;
      var8 = bnn.field_7418;
      this.field_4156 = var6 - bnn.field_7421 + 0.5D;
      this.field_4158 = this.field_4159 = Math.sqrt(this.field_4155 * this.field_4155 + this.field_4157 * this.field_4157 + this.field_4156 * this.field_4156);
      double var11 = this.field_4158;
      double var10001 = var1.field_3953;
      if(var5 == 0) {
         if(this.field_4158 <= var1.field_3953) {
            return;
         }

         var11 = var1.field_3953;
         var10001 = this.field_4158;
      }

      double var9 = var11 / var10001;
      this.field_4155 *= var9;
      this.field_4157 *= var9;
      this.field_4156 *= var9;
      this.field_4158 = var1.field_3953;
   }

   // $FF: renamed from: a (ca.diiza.l.o) int
   public int method_5034(class_863 var1) {
      int var2 = class_862.method_5031();
      double var3;
      int var10000 = (var3 = var1.field_4159 - this.field_4159) == 0.0D?0:(var3 < 0.0D?-1:1);
      if(var2 == 0) {
         if(var10000 < 0) {
            var10000 = -1;
            return var10000;
         }

         double var4;
         var10000 = (var4 = var1.field_4159 - this.field_4159) == 0.0D?0:(var4 < 0.0D?-1:1);
      }

      if(var2 == 0) {
         var10000 = var10000 > 0?1:0;
      }

      return var10000;
   }
}

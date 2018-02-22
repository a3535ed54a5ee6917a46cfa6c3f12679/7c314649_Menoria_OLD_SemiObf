import java.io.DataInput;
import java.io.DataOutput;

// $FF: renamed from: rv
public class class_1577 extends class_1572 {

   // $FF: renamed from: d double
   private double field_8266;


   // $FF: renamed from: <init> () void
   void method_8628() {
      super.method_8628();
   }

   // $FF: renamed from: <init> (double) void
   public void method_8646(double var1) {
      super.method_8628();
      this.field_8266 = var1;
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput var1) {
      var1.writeDouble(this.field_8266);
   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput var1, int var2, class_1567 var3) {
      var3.method_8604(64L);
      this.field_8266 = var1.readDouble();
   }

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)6;
   }

   public String toString() {
      return "" + this.field_8266 + "d";
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      class_1577 var10000 = new class_1577;
      var10000.method_8646(this.field_8266);
      return var10000;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = super.equals(var1);
      if(var2 != null) {
         if(var10000) {
            class_1577 var3 = (class_1577)var1;
            double var5;
            int var4 = (var5 = this.field_8266 - var3.field_8266) == 0.0D?0:(var5 < 0.0D?-1:1);
            if(var2 != null) {
               var4 = var4 == 0?1:0;
            }

            return (boolean)var4;
         }

         var10000 = false;
      }

      return var10000;
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.field_8266);
      return super.hashCode() ^ (int)(var1 ^ var1 >>> 32);
   }

   // $FF: renamed from: a () long
   public long method_8636() {
      return (long)Math.floor(this.field_8266);
   }

   // $FF: renamed from: e () int
   public int method_8637() {
      return class_1715.method_9561(this.field_8266);
   }

   // $FF: renamed from: f () short
   public short method_8638() {
      return (short)(class_1715.method_9561(this.field_8266) & '\uffff');
   }

   // $FF: renamed from: g () byte
   public byte method_8639() {
      return (byte)(class_1715.method_9561(this.field_8266) & 255);
   }

   // $FF: renamed from: h () double
   public double method_8640() {
      return this.field_8266;
   }

   // $FF: renamed from: i () float
   public float method_8641() {
      return (float)this.field_8266;
   }
}

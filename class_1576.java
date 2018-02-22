import java.io.DataInput;
import java.io.DataOutput;

// $FF: renamed from: rw
public class class_1576 extends class_1572 {

   // $FF: renamed from: d float
   private float field_8265;


   // $FF: renamed from: <init> () void
   void method_8628() {
      super.method_8628();
   }

   // $FF: renamed from: <init> (float) void
   public void method_8645(float var1) {
      super.method_8628();
      this.field_8265 = var1;
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput var1) {
      var1.writeFloat(this.field_8265);
   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput var1, int var2, class_1567 var3) {
      var3.method_8604(32L);
      this.field_8265 = var1.readFloat();
   }

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)5;
   }

   public String toString() {
      return "" + this.field_8265 + "f";
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      class_1576 var10000 = new class_1576;
      var10000.method_8645(this.field_8265);
      return var10000;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = super.equals(var1);
      if(var2 != null) {
         if(var10000) {
            class_1576 var3 = (class_1576)var1;
            float var5;
            int var4 = (var5 = this.field_8265 - var3.field_8265) == 0.0F?0:(var5 < 0.0F?-1:1);
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
      return super.hashCode() ^ Float.floatToIntBits(this.field_8265);
   }

   // $FF: renamed from: a () long
   public long method_8636() {
      return (long)this.field_8265;
   }

   // $FF: renamed from: e () int
   public int method_8637() {
      return class_1715.method_9559(this.field_8265);
   }

   // $FF: renamed from: f () short
   public short method_8638() {
      return (short)(class_1715.method_9559(this.field_8265) & '\uffff');
   }

   // $FF: renamed from: g () byte
   public byte method_8639() {
      return (byte)(class_1715.method_9559(this.field_8265) & 255);
   }

   // $FF: renamed from: h () double
   public double method_8640() {
      return (double)this.field_8265;
   }

   // $FF: renamed from: i () float
   public float method_8641() {
      return this.field_8265;
   }
}

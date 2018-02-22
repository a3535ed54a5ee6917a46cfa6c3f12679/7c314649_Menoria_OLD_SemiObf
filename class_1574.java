import java.io.DataInput;
import java.io.DataOutput;

// $FF: renamed from: ry
public class class_1574 extends class_1572 {

   // $FF: renamed from: d long
   private long field_8263;


   // $FF: renamed from: <init> () void
   void method_8628() {
      super.method_8628();
   }

   // $FF: renamed from: <init> (long) void
   public void method_8643(long var1) {
      super.method_8628();
      this.field_8263 = var1;
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput var1) {
      var1.writeLong(this.field_8263);
   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput var1, int var2, class_1567 var3) {
      var3.method_8604(64L);
      this.field_8263 = var1.readLong();
   }

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)4;
   }

   public String toString() {
      return "" + this.field_8263 + "L";
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      class_1574 var10000 = new class_1574;
      var10000.method_8643(this.field_8263);
      return var10000;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = super.equals(var1);
      if(var2 != null) {
         if(var10000) {
            class_1574 var3 = (class_1574)var1;
            long var5;
            int var4 = (var5 = this.field_8263 - var3.field_8263) == 0L?0:(var5 < 0L?-1:1);
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
      return super.hashCode() ^ (int)(this.field_8263 ^ this.field_8263 >>> 32);
   }

   // $FF: renamed from: a () long
   public long method_8636() {
      return this.field_8263;
   }

   // $FF: renamed from: e () int
   public int method_8637() {
      return (int)(this.field_8263 & -1L);
   }

   // $FF: renamed from: f () short
   public short method_8638() {
      return (short)((int)(this.field_8263 & 65535L));
   }

   // $FF: renamed from: g () byte
   public byte method_8639() {
      return (byte)((int)(this.field_8263 & 255L));
   }

   // $FF: renamed from: h () double
   public double method_8640() {
      return (double)this.field_8263;
   }

   // $FF: renamed from: i () float
   public float method_8641() {
      return (float)this.field_8263;
   }
}

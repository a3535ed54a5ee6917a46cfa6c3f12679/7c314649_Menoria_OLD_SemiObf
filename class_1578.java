import java.io.DataInput;
import java.io.DataOutput;

// $FF: renamed from: ru
public class class_1578 extends class_1572 {

   // $FF: renamed from: d byte
   private byte field_8267;


   // $FF: renamed from: <init> () void
   void method_8628() {
      super.method_8628();
   }

   // $FF: renamed from: <init> (byte) void
   public void method_8647(byte var1) {
      super.method_8628();
      this.field_8267 = var1;
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput var1) {
      var1.writeByte(this.field_8267);
   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput var1, int var2, class_1567 var3) {
      var3.method_8604(8L);
      this.field_8267 = var1.readByte();
   }

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)1;
   }

   public String toString() {
      return "" + this.field_8267 + "b";
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      class_1578 var10000 = new class_1578;
      var10000.method_8647(this.field_8267);
      return var10000;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = super.equals(var1);
      if(var2 != null) {
         if(var10000) {
            class_1578 var3 = (class_1578)var1;
            int var4 = this.field_8267;
            if(var2 != null) {
               var4 = this.field_8267 == var3.field_8267?1:0;
            }

            return (boolean)var4;
         }

         var10000 = false;
      }

      return var10000;
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_8267;
   }

   // $FF: renamed from: a () long
   public long method_8636() {
      return (long)this.field_8267;
   }

   // $FF: renamed from: e () int
   public int method_8637() {
      return this.field_8267;
   }

   // $FF: renamed from: f () short
   public short method_8638() {
      return (short)this.field_8267;
   }

   // $FF: renamed from: g () byte
   public byte method_8639() {
      return this.field_8267;
   }

   // $FF: renamed from: h () double
   public double method_8640() {
      return (double)this.field_8267;
   }

   // $FF: renamed from: i () float
   public float method_8641() {
      return (float)this.field_8267;
   }
}

import java.io.DataInput;
import java.io.DataOutput;

// $FF: renamed from: rx
public class class_1575 extends class_1572 {

   // $FF: renamed from: d int
   private int field_8264;


   // $FF: renamed from: <init> () void
   void method_8628() {
      super.method_8628();
   }

   // $FF: renamed from: <init> (int) void
   public void method_8644(int var1) {
      super.method_8628();
      this.field_8264 = var1;
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput var1) {
      var1.writeInt(this.field_8264);
   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput var1, int var2, class_1567 var3) {
      var3.method_8604(32L);
      this.field_8264 = var1.readInt();
   }

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)3;
   }

   public String toString() {
      return "" + this.field_8264;
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      class_1575 var10000 = new class_1575;
      var10000.method_8644(this.field_8264);
      return var10000;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = super.equals(var1);
      if(var2 != null) {
         if(var10000) {
            class_1575 var3 = (class_1575)var1;
            int var4 = this.field_8264;
            if(var2 != null) {
               var4 = this.field_8264 == var3.field_8264?1:0;
            }

            return (boolean)var4;
         }

         var10000 = false;
      }

      return var10000;
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_8264;
   }

   // $FF: renamed from: a () long
   public long method_8636() {
      return (long)this.field_8264;
   }

   // $FF: renamed from: e () int
   public int method_8637() {
      return this.field_8264;
   }

   // $FF: renamed from: f () short
   public short method_8638() {
      return (short)(this.field_8264 & '\uffff');
   }

   // $FF: renamed from: g () byte
   public byte method_8639() {
      return (byte)(this.field_8264 & 255);
   }

   // $FF: renamed from: h () double
   public double method_8640() {
      return (double)this.field_8264;
   }

   // $FF: renamed from: i () float
   public float method_8641() {
      return (float)this.field_8264;
   }
}

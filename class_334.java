
// $FF: renamed from: s7
public class class_334 extends class_250 {

   // $FF: renamed from: c int
   private int field_1684;
   // $FF: renamed from: d byte
   private byte field_1685;
   // $FF: renamed from: e byte
   private byte field_1686;
   // $FF: renamed from: f short
   private short field_1687;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, v5) void
   public void method_1891(int var1, class_1645 var2) {
      super.method_1449();
      this.field_1684 = var1;
      String[] var3 = class_752.method_4253();
      this.field_1685 = (byte)(var2.method_9016() & 255);
      class_334 var10000 = this;
      short var10001 = (byte)(var2.method_9018() & 255);
      if(var3 != null) {
         this.field_1686 = (byte)var10001;
         if(var2.method_9017() > 32767) {
            this.field_1687 = 32767;
            if(var3 != null) {
               return;
            }
         }

         var10000 = this;
         var10001 = (short)var2.method_9017();
      }

      var10000.field_1687 = var10001;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1684 = var1.readInt();
      this.field_1685 = var1.readByte();
      this.field_1686 = var1.readByte();
      this.field_1687 = var1.readShort();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1684);
      var1.writeByte(this.field_1685);
      var1.writeByte(this.field_1686);
      var1.writeShort(this.field_1687);
   }

   // $FF: renamed from: a () boolean
   public boolean method_1892() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_1687;
      if(var1 != null) {
         var10000 = this.field_1687 == 32767?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (tF) void
   public void method_1893(class_64 var1) {
      var1.method_332(this);
   }

   // $FF: renamed from: e () int
   public int method_1894() {
      return this.field_1684;
   }

   // $FF: renamed from: f () byte
   public byte method_1895() {
      return this.field_1685;
   }

   // $FF: renamed from: g () byte
   public byte method_1896() {
      return this.field_1686;
   }

   // $FF: renamed from: h () short
   public short method_1897() {
      return this.field_1687;
   }
}

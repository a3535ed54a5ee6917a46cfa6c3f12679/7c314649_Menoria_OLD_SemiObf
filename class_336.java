
// $FF: renamed from: s5
public class class_336 extends class_250 {

   // $FF: renamed from: c int
   private int field_1692;
   // $FF: renamed from: d int
   private int field_1693;
   // $FF: renamed from: e int
   private int field_1694;
   // $FF: renamed from: f int
   private int field_1695;
   // $FF: renamed from: g byte
   private byte field_1696;
   // $FF: renamed from: h byte
   private byte field_1697;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sa) void
   public void method_1902(class_689 var1) {
      super.method_1449();
      this.field_1692 = var1.method_3845();
      this.field_1693 = class_1715.method_9561(var1.field_2994 * 32.0D);
      this.field_1694 = class_1715.method_9561(var1.field_2995 * 32.0D);
      this.field_1695 = class_1715.method_9561(var1.field_2996 * 32.0D);
      this.field_1696 = (byte)((int)(var1.field_3000 * 256.0F / 360.0F));
      this.field_1697 = (byte)((int)(var1.field_3001 * 256.0F / 360.0F));
   }

   // $FF: renamed from: <init> (int, int, int, int, byte, byte) void
   public void method_1903(int var1, int var2, int var3, int var4, byte var5, byte var6) {
      super.method_1449();
      this.field_1692 = var1;
      this.field_1693 = var2;
      this.field_1694 = var3;
      this.field_1695 = var4;
      this.field_1696 = var5;
      this.field_1697 = var6;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1692 = var1.readInt();
      this.field_1693 = var1.readInt();
      this.field_1694 = var1.readInt();
      this.field_1695 = var1.readInt();
      this.field_1696 = var1.readByte();
      this.field_1697 = var1.readByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1692);
      var1.writeInt(this.field_1693);
      var1.writeInt(this.field_1694);
      var1.writeInt(this.field_1695);
      var1.writeByte(this.field_1696);
      var1.writeByte(this.field_1697);
   }

   // $FF: renamed from: b (tF) void
   public void method_1904(class_64 var1) {
      var1.method_330(this);
   }

   // $FF: renamed from: a () int
   public int method_1905() {
      return this.field_1692;
   }

   // $FF: renamed from: e () int
   public int method_1906() {
      return this.field_1693;
   }

   // $FF: renamed from: f () int
   public int method_1907() {
      return this.field_1694;
   }

   // $FF: renamed from: g () int
   public int method_1908() {
      return this.field_1695;
   }

   // $FF: renamed from: h () byte
   public byte method_1909() {
      return this.field_1696;
   }

   // $FF: renamed from: i () byte
   public byte method_1910() {
      return this.field_1697;
   }
}

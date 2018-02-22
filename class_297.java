
// $FF: renamed from: sd
public class class_297 extends class_250 {

   // $FF: renamed from: c int
   private int field_1547;
   // $FF: renamed from: d int
   private int field_1548;
   // $FF: renamed from: e int
   private int field_1549;
   // $FF: renamed from: f int
   private int field_1550;
   // $FF: renamed from: g int
   private int field_1551;
   // $FF: renamed from: h aji
   private aji field_1552;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int, aji, int, int) void
   public void method_1699(int var1, int var2, int var3, aji var4, int var5, int var6) {
      super.method_1449();
      this.field_1547 = var1;
      this.field_1548 = var2;
      this.field_1549 = var3;
      this.field_1550 = var5;
      this.field_1551 = var6;
      this.field_1552 = var4;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1547 = var1.readInt();
      this.field_1548 = var1.readShort();
      this.field_1549 = var1.readInt();
      this.field_1550 = var1.readUnsignedByte();
      this.field_1551 = var1.readUnsignedByte();
      this.field_1552 = aji.method_2416(var1.method_518() & 4095);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1547);
      var1.writeShort(this.field_1548);
      var1.writeInt(this.field_1549);
      var1.writeByte(this.field_1550);
      var1.writeByte(this.field_1551);
      var1.method_519(aji.method_2415(this.field_1552) & 4095);
   }

   // $FF: renamed from: b (tF) void
   public void method_1700(class_64 var1) {
      var1.method_283(this);
   }

   // $FF: renamed from: a () aji
   public aji method_1701() {
      return this.field_1552;
   }

   // $FF: renamed from: e () int
   public int method_1702() {
      return this.field_1547;
   }

   // $FF: renamed from: f () int
   public int method_1703() {
      return this.field_1548;
   }

   // $FF: renamed from: g () int
   public int method_1704() {
      return this.field_1549;
   }

   // $FF: renamed from: h () int
   public int method_1705() {
      return this.field_1550;
   }

   // $FF: renamed from: i () int
   public int method_1706() {
      return this.field_1551;
   }
}

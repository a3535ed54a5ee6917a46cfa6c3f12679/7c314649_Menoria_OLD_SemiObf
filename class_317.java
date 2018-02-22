
// $FF: renamed from: sN
public class class_317 extends class_250 {

   // $FF: renamed from: c int
   private int field_1613;
   // $FF: renamed from: d int
   private int field_1614;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, v5) void
   public void method_1801(int var1, class_1645 var2) {
      super.method_1449();
      this.field_1613 = var1;
      this.field_1614 = var2.method_9016();
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1613 = var1.readInt();
      this.field_1614 = var1.readUnsignedByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1613);
      var1.writeByte(this.field_1614);
   }

   // $FF: renamed from: b (tF) void
   public void method_1802(class_64 var1) {
      var1.method_313(this);
   }

   // $FF: renamed from: a () int
   public int method_1803() {
      return this.field_1613;
   }

   // $FF: renamed from: e () int
   public int method_1804() {
      return this.field_1614;
   }
}

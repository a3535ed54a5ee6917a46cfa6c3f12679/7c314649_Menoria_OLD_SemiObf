
// $FF: renamed from: sk
public class class_289 extends class_250 {

   // $FF: renamed from: c int
   private int field_1520;
   // $FF: renamed from: d int
   private int field_1521;
   // $FF: renamed from: e java.lang.String
   private String field_1522;
   // $FF: renamed from: f int
   private int field_1523;
   // $FF: renamed from: g boolean
   private boolean field_1524;
   // $FF: renamed from: h int
   private int field_1525;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, java.lang.String, int, boolean) void
   public void method_1661(int var1, int var2, String var3, int var4, boolean var5) {
      super.method_1449();
      this.field_1520 = var1;
      this.field_1521 = var2;
      this.field_1522 = var3;
      this.field_1523 = var4;
      this.field_1524 = var5;
   }

   // $FF: renamed from: <init> (int, int, java.lang.String, int, boolean, int) void
   public void method_1662(int var1, int var2, String var3, int var4, boolean var5, int var6) {
      this.method_1661(var1, var2, var3, var4, var5);
      this.field_1525 = var6;
   }

   // $FF: renamed from: b (tF) void
   public void method_1663(class_64 var1) {
      var1.method_292(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1520 = var1.readUnsignedByte();
      this.field_1521 = var1.readUnsignedByte();
      String[] var10000 = class_752.method_4253();
      this.field_1522 = var1.method_524(32);
      String[] var2 = var10000;
      this.field_1523 = var1.readUnsignedByte();
      this.field_1524 = var1.readBoolean();
      class_289 var3 = this;
      if(var2 != null) {
         if(this.field_1521 != 11) {
            return;
         }

         var3 = this;
      }

      var3.field_1525 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      var1.writeByte(this.field_1520);
      String[] var2 = var10000;
      var1.writeByte(this.field_1521);
      var1.method_525(this.field_1522);
      var1.writeByte(this.field_1523);
      var1.writeBoolean(this.field_1524);
      if(var2 != null && this.field_1521 == 11) {
         var1.writeInt(this.field_1525);
      }

   }

   // $FF: renamed from: a () int
   public int method_1664() {
      return this.field_1520;
   }

   // $FF: renamed from: e () int
   public int method_1665() {
      return this.field_1521;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_1666() {
      return this.field_1522;
   }

   // $FF: renamed from: g () int
   public int method_1667() {
      return this.field_1523;
   }

   // $FF: renamed from: h () boolean
   public boolean method_1668() {
      return this.field_1524;
   }

   // $FF: renamed from: i () int
   public int method_1669() {
      return this.field_1525;
   }
}

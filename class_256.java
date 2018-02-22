
// $FF: renamed from: tu
public class class_256 extends class_250 {

   // $FF: renamed from: c int
   private int field_1391;
   // $FF: renamed from: d int
   private int field_1392;
   // $FF: renamed from: e int
   private int field_1393;
   // $FF: renamed from: f int
   private int field_1394;
   // $FF: renamed from: g add
   private add field_1395;
   // $FF: renamed from: h float
   private float field_1396;
   // $FF: renamed from: i float
   private float field_1397;
   // $FF: renamed from: j float
   private float field_1398;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int, int, add, float, float, float) void
   public void method_1477(int var1, int var2, int var3, int var4, add var5, float var6, float var7, float var8) {
      super.method_1449();
      String[] var10000 = class_752.method_4253();
      this.field_1391 = var1;
      this.field_1392 = var2;
      this.field_1393 = var3;
      String[] var9 = var10000;
      this.field_1394 = var4;
      add var10001 = var5;
      if(var9 != null) {
         var10001 = var5 != null?var5.method_3754():null;
      }

      this.field_1395 = var10001;
      this.field_1396 = var6;
      this.field_1397 = var7;
      this.field_1398 = var8;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1391 = var1.readInt();
      this.field_1392 = var1.readUnsignedByte();
      this.field_1393 = var1.readInt();
      this.field_1394 = var1.readUnsignedByte();
      this.field_1395 = var1.method_523();
      this.field_1396 = (float)var1.readUnsignedByte() / 16.0F;
      this.field_1397 = (float)var1.readUnsignedByte() / 16.0F;
      this.field_1398 = (float)var1.readUnsignedByte() / 16.0F;
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1391);
      var1.writeByte(this.field_1392);
      var1.writeInt(this.field_1393);
      var1.writeByte(this.field_1394);
      var1.method_522(this.field_1395);
      var1.writeByte((int)(this.field_1396 * 16.0F));
      var1.writeByte((int)(this.field_1397 * 16.0F));
      var1.writeByte((int)(this.field_1398 * 16.0F));
   }

   // $FF: renamed from: b (tL) void
   public void method_1478(class_63 var1) {
      var1.method_270(this);
   }

   // $FF: renamed from: a () int
   public int method_1479() {
      return this.field_1391;
   }

   // $FF: renamed from: e () int
   public int method_1480() {
      return this.field_1392;
   }

   // $FF: renamed from: f () int
   public int method_1481() {
      return this.field_1393;
   }

   // $FF: renamed from: g () int
   public int method_1482() {
      return this.field_1394;
   }

   // $FF: renamed from: h () add
   public add method_1483() {
      return this.field_1395;
   }

   // $FF: renamed from: i () float
   public float method_1484() {
      return this.field_1396;
   }

   // $FF: renamed from: j () float
   public float method_1485() {
      return this.field_1397;
   }

   // $FF: renamed from: k () float
   public float method_1486() {
      return this.field_1398;
   }
}

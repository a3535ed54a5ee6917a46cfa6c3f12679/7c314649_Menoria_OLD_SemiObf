
// $FF: renamed from: sn
public class class_286 extends class_250 {

   // $FF: renamed from: c int
   private int field_1512;
   // $FF: renamed from: d int
   private int field_1513;
   // $FF: renamed from: e add
   private add field_1514;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, add) void
   public void method_1647(int var1, int var2, add var3) {
      add var10001;
      label14: {
         super.method_1449();
         String[] var10000 = class_752.method_4253();
         this.field_1512 = var1;
         String[] var4 = var10000;
         this.field_1513 = var2;
         var10001 = var3;
         if(var4 != null) {
            if(var3 == null) {
               var10001 = null;
               break label14;
            }

            var10001 = var3;
         }

         var10001 = var10001.method_3754();
      }

      this.field_1514 = var10001;
   }

   // $FF: renamed from: b (tF) void
   public void method_1648(class_64 var1) {
      var1.method_294(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1512 = var1.readByte();
      this.field_1513 = var1.readShort();
      this.field_1514 = var1.method_523();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(this.field_1512);
      var1.writeShort(this.field_1513);
      var1.method_522(this.field_1514);
   }

   // $FF: renamed from: a () int
   public int method_1649() {
      return this.field_1512;
   }

   // $FF: renamed from: e () int
   public int method_1650() {
      return this.field_1513;
   }

   // $FF: renamed from: f () add
   public add method_1651() {
      return this.field_1514;
   }
}

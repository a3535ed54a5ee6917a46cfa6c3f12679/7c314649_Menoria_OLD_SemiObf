
// $FF: renamed from: sT
public class class_311 extends class_250 {

   // $FF: renamed from: c int
   private int field_1598;
   // $FF: renamed from: d int
   private int field_1599;
   // $FF: renamed from: e int
   private int field_1600;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, sa, sa) void
   public void method_1775(int var1, class_689 var2, class_689 var3) {
      int var5;
      label14: {
         super.method_1449();
         String[] var10000 = class_752.method_4253();
         this.field_1598 = var1;
         String[] var4 = var10000;
         this.field_1599 = var2.method_3845();
         class_689 var10001 = var3;
         if(var4 != null) {
            if(var3 == null) {
               var5 = -1;
               break label14;
            }

            var10001 = var3;
         }

         var5 = var10001.method_3845();
      }

      this.field_1600 = var5;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1599 = var1.readInt();
      this.field_1600 = var1.readInt();
      this.field_1598 = var1.readUnsignedByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1599);
      var1.writeInt(this.field_1600);
      var1.writeByte(this.field_1598);
   }

   // $FF: renamed from: b (tF) void
   public void method_1776(class_64 var1) {
      var1.method_299(this);
   }

   // $FF: renamed from: a () int
   public int method_1777() {
      return this.field_1598;
   }

   // $FF: renamed from: e () int
   public int method_1778() {
      return this.field_1599;
   }

   // $FF: renamed from: f () int
   public int method_1779() {
      return this.field_1600;
   }
}

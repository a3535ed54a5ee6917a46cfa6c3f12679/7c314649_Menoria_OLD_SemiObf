
// $FF: renamed from: ts
public class class_258 extends class_250 {

   // $FF: renamed from: c int
   private int field_1403;
   // $FF: renamed from: d add
   private add field_1404;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, add) void
   public void method_1493(int var1, add var2) {
      super.method_1449();
      String[] var3 = class_752.method_4253();
      this.field_1403 = var1;
      add var10001 = var2;
      if(var3 != null) {
         var10001 = var2 != null?var2.method_3754():null;
      }

      this.field_1404 = var10001;
   }

   // $FF: renamed from: b (tL) void
   public void method_1494(class_63 var1) {
      var1.method_268(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1403 = var1.readShort();
      this.field_1404 = var1.method_523();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeShort(this.field_1403);
      var1.method_522(this.field_1404);
   }

   // $FF: renamed from: a () int
   public int method_1495() {
      return this.field_1403;
   }

   // $FF: renamed from: e () add
   public add method_1496() {
      return this.field_1404;
   }
}

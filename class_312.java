import java.util.List;

// $FF: renamed from: sS
public class class_312 extends class_250 {

   // $FF: renamed from: c int
   private int field_1601;
   // $FF: renamed from: d java.util.List
   private List field_1602;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, x1, boolean) void
   public void method_1780(int var1, class_1710 var2, boolean var3) {
      String[] var10000 = class_752.method_4253();
      super.method_1449();
      String[] var4 = var10000;
      class_312 var5 = this;
      if(var4 != null) {
         this.field_1601 = var1;
         if(var3) {
            this.field_1602 = var2.method_9512();
            if(var4 != null) {
               return;
            }
         }

         var5 = this;
      }

      var5.field_1602 = var2.method_9510();
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1601 = var1.readInt();
      this.field_1602 = class_1710.method_9514(var1);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1601);
      class_1710.method_9509(this.field_1602, var1);
   }

   // $FF: renamed from: b (tF) void
   public void method_1781(class_64 var1) {
      var1.method_318(this);
   }

   // $FF: renamed from: a () java.util.List
   public List method_1782() {
      return this.field_1602;
   }

   // $FF: renamed from: e () int
   public int method_1783() {
      return this.field_1601;
   }
}

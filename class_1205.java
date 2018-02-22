
// $FF: renamed from: hR
public class class_1205 {

   // $FF: renamed from: b aji
   private aji field_6240;
   // $FF: renamed from: c int
   private int field_6241;
   // $FF: renamed from: d int
   private int field_6242;
   // $FF: renamed from: e int
   private int field_6243;


   // $FF: renamed from: <init> (int, aji) void
   public void method_6469(int var1, aji var2) {
      super();
      this.field_6241 = 1;
      this.field_6241 = var1;
      this.field_6240 = var2;
   }

   // $FF: renamed from: <init> (int, aji, int) void
   public void method_6470(int var1, aji var2, int var3) {
      this.method_6469(var1, var2);
      this.field_6242 = var3;
   }

   // $FF: renamed from: b () int
   public int method_6471() {
      return this.field_6241;
   }

   // $FF: renamed from: c () aji
   public aji method_6472() {
      return this.field_6240;
   }

   // $FF: renamed from: d () int
   public int method_6473() {
      return this.field_6242;
   }

   // $FF: renamed from: e () int
   public int method_6474() {
      return this.field_6243;
   }

   // $FF: renamed from: a (int) void
   public void method_6475(int var1) {
      this.field_6243 = var1;
   }

   public String toString() {
      String var1 = Integer.toString(aji.method_2415(this.field_6240));
      if(this.field_6241 > 1) {
         var1 = this.field_6241 + "x" + var1;
      }

      if(this.field_6242 > 0) {
         var1 = var1 + ":" + this.field_6242;
      }

      return var1;
   }
}

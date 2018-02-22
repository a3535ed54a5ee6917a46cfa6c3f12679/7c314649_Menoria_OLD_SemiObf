
// $FF: renamed from: ua
public class class_1656 {

   // $FF: renamed from: b int
   private final int field_8616;
   // $FF: renamed from: c int
   private final int field_8617;
   // $FF: renamed from: d int
   private final int field_8618;
   // $FF: renamed from: e int
   private final int field_8619;
   // $FF: renamed from: f int
   private int field_8620;
   // $FF: renamed from: g int
   private int field_8621;


   // $FF: renamed from: <init> (int, int, int, int) void
   public void method_9105(int var1, int var2, int var3, int var4) {
      super();
      this.field_8616 = var1;
      this.field_8617 = var2;
      this.field_8618 = var3;
      this.field_8619 = var4;
   }

   // $FF: renamed from: a () int
   public int method_9106() {
      return this.field_8617;
   }

   // $FF: renamed from: b () int
   public int method_9107() {
      return this.field_8618;
   }

   // $FF: renamed from: c () int
   public int method_9108() {
      return this.field_8619;
   }

   // $FF: renamed from: b (int) void
   public void method_9109(int var1) {
      label13: {
         String[] var2 = class_752.method_4253();
         int var10000 = var1;
         if(var2 != null) {
            if(var1 <= 10) {
               break label13;
            }

            var10000 = 10;
         }

         var1 = var10000;
      }

      this.field_8620 = var1;
   }

   // $FF: renamed from: d () int
   public int method_9110() {
      return this.field_8620;
   }

   // $FF: renamed from: c (int) void
   public void method_9111(int var1) {
      this.field_8621 = var1;
   }

   // $FF: renamed from: e () int
   public int method_9112() {
      return this.field_8621;
   }
}


// $FF: renamed from: y_
public class class_1841 {

   // $FF: renamed from: b int
   public final int field_9397;
   // $FF: renamed from: c int
   public final int field_9398;
   // $FF: renamed from: d int
   public final int field_9399;
   // $FF: renamed from: e int
   public final int field_9400;
   // $FF: renamed from: f int
   public final int field_9401;
   // $FF: renamed from: g int
   public int field_9402;
   // $FF: renamed from: h boolean
   public boolean field_9403;
   // $FF: renamed from: i int
   private int field_9404;


   // $FF: renamed from: <init> (int, int, int, int, int, int) void
   public void method_9958(int var1, int var2, int var3, int var4, int var5, int var6) {
      super();
      this.field_9397 = var1;
      this.field_9398 = var2;
      this.field_9399 = var3;
      this.field_9400 = var4;
      this.field_9401 = var5;
      this.field_9402 = var6;
   }

   // $FF: renamed from: a (int, int, int) int
   public int method_9959(int var1, int var2, int var3) {
      int var4 = var1 - this.field_9397;
      int var5 = var2 - this.field_9398;
      int var6 = var3 - this.field_9399;
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   // $FF: renamed from: b (int, int, int) int
   public int method_9960(int var1, int var2, int var3) {
      int var4 = var1 - this.field_9397 - this.field_9400;
      int var5 = var2 - this.field_9398;
      int var6 = var3 - this.field_9399 - this.field_9401;
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   // $FF: renamed from: b () int
   public int method_9961() {
      return this.field_9397 + this.field_9400;
   }

   // $FF: renamed from: c () int
   public int method_9962() {
      return this.field_9398;
   }

   // $FF: renamed from: d () int
   public int method_9963() {
      return this.field_9399 + this.field_9401;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_9964(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = var1 - this.field_9397;
      String[] var3 = var10000;
      int var5 = var2 - this.field_9399;
      int var6 = var4 * this.field_9400 + var5 * this.field_9401;
      if(var3 != null) {
         var6 = var6 >= 0?1:0;
      }

      return (boolean)var6;
   }

   // $FF: renamed from: e () void
   public void method_9965() {
      this.field_9404 = 0;
   }

   // $FF: renamed from: f () void
   public void method_9966() {
      ++this.field_9404;
   }

   // $FF: renamed from: g () int
   public int method_9967() {
      return this.field_9404;
   }
}

import java.awt.image.BufferedImage;

public class bpq extends bpp {

   // $FF: renamed from: b int[]
   private final int[] field_7783;
   // $FF: renamed from: c int
   private final int field_7784;
   // $FF: renamed from: d int
   private final int field_7785;


   // $FF: renamed from: <init> (java.awt.image.BufferedImage) void
   public void method_7979(BufferedImage var1) {
      this.method_7980(var1.getWidth(), var1.getHeight());
      var1.getRGB(0, 0, var1.getWidth(), var1.getHeight(), this.field_7783, 0, var1.getWidth());
      this.method_7981();
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_7980(int var1, int var2) {
      super.method_7950();
      this.field_7784 = var1;
      this.field_7785 = var2;
      this.field_7783 = new int[var1 * var2];
      bqi.method_8153(this.method_222(), var1, var2);
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy var1) {}

   // $FF: renamed from: a () void
   public void method_7981() {
      bqi.method_8146(this.method_222(), this.field_7783, this.field_7784, this.field_7785);
   }

   // $FF: renamed from: d () int[]
   public int[] method_7982() {
      return this.field_7783;
   }
}

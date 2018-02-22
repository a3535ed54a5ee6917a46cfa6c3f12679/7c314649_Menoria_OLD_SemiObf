import net.minecraft.realms.RealmsScrolledSelectionList;

// $FF: renamed from: mh
public class class_971 extends bcm {

   // $FF: renamed from: w net.minecraft.realms.RealmsScrolledSelectionList
   private final RealmsScrolledSelectionList field_4915;


   // $FF: renamed from: <init> (net.minecraft.realms.RealmsScrolledSelectionList, int, int, int, int, int) void
   public void method_5600(RealmsScrolledSelectionList var1, int var2, int var3, int var4, int var5, int var6) {
      super.method_5549(bao.method_5273(), var2, var3, var4, var5, var6);
      this.field_4915 = var1;
   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return this.field_4915.getItemCount();
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {
      this.field_4915.selectItem(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      return this.field_4915.isSelectedItem(var1);
   }

   // $FF: renamed from: a () void
   protected void method_5557() {
      this.field_4915.renderBackground();
   }

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      this.field_4915.renderItem(var1, var2, var3, var4, var6, var7);
   }

   // $FF: renamed from: h () int
   public int method_5601() {
      return super.field_4854;
   }

   // $FF: renamed from: m () int
   public int method_5602() {
      return super.field_4864;
   }

   // $FF: renamed from: n () int
   public int method_5603() {
      return super.field_4863;
   }

   // $FF: renamed from: e () int
   protected int method_5556() {
      return this.field_4915.getMaxPosition();
   }

   // $FF: renamed from: d () int
   protected int method_5575() {
      return this.field_4915.getScrollbarPosition();
   }
}

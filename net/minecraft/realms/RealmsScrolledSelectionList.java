package net.minecraft.realms;

import net.minecraft.realms.Tezzelator;

public class RealmsScrolledSelectionList {

   private final class_971 proxy;


   // $FF: renamed from: <init> (int, int, int, int, int) void
   public void method_528(int var1, int var2, int var3, int var4, int var5) {
      super();
      class_971 var10001 = new class_971;
      var10001.method_5600(this, var1, var2, var3, var4, var5);
      this.proxy = var10001;
   }

   public void render(int var1, int var2, float var3) {
      this.proxy.method_5570(var1, var2, var3);
   }

   public int width() {
      return this.proxy.method_5601();
   }

   // $FF: renamed from: ym () int
   public int method_529() {
      return this.proxy.method_5602();
   }

   // $FF: renamed from: xm () int
   public int method_530() {
      return this.proxy.method_5603();
   }

   protected void renderItem(int var1, int var2, int var3, int var4, Tezzelator var5, int var6, int var7) {}

   public void renderItem(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.renderItem(var1, var2, var3, var4, Tezzelator.instance, var5, var6);
   }

   public int getItemCount() {
      return 0;
   }

   public void selectItem(int var1, boolean var2, int var3, int var4) {}

   public boolean isSelectedItem(int var1) {
      return false;
   }

   public void renderBackground() {}

   public int getMaxPosition() {
      return 0;
   }

   public int getScrollbarPosition() {
      return this.proxy.method_5601() / 2 + 124;
   }
}

package net.minecraft.realms;


public class RealmsButton {

   private class_151 proxy;


   // $FF: renamed from: <init> (int, int, int, java.lang.String) void
   public void getBlock72(int var1, int var2, int var3, String var4) {
      super();
      class_151 var10001 = new class_151;
      var10001.method_773(this, var1, var2, var3, var4);
      this.proxy = var10001;
   }

   // $FF: renamed from: <init> (int, int, int, int, int, java.lang.String) void
   public void getBlock73(int var1, int var2, int var3, int var4, int var5, String var6) {
      super();
      class_151 var10001 = new class_151;
      var10001.method_774(this, var1, var2, var3, var6, var4, var5);
      this.proxy = var10001;
   }

   public bcb getProxy() {
      return this.proxy;
   }

   // $FF: renamed from: id () int
   public int getBlock74() {
      return this.proxy.method_775();
   }

   public boolean active() {
      return this.proxy.method_776();
   }

   public void active(boolean var1) {
      this.proxy.method_777(var1);
   }

   public void msg(String var1) {
      this.proxy.method_778(var1);
   }

   public int getWidth() {
      return this.proxy.method_757();
   }

   public int getHeight() {
      return this.proxy.method_758();
   }

   // $FF: renamed from: y () int
   public int getBlock75() {
      return this.proxy.method_779();
   }

   public void render(int var1, int var2) {
      this.proxy.method_750(bao.method_5273(), var1, var2);
   }

   public void clicked(int var1, int var2) {}

   public void released(int var1, int var2) {}

   public void blit(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.proxy.method_658(var1, var2, var3, var4, var5, var6);
   }

   public void renderBg(int var1, int var2) {}

   public int getYImage(boolean var1) {
      return this.proxy.method_781(var1);
   }
}

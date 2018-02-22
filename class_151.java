import net.minecraft.realms.RealmsButton;

// $FF: renamed from: k1
public class class_151 extends bcb {

   // $FF: renamed from: b net.minecraft.realms.RealmsButton
   private RealmsButton field_484;


   // $FF: renamed from: <init> (net.minecraft.realms.RealmsButton, int, int, int, java.lang.String) void
   public void method_773(RealmsButton var1, int var2, int var3, int var4, String var5) {
      super.method_747(var2, var3, var4, var5);
      this.field_484 = var1;
   }

   // $FF: renamed from: <init> (net.minecraft.realms.RealmsButton, int, int, int, java.lang.String, int, int) void
   public void method_774(RealmsButton var1, int var2, int var3, int var4, String var5, int var6, int var7) {
      super.method_748(var2, var3, var4, var6, var7, var5);
      this.field_484 = var1;
   }

   // $FF: renamed from: e () int
   public int method_775() {
      return super.field_450;
   }

   // $FF: renamed from: f () boolean
   public boolean method_776() {
      return super.field_451;
   }

   // $FF: renamed from: c (boolean) void
   public void method_777(boolean var1) {
      super.field_451 = var1;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_778(String var1) {
      super.field_449 = var1;
   }

   // $FF: renamed from: b () int
   public int method_757() {
      return super.method_757();
   }

   // $FF: renamed from: g () int
   public int method_779() {
      return super.field_448;
   }

   // $FF: renamed from: c (bao, int, int) boolean
   public boolean method_753(bao var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = super.method_753(var1, var2, var3);
      if(var4 != null) {
         if(var10000) {
            this.field_484.clicked(var2, var3);
         }

         var10000 = super.method_753(var1, var2, var3);
      }

      return var10000;
   }

   // $FF: renamed from: a (int, int) void
   public void method_752(int var1, int var2) {
      this.field_484.released(var1, var2);
   }

   // $FF: renamed from: b (bao, int, int) void
   public void method_751(bao var1, int var2, int var3) {
      this.field_484.renderBg(var2, var3);
   }

   // $FF: renamed from: h () net.minecraft.realms.RealmsButton
   public RealmsButton method_780() {
      return this.field_484;
   }

   // $FF: renamed from: a (boolean) int
   public int method_749(boolean var1) {
      return this.field_484.getYImage(var1);
   }

   // $FF: renamed from: d (boolean) int
   public int method_781(boolean var1) {
      return super.method_749(var1);
   }
}

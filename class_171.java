import java.util.List;

// $FF: renamed from: ls
public class class_171 extends bdw {

   // $FF: renamed from: b int
   private int field_625;
   // $FF: renamed from: i int
   private int field_626;
   // $FF: renamed from: r java.lang.String
   private static final String field_627;
   // $FF: renamed from: s java.lang.String[]
   private static final String[] field_628;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      this.field_625 = 0;
      this.buttonList.clear();
      boolean var1 = true;
      boolean var2 = true;
      int var3 = this.height / 3 + 62;
      int var4 = this.height / 3 + 38;
      int var5 = this.height / 3 + 14;
      int var6 = this.height / 3 - 10;
      int var7 = this.height / 3 - 34;
      int var8 = this.height / 3 - 58;
      int var9 = this.height / 3 - 82;
      int var10 = this.height / 3 - 106;
      int var11 = this.height / 4 + 48;
      byte var12 = 24;
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      int var10004 = this.width / 2 - 100;
      int var10005 = var11 + var12 - 50;
      String[] var13 = field_628;
      var10001.method_748(4, var10004, var10005, 98, 20, class_1450.method_7896("§aRetour au jeu", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(1, this.width / 2 + 2, var11 + var12 - 50, 98, 20, class_1450.method_7896("§aMenu principal", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(0, this.width / 2 - 100, var11 + var12 - 25, 98, 20, class_1450.method_7896("§cRéglages", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(7, this.width / 2 + 2, var11 + var12 - 25, 98, 20, class_1450.method_7896("§cTeamspeak", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(8, this.width / 2 - 100, var11 + var12 - 0, 98, 20, class_1450.method_7896("§cSite Internet", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(6, this.width / 2 + 2, var11 + var12 - 0, 98, 20, class_1450.method_7896("§cStatistiques", new Object[0]));
      var10000.add(var10001);
   }

   // $FF: renamed from: a () void
   public void method_922() {
      int var1 = this.height / 4;
      int var2 = this.width / 2 - 120;
      int var3 = this.width / 2 + 120;
      int var4 = var1 + 116;
      int var5 = var1 - 12;
      drawRect(var2, var5, var3, var4, -1728053248);
      int var6 = this.width / 2 - 50;
      int var7 = this.width / 2 + 50;
      int var8 = var1 + 116;
      int var9 = var1 + 130;
      drawRect(var6, var9, var7, var8, -1728053248);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
      ++this.field_626;
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_922();
      String[] var5 = field_628;
      String var4 = "§6Ménoria V3";
      this.method_657(this.fontRendererObj, var4, this.width / 2 - 27, this.height / 4 + 115, 16777215);
      this.drawCenteredString(this.fontRendererObj, "§6- Bienvenue §c" + this.field_557.method_5285().method_6995() + "§6 -", this.width / 2, this.height / 4, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_923(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_924() {
      // $FF: Couldn't be decompiled
   }
}

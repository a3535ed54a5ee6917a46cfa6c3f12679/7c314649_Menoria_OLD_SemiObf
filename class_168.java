
// $FF: renamed from: lv
public class class_168 extends bdw {

   // $FF: renamed from: b nv
   private class_1436 field_606;
   // $FF: renamed from: i int
   private int field_607;
   // $FF: renamed from: r java.lang.String
   private static final String field_608 = "multiplayer.downloadingTerrain";


   // $FF: renamed from: <init> (nv) void
   public void method_909(class_1436 var1) {
      super.method_651();
      this.field_606 = var1;
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {}

   // $FF: renamed from: b () void
   public void initGui() {
      this.buttonList.clear();
   }

   // $FF: renamed from: e () void
   public void method_871() {
      String[] var10000 = class_752.method_4253();
      ++this.field_607;
      String[] var1 = var10000;
      class_168 var2 = this;
      class_1436 var3;
      if(var1 != null) {
         if(this.field_607 % 20 == 0) {
            var3 = this.field_606;
            class_268 var10001 = new class_268;
            var10001.method_1449();
            var3.method_7821(var10001);
         }

         var2 = this;
      }

      var3 = var2.field_606;
      if(var1 != null) {
         if(var3 == null) {
            return;
         }

         var3 = this.field_606;
      }

      var3.method_239();
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_875(0);
      this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("multiplayer.downloadingTerrain", new Object[0]), this.width / 2, this.height / 2 - 50, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_910() {
      boolean var10000 = true;
      char[] var10003 = "ýÔL ñØEÇçÏLþÆtùÏ".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_608 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 51;
            break;
         case 1:
            var10009 = 2;
            break;
         case 2:
            var10009 = 131;
            break;
         case 3:
            var10009 = 215;
            break;
         case 4:
            var10009 = 74;
            break;
         case 5:
            var10009 = 215;
            break;
         default:
            var10009 = 72;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

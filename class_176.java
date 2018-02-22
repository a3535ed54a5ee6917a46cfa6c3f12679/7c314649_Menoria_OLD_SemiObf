import java.util.Iterator;
import java.util.List;

// $FF: renamed from: ln
public class class_176 extends bdw {

   // $FF: renamed from: b java.lang.String
   private String field_648;
   // $FF: renamed from: i rV
   private class_66 field_649;
   // $FF: renamed from: r java.util.List
   private List field_650;
   // $FF: renamed from: s bdw
   private final bdw field_651;
   // $FF: renamed from: t java.lang.String
   private static final String field_652 = "gui.toMenu";


   // $FF: renamed from: <init> (bdw, java.lang.String, rV) void
   public void method_936(bdw var1, String var2, class_66 var3) {
      super.method_651();
      this.field_651 = var1;
      this.field_648 = class_1450.method_7896(var2, new Object[0]);
      this.field_649 = var3;
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {}

   // $FF: renamed from: b () void
   public void initGui() {
      this.buttonList.clear();
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      var10001.method_747(0, this.width / 2 - 100, this.height / 4 + 120 + 12, class_1450.method_7896("gui.toMenu", new Object[0]));
      var10000.add(var10001);
      this.field_650 = this.fontRendererObj.listFormattedStringToWidth(this.field_649.method_343(), this.width - 50);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      if(var1.field_450 == 0) {
         this.field_557.method_5236(this.field_651);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var10000 = class_752.method_4253();
      this.method_873();
      String[] var4 = var10000;
      this.drawCenteredString(this.fontRendererObj, this.field_648, this.width / 2, this.height / 2 - 50, 11184810);
      int var5 = this.height / 2 - 30;
      class_176 var8 = this;
      if(var4 != null) {
         if(this.field_650 != null) {
            Iterator var6 = this.field_650.iterator();

            while(var6.hasNext()) {
               String var7 = (String)var6.next();
               this.drawCenteredString(this.fontRendererObj, var7, this.width / 2, var5, 16777215);
               var5 += this.fontRendererObj.FONT_HEIGHT;
               if(var4 == null) {
                  return;
               }

               if(var4 == null) {
                  break;
               }
            }
         }

         var8 = this;
      }

      var8.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_937() {
      boolean var10000 = true;
      char[] var10003 = "Ê$.Í@6È?2".toCharArray();
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
            field_652 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 25;
            break;
         case 1:
            var10009 = 229;
            break;
         case 2:
            var10009 = 243;
            break;
         case 3:
            var10009 = 87;
            break;
         case 4:
            var10009 = 223;
            break;
         case 5:
            var10009 = 155;
            break;
         default:
            var10009 = 207;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

import java.util.Iterator;
import java.util.List;

// $FF: renamed from: lf
public class class_183 extends bdw {

   // $FF: renamed from: b mu
   protected class_35 field_711;
   // $FF: renamed from: i java.lang.String
   protected String field_712;
   // $FF: renamed from: s java.lang.String
   private String field_713;
   // $FF: renamed from: t java.lang.String
   protected String field_714;
   // $FF: renamed from: u java.lang.String
   protected String field_715;
   // $FF: renamed from: v int
   protected int field_716;
   // $FF: renamed from: w int
   private int field_717;
   // $FF: renamed from: r java.lang.String[]
   private static final String[] field_718;


   // $FF: renamed from: <init> (mu, java.lang.String, java.lang.String, int) void
   public void method_969(class_35 var1, String var2, String var3, int var4) {
      super.method_651();
      this.field_711 = var1;
      this.field_712 = var2;
      this.field_713 = var3;
      this.field_716 = var4;
      String[] var5 = field_718;
      this.field_714 = class_1450.method_7896("gui.yes", new Object[0]);
      this.field_715 = class_1450.method_7896("gui.no", new Object[0]);
   }

   // $FF: renamed from: <init> (mu, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) void
   public void method_970(class_35 var1, String var2, String var3, String var4, String var5, int var6) {
      super.method_651();
      this.field_711 = var1;
      this.field_712 = var2;
      this.field_713 = var3;
      this.field_714 = var4;
      this.field_715 = var5;
      this.field_716 = var6;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      List var10000 = this.buttonList;
      class_141 var10001 = new class_141;
      var10001.method_747(0, this.width / 2 - 155, this.height / 6 + 96, this.field_714);
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new class_141;
      var10001.method_747(1, this.width / 2 - 155 + 160, this.height / 6 + 96, this.field_715);
      var10000.add(var10001);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10001 = var1.field_450;
      if(var2 != null) {
         var10001 = var1.field_450 == 0?1:0;
      }

      this.field_711.method_160((boolean)var10001, this.field_716);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.drawCenteredString(this.fontRendererObj, this.field_712, this.width / 2, 70, 16777215);
      this.drawCenteredString(this.fontRendererObj, this.field_713, this.width / 2, 90, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: a (int) void
   public void method_971(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_717 = var1;
      String[] var2 = var10000;
      Iterator var3 = this.buttonList.iterator();

      while(var3.hasNext()) {
         bcb var4 = (bcb)var3.next();
         var4.field_451 = false;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
      String[] var1 = class_752.method_4253();
      class_183 var10000 = this;
      if(var1 != null) {
         if(--this.field_717 != 0) {
            return;
         }

         var10000 = this;
      }

      Iterator var2 = var10000.buttonList.iterator();

      while(var2.hasNext()) {
         bcb var3 = (bcb)var2.next();
         var3.field_451 = true;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_972() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "&ÂÀ^L&ÂÀI";
      int var4 = "&ÂÀ^L&ÂÀI".length();
      char var1 = 7;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_718 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 70;
               break;
            case 1:
               var10009 = 227;
               break;
            case 2:
               var10009 = 27;
               break;
            case 3:
               var10009 = 94;
               break;
            case 4:
               var10009 = 151;
               break;
            case 5:
               var10009 = 70;
               break;
            default:
               var10009 = 143;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

import java.util.List;

// $FF: renamed from: lA
public class class_200 extends bdw {

   // $FF: renamed from: b bdw
   private final bdw field_894;
   // $FF: renamed from: i bbj
   private final bbj field_895;
   // $FF: renamed from: r java.lang.String
   protected String field_896;
   // $FF: renamed from: s java.lang.String
   private String field_897;
   // $FF: renamed from: t java.lang.String
   private static final String field_898;
   // $FF: renamed from: u java.lang.String[]
   private static final String[] field_899;


   // $FF: renamed from: <init> (bdw, bbj) void
   public void method_1088(bdw var1, bbj var2) {
      super.method_651();
      String[] var10001 = field_899;
      this.field_896 = "Options";
      this.field_894 = var1;
      this.field_895 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var10000 = class_752.method_4253();
      byte var2 = 0;
      String[] var8 = field_899;
      this.field_896 = class_1450.method_7896("options.sounds.title", new Object[0]);
      String[] var1 = var10000;
      this.field_897 = class_1450.method_7896("options.off", new Object[0]);
      List var9 = this.buttonList;
      class_149 var10001 = new class_149;
      var10001.method_771(this, class_930.field_4729.method_5453(), this.width / 2 - 155 + var2 % 2 * 160, this.height / 6 - 12 + 24 * (var2 >> 1), class_930.field_4729, true);
      var9.add(var10001);
      int var3 = var2 + 2;
      class_930[] var4 = class_930.values();
      int var5 = var4.length;
      int var6 = 0;

      while(true) {
         if(var6 < var5) {
            class_930 var7 = var4[var6];
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               if(var7 != class_930.field_4729) {
                  var9 = this.buttonList;
                  var10001 = new class_149;
                  var10001.method_771(this, var7.method_5453(), this.width / 2 - 155 + var3 % 2 * 160, this.height / 6 - 12 + 24 * (var3 >> 1), var7, false);
                  var9.add(var10001);
                  ++var3;
               }

               ++var6;
            }

            if(var1 != null) {
               continue;
            }
         }

         var9 = this.buttonList;
         bcb var10 = new bcb;
         int var10004 = this.width / 2 - 100;
         int var10005 = this.height / 6 + 168;
         String[] var10006 = field_899;
         var10.method_747(200, var10004, var10005, class_1450.method_7896("gui.done", new Object[0]));
         var9.add(var10);
         break;
      }

   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_451;
      if(var2 != null) {
         if(!var1.field_451) {
            return;
         }

         var10000 = var1.field_450;
      }

      if(var10000 == 200) {
         this.field_557.canLoseFocus7.method_5358();
         this.field_557.method_5236(this.field_894);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.drawCenteredString(this.fontRendererObj, this.field_896, this.width / 2, 15, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: b (aw) java.lang.String
   protected String method_1089(class_930 var1) {
      float var2 = this.field_895.method_5359(var1);
      return var2 == 0.0F?this.field_897:(int)(var2 * 100.0F) + "%";
   }

   // $FF: renamed from: b (lA) bbj
   static bbj method_1090(class_200 var0) {
      return var0.field_895;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1091() {
      // $FF: Couldn't be decompiled
   }
}

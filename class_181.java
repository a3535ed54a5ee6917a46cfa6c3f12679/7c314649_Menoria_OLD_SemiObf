import java.util.List;

// $FF: renamed from: li
public class class_181 extends bdw {

   // $FF: renamed from: b on
   private static class_811 field_692;
   // $FF: renamed from: i lj
   private final class_180 field_693;
   // $FF: renamed from: r hQ
   private class_1198 field_694;
   // $FF: renamed from: s java.lang.String
   private String field_695;
   // $FF: renamed from: t java.lang.String
   private String field_696;
   // $FF: renamed from: u java.lang.String
   private String field_697;
   // $FF: renamed from: v mi
   private class_970 field_698;
   // $FF: renamed from: w bcb
   private bcb field_699;
   // $FF: renamed from: x bcb
   private bcb field_700;
   // $FF: renamed from: y bcb
   private bcb field_701;
   // $FF: renamed from: z java.lang.String
   private static final String field_702;
   // $FF: renamed from: A java.lang.String[]
   private static final String[] field_703;


   // $FF: renamed from: <init> (lj, java.lang.String) void
   public void method_952(class_180 var1, String var2) {
      super.method_651();
      this.field_694 = class_1198.method_6445();
      this.field_693 = var1;
      this.method_954(var2);
   }

   // $FF: renamed from: f () java.lang.String
   public String method_953() {
      return this.field_694.toString();
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_954(String var1) {
      this.field_694 = class_1198.method_6444(var1);
   }

   // $FF: renamed from: b () void
   public void initGui() {
      this.buttonList.clear();
      String[] var1 = field_703;
      this.field_695 = class_1450.method_7896("createWorld.customize.flat.title", new Object[0]);
      this.field_696 = class_1450.method_7896("createWorld.customize.flat.tile", new Object[0]);
      this.field_697 = class_1450.method_7896("createWorld.customize.flat.height", new Object[0]);
      class_970 var10001 = new class_970;
      var10001.method_5596(this);
      this.field_698 = var10001;
      List var10000 = this.buttonList;
      bcb var10002 = new bcb;
      var10002.method_748(2, this.width / 2 - 154, this.height - 52, 100, 20, class_1450.method_7896("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)");
      var10000.add(this.field_699 = var10002);
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(3, this.width / 2 - 50, this.height - 52, 100, 20, class_1450.method_7896("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)");
      var10000.add(this.field_700 = var10002);
      var10000 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(4, this.width / 2 - 155, this.height - 52, 150, 20, class_1450.method_7896("createWorld.customize.flat.removeLayer", new Object[0]));
      var10000.add(this.field_701 = var10002);
      var10000 = this.buttonList;
      bcb var2 = new bcb;
      var2.method_748(0, this.width / 2 - 155, this.height - 28, 150, 20, class_1450.method_7896("gui.done", new Object[0]));
      var10000.add(var2);
      var10000 = this.buttonList;
      var2 = new bcb;
      var2.method_748(5, this.width / 2 + 5, this.height - 52, 150, 20, class_1450.method_7896("createWorld.customize.presets", new Object[0]));
      var10000.add(var2);
      var10000 = this.buttonList;
      var2 = new bcb;
      var2.method_748(1, this.width / 2 + 5, this.height - 28, 150, 20, class_1450.method_7896("gui.cancel", new Object[0]));
      var10000.add(var2);
      this.field_699.field_452 = this.field_700.field_452 = false;
      this.field_694.method_6441();
      this.method_955();
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      class_181 var7;
      label52: {
         label54: {
            String[] var10000 = class_752.method_4253();
            int var3 = this.field_694.method_6440().size() - this.field_698.field_4911 - 1;
            String[] var2 = var10000;
            int var4 = var1.field_450;
            if(var2 != null) {
               if(var1.field_450 == 1) {
                  this.field_557.method_5236(this.field_693);
                  if(var2 != null) {
                     break label54;
                  }
               }

               var4 = var1.field_450;
            }

            if(var2 != null) {
               if(var4 == 0) {
                  this.field_693.field_689 = this.method_953();
                  this.field_557.method_5236(this.field_693);
                  if(var2 != null) {
                     break label54;
                  }
               }

               var4 = var1.field_450;
            }

            label55: {
               byte var10001 = 5;
               if(var2 != null) {
                  if(var4 == 5) {
                     bao var6 = this.field_557;
                     class_170 var5 = new class_170;
                     var5.method_912(this);
                     var6.method_5236(var5);
                     if(var2 != null) {
                        break label54;
                     }
                  }

                  var4 = var1.field_450;
                  if(var2 == null) {
                     break label55;
                  }

                  var10001 = 4;
               }

               if(var4 != var10001) {
                  break label54;
               }

               var7 = this;
               if(var2 == null) {
                  break label52;
               }

               var4 = this.method_956();
            }

            if(var4 != 0) {
               this.field_694.method_6440().remove(var3);
               this.field_698.field_4911 = Math.min(this.field_698.field_4911, this.field_694.method_6440().size() - 1);
            }
         }

         this.field_694.method_6441();
         var7 = this;
      }

      var7.method_955();
   }

   // $FF: renamed from: g () void
   public void method_955() {
      boolean var1 = this.method_956();
      this.field_701.field_451 = var1;
      this.field_700.field_451 = var1;
      this.field_700.field_451 = false;
      this.field_699.field_451 = false;
   }

   // $FF: renamed from: i () boolean
   private boolean method_956() {
      int var10000;
      label21: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_698.field_4911;
         int var10001 = -1;
         if(var1 != null) {
            if(this.field_698.field_4911 <= -1) {
               break label21;
            }

            var10000 = this.field_698.field_4911;
            if(var1 == null) {
               return (boolean)var10000;
            }

            var10001 = this.field_694.method_6440().size();
         }

         if(var10000 < var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.field_698.method_5570(var1, var2, var3);
      this.drawCenteredString(this.fontRendererObj, this.field_695, this.width / 2, 8, 16777215);
      int var4 = this.width / 2 - 92 - 16;
      this.method_657(this.fontRendererObj, this.field_696, var4, 32, 16777215);
      this.method_657(this.fontRendererObj, this.field_697, var4 + 2 + 213 - this.fontRendererObj.getCharWidth(this.field_697), 32, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: j () on
   static class_811 method_957() {
      return field_692;
   }

   // $FF: renamed from: a (li) hQ
   static class_1198 method_958(class_181 var0) {
      return var0.field_694;
   }

   // $FF: renamed from: <clinit> () void
   static void method_959() {
      // $FF: Couldn't be decompiled
   }
}

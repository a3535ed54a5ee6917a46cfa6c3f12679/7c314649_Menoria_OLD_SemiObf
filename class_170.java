import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: lt
public class class_170 extends bdw {

   // $FF: renamed from: b on
   private static class_811 field_614;
   // $FF: renamed from: i java.util.List
   private static final List field_615;
   // $FF: renamed from: r li
   private final class_181 field_616;
   // $FF: renamed from: s java.lang.String
   private String field_617;
   // $FF: renamed from: t java.lang.String
   private String field_618;
   // $FF: renamed from: u java.lang.String
   private String field_619;
   // $FF: renamed from: v mk
   private class_968 field_620;
   // $FF: renamed from: w bcb
   private bcb field_621;
   // $FF: renamed from: x k_
   private GuiTextField field_622;
   // $FF: renamed from: y java.lang.String
   private static final String field_623;
   // $FF: renamed from: z java.lang.String[]
   private static final String[] field_624;


   // $FF: renamed from: <init> (li) void
   public void method_912(class_181 var1) {
      super.method_651();
      this.field_616 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      this.buttonList.clear();
      Keyboard.enableRepeatEvents(true);
      String[] var1 = field_624;
      this.field_617 = class_1450.method_7896("createWorld.customize.presets.title", new Object[0]);
      this.field_618 = class_1450.method_7896("createWorld.customize.presets.share", new Object[0]);
      this.field_619 = class_1450.method_7896("createWorld.customize.presets.list", new Object[0]);
      GuiTextField var10001 = new GuiTextField;
      var10001.GuiTextField(this.fontRendererObj, 50, 40, this.width - 100, 20);
      this.field_622 = var10001;
      class_968 var2 = new class_968;
      var2.method_5591(this);
      this.field_620 = var2;
      this.field_622.setMaxStringLength(1230);
      this.field_622.writeText(this.field_616.method_953());
      List var10000 = this.buttonList;
      bcb var10002 = new bcb;
      var10002.method_748(0, this.width / 2 - 155, this.height - 28, 150, 20, class_1450.method_7896("createWorld.customize.presets.select", new Object[0]));
      var10000.add(this.field_621 = var10002);
      var10000 = this.buttonList;
      bcb var3 = new bcb;
      var3.method_748(1, this.width / 2 + 5, this.height - 28, 150, 20, class_1450.method_7896("gui.cancel", new Object[0]));
      var10000.add(var3);
      this.method_913();
   }

   // $FF: renamed from: m () void
   public void method_872() {
      Keyboard.enableRepeatEvents(false);
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      this.field_622.method_727(var1, var2, var3);
      super.method_862(var1, var2, var3);
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_170 var10000 = this;
      if(var3 != null) {
         if(this.field_622.method_726(var1, var2)) {
            return;
         }

         var10000 = this;
      }

      var10000.method_856(var1, var2);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_450;
      if(var2 != null) {
         label21: {
            if(var1.field_450 == 0) {
               var10000 = this.method_914();
               if(var2 == null) {
                  break label21;
               }

               if(var10000 != 0) {
                  this.field_616.method_954(this.field_622.method_714());
                  this.field_557.method_5236(this.field_616);
                  if(var2 != null) {
                     return;
                  }
               }
            }

            var10000 = var1.field_450;
         }
      }

      if(var10000 == 1) {
         this.field_557.method_5236(this.field_616);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.field_620.method_5570(var1, var2, var3);
      this.drawCenteredString(this.fontRendererObj, this.field_617, this.width / 2, 8, 16777215);
      this.method_657(this.fontRendererObj, this.field_618, 50, 30, 10526880);
      this.method_657(this.fontRendererObj, this.field_619, 50, 70, 10526880);
      this.field_622.drawTextBox();
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: e () void
   public void method_871() {
      this.field_622.method_712();
      super.method_871();
   }

   // $FF: renamed from: f () void
   public void method_913() {
      boolean var1 = this.method_914();
      this.field_621.field_451 = var1;
   }

   // $FF: renamed from: g () boolean
   private boolean method_914() {
      int var10000;
      label26: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_620.field_4903;
         byte var10001 = -1;
         if(var1 != null) {
            if(this.field_620.field_4903 > -1) {
               var10000 = this.field_620.field_4903;
               if(var1 == null) {
                  return (boolean)var10000;
               }

               if(this.field_620.field_4903 < field_615.size()) {
                  break label26;
               }
            }

            var10000 = this.field_622.method_714().length();
            if(var1 == null) {
               return (boolean)var10000;
            }

            var10001 = 1;
         }

         if(var10000 <= var10001) {
            var10000 = 0;
            return (boolean)var10000;
         }
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (java.lang.String, adb, dz, hR[]) void
   private static void method_915(String var0, adb var1, class_985 var2, class_1205 ... var3) {
      method_916(var0, var1, var2, (List)null, var3);
   }

   // $FF: renamed from: b (java.lang.String, adb, dz, java.util.List, hR[]) void
   private static void method_916(String var0, adb var1, class_985 var2, List var3, class_1205 ... var4) {
      class_1198 var10000 = new class_1198;
      var10000.method_6436();
      class_1198 var5 = var10000;

      for(int var6 = var4.length - 1; var6 >= 0; --var6) {
         var5.method_6440().add(var4[var6]);
      }

      var5.method_6438(var2.field_5050);
      var5.method_6441();
      if(var3 != null) {
         Iterator var9 = var3.iterator();

         while(var9.hasNext()) {
            String var7 = (String)var9.next();
            var5.method_6439().put(var7, new HashMap());
         }
      }

      List var8 = field_615;
      class_1412 var10001 = new class_1412;
      var10001.method_7710(var1, var0, var5.toString());
      var8.add(var10001);
   }

   // $FF: renamed from: h () on
   static class_811 method_917() {
      return field_614;
   }

   // $FF: renamed from: i () java.util.List
   static List method_918() {
      return field_615;
   }

   // $FF: renamed from: a (lt) mk
   static class_968 method_919(class_170 var0) {
      return var0.field_620;
   }

   // $FF: renamed from: b (lt) k_
   static GuiTextField method_920(class_170 var0) {
      return var0.field_622;
   }

   // $FF: renamed from: <clinit> () void
   static void method_921() {
      // $FF: Couldn't be decompiled
   }
}

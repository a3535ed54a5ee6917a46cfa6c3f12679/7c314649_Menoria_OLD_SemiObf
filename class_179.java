import ca.diiza.f.class_209;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lk
public class class_179 extends bdw implements class_35 {

   // $FF: renamed from: b int
   private int field_661;
   // $FF: renamed from: i boolean
   private boolean field_662;
   // $FF: renamed from: r java.lang.String
   private static final String field_663;
   // $FF: renamed from: s java.lang.String[]
   private static final String[] field_664;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
      this.field_662 = false;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var1;
      class_179 var7;
      label42: {
         label45: {
            String[] var10000 = class_752.method_4253();
            this.buttonList.clear();
            var1 = var10000;
            boolean var5 = this.field_557.cursorCounter6.method_2195().method_6867();
            if(var1 != null) {
               bcb var10001;
               int var10004;
               String[] var4;
               int var10005;
               List var6;
               if(var5) {
                  var5 = this.field_557.method_5278();
                  if(var1 != null) {
                     if(var5) {
                        var6 = this.buttonList;
                        var10001 = new bcb;
                        var10004 = this.width / 2 - 100;
                        var10005 = this.height / 4 + 96;
                        var4 = field_664;
                        var10001.method_747(1, var10004, var10005, class_1450.method_7896("deathScreen.deleteWorld", new Object[0]));
                        var6.add(var10001);
                        if(var1 != null) {
                           break label45;
                        }
                     }

                     var6 = this.buttonList;
                     var10001 = new bcb;
                     var10004 = this.width / 2 - 100;
                     var10005 = this.height / 4 + 96;
                     var4 = field_664;
                     var10001.method_747(1, var10004, var10005, class_1450.method_7896("deathScreen.leaveServer", new Object[0]));
                     var6.add(var10001);
                  }

                  if(var1 != null) {
                     break label45;
                  }
               }

               var6 = this.buttonList;
               var10001 = new bcb;
               var10004 = this.width / 2 - 100;
               var10005 = this.height / 4 + 72;
               var4 = field_664;
               var10001.method_747(0, var10004, var10005, class_1450.method_7896("deathScreen.respawn", new Object[0]));
               var6.add(var10001);
               var6 = this.buttonList;
               var10001 = new bcb;
               var10001.method_747(1, this.width / 2 - 100, this.height / 4 + 96, class_1450.method_7896("deathScreen.titleScreen", new Object[0]));
               var6.add(var10001);
            }

            var7 = this;
            if(var1 == null) {
               break label42;
            }

            if(this.field_557.method_5285() == null) {
               ((bcb)this.buttonList.get(1)).field_451 = false;
            }
         }

         var7 = this;
      }

      Iterator var3 = var7.buttonList.iterator();

      while(var3.hasNext()) {
         bcb var2 = (bcb)var3.next();
         var2.field_451 = false;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {}

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      label19: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            switch(var1.field_450) {
            case 0:
               this.field_557.cursorCounter8.method_4598();
               this.field_557.method_5236((bdw)null);
               break;
            case 1:
               break label19;
            default:
               return;
            }
         }

         if(var2 != null) {
            return;
         }
      }

      class_183 var10000 = new class_183;
      String[] var4 = field_664;
      var10000.method_970(this, class_1450.method_7896("deathScreen.quit.confirm", new Object[0]), "", class_1450.method_7896("deathScreen.titleScreen", new Object[0]), class_1450.method_7896("deathScreen.respawn", new Object[0]), 0);
      class_183 var3 = var10000;
      this.field_557.method_5236(var3);
      var3.method_971(20);
   }

   // $FF: renamed from: a (boolean, int) void
   public void method_160(boolean var1, int var2) {
      String[] var3 = class_752.method_4253();
      if(var3 != null) {
         if(var1) {
            this.field_557.cursorCounter6.method_2180();
            this.field_557.method_5259((bjf)null);
            bao var10000 = this.field_557;
            class_209 var10001 = new class_209;
            var10001.method_651();
            var10000.method_5236(var10001);
            if(var3 != null) {
               return;
            }
         }

         this.field_557.cursorCounter8.method_4598();
      }

      this.field_557.method_5236((bdw)null);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.drawGradientRect(0, 0, this.width, this.height, 1615855616, -1602211792);
      String[] var10000 = class_752.method_4253();
      GL11.glPushMatrix();
      String[] var4 = var10000;
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      boolean var5 = this.field_557.cursorCounter6.method_2195().method_6867();
      String[] var7;
      String var8;
      if(var5) {
         var7 = field_664;
         var8 = class_1450.method_7896("deathScreen.title.hardcore", new Object[0]);
      } else {
         var7 = field_664;
         var8 = class_1450.method_7896("deathScreen.title", new Object[0]);
      }

      String var6 = var8;
      this.drawCenteredString(this.fontRendererObj, var6, this.width / 2 / 2, 30, 16777215);
      GL11.glPopMatrix();
      if(var4 != null) {
         if(var5) {
            var7 = field_664;
            this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("deathScreen.hardcoreInfo", new Object[0]), this.width / 2, 144, 16777215);
         }

         FontRenderer var10001 = this.fontRendererObj;
         StringBuilder var10002 = new StringBuilder();
         var7 = field_664;
         this.drawCenteredString(var10001, var10002.append(class_1450.method_7896("deathScreen.score", new Object[0])).append(": ").append(class_130.field_290).append(this.field_557.cursorCounter8.method_4566()).toString(), this.width / 2, 100, 16777215);
         super.drawScreen(var1, var2, var3);
      }

   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return false;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
      String[] var10000 = class_752.method_4253();
      ++this.field_661;
      String[] var1 = var10000;
      class_179 var4 = this;
      if(var1 != null) {
         if(this.field_661 != 20) {
            return;
         }

         var4 = this;
      }

      Iterator var3 = var4.buttonList.iterator();

      while(var3.hasNext()) {
         bcb var2 = (bcb)var3.next();
         var2.field_451 = true;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_942() {
      // $FF: Couldn't be decompiled
   }
}

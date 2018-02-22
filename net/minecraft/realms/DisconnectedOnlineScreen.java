package net.minecraft.realms;

import java.util.Iterator;
import java.util.List;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;

public class DisconnectedOnlineScreen extends RealmsScreen {

   private String title;
   private class_66 reason;
   private List lines;
   private final RealmsScreen parent;
   // $FF: renamed from: i java.lang.String
   private static final String field_2967 = "gui.back";


   // $FF: renamed from: <init> (net.minecraft.realms.RealmsScreen, java.lang.String, rV) void
   public void method_3796(RealmsScreen var1, String var2, class_66 var3) {
      super.method_3791();
      this.parent = var1;
      this.title = getLocalizedString(var2);
      this.reason = var3;
   }

   public void init() {
      this.buttonsClear();
      this.buttonsAdd(newButton(0, this.width() / 2 - 100, this.height() / 4 + 120 + 12, getLocalizedString("gui.back")));
      this.lines = this.fontSplit(this.reason.method_343(), this.width() - 50);
   }

   public void keyPressed(char var1, int var2) {
      if(var2 == 1) {
         Realms.setScreen(this.parent);
      }

   }

   public void buttonClicked(RealmsButton var1) {
      if(var1.getBlock74() == 0) {
         Realms.setScreen(this.parent);
      }

   }

   public void render(int var1, int var2, float var3) {
      boolean var10000 = RealmsScreen.method_3793();
      this.renderBackground();
      boolean var4 = var10000;
      this.drawCenteredString(this.title, this.width() / 2, this.height() / 2 - 50, 11184810);
      int var5 = this.height() / 2 - 30;
      DisconnectedOnlineScreen var8 = this;
      if(var4) {
         if(this.lines != null) {
            Iterator var6 = this.lines.iterator();

            while(var6.hasNext()) {
               String var7 = (String)var6.next();
               this.drawCenteredString(var7, this.width() / 2, var5, 16777215);
               var5 += this.fontLineHeight();
               if(!var4) {
                  return;
               }

               if(!var4) {
                  break;
               }
            }
         }

         var8 = this;
      }

      var8.render(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3795() {
      boolean var10000 = true;
      char[] var10003 = "9«];Z".toCharArray();
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
            field_2967 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 171;
            break;
         case 1:
            var10009 = 6;
            break;
         case 2:
            var10009 = 188;
            break;
         case 3:
            var10009 = 207;
            break;
         case 4:
            var10009 = 117;
            break;
         case 5:
            var10009 = 16;
            break;
         default:
            var10009 = 115;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

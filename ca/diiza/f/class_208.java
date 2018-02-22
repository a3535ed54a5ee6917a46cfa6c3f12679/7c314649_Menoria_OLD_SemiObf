package ca.diiza.f;

import ca.diiza.f.class_209;
import ca.diiza.utils.MP3Player;
import java.io.IOException;
import java.util.List;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: ca.diiza.f.u
public class class_208 extends bdw {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_991;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
      if(MP3Player.radioList.size() == 0) {
         MP3Player.init();
      }

   }

   // $FF: renamed from: b () void
   public void initGui() {
      List var10000 = this.buttonList;
      class_152 var10001 = new class_152;
      var10001.method_784(200, 5, this.width / 2 - 100 + 0, this.height / 2 - 20, class_101.MUSIC_SOUND);
      var10000.add(var10001);
      var10000 = this.buttonList;
      bcb var2 = new bcb;
      int var10004 = this.width / 2 - 100;
      int var10005 = this.height / 2 + 10;
      String[] var1 = field_991;
      var2.method_748(0, var10004, var10005, 90, 20, "NRJ - France");
      var10000.add(var2);
      var10000 = this.buttonList;
      var2 = new bcb;
      var2.method_748(1, this.width / 2 + 10, this.height / 2 + 10, 90, 20, "Skyrock FM");
      var10000.add(var2);
      var10000 = this.buttonList;
      var2 = new bcb;
      var2.method_748(2, this.width / 2 - 100, this.height / 2 + 40, 90, 20, "Funradio");
      var10000.add(var2);
      var10000 = this.buttonList;
      var2 = new bcb;
      var2.method_748(3, this.width / 2 + 10, this.height / 2 + 40, 90, 20, "Ad0Station");
      var10000.add(var2);
      var10000 = this.buttonList;
      var2 = new bcb;
      var2.method_748(4, this.width / 2 - 100, this.height / 2 + 70, 90, 20, "NRJ - Québec");
      var10000.add(var2);
      Keyboard.enableRepeatEvents(true);
   }

   // $FF: renamed from: m () void
   public void method_872() {
      Keyboard.enableRepeatEvents(false);
      bao.method_5273().canLoseFocus7.method_5358();
      super.method_872();
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      super.method_856(var1, var2);
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      int var2 = class_209.method_1160();
      int var10000 = var1.field_450;
      if(var2 == 0) {
         if(var1.field_450 < 0) {
            return;
         }

         var10000 = var1.field_450;
      }

      if(var2 == 0) {
         if(var10000 > 4) {
            return;
         }

         float var4;
         var10000 = (var4 = bao.method_5273().canLoseFocus7.musicSound - 0.0F) == 0.0F?0:(var4 < 0.0F?-1:1);
      }

      if(var10000 != 0) {
         MP3Player var3 = MP3Player.getPlayer();
         if(var2 == 0) {
            if(var3 == null) {
               (new MP3Player).method_3209((String)MP3Player.radioList.get(var1.field_450));
               if(var2 == 0) {
                  return;
               }
            }

            var3 = MP3Player.getPlayer();
         }

         var3.setStreamUrl((String)MP3Player.radioList.get(var1.field_450));
      }

   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return false;
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public String method_1151(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public String method_1152(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_1153(IOException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1154() {
      // $FF: Couldn't be decompiled
   }
}

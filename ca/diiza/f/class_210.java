package ca.diiza.f;

import ca.diiza.f.class_140;
import ca.diiza.f.class_209;
import java.util.List;

// $FF: renamed from: ca.diiza.f.s
public class class_210 extends bdw {

   // $FF: renamed from: b java.lang.String
   String field_999;
   // $FF: renamed from: i ca.diiza.f.m
   class_140 field_1000;
   // $FF: renamed from: r java.lang.String
   private String field_1001;
   // $FF: renamed from: s bcb
   private bcb field_1002;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_1003;


   // $FF: renamed from: <init> (bao, java.lang.String) void
   public void method_1162(bao var1, String var2) {
      super.method_651();
      String[] var10001 = field_1003;
      this.field_999 = "Connexion";
      this.field_557 = var1;
      this.field_1001 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      class_1564 var1 = class_1564.method_8588();
      String[] var2 = field_1003;
      this.field_999 = var1.method_8590("Connexion");
      class_140 var10001 = new class_140;
      var10001.GuiTextField(this.fontRendererObj, this.width / 2 - 100, this.height / 2 - 15, 200, 18);
      this.field_1000 = var10001;
      bcb var3 = new bcb;
      var3.method_748(16, this.width / 2 - 50, this.height / 2 + 15, 100, 20, var1.method_8590("Connexion"));
      this.field_1002 = var3;
      this.field_1002.field_451 = false;
      this.buttonList.add(this.field_1002);
      List var10000 = this.buttonList;
      var3 = new bcb;
      var3.method_748(15, this.width / 2 - 50, this.height / 2 + 50, 100, 20, var1.method_8590("Se déconnecter"));
      var10000.add(var3);
      this.field_1000.setFocused(true);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.field_1000.drawTextBox();
      this.fontRendererObj.method_7020(this.field_1001, this.width / 2 - 100, this.height / 2 - 35, 0);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: a (char, int) void
   public void method_856(char var1, int var2) {
      super.method_856(var1, var2);
      int var3 = class_209.method_1160();
      int var10000 = this.field_1000.isFocused();
      if(var3 == 0) {
         if(var10000 != 0) {
            this.field_1000.method_726(var1, var2);
         }

         var10000 = this.field_1000.method_714().isEmpty();
      }

      if(var3 == 0) {
         if(var10000 != 0) {
            this.field_1002.field_451 = false;
         }

         var10000 = this.field_1000.method_714().isEmpty();
      }

      if(var3 == 0) {
         if(var10000 == 0) {
            this.field_1002.field_451 = true;
         }

         var10000 = var2;
      }

      class_210 var4;
      label49: {
         if(var3 == 0) {
            if(var10000 != 28) {
               return;
            }

            var4 = this;
            if(var3 != 0) {
               break label49;
            }

            var10000 = this.field_1000.method_714().isEmpty();
         }

         if(var10000 != 0) {
            return;
         }

         bjk var5 = this.field_557.cursorCounter8;
         StringBuilder var10001 = new StringBuilder();
         String[] var10002 = field_1003;
         var5.method_4676(var10001.append("/login ").append(this.field_1000.method_714()).toString());
         var4 = this;
      }

      var4.field_557.method_5248();
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      int var2 = class_209.method_1159();
      int var10000 = var1.field_451;
      if(var2 != 0) {
         if(!var1.field_451) {
            return;
         }

         var10000 = var1.field_450;
      }

      switch(var10000) {
      case 15:
         this.field_557.cursorCounter6.method_2180();
         this.field_557.method_5259((bjf)null);
         bao var3 = this.field_557;
         class_209 var10001 = new class_209;
         var10001.method_651();
         var3.method_5236(var10001);
         if(var2 != 0) {
            break;
         }
      case 16:
         class_210 var4 = this;
         if(var2 != 0) {
            if(this.field_1000.method_714().isEmpty()) {
               return;
            }

            bjk var6 = this.field_557.cursorCounter8;
            StringBuilder var5 = new StringBuilder();
            String[] var10002 = field_1003;
            var6.method_4676(var5.append("/login ").append(this.field_1000.method_714()).toString());
            var4 = this;
         }

         var4.field_557.method_5248();
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_1163() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "AÕ_\tÆ¢-=Ü\nF¯b ×U\rÛ©\t-Ö^ Ê´d×";
      int var4 = "AÕ_\tÆ¢-=Ü\nF¯b ×U\rÛ©\t-Ö^ Ê´d×".length();
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
                  field_1003 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 236;
               break;
            case 1:
               var10009 = 59;
               break;
            case 2:
               var10009 = 178;
               break;
            case 3:
               var10009 = 236;
               break;
            case 4:
               var10009 = 45;
               break;
            case 5:
               var10009 = 78;
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

package ca.diiza.b;

import ca.diiza.b.class_634;
import java.awt.Component;
import java.io.IOException;
import java.net.ServerSocket;
import javax.swing.JOptionPane;

// $FF: renamed from: ca.diiza.b.b
public class class_631 {

   // $FF: renamed from: h java.lang.String
   private static final String field_2754 = "Une instance du launcher est déjà  lancée,\nle multi compte est interdit sur Ménoria !\nSi tu crois que ceci est une erreur, merci de contacter l\'îquipe.";


   // $FF: renamed from: <init> (int) void
   public void method_3490(int var1) {
      super();

      try {
         class_634 var10000 = new class_634;
         var10000.method_3504(new ServerSocket(var1));
         var10000.start();
      } catch (IOException var3) {
         JOptionPane.showMessageDialog((Component)null, "Une instance du launcher est déjà  lancée,\nle multi compte est interdit sur Ménoria !\nSi tu crois que ceci est une erreur, merci de contacter l\'îquipe.");
         System.exit(0);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_3491() {
      boolean var10000 = true;
      char[] var10003 = "¢¬klè¨½­§(`¦¿¼ì¥*pè¸¡©»k`õ¯é¨ !å&û¥­§(ìã÷Ã ¬khó·½¥é(jë«½©é.vòû ¢½.wâ²½ìº>w¦ ¢¦9lçûèÆ\"%ò®é¯»$lõû¸¹¬kfã¸ ì¬8q¦®§©é.wô¾¼¾åkhã©ª¥é/`¦¸¦¢½*fò¾»ì¥lë÷® ¼¬e".toCharArray();
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
            field_2754 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 127;
            break;
         case 1:
            var10009 = 122;
            break;
         case 2:
            var10009 = 127;
            break;
         case 3:
            var10009 = 253;
            break;
         case 4:
            var10009 = 179;
            break;
         case 5:
            var10009 = 48;
            break;
         default:
            var10009 = 109;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

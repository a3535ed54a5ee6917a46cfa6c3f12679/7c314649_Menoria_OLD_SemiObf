package ca.diiza.utils;

import ca.diiza.f.class_210;
import ca.diiza.f.class_230;
import ca.diiza.utils.MP3Player;

// $FF: renamed from: ca.diiza.utils.e
public class class_1858 {

   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9494;


   // $FF: renamed from: <init> () void
   public void method_10063() {
      super();
   }

   // $FF: renamed from: a (sg) boolean
   public static boolean method_10064(class_293 var0) {
      boolean var2;
      boolean var8;
      label93: {
         var2 = true;
         int[] var10000 = MP3Player.method_3212();
         class_66 var3 = var0.method_1686();
         int[] var1 = var10000;
         String var4 = var3.method_342();
         bao var5 = bao.method_5273();
         String var7 = var3.method_343();
         String[] var6 = field_9494;
         var8 = var7.equals("§r§cPour vous connecter, utilisez: /login motdepasse§r");
         class_210 var10001;
         if(var1 == null) {
            if(var8) {
               var2 = false;
               var8 = var5.enableBackgroundDrawing6 instanceof class_210;
               if(var1 != null) {
                  return var8;
               }

               if(var8) {
                  break label93;
               }

               var10001 = new class_210;
               var10001.method_1162(var5, "§2Mot de passe:");
               var5.method_5236(var10001);
               if(var1 == null) {
                  break label93;
               }
            }

            var7 = var3.method_343();
            var6 = field_9494;
            var8 = var7.startsWith("§r§cMauvais Mot");
         }

         if(var1 == null) {
            label79: {
               if(var8) {
                  var8 = var5.enableBackgroundDrawing6 instanceof class_210;
                  if(var1 != null) {
                     break label79;
                  }

                  if(!var8) {
                     var10001 = new class_210;
                     var6 = field_9494;
                     var10001.method_1162(var5, "§cMauvais mot de passe !");
                     var5.method_5236(var10001);
                     var2 = false;
                     if(var1 == null) {
                        break label93;
                     }
                  }
               }

               var7 = var3.method_343();
               var6 = field_9494;
               var8 = var7.equals("§r§cConnection effectuée!§r");
            }
         }

         if(var1 == null) {
            if(var8) {
               var6 = field_9494;
               var5.canLoseFocus4.showCenterMessage("§2Vous êtes connecté !");
               var2 = false;
               if(var1 == null) {
                  break label93;
               }
            }

            var7 = var3.method_343();
            var6 = field_9494;
            var8 = var7.equals("§r§cEnregistrement réussi avec succï¿½s!§r");
         }

         if(var1 == null) {
            if(var8) {
               var6 = field_9494;
               var5.canLoseFocus4.showCenterMessage("§cNe donnez jamais votre mot de passe à qui que ce soit.");
               var2 = false;
               if(var1 == null) {
                  break label93;
               }
            }

            var7 = var3.method_343();
            var6 = field_9494;
            var8 = var7.equals("§r§cPour vous inscrire, utilisez \"/register motdepasse confirmermotdepasse\"§r");
         }

         class_230 var9;
         if(var1 == null) {
            if(var8) {
               var2 = false;
               var8 = var5.enableBackgroundDrawing6 instanceof class_230;
               if(var1 != null) {
                  return var8;
               }

               if(var8) {
                  break label93;
               }

               var9 = new class_230;
               var6 = field_9494;
               var9.method_1250(var5, "§2Veuillez vous inscrire.");
               var5.method_5236(var9);
               if(var1 == null) {
                  break label93;
               }
            }

            var7 = var3.method_343();
            var6 = field_9494;
            var8 = var7.equals("§r§fLimite d\'enregistrement atteinte pour ce compte§r");
         }

         if(var1 == null) {
            if(var8) {
               var2 = false;
               var9 = new class_230;
               var6 = field_9494;
               var9.method_1250(var5, "§cLimite d\'enregistrement atteinte !");
               var5.method_5236(var9);
               if(var1 == null) {
                  break label93;
               }
            }

            var7 = var3.method_343();
            var6 = field_9494;
            var8 = var7.equals("§r§fVotre mot de passe n\'est pas assez long..§r");
         }

         if(var1 != null) {
            return var8;
         }

         if(var8) {
            var2 = false;
            var9 = new class_230;
            String[] var10004 = field_9494;
            var9.method_1250(var5, "§cMot de passe trop court/long !");
            var5.method_5236(var9);
         }
      }

      var8 = var2;
      return var8;
   }

   // $FF: renamed from: <clinit> () void
   static void method_10065() {
      // $FF: Couldn't be decompiled
   }
}

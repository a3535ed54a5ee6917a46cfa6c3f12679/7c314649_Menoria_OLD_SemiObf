package net.minecraft.realms;

import java.lang.reflect.Constructor;
import net.minecraft.realms.RealmsScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsBridge extends RealmsScreen {

   private static final Logger LOGGER;
   private bdw previousScreen;
   private static final String __OBFID;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_2968;


   // $FF: renamed from: <init> () void
   public void method_3791() {
      super.method_3791();
   }

   public void switchToRealms(bdw var1) {
      this.previousScreen = var1;

      try {
         String[] var5 = field_2968;
         Class var2 = Class.forName("com.mojang.realmsclient.RealmsMainScreen");
         Constructor var3 = var2.getDeclaredConstructor(new Class[]{RealmsScreen.class});
         var3.setAccessible(true);
         Object var4 = var3.newInstance(new Object[]{this});
         bao.method_5273().method_5236(((RealmsScreen)var4).getProxy());
      } catch (Exception var6) {
         String[] var10001 = field_2968;
         LOGGER.error("Realms module missing", var6);
      }

   }

   public void init() {
      bao.method_5273().method_5236(this.previousScreen);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3795() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÌòÔ:Õ>Æ÷Õ,Õ>ÀàÐ\'(0ÆþÝÔ&2ÇôÝË,?ÄàÕ =Ý½¡Ü(>ÚÞÐ\'¦0Ûö×åÌÃyÅb¥Ê";
      int var4 = "ÌòÔ:Õ>Æ÷Õ,Õ>ÀàÐ\'(0ÆþÝÔ&2ÇôÝË,?ÄàÕ =Ý½¡Ü(>ÚÞÐ\'¦0Ûö×åÌÃyÅb¥Ê".length();
      char var1 = 21;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2968 = var5;
                  String[] var10 = field_2968;
                  __OBFID = "CL_00001869";
                  LOGGER = LogManager.getLogger();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 87;
               break;
            case 1:
               var10009 = 173;
               break;
            case 2:
               var10009 = 151;
               break;
            case 3:
               var10009 = 247;
               break;
            case 4:
               var10009 = 189;
               break;
            case 5:
               var10009 = 77;
               break;
            default:
               var10009 = 241;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

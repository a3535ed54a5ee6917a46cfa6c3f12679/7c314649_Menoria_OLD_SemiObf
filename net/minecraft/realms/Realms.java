package net.minecraft.realms;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.net.Proxy;
import java.util.UUID;
import net.minecraft.realms.RealmsScreen;

public class Realms {

   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2588;


   // $FF: renamed from: <init> () void
   public void method_3223() {
      super();
   }

   public static boolean isTouchScreen() {
      return bao.method_5273().canLoseFocus7.field_4509;
   }

   public static Proxy getProxy() {
      return bao.method_5273().method_5287();
   }

   public static String sessionId() {
      boolean var10000 = RealmsScreen.method_3793();
      class_1331 var1 = bao.method_5273().method_5285();
      boolean var0 = var10000;
      class_1331 var2 = var1;
      if(var0) {
         if(var1 == null) {
            return null;
         }

         var2 = var1;
      }

      return var2.method_6993();
   }

   public static String userName() {
      boolean var10000 = RealmsScreen.method_3793();
      class_1331 var1 = bao.method_5273().method_5285();
      boolean var0 = var10000;
      class_1331 var2 = var1;
      if(var0) {
         if(var1 == null) {
            return null;
         }

         var2 = var1;
      }

      return var2.method_6995();
   }

   public static long currentTimeMillis() {
      return bao.method_5283();
   }

   public static String getSessionId() {
      return bao.method_5273().method_5285().method_6993();
   }

   public static String getName() {
      return bao.method_5273().method_5285().method_6995();
   }

   public static String uuidToName(String var0) {
      MinecraftSessionService var10000 = bao.method_5273().method_5302();
      GameProfile var10001 = new GameProfile;
      String[] var1 = field_2588;
      var10001.method_1305(UUID.fromString(var0.replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5")), (String)null);
      return var10000.fillProfileProperties(var10001, false).getName();
   }

   public static void setScreen(RealmsScreen var0) {
      bao.method_5273().method_5236(var0.getProxy());
   }

   public static String getGameDirectoryPath() {
      return bao.method_5273().canLoseFocus9.getAbsolutePath();
   }

   public static int survivalId() {
      return class_94.field_45.method_443();
   }

   public static int creativeId() {
      return class_94.field_46.method_443();
   }

   public static int adventureId() {
      return class_94.field_47.method_443();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3224() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "]J ×¹B]J Û¹B]J Û¹B]J Û¹B]J Þö\\Q\'úOÝéOF;ó_Âà^";
      int var4 = "]J ×¹B]J Û¹B]J Û¹B]J Û¹B]J Þö\\Q\'úOÝéOF;ó_Âà^".length();
      char var1 = 36;
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
                  field_2588 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 130;
               break;
            case 1:
               var10009 = 225;
               break;
            case 2:
               var10009 = 32;
               break;
            case 3:
               var10009 = 156;
               break;
            case 4:
               var10009 = 24;
               break;
            case 5:
               var10009 = 51;
               break;
            default:
               var10009 = 156;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

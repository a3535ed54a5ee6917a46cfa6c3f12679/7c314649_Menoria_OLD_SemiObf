package com.mojang.authlib.legacy;

import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.HttpAuthenticationService;
import com.mojang.authlib.legacy.LegacyMinecraftSessionService;
import com.mojang.authlib.legacy.LegacyUserAuthentication;
import java.net.Proxy;
import org.apache.commons.lang3.Validate;

public class LegacyAuthenticationService extends HttpAuthenticationService {

   // $FF: renamed from: a int
   private static int field_1374;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_1375;


   // $FF: renamed from: <init> (java.net.Proxy) void
   protected void method_1428(Proxy var1) {
      super.method_1428(var1);
   }

   public LegacyUserAuthentication createUserAuthentication(Agent var1) {
      try {
         Validate.notNull(var1);
         if(var1 != Agent.MINECRAFT) {
            IllegalArgumentException var3 = new IllegalArgumentException("Legacy authentication cannot handle anything but Minecraft");
            String[] var10002 = field_1375;
            throw var3;
         }
      } catch (IllegalArgumentException var2) {
         throw method_1438(var2);
      }

      LegacyUserAuthentication var10000 = new LegacyUserAuthentication;
      var10000.method_649(this);
      return var10000;
   }

   public LegacyMinecraftSessionService createMinecraftSessionService() {
      LegacyMinecraftSessionService var10000 = new LegacyMinecraftSessionService;
      var10000.method_3840(this);
      return var10000;
   }

   public GameProfileRepository createProfileRepository() {
      UnsupportedOperationException var10000 = new UnsupportedOperationException("Legacy authentication service has no profile repository");
      String[] var10002 = field_1375;
      throw var10000;
   }

   // $FF: renamed from: a (int) void
   public static void method_1435(int var0) {
      field_1374 = var0;
   }

   // $FF: renamed from: a () int
   public static int method_1436() {
      return field_1374;
   }

   // $FF: renamed from: b () int
   public static int method_1437() {
      int var0 = method_1436();

      try {
         return var0 == 0?110:0;
      } catch (IllegalArgumentException var1) {
         throw method_1438(var1);
      }
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_1438(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1429() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "|ÓG£QÃN´SYÕRµIÅT³DUGúI_T\t¼N\\ÓÖTªHCßI£:|ÓG£QÃN´SYÕRµIÕH\bµSÞH¶B×_²N^ÑÖD®}ßC¨FVÂ";
      int var4 = "|ÓG£QÃN´SYÕRµIÅT³DUGúI_T\t¼N\\ÓÖTªHCßI£:|ÓG£QÃN´SYÕRµIÕH\bµSÞH¶B×_²N^ÑÖD®}ßC¨FVÂ".length();
      char var1 = 55;
      int var0 = -1;
      method_1435(34);

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
                  field_1375 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 71;
               break;
            case 1:
               var10009 = 193;
               break;
            case 2:
               var10009 = 129;
               break;
            case 3:
               var10009 = 81;
               break;
            case 4:
               var10009 = 17;
               break;
            case 5:
               var10009 = 173;
               break;
            default:
               var10009 = 80;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

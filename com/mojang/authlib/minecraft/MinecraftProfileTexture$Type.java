package com.mojang.authlib.minecraft;


public enum MinecraftProfileTexture$Type {

   SKIN,
   CAPE;
   private static final MinecraftProfileTexture$Type[] $VALUES;
   // $FF: renamed from: a java.lang.String
   private static String field_2635;


   // $FF: renamed from: <init> (java.lang.String, int) void
   private void method_3332(String var1, int var2) {
      super(var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3333() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "ÌÄQÜÎH";
      int var5 = "ÌÄQÜÎH".length();
      char var2 = 4;
      method_3334((String)null);
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  MinecraftProfileTexture$Type var9 = new MinecraftProfileTexture$Type;
                  var9.method_3332(var6[0], 0);
                  SKIN = var9;
                  var9 = new MinecraftProfileTexture$Type;
                  var9.method_3332(var6[1], 1);
                  CAPE = var9;
                  $VALUES = new MinecraftProfileTexture$Type[]{SKIN, CAPE};
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 101;
               break;
            case 1:
               var10009 = 117;
               break;
            case 2:
               var10009 = 226;
               break;
            case 3:
               var10009 = 168;
               break;
            case 4:
               var10009 = 57;
               break;
            case 5:
               var10009 = 148;
               break;
            default:
               var10009 = 46;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   public static void method_3334(String var0) {
      field_2635 = var0;
   }

   // $FF: renamed from: a () java.lang.String
   public static String method_3335() {
      return field_2635;
   }
}

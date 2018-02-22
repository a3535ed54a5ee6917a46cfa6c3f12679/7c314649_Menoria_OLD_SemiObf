import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;

// $FF: renamed from: pD
class class_1446 implements Runnable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7685 = "CL_00001827";
   // $FF: renamed from: b com.mojang.authlib.GameProfile
   final GameProfile field_7686;
   // $FF: renamed from: c boolean
   final boolean field_7687;
   // $FF: renamed from: d pF
   final class_40 field_7688;
   // $FF: renamed from: e pB
   final class_1444 field_7689;


   // $FF: renamed from: <init> (pB, com.mojang.authlib.GameProfile, boolean, pF) void
   void method_7883(class_1444 var1, GameProfile var2, boolean var3, class_40 var4) {
      this.field_7689 = var1;
      this.field_7686 = var2;
      this.field_7687 = var3;
      this.field_7688 = var4;
      super();
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (com.mojang.authlib.minecraft.InsecureTextureException) com.mojang.authlib.minecraft.InsecureTextureException
   private static InsecureTextureException method_7884(InsecureTextureException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7885() {
      boolean var10000 = true;
      char[] var10003 = "n^«£ÚÉõ3¬".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7685 = (new String((char[])var4)).intern();
            String var2 = field_7685;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 233;
            break;
         case 1:
            var10009 = 9;
            break;
         case 2:
            var10009 = 197;
            break;
         case 3:
            var10009 = 95;
            break;
         case 4:
            var10009 = 87;
            break;
         case 5:
            var10009 = 46;
            break;
         default:
            var10009 = 61;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

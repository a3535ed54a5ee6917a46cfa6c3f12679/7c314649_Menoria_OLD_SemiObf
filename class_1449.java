import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.HashMap;

// $FF: renamed from: pE
class class_1449 implements Runnable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7700 = "CL_00001826";
   // $FF: renamed from: b java.util.HashMap
   final HashMap field_7701;
   // $FF: renamed from: c pD
   final class_1446 field_7702;


   // $FF: renamed from: <init> (pD, java.util.HashMap) void
   void method_7893(class_1446 var1, HashMap var2) {
      this.field_7702 = var1;
      this.field_7701 = var2;
      super();
   }

   public void run() {
      class_1449 var2;
      label25: {
         String[] var1 = class_752.method_4253();
         boolean var10000 = this.field_7701.containsKey(MinecraftProfileTexture$Type.SKIN);
         if(var1 != null) {
            if(var10000) {
               this.field_7702.field_7689.method_7876((MinecraftProfileTexture)this.field_7701.get(MinecraftProfileTexture$Type.SKIN), MinecraftProfileTexture$Type.SKIN, this.field_7702.field_7688);
            }

            var2 = this;
            if(var1 == null) {
               break label25;
            }

            var10000 = this.field_7701.containsKey(MinecraftProfileTexture$Type.CAPE);
         }

         if(!var10000) {
            return;
         }

         var2 = this;
      }

      var2.field_7702.field_7689.method_7876((MinecraftProfileTexture)this.field_7701.get(MinecraftProfileTexture$Type.CAPE), MinecraftProfileTexture$Type.CAPE, this.field_7702.field_7688);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7894() {
      boolean var10000 = true;
      char[] var10003 = "XÍäÊùf*¹".toCharArray();
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
            field_7700 = (new String((char[])var4)).intern();
            String var2 = field_7700;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 252;
            break;
         case 1:
            var10009 = 102;
            break;
         case 2:
            var10009 = 92;
            break;
         case 3:
            var10009 = 211;
            break;
         case 4:
            var10009 = 29;
            break;
         case 5:
            var10009 = 46;
            break;
         default:
            var10009 = 177;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

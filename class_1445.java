import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.awt.image.BufferedImage;

// $FF: renamed from: pC
class class_1445 implements class_36 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7679 = "CL_00001828";
   // $FF: renamed from: b n0
   final class_1377 field_7680;
   // $FF: renamed from: c pF
   final class_40 field_7681;
   // $FF: renamed from: d com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
   final MinecraftProfileTexture$Type field_7682;
   // $FF: renamed from: e bqx
   final bqx field_7683;
   // $FF: renamed from: f pB
   final class_1444 field_7684;


   // $FF: renamed from: <init> (pB, n0, pF, com.mojang.authlib.minecraft.MinecraftProfileTexture$Type, bqx) void
   void method_7881(class_1444 var1, class_1377 var2, class_40 var3, MinecraftProfileTexture$Type var4, bqx var5) {
      this.field_7684 = var1;
      this.field_7680 = var2;
      this.field_7681 = var3;
      this.field_7682 = var4;
      this.field_7683 = var5;
      super();
   }

   // $FF: renamed from: b (java.awt.image.BufferedImage) java.awt.image.BufferedImage
   public BufferedImage method_161(BufferedImage var1) {
      String[] var2 = class_752.method_4253();
      class_1377 var10000 = this.field_7680;
      if(var2 != null) {
         if(this.field_7680 == null) {
            return var1;
         }

         var10000 = this.field_7680;
      }

      var1 = var10000.method_161(var1);
      return var1;
   }

   // $FF: renamed from: b () void
   public void method_162() {
      String[] var1 = class_752.method_4253();
      class_1445 var10000 = this;
      if(var1 != null) {
         if(this.field_7680 != null) {
            this.field_7680.method_162();
         }

         var10000 = this;
      }

      class_40 var2 = var10000.field_7681;
      if(var1 != null) {
         if(var2 == null) {
            return;
         }

         var2 = this.field_7681;
      }

      var2.method_175(this.field_7682, this.field_7683);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7882() {
      boolean var10000 = true;
      char[] var10003 = "Çærñvµövî".toCharArray();
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
            field_7679 = (new String((char[])var4)).intern();
            String var2 = field_7679;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 18;
            break;
         case 1:
            var10009 = 88;
            break;
         case 2:
            var10009 = 210;
            break;
         case 3:
            var10009 = 64;
            break;
         case 4:
            var10009 = 212;
            break;
         case 5:
            var10009 = 87;
            break;
         default:
            var10009 = 208;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

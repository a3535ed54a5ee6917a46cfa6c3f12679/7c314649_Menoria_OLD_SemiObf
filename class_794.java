import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.io.File;

// $FF: renamed from: xf
public abstract class class_794 extends class_792 implements class_40 {

   // $FF: renamed from: a1 bqx
   public static final bqx field_3677;
   // $FF: renamed from: a2 bqx
   private bqx field_3678;
   // $FF: renamed from: a3 bqx
   private bqx field_3679;
   // $FF: renamed from: a4 java.lang.String
   private static final String field_3680;
   // $FF: renamed from: fb java.lang.String[]
   private static final String[] field_3681;


   // $FF: renamed from: <init> (ahb, com.mojang.authlib.GameProfile) void
   public void method_4554(ahb var1, GameProfile var2) {
      super.method_4554(var1, var2);
      String var3 = this.method_64();
      if(!var3.isEmpty()) {
         class_1444 var4 = bao.method_5273().method_5303();
         var4.method_7877(var2, this, true);
      }

   }

   // $FF: renamed from: o () boolean
   public boolean method_4660() {
      return this.field_3679 != null;
   }

   // $FF: renamed from: r () boolean
   public boolean method_4661() {
      return this.field_3678 != null;
   }

   // $FF: renamed from: s () bqx
   public bqx method_4662() {
      String[] var1 = class_752.method_4253();
      class_794 var10000 = this;
      bqx var2;
      if(var1 != null) {
         if(this.field_3678 == null) {
            var2 = field_3677;
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_3678;
      return var2;
   }

   // $FF: renamed from: t () bqx
   public bqx method_4663() {
      return this.field_3679;
   }

   // $FF: renamed from: b (bqx, java.lang.String) bpr
   public static bpr method_4664(bqx var0, String var1) {
      String[] var10000 = class_752.method_4253();
      bqf var3 = bao.method_5273().method_5288();
      String[] var2 = var10000;
      Object var4 = var3.method_8121(var0);
      Object var5 = var4;
      if(var2 != null) {
         if(var4 == null) {
            bpr var6 = new bpr;
            File var10002 = (File)null;
            String[] var10003 = field_3681;
            String var7 = String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", new Object[]{class_1723.method_9629(var1)});
            bqx var10004 = field_3677;
            class_1377 var10005 = new class_1377;
            var10005.method_7514();
            var6.method_7970(var10002, var7, var10004, var10005);
            var4 = var6;
            var3.method_8120(var0, (bqh)var4);
         }

         var5 = var4;
      }

      return (bpr)var5;
   }

   // $FF: renamed from: d (java.lang.String) bqx
   public static bqx method_4665(String var0) {
      bqx var10000 = new bqx;
      StringBuilder var10002 = new StringBuilder();
      String[] var10003 = field_3681;
      var10000.method_8227(var10002.append("skins/").append(class_1723.method_9629(var0)).toString());
      return var10000;
   }

   // $FF: renamed from: b (com.mojang.authlib.minecraft.MinecraftProfileTexture$Type, bqx) void
   public void method_175(MinecraftProfileTexture$Type var1, bqx var2) {
      label19: {
         String[] var3 = class_752.method_4253();
         if(var3 != null) {
            switch(GuiTextField4.field_7404[var1.ordinal()]) {
            case 1:
               this.field_3678 = var2;
               break;
            case 2:
               break label19;
            default:
               return;
            }
         }

         if(var3 != null) {
            return;
         }
      }

      this.field_3679 = var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4636() {
      // $FF: Couldn't be decompiled
   }
}

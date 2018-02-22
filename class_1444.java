import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// $FF: renamed from: pB
public class class_1444 {

   // $FF: renamed from: b bqx
   public static final bqx field_7671;
   // $FF: renamed from: c java.util.concurrent.ExecutorService
   private static final ExecutorService field_7672;
   // $FF: renamed from: d bqf
   private final bqf field_7673;
   // $FF: renamed from: e java.io.File
   private final File field_7674;
   // $FF: renamed from: f com.mojang.authlib.minecraft.MinecraftSessionService
   private final MinecraftSessionService field_7675;
   // $FF: renamed from: g com.google.common.cache.LoadingCache
   private final LoadingCache field_7676;
   // $FF: renamed from: h java.lang.String
   private static final String field_7677;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_7678;


   // $FF: renamed from: <init> (bqf, java.io.File, com.mojang.authlib.minecraft.MinecraftSessionService) void
   public void method_7874(bqf var1, File var2, MinecraftSessionService var3) {
      super();
      this.field_7673 = var1;
      this.field_7674 = var2;
      this.field_7675 = var3;
      CacheBuilder var10001 = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS);
      class_109 var10002 = new class_109;
      var10002.method_510(this);
      this.field_7676 = var10001.build(var10002);
   }

   // $FF: renamed from: b (com.mojang.authlib.minecraft.MinecraftProfileTexture, com.mojang.authlib.minecraft.MinecraftProfileTexture$Type) bqx
   public bqx method_7875(MinecraftProfileTexture var1, MinecraftProfileTexture$Type var2) {
      return this.method_7876(var1, var2, (class_40)null);
   }

   // $FF: renamed from: b (com.mojang.authlib.minecraft.MinecraftProfileTexture, com.mojang.authlib.minecraft.MinecraftProfileTexture$Type, pF) bqx
   public bqx method_7876(MinecraftProfileTexture var1, MinecraftProfileTexture$Type var2, class_40 var3) {
      String[] var10000 = class_752.method_4253();
      bqx var10001 = new bqx;
      StringBuilder var10003 = new StringBuilder();
      String[] var10004 = field_7678;
      var10001.method_8227(var10003.append("skins/").append(var1.getHash()).toString());
      bqx var5 = var10001;
      String[] var4 = var10000;
      bqh var6 = this.field_7673.method_8121(var5);
      if(var6 != null) {
         class_40 var11 = var3;
         if(var4 != null) {
            if(var3 == null) {
               return var5;
            }

            var11 = var3;
         }

         var11.method_175(var2, var5);
         if(var4 != null) {
            return var5;
         }
      }

      File var7 = new File(this.field_7674, var1.getHash().substring(0, 2));
      File var8 = new File(var7, var1.getHash());
      class_1377 var12;
      if(var2 == MinecraftProfileTexture$Type.SKIN) {
         var12 = new class_1377;
         var12.method_7514();
      } else {
         var12 = null;
      }

      class_1377 var9 = var12;
      bpr var13 = new bpr;
      String var14 = var1.getUrl();
      bqx var15 = field_7671;
      class_1445 var10005 = new class_1445;
      var10005.method_7881(this, var9, var3, var2, var5);
      var13.method_7970(var8, var14, var15, var10005);
      bpr var10 = var13;
      this.field_7673.method_8120(var5, var10);
      return var5;
   }

   // $FF: renamed from: b (com.mojang.authlib.GameProfile, pF, boolean) void
   public void method_7877(GameProfile var1, class_40 var2, boolean var3) {
      ExecutorService var10000 = field_7672;
      class_1446 var10001 = new class_1446;
      var10001.method_7883(this, var1, var3, var2);
      var10000.submit(var10001);
   }

   // $FF: renamed from: b (com.mojang.authlib.GameProfile) java.util.Map
   public Map method_7878(GameProfile var1) {
      return (Map)this.field_7676.getUnchecked(var1);
   }

   // $FF: renamed from: b (pB) com.mojang.authlib.minecraft.MinecraftSessionService
   static MinecraftSessionService method_7879(class_1444 var0) {
      return var0.field_7675;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7880() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "¡cæ@øM¦m÷ZþÒ¡\'ê@ÿÃ«\'üZîÒüxáIDÐ»Rã0¼";
      int var4 = "¡cæ@øM¦m÷ZþÒ¡\'ê@ÿÃ«\'üZîÒüxáIDÐ»Rã0¼".length();
      char var1 = 6;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         String[] var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var12 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_7678 = var5;
                  String[] var11 = field_7678;
                  field_7677 = "CL_00001830";
                  bqx var8 = new bqx;
                  var10 = field_7678;
                  var8.method_8227("textures/entity/steve.png");
                  field_7671 = var8;
                  field_7672 = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)var10[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 132;
               break;
            case 1:
               var10009 = 94;
               break;
            case 2:
               var10009 = 217;
               break;
            case 3:
               var10009 = 120;
               break;
            case 4:
               var10009 = 221;
               break;
            case 5:
               var10009 = 52;
               break;
            default:
               var10009 = 225;
            }

            var10[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }
}

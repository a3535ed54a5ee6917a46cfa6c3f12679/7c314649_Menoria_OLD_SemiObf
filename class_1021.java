import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: dW
public class class_1021 {

   // $FF: renamed from: b d0
   private final class_958 field_5391;
   // $FF: renamed from: c long
   private long field_5392;
   // $FF: renamed from: d vp
   private class_1711 field_5393;
   // $FF: renamed from: e java.util.List
   private List field_5394;
   // $FF: renamed from: f java.lang.String
   private static final String field_5395 = "CL_00000162";


   // $FF: renamed from: <init> (d0) void
   public void method_5797(class_958 var1) {
      super();
      class_1711 var10001 = new class_1711;
      var10001.method_9520();
      this.field_5393 = var10001;
      this.field_5394 = new ArrayList();
      this.field_5391 = var1;
   }

   // $FF: renamed from: b (int, int) dX
   public class_1027 method_5798(int var1, int var2) {
      var1 >>= 4;
      String[] var10000 = class_752.method_4253();
      var2 >>= 4;
      String[] var3 = var10000;
      long var4 = (long)var1 & 4294967295L | ((long)var2 & 4294967295L) << 32;
      class_1027 var6 = (class_1027)this.field_5393.method_9525(var4);
      class_1027 var7 = var6;
      if(var3 != null) {
         if(var6 == null) {
            var7 = new class_1027;
            var7.method_5821(this, var1, var2);
            var6 = var7;
            this.field_5393.method_9528(var4, var6);
            this.field_5394.add(var6);
         }

         var6.field_5410 = MinecraftServer.method_2397();
         var7 = var6;
      }

      return var7;
   }

   // $FF: renamed from: c (int, int) dz
   public class_985 method_5799(int var1, int var2) {
      return this.method_5798(var1, var2).method_5822(var1, var2);
   }

   // $FF: renamed from: b () void
   public void method_5800() {
      String[] var10000 = class_752.method_4253();
      long var2 = MinecraftServer.method_2397();
      long var4 = var2 - this.field_5392;
      String[] var1 = var10000;
      long var13;
      int var12 = (var13 = var4 - 7500L) == 0L?0:(var13 < 0L?-1:1);
      if(var1 != null) {
         label41: {
            if(var12 <= 0) {
               long var14;
               var12 = (var14 = var4 - 0L) == 0L?0:(var14 < 0L?-1:1);
               if(var1 == null) {
                  break label41;
               }

               if(var12 >= 0) {
                  return;
               }
            }

            this.field_5392 = var2;
            var12 = 0;
         }
      }

      int var6 = var12;

      while(var6 < this.field_5394.size()) {
         label30: {
            class_1027 var7 = (class_1027)this.field_5394.get(var6);
            long var8 = var2 - var7.field_5410;
            long var15;
            var12 = (var15 = var8 - 30000L) == 0L?0:(var15 < 0L?-1:1);
            if(var1 != null) {
               label28: {
                  if(var12 <= 0) {
                     long var16;
                     var12 = (var16 = var8 - 0L) == 0L?0:(var16 < 0L?-1:1);
                     if(var1 == null) {
                        break label28;
                     }

                     if(var12 >= 0) {
                        break label30;
                     }
                  }

                  this.field_5394.remove(var6--);
                  var12 = var7.field_5408;
               }
            }

            long var10 = (long)var12 & 4294967295L | ((long)var7.field_5409 & 4294967295L) << 32;
            this.field_5393.method_9531(var10);
         }

         ++var6;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e (int, int) dz[]
   public class_985[] method_5801(int var1, int var2) {
      return this.method_5798(var1, var2).field_5407;
   }

   // $FF: renamed from: b (dW) d0
   static class_958 method_5802(class_1021 var0) {
      return var0.field_5391;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5803() {
      boolean var10000 = true;
      char[] var10003 = "3y@b@b".toCharArray();
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
            field_5395 = (new String((char[])var4)).intern();
            String var2 = field_5395;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 113;
            break;
         case 1:
            var10009 = 52;
            break;
         case 2:
            var10009 = 85;
            break;
         case 3:
            var10009 = 169;
            break;
         case 4:
            var10009 = 38;
            break;
         case 5:
            var10009 = 113;
            break;
         default:
            var10009 = 83;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: uF
public class class_1623 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_8436;
   // $FF: renamed from: b java.io.File
   public static final File field_8437;
   // $FF: renamed from: c java.io.File
   public static final File field_8438;
   // $FF: renamed from: d java.io.File
   public static final File field_8439;
   // $FF: renamed from: e java.io.File
   public static final File field_8440;


   // $FF: renamed from: b (net.minecraft.server.MinecraftServer, java.util.Collection, com.mojang.authlib.ProfileLookupCallback) void
   private static void method_8859(MinecraftServer var0, Collection var1, ProfileLookupCallback var2) {
      String[] var3;
      String[] var4;
      label24: {
         Iterator var10000 = var1.iterator();
         class_1625 var10001 = new class_1625;
         var10001.method_8867();
         var4 = (String[])Iterators.toArray(Iterators.filter(var10000, var10001), String.class);
         var3 = class_752.method_4253();
         MinecraftServer var11 = var0;
         if(var3 != null) {
            if(!var0.method_2368()) {
               break label24;
            }

            var11 = var0;
         }

         var11.method_2402().findProfilesByNames(var4, Agent.MINECRAFT, var2);
         if(var3 != null) {
            return;
         }
      }

      String[] var5 = var4;
      int var6 = var4.length;
      int var7 = 0;

      while(var7 < var6) {
         String var8 = var5[var7];
         GameProfile var12 = new GameProfile;
         var12.method_1305((UUID)null, var8);
         UUID var9 = class_792.method_4635(var12);
         var12 = new GameProfile;
         var12.method_1305(var9, var8);
         GameProfile var10 = var12;
         var2.onProfileLookupSucceeded(var10);
         ++var7;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static String method_8860(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      if(var1 != null) {
         if(!class_1723.method_9630(var0)) {
            var10000 = var0;
            if(var1 == null) {
               return var10000;
            }

            if(var0.length() <= 16) {
               MinecraftServer var2;
               GameProfile var6;
               UUID var7;
               label70: {
                  var2 = MinecraftServer.method_2348();
                  GameProfile var3 = var2.method_2403().method_8837(var0);
                  var6 = var3;
                  if(var1 != null) {
                     if(var3 == null) {
                        break label70;
                     }

                     var6 = var3;
                  }

                  var7 = var6.getId();
                  if(var1 != null) {
                     if(var7 == null) {
                        break label70;
                     }

                     var7 = var3.getId();
                  }

                  return var7.toString();
               }

               label47: {
                  boolean var8 = var2.method_2353();
                  if(var1 != null) {
                     if(var8) {
                        break label47;
                     }

                     var8 = var2.method_2368();
                  }

                  if(var8) {
                     ArrayList var4 = Lists.newArrayList();
                     class_1626 var9 = new class_1626;
                     var9.method_8870(var2, var4);
                     class_1626 var5 = var9;
                     method_8859(var2, Lists.newArrayList(new String[]{var0}), var5);
                     Object var10 = var4;
                     if(var1 != null) {
                        if(var4.size() <= 0) {
                           return "";
                        }

                        var10 = var4.get(0);
                     }

                     var7 = ((GameProfile)var10).getId();
                     if(var1 != null) {
                        if(var7 == null) {
                           return "";
                        }

                        var7 = ((GameProfile)var4.get(0)).getId();
                     }

                     return var7.toString();
                  }
               }

               var6 = new GameProfile;
               var6.method_1305((UUID)null, var0);
               return class_792.method_4635(var6).toString();
            }
         }

         var10000 = var0;
      }

      return var10000;
   }

   // $FF: renamed from: b () org.apache.logging.log4j.Logger
   // $FF: synthetic method
   static Logger method_8861() {
      return field_8436;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8862() {
      // $FF: Couldn't be decompiled
   }
}

import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: uy
public class class_1695 implements class_60 {

   // $FF: renamed from: a java.util.concurrent.atomic.AtomicInteger
   private static final AtomicInteger field_8862;
   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_8863;
   // $FF: renamed from: c java.util.Random
   private static final Random field_8864;
   // $FF: renamed from: d byte[]
   private final byte[] field_8865;
   // $FF: renamed from: e net.minecraft.server.MinecraftServer
   private final MinecraftServer field_8866;
   // $FF: renamed from: f l
   public final class_120 field_8867;
   // $FF: renamed from: h ap
   private class_917 field_8868;
   // $FF: renamed from: i int
   private int field_8869;
   // $FF: renamed from: j com.mojang.authlib.GameProfile
   private GameProfile field_8870;
   // $FF: renamed from: k java.lang.String
   private String field_8871;
   // $FF: renamed from: l javax.crypto.SecretKey
   private SecretKey field_8872;
   // $FF: renamed from: m java.lang.String
   private static final String field_8873;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_8874;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, l) void
   public void method_9362(MinecraftServer var1, class_120 var2) {
      super();
      this.field_8865 = new byte[4];
      this.field_8868 = class_917.field_4619;
      this.field_8871 = "";
      this.field_8866 = var1;
      this.field_8867 = var2;
      field_8864.nextBytes(this.field_8865);
   }

   // $FF: renamed from: b () void
   public void method_239() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_9363(String var1) {
      try {
         Logger var10000 = field_8863;
         StringBuilder var7 = new StringBuilder();
         String[] var3 = field_8874;
         var10000.info(var7.append("Disconnecting ").append(this.method_9365()).append(": ").append(var1).toString());
         class_1082 var5 = new class_1082;
         var5.method_6134(var1);
         class_1082 var2 = var5;
         class_120 var6 = this.field_8867;
         class_252 var8 = new class_252;
         var8.method_1463(var2);
         var6.method_553(var8, new GenericFutureListener[0]);
         this.field_8867.method_558(var2);
      } catch (Exception var4) {
         String[] var10001 = field_8874;
         field_8863.error("Error whilst disconnecting player", var4);
      }

   }

   // $FF: renamed from: a () void
   public void method_9364() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (rV) void
   public void method_237(class_66 var1) {
      Logger var10000 = field_8863;
      StringBuilder var10001 = (new StringBuilder()).append(this.method_9365());
      String[] var10002 = field_8874;
      var10000.info(var10001.append(" lost connection: ").append(var1.method_342()).toString());
   }

   // $FF: renamed from: c () java.lang.String
   public String method_9365() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ag, ag) void
   public void method_238(class_906 param1, class_906 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tz) void
   public void method_244(class_251 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tA) void
   public void method_245(class_303 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (com.mojang.authlib.GameProfile) com.mojang.authlib.GameProfile
   protected GameProfile method_9366(GameProfile var1) {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_8874;
      UUID var2 = UUID.nameUUIDFromBytes(var10000.append("OfflinePlayer:").append(var1.getName()).toString().getBytes(Charsets.UTF_8));
      GameProfile var3 = new GameProfile;
      var3.method_1305(var2, var1.getName());
      return var3;
   }

   // $FF: renamed from: b (uy) com.mojang.authlib.GameProfile
   static GameProfile method_9367(class_1695 var0) {
      return var0.field_8870;
   }

   // $FF: renamed from: c (uy) java.lang.String
   static String method_9368(class_1695 var0) {
      return var0.field_8871;
   }

   // $FF: renamed from: d (uy) net.minecraft.server.MinecraftServer
   static MinecraftServer method_9369(class_1695 var0) {
      return var0.field_8866;
   }

   // $FF: renamed from: e (uy) javax.crypto.SecretKey
   static SecretKey method_9370(class_1695 var0) {
      return var0.field_8872;
   }

   // $FF: renamed from: b (uy, com.mojang.authlib.GameProfile) com.mojang.authlib.GameProfile
   static GameProfile method_9371(class_1695 var0, GameProfile var1) {
      return var0.field_8870 = var1;
   }

   // $FF: renamed from: d () org.apache.logging.log4j.Logger
   static Logger method_9372() {
      return field_8863;
   }

   // $FF: renamed from: b (uy, ap) ap
   static class_917 method_9373(class_1695 var0, class_917 var1) {
      return var0.field_8868 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9374() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalStateException) java.lang.IllegalStateException
   private static IllegalStateException method_9375(IllegalStateException var0) {
      return var0;
   }
}

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: gz
public class class_581 extends class_580 {

   // $FF: renamed from: m int
   private int field_2473;
   // $FF: renamed from: n int
   private int field_2474;
   // $FF: renamed from: o com.mojang.authlib.GameProfile
   private GameProfile field_2475;
   // $FF: renamed from: p java.lang.String
   private static final String field_2476;
   // $FF: renamed from: q java.lang.String[]
   private static final String[] field_2477;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      this.field_2475 = null;
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.getBlock93(var1);
      String[] var2 = var10000;
      String[] var4 = field_2477;
      var1.method_8665("SkullType", (byte)(this.field_2473 & 255));
      class_1583 var5 = var1;
      if(var2 != null) {
         var1.method_8665("Rot", (byte)(this.field_2474 & 255));
         if(this.field_2475 == null) {
            return;
         }

         var5 = new class_1583;
         var5.method_8628();
      }

      class_1583 var3 = var5;
      class_1570.method_8625(var3, this.field_2475);
      String[] var10001 = field_2477;
      var1.method_8664("Owner", var3);
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.getBlock92(var1);
      String[] var2 = var10000;
      String[] var3 = field_2477;
      this.field_2473 = var1.initGui9("SkullType");
      this.field_2474 = var1.initGui9("Rot");
      int var4 = this.field_2473;
      if(var2 != null) {
         if(this.field_2473 != 3) {
            return;
         }

         var4 = var1.initGui8("Owner", 10);
      }

      if(var2 != null) {
         if(var4 != 0) {
            var3 = field_2477;
            this.field_2475 = class_1570.method_8624(var1.method_8688("Owner"));
            if(var2 != null) {
               return;
            }
         }

         var3 = field_2477;
         var4 = var1.initGui8("ExtraType", 8);
      }

      if(var2 != null) {
         if(var4 == 0) {
            return;
         }

         var3 = field_2477;
         var4 = class_1723.method_9630(var1.method_8685("ExtraType"));
      }

      if(var4 == 0) {
         GameProfile var10001 = new GameProfile;
         UUID var10003 = (UUID)null;
         String[] var10005 = field_2477;
         var10001.method_1305(var10003, var1.method_8685("ExtraType"));
         this.field_2475 = var10001;
         this.method_3113();
      }

   }

   // $FF: renamed from: b () com.mojang.authlib.GameProfile
   public GameProfile method_3110() {
      return this.field_2475;
   }

   // $FF: renamed from: q () r1
   public class_250 method_3100() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var1 = var10000;
      this.getBlock93(var1);
      class_299 var2 = new class_299;
      var2.method_1710(this.field_2465, this.field_2466, this.field_2467, 4, var1);
      return var2;
   }

   // $FF: renamed from: b (int) void
   public void method_3111(int var1) {
      this.field_2473 = var1;
      this.field_2475 = null;
   }

   // $FF: renamed from: b (com.mojang.authlib.GameProfile) void
   public void method_3112(GameProfile var1) {
      this.field_2473 = 3;
      this.field_2475 = var1;
      this.method_3113();
   }

   // $FF: renamed from: e () void
   private void method_3113() {
      String[] var1 = class_752.method_4253();
      GameProfile var10000 = this.field_2475;
      if(var1 != null) {
         if(this.field_2475 == null) {
            return;
         }

         var10000 = this.field_2475;
      }

      PropertyMap var6;
      label55: {
         boolean var5 = class_1723.method_9630(var10000.getName());
         if(var1 != null) {
            if(var5) {
               return;
            }

            var10000 = this.field_2475;
            if(var1 == null) {
               break label55;
            }

            var5 = this.field_2475.isComplete();
         }

         if(var5) {
            var10000 = this.field_2475;
            if(var1 == null) {
               break label55;
            }

            var6 = this.field_2475.getProperties();
            String[] var4 = field_2477;
            if(var6.containsKey("textures")) {
               return;
            }
         }

         var10000 = MinecraftServer.method_2348().method_2403().method_8837(this.field_2475.getName());
      }

      GameProfile var2 = var10000;
      Object var7 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return;
         }

         var6 = var2.getProperties();
         String[] var10001 = field_2477;
         var7 = Iterables.getFirst(var6.get("textures"), (Object)null);
      }

      Property var3 = (Property)var7;
      if(var1 != null) {
         if(var3 == null) {
            var2 = MinecraftServer.method_2348().method_2401().fillProfileProperties(var2, true);
         }

         this.field_2475 = var2;
      }

      this.method_91();
   }

   // $FF: renamed from: f () int
   public int method_3114() {
      return this.field_2473;
   }

   // $FF: renamed from: i () int
   public int method_3115() {
      return this.field_2474;
   }

   // $FF: renamed from: c (int) void
   public void method_3116(int var1) {
      this.field_2474 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      // $FF: Couldn't be decompiled
   }
}

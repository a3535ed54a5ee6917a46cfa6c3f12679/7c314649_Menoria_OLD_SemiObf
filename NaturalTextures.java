import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class NaturalTextures {

   private static class_890[] propertiesByIndex;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2979;


   // $FF: renamed from: <init> () void
   public void method_3832() {
      super();
   }

   public static void update() {
      // $FF: Couldn't be decompiled
   }

   public static class_890 getNaturalProperties(class_73 var0) {
      String[] var1 = class_752.method_4253();
      class_73 var10000 = var0;
      if(var1 != null) {
         if(!(var0 instanceof bqd)) {
            return null;
         }

         var10000 = var0;
      }

      bqd var2 = (bqd)var10000;
      int var3 = var2.getIndexInMap();
      int var5 = var3;
      if(var1 != null) {
         if(var3 < 0) {
            return null;
         }

         var5 = var3;
      }

      if(var5 < propertiesByIndex.length) {
         class_890 var4 = propertiesByIndex[var3];
         return var4;
      } else {
         return null;
      }
   }

   private static class_890[] makeDefaultProperties() {
      String[] var2 = field_2979;
      Config.dbg("NaturalTextures: Checking default configuration.");
      ArrayList var0 = new ArrayList();
      setIconProperties(var0, "grass_top", "4F");
      setIconProperties(var0, "stone", "2F");
      setIconProperties(var0, "dirt", "4F");
      setIconProperties(var0, "grass_side", "F");
      setIconProperties(var0, "grass_side_overlay", "F");
      setIconProperties(var0, "stone_slab_top", "F");
      setIconProperties(var0, "bedrock", "2F");
      setIconProperties(var0, "sand", "4F");
      setIconProperties(var0, "gravel", "2");
      setIconProperties(var0, "log_oak", "2F");
      setIconProperties(var0, "log_oak_top", "4F");
      setIconProperties(var0, "gold_ore", "2F");
      setIconProperties(var0, "iron_ore", "2F");
      setIconProperties(var0, "coal_ore", "2F");
      setIconProperties(var0, "diamond_ore", "2F");
      setIconProperties(var0, "redstone_ore", "2F");
      setIconProperties(var0, "lapis_ore", "2F");
      setIconProperties(var0, "obsidian", "4F");
      setIconProperties(var0, "leaves_oak", "2F");
      setIconProperties(var0, "leaves_oak_opaque", "2F");
      setIconProperties(var0, "leaves_jungle", "2");
      setIconProperties(var0, "leaves_jungle_opaque", "2");
      setIconProperties(var0, "snow", "4F");
      setIconProperties(var0, "grass_side_snowed", "F");
      setIconProperties(var0, "cactus_side", "2F");
      setIconProperties(var0, "clay", "4F");
      setIconProperties(var0, "mycelium_side", "F");
      setIconProperties(var0, "mycelium_top", "4F");
      setIconProperties(var0, "farmland_wet", "2F");
      setIconProperties(var0, "farmland_dry", "2F");
      setIconProperties(var0, "netherrack", "4F");
      setIconProperties(var0, "soul_sand", "4F");
      setIconProperties(var0, "glowstone", "4");
      setIconProperties(var0, "log_spruce", "2F");
      setIconProperties(var0, "log_birch", "F");
      setIconProperties(var0, "leaves_spruce", "2F");
      setIconProperties(var0, "leaves_spruce_opaque", "2F");
      setIconProperties(var0, "log_jungle", "2F");
      setIconProperties(var0, "end_stone", "4");
      setIconProperties(var0, "sandstone_top", "4");
      setIconProperties(var0, "sandstone_bottom", "4F");
      setIconProperties(var0, "redstone_lamp_on", "4F");
      class_890[] var1 = (class_890[])((class_890[])((class_890[])var0.toArray(new class_890[var0.size()])));
      return var1;
   }

   private static void setIconProperties(List var0, String var1, String var2) {
      String[] var10000 = class_752.method_4253();
      bpz var4 = bpz.textureMapBlocks;
      bqd var5 = var4.getIconSafe(var1);
      String[] var3 = var10000;
      bqd var11 = var5;
      String[] var9;
      StringBuilder var12;
      if(var3 != null) {
         if(var5 == null) {
            var12 = new StringBuilder();
            var9 = field_2979;
            Config.warn(var12.append("*** NaturalProperties: Icon not found: ").append(var1).append(" ***").toString());
            if(var3 != null) {
               return;
            }
         }

         var11 = var5;
      }

      if(var3 != null) {
         if(!(var11 instanceof bqd)) {
            var12 = new StringBuilder();
            var9 = field_2979;
            Config.warn(var12.append("*** NaturalProperties: Icon is not IconStitched: ").append(var1).append(": ").append(var5.getClass().getName()).append(" ***").toString());
            if(var3 != null) {
               return;
            }
         }

         var11 = var5;
      }

      bqd var6 = var11;
      int var7 = var6.getIndexInMap();
      int var13 = var7;
      if(var3 != null) {
         if(var7 < 0) {
            var12 = new StringBuilder();
            var9 = field_2979;
            Config.warn(var12.append("*** NaturalProperties: Invalid index for icon: ").append(var1).append(": ").append(var7).append(" ***").toString());
            if(var3 != null) {
               return;
            }
         }

         bqx var14 = new bqx;
         StringBuilder var10002 = new StringBuilder();
         var9 = field_2979;
         var14.method_8227(var10002.append("textures/blocks/").append(var1).append(".png").toString());
         var13 = Config.isFromDefaultResourcePack(var14);
      }

      if(var3 != null) {
         if(var13 == 0) {
            return;
         }

         var13 = var7;
      }

      while(var13 >= var0.size()) {
         var0.add((Object)null);
         if(var3 == null) {
            return;
         }

         if(var3 == null) {
            break;
         }

         var13 = var7;
      }

      class_890 var10 = new class_890;
      var10.method_5177(var2);
      class_890 var8 = var10;
      var0.set(var7, var8);
      var12 = new StringBuilder();
      var9 = field_2979;
      Config.dbg(var12.append("NaturalTextures: ").append(var1).append(" = ").append(var2).toString());
   }

   // $FF: renamed from: <clinit> () void
   static void method_3833() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.FileNotFoundException) java.io.FileNotFoundException
   private static FileNotFoundException method_3834(FileNotFoundException var0) {
      return var0;
   }
}

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

// $FF: renamed from: uP
public class class_1631 extends class_1629 {

   // $FF: renamed from: c int
   private final int field_8476;
   // $FF: renamed from: d java.lang.String
   private static final String field_8477;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8478;


   // $FF: renamed from: <init> (com.mojang.authlib.GameProfile, int) void
   public void method_8944(GameProfile var1, int var2) {
      super.method_8934(var1);
      this.field_8476 = var2;
   }

   // $FF: renamed from: <init> (com.google.gson.JsonObject) void
   public void method_8945(JsonObject var1) {
      String[] var10000 = class_752.method_4253();
      super.method_8935(method_8947(var1), var1);
      String[] var2 = var10000;
      String[] var3 = field_8478;
      int var10001 = var1.has("level");
      if(var2 != null) {
         var10001 = var10001 != 0?var1.get("level").getAsInt():0;
      }

      this.field_8476 = var10001;
   }

   // $FF: renamed from: c () int
   public int method_8946() {
      return this.field_8476;
   }

   // $FF: renamed from: b (com.google.gson.JsonObject) void
   protected void method_8938(JsonObject var1) {
      String[] var2 = class_752.method_4253();
      if(this.method_8936() != null) {
         String[] var3;
         String var4;
         label16: {
            var3 = field_8478;
            UUID var10002 = ((GameProfile)this.method_8936()).getId();
            if(var2 != null) {
               if(var10002 == null) {
                  var4 = "";
                  break label16;
               }

               var10002 = ((GameProfile)this.method_8936()).getId();
            }

            var4 = var10002.toString();
         }

         var1.addProperty("uuid", var4);
         var3 = field_8478;
         var1.addProperty("name", ((GameProfile)this.method_8936()).getName());
         super.method_8938(var1);
         var1.addProperty("level", Integer.valueOf(this.field_8476));
      }

   }

   // $FF: renamed from: a (com.google.gson.JsonObject) com.mojang.authlib.GameProfile
   private static GameProfile method_8947(JsonObject param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_8948(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8949() {
      // $FF: Couldn't be decompiled
   }
}

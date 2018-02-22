import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

// $FF: renamed from: tU
public class class_1608 implements JsonDeserializer, JsonSerializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_8403;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8404;


   // $FF: renamed from: <init> () void
   public void method_8803() {
      super();
   }

   // $FF: renamed from: b (com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) tT
   public class_1607 method_8804(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      String[] var12 = field_8404;
      JsonObject var5 = class_1702.method_9448(var1, "players");
      String[] var4 = class_752.method_4253();
      class_1607 var10000 = new class_1607;
      var10000.method_8797(class_1702.method_9446(var5, "max"), class_1702.method_9446(var5, "online"));
      class_1607 var6 = var10000;
      JsonObject var13 = var5;
      String var10001 = "sample";
      if(var4 != null) {
         if(!class_1702.method_9433(var5, "sample")) {
            return var6;
         }

         var13 = var5;
         var10001 = "sample";
      }

      JsonArray var7 = class_1702.method_9452(var13, var10001);
      int var14 = var7.size();
      if(var4 != null) {
         if(var14 <= 0) {
            return var6;
         }

         var14 = var7.size();
      }

      GameProfile[] var8 = new GameProfile[var14];
      int var9 = 0;

      while(true) {
         if(var9 < var8.length) {
            JsonElement var16 = var7.get(var9);
            StringBuilder var15 = new StringBuilder();
            var12 = field_8404;
            JsonObject var10 = class_1702.method_9448(var16, var15.append("player[").append(var9).append("]").toString());
            String var11 = class_1702.method_9437(var10, "id");
            GameProfile var10002 = new GameProfile;
            var10002.method_1305(UUID.fromString(var11), class_1702.method_9437(var10, "name"));
            var8[var9] = var10002;
            ++var9;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var6.method_8801(var8);
         break;
      }

      return var6;
   }

   // $FF: renamed from: b (tT, java.lang.reflect.Type, com.google.gson.JsonSerializationContext) com.google.gson.JsonElement
   public JsonElement method_8805(class_1607 var1, Type var2, JsonSerializationContext var3) {
      String[] var10000 = class_752.method_4253();
      JsonObject var5 = new JsonObject();
      String[] var10 = field_8404;
      var5.addProperty("max", Integer.valueOf(var1.method_8798()));
      String[] var4 = var10000;
      JsonObject var11 = var5;
      if(var4 != null) {
         var5.addProperty("online", Integer.valueOf(var1.method_8799()));
         if(var1.method_8800() != null && var1.method_8800().length > 0) {
            JsonArray var6 = new JsonArray();
            int var7 = 0;

            String var10001;
            while(true) {
               if(var7 < var1.method_8800().length) {
                  JsonObject var8 = new JsonObject();
                  UUID var9 = var1.method_8800()[var7].getId();
                  var11 = var8;
                  var10 = field_8404;
                  var10001 = "id";
                  if(var4 == null) {
                     break;
                  }

                  String var13;
                  label27: {
                     UUID var10002 = var9;
                     if(var4 != null) {
                        if(var9 == null) {
                           var13 = "";
                           break label27;
                        }

                        var10002 = var9;
                     }

                     var13 = var10002.toString();
                  }

                  var8.addProperty("id", var13);
                  var10 = field_8404;
                  var8.addProperty("name", var1.method_8800()[var7].getName());
                  var6.add(var8);
                  ++var7;
                  if(var4 != null) {
                     continue;
                  }
               }

               var11 = var5;
               String[] var12 = field_8404;
               var10001 = "sample";
               break;
            }

            var11.add(var10001, var6);
         }

         var11 = var5;
      }

      return var11;
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.method_8805((class_1607)var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8806() {
      // $FF: Couldn't be decompiled
   }
}

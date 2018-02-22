import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// $FF: renamed from: tV
public class class_1610 implements JsonDeserializer, JsonSerializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_8406;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8407;


   // $FF: renamed from: <init> () void
   public void method_8809() {
      super();
   }

   // $FF: renamed from: b (com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) tS
   public class_1606 method_8810(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      String[] var7 = field_8407;
      JsonObject var5 = class_1702.method_9448(var1, "status");
      String[] var10000 = class_752.method_4253();
      class_1606 var10001 = new class_1606;
      var10001.method_8787();
      class_1606 var6 = var10001;
      String[] var4 = var10000;
      boolean var8 = var5.has("description");
      if(var4 != null) {
         if(var8) {
            var6.method_8789((class_66)var3.deserialize(var5.get("description"), class_66.class));
         }

         var7 = field_8407;
         var8 = var5.has("players");
      }

      if(var4 != null) {
         if(var8) {
            var7 = field_8407;
            var6.method_8791((class_1607)var3.deserialize(var5.get("players"), class_1607.class));
         }

         var7 = field_8407;
         var8 = var5.has("version");
      }

      if(var4 != null) {
         if(var8) {
            var7 = field_8407;
            var6.method_8793((class_1612)var3.deserialize(var5.get("version"), class_1612.class));
         }

         var7 = field_8407;
         var8 = var5.has("favicon");
      }

      if(var8) {
         String[] var10002 = field_8407;
         var6.method_8794(class_1702.method_9437(var5, "favicon"));
      }

      return var6;
   }

   // $FF: renamed from: b (tS, java.lang.reflect.Type, com.google.gson.JsonSerializationContext) com.google.gson.JsonElement
   public JsonElement method_8811(class_1606 var1, Type var2, JsonSerializationContext var3) {
      String[] var10000 = class_752.method_4253();
      JsonObject var5 = new JsonObject();
      String[] var4 = var10000;
      class_1606 var7 = var1;
      String[] var6;
      if(var4 != null) {
         if(var1.method_8788() != null) {
            var6 = field_8407;
            var5.add("description", var3.serialize(var1.method_8788()));
         }

         var7 = var1;
      }

      if(var4 != null) {
         if(var7.method_8790() != null) {
            var6 = field_8407;
            var5.add("players", var3.serialize(var1.method_8790()));
         }

         var7 = var1;
      }

      if(var4 != null) {
         if(var7.method_8792() != null) {
            var6 = field_8407;
            var5.add("version", var3.serialize(var1.method_8792()));
         }

         var7 = var1;
      }

      if(var7.method_8795() != null) {
         String[] var10001 = field_8407;
         var5.addProperty("favicon", var1.method_8795());
      }

      return var5;
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.method_8811((class_1606)var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8812() {
      // $FF: Couldn't be decompiled
   }
}

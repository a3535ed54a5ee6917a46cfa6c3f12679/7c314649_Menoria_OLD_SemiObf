import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// $FF: renamed from: rW
public class class_1556 implements JsonDeserializer, JsonSerializer {

   // $FF: renamed from: b com.google.gson.Gson
   private static final Gson field_8162;
   // $FF: renamed from: c java.lang.String
   private static final String field_8163;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8164;


   // $FF: renamed from: <init> () void
   public void method_8478() {
      super();
   }

   // $FF: renamed from: b (com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) rV
   public class_66 method_8479(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (rY, com.google.gson.JsonObject, com.google.gson.JsonSerializationContext) void
   private void method_8480(class_1560 param1, JsonObject param2, JsonSerializationContext param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (rV, java.lang.reflect.Type, com.google.gson.JsonSerializationContext) com.google.gson.JsonElement
   public JsonElement method_8481(class_66 param1, Type param2, JsonSerializationContext param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (rV) java.lang.String
   public static String method_8482(class_66 var0) {
      return field_8162.toJson(var0);
   }

   // $FF: renamed from: b (java.lang.String) rV
   public static class_66 method_8483(String var0) {
      return (class_66)field_8162.fromJson(var0, class_66.class);
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.method_8481((class_66)var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8484() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (com.google.gson.JsonParseException) com.google.gson.JsonParseException
   private static JsonParseException method_8485(JsonParseException var0) {
      return var0;
   }
}

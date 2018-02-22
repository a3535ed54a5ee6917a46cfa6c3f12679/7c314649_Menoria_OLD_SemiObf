import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// $FF: renamed from: pO
public class class_1456 extends class_1454 implements JsonSerializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_7723;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7724;


   // $FF: renamed from: <init> () void
   public void method_7921() {
      super.method_7921();
   }

   // $FF: renamed from: b (com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) pZ
   public class_1488 method_7925(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      String[] var7 = field_7724;
      class_66 var5 = (class_66)var3.deserialize(var4.get("description"), class_66.class);
      int var6 = class_1702.method_9446(var4, "pack_format");
      class_1488 var10000 = new class_1488;
      var10000.method_8030(var5, var6);
      return var10000;
   }

   // $FF: renamed from: b (pZ, java.lang.reflect.Type, com.google.gson.JsonSerializationContext) com.google.gson.JsonElement
   public JsonElement method_7926(class_1488 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      String[] var5 = field_7724;
      var4.addProperty("pack_format", Integer.valueOf(var1.method_8032()));
      var4.add("description", var3.serialize(var1.method_8031()));
      return var4;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_178() {
      String[] var10000 = field_7724;
      return "pack";
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.method_7926((class_1488)var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7927() {
      // $FF: Couldn't be decompiled
   }
}

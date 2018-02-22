import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// $FF: renamed from: tX
public class class_1614 implements JsonDeserializer, JsonSerializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_8415;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8416;


   // $FF: renamed from: <init> () void
   public void method_8821() {
      super();
   }

   // $FF: renamed from: b (com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) tW
   public class_1612 method_8822(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      String[] var5 = field_8416;
      JsonObject var4 = class_1702.method_9448(var1, "version");
      class_1612 var10000 = new class_1612;
      var10000.method_8815(class_1702.method_9437(var4, "name"), class_1702.method_9446(var4, "protocol"));
      return var10000;
   }

   // $FF: renamed from: b (tW, java.lang.reflect.Type, com.google.gson.JsonSerializationContext) com.google.gson.JsonElement
   public JsonElement method_8823(class_1612 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      String[] var5 = field_8416;
      var4.addProperty("name", var1.method_8816());
      var4.addProperty("protocol", Integer.valueOf(var1.method_8817()));
      return var4;
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.method_8823((class_1612)var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8824() {
      // $FF: Couldn't be decompiled
   }
}

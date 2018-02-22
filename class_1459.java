import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// $FF: renamed from: pL
public class class_1459 extends class_1454 implements JsonSerializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_7729;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7730;


   // $FF: renamed from: <init> () void
   public void method_7921() {
      super.method_7921();
   }

   // $FF: renamed from: b (com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) bsa
   public bsa method_7934(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, com.google.gson.JsonElement) pV
   private class_1483 method_7935(int param1, JsonElement param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bsa, java.lang.reflect.Type, com.google.gson.JsonSerializationContext) com.google.gson.JsonElement
   public JsonElement method_7936(bsa param1, Type param2, JsonSerializationContext param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () java.lang.String
   public String method_178() {
      String[] var10000 = field_7730;
      return "animation";
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.method_7936((bsa)var1, var2, var3);
   }

   // $FF: renamed from: b (java.lang.ClassCastException) java.lang.ClassCastException
   private static ClassCastException method_7937(ClassCastException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7938() {
      // $FF: Couldn't be decompiled
   }
}

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// $FF: renamed from: uX
class class_1647 implements JsonDeserializer, JsonSerializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_8553 = "CL_00001874";
   // $FF: renamed from: b uR
   final class_1640 field_8554;


   // $FF: renamed from: <init> (uR) void
   private void method_9032(class_1640 var1) {
      this.field_8554 = var1;
      super();
   }

   // $FF: renamed from: b (uL, java.lang.reflect.Type, com.google.gson.JsonSerializationContext) com.google.gson.JsonElement
   public JsonElement method_9033(class_1629 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var1.method_8938(var4);
      return var4;
   }

   // $FF: renamed from: b (com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) uL
   public class_1629 method_9034(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      String[] var4 = class_752.method_4253();
      JsonElement var10000 = var1;
      if(var4 != null) {
         if(!var1.isJsonObject()) {
            return null;
         }

         var10000 = var1;
      }

      JsonObject var5 = var10000.getAsJsonObject();
      class_1629 var6 = this.field_8554.method_8997(var5);
      return var6;
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.method_9033((class_1629)var1, var2, var3);
   }

   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.method_9034(var1, var2, var3);
   }

   // $FF: renamed from: <init> (uR, java.lang.Object) void
   void method_9035(class_1640 var1, Object var2) {
      this.method_9032(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9036() {
      boolean var10000 = true;
      char[] var10003 = "+Î·çÖaYñ¦³".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8553 = (new String((char[])var4)).intern();
            String var2 = field_8553;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 45;
            break;
         case 1:
            var10009 = 140;
            break;
         case 2:
            var10009 = 212;
            break;
         case 3:
            var10009 = 194;
            break;
         case 4:
            var10009 = 146;
            break;
         case 5:
            var10009 = 163;
            break;
         default:
            var10009 = 20;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

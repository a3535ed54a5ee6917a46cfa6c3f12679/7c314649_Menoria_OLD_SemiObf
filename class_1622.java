import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.UUID;

// $FF: renamed from: uE
class class_1622 implements JsonDeserializer, JsonSerializer {

   // $FF: renamed from: b uA
   // $FF: synthetic field
   final class_1618 field_8434;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8435;


   // $FF: renamed from: <init> (uA) void
   private void method_8853(class_1618 var1) {
      this.field_8434 = var1;
      super();
   }

   // $FF: renamed from: b (uD, java.lang.reflect.Type, com.google.gson.JsonSerializationContext) com.google.gson.JsonElement
   public JsonElement method_8854(class_1621 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var5;
      String var8;
      label14: {
         String[] var10000 = class_752.method_4253();
         var5 = new JsonObject();
         String[] var7 = field_8435;
         var5.addProperty("name", var1.method_8849().getName());
         String[] var4 = var10000;
         UUID var6 = var1.method_8849().getId();
         UUID var10002 = var6;
         if(var4 != null) {
            if(var6 == null) {
               var8 = "";
               break label14;
            }

            var10002 = var6;
         }

         var8 = var10002.toString();
      }

      var5.addProperty("uuid", var8);
      String[] var10001 = field_8435;
      var5.addProperty("expiresOn", class_1618.field_8422.format(var1.method_8850()));
      return var5;
   }

   // $FF: renamed from: b (com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) uD
   public class_1621 method_8855(JsonElement param1, Type param2, JsonDeserializationContext param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.method_8854((class_1621)var1, var2, var3);
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.method_8855(var1, var2, var3);
   }

   // $FF: renamed from: <init> (uA, uB) void
   // $FF: synthetic method
   void method_8856(class_1618 var1, class_1619 var2) {
      this.method_8853(var1);
   }

   // $FF: renamed from: b (java.text.ParseException) java.text.ParseException
   private static ParseException method_8857(ParseException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8858() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "1%*$\t!\b(vþ";
      int var4 = "1%*$\t!\b(vþ".length();
      char var1 = 4;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_8435 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 38;
               break;
            case 1:
               var10009 = 141;
               break;
            case 2:
               var10009 = 26;
               break;
            case 3:
               var10009 = 35;
               break;
            case 4:
               var10009 = 151;
               break;
            case 5:
               var10009 = 113;
               break;
            default:
               var10009 = 239;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

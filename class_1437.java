import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

// $FF: renamed from: p8
public class class_1437 implements JsonDeserializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_7633;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7634;


   // $FF: renamed from: <init> () void
   public void method_7827() {
      super();
   }

   // $FF: renamed from: b (com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) p6
   public class_1433 method_7828(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      String[] var15 = field_7634;
      JsonObject var5 = class_1702.method_9448(var1, "entry");
      String[] var10000 = class_752.method_4253();
      class_1433 var10001 = new class_1433;
      var10001.method_7796();
      class_1433 var6 = var10001;
      String[] var4 = var10000;
      var6.method_7799(class_1702.method_9441(var5, "replace", false));
      class_930 var7 = class_930.method_5454(class_1702.method_9438(var5, "category", class_930.field_4729.method_5452()));
      class_1433 var17 = var6;
      if(var4 != null) {
         var6.method_7801(var7);
         Validate.notNull(var7, "Invalid category", new Object[0]);
         if(var5.has("sounds")) {
            JsonArray var8 = class_1702.method_9452(var5, "sounds");
            int var9 = 0;

            while(var9 < var8.size()) {
               label92: {
                  class_1435 var11;
                  label113: {
                     JsonElement var10 = var8.get(var9);
                     class_1435 var18 = new class_1435;
                     var18.method_7805();
                     var11 = var18;
                     JsonElement var19 = var10;
                     if(var4 != null) {
                        if(class_1702.method_9432(var10)) {
                           var15 = field_7634;
                           var11.method_7807(class_1702.method_9436(var10, "sound"));
                           if(var4 != null) {
                              break label113;
                           }
                        }

                        var19 = var10;
                     }

                     var15 = field_7634;
                     JsonObject var12 = class_1702.method_9448(var19, "sound");
                     var11.method_7807(class_1702.method_9437(var12, "name"));
                     boolean var20 = var12.has("type");
                     if(var4 != null) {
                        if(var20) {
                           class_107 var13 = class_107.method_505(class_1702.method_9437(var12, "type"));
                           Validate.notNull(var13, "Invalid type", new Object[0]);
                           var11.method_7815(var13);
                        }

                        var15 = field_7634;
                        var20 = var12.has("volume");
                     }

                     float var16;
                     int var21;
                     if(var4 != null) {
                        if(var20) {
                           var15 = field_7634;
                           var16 = class_1702.method_9443(var12, "volume");
                           float var22;
                           var21 = (var22 = var16 - 0.0F) == 0.0F?0:(var22 < 0.0F?-1:1);
                           if(var4 != null) {
                              var21 = var21 > 0?1:0;
                           }

                           var15 = field_7634;
                           Validate.isTrue((boolean)var21, "Invalid volume", new Object[0]);
                           var11.method_7809(var16);
                        }

                        var15 = field_7634;
                        var20 = var12.has("pitch");
                     }

                     if(var4 != null) {
                        if(var20) {
                           var15 = field_7634;
                           var16 = class_1702.method_9443(var12, "pitch");
                           float var23;
                           var21 = (var23 = var16 - 0.0F) == 0.0F?0:(var23 < 0.0F?-1:1);
                           if(var4 != null) {
                              var21 = var21 > 0?1:0;
                           }

                           var15 = field_7634;
                           Validate.isTrue((boolean)var21, "Invalid pitch", new Object[0]);
                           var11.method_7811(var16);
                        }

                        var15 = field_7634;
                        var20 = var12.has("weight");
                     }

                     if(var4 != null) {
                        if(var20) {
                           var15 = field_7634;
                           int var14 = class_1702.method_9446(var12, "weight");
                           var21 = var14;
                           if(var4 != null) {
                              var21 = var14 > 0?1:0;
                           }

                           var15 = field_7634;
                           Validate.isTrue((boolean)var21, "Invalid weight", new Object[0]);
                           var11.method_7813(var14);
                        }

                        var15 = field_7634;
                        var20 = var12.has("stream");
                     }

                     if(var4 == null) {
                        break label92;
                     }

                     if(var20) {
                        String[] var10002 = field_7634;
                        var11.method_7817(class_1702.method_9440(var12, "stream"));
                     }
                  }

                  var6.method_7797().add(var11);
               }

               ++var9;
               if(var4 == null) {
                  break;
               }
            }
         }

         var17 = var6;
      }

      return var17;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7829() {
      // $FF: Couldn't be decompiled
   }
}

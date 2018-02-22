import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// $FF: renamed from: r0
public class class_1507 implements JsonDeserializer, JsonSerializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_7942;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7943;


   // $FF: renamed from: <init> () void
   public void method_8183() {
      super();
   }

   // $FF: renamed from: b (com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext) rY
   public class_1560 method_8184(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      String[] var4 = class_752.method_4253();
      if(var1.isJsonObject()) {
         class_1560 var10000 = new class_1560;
         var10000.method_8514();
         class_1560 var5 = var10000;
         JsonObject var6 = var1.getAsJsonObject();
         JsonObject var19 = var6;
         if(var4 != null) {
            if(var6 == null) {
               return null;
            }

            var19 = var6;
         }

         String[] var12 = field_7943;
         boolean var20 = var19.has("bold");
         if(var4 != null) {
            if(var20) {
               class_1560.method_8537(var5, Boolean.valueOf(var6.get("bold").getAsBoolean()));
            }

            var12 = field_7943;
            var20 = var6.has("italic");
         }

         if(var4 != null) {
            if(var20) {
               var12 = field_7943;
               class_1560.method_8538(var5, Boolean.valueOf(var6.get("italic").getAsBoolean()));
            }

            var12 = field_7943;
            var20 = var6.has("underlined");
         }

         if(var4 != null) {
            if(var20) {
               var12 = field_7943;
               class_1560.method_8539(var5, Boolean.valueOf(var6.get("underlined").getAsBoolean()));
            }

            var12 = field_7943;
            var20 = var6.has("strikethrough");
         }

         if(var4 != null) {
            if(var20) {
               var12 = field_7943;
               class_1560.method_8540(var5, Boolean.valueOf(var6.get("strikethrough").getAsBoolean()));
            }

            var12 = field_7943;
            var20 = var6.has("obfuscated");
         }

         if(var4 != null) {
            if(var20) {
               var12 = field_7943;
               class_1560.method_8541(var5, Boolean.valueOf(var6.get("obfuscated").getAsBoolean()));
            }

            var12 = field_7943;
            var20 = var6.has("color");
         }

         if(var4 != null) {
            if(var20) {
               var12 = field_7943;
               class_1560.method_8542(var5, (class_130)var3.deserialize(var6.get("color"), class_130.class));
            }

            var12 = field_7943;
            var20 = var6.has("clickEvent");
         }

         JsonObject var7;
         JsonPrimitive var8;
         JsonPrimitive var13;
         String var21;
         label152: {
            if(var4 != null) {
               label153: {
                  label132: {
                     if(var20) {
                        var12 = field_7943;
                        var7 = var6.getAsJsonObject("clickEvent");
                        var19 = var7;
                        if(var4 == null) {
                           break label132;
                        }

                        if(var7 != null) {
                           class_911 var14;
                           label113: {
                              var8 = var7.getAsJsonPrimitive("action");
                              var13 = var8;
                              if(var4 != null) {
                                 if(var8 == null) {
                                    var14 = null;
                                    break label113;
                                 }

                                 var13 = var8;
                              }

                              var14 = class_911.method_5368(var13.getAsString());
                           }

                           class_911 var9;
                           String var15;
                           label108: {
                              var9 = var14;
                              var12 = field_7943;
                              JsonPrimitive var10 = var7.getAsJsonPrimitive("value");
                              var13 = var10;
                              if(var4 != null) {
                                 if(var10 == null) {
                                    var15 = null;
                                    break label108;
                                 }

                                 var13 = var10;
                              }

                              var15 = var13.getAsString();
                           }

                           String var11 = var15;
                           if(var9 != null && var11 != null) {
                              var20 = var9.method_5366();
                              if(var4 == null) {
                                 break label153;
                              }

                              if(var20) {
                                 class_1554 var10001 = new class_1554;
                                 var10001.method_8472(var9, var11);
                                 class_1560.method_8543(var5, var10001);
                              }
                           }
                        }
                     }

                     var19 = var6;
                  }

                  var12 = field_7943;
                  var21 = "hoverEvent";
                  if(var4 == null) {
                     break label152;
                  }

                  var20 = var19.has("hoverEvent");
               }
            }

            if(!var20) {
               return var5;
            }

            var19 = var6;
            var12 = field_7943;
            var21 = "hoverEvent";
         }

         var7 = var19.getAsJsonObject(var21);
         var19 = var7;
         if(var4 != null) {
            if(var7 == null) {
               return var5;
            }

            var19 = var7;
         }

         class_912 var16;
         label97: {
            var12 = field_7943;
            var8 = var19.getAsJsonPrimitive("action");
            var13 = var8;
            if(var4 != null) {
               if(var8 == null) {
                  var16 = null;
                  break label97;
               }

               var13 = var8;
            }

            var16 = class_912.method_5373(var13.getAsString());
         }

         class_912 var17 = var16;
         String[] var10002 = field_7943;
         class_66 var18 = (class_66)var3.deserialize(var7.get("value"), class_66.class);
         if(var17 != null && var18 != null && var17.method_5371()) {
            class_1558 var22 = new class_1558;
            var22.method_8508(var17, var18);
            class_1560.method_8544(var5, var22);
         }

         return var5;
      } else {
         return null;
      }
   }

   // $FF: renamed from: b (rY, java.lang.reflect.Type, com.google.gson.JsonSerializationContext) com.google.gson.JsonElement
   public JsonElement method_8185(class_1560 var1, Type var2, JsonSerializationContext var3) {
      String[] var4 = class_752.method_4253();
      if(var1.method_8521()) {
         return null;
      } else {
         JsonObject var5 = new JsonObject();
         Boolean var10000 = class_1560.method_8545(var1);
         String[] var7;
         if(var4 != null) {
            if(var10000 != null) {
               var7 = field_7943;
               var5.addProperty("bold", class_1560.method_8545(var1));
            }

            var10000 = class_1560.method_8546(var1);
         }

         if(var4 != null) {
            if(var10000 != null) {
               var7 = field_7943;
               var5.addProperty("italic", class_1560.method_8546(var1));
            }

            var10000 = class_1560.method_8547(var1);
         }

         if(var4 != null) {
            if(var10000 != null) {
               var7 = field_7943;
               var5.addProperty("underlined", class_1560.method_8547(var1));
            }

            var10000 = class_1560.method_8548(var1);
         }

         class_1560 var8;
         label72: {
            if(var4 != null) {
               if(var10000 != null) {
                  var7 = field_7943;
                  var5.addProperty("strikethrough", class_1560.method_8548(var1));
               }

               var8 = var1;
               if(var4 == null) {
                  break label72;
               }

               var10000 = class_1560.method_8549(var1);
            }

            if(var10000 != null) {
               var7 = field_7943;
               var5.addProperty("obfuscated", class_1560.method_8549(var1));
            }

            var8 = var1;
         }

         if(var4 != null) {
            if(class_1560.drawScreen0(var8) != null) {
               var7 = field_7943;
               var5.add("color", var3.serialize(class_1560.drawScreen0(var1)));
            }

            var8 = var1;
         }

         JsonObject var6;
         if(var4 != null) {
            if(class_1560.drawScreen1(var8) != null) {
               var6 = new JsonObject();
               var7 = field_7943;
               var6.addProperty("action", class_1560.drawScreen1(var1).method_8473().method_5367());
               var6.addProperty("value", class_1560.drawScreen1(var1).method_8474());
               var5.add("clickEvent", var6);
            }

            var8 = var1;
         }

         if(class_1560.drawScreen2(var8) != null) {
            var6 = new JsonObject();
            var7 = field_7943;
            var6.addProperty("action", class_1560.drawScreen2(var1).method_8509().method_5372());
            var6.add("value", var3.serialize(class_1560.drawScreen2(var1).method_8510()));
            var5.add("hoverEvent", var6);
         }

         return var5;
      }
   }

   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.method_8185((class_1560)var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8186() {
      // $FF: Couldn't be decompiled
   }
}

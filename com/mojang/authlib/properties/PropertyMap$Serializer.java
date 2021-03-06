package com.mojang.authlib.properties;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map.Entry;

public class PropertyMap$Serializer implements JsonSerializer<PropertyMap>, JsonDeserializer<PropertyMap> {

   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_4224;


   // $FF: renamed from: <init> () void
   public void method_5105() {
      super();
   }

   public PropertyMap deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      int[] var4;
      PropertyMap var5;
      boolean var17;
      Property var10002;
      JsonElement var20;
      label89: {
         int[] var10000 = PropertyMap.getBlock86();
         PropertyMap var10001 = new PropertyMap;
         var10001.getBlock84();
         var5 = var10001;
         var4 = var10000;
         var17 = var1 instanceof JsonObject;
         if(var4 != null) {
            if(var17) {
               JsonObject var6 = (JsonObject)var1;
               Iterator var7 = var6.entrySet().iterator();

               label76:
               while(var7.hasNext()) {
                  Entry var8 = (Entry)var7.next();
                  if(var4 == null) {
                     return var5;
                  }

                  label93: {
                     Object var18 = var8.getValue();
                     if(var4 != null) {
                        if(!(var18 instanceof JsonArray)) {
                           break label93;
                        }

                        var18 = var8.getValue();
                     }

                     Iterator var9 = ((JsonArray)var18).iterator();

                     while(var9.hasNext()) {
                        JsonElement var10 = (JsonElement)var9.next();
                        Object var19 = var8.getKey();
                        var10002 = new Property;
                        var10002.method_5530((String)var8.getKey(), var10.getAsString());
                        var5.put(var19, var10002);
                        if(var4 == null) {
                           continue label76;
                        }

                        if(var4 == null) {
                           break;
                        }
                     }
                  }

                  if(var4 == null) {
                     break;
                  }
               }

               if(var4 != null) {
                  return var5;
               }
            }

            var20 = var1;
            if(var4 == null) {
               break label89;
            }

            var17 = var1 instanceof JsonArray;
         }

         if(!var17) {
            return var5;
         }

         var20 = var1;
      }

      Iterator var12 = ((JsonArray)var20).iterator();

      while(var12.hasNext()) {
         label96: {
            JsonElement var13 = (JsonElement)var12.next();
            var20 = var13;
            if(var4 != null) {
               if(!(var13 instanceof JsonObject)) {
                  break label96;
               }

               var20 = var13;
            }

            JsonObject var14 = (JsonObject)var20;
            String[] var11 = field_4224;
            String var15 = var14.getAsJsonPrimitive("name").getAsString();
            String var16 = var14.getAsJsonPrimitive("value").getAsString();
            var17 = var14.has("signature");
            if(var4 != null) {
               label40: {
                  if(var17) {
                     var10002 = new Property;
                     var10002.method_5531(var15, var16, var14.getAsJsonPrimitive("signature").getAsString());
                     var5.put(var15, var10002);
                     if(var4 != null) {
                        break label40;
                     }
                  }

                  var10002 = new Property;
                  var10002.method_5530(var15, var16);
                  var5.put(var15, var10002);
               }
            }
         }

         if(var4 == null) {
            break;
         }
      }

      return var5;
   }

   public JsonElement serialize(PropertyMap var1, Type var2, JsonSerializationContext var3) {
      int[] var10000 = PropertyMap.getBlock86();
      JsonArray var5 = new JsonArray();
      int[] var4 = var10000;
      Iterator var6 = var1.values().iterator();

      while(var6.hasNext()) {
         Property var7 = (Property)var6.next();
         JsonObject var8 = new JsonObject();
         String[] var9 = field_4224;
         var8.addProperty("name", var7.getName());
         var8.addProperty("value", var7.getValue());
         if(var4 != null) {
            if(var7.hasSignature()) {
               var8.addProperty("signature", var7.getSignature());
            }

            var5.add(var8);
         }

         if(var4 == null) {
            break;
         }
      }

      if(class_689.method_3976() != 0) {
         PropertyMap.getBlock85(new int[2]);
      }

      return var5;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5106() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "6åÕ \t3íÞà±2á.åÔ";
      int var4 = "6åÕ \t3íÞà±2á.åÔ".length();
      char var1 = 5;
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
                  field_4224 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 126;
               break;
            case 1:
               var10009 = 186;
               break;
            case 2:
               var10009 = 135;
               break;
            case 3:
               var10009 = 75;
               break;
            case 4:
               var10009 = 94;
               break;
            case 5:
               var10009 = 170;
               break;
            default:
               var10009 = 250;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

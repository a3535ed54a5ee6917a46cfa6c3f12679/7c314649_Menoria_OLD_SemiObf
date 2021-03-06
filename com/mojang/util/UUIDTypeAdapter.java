package com.mojang.util;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.UUID;

public class UUIDTypeAdapter extends TypeAdapter<UUID> {

   // $FF: renamed from: a sa[]
   private static class_689[] field_2586;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2587;


   // $FF: renamed from: <init> () void
   public void method_3218() {
      super();
   }

   public void write(JsonWriter var1, UUID var2) {
      var1.value(fromUUID(var2));
   }

   public UUID read(JsonReader var1) {
      return fromString(var1.nextString());
   }

   public static String fromUUID(UUID var0) {
      return var0.toString().replace("-", "");
   }

   public static UUID fromString(String var0) {
      String[] var1 = field_2587;
      return UUID.fromString(var0.replaceFirst("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5"));
   }

   // $FF: renamed from: b (sa[]) void
   public static void method_3219(class_689[] var0) {
      field_2586 = var0;
   }

   // $FF: renamed from: a () sa[]
   public static class_689[] method_3220() {
      return field_2586;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3221() {
      String[] var5 = new String[2];
      int var3 = 0;
      method_3219((class_689[])null);
      String var2 = "\fQ»³ÁM²¬\nÐ$ <áZ¹SÌ <áZµSÌ <áZµSÌ <áZµSÌ <áZ°";
      int var4 = "\fQ»³ÁM²¬\nÐ$ <áZ¹SÌ <áZµSÌ <áZµSÌ <áZµSÌ <áZ°".length();
      char var1 = 14;
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
                  field_2587 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 63;
               break;
            case 1:
               var10009 = 119;
               break;
            case 2:
               var10009 = 129;
               break;
            case 3:
               var10009 = 54;
               break;
            case 4:
               var10009 = 150;
               break;
            case 5:
               var10009 = 57;
               break;
            default:
               var10009 = 242;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

package com.mojang.authlib;

import com.mojang.authlib.properties.PropertyMap;
import java.util.UUID;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class GameProfile {

   // $FF: renamed from: id java.util.UUID
   private final UUID field_1291;
   private final String name;
   private final PropertyMap properties;
   private boolean legacy;
   // $FF: renamed from: a int[]
   private static int[] field_1292;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1293;


   // $FF: renamed from: <init> (java.util.UUID, java.lang.String) void
   public void method_1305(UUID param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public UUID getId() {
      return this.field_1291;
   }

   public String getName() {
      return this.name;
   }

   public PropertyMap getProperties() {
      return this.properties;
   }

   public boolean isComplete() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      ToStringBuilder var10000 = new ToStringBuilder(this);
      String[] var1 = field_1293;
      return var10000.append("id", this.field_1291).append("name", this.name).append("properties", this.properties).append("legacy", this.legacy).toString();
   }

   public boolean isLegacy() {
      return this.legacy;
   }

   // $FF: renamed from: b (int[]) void
   public static void method_1306(int[] var0) {
      field_1292 = var0;
   }

   // $FF: renamed from: a () int[]
   public static int[] method_1307() {
      return field_1292;
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_1308(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1309() {
      // $FF: Couldn't be decompiled
   }
}

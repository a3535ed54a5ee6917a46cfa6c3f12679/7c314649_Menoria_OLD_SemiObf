package com.mojang.authlib;

import java.util.Map;

public enum UserType {

   LEGACY,
   MOJANG;
   private static final Map<String, UserType> BY_NAME;
   private final String name;
   // $FF: synthetic field
   private static final UserType[] $VALUES;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String) void
   private void method_3330(String var1, int var2, String var3) {
      super(var1, var2);
      this.name = var3;
   }

   public static UserType byName(String var0) {
      return (UserType)BY_NAME.get(var0.toLowerCase());
   }

   public String getName() {
      return this.name;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3331() {
      // $FF: Couldn't be decompiled
   }
}

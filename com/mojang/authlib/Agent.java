package com.mojang.authlib;


public class Agent {

   public static final Agent MINECRAFT;
   public static final Agent SCROLLS;
   private final String name;
   private final int version;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2974;


   // $FF: renamed from: <init> (java.lang.String, int) void
   public void method_3814(String var1, int var2) {
      super();
      this.name = var1;
      this.version = var2;
   }

   public String getName() {
      return this.name;
   }

   public int getVersion() {
      return this.version;
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_2974;
      return var10000.append("Agent{name=\'").append(this.name).append('\'').append(", version=").append(this.version).append('}').toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3815() {
      // $FF: Couldn't be decompiled
   }
}

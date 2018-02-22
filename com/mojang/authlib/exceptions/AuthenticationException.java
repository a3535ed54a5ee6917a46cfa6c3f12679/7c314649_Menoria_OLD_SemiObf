package com.mojang.authlib.exceptions;


public class AuthenticationException extends Exception {

   // $FF: renamed from: a java.lang.String
   private static String field_22;


   // $FF: renamed from: <init> () void
   public void method_427() {
      super();
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_428(String var1) {
      super(var1);
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.Throwable) void
   public void method_429(String var1, Throwable var2) {
      super(var1, var2);
   }

   // $FF: renamed from: <init> (java.lang.Throwable) void
   public void method_430(Throwable var1) {
      super(var1);
   }

   // $FF: renamed from: a (java.lang.String) void
   public static void method_431(String var0) {
      field_22 = var0;
   }

   // $FF: renamed from: a () java.lang.String
   public static String method_432() {
      return field_22;
   }

   // $FF: renamed from: <clinit> () void
   static void method_433() {
      if(method_432() != null) {
         method_431("u2gCNb");
      }

   }
}

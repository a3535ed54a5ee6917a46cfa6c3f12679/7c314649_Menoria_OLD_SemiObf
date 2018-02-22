package com.mojang.authlib.yggdrasil.response;


public class Response {

   private String error;
   private String errorMessage;
   private String cause;
   // $FF: renamed from: a int[]
   private static int[] field_1288;


   // $FF: renamed from: <init> () void
   public void method_1301() {
      super();
   }

   public String getError() {
      return this.error;
   }

   public String getCause() {
      return this.cause;
   }

   public String getErrorMessage() {
      return this.errorMessage;
   }

   protected void setError(String var1) {
      this.error = var1;
   }

   protected void setErrorMessage(String var1) {
      this.errorMessage = var1;
   }

   protected void setCause(String var1) {
      this.cause = var1;
   }

   // $FF: renamed from: b (int[]) void
   public static void method_1302(int[] var0) {
      field_1288 = var0;
   }

   // $FF: renamed from: a () int[]
   public static int[] method_1303() {
      return field_1288;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1304() {
      if(method_1303() != null) {
         method_1302(new int[5]);
      }

   }
}

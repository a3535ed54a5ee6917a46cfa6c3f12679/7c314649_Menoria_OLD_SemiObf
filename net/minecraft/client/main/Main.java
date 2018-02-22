package net.minecraft.client.main;

import java.lang.reflect.Type;

public class Main {

   // $FF: renamed from: a java.lang.reflect.Type
   private static final Type field_6921;
   private static final String __OBFID;
   // $FF: renamed from: b boolean
   private static boolean field_6922;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6923;


   // $FF: renamed from: <init> () void
   public void method_7121() {
      super();
   }

   public static void main(String[] param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String) boolean
   private static boolean method_7122(String var0) {
      boolean var2;
      label24: {
         boolean var1 = method_7126();
         String var10000 = var0;
         if(!var1) {
            if(var0 == null) {
               break label24;
            }

            var10000 = var0;
         }

         var2 = var10000.isEmpty();
         if(var1) {
            return var2;
         }

         if(!var2) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7123() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (boolean) void
   public static void method_7124(boolean var0) {
      field_6922 = var0;
   }

   // $FF: renamed from: a () boolean
   public static boolean method_7125() {
      return field_6922;
   }

   // $FF: renamed from: b () boolean
   public static boolean method_7126() {
      boolean var0 = method_7125();
      return !var0;
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_7127(Exception var0) {
      return var0;
   }
}

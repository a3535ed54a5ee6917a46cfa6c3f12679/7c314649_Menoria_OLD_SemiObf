package ca.diiza.g.a;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

// $FF: renamed from: ca.diiza.g.a.a
public class class_871 {

   // $FF: renamed from: a java.io.File
   public static final File field_4239;
   // $FF: renamed from: b java.util.Properties
   private static Properties field_4240;
   // $FF: renamed from: c sa[]
   private static class_689[] field_4241;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_4242;


   // $FF: renamed from: <init> () void
   public void method_5136() {
      super();
   }

   // $FF: renamed from: a () void
   public static void method_5137() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_5138(String var0) {
      class_689[] var1 = method_5144();
      Properties var10000 = field_4240;
      String var2;
      if(var1 == null) {
         if(field_4240 == null) {
            var2 = null;
            return var2;
         }

         var10000 = field_4240;
      }

      var2 = var10000.getProperty(var0);
      return var2;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public static void method_5139(String var0, String var1) {
      class_689[] var2 = method_5144();
      if(var2 == null && field_4240 != null) {
         field_4240.setProperty(var0, var1);
      }

   }

   // $FF: renamed from: b () void
   public static void method_5140() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   private static void method_5141() {
      field_4240 = new Properties();
      String[] var0 = field_4242;
      field_4240.setProperty("hud.pourcent", "Non");
      field_4240.setProperty("hud.activated", "Oui");
      method_5140();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5142() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sa[]) void
   public static void method_5143(class_689[] var0) {
      field_4241 = var0;
   }

   // $FF: renamed from: d () sa[]
   public static class_689[] method_5144() {
      return field_4241;
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_5145(IOException var0) {
      return var0;
   }
}

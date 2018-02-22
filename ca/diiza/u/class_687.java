package ca.diiza.u;

import java.io.File;
import java.util.Properties;

// $FF: renamed from: ca.diiza.u.b
public class class_687 {

   // $FF: renamed from: a java.io.File
   public static File field_2944;
   // $FF: renamed from: b java.util.Properties
   private static Properties field_2945;
   // $FF: renamed from: c boolean
   public static boolean field_2946;
   // $FF: renamed from: d boolean
   public static boolean field_2947;
   // $FF: renamed from: e boolean
   public static boolean field_2948;
   // $FF: renamed from: f int
   public static int field_2949;
   // $FF: renamed from: g int
   public static int field_2950;
   // $FF: renamed from: h boolean
   public static boolean field_2951;
   // $FF: renamed from: i boolean
   public static boolean field_2952;
   // $FF: renamed from: j double
   public static double field_2953;
   // $FF: renamed from: k boolean
   public static boolean field_2954;
   // $FF: renamed from: l java.lang.String[]
   private static String[] field_2955;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] field_2956;


   // $FF: renamed from: <init> () void
   public void method_3710() {
      super();
   }

   // $FF: renamed from: a () void
   public static void method_3711() {
      method_3713(field_2944, true);
   }

   // $FF: renamed from: b () void
   public static void method_3712() {
      method_3713(field_2944, false);
   }

   // $FF: renamed from: a (java.io.File, boolean) void
   public static void method_3713(File param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   public static void method_3714() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () void
   private static void method_3715() {
      field_2945 = new Properties();
      String[] var0 = field_2956;
      field_2945.setProperty("toggleSprintEnabled", "true");
      field_2945.setProperty("toggleSneakEnabled", "true");
      field_2945.setProperty("showHud", "true");
      field_2945.setProperty("hudX", "1");
      field_2945.setProperty("hudY", "1");
      field_2945.setProperty("doubleTap", "true");
      field_2945.setProperty("flyBoostEnabled", "true");
      field_2945.setProperty("flyBoost", "4.0");
      method_3714();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3716() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String[]) void
   public static void method_3717(String[] var0) {
      field_2955 = var0;
   }

   // $FF: renamed from: e () java.lang.String[]
   public static String[] method_3718() {
      return field_2955;
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_3719(Exception var0) {
      return var0;
   }
}

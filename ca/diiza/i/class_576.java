package ca.diiza.i;


// $FF: renamed from: ca.diiza.i.e
public class class_576 extends class_573 {

   // $FF: renamed from: q boolean
   private static boolean field_2453;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
   }

   // $FF: renamed from: c (boolean) void
   public static void getBlock63(boolean var0) {
      field_2453 = var0;
   }

   // $FF: renamed from: e () boolean
   public static boolean getBlock64() {
      return field_2453;
   }

   // $FF: renamed from: i () boolean
   public static boolean getBlock65() {
      boolean var0 = getBlock64();
      return !var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      if(!getBlock65()) {
         getBlock63(true);
      }

   }
}

package ca.diiza.f;

import ca.diiza.f.class_240;

// $FF: renamed from: ca.diiza.f.y
class class_233 {

   // $FF: renamed from: b int[]
   static final int[] field_1267;


   // $FF: renamed from: <init> () void
   void method_1278() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_1279() {
      field_1267 = new int[class_240.values().length];

      try {
         field_1267[class_240.PRICE_DECREASE.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
         ;
      }

      try {
         field_1267[class_240.PRICE_INCREASE.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         field_1267[class_240.TIME_DECREASE.ordinal()] = 4;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         field_1267[class_240.TIME_INCREASE.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}

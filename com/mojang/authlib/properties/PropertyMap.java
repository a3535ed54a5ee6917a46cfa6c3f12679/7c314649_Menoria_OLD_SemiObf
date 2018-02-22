package com.mojang.authlib.properties;

import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.mojang.authlib.properties.Property;

public class PropertyMap extends ForwardingMultimap<String, Property> {

   private final Multimap<String, Property> properties;
   // $FF: renamed from: a int[]
   private static int[] field_2460;


   // $FF: renamed from: <init> () void
   public void getBlock84() {
      super();
      this.properties = LinkedHashMultimap.create();
   }

   protected Multimap<String, Property> delegate() {
      return this.properties;
   }

   // $FF: renamed from: b (int[]) void
   public static void getBlock85(int[] var0) {
      field_2460 = var0;
   }

   // $FF: renamed from: a () int[]
   public static int[] getBlock86() {
      return field_2460;
   }

   // $FF: renamed from: <clinit> () void
   static void getBlock87() {
      if(getBlock86() == null) {
         getBlock85(new int[4]);
      }

   }
}

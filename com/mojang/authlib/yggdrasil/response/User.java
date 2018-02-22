package com.mojang.authlib.yggdrasil.response;

import com.mojang.authlib.properties.PropertyMap;

public class User {

   // $FF: renamed from: id java.lang.String
   private String field_2630;
   private PropertyMap properties;


   // $FF: renamed from: <init> () void
   public void method_3323() {
      super();
   }

   public String getId() {
      return this.field_2630;
   }

   public PropertyMap getProperties() {
      return this.properties;
   }
}

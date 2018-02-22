package ca.diiza.s;

import ca.diiza.s.class_88;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

// $FF: renamed from: ca.diiza.s.c
class class_90 implements HostnameVerifier {

   // $FF: renamed from: a ca.diiza.s.a
   final class_88 field_19;


   // $FF: renamed from: <init> (ca.diiza.s.a) void
   void method_420(class_88 var1) {
      this.field_19 = var1;
      super();
   }

   public boolean verify(String var1, SSLSession var2) {
      return true;
   }
}

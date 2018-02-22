package ca.diiza.s;

import ca.diiza.s.class_88;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

// $FF: renamed from: ca.diiza.s.b
class class_89 implements X509TrustManager {

   // $FF: renamed from: a ca.diiza.s.a
   final class_88 field_18;


   // $FF: renamed from: <init> (ca.diiza.s.a) void
   void method_419(class_88 var1) {
      this.field_18 = var1;
      super();
   }

   public X509Certificate[] getAcceptedIssuers() {
      return null;
   }

   public void checkClientTrusted(X509Certificate[] var1, String var2) {}

   public void checkServerTrusted(X509Certificate[] var1, String var2) {}
}

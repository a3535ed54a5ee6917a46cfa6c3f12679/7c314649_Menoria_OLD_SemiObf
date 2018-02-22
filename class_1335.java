import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

// $FF: renamed from: kV
class class_1335 implements X509TrustManager {

   // $FF: renamed from: a kU
   final FontRenderer field_6874;


   // $FF: renamed from: <init> (kU) void
   void method_7050(FontRenderer var1) {
      this.field_6874 = var1;
      super();
   }

   public X509Certificate[] getAcceptedIssuers() {
      return null;
   }

   public void checkClientTrusted(X509Certificate[] var1, String var2) {}

   public void checkServerTrusted(X509Certificate[] var1, String var2) {}
}

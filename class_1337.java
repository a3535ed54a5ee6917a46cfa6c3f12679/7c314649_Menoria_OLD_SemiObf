import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

// $FF: renamed from: kW
class class_1337 implements HostnameVerifier {

   // $FF: renamed from: a kU
   final FontRenderer field_6882;


   // $FF: renamed from: <init> (kU) void
   void method_7059(FontRenderer var1) {
      this.field_6882 = var1;
      super();
   }

   public boolean verify(String var1, SSLSession var2) {
      return true;
   }
}

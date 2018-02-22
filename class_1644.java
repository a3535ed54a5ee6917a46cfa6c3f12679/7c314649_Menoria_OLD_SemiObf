import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

// $FF: renamed from: uS
public class class_1644 extends class_1640 {

   // $FF: renamed from: <init> (java.io.File) void
   public void method_8987(File var1) {
      super.method_8987(var1);
   }

   // $FF: renamed from: b (com.google.gson.JsonObject) uL
   protected class_1629 method_8997(JsonObject var1) {
      class_1634 var10000 = new class_1634;
      var10000.method_8962(var1);
      return var10000;
   }

   // $FF: renamed from: b (java.net.SocketAddress) boolean
   public boolean method_9008(SocketAddress var1) {
      String var2 = this.method_9010(var1);
      return this.method_8995(var2);
   }

   // $FF: renamed from: c (java.net.SocketAddress) uN
   public class_1634 method_9009(SocketAddress var1) {
      String var2 = this.method_9010(var1);
      return (class_1634)this.method_8991(var2);
   }

   // $FF: renamed from: d (java.net.SocketAddress) java.lang.String
   private String method_9010(SocketAddress var1) {
      String var3 = var1.toString();
      String[] var2 = class_752.method_4253();
      boolean var10000 = var3.contains("/");
      String var4;
      if(var2 != null) {
         if(var10000) {
            var3 = var3.substring(var3.indexOf(47) + 1);
         }

         var4 = var3;
         if(var2 == null) {
            return var4;
         }

         var10000 = var3.contains(":");
      }

      if(var10000) {
         var3 = var3.substring(0, var3.indexOf(58));
      }

      var4 = var3;
      return var4;
   }
}

import net.minecraft.realms.RealmsServerStatusPinger;
import net.minecraft.realms.ServerPing;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: qF
class class_1497 implements class_59 {

   // $FF: renamed from: a boolean
   private boolean field_7890;
   // $FF: renamed from: b java.lang.String
   private static final String field_7891;
   // $FF: renamed from: c net.minecraft.realms.ServerPing
   final ServerPing field_7892;
   // $FF: renamed from: d l
   final class_120 field_7893;
   // $FF: renamed from: e java.lang.String
   final String field_7894;
   // $FF: renamed from: f net.minecraft.realms.RealmsServerStatusPinger
   final RealmsServerStatusPinger field_7895;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7896;


   // $FF: renamed from: <init> (net.minecraft.realms.RealmsServerStatusPinger, net.minecraft.realms.ServerPing, l, java.lang.String) void
   void method_8104(RealmsServerStatusPinger var1, ServerPing var2, class_120 var3, String var4) {
      this.field_7895 = var1;
      this.field_7892 = var2;
      this.field_7893 = var3;
      this.field_7894 = var4;
      super();
      this.field_7890 = false;
   }

   // $FF: renamed from: b (tC) void
   public void method_242(class_300 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tB) void
   public void method_243(class_302 var1) {
      class_120 var10000 = this.field_7893;
      class_1082 var10001 = new class_1082;
      String[] var10003 = field_7896;
      var10001.method_6134("Finished");
      var10000.method_558(var10001);
   }

   // $FF: renamed from: b (rV) void
   public void method_237(class_66 var1) {
      try {
         if(!this.field_7890) {
            Logger var10000 = RealmsServerStatusPinger.access$000();
            StringBuilder var10001 = new StringBuilder();
            String[] var2 = field_7896;
            var10000.error(var10001.append("Can\'t ping ").append(this.field_7894).append(": ").append(var1.method_342()).toString());
         }

      } catch (UnsupportedOperationException var3) {
         throw method_8105(var3);
      }
   }

   // $FF: renamed from: b (ag, ag) void
   public void method_238(class_906 var1, class_906 var2) {
      try {
         if(var2 != class_906.field_4461) {
            UnsupportedOperationException var10000 = new UnsupportedOperationException;
            StringBuilder var10002 = new StringBuilder();
            String[] var10003 = field_7896;
            var10000.<init>(var10002.append("Unexpected change in protocol to ").append(var2).toString());
            throw var10000;
         }
      } catch (UnsupportedOperationException var3) {
         throw method_8105(var3);
      }
   }

   // $FF: renamed from: b () void
   public void method_239() {}

   // $FF: renamed from: b (java.lang.UnsupportedOperationException) java.lang.UnsupportedOperationException
   private static UnsupportedOperationException method_8105(UnsupportedOperationException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8106() {
      // $FF: Couldn't be decompiled
   }
}

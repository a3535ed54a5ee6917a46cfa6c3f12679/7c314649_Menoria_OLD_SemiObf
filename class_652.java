import java.net.UnknownHostException;
import net.minecraft.realms.RealmsConnect;

// $FF: renamed from: AP
class class_652 extends Thread {

   // $FF: renamed from: a java.lang.String
   private static final String field_2805;
   // $FF: renamed from: b java.lang.String
   final String field_2806;
   // $FF: renamed from: c int
   final int field_2807;
   // $FF: renamed from: d net.minecraft.realms.RealmsConnect
   final RealmsConnect field_2808;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2809;


   // $FF: renamed from: <init> (net.minecraft.realms.RealmsConnect, java.lang.String, java.lang.String, int) void
   void method_3549(RealmsConnect var1, String var2, String var3, int var4) {
      this.field_2808 = var1;
      this.field_2806 = var3;
      this.field_2807 = var4;
      super(var2);
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.net.UnknownHostException) java.net.UnknownHostException
   private static UnknownHostException method_3550(UnknownHostException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3551() {
      // $FF: Couldn't be decompiled
   }
}

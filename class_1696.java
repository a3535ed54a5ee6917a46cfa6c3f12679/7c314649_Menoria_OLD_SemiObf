import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: uz
public class class_1696 implements class_58 {

   // $FF: renamed from: b net.minecraft.server.MinecraftServer
   private final MinecraftServer field_8875;
   // $FF: renamed from: c l
   private final class_120 field_8876;
   // $FF: renamed from: h java.lang.String
   private static final String field_8877 = "Unexpected change in protocol to ";


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, l) void
   public void method_9376(MinecraftServer var1, class_120 var2) {
      super();
      this.field_8875 = var1;
      this.field_8876 = var2;
   }

   // $FF: renamed from: b (rV) void
   public void method_237(class_66 var1) {}

   // $FF: renamed from: b (ag, ag) void
   public void method_238(class_906 var1, class_906 var2) {
      try {
         if(var2 != class_906.field_4461) {
            throw new UnsupportedOperationException("Unexpected change in protocol to " + var2);
         }
      } catch (UnsupportedOperationException var3) {
         throw method_9377(var3);
      }
   }

   // $FF: renamed from: b () void
   public void method_239() {}

   // $FF: renamed from: b (tE) void
   public void method_241(class_296 var1) {
      class_120 var10000 = this.field_8876;
      class_300 var10001 = new class_300;
      var10001.method_1717(this.field_8875.method_2404());
      var10000.method_553(var10001, new GenericFutureListener[0]);
   }

   // $FF: renamed from: b (tD) void
   public void method_240(class_298 var1) {
      class_120 var10000 = this.field_8876;
      class_302 var10001 = new class_302;
      var10001.method_1727(var1.method_1709());
      var10000.method_553(var10001, new GenericFutureListener[0]);
   }

   // $FF: renamed from: b (java.lang.UnsupportedOperationException) java.lang.UnsupportedOperationException
   private static UnsupportedOperationException method_9377(UnsupportedOperationException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9378() {
      boolean var10000 = true;
      char[] var10003 = "Ô<½uÍõ7åfÏï5ålñ ±jÁírª%".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8877 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 6;
            break;
         case 1:
            var10009 = 213;
            break;
         case 2:
            var10009 = 114;
            break;
         case 3:
            var10009 = 66;
            break;
         case 4:
            var10009 = 130;
            break;
         case 5:
            var10009 = 245;
            break;
         default:
            var10009 = 41;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

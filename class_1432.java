import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.util.UUID;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: nt
public class class_1432 implements class_61 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_7598;
   // $FF: renamed from: c bao
   private final bao field_7599;
   // $FF: renamed from: d bdw
   private final bdw field_7600;
   // $FF: renamed from: e l
   private final class_120 field_7601;
   // $FF: renamed from: f java.lang.String
   private static final String field_7602;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7603;


   // $FF: renamed from: <init> (l, bao, bdw) void
   public void method_7791(class_120 var1, bao var2, bdw var3) {
      super();
      this.field_7601 = var1;
      this.field_7599 = var2;
      this.field_7600 = var3;
   }

   // $FF: renamed from: b (tx) void
   public void method_246(class_253 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () com.mojang.authlib.minecraft.MinecraftSessionService
   private MinecraftSessionService method_7792() {
      YggdrasilAuthenticationService var10000 = new YggdrasilAuthenticationService;
      var10000.method_1431(this.field_7599.method_5287(), UUID.randomUUID().toString());
      return var10000.createMinecraftSessionService();
   }

   // $FF: renamed from: b (tw) void
   public void method_247(class_254 var1) {
      this.field_7601.method_550(class_906.field_4460);
   }

   // $FF: renamed from: b (rV) void
   public void method_237(class_66 var1) {
      bao var10000 = this.field_7599;
      class_176 var10001 = new class_176;
      String[] var10004 = field_7603;
      var10001.method_936(this.field_7600, "connect.failed", var1);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: b (ag, ag) void
   public void method_238(class_906 var1, class_906 var2) {
      Logger var10000 = field_7598;
      StringBuilder var10001 = new StringBuilder();
      String[] var3 = field_7603;
      var10000.debug(var10001.append("Switching protocol from ").append(var1).append(" to ").append(var2).toString());
      if(var2 == class_906.field_4460) {
         class_120 var4 = this.field_7601;
         class_1436 var5 = new class_1436;
         var5.method_7819(this.field_7599, this.field_7600, this.field_7601);
         var4.method_552(var5);
      }

   }

   // $FF: renamed from: b () void
   public void method_239() {}

   // $FF: renamed from: b (ty) void
   public void method_248(class_252 var1) {
      this.field_7601.method_558(var1.method_1465());
   }

   // $FF: renamed from: b (nt) l
   static class_120 method_7793(class_1432 var0) {
      return var0.field_7601;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7794() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (com.mojang.authlib.exceptions.AuthenticationUnavailableException) com.mojang.authlib.exceptions.AuthenticationUnavailableException
   private static AuthenticationUnavailableException method_7795(AuthenticationUnavailableException var0) {
      return var0;
   }
}

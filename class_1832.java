import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: zA
public class class_1832 extends class_1790 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9380;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9381;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9381;
      return "help";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 0;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9381;
      return "commands.help.usage";
   }

   // $FF: renamed from: c () java.util.List
   public List method_45() {
      return Arrays.asList(new String[]{"?"});
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (bh) java.util.List
   protected List method_9937(class_20 var1) {
      List var2 = MinecraftServer.method_2348().method_2349().method_41(var1);
      Collections.sort(var2);
      return var2;
   }

   // $FF: renamed from: e () java.util.Map
   protected Map method_9938() {
      return MinecraftServer.method_2348().method_2349().method_42();
   }

   // $FF: renamed from: b (AB) AB
   private static class_642 method_9939(class_642 var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}

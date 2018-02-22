import java.util.List;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: zv
public class class_1795 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9336;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9336;
      return "difficulty";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 2;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9336;
      return "commands.difficulty.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 var1, String[] var2) {
      if(var2.length > 0) {
         class_918 var3 = this.method_9872(var1, var2[0]);
         MinecraftServer.method_2348().method_2359(var3);
         String[] var4 = field_9336;
         Object[] var10003 = new Object[1];
         class_1081 var10006 = new class_1081;
         var10006.method_6126(var3.method_5394(), new Object[0]);
         var10003[0] = var10006;
         method_9857(var1, this, "commands.difficulty.success", var10003);
      } else {
         class_641 var10000 = new class_641;
         String[] var10002 = field_9336;
         var10000.method_3515("commands.difficulty.usage", new Object[0]);
         throw var10000;
      }
   }

   // $FF: renamed from: a (bh, java.lang.String) aq
   protected class_918 method_9872(class_20 param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, java.lang.String[]) java.util.List
   public List method_48(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (AD) AD
   private static class_641 method_9873(class_641 var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}

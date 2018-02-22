import java.util.Arrays;
import java.util.List;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: zF
public class class_1827 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9374;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: c () java.util.List
   public List method_45() {
      String[] var10000 = new String[]{"w", null};
      String[] var10003 = field_9374;
      var10000[1] = "msg";
      return Arrays.asList(var10000);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9374;
      return "tell";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 0;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9374;
      return "commands.message.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, java.lang.String[]) java.util.List
   public List method_48(class_20 var1, String[] var2) {
      return method_9855(var2, MinecraftServer.method_2348().method_2344());
   }

   // $FF: renamed from: b (java.lang.String[], int) boolean
   public boolean method_49(String[] var1, int var2) {
      String[] var3 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            var10000 = var2;
            if(var3 == null) {
               return (boolean)var10000;
            }

            if(var2 == 0) {
               break label32;
            }
         } catch (class_639 var4) {
            throw method_9935(var4);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (AE) AE
   private static class_639 method_9935(class_639 var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}

import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

// $FF: renamed from: qb
class class_1521 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8000;
   // $FF: renamed from: b up
   final class_357 field_8001;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8002;


   // $FF: renamed from: <init> (up) void
   void method_8258(class_357 var1) {
      this.field_8001 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8259() {
      String[] var10000 = class_752.method_4253();
      String var2 = ClientBrandRetriever.getClientModName();
      String[] var1 = var10000;
      String[] var3 = field_8002;
      boolean var4 = var2.equals("vanilla");
      String var5;
      if(var1 != null) {
         if(!var4) {
            return "Definitely; Client brand changed to \'" + var2 + "\'";
         }

         var2 = this.field_8001.getServerModName();
         var5 = var2;
         if(var1 == null) {
            return var5;
         }

         var3 = field_8002;
         var4 = var2.equals("vanilla");
      }

      if(!var4) {
         StringBuilder var6 = new StringBuilder();
         var3 = field_8002;
         var5 = var6.append("Definitely; Server brand changed to \'").append(var2).append("\'").toString();
      } else if(bao.class.getSigners() == null) {
         var3 = field_8002;
         var5 = "Very likely; Jar signature invalidated";
      } else {
         var10000 = field_8002;
         var5 = "Probably not. Jar signature remains and both client + server brands are untouched.";
      }

      return var5;
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_8260() {
      return this.method_8259();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8261() {
      // $FF: Couldn't be decompiled
   }
}

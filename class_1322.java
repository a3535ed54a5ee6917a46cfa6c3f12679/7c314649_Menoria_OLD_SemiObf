import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

// $FF: renamed from: kL
class class_1322 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6791;
   // $FF: renamed from: b bao
   final bao field_6792;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6793;


   // $FF: renamed from: <init> (bao) void
   void method_6952(bao var1) {
      this.field_6792 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6953() {
      String var2 = ClientBrandRetriever.getClientModName();
      String[] var1 = class_752.method_4253();
      String var10000 = var2;
      if(var1 != null) {
         String[] var3 = field_6793;
         if(!var2.equals("vanilla")) {
            var10000 = "Definitely; Client brand changed to \'" + var2 + "\'";
         } else if(bao.class.getSigners() == null) {
            var3 = field_6793;
            var10000 = "Very likely; Jar signature invalidated";
         } else {
            String[] var4 = field_6793;
            var10000 = "Probably not. Jar signature remains and client brand is untouched.";
         }
      }

      return var10000;
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_6954() {
      return this.method_6953();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6955() {
      // $FF: Couldn't be decompiled
   }
}

import java.util.concurrent.Callable;

// $FF: renamed from: nM
class GuiTextField3 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7400;
   // $FF: renamed from: b int
   final int field_7401;
   // $FF: renamed from: c bkn
   final bkn field_7402;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7403;


   // $FF: renamed from: <init> (bkn, int) void
   void method_7602(bkn var1, int var2) {
      this.field_7402 = var1;
      this.field_7401 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7603() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_7401;
      String[] var2;
      String var3;
      if(var1 != null) {
         if(this.field_7401 == 0) {
            var2 = field_7403;
            var3 = "MISC_TEXTURE";
            return var3;
         }

         var10000 = this.field_7401;
      }

      byte var10001 = 1;
      if(var1 != null) {
         if(var10000 == 1) {
            var2 = field_7403;
            var3 = "TERRAIN_TEXTURE";
            return var3;
         }

         var10000 = this.field_7401;
         var10001 = 2;
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var2 = field_7403;
            var3 = "ITEM_TEXTURE";
            return var3;
         }

         var10000 = this.field_7401;
         var10001 = 3;
      }

      if(var10000 == var10001) {
         var2 = field_7403;
         var3 = "ENTITY_PARTICLE_TEXTURE";
      } else {
         StringBuilder var4 = new StringBuilder();
         String[] var5 = field_7403;
         var3 = var4.append("Unknown - ").append(this.field_7401).toString();
      }

      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7604() {
      // $FF: Couldn't be decompiled
   }
}

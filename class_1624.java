
// $FF: renamed from: uG
class class_1624 {

   // $FF: renamed from: b java.lang.String
   private final String field_8441;
   // $FF: renamed from: c java.lang.String
   private final String field_8442;
   // $FF: renamed from: d java.lang.String
   private static final String field_8443;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8444;


   // $FF: renamed from: <init> (java.lang.String, java.lang.Object) void
   public void method_8863(String var1, Object var2) {
      String[] var10000 = class_752.method_4253();
      super();
      this.field_8441 = var1;
      String[] var3 = var10000;
      Object var6 = var2;
      String[] var5;
      if(var3 != null) {
         if(var2 == null) {
            var5 = field_8444;
            this.field_8442 = "~~NULL~~";
            if(var3 != null) {
               return;
            }
         }

         var6 = var2;
      }

      label20: {
         if(var3 != null) {
            if(!(var6 instanceof Throwable)) {
               break label20;
            }

            var6 = var2;
         }

         Throwable var4 = (Throwable)var6;
         StringBuilder var10001 = new StringBuilder();
         var5 = field_8444;
         this.field_8442 = var10001.append("~~ERROR~~ ").append(var4.getClass().getSimpleName()).append(": ").append(var4.getMessage()).toString();
         if(var3 != null) {
            return;
         }
      }

      this.field_8442 = var2.toString();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8864() {
      return this.field_8441;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_8865() {
      return this.field_8442;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8866() {
      // $FF: Couldn't be decompiled
   }
}

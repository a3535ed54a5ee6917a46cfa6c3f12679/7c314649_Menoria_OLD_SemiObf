
// $FF: renamed from: yg
public class class_1847 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9427;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9428;


   // $FF: renamed from: <init> () void
   public void method_9988() {
      super();
   }

   // $FF: renamed from: b () av
   public static class_929 method_9989() {
      String[] var1 = field_9428;
      String var0 = System.getProperty("os.name").toLowerCase();
      class_929 var10000;
      if(var0.contains("win")) {
         var10000 = class_929.field_4723;
      } else {
         var1 = field_9428;
         if(var0.contains("mac")) {
            var10000 = class_929.field_4724;
         } else {
            var1 = field_9428;
            if(var0.contains("solaris")) {
               var10000 = class_929.field_4722;
            } else {
               var1 = field_9428;
               if(var0.contains("sunos")) {
                  var10000 = class_929.field_4722;
               } else {
                  var1 = field_9428;
                  if(var0.contains("linux")) {
                     var10000 = class_929.field_4721;
                  } else {
                     String[] var10001 = field_9428;
                     var10000 = var0.contains("unix")?class_929.field_4721:class_929.field_4725;
                  }
               }
            }
         }
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9990() {
      // $FF: Couldn't be decompiled
   }
}

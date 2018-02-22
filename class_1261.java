import java.util.concurrent.Callable;

// $FF: renamed from: j6
class class_1261 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6532;
   // $FF: renamed from: b jY
   final class_1303 field_6533;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6534;


   // $FF: renamed from: <init> (jY) void
   void method_6627(class_1303 var1) {
      this.field_6533 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6628() {
      String[] var10000 = class_752.method_4253();
      String[] var4 = field_6534;
      String var2 = "Unknown?";
      String[] var1 = var10000;

      try {
         label34: {
            label33: {
               label32: {
                  try {
                     if(var1 == null) {
                        break label32;
                     }

                     switch(class_1303.method_6885(this.field_6533)) {
                     case 19132:
                        break;
                     case 19133:
                        break label33;
                     default:
                        break label34;
                     }
                  } catch (Throwable var5) {
                     throw method_6629(var5);
                  }

                  var4 = field_6534;
                  var2 = "McRegion";
               }

               if(var1 != null) {
                  break label34;
               }
            }

            var4 = field_6534;
            var2 = "Anvil";
         }
      } catch (Throwable var6) {
         ;
      }

      var10000 = field_6534;
      return String.format("0x%05X - %s", new Object[]{Integer.valueOf(class_1303.method_6885(this.field_6533)), var2});
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_6629(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6630() {
      // $FF: Couldn't be decompiled
   }
}


// $FF: renamed from: y5
class class_1779 implements class_82 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9290 = "CL_00001621";
   // $FF: renamed from: e xT
   final class_82 field_9291;
   // $FF: renamed from: f yZ
   final class_1771 field_9292;


   // $FF: renamed from: <init> (yZ, xT) void
   void method_9777(class_1771 var1, class_82 var2) {
      this.field_9292 = var1;
      this.field_9291 = var2;
      super();
   }

   // $FF: renamed from: b (sa) boolean
   public boolean method_402(class_689 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1 instanceof class_752;
      if(var2 != null) {
         if(!var10000) {
            var10000 = false;
         } else {
            class_1779 var3 = this;
            if(var2 != null) {
               label22: {
                  if(this.field_9291 != null) {
                     var3 = this;
                     if(var2 == null) {
                        break label22;
                     }

                     if(!this.field_9291.method_402(var1)) {
                        var10000 = false;
                        return var10000;
                     }
                  }

                  var3 = this;
               }
            }

            var10000 = var3.field_9292.method_9735((class_752)var1, false);
         }
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_403() {
      boolean var10000 = true;
      char[] var10003 = ":åvux".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_9290 = (new String((char[])var4)).intern();
            String var2 = field_9290;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 67;
            break;
         case 1:
            var10009 = 71;
            break;
         case 2:
            var10009 = 78;
            break;
         case 3:
            var10009 = 35;
            break;
         case 4:
            var10009 = 176;
            break;
         case 5:
            var10009 = 14;
            break;
         default:
            var10009 = 209;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

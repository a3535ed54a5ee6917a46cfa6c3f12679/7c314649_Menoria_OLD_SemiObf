
// $FF: renamed from: qV
final class class_1465 extends class_1460 {

   // $FF: renamed from: a boolean
   private boolean field_7735;
   // $FF: renamed from: c java.lang.String
   private static final String field_7736 = "CL_00001402";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
      this.field_7735 = true;
   }

   // $FF: renamed from: a (qH, add) add
   protected add method_7940(class_48 var1, add var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = var2;
      if(var3 != null) {
         if(var2.method_3745() == 15) {
            label29: {
               int var6;
               int var7;
               int var8;
               ahb var10;
               label36: {
                  class_905 var4 = class_484.method_2849(var1.method_186());
                  ahb var5 = var1.method_182();
                  var6 = var1.method_183() + var4.method_5322();
                  var7 = var1.method_184() + var4.method_5323();
                  var8 = var1.method_185() + var4.method_5324();
                  boolean var9 = class_537.getBlock08(var2, var5, var6, var7, var8);
                  if(var3 != null) {
                     if(!var9) {
                        break label29;
                     }

                     var10 = var5;
                     if(var3 == null) {
                        break label36;
                     }

                     var9 = var5.field_1832;
                  }

                  if(var9) {
                     return var2;
                  }

                  var10 = var5;
               }

               var10.method_2210(2005, var6, var7, var8, 0);
               if(var3 != null) {
                  return var2;
               }
            }

            this.field_7735 = false;
            return var2;
         }

         var10000 = super.method_7940(var1, var2);
      }

      return var10000;
   }

   // $FF: renamed from: b (qH) void
   protected void method_7942(class_48 var1) {
      label16: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(!this.field_7735) {
               break label16;
            }

            var1.method_182().method_2210(1000, var1.method_183(), var1.method_184(), var1.method_185(), 0);
         }

         if(var2 != null) {
            return;
         }
      }

      var1.method_182().method_2210(1001, var1.method_183(), var1.method_184(), var1.method_185(), 0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "oòOÌ\f ".toCharArray();
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
            field_7736 = (new String((char[])var4)).intern();
            String var2 = field_7736;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 177;
            break;
         case 1:
            var10009 = 35;
            break;
         case 2:
            var10009 = 141;
            break;
         case 3:
            var10009 = 180;
            break;
         case 4:
            var10009 = 97;
            break;
         case 5:
            var10009 = 161;
            break;
         default:
            var10009 = 169;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}


// $FF: renamed from: qT
final class class_1467 extends class_1460 {

   // $FF: renamed from: a qJ
   private final class_1460 field_7739;
   // $FF: renamed from: c java.lang.String
   private static final String field_7740 = "CL_00001400";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
      class_1460 var10001 = new class_1460;
      var10001.method_7939();
      this.field_7739 = var10001;
   }

   // $FF: renamed from: a (qH, add) add
   public add method_7940(class_48 var1, add var2) {
      String[] var3;
      ahb var5;
      int var6;
      int var7;
      int var8;
      adb var11;
      int var12;
      label60: {
         class_905 var4 = class_484.method_2849(var1.method_186());
         var5 = var1.method_182();
         String[] var10000 = class_752.method_4253();
         var6 = var1.method_183() + var4.method_5322();
         var7 = var1.method_184() + var4.method_5323();
         var8 = var1.method_185() + var4.method_5324();
         var3 = var10000;
         awt var9 = var5.getBlock(var6, var7, var8).method_2424();
         int var10 = var5.method_33(var6, var7, var8);
         var12 = awt.field_4177.equals(var9);
         if(var3 != null) {
            label47: {
               if(var12 != 0) {
                  var12 = var10;
                  if(var3 == null) {
                     break label47;
                  }

                  if(var10 == 0) {
                     var11 = class_1010.field_5184;
                     if(var3 != null) {
                        break label60;
                     }
                  }
               }

               var12 = awt.field_4178.equals(var9);
            }
         }

         if(var3 != null) {
            if(var12 == 0) {
               return super.method_7940(var1, var2);
            }

            var12 = var10;
         }

         if(var12 != 0) {
            return super.method_7940(var1, var2);
         }

         var11 = class_1010.field_5185;
      }

      var5.method_2056(var6, var7, var8);
      var12 = --var2.field_2958;
      if(var3 != null) {
         if(var12 == 0) {
            var2.method_3788(var11);
            var2.field_2958 = 1;
            if(var3 != null) {
               return var2;
            }
         }

         class_589 var13 = (class_589)var1.method_187();
         add var10001 = new add;
         var10001.method_3724(var11);
         var12 = var13.method_3156(var10001);
      }

      if(var12 < 0) {
         class_1460 var14 = this.field_7739;
         add var10002 = new add;
         var10002.method_3724(var11);
         var14.method_176(var1, var10002);
      }

      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "YÿùùÞÂ+ûù".toCharArray();
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
            field_7740 = (new String((char[])var4)).intern();
            String var2 = field_7740;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 135;
            break;
         case 1:
            var10009 = 82;
            break;
         case 2:
            var10009 = 61;
            break;
         case 3:
            var10009 = 84;
            break;
         case 4:
            var10009 = 84;
            break;
         case 5:
            var10009 = 115;
            break;
         default:
            var10009 = 111;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

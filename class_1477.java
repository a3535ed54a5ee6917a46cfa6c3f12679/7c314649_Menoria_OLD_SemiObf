
// $FF: renamed from: q0
final class class_1477 extends class_1460 {

   // $FF: renamed from: a qJ
   private final class_1460 field_7752;
   // $FF: renamed from: c java.lang.String
   private static final String field_7753 = "CL_00001413";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
      class_1460 var10001 = new class_1460;
      var10001.method_7939();
      this.field_7752 = var10001;
   }

   // $FF: renamed from: a (qH, add) add
   public add method_7940(class_48 var1, add var2) {
      ahb var5;
      double var6;
      double var8;
      double var10;
      double var16;
      label36: {
         class_905 var4 = class_484.method_2849(var1.method_186());
         String[] var10000 = class_752.method_4253();
         var5 = var1.method_182();
         var6 = var1.method_179() + (double)((float)var4.method_5322() * 1.125F);
         String[] var3 = var10000;
         var8 = var1.method_180() + (double)((float)var4.method_5323() * 1.125F);
         var10 = var1.method_181() + (double)((float)var4.method_5324() * 1.125F);
         int var12 = var1.method_183() + var4.method_5322();
         int var13 = var1.method_184() + var4.method_5323();
         int var14 = var1.method_185() + var4.method_5324();
         awt var15 = var5.getBlock(var12, var13, var14).method_2424();
         boolean var19 = awt.field_4177.equals(var15);
         if(var3 != null) {
            if(var19) {
               var16 = 1.0D;
               if(var3 != null) {
                  break label36;
               }
            }

            var19 = awt.field_4170.equals(var15);
         }

         if(var3 != null) {
            if(!var19) {
               return this.field_7752.method_176(var1, var2);
            }

            var19 = awt.field_4177.equals(var5.getBlock(var12, var13 - 1, var14).method_2424());
         }

         if(!var19) {
            return this.field_7752.method_176(var1, var2);
         }

         var16 = 0.0D;
      }

      class_701 var20 = new class_701;
      var20.method_4043(var5, var6, var8 + var16, var10);
      class_701 var18 = var20;
      var5.method_2089(var18);
      var2.method_3729(1);
      return var2;
   }

   // $FF: renamed from: b (qH) void
   protected void method_7942(class_48 var1) {
      var1.method_182().method_2210(1000, var1.method_183(), var1.method_184(), var1.method_185(), 0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "\\Y¤3Öâ$oZ".toCharArray();
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
            field_7753 = (new String((char[])var4)).intern();
            String var2 = field_7753;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 205;
            break;
         case 1:
            var10009 = 14;
            break;
         case 2:
            var10009 = 64;
            break;
         case 3:
            var10009 = 119;
            break;
         case 4:
            var10009 = 138;
            break;
         case 5:
            var10009 = 29;
            break;
         default:
            var10009 = 248;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

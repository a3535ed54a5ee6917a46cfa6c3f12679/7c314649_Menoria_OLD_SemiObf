
// $FF: renamed from: fE
public class class_411 extends class_407 {

   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2119;


   // $FF: renamed from: <init> () void
   public void method_2653() {
      super.method_2427(awt.field_4171);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: c (int) vL
   protected IIcon method_2648(int var1) {
      return this.field_2010;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2119;
      this.field_2112 = var1.method_375(var10002.append("_top").toString());
      this.field_2010 = var1.method_375(this.method_2533() + "_side");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Á·ÒÿÆ±Æ";
      int var4 = "Á·ÒÿÆ±Æ".length();
      char var1 = 5;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2119 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 103;
               break;
            case 1:
               var10009 = 142;
               break;
            case 2:
               var10009 = 226;
               break;
            case 3:
               var10009 = 138;
               break;
            case 4:
               var10009 = 166;
               break;
            case 5:
               var10009 = 202;
               break;
            default:
               var10009 = 45;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

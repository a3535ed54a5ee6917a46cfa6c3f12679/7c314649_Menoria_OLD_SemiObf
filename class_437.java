
// $FF: renamed from: eO
public class class_437 extends aji {

   // $FF: renamed from: M vL
   private IIcon field_2169;
   // $FF: renamed from: N vL
   private IIcon field_2170;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2171;


   // $FF: renamed from: <init> () void
   protected void method_2750() {
      super.method_2427(awt.field_4173);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            return this.field_2169;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(var10000 == 0) {
            return class_1192.field_6030.getBlockTextureFromSide(var1);
         }

         var10000 = var1;
      }

      byte var10001 = 2;
      if(var3 != null) {
         if(var10000 == 2) {
            return this.field_2170;
         }

         var10000 = var1;
         var10001 = 4;
      }

      if(var10000 != var10001) {
         return this.field_2010;
      } else {
         return this.field_2170;
      }
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2171;
      this.field_2010 = var1.method_375(var10002.append("_side").toString());
      this.field_2169 = var1.method_375(this.method_2533() + "_top");
      this.field_2170 = var1.method_375(this.method_2533() + "_front");
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var10 != null) {
         if(var1.field_1832) {
            return true;
         }

         var5.method_4581(var2, var3, var4);
         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = ": 3(,¸=\'³";
      int var4 = ": 3(,¸=\'³".length();
      char var1 = 4;
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
                  field_2171 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 237;
               break;
            case 1:
               var10009 = 100;
               break;
            case 2:
               var10009 = 69;
               break;
            case 3:
               var10009 = 105;
               break;
            case 4:
               var10009 = 252;
               break;
            case 5:
               var10009 = 64;
               break;
            default:
               var10009 = 254;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

import java.util.Random;

// $FF: renamed from: fp
public class class_365 extends aji {

   // $FF: renamed from: M vL
   private IIcon field_2027;
   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2028;


   // $FF: renamed from: <init> () void
   protected void method_2551() {
      super.method_2427(awt.field_4198);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            return this.field_2027;
         }

         var10000 = var1;
      }

      if(var10000 != 0) {
         return this.field_2010;
      } else {
         return this.field_2027;
      }
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5217;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 3 + var1.nextInt(5);
   }

   // $FF: renamed from: a (int, java.util.Random) int
   public int method_2504(int var1, Random var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = this.method_2463(var2) + var2.nextInt(1 + var1);
      String[] var3 = var10000;
      int var5 = var4;
      if(var3 != null) {
         if(var4 > 9) {
            var4 = 9;
         }

         var5 = var4;
      }

      return var5;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2028;
      this.field_2010 = var1.method_375(var10002.append("_side").toString());
      this.field_2027 = var1.method_375(this.method_2533() + "_top");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "S\\û2S[ý";
      int var4 = "S\\û2S[ý".length();
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
                  field_2028 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 177;
               break;
            case 1:
               var10009 = 146;
               break;
            case 2:
               var10009 = 47;
               break;
            case 3:
               var10009 = 79;
               break;
            case 4:
               var10009 = 234;
               break;
            case 5:
               var10009 = 236;
               break;
            default:
               var10009 = 217;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

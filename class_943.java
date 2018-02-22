import java.util.Random;

// $FF: renamed from: cV
public class class_943 extends class_940 {

   // $FF: renamed from: F java.lang.String[]
   private static final String[] field_4815;


   // $FF: renamed from: <init> (int, int) void
   public void method_5498(int var1, int var2) {
      super.method_5479(var1, var2, class_93.field_35);
      String[] var10001 = field_4815;
      this.method_5488("thorns");
   }

   // $FF: renamed from: b (int) int
   public int method_5483(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   // $FF: renamed from: c (int) int
   public int method_5484(int var1) {
      return super.method_5483(var1) + 50;
   }

   // $FF: renamed from: c () int
   public int method_5482() {
      return 3;
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_5491(add var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1.method_3730() instanceof class_525;
      if(var2 != null) {
         if(var10000) {
            return true;
         }

         var10000 = super.method_5491(var1);
      }

      return var10000;
   }

   // $FF: renamed from: c (sv, sa, int) void
   public void method_5493(class_752 var1, class_689 var2, int var3) {
      String[] var4;
      add var6;
      add var8;
      label35: {
         String[] var10000 = class_752.method_4253();
         Random var5 = var1.method_4165();
         var4 = var10000;
         var6 = class_980.method_5661(class_940.field_4791, var1);
         boolean var7 = method_5499(var3, var5);
         if(var4 != null) {
            if(!var7) {
               break label35;
            }

            var2.method_3896(class_1691.method_9333(var1), (float)method_5500(var3, var5));
         }

         String[] var10001 = field_4815;
         var2.method_3868("damage.thorns", 0.5F, 1.0F);
         var8 = var6;
         if(var4 != null) {
            if(var6 == null) {
               return;
            }

            var8 = var6;
         }

         var8.method_3749(3, var1);
         if(var4 != null) {
            return;
         }
      }

      var8 = var6;
      if(var4 != null) {
         if(var6 == null) {
            return;
         }

         var8 = var6;
      }

      var8.method_3749(1, var1);
   }

   // $FF: renamed from: b (int, java.util.Random) boolean
   public static boolean method_5499(int var0, Random var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var0;
      if(var2 != null) {
         if(var0 <= 0) {
            return false;
         }

         float var3;
         var10000 = (var3 = var1.nextFloat() - 0.15F * (float)var0) == 0.0F?0:(var3 < 0.0F?-1:1);
      }

      if(var2 != null) {
         var10000 = var10000 < 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (int, java.util.Random) int
   public static int method_5500(int var0, Random var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var0;
      int var10001 = 10;
      if(var2 != null) {
         if(var0 > 10) {
            return var0 - 10;
         }

         var10000 = 1;
         var10001 = var1.nextInt(4);
      }

      return var10000 + var10001;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5494() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ÌZ-~£\rÜX>wµ8ÌZ-~£";
      int var4 = "ÌZ-~£\rÜX>wµ8ÌZ-~£".length();
      char var1 = 6;
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
                  field_4815 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 37;
               break;
            case 1:
               var10009 = 224;
               break;
            case 2:
               var10009 = 168;
               break;
            case 3:
               var10009 = 194;
               break;
            case 4:
               var10009 = 141;
               break;
            case 5:
               var10009 = 77;
               break;
            default:
               var10009 = 139;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

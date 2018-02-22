
// $FF: renamed from: x7
public class class_1719 extends class_1718 {

   // $FF: renamed from: e double
   private final double field_9016;
   // $FF: renamed from: f double
   private final double field_9017;
   // $FF: renamed from: g java.lang.String
   private String field_9018;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9019;


   // $FF: renamed from: <init> (java.lang.String, double, double, double) void
   public void method_9608(String var1, double var2, double var4, double var6) {
      super.method_9605(var1, var2);
      this.field_9016 = var4;
      this.field_9017 = var6;
      IllegalArgumentException var10000;
      String[] var8;
      if(var4 > var6) {
         var10000 = new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
         var8 = field_9019;
         throw var10000;
      } else {
         try {
            if(var2 < var4) {
               var10000 = new IllegalArgumentException("Default value cannot be lower than minimum value!");
               var8 = field_9019;
               throw var10000;
            }
         } catch (IllegalArgumentException var10) {
            throw method_9611(var10);
         }

         try {
            if(var2 > var6) {
               var10000 = new IllegalArgumentException("Default value cannot be bigger than maximum value!");
               String[] var10002 = field_9019;
               throw var10000;
            }
         } catch (IllegalArgumentException var9) {
            throw method_9611(var9);
         }
      }
   }

   // $FF: renamed from: b (java.lang.String) x7
   public class_1719 method_9609(String var1) {
      this.field_9018 = var1;
      return this;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_9610() {
      return this.field_9018;
   }

   // $FF: renamed from: b (double) double
   public double method_385(double var1) {
      String[] var3 = class_752.method_4253();

      int var10000;
      double var6;
      label34: {
         label33: {
            try {
               double var7;
               var10000 = (var7 = var1 - this.field_9016) == 0.0D?0:(var7 < 0.0D?-1:1);
               if(var3 == null) {
                  break label34;
               }

               if(var10000 >= 0) {
                  break label33;
               }
            } catch (IllegalArgumentException var5) {
               throw method_9611(var5);
            }

            var1 = this.field_9016;
         }

         try {
            var6 = var1;
            if(var3 == null) {
               return var6;
            }

            double var8;
            var10000 = (var8 = var1 - this.field_9017) == 0.0D?0:(var8 < 0.0D?-1:1);
         } catch (IllegalArgumentException var4) {
            throw method_9611(var4);
         }
      }

      if(var10000 > 0) {
         var1 = this.field_9017;
      }

      var6 = var1;
      return var6;
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_9611(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9607() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "X5aä><&fé>Ï1ië$Ï~5\'é$npsí*Ïq9iì&<&fé>Î2Q9iì&<&fé>Ï1ië$Ï~5\'ç\"y\"\'ñ#<=fý\"qpqä\'=2X5aä><&fé>Ï1ië$Ï~5\'ç\"y\"\'ñ#<=fý\"qpqä\'=";
      int var4 = "X5aä><&fé>Ï1ië$Ï~5\'é$npsí*Ïq9iì&<&fé>Î2Q9iì&<&fé>Ï1ië$Ï~5\'ç\"y\"\'ñ#<=fý\"qpqä\'=2X5aä><&fé>Ï1ië$Ï~5\'ç\"y\"\'ñ#<=fý\"qpqä\'=".length();
      char var1 = 49;
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
                  field_9019 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 194;
               break;
            case 1:
               var10009 = 142;
               break;
            case 2:
               var10009 = 217;
               break;
            case 3:
               var10009 = 91;
               break;
            case 4:
               var10009 = 149;
               break;
            case 5:
               var10009 = 44;
               break;
            default:
               var10009 = 49;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

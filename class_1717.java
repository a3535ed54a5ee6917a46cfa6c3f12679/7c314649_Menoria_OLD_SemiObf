
// $FF: renamed from: vt
public final class class_1717 implements Comparable {

   // $FF: renamed from: b double
   public double field_9008;
   // $FF: renamed from: c double
   public double field_9009;
   // $FF: renamed from: d java.lang.String
   public String field_9010;
   // $FF: renamed from: e java.lang.String
   private static final String field_9011 = "CL_00001498";


   // $FF: renamed from: <init> (java.lang.String, double, double) void
   public void method_9601(String var1, double var2, double var4) {
      super();
      this.field_9010 = var1;
      this.field_9008 = var2;
      this.field_9009 = var4;
   }

   // $FF: renamed from: b (vt) int
   public int method_9602(class_1717 var1) {
      int var10000;
      class_1717 var3;
      label26: {
         String[] var2 = class_752.method_4253();
         double var4;
         var10000 = (var4 = var1.field_9008 - this.field_9008) == 0.0D?0:(var4 < 0.0D?-1:1);
         if(var2 != null) {
            if(var10000 < 0) {
               var10000 = -1;
               return var10000;
            }

            var3 = var1;
            if(var2 == null) {
               break label26;
            }

            double var5;
            var10000 = (var5 = var1.field_9008 - this.field_9008) == 0.0D?0:(var5 < 0.0D?-1:1);
         }

         if(var10000 > 0) {
            var10000 = 1;
            return var10000;
         }

         var3 = var1;
      }

      var10000 = var3.field_9010.compareTo(this.field_9010);
      return var10000;
   }

   // $FF: renamed from: b () int
   public int method_9603() {
      return (this.field_9010.hashCode() & 11184810) + 4473924;
   }

   public int compareTo(Object var1) {
      return this.method_9602((class_1717)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9604() {
      boolean var10000 = true;
      char[] var10003 = "´)Å3T½ÆQþÍ".toCharArray();
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
            field_9011 = (new String((char[])var4)).intern();
            String var2 = field_9011;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 21;
            break;
         case 1:
            var10009 = 135;
            break;
         case 2:
            var10009 = 37;
            break;
         case 3:
            var10009 = 23;
            break;
         case 4:
            var10009 = 225;
            break;
         case 5:
            var10009 = 134;
            break;
         default:
            var10009 = 111;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}


// $FF: renamed from: de
public class class_1035 {

   // $FF: renamed from: b int
   public final int field_5475;
   // $FF: renamed from: c int
   public final int field_5476;
   // $FF: renamed from: d java.lang.String
   private static final String field_5477;
   // $FF: renamed from: e int
   private int field_5478;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5479;


   // $FF: renamed from: <init> (int, int) void
   public void method_5856(int var1, int var2) {
      super();
      this.field_5478 = 0;
      this.field_5475 = var1;
      this.field_5476 = var2;
   }

   // $FF: renamed from: b (int, int) long
   public static long method_5857(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public int hashCode() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_5478;
      if(var1 != null) {
         if(this.field_5478 == 0) {
            int var2 = 1664525 * this.field_5475 + 1013904223;
            int var3 = 1664525 * (this.field_5476 ^ -559038737) + 1013904223;
            this.field_5478 = var2 ^ var3;
         }

         var10000 = this.field_5478;
      }

      return var10000;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if(var2 != null) {
         if(!(var10000 instanceof class_1035)) {
            return false;
         }

         var10000 = var1;
      }

      int var4;
      label34: {
         class_1035 var3 = (class_1035)var10000;
         var4 = this.field_5475;
         int var10001 = var3.field_5475;
         if(var2 != null) {
            if(this.field_5475 != var3.field_5475) {
               break label34;
            }

            var4 = this.field_5476;
            if(var2 == null) {
               return (boolean)var4;
            }

            var10001 = var3.field_5476;
         }

         if(var4 == var10001) {
            var4 = 1;
            return (boolean)var4;
         }
      }

      var4 = 0;
      return (boolean)var4;
   }

   // $FF: renamed from: b () int
   public int method_5858() {
      return (this.field_5475 << 4) + 8;
   }

   // $FF: renamed from: c () int
   public int method_5859() {
      return (this.field_5476 << 4) + 8;
   }

   // $FF: renamed from: b (int) dd
   public class_1034 method_5860(int var1) {
      class_1034 var10000 = new class_1034;
      var10000.method_5854(this.method_5858(), var1, this.method_5859());
      return var10000;
   }

   public String toString() {
      StringBuilder var10000 = (new StringBuilder()).append("[").append(this.field_5475);
      String[] var10001 = field_5479;
      return var10000.append(", ").append(this.field_5476).append("]").toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5861() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Ñõ½\'óF¾ÁÀKð";
      int var4 = "Ñõ½\'óF¾ÁÀKð".length();
      char var1 = 2;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5479 = var5;
                  String[] var10 = field_5479;
                  field_5477 = "CL_00000133";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 19;
               break;
            case 1:
               var10009 = 84;
               break;
            case 2:
               var10009 = 221;
               break;
            case 3:
               var10009 = 102;
               break;
            case 4:
               var10009 = 211;
               break;
            case 5:
               var10009 = 43;
               break;
            default:
               var10009 = 84;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

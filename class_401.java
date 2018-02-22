
// $FF: renamed from: en
public class class_401 extends class_400 {

   // $FF: renamed from: N int
   private final int field_2101;
   // $FF: renamed from: O java.lang.String
   private static final String field_2102 = "CL_00000334";


   // $FF: renamed from: <init> (java.lang.String, awt, int) void
   protected void method_2640(String var1, awt var2, int var3) {
      super.method_2632(var1, var2);
      this.field_2101 = var3;
   }

   // $FF: renamed from: h (ahb, int, int, int) int
   protected int method_2637(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = Math.min(var1.method_2157(class_689.class, this.method_2635(var2, var3, var4)).size(), this.field_2101);
      String[] var5 = var10000;
      int var8 = var6;
      if(var5 != null) {
         if(var6 <= 0) {
            return 0;
         }

         var8 = Math.min(this.field_2101, var6);
      }

      float var7 = (float)var8 / (float)this.field_2101;
      return class_1715.method_9566(var7 * 15.0F);
   }

   // $FF: renamed from: d (int) int
   protected int method_2638(int var1) {
      return var1;
   }

   // $FF: renamed from: k (int) int
   protected int method_2639(int var1) {
      return var1;
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 10;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "ÀJyzx³5ù".toCharArray();
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
            field_2102 = (new String((char[])var4)).intern();
            String var2 = field_2102;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 14;
            break;
         case 1:
            var10009 = 139;
            break;
         case 2:
            var10009 = 71;
            break;
         case 3:
            var10009 = 175;
            break;
         case 4:
            var10009 = 196;
            break;
         case 5:
            var10009 = 199;
            break;
         default:
            var10009 = 197;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

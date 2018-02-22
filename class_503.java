
// $FF: renamed from: a1
class class_503 extends class_492 {

   // $FF: renamed from: a aR
   private final class_492 field_2318;
   // $FF: renamed from: g java.lang.String
   private static final String field_2319 = "CL_00000754";
   // $FF: renamed from: h lO
   final class_228 field_2320;


   // $FF: renamed from: <init> (lO, aR, int) void
   public void method_2905(class_228 var1, class_492 var2, int var3) {
      this.field_2320 = var1;
      super.method_2869(var2.field_2286, var3, 0, 0);
      this.field_2318 = var2;
   }

   // $FF: renamed from: b (yz, add) void
   public void method_2873(class_792 var1, add var2) {
      this.field_2318.method_2873(var1, var2);
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      return this.field_2318.method_2874(var1);
   }

   // $FF: renamed from: a () add
   public add method_2875() {
      return this.field_2318.method_2875();
   }

   // $FF: renamed from: b () boolean
   public boolean method_2876() {
      return this.field_2318.method_2876();
   }

   // $FF: renamed from: d (add) void
   public void method_2877(add var1) {
      this.field_2318.method_2877(var1);
   }

   // $FF: renamed from: c () void
   public void method_2878() {
      this.field_2318.method_2878();
   }

   // $FF: renamed from: d () int
   public int method_2879() {
      return this.field_2318.method_2879();
   }

   // $FF: renamed from: e () vL
   public IIcon method_2880() {
      return this.field_2318.method_2880();
   }

   // $FF: renamed from: b (int) add
   public add method_2881(int var1) {
      return this.field_2318.method_2881(var1);
   }

   // $FF: renamed from: b (vI, int) boolean
   public boolean method_2882(class_22 var1, int var2) {
      return this.field_2318.method_2882(var1, var2);
   }

   // $FF: renamed from: b (a1) aR
   static class_492 method_2906(class_503 var0) {
      return var0.field_2318;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2907() {
      boolean var10000 = true;
      char[] var10003 = "Dìæ\ro&ÿ?â".toCharArray();
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
            field_2319 = (new String((char[])var4)).intern();
            String var2 = field_2319;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 26;
            break;
         case 1:
            var10009 = 221;
            break;
         case 2:
            var10009 = 102;
            break;
         case 3:
            var10009 = 3;
            break;
         case 4:
            var10009 = 232;
            break;
         case 5:
            var10009 = 138;
            break;
         default:
            var10009 = 195;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

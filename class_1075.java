
// $FF: renamed from: h0
class class_1075 {

   // $FF: renamed from: b java.lang.Class
   public Class field_5666;
   // $FF: renamed from: c int
   public final int field_5667;
   // $FF: renamed from: d int
   public int field_5668;
   // $FF: renamed from: e int
   public int field_5669;
   // $FF: renamed from: f java.lang.String
   private static final String field_5670 = "CL_00000492";


   // $FF: renamed from: <init> (java.lang.Class, int, int) void
   public void method_6104(Class var1, int var2, int var3) {
      super();
      this.field_5666 = var1;
      this.field_5667 = var2;
      this.field_5669 = var3;
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_6105(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_5669;
      if(var2 != null) {
         if(this.field_5669 != 0) {
            var10000 = this.field_5668;
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(this.field_5668 >= this.field_5669) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b () boolean
   public boolean method_6106() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_5669;
      if(var1 != null) {
         if(this.field_5669 != 0) {
            var10000 = this.field_5668;
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(this.field_5668 >= this.field_5669) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6107() {
      boolean var10000 = true;
      char[] var10003 = "Õ\nãºÆçá¦r¸".toCharArray();
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
            field_5670 = (new String((char[])var4)).intern();
            String var2 = field_5670;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 119;
            break;
         case 1:
            var10009 = 167;
            break;
         case 2:
            var10009 = 93;
            break;
         case 3:
            var10009 = 107;
            break;
         case 4:
            var10009 = 23;
            break;
         case 5:
            var10009 = 54;
            break;
         default:
            var10009 = 48;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

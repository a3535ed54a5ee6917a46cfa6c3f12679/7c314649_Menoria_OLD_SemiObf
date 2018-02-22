
// $FF: renamed from: da
class class_984 extends class_982 {

   // $FF: renamed from: g java.lang.String
   private static final String field_4970 = "CL_00000361";
   // $FF: renamed from: p gw
   final class_584 field_4971;


   // $FF: renamed from: <init> (gw) void
   void method_5690(class_584 var1) {
      this.field_4971 = var1;
      super.method_5670();
   }

   // $FF: renamed from: b (int) void
   public void method_5683(int var1) {
      this.field_4971.field_2464.method_2193(this.field_4971.field_2465, this.field_4971.field_2466, this.field_4971.field_2467, class_1192.field_6079, var1, 0);
   }

   // $FF: renamed from: g () ahb
   public ahb method_5684() {
      return this.field_4971.field_2464;
   }

   // $FF: renamed from: h () int
   public int method_5685() {
      return this.field_4971.field_2465;
   }

   // $FF: renamed from: i () int
   public int method_5686() {
      return this.field_4971.field_2466;
   }

   // $FF: renamed from: j () int
   public int method_5687() {
      return this.field_4971.field_2467;
   }

   // $FF: renamed from: b (vB) void
   public void method_5682(class_1654 var1) {
      super.method_5682(var1);
      String[] var2 = class_752.method_4253();
      ahb var10000 = this.method_5684();
      if(var2 != null) {
         if(var10000 == null) {
            return;
         }

         var10000 = this.method_5684();
      }

      var10000.method_2059(this.field_4971.field_2465, this.field_4971.field_2466, this.field_4971.field_2467);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5688() {
      boolean var10000 = true;
      char[] var10003 = ">è|¸«M}}".toCharArray();
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
            field_4970 = (new String((char[])var4)).intern();
            String var2 = field_4970;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 190;
            break;
         case 1:
            var10009 = 103;
            break;
         case 2:
            var10009 = 136;
            break;
         case 3:
            var10009 = 143;
            break;
         case 4:
            var10009 = 112;
            break;
         case 5:
            var10009 = 75;
            break;
         default:
            var10009 = 88;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

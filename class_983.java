
// $FF: renamed from: db
class class_983 extends class_982 {

   // $FF: renamed from: g java.lang.String
   private static final String field_4968 = "CL_00001679";
   // $FF: renamed from: p xy
   final class_692 field_4969;


   // $FF: renamed from: <init> (xy) void
   void method_5689(class_692 var1) {
      this.field_4969 = var1;
      super.method_5670();
   }

   // $FF: renamed from: b (int) void
   public void method_5683(int var1) {
      this.field_4969.field_2990.method_2191(this.field_4969, (byte)var1);
   }

   // $FF: renamed from: g () ahb
   public ahb method_5684() {
      return this.field_4969.field_2990;
   }

   // $FF: renamed from: h () int
   public int method_5685() {
      return class_1715.method_9561(this.field_4969.field_2994);
   }

   // $FF: renamed from: i () int
   public int method_5686() {
      return class_1715.method_9561(this.field_4969.field_2995);
   }

   // $FF: renamed from: j () int
   public int method_5687() {
      return class_1715.method_9561(this.field_4969.field_2996);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5688() {
      boolean var10000 = true;
      char[] var10003 = "?8Ïµ<äEPÆ".toCharArray();
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
            field_4968 = (new String((char[])var4)).intern();
            String var2 = field_4968;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 29;
            break;
         case 1:
            var10009 = 187;
            break;
         case 2:
            var10009 = 175;
            break;
         case 3:
            var10009 = 55;
            break;
         case 4:
            var10009 = 77;
            break;
         case 5:
            var10009 = 120;
            break;
         default:
            var10009 = 196;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

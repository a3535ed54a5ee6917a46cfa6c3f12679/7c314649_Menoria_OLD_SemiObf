import java.io.ByteArrayOutputStream;

// $FF: renamed from: s
class class_127 extends ByteArrayOutputStream {

   // $FF: renamed from: a int
   private int field_267;
   // $FF: renamed from: b int
   private int field_268;
   // $FF: renamed from: c java.lang.String
   private static final String field_269 = "CL_00000382";
   // $FF: renamed from: d gQ
   final class_1079 field_270;


   // $FF: renamed from: <init> (gQ, int, int) void
   public void method_586(class_1079 var1, int var2, int var3) {
      this.field_270 = var1;
      super(8096);
      this.field_267 = var2;
      this.field_268 = var3;
   }

   public void close() {
      this.field_270.method_6113(this.field_267, this.field_268, this.buf, this.count);
   }

   // $FF: renamed from: <clinit> () void
   static void method_587() {
      boolean var10000 = true;
      char[] var10003 = "[YhÈéçI(&Ê".toCharArray();
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
            field_269 = (new String((char[])var4)).intern();
            String var2 = field_269;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 143;
            break;
         case 1:
            var10009 = 130;
            break;
         case 2:
            var10009 = 160;
            break;
         case 3:
            var10009 = 111;
            break;
         case 4:
            var10009 = 78;
            break;
         case 5:
            var10009 = 64;
            break;
         default:
            var10009 = 238;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

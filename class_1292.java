
// $FF: renamed from: jN
public class class_1292 {

   // $FF: renamed from: b byte
   public byte field_6632;
   // $FF: renamed from: c byte
   public byte field_6633;
   // $FF: renamed from: d byte
   public byte field_6634;
   // $FF: renamed from: e byte
   public byte field_6635;
   // $FF: renamed from: f java.lang.String
   private static final String field_6636 = "CL_00000579";
   // $FF: renamed from: g jQ
   final class_1296 field_6637;


   // $FF: renamed from: <init> (jQ, byte, byte, byte, byte) void
   public void method_6766(class_1296 var1, byte var2, byte var3, byte var4, byte var5) {
      this.field_6637 = var1;
      super();
      this.field_6632 = var2;
      this.field_6633 = var3;
      this.field_6634 = var4;
      this.field_6635 = var5;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6767() {
      boolean var10000 = true;
      char[] var10003 = "8üÅb°Kíüõ".toCharArray();
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
            field_6636 = (new String((char[])var4)).intern();
            String var2 = field_6636;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 133;
            break;
         case 1:
            var10009 = 38;
            break;
         case 2:
            var10009 = 53;
            break;
         case 3:
            var10009 = 50;
            break;
         case 4:
            var10009 = 11;
            break;
         case 5:
            var10009 = 172;
            break;
         default:
            var10009 = 126;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

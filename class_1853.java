
// $FF: renamed from: ze
public class class_1853 implements class_83 {

   // $FF: renamed from: b int
   public int field_9460;
   // $FF: renamed from: c int
   public int field_9461;
   // $FF: renamed from: d java.lang.String
   private static final String field_9462 = "CL_00001643";


   // $FF: renamed from: <init> (int, int) void
   public void method_10041(int var1, int var2) {
      super();
      this.field_9460 = var1;
      this.field_9461 = var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_10042() {
      boolean var10000 = true;
      char[] var10003 = "G×/;N5­o,".toCharArray();
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
            field_9462 = (new String((char[])var4)).intern();
            String var2 = field_9462;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 84;
            break;
         case 1:
            var10009 = 203;
            break;
         case 2:
            var10009 = 11;
            break;
         case 3:
            var10009 = 79;
            break;
         case 4:
            var10009 = 91;
            break;
         case 5:
            var10009 = 117;
            break;
         default:
            var10009 = 46;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

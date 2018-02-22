
// $FF: renamed from: xS
public class class_1777 {

   // $FF: renamed from: b int
   public final int field_9280;
   // $FF: renamed from: c int
   public final int field_9281;
   // $FF: renamed from: d int
   public final int field_9282;
   // $FF: renamed from: e u2
   public final class_1601 field_9283;
   // $FF: renamed from: f u2
   public final class_1601 field_9284;
   // $FF: renamed from: g java.lang.String
   private static final String field_9285 = "CL_00001539";


   // $FF: renamed from: <init> (int, int, int) void
   public void method_9773(int var1, int var2, int var3) {
      super();
      this.field_9280 = var1;
      this.field_9281 = var2;
      this.field_9282 = var3;
      this.field_9283 = class_1698.method_9392(this);
      this.field_9284 = class_1698.method_9393(this);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9774() {
      boolean var10000 = true;
      char[] var10003 = "Mçj!¸)Ø?(".toCharArray();
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
            field_9285 = (new String((char[])var4)).intern();
            String var2 = field_9285;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 34;
            break;
         case 1:
            var10009 = 135;
            break;
         case 2:
            var10009 = 25;
            break;
         case 3:
            var10009 = 61;
            break;
         case 4:
            var10009 = 164;
            break;
         case 5:
            var10009 = 53;
            break;
         default:
            var10009 = 196;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

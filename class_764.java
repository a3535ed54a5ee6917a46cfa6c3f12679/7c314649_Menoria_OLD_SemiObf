
// $FF: renamed from: wV
public abstract class class_764 extends class_761 implements class_9 {

   // $FF: renamed from: gb java.lang.String
   private static final String field_3457 = "none";


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {}

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      return "none";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      return "none";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      return "none";
   }

   // $FF: renamed from: q () int
   public int method_4263() {
      return 120;
   }

   // $FF: renamed from: v () boolean
   protected boolean method_4269() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      boolean var10000 = true;
      char[] var10003 = "#4¥¶".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_3457 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 135;
            break;
         case 1:
            var10009 = 145;
            break;
         case 2:
            var10009 = 1;
            break;
         case 3:
            var10009 = 25;
            break;
         case 4:
            var10009 = 43;
            break;
         case 5:
            var10009 = 121;
            break;
         default:
            var10009 = 101;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

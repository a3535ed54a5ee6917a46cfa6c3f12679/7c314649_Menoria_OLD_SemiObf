
// $FF: renamed from: d3
public class class_469 extends aji {

   // $FF: renamed from: M java.lang.String
   private static final String field_2242 = "CL_00000190";


   // $FF: renamed from: <init> () void
   protected void method_2820() {
      super.method_2427(awt.field_4170);
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return -1;
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (int, boolean) boolean
   public boolean method_2454(int var1, boolean var2) {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {}

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "tÐUìgÎ#­3ì".toCharArray();
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
            field_2242 = (new String((char[])var4)).intern();
            String var2 = field_2242;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 51;
            break;
         case 1:
            var10009 = 152;
            break;
         case 2:
            var10009 = 14;
            break;
         case 3:
            var10009 = 216;
            break;
         case 4:
            var10009 = 83;
            break;
         case 5:
            var10009 = 250;
            break;
         default:
            var10009 = 23;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

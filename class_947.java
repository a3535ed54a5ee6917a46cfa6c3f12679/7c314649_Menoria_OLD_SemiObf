
// $FF: renamed from: cR
public class class_947 extends class_940 {

   // $FF: renamed from: C java.lang.String
   private static final String field_4824;
   // $FF: renamed from: F java.lang.String[]
   private static final String[] field_4825;


   // $FF: renamed from: <init> (int, int) void
   protected void method_5505(int var1, int var2) {
      super.method_5479(var1, var2, class_93.field_37);
      String[] var10001 = field_4825;
      this.method_5488("knockback");
   }

   // $FF: renamed from: b (int) int
   public int method_5483(int var1) {
      return 5 + 20 * (var1 - 1);
   }

   // $FF: renamed from: c (int) int
   public int method_5484(int var1) {
      return super.method_5483(var1) + 50;
   }

   // $FF: renamed from: c () int
   public int method_5482() {
      return 0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5494() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ôÔrùÙø!©ñ\tÜöBªªpÔó";
      int var4 = "ôÔrùÙø!©ñ\tÜöBªªpÔó".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_4825 = var5;
                  String[] var10 = field_4825;
                  field_4824 = "CL_00000118";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 184;
               break;
            case 1:
               var10009 = 151;
               break;
            case 2:
               var10009 = 34;
               break;
            case 3:
               var10009 = 198;
               break;
            case 4:
               var10009 = 230;
               break;
            case 5:
               var10009 = 199;
               break;
            default:
               var10009 = 30;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

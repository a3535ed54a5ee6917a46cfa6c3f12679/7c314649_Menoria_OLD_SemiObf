import java.io.IOException;

// $FF: renamed from: pq
public class class_1510 implements class_55 {

   // $FF: renamed from: b bqx
   private static final bqx field_7950;
   // $FF: renamed from: c java.lang.String
   private static final String field_7951;


   // $FF: renamed from: <init> () void
   public void method_8193() {
      super();
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy var1) {
      try {
         class_1040.method_5890(bqi.method_8167(var1, field_7950));
      } catch (IOException var3) {
         ;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_8194() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "X7ë\t¬ÿe0?º0s®Kù½zdh·Vî£4w(¼Ký½&)wµ^";
      int var5 = "X7ë\t¬ÿe0?º0s®Kù½zdh·Vî£4w(¼Ký½&)wµ^".length();
      char var2 = 11;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  field_7951 = "CL_00001078";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/colormap/grass.png");
                  field_7950 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 207;
               break;
            case 1:
               var10009 = 84;
               break;
            case 2:
               var10009 = 6;
               break;
            case 3:
               var10009 = 6;
               break;
            case 4:
               var10009 = 218;
               break;
            case 5:
               var10009 = 56;
               break;
            default:
               var10009 = 157;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

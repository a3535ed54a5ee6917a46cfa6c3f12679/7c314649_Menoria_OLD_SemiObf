import java.io.IOException;

// $FF: renamed from: pp
public class class_1509 implements class_55 {

   // $FF: renamed from: b bqx
   private static final bqx field_7948;
   // $FF: renamed from: c java.lang.String
   private static final String field_7949;


   // $FF: renamed from: <init> () void
   public void method_8191() {
      super();
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy var1) {
      try {
         class_1037.method_5868(bqi.method_8167(var1, field_7948));
      } catch (IOException var3) {
         ;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_8192() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "Ýóé,lèò1{Ùû²1eÙìøC.g¥ôÔ­]n9×¼ª";
      int var5 = "Ýóé,lèò1{Ùû²1eÙìøC.g¥ôÔ­]n9×¼ª".length();
      char var2 = 29;
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
                  field_7949 = "CL_00001077";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/colormap/foliage.png");
                  field_7948 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 226;
               break;
            case 1:
               var10009 = 188;
               break;
            case 2:
               var10009 = 143;
               break;
            case 3:
               var10009 = 153;
               break;
            case 4:
               var10009 = 105;
               break;
            case 5:
               var10009 = 90;
               break;
            default:
               var10009 = 13;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}

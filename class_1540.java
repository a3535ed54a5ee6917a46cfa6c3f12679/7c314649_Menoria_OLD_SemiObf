
// $FF: renamed from: rL
public class class_1540 {

   // $FF: renamed from: b int
   private final int field_8080;
   // $FF: renamed from: c rN
   private final class_1544 field_8081;
   // $FF: renamed from: d java.lang.String
   private static final String field_8082;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8083;


   // $FF: renamed from: <init> (int, rN) void
   public void method_8361(int var1, class_1544 var2) {
      super();
      this.field_8080 = var1;
      this.field_8081 = var2;
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_8083;
      return var10000.append("PacketStat(").append(this.field_8080).append(")").append(this.field_8081).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8362() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "èâð±Ô¤ÌâçÝûÏÌÅäÇ»ªÀ";
      int var4 = "èâð±Ô¤ÌâçÝûÏÌÅäÇ»ªÀ".length();
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
                  field_8083 = var5;
                  String[] var10 = field_8083;
                  field_8082 = "CL_00001895";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            byte var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 12;
               break;
            case 1:
               var10009 = 55;
               break;
            case 2:
               var10009 = 39;
               break;
            case 3:
               var10009 = 65;
               break;
            case 4:
               var10009 = 96;
               break;
            case 5:
               var10009 = 20;
               break;
            default:
               var10009 = 67;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

import java.util.concurrent.Callable;

// $FF: renamed from: kw
class class_1358 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7137;
   // $FF: renamed from: b bao
   final bao field_7138;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7139;


   // $FF: renamed from: <init> (bao) void
   void setFocused6(bao var1) {
      this.field_7138 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String setFocused7() {
      String[] var10000 = field_7139;
      return "Client (map_client.txt)";
   }

   // $FF: renamed from: c () java.lang.Object
   public Object setFocused8() {
      return this.setFocused7();
   }

   // $FF: renamed from: <clinit> () void
   static void setFocused9() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\r»Bâ>:¾~Á.á\rt·`~®f|¢Qiâ\'s¦ ~ö:Þ";
      int var4 = "\r»Bâ>:¾~Á.á\rt·`~®f|¢Qiâ\'s¦ ~ö:Þ".length();
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
                  field_7139 = var5;
                  String[] var10 = field_7139;
                  field_7137 = "CL_00000633";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 223;
               break;
            case 1:
               var10009 = 102;
               break;
            case 2:
               var10009 = 140;
               break;
            case 3:
               var10009 = 67;
               break;
            case 4:
               var10009 = 159;
               break;
            case 5:
               var10009 = 155;
               break;
            default:
               var10009 = 31;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

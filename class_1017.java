
// $FF: renamed from: ct
public class class_1017 {

   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5383;


   // $FF: renamed from: <init> () void
   public void method_5780() {
      super();
   }

   // $FF: renamed from: b (cy) void
   public void method_5781(class_1031 var1) {
      add var10001 = new add;
      var10001.method_3724(class_1010.field_5140);
      var1.method_5838(var10001, new Object[]{class_1192.field_6066, class_1192.field_6067, class_1010.field_5139});
      var10001 = new add;
      var10001.method_3725(class_1010.field_5214, 8);
      Object[] var10002 = new Object[5];
      String[] var2 = field_5383;
      var10002[0] = "#X#";
      var10002[1] = Character.valueOf('X');
      add var10005 = new add;
      var10005.method_3726(class_1010.field_5208, 1, 3);
      var10002[2] = var10005;
      var10002[3] = Character.valueOf('#');
      var10002[4] = class_1010.field_5154;
      var1.method_5837(var10001, var10002);
      var10001 = new add;
      var10001.method_3721(class_1192.field_6128);
      var1.method_5837(var10001, new Object[]{"MMM", "MMM", "MMM", Character.valueOf('M'), class_1010.field_5217});
      var10001 = new add;
      var10001.method_3724(class_1010.field_5219);
      var1.method_5837(var10001, new Object[]{"M", Character.valueOf('M'), class_1010.field_5217});
      var10001 = new add;
      var10001.method_3725(class_1010.field_5218, 4);
      var1.method_5837(var10001, new Object[]{"M", Character.valueOf('M'), class_1192.field_6112});
      var10001 = new add;
      var10001.method_3724(class_1010.field_5256);
      var1.method_5838(var10001, new Object[]{class_1192.field_6112, class_1010.field_5210, class_1010.field_5201});
      var10001 = new add;
      var10001.method_3724(class_1010.field_5233);
      var1.method_5838(var10001, new Object[]{class_1010.field_5232, class_1192.field_6066, class_1010.field_5210});
      var10001 = new add;
      var10001.method_3725(class_1010.field_5234, 2);
      var1.method_5838(var10001, new Object[]{class_1010.field_5226});
      var10001 = new add;
      var10001.method_3724(class_1010.field_5235);
      var1.method_5838(var10001, new Object[]{class_1010.field_5234, class_1010.field_5199});
   }

   // $FF: renamed from: <clinit> () void
   static void method_5782() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ØkÍþ";
      int var4 = "ØkÍþ".length();
      char var1 = 3;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5383 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 142;
               break;
            case 1:
               var10009 = 83;
               break;
            case 2:
               var10009 = 27;
               break;
            case 3:
               var10009 = 229;
               break;
            case 4:
               var10009 = 82;
               break;
            case 5:
               var10009 = 17;
               break;
            default:
               var10009 = 184;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

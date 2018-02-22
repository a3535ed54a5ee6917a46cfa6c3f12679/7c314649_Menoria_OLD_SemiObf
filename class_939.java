
// $FF: renamed from: cG
public class class_939 {

   // $FF: renamed from: b java.lang.String[][]
   private String[][] field_4778;
   // $FF: renamed from: c java.lang.Object[][]
   private Object[][] field_4779;
   // $FF: renamed from: d java.lang.String
   private static final String field_4780;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_4781;


   // $FF: renamed from: <init> () void
   public void method_5476() {
      super();
      this.field_4778 = new String[][]{{"X", "X", "#"}};
      this.field_4779 = new Object[][]{{class_1192.field_6030, class_1192.field_6029, class_1010.field_5123, class_1010.field_5122, class_1010.field_5124, class_1010.field_5283, class_1010.field_5285, class_1010.field_5286, class_1010.field_5287, class_1010.field_5288}, {class_1010.field_5126, class_1010.field_5130, class_1010.field_5125, class_1010.field_5134, class_1010.field_5141, class_1010.field_5311, class_1010.field_5312, class_1010.field_5313, class_1010.field_5314, class_1010.field_5315}};
   }

   // $FF: renamed from: b (cy) void
   public void method_5477(class_1031 var1) {
      add var10001;
      for(int var2 = 0; var2 < this.field_4779[0].length; ++var2) {
         Object var3 = this.field_4779[0][var2];

         for(int var4 = 0; var4 < this.field_4779.length - 1; ++var4) {
            adb var5 = (adb)this.field_4779[var4 + 1][var2];
            var10001 = new add;
            var10001.method_3724(var5);
            var1.method_5837(var10001, new Object[]{this.field_4778[var4], Character.valueOf('#'), class_1010.field_5138, Character.valueOf('X'), var3});
         }
      }

      var10001 = new add;
      var10001.method_3725(class_1010.field_5119, 1);
      Object[] var10002 = new Object[7];
      String[] var6 = field_4781;
      var10002[0] = " #X";
      var10002[1] = "# X";
      var10002[2] = " #X";
      var10002[3] = Character.valueOf('X');
      var10002[4] = class_1010.field_5145;
      var10002[5] = Character.valueOf('#');
      var10002[6] = class_1010.field_5138;
      var1.method_5837(var10001, var10002);
      var10001 = new add;
      var10001.method_3725(class_1010.field_5120, 4);
      var1.method_5837(var10001, new Object[]{"X", "#", "Y", Character.valueOf('Y'), class_1010.field_5146, Character.valueOf('X'), class_1010.field_5176, Character.valueOf('#'), class_1010.field_5138});
      var10001 = new add;
      var10001.method_3725(class_1010.field_5349, 2);
      var1.method_5837(var10001, new Object[]{"X", "#", "Y", Character.valueOf('Y'), class_1010.field_5146, Character.valueOf('X'), class_1010.field_5234, Character.valueOf('#'), class_1010.field_5138});
      var10001 = new add;
      var10001.method_3725(class_1010.field_5350, 2);
      var1.method_5837(var10001, new Object[]{"X", "#", "Y", Character.valueOf('Y'), class_1010.field_5146, Character.valueOf('X'), class_1010.field_5232, Character.valueOf('#'), class_1010.field_5138});
      var10001 = new add;
      var10001.method_3725(class_1010.field_5351, 2);
      var1.method_5837(var10001, new Object[]{"X", "#", "Y", Character.valueOf('Y'), class_1010.field_5146, Character.valueOf('X'), class_1192.field_6057, Character.valueOf('#'), class_1010.field_5138});
      var10001 = new add;
      var10001.method_3725(class_1010.field_5352, 1);
      var1.method_5837(var10001, new Object[]{" #X", "# X", " #X", Character.valueOf('X'), class_1010.field_5145, Character.valueOf('#'), class_1010.field_5284});
   }

   // $FF: renamed from: <clinit> () void
   static void method_5478() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÃÐS5çú¿¶Té¯×ê¬×";
      int var4 = "ÃÐS5çú¿¶Té¯×ê¬×".length();
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
                  field_4781 = var5;
                  String[] var10 = field_4781;
                  field_4780 = "CL_00000097";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 203;
               break;
            case 1:
               var10009 = 142;
               break;
            case 2:
               var10009 = 142;
               break;
            case 3:
               var10009 = 98;
               break;
            case 4:
               var10009 = 4;
               break;
            case 5:
               var10009 = 162;
               break;
            default:
               var10009 = 214;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

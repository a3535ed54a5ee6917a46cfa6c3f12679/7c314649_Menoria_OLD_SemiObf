
// $FF: renamed from: cp
public class class_1013 {

   // $FF: renamed from: b java.lang.String[][]
   private String[][] field_5376;
   // $FF: renamed from: c java.lang.Object[][]
   private Object[][] field_5377;
   // $FF: renamed from: d java.lang.String
   private static final String field_5378;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5379;


   // $FF: renamed from: <init> () void
   public void method_5771() {
      super();
      String[][] var10001 = new String[4][];
      String[] var10004 = new String[2];
      String[] var1 = field_5379;
      var10004[0] = "XXX";
      var10004[1] = "X X";
      var10001[0] = var10004;
      var10001[1] = new String[]{"X X", "XXX", "XXX"};
      var10001[2] = new String[]{"XXX", "X X", "X X"};
      var10001[3] = new String[]{"X X", "X X"};
      this.field_5376 = var10001;
      this.field_5377 = new Object[][]{{class_1010.field_5192, class_1192.field_6078, class_1010.field_5123, class_1010.field_5122, class_1010.field_5124, class_1010.field_5283, class_1010.field_5285, class_1010.field_5286, class_1010.field_5287, class_1010.field_5288}, {class_1010.field_5156, class_1010.field_5160, class_1010.field_5164, class_1010.field_5168, class_1010.field_5172, class_1010.field_5290, class_1010.field_5294, class_1010.field_5298, class_1010.field_5302, class_1010.field_5306}, {class_1010.field_5157, class_1010.field_5161, class_1010.field_5165, class_1010.field_5169, class_1010.field_5173, class_1010.field_5291, class_1010.field_5295, class_1010.field_5299, class_1010.field_5303, class_1010.field_5307}, {class_1010.field_5158, class_1010.field_5162, class_1010.field_5166, class_1010.field_5170, class_1010.field_5174, class_1010.field_5292, class_1010.field_5296, class_1010.field_5300, class_1010.field_5304, class_1010.field_5308}, {class_1010.field_5159, class_1010.field_5163, class_1010.field_5167, class_1010.field_5171, class_1010.field_5175, class_1010.field_5293, class_1010.field_5297, class_1010.field_5301, class_1010.field_5305, class_1010.field_5309}};
   }

   // $FF: renamed from: b (cy) void
   public void method_5772(class_1031 var1) {
      for(int var2 = 0; var2 < this.field_5377[0].length; ++var2) {
         Object var3 = this.field_5377[0][var2];

         for(int var4 = 0; var4 < this.field_5377.length - 1; ++var4) {
            adb var5 = (adb)this.field_5377[var4 + 1][var2];
            add var10001 = new add;
            var10001.method_3724(var5);
            var1.method_5837(var10001, new Object[]{this.field_5376[var4], Character.valueOf('X'), var3});
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5773() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ñ\'ñêKöÐ$§7ñ_ñ";
      int var4 = "ñ\'ñêKöÐ$§7ñ_ñ".length();
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5379 = var5;
                  String[] var10 = field_5379;
                  field_5378 = "CL_00000080";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 55;
               break;
            case 1:
               var10009 = 153;
               break;
            case 2:
               var10009 = 55;
               break;
            case 3:
               var10009 = 183;
               break;
            case 4:
               var10009 = 126;
               break;
            case 5:
               var10009 = 138;
               break;
            default:
               var10009 = 9;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}


// $FF: renamed from: cF
public class class_938 {

   // $FF: renamed from: b java.lang.String[][]
   private String[][] field_4774;
   // $FF: renamed from: c java.lang.Object[][]
   private Object[][] field_4775;
   // $FF: renamed from: d java.lang.String
   private static final String field_4776;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_4777;


   // $FF: renamed from: <init> () void
   public void method_5473() {
      super();
      String[][] var10001 = new String[4][];
      String[] var10004 = new String[3];
      String[] var1 = field_4777;
      var10004[0] = "XXX";
      var10004[1] = " # ";
      var10004[2] = " # ";
      var10001[0] = var10004;
      var10001[1] = new String[]{"X", "#", "#"};
      var10001[2] = new String[]{"XX", "X#", " #"};
      var10001[3] = new String[]{"XX", " #", " #"};
      this.field_4774 = var10001;
      this.field_4775 = new Object[][]{{class_1192.field_6030, class_1192.field_6029, class_1010.field_5123, class_1010.field_5122, class_1010.field_5124, class_1010.field_5283, class_1010.field_5285, class_1010.field_5286, class_1010.field_5287, class_1010.field_5288}, {class_1010.field_5128, class_1010.field_5132, class_1010.field_5115, class_1010.field_5136, class_1010.field_5143, class_1010.field_5317, class_1010.field_5320, class_1010.field_5323, class_1010.field_5326, class_1010.field_5329}, {class_1010.field_5127, class_1010.field_5131, class_1010.field_5114, class_1010.field_5135, class_1010.field_5142, class_1010.field_5316, class_1010.field_5319, class_1010.field_5322, class_1010.field_5325, class_1010.field_5328}, {class_1010.field_5129, class_1010.field_5133, class_1010.field_5116, class_1010.field_5137, class_1010.field_5144, class_1010.field_5318, class_1010.field_5321, class_1010.field_5324, class_1010.field_5327, class_1010.field_5330}, {class_1010.field_5148, class_1010.field_5149, class_1010.field_5150, class_1010.field_5151, class_1010.field_5152, class_1010.field_5331, class_1010.field_5332, class_1010.field_5333, class_1010.field_5340, class_1010.field_5334}};
   }

   // $FF: renamed from: b (cy) void
   public void method_5474(class_1031 var1) {
      add var10001;
      for(int var2 = 0; var2 < this.field_4775[0].length; ++var2) {
         Object var3 = this.field_4775[0][var2];

         for(int var4 = 0; var4 < this.field_4775.length - 1; ++var4) {
            adb var5 = (adb)this.field_4775[var4 + 1][var2];
            var10001 = new add;
            var10001.method_3724(var5);
            var1.method_5837(var10001, new Object[]{this.field_4774[var4], Character.valueOf('#'), class_1010.field_5138, Character.valueOf('X'), var3});
         }
      }

      var10001 = new add;
      var10001.method_3724(class_1010.field_5216);
      Object[] var10002 = new Object[4];
      String[] var6 = field_4777;
      var10002[0] = " #";
      var10002[1] = "# ";
      var10002[2] = Character.valueOf('#');
      var10002[3] = class_1010.field_5123;
      var1.method_5837(var10001, var10002);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5475() {
      // $FF: Couldn't be decompiled
   }
}

package ca.diiza.o;


// $FF: renamed from: ca.diiza.o.a
public class class_610 {

   // $FF: renamed from: a java.lang.String[][]
   private String[][] field_2631;
   // $FF: renamed from: b java.lang.Object[][]
   private Object[][] field_2632;
   // $FF: renamed from: c boolean
   private static boolean field_2633;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2634;


   // $FF: renamed from: <init> () void
   public void method_3324() {
      super();
      String[][] var10001 = new String[4][];
      String[] var10004 = new String[2];
      String[] var1 = field_2634;
      var10004[0] = "XSX";
      var10004[1] = "X X";
      var10001[0] = var10004;
      var10001[1] = new String[]{"X X", "XSX", "XXX"};
      var10001[2] = new String[]{"XSX", "X X", "X X"};
      var10001[3] = new String[]{" S ", "X X", "X X"};
      this.field_2631 = var10001;
      this.field_2632 = new Object[][]{{class_1010.field_5287}, {class_1010.field_5345}, {class_1010.field_5346}, {class_1010.field_5347}, {class_1010.field_5348}};
   }

   // $FF: renamed from: a (cy) void
   public void method_3325(class_1031 var1) {
      for(int var2 = 0; var2 < this.field_2632[0].length; ++var2) {
         Object var3 = this.field_2632[0][var2];

         for(int var4 = 0; var4 < this.field_2632.length - 1; ++var4) {
            adb var5 = (adb)this.field_2632[var4 + 1][var2];
            add var10001 = new add;
            var10001.method_3724(var5);
            var1.method_5837(var10001, new Object[]{this.field_2631[var4], Character.valueOf('X'), var3, Character.valueOf('S'), class_1192.field_6198});
         }
      }

   }

   // $FF: renamed from: a (boolean) void
   public static void method_3326(boolean var0) {
      field_2633 = var0;
   }

   // $FF: renamed from: a () boolean
   public static boolean method_3327() {
      return field_2633;
   }

   // $FF: renamed from: b () boolean
   public static boolean method_3328() {
      boolean var0 = method_3327();
      return !var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3329() {
      // $FF: Couldn't be decompiled
   }
}

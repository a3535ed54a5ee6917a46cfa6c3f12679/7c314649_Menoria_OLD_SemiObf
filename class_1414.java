import org.apache.logging.log4j.Logger;

// $FF: renamed from: o8
public class class_1414 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_7532;
   // $FF: renamed from: c o8
   private static class_1414 field_7533;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7534;


   // $FF: renamed from: b () void
   public static void method_7717() {
      class_1414 var10000 = new class_1414;
      var10000.method_7719();
      field_7533 = var10000;
   }

   // $FF: renamed from: c () o8
   public static class_1414 method_7718() {
      return field_7533;
   }

   // $FF: renamed from: <init> () void
   private void method_7719() {
      super();
   }

   // $FF: renamed from: b (o4) void
   public void method_7720(class_1404 var1) {
      var1.method_7661().method_7706(var1);
      var1.method_7660().method_7706(var1);
      buu.method_9052(var1.method_7662());
   }

   // $FF: renamed from: d () int
   public int method_7721() {
      String[] var10000 = class_752.method_4253();
      int var2 = buu.method_9051();
      String[] var1 = var10000;
      int var3 = var2;
      if(var1 != null) {
         if(var2 <= 0) {
            class_129 var4 = new class_129;
            StringBuilder var10002 = new StringBuilder();
            String[] var10003 = field_7534;
            var4.method_590(var10002.append("Could not create shader program (returned program ID ").append(var2).append(")").toString());
            throw var4;
         }

         var3 = var2;
      }

      return var3;
   }

   // $FF: renamed from: c (o4) void
   public void method_7722(class_1404 var1) {
      var1.method_7661().method_7705(var1);
      var1.method_7660().method_7705(var1);
      String[] var10000 = class_752.method_4253();
      buu.method_9053(var1.method_7662());
      String[] var2 = var10000;
      int var3 = buu.method_9041(var1.method_7662(), buu.field_8572);
      if(var2 != null) {
         if(var3 != 0) {
            return;
         }

         Logger var5 = field_7532;
         StringBuilder var10001 = new StringBuilder();
         String[] var4 = field_7534;
         var5.warn(var10001.append("Error encountered when linking program containing VS ").append(var1.method_7660().method_7707()).append(" and FS ").append(var1.method_7661().method_7707()).append(". Log output:").toString());
      }

      field_7532.warn(buu.method_9049(var1.method_7662(), '\u8000'));
   }

   // $FF: renamed from: <clinit> () void
   static void method_7723() {
      // $FF: Couldn't be decompiled
   }
}

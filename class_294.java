import org.apache.commons.lang3.ArrayUtils;

// $FF: renamed from: sf
public class class_294 extends class_250 {

   // $FF: renamed from: c java.lang.String[]
   private String[] field_1539;
   // $FF: renamed from: i java.lang.String
   private static final String field_1540 = "candidates=\'%s\'";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.lang.String[]) void
   public void method_1688(String[] var1) {
      super.method_1449();
      this.field_1539 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_1539 = new String[var1.method_518()];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_1539.length) {
         this.field_1539[var3] = var1.method_524(32767);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_519(this.field_1539.length);
      String[] var10000 = class_752.method_4253();
      String[] var3 = this.field_1539;
      int var4 = var3.length;
      String[] var2 = var10000;
      int var5 = 0;

      while(var5 < var4) {
         String var6 = var3[var5];
         var1.method_525(var6);
         ++var5;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (tF) void
   public void method_1689(class_64 var1) {
      var1.method_286(this);
   }

   // $FF: renamed from: a () java.lang.String[]
   public String[] method_1690() {
      return this.field_1539;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("candidates=\'%s\'", new Object[]{ArrayUtils.toString(this.field_1539)});
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "Þ!è½Ie Ú<±ó\bwS".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_1540 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 206;
            break;
         case 1:
            var10009 = 5;
            break;
         case 2:
            var10009 = 245;
            break;
         case 3:
            var10009 = 54;
            break;
         case 4:
            var10009 = 110;
            break;
         case 5:
            var10009 = 151;
            break;
         default:
            var10009 = 190;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

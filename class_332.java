import org.apache.commons.lang3.StringUtils;

// $FF: renamed from: s9
public class class_332 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1679;
   // $FF: renamed from: i java.lang.String
   private static final String field_1680 = "message=\'%s\'";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_1885(String var1) {
      super.method_1449();
      this.field_1679 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1679 = var1.method_524(32767);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(StringUtils.substring(this.field_1679, 0, 32767));
   }

   // $FF: renamed from: b (tL) void
   public void method_1886(class_63 var1) {
      var1.method_252(this);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1887() {
      return this.field_1679;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("message=\'%s\'", new Object[]{this.field_1679});
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "cºú¨Í³°3ø¬¨".toCharArray();
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
            field_1680 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 163;
            break;
         case 1:
            var10009 = 114;
            break;
         case 2:
            var10009 = 36;
            break;
         case 3:
            var10009 = 118;
            break;
         case 4:
            var10009 = 1;
            break;
         case 5:
            var10009 = 121;
            break;
         default:
            var10009 = 120;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

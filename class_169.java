
// $FF: renamed from: lu
public class class_169 extends bdw implements class_81 {

   // $FF: renamed from: b java.lang.String
   private String field_609;
   // $FF: renamed from: i java.lang.String
   private String field_610;
   // $FF: renamed from: r int
   private int field_611;
   // $FF: renamed from: s boolean
   private boolean field_612;
   // $FF: renamed from: t java.lang.String
   private static final String field_613 = "Working...";


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
      this.field_609 = "";
      this.field_610 = "";
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_397(String var1) {
      this.method_398(var1);
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_398(String var1) {
      this.field_609 = var1;
      this.method_399("Working...");
   }

   // $FF: renamed from: d (java.lang.String) void
   public void method_399(String var1) {
      this.field_610 = var1;
      this.method_400(0);
   }

   // $FF: renamed from: b (int) void
   public void method_400(int var1) {
      this.field_611 = var1;
   }

   // $FF: renamed from: f () void
   public void method_401() {
      this.field_612 = true;
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      class_169 var10000 = this;
      if(var4 != null) {
         if(this.field_612) {
            this.field_557.method_5236((bdw)null);
            return;
         }

         this.method_873();
         this.drawCenteredString(this.fontRendererObj, this.field_609, this.width / 2, 70, 16777215);
         this.drawCenteredString(this.fontRendererObj, this.field_610 + " " + this.field_611 + "%", this.width / 2, 90, 16777215);
         var10000 = this;
      }

      var10000.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_911() {
      boolean var10000 = true;
      char[] var10003 = "pZàü\tR".toCharArray();
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
            field_613 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 53;
            break;
         case 1:
            var10009 = 110;
            break;
         case 2:
            var10009 = 58;
            break;
         case 3:
            var10009 = 153;
            break;
         case 4:
            var10009 = 253;
            break;
         case 5:
            var10009 = 3;
            break;
         default:
            var10009 = 137;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}


// $FF: renamed from: hV
class class_1247 {

   // $FF: renamed from: b java.lang.Class
   public Class field_6478;
   // $FF: renamed from: c int
   public final int field_6479;
   // $FF: renamed from: d int
   public int field_6480;
   // $FF: renamed from: e int
   public int field_6481;
   // $FF: renamed from: f boolean
   public boolean field_6482;
   // $FF: renamed from: g java.lang.String
   private static final String field_6483 = "CL_00000467";


   // $FF: renamed from: <init> (java.lang.Class, int, int, boolean) void
   public void drawCenteredString8(Class var1, int var2, int var3, boolean var4) {
      super();
      this.field_6478 = var1;
      this.field_6479 = var2;
      this.field_6481 = var3;
      this.field_6482 = var4;
   }

   // $FF: renamed from: <init> (java.lang.Class, int, int) void
   public void drawCenteredString9(Class var1, int var2, int var3) {
      this.drawCenteredString8(var1, var2, var3, false);
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_6570(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_6481;
      if(var2 != null) {
         if(this.field_6481 != 0) {
            var10000 = this.field_6480;
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(this.field_6480 >= this.field_6481) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b () boolean
   public boolean method_6571() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_6481;
      if(var1 != null) {
         if(this.field_6481 != 0) {
            var10000 = this.field_6480;
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(this.field_6480 >= this.field_6481) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6572() {
      boolean var10000 = true;
      char[] var10003 = "b¾çÈ;¨d×à".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6483 = (new String((char[])var4)).intern();
            String var2 = field_6483;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 227;
            break;
         case 1:
            var10009 = 146;
            break;
         case 2:
            var10009 = 35;
            break;
         case 3:
            var10009 = 21;
            break;
         case 4:
            var10009 = 58;
            break;
         case 5:
            var10009 = 201;
            break;
         default:
            var10009 = 90;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

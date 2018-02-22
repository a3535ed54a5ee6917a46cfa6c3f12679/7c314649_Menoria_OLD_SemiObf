
// $FF: renamed from: i9
public class class_1251 {

   // $FF: renamed from: b java.lang.Class
   public Class field_6488;
   // $FF: renamed from: c int
   public final int field_6489;
   // $FF: renamed from: d int
   public int field_6490;
   // $FF: renamed from: e int
   public int field_6491;
   // $FF: renamed from: f java.lang.String
   private static final String field_6492 = "CL_00000521";


   // $FF: renamed from: <init> (java.lang.Class, int, int) void
   public void method_6587(Class var1, int var2, int var3) {
      super();
      this.field_6488 = var1;
      this.field_6489 = var2;
      this.field_6491 = var3;
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_6588(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_6491;
      if(var2 != null) {
         if(this.field_6491 != 0) {
            var10000 = this.field_6490;
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(this.field_6490 >= this.field_6491) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b () boolean
   public boolean method_6589() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_6491;
      if(var1 != null) {
         if(this.field_6491 != 0) {
            var10000 = this.field_6490;
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(this.field_6490 >= this.field_6491) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6590() {
      boolean var10000 = true;
      char[] var10003 = "´X¸* Ç!Õ".toCharArray();
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
            field_6492 = (new String((char[])var4)).intern();
            String var2 = field_6492;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 116;
            break;
         case 1:
            var10009 = 151;
            break;
         case 2:
            var10009 = 100;
            break;
         case 3:
            var10009 = 44;
            break;
         case 4:
            var10009 = 153;
            break;
         case 5:
            var10009 = 147;
            break;
         default:
            var10009 = 44;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

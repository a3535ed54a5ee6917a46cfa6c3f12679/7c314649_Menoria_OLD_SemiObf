
// $FF: renamed from: cW
public class class_942 extends class_940 {

   // $FF: renamed from: F java.lang.String
   private static final String field_4814 = "untouching";


   // $FF: renamed from: <init> (int, int) void
   protected void method_5497(int var1, int var2) {
      super.method_5479(var1, var2, class_93.field_38);
      this.method_5488("untouching");
   }

   // $FF: renamed from: b (int) int
   public int method_5483(int var1) {
      return 15;
   }

   // $FF: renamed from: c (int) int
   public int method_5484(int var1) {
      return super.method_5483(var1) + 50;
   }

   // $FF: renamed from: c () int
   public int method_5482() {
      return 1;
   }

   // $FF: renamed from: b (cH) boolean
   public boolean method_5487(class_940 var1) {
      int var10000;
      label24: {
         String[] var2 = class_752.method_4253();
         var10000 = super.method_5487(var1);
         if(var2 != null) {
            if(var10000 == 0) {
               break label24;
            }

            var10000 = var1.field_4808;
         }

         if(var2 == null) {
            return (boolean)var10000;
         }

         if(var10000 != field_4801.field_4808) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_5491(add var1) {
      return var1.method_3730() == class_1010.field_5216?true:super.method_5491(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5494() {
      boolean var10000 = true;
      char[] var10003 = "VîeBËJî".toCharArray();
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
            field_4814 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 21;
            break;
         case 1:
            var10009 = 182;
            break;
         case 2:
            var10009 = 90;
            break;
         case 3:
            var10009 = 60;
            break;
         case 4:
            var10009 = 197;
            break;
         case 5:
            var10009 = 23;
            break;
         default:
            var10009 = 149;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

import java.util.concurrent.Callable;

// $FF: renamed from: pg
class class_1500 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7911 = "CL_00001065";
   // $FF: renamed from: b bqh
   final bqh field_7912;
   // $FF: renamed from: c bqf
   final bqf field_7913;


   // $FF: renamed from: <init> (bqf, bqh) void
   void method_8126(bqf var1, bqh var2) {
      this.field_7913 = var1;
      this.field_7912 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8127() {
      return this.field_7912.getClass().getName();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_8128() {
      return this.method_8127();
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_8129() {
      return this.method_8127();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8130() {
      boolean var10000 = true;
      char[] var10003 = "°³Ð)éÄÂÏÕ".toCharArray();
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
            field_7911 = (new String((char[])var4)).intern();
            String var2 = field_7911;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 255;
            break;
         case 1:
            var10009 = 243;
            break;
         case 2:
            var10009 = 44;
            break;
         case 3:
            var10009 = 236;
            break;
         case 4:
            var10009 = 21;
            break;
         case 5:
            var10009 = 213;
            break;
         default:
            var10009 = 248;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

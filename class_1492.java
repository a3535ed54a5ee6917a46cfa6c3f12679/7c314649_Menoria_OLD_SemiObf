import java.util.concurrent.Callable;

// $FF: renamed from: pc
class class_1492 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7839 = "CL_00001059";
   // $FF: renamed from: b bqd
   final bqd field_7840;
   // $FF: renamed from: c bpz
   final bpz field_7841;


   // $FF: renamed from: <init> (bpz, bqd) void
   void method_8051(bpz var1, bqd var2) {
      this.field_7841 = var1;
      this.field_7840 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8052() {
      return this.field_7840.method_374();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_8053() {
      return this.method_8052();
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_8054() {
      return this.method_8052();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8055() {
      boolean var10000 = true;
      char[] var10003 = "w=]\b\"A7".toCharArray();
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
            field_7839 = (new String((char[])var4)).intern();
            String var2 = field_7839;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 66;
            break;
         case 1:
            var10009 = 7;
            break;
         case 2:
            var10009 = 116;
            break;
         case 3:
            var10009 = 212;
            break;
         case 4:
            var10009 = 78;
            break;
         case 5:
            var10009 = 80;
            break;
         default:
            var10009 = 100;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

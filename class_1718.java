
// $FF: renamed from: x6
public abstract class class_1718 implements class_79 {

   // $FF: renamed from: b java.lang.String
   private final String field_9012;
   // $FF: renamed from: c double
   private final double field_9013;
   // $FF: renamed from: d boolean
   private boolean field_9014;
   // $FF: renamed from: h java.lang.String
   private static final String field_9015 = "Name cannot be null!";


   // $FF: renamed from: <init> (java.lang.String, double) void
   protected void method_9605(String var1, double var2) {
      super();
      this.field_9012 = var1;
      this.field_9013 = var2;
      if(var1 == null) {
         throw new IllegalArgumentException("Name cannot be null!");
      }
   }

   // $FF: renamed from: b () java.lang.String
   public String method_384() {
      return this.field_9012;
   }

   // $FF: renamed from: c () double
   public double method_386() {
      return this.field_9013;
   }

   // $FF: renamed from: d () boolean
   public boolean method_387() {
      return this.field_9014;
   }

   // $FF: renamed from: b (boolean) x6
   public class_1718 method_9606(boolean var1) {
      this.field_9014 = var1;
      return this;
   }

   public int hashCode() {
      return this.field_9012.hashCode();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9607() {
      boolean var10000 = true;
      char[] var10003 = "û_¬½çGÑÛP®¬çFÕP´´«".toCharArray();
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
            field_9015 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 173;
            break;
         case 1:
            var10009 = 38;
            break;
         case 2:
            var10009 = 217;
            break;
         case 3:
            var10009 = 192;
            break;
         case 4:
            var10009 = 223;
            break;
         case 5:
            var10009 = 60;
            break;
         default:
            var10009 = 168;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

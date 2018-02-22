import java.util.Collection;

// $FF: renamed from: tK
public class class_1598 {

   // $FF: renamed from: a java.lang.String
   private final String field_8318;
   // $FF: renamed from: b double
   private final double field_8319;
   // $FF: renamed from: c java.util.Collection
   private final Collection field_8320;
   // $FF: renamed from: d java.lang.String
   private static final String field_8321 = "CL_00001342";
   // $FF: renamed from: e s6
   final class_335 field_8322;


   // $FF: renamed from: <init> (s6, java.lang.String, double, java.util.Collection) void
   public void method_8736(class_335 var1, String var2, double var3, Collection var5) {
      this.field_8322 = var1;
      super();
      this.field_8318 = var2;
      this.field_8319 = var3;
      this.field_8320 = var5;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8737() {
      return this.field_8318;
   }

   // $FF: renamed from: c () double
   public double method_8738() {
      return this.field_8319;
   }

   // $FF: renamed from: d () java.util.Collection
   public Collection method_8739() {
      return this.field_8320;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8740() {
      boolean var10000 = true;
      char[] var10003 = "ï×4Nõæ¼6".toCharArray();
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
            field_8321 = (new String((char[])var4)).intern();
            String var2 = field_8321;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 2;
            break;
         case 1:
            var10009 = 118;
            break;
         case 2:
            var10009 = 93;
            break;
         case 3:
            var10009 = 209;
            break;
         case 4:
            var10009 = 171;
            break;
         case 5:
            var10009 = 122;
            break;
         default:
            var10009 = 16;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

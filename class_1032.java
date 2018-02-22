import java.util.Comparator;

// $FF: renamed from: cz
class class_1032 implements Comparator {

   // $FF: renamed from: a java.lang.String
   private static final String field_5463 = "CL_00000091";
   // $FF: renamed from: b cy
   final class_1031 field_5464;


   // $FF: renamed from: <init> (cy) void
   void method_5843(class_1031 var1) {
      this.field_5464 = var1;
      super();
   }

   // $FF: renamed from: b (cA, cA) int
   public int method_5844(class_19 var1, class_19 var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1 instanceof class_936;
      if(var3 != null) {
         label49: {
            if(var10000 != 0) {
               var10000 = var2 instanceof class_934;
               if(var3 == null) {
                  break label49;
               }

               if(var10000 != 0) {
                  var10000 = 1;
                  return var10000;
               }
            }

            var10000 = var2 instanceof class_936;
         }
      }

      if(var3 != null) {
         label40: {
            if(var10000 != 0) {
               var10000 = var1 instanceof class_934;
               if(var3 == null) {
                  break label40;
               }

               if(var10000 != 0) {
                  var10000 = -1;
                  return var10000;
               }
            }

            var10000 = var2.method_62();
         }
      }

      int var10001 = var1.method_62();
      if(var3 != null) {
         if(var10000 < var10001) {
            var10000 = -1;
            return var10000;
         }

         var10000 = var2.method_62();
         if(var3 == null) {
            return var10000;
         }

         var10001 = var1.method_62();
      }

      var10000 = var10000 > var10001?1:0;
      return var10000;
   }

   public int compare(Object var1, Object var2) {
      return this.method_5844((class_19)var1, (class_19)var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5845() {
      boolean var10000 = true;
      char[] var10003 = "a/\'¯: SA\n".toCharArray();
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
            field_5463 = (new String((char[])var4)).intern();
            String var2 = field_5463;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 56;
            break;
         case 1:
            var10009 = 121;
            break;
         case 2:
            var10009 = 98;
            break;
         case 3:
            var10009 = 33;
            break;
         case 4:
            var10009 = 133;
            break;
         case 5:
            var10009 = 16;
            break;
         default:
            var10009 = 10;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

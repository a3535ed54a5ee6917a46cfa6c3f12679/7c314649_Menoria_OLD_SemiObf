import java.util.Comparator;

// $FF: renamed from: mx
class class_1419 implements Comparator {

   // $FF: renamed from: a java.lang.String
   private static final String field_7553 = "CL_00000728";
   // $FF: renamed from: b lF
   final class_195 field_7554;
   // $FF: renamed from: c mr
   final class_962 field_7555;


   // $FF: renamed from: <init> (mr, lF) void
   void method_7752(class_962 var1, class_195 var2) {
      this.field_7555 = var1;
      this.field_7554 = var2;
      super();
   }

   // $FF: renamed from: b (u5, u5) int
   public int method_7753(class_1602 var1, class_1602 var2) {
      String[] var3;
      int var4;
      int var5;
      class_1601 var6;
      class_1601 var7;
      int var10;
      label66: {
         var4 = adb.method_2918(var1.method_8763());
         var5 = adb.method_2918(var2.method_8763());
         String[] var10000 = class_752.method_4253();
         var6 = null;
         var7 = null;
         var3 = var10000;
         var10 = this.field_7555.field_4881;
         if(var3 != null) {
            if(this.field_7555.field_4881 == 0) {
               var6 = class_1698.field_8911[var4];
               var7 = class_1698.field_8911[var5];
               break label66;
            }

            var10 = this.field_7555.field_4881;
         }

         byte var10001 = 1;
         if(var3 != null) {
            if(var10 == 1) {
               var6 = class_1698.field_8909[var4];
               var7 = class_1698.field_8909[var5];
               break label66;
            }

            var10 = this.field_7555.field_4881;
            var10001 = 2;
         }

         if(var10 == var10001) {
            var6 = class_1698.field_8910[var4];
            var7 = class_1698.field_8910[var5];
         }
      }

      int var12;
      label70: {
         class_1601 var11 = var6;
         if(var3 != null) {
            label49: {
               if(var6 == null) {
                  var11 = var7;
                  if(var3 == null) {
                     break label49;
                  }

                  if(var7 == null) {
                     break label70;
                  }
               }

               var11 = var6;
            }
         }

         if(var3 != null) {
            if(var11 == null) {
               return 1;
            }

            var11 = var7;
         }

         if(var11 == null) {
            return -1;
         }

         int var8 = class_195.method_1044(this.field_7555.field_4887).method_9402(var6);
         int var9 = class_195.method_1044(this.field_7555.field_4887).method_9402(var7);
         var10 = var8;
         var12 = var9;
         if(var3 == null) {
            return var10 - var12;
         }

         if(var8 != var9) {
            return (var8 - var9) * this.field_7555.field_4882;
         }
      }

      var10 = var4;
      var12 = var5;
      return var10 - var12;
   }

   public int compare(Object var1, Object var2) {
      return this.method_7753((class_1602)var1, (class_1602)var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7754() {
      boolean var10000 = true;
      char[] var10003 = "Zþ;A)y3".toCharArray();
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
            field_7553 = (new String((char[])var4)).intern();
            String var2 = field_7553;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 123;
            break;
         case 1:
            var10009 = 208;
            break;
         case 2:
            var10009 = 41;
            break;
         case 3:
            var10009 = 105;
            break;
         case 4:
            var10009 = 19;
            break;
         case 5:
            var10009 = 192;
            break;
         default:
            var10009 = 72;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

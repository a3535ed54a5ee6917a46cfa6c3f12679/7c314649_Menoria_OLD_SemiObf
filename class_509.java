import java.util.List;

// $FF: renamed from: cl
public class class_509 extends adb {

   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2344;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2922(1);
   }

   // $FF: renamed from: b (ro) boolean
   public static boolean method_2982(class_1583 var0) {
      String[] var1;
      String var10001;
      class_1583 var4;
      label51: {
         var1 = class_752.method_4253();
         boolean var10000 = class_510.method_2983(var0);
         String[] var3;
         if(var1 != null) {
            if(!var10000) {
               return false;
            }

            var4 = var0;
            var3 = field_2344;
            var10001 = "title";
            if(var1 == null) {
               break label51;
            }

            var10000 = var0.initGui8("title", 8);
         }

         if(!var10000) {
            return false;
         }

         var4 = var0;
         var3 = field_2344;
         var10001 = "title";
      }

      String var2 = var4.method_8685(var10001);
      String var5 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         var5 = var2;
      }

      int var7 = var5.length();
      if(var1 != null) {
         if(var7 > 16) {
            return false;
         }

         String[] var6 = field_2344;
         var7 = var0.initGui8("author", 8);
      }

      if(var1 != null) {
         if(var7 == 0) {
            return false;
         }

         var7 = 1;
      }

      return (boolean)var7;
   }

   // $FF: renamed from: n (add) java.lang.String
   public String method_2964(add var1) {
      String var5;
      label23: {
         String[] var2 = class_752.method_4253();
         add var10000 = var1;
         if(var2 != null) {
            if(!var1.method_3766()) {
               break label23;
            }

            var10000 = var1;
         }

         class_1583 var3 = var10000.method_3767();
         String[] var10001 = field_2344;
         String var4 = var3.method_8685("title");
         var5 = var4;
         if(var2 == null) {
            return var5;
         }

         if(!class_1723.method_9630(var4)) {
            return var4;
         }
      }

      var5 = super.method_2964(var1);
      return var5;
   }

   // $FF: renamed from: a (add, yz, java.util.List, boolean) void
   public void method_2963(add var1, class_792 var2, List var3, boolean var4) {
      String[] var5 = class_752.method_4253();
      add var10000 = var1;
      if(var5 != null) {
         if(!var1.method_3766()) {
            return;
         }

         var10000 = var1;
      }

      class_1583 var6 = var10000.method_3767();
      String[] var8 = field_2344;
      String var7 = var6.method_8685("author");
      if(var5 != null && !class_1723.method_9630(var7)) {
         var3.add(class_130.field_283 + class_1563.method_8582("book.byAuthor", new Object[]{var7}));
      }

   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      var3.method_4591(var1);
      return var1;
   }

   // $FF: renamed from: s () boolean
   public boolean method_2950() {
      return true;
   }

   // $FF: renamed from: e (add) boolean
   public boolean method_2965(add var1) {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÈK®k\rËQ ï{ èK®kÝW¤";
      int var4 = "ÈK®k\rËQ ï{ èK®kÝW¤".length();
      char var1 = 6;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2344 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 61;
               break;
            case 1:
               var10009 = 170;
               break;
            case 2:
               var10009 = 251;
               break;
            case 3:
               var10009 = 254;
               break;
            case 4:
               var10009 = 85;
               break;
            case 5:
               var10009 = 141;
               break;
            default:
               var10009 = 205;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

import java.util.Iterator;

// $FF: renamed from: fq
public class class_1082 extends class_1080 {

   // $FF: renamed from: b java.lang.String
   private final String field_5707;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_5708;


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_6134(String var1) {
      super.method_6123();
      this.field_5707 = var1;
   }

   // $FF: renamed from: g () java.lang.String
   public String method_6135() {
      return this.field_5707;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_341() {
      return this.field_5707;
   }

   // $FF: renamed from: h () fq
   public class_1082 method_6136() {
      String[] var10000 = class_752.method_4253();
      class_1082 var10001 = new class_1082;
      var10001.method_6134(this.field_5707);
      class_1082 var2 = var10001;
      String[] var1 = var10000;
      var2.method_337(this.method_338().method_8535());
      Iterator var3 = this.method_344().iterator();

      class_1082 var5;
      while(true) {
         if(var3.hasNext()) {
            class_66 var4 = (class_66)var3.next();
            var5 = var2;
            if(var1 == null) {
               break;
            }

            var2.method_340(var4.method_345());
            if(var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this == var1) {
            return true;
         }

         var10000 = var1;
      }

      boolean var4 = var10000 instanceof class_1082;
      if(var2 != null) {
         if(var4) {
            label41: {
               class_1082 var3 = (class_1082)var1;
               var4 = this.field_5707.equals(var3.method_6135());
               if(var2 != null) {
                  if(!var4) {
                     break label41;
                  }

                  var4 = super.equals(var1);
               }

               if(var2 == null) {
                  return var4;
               }

               if(var4) {
                  var4 = true;
                  return var4;
               }
            }

            var4 = false;
            return var4;
         }

         var4 = false;
      }

      return var4;
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_5708;
      return var10000.append("TextComponent{text=\'").append(this.field_5707).append('\'').append(", siblings=").append(this.field_5696).append(", style=").append(this.method_338()).append('}').toString();
   }

   // $FF: renamed from: f () rV
   // $FF: synthetic method
   public class_66 method_345() {
      return this.method_6136();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6125() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "tó×*ÑÎº~åÆÊØ¾tó×Tæ1øÊÒÊ¤vø\bæ1ø×ÒÆ÷";
      int var4 = "tó×*ÑÎº~åÆÊØ¾tó×Tæ1øÊÒÊ¤vø\bæ1ø×ÒÆ÷".length();
      char var1 = 20;
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
                  field_5708 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 230;
               break;
            case 1:
               var10009 = 61;
               break;
            case 2:
               var10009 = 167;
               break;
            case 3:
               var10009 = 143;
               break;
            case 4:
               var10009 = 69;
               break;
            case 5:
               var10009 = 146;
               break;
            default:
               var10009 = 143;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

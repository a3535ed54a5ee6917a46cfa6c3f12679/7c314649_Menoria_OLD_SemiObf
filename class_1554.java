
// $FF: renamed from: rU
public class class_1554 {

   // $FF: renamed from: b al
   private final class_911 field_8156;
   // $FF: renamed from: c java.lang.String
   private final String field_8157;
   // $FF: renamed from: d java.lang.String
   private static final String field_8158;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8159;


   // $FF: renamed from: <init> (al, java.lang.String) void
   public void method_8472(class_911 var1, String var2) {
      super();
      this.field_8156 = var1;
      this.field_8157 = var2;
   }

   // $FF: renamed from: b () al
   public class_911 method_8473() {
      return this.field_8156;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_8474() {
      return this.field_8157;
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

      if(var10000 != null) {
         var10000 = this.getClass();
         if(var2 != null) {
            if(var10000 != var1.getClass()) {
               return false;
            }

            var10000 = var1;
         }

         class_1554 var3 = (class_1554)var10000;
         class_1554 var4 = this;
         if(var2 != null) {
            if(this.field_8156 != var3.field_8156) {
               return false;
            }

            var4 = this;
         }

         boolean var6;
         label42: {
            String var5 = var4.field_8157;
            if(var2 != null) {
               if(var5 != null) {
                  var6 = this.field_8157.equals(var3.field_8157);
                  if(var2 == null) {
                     return var6;
                  }

                  if(!var6) {
                     return false;
                  }
                  break label42;
               }

               var5 = var3.field_8157;
            }

            if(var5 != null) {
               return false;
            }
         }

         var6 = true;
         return var6;
      } else {
         return false;
      }
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_8159;
      return var10000.append("ClickEvent{action=").append(this.field_8156).append(", value=\'").append(this.field_8157).append('\'').append('}').toString();
   }

   public int hashCode() {
      int var2;
      int var3;
      int var4;
      label14: {
         String[] var10000 = class_752.method_4253();
         var2 = this.field_8156.hashCode();
         String[] var1 = var10000;
         var3 = 31 * var2;
         String var10001 = this.field_8157;
         if(var1 != null) {
            if(this.field_8157 == null) {
               var4 = 0;
               break label14;
            }

            var10001 = this.field_8157;
         }

         var4 = var10001.hashCode();
      }

      var2 = var3 + var4;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8475() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "çG£üÉ&ö@+­cÄúUã­¼þÎ®\t¡æÄ0¢\b» ";
      int var4 = "çG£üÉ&ö@+­cÄúUã­¼þÎ®\t¡æÄ0¢\b» ".length();
      char var1 = 9;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_8159 = var5;
                  String[] var10 = field_8159;
                  field_8158 = "CL_00001260";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 103;
               break;
            case 1:
               var10009 = 203;
               break;
            case 2:
               var10009 = 121;
               break;
            case 3:
               var10009 = 49;
               break;
            case 4:
               var10009 = 9;
               break;
            case 5:
               var10009 = 255;
               break;
            default:
               var10009 = 88;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

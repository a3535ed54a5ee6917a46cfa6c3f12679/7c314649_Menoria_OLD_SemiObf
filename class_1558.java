
// $FF: renamed from: rX
public class class_1558 {

   // $FF: renamed from: b am
   private final class_912 field_8183;
   // $FF: renamed from: c rV
   private final class_66 field_8184;
   // $FF: renamed from: d java.lang.String
   private static final String field_8185;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8186;


   // $FF: renamed from: <init> (am, rV) void
   public void method_8508(class_912 var1, class_66 var2) {
      super();
      this.field_8183 = var1;
      this.field_8184 = var2;
   }

   // $FF: renamed from: b () am
   public class_912 method_8509() {
      return this.field_8183;
   }

   // $FF: renamed from: c () rV
   public class_66 method_8510() {
      return this.field_8184;
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

         class_1558 var3 = (class_1558)var10000;
         class_1558 var4 = this;
         if(var2 != null) {
            if(this.field_8183 != var3.field_8183) {
               return false;
            }

            var4 = this;
         }

         boolean var6;
         label42: {
            class_66 var5 = var4.field_8184;
            if(var2 != null) {
               if(var5 != null) {
                  var6 = this.field_8184.equals(var3.field_8184);
                  if(var2 == null) {
                     return var6;
                  }

                  if(!var6) {
                     return false;
                  }
                  break label42;
               }

               var5 = var3.field_8184;
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
      String[] var1 = field_8186;
      return var10000.append("HoverEvent{action=").append(this.field_8183).append(", value=\'").append(this.field_8184).append('\'').append('}').toString();
   }

   public int hashCode() {
      int var10000;
      int var2;
      int var3;
      label14: {
         var2 = this.field_8183.hashCode();
         String[] var1 = class_752.method_4253();
         var10000 = 31 * var2;
         class_66 var10001 = this.field_8184;
         if(var1 != null) {
            if(this.field_8184 == null) {
               var3 = 0;
               break label14;
            }

            var10001 = this.field_8184;
         }

         var3 = var10001.hashCode();
      }

      var2 = var10000 + var3;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8511() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = " NbðON\n|(ÝNLoÑOVRûlg_>]^[";
      int var4 = " NbðON\n|(ÝNLoÑOVRûlg_>]^[".length();
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
                  field_8186 = var5;
                  String[] var10 = field_8186;
                  field_8185 = "CL_00001264";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 102;
               break;
            case 1:
               var10009 = 254;
               break;
            case 2:
               var10009 = 230;
               break;
            case 3:
               var10009 = 177;
               break;
            case 4:
               var10009 = 208;
               break;
            case 5:
               var10009 = 179;
               break;
            default:
               var10009 = 176;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

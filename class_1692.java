
// $FF: renamed from: vY
public class class_1692 extends class_1691 {

   // $FF: renamed from: a sa
   protected class_689 field_8856;
   // $FF: renamed from: B java.lang.String[]
   private static final String[] field_8857;


   // $FF: renamed from: <init> (java.lang.String, sa) void
   public void method_9358(String var1, class_689 var2) {
      super.method_9343(var1);
      this.field_8856 = var2;
   }

   // $FF: renamed from: k () sa
   public class_689 method_9345() {
      return this.field_8856;
   }

   // $FF: renamed from: c (sv) rV
   public class_66 method_9350(class_752 var1) {
      String[] var2;
      add var7;
      label34: {
         var2 = class_752.method_4253();
         class_689 var10000 = this.field_8856;
         if(var2 != null) {
            if(!(this.field_8856 instanceof class_752)) {
               var7 = null;
               break label34;
            }

            var10000 = this.field_8856;
         }

         var7 = ((class_752)var10000).method_4214();
      }

      String var4;
      class_1081 var10;
      label37: {
         add var3 = var7;
         StringBuilder var8 = new StringBuilder();
         String[] var6 = field_8857;
         var4 = var8.append("death.attack.").append(this.field_8853).toString();
         String var5 = var4 + ".item";
         var7 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label37;
            }

            var7 = var3;
         }

         boolean var9 = var7.method_3773();
         if(var2 != null) {
            if(!var9) {
               break label37;
            }

            var9 = class_1563.method_8584(var5);
         }

         if(var9) {
            var10 = new class_1081;
            var10.method_6126(var5, new Object[]{var1.method_407(), this.field_8856.method_407(), var3.method_3789()});
            return var10;
         }
      }

      var10 = new class_1081;
      var10.method_6126(var4, new Object[]{var1.method_407(), this.field_8856.method_407()});
      return var10;
   }

   // $FF: renamed from: s () boolean
   public boolean method_9354() {
      boolean var2;
      label32: {
         String[] var1 = class_752.method_4253();
         class_689 var10000 = this.field_8856;
         if(var1 != null) {
            if(this.field_8856 == null) {
               break label32;
            }

            var10000 = this.field_8856;
         }

         var2 = var10000 instanceof class_752;
         if(var1 != null) {
            if(!var2) {
               break label32;
            }

            var2 = this.field_8856 instanceof class_792;
         }

         if(var1 == null) {
            return var2;
         }

         if(!var2) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9357() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "p¬*V{\r: ?G~´Q*±?P}´";
      int var4 = "p¬*V{\r: ?G~´Q*±?P}´".length();
      char var1 = 5;
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
                  field_8857 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 179;
               break;
            case 1:
               var10009 = 40;
               break;
            case 2:
               var10009 = 179;
               break;
            case 3:
               var10009 = 222;
               break;
            case 4:
               var10009 = 251;
               break;
            case 5:
               var10009 = 119;
               break;
            default:
               var10009 = 221;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

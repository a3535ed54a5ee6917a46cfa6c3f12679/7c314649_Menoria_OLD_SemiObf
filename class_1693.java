
// $FF: renamed from: vZ
public class class_1693 extends class_1692 {

   // $FF: renamed from: p sa
   private class_689 field_8858;
   // $FF: renamed from: C java.lang.String[]
   private static final String[] field_8859;


   // $FF: renamed from: <init> (java.lang.String, sa, sa) void
   public void method_9359(String var1, class_689 var2, class_689 var3) {
      super.method_9358(var1, var2);
      this.field_8858 = var3;
   }

   // $FF: renamed from: j () sa
   public class_689 method_9344() {
      return this.field_8856;
   }

   // $FF: renamed from: k () sa
   public class_689 method_9345() {
      return this.field_8858;
   }

   // $FF: renamed from: c (sv) rV
   public class_66 method_9350(class_752 var1) {
      String[] var2;
      class_66 var10;
      class_689 var10000;
      label45: {
         var2 = class_752.method_4253();
         var10000 = this.field_8858;
         if(var2 != null) {
            if(this.field_8858 == null) {
               var10 = this.field_8856.method_407();
               break label45;
            }

            var10000 = this.field_8858;
         }

         var10 = var10000.method_407();
      }

      class_66 var3;
      add var11;
      label39: {
         var3 = var10;
         var10000 = this.field_8858;
         if(var2 != null) {
            if(!(this.field_8858 instanceof class_752)) {
               var11 = null;
               break label39;
            }

            var10000 = this.field_8858;
         }

         var11 = ((class_752)var10000).method_4214();
      }

      String var5;
      class_1081 var9;
      label48: {
         add var4 = var11;
         StringBuilder var12 = new StringBuilder();
         String[] var7 = field_8859;
         var5 = var12.append("death.attack.").append(this.field_8853).toString();
         String var6 = var5 + ".item";
         var11 = var4;
         if(var2 != null) {
            if(var4 == null) {
               break label48;
            }

            var11 = var4;
         }

         boolean var8 = var11.method_3773();
         if(var2 != null) {
            if(!var8) {
               break label48;
            }

            var8 = class_1563.method_8584(var6);
         }

         if(var8) {
            var9 = new class_1081;
            var9.method_6126(var6, new Object[]{var1.method_407(), var3, var4.method_3789()});
            return var9;
         }
      }

      var9 = new class_1081;
      var9.method_6126(var5, new Object[]{var1.method_407(), var3});
      return var9;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9357() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "u®[$Úd®L\'Îy»J!";
      int var4 = "u®[$Úd®L\'Îy»J!".length();
      char var1 = 13;
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
                  field_8859 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 5;
               break;
            case 1:
               var10009 = 245;
               break;
            case 2:
               var10009 = 42;
               break;
            case 3:
               var10009 = 202;
               break;
            case 4:
               var10009 = 169;
               break;
            case 5:
               var10009 = 91;
               break;
            default:
               var10009 = 94;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

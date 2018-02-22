
// $FF: renamed from: xX
public class class_1786 implements class_82 {

   // $FF: renamed from: a add
   private final add field_9315;
   // $FF: renamed from: e java.lang.String
   private static final String field_9316 = "CL_00001543";


   // $FF: renamed from: <init> (add) void
   public void method_9816(add var1) {
      super();
      this.field_9315 = var1;
   }

   // $FF: renamed from: b (sa) boolean
   public boolean method_402(class_689 var1) {
      boolean var10000;
      String[] var2;
      class_689 var4;
      label44: {
         var2 = class_752.method_4253();
         var10000 = var1.method_3917();
         if(var2 != null) {
            if(!var10000) {
               return false;
            }

            var4 = var1;
            if(var2 == null) {
               break label44;
            }

            var10000 = var1 instanceof class_752;
         }

         if(!var10000) {
            return false;
         }

         var4 = var1;
      }

      class_752 var3 = (class_752)var4;
      class_752 var5 = var3;
      if(var2 != null) {
         if(var3.method_4215(class_753.method_4279(this.field_9315)) != null) {
            var10000 = false;
            return var10000;
         }

         var5 = var3;
      }

      if(var2 != null) {
         if(var5 instanceof class_753) {
            var10000 = ((class_753)var3).method_4292();
            return var10000;
         }

         var5 = var3;
      }

      var10000 = var5 instanceof class_792;
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_403() {
      boolean var10000 = true;
      char[] var10003 = "à%F ¯nNE".toCharArray();
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
            field_9316 = (new String((char[])var4)).intern();
            String var2 = field_9316;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 6;
            break;
         case 1:
            var10009 = 254;
            break;
         case 2:
            var10009 = 223;
            break;
         case 3:
            var10009 = 211;
            break;
         case 4:
            var10009 = 53;
            break;
         case 5:
            var10009 = 58;
            break;
         default:
            var10009 = 6;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

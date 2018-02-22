import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: y8
public class class_1785 {

   // $FF: renamed from: b sw
   class_753 field_9311;
   // $FF: renamed from: c java.util.List
   List field_9312;
   // $FF: renamed from: d java.util.List
   List field_9313;
   // $FF: renamed from: h java.lang.String
   private static final String field_9314 = "canSee";


   // $FF: renamed from: <init> (sw) void
   public void method_9812(class_753 var1) {
      super();
      this.field_9312 = new ArrayList();
      this.field_9313 = new ArrayList();
      this.field_9311 = var1;
   }

   // $FF: renamed from: b () void
   public void method_9813() {
      this.field_9312.clear();
      this.field_9313.clear();
   }

   // $FF: renamed from: b (sa) boolean
   public boolean method_9814(class_689 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = this.field_9312.contains(var1);
      if(var2 != null) {
         if(var10000) {
            return true;
         }

         var10000 = this.field_9313.contains(var1);
      }

      if(var2 != null) {
         if(var10000) {
            return false;
         }

         this.field_9311.field_2990.field_1829.method_8332("canSee");
         var10000 = this.field_9311.method_4239(var1);
      }

      boolean var3 = var10000;
      this.field_9311.field_2990.field_1829.method_8333();
      if(var2 != null) {
         if(var3) {
            this.field_9312.add(var1);
            if(var2 != null) {
               return var3;
            }
         }

         this.field_9313.add(var1);
      }

      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9815() {
      boolean var10000 = true;
      char[] var10003 = "?c1Ë".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_9314 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 114;
            break;
         case 1:
            var10009 = 44;
            break;
         case 2:
            var10009 = 113;
            break;
         case 3:
            var10009 = 243;
            break;
         case 4:
            var10009 = 203;
            break;
         case 5:
            var10009 = 128;
            break;
         default:
            var10009 = 163;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

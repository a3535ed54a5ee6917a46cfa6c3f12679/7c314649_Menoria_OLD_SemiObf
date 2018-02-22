import com.google.common.collect.Lists;
import java.util.List;

// $FF: renamed from: p6
public class class_1433 {

   // $FF: renamed from: b java.util.List
   private final List field_7604;
   // $FF: renamed from: c boolean
   private boolean field_7605;
   // $FF: renamed from: d aw
   private class_930 field_7606;
   // $FF: renamed from: e java.lang.String
   private static final String field_7607 = "CL_00001121";


   // $FF: renamed from: <init> () void
   public void method_7796() {
      super();
      this.field_7604 = Lists.newArrayList();
   }

   // $FF: renamed from: b () java.util.List
   public List method_7797() {
      return this.field_7604;
   }

   // $FF: renamed from: c () boolean
   public boolean method_7798() {
      return this.field_7605;
   }

   // $FF: renamed from: b (boolean) void
   public void method_7799(boolean var1) {
      this.field_7605 = var1;
   }

   // $FF: renamed from: d () aw
   public class_930 method_7800() {
      return this.field_7606;
   }

   // $FF: renamed from: b (aw) void
   public void method_7801(class_930 var1) {
      this.field_7606 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7802() {
      boolean var10000 = true;
      char[] var10003 = "XWÏÝÆ$**¢Ü".toCharArray();
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
            field_7607 = (new String((char[])var4)).intern();
            String var2 = field_7607;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 93;
            break;
         case 1:
            var10009 = 93;
            break;
         case 2:
            var10009 = 214;
            break;
         case 3:
            var10009 = 171;
            break;
         case 4:
            var10009 = 176;
            break;
         case 5:
            var10009 = 96;
            break;
         default:
            var10009 = 82;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

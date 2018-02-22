import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// $FF: renamed from: iY
public class class_1118 extends class_1117 {

   // $FF: renamed from: i d0
   public class_958 field_5814;
   // $FF: renamed from: j boolean
   public boolean field_5815;
   // $FF: renamed from: k int
   public int field_5816;
   // $FF: renamed from: l i9
   public class_1251 field_5817;
   // $FF: renamed from: m java.util.List
   public List field_5818;
   // $FF: renamed from: n java.util.List
   public List field_5819;
   // $FF: renamed from: o java.util.List
   public List field_5820;
   // $FF: renamed from: p java.lang.String
   private static final String field_5821 = "CL_00000527";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
      this.field_5819 = new ArrayList();
      this.field_5820 = new ArrayList();
   }

   // $FF: renamed from: <init> (d0, int, java.util.Random, int, int, java.util.List, int) void
   public void method_6276(class_958 var1, int var2, Random var3, int var4, int var5, List var6, int var7) {
      boolean var10;
      label18: {
         label17: {
            super.method_6275((class_1118)null, 0, var3, var4, var5);
            this.field_5819 = new ArrayList();
            this.field_5820 = new ArrayList();
            this.field_5814 = var1;
            String[] var8 = class_752.method_4253();
            this.field_5818 = var6;
            this.field_5816 = var7;
            class_985 var9 = var1.method_5537(var4, var5);
            class_985 var10001 = var9;
            class_985 var10002 = class_985.field_4990;
            if(var8 != null) {
               if(var9 == class_985.field_4990) {
                  break label17;
               }

               var10001 = var9;
               var10002 = class_985.field_5005;
            }

            if(var10001 != var10002) {
               var10 = false;
               break label18;
            }
         }

         var10 = true;
      }

      this.field_5815 = var10;
   }

   // $FF: renamed from: f () d0
   public class_958 method_6277() {
      return this.field_5814;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "KÉ]ö3\b8°0ñ".toCharArray();
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
            field_5821 = (new String((char[])var4)).intern();
            String var2 = field_5821;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 202;
            break;
         case 1:
            var10009 = 71;
            break;
         case 2:
            var10009 = 192;
            break;
         case 3:
            var10009 = 4;
            break;
         case 4:
            var10009 = 193;
            break;
         case 5:
            var10009 = 228;
            break;
         default:
            var10009 = 250;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

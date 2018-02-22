import com.google.common.collect.Lists;
import java.util.List;

// $FF: renamed from: mb
public class class_978 extends class_972 {

   // $FF: renamed from: w java.util.List
   private final List field_4936;
   // $FF: renamed from: x java.lang.String
   private static final String field_4937 = "CL_00000677";


   // $FF: renamed from: <init> (bao, int, int, int, int, int, P[]) void
   public void method_5623(bao var1, int var2, int var3, int var4, int var5, int var6, class_101 ... var7) {
      super.method_5549(var1, var2, var3, var4, var5, var6);
      String[] var10000 = class_752.method_4253();
      this.field_4936 = Lists.newArrayList();
      String[] var8 = var10000;
      this.field_4865 = false;
      int var9 = 0;

      while(var9 < var7.length) {
         class_101 var10 = var7[var9];
         class_101 var11 = var9 < var7.length - 1?var7[var9 + 1]:null;
         bcb var12 = this.method_5624(var1, var2 / 2 - 155, 0, var10);
         bcb var13 = this.method_5624(var1, var2 / 2 - 155 + 160, 0, var11);
         List var14 = this.field_4936;
         Gui2 var10001 = new Gui2;
         var10001.setEnabled2(var12, var13);
         var14.add(var10001);
         var9 += 2;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (bao, int, int, P) bcb
   private bcb method_5624(bao var1, int var2, int var3, class_101 var4) {
      String[] var5 = class_752.method_4253();
      class_101 var10000 = var4;
      if(var5 != null) {
         if(var4 == null) {
            return null;
         }

         var10000 = var4;
      }

      int var6 = var10000.method_469();
      Object var7;
      if(var4.method_467()) {
         var7 = new class_152;
         ((class_152)var7).method_782(var6, var2, var3, var4);
      } else {
         var7 = new class_141;
         ((class_141)var7).method_760(var6, var2, var3, var4, var1.canLoseFocus7.method_5355(var4));
      }

      return (bcb)var7;
   }

   // $FF: renamed from: b (int) l_
   public Gui2 method_5625(int var1) {
      return (Gui2)this.field_4936.get(var1);
   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return this.field_4936.size();
   }

   // $FF: renamed from: c () int
   public int method_5573() {
      return 400;
   }

   // $FF: renamed from: d () int
   protected int method_5575() {
      return super.method_5575() + 32;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      boolean var10000 = true;
      char[] var10003 = "\\ÇL[L/½ûK".toCharArray();
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
            field_4937 = (new String((char[])var4)).intern();
            String var2 = field_4937;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 193;
            break;
         case 1:
            var10009 = 85;
            break;
         case 2:
            var10009 = 18;
            break;
         case 3:
            var10009 = 162;
            break;
         case 4:
            var10009 = 181;
            break;
         case 5:
            var10009 = 162;
            break;
         default:
            var10009 = 249;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

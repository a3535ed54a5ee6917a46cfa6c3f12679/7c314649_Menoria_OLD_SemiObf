import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

// $FF: renamed from: mc
public class class_977 extends class_972 {

   // $FF: renamed from: w lG
   private final class_194 field_4931;
   // $FF: renamed from: x bao
   private final bao field_4932;
   // $FF: renamed from: y l9[]
   private final class_31[] field_4933;
   // $FF: renamed from: z int
   private int field_4934;
   // $FF: renamed from: A java.lang.String
   private static final String field_4935 = "CL_00000732";


   // $FF: renamed from: <init> (lG, bao) void
   public void method_5619(class_194 var1, bao var2) {
      super.method_5549(var2, var1.width, var1.height, 63, var1.height - 32, 20);
      this.field_4934 = 0;
      this.field_4931 = var1;
      String[] var10000 = class_752.method_4253();
      this.field_4932 = var2;
      class_1357[] var4 = (class_1357[])((class_1357[])ArrayUtils.clone(var2.canLoseFocus7.field_4556));
      this.field_4933 = new class_31[var4.length + class_1357.getEnableBackgroundDrawing0().size()];
      Arrays.sort(var4);
      int var5 = 0;
      String[] var3 = var10000;
      String var6 = null;
      class_1357[] var7 = var4;
      int var8 = var4.length;
      int var9 = 0;

      while(var9 < var8) {
         class_1357 var10 = var7[var9];
         String var11 = var10.getEnableBackgroundDrawing3();
         int var13 = var11.equals(var6);
         class_31[] var14;
         int var10001;
         if(var3 != null) {
            if(var13 == 0) {
               var6 = var11;
               var14 = this.field_4933;
               var10001 = var5++;
               Gui3 var10002 = new Gui3;
               var10002.setEnabled4(this, var11);
               var14[var10001] = var10002;
            }

            var13 = var2.enableBackgroundDrawing4.getCharWidth(class_1450.method_7896(var10.getEnableBackgroundDrawing6(), new Object[0]));
         }

         int var12 = var13;
         if(var3 != null) {
            if(var12 > this.field_4934) {
               this.field_4934 = var12;
            }

            var14 = this.field_4933;
            var10001 = var5++;
            Gui4 var15 = new Gui4;
            var15.setEnabled7(this, var10, (Object)null);
            var14[var10001] = var15;
            ++var9;
         }

         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return this.field_4933.length;
   }

   // $FF: renamed from: c (int) l9
   public class_31 method_5606(int var1) {
      return this.field_4933[var1];
   }

   // $FF: renamed from: d () int
   protected int method_5575() {
      return super.method_5575() + 15;
   }

   // $FF: renamed from: c () int
   public int method_5573() {
      return super.method_5573() + 32;
   }

   // $FF: renamed from: b (mc) bao
   static bao method_5620(class_977 var0) {
      return var0.field_4932;
   }

   // $FF: renamed from: c (mc) lG
   static class_194 method_5621(class_977 var0) {
      return var0.field_4931;
   }

   // $FF: renamed from: d (mc) int
   static int method_5622(class_977 var0) {
      return var0.field_4934;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      boolean var10000 = true;
      char[] var10003 = "].³ËM.UßÉ".toCharArray();
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
            field_4935 = (new String((char[])var4)).intern();
            String var2 = field_4935;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 98;
            break;
         case 1:
            var10009 = 30;
            break;
         case 2:
            var10009 = 144;
            break;
         case 3:
            var10009 = 135;
            break;
         case 4:
            var10009 = 200;
            break;
         case 5:
            var10009 = 203;
            break;
         default:
            var10009 = 1;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

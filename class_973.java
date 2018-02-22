import java.util.List;

// $FF: renamed from: me
public abstract class class_973 extends class_972 {

   // $FF: renamed from: w bao
   protected final bao field_4916;
   // $FF: renamed from: x java.util.List
   protected final List field_4917;
   // $FF: renamed from: y java.lang.String
   private static final String field_4918 = "CL_00000825";


   // $FF: renamed from: <init> (bao, int, int, java.util.List) void
   public void method_5607(bao var1, int var2, int var3, List var4) {
      super.method_5549(var1, var2, var3, 32, var3 - 55 + 4, 36);
      this.field_4916 = var1;
      this.field_4917 = var4;
      this.field_4865 = false;
      this.method_5552(true, (int)((float)var1.enableBackgroundDrawing4.FONT_HEIGHT * 1.5F));
   }

   // $FF: renamed from: a (int, int, bmh) void
   protected void method_5559(int var1, int var2, bmh var3) {
      String var4 = class_130.field_295 + "" + class_130.field_293 + this.method_5608();
      this.field_4916.enableBackgroundDrawing4.method_7020(var4, var1 + this.field_4854 / 2 - this.field_4916.enableBackgroundDrawing4.getCharWidth(var4) / 2, Math.min(this.field_4856 + 3, var2), 16777215);
   }

   // $FF: renamed from: h () java.lang.String
   protected abstract String method_5608();

   // $FF: renamed from: m () java.util.List
   public List method_5609() {
      return this.field_4917;
   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return this.method_5609().size();
   }

   // $FF: renamed from: b (int) mI
   public class_1371 method_5610(int var1) {
      return (class_1371)this.method_5609().get(var1);
   }

   // $FF: renamed from: c () int
   public int method_5573() {
      return this.field_4854;
   }

   // $FF: renamed from: d () int
   protected int method_5575() {
      return this.field_4858 - 6;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      boolean var10000 = true;
      char[] var10003 = "ò©Ûeà»Ý¶`".toCharArray();
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
            field_4918 = (new String((char[])var4)).intern();
            String var2 = field_4918;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 145;
            break;
         case 1:
            var10009 = 197;
            break;
         case 2:
            var10009 = 164;
            break;
         case 3:
            var10009 = 117;
            break;
         case 4:
            var10009 = 157;
            break;
         case 5:
            var10009 = 240;
            break;
         default:
            var10009 = 171;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

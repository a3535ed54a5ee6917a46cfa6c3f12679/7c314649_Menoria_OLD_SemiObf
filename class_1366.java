import java.util.Random;

// $FF: renamed from: mD
public class Gui6 {

   // $FF: renamed from: b mD
   public static final Gui6 field_7163;
   // $FF: renamed from: c java.util.Random
   private Random field_7164;
   // $FF: renamed from: d java.lang.String[]
   private String[] field_7165;
   // $FF: renamed from: h java.lang.String
   private static final String field_7166 = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ";


   // $FF: renamed from: <init> () void
   private void getSelectionEnd0() {
      super();
      this.field_7164 = new Random();
      this.field_7165 = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");
   }

   // $FF: renamed from: b () java.lang.String
   public String getSelectionEnd1() {
      String[] var10000 = class_752.method_4253();
      int var2 = this.field_7164.nextInt(2) + 3;
      String[] var1 = var10000;
      String var3 = "";
      int var4 = 0;

      while(var4 < var2) {
         if(var4 > 0) {
            var3 = var3 + " ";
         }

         var3 = var3 + this.field_7165[this.field_7164.nextInt(this.field_7165.length)];
         ++var4;
         if(var1 == null) {
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: b (long) void
   public void getSelectionEnd2(long var1) {
      this.field_7164.setSeed(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void getSelectionEnd3() {
      boolean var10000 = true;
      char[] var10003 = "\r\tWLBQ\rYP\r\\\rLIK\t Ñ]W\f YCASYF__W\f YCW_LTS\rÑPFYE Ñ^^S[\tALT_\t_A\t_\fRZ_\b]W_C]SDW_P\\\tÑ\t_QLW@Y\\[ÑP\\Y\nF\bB\n\bT\fTLBWYYW\rS ]\r] RSSF\fZWESS\nC[S\\SS\tPF\nÑTS\fY\\SLD\\LW@ ÑESY".toCharArray();
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
            field_7166 = (new String((char[])var4)).intern();
            Gui6 var2 = new Gui6;
            var2.getSelectionEnd0();
            field_7163 = var2;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 176;
            break;
         case 1:
            var10009 = 56;
            break;
         case 2:
            var10009 = 165;
            break;
         case 3:
            var10009 = 248;
            break;
         case 4:
            var10009 = 251;
            break;
         case 5:
            var10009 = 182;
            break;
         default:
            var10009 = 186;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

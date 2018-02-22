
// $FF: renamed from: mF
public class Gui8 implements class_31 {

   // $FF: renamed from: a lY
   private final class_190 field_7230;
   // $FF: renamed from: b bao
   protected final bao field_7231;
   // $FF: renamed from: c qd
   protected final class_1527 field_7232;
   // $FF: renamed from: e long
   private long field_7233;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7234;


   // $FF: renamed from: <init> (lY, qd) void
   protected void setCanLoseFocus4(class_190 var1, class_1527 var2) {
      super();
      this.field_7233 = 0L;
      this.field_7230 = var1;
      this.field_7232 = var2;
      this.field_7231 = bao.method_5273();
   }

   // $FF: renamed from: b (int, int, int, int, int, bmh, int, int, boolean) void
   public void method_147(int var1, int var2, int var3, int var4, int var5, bmh var6, int var7, int var8, boolean var9) {
      String[] var10000 = class_752.method_4253();
      String[] var11 = field_7234;
      this.field_7231.enableBackgroundDrawing4.method_7020(class_1450.method_7896("lanServer.title", new Object[0]), var2 + 32 + 3, var3 + 1, 16777215);
      String[] var10 = var10000;
      this.field_7231.enableBackgroundDrawing4.method_7020(this.field_7232.method_8274(), var2 + 32 + 3, var3 + 12, 8421504);
      if(var10 != null) {
         if(this.field_7231.canLoseFocus7.field_4505) {
            this.field_7231.enableBackgroundDrawing4.method_7020(class_1450.method_7896("selectServer.hiddenAddress", new Object[0]), var2 + 32 + 3, var3 + 12 + 11, 3158064);
            if(var10 != null) {
               return;
            }
         }

         this.field_7231.enableBackgroundDrawing4.method_7020(this.field_7232.method_8275(), var2 + 32 + 3, var3 + 12 + 11, 3158064);
      }

   }

   // $FF: renamed from: b (int, int, int, int, int, int) boolean
   public boolean method_148(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_7230.method_1013(var1);
      String[] var7 = class_752.method_4253();
      long var8;
      int var10000 = (var8 = bao.method_5283() - this.field_7233 - 250L) == 0L?0:(var8 < 0L?-1:1);
      if(var7 != null) {
         if(var10000 < 0) {
            this.field_7230.method_1011();
         }

         this.field_7233 = bao.method_5283();
         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (int, int, int, int, int, int) void
   public void method_149(int var1, int var2, int var3, int var4, int var5, int var6) {}

   // $FF: renamed from: b () qd
   public class_1527 setCanLoseFocus5() {
      return this.field_7232;
   }

   // $FF: renamed from: <clinit> () void
   static void setCanLoseFocus6() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Þ\t¼ÁÈ\t­ÛúÄ\r\t±´öÉ\f¬Á?ºäÈG¶þÈ";
      int var4 = "Þ\t¼ÁÈ\t­ÛúÄ\r\t±´öÉ\f¬Á?ºäÈG¶þÈ".length();
      char var1 = 26;
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
                  field_7234 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 89;
               break;
            case 1:
               var10009 = 132;
               break;
            case 2:
               var10009 = 157;
               break;
            case 3:
               var10009 = 152;
               break;
            case 4:
               var10009 = 43;
               break;
            case 5:
               var10009 = 1;
               break;
            default:
               var10009 = 102;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}


// $FF: renamed from: gX
public class class_1090 extends class_1089 {

   // $FF: renamed from: a java.lang.String
   private static final String field_5741;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] field_5742;


   // $FF: renamed from: <init> () void
   public void method_6160() {
      super.method_6160();
   }

   // $FF: renamed from: c () void
   public void method_6163() {
      class_959 var10001 = new class_959;
      var10001.method_5548(class_985.field_4997, 0.0F);
      this.field_5734 = var10001;
      this.field_5738 = 1;
      this.field_5736 = true;
   }

   // $FF: renamed from: d () gG
   public class_25 method_6164() {
      class_1254 var10000 = new class_1254;
      var10000.method_6604(this.field_5731, this.field_5731.method_2183());
      return var10000;
   }

   // $FF: renamed from: b (long, float) float
   public float method_6166(long var1, float var3) {
      return 0.0F;
   }

   // $FF: renamed from: b (float, float) float[]
   public float[] method_6169(float var1, float var2) {
      return null;
   }

   // $FF: renamed from: c (float, float) azw
   public azw method_6170(float var1, float var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 10518688;
      String[] var3 = var10000;
      float var5 = class_1715.method_9556(var1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      float var10;
      int var9 = (var10 = var5 - 0.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
      if(var3 != null) {
         if(var9 < 0) {
            var5 = 0.0F;
         }

         float var11;
         var9 = (var11 = var5 - 1.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
      }

      if(var3 != null) {
         if(var9 > 0) {
            var5 = 1.0F;
         }

         var9 = var4 >> 16 & 255;
      }

      float var6 = (float)var9 / 255.0F;
      float var7 = (float)(var4 >> 8 & 255) / 255.0F;
      float var8 = (float)(var4 & 255) / 255.0F;
      var6 *= var5 * 0.0F + 0.15F;
      var7 *= var5 * 0.0F + 0.15F;
      var8 *= var5 * 0.0F + 0.15F;
      return azw.method_5086((double)var6, (double)var7, (double)var8);
   }

   // $FF: renamed from: h () boolean
   public boolean method_6174() {
      return false;
   }

   // $FF: renamed from: f () boolean
   public boolean method_6171() {
      return false;
   }

   // $FF: renamed from: e () boolean
   public boolean method_6168() {
      return false;
   }

   // $FF: renamed from: g () float
   public float method_6173() {
      return 8.0F;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_6165(int var1, int var2) {
      return this.field_5731.method_2047(var1, var2).method_2424().method_5065();
   }

   // $FF: renamed from: i () vF
   public class_1661 method_6175() {
      class_1661 var10000 = new class_1661;
      var10000.method_9151(100, 50, 0);
      return var10000;
   }

   // $FF: renamed from: j () int
   public int method_6176() {
      return 50;
   }

   // $FF: renamed from: c (int, int) boolean
   public boolean method_6179(int var1, int var2) {
      return true;
   }

   // $FF: renamed from: m () java.lang.String
   public String method_6180() {
      String[] var10000 = field_5742;
      return "The End";
   }

   // $FF: renamed from: <clinit> () void
   static void method_6181() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ø>e«ìkï_Þ²?e8";
      int var4 = "ø>e«ìkï_Þ²?e8".length();
      char var1 = 7;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5742 = var5;
                  String[] var10 = field_5742;
                  field_5741 = "CL_00000389";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 67;
               break;
            case 1:
               var10009 = 185;
               break;
            case 2:
               var10009 = 239;
               break;
            case 3:
               var10009 = 192;
               break;
            case 4:
               var10009 = 1;
               break;
            case 5:
               var10009 = 109;
               break;
            default:
               var10009 = 224;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

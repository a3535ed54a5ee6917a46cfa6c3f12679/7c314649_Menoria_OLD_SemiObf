import java.util.ArrayList;

// $FF: renamed from: cH
public abstract class class_940 {

   // $FF: renamed from: a cH[]
   public static final class_940[] field_4782;
   // $FF: renamed from: b cH[]
   public static final class_940[] field_4783;
   // $FF: renamed from: c cH
   public static final class_940 field_4784;
   // $FF: renamed from: d cH
   public static final class_940 field_4785;
   // $FF: renamed from: e cH
   public static final class_940 field_4786;
   // $FF: renamed from: f cH
   public static final class_940 field_4787;
   // $FF: renamed from: g cH
   public static final class_940 field_4788;
   // $FF: renamed from: h cH
   public static final class_940 field_4789;
   // $FF: renamed from: i cH
   public static final class_940 field_4790;
   // $FF: renamed from: j cH
   public static final class_940 field_4791;
   // $FF: renamed from: k cH
   public static final class_940 field_4792;
   // $FF: renamed from: l cH
   public static final class_940 field_4793;
   // $FF: renamed from: m cH
   public static final class_940 field_4794;
   // $FF: renamed from: n cH
   public static final class_940 field_4795;
   // $FF: renamed from: o cH
   public static final class_940 field_4796;
   // $FF: renamed from: p cH
   public static final class_940 field_4797;
   // $FF: renamed from: q cH
   public static final class_940 field_4798;
   // $FF: renamed from: r cH
   public static final class_940 field_4799;
   // $FF: renamed from: s cH
   public static final class_940 field_4800;
   // $FF: renamed from: t cH
   public static final class_940 field_4801;
   // $FF: renamed from: u cH
   public static final class_940 field_4802;
   // $FF: renamed from: v cH
   public static final class_940 field_4803;
   // $FF: renamed from: w cH
   public static final class_940 field_4804;
   // $FF: renamed from: x cH
   public static final class_940 field_4805;
   // $FF: renamed from: y cH
   public static final class_940 field_4806;
   // $FF: renamed from: z cH
   public static final class_940 field_4807;
   // $FF: renamed from: A int
   public final int field_4808;
   // $FF: renamed from: B int
   private final int field_4809;
   // $FF: renamed from: D E
   public class_93 field_4810;
   // $FF: renamed from: E java.lang.String
   protected String field_4811;
   // $FF: renamed from: C java.lang.String[]
   private static final String[] field_4812;


   // $FF: renamed from: <init> (int, int, E) void
   protected void method_5479(int var1, int var2, class_93 var3) {
      super();
      this.field_4808 = var1;
      this.field_4809 = var2;
      this.field_4810 = var3;
      if(field_4782[var1] != null) {
         IllegalArgumentException var10000 = new IllegalArgumentException("Duplicate enchantment id!");
         String[] var10002 = field_4812;
         throw var10000;
      } else {
         field_4782[var1] = this;
      }
   }

   // $FF: renamed from: a () int
   public int method_5480() {
      return this.field_4809;
   }

   // $FF: renamed from: b () int
   public int method_5481() {
      return 1;
   }

   // $FF: renamed from: c () int
   public int method_5482() {
      return 1;
   }

   // $FF: renamed from: b (int) int
   public int method_5483(int var1) {
      return 1 + var1 * 10;
   }

   // $FF: renamed from: c (int) int
   public int method_5484(int var1) {
      return this.method_5483(var1) + 5;
   }

   // $FF: renamed from: b (int, vX) int
   public int method_5485(int var1, class_1691 var2) {
      return 0;
   }

   // $FF: renamed from: b (int, at) float
   public float method_5486(int var1, class_923 var2) {
      return 0.0F;
   }

   // $FF: renamed from: b (cH) boolean
   public boolean method_5487(class_940 var1) {
      boolean var10000;
      try {
         if(this != var1) {
            var10000 = true;
            return var10000;
         }
      } catch (IllegalArgumentException var2) {
         throw method_5495(var2);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: a (java.lang.String) cH
   public class_940 method_5488(String var1) {
      this.field_4811 = var1;
      return this;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_5489() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_4812;
      return var10000.append("enchantment.").append(this.field_4811).toString();
   }

   // $FF: renamed from: d (int) java.lang.String
   public String method_5490(int var1) {
      String var2 = class_1563.method_8581(this.method_5489());
      StringBuilder var10000 = (new StringBuilder()).append(var2).append(" ");
      StringBuilder var10001 = new StringBuilder();
      String[] var10002 = field_4812;
      return var10000.append(class_1563.method_8581(var10001.append("enchantment.level.").append(var1).toString())).toString();
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_5491(add var1) {
      return this.field_4810.method_440(var1.method_3730());
   }

   // $FF: renamed from: b (sv, sa, int) void
   public void method_5492(class_752 var1, class_689 var2, int var3) {}

   // $FF: renamed from: c (sv, sa, int) void
   public void method_5493(class_752 var1, class_689 var2, int var3) {}

   // $FF: renamed from: <clinit> () void
   static void method_5494() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÏFEà½VÿVéºVê]Aá±[«ZQ­\fî]Väµ[æV[øúî]Väµ[æV[øúYýVY¢";
      int var4 = "ÏFEà½VÿVéºVê]Aá±[«ZQ­\fî]Väµ[æV[øúî]Väµ[æV[øúYýVY¢".length();
      char var1 = 25;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var15 = true;
         char[] var14 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var14;
            var14 = var10001;
            var10001 = var10003;
            char[] var19 = var14;
            var14 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var15)).intern();
               if((var0 += var1) >= var4) {
                  field_4812 = var5;
                  field_4782 = new class_940[256];
                  class_944 var13 = new class_944;
                  var13.method_5501(0, 10, 0);
                  field_4784 = var13;
                  var13 = new class_944;
                  var13.method_5501(1, 5, 1);
                  field_4785 = var13;
                  var13 = new class_944;
                  var13.method_5501(2, 5, 2);
                  field_4786 = var13;
                  var13 = new class_944;
                  var13.method_5501(3, 2, 3);
                  field_4787 = var13;
                  var13 = new class_944;
                  var13.method_5501(4, 5, 4);
                  field_4788 = var13;
                  class_945 var16 = new class_945;
                  var16.method_5504(5, 2);
                  field_4789 = var16;
                  class_941 var17 = new class_941;
                  var17.method_5496(6, 2);
                  field_4790 = var17;
                  class_943 var18 = new class_943;
                  var18.method_5498(7, 1);
                  field_4791 = var18;
                  class_952 var21 = new class_952;
                  var21.method_5510(16, 10, 0);
                  field_4792 = var21;
                  var21 = new class_952;
                  var21.method_5510(17, 5, 1);
                  field_4793 = var21;
                  var21 = new class_952;
                  var21.method_5510(18, 5, 2);
                  field_4794 = var21;
                  class_947 var23 = new class_947;
                  var23.method_5505(19, 5);
                  field_4795 = var23;
                  class_949 var24 = new class_949;
                  var24.method_5506(20, 2);
                  field_4796 = var24;
                  class_946 var25 = new class_946;
                  var25.method_5479(21, 2, class_93.field_37);
                  field_4797 = var25;
                  class_950 var26 = new class_950;
                  var26.method_5507(32, 10);
                  field_4798 = var26;
                  class_942 var27 = new class_942;
                  var27.method_5497(33, 1);
                  field_4799 = var27;
                  class_951 var28 = new class_951;
                  var28.method_5508(34, 5);
                  field_4800 = var28;
                  var25 = new class_946;
                  var25.method_5479(35, 2, class_93.field_38);
                  field_4801 = var25;
                  class_956 var29 = new class_956;
                  var29.method_5514(48, 10);
                  field_4802 = var29;
                  class_953 var30 = new class_953;
                  var30.method_5511(49, 2);
                  field_4803 = var30;
                  class_955 var31 = new class_955;
                  var31.method_5513(50, 2);
                  field_4804 = var31;
                  class_954 var32 = new class_954;
                  var32.method_5512(51, 1);
                  field_4805 = var32;
                  var25 = new class_946;
                  var25.method_5479(61, 2, class_93.field_39);
                  field_4806 = var25;
                  class_948 var33 = new class_948;
                  var33.method_5479(62, 2, class_93.field_39);
                  field_4807 = var33;
                  ArrayList var7 = new ArrayList();
                  class_940[] var8 = field_4782;
                  int var9 = var8.length;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     class_940 var11 = var8[var10];

                     try {
                        if(var11 != null) {
                           var7.add(var11);
                        }
                     } catch (IllegalArgumentException var12) {
                        throw method_5495(var12);
                     }
                  }

                  field_4783 = (class_940[])var7.toArray(new class_940[0]);
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var15)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 23;
               break;
            case 1:
               var10009 = 175;
               break;
            case 2:
               var10009 = 169;
               break;
            case 3:
               var10009 = 16;
               break;
            case 4:
               var10009 = 72;
               break;
            case 5:
               var10009 = 169;
               break;
            default:
               var10009 = 100;
            }

            ((Object[])var15)[var6] = (char)(var10007 ^ var19 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_5495(IllegalArgumentException var0) {
      return var0;
   }
}

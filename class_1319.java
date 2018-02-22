
// $FF: renamed from: jj
public class class_1319 {

   // $FF: renamed from: b jj[]
   public static final class_1319[] field_6746;
   // $FF: renamed from: c jj
   public static final class_1319 field_6747;
   // $FF: renamed from: d jj
   public static final class_1319 field_6748;
   // $FF: renamed from: e jj
   public static final class_1319 field_6749;
   // $FF: renamed from: f jj
   public static final class_1319 field_6750;
   // $FF: renamed from: g jj
   public static final class_1319 field_6751;
   // $FF: renamed from: h jj
   public static final class_1319 field_6752;
   // $FF: renamed from: i jj
   public static final class_1319 field_6753;
   // $FF: renamed from: j jj
   public static final class_1319 field_6754;
   // $FF: renamed from: k jj
   public static final class_1319 field_6755;
   // $FF: renamed from: l jj
   public static final class_1319 field_6756;
   // $FF: renamed from: m jj
   public static final class_1319 field_6757;
   // $FF: renamed from: n jj
   public static final class_1319 field_6758;
   // $FF: renamed from: o jj
   public static final class_1319 field_6759;
   // $FF: renamed from: p jj
   public static final class_1319 field_6760;
   // $FF: renamed from: q jj
   public static final class_1319 field_6761;
   // $FF: renamed from: r jj
   public static final class_1319 field_6762;
   // $FF: renamed from: s jj
   public static final class_1319 field_6763;
   // $FF: renamed from: t jj
   public static final class_1319 field_6764;
   // $FF: renamed from: u jj
   public static final class_1319 field_6765;
   // $FF: renamed from: v jj
   public static final class_1319 field_6766;
   // $FF: renamed from: w jj
   public static final class_1319 field_6767;
   // $FF: renamed from: x jj
   public static final class_1319 field_6768;
   // $FF: renamed from: y jj
   public static final class_1319 field_6769;
   // $FF: renamed from: z jj
   public static final class_1319 field_6770;
   // $FF: renamed from: A jj
   public static final class_1319 field_6771;
   // $FF: renamed from: B jj
   public static final class_1319 field_6772;
   // $FF: renamed from: C jj
   public static final class_1319 field_6773;
   // $FF: renamed from: D jj
   public static final class_1319 field_6774;
   // $FF: renamed from: E jj
   public static final class_1319 field_6775;
   // $FF: renamed from: F jj
   public static final class_1319 field_6776;
   // $FF: renamed from: G jj
   public static final class_1319 field_6777;
   // $FF: renamed from: H jj
   public static final class_1319 field_6778;
   // $FF: renamed from: I jj
   public static final class_1319 field_6779;
   // $FF: renamed from: J jj
   public static final class_1319 field_6780;
   // $FF: renamed from: K jj
   public static final class_1319 field_6781;
   // $FF: renamed from: L jj
   public static final class_1319 field_6782;
   // $FF: renamed from: M int
   public final int field_6783;
   // $FF: renamed from: N int
   public final int field_6784;
   // $FF: renamed from: O java.lang.String
   private static final String field_6785;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_6786;


   // $FF: renamed from: <init> (int, int) void
   private void method_6941(int var1, int var2) {
      super();
      if(var1 >= 0) {
         try {
            if(var1 <= 63) {
               this.field_6784 = var1;
               this.field_6783 = var2;
               field_6746[var1] = this;
               return;
            }
         } catch (IndexOutOfBoundsException var3) {
            throw method_6945(var3);
         }
      }

      IndexOutOfBoundsException var10000 = new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      String[] var10002 = field_6786;
      throw var10000;
   }

   // $FF: renamed from: b (int) jj
   public static class_1319 method_6942(int var0) {
      try {
         switch(class_438.method_2752(var0)) {
         case 0:
            return field_6776;
         case 1:
            return field_6775;
         case 2:
            return field_6774;
         case 3:
            return field_6773;
         case 4:
            return field_6772;
         case 5:
            return field_6771;
         case 6:
            return field_6770;
         case 7:
            return field_6769;
         case 8:
            return field_6768;
         case 9:
            return field_6767;
         case 10:
            return field_6766;
         case 11:
            return field_6765;
         case 12:
            return field_6764;
         case 13:
            return field_6763;
         case 14:
            return field_6762;
         case 15:
            return field_6755;
         }
      } catch (IndexOutOfBoundsException var1) {
         throw method_6945(var1);
      }
   }

   // $FF: renamed from: c (int) int
   public int method_6943(int var1) {
      String[] var10000 = class_752.method_4253();
      short var3 = 220;
      String[] var2 = var10000;

      int var11;
      byte var10001;
      label67: {
         label66: {
            try {
               var11 = var1;
               var10001 = 3;
               if(var2 == null) {
                  break label67;
               }

               if(var1 != 3) {
                  break label66;
               }
            } catch (IndexOutOfBoundsException var10) {
               throw method_6945(var10);
            }

            var3 = 135;
         }

         var11 = var1;
         var10001 = 2;
      }

      label71: {
         label57: {
            label56: {
               try {
                  if(var2 == null) {
                     break label57;
                  }

                  if(var11 != var10001) {
                     break label56;
                  }
               } catch (IndexOutOfBoundsException var9) {
                  throw method_6945(var9);
               }

               var3 = 255;
            }

            try {
               var11 = var1;
               if(var2 == null) {
                  break label71;
               }

               var10001 = 1;
            } catch (IndexOutOfBoundsException var8) {
               throw method_6945(var8);
            }
         }

         if(var11 == var10001) {
            var3 = 220;
         }

         var11 = var1;
      }

      label44: {
         label43: {
            try {
               if(var2 == null) {
                  break label44;
               }

               if(var11 != 0) {
                  break label43;
               }
            } catch (IndexOutOfBoundsException var7) {
               throw method_6945(var7);
            }

            var3 = 180;
         }

         var11 = (this.field_6783 >> 16 & 255) * var3 / 255;
      }

      int var4 = var11;
      int var5 = (this.field_6783 >> 8 & 255) * var3 / 255;
      int var6 = (this.field_6783 & 255) * var3 / 255;
      return -16777216 | var4 << 16 | var5 << 8 | var6;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6944() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "´æk,ÓæA²(!ÚÙ²&ÚÏÌæi-ÛÙÙÏæ *Ñµa5ÚÐº££ö8sÉÚÈò";
      int var4 = "´æk,ÓæA²(!ÚÙ²&ÚÏÌæi-ÛÙÙÏæ *Ñµa5ÚÐº££ö8sÉÚÈò".length();
      char var1 = 50;
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
                  field_6786 = var5;
                  String[] var10 = field_6786;
                  field_6785 = "CL_00000544";
                  field_6746 = new class_1319[64];
                  class_1319 var7 = new class_1319;
                  var7.method_6941(0, 0);
                  field_6747 = var7;
                  var7 = new class_1319;
                  var7.method_6941(1, 8368696);
                  field_6748 = var7;
                  var7 = new class_1319;
                  var7.method_6941(2, 16247203);
                  field_6749 = var7;
                  var7 = new class_1319;
                  var7.method_6941(3, 10987431);
                  field_6750 = var7;
                  var7 = new class_1319;
                  var7.method_6941(4, 16711680);
                  field_6751 = var7;
                  var7 = new class_1319;
                  var7.method_6941(5, 10526975);
                  field_6752 = var7;
                  var7 = new class_1319;
                  var7.method_6941(6, 10987431);
                  field_6753 = var7;
                  var7 = new class_1319;
                  var7.method_6941(7, 31744);
                  field_6754 = var7;
                  var7 = new class_1319;
                  var7.method_6941(8, 16777215);
                  field_6755 = var7;
                  var7 = new class_1319;
                  var7.method_6941(9, 10791096);
                  field_6756 = var7;
                  var7 = new class_1319;
                  var7.method_6941(10, 12020271);
                  field_6757 = var7;
                  var7 = new class_1319;
                  var7.method_6941(11, 7368816);
                  field_6758 = var7;
                  var7 = new class_1319;
                  var7.method_6941(12, 4210943);
                  field_6759 = var7;
                  var7 = new class_1319;
                  var7.method_6941(13, 6837042);
                  field_6760 = var7;
                  var7 = new class_1319;
                  var7.method_6941(14, 16776437);
                  field_6761 = var7;
                  var7 = new class_1319;
                  var7.method_6941(15, 14188339);
                  field_6762 = var7;
                  var7 = new class_1319;
                  var7.method_6941(16, 11685080);
                  field_6763 = var7;
                  var7 = new class_1319;
                  var7.method_6941(17, 6724056);
                  field_6764 = var7;
                  var7 = new class_1319;
                  var7.method_6941(18, 15066419);
                  field_6765 = var7;
                  var7 = new class_1319;
                  var7.method_6941(19, 8375321);
                  field_6766 = var7;
                  var7 = new class_1319;
                  var7.method_6941(20, 15892389);
                  field_6767 = var7;
                  var7 = new class_1319;
                  var7.method_6941(21, 5000268);
                  field_6768 = var7;
                  var7 = new class_1319;
                  var7.method_6941(22, 10066329);
                  field_6769 = var7;
                  var7 = new class_1319;
                  var7.method_6941(23, 5013401);
                  field_6770 = var7;
                  var7 = new class_1319;
                  var7.method_6941(24, 8339378);
                  field_6771 = var7;
                  var7 = new class_1319;
                  var7.method_6941(25, 3361970);
                  field_6772 = var7;
                  var7 = new class_1319;
                  var7.method_6941(26, 6704179);
                  field_6773 = var7;
                  var7 = new class_1319;
                  var7.method_6941(27, 6717235);
                  field_6774 = var7;
                  var7 = new class_1319;
                  var7.method_6941(28, 10040115);
                  field_6775 = var7;
                  var7 = new class_1319;
                  var7.method_6941(29, 1644825);
                  field_6776 = var7;
                  var7 = new class_1319;
                  var7.method_6941(30, 16445005);
                  field_6777 = var7;
                  var7 = new class_1319;
                  var7.method_6941(31, 6085589);
                  field_6778 = var7;
                  var7 = new class_1319;
                  var7.method_6941(32, 4882687);
                  field_6779 = var7;
                  var7 = new class_1319;
                  var7.method_6941(33, '\ud93a');
                  field_6780 = var7;
                  var7 = new class_1319;
                  var7.method_6941(34, 1381407);
                  field_6781 = var7;
                  var7 = new class_1319;
                  var7.method_6941(35, 7340544);
                  field_6782 = var7;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 141;
               break;
            case 1:
               var10009 = 155;
               break;
            case 2:
               var10009 = 136;
               break;
            case 3:
               var10009 = 178;
               break;
            case 4:
               var10009 = 124;
               break;
            case 5:
               var10009 = 55;
               break;
            default:
               var10009 = 203;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.IndexOutOfBoundsException) java.lang.IndexOutOfBoundsException
   private static IndexOutOfBoundsException method_6945(IndexOutOfBoundsException var0) {
      return var0;
   }
}


// $FF: renamed from: cS
public class class_946 extends class_940 {

   // $FF: renamed from: F java.lang.String[]
   private static final String[] field_4823;


   // $FF: renamed from: <init> (int, int, E) void
   protected void method_5479(int var1, int var2, class_93 var3) {
      super.method_5479(var1, var2, var3);
      String[] var4;
      if(var3 == class_93.field_38) {
         var4 = field_4823;
         this.method_5488("lootBonusDigger");
      } else if(var3 == class_93.field_39) {
         var4 = field_4823;
         this.method_5488("lootBonusFishing");
      } else {
         String[] var10001 = field_4823;
         this.method_5488("lootBonus");
      }

   }

   // $FF: renamed from: b (int) int
   public int method_5483(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   // $FF: renamed from: c (int) int
   public int method_5484(int var1) {
      return super.method_5483(var1) + 50;
   }

   // $FF: renamed from: c () int
   public int method_5482() {
      return 3;
   }

   // $FF: renamed from: b (cH) boolean
   public boolean method_5487(class_940 var1) {
      int var10000;
      label24: {
         String[] var2 = class_752.method_4253();
         var10000 = super.method_5487(var1);
         if(var2 != null) {
            if(var10000 == 0) {
               break label24;
            }

            var10000 = var1.field_4808;
         }

         if(var2 == null) {
            return (boolean)var10000;
         }

         if(var10000 != field_4799.field_4808) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5494() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "®¾Å\t8³Â®¾Å\t:³Í\t®¾Å\t";
      int var4 = "®¾Å\t8³Â®¾Å\t:³Í\t®¾Å\t".length();
      char var1 = 16;
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
                  field_4823 = var5;
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
               var10009 = 209;
               break;
            case 2:
               var10009 = 75;
               break;
            case 3:
               var10009 = 239;
               break;
            case 4:
               var10009 = 201;
               break;
            case 5:
               var10009 = 159;
               break;
            default:
               var10009 = 82;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

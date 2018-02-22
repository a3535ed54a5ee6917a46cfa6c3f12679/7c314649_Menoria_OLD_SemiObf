import java.util.HashMap;
import java.util.List;
import java.util.Map;

// $FF: renamed from: b9
public class class_549 extends adb {

   // $FF: renamed from: n java.util.Map
   private static final Map field_2406;
   // $FF: renamed from: o java.lang.String
   public final String field_2407;
   // $FF: renamed from: p java.lang.String[]
   private static final String[] field_2408;


   // $FF: renamed from: <init> (java.lang.String) void
   protected void getBlock25(String var1) {
      super.method_2917();
      this.field_2407 = var1;
      this.field_2333 = 1;
      this.method_2974(class_872.field_4248);
      field_2406.put(var1, this);
   }

   // $FF: renamed from: b_ (int) vL
   public IIcon getIconFromDamage(int var1) {
      return this.field_2340;
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var12;
      label31: {
         String[] var11 = class_752.method_4253();
         ahb var10000 = var3;
         int var10001 = var4;
         int var10002 = var5;
         int var10003 = var6;
         if(var11 != null) {
            if(var3.getBlock(var4, var5, var6) != class_1192.field_6110) {
               break label31;
            }

            var10000 = var3;
            var10001 = var4;
            var10002 = var5;
            var10003 = var6;
         }

         var12 = var10000.method_33(var10001, var10002, var10003);
         if(var11 == null) {
            return (boolean)var12;
         }

         if(var12 == 0) {
            boolean var13 = var3.field_1832;
            if(var11 != null) {
               if(var3.field_1832) {
                  return true;
               }

               ((class_479)class_1192.field_6110).method_2834(var3, var4, var5, var6, var1);
               var3.method_2211((class_792)null, 1005, var4, var5, var6, adb.method_2918(this));
               --var1.field_2958;
               var13 = true;
            }

            return var13;
         }
      }

      var12 = 0;
      return (boolean)var12;
   }

   // $FF: renamed from: a (add, yz, java.util.List, boolean) void
   public void method_2963(add var1, class_792 var2, List var3, boolean var4) {
      var3.add(this.getBlock26());
   }

   // $FF: renamed from: e () java.lang.String
   public String getBlock26() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_2408;
      return class_1563.method_8581(var10000.append("item.record.").append(this.field_2407).append(".desc").toString());
   }

   // $FF: renamed from: f (add) z
   public class_134 method_2966(add var1) {
      return class_134.field_352;
   }

   // $FF: renamed from: a (java.lang.String) b9
   public static class_549 getBlock27(String var0) {
      return (class_549)field_2406.get(var0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "yÊÁ4t-äsÑÖ=t>ÚÁ*9";
      int var4 = "yÊÁ4t-äsÑÖ=t>ÚÁ*9".length();
      char var1 = 12;
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
                  field_2408 = var5;
                  field_2406 = new HashMap();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 137;
               break;
            case 1:
               var10009 = 39;
               break;
            case 2:
               var10009 = 61;
               break;
            case 3:
               var10009 = 192;
               break;
            case 4:
               var10009 = 195;
               break;
            case 5:
               var10009 = 198;
               break;
            default:
               var10009 = 24;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

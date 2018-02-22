
// $FF: renamed from: gw
public class class_584 extends class_580 {

   // $FF: renamed from: m c_
   private final class_982 field_2486;
   // $FF: renamed from: n java.lang.String
   private static final String field_2487;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2488;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      class_984 var10001 = new class_984;
      var10001.method_5690(this);
      this.field_2486 = var10001;
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      super.getBlock92(var1);
      this.field_2486.method_5677(var1);
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      this.field_2486.method_5678(var1);
   }

   // $FF: renamed from: g () void
   public void getBlock94() {
      this.field_2486.method_5674();
      super.getBlock94();
   }

   // $FF: renamed from: q () r1
   public class_250 method_3100() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var1 = var10000;
      this.getBlock93(var1);
      String[] var10001 = field_2488;
      var1.method_8691("SpawnPotentials");
      class_299 var2 = new class_299;
      var2.method_1710(this.field_2465, this.field_2466, this.field_2467, 1, var1);
      return var2;
   }

   // $FF: renamed from: a (int, int) boolean
   public boolean method_3104(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_584 var10000 = this;
      boolean var4;
      if(var3 != null) {
         if(this.field_2486.method_5680(var1)) {
            var4 = true;
            return var4;
         }

         var10000 = this;
      }

      var4 = var10000.method_3104(var1, var2);
      return var4;
   }

   // $FF: renamed from: b () c_
   public class_982 method_3123() {
      return this.field_2486;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "àÉ(§äÀ<¶A§ðõàº c×àã½`Ð";
      int var4 = "àÉ(§äÀ<¶A§ðõàº c×àã½`Ð".length();
      char var1 = 11;
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
                  field_2488 = var5;
                  String[] var10 = field_2488;
                  field_2487 = "CL_00000360";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 180;
               break;
            case 1:
               var10009 = 146;
               break;
            case 2:
               var10009 = 96;
               break;
            case 3:
               var10009 = 128;
               break;
            case 4:
               var10009 = 195;
               break;
            case 5:
               var10009 = 231;
               break;
            default:
               var10009 = 27;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

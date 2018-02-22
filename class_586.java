
// $FF: renamed from: gu
public class class_586 extends class_580 {

   // $FF: renamed from: m adb
   private adb field_2494;
   // $FF: renamed from: n int
   private int field_2495;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2496;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
   }

   // $FF: renamed from: <init> (adb, int) void
   public void method_3145(adb var1, int var2) {
      super.getBlock88();
      this.field_2494 = var1;
      this.field_2495 = var2;
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      String[] var2 = field_2496;
      var1.method_8667("Item", adb.method_2918(this.field_2494));
      var1.method_8667("Data", this.field_2495);
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      super.getBlock92(var1);
      String[] var2 = field_2496;
      this.field_2494 = adb.method_2919(var1.method_8681("Item"));
      this.field_2495 = var1.method_8681("Data");
   }

   // $FF: renamed from: q () r1
   public class_250 method_3100() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var1 = var10000;
      this.getBlock93(var1);
      class_299 var2 = new class_299;
      var2.method_1710(this.field_2465, this.field_2466, this.field_2467, 5, var1);
      return var2;
   }

   // $FF: renamed from: b (adb, int) void
   public void method_3146(adb var1, int var2) {
      this.field_2494 = var1;
      this.field_2495 = var2;
   }

   // $FF: renamed from: b () adb
   public adb method_3147() {
      return this.field_2494;
   }

   // $FF: renamed from: d () int
   public int method_3148() {
      return this.field_2495;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "kÎ(´fÛ9¸";
      int var4 = "kÎ(´fÛ9¸".length();
      char var1 = 4;
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
                  field_2496 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 140;
               break;
            case 1:
               var10009 = 12;
               break;
            case 2:
               var10009 = 255;
               break;
            case 3:
               var10009 = 118;
               break;
            case 4:
               var10009 = 70;
               break;
            case 5:
               var10009 = 91;
               break;
            default:
               var10009 = 217;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}


// $FF: renamed from: gj
public class class_597 extends class_580 {

   // $FF: renamed from: m add
   private add field_2558;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_2559;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.getBlock92(var1);
      String[] var2 = var10000;
      String[] var3 = field_2559;
      int var4 = var1.initGui8("RecordItem", 10);
      if(var2 != null) {
         if(var4 != 0) {
            this.method_3185(add.method_3727(var1.method_8688("RecordItem")));
            if(var2 != null) {
               return;
            }
         }

         var3 = field_2559;
         var4 = var1.method_8681("Record");
      }

      if(var4 > 0) {
         add var10001 = new add;
         String[] var10004 = field_2559;
         var10001.method_3726(adb.method_2919(var1.method_8681("Record")), 1, 0);
         this.method_3185(var10001);
      }

   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.getBlock93(var1);
      String[] var2 = var10000;
      if(var2 != null) {
         if(this.method_3184() == null) {
            return;
         }

         String[] var3 = field_2559;
         add var10002 = this.method_3184();
         class_1583 var10003 = new class_1583;
         var10003.method_8628();
         var1.method_8664("RecordItem", var10002.method_3737(var10003));
      }

      String[] var10001 = field_2559;
      var1.method_8667("Record", adb.method_2918(this.method_3184().method_3730()));
   }

   // $FF: renamed from: b () add
   public add method_3184() {
      return this.field_2558;
   }

   // $FF: renamed from: b (add) void
   public void method_3185(add var1) {
      this.field_2558 = var1;
      this.method_91();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "PºÅç\nPºÅçÆvºË";
      int var4 = "PºÅç\nPºÅçÆvºË".length();
      char var1 = 6;
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
                  field_2559 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 184;
               break;
            case 1:
               var10009 = 101;
               break;
            case 2:
               var10009 = 28;
               break;
            case 3:
               var10009 = 50;
               break;
            case 4:
               var10009 = 72;
               break;
            case 5:
               var10009 = 219;
               break;
            default:
               var10009 = 53;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

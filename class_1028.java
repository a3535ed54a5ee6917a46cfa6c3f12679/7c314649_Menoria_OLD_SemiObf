
// $FF: renamed from: cx
public class class_1028 {

   // $FF: renamed from: b java.lang.Object[][]
   private Object[][] field_5413;
   // $FF: renamed from: c java.lang.String
   private static final String field_5414;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5415;


   // $FF: renamed from: <init> () void
   public void method_5824() {
      super();
      Object[][] var10001 = new Object[14][];
      Object[] var10004 = new Object[]{class_1192.field_6068, null};
      add var10007 = new add;
      var10007.method_3725(class_1010.field_5124, 9);
      var10004[1] = var10007;
      var10001[0] = var10004;
      var10004 = new Object[]{class_1192.field_6069, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5123, 9);
      var10004[1] = var10007;
      var10001[1] = var10004;
      var10004 = new Object[]{class_1192.field_6084, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5122, 9);
      var10004[1] = var10007;
      var10001[2] = var10004;
      var10004 = new Object[]{class_1192.field_6157, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5244, 9);
      var10004[1] = var10007;
      var10001[3] = var10004;
      var10004 = new Object[]{class_1192.field_6049, null};
      var10007 = new add;
      var10007.method_3726(class_1010.field_5208, 9, 4);
      var10004[1] = var10007;
      var10001[4] = var10004;
      var10004 = new Object[]{class_1192.field_6176, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5189, 9);
      var10004[1] = var10007;
      var10001[5] = var10004;
      var10004 = new Object[]{class_1192.field_6187, null};
      var10007 = new add;
      var10007.method_3726(class_1010.field_5121, 9, 0);
      var10004[1] = var10007;
      var10001[6] = var10004;
      var10004 = new Object[]{class_1192.field_6184, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5154, 9);
      var10004[1] = var10007;
      var10001[7] = var10004;
      var10004 = new Object[]{class_1192.field_6199, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5283, 9);
      var10004[1] = var10007;
      var10001[8] = var10004;
      var10004 = new Object[]{class_1192.field_6200, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5285, 9);
      var10004[1] = var10007;
      var10001[9] = var10004;
      var10004 = new Object[]{class_1192.field_6201, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5286, 9);
      var10004[1] = var10007;
      var10001[10] = var10004;
      var10004 = new Object[]{class_1192.field_6202, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5287, 9);
      var10004[1] = var10007;
      var10001[11] = var10004;
      var10004 = new Object[]{class_1192.field_6198, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5284, 9);
      var10004[1] = var10007;
      var10001[12] = var10004;
      var10004 = new Object[]{class_1192.field_6203, null};
      var10007 = new add;
      var10007.method_3725(class_1010.field_5288, 9);
      var10004[1] = var10007;
      var10001[13] = var10004;
      this.field_5413 = var10001;
   }

   // $FF: renamed from: b (cy) void
   public void method_5825(class_1031 var1) {
      add var10001;
      Object[] var10002;
      String[] var5;
      for(int var2 = 0; var2 < this.field_5413.length; ++var2) {
         aji var3 = (aji)this.field_5413[var2][0];
         add var4 = (add)this.field_5413[var2][1];
         var10001 = new add;
         var10001.method_3721(var3);
         var10002 = new Object[5];
         var5 = field_5415;
         var10002[0] = "###";
         var10002[1] = "###";
         var10002[2] = "###";
         var10002[3] = Character.valueOf('#');
         var10002[4] = var4;
         var1.method_5837(var10001, var10002);
         var1.method_5837(var4, new Object[]{"#", Character.valueOf('#'), var3});
      }

      var10001 = new add;
      var10001.method_3724(class_1010.field_5124);
      var10002 = new Object[5];
      var5 = field_5415;
      var10002[0] = "###";
      var10002[1] = "###";
      var10002[2] = "###";
      var10002[3] = Character.valueOf('#');
      var10002[4] = class_1010.field_5228;
      var1.method_5837(var10001, var10002);
      var10001 = new add;
      var10001.method_3725(class_1010.field_5228, 9);
      var1.method_5837(var10001, new Object[]{"#", Character.valueOf('#'), class_1010.field_5124});
   }

   // $FF: renamed from: <clinit> () void
   static void method_5826() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ÎïYu#½óâæ®àù";
      int var4 = "ÎïYu#½óâæ®àù".length();
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
                  field_5415 = var5;
                  String[] var10 = field_5415;
                  field_5414 = "CL_00000089";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 150;
               break;
            case 1:
               var10009 = 216;
               break;
            case 2:
               var10009 = 193;
               break;
            case 3:
               var10009 = 196;
               break;
            case 4:
               var10009 = 114;
               break;
            case 5:
               var10009 = 94;
               break;
            default:
               var10009 = 8;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

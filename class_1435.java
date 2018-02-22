
// $FF: renamed from: p7
public class class_1435 {

   // $FF: renamed from: b java.lang.String
   private String field_7611;
   // $FF: renamed from: c float
   private float field_7612;
   // $FF: renamed from: d float
   private float field_7613;
   // $FF: renamed from: e int
   private int field_7614;
   // $FF: renamed from: f X
   private class_107 field_7615;
   // $FF: renamed from: g boolean
   private boolean field_7616;
   // $FF: renamed from: h java.lang.String
   private static final String field_7617 = "CL_00001122";


   // $FF: renamed from: <init> () void
   public void method_7805() {
      super();
      this.field_7612 = 1.0F;
      this.field_7613 = 1.0F;
      this.field_7614 = 1;
      this.field_7615 = class_107.field_188;
      this.field_7616 = false;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7806() {
      return this.field_7611;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_7807(String var1) {
      this.field_7611 = var1;
   }

   // $FF: renamed from: c () float
   public float method_7808() {
      return this.field_7612;
   }

   // $FF: renamed from: b (float) void
   public void method_7809(float var1) {
      this.field_7612 = var1;
   }

   // $FF: renamed from: d () float
   public float method_7810() {
      return this.field_7613;
   }

   // $FF: renamed from: c (float) void
   public void method_7811(float var1) {
      this.field_7613 = var1;
   }

   // $FF: renamed from: e () int
   public int method_7812() {
      return this.field_7614;
   }

   // $FF: renamed from: b (int) void
   public void method_7813(int var1) {
      this.field_7614 = var1;
   }

   // $FF: renamed from: f () X
   public class_107 method_7814() {
      return this.field_7615;
   }

   // $FF: renamed from: b (X) void
   public void method_7815(class_107 var1) {
      this.field_7615 = var1;
   }

   // $FF: renamed from: g () boolean
   public boolean method_7816() {
      return this.field_7616;
   }

   // $FF: renamed from: b (boolean) void
   public void method_7817(boolean var1) {
      this.field_7616 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7818() {
      boolean var10000 = true;
      char[] var10003 = "DödûÓ¼»6\tù".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7617 = (new String((char[])var4)).intern();
            String var2 = field_7617;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 125;
            break;
         case 1:
            var10009 = 192;
            break;
         case 2:
            var10009 = 65;
            break;
         case 3:
            var10009 = 177;
            break;
         case 4:
            var10009 = 153;
            break;
         case 5:
            var10009 = 246;
            break;
         default:
            var10009 = 241;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

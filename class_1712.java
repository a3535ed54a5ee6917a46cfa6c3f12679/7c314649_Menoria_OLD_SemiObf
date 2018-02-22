
// $FF: renamed from: x2
public class class_1712 {

   // $FF: renamed from: b int
   private final int field_8975;
   // $FF: renamed from: c int
   private final int field_8976;
   // $FF: renamed from: d java.lang.Object
   private Object field_8977;
   // $FF: renamed from: e boolean
   private boolean field_8978;
   // $FF: renamed from: f java.lang.String
   private static final String field_8979 = "CL_00001560";


   // $FF: renamed from: <init> (int, int, java.lang.Object) void
   public void method_9537(int var1, int var2, Object var3) {
      super();
      this.field_8976 = var2;
      this.field_8977 = var3;
      this.field_8975 = var1;
      this.field_8978 = true;
   }

   // $FF: renamed from: b () int
   public int method_9538() {
      return this.field_8976;
   }

   // $FF: renamed from: b (java.lang.Object) void
   public void method_9539(Object var1) {
      this.field_8977 = var1;
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_9540() {
      return this.field_8977;
   }

   // $FF: renamed from: d () int
   public int method_9541() {
      return this.field_8975;
   }

   // $FF: renamed from: e () boolean
   public boolean method_9542() {
      return this.field_8978;
   }

   // $FF: renamed from: b (boolean) void
   public void method_9543(boolean var1) {
      this.field_8978 = var1;
   }

   // $FF: renamed from: b (x2, boolean) boolean
   static boolean method_9544(class_1712 var0, boolean var1) {
      return var0.field_8978 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9545() {
      boolean var10000 = true;
      char[] var10003 = "}è3»PUZ»".toCharArray();
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
            field_8979 = (new String((char[])var4)).intern();
            String var2 = field_8979;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 241;
            break;
         case 1:
            var10009 = 107;
            break;
         case 2:
            var10009 = 163;
            break;
         case 3:
            var10009 = 68;
            break;
         case 4:
            var10009 = 175;
            break;
         case 5:
            var10009 = 170;
            break;
         default:
            var10009 = 251;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

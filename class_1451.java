
// $FF: renamed from: pH
public class class_1451 implements Comparable {

   // $FF: renamed from: b java.lang.String
   private final String field_7704;
   // $FF: renamed from: c java.lang.String
   private final String field_7705;
   // $FF: renamed from: d java.lang.String
   private final String field_7706;
   // $FF: renamed from: e boolean
   private final boolean field_7707;
   // $FF: renamed from: h java.lang.String
   private static final String field_7708 = "%s (%s)";


   // $FF: renamed from: <init> (java.lang.String, java.lang.String, java.lang.String, boolean) void
   public void method_7897(String var1, String var2, String var3, boolean var4) {
      super();
      this.field_7704 = var1;
      this.field_7705 = var2;
      this.field_7706 = var3;
      this.field_7707 = var4;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7898() {
      return this.field_7704;
   }

   // $FF: renamed from: c () boolean
   public boolean method_7899() {
      return this.field_7707;
   }

   public String toString() {
      return String.format("%s (%s)", new Object[]{this.field_7706, this.field_7705});
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this == var1) {
            return true;
         }

         var10000 = var1;
      }

      boolean var3 = var10000 instanceof class_1451;
      if(var2 != null) {
         if(!var3) {
            return false;
         }

         var3 = this.field_7704.equals(((class_1451)var1).field_7704);
      }

      return var3;
   }

   public int hashCode() {
      return this.field_7704.hashCode();
   }

   // $FF: renamed from: b (pH) int
   public int method_7900(class_1451 var1) {
      return this.field_7704.compareTo(var1.field_7704);
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_7900((class_1451)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7901() {
      boolean var10000 = true;
      char[] var10003 = "ÚÕññ\r;".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7708 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 222;
            break;
         case 1:
            var10009 = 222;
            break;
         case 2:
            var10009 = 130;
            break;
         case 3:
            var10009 = 174;
            break;
         case 4:
            var10009 = 163;
            break;
         case 5:
            var10009 = 9;
            break;
         default:
            var10009 = 101;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}


// $FF: renamed from: gP
public class class_1078 {

   // $FF: renamed from: b long
   public long field_5673;
   // $FF: renamed from: c boolean
   public boolean field_5674;
   // $FF: renamed from: d byte[]
   public byte[] field_5675;
   // $FF: renamed from: e gM
   public class_1073 field_5676;
   // $FF: renamed from: f gM
   public class_1073 field_5677;
   // $FF: renamed from: g gM
   public class_1073 field_5678;
   // $FF: renamed from: h byte[]
   public byte[] field_5679;
   // $FF: renamed from: i rr
   public class_1580 field_5680;
   // $FF: renamed from: j rr
   public class_1580 field_5681;
   // $FF: renamed from: k rr
   public class_1580 field_5682;
   // $FF: renamed from: l int
   public final int field_5683;
   // $FF: renamed from: m int
   public final int field_5684;
   // $FF: renamed from: n java.lang.String
   private static final String field_5685 = "CL_00000380";


   // $FF: renamed from: <init> (int, int) void
   public void method_6108(int var1, int var2) {
      super();
      this.field_5683 = var1;
      this.field_5684 = var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6109() {
      boolean var10000 = true;
      char[] var10003 = "£¦ÝoÐÙdÝ".toCharArray();
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
            field_5685 = (new String((char[])var4)).intern();
            String var2 = field_5685;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 198;
            break;
         case 1:
            var10009 = 204;
            break;
         case 2:
            var10009 = 122;
            break;
         case 3:
            var10009 = 203;
            break;
         case 4:
            var10009 = 2;
            break;
         case 5:
            var10009 = 147;
            break;
         default:
            var10009 = 121;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

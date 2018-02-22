
// $FF: renamed from: dt
public final class class_1045 {

   // $FF: renamed from: b long
   private final long field_5517;
   // $FF: renamed from: c G
   private final class_94 field_5518;
   // $FF: renamed from: d boolean
   private final boolean field_5519;
   // $FF: renamed from: e boolean
   private final boolean field_5520;
   // $FF: renamed from: f du
   private final class_1046 field_5521;
   // $FF: renamed from: g boolean
   private boolean field_5522;
   // $FF: renamed from: h boolean
   private boolean field_5523;
   // $FF: renamed from: i java.lang.String
   private String field_5524;
   // $FF: renamed from: j java.lang.String
   private static final String field_5525 = "CL_00000147";


   // $FF: renamed from: <init> (long, G, boolean, boolean, du) void
   public void method_5905(long var1, class_94 var3, boolean var4, boolean var5, class_1046 var6) {
      super();
      this.field_5524 = "";
      this.field_5517 = var1;
      this.field_5518 = var3;
      this.field_5519 = var4;
      this.field_5520 = var5;
      this.field_5521 = var6;
   }

   // $FF: renamed from: <init> (jY) void
   public void method_5906(class_1303 var1) {
      this.method_5905(var1.method_6836(), var1.method_6864(), var1.method_6865(), var1.method_6867(), var1.method_6868());
   }

   // $FF: renamed from: b () dt
   public class_1045 method_5907() {
      this.field_5523 = true;
      return this;
   }

   // $FF: renamed from: c () dt
   public class_1045 method_5908() {
      this.field_5522 = true;
      return this;
   }

   // $FF: renamed from: b (java.lang.String) dt
   public class_1045 method_5909(String var1) {
      this.field_5524 = var1;
      return this;
   }

   // $FF: renamed from: d () boolean
   public boolean method_5910() {
      return this.field_5523;
   }

   // $FF: renamed from: e () long
   public long method_5911() {
      return this.field_5517;
   }

   // $FF: renamed from: f () G
   public class_94 method_5912() {
      return this.field_5518;
   }

   // $FF: renamed from: g () boolean
   public boolean method_5913() {
      return this.field_5520;
   }

   // $FF: renamed from: h () boolean
   public boolean method_5914() {
      return this.field_5519;
   }

   // $FF: renamed from: i () du
   public class_1046 method_5915() {
      return this.field_5521;
   }

   // $FF: renamed from: j () boolean
   public boolean method_5916() {
      return this.field_5522;
   }

   // $FF: renamed from: b (int) G
   public static class_94 method_5917(int var0) {
      return class_94.method_449(var0);
   }

   // $FF: renamed from: k () java.lang.String
   public String method_5918() {
      return this.field_5524;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5919() {
      boolean var10000 = true;
      char[] var10003 = "0ëÑBFCº".toCharArray();
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
            field_5525 = (new String((char[])var4)).intern();
            String var2 = field_5525;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 160;
            break;
         case 1:
            var10009 = 116;
            break;
         case 2:
            var10009 = 93;
            break;
         case 3:
            var10009 = 122;
            break;
         case 4:
            var10009 = 161;
            break;
         case 5:
            var10009 = 165;
            break;
         default:
            var10009 = 126;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

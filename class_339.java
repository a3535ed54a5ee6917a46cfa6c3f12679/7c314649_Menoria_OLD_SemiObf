
// $FF: renamed from: s2
public class class_339 extends class_250 {

   // $FF: renamed from: c long
   private long field_1704;
   // $FF: renamed from: d long
   private long field_1705;
   // $FF: renamed from: i java.lang.String
   private static final String field_1706 = "time=%d,dtime=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (long, long, boolean) void
   public void method_1921(long var1, long var3, boolean var5) {
      class_339 var7;
      label24: {
         super.method_1449();
         this.field_1704 = var1;
         this.field_1705 = var3;
         String[] var6 = class_752.method_4253();
         int var10000 = var5;
         if(var6 != null) {
            if(var5 != 0) {
               return;
            }

            this.field_1705 = -this.field_1705;
            var7 = this;
            if(var6 == null) {
               break label24;
            }

            long var8;
            var10000 = (var8 = this.field_1705 - 0L) == 0L?0:(var8 < 0L?-1:1);
         }

         if(var10000 != 0) {
            return;
         }

         var7 = this;
      }

      var7.field_1705 = -1L;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1704 = var1.readLong();
      this.field_1705 = var1.readLong();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeLong(this.field_1704);
      var1.writeLong(this.field_1705);
   }

   // $FF: renamed from: b (tF) void
   public void method_1922(class_64 var1) {
      var1.method_326(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("time=%d,dtime=%d", new Object[]{Long.valueOf(this.field_1704), Long.valueOf(this.field_1705)});
   }

   // $FF: renamed from: a () long
   public long method_1923() {
      return this.field_1704;
   }

   // $FF: renamed from: e () long
   public long method_1924() {
      return this.field_1705;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "¢$éåq#ú)åµ1zó)".toCharArray();
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
            field_1706 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 20;
            break;
         case 1:
            var10009 = 143;
            break;
         case 2:
            var10009 = 170;
            break;
         case 3:
            var10009 = 78;
            break;
         case 4:
            var10009 = 26;
            break;
         case 5:
            var10009 = 150;
            break;
         default:
            var10009 = 133;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}

import com.mojang.authlib.GameProfile;

// $FF: renamed from: tT
public class class_1607 {

   // $FF: renamed from: b int
   private final int field_8399;
   // $FF: renamed from: c int
   private final int field_8400;
   // $FF: renamed from: d com.mojang.authlib.GameProfile[]
   private GameProfile[] field_8401;
   // $FF: renamed from: e java.lang.String
   private static final String field_8402 = "CL_00001386";


   // $FF: renamed from: <init> (int, int) void
   public void method_8797(int var1, int var2) {
      super();
      this.field_8399 = var1;
      this.field_8400 = var2;
   }

   // $FF: renamed from: b () int
   public int method_8798() {
      return this.field_8399;
   }

   // $FF: renamed from: c () int
   public int method_8799() {
      return this.field_8400;
   }

   // $FF: renamed from: d () com.mojang.authlib.GameProfile[]
   public GameProfile[] method_8800() {
      return this.field_8401;
   }

   // $FF: renamed from: b (com.mojang.authlib.GameProfile[]) void
   public void method_8801(GameProfile[] var1) {
      this.field_8401 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8802() {
      boolean var10000 = true;
      char[] var10003 = "ÌÊG­9v`¾µ «".toCharArray();
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
            field_8402 = (new String((char[])var4)).intern();
            String var2 = field_8402;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 178;
            break;
         case 1:
            var10009 = 187;
            break;
         case 2:
            var10009 = 37;
            break;
         case 3:
            var10009 = 160;
            break;
         case 4:
            var10009 = 52;
            break;
         case 5:
            var10009 = 123;
            break;
         default:
            var10009 = 109;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

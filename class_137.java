import java.util.ArrayList;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: la
public class class_137 extends Gui {

   // $FF: renamed from: b int
   protected int field_374;
   // $FF: renamed from: h int
   protected int field_375;
   // $FF: renamed from: i int
   public int field_376;
   // $FF: renamed from: j int
   public int field_377;
   // $FF: renamed from: l java.util.ArrayList
   private ArrayList field_378;
   // $FF: renamed from: m boolean
   private boolean field_379;
   // $FF: renamed from: n boolean
   public boolean field_380;
   // $FF: renamed from: o boolean
   private boolean field_381;
   // $FF: renamed from: p int
   private int field_382;
   // $FF: renamed from: q int
   private int field_383;
   // $FF: renamed from: r int
   private int field_384;
   // $FF: renamed from: s int
   private int field_385;
   // $FF: renamed from: t kU
   private FontRenderer field_386;
   // $FF: renamed from: u int
   private int field_387;
   // $FF: renamed from: v java.lang.String
   private static final String field_388 = "CL_00000671";


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
   }

   // $FF: renamed from: b (bao, int, int) void
   public void method_662(bao var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_380;
      if(var4 != null) {
         if(!this.field_380) {
            return;
         }

         GL11.glEnable(3042);
         buu.method_9081(770, 771, 1, 0);
         GL11.glBlendFunc(770, 771);
         this.method_663(var1, var2, var3);
         var10000 = this.field_377 + this.field_375 / 2 + this.field_387 / 2;
      }

      int var5 = var10000;
      int var6 = var5 - this.field_378.size() * 10 / 2;
      int var7 = 0;

      while(var7 < this.field_378.size()) {
         label24: {
            class_137 var8 = this;
            if(var4 != null) {
               if(this.field_379) {
                  this.drawCenteredString(this.field_386, (String)this.field_378.get(var7), this.field_376 + this.field_374 / 2, var6 + var7 * 10, this.field_382);
                  if(var4 != null) {
                     break label24;
                  }
               }

               var8 = this;
            }

            var8.method_657(this.field_386, (String)this.field_378.get(var7), this.field_376, var6 + var7 * 10, this.field_382);
         }

         ++var7;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (bao, int, int) void
   protected void method_663(bao var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_381;
      if(var4 != null) {
         if(!this.field_381) {
            return;
         }

         var10000 = this.field_374 + this.field_387 * 2;
      }

      int var5 = var10000;
      int var6 = this.field_375 + this.field_387 * 2;
      int var7 = this.field_376 - this.field_387;
      int var8 = this.field_377 - this.field_387;
      drawRect(var7, var8, var7 + var5, var8 + var6, this.field_383);
      this.method_652(var7, var7 + var5, var8, this.field_384);
      this.method_652(var7, var7 + var5, var8 + var6, this.field_385);
      this.method_653(var7, var8, var8 + var6, this.field_384);
      this.method_653(var7 + var5, var8, var8 + var6, this.field_385);
   }

   // $FF: renamed from: <clinit> () void
   static void method_664() {
      boolean var10000 = true;
      char[] var10003 = "PmÝ[ 6i#µZ".toCharArray();
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
            field_388 = (new String((char[])var4)).intern();
            String var2 = field_388;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 141;
            break;
         case 1:
            var10009 = 191;
            break;
         case 2:
            var10009 = 28;
            break;
         case 3:
            var10009 = 245;
            break;
         case 4:
            var10009 = 142;
            break;
         case 5:
            var10009 = 152;
            break;
         default:
            var10009 = 199;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

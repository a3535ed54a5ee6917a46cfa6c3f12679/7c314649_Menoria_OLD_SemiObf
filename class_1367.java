
// $FF: renamed from: mE
public class Gui7 implements class_31 {

   // $FF: renamed from: b bao
   private final bao field_7227;
   // $FF: renamed from: c java.lang.String
   private static final String field_7228;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7229;


   // $FF: renamed from: <init> () void
   public void setCanLoseFocus2() {
      super();
      this.field_7227 = bao.method_5273();
   }

   // $FF: renamed from: b (int, int, int, int, int, bmh, int, int, boolean) void
   public void method_147(int var1, int var2, int var3, int var4, int var5, bmh var6, int var7, int var8, boolean var9) {
      String[] var10000 = class_752.method_4253();
      int var11 = var3 + var5 / 2 - this.field_7227.enableBackgroundDrawing4.FONT_HEIGHT / 2;
      String[] var10 = var10000;
      String[] var13 = field_7229;
      this.field_7227.enableBackgroundDrawing4.method_7020(class_1450.method_7896("lanServer.scanning", new Object[0]), this.field_7227.enableBackgroundDrawing6.width / 2 - this.field_7227.enableBackgroundDrawing4.getCharWidth(class_1450.method_7896("lanServer.scanning", new Object[0])) / 2, var11, 16777215);
      String var12;
      switch((int)(bao.method_5283() / 300L % 4L)) {
      case 0:
      default:
         var13 = field_7229;
         var12 = "O o o";
         if(var10 != null) {
            break;
         }
      case 1:
      case 3:
         var13 = field_7229;
         var12 = "o O o";
         if(var10 != null) {
            break;
         }
      case 2:
         var10000 = field_7229;
         var12 = "o o O";
      }

      this.field_7227.enableBackgroundDrawing4.method_7020(var12, this.field_7227.enableBackgroundDrawing6.width / 2 - this.field_7227.enableBackgroundDrawing4.getCharWidth(var12) / 2, var11 + this.field_7227.enableBackgroundDrawing4.FONT_HEIGHT, 8421504);
   }

   // $FF: renamed from: b (int, int, int, int, int, int) boolean
   public boolean method_148(int var1, int var2, int var3, int var4, int var5, int var6) {
      return false;
   }

   // $FF: renamed from: c (int, int, int, int, int, int) void
   public void method_149(int var1, int var2, int var3, int var4, int var5, int var6) {}

   // $FF: renamed from: <clinit> () void
   static void setCanLoseFocus3() {
      // $FF: Couldn't be decompiled
   }
}

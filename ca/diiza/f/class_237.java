package ca.diiza.f;


// $FF: renamed from: ca.diiza.f.b
public enum class_237 {

   HEART,
   SMILEY,
   LANGUE,
   BIG_SMILE,
   SURPRISED,
   DECUS,
   CLIN_OEIL,
   // $FF: renamed from: XD ca.diiza.f.b
   field_1277,
   NOCOMMENT,
   FACHER,
   INDESISIF,
   TRISTE;
   public String expr;
   public String replace;
   // $FF: renamed from: id int
   public int field_1278;
   public int width;
   public int height;
   // $FF: renamed from: a ca.diiza.f.b[]
   // $FF: synthetic field
   private static final class_237[] field_1279;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, java.lang.String, int, int, int) void
   private void method_1288(String var1, int var2, String var3, String var4, int var5, int var6, int var7) {
      super(var1, var2);
      this.expr = var3;
      this.replace = var4;
      this.field_1278 = var5;
      this.width = var6;
      this.height = var7;
   }

   // $FF: renamed from: a () int
   public int method_1289() {
      return 0;
   }

   // $FF: renamed from: b () int
   public int method_1290() {
      return this.field_1278 * 16;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1291() {
      // $FF: Couldn't be decompiled
   }
}

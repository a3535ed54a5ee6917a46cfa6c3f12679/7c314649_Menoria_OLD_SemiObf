
// $FF: renamed from: s3
public class class_338 extends class_250 {

   // $FF: renamed from: c int
   private int field_1700;
   // $FF: renamed from: d int
   private int field_1701;
   // $FF: renamed from: e int
   private int field_1702;
   // $FF: renamed from: f java.lang.String[]
   private String[] field_1703;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int, java.lang.String[]) void
   public void method_1915(int var1, int var2, int var3, String[] var4) {
      super.method_1449();
      this.field_1700 = var1;
      this.field_1701 = var2;
      this.field_1702 = var3;
      this.field_1703 = new String[]{var4[0], var4[1], var4[2], var4[3]};
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_1700 = var1.readInt();
      String[] var2 = var10000;
      this.field_1701 = var1.readShort();
      this.field_1702 = var1.readInt();
      this.field_1703 = new String[4];
      int var3 = 0;

      while(var3 < 4) {
         this.field_1703[var3] = var1.method_524(15);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1700);
      var1.writeShort(this.field_1701);
      String[] var10000 = class_752.method_4253();
      var1.writeInt(this.field_1702);
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < 4) {
         var1.method_525(this.field_1703[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (tF) void
   public void method_1916(class_64 var1) {
      var1.method_327(this);
   }

   // $FF: renamed from: a () int
   public int method_1917() {
      return this.field_1700;
   }

   // $FF: renamed from: e () int
   public int method_1918() {
      return this.field_1701;
   }

   // $FF: renamed from: f () int
   public int method_1919() {
      return this.field_1702;
   }

   // $FF: renamed from: g () java.lang.String[]
   public String[] method_1920() {
      return this.field_1703;
   }
}

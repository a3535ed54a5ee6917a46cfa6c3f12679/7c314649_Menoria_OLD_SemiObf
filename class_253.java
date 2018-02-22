import java.security.PublicKey;

// $FF: renamed from: tx
public class class_253 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1383;
   // $FF: renamed from: d java.security.PublicKey
   private PublicKey field_1384;
   // $FF: renamed from: e byte[]
   private byte[] field_1385;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.lang.String, java.security.PublicKey, byte[]) void
   public void method_1466(String var1, PublicKey var2, byte[] var3) {
      super.method_1449();
      this.field_1383 = var1;
      this.field_1384 = var2;
      this.field_1385 = var3;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1383 = var1.method_524(20);
      this.field_1384 = class_1701.method_9422(method_1452(var1));
      this.field_1385 = method_1452(var1);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(this.field_1383);
      method_1451(var1, this.field_1384.getEncoded());
      method_1451(var1, this.field_1385);
   }

   // $FF: renamed from: b (tO) void
   public void method_1467(class_61 var1) {
      var1.method_246(this);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1468() {
      return this.field_1383;
   }

   // $FF: renamed from: e () java.security.PublicKey
   public PublicKey method_1469() {
      return this.field_1384;
   }

   // $FF: renamed from: f () byte[]
   public byte[] method_1470() {
      return this.field_1385;
   }
}

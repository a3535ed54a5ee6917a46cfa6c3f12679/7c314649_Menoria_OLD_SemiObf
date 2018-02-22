import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

// $FF: renamed from: tA
public class class_303 extends class_250 {

   // $FF: renamed from: c byte[]
   private byte[] field_1568;
   // $FF: renamed from: d byte[]
   private byte[] field_1569;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
      this.field_1568 = new byte[0];
      this.field_1569 = new byte[0];
   }

   // $FF: renamed from: <init> (javax.crypto.SecretKey, java.security.PublicKey, byte[]) void
   public void method_1730(SecretKey var1, PublicKey var2, byte[] var3) {
      super.method_1449();
      this.field_1568 = new byte[0];
      this.field_1569 = new byte[0];
      this.field_1568 = class_1701.method_9424(var2, var1.getEncoded());
      this.field_1569 = class_1701.method_9424(var2, var3);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1568 = method_1452(var1);
      this.field_1569 = method_1452(var1);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      method_1451(var1, this.field_1568);
      method_1451(var1, this.field_1569);
   }

   // $FF: renamed from: b (tP) void
   public void method_1731(class_60 var1) {
      var1.method_245(this);
   }

   // $FF: renamed from: b (java.security.PrivateKey) javax.crypto.SecretKey
   public SecretKey method_1732(PrivateKey var1) {
      return class_1701.method_9423(var1, this.field_1568);
   }

   // $FF: renamed from: c (java.security.PrivateKey) byte[]
   public byte[] method_1733(PrivateKey var1) {
      String[] var2 = class_752.method_4253();
      PrivateKey var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return this.field_1569;
         }

         var10000 = var1;
      }

      return class_1701.method_9425(var10000, this.field_1569);
   }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: sr
public class class_282 extends class_250 {

   // $FF: renamed from: c double
   private double field_1498;
   // $FF: renamed from: d double
   private double field_1499;
   // $FF: renamed from: e double
   private double field_1500;
   // $FF: renamed from: f float
   private float field_1501;
   // $FF: renamed from: g java.util.List
   private List field_1502;
   // $FF: renamed from: h float
   private float field_1503;
   // $FF: renamed from: i float
   private float field_1504;
   // $FF: renamed from: j float
   private float field_1505;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (double, double, double, float, java.util.List, azw) void
   public void method_1625(double var1, double var3, double var5, float var7, List var8, azw var9) {
      super.method_1449();
      this.field_1498 = var1;
      String[] var10000 = class_752.method_4253();
      this.field_1499 = var3;
      String[] var10 = var10000;
      this.field_1500 = var5;
      this.field_1501 = var7;
      this.field_1502 = new ArrayList(var8);
      if(var10 != null) {
         if(var9 == null) {
            return;
         }

         this.field_1503 = (float)var9.field_4220;
         this.field_1504 = (float)var9.field_4221;
      }

      this.field_1505 = (float)var9.field_4222;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1498 = (double)var1.readFloat();
      this.field_1499 = (double)var1.readFloat();
      this.field_1500 = (double)var1.readFloat();
      this.field_1501 = var1.readFloat();
      int var3 = var1.readInt();
      this.field_1502 = new ArrayList(var3);
      int var4 = (int)this.field_1498;
      String[] var10000 = class_752.method_4253();
      int var5 = (int)this.field_1499;
      int var6 = (int)this.field_1500;
      String[] var2 = var10000;
      int var7 = 0;

      while(true) {
         if(var7 < var3) {
            int var8 = var1.readByte() + var4;
            int var9 = var1.readByte() + var5;
            int var10 = var1.readByte() + var6;
            List var11 = this.field_1502;
            class_1034 var10001 = new class_1034;
            var10001.method_5854(var8, var9, var10);
            var11.add(var10001);
            ++var7;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.field_1503 = var1.readFloat();
         this.field_1504 = var1.readFloat();
         this.field_1505 = var1.readFloat();
         break;
      }

   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeFloat((float)this.field_1498);
      var1.writeFloat((float)this.field_1499);
      var1.writeFloat((float)this.field_1500);
      var1.writeFloat(this.field_1501);
      var1.writeInt(this.field_1502.size());
      String[] var10000 = class_752.method_4253();
      int var3 = (int)this.field_1498;
      String[] var2 = var10000;
      int var4 = (int)this.field_1499;
      int var5 = (int)this.field_1500;
      Iterator var6 = this.field_1502.iterator();

      while(true) {
         if(var6.hasNext()) {
            class_1034 var7 = (class_1034)var6.next();
            int var8 = var7.field_5472 - var3;
            int var9 = var7.field_5473 - var4;
            int var10 = var7.field_5474 - var5;
            var1.writeByte(var8);
            var1.writeByte(var9);
            var1.writeByte(var10);
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         var1.writeFloat(this.field_1503);
         var1.writeFloat(this.field_1504);
         var1.writeFloat(this.field_1505);
         break;
      }

   }

   // $FF: renamed from: b (tF) void
   public void method_1626(class_64 var1) {
      var1.getBlock0(this);
   }

   // $FF: renamed from: a () float
   public float method_1627() {
      return this.field_1503;
   }

   // $FF: renamed from: e () float
   public float method_1628() {
      return this.field_1504;
   }

   // $FF: renamed from: f () float
   public float method_1629() {
      return this.field_1505;
   }

   // $FF: renamed from: g () double
   public double method_1630() {
      return this.field_1498;
   }

   // $FF: renamed from: h () double
   public double method_1631() {
      return this.field_1499;
   }

   // $FF: renamed from: i () double
   public double method_1632() {
      return this.field_1500;
   }

   // $FF: renamed from: j () float
   public float method_1633() {
      return this.field_1501;
   }

   // $FF: renamed from: k () java.util.List
   public List method_1634() {
      return this.field_1502;
   }
}

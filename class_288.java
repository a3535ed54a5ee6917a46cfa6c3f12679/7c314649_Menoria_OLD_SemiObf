import java.util.List;

// $FF: renamed from: sl
public class class_288 extends class_250 {

   // $FF: renamed from: c int
   private int field_1518;
   // $FF: renamed from: d add[]
   private add[] field_1519;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, java.util.List) void
   public void method_1657(int var1, List var2) {
      super.method_1449();
      this.field_1518 = var1;
      String[] var10000 = class_752.method_4253();
      this.field_1519 = new add[var2.size()];
      String[] var3 = var10000;
      int var4 = 0;

      while(var4 < this.field_1519.length) {
         add var10002;
         label20: {
            add var5 = (add)var2.get(var4);
            var10002 = var5;
            if(var3 != null) {
               if(var5 == null) {
                  var10002 = null;
                  break label20;
               }

               var10002 = var5;
            }

            var10002 = var10002.method_3754();
         }

         this.field_1519[var4] = var10002;
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1518 = var1.readUnsignedByte();
      String[] var10000 = class_752.method_4253();
      short var3 = var1.readShort();
      String[] var2 = var10000;
      this.field_1519 = new add[var3];
      int var4 = 0;

      while(var4 < var3) {
         this.field_1519[var4] = var1.method_523();
         ++var4;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      var1.writeByte(this.field_1518);
      String[] var2 = var10000;
      var1.writeShort(this.field_1519.length);
      add[] var3 = this.field_1519;
      int var4 = var3.length;
      int var5 = 0;

      while(var5 < var4) {
         add var6 = var3[var5];
         var1.method_522(var6);
         ++var5;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (tF) void
   public void method_1658(class_64 var1) {
      var1.method_291(this);
   }

   // $FF: renamed from: a () int
   public int method_1659() {
      return this.field_1518;
   }

   // $FF: renamed from: e () add[]
   public add[] method_1660() {
      return this.field_1519;
   }
}

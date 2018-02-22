import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;

// $FF: renamed from: sy
public class class_278 extends class_250 {

   // $FF: renamed from: c int[]
   private int[] field_1474;
   // $FF: renamed from: d int[]
   private int[] field_1475;
   // $FF: renamed from: e int[]
   private int[] field_1476;
   // $FF: renamed from: f int[]
   private int[] field_1477;
   // $FF: renamed from: g byte[]
   private byte[] field_1478;
   // $FF: renamed from: h byte[][]
   private byte[][] field_1479;
   // $FF: renamed from: i int
   private int field_1480;
   // $FF: renamed from: j boolean
   private boolean field_1481;
   // $FF: renamed from: k byte[]
   private static byte[] field_1482;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] field_1483;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.util.List) void
   public void method_1597(List var1) {
      String[] var2;
      int var3;
      boolean var10001;
      label99: {
         label102: {
            super.method_1449();
            String[] var10000 = class_752.method_4253();
            var3 = var1.size();
            var2 = var10000;
            this.field_1474 = new int[var3];
            this.field_1475 = new int[var3];
            this.field_1476 = new int[var3];
            this.field_1477 = new int[var3];
            this.field_1479 = new byte[var3][];
            var10001 = var1.isEmpty();
            if(var2 != null) {
               if(var10001) {
                  break label102;
               }

               var10001 = ((class_1069)var1.get(0)).field_5629.field_1820.field_5736;
            }

            if(var2 == null) {
               break label99;
            }

            if(!var10001) {
               var10001 = true;
               break label99;
            }
         }

         var10001 = false;
      }

      this.field_1481 = var10001;
      int var4 = 0;
      int var5 = 0;

      while(var5 < var3) {
         class_1069 var6 = (class_1069)var1.get(var5);
         class_1595 var7 = class_279.method_1611(var6, true, '\uffff');
         int var13 = field_1482.length;
         int var14 = var4 + var7.field_8309.length;
         if(var2 != null) {
            if(var13 < var14) {
               byte[] var8 = new byte[var4 + var7.field_8309.length];
               System.arraycopy(field_1482, 0, var8, 0, field_1482.length);
               field_1482 = var8;
            }

            System.arraycopy(var7.field_8309, 0, field_1482, var4, var7.field_8309.length);
            var13 = var4;
            var14 = var7.field_8309.length;
         }

         var4 = var13 + var14;
         this.field_1474[var5] = var6.fontRendererObj1;
         this.field_1475[var5] = var6.fontRendererObj2;
         this.field_1476[var5] = var7.field_8310;
         this.field_1477[var5] = var7.field_8311;
         this.field_1479[var5] = var7.field_8309;
         ++var5;
         if(var2 == null) {
            break;
         }
      }

      Deflater var12 = new Deflater(-1);

      try {
         var12.setInput(field_1482, 0, var4);
         var12.finish();
         this.field_1478 = new byte[var4];
         this.field_1480 = var12.deflate(this.field_1478);
      } finally {
         var12.end();
      }

   }

   // $FF: renamed from: a () int
   public static int method_1598() {
      return 5;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeShort(this.field_1474.length);
      var1.writeInt(this.field_1480);
      String[] var2 = class_752.method_4253();
      var1.writeBoolean(this.field_1481);
      var1.writeBytes(this.field_1478, 0, this.field_1480);
      int var3 = 0;

      while(var3 < this.field_1474.length) {
         var1.writeInt(this.field_1474[var3]);
         var1.writeInt(this.field_1475[var3]);
         var1.writeShort((short)(this.field_1476[var3] & '\uffff'));
         var1.writeShort((short)(this.field_1477[var3] & '\uffff'));
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (tF) void
   public void method_1599(class_64 var1) {
      var1.getBlock4(this);
   }

   // $FF: renamed from: b (int) int
   public int method_1600(int var1) {
      return this.field_1474[var1];
   }

   // $FF: renamed from: c (int) int
   public int method_1601(int var1) {
      return this.field_1475[var1];
   }

   // $FF: renamed from: e () int
   public int method_1602() {
      return this.field_1474.length;
   }

   // $FF: renamed from: d (int) byte[]
   public byte[] method_1603(int var1) {
      return this.field_1479[var1];
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      String[] var10000 = class_752.method_4253();
      StringBuilder var2 = new StringBuilder();
      String[] var1 = var10000;
      int var3 = 0;

      while(var3 < this.field_1474.length) {
         String[] var4;
         if(var3 > 0) {
            var4 = field_1483;
            var2.append(", ");
         }

         var4 = field_1483;
         var2.append(String.format("{x=%d, z=%d, sections=%d, adds=%d, data=%d}", new Object[]{Integer.valueOf(this.field_1474[var3]), Integer.valueOf(this.field_1475[var3]), Integer.valueOf(this.field_1476[var3]), Integer.valueOf(this.field_1477[var3]), Integer.valueOf(this.field_1479[var3].length)}));
         ++var3;
         if(var1 == null) {
            break;
         }
      }

      var10000 = field_1483;
      return String.format("size=%d, chunks=%d[%s]", new Object[]{Integer.valueOf(this.field_1480), Integer.valueOf(this.field_1474.length), var2});
   }

   // $FF: renamed from: f () int[]
   public int[] method_1604() {
      return this.field_1476;
   }

   // $FF: renamed from: g () int[]
   public int[] method_1605() {
      return this.field_1477;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.zip.DataFormatException) java.util.zip.DataFormatException
   private static DataFormatException method_1606(DataFormatException var0) {
      return var0;
   }
}

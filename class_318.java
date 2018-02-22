
// $FF: renamed from: sM
public class class_318 extends class_250 {

   // $FF: renamed from: c int[]
   private int[] field_1615;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_1616;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int[]) void
   public void method_1805(int ... var1) {
      super.method_1449();
      this.field_1615 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1615 = new int[var1.readByte()];
      String[] var2 = class_752.method_4253();
      int var3 = 0;

      while(var3 < this.field_1615.length) {
         this.field_1615[var3] = var1.readInt();
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      var1.writeByte(this.field_1615.length);
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_1615.length) {
         var1.writeInt(this.field_1615[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (tF) void
   public void method_1806(class_64 var1) {
      var1.method_312(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      String[] var10000 = class_752.method_4253();
      StringBuilder var2 = new StringBuilder();
      String[] var1 = var10000;
      int var3 = 0;

      while(var3 < this.field_1615.length) {
         if(var3 > 0) {
            String[] var4 = field_1616;
            var2.append(", ");
         }

         var2.append(this.field_1615[var3]);
         ++var3;
         if(var1 == null) {
            break;
         }
      }

      var10000 = field_1616;
      return String.format("entities=%d[%s]", new Object[]{Integer.valueOf(this.field_1615.length), var2});
   }

   // $FF: renamed from: a () int[]
   public int[] method_1807() {
      return this.field_1615;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "0Á~ü\n×-Åñ Fù";
      int var4 = "0Á~ü\n×-Åñ Fù".length();
      char var1 = 2;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_1616 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 198;
               break;
            case 1:
               var10009 = 114;
               break;
            case 2:
               var10009 = 130;
               break;
            case 3:
               var10009 = 247;
               break;
            case 4:
               var10009 = 25;
               break;
            case 5:
               var10009 = 1;
               break;
            default:
               var10009 = 158;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

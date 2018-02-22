
// $FF: renamed from: ss
public class class_281 extends class_250 {

   // $FF: renamed from: c java.lang.String[]
   public static final String[] field_1495;
   // $FF: renamed from: d int
   private int field_1496;
   // $FF: renamed from: e float
   private float field_1497;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, float) void
   public void method_1621(int var1, float var2) {
      super.method_1449();
      this.field_1496 = var1;
      this.field_1497 = var2;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1496 = var1.readUnsignedByte();
      this.field_1497 = var1.readFloat();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(this.field_1496);
      var1.writeFloat(this.field_1497);
   }

   // $FF: renamed from: b (tF) void
   public void method_1622(class_64 var1) {
      var1.getBlock1(this);
   }

   // $FF: renamed from: a () int
   public int method_1623() {
      return this.field_1496;
   }

   // $FF: renamed from: e () float
   public float method_1624() {
      return this.field_1497;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = " !gèÇÛU0feâïQ8!o3)fè¤ÖT1fhå×W1,";
      int var5 = " !gèÇÛU0feâïQ8!o3)fè¤ÖT1fhå×W1,".length();
      char var2 = 17;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var11 = var9;
            var9 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var10)).intern();
               if((var1 += var2) >= var5) {
                  field_1495 = new String[]{"tile.bed.notValid", null, null, "gameMode.changed"};
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var10)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 68;
               break;
            case 1:
               var10009 = 88;
               break;
            case 2:
               var10009 = 27;
               break;
            case 3:
               var10009 = 157;
               break;
            case 4:
               var10009 = 249;
               break;
            case 5:
               var10009 = 169;
               break;
            default:
               var10009 = 32;
            }

            ((Object[])var10)[var7] = (char)(var10007 ^ var11 ^ var10009);
            ++var7;
         }
      }
   }
}

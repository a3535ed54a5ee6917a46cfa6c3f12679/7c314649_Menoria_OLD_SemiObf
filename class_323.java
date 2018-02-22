
// $FF: renamed from: sE
public class class_323 extends class_250 {

   // $FF: renamed from: c int
   protected int field_1634;
   // $FF: renamed from: d byte
   protected byte field_1635;
   // $FF: renamed from: e byte
   protected byte field_1636;
   // $FF: renamed from: f byte
   protected byte field_1637;
   // $FF: renamed from: g byte
   protected byte field_1638;
   // $FF: renamed from: h byte
   protected byte field_1639;
   // $FF: renamed from: i boolean
   protected boolean field_1640;
   // $FF: renamed from: j java.lang.String
   private static final String field_1641;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_1642;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int) void
   public void method_1838(int var1) {
      super.method_1449();
      this.field_1634 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1634 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1634);
   }

   // $FF: renamed from: b (tF) void
   public void method_1839(class_64 var1) {
      var1.getBlock7(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      String[] var10000 = field_1642;
      return String.format("id=%d", new Object[]{Integer.valueOf(this.field_1634)});
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_1642;
      return var10000.append("Entity_").append(super.toString()).toString();
   }

   // $FF: renamed from: b (ahb) sa
   public class_689 method_1840(ahb var1) {
      return var1.method_2160(this.field_1634);
   }

   // $FF: renamed from: a () byte
   public byte method_1841() {
      return this.field_1635;
   }

   // $FF: renamed from: e () byte
   public byte method_1842() {
      return this.field_1636;
   }

   // $FF: renamed from: f () byte
   public byte method_1843() {
      return this.field_1637;
   }

   // $FF: renamed from: g () byte
   public byte method_1844() {
      return this.field_1638;
   }

   // $FF: renamed from: h () byte
   public byte method_1845() {
      return this.field_1639;
   }

   // $FF: renamed from: i () boolean
   public boolean method_1846() {
      return this.field_1640;
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_1839((class_64)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "&#Æ6ö1~\n)zæ ío²xR~m";
      int var4 = "&#Æ6ö1~\n)zæ ío²xR~m".length();
      char var1 = 7;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_1642 = var5;
                  String[] var10 = field_1642;
                  field_1641 = "CL_00001312";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 86;
               break;
            case 1:
               var10009 = 120;
               break;
            case 2:
               var10009 = 135;
               break;
            case 3:
               var10009 = 106;
               break;
            case 4:
               var10009 = 183;
               break;
            case 5:
               var10009 = 125;
               break;
            default:
               var10009 = 20;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

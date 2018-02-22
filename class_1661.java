
// $FF: renamed from: vF
public class class_1661 implements Comparable {

   // $FF: renamed from: b int
   public int field_8646;
   // $FF: renamed from: c int
   public int field_8647;
   // $FF: renamed from: d int
   public int field_8648;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8649;


   // $FF: renamed from: <init> () void
   public void method_9150() {
      super();
   }

   // $FF: renamed from: <init> (int, int, int) void
   public void method_9151(int var1, int var2, int var3) {
      super();
      this.field_8646 = var1;
      this.field_8647 = var2;
      this.field_8648 = var3;
   }

   // $FF: renamed from: <init> (vF) void
   public void method_9152(class_1661 var1) {
      super();
      this.field_8646 = var1.field_8646;
      this.field_8647 = var1.field_8647;
      this.field_8648 = var1.field_8648;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1;
      if(var2 != null) {
         if(!(var1 instanceof class_1661)) {
            return false;
         }

         var10000 = var1;
      }

      int var4;
      label41: {
         class_1661 var3 = (class_1661)var10000;
         var4 = this.field_8646;
         int var10001 = var3.field_8646;
         if(var2 != null) {
            if(this.field_8646 != var3.field_8646) {
               break label41;
            }

            var4 = this.field_8647;
            var10001 = var3.field_8647;
         }

         if(var2 != null) {
            if(var4 != var10001) {
               break label41;
            }

            var4 = this.field_8648;
            if(var2 == null) {
               return (boolean)var4;
            }

            var10001 = var3.field_8648;
         }

         if(var4 == var10001) {
            var4 = 1;
            return (boolean)var4;
         }
      }

      var4 = 0;
      return (boolean)var4;
   }

   public int hashCode() {
      return this.field_8646 + this.field_8648 << 8 + this.field_8647 << 16;
   }

   // $FF: renamed from: b (vF) int
   public int method_9153(class_1661 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_8647;
      int var10001 = var1.field_8647;
      if(var2 != null) {
         if(this.field_8647 == var1.field_8647) {
            var10000 = this.field_8648;
            var10001 = var1.field_8648;
            if(var2 != null) {
               if(this.field_8648 == var1.field_8648) {
                  return this.field_8646 - var1.field_8646;
               }

               var10000 = this.field_8648;
               var10001 = var1.field_8648;
            }

            return var10000 - var10001;
         }

         var10000 = this.field_8647;
         var10001 = var1.field_8647;
      }

      return var10000 - var10001;
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_9154(int var1, int var2, int var3) {
      this.field_8646 = var1;
      this.field_8647 = var2;
      this.field_8648 = var3;
   }

   // $FF: renamed from: b (int, int, int) float
   public float method_9155(int var1, int var2, int var3) {
      float var4 = (float)(this.field_8646 - var1);
      float var5 = (float)(this.field_8647 - var2);
      float var6 = (float)(this.field_8648 - var3);
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   // $FF: renamed from: c (vF) float
   public float method_9156(class_1661 var1) {
      return this.method_9155(var1.field_8646, var1.field_8647, var1.field_8648);
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_8649;
      return var10000.append("Pos{x=").append(this.field_8646).append(", y=").append(this.field_8647).append(", z=").append(this.field_8648).append('}').toString();
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_9153((class_1661)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9157() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ùÖØMú";
      int var4 = "ùÖØMú".length();
      char var1 = 4;
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
                  field_8649 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 58;
               break;
            case 1:
               var10009 = 42;
               break;
            case 2:
               var10009 = 253;
               break;
            case 3:
               var10009 = 48;
               break;
            case 4:
               var10009 = 166;
               break;
            case 5:
               var10009 = 84;
               break;
            default:
               var10009 = 160;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

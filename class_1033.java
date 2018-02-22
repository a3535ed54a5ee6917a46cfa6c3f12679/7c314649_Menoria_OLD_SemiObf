
// $FF: renamed from: dc
public class class_1033 {

   // $FF: renamed from: b int
   private int field_5465;
   // $FF: renamed from: c int
   private int field_5466;
   // $FF: renamed from: d int
   private int field_5467;
   // $FF: renamed from: e aji
   private aji field_5468;
   // $FF: renamed from: f int
   private int field_5469;
   // $FF: renamed from: g int
   private int field_5470;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5471;


   // $FF: renamed from: <init> (int, int, int, aji, int, int) void
   public void method_5846(int var1, int var2, int var3, aji var4, int var5, int var6) {
      super();
      this.field_5465 = var1;
      this.field_5466 = var2;
      this.field_5467 = var3;
      this.field_5469 = var5;
      this.field_5470 = var6;
      this.field_5468 = var4;
   }

   // $FF: renamed from: b () int
   public int method_5847() {
      return this.field_5465;
   }

   // $FF: renamed from: c () int
   public int method_5848() {
      return this.field_5466;
   }

   // $FF: renamed from: d () int
   public int method_5849() {
      return this.field_5467;
   }

   // $FF: renamed from: e () int
   public int method_5850() {
      return this.field_5469;
   }

   // $FF: renamed from: f () int
   public int method_5851() {
      return this.field_5470;
   }

   // $FF: renamed from: g () aji
   public aji method_5852() {
      return this.field_5468;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1 instanceof class_1033;
      if(var2 != null) {
         if(var10000) {
            label61: {
               class_1033 var3 = (class_1033)var1;
               int var4 = this.field_5465;
               int var10001 = var3.field_5465;
               if(var2 != null) {
                  if(this.field_5465 != var3.field_5465) {
                     break label61;
                  }

                  var4 = this.field_5466;
                  var10001 = var3.field_5466;
               }

               if(var2 != null) {
                  if(var4 != var10001) {
                     break label61;
                  }

                  var4 = this.field_5467;
                  var10001 = var3.field_5467;
               }

               if(var2 != null) {
                  if(var4 != var10001) {
                     break label61;
                  }

                  var4 = this.field_5469;
                  var10001 = var3.field_5469;
               }

               class_1033 var5;
               label62: {
                  if(var2 != null) {
                     if(var4 != var10001) {
                        break label61;
                     }

                     var5 = this;
                     if(var2 == null) {
                        break label62;
                     }

                     var4 = this.field_5470;
                     var10001 = var3.field_5470;
                  }

                  if(var4 != var10001) {
                     break label61;
                  }

                  var5 = this;
               }

               if(var5.field_5468 == var3.field_5468) {
                  var10000 = true;
                  return var10000;
               }
            }

            var10000 = false;
            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_5471;
      return var10000.append("TE(").append(this.field_5465).append(",").append(this.field_5466).append(",").append(this.field_5467).append("),").append(this.field_5469).append(",").append(this.field_5470).append(",").append(this.field_5468).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5853() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Öx«é";
      int var4 = "Öx«é".length();
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
                  field_5471 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 85;
               break;
            case 1:
               var10009 = 254;
               break;
            case 2:
               var10009 = 107;
               break;
            case 3:
               var10009 = 134;
               break;
            case 4:
               var10009 = 160;
               break;
            case 5:
               var10009 = 209;
               break;
            default:
               var10009 = 164;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

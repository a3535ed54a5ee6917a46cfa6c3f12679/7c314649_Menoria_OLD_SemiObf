
// $FF: renamed from: pa
public class class_1490 implements Comparable {

   // $FF: renamed from: b bqd
   private final bqd field_7825;
   // $FF: renamed from: c int
   private final int field_7826;
   // $FF: renamed from: d int
   private final int field_7827;
   // $FF: renamed from: e int
   private final int field_7828;
   // $FF: renamed from: f boolean
   private boolean field_7829;
   // $FF: renamed from: g float
   private float field_7830;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7831;


   // $FF: renamed from: <init> (bqd, int) void
   public void method_8035(bqd var1, int var2) {
      String[] var10000 = class_752.method_4253();
      super();
      String[] var3 = var10000;
      this.field_7830 = 1.0F;
      this.field_7825 = var1;
      this.field_7826 = var1.method_366();
      this.field_7827 = var1.method_367();
      this.field_7828 = var2;
      int var10001 = bpv.method_8025(this.field_7827, var2);
      if(var3 != null) {
         var10001 = var10001 > bpv.method_8025(this.field_7826, var2)?1:0;
      }

      this.field_7829 = (boolean)var10001;
   }

   // $FF: renamed from: b () bqd
   public bqd method_8036() {
      return this.field_7825;
   }

   // $FF: renamed from: c () int
   public int method_8037() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_7829;
      if(var1 != null) {
         if(this.field_7829) {
            var10000 = bpv.method_8025((int)((float)this.field_7827 * this.field_7830), this.field_7828);
            return var10000;
         }

         var10000 = (int)((float)this.field_7826 * this.field_7830);
      }

      var10000 = bpv.method_8025(var10000, this.field_7828);
      return var10000;
   }

   // $FF: renamed from: d () int
   public int method_8038() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_7829;
      if(var1 != null) {
         if(this.field_7829) {
            var10000 = bpv.method_8025((int)((float)this.field_7826 * this.field_7830), this.field_7828);
            return var10000;
         }

         var10000 = (int)((float)this.field_7827 * this.field_7830);
      }

      var10000 = bpv.method_8025(var10000, this.field_7828);
      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_8039() {
      String[] var1 = class_752.method_4253();
      boolean var10001 = this.field_7829;
      if(var1 != null) {
         var10001 = !this.field_7829;
      }

      this.field_7829 = var10001;
   }

   // $FF: renamed from: f () boolean
   public boolean method_8040() {
      return this.field_7829;
   }

   // $FF: renamed from: b (int) void
   public void method_8041(int var1) {
      class_1490 var3;
      label24: {
         String[] var2 = class_752.method_4253();
         int var10000 = this.field_7826;
         int var10001 = var1;
         if(var2 != null) {
            if(this.field_7826 <= var1) {
               return;
            }

            var3 = this;
            if(var2 == null) {
               break label24;
            }

            var10000 = this.field_7827;
            var10001 = var1;
         }

         if(var10000 <= var10001) {
            return;
         }

         var3 = this;
      }

      var3.field_7830 = (float)var1 / (float)Math.min(this.field_7826, this.field_7827);
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_7831;
      return var10000.append("Holder{width=").append(this.field_7826).append(", height=").append(this.field_7827).append('}').toString();
   }

   // $FF: renamed from: b (pa) int
   public int method_8042(class_1490 var1) {
      int var10000;
      int var3;
      label55: {
         String[] var2 = class_752.method_4253();
         var10000 = this.method_8038();
         int var10001 = var1.method_8038();
         if(var2 != null) {
            if(var10000 == var10001) {
               label45: {
                  var10000 = this.method_8037();
                  var10001 = var1.method_8037();
                  if(var2 != null) {
                     if(var10000 == var10001) {
                        String var4 = this.field_7825.method_374();
                        if(var2 != null) {
                           if(var4 == null) {
                              return var1.field_7825.method_374() == null?0:-1;
                           }

                           var4 = this.field_7825.method_374();
                        }

                        return var4.compareTo(var1.field_7825.method_374());
                     }

                     var10000 = this.method_8037();
                     if(var2 == null) {
                        break label45;
                     }

                     var10001 = var1.method_8037();
                  }

                  var10000 = var10000 < var10001?1:-1;
               }

               var3 = var10000;
               if(var2 != null) {
                  return var3;
               }
            }

            var10000 = this.method_8038();
            if(var2 == null) {
               break label55;
            }

            var10001 = var1.method_8038();
         }

         var10000 = var10000 < var10001?1:-1;
      }

      var3 = var10000;
      return var3;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_8042((class_1490)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8043() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "÷¾j?ºcÅÈ¸b/·,\tñn>¶vÖËì";
      int var4 = "÷¾j?ºcÅÈ¸b/·,\tñn>¶vÖËì".length();
      char var1 = 13;
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
                  field_7831 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 195;
               break;
            case 1:
               var10009 = 173;
               break;
            case 2:
               var10009 = 122;
               break;
            case 3:
               var10009 = 39;
               break;
            case 4:
               var10009 = 163;
               break;
            case 5:
               var10009 = 109;
               break;
            default:
               var10009 = 194;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}

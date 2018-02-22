import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: gI
public class class_1069 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_5622;
   // $FF: renamed from: b boolean
   public static boolean field_5623;
   // $FF: renamed from: c gL[]
   private class_1072[] field_5624;
   // $FF: renamed from: d byte[]
   private byte[] field_5625;
   // $FF: renamed from: e int[]
   public int[] field_5626;
   // $FF: renamed from: f boolean[]
   public boolean[] field_5627;
   // $FF: renamed from: g boolean
   public boolean field_5628;
   // $FF: renamed from: h ahb
   public ahb field_5629;
   // $FF: renamed from: i int[]
   public int[] fontRendererObj0;
   // $FF: renamed from: j int
   public final int fontRendererObj1;
   // $FF: renamed from: k int
   public final int fontRendererObj2;
   // $FF: renamed from: l boolean
   private boolean fontRendererObj3;
   // $FF: renamed from: m java.util.Map
   public Map fontRendererObj4;
   // $FF: renamed from: n java.util.List[]
   public List[] fontRendererObj5;
   // $FF: renamed from: o boolean
   public boolean fontRendererObj6;
   // $FF: renamed from: p boolean
   public boolean fontRendererObj7;
   // $FF: renamed from: q boolean
   public boolean fontRendererObj8;
   // $FF: renamed from: r boolean
   public boolean fontRendererObj9;
   // $FF: renamed from: s boolean
   public boolean field_5640;
   // $FF: renamed from: t long
   public long field_5641;
   // $FF: renamed from: u boolean
   public boolean field_5642;
   // $FF: renamed from: v int
   public int field_5643;
   // $FF: renamed from: w long
   public long field_5644;
   // $FF: renamed from: y int
   private int field_5645;
   // $FF: renamed from: z java.lang.String
   private static final String field_5646;
   // $FF: renamed from: x java.lang.String[]
   private static final String[] field_5647;


   // $FF: renamed from: <init> (ahb, int, int) void
   public void method_6013(ahb var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      super();
      this.field_5624 = new class_1072[16];
      this.field_5625 = new byte[256];
      String[] var4 = var10000;
      this.field_5626 = new int[256];
      this.field_5627 = new boolean[256];
      this.fontRendererObj4 = new HashMap();
      this.field_5645 = 4096;
      this.fontRendererObj5 = new List[16];
      this.field_5629 = var1;
      this.fontRendererObj1 = var2;
      this.fontRendererObj2 = var3;
      this.fontRendererObj0 = new int[256];
      int var5 = 0;

      while(true) {
         if(var5 < this.fontRendererObj5.length) {
            try {
               this.fontRendererObj5[var5] = new ArrayList();
               ++var5;
               if(var4 == null) {
                  break;
               }

               if(var4 != null) {
                  continue;
               }
            } catch (class_643 var6) {
               throw method_6068(var6);
            }
         }

         Arrays.fill(this.field_5626, -999);
         Arrays.fill(this.field_5625, (byte)-1);
         break;
      }

   }

   // $FF: renamed from: <init> (ahb, aji[], int, int) void
   public void method_6014(ahb param1, aji[] param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <init> (ahb, aji[], byte[], int, int) void
   public void method_6015(ahb param1, aji[] param2, byte[] param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_6016(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int) int
   public int method_6017(int var1, int var2) {
      return this.fontRendererObj0[var2 << 4 | var1];
   }

   // $FF: renamed from: a () int
   public int method_6018() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () gL[]
   public class_1072[] method_6019() {
      return this.field_5624;
   }

   // $FF: renamed from: c () void
   public void method_6020() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () void
   public void method_6021() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (int, int) void
   private void method_6022(int var1, int var2) {
      this.field_5627[var1 + var2 * 16] = true;
      this.fontRendererObj3 = true;
   }

   // $FF: renamed from: a (boolean) void
   private void method_6023(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int) void
   private void method_6024(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int, int) void
   private void method_6025(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int) void
   private void method_6026(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int, int) int
   public int method_6027(int var1, int var2, int var3) {
      return this.method_6028(var1, var2, var3).method_2420();
   }

   // $FF: renamed from: d (int, int, int) aji
   public aji method_6028(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (int, int, int) int
   public int method_6029(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, aji, int) boolean
   public boolean method_6030(int param1, int param2, int param3, aji param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, int) boolean
   public boolean method_6031(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (H, int, int, int) int
   public int method_6032(class_95 param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (H, int, int, int, int) void
   public void method_6033(class_95 param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int, int, int) int
   public int method_6034(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sa) void
   public void method_6035(class_689 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (sa) void
   public void method_6036(class_689 var1) {
      this.method_6037(var1, var1.field_3041);
   }

   // $FF: renamed from: b (sa, int) void
   public void method_6037(class_689 var1, int var2) {
      String[] var3 = class_752.method_4253();

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var2;
               if(var3 == null) {
                  break label37;
               }

               if(var2 >= 0) {
                  break label36;
               }
            } catch (class_643 var5) {
               throw method_6068(var5);
            }

            var2 = 0;
         }

         var10000 = var2;
      }

      label27: {
         try {
            if(var3 == null) {
               return;
            }

            if(var10000 < this.fontRendererObj5.length) {
               break label27;
            }
         } catch (class_643 var4) {
            throw method_6068(var4);
         }

         var2 = this.fontRendererObj5.length - 1;
      }

      this.fontRendererObj5[var2].remove(var1);
   }

   // $FF: renamed from: f (int, int, int) boolean
   public boolean method_6038(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g (int, int, int) gi
   public class_580 method_6039(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (gi) void
   public void method_6040(class_580 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, gi) void
   public void method_6041(int param1, int param2, int param3, class_580 param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h (int, int, int) void
   public void method_6042(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_6043() {
      String[] var10000 = class_752.method_4253();
      this.field_5628 = true;
      String[] var1 = var10000;
      this.field_5629.method_2114(this.fontRendererObj4.values());
      int var2 = 0;

      while(var2 < this.fontRendererObj5.length) {
         Iterator var3 = this.fontRendererObj5[var2].iterator();

         while(true) {
            if(var3.hasNext()) {
               class_689 var4 = (class_689)var3.next();

               try {
                  var4.method_3910();
                  if(var1 == null) {
                     break;
                  }

                  if(var1 != null) {
                     continue;
                  }
               } catch (class_643 var5) {
                  throw method_6068(var5);
               }
            }

            this.field_5629.method_2164(this.fontRendererObj5[var2]);
            ++var2;
            break;
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: f () void
   public void method_6044() {
      String[] var10000 = class_752.method_4253();
      this.field_5628 = false;
      Iterator var2 = this.fontRendererObj4.values().iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         class_580 var3 = (class_580)var2.next();
         this.field_5629.method_2133(var3);
         if(var1 == null) {
            break;
         }
      }

      int var4 = 0;

      while(var4 < this.fontRendererObj5.length) {
         this.field_5629.method_2165(this.fontRendererObj5[var4]);
         ++var4;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: g () void
   public void method_6045() {
      this.fontRendererObj9 = true;
   }

   // $FF: renamed from: b (sa, kg, java.util.List, xT) void
   public void method_6046(class_689 param1, class_1343 param2, List param3, class_82 param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Class, kg, java.util.List, xT) void
   public void method_6047(Class param1, class_1343 param2, List param3, class_82 param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (boolean) boolean
   public boolean method_6048(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (long) java.util.Random
   public Random method_6049(long var1) {
      return new Random(this.field_5629.method_2183() + (long)(this.fontRendererObj1 * this.fontRendererObj1 * 4987142) + (long)(this.fontRendererObj1 * 5947611) + (long)(this.fontRendererObj2 * this.fontRendererObj2) * 4392871L + (long)(this.fontRendererObj2 * 389711) ^ var1);
   }

   // $FF: renamed from: h () boolean
   public boolean method_6050() {
      return false;
   }

   // $FF: renamed from: b (gG, gG, int, int) void
   public void method_6051(class_25 param1, class_25 param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (int, int) int
   public int method_6052(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (boolean) void
   public void method_6053(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i () boolean
   public boolean method_6054() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j () de
   public class_1035 method_6055() {
      class_1035 var10000 = new class_1035;
      var10000.method_5856(this.fontRendererObj1, this.fontRendererObj2);
      return var10000;
   }

   // $FF: renamed from: f (int, int) boolean
   public boolean method_6056(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (gL[]) void
   public void method_6057(class_1072[] var1) {
      this.field_5624 = var1;
   }

   // $FF: renamed from: b (byte[], int, int, boolean) void
   public void method_6058(byte[] param1, int param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, d0) dz
   public class_985 method_6059(int param1, int param2, class_958 param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: k () byte[]
   public byte[] method_6060() {
      return this.field_5625;
   }

   // $FF: renamed from: b (byte[]) void
   public void method_6061(byte[] var1) {
      this.field_5625 = var1;
   }

   // $FF: renamed from: l () void
   public void method_6062() {
      this.field_5645 = 0;
   }

   // $FF: renamed from: m () void
   public void method_6063() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: n () void
   public void method_6064() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int) void
   private void method_6065(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g (int, int) boolean
   private boolean method_6066(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_6067() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_6068(Throwable var0) {
      return var0;
   }
}

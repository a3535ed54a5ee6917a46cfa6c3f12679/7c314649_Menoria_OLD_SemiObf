import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// $FF: renamed from: Al
public abstract class class_671 {

   // $FF: renamed from: a java.util.List
   public List field_2868;
   // $FF: renamed from: b java.util.List
   public List field_2869;
   // $FF: renamed from: c int
   public int field_2870;
   // $FF: renamed from: d short
   private short field_2871;
   // $FF: renamed from: e int
   private int field_2872;
   // $FF: renamed from: f int
   private int field_2873;
   // $FF: renamed from: g java.util.Set
   private final Set field_2874;
   // $FF: renamed from: h java.util.List
   protected List field_2875;
   // $FF: renamed from: j java.util.Set
   private Set field_2876;
   // $FF: renamed from: k java.lang.String
   private static final String field_2877;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_2878;


   // $FF: renamed from: <init> () void
   public void method_3645() {
      super();
      this.field_2868 = new ArrayList();
      this.field_2869 = new ArrayList();
      this.field_2872 = -1;
      this.field_2874 = new HashSet();
      this.field_2875 = new ArrayList();
      this.field_2876 = new HashSet();
   }

   // $FF: renamed from: b (aR) aR
   protected class_492 method_3646(class_492 var1) {
      var1.field_2287 = this.field_2869.size();
      this.field_2869.add(var1);
      this.field_2868.add((Object)null);
      return var1;
   }

   // $FF: renamed from: b (aN) void
   public void method_3647(class_16 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (aN) void
   public void method_3648(class_16 var1) {
      this.field_2875.remove(var1);
   }

   // $FF: renamed from: b () java.util.List
   public List method_3649() {
      String[] var10000 = class_752.method_4253();
      ArrayList var2 = new ArrayList();
      String[] var1 = var10000;
      int var3 = 0;

      ArrayList var5;
      while(true) {
         if(var3 < this.field_2869.size()) {
            try {
               var5 = var2;
               if(var1 == null) {
                  break;
               }

               var2.add(((class_492)this.field_2869.get(var3)).method_2875());
               ++var3;
               if(var1 != null) {
                  continue;
               }
            } catch (IllegalArgumentException var4) {
               throw method_3677(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   // $FF: renamed from: c () void
   public void method_3650() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (yz, int) boolean
   public boolean method_3651(class_792 var1, int var2) {
      return false;
   }

   // $FF: renamed from: b (vI, int) aR
   public class_492 method_3652(class_22 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int) aR
   public class_492 method_3653(int var1) {
      return (class_492)this.field_2869.get(var1);
   }

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      class_492 var4 = (class_492)this.field_2869.get(var2);
      String[] var3 = var10000;

      class_492 var6;
      add var7;
      label32: {
         label22: {
            try {
               var6 = var4;
               if(var3 == null) {
                  break label32;
               }

               if(var4 == null) {
                  break label22;
               }
            } catch (IllegalArgumentException var5) {
               throw method_3677(var5);
            }

            var6 = var4;
            break label32;
         }

         var7 = null;
         return var7;
      }

      var7 = var6.method_2875();
      return var7;
   }

   // $FF: renamed from: b (int, int, int, yz) add
   public add method_3655(int param1, int param2, int param3, class_792 param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (add, aR) boolean
   public boolean method_3656(add var1, class_492 var2) {
      return true;
   }

   // $FF: renamed from: b (int, int, boolean, yz) void
   protected void method_3657(int var1, int var2, boolean var3, class_792 var4) {
      this.method_3655(var1, var2, 1, var4);
   }

   // $FF: renamed from: a (yz) void
   public void method_3658(class_792 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (vI) void
   public void method_3659(class_22 var1) {
      this.method_3650();
   }

   // $FF: renamed from: b (int, add) void
   public void method_3660(int var1, add var2) {
      this.method_3653(var1).method_2877(var2);
   }

   // $FF: renamed from: b (add[]) void
   public void method_3661(add[] var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < var1.length) {
         this.method_3653(var3).method_2877(var1[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int, int) void
   public void method_3662(int var1, int var2) {}

   // $FF: renamed from: b (Af) short
   public short method_3663(class_666 var1) {
      ++this.field_2871;
      return this.field_2871;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_3664(class_792 var1) {
      String[] var2 = class_752.method_4253();

      boolean var10000;
      label32: {
         try {
            var10000 = this.field_2876.contains(var1);
            if(var2 == null) {
               return var10000;
            }

            if(!var10000) {
               break label32;
            }
         } catch (IllegalArgumentException var3) {
            throw method_3677(var3);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   // $FF: renamed from: b (yz, boolean) void
   public void method_3665(class_792 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (yz) boolean
   public abstract boolean method_3666(class_792 var1);

   // $FF: renamed from: b (add, int, int, boolean) boolean
   protected boolean method_3667(add param1, int param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int) int
   public static int method_3668(int var0) {
      return var0 >> 2 & 3;
   }

   // $FF: renamed from: d (int) int
   public static int method_3669(int var0) {
      return var0 & 3;
   }

   // $FF: renamed from: b (int, int) int
   public static int method_3670(int var0, int var1) {
      return var0 & 3 | (var1 & 3) << 2;
   }

   // $FF: renamed from: e (int) boolean
   public static boolean method_3671(int param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   protected void method_3672() {
      this.field_2873 = 0;
      this.field_2874.clear();
   }

   // $FF: renamed from: b (aR, add, boolean) boolean
   public static boolean method_3673(class_492 param0, add param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.Set, int, add, int) void
   public static void method_3674(Set param0, int param1, add param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (aR) boolean
   public boolean method_3675(class_492 var1) {
      return true;
   }

   // $FF: renamed from: c (vI) int
   public static int method_3676(class_22 param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_3677(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3678() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ñ\r3Ý,\\vñ3þ(±wr\tÀa£oy\rÖ8âoo×/«m";
      int var4 = "ñ\r3Ý,\\vñ3þ(±wr\tÀa£oy\rÖ8âoo×/«m".length();
      char var1 = 11;
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
                  field_2878 = var5;
                  String[] var10 = field_2878;
                  field_2877 = "CL_00001730";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 132;
               break;
            case 1:
               var10009 = 119;
               break;
            case 2:
               var10009 = 244;
               break;
            case 3:
               var10009 = 53;
               break;
            case 4:
               var10009 = 219;
               break;
            case 5:
               var10009 = 42;
               break;
            default:
               var10009 = 90;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

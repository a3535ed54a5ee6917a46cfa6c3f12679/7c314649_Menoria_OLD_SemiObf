package ca.diiza.d;

import ca.diiza.f.class_229;
import ca.diiza.h.class_688;
import ca.diiza.r.class_505;
import ca.diiza.r.class_506;
import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: ca.diiza.d.a
public class class_672 extends class_671 {

   // $FF: renamed from: i java.util.List
   public List field_2879;
   // $FF: renamed from: l ca.diiza.h.a
   public class_688 field_2880;
   // $FF: renamed from: m ca.diiza.h.a
   public class_688 field_2881;
   // $FF: renamed from: n int[]
   private static int[] field_2882;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2883;


   // $FF: renamed from: <init> (yz) void
   public void method_3679(class_792 var1) {
      super.method_3645();
      this.field_2879 = new ArrayList();
      byte var4 = 0;
      var1.contCrafts = this;
      class_688 var10001 = new class_688;
      String[] var8 = field_2883;
      var10001.method_3801("ref", 1);
      this.field_2880 = var10001;
      int[] var10000 = method_3683();
      class_688 var10002 = new class_688;
      var10002.method_3801("crafts", 9);
      this.field_2881 = var10002;
      class_506 var10 = new class_506;
      var10.method_2911(var1, this.field_2880, 0, 128, 139);
      this.method_3646(var10);
      class_505 var11 = new class_505;
      var11.method_2909(this.field_2881, 0, 34, 121);
      this.method_3646(var11);
      var11 = new class_505;
      var11.method_2909(this.field_2881, 1, 52, 121);
      this.method_3646(var11);
      var11 = new class_505;
      var11.method_2909(this.field_2881, 2, 70, 121);
      this.method_3646(var11);
      var11 = new class_505;
      var11.method_2909(this.field_2881, 3, 34, 139);
      this.method_3646(var11);
      int[] var2 = var10000;
      class_505 var9 = new class_505;
      var9.method_2909(this.field_2881, 4, 52, 139);
      this.method_3646(var9);
      var9 = new class_505;
      var9.method_2909(this.field_2881, 5, 70, 139);
      this.method_3646(var9);
      var9 = new class_505;
      var9.method_2909(this.field_2881, 6, 34, 157);
      this.method_3646(var9);
      var9 = new class_505;
      var9.method_2909(this.field_2881, 7, 52, 157);
      this.method_3646(var9);
      var9 = new class_505;
      var9.method_2909(this.field_2881, 8, 70, 157);
      this.method_3646(var9);
      class_666 var5 = var1.field_3616;
      int var6 = 0;

      while(true) {
         if(var6 < 5) {
            if(var2 == null) {
               break;
            }

            int var7 = 0;

            while(true) {
               if(var7 < 9) {
                  class_492 var12 = new class_492;
                  var12.method_2869(class_229.method_1246(), var6 * 9 + var7, 9 + var7 * 18, 18 + var6 * 18 - var4);
                  this.method_3646(var12);
                  ++var7;
                  if(var2 == null) {
                     break;
                  }

                  if(var2 != null) {
                     continue;
                  }

                  int var3 = class_689.method_3976();
                  ++var3;
                  class_689.method_3975(var3);
               }

               ++var6;
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.method_3680(0.0F);
         break;
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      return true;
   }

   // $FF: renamed from: a (float) void
   public void method_3680(float var1) {
      int[] var10000 = method_3683();
      int var3 = this.field_2879.size() / 9 - 5 + 1;
      int[] var2 = var10000;
      int var4 = (int)((double)var1 * 1.28D * (double)((float)var3) + 0.5D);
      int var8 = var4;
      if(var2 != null) {
         if(var4 < 0) {
            var4 = 0;
         }

         var8 = 0;
      }

      int var5 = var8;

      label57:
      do {
         var8 = var5;

         label54:
         while(true) {
            if(var8 >= 5) {
               break label57;
            }

            int var6 = 0;

            while(true) {
               if(var6 >= 9) {
                  break label54;
               }

               int var7 = var6 + (var5 + var4) * 9;
               var8 = var7;
               if(var2 == null) {
                  break;
               }

               label49: {
                  label48: {
                     if(var2 != null) {
                        if(var7 < 0) {
                           break label48;
                        }

                        var8 = var7;
                     }

                     if(var8 < this.field_2879.size()) {
                        class_229.method_1246().method_87(var6 + var5 * 9, (add)this.field_2879.get(var7));
                        if(var2 != null) {
                           break label49;
                        }
                     }
                  }

                  class_229.method_1246().method_87(var6 + var5 * 9, (add)null);
               }

               ++var6;
               if(var2 == null) {
                  break label54;
               }
            }
         }

         ++var5;
      } while(var2 != null);

      if(class_689.method_3977() == 0) {
         method_3682(new int[2]);
      }

   }

   // $FF: renamed from: a () boolean
   public boolean method_3681() {
      int[] var1 = method_3683();
      int var10000 = this.field_2879.size();
      if(var1 != null) {
         var10000 = var10000 > 45?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (int, int, boolean, yz) void
   protected void method_3657(int var1, int var2, boolean var3, class_792 var4) {}

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      return null;
   }

   // $FF: renamed from: b (int[]) void
   public static void method_3682(int[] var0) {
      field_2882 = var0;
   }

   // $FF: renamed from: d () int[]
   public static int[] method_3683() {
      return field_2882;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3678() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "a_8YjpH?";
      int var4 = "a_8YjpH?".length();
      char var1 = 6;
      int[] var10000 = new int[5];
      int var0 = -1;
      method_3682(var10000);

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var8 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var11 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_2883 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var10)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 86;
               break;
            case 1:
               var10009 = 121;
               break;
            case 2:
               var10009 = 13;
               break;
            case 3:
               var10009 = 107;
               break;
            case 4:
               var10009 = 74;
               break;
            case 5:
               var10009 = 166;
               break;
            default:
               var10009 = 15;
            }

            ((Object[])var10)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

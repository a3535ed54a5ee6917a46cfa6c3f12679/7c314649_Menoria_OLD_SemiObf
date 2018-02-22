import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: uf
public class class_1663 {

   // $FF: renamed from: a java.util.List
   private final List field_8653;
   // $FF: renamed from: b de
   private final class_1035 field_8654;
   // $FF: renamed from: c short[]
   private short[] field_8655;
   // $FF: renamed from: d int
   private int field_8656;
   // $FF: renamed from: e int
   private int field_8657;
   // $FF: renamed from: f long
   private long field_8658;
   // $FF: renamed from: g java.lang.String
   private static final String field_8659;
   // $FF: renamed from: h boolean
   public boolean field_8660;
   // $FF: renamed from: i ue
   final class_1660 field_8661;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_8662;


   // $FF: renamed from: <init> (ue, int, int) void
   public void method_9159(class_1660 var1, int var2, int var3) {
      this.method_9160(var1, var2, var3, false);
   }

   // $FF: renamed from: <init> (ue, int, int, boolean) void
   public void method_9160(class_1660 var1, int var2, int var3, boolean var4) {
      String[] var5;
      boolean var7;
      label42: {
         label45: {
            this.field_8661 = var1;
            super();
            String[] var10000 = class_752.method_4253();
            this.field_8653 = new ArrayList();
            this.field_8655 = new short[64];
            this.field_8660 = false;
            var5 = var10000;
            class_1035 var10001 = new class_1035;
            var10001.method_5856(var2, var3);
            this.field_8654 = var10001;
            var7 = var4;
            if(var5 != null) {
               if(!var4) {
                  break label45;
               }

               var7 = Config.isLazyChunkLoading();
            }

            if(var5 == null) {
               break label42;
            }

            if(var7) {
               var7 = true;
               break label42;
            }
         }

         var7 = false;
      }

      boolean var6 = var7;
      if(var5 != null) {
         int var8;
         class_1665 var9;
         int var10002;
         label28: {
            if(var6) {
               var9 = var1.method_9130().field_1855;
               var8 = var2;
               var10002 = var3;
               if(var5 == null) {
                  break label28;
               }

               if(!var9.method_103(var2, var3)) {
                  var1.field_8641.add(this.field_8654);
                  this.field_8660 = false;
                  if(var5 != null) {
                     return;
                  }
               }
            }

            var9 = var1.method_9130().field_1855;
            var8 = var2;
            var10002 = var3;
         }

         var9.method_105(var8, var10002);
      }

      this.field_8660 = true;
   }

   // $FF: renamed from: b (xi) void
   public void method_9161(class_793 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = this.field_8653.contains(var1);
      if(var2 != null) {
         if(var10000) {
            Logger var3 = class_1660.method_9144();
            String[] var10001 = field_8662;
            var3.debug("Failed to add player. {} already is in chunk {}, {}", new Object[]{var1, Integer.valueOf(this.field_8654.field_5475), Integer.valueOf(this.field_8654.field_5476)});
            if(var2 != null) {
               return;
            }
         }

         var10000 = this.field_8653.isEmpty();
      }

      if(var2 != null) {
         if(var10000) {
            this.field_8658 = class_1660.method_9145(this.field_8661).method_2184();
         }

         this.field_8653.add(var1);
         var1.field_3659.add(this.field_8654);
      }

   }

   // $FF: renamed from: c (xi) void
   public void method_9162(class_793 var1) {
      this.method_9163(var1, true);
   }

   // $FF: renamed from: a (xi, boolean) void
   public void method_9163(class_793 var1, boolean var2) {
      String[] var3 = class_752.method_4253();
      class_1663 var10000 = this;
      if(var3 != null) {
         if(!this.field_8653.contains(var1)) {
            return;
         }

         var10000 = this;
      }

      class_1069 var4 = class_1660.method_9145(var10000.field_8661).method_2053(this.field_8654.field_5475, this.field_8654.field_5476);
      int var7 = var2;
      if(var3 != null) {
         label54: {
            if(var2 != 0) {
               var7 = var4.method_6054();
               if(var3 == null) {
                  break label54;
               }

               if(var7 != 0) {
                  class_1684 var8 = var1.field_3654;
                  class_279 var10001 = new class_279;
                  var10001.method_1607(var4, true, 0);
                  var8.method_9291(var10001);
               }
            }

            this.field_8653.remove(var1);
            var1.field_3659.remove(this.field_8654);
            var7 = Reflector.EventBus.exists();
         }
      }

      if(var3 != null) {
         if(var7 != 0) {
            Reflector.postForgeBusEvent(Reflector.ChunkWatchEvent_UnWatch_Constructor, new Object[]{this.field_8654, var1});
         }

         var7 = this.field_8653.isEmpty();
      }

      if(var3 != null) {
         if(var7 == 0) {
            return;
         }

         var7 = this.field_8654.field_5475;
      }

      label64: {
         long var5 = (long)var7 + 2147483647L | (long)this.field_8654.field_5476 + 2147483647L << 32;
         this.method_9165(var4);
         class_1660.method_9146(this.field_8661).method_9531(var5);
         class_1660.method_9147(this.field_8661).remove(this);
         var7 = this.field_8656;
         if(var3 != null) {
            if(this.field_8656 > 0) {
               class_1660.method_9148(this.field_8661).remove(this);
            }

            var10000 = this;
            if(var3 == null) {
               break label64;
            }

            var7 = this.field_8660;
         }

         if(var7 == 0) {
            return;
         }

         var10000 = this;
      }

      var10000.field_8661.method_9130().field_1855.method_9189(this.field_8654.field_5475, this.field_8654.field_5476);
   }

   // $FF: renamed from: b () void
   public void method_9164() {
      this.method_9165(class_1660.method_9145(this.field_8661).method_2053(this.field_8654.field_5475, this.field_8654.field_5476));
   }

   // $FF: renamed from: b (gI) void
   private void method_9165(class_1069 var1) {
      var1.field_5644 += class_1660.method_9145(this.field_8661).method_2184() - this.field_8658;
      this.field_8658 = class_1660.method_9145(this.field_8661).method_2184();
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_9166(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_8656;
      if(var4 != null) {
         if(this.field_8656 == 0) {
            class_1660.method_9148(this.field_8661).add(this);
         }

         this.field_8657 |= 1 << (var2 >> 4);
         var10000 = this.field_8656;
      }

      int var10001 = 64;
      if(var4 != null) {
         if(var10000 >= 64) {
            return;
         }

         var10000 = var1 << 12 | var3 << 8;
         var10001 = var2;
      }

      short var5 = (short)(var10000 | var10001);
      int var6 = 0;

      short[] var7;
      while(true) {
         if(var6 < this.field_8656) {
            var7 = this.field_8655;
            var10001 = var6;
            if(var4 == null) {
               break;
            }

            if(this.field_8655[var6] == var5) {
               return;
            }

            ++var6;
            if(var4 != null) {
               continue;
            }
         }

         var7 = this.field_8655;
         var10001 = this.field_8656++;
         break;
      }

      var7[var10001] = var5;
   }

   // $FF: renamed from: b (r1) void
   public void method_9167(class_250 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < this.field_8653.size()) {
         class_793 var4 = (class_793)this.field_8653.get(var3);
         if(var2 != null) {
            if(!var4.field_3659.contains(this.field_8654)) {
               var4.field_3654.method_9291(var1);
            }

            ++var3;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c () void
   public void method_9168() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_8656;
      if(var1 != null) {
         if(this.field_8656 == 0) {
            return;
         }

         var10000 = this.field_8656;
      }

      class_1663 var8;
      label92: {
         label101: {
            int var2;
            int var3;
            int var4;
            int var5;
            label102: {
               byte var10001 = 1;
               if(var1 != null) {
                  if(var10000 == 1) {
                     var2 = this.field_8654.field_5475 * 16 + (this.field_8655[0] >> 12 & 15);
                     var3 = this.field_8655[0] & 255;
                     var4 = this.field_8654.field_5476 * 16 + (this.field_8655[0] >> 8 & 15);
                     class_295 var9 = new class_295;
                     var9.method_1691(var2, var3, var4, class_1660.method_9145(this.field_8661));
                     this.method_9167(var9);
                     var8 = this;
                     if(var1 == null) {
                        break label92;
                     }

                     if(!class_1660.method_9145(this.field_8661).getBlock(var2, var3, var4).method_2442()) {
                        break label101;
                     }

                     this.method_9169(class_1660.method_9145(this.field_8661).method_31(var2, var3, var4));
                     if(var1 != null) {
                        break label101;
                     }
                  }

                  var10000 = this.field_8656;
                  if(var1 == null) {
                     break label102;
                  }

                  var10001 = 64;
               }

               if(var10000 == var10001) {
                  var2 = this.field_8654.field_5475 * 16;
                  var3 = this.field_8654.field_5476 * 16;
                  class_279 var10 = new class_279;
                  var10.method_1607(class_1660.method_9145(this.field_8661).method_2053(this.field_8654.field_5475, this.field_8654.field_5476), false, this.field_8657);
                  this.method_9167(var10);
                  var4 = 0;

                  label81:
                  do {
                     if(var4 >= 16) {
                        break label101;
                     }

                     var8 = this;
                     if(var1 == null) {
                        break label92;
                     }

                     label106: {
                        var10000 = this.field_8657 & 1 << var4;
                        if(var1 != null) {
                           if(var10000 == 0) {
                              break label106;
                           }

                           var10000 = var4 << 4;
                        }

                        var5 = var10000;
                        List var6 = class_1660.method_9145(this.field_8661).method_2245(var2, var5, var3, var2 + 16, var5 + 16, var3 + 16);
                        int var7 = 0;

                        while(var7 < var6.size()) {
                           this.method_9169((class_580)var6.get(var7));
                           ++var7;
                           if(var1 == null) {
                              continue label81;
                           }

                           if(var1 == null) {
                              break;
                           }
                        }
                     }

                     ++var4;
                  } while(var1 != null);
               }

               class_292 var11 = new class_292;
               var11.method_1677(this.field_8656, this.field_8655, class_1660.method_9145(this.field_8661).method_2053(this.field_8654.field_5475, this.field_8654.field_5476));
               this.method_9167(var11);
               var10000 = 0;
            }

            var2 = var10000;

            while(var2 < this.field_8656) {
               var3 = this.field_8654.field_5475 * 16 + (this.field_8655[var2] >> 12 & 15);
               var4 = this.field_8655[var2] & 255;
               var5 = this.field_8654.field_5476 * 16 + (this.field_8655[var2] >> 8 & 15);
               if(var1 != null) {
                  var8 = this;
                  if(var1 == null) {
                     break label92;
                  }

                  if(class_1660.method_9145(this.field_8661).getBlock(var3, var4, var5).method_2442()) {
                     this.method_9169(class_1660.method_9145(this.field_8661).method_31(var3, var4, var5));
                  }

                  ++var2;
               }

               if(var1 == null) {
                  break;
               }
            }
         }

         this.field_8656 = 0;
         var8 = this;
      }

      var8.field_8657 = 0;
   }

   // $FF: renamed from: b (gi) void
   private void method_9169(class_580 var1) {
      String[] var2 = class_752.method_4253();
      class_580 var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return;
         }

         var10000 = var1;
      }

      class_250 var3 = var10000.method_3100();
      if(var3 != null) {
         this.method_9167(var3);
      }

   }

   // $FF: renamed from: d () void
   public void method_9170() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(var2 < this.field_8653.size()) {
         class_793 var3 = (class_793)this.field_8653.get(var2);
         class_1069 var4 = this.field_8661.method_9130().method_2053(this.field_8654.field_5475, this.field_8654.field_5476);
         ArrayList var5 = new ArrayList(1);
         var5.add(var4);
         class_1684 var6 = var3.field_3654;
         class_278 var10001 = new class_278;
         var10001.method_1597(var5);
         var6.method_9291(var10001);
         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (uf) de
   static class_1035 method_9171(class_1663 var0) {
      return var0.field_8654;
   }

   // $FF: renamed from: c (uf) java.util.List
   static List method_9172(class_1663 var0) {
      return var0.field_8653;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9173() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "|\\ýçî¾NR´êï¾JQõòî¨Fé«ê¶E_\\ðò«³DTú«è²BTV´ðööA@yqË»»ê\t§¾";
      int var4 = "|\\ýçî¾NR´êï¾JQõòî¨Fé«ê¶E_\\ðò«³DTú«è²BTV´ðööA@yqË»»ê\t§¾".length();
      char var1 = 51;
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
                  field_8662 = var5;
                  String[] var10 = field_8662;
                  field_8659 = "CL_00001435";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 12;
               break;
            case 1:
               var10009 = 11;
               break;
            case 2:
               var10009 = 162;
               break;
            case 3:
               var10009 = 189;
               break;
            case 4:
               var10009 = 189;
               break;
            case 5:
               var10009 = 236;
               break;
            default:
               var10009 = 1;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}

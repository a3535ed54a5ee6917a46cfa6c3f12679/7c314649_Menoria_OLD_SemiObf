import java.util.Iterator;

// $FF: renamed from: jM
public class class_1291 {

   // $FF: renamed from: b yz
   public final class_792 field_6622;
   // $FF: renamed from: c int[]
   public int[] field_6623;
   // $FF: renamed from: d int[]
   public int[] field_6624;
   // $FF: renamed from: e int
   private int field_6625;
   // $FF: renamed from: f int
   private int field_6626;
   // $FF: renamed from: g byte[]
   private byte[] field_6627;
   // $FF: renamed from: h int
   public int field_6628;
   // $FF: renamed from: j boolean
   private boolean field_6629;
   // $FF: renamed from: k java.lang.String
   private static final String field_6630 = "CL_00000578";
   // $FF: renamed from: l jQ
   final class_1296 field_6631;


   // $FF: renamed from: <init> (jQ, yz) void
   public void method_6763(class_1296 var1, class_792 var2) {
      this.field_6631 = var1;
      super();
      this.field_6623 = new int[128];
      String[] var10000 = class_752.method_4253();
      this.field_6624 = new int[128];
      String[] var3 = var10000;
      this.field_6622 = var2;
      int var4 = 0;

      while(var4 < this.field_6623.length) {
         this.field_6623[var4] = 0;
         this.field_6624[var4] = 127;
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (add) byte[]
   public byte[] method_6764(add var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_6629;
      byte[] var3;
      if(var2 != null) {
         if(!this.field_6629) {
            var3 = new byte[]{(byte)2, this.field_6631.field_6654};
            this.field_6629 = true;
            return var3;
         }

         var10000 = --this.field_6626;
      }

      int var4;
      int var5;
      int var10;
      byte var10001;
      label141: {
         if(var2 != null) {
            if(var10000 < 0) {
               this.field_6626 = 4;
               var3 = new byte[this.field_6631.field_6658.size() * 3 + 1];
               var3[0] = 1;
               var4 = 0;
               Iterator var6 = this.field_6631.field_6658.values().iterator();

               byte var12;
               label79: {
                  while(true) {
                     if(var6.hasNext()) {
                        class_1292 var7 = (class_1292)var6.next();
                        var3[var4 * 3 + 1] = (byte)(var7.field_6632 << 4 | var7.field_6635 & 15);
                        var3[var4 * 3 + 2] = var7.field_6633;
                        var3[var4 * 3 + 3] = var7.field_6634;
                        ++var4;
                        if(var2 == null) {
                           break;
                        }

                        if(var2 != null) {
                           continue;
                        }
                     }

                     var12 = var1.method_3782();
                     if(var2 == null) {
                        break label79;
                     }

                     if(var12 == 0) {
                        var12 = 1;
                        break label79;
                     }
                     break;
                  }

                  var12 = 0;
               }

               label136: {
                  var10 = var12;
                  byte[] var13 = this.field_6627;
                  if(var2 != null) {
                     if(this.field_6627 == null) {
                        var10 = 0;
                        break label136;
                     }

                     var13 = this.field_6627;
                  }

                  var10000 = var13.length;
                  if(var2 != null) {
                     if(var10000 == var3.length) {
                        var5 = 0;

                        while(var5 < var3.length) {
                           label125: {
                              var10000 = var3[var5];
                              if(var2 != null) {
                                 var10001 = this.field_6627[var5];
                                 if(var2 == null) {
                                    break label141;
                                 }

                                 if(var10000 == var10001) {
                                    break label125;
                                 }

                                 var10000 = 0;
                              }

                              var10 = var10000;
                              if(var2 != null) {
                                 break;
                              }
                           }

                           ++var5;
                           if(var2 == null) {
                              var10 = 0;
                              break;
                           }
                        }
                     } else {
                        var10 = 0;
                     }
                  } else {
                     var10 = var10000;
                  }
               }

               var10000 = var10;
               if(var2 != null) {
                  if(var10 == 0) {
                     this.field_6627 = var3;
                     return var3;
                  }

                  var10000 = 0;
               }

               var10 = var10000;
            } else {
               var10 = 0;
            }
         } else {
            var10 = var10000;
         }

         var10000 = var10;
      }

      for(var10001 = 1; var10000 < var10001; var10001 = 1) {
         var4 = this.field_6625++ * 11 % 128;
         if(var2 != null) {
            if(this.field_6623[var4] >= 0) {
               int var11 = this.field_6624[var4] - this.field_6623[var4] + 1;
               var5 = this.field_6623[var4];
               byte[] var8 = new byte[var11 + 3];
               var8[0] = 0;
               var8[1] = (byte)var4;
               var8[2] = (byte)var5;
               int var9 = 0;

               while(true) {
                  if(var9 < var8.length - 3) {
                     var8[var9 + 3] = this.field_6631.field_6655[(var9 + var5) * 128 + var4];
                     ++var9;
                     if(var2 == null) {
                        break;
                     }

                     if(var2 != null) {
                        continue;
                     }
                  }

                  this.field_6624[var4] = -1;
                  this.field_6623[var4] = -1;
                  break;
               }

               return var8;
            }

            ++var10;
         }

         if(var2 == null) {
            break;
         }

         var10000 = var10;
      }

      return null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6765() {
      boolean var10000 = true;
      char[] var10003 = "`ÏYæU£`§Q".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6630 = (new String((char[])var4)).intern();
            String var2 = field_6630;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 111;
            break;
         case 1:
            var10009 = 25;
            break;
         case 2:
            var10009 = 220;
            break;
         case 3:
            var10009 = 37;
            break;
         case 4:
            var10009 = 154;
            break;
         case 5:
            var10009 = 41;
            break;
         default:
            var10009 = 223;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}

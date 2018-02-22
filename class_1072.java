
// $FF: renamed from: gL
public class class_1072 {

   // $FF: renamed from: b int
   private int field_5653;
   // $FF: renamed from: c int
   private int field_5654;
   // $FF: renamed from: d int
   private int field_5655;
   // $FF: renamed from: e byte[]
   private byte[] field_5656;
   // $FF: renamed from: f gH
   private class_1068 field_5657;
   // $FF: renamed from: g gH
   private class_1068 field_5658;
   // $FF: renamed from: h gH
   private class_1068 field_5659;
   // $FF: renamed from: i gH
   private class_1068 field_5660;


   // $FF: renamed from: <init> (int, boolean) void
   public void method_6072(int var1, boolean var2) {
      String[] var10000 = class_752.method_4253();
      super();
      String[] var3 = var10000;
      this.field_5653 = var1;
      this.field_5656 = new byte[4096];
      class_1068 var10001 = new class_1068;
      var10001.method_6009(this.field_5656.length, 4);
      this.field_5658 = var10001;
      class_1072 var4 = this;
      var10001 = new class_1068;
      var10001.method_6009(this.field_5656.length, 4);
      if(var3 != null) {
         this.field_5659 = var10001;
         if(!var2) {
            return;
         }

         var4 = this;
         var10001 = new class_1068;
         var10001.method_6009(this.field_5656.length, 4);
      }

      var4.field_5660 = var10001;
   }

   // $FF: renamed from: b (int, int, int) aji
   public aji method_6073(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = this.field_5656[var2 << 8 | var3 << 4 | var1] & 255;
      String[] var4 = var10000;
      class_1068 var6 = this.field_5657;
      if(var4 != null) {
         if(this.field_5657 == null) {
            return aji.method_2416(var5);
         }

         var6 = this.field_5657;
      }

      var5 |= var6.method_6011(var1, var2, var3) << 8;
      return aji.method_2416(var5);
   }

   // $FF: renamed from: b (int, int, int, aji) void
   public void method_6074(int var1, int var2, int var3, aji var4) {
      String[] var5;
      int var6;
      class_1068 var10000;
      label75: {
         var6 = this.field_5656[var2 << 8 | var3 << 4 | var1] & 255;
         var5 = class_752.method_4253();
         var10000 = this.field_5657;
         if(var5 != null) {
            if(this.field_5657 == null) {
               break label75;
            }

            var10000 = this.field_5657;
         }

         var6 |= var10000.method_6011(var1, var2, var3) << 8;
      }

      int var11;
      label69: {
         aji var9;
         label78: {
            aji var7 = aji.method_2416(var6);
            var9 = var7;
            aji var10001 = class_1192.field_6025;
            if(var5 != null) {
               label57: {
                  if(var7 != class_1192.field_6025) {
                     --this.field_5654;
                     var9 = var7;
                     if(var5 == null) {
                        break label57;
                     }

                     if(var7.method_2441()) {
                        --this.field_5655;
                     }
                  }

                  var9 = var4;
               }

               if(var5 == null) {
                  break label78;
               }

               var10001 = class_1192.field_6025;
            }

            if(var9 != var10001) {
               ++this.field_5654;
               var11 = var4.method_2441();
               if(var5 == null) {
                  break label69;
               }

               if(var11 != 0) {
                  ++this.field_5655;
               }
            }

            var9 = var4;
         }

         var11 = aji.method_2415(var9);
      }

      int var8 = var11;
      class_1072 var12 = this;
      if(var5 != null) {
         this.field_5656[var2 << 8 | var3 << 4 | var1] = (byte)(var8 & 255);
         if(var8 > 255) {
            var10000 = this.field_5657;
            if(var5 != null) {
               if(this.field_5657 == null) {
                  class_1068 var10 = new class_1068;
                  var10.method_6009(this.field_5656.length, 4);
                  this.field_5657 = var10;
               }

               var10000 = this.field_5657;
            }

            var10000.method_6012(var1, var2, var3, (var8 & 3840) >> 8);
            if(var5 != null) {
               return;
            }
         }

         var12 = this;
      }

      var10000 = var12.field_5657;
      if(var5 != null) {
         if(var12.field_5657 == null) {
            return;
         }

         var10000 = this.field_5657;
      }

      var10000.method_6012(var1, var2, var3, 0);
   }

   // $FF: renamed from: c (int, int, int) int
   public int method_6075(int var1, int var2, int var3) {
      return this.field_5658.method_6011(var1, var2, var3);
   }

   // $FF: renamed from: b (int, int, int, int) void
   public void method_6076(int var1, int var2, int var3, int var4) {
      this.field_5658.method_6012(var1, var2, var3, var4);
   }

   // $FF: renamed from: b () boolean
   public boolean method_6077() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_5654;
      if(var1 != null) {
         var10000 = this.field_5654 == 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c () boolean
   public boolean method_6078() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_5655;
      if(var1 != null) {
         var10000 = this.field_5655 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: e () int
   public int method_6079() {
      return this.field_5653;
   }

   // $FF: renamed from: c (int, int, int, int) void
   public void method_6080(int var1, int var2, int var3, int var4) {
      this.field_5660.method_6012(var1, var2, var3, var4);
   }

   // $FF: renamed from: d (int, int, int) int
   public int method_6081(int var1, int var2, int var3) {
      return this.field_5660.method_6011(var1, var2, var3);
   }

   // $FF: renamed from: d (int, int, int, int) void
   public void method_6082(int var1, int var2, int var3, int var4) {
      this.field_5659.method_6012(var1, var2, var3, var4);
   }

   // $FF: renamed from: e (int, int, int) int
   public int method_6083(int var1, int var2, int var3) {
      return this.field_5659.method_6011(var1, var2, var3);
   }

   // $FF: renamed from: f () void
   public void method_6084() {
      this.field_5654 = 0;
      String[] var10000 = class_752.method_4253();
      this.field_5655 = 0;
      int var2 = 0;
      String[] var1 = var10000;

      do {
         int var6 = var2;

         label54:
         while(true) {
            if(var6 >= 16) {
               return;
            }

            int var3 = 0;

            while(true) {
               if(var3 >= 16) {
                  break label54;
               }

               var6 = 0;
               if(var1 == null) {
                  break;
               }

               int var4 = 0;

               while(true) {
                  if(var4 < 16) {
                     aji var5 = this.method_6073(var2, var3, var4);
                     if(var1 == null) {
                        break;
                     }

                     if(var1 != null) {
                        label39: {
                           if(var5 != class_1192.field_6025) {
                              ++this.field_5654;
                              if(var1 == null) {
                                 break label39;
                              }

                              if(var5.method_2441()) {
                                 ++this.field_5655;
                              }
                           }

                           ++var4;
                        }
                     }

                     if(var1 != null) {
                        continue;
                     }
                  }

                  ++var3;
                  break;
               }

               if(var1 == null) {
                  break label54;
               }
            }
         }

         ++var2;
      } while(var1 != null);

   }

   // $FF: renamed from: h () byte[]
   public byte[] method_6085() {
      return this.field_5656;
   }

   // $FF: renamed from: i () void
   public void method_6086() {
      this.field_5657 = null;
   }

   // $FF: renamed from: j () gH
   public class_1068 method_6087() {
      return this.field_5657;
   }

   // $FF: renamed from: k () gH
   public class_1068 method_6088() {
      return this.field_5658;
   }

   // $FF: renamed from: l () gH
   public class_1068 method_6089() {
      return this.field_5659;
   }

   // $FF: renamed from: m () gH
   public class_1068 method_6090() {
      return this.field_5660;
   }

   // $FF: renamed from: b (byte[]) void
   public void method_6091(byte[] var1) {
      this.field_5656 = var1;
   }

   // $FF: renamed from: b (gH) void
   public void method_6092(class_1068 var1) {
      this.field_5657 = var1;
   }

   // $FF: renamed from: c (gH) void
   public void method_6093(class_1068 var1) {
      this.field_5658 = var1;
   }

   // $FF: renamed from: d (gH) void
   public void method_6094(class_1068 var1) {
      this.field_5659 = var1;
   }

   // $FF: renamed from: e (gH) void
   public void method_6095(class_1068 var1) {
      this.field_5660 = var1;
   }

   // $FF: renamed from: n () gH
   public class_1068 method_6096() {
      class_1068 var10001 = new class_1068;
      var10001.method_6009(this.field_5656.length, 4);
      this.field_5657 = var10001;
      return this.field_5657;
   }
}

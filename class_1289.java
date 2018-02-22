
// $FF: renamed from: jK
public class class_1289 {

   // $FF: renamed from: b jJ[]
   private final class_1288[] field_6611;
   // $FF: renamed from: c int
   private int field_6612;
   // $FF: renamed from: d int
   private int field_6613;


   // $FF: renamed from: <init> (jJ[]) void
   public void method_6739(class_1288[] var1) {
      super();
      this.field_6611 = var1;
      this.field_6613 = var1.length;
   }

   // $FF: renamed from: b () void
   public void method_6740() {
      ++this.field_6612;
   }

   // $FF: renamed from: c () boolean
   public boolean method_6741() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_6612;
      if(var1 != null) {
         var10000 = this.field_6612 >= this.field_6613?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d () jJ
   public class_1288 method_6742() {
      String[] var1 = class_752.method_4253();
      class_1289 var10000 = this;
      if(var1 != null) {
         if(this.field_6613 <= 0) {
            return null;
         }

         var10000 = this;
      }

      return var10000.field_6611[this.field_6613 - 1];
   }

   // $FF: renamed from: b (int) jJ
   public class_1288 method_6743(int var1) {
      return this.field_6611[var1];
   }

   // $FF: renamed from: e () int
   public int method_6744() {
      return this.field_6613;
   }

   // $FF: renamed from: c (int) void
   public void method_6745(int var1) {
      this.field_6613 = var1;
   }

   // $FF: renamed from: f () int
   public int method_6746() {
      return this.field_6612;
   }

   // $FF: renamed from: d (int) void
   public void method_6747(int var1) {
      this.field_6612 = var1;
   }

   // $FF: renamed from: b (sa, int) azw
   public azw method_6748(class_689 var1, int var2) {
      double var3 = (double)this.field_6611[var2].field_6599 + (double)((int)(var1.field_3014 + 1.0F)) * 0.5D;
      double var5 = (double)this.field_6611[var2].field_6600;
      double var7 = (double)this.field_6611[var2].field_6601 + (double)((int)(var1.field_3014 + 1.0F)) * 0.5D;
      return azw.method_5086(var3, var5, var7);
   }

   // $FF: renamed from: b (sa) azw
   public azw method_6749(class_689 var1) {
      return this.method_6748(var1, this.field_6612);
   }

   // $FF: renamed from: b (jK) boolean
   public boolean method_6750(class_1289 var1) {
      String[] var2 = class_752.method_4253();
      class_1289 var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      int var4 = var10000.field_6611.length;
      if(var2 != null) {
         if(var4 != this.field_6611.length) {
            return false;
         }

         var4 = 0;
      }

      int var3 = var4;

      while(true) {
         if(var3 < this.field_6611.length) {
            label60: {
               var4 = this.field_6611[var3].field_6599;
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  if(this.field_6611[var3].field_6599 == var1.field_6611[var3].field_6599) {
                     var4 = this.field_6611[var3].field_6600;
                     if(var2 == null) {
                        return (boolean)var4;
                     }

                     if(this.field_6611[var3].field_6600 == var1.field_6611[var3].field_6600) {
                        var4 = this.field_6611[var3].field_6601;
                        if(var2 == null) {
                           return (boolean)var4;
                        }

                        if(this.field_6611[var3].field_6601 == var1.field_6611[var3].field_6601) {
                           ++var3;
                           if(var2 != null) {
                              continue;
                           }
                           break label60;
                        }
                     }
                  }

                  var4 = 0;
               }

               return (boolean)var4;
            }
         }

         var4 = 1;
         break;
      }

      return (boolean)var4;
   }

   // $FF: renamed from: a (azw) boolean
   public boolean method_6751(azw var1) {
      String[] var10000 = class_752.method_4253();
      class_1288 var3 = this.method_6742();
      String[] var2 = var10000;
      class_1288 var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return false;
         }

         var4 = var3;
      }

      int var5;
      label28: {
         var5 = var4.field_6599;
         int var10001 = (int)var1.field_4220;
         if(var2 != null) {
            if(var5 != var10001) {
               break label28;
            }

            var5 = var3.field_6601;
            if(var2 == null) {
               return (boolean)var5;
            }

            var10001 = (int)var1.field_4222;
         }

         if(var5 == var10001) {
            var5 = 1;
            return (boolean)var5;
         }
      }

      var5 = 0;
      return (boolean)var5;
   }
}

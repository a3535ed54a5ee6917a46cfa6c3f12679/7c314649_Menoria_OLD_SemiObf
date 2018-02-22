
// $FF: renamed from: l8
public class class_1338 {

   // $FF: renamed from: b int
   private int field_6883;
   // $FF: renamed from: c int
   private int field_6884;
   // $FF: renamed from: d double
   private double field_6885;
   // $FF: renamed from: e double
   private double field_6886;
   // $FF: renamed from: f int
   private int field_6887;


   // $FF: renamed from: <init> (bao, int, int) void
   public void method_7060(bao var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      super();
      String[] var4 = var10000;
      this.field_6883 = var2;
      this.field_6884 = var3;
      this.field_6887 = 1;
      byte var5 = var1.method_5228();
      int var6 = var1.canLoseFocus7.field_4573;
      int var7 = var6;
      if(var4 != null) {
         if(var6 == 0) {
            var6 = 1000;
         }

         var7 = this.field_6887;
      }

      class_1338 var8;
      while(true) {
         label57: {
            label56: {
               short var10001;
               label68: {
                  label54: {
                     if(var7 < var6) {
                        var7 = this.field_6883 / (this.field_6887 + 1);
                        if(var4 == null) {
                           break label54;
                        }

                        var10001 = 320;
                        if(var4 == null) {
                           break label68;
                        }

                        if(var7 >= 320) {
                           var7 = this.field_6884 / (this.field_6887 + 1);
                           if(var4 == null) {
                              break label54;
                           }

                           if(var7 >= 240) {
                              ++this.field_6887;
                              if(var4 != null) {
                                 var7 = this.field_6887;
                                 continue;
                              }
                           }
                        }
                     }

                     var7 = var5;
                  }

                  if(var4 == null) {
                     break label56;
                  }

                  if(var7 == 0) {
                     break label57;
                  }

                  var8 = this;
                  if(var4 == null) {
                     break;
                  }

                  var7 = this.field_6887;
                  var10001 = 2;
               }

               var7 %= var10001;
            }

            if(var7 != 0) {
               var8 = this;
               if(var4 == null) {
                  break;
               }

               if(this.field_6887 != 1) {
                  --this.field_6887;
               }
            }
         }

         this.field_6885 = (double)this.field_6883 / (double)this.field_6887;
         this.field_6886 = (double)this.field_6884 / (double)this.field_6887;
         this.field_6883 = class_1715.method_9567(this.field_6885);
         var8 = this;
         break;
      }

      var8.field_6884 = class_1715.method_9567(this.field_6886);
   }

   // $FF: renamed from: b () int
   public int method_7061() {
      return this.field_6883;
   }

   // $FF: renamed from: c () int
   public int method_7062() {
      return this.field_6884;
   }

   // $FF: renamed from: d () double
   public double method_7063() {
      return this.field_6885;
   }

   // $FF: renamed from: e () double
   public double method_7064() {
      return this.field_6886;
   }

   // $FF: renamed from: f () int
   public int method_7065() {
      return this.field_6887;
   }
}

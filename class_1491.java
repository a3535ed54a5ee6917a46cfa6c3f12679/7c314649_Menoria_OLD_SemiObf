import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: pb
public class class_1491 {

   // $FF: renamed from: b int
   private final int field_7832;
   // $FF: renamed from: c int
   private final int field_7833;
   // $FF: renamed from: d int
   private final int field_7834;
   // $FF: renamed from: e int
   private final int field_7835;
   // $FF: renamed from: f java.util.List
   private List field_7836;
   // $FF: renamed from: g pa
   private class_1490 field_7837;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7838;


   // $FF: renamed from: <init> (int, int, int, int) void
   public void method_8044(int var1, int var2, int var3, int var4) {
      super();
      this.field_7832 = var1;
      this.field_7833 = var2;
      this.field_7834 = var3;
      this.field_7835 = var4;
   }

   // $FF: renamed from: b () pa
   public class_1490 method_8045() {
      return this.field_7837;
   }

   // $FF: renamed from: c () int
   public int method_8046() {
      return this.field_7832;
   }

   // $FF: renamed from: d () int
   public int method_8047() {
      return this.field_7833;
   }

   // $FF: renamed from: b (pa) boolean
   public boolean method_8048(class_1490 var1) {
      String[] var2 = class_752.method_4253();
      class_1490 var10000 = this.field_7837;
      if(var2 != null) {
         if(this.field_7837 != null) {
            return false;
         }

         var10000 = var1;
      }

      int var3 = var10000.method_8037();
      int var4 = var1.method_8038();
      int var12 = var3;
      if(var2 != null) {
         if(var3 <= this.field_7834) {
            label139: {
               var12 = var4;
               int var10001 = this.field_7835;
               if(var2 != null) {
                  if(var4 > this.field_7835) {
                     break label139;
                  }

                  var12 = var3;
                  var10001 = this.field_7834;
               }

               label113: {
                  if(var2 != null) {
                     if(var12 != var10001) {
                        break label113;
                     }

                     var12 = var4;
                     if(var2 == null) {
                        return (boolean)var12;
                     }

                     var10001 = this.field_7835;
                  }

                  if(var12 == var10001) {
                     this.field_7837 = var1;
                     var12 = 1;
                     return (boolean)var12;
                  }
               }

               List var14 = this.field_7836;
               if(var2 != null) {
                  if(this.field_7836 == null) {
                     label131: {
                        this.field_7836 = new ArrayList(1);
                        var14 = this.field_7836;
                        class_1491 var13 = new class_1491;
                        var13.method_8044(this.field_7832, this.field_7833, var3, var4);
                        var14.add(var13);
                        int var5 = this.field_7834 - var3;
                        int var6 = this.field_7835 - var4;
                        var12 = var6;
                        if(var2 != null) {
                           label97: {
                              if(var6 > 0) {
                                 var12 = var5;
                                 if(var2 == null) {
                                    break label97;
                                 }

                                 if(var5 > 0) {
                                    int var7 = Math.max(this.field_7835, var5);
                                    int var8 = Math.max(this.field_7834, var6);
                                    if(var2 != null) {
                                       label86: {
                                          if(var7 >= var8) {
                                             var14 = this.field_7836;
                                             var13 = new class_1491;
                                             var13.method_8044(this.field_7832, this.field_7833 + var4, var3, var6);
                                             var14.add(var13);
                                             var14 = this.field_7836;
                                             var13 = new class_1491;
                                             var13.method_8044(this.field_7832 + var3, this.field_7833, var5, this.field_7835);
                                             var14.add(var13);
                                             if(var2 != null) {
                                                break label86;
                                             }
                                          }

                                          var14 = this.field_7836;
                                          var13 = new class_1491;
                                          var13.method_8044(this.field_7832 + var3, this.field_7833, var5, var4);
                                          var14.add(var13);
                                          var14 = this.field_7836;
                                          var13 = new class_1491;
                                          var13.method_8044(this.field_7832, this.field_7833 + var4, this.field_7834, var6);
                                          var14.add(var13);
                                       }
                                    }

                                    if(var2 != null) {
                                       break label131;
                                    }
                                 }
                              }

                              var12 = var5;
                           }
                        }

                        if(var2 != null) {
                           if(var12 == 0) {
                              var14 = this.field_7836;
                              var13 = new class_1491;
                              var13.method_8044(this.field_7832, this.field_7833 + var4, var3, var6);
                              var14.add(var13);
                              if(var2 != null) {
                                 break label131;
                              }
                           }

                           var12 = var6;
                        }

                        if(var2 != null && var12 == 0) {
                           var14 = this.field_7836;
                           var13 = new class_1491;
                           var13.method_8044(this.field_7832 + var3, this.field_7833, var5, var4);
                           var14.add(var13);
                        }
                     }
                  }

                  var14 = this.field_7836;
               }

               Iterator var10 = var14.iterator();

               boolean var9;
               while(true) {
                  if(var10.hasNext()) {
                     label132: {
                        class_1491 var11 = (class_1491)var10.next();
                        var9 = var11.method_8048(var1);
                        if(var2 == null) {
                           break;
                        }

                        if(var2 != null) {
                           if(!var9) {
                              if(var2 != null) {
                                 continue;
                              }
                              break label132;
                           }

                           var9 = true;
                        }

                        return var9;
                     }
                  }

                  var9 = false;
                  break;
               }

               return var9;
            }
         }

         var12 = 0;
      }

      return (boolean)var12;
   }

   // $FF: renamed from: b (java.util.List) void
   public void method_8049(List var1) {
      String[] var2 = class_752.method_4253();
      class_1491 var10000 = this;
      if(var2 != null) {
         if(this.field_7837 != null) {
            var1.add(this);
            if(var2 != null) {
               return;
            }
         }

         var10000 = this;
      }

      List var5 = var10000.field_7836;
      if(var2 != null) {
         if(var5 == null) {
            return;
         }

         var5 = this.field_7836;
      }

      Iterator var3 = var5.iterator();

      while(var3.hasNext()) {
         class_1491 var4 = (class_1491)var3.next();
         var4.method_8049(var1);
         if(var2 == null) {
            break;
         }
      }

   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_7838;
      return var10000.append("Slot{originX=").append(this.field_7832).append(", originY=").append(this.field_7833).append(", width=").append(this.field_7834).append(", height=").append(this.field_7835).append(", texture=").append(this.field_7837).append(", subSlots=").append(this.field_7836).append('}').toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8050() {
      // $FF: Couldn't be decompiled
   }
}

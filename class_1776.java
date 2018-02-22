import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: y3
public class class_1776 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_9272;
   // $FF: renamed from: c java.util.List
   private List field_9273;
   // $FF: renamed from: d java.util.List
   private List field_9274;
   // $FF: renamed from: e qi
   private final class_1535 field_9275;
   // $FF: renamed from: f int
   private int field_9276;
   // $FF: renamed from: g int
   private int field_9277;
   // $FF: renamed from: h java.lang.String
   private static final String field_9278;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9279;


   // $FF: renamed from: <init> (qi) void
   public void method_9765(class_1535 var1) {
      super();
      this.field_9273 = new ArrayList();
      this.field_9274 = new ArrayList();
      this.field_9277 = 3;
      this.field_9275 = var1;
   }

   // $FF: renamed from: b (int, yh) void
   public void method_9766(int var1, class_1727 var2) {
      List var10000 = this.field_9273;
      class_1778 var10001 = new class_1778;
      var10001.method_9775(this, var1, var2);
      var10000.add(var10001);
   }

   // $FF: renamed from: b (yh) void
   public void method_9767(class_1727 var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.field_9273.iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         class_1778 var4 = (class_1778)var3.next();
         class_1727 var5 = var4.field_9286;
         if(var5 == var1) {
            if(var2 != null && this.field_9274.contains(var4)) {
               var5.method_9653();
               this.field_9274.remove(var4);
            }

            var3.remove();
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () void
   public void method_9768() {
      String[] var1;
      Iterator var3;
      class_1778 var4;
      boolean var9;
      label131: {
         ArrayList var2;
         label132: {
            String[] var10000 = class_752.method_4253();
            var2 = new ArrayList();
            var1 = var10000;
            class_1776 var7 = this;
            if(var1 != null) {
               if(this.field_9276++ % this.field_9277 == 0) {
                  var3 = this.field_9273.iterator();

                  do {
                     while(true) {
                        if(!var3.hasNext()) {
                           break label132;
                        }

                        var4 = (class_1778)var3.next();
                        boolean var5 = this.field_9274.contains(var4);
                        var9 = var5;
                        if(var1 == null) {
                           break label131;
                        }

                        if(var1 == null) {
                           break;
                        }

                        if(var5) {
                           var9 = this.method_9770(var4);
                           if(var1 != null) {
                              label136: {
                                 if(var9) {
                                    var9 = this.method_9769(var4);
                                    if(var1 == null) {
                                       break label136;
                                    }

                                    if(var9 && var1 != null) {
                                       continue;
                                    }
                                 }

                                 var4.field_9286.method_9653();
                                 this.field_9274.remove(var4);
                              }
                           }
                        }

                        var9 = this.method_9770(var4);
                        break;
                     }

                     if(var1 != null) {
                        if(!var9) {
                           continue;
                        }

                        var9 = var4.field_9286.method_9649();
                     }

                     if(var1 != null && var9) {
                        var2.add(var4);
                        this.field_9274.add(var4);
                     }
                  } while(var1 != null);

                  var7 = this;
               } else {
                  var7 = this;
               }
            }

            var3 = var7.field_9274.iterator();

            while(var3.hasNext()) {
               var4 = (class_1778)var3.next();
               class_1727 var10 = var4.field_9286;
               if(var1 != null) {
                  var9 = var4.field_9286.method_9650();
                  if(var1 == null) {
                     break label131;
                  }

                  if(var9) {
                     continue;
                  }

                  var10 = var4.field_9286;
               }

               var10.method_9653();
               var3.remove();
               if(var1 == null) {
                  break;
               }
            }
         }

         String[] var6 = field_9279;
         this.field_9275.method_8332("goalStart");
         var3 = var2.iterator();
         var9 = var3.hasNext();
      }

      while(true) {
         if(var9) {
            var4 = (class_1778)var3.next();
            this.field_9275.method_8332(var4.field_9286.getClass().getSimpleName());
            var4.field_9286.method_9652();
            this.field_9275.method_8333();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               var9 = var3.hasNext();
               continue;
            }
         }

         this.field_9275.method_8333();
         String[] var10001 = field_9279;
         this.field_9275.method_8332("goalTick");
         break;
      }

      var3 = this.field_9274.iterator();

      while(true) {
         if(var3.hasNext()) {
            var4 = (class_1778)var3.next();
            var4.field_9286.method_9654();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_9275.method_8333();
         break;
      }

   }

   // $FF: renamed from: b (y4) boolean
   private boolean method_9769(class_1778 var1) {
      String[] var10001 = field_9279;
      this.field_9275.method_8332("canContinue");
      boolean var2 = var1.field_9286.method_9650();
      this.field_9275.method_8333();
      return var2;
   }

   // $FF: renamed from: c (y4) boolean
   private boolean method_9770(class_1778 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var10002 = field_9279;
      this.field_9275.method_8332("canUse");
      String[] var2 = var10000;
      Iterator var3 = this.field_9273.iterator();

      while(true) {
         if(var3.hasNext()) {
            class_1778 var4 = (class_1778)var3.next();
            if(var2 == null) {
               break;
            }

            label74: {
               class_1778 var5 = var4;
               if(var2 != null) {
                  if(var4 == var1) {
                     break label74;
                  }

                  var5 = var1;
               }

               int var6 = var5.field_9287;
               if(var2 != null) {
                  if(var6 >= var4.field_9287) {
                     boolean var7 = this.field_9274.contains(var4);
                     if(var2 != null) {
                        if(!var7) {
                           break label74;
                        }

                        var7 = this.method_9771(var1, var4);
                     }

                     if(var2 != null) {
                        if(var7) {
                           break label74;
                        }

                        this.field_9275.method_8333();
                        var7 = false;
                     }

                     return var7;
                  }

                  var6 = this.field_9274.contains(var4);
               }

               if(var2 != null) {
                  if(var6 == 0) {
                     break label74;
                  }

                  var6 = var4.field_9286.method_9651();
               }

               if(var2 != null) {
                  if(var6 != 0) {
                     break label74;
                  }

                  this.field_9275.method_8333();
                  var6 = 0;
               }

               return (boolean)var6;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.field_9275.method_8333();
         break;
      }

      return true;
   }

   // $FF: renamed from: b (y4, y4) boolean
   private boolean method_9771(class_1778 var1, class_1778 var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1.field_9286.method_9656() & var2.field_9286.method_9656();
      if(var3 != null) {
         var10000 = var10000 == 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9772() {
      // $FF: Couldn't be decompiled
   }
}

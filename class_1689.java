import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: vW
public class class_1689 {

   // $FF: renamed from: b java.util.List
   private final List field_8817;
   // $FF: renamed from: c sv
   private final class_752 field_8818;
   // $FF: renamed from: d int
   private int field_8819;
   // $FF: renamed from: e int
   private int field_8820;
   // $FF: renamed from: f int
   private int field_8821;
   // $FF: renamed from: g boolean
   private boolean field_8822;
   // $FF: renamed from: h boolean
   private boolean field_8823;
   // $FF: renamed from: i java.lang.String
   private String field_8824;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_8825;


   // $FF: renamed from: <init> (sv) void
   public void method_9311(class_752 var1) {
      super();
      this.field_8817 = new ArrayList();
      this.field_8818 = var1;
   }

   // $FF: renamed from: b () void
   public void method_9312() {
      class_1689 var6;
      label40: {
         String[] var10000 = class_752.method_4253();
         this.method_9318();
         String[] var1 = var10000;
         boolean var4 = this.field_8818.method_4197();
         if(var1 != null) {
            if(var4) {
               label25: {
                  aji var2 = this.field_8818.field_2990.getBlock(class_1715.method_9561(this.field_8818.field_2994), class_1715.method_9561(this.field_8818.field_3004.field_6910), class_1715.method_9561(this.field_8818.field_2996));
                  aji var5 = var2;
                  aji var10001 = class_1192.field_6091;
                  String[] var3;
                  if(var1 != null) {
                     if(var2 == class_1192.field_6091) {
                        var3 = field_8825;
                        this.field_8824 = "ladder";
                        if(var1 != null) {
                           break label25;
                        }
                     }

                     var5 = var2;
                     var10001 = class_1192.field_6131;
                  }

                  if(var5 == var10001) {
                     var3 = field_8825;
                     this.field_8824 = "vines";
                  }
               }

               if(var1 != null) {
                  return;
               }
            }

            var6 = this;
            if(var1 == null) {
               break label40;
            }

            var4 = this.field_8818.method_3876();
         }

         if(!var4) {
            return;
         }

         var6 = this;
      }

      String[] var7 = field_8825;
      var6.field_8824 = "water";
   }

   // $FF: renamed from: b (vX, float, float) void
   public void method_9313(class_1691 var1, float var2, float var3) {
      this.method_9319();
      this.method_9312();
      String[] var10000 = class_752.method_4253();
      class_1687 var10001 = new class_1687;
      var10001.method_9301(var1, this.field_8818.field_3029, var2, var3, this.field_8824, this.field_8818.field_3019);
      class_1687 var5 = var10001;
      this.field_8817.add(var5);
      this.field_8819 = this.field_8818.field_3029;
      this.field_8823 = true;
      String[] var4 = var10000;
      boolean var6 = var5.method_9304();
      if(var4 != null) {
         if(!var6) {
            return;
         }

         var6 = this.field_8822;
      }

      class_752 var7;
      label33: {
         if(var4 != null) {
            if(var6) {
               return;
            }

            var7 = this.field_8818;
            if(var4 == null) {
               break label33;
            }

            var6 = this.field_8818.method_3917();
         }

         if(!var6) {
            return;
         }

         this.field_8822 = true;
         this.field_8820 = this.field_8818.field_3029;
         this.field_8821 = this.field_8820;
         var7 = this.field_8818;
      }

      var7.method_4250();
   }

   // $FF: renamed from: c () rV
   public class_66 method_9314() {
      String[] var1 = class_752.method_4253();
      class_1689 var10000 = this;
      String[] var10;
      class_1081 var16;
      if(var1 != null) {
         if(this.field_8817.size() == 0) {
            var16 = new class_1081;
            var10 = field_8825;
            var16.method_6126("death.attack.generic", new Object[]{this.field_8818.method_407()});
            return var16;
         }

         var10000 = this;
      }

      Object var4;
      class_1691 var14;
      label133: {
         class_1687 var2 = var10000.method_9316();
         class_1687 var3 = (class_1687)this.field_8817.get(this.field_8817.size() - 1);
         class_66 var5 = var3.method_9306();
         class_689 var6 = var3.method_9302().method_9345();
         class_1687 var13 = var2;
         if(var1 != null) {
            if(var2 != null) {
               var14 = var3.method_9302();
               if(var1 == null) {
                  break label133;
               }

               if(var14 == class_1691.field_8837) {
                  label138: {
                     class_66 var7;
                     label121: {
                        label120: {
                           var7 = var2.method_9306();
                           var14 = var2.method_9302();
                           class_1691 var10001 = class_1691.field_8837;
                           if(var1 != null) {
                              if(var14 == class_1691.field_8837) {
                                 break label120;
                              }

                              var14 = var2.method_9302();
                              var10001 = class_1691.field_8838;
                           }

                           if(var14 != var10001) {
                              break label121;
                           }
                        }

                        var16 = new class_1081;
                        StringBuilder var10002 = new StringBuilder();
                        var10 = field_8825;
                        var16.method_6126(var10002.append("death.fell.accident.").append(this.method_9317(var2)).toString(), new Object[]{this.field_8818.method_407()});
                        var4 = var16;
                        if(var1 != null) {
                           break label138;
                        }
                     }

                     class_66 var17 = var7;
                     add var11;
                     class_689 var18;
                     if(var1 != null) {
                        label109: {
                           if(var7 != null) {
                              label139: {
                                 label140: {
                                    var17 = var5;
                                    if(var1 != null) {
                                       if(var5 == null) {
                                          break label140;
                                       }

                                       var17 = var7;
                                    }

                                    if(var1 == null) {
                                       break label109;
                                    }

                                    if(var17.equals(var5)) {
                                       break label139;
                                    }
                                 }

                                 label92: {
                                    class_689 var8 = var2.method_9302().method_9345();
                                    var18 = var8;
                                    if(var1 != null) {
                                       if(!(var8 instanceof class_752)) {
                                          var11 = null;
                                          break label92;
                                       }

                                       var18 = var8;
                                    }

                                    var11 = ((class_752)var18).method_4214();
                                 }

                                 label87: {
                                    label86: {
                                       add var9 = var11;
                                       var11 = var9;
                                       if(var1 != null) {
                                          if(var9 == null) {
                                             break label86;
                                          }

                                          var11 = var9;
                                       }

                                       if(var11.method_3773()) {
                                          var16 = new class_1081;
                                          var10 = field_8825;
                                          var16.method_6126("death.fell.assist.item", new Object[]{this.field_8818.method_407(), var7, var9.method_3789()});
                                          var4 = var16;
                                          if(var1 != null) {
                                             break label87;
                                          }
                                       }
                                    }

                                    var16 = new class_1081;
                                    var10 = field_8825;
                                    var16.method_6126("death.fell.assist", new Object[]{this.field_8818.method_407(), var7});
                                    var4 = var16;
                                 }

                                 if(var1 != null) {
                                    break label138;
                                 }
                              }
                           }

                           var17 = var5;
                        }
                     }

                     if(var17 != null) {
                        label72: {
                           var18 = var6;
                           if(var1 != null) {
                              if(!(var6 instanceof class_752)) {
                                 var11 = null;
                                 break label72;
                              }

                              var18 = var6;
                           }

                           var11 = ((class_752)var18).method_4214();
                        }

                        label67: {
                           label66: {
                              add var12 = var11;
                              var11 = var12;
                              if(var1 != null) {
                                 if(var12 == null) {
                                    break label66;
                                 }

                                 var11 = var12;
                              }

                              if(var11.method_3773()) {
                                 var16 = new class_1081;
                                 var10 = field_8825;
                                 var16.method_6126("death.fell.finish.item", new Object[]{this.field_8818.method_407(), var5, var12.method_3789()});
                                 var4 = var16;
                                 if(var1 != null) {
                                    break label67;
                                 }
                              }
                           }

                           var16 = new class_1081;
                           var10 = field_8825;
                           var16.method_6126("death.fell.finish", new Object[]{this.field_8818.method_407(), var5});
                           var4 = var16;
                        }

                        if(var1 != null) {
                           break label138;
                        }
                     }

                     var16 = new class_1081;
                     String[] var15 = field_8825;
                     var16.method_6126("death.fell.killer", new Object[]{this.field_8818.method_407()});
                     var4 = var16;
                  }

                  if(var1 != null) {
                     return (class_66)var4;
                  }
               }
            }

            var13 = var3;
         }

         var14 = var13.method_9302();
      }

      var4 = var14.method_9350(this.field_8818);
      return (class_66)var4;
   }

   // $FF: renamed from: d () sv
   public class_752 method_9315() {
      String[] var10000 = class_752.method_4253();
      class_752 var2 = null;
      class_792 var3 = null;
      String[] var1 = var10000;
      float var4 = 0.0F;
      float var5 = 0.0F;
      Iterator var6 = this.field_8817.iterator();

      Object var12;
      label71: {
         int var8;
         while(true) {
            if(var6.hasNext()) {
               class_1687 var7 = (class_1687)var6.next();
               var8 = var7.method_9302().method_9345() instanceof class_792;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  label58: {
                     if(var8 != 0) {
                        label56: {
                           class_792 var9 = var3;
                           if(var1 != null) {
                              if(var3 != null) {
                                 float var13;
                                 var8 = (var13 = var7.method_9303() - var5) == 0.0F?0:(var13 < 0.0F?-1:1);
                                 if(var1 == null) {
                                    break label58;
                                 }

                                 if(var8 <= 0) {
                                    break label56;
                                 }
                              }

                              var5 = var7.method_9303();
                              var9 = (class_792)var7.method_9302().method_9345();
                           }

                           var3 = var9;
                        }
                     }

                     var8 = var7.method_9302().method_9345() instanceof class_752;
                  }
               }

               if(var8 != 0) {
                  label45: {
                     class_752 var10 = var2;
                     if(var1 != null) {
                        float var11;
                        label42: {
                           if(var2 != null) {
                              var11 = var7.method_9303();
                              if(var1 == null) {
                                 break label42;
                              }

                              if(var11 <= var4) {
                                 break label45;
                              }
                           }

                           var11 = var7.method_9303();
                        }

                        var4 = var11;
                        var10 = (class_752)var7.method_9302().method_9345();
                     }

                     var2 = var10;
                  }
               }

               if(var1 != null) {
                  continue;
               }
            }

            var12 = var3;
            if(var1 == null) {
               return (class_752)var12;
            }

            if(var3 == null) {
               break label71;
            }

            float var14;
            var8 = (var14 = var5 - var4 / 3.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
            break;
         }

         if(var8 >= 0) {
            return var3;
         }
      }

      var12 = var2;
      return (class_752)var12;
   }

   // $FF: renamed from: e () vV
   private class_1687 method_9316() {
      String[] var10000 = class_752.method_4253();
      class_1687 var2 = null;
      String[] var1 = var10000;
      class_1687 var3 = null;
      byte var4 = 0;
      float var5 = 0.0F;
      int var6 = 0;

      int var9;
      class_1687 var10;
      while(true) {
         if(var6 < this.field_8817.size()) {
            class_1687 var7 = (class_1687)this.field_8817.get(var6);
            var9 = var6;
            if(var1 == null) {
               break;
            }

            label116: {
               label126: {
                  class_1687 var8 = var6 > 0?(class_1687)this.field_8817.get(var6 - 1):null;
                  var10 = var7;
                  if(var1 != null) {
                     if(var7.method_9302() != class_1691.field_8837) {
                        var10 = var7;
                        if(var1 == null) {
                           break label116;
                        }

                        if(var7.method_9302() != class_1691.field_8838) {
                           break label126;
                        }
                     }

                     var10 = var7;
                  }

                  if(var1 == null) {
                     break label116;
                  }

                  if(var10.method_9307() > 0.0F) {
                     label127: {
                        label128: {
                           var10 = var2;
                           if(var1 != null) {
                              if(var2 == null) {
                                 break label128;
                              }

                              var10 = var7;
                           }

                           if(var1 == null) {
                              break label116;
                           }

                           if(var10.method_9307() <= var5) {
                              break label127;
                           }
                        }

                        label92: {
                           if(var6 > 0) {
                              var2 = var8;
                              if(var1 != null) {
                                 break label92;
                              }
                           }

                           var2 = var7;
                        }

                        var5 = var7.method_9307();
                     }
                  }
               }

               var10 = var7;
            }

            label129: {
               if(var1 != null) {
                  if(var10.method_9305() == null) {
                     break label129;
                  }

                  var10 = var3;
               }

               if(var1 != null) {
                  label80: {
                     if(var10 != null) {
                        var10 = var7;
                        if(var1 == null) {
                           break label80;
                        }

                        if(var7.method_9303() <= (float)var4) {
                           break label129;
                        }
                     }

                     var10 = var7;
                  }
               }

               var3 = var10;
            }

            ++var6;
            if(var1 != null) {
               continue;
            }
         }

         float var11;
         var9 = (var11 = var5 - 5.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
         break;
      }

      if(var1 != null) {
         if(var9 > 0) {
            label65: {
               var10 = var2;
               if(var1 != null) {
                  if(var2 == null) {
                     break label65;
                  }

                  var10 = var2;
               }

               return var10;
            }
         }

         var9 = var4;
      }

      if(var9 > 5) {
         var10 = var3;
         if(var1 != null) {
            if(var3 == null) {
               return null;
            }

            var10 = var3;
         }

         return var10;
      } else {
         return null;
      }
   }

   // $FF: renamed from: b (vV) java.lang.String
   private String method_9317(class_1687 var1) {
      String[] var2 = class_752.method_4253();
      class_1687 var10000 = var1;
      String var3;
      if(var2 != null) {
         if(var1.method_9305() == null) {
            String[] var4 = field_8825;
            var3 = "generic";
            return var3;
         }

         var10000 = var1;
      }

      var3 = var10000.method_9305();
      return var3;
   }

   // $FF: renamed from: f () void
   private void method_9318() {
      this.field_8824 = null;
   }

   // $FF: renamed from: h () void
   public void method_9319() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_8822;
      if(var1 != null) {
         var10000 = this.field_8822?300:100;
      }

      int var2 = var10000;
      var10000 = this.field_8823;
      if(var1 != null) {
         if(!this.field_8823) {
            return;
         }

         var10000 = this.field_8818.method_3917();
      }

      if(var1 != null) {
         label35: {
            if(var10000 != 0) {
               var10000 = this.field_8818.field_3029 - this.field_8819;
               if(var1 == null) {
                  break label35;
               }

               if(var10000 <= var2) {
                  return;
               }
            }

            var10000 = this.field_8822;
         }
      }

      int var3 = var10000;
      this.field_8823 = false;
      this.field_8822 = false;
      class_1689 var4 = this;
      if(var1 != null) {
         this.field_8821 = this.field_8818.field_3029;
         if(var3 != 0) {
            this.field_8818.method_4251();
         }

         var4 = this;
      }

      var4.field_8817.clear();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9320() {
      // $FF: Couldn't be decompiled
   }
}

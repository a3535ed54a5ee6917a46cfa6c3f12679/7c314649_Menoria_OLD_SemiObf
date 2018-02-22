import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;

public class buu {

   // $FF: renamed from: a boolean
   public static boolean field_8555;
   // $FF: renamed from: b int
   public static int field_8556;
   // $FF: renamed from: c int
   public static int field_8557;
   // $FF: renamed from: d boolean
   public static boolean field_8558;
   // $FF: renamed from: e int
   public static int field_8559;
   // $FF: renamed from: f int
   public static int field_8560;
   // $FF: renamed from: g int
   public static int field_8561;
   // $FF: renamed from: h int
   public static int field_8562;
   // $FF: renamed from: i int
   public static int field_8563;
   // $FF: renamed from: j int
   public static int field_8564;
   // $FF: renamed from: k int
   public static int field_8565;
   // $FF: renamed from: l int
   public static int field_8566;
   // $FF: renamed from: m int
   public static int field_8567;
   // $FF: renamed from: w int
   private static int field_8568;
   // $FF: renamed from: n boolean
   public static boolean field_8569;
   // $FF: renamed from: x boolean
   private static boolean field_8570;
   // $FF: renamed from: y boolean
   private static boolean field_8571;
   // $FF: renamed from: o int
   public static int field_8572;
   // $FF: renamed from: p int
   public static int field_8573;
   // $FF: renamed from: q int
   public static int field_8574;
   // $FF: renamed from: r int
   public static int field_8575;
   // $FF: renamed from: s boolean
   public static boolean field_8576;
   // $FF: renamed from: t int
   public static int field_8577;
   // $FF: renamed from: z boolean
   private static boolean field_8578;
   // $FF: renamed from: A boolean
   private static boolean field_8579;
   // $FF: renamed from: u boolean
   public static boolean field_8580;
   // $FF: renamed from: v boolean
   public static boolean field_8581;
   // $FF: renamed from: B java.lang.String
   private static String field_8582;
   public static float lastBrightnessX;
   public static float lastBrightnessY;
   private static final String __OBFID;
   // $FF: renamed from: C java.lang.String[]
   private static final String[] field_8583;


   // $FF: renamed from: <init> () void
   public void method_9037() {
      super();
   }

   // $FF: renamed from: a () void
   public static void method_9038() {
      String[] var0;
      boolean var10000;
      ContextCapabilities var1;
      label324: {
         label327: {
            Config.initDisplay();
            var1 = GLContext.getCapabilities();
            var0 = class_752.method_4253();
            var10000 = var1.GL_ARB_multitexture;
            if(var0 != null) {
               if(!var1.GL_ARB_multitexture) {
                  break label327;
               }

               var10000 = var1.OpenGL13;
            }

            if(var0 == null) {
               break label324;
            }

            if(!var10000) {
               var10000 = true;
               break label324;
            }
         }

         var10000 = false;
      }

      String[] var2;
      char var3;
      StringBuilder var4;
      label313: {
         field_8578 = var10000;
         var3 = field_8578;
         if(var0 != null) {
            if(field_8578) {
               var4 = (new StringBuilder()).append(field_8582);
               var2 = field_8583;
               field_8582 = var4.append("Using multitexturing ARB.\n").toString();
               field_8556 = '\u84c0';
               field_8557 = '\u84c1';
               if(var0 != null) {
                  break label313;
               }
            }

            var4 = (new StringBuilder()).append(field_8582);
            var2 = field_8583;
            field_8582 = var4.append("Using GL 1.3 multitexturing.\n").toString();
            field_8556 = '\u84c0';
            var3 = '\u84c1';
         }

         field_8557 = var3;
      }

      label306: {
         label328: {
            var10000 = var1.GL_EXT_blend_func_separate;
            if(var0 != null) {
               if(!var1.GL_EXT_blend_func_separate) {
                  break label328;
               }

               var10000 = var1.OpenGL14;
            }

            if(var0 == null) {
               break label306;
            }

            if(!var10000) {
               var10000 = true;
               break label306;
            }
         }

         var10000 = false;
      }

      field_8580 = var10000;
      var10000 = var1.OpenGL14;
      if(var0 != null) {
         label294: {
            if(!var1.OpenGL14) {
               var10000 = var1.GL_EXT_blend_func_separate;
               if(var0 == null) {
                  break label294;
               }

               if(!var1.GL_EXT_blend_func_separate) {
                  var10000 = false;
                  break label294;
               }
            }

            var10000 = true;
         }
      }

      label287: {
         label329: {
            field_8579 = var10000;
            var10000 = field_8579;
            if(var0 != null) {
               if(!field_8579) {
                  break label329;
               }

               var10000 = var1.GL_ARB_framebuffer_object;
            }

            if(var0 == null) {
               break label287;
            }

            if(!var10000) {
               var10000 = var1.GL_EXT_framebuffer_object;
               if(var0 == null) {
                  break label287;
               }

               if(!var1.GL_EXT_framebuffer_object) {
                  var10000 = var1.OpenGL30;
                  if(var0 == null) {
                     break label287;
                  }

                  if(!var1.OpenGL30) {
                     break label329;
                  }
               }
            }

            var10000 = true;
            break label287;
         }

         var10000 = false;
      }

      String var10001;
      label268: {
         label330: {
            field_8569 = var10000;
            if(var0 != null) {
               if(field_8569) {
                  var4 = (new StringBuilder()).append(field_8582);
                  var2 = field_8583;
                  field_8582 = var4.append("Using framebuffer objects because ").toString();
                  var3 = var1.OpenGL30;
                  if(var0 != null) {
                     if(var1.OpenGL30) {
                        field_8582 = field_8582 + "OpenGL 3.0 is supported and separate blending is supported.\n";
                        field_8568 = 0;
                        field_8559 = '\u8d40';
                        field_8560 = '\u8d41';
                        field_8561 = '\u8ce0';
                        field_8562 = '\u8d00';
                        field_8563 = '\u8cd5';
                        field_8564 = '\u8cd6';
                        field_8565 = '\u8cd7';
                        field_8566 = '\u8cdb';
                        field_8567 = '\u8cdc';
                        if(var0 != null) {
                           break label330;
                        }
                     }

                     var3 = var1.GL_ARB_framebuffer_object;
                  }

                  if(var0 != null) {
                     if(var3 != 0) {
                        var4 = (new StringBuilder()).append(field_8582);
                        var2 = field_8583;
                        field_8582 = var4.append("ARB_framebuffer_object is supported and separate blending is supported.\n").toString();
                        field_8568 = 1;
                        field_8559 = '\u8d40';
                        field_8560 = '\u8d41';
                        field_8561 = '\u8ce0';
                        field_8562 = '\u8d00';
                        field_8563 = '\u8cd5';
                        field_8565 = '\u8cd7';
                        field_8564 = '\u8cd6';
                        field_8566 = '\u8cdb';
                        field_8567 = '\u8cdc';
                        if(var0 != null) {
                           break label330;
                        }
                     }

                     var3 = var1.GL_EXT_framebuffer_object;
                  }

                  if(var0 == null) {
                     break label268;
                  }

                  if(var3 == 0) {
                     break label330;
                  }

                  var4 = (new StringBuilder()).append(field_8582);
                  var2 = field_8583;
                  field_8582 = var4.append("EXT_framebuffer_object is supported.\n").toString();
                  field_8568 = 2;
                  field_8559 = '\u8d40';
                  field_8560 = '\u8d41';
                  field_8561 = '\u8ce0';
                  field_8562 = '\u8d00';
                  field_8563 = '\u8cd5';
                  field_8565 = '\u8cd7';
                  field_8564 = '\u8cd6';
                  field_8566 = '\u8cdb';
                  field_8567 = '\u8cdc';
                  if(var0 != null) {
                     break label330;
                  }
               }

               var4 = (new StringBuilder()).append(field_8582);
               var2 = field_8583;
               field_8582 = var4.append("Not using framebuffer objects because ").toString();
            }

            var4 = (new StringBuilder()).append(field_8582);
            var2 = field_8583;
            var10001 = "OpenGL 1.4 is ";
            if(var0 != null) {
               var4 = var4.append("OpenGL 1.4 is ");
               if(var1.OpenGL14) {
                  var10001 = "";
               } else {
                  var2 = field_8583;
                  var10001 = "not ";
               }
            }

            var4 = var4.append(var10001);
            var2 = field_8583;
            field_8582 = var4.append("supported, ").toString();
            var4 = (new StringBuilder()).append(field_8582);
            var10001 = "EXT_blend_func_separate is ";
            if(var0 != null) {
               var4 = var4.append("EXT_blend_func_separate is ");
               if(var1.GL_EXT_blend_func_separate) {
                  var10001 = "";
               } else {
                  var2 = field_8583;
                  var10001 = "not ";
               }
            }

            var4 = var4.append(var10001);
            var2 = field_8583;
            field_8582 = var4.append("supported, ").toString();
            var4 = (new StringBuilder()).append(field_8582);
            var10001 = "OpenGL 3.0 is ";
            if(var0 != null) {
               var4 = var4.append("OpenGL 3.0 is ");
               if(var1.OpenGL30) {
                  var10001 = "";
               } else {
                  var2 = field_8583;
                  var10001 = "not ";
               }
            }

            var4 = var4.append(var10001);
            var2 = field_8583;
            field_8582 = var4.append("supported, ").toString();
            var4 = (new StringBuilder()).append(field_8582);
            var10001 = "ARB_framebuffer_object is ";
            if(var0 != null) {
               var4 = var4.append("ARB_framebuffer_object is ");
               if(var1.GL_ARB_framebuffer_object) {
                  var10001 = "";
               } else {
                  var2 = field_8583;
                  var10001 = "not ";
               }
            }

            var4 = var4.append(var10001);
            var2 = field_8583;
            field_8582 = var4.append("supported, and ").toString();
            var4 = (new StringBuilder()).append(field_8582);
            var10001 = "EXT_framebuffer_object is ";
            if(var0 != null) {
               var4 = var4.append("EXT_framebuffer_object is ");
               if(var1.GL_EXT_framebuffer_object) {
                  var10001 = "";
               } else {
                  var2 = field_8583;
                  var10001 = "not ";
               }
            }

            var4 = var4.append(var10001);
            var2 = field_8583;
            field_8582 = var4.append("supported.\n").toString();
         }

         field_8576 = var1.GL_EXT_texture_filter_anisotropic;
         var3 = field_8576;
      }

      float var6;
      label245: {
         if(var0 != null) {
            if(var3 == 0) {
               var6 = 0.0F;
               break label245;
            }

            var3 = '\u84ff';
         }

         var6 = GL11.glGetFloat(var3);
      }

      field_8577 = (int)var6;
      var4 = (new StringBuilder()).append(field_8582);
      var2 = field_8583;
      var10001 = "Anisotropic filtering is ";
      if(var0 != null) {
         var4 = var4.append("Anisotropic filtering is ");
         if(field_8576) {
            var10001 = "";
         } else {
            var2 = field_8583;
            var10001 = "not ";
         }
      }

      String var7;
      label238: {
         var4 = var4.append(var10001);
         var2 = field_8583;
         var7 = var4.append("supported").toString();
         if(var0 != null) {
            field_8582 = var7;
            if(field_8576) {
               field_8582 = field_8582 + " and maximum anisotropy is " + field_8577 + ".\n";
               if(var0 != null) {
                  break label238;
               }
            }

            var4 = (new StringBuilder()).append(field_8582);
            var2 = field_8583;
            var7 = var4.append(".\n").toString();
         }

         field_8582 = var7;
      }

      class_101.field_122.method_472((float)field_8577);
      field_8555 = var1.OpenGL21;
      var10000 = field_8555;
      if(var0 != null) {
         label230: {
            if(!field_8555) {
               label228: {
                  label332: {
                     var10000 = var1.GL_ARB_vertex_shader;
                     if(var0 != null) {
                        if(!var1.GL_ARB_vertex_shader) {
                           break label332;
                        }

                        var10000 = var1.GL_ARB_fragment_shader;
                     }

                     if(var0 != null) {
                        if(!var10000) {
                           break label332;
                        }

                        var10000 = var1.GL_ARB_shader_objects;
                     }

                     if(var0 == null) {
                        break label230;
                     }

                     if(var10000) {
                        break label228;
                     }
                  }

                  var10000 = false;
                  break label230;
               }
            }

            var10000 = true;
         }
      }

      field_8570 = var10000;
      var4 = (new StringBuilder()).append(field_8582);
      var2 = field_8583;
      var10001 = "Shaders are ";
      if(var0 != null) {
         var4 = var4.append("Shaders are ");
         if(field_8570) {
            var10001 = "";
         } else {
            var2 = field_8583;
            var10001 = "not ";
         }
      }

      label333: {
         label209: {
            var4 = var4.append(var10001);
            var2 = field_8583;
            var4 = var4.append("available because ");
            if(var0 != null) {
               field_8582 = var4.toString();
               if(field_8570) {
                  var3 = var1.OpenGL21;
                  if(var0 != null) {
                     if(var1.OpenGL21) {
                        field_8582 = field_8582 + "OpenGL 2.1 is supported.\n";
                        field_8571 = false;
                        field_8572 = '\u8b82';
                        field_8573 = '\u8b81';
                        field_8574 = '\u8b31';
                        field_8575 = '\u8b30';
                        if(var0 != null) {
                           break label333;
                        }
                     }

                     var4 = (new StringBuilder()).append(field_8582);
                     var2 = field_8583;
                     field_8582 = var4.append("ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n").toString();
                     field_8571 = true;
                     field_8572 = '\u8b82';
                     field_8573 = '\u8b81';
                     field_8574 = '\u8b31';
                     var3 = '\u8b30';
                  }

                  field_8575 = var3;
                  if(var0 != null) {
                     break label333;
                  }
               }

               var4 = (new StringBuilder()).append(field_8582);
               var2 = field_8583;
               var10001 = "OpenGL 2.1 is ";
               if(var0 == null) {
                  break label209;
               }

               var4 = var4.append("OpenGL 2.1 is ");
            }

            if(var1.OpenGL21) {
               var10001 = "";
            } else {
               var2 = field_8583;
               var10001 = "not ";
            }
         }

         var4 = var4.append(var10001);
         var2 = field_8583;
         field_8582 = var4.append("supported, ").toString();
         var4 = (new StringBuilder()).append(field_8582);
         var10001 = "ARB_shader_objects is ";
         if(var0 != null) {
            var4 = var4.append("ARB_shader_objects is ");
            if(var1.GL_ARB_shader_objects) {
               var10001 = "";
            } else {
               var2 = field_8583;
               var10001 = "not ";
            }
         }

         var4 = var4.append(var10001);
         var2 = field_8583;
         field_8582 = var4.append("supported, ").toString();
         var4 = (new StringBuilder()).append(field_8582);
         var10001 = "ARB_vertex_shader is ";
         if(var0 != null) {
            var4 = var4.append("ARB_vertex_shader is ");
            if(var1.GL_ARB_vertex_shader) {
               var10001 = "";
            } else {
               var2 = field_8583;
               var10001 = "not ";
            }
         }

         var4 = var4.append(var10001);
         var2 = field_8583;
         field_8582 = var4.append("supported, and ").toString();
         var4 = (new StringBuilder()).append(field_8582);
         var10001 = "ARB_fragment_shader is ";
         if(var0 != null) {
            var4 = var4.append("ARB_fragment_shader is ");
            if(var1.GL_ARB_fragment_shader) {
               var10001 = "";
            } else {
               var2 = field_8583;
               var10001 = "not ";
            }
         }

         var4 = var4.append(var10001);
         var2 = field_8583;
         field_8582 = var4.append("supported.\n").toString();
      }

      label194: {
         label335: {
            var10000 = field_8569;
            if(var0 != null) {
               if(!field_8569) {
                  break label335;
               }

               var10000 = field_8570;
            }

            if(var0 == null) {
               break label194;
            }

            if(var10000) {
               var10000 = true;
               break label194;
            }
         }

         var10000 = false;
      }

      field_8581 = var10000;
      var7 = GL11.glGetString(7936).toLowerCase();
      String[] var5 = field_8583;
      field_8558 = var7.contains("nvidia");
   }

   // $FF: renamed from: b () boolean
   public static boolean method_9039() {
      return field_8581;
   }

   // $FF: renamed from: c () java.lang.String
   public static String method_9040() {
      return field_8582;
   }

   // $FF: renamed from: a (int, int) int
   public static int method_9041(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            var10000 = ARBShaderObjects.glGetObjectParameteriARB(var0, var1);
            return var10000;
         }

         var10000 = var0;
      }

      var10000 = GL20.glGetProgrami(var10000, var1);
      return var10000;
   }

   // $FF: renamed from: b (int, int) void
   public static void method_9042(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glAttachObjectARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glAttachShader(var10000, var1);
   }

   // $FF: renamed from: a (int) void
   public static void method_9043(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8571;
      if(var1 != null) {
         if(field_8571) {
            ARBShaderObjects.glDeleteObjectARB(var0);
            if(var1 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glDeleteShader(var10000);
   }

   // $FF: renamed from: b (int) int
   public static int method_9044(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8571;
      if(var1 != null) {
         if(field_8571) {
            var10000 = ARBShaderObjects.glCreateShaderObjectARB(var0);
            return var10000;
         }

         var10000 = var0;
      }

      var10000 = GL20.glCreateShader(var10000);
      return var10000;
   }

   // $FF: renamed from: a (int, java.nio.ByteBuffer) void
   public static void method_9045(int var0, ByteBuffer var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glShaderSourceARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glShaderSource(var10000, var1);
   }

   // $FF: renamed from: c (int) void
   public static void method_9046(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8571;
      if(var1 != null) {
         if(field_8571) {
            ARBShaderObjects.glCompileShaderARB(var0);
            if(var1 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glCompileShader(var10000);
   }

   // $FF: renamed from: c (int, int) int
   public static int method_9047(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            var10000 = ARBShaderObjects.glGetObjectParameteriARB(var0, var1);
            return var10000;
         }

         var10000 = var0;
      }

      var10000 = GL20.glGetShaderi(var10000, var1);
      return var10000;
   }

   // $FF: renamed from: d (int, int) java.lang.String
   public static String method_9048(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      String var3;
      if(var2 != null) {
         if(field_8571) {
            var3 = ARBShaderObjects.glGetInfoLogARB(var0, var1);
            return var3;
         }

         var10000 = var0;
      }

      var3 = GL20.glGetShaderInfoLog(var10000, var1);
      return var3;
   }

   // $FF: renamed from: e (int, int) java.lang.String
   public static String method_9049(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      String var3;
      if(var2 != null) {
         if(field_8571) {
            var3 = ARBShaderObjects.glGetInfoLogARB(var0, var1);
            return var3;
         }

         var10000 = var0;
      }

      var3 = GL20.glGetProgramInfoLog(var10000, var1);
      return var3;
   }

   // $FF: renamed from: d (int) void
   public static void method_9050(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8571;
      if(var1 != null) {
         if(field_8571) {
            ARBShaderObjects.glUseProgramObjectARB(var0);
            if(var1 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUseProgram(var10000);
   }

   // $FF: renamed from: d () int
   public static int method_9051() {
      String[] var0 = class_752.method_4253();
      int var10000 = field_8571;
      if(var0 != null) {
         var10000 = field_8571?ARBShaderObjects.glCreateProgramObjectARB():GL20.glCreateProgram();
      }

      return var10000;
   }

   // $FF: renamed from: e (int) void
   public static void method_9052(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8571;
      if(var1 != null) {
         if(field_8571) {
            ARBShaderObjects.glDeleteObjectARB(var0);
            if(var1 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glDeleteProgram(var10000);
   }

   // $FF: renamed from: f (int) void
   public static void method_9053(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8571;
      if(var1 != null) {
         if(field_8571) {
            ARBShaderObjects.glLinkProgramARB(var0);
            if(var1 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glLinkProgram(var10000);
   }

   // $FF: renamed from: a (int, java.lang.CharSequence) int
   public static int method_9054(int var0, CharSequence var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            var10000 = ARBShaderObjects.glGetUniformLocationARB(var0, var1);
            return var10000;
         }

         var10000 = var0;
      }

      var10000 = GL20.glGetUniformLocation(var10000, var1);
      return var10000;
   }

   // $FF: renamed from: a (int, java.nio.IntBuffer) void
   public static void method_9055(int var0, IntBuffer var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniform1ARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniform1(var10000, var1);
   }

   // $FF: renamed from: f (int, int) void
   public static void method_9056(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniform1iARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniform1i(var10000, var1);
   }

   // $FF: renamed from: a (int, java.nio.FloatBuffer) void
   public static void method_9057(int var0, FloatBuffer var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniform1ARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniform1(var10000, var1);
   }

   // $FF: renamed from: b (int, java.nio.IntBuffer) void
   public static void method_9058(int var0, IntBuffer var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniform2ARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniform2(var10000, var1);
   }

   // $FF: renamed from: b (int, java.nio.FloatBuffer) void
   public static void method_9059(int var0, FloatBuffer var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniform2ARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniform2(var10000, var1);
   }

   // $FF: renamed from: c (int, java.nio.IntBuffer) void
   public static void method_9060(int var0, IntBuffer var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniform3ARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniform3(var10000, var1);
   }

   // $FF: renamed from: c (int, java.nio.FloatBuffer) void
   public static void method_9061(int var0, FloatBuffer var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniform3ARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniform3(var10000, var1);
   }

   // $FF: renamed from: d (int, java.nio.IntBuffer) void
   public static void method_9062(int var0, IntBuffer var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniform4ARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniform4(var10000, var1);
   }

   // $FF: renamed from: d (int, java.nio.FloatBuffer) void
   public static void method_9063(int var0, FloatBuffer var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniform4ARB(var0, var1);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniform4(var10000, var1);
   }

   // $FF: renamed from: a (int, boolean, java.nio.FloatBuffer) void
   public static void method_9064(int var0, boolean var1, FloatBuffer var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = field_8571;
      if(var3 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniformMatrix2ARB(var0, var1, var2);
            if(var3 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniformMatrix2(var10000, var1, var2);
   }

   // $FF: renamed from: b (int, boolean, java.nio.FloatBuffer) void
   public static void method_9065(int var0, boolean var1, FloatBuffer var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = field_8571;
      if(var3 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniformMatrix3ARB(var0, var1, var2);
            if(var3 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniformMatrix3(var10000, var1, var2);
   }

   // $FF: renamed from: c (int, boolean, java.nio.FloatBuffer) void
   public static void method_9066(int var0, boolean var1, FloatBuffer var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = field_8571;
      if(var3 != null) {
         if(field_8571) {
            ARBShaderObjects.glUniformMatrix4ARB(var0, var1, var2);
            if(var3 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL20.glUniformMatrix4(var10000, var1, var2);
   }

   // $FF: renamed from: b (int, java.lang.CharSequence) int
   public static int method_9067(int var0, CharSequence var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8571;
      if(var2 != null) {
         if(field_8571) {
            var10000 = ARBVertexShader.glGetAttribLocationARB(var0, var1);
            return var10000;
         }

         var10000 = var0;
      }

      var10000 = GL20.glGetAttribLocation(var10000, var1);
      return var10000;
   }

   // $FF: renamed from: g (int, int) void
   public static void method_9068(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8569;
      if(var2 != null) {
         if(!field_8569) {
            return;
         }

         var10000 = field_8568;
      }

      label28: {
         label27: {
            if(var2 != null) {
               switch(var10000) {
               case 0:
                  var10000 = var0;
                  break;
               case 1:
                  break label27;
               case 2:
                  break label28;
               default:
                  return;
               }
            }

            GL30.glBindFramebuffer(var10000, var1);
            if(var2 != null) {
               return;
            }
         }

         ARBFramebufferObject.glBindFramebuffer(var0, var1);
         if(var2 != null) {
            return;
         }
      }

      EXTFramebufferObject.glBindFramebufferEXT(var0, var1);
   }

   // $FF: renamed from: h (int, int) void
   public static void method_9069(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = field_8569;
      if(var2 != null) {
         if(!field_8569) {
            return;
         }

         var10000 = field_8568;
      }

      label28: {
         label27: {
            if(var2 != null) {
               switch(var10000) {
               case 0:
                  var10000 = var0;
                  break;
               case 1:
                  break label27;
               case 2:
                  break label28;
               default:
                  return;
               }
            }

            GL30.glBindRenderbuffer(var10000, var1);
            if(var2 != null) {
               return;
            }
         }

         ARBFramebufferObject.glBindRenderbuffer(var0, var1);
         if(var2 != null) {
            return;
         }
      }

      EXTFramebufferObject.glBindRenderbufferEXT(var0, var1);
   }

   // $FF: renamed from: g (int) void
   public static void method_9070(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8569;
      if(var1 != null) {
         if(!field_8569) {
            return;
         }

         var10000 = field_8568;
      }

      label28: {
         label27: {
            if(var1 != null) {
               switch(var10000) {
               case 0:
                  var10000 = var0;
                  break;
               case 1:
                  break label27;
               case 2:
                  break label28;
               default:
                  return;
               }
            }

            GL30.glDeleteRenderbuffers(var10000);
            if(var1 != null) {
               return;
            }
         }

         ARBFramebufferObject.glDeleteRenderbuffers(var0);
         if(var1 != null) {
            return;
         }
      }

      EXTFramebufferObject.glDeleteRenderbuffersEXT(var0);
   }

   // $FF: renamed from: h (int) void
   public static void method_9071(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8569;
      if(var1 != null) {
         if(!field_8569) {
            return;
         }

         var10000 = field_8568;
      }

      label28: {
         label27: {
            if(var1 != null) {
               switch(var10000) {
               case 0:
                  var10000 = var0;
                  break;
               case 1:
                  break label27;
               case 2:
                  break label28;
               default:
                  return;
               }
            }

            GL30.glDeleteFramebuffers(var10000);
            if(var1 != null) {
               return;
            }
         }

         ARBFramebufferObject.glDeleteFramebuffers(var0);
         if(var1 != null) {
            return;
         }
      }

      EXTFramebufferObject.glDeleteFramebuffersEXT(var0);
   }

   // $FF: renamed from: e () int
   public static int method_9072() {
      String[] var0 = class_752.method_4253();
      int var10000 = field_8569;
      if(var0 != null) {
         if(!field_8569) {
            return -1;
         }

         var10000 = field_8568;
      }

      if(var0 != null) {
         switch(var10000) {
         case 0:
            return GL30.glGenFramebuffers();
         case 1:
            return ARBFramebufferObject.glGenFramebuffers();
         case 2:
            return EXTFramebufferObject.glGenFramebuffersEXT();
         default:
            var10000 = -1;
         }
      }

      return var10000;
   }

   // $FF: renamed from: f () int
   public static int method_9073() {
      String[] var0 = class_752.method_4253();
      int var10000 = field_8569;
      if(var0 != null) {
         if(!field_8569) {
            return -1;
         }

         var10000 = field_8568;
      }

      if(var0 != null) {
         switch(var10000) {
         case 0:
            return GL30.glGenRenderbuffers();
         case 1:
            return ARBFramebufferObject.glGenRenderbuffers();
         case 2:
            return EXTFramebufferObject.glGenRenderbuffersEXT();
         default:
            var10000 = -1;
         }
      }

      return var10000;
   }

   // $FF: renamed from: a (int, int, int, int) void
   public static void method_9074(int var0, int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = field_8569;
      if(var4 != null) {
         if(!field_8569) {
            return;
         }

         var10000 = field_8568;
      }

      label28: {
         label27: {
            if(var4 != null) {
               switch(var10000) {
               case 0:
                  var10000 = var0;
                  break;
               case 1:
                  break label27;
               case 2:
                  break label28;
               default:
                  return;
               }
            }

            GL30.glRenderbufferStorage(var10000, var1, var2, var3);
            if(var4 != null) {
               return;
            }
         }

         ARBFramebufferObject.glRenderbufferStorage(var0, var1, var2, var3);
         if(var4 != null) {
            return;
         }
      }

      EXTFramebufferObject.glRenderbufferStorageEXT(var0, var1, var2, var3);
   }

   // $FF: renamed from: b (int, int, int, int) void
   public static void method_9075(int var0, int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = field_8569;
      if(var4 != null) {
         if(!field_8569) {
            return;
         }

         var10000 = field_8568;
      }

      label28: {
         label27: {
            if(var4 != null) {
               switch(var10000) {
               case 0:
                  var10000 = var0;
                  break;
               case 1:
                  break label27;
               case 2:
                  break label28;
               default:
                  return;
               }
            }

            GL30.glFramebufferRenderbuffer(var10000, var1, var2, var3);
            if(var4 != null) {
               return;
            }
         }

         ARBFramebufferObject.glFramebufferRenderbuffer(var0, var1, var2, var3);
         if(var4 != null) {
            return;
         }
      }

      EXTFramebufferObject.glFramebufferRenderbufferEXT(var0, var1, var2, var3);
   }

   // $FF: renamed from: i (int) int
   public static int method_9076(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8569;
      if(var1 != null) {
         if(!field_8569) {
            return -1;
         }

         var10000 = field_8568;
      }

      if(var1 != null) {
         switch(var10000) {
         case 0:
            return GL30.glCheckFramebufferStatus(var0);
         case 1:
            return ARBFramebufferObject.glCheckFramebufferStatus(var0);
         case 2:
            return EXTFramebufferObject.glCheckFramebufferStatusEXT(var0);
         default:
            var10000 = -1;
         }
      }

      return var10000;
   }

   // $FF: renamed from: a (int, int, int, int, int) void
   public static void method_9077(int var0, int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = field_8569;
      if(var5 != null) {
         if(!field_8569) {
            return;
         }

         var10000 = field_8568;
      }

      label28: {
         label27: {
            if(var5 != null) {
               switch(var10000) {
               case 0:
                  var10000 = var0;
                  break;
               case 1:
                  break label27;
               case 2:
                  break label28;
               default:
                  return;
               }
            }

            GL30.glFramebufferTexture2D(var10000, var1, var2, var3, var4);
            if(var5 != null) {
               return;
            }
         }

         ARBFramebufferObject.glFramebufferTexture2D(var0, var1, var2, var3, var4);
         if(var5 != null) {
            return;
         }
      }

      EXTFramebufferObject.glFramebufferTexture2DEXT(var0, var1, var2, var3, var4);
   }

   // $FF: renamed from: j (int) void
   public static void method_9078(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8578;
      if(var1 != null) {
         if(field_8578) {
            ARBMultitexture.glActiveTextureARB(var0);
            if(var1 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL13.glActiveTexture(var10000);
   }

   // $FF: renamed from: k (int) void
   public static void method_9079(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = field_8578;
      if(var1 != null) {
         if(field_8578) {
            ARBMultitexture.glClientActiveTextureARB(var0);
            if(var1 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL13.glClientActiveTexture(var10000);
   }

   // $FF: renamed from: a (int, float, float) void
   public static void method_9080(int var0, float var1, float var2) {
      label19: {
         String[] var3 = class_752.method_4253();
         int var10000 = field_8578;
         if(var3 != null) {
            if(field_8578) {
               ARBMultitexture.glMultiTexCoord2fARB(var0, var1, var2);
               if(var3 != null) {
                  break label19;
               }
            }

            var10000 = var0;
         }

         GL13.glMultiTexCoord2f(var10000, var1, var2);
      }

      if(var0 == field_8557) {
         lastBrightnessX = var1;
         lastBrightnessY = var2;
      }

   }

   // $FF: renamed from: c (int, int, int, int) void
   public static void method_9081(int var0, int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = field_8579;
      if(var4 != null) {
         if(field_8579) {
            var10000 = field_8580;
            if(var4 != null) {
               if(field_8580) {
                  EXTBlendFuncSeparate.glBlendFuncSeparateEXT(var0, var1, var2, var3);
                  if(var4 != null) {
                     return;
                  }
               }

               var10000 = var0;
            }

            GL14.glBlendFuncSeparate(var10000, var1, var2, var3);
            if(var4 != null) {
               return;
            }
         }

         var10000 = var0;
      }

      GL11.glBlendFunc(var10000, var1);
   }

   // $FF: renamed from: g () boolean
   public static boolean method_9082() {
      boolean var10000;
      label24: {
         String[] var0 = class_752.method_4253();
         var10000 = field_8569;
         if(var0 != null) {
            if(!field_8569) {
               break label24;
            }

            var10000 = bao.method_5273().canLoseFocus7.field_4491;
         }

         if(var0 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9083() {
      // $FF: Couldn't be decompiled
   }
}

package com.mojang.util;

import com.mojang.util.UUIDTypeAdapter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.apache.logging.log4j.core.pattern.RegexReplacement;

public class QueueLogAppender extends AbstractAppender {

   private static final int MAX_CAPACITY = 250;
   private static final Map<String, BlockingQueue<String>> QUEUES;
   private static final ReadWriteLock QUEUE_LOCK;
   private final BlockingQueue<String> queue;
   // $FF: renamed from: h java.lang.String
   private static final String field_2643 = "No name provided for QueueLogAppender";


   // $FF: renamed from: <init> (java.lang.String, org.apache.logging.log4j.core.Filter, org.apache.logging.log4j.core.Layout, boolean, java.util.concurrent.BlockingQueue) void
   public void method_3349(String var1, Filter var2, Layout<? extends Serializable> var3, boolean var4, BlockingQueue<String> var5) {
      super(var1, var2, var3, var4);
      this.queue = var5;
   }

   public void append(LogEvent var1) {
      class_689[] var2 = UUIDTypeAdapter.method_3220();
      int var10000 = this.queue.size();
      if(var2 == null) {
         if(var10000 >= 250) {
            this.queue.clear();
         }

         this.queue.add(this.getLayout().toSerializable(var1).toString());
      }

      if(var2 != null) {
         int var3 = class_689.method_3976();
         ++var3;
         class_689.method_3975(var3);
      }

   }

   public static QueueLogAppender createAppender(String var0, String var1, Layout<? extends Serializable> var2, Filter var3, String var4) {
      class_689[] var10000 = UUIDTypeAdapter.method_3220();
      boolean var6 = Boolean.parseBoolean(var1);
      class_689[] var5 = var10000;
      Object var8 = var0;
      if(var5 == null) {
         if(var0 == null) {
            LOGGER.error("No name provided for QueueLogAppender");
            return null;
         }

         var8 = var4;
      }

      if(var5 == null) {
         if(var8 == null) {
            var4 = var0;
         }

         QUEUE_LOCK.writeLock().lock();
         var8 = QUEUES.get(var4);
      }

      Object var7 = (BlockingQueue)var8;
      if(var5 == null) {
         if(var7 == null) {
            var7 = new LinkedBlockingQueue();
            QUEUES.put(var4, var7);
         }

         QUEUE_LOCK.writeLock().unlock();
      }

      if(var2 == null) {
         var2 = PatternLayout.createLayout((String)null, (Configuration)null, (RegexReplacement)null, (String)null, (String)null);
      }

      QueueLogAppender var9 = new QueueLogAppender;
      var9.method_3349(var0, var3, (Layout)var2, var6, (BlockingQueue)var7);
      if(class_689.method_3977() == 0) {
         UUIDTypeAdapter.method_3219(new class_689[2]);
      }

      return var9;
   }

   public static String getNextLogEvent(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_3350() {
      boolean var10000 = true;
      char[] var10003 = "\n<11d#D0&!79?[&S*5¹#F/5!!".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2643 = (new String((char[])var3)).intern();
            QUEUES = new HashMap();
            QUEUE_LOCK = new ReentrantReadWriteLock();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 225;
            break;
         case 1:
            var10009 = 246;
            break;
         case 2:
            var10009 = 147;
            break;
         case 3:
            var10009 = 250;
            break;
         case 4:
            var10009 = 245;
            break;
         case 5:
            var10009 = 80;
            break;
         default:
            var10009 = 222;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }

   // $FF: renamed from: b (java.lang.InterruptedException) java.lang.InterruptedException
   private static InterruptedException method_3351(InterruptedException var0) {
      return var0;
   }
}

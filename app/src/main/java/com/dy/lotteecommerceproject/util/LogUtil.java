package com.dy.lotteecommerceproject.util;

import android.annotation.SuppressLint;
import android.os.Debug;
import android.util.Log;

public class LogUtil {
//	private static final boolean DEBUG = BuildConfig.DEBUG;
	private static final boolean DEBUG = true;
	private static final String TAG = "[lotte_e_commerce_project]";
	

	@SuppressLint("LongLogTag")
	public static void v(String message)
	{
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();

			String logText = "[" + tag +"] " + methodName+ "()" + "[" + lineNumber +"]" + " >> " + message;

			Log.v(TAG, logText);


		}
	}

	public static void v(String t, String message)
	{
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();

			String logText = "[" + tag +"] " + methodName+ "()" + "[" + lineNumber +"]" + " >> " + message;

			Log.v(t, logText);


		}
	}
	
	public static void i(String message)
	{
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();
				
			String logText = "[" + tag +"] " + methodName+ "()" + "[" + lineNumber +"]" + " >> " + message;
			
			Log.i(TAG, logText);
			
		}
	}

	public static void i(String t, String message)
	{
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();

			String logText = "[" + tag +"] " + methodName+ "()" + "[" + lineNumber +"]" + " >> " + message;

			Log.i(t, logText);

		}
	}
	
	public static void d(String message)
	{
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();
				
			String logText = "[" + tag +"] " + methodName+ "()" + "[" + lineNumber +"]" + " >> " + message;
				
			Log.d(TAG, logText);
			
		}
	}

	public static void d(String t, String message)
	{
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();

			String logText = "[" + tag +"] " + methodName+ "()" + "[" + lineNumber +"]" + " >> " + message;

			Log.d(t, logText);

		}
	}
	
	public static void w(String message)
	{
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();
				
			String logText = "[" + tag +"] " + methodName+ "()" + "[" + lineNumber +"]" + " >> " + message;
				
			Log.w(TAG, logText);
			
		}
	}

	public static void w(String t, String message)
	{
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();

			String logText = "[" + tag +"] " + methodName+ "()" + "[" + lineNumber +"]" + " >> " + message;

			Log.w(t, logText);

		}
	}

	public static void e(String message)
	{
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();
				
			String logText = "[" + tag +"] " + methodName+ "()" + "[" + lineNumber +"]" + " >> " + message;
				
			Log.e(TAG, logText);
			
		}
	}

	public static void e(String t, String message)
	{
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();

			String logText = "[" + tag +"] " + methodName+ "()" + "[" + lineNumber +"]" + " >> " + message;

			Log.e(t, logText);

		}
	}
	
	public static void debugNativeHeap(){
		if (DEBUG){
			String tag = "";
			String temp = new Throwable().getStackTrace()[1].getClassName();
			if(temp != null){
				int lastDotPos = temp.lastIndexOf(".");
				tag = temp.substring(lastDotPos + 1);
			}
			String methodName = new Throwable().getStackTrace()[1].getMethodName();
			int lineNumber = new Throwable().getStackTrace()[1].getLineNumber();
				
			Log.i(TAG, "[" + tag + "] " + methodName + "()" + "[" + lineNumber + "]" + " >> "
                    + "NativeHeapSize=" + Debug.getNativeHeapSize()
                    + " NativeHeapFreeSize=" + Debug.getNativeHeapFreeSize()
                    + " NativeHeapAllocatedSize()=" + Debug.getNativeHeapAllocatedSize());
		}
	}
}

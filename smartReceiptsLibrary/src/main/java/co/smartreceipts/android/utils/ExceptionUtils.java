package co.smartreceipts.android.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;

import com.google.common.base.Preconditions;

public class ExceptionUtils {

	/**
	 * Generates a stack trace for a given exception.
	 * 
	 * @param throwable a {@link Throwable} to get the stack trace from
	 * @return - the {@link String} containing the trace
	 */
	public static String getStackTrace(@NonNull Throwable throwable) {
		final StringWriter sw = new StringWriter();
		final PrintWriter pw = new PrintWriter(sw);
		throwable.printStackTrace(pw);
		return sw.toString();
	}

}
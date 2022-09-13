package com.lqq.easyutil;

import android.content.Context;
import android.widget.Toast;

/**
 * @description:
 * @author: lqq
 * @date: 2022/9/13
 */
public class EasyToast {
    /**
     * Toast
     */
    public static void show(final Context context, final CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    /**
     * LongToast
     */
    public static void showLong(final Context context, final CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}

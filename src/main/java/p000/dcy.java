package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.accessibility.AccessibilityManager;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;

/* renamed from: dcy */
/* compiled from: PG */
public final class dcy {
    /* renamed from: a */
    public static boolean m6190a(int i) {
        switch (i) {
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m6188a(HorizontalGridView horizontalGridView) {
        horizontalGridView.mo5613g(1);
        horizontalGridView.mo5609a(0.0f);
        horizontalGridView.mo5615h(horizontalGridView.getContext().getResources().getDimensionPixelSize(R.dimen.channel_items_list_padding_start));
        horizontalGridView.mo5626t();
    }

    /* renamed from: e */
    public static SparseArray m6196e(Context context) {
        SparseArray sparseArray = new SparseArray();
        Resources resources = context.getResources();
        ctk ctk = new ctk();
        ctk.f7362a = resources.getDimensionPixelSize(R.dimen.program_default_height);
        ctk.f7363b = resources.getDimensionPixelSize(R.dimen.program_selected_margin_vertical);
        ctk.f7364c = resources.getDimensionPixelSize(R.dimen.program_selected_margin_vertical);
        ctk.f7365d = resources.getDimensionPixelSize(R.dimen.channel_selected_margin_top);
        ctk.f7366e = resources.getDimensionPixelSize(R.dimen.channel_selected_margin_bottom);
        ctk.f7367f = resources.getDimensionPixelSize(R.dimen.channel_logo_selected_alignment_origin_margin);
        ctk.f7368g = resources.getDimensionPixelSize(R.dimen.channel_logo_size);
        ctk.f7369h = resources.getDimensionPixelSize(R.dimen.channel_logo_size);
        ctk.f7370i = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_start);
        ctk.f7371j = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_end);
        ctk.f7374m = resources.getDimensionPixelSize(R.dimen.channel_items_title_selected_margin_bottom);
        ctk.f7375n = resources.getDimensionPixelSize(R.dimen.empty_channel_message_selected_margin_top);
        ctl a = ctk.mo3737a();
        sparseArray.put(0, a);
        sparseArray.put(18, a);
        sparseArray.put(25, a);
        ctl ctl = new ctl(a);
        ctl.f7388m = resources.getDimensionPixelSize(R.dimen.channel_items_title_default_above_selected_last_row_margin_top);
        ctl.f7389n = resources.getDimensionPixelSize(R.dimen.channel_items_title_default_above_selected_last_row_margin_bottom);
        sparseArray.put(17, ctl);
        sparseArray.put(32, ctl);
        ctk ctk2 = new ctk();
        ctk2.f7362a = resources.getDimensionPixelSize(R.dimen.program_default_height);
        ctk2.f7363b = resources.getDimensionPixelSize(R.dimen.program_default_margin_top);
        ctk2.f7364c = resources.getDimensionPixelSize(R.dimen.program_default_margin_bottom);
        ctk2.f7367f = resources.getDimensionPixelSize(R.dimen.channel_logo_alignment_origin_margin);
        ctk2.f7368g = resources.getDimensionPixelSize(R.dimen.channel_logo_size);
        ctk2.f7369h = resources.getDimensionPixelSize(R.dimen.channel_logo_size);
        ctk2.f7370i = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_start);
        ctk2.f7371j = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_end);
        ctk2.f7374m = resources.getDimensionPixelSize(R.dimen.channel_items_title_default_margin_bottom);
        ctk2.f7375n = resources.getDimensionPixelSize(R.dimen.empty_channel_message_default_margin_top);
        ctl a2 = ctk2.mo3737a();
        sparseArray.put(1, a2);
        sparseArray.put(19, a2);
        sparseArray.put(26, a2);
        ctl ctl2 = new ctl(a2);
        ctl2.f7377b = resources.getDimensionPixelSize(R.dimen.program_fast_scrolling_margin_vertical);
        ctl2.f7378c = resources.getDimensionPixelSize(R.dimen.program_fast_scrolling_margin_vertical);
        ctl2.f7381f = resources.getDimensionPixelSize(R.dimen.channel_logo_fast_scrolling_alignment_origin_margin);
        sparseArray.put(8, ctl2);
        sparseArray.put(9, ctl2);
        ctl ctl3 = new ctl(a2);
        ctl3.f7376a = resources.getDimensionPixelSize(R.dimen.program_default_top_height);
        ctl3.f7377b = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_top);
        ctl3.f7378c = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
        sparseArray.put(7, ctl3);
        sparseArray.put(24, ctl3);
        ctl ctl4 = new ctl(ctl3);
        ctl4.f7378c = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
        sparseArray.put(4, ctl4);
        sparseArray.put(5, ctl4);
        sparseArray.put(22, ctl4);
        sparseArray.put(23, ctl4);
        ctl ctl5 = new ctl(a2);
        ctl5.f7376a = resources.getDimensionPixelSize(R.dimen.program_default_height);
        ctl5.f7381f = resources.getDimensionPixelSize(R.dimen.channel_logo_above_selected_alignment_origin_margin);
        ctl5.f7390o = resources.getDimensionPixelSize(R.dimen.empty_channel_message_above_selected_margin_top);
        sparseArray.put(2, ctl5);
        sparseArray.put(20, ctl5);
        ctl ctl6 = new ctl(ctl5);
        ctl6.f7381f = resources.getDimensionPixelSize(R.dimen.channel_logo_below_selected_alignment_origin_margin);
        ctl6.f7390o = resources.getDimensionPixelSize(R.dimen.empty_channel_message_below_selected_margin_top);
        ctl6.f7389n = resources.getDimensionPixelSize(R.dimen.channel_items_title_below_selected_margin_bottom);
        sparseArray.put(3, ctl6);
        sparseArray.put(21, ctl6);
        ctk ctk3 = new ctk();
        ctk3.f7362a = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_height);
        ctk3.f7363b = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_vertical);
        ctk3.f7364c = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_vertical);
        ctk3.f7366e = resources.getDimensionPixelSize(R.dimen.channel_zoomed_out_margin_bottom);
        ctk3.f7368g = resources.getDimensionPixelSize(R.dimen.channel_logo_selected_size);
        ctk3.f7369h = resources.getDimensionPixelSize(R.dimen.channel_logo_selected_size);
        ctk3.f7370i = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_selected_margin);
        ctk3.f7371j = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_selected_margin);
        ctk3.f7374m = resources.getDimensionPixelSize(R.dimen.channel_items_title_default_margin_bottom);
        ctk3.f7375n = resources.getDimensionPixelSize(R.dimen.empty_channel_message_zoomed_out_margin_top);
        ctl a3 = ctk3.mo3737a();
        sparseArray.put(10, a3);
        sparseArray.put(27, a3);
        ctl ctl7 = new ctl(a3);
        ctl7.f7382g = resources.getDimensionPixelSize(R.dimen.channel_action_button_size);
        ctl7.f7383h = resources.getDimensionPixelSize(R.dimen.channel_action_button_size);
        ctl7.f7384i = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
        ctl7.f7385j = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
        sparseArray.put(11, ctl7);
        sparseArray.put(12, ctl7);
        sparseArray.put(13, ctl7);
        sparseArray.put(14, ctl7);
        sparseArray.put(15, ctl7);
        sparseArray.put(16, ctl7);
        sparseArray.put(28, ctl7);
        sparseArray.put(29, ctl7);
        sparseArray.put(30, ctl7);
        sparseArray.put(31, ctl7);
        return sparseArray;
    }

    /* renamed from: a */
    public static boolean m6189a() {
        if (Build.TYPE.equals("unknown")) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: d */
    public static boolean m6195d(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("enable_animations", true);
    }

    /* renamed from: a */
    public static void m6187a(Activity activity) {
        if (activity.getApplicationInfo().targetSdkVersion < 27 || Build.VERSION.SDK_INT != 26) {
            activity.setRequestedOrientation(0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* renamed from: a */
    public static float m6184a(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    /* renamed from: a */
    public static Uri m6185a(String str) {
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m6193b(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        if (accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        return !accessibilityManager.getEnabledAccessibilityServiceList(16).isEmpty();
    }

    /* renamed from: a */
    public static boolean m6192a(Context context, String str) {
        return TextUtils.equals(context.getApplicationContext().getPackageName(), str) || dej.m6249a(context, str);
    }

    /* renamed from: a */
    public static boolean m6191a(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: c */
    public static boolean m6194c(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return false;
            }
        }
        if (context instanceof ContextThemeWrapper) {
            return m6194c(((ContextThemeWrapper) context).getBaseContext());
        }
        return true;
    }

    /* renamed from: a */
    public static CharSequence m6186a(CharSequence charSequence) {
        return charSequence instanceof String ? ((String) charSequence).trim() : charSequence;
    }
}

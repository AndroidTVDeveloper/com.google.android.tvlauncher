package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.google.android.tvlauncher.R;

/* renamed from: gz */
/* compiled from: PG */
final class C0190gz implements C0288kp {

    /* renamed from: a */
    public final int[] f9442a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b */
    public final int[] f9443b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c */
    public final int[] f9444c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};

    /* renamed from: d */
    public final int[] f9445d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e */
    public final int[] f9446e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f */
    public final int[] f9447f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    /* renamed from: a */
    public static final boolean m7475a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final ColorStateList m7473a(Context context, int i) {
        int a = C0294kv.m7859a(context, R.attr.colorControlHighlight);
        int c = C0294kv.m7861c(context, R.attr.colorButtonNormal);
        return new ColorStateList(new int[][]{C0294kv.f9822a, C0294kv.f9824c, C0294kv.f9823b, C0294kv.f9826e}, new int[]{c, C0032bd.m2859a(a, i), C0032bd.m2859a(a, i), i});
    }

    /* renamed from: a */
    public static final void m7474a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0220ib.m7561b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0192ha.f9450a;
        }
        drawable.setColorFilter(C0192ha.m7477a(i, mode));
    }
}

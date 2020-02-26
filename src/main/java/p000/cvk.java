package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;
import java.util.Locale;

/* renamed from: cvk */
/* compiled from: PG */
final class cvk extends Preference {

    /* renamed from: D */
    private final String f7661D;

    /* renamed from: E */
    private final String f7662E;

    /* renamed from: F */
    private final View.OnFocusChangeListener f7663F = new cvi(this);

    /* renamed from: G */
    private final cvj f7664G;

    /* renamed from: H */
    private final int f7665H;

    /* renamed from: I */
    private final int f7666I;

    /* renamed from: J */
    private final int f7667J;

    /* renamed from: K */
    private final ColorStateList f7668K;

    /* renamed from: L */
    private final ColorStateList f7669L;

    /* renamed from: M */
    private final int f7670M;

    /* renamed from: N */
    private final ColorStateList f7671N;

    /* renamed from: O */
    private final ColorStateList f7672O;

    /* renamed from: P */
    private final Drawable f7673P;

    /* renamed from: Q */
    private final Drawable f7674Q;

    /* renamed from: R */
    private ImageView f7675R;

    /* renamed from: S */
    private TextView f7676S;

    /* renamed from: T */
    private TextView f7677T;

    /* renamed from: U */
    private final agj f7678U;

    /* renamed from: a */
    public int f7679a;

    /* renamed from: b */
    public boolean f7680b;

    /* renamed from: c */
    public Uri f7681c;

    /* renamed from: d */
    public Uri f7682d;

    /* renamed from: e */
    private final int f7683e;

    /* renamed from: f */
    private final int f7684f;

    /* renamed from: g */
    private final int f7685g;

    /* renamed from: h */
    private final String f7686h;

    /* renamed from: i */
    private final String f7687i;

    public cvk(Context context, cvj cvj) {
        super(context);
        this.f1371y = R.layout.input_preference;
        this.f7664G = cvj;
        this.f7683e = context.getColor(R.color.input_label_default_text_color);
        this.f7684f = context.getColor(R.color.input_parent_label_default_text_color);
        this.f7685g = context.getColor(R.color.input_label_disconnected_text_color);
        this.f7686h = context.getString(R.string.input_state_connected);
        this.f7687i = context.getString(R.string.input_state_standby);
        this.f7661D = context.getString(R.string.input_state_disconnected);
        this.f7662E = context.getString(R.string.input_name_and_input_status);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.input_icon_view_size);
        this.f7678U = new agj((byte) 0).mo192a(dimensionPixelSize, dimensionPixelSize).mo207d();
        this.f7665H = context.getResources().getDimensionPixelOffset(R.dimen.input_modified_icon_view_padding);
        context.getColor(R.color.input_icon_active_tint);
        context.getColor(R.color.input_icon_active_selected_tint);
        context.getColorStateList(R.color.input_icon_background_active_tint);
        this.f7666I = context.getColor(R.color.input_icon_tint);
        this.f7667J = context.getColor(R.color.input_icon_selected_tint);
        this.f7668K = context.getColorStateList(R.color.input_icon_background_tint);
        this.f7669L = context.getColorStateList(R.color.input_icon_background_selected_tint);
        this.f7670M = context.getColor(R.color.input_icon_disconnected_tint);
        this.f7671N = context.getColorStateList(R.color.input_icon_background_disconnected_tint);
        this.f7672O = context.getColorStateList(R.color.input_icon_background_disconnected_selected_tint);
        this.f7673P = context.getDrawable(R.drawable.filled_circle_input_background_black);
        this.f7674Q = context.getDrawable(R.drawable.hollow_circle_input_background_black);
    }

    /* renamed from: a */
    public final void mo1069a(C0473rl rlVar) {
        super.mo1069a(rlVar);
        if (this.f7675R == null) {
            this.f7675R = (ImageView) rlVar.mo5812c(16908294);
        }
        if (this.f7676S == null) {
            this.f7676S = (TextView) rlVar.mo5812c(16908310);
        }
        if (this.f7677T == null) {
            this.f7677T = (TextView) rlVar.mo5812c(16908304);
        }
        View view = rlVar.f9783a;
        mo3823a(view, view.hasFocus());
        rlVar.f9783a.setOnFocusChangeListener(this.f7663F);
    }

    /* renamed from: a */
    public final void mo3823a(View view, boolean z) {
        String str;
        cvj cvj;
        int i;
        Drawable drawable;
        ColorStateList colorStateList;
        Drawable drawable2;
        ColorStateList colorStateList2;
        int i2 = this.f7679a;
        if (i2 == 0) {
            this.f7676S.setTextColor(this.f7683e);
            this.f7677T.setTextColor(this.f7684f);
        } else if (i2 == 1 || i2 == 2) {
            this.f7676S.setTextColor(this.f7685g);
            this.f7677T.setTextColor(this.f7685g);
        }
        if (this.f7680b) {
            ImageView imageView = this.f7675R;
            int i3 = this.f7665H;
            imageView.setPadding(i3, i3, i3, i3);
            int i4 = this.f7679a;
            if (i4 == 0 || i4 == 1) {
                ImageView imageView2 = this.f7675R;
                if (!z) {
                    i = this.f7666I;
                } else {
                    i = this.f7667J;
                }
                imageView2.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                ImageView imageView3 = this.f7675R;
                if (!z) {
                    drawable = this.f7673P;
                } else {
                    drawable = this.f7674Q;
                }
                imageView3.setBackground(drawable);
                ImageView imageView4 = this.f7675R;
                if (!z) {
                    colorStateList = this.f7668K;
                } else {
                    colorStateList = this.f7669L;
                }
                imageView4.setBackgroundTintList(colorStateList);
            } else if (i4 == 2) {
                this.f7675R.setColorFilter(this.f7670M, PorterDuff.Mode.SRC_IN);
                ImageView imageView5 = this.f7675R;
                if (!z) {
                    drawable2 = this.f7673P;
                } else {
                    drawable2 = this.f7674Q;
                }
                imageView5.setBackground(drawable2);
                ImageView imageView6 = this.f7675R;
                if (!z) {
                    colorStateList2 = this.f7671N;
                } else {
                    colorStateList2 = this.f7672O;
                }
                imageView6.setBackgroundTintList(colorStateList2);
            }
        } else {
            this.f7675R.setPadding(0, 0, 0, 0);
        }
        int i5 = this.f7679a;
        if (i5 != 0) {
            str = i5 != 1 ? i5 != 2 ? null : this.f7661D : this.f7687i;
        } else {
            str = this.f7686h;
        }
        this.f7676S.setContentDescription(String.format(Locale.getDefault(), this.f7662E, this.f7676S.getText(), str));
        if (this.f7681c != null) {
            this.f7675R.setVisibility(0);
            Uri uri = !z ? this.f7681c : this.f7682d;
            Context context = view.getContext();
            if (dcy.m6194c(context)) {
                C0497si.m8296c(context).mo5942a(uri).mo202b(this.f7678U).mo5938a(this.f7675R);
            }
        }
        if (z && (cvj = this.f7664G) != null) {
            String str2 = this.f1365s;
            cvv cvv = ((cvs) cvj).f7698a;
            if (!TextUtils.equals(cvv.f7701i, str2)) {
                cvv.f7701i = str2;
                cvv.mo3839f();
            }
        }
    }
}

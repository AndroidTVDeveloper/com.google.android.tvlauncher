package defpackage;

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

/* renamed from: cvk  reason: default package */
/* compiled from: PG */
final class cvk extends Preference {
    private final String D;
    private final String E;
    private final View.OnFocusChangeListener F = new cvi(this);
    private final cvj G;
    private final int H;
    private final int I;
    private final int J;
    private final ColorStateList K;
    private final ColorStateList L;
    private final int M;
    private final ColorStateList N;
    private final ColorStateList O;
    private final Drawable P;
    private final Drawable Q;
    private ImageView R;
    private TextView S;
    private TextView T;
    private final agj U;
    public int a;
    public boolean b;
    public Uri c;
    public Uri d;
    private final int e;
    private final int f;
    private final int g;
    private final String h;
    private final String i;

    public cvk(Context context, cvj cvj) {
        super(context);
        this.y = R.layout.input_preference;
        this.G = cvj;
        this.e = context.getColor(R.color.input_label_default_text_color);
        this.f = context.getColor(R.color.input_parent_label_default_text_color);
        this.g = context.getColor(R.color.input_label_disconnected_text_color);
        this.h = context.getString(R.string.input_state_connected);
        this.i = context.getString(R.string.input_state_standby);
        this.D = context.getString(R.string.input_state_disconnected);
        this.E = context.getString(R.string.input_name_and_input_status);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.input_icon_view_size);
        this.U = new agj((byte) 0).a(dimensionPixelSize, dimensionPixelSize).d();
        this.H = context.getResources().getDimensionPixelOffset(R.dimen.input_modified_icon_view_padding);
        context.getColor(R.color.input_icon_active_tint);
        context.getColor(R.color.input_icon_active_selected_tint);
        context.getColorStateList(R.color.input_icon_background_active_tint);
        this.I = context.getColor(R.color.input_icon_tint);
        this.J = context.getColor(R.color.input_icon_selected_tint);
        this.K = context.getColorStateList(R.color.input_icon_background_tint);
        this.L = context.getColorStateList(R.color.input_icon_background_selected_tint);
        this.M = context.getColor(R.color.input_icon_disconnected_tint);
        this.N = context.getColorStateList(R.color.input_icon_background_disconnected_tint);
        this.O = context.getColorStateList(R.color.input_icon_background_disconnected_selected_tint);
        this.P = context.getDrawable(R.drawable.filled_circle_input_background_black);
        this.Q = context.getDrawable(R.drawable.hollow_circle_input_background_black);
    }

    public final void a(rl rlVar) {
        super.a(rlVar);
        if (this.R == null) {
            this.R = (ImageView) rlVar.c(16908294);
        }
        if (this.S == null) {
            this.S = (TextView) rlVar.c(16908310);
        }
        if (this.T == null) {
            this.T = (TextView) rlVar.c(16908304);
        }
        View view = rlVar.a;
        a(view, view.hasFocus());
        rlVar.a.setOnFocusChangeListener(this.F);
    }

    public final void a(View view, boolean z) {
        String str;
        cvj cvj;
        int i2;
        Drawable drawable;
        ColorStateList colorStateList;
        Drawable drawable2;
        ColorStateList colorStateList2;
        int i3 = this.a;
        if (i3 == 0) {
            this.S.setTextColor(this.e);
            this.T.setTextColor(this.f);
        } else if (i3 == 1 || i3 == 2) {
            this.S.setTextColor(this.g);
            this.T.setTextColor(this.g);
        }
        if (this.b) {
            ImageView imageView = this.R;
            int i4 = this.H;
            imageView.setPadding(i4, i4, i4, i4);
            int i5 = this.a;
            if (i5 == 0 || i5 == 1) {
                ImageView imageView2 = this.R;
                if (!z) {
                    i2 = this.I;
                } else {
                    i2 = this.J;
                }
                imageView2.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                ImageView imageView3 = this.R;
                if (!z) {
                    drawable = this.P;
                } else {
                    drawable = this.Q;
                }
                imageView3.setBackground(drawable);
                ImageView imageView4 = this.R;
                if (!z) {
                    colorStateList = this.K;
                } else {
                    colorStateList = this.L;
                }
                imageView4.setBackgroundTintList(colorStateList);
            } else if (i5 == 2) {
                this.R.setColorFilter(this.M, PorterDuff.Mode.SRC_IN);
                ImageView imageView5 = this.R;
                if (!z) {
                    drawable2 = this.P;
                } else {
                    drawable2 = this.Q;
                }
                imageView5.setBackground(drawable2);
                ImageView imageView6 = this.R;
                if (!z) {
                    colorStateList2 = this.N;
                } else {
                    colorStateList2 = this.O;
                }
                imageView6.setBackgroundTintList(colorStateList2);
            }
        } else {
            this.R.setPadding(0, 0, 0, 0);
        }
        int i6 = this.a;
        if (i6 != 0) {
            str = i6 != 1 ? i6 != 2 ? null : this.D : this.i;
        } else {
            str = this.h;
        }
        this.S.setContentDescription(String.format(Locale.getDefault(), this.E, this.S.getText(), str));
        if (this.c != null) {
            this.R.setVisibility(0);
            Uri uri = !z ? this.c : this.d;
            Context context = view.getContext();
            if (dcy.c(context)) {
                si.c(context).a(uri).b(this.U).a(this.R);
            }
        }
        if (z && (cvj = this.G) != null) {
            String str2 = this.s;
            cvv cvv = ((cvs) cvj).a;
            if (!TextUtils.equals(cvv.i, str2)) {
                cvv.i = str2;
                cvv.f();
            }
        }
    }
}

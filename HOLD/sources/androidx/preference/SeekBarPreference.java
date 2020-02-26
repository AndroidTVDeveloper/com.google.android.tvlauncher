package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SeekBarPreference extends Preference {
    private boolean D;
    private SeekBar.OnSeekBarChangeListener E = new rn(this);
    private View.OnKeyListener F = new ro(this);
    public int a;
    public int b;
    public boolean c;
    public SeekBar d;
    public boolean e;
    public boolean f;
    private int g;
    private int h;
    private TextView i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rm.k, R.attr.seekBarPreferenceStyle, 0);
        this.b = obtainStyledAttributes.getInt(3, 0);
        int i2 = obtainStyledAttributes.getInt(1, 100);
        int i3 = this.b;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.g) {
            this.g = i2;
            b();
        }
        int i4 = obtainStyledAttributes.getInt(4, 0);
        if (i4 != this.h) {
            this.h = Math.min(this.g - this.b, Math.abs(i4));
            b();
        }
        this.e = obtainStyledAttributes.getBoolean(2, true);
        this.D = obtainStyledAttributes.getBoolean(5, false);
        this.f = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final void a(rl rlVar) {
        super.a(rlVar);
        rlVar.a.setOnKeyListener(this.F);
        this.d = (SeekBar) rlVar.c(R.id.seekbar);
        TextView textView = (TextView) rlVar.c(R.id.seekbar_value);
        this.i = textView;
        if (this.D) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.i = null;
        }
        SeekBar seekBar = this.d;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this.E);
            this.d.setMax(this.g - this.b);
            int i2 = this.h;
            if (i2 != 0) {
                this.d.setKeyProgressIncrement(i2);
            } else {
                this.h = this.d.getKeyProgressIncrement();
            }
            this.d.setProgress(this.a - this.b);
            e(this.a);
            this.d.setEnabled(i());
            return;
        }
        Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
    }

    /* access modifiers changed from: protected */
    public final Object a(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(rq.class)) {
            super.a(parcelable);
            return;
        }
        rq rqVar = (rq) parcelable;
        super.a(rqVar.getSuperState());
        this.a = rqVar.a;
        this.b = rqVar.b;
        this.g = rqVar.c;
        b();
    }

    /* access modifiers changed from: protected */
    public final Parcelable d() {
        Parcelable d2 = super.d();
        if (this.v) {
            return d2;
        }
        rq rqVar = new rq(d2);
        rqVar.a = this.a;
        rqVar.b = this.b;
        rqVar.c = this.g;
        return rqVar;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.preference.SeekBarPreference.a(int, boolean):void
     arg types: [int, int]
     candidates:
      androidx.preference.SeekBarPreference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(android.view.View, boolean):void
      androidx.preference.Preference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.SeekBarPreference.a(int, boolean):void */
    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        a(d(((Integer) obj).intValue()), true);
    }

    private final void a(int i2, boolean z) {
        int i3 = this.b;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.g;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 != this.a) {
            this.a = i2;
            e(i2);
            if (k() && i2 != d(i2 ^ -1)) {
                SharedPreferences.Editor c2 = this.k.c();
                c2.putInt(this.s, i2);
                Preference.a(c2);
            }
            if (z) {
                b();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.preference.SeekBarPreference.a(int, boolean):void
     arg types: [int, int]
     candidates:
      androidx.preference.SeekBarPreference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(android.view.View, boolean):void
      androidx.preference.Preference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.SeekBarPreference.a(int, boolean):void */
    public final void a(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress == this.a) {
            return;
        }
        if (!b(Integer.valueOf(progress))) {
            seekBar.setProgress(this.a - this.b);
            e(this.a);
            return;
        }
        a(progress, false);
    }

    public final void e(int i2) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }
}

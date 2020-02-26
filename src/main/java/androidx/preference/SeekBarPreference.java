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

    /* renamed from: D */
    private boolean f1382D;

    /* renamed from: E */
    private SeekBar.OnSeekBarChangeListener f1383E = new C0475rn(this);

    /* renamed from: F */
    private View.OnKeyListener f1384F = new C0476ro(this);

    /* renamed from: a */
    public int f1385a;

    /* renamed from: b */
    public int f1386b;

    /* renamed from: c */
    public boolean f1387c;

    /* renamed from: d */
    public SeekBar f1388d;

    /* renamed from: e */
    public boolean f1389e;

    /* renamed from: f */
    public boolean f1390f;

    /* renamed from: g */
    private int f1391g;

    /* renamed from: h */
    private int f1392h;

    /* renamed from: i */
    private TextView f1393i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474rm.f10272k, R.attr.seekBarPreferenceStyle, 0);
        this.f1386b = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.f1386b;
        i = i < i2 ? i2 : i;
        if (i != this.f1391g) {
            this.f1391g = i;
            mo1071b();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f1392h) {
            this.f1392h = Math.min(this.f1391g - this.f1386b, Math.abs(i3));
            mo1071b();
        }
        this.f1389e = obtainStyledAttributes.getBoolean(2, true);
        this.f1382D = obtainStyledAttributes.getBoolean(5, false);
        this.f1390f = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo1069a(C0473rl rlVar) {
        super.mo1069a(rlVar);
        rlVar.f9783a.setOnKeyListener(this.f1384F);
        this.f1388d = (SeekBar) rlVar.mo5812c(R.id.seekbar);
        TextView textView = (TextView) rlVar.mo5812c(R.id.seekbar_value);
        this.f1393i = textView;
        if (this.f1382D) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f1393i = null;
        }
        SeekBar seekBar = this.f1388d;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this.f1383E);
            this.f1388d.setMax(this.f1391g - this.f1386b);
            int i = this.f1392h;
            if (i != 0) {
                this.f1388d.setKeyProgressIncrement(i);
            } else {
                this.f1392h = this.f1388d.getKeyProgressIncrement();
            }
            this.f1388d.setProgress(this.f1385a - this.f1386b);
            mo1126e(this.f1385a);
            this.f1388d.setEnabled(mo1106i());
            return;
        }
        Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1072a(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1073a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0478rq.class)) {
            super.mo1073a(parcelable);
            return;
        }
        C0478rq rqVar = (C0478rq) parcelable;
        super.mo1073a(rqVar.getSuperState());
        this.f1385a = rqVar.f10277a;
        this.f1386b = rqVar.f10278b;
        this.f1391g = rqVar.f10279c;
        mo1071b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1077d() {
        Parcelable d = super.mo1077d();
        if (this.f1368v) {
            return d;
        }
        C0478rq rqVar = new C0478rq(d);
        rqVar.f10277a = this.f1385a;
        rqVar.f10278b = this.f1386b;
        rqVar.f10279c = this.f1391g;
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
    /* renamed from: a */
    public final void mo1074a(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m1540a(mo1101d(((Integer) obj).intValue()), true);
    }

    /* renamed from: a */
    private final void m1540a(int i, boolean z) {
        int i2 = this.f1386b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f1391g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f1385a) {
            this.f1385a = i;
            mo1126e(i);
            if (mo1108k() && i != mo1101d(i ^ -1)) {
                SharedPreferences.Editor c = this.f1357k.mo5811c();
                c.putInt(this.f1365s, i);
                Preference.m1473a(c);
            }
            if (z) {
                mo1071b();
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
    /* renamed from: a */
    public final void mo1125a(SeekBar seekBar) {
        int progress = this.f1386b + seekBar.getProgress();
        if (progress == this.f1385a) {
            return;
        }
        if (!mo1095b(Integer.valueOf(progress))) {
            seekBar.setProgress(this.f1385a - this.f1386b);
            mo1126e(this.f1385a);
            return;
        }
        m1540a(progress, false);
    }

    /* renamed from: e */
    public final void mo1126e(int i) {
        TextView textView = this.f1393i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }
}

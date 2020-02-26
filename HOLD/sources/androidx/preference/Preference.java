package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public class Preference implements Comparable {
    public ql A;
    public PreferenceGroup B;
    public qp C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private List J;
    private boolean K;
    private qo L;
    private final View.OnClickListener M;
    private CharSequence a;
    private Drawable b;
    private Bundle c;
    private boolean d;
    private boolean e;
    private String f;
    private Object g;
    private boolean h;
    private boolean i;
    public Context j;
    public ri k;
    public long l;
    public boolean m;
    public qm n;
    public qn o;
    public int p;
    public CharSequence q;
    public int r;
    public String s;
    public String t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public Preference(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public Object a(TypedArray typedArray, int i2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    @Deprecated
    public void a(ed edVar) {
    }

    /* access modifiers changed from: protected */
    public void a(Object obj) {
    }

    public long e() {
        return this.l;
    }

    public boolean i() {
        return this.u && this.h && this.i;
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bg.a(context, (int) R.attr.preferenceStyle, 16842894));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bg.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      bg.a(android.content.res.TypedArray, int, int, int):int
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      bg.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      bg.a(android.content.res.TypedArray, int, int, boolean):boolean */
    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this.p = Integer.MAX_VALUE;
        this.u = true;
        this.d = true;
        this.v = true;
        this.h = true;
        this.i = true;
        this.w = true;
        this.D = true;
        this.E = true;
        this.G = true;
        this.I = true;
        this.y = R.layout.preference;
        this.M = new qi(this);
        this.j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rm.g, i2, 0);
        this.r = bg.a(obtainStyledAttributes, 23, 0, 0);
        this.s = bg.a(obtainStyledAttributes, 26, 6);
        this.q = bg.b(obtainStyledAttributes, 34, 4);
        this.a = bg.b(obtainStyledAttributes, 33, 7);
        this.p = bg.d(obtainStyledAttributes, 28, 8);
        this.t = bg.a(obtainStyledAttributes, 22, 13);
        this.y = bg.a(obtainStyledAttributes, 27, 3, (int) R.layout.preference);
        this.z = bg.a(obtainStyledAttributes, 35, 9, 0);
        this.u = bg.a(obtainStyledAttributes, 21, 2, true);
        this.d = bg.a(obtainStyledAttributes, 30, 5, true);
        this.v = bg.a(obtainStyledAttributes, 29, 1, true);
        this.f = bg.a(obtainStyledAttributes, 19, 10);
        this.D = bg.a(obtainStyledAttributes, 16, 16, this.d);
        this.E = bg.a(obtainStyledAttributes, 17, 17, this.d);
        if (obtainStyledAttributes.hasValue(18)) {
            this.g = a(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.g = a(obtainStyledAttributes, 11);
        }
        this.I = bg.a(obtainStyledAttributes, 31, 12, true);
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.F = hasValue;
        if (hasValue) {
            this.G = bg.a(obtainStyledAttributes, 32, 14, true);
        }
        this.H = bg.a(obtainStyledAttributes, 24, 15, false);
        this.w = bg.a(obtainStyledAttributes, 25, 25, true);
        this.x = bg.a(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    public final void a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.B == null) {
            this.B = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    public final boolean b(Object obj) {
        qm qmVar = this.n;
        return qmVar == null || qmVar.a(this, obj);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i2 = this.p;
        int i3 = preference.p;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.q.toString());
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        if (j() && (parcelable = bundle.getParcelable(this.s)) != null) {
            this.K = false;
            a(parcelable);
            if (!this.K) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void a(Bundle bundle) {
        if (j()) {
            this.K = false;
            Parcelable d2 = d();
            if (!this.K) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (d2 != null) {
                bundle.putParcelable(this.s, d2);
            }
        }
    }

    private final Preference a(String str) {
        ri riVar = this.k;
        if (riVar != null) {
            return riVar.a(str);
        }
        return null;
    }

    public final Bundle h() {
        if (this.c == null) {
            this.c = new Bundle();
        }
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final boolean b(boolean z2) {
        return k() ? this.k.b().getBoolean(this.s, z2) : z2;
    }

    /* access modifiers changed from: protected */
    public final int d(int i2) {
        return k() ? this.k.b().getInt(this.s, i2) : i2;
    }

    /* access modifiers changed from: protected */
    public final String d(String str) {
        return k() ? this.k.b().getString(this.s, str) : str;
    }

    public final Set b(Set set) {
        return k() ? this.k.b().getStringSet(this.s, set) : set;
    }

    public CharSequence f() {
        qp qpVar = this.C;
        return qpVar != null ? qpVar.a(this) : this.a;
    }

    public final boolean j() {
        return !TextUtils.isEmpty(this.s);
    }

    /* access modifiers changed from: protected */
    public void b() {
        int indexOf;
        ql qlVar = this.A;
        if (qlVar != null && (indexOf = ((re) qlVar).b.indexOf(this)) != -1) {
            ((jp) qlVar).a(indexOf, this);
        }
    }

    public void a(boolean z2) {
        List list = this.J;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Preference) list.get(i2)).d(z2);
            }
        }
    }

    public final void m() {
        ql qlVar = this.A;
        if (qlVar != null) {
            qlVar.b();
        }
    }

    public void n() {
        p();
    }

    public final void a(ri riVar) {
        this.k = riVar;
        if (!this.m) {
            this.l = riVar.a();
        }
        if (k()) {
            ri riVar2 = this.k;
            if ((riVar2 != null ? riVar2.b() : null).contains(this.s)) {
                a((Object) null);
                return;
            }
        }
        Object obj = this.g;
        if (obj != null) {
            a(obj);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.preference.Preference.a(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      androidx.preference.Preference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(android.view.View, boolean):void */
    public void a(rl rlVar) {
        Integer num;
        int i2;
        View view = rlVar.a;
        view.setOnClickListener(this.M);
        view.setId(0);
        TextView textView = (TextView) rlVar.c(16908304);
        int i3 = 8;
        if (textView != null) {
            CharSequence f2 = f();
            if (!TextUtils.isEmpty(f2)) {
                textView.setText(f2);
                textView.setVisibility(0);
                num = Integer.valueOf(textView.getCurrentTextColor());
            } else {
                textView.setVisibility(8);
                num = null;
            }
        } else {
            num = null;
        }
        TextView textView2 = (TextView) rlVar.c(16908310);
        if (textView2 != null) {
            CharSequence charSequence = this.q;
            if (!TextUtils.isEmpty(charSequence)) {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.F) {
                    textView2.setSingleLine(this.G);
                }
                if (!this.d && i() && num != null) {
                    textView2.setTextColor(num.intValue());
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) rlVar.c(16908294);
        if (imageView != null) {
            int i4 = this.r;
            if (!(i4 == 0 && this.b == null)) {
                if (this.b == null) {
                    this.b = es.b(this.j, i4);
                }
                Drawable drawable = this.b;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.b == null) {
                if (!this.H) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                imageView.setVisibility(i2);
            } else {
                imageView.setVisibility(0);
            }
        }
        View c2 = rlVar.c(R.id.icon_frame);
        if (c2 == null) {
            c2 = rlVar.c(16908350);
        }
        if (c2 != null) {
            if (this.b == null) {
                if (this.H) {
                    i3 = 4;
                }
                c2.setVisibility(i3);
            } else {
                c2.setVisibility(0);
            }
        }
        if (!this.I) {
            a(view, true);
        } else {
            a(view, i());
        }
        boolean z2 = this.d;
        view.setFocusable(z2);
        view.setClickable(z2);
        rlVar.p = this.D;
        rlVar.q = this.E;
        boolean z3 = this.x;
        if (z3 && this.L == null) {
            this.L = new qo(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.L : null);
        view.setLongClickable(z3);
        if (z3 && !z2) {
            dx.a(view, (Drawable) null);
        }
    }

    private final void d(boolean z2) {
        if (this.h == z2) {
            this.h = !z2;
            a(c());
            b();
        }
    }

    public void o() {
        q();
    }

    public final void c(boolean z2) {
        if (this.i == z2) {
            this.i = !z2;
            a(c());
            b();
        }
    }

    /* access modifiers changed from: protected */
    public void a(Parcelable parcelable) {
        this.K = true;
        if (parcelable != qk.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable d() {
        this.K = true;
        return qk.EMPTY_STATE;
    }

    public final void l() {
        ri riVar;
        rh rhVar;
        if (i() && this.d) {
            a();
            qn qnVar = this.o;
            if ((qnVar != null && qnVar.a(this)) || (riVar = this.k) == null || (rhVar = riVar.c) == null || rhVar.b(this)) {
            }
        }
    }

    public void a(View view) {
        l();
    }

    /* access modifiers changed from: protected */
    public final void e(String str) {
        if (k() && !TextUtils.equals(str, d((String) null))) {
            SharedPreferences.Editor c2 = this.k.c();
            c2.putString(this.s, str);
            a(c2);
        }
    }

    public final void p() {
        if (!TextUtils.isEmpty(this.f)) {
            Preference a2 = a(this.f);
            if (a2 != null) {
                if (a2.J == null) {
                    a2.J = new ArrayList();
                }
                a2.J.add(this);
                d(a2.c());
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.f + "\" not found for preference \"" + this.s + "\" (title: \"" + ((Object) this.q) + "\"");
        }
    }

    private final void a(View view, boolean z2) {
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                a(viewGroup.getChildAt(childCount), z2);
            }
        }
    }

    public final void a(Drawable drawable) {
        if (this.b != drawable) {
            this.b = drawable;
            this.r = 0;
            b();
        }
    }

    public final void c(String str) {
        this.s = str;
        if (this.e && !j()) {
            if (!TextUtils.isEmpty(this.s)) {
                this.e = true;
                return;
            }
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
    }

    public final void a(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            m();
        }
    }

    public final void r() {
        this.v = false;
    }

    public final void c(int i2) {
        a((CharSequence) this.j.getString(i2));
    }

    public void a(CharSequence charSequence) {
        if (this.C != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.a, charSequence)) {
            this.a = charSequence;
            b();
        }
    }

    public final void a(qp qpVar) {
        this.C = qpVar;
        b();
    }

    public final void b(int i2) {
        b((CharSequence) this.j.getString(i2));
    }

    public final void b(CharSequence charSequence) {
        if ((charSequence == null && this.q != null) || (charSequence != null && !charSequence.equals(this.q))) {
            this.q = charSequence;
            b();
        }
    }

    public boolean c() {
        return !i();
    }

    /* access modifiers changed from: protected */
    public final boolean k() {
        return this.k != null && this.v && j();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.q;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence f2 = f();
        if (!TextUtils.isEmpty(f2)) {
            sb.append(f2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static final void a(SharedPreferences.Editor editor) {
        editor.apply();
    }

    public final void q() {
        Preference a2;
        List list;
        String str = this.f;
        if (str != null && (a2 = a(str)) != null && (list = a2.J) != null) {
            list.remove(this);
        }
    }
}

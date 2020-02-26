package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: re  reason: default package */
/* compiled from: PG */
public final class re extends jp implements ql {
    public List b;
    private final PreferenceGroup c;
    private List d;
    private final List e;
    private final Handler f;
    private final Runnable g = new rb(this);

    public re(PreferenceGroup preferenceGroup) {
        this.c = preferenceGroup;
        this.f = new Handler();
        this.c.A = this;
        this.d = new ArrayList();
        this.b = new ArrayList();
        this.e = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.c;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            a(((PreferenceScreen) preferenceGroup2).e);
        } else {
            a(true);
        }
        d();
    }

    private static final boolean b(PreferenceGroup preferenceGroup) {
        return preferenceGroup.d != Integer.MAX_VALUE;
    }

    private final List a(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int g2 = preferenceGroup.g();
        int i = 0;
        for (int i2 = 0; i2 < g2; i2++) {
            Preference f2 = preferenceGroup.f(i2);
            if (f2.w) {
                if (!b(preferenceGroup) || i < preferenceGroup.d) {
                    arrayList.add(f2);
                } else {
                    arrayList2.add(f2);
                }
                if (f2 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) f2;
                    if (!preferenceGroup2.t()) {
                        continue;
                    } else if (!b(preferenceGroup) || !b(preferenceGroup2)) {
                        for (Preference preference : a(preferenceGroup2)) {
                            if (b(preferenceGroup) && i >= preferenceGroup.d) {
                                arrayList2.add(preference);
                            } else {
                                arrayList.add(preference);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                } else {
                    i++;
                }
            }
        }
        if (b(preferenceGroup) && i > preferenceGroup.d) {
            py pyVar = new py(preferenceGroup.j, arrayList2, preferenceGroup.e());
            pyVar.o = new rc(this, preferenceGroup);
            arrayList.add(pyVar);
        }
        return arrayList;
    }

    private final void a(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int g2 = preferenceGroup.g();
        for (int i = 0; i < g2; i++) {
            Preference f2 = preferenceGroup.f(i);
            list.add(f2);
            rd rdVar = new rd(f2);
            if (!this.e.contains(rdVar)) {
                this.e.add(rdVar);
            }
            if (f2 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) f2;
                if (preferenceGroup2.t()) {
                    a(list, preferenceGroup2);
                }
            }
            f2.A = this;
        }
    }

    public final Preference f(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (Preference) this.b.get(i);
    }

    public final int a() {
        return this.b.size();
    }

    public final long b(int i) {
        if (this.a) {
            return f(i).e();
        }
        return -1;
    }

    public final int a(int i) {
        rd rdVar = new rd(f(i));
        int indexOf = this.e.indexOf(rdVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.e.size();
        this.e.add(rdVar);
        return size;
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, int i) {
        f(i).a((rl) kmVar);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i) {
        rd rdVar = (rd) this.e.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, rm.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = es.b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(rdVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            dx.a(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = rdVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new rl(inflate);
    }

    public final void b() {
        this.f.removeCallbacks(this.g);
        this.f.post(this.g);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A = null;
        }
        ArrayList arrayList = new ArrayList(this.d.size());
        this.d = arrayList;
        a(arrayList, this.c);
        this.b = a(this.c);
        O();
        List list2 = this.d;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Preference preference = (Preference) list2.get(i2);
        }
    }
}

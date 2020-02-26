package p000;

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

/* renamed from: re */
/* compiled from: PG */
public final class C0466re extends C0261jp implements C0446ql {

    /* renamed from: b */
    public List f10241b;

    /* renamed from: c */
    private final PreferenceGroup f10242c;

    /* renamed from: d */
    private List f10243d;

    /* renamed from: e */
    private final List f10244e;

    /* renamed from: f */
    private final Handler f10245f;

    /* renamed from: g */
    private final Runnable f10246g = new C0463rb(this);

    public C0466re(PreferenceGroup preferenceGroup) {
        this.f10242c = preferenceGroup;
        this.f10245f = new Handler();
        this.f10242c.f1334A = this;
        this.f10243d = new ArrayList();
        this.f10241b = new ArrayList();
        this.f10244e = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f10242c;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            mo5308a(((PreferenceScreen) preferenceGroup2).f1381e);
        } else {
            mo5308a(true);
        }
        mo5805d();
    }

    /* renamed from: b */
    private static final boolean m8257b(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f1376d != Integer.MAX_VALUE;
    }

    /* renamed from: a */
    private final List m8255a(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int g = preferenceGroup.mo1122g();
        int i = 0;
        for (int i2 = 0; i2 < g; i2++) {
            Preference f = preferenceGroup.mo1121f(i2);
            if (f.f1369w) {
                if (!m8257b(preferenceGroup) || i < preferenceGroup.f1376d) {
                    arrayList.add(f);
                } else {
                    arrayList2.add(f);
                }
                if (f instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) f;
                    if (!preferenceGroup2.mo1124t()) {
                        continue;
                    } else if (!m8257b(preferenceGroup) || !m8257b(preferenceGroup2)) {
                        for (Preference preference : m8255a(preferenceGroup2)) {
                            if (m8257b(preferenceGroup) && i >= preferenceGroup.f1376d) {
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
        if (m8257b(preferenceGroup) && i > preferenceGroup.f1376d) {
            C0432py pyVar = new C0432py(preferenceGroup.f1356j, arrayList2, preferenceGroup.mo1103e());
            pyVar.f1361o = new C0464rc(this, preferenceGroup);
            arrayList.add(pyVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m8256a(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f1374b);
        }
        int g = preferenceGroup.mo1122g();
        for (int i = 0; i < g; i++) {
            Preference f = preferenceGroup.mo1121f(i);
            list.add(f);
            C0465rd rdVar = new C0465rd(f);
            if (!this.f10244e.contains(rdVar)) {
                this.f10244e.add(rdVar);
            }
            if (f instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) f;
                if (preferenceGroup2.mo1124t()) {
                    m8256a(list, preferenceGroup2);
                }
            }
            f.f1334A = this;
        }
    }

    /* renamed from: f */
    public final Preference mo5806f(int i) {
        if (i < 0 || i >= mo2794a()) {
            return null;
        }
        return (Preference) this.f10241b.get(i);
    }

    /* renamed from: a */
    public final int mo2794a() {
        return this.f10241b.size();
    }

    /* renamed from: b */
    public final long mo2835b(int i) {
        if (this.f9698a) {
            return mo5806f(i).mo1103e();
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo2850a(int i) {
        C0465rd rdVar = new C0465rd(mo5806f(i));
        int indexOf = this.f10244e.indexOf(rdVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f10244e.size();
        this.f10244e.add(rdVar);
        return size;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2797a(C0285km kmVar, int i) {
        mo5806f(i).mo1069a((C0473rl) kmVar);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0285km mo2795a(ViewGroup viewGroup, int i) {
        C0465rd rdVar = (C0465rd) this.f10244e.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C0474rm.f10262a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C0129es.m7262b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(rdVar.f10238a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C0107dx.m7199a(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = rdVar.f10239b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C0473rl(inflate);
    }

    /* renamed from: b */
    public final void mo5782b() {
        this.f10245f.removeCallbacks(this.f10246g);
        this.f10245f.post(this.f10246g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo5805d() {
        List list = this.f10243d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).f1334A = null;
        }
        ArrayList arrayList = new ArrayList(this.f10243d.size());
        this.f10243d = arrayList;
        m8256a(arrayList, this.f10242c);
        this.f10241b = m8255a(this.f10242c);
        mo5303O();
        List list2 = this.f10243d;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Preference preference = (Preference) list2.get(i2);
        }
    }
}

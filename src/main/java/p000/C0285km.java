package p000;

import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: km */
/* compiled from: PG */
public class C0285km {

    /* renamed from: p */
    private static final List f9782p = Collections.emptyList();

    /* renamed from: a */
    public final View f9783a;

    /* renamed from: b */
    public WeakReference f9784b;

    /* renamed from: c */
    public int f9785c;

    /* renamed from: d */
    public int f9786d;

    /* renamed from: e */
    public long f9787e;

    /* renamed from: f */
    public int f9788f;

    /* renamed from: g */
    public int f9789g;

    /* renamed from: h */
    public C0285km f9790h;

    /* renamed from: i */
    public C0285km f9791i;

    /* renamed from: j */
    public int f9792j;

    /* renamed from: k */
    public C0275kc f9793k;

    /* renamed from: l */
    public boolean f9794l;

    /* renamed from: m */
    public int f9795m;

    /* renamed from: n */
    public int f9796n;

    /* renamed from: o */
    public RecyclerView f9797o;

    /* renamed from: q */
    private List f9798q;

    /* renamed from: r */
    private List f9799r;

    /* renamed from: s */
    private int f9800s;

    /* renamed from: b */
    public final boolean mo5434b() {
        return (this.f9792j & 128) != 0;
    }

    /* renamed from: c */
    public final int mo5435c() {
        int i = this.f9789g;
        return i == -1 ? this.f9785c : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo5437e() {
        return this.f9793k != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo5439g() {
        return (this.f9792j & 32) != 0;
    }

    /* renamed from: j */
    public final boolean mo5442j() {
        return (this.f9792j & 4) != 0;
    }

    /* renamed from: k */
    public final boolean mo5443k() {
        return (this.f9792j & 2) != 0;
    }

    /* renamed from: l */
    public final boolean mo5444l() {
        return (this.f9792j & 1) != 0;
    }

    /* renamed from: m */
    public final boolean mo5445m() {
        return (this.f9792j & 8) != 0;
    }

    /* renamed from: n */
    public final boolean mo5446n() {
        return (this.f9792j & 256) != 0;
    }

    /* renamed from: o */
    public final boolean mo5448o(int i) {
        return (i & this.f9792j) != 0;
    }

    /* renamed from: t */
    public final boolean mo5453t() {
        return (this.f9792j & 2) != 0;
    }

    public C0285km(View view) {
        this.f9785c = -1;
        this.f9786d = -1;
        this.f9787e = -1;
        this.f9788f = -1;
        this.f9789g = -1;
        this.f9790h = null;
        this.f9791i = null;
        this.f9798q = null;
        this.f9799r = null;
        this.f9800s = 0;
        this.f9793k = null;
        this.f9794l = false;
        this.f9795m = 0;
        this.f9796n = -1;
        if (view != null) {
            this.f9783a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    /* renamed from: a */
    public final void mo5430a(Object obj) {
        if (obj == null) {
            mo5433b(1024);
        } else if ((1024 & this.f9792j) == 0) {
            if (this.f9798q == null) {
                ArrayList arrayList = new ArrayList();
                this.f9798q = arrayList;
                this.f9799r = Collections.unmodifiableList(arrayList);
            }
            this.f9798q.add(obj);
        }
    }

    /* renamed from: b */
    public final void mo5433b(int i) {
        this.f9792j = i | this.f9792j;
    }

    /* renamed from: U */
    public final void mo5427U() {
        this.f9786d = -1;
        this.f9789g = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo5449p() {
        List list = this.f9798q;
        if (list != null) {
            list.clear();
        }
        this.f9792j &= -1025;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo5440h() {
        this.f9792j &= -33;
    }

    /* renamed from: i */
    public final void mo5441i() {
        this.f9792j &= -257;
    }

    /* renamed from: d */
    public final int mo5436d() {
        RecyclerView recyclerView = this.f9797o;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.mo846c(this);
    }

    /* renamed from: q */
    public final List mo5450q() {
        List list;
        return ((this.f9792j & 1024) != 0 || (list = this.f9798q) == null || list.size() == 0) ? f9782p : this.f9799r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo5447o() {
        return (this.f9783a.getParent() == null || this.f9783a.getParent() == this.f9797o) ? false : true;
    }

    /* renamed from: s */
    public final boolean mo5452s() {
        return (this.f9792j & 16) == 0 && !C0107dx.m7206c(this.f9783a);
    }

    /* renamed from: a */
    public final void mo5429a(int i, boolean z) {
        if (this.f9786d == -1) {
            this.f9786d = this.f9785c;
        }
        int i2 = this.f9789g;
        if (i2 == -1) {
            i2 = this.f9785c;
            this.f9789g = i2;
        }
        if (z) {
            this.f9789g = i2 + i;
        }
        this.f9785c += i;
        if (this.f9783a.getLayoutParams() != null) {
            ((C0270jy) this.f9783a.getLayoutParams()).f9719c = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo5451r() {
        this.f9792j = 0;
        this.f9785c = -1;
        this.f9786d = -1;
        this.f9787e = -1;
        this.f9789g = -1;
        this.f9800s = 0;
        this.f9790h = null;
        this.f9791i = null;
        mo5449p();
        this.f9795m = 0;
        this.f9796n = -1;
        RecyclerView.m1300b(this);
    }

    /* renamed from: a */
    public final void mo5428a(int i, int i2) {
        this.f9792j = (i & i2) | (this.f9792j & (i2 ^ -1));
    }

    /* renamed from: a */
    public final void mo5432a(boolean z) {
        int i = z ? this.f9800s - 1 : this.f9800s + 1;
        this.f9800s = i;
        if (i < 0) {
            this.f9800s = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i == 1) {
            this.f9792j |= 16;
        } else if (z && i == 0) {
            this.f9792j &= -17;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5431a(C0275kc kcVar, boolean z) {
        this.f9793k = kcVar;
        this.f9794l = z;
    }

    public final String toString() {
        String str;
        String str2;
        if (!getClass().isAnonymousClass()) {
            str = getClass().getSimpleName();
        } else {
            str = "ViewHolder";
        }
        StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.f9785c + " id=" + this.f9787e + ", oldPos=" + this.f9786d + ", pLpos:" + this.f9789g);
        if (mo5437e()) {
            sb.append(" scrap ");
            if (!this.f9794l) {
                str2 = "[attachedScrap]";
            } else {
                str2 = "[changeScrap]";
            }
            sb.append(str2);
        }
        if (mo5442j()) {
            sb.append(" invalid");
        }
        if (!mo5444l()) {
            sb.append(" unbound");
        }
        if (mo5443k()) {
            sb.append(" update");
        }
        if (mo5445m()) {
            sb.append(" removed");
        }
        if (mo5434b()) {
            sb.append(" ignored");
        }
        if (mo5446n()) {
            sb.append(" tmpDetached");
        }
        if (!mo5452s()) {
            sb.append(" not recyclable(" + this.f9800s + ")");
        }
        if ((this.f9792j & 512) != 0 || mo5442j()) {
            sb.append(" undefined adapter position");
        }
        if (this.f9783a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo5438f() {
        this.f9793k.mo5400b(this);
    }

    public C0285km(View view, byte b) {
        this(view);
    }

    public C0285km(View view, char c) {
        this(view);
    }
}

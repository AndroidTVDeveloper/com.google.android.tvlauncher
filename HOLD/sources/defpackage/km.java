package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: km  reason: default package */
/* compiled from: PG */
public class km {
    private static final List p = Collections.emptyList();
    public final View a;
    public WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public km h;
    public km i;
    public int j;
    public kc k;
    public boolean l;
    public int m;
    public int n;
    public RecyclerView o;
    private List q;
    private List r;
    private int s;

    public final boolean b() {
        return (this.j & 128) != 0;
    }

    public final int c() {
        int i2 = this.g;
        return i2 == -1 ? this.c : i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return this.k != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return (this.j & 32) != 0;
    }

    public final boolean j() {
        return (this.j & 4) != 0;
    }

    public final boolean k() {
        return (this.j & 2) != 0;
    }

    public final boolean l() {
        return (this.j & 1) != 0;
    }

    public final boolean m() {
        return (this.j & 8) != 0;
    }

    public final boolean n() {
        return (this.j & 256) != 0;
    }

    public final boolean o(int i2) {
        return (i2 & this.j) != 0;
    }

    public final boolean t() {
        return (this.j & 2) != 0;
    }

    public km(View view) {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = null;
        this.r = null;
        this.s = 0;
        this.k = null;
        this.l = false;
        this.m = 0;
        this.n = -1;
        if (view != null) {
            this.a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
        } else if ((1024 & this.j) == 0) {
            if (this.q == null) {
                ArrayList arrayList = new ArrayList();
                this.q = arrayList;
                this.r = Collections.unmodifiableList(arrayList);
            }
            this.q.add(obj);
        }
    }

    public final void b(int i2) {
        this.j = i2 | this.j;
    }

    public final void U() {
        this.d = -1;
        this.g = -1;
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        List list = this.q;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.j &= -33;
    }

    public final void i() {
        this.j &= -257;
    }

    public final int d() {
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.c(this);
    }

    public final List q() {
        List list;
        return ((this.j & 1024) != 0 || (list = this.q) == null || list.size() == 0) ? p : this.r;
    }

    /* access modifiers changed from: package-private */
    public final boolean o() {
        return (this.a.getParent() == null || this.a.getParent() == this.o) ? false : true;
    }

    public final boolean s() {
        return (this.j & 16) == 0 && !dx.c(this.a);
    }

    public final void a(int i2, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i3 = this.g;
        if (i3 == -1) {
            i3 = this.c;
            this.g = i3;
        }
        if (z) {
            this.g = i3 + i2;
        }
        this.c += i2;
        if (this.a.getLayoutParams() != null) {
            ((jy) this.a.getLayoutParams()).c = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = -1;
        this.s = 0;
        this.h = null;
        this.i = null;
        p();
        this.m = 0;
        this.n = -1;
        RecyclerView.b(this);
    }

    public final void a(int i2, int i3) {
        this.j = (i2 & i3) | (this.j & (i3 ^ -1));
    }

    public final void a(boolean z) {
        int i2 = z ? this.s - 1 : this.s + 1;
        this.s = i2;
        if (i2 < 0) {
            this.s = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.j |= 16;
        } else if (z && i2 == 0) {
            this.j &= -17;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(kc kcVar, boolean z) {
        this.k = kcVar;
        this.l = z;
    }

    public final String toString() {
        String str;
        String str2;
        if (!getClass().isAnonymousClass()) {
            str = getClass().getSimpleName();
        } else {
            str = "ViewHolder";
        }
        StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (e()) {
            sb.append(" scrap ");
            if (!this.l) {
                str2 = "[attachedScrap]";
            } else {
                str2 = "[changeScrap]";
            }
            sb.append(str2);
        }
        if (j()) {
            sb.append(" invalid");
        }
        if (!l()) {
            sb.append(" unbound");
        }
        if (k()) {
            sb.append(" update");
        }
        if (m()) {
            sb.append(" removed");
        }
        if (b()) {
            sb.append(" ignored");
        }
        if (n()) {
            sb.append(" tmpDetached");
        }
        if (!s()) {
            sb.append(" not recyclable(" + this.s + ")");
        }
        if ((this.j & 512) != 0 || j()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.k.b(this);
    }

    public km(View view, byte b2) {
        this(view);
    }

    public km(View view, char c2) {
        this(view);
    }
}

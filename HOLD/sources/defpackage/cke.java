package defpackage;

import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.media.tv.TvContract;
import android.os.Handler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: cke  reason: default package */
/* compiled from: PG */
final class cke {
    public static final UriMatcher a;
    private static final String[] m = {"_id", "channel_id"};
    public final Context b;
    public final ckc c;
    public boolean d;
    public Set e = new HashSet(100);
    public final Set f = new HashSet(100);
    public dbc g;
    public final Map h = new HashMap(10);
    public dbc i;
    public dbc j;
    public dbc k;
    public final ContentObserver l = new cka(this, new Handler());
    private ckb n;
    private dbc o;
    private dbc p;
    private ckd q;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("android.media.tv", "channel", 1);
        a.addURI("android.media.tv", "channel/#", 2);
        a.addURI("android.media.tv", "channel/#/logo", 3);
        a.addURI("android.media.tv", "preview_program", 4);
        a.addURI("android.media.tv", "preview_program/#", 5);
        a.addURI("android.media.tv", "watch_next_program", 6);
        a.addURI("android.media.tv", "watch_next_program/#", 7);
    }

    public cke(Context context, ckc ckc) {
        this.b = context.getApplicationContext();
        this.c = ckc;
    }

    public final ckd a() {
        if (this.q == null) {
            this.q = new ckd(this);
        }
        return this.q;
    }

    public final void b() {
        if (this.o == null) {
            dbc dbc = new dbc();
            this.o = dbc;
            dbc.b = 3000;
            dbc.c = 10000;
            dbc.a = -1000;
            dbc.a(a());
        }
        this.o.c();
    }

    public final void b(long j2) {
        dbc dbc = this.g;
        if (dbc == null || !dbc.e) {
            Map map = this.h;
            Long valueOf = Long.valueOf(j2);
            dbc dbc2 = (dbc) map.get(valueOf);
            if (dbc2 == null) {
                dbc2 = dbc.a();
                dbc2.b = 3000;
                dbc2.c = 10000;
                dbc2.a = j2;
                dbc2.a(a());
                this.h.put(valueOf, dbc2);
            }
            dbc2.c();
        }
    }

    public final void a(long j2) {
        dbc dbc = this.g;
        if ((dbc == null || !dbc.e) && ((ckx) this.c).a.o.containsKey(Long.valueOf(j2))) {
            b(j2);
        }
    }

    public final void c() {
        if (this.p == null) {
            dbc dbc = new dbc();
            this.p = dbc;
            dbc.b = 3000;
            dbc.c = 10000;
            dbc.a = -5000;
            dbc.a(a());
        }
        this.p.c();
    }

    public final void d() {
        dbc dbc = this.j;
        if (dbc != null) {
            dbc.d();
        }
        if (!this.e.isEmpty()) {
            Set<Long> set = this.e;
            StringBuilder sb = new StringBuilder("_id IN (");
            for (Long l2 : set) {
                sb.append(l2.toString());
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
            String sb2 = sb.toString();
            if (this.n == null) {
                this.n = new ckb(this);
            }
            cjz a2 = cjz.a(this.b);
            a2.a(TvContract.PreviewPrograms.CONTENT_URI);
            a2.d = m;
            a2.e = sb2;
            a2.a(this.n);
            a2.g = this.e;
            a2.b();
            this.e = new HashSet(100);
        }
    }

    public final void e() {
        if (this.k == null) {
            dbc dbc = new dbc();
            this.k = dbc;
            dbc.b = 3000;
            dbc.c = 10000;
            dbc.a = -6000;
            dbc.a(a());
        }
        this.k.c();
    }
}

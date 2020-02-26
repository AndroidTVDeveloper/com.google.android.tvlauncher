package p000;

import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.media.tv.TvContract;
import android.os.Handler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: cke */
/* compiled from: PG */
final class cke {

    /* renamed from: a */
    public static final UriMatcher f5795a;

    /* renamed from: m */
    private static final String[] f5796m = {"_id", "channel_id"};

    /* renamed from: b */
    public final Context f5797b;

    /* renamed from: c */
    public final ckc f5798c;

    /* renamed from: d */
    public boolean f5799d;

    /* renamed from: e */
    public Set f5800e = new HashSet(100);

    /* renamed from: f */
    public final Set f5801f = new HashSet(100);

    /* renamed from: g */
    public dbc f5802g;

    /* renamed from: h */
    public final Map f5803h = new HashMap(10);

    /* renamed from: i */
    public dbc f5804i;

    /* renamed from: j */
    public dbc f5805j;

    /* renamed from: k */
    public dbc f5806k;

    /* renamed from: l */
    public final ContentObserver f5807l = new cka(this, new Handler());

    /* renamed from: n */
    private ckb f5808n;

    /* renamed from: o */
    private dbc f5809o;

    /* renamed from: p */
    private dbc f5810p;

    /* renamed from: q */
    private ckd f5811q;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f5795a = uriMatcher;
        uriMatcher.addURI("android.media.tv", "channel", 1);
        f5795a.addURI("android.media.tv", "channel/#", 2);
        f5795a.addURI("android.media.tv", "channel/#/logo", 3);
        f5795a.addURI("android.media.tv", "preview_program", 4);
        f5795a.addURI("android.media.tv", "preview_program/#", 5);
        f5795a.addURI("android.media.tv", "watch_next_program", 6);
        f5795a.addURI("android.media.tv", "watch_next_program/#", 7);
    }

    public cke(Context context, ckc ckc) {
        this.f5797b = context.getApplicationContext();
        this.f5798c = ckc;
    }

    /* renamed from: a */
    public final ckd mo2969a() {
        if (this.f5811q == null) {
            this.f5811q = new ckd(this);
        }
        return this.f5811q;
    }

    /* renamed from: b */
    public final void mo2971b() {
        if (this.f5809o == null) {
            dbc dbc = new dbc();
            this.f5809o = dbc;
            dbc.f8131b = 3000;
            dbc.f8132c = 10000;
            dbc.f8130a = -1000;
            dbc.mo4061a(mo2969a());
        }
        this.f5809o.mo4063c();
    }

    /* renamed from: b */
    public final void mo2972b(long j) {
        dbc dbc = this.f5802g;
        if (dbc == null || !dbc.f8134e) {
            Map map = this.f5803h;
            Long valueOf = Long.valueOf(j);
            dbc dbc2 = (dbc) map.get(valueOf);
            if (dbc2 == null) {
                dbc2 = dbc.m6076a();
                dbc2.f8131b = 3000;
                dbc2.f8132c = 10000;
                dbc2.f8130a = j;
                dbc2.mo4061a(mo2969a());
                this.f5803h.put(valueOf, dbc2);
            }
            dbc2.mo4063c();
        }
    }

    /* renamed from: a */
    public final void mo2970a(long j) {
        dbc dbc = this.f5802g;
        if ((dbc == null || !dbc.f8134e) && ((ckx) this.f5798c).f5845a.f5887o.containsKey(Long.valueOf(j))) {
            mo2972b(j);
        }
    }

    /* renamed from: c */
    public final void mo2973c() {
        if (this.f5810p == null) {
            dbc dbc = new dbc();
            this.f5810p = dbc;
            dbc.f8131b = 3000;
            dbc.f8132c = 10000;
            dbc.f8130a = -5000;
            dbc.mo4061a(mo2969a());
        }
        this.f5810p.mo4063c();
    }

    /* renamed from: d */
    public final void mo2974d() {
        dbc dbc = this.f5805j;
        if (dbc != null) {
            dbc.mo4064d();
        }
        if (!this.f5800e.isEmpty()) {
            Set<Long> set = this.f5800e;
            StringBuilder sb = new StringBuilder("_id IN (");
            for (Long l : set) {
                sb.append(l.toString());
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
            String sb2 = sb.toString();
            if (this.f5808n == null) {
                this.f5808n = new ckb(this);
            }
            cjz a = cjz.m4941a(this.f5797b);
            a.mo2947a(TvContract.PreviewPrograms.CONTENT_URI);
            a.f5779d = f5796m;
            a.f5780e = sb2;
            a.mo2948a(this.f5808n);
            a.f5782g = this.f5800e;
            a.mo2950b();
            this.f5800e = new HashSet(100);
        }
    }

    /* renamed from: e */
    public final void mo2975e() {
        if (this.f5806k == null) {
            dbc dbc = new dbc();
            this.f5806k = dbc;
            dbc.f8131b = 3000;
            dbc.f8132c = 10000;
            dbc.f8130a = -6000;
            dbc.mo4061a(mo2969a());
        }
        this.f5806k.mo4063c();
    }
}

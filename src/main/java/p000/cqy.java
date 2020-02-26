package p000;

import android.app.Fragment;
import android.app.LoaderManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.notifications.NotificationsTrayView;
import com.google.android.tvlauncher.view.HomeTopRowView;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cqy */
/* compiled from: PG */
public final class cqy extends Fragment implements LoaderManager.LoaderCallbacks, ciw, dci {

    /* renamed from: a */
    public cqp f7043a;

    /* renamed from: b */
    public final cfr f7044b = new cfr(this);

    /* renamed from: c */
    public boolean f7045c;

    /* renamed from: d */
    public int f7046d;

    /* renamed from: e */
    public long f7047e;

    /* renamed from: f */
    public boolean f7048f = true;

    /* renamed from: g */
    public final cqx f7049g = new cqx(this);

    /* renamed from: h */
    private cxg f7050h;

    /* renamed from: i */
    private cxk f7051i;

    /* renamed from: j */
    private cxl f7052j;

    /* renamed from: k */
    private final dbc f7053k = dbc.m6076a();

    /* renamed from: l */
    private final Handler f7054l = new Handler();

    /* renamed from: m */
    private final LoaderManager.LoaderCallbacks f7055m = new cqs(this);

    /* renamed from: n */
    private final LoaderManager.LoaderCallbacks f7056n = new cqt(this);

    /* renamed from: o */
    private final LoaderManager.LoaderCallbacks f7057o = new cqu(this);

    /* renamed from: p */
    private final LoaderManager.LoaderCallbacks f7058p = new cqv(this);

    /* renamed from: q */
    private final LoaderManager.LoaderCallbacks f7059q = new cqw(this);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.f7050h = cxg.m5888a(getContext());
        cxk cxk = new cxk(context);
        this.f7051i = cxk;
        this.f7050h.mo3929a(cxk);
        cxl cxl = new cxl(context);
        this.f7052j = cxl;
        this.f7050h.mo3929a(cxl);
        this.f7046d = getResources().getInteger(R.integer.idle_period);
        dbq.m6093a(getContext()).mo2887a(this);
        dck.m6123a(getContext()).mo4090a(this);
        this.f7053k.mo4061a(new cqq(this));
        dbc dbc = this.f7053k;
        dbc.f8131b = 3300;
        dbc.f8132c = 4300;
        this.f7054l.postDelayed(new cqr(this), 20000);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i != 1) {
            return new CursorLoader(getContext(), cya.f7903b, cyy.f7936a, null, null, null);
        }
        return new CursorLoader(getContext(), cya.f7904c, null, null, null, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) R.layout.fragment_home, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f7050h.mo3930b(this.f7051i);
        this.f7050h.mo3930b(this.f7052j);
        dbq.m6093a(getContext()).mo2891b(this);
        dck.m6123a(getContext()).f8229f.remove(this);
        this.f7054l.removeCallbacksAndMessages(null);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        MatrixCursor matrixCursor;
        Cursor cursor = (Cursor) obj;
        int id = loader.getId();
        if (id != 0) {
            if (id == 1) {
                this.f7043a.mo3594b(cursor);
            }
        } else if (!this.f7048f || !dlk.m6969a(cursor)) {
            this.f7048f = false;
            dbc dbc = this.f7053k;
            if (dbc.f8134e) {
                dbc.mo4064d();
            }
            cqp cqp = this.f7043a;
            if (cursor != null) {
                matrixCursor = new MatrixCursor(cyy.f7936a);
                if (!cursor.isClosed() && cursor.moveToFirst()) {
                    do {
                        matrixCursor.addRow(cyy.m5984b(cursor));
                    } while (cursor.moveToNext());
                }
            } else {
                matrixCursor = null;
            }
            cqp.mo3587a(matrixCursor);
        }
    }

    public final void onLoaderReset(Loader loader) {
        int id = loader.getId();
        if (id == 0) {
            this.f7043a.mo3587a((Cursor) null);
        } else if (id == 1) {
            this.f7043a.mo3594b((Cursor) null);
        }
    }

    /* renamed from: c */
    public final void mo3628c() {
        this.f7043a.mo3589a((ddw) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: crz.a(boolean, int):void
     arg types: [int, int]
     candidates:
      crz.a(crz, int):void
      crz.a(boolean, int):void */
    public final void onPause() {
        super.onPause();
        cqp cqp = this.f7043a;
        crz crz = cqp.f7030v;
        if (crz != null) {
            if (crz.f7142k != null) {
                crz.mo3678a(true, 0);
            }
            if (crz.f7143l != null) {
                crz.mo3680b();
            }
        }
        cqp.f6982H.removeCallbacks(cqp.f6983I);
        cqp.f6982H.removeCallbacks(cqp.f6984J);
        cqp.f6977C = SystemClock.elapsedRealtime();
        mo3627b();
        this.f7043a.mo3597c(false);
    }

    public final void onResume() {
        super.onResume();
        cfs cfs = new cfs(1);
        if (this.f7043a.f7029u) {
            cfs.f5419b = new String[]{"shown_channel_count", "notification_indicator_total", "tray_notification_count", "watch_next"};
        } else {
            cfs.f5419b = new String[]{"shown_channel_count", "notification_indicator_total", "tray_notification_count"};
        }
        this.f7044b.mo2714a(cfs);
        cqp cqp = this.f7043a;
        cqp.f6982H.postDelayed(cqp.f6983I, 600000);
        cqp.f6982H.postDelayed(cqp.f6984J, 600000);
        if (cqp.f7011c.mo3073g()) {
            cft cft = new cft(1, "shown_channel_count");
            dja d = cft.mo2731d();
            int h = cqp.f7011c.mo3074h();
            if (d.f8673b) {
                d.mo4505b();
                d.f8673b = false;
            }
            dml dml = (dml) d.f8672a;
            dml dml2 = dml.f8844c;
            dml.f8845a |= 2;
            dml.f8846b = h;
            cqp.f7012d.mo2714a(cft);
        }
        if (cqp.f7029u && cqp.f7011c.mo3075i()) {
            cft cft2 = new cft(1, "watch_next");
            dja j = cft2.mo2737j();
            int j2 = cqp.f7011c.mo3076j();
            if (j.f8673b) {
                j.mo4505b();
                j.f8673b = false;
            }
            dnf dnf = (dnf) j.f8672a;
            dnf dnf2 = dnf.f8927c;
            dnf.f8928a |= 1;
            dnf.f8929b = j2;
            cqp.f7012d.mo2714a(cft2);
        }
        mo3627b();
        this.f7049g.sendEmptyMessageDelayed(1, (long) this.f7046d);
    }

    /* renamed from: a */
    public final void mo2879a() {
        getLoaderManager().restartLoader(2, null, this.f7056n);
        getLoaderManager().restartLoader(3, null, this.f7055m);
    }

    public final void onStart() {
        super.onStart();
        cqp cqp = this.f7043a;
        coi a = coi.m5206a(cqp.f7010b);
        MediaSessionManager mediaSessionManager = (MediaSessionManager) a.f6161a.getSystemService("media_session");
        a.onActiveSessionsChanged(mediaSessionManager.getActiveSessions(null));
        mediaSessionManager.addOnActiveSessionsChangedListener(a, null);
        cqp.f7010b.registerReceiver(cqp.f6985K, cqp.f6979E);
        dbq.m6093a(cqp.f7010b).mo2886a(cqp);
        for (csu csu : cqp.f7033y) {
            cst cst = csu.f7297e;
            if (!cst.f7287j) {
                cst.mo3717d();
            }
            cst.f7287j = true;
        }
        for (cor cor : cqp.f7032x) {
            coo coo = cor.f6825m;
            if (!coo.f6795l && coo.f6786c != -1 && !coo.mo3512d()) {
                coo.mo5305a(0, coo.mo2794a(), "PAYLOAD_LIVE_PROGRESS_UPDATE");
            }
            coo.f6795l = true;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) cqp.f7010b.getSystemService("accessibility");
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(cqp);
        }
        cja a2 = dbq.m6093a(cqp.f7010b);
        if (!a2.f5681c || a2.f5682d) {
            a2.mo2897e();
        }
        if (!cqp.f6975A) {
            cox cox = cqp.f6981G;
            for (Map.Entry value : cox.f6855a.entrySet()) {
                cow cow = cox.f6857c;
                cow.sendMessageDelayed(cow.obtainMessage(99, value.getValue()), 30000);
            }
            cqp.mo3601g();
            if (cqp.f7028t) {
                cqp.mo3599f();
            }
            cqp.f6975A = true;
        }
        this.f7048f = true;
        this.f7053k.mo4063c();
    }

    public final void onStop() {
        NotificationsTrayView notificationsTrayView;
        super.onStop();
        cqp cqp = this.f7043a;
        coi a = coi.m5206a(cqp.f7010b);
        ((MediaSessionManager) a.f6161a.getSystemService("media_session")).removeOnActiveSessionsChangedListener(a);
        if (dlk.m6969a(cqp.f7034z)) {
            cqp.mo3587a((Cursor) null);
            cqz g = cqp.mo3600g(0);
            HomeTopRowView homeTopRowView = g != null ? (HomeTopRowView) g.mo3472a() : null;
            if (!(homeTopRowView == null || (notificationsTrayView = homeTopRowView.f6703f) == null)) {
                notificationsTrayView.setVisibility(8);
            }
        }
        cqp.f7010b.unregisterReceiver(cqp.f6985K);
        cqp.f6981G.f6857c.removeMessages(99);
        cla cla = cqp.f7011c;
        ckg ckg = cqp.f6986L;
        cjz cjz = cla.f5880h;
        if (cjz != null) {
            cjz.mo2951c();
            cla.f5880h = null;
        }
        cla.f5874b.remove(ckg);
        cla.mo3066c();
        cqp.f7011c.mo3063b(cqp.f6992R);
        cla cla2 = cqp.f7011c;
        Iterator it = cla2.f5887o.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Long l = (Long) entry.getKey();
            if (!cla2.f5875c.containsKey(l) && !cla2.mo3057a(l)) {
                it.remove();
                cla2.mo3053a((cjp) entry.getValue(), l);
            }
        }
        dbq.m6093a(cqp.f7010b).mo2890b(cqp);
        for (csu csu : cqp.f7033y) {
            csu.f7297e.mo3718e();
        }
        for (cor cor : cqp.f7032x) {
            coo coo = cor.f6825m;
            if (coo.f6795l) {
                long j = coo.f6786c;
                if (j != -1) {
                    coo.f6785b.mo3051a(j, coo.f6800q);
                    for (crz crz : coo.f6794k) {
                        crz.mo3683d();
                        csi csi = crz.f7085B;
                        if (csi != null) {
                            csi.mo3702b();
                        }
                    }
                }
            }
            coo.f6795l = false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) cqp.f7010b.getSystemService("accessibility");
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(cqp);
        }
        cqp.f6975A = false;
        this.f7053k.mo4064d();
        this.f7048f = true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C0512sx sxVar;
        super.onViewCreated(view, bundle);
        VerticalGridView verticalGridView = (VerticalGridView) view.findViewById(R.id.home_row_list);
        cla a = cla.m5025a(getActivity());
        cqp cqp = new cqp(getActivity(), this.f7044b, a, new cox(a));
        this.f7043a = cqp;
        afq b = C0497si.m8295b(getActivity());
        if (getActivity() != null) {
            if (!aie.m566c()) {
                int i = Build.VERSION.SDK_INT;
                sxVar = b.mo173a(getActivity(), getChildFragmentManager(), this, isVisible());
            } else {
                sxVar = b.mo172a(getActivity().getApplicationContext());
            }
            cqp.f7016h = sxVar;
            cqp.f7016h.mo5946a(new agj((byte) 0).mo199a(C0594vy.f10649a));
            cqp cqp2 = this.f7043a;
            cqp2.f7013e = verticalGridView;
            C0269jx jxVar = verticalGridView.f1068h;
            if (jxVar != null) {
                jxVar.mo5384q();
            }
            C0373nt ntVar = verticalGridView.f9985L;
            ntVar.f10024E.f10062d.f10063a = R.id.items_list;
            ntVar.mo5678u();
            verticalGridView.mo5613g(1);
            verticalGridView.mo5609a(0.0f);
            verticalGridView.mo5615h(cqp2.f7017i);
            verticalGridView.mo824a(5);
            verticalGridView.mo5617i(cqp2.f7026r);
            cga a2 = cga.m4692a();
            if (a2.f5452c) {
                verticalGridView.getViewTreeObserver().addOnGlobalLayoutListener(new cfw(a2, verticalGridView));
            }
            cqp2.f7031w = new cse(verticalGridView, new cuw());
            cqp2.f7031w.f7173g = new cqa(cqp2);
            cqp2.f7031w.mo3697b(true);
            cqp2.f7031w.mo3698c(false);
            cqp2.f7031w.f7167a = 600;
            String str = dck.m6123a(getContext()).f8228e.f8246K;
            if (dhz.m6481a(view.getContext()) && str != null) {
                cti cti = new cti(str, verticalGridView.getContext());
                verticalGridView.setBackground(cti.f7357e);
                agj a3 = new agj((byte) 0).mo192a(cti.f7353a, cti.f7354b).mo193a(acu.f99a).mo198a((C0544ub) new C0535tt(new aci(), new ctf(cti.f7355c), new ctj(cti.f7355c))).mo211g().mo199a(C0594vy.f10651c);
                C0509su d = C0497si.m8296c(cti.f7355c).mo5949d();
                d.mo5939a(cti.f7356d);
                d.mo202b(a3).mo5937a((ahg) new cth(cti));
            } else {
                this.f7043a.f7014f = new cpt(verticalGridView);
            }
            verticalGridView.mo831a(this.f7043a);
            cfg.m4645a().f5401b = this.f7043a;
            cfg a4 = cfg.m4645a();
            cqp cqp3 = this.f7043a;
            a4.f5400a = cqp3;
            cqp3.f7015g = cfg.m4645a();
            getLoaderManager().initLoader(0, null, this);
            getLoaderManager().initLoader(1, null, this);
            getLoaderManager().initLoader(4, null, this.f7057o);
            getLoaderManager().initLoader(5, null, this.f7058p);
            getLoaderManager().initLoader(6, null, this.f7059q);
            mo2879a();
            cqp cqp4 = this.f7043a;
            boolean z = dck.m6123a(getContext()).f8228e.f8276k;
            if (cqp4.f6980F != z) {
                cqp4.f6980F = z;
                cqp4.mo5306a(0, "PAYLOAD_INPUT_ICON_VISIBILITY");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    /* renamed from: b */
    public final void mo3627b() {
        this.f7049g.removeMessages(1);
        this.f7049g.removeMessages(2);
    }
}

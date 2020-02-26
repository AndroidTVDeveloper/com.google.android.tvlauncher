package defpackage;

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

/* renamed from: cqy  reason: default package */
/* compiled from: PG */
public final class cqy extends Fragment implements LoaderManager.LoaderCallbacks, ciw, dci {
    public cqp a;
    public final cfr b = new cfr(this);
    public boolean c;
    public int d;
    public long e;
    public boolean f = true;
    public final cqx g = new cqx(this);
    private cxg h;
    private cxk i;
    private cxl j;
    private final dbc k = dbc.a();
    private final Handler l = new Handler();
    private final LoaderManager.LoaderCallbacks m = new cqs(this);
    private final LoaderManager.LoaderCallbacks n = new cqt(this);
    private final LoaderManager.LoaderCallbacks o = new cqu(this);
    private final LoaderManager.LoaderCallbacks p = new cqv(this);
    private final LoaderManager.LoaderCallbacks q = new cqw(this);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.h = cxg.a(getContext());
        cxk cxk = new cxk(context);
        this.i = cxk;
        this.h.a(cxk);
        cxl cxl = new cxl(context);
        this.j = cxl;
        this.h.a(cxl);
        this.d = getResources().getInteger(R.integer.idle_period);
        dbq.a(getContext()).a(this);
        dck.a(getContext()).a(this);
        this.k.a(new cqq(this));
        dbc dbc = this.k;
        dbc.b = 3300;
        dbc.c = 4300;
        this.l.postDelayed(new cqr(this), 20000);
    }

    public final Loader onCreateLoader(int i2, Bundle bundle) {
        if (i2 != 1) {
            return new CursorLoader(getContext(), cya.b, cyy.a, null, null, null);
        }
        return new CursorLoader(getContext(), cya.c, null, null, null, null);
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
        this.h.b(this.i);
        this.h.b(this.j);
        dbq.a(getContext()).b(this);
        dck.a(getContext()).f.remove(this);
        this.l.removeCallbacksAndMessages(null);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        MatrixCursor matrixCursor;
        Cursor cursor = (Cursor) obj;
        int id = loader.getId();
        if (id != 0) {
            if (id == 1) {
                this.a.b(cursor);
            }
        } else if (!this.f || !dlk.a(cursor)) {
            this.f = false;
            dbc dbc = this.k;
            if (dbc.e) {
                dbc.d();
            }
            cqp cqp = this.a;
            if (cursor != null) {
                matrixCursor = new MatrixCursor(cyy.a);
                if (!cursor.isClosed() && cursor.moveToFirst()) {
                    do {
                        matrixCursor.addRow(cyy.b(cursor));
                    } while (cursor.moveToNext());
                }
            } else {
                matrixCursor = null;
            }
            cqp.a(matrixCursor);
        }
    }

    public final void onLoaderReset(Loader loader) {
        int id = loader.getId();
        if (id == 0) {
            this.a.a((Cursor) null);
        } else if (id == 1) {
            this.a.b((Cursor) null);
        }
    }

    public final void c() {
        this.a.a((ddw) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: crz.a(boolean, int):void
     arg types: [int, int]
     candidates:
      crz.a(crz, int):void
      crz.a(boolean, int):void */
    public final void onPause() {
        super.onPause();
        cqp cqp = this.a;
        crz crz = cqp.v;
        if (crz != null) {
            if (crz.k != null) {
                crz.a(true, 0);
            }
            if (crz.l != null) {
                crz.b();
            }
        }
        cqp.H.removeCallbacks(cqp.I);
        cqp.H.removeCallbacks(cqp.J);
        cqp.C = SystemClock.elapsedRealtime();
        b();
        this.a.c(false);
    }

    public final void onResume() {
        super.onResume();
        cfs cfs = new cfs(1);
        if (this.a.u) {
            cfs.b = new String[]{"shown_channel_count", "notification_indicator_total", "tray_notification_count", "watch_next"};
        } else {
            cfs.b = new String[]{"shown_channel_count", "notification_indicator_total", "tray_notification_count"};
        }
        this.b.a(cfs);
        cqp cqp = this.a;
        cqp.H.postDelayed(cqp.I, 600000);
        cqp.H.postDelayed(cqp.J, 600000);
        if (cqp.c.g()) {
            cft cft = new cft(1, "shown_channel_count");
            dja d2 = cft.d();
            int h2 = cqp.c.h();
            if (d2.b) {
                d2.b();
                d2.b = false;
            }
            dml dml = (dml) d2.a;
            dml dml2 = dml.c;
            dml.a |= 2;
            dml.b = h2;
            cqp.d.a(cft);
        }
        if (cqp.u && cqp.c.i()) {
            cft cft2 = new cft(1, "watch_next");
            dja j2 = cft2.j();
            int j3 = cqp.c.j();
            if (j2.b) {
                j2.b();
                j2.b = false;
            }
            dnf dnf = (dnf) j2.a;
            dnf dnf2 = dnf.c;
            dnf.a |= 1;
            dnf.b = j3;
            cqp.d.a(cft2);
        }
        b();
        this.g.sendEmptyMessageDelayed(1, (long) this.d);
    }

    public final void a() {
        getLoaderManager().restartLoader(2, null, this.n);
        getLoaderManager().restartLoader(3, null, this.m);
    }

    public final void onStart() {
        super.onStart();
        cqp cqp = this.a;
        coi a2 = coi.a(cqp.b);
        MediaSessionManager mediaSessionManager = (MediaSessionManager) a2.a.getSystemService("media_session");
        a2.onActiveSessionsChanged(mediaSessionManager.getActiveSessions(null));
        mediaSessionManager.addOnActiveSessionsChangedListener(a2, null);
        cqp.b.registerReceiver(cqp.K, cqp.E);
        dbq.a(cqp.b).a(cqp);
        for (csu csu : cqp.y) {
            cst cst = csu.e;
            if (!cst.j) {
                cst.d();
            }
            cst.j = true;
        }
        for (cor cor : cqp.x) {
            coo coo = cor.m;
            if (!coo.l && coo.c != -1 && !coo.d()) {
                coo.a(0, coo.a(), "PAYLOAD_LIVE_PROGRESS_UPDATE");
            }
            coo.l = true;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) cqp.b.getSystemService("accessibility");
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(cqp);
        }
        cja a3 = dbq.a(cqp.b);
        if (!a3.c || a3.d) {
            a3.e();
        }
        if (!cqp.A) {
            cox cox = cqp.G;
            for (Map.Entry value : cox.a.entrySet()) {
                cow cow = cox.c;
                cow.sendMessageDelayed(cow.obtainMessage(99, value.getValue()), 30000);
            }
            cqp.g();
            if (cqp.t) {
                cqp.f();
            }
            cqp.A = true;
        }
        this.f = true;
        this.k.c();
    }

    public final void onStop() {
        NotificationsTrayView notificationsTrayView;
        super.onStop();
        cqp cqp = this.a;
        coi a2 = coi.a(cqp.b);
        ((MediaSessionManager) a2.a.getSystemService("media_session")).removeOnActiveSessionsChangedListener(a2);
        if (dlk.a(cqp.z)) {
            cqp.a((Cursor) null);
            cqz g2 = cqp.g(0);
            HomeTopRowView homeTopRowView = g2 != null ? (HomeTopRowView) g2.a() : null;
            if (!(homeTopRowView == null || (notificationsTrayView = homeTopRowView.f) == null)) {
                notificationsTrayView.setVisibility(8);
            }
        }
        cqp.b.unregisterReceiver(cqp.K);
        cqp.G.c.removeMessages(99);
        cla cla = cqp.c;
        ckg ckg = cqp.L;
        cjz cjz = cla.h;
        if (cjz != null) {
            cjz.c();
            cla.h = null;
        }
        cla.b.remove(ckg);
        cla.c();
        cqp.c.b(cqp.R);
        cla cla2 = cqp.c;
        Iterator it = cla2.o.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Long l2 = (Long) entry.getKey();
            if (!cla2.c.containsKey(l2) && !cla2.a(l2)) {
                it.remove();
                cla2.a((cjp) entry.getValue(), l2);
            }
        }
        dbq.a(cqp.b).b(cqp);
        for (csu csu : cqp.y) {
            csu.e.e();
        }
        for (cor cor : cqp.x) {
            coo coo = cor.m;
            if (coo.l) {
                long j2 = coo.c;
                if (j2 != -1) {
                    coo.b.a(j2, coo.q);
                    for (crz crz : coo.k) {
                        crz.d();
                        csi csi = crz.B;
                        if (csi != null) {
                            csi.b();
                        }
                    }
                }
            }
            coo.l = false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) cqp.b.getSystemService("accessibility");
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(cqp);
        }
        cqp.A = false;
        this.k.d();
        this.f = true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        sx sxVar;
        super.onViewCreated(view, bundle);
        VerticalGridView verticalGridView = (VerticalGridView) view.findViewById(R.id.home_row_list);
        cla a2 = cla.a(getActivity());
        cqp cqp = new cqp(getActivity(), this.b, a2, new cox(a2));
        this.a = cqp;
        afq b2 = si.b(getActivity());
        if (getActivity() != null) {
            if (!aie.c()) {
                int i2 = Build.VERSION.SDK_INT;
                sxVar = b2.a(getActivity(), getChildFragmentManager(), this, isVisible());
            } else {
                sxVar = b2.a(getActivity().getApplicationContext());
            }
            cqp.h = sxVar;
            cqp.h.a(new agj((byte) 0).a(vy.a));
            cqp cqp2 = this.a;
            cqp2.e = verticalGridView;
            jx jxVar = verticalGridView.h;
            if (jxVar != null) {
                jxVar.q();
            }
            nt ntVar = verticalGridView.L;
            ntVar.E.d.a = R.id.items_list;
            ntVar.u();
            verticalGridView.g(1);
            verticalGridView.a(0.0f);
            verticalGridView.h(cqp2.i);
            verticalGridView.a(5);
            verticalGridView.i(cqp2.r);
            cga a3 = cga.a();
            if (a3.c) {
                verticalGridView.getViewTreeObserver().addOnGlobalLayoutListener(new cfw(a3, verticalGridView));
            }
            cqp2.w = new cse(verticalGridView, new cuw());
            cqp2.w.g = new cqa(cqp2);
            cqp2.w.b(true);
            cqp2.w.c(false);
            cqp2.w.a = 600;
            String str = dck.a(getContext()).e.K;
            if (dhz.a(view.getContext()) && str != null) {
                cti cti = new cti(str, verticalGridView.getContext());
                verticalGridView.setBackground(cti.e);
                agj a4 = new agj((byte) 0).a(cti.a, cti.b).a(acu.a).a((ub) new tt(new aci(), new ctf(cti.c), new ctj(cti.c))).g().a(vy.c);
                su d2 = si.c(cti.c).d();
                d2.a(cti.d);
                d2.b(a4).a((ahg) new cth(cti));
            } else {
                this.a.f = new cpt(verticalGridView);
            }
            verticalGridView.a(this.a);
            cfg.a().b = this.a;
            cfg a5 = cfg.a();
            cqp cqp3 = this.a;
            a5.a = cqp3;
            cqp3.g = cfg.a();
            getLoaderManager().initLoader(0, null, this);
            getLoaderManager().initLoader(1, null, this);
            getLoaderManager().initLoader(4, null, this.o);
            getLoaderManager().initLoader(5, null, this.p);
            getLoaderManager().initLoader(6, null, this.q);
            a();
            cqp cqp4 = this.a;
            boolean z = dck.a(getContext()).e.k;
            if (cqp4.F != z) {
                cqp4.F = z;
                cqp4.a(0, "PAYLOAD_INPUT_ICON_VISIBILITY");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    public final void b() {
        this.g.removeMessages(1);
        this.g.removeMessages(2);
    }
}
